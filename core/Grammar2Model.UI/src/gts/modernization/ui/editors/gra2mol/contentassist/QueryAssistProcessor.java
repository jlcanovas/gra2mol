package gts.modernization.ui.editors.gra2mol.contentassist;

import gts.modernization.modelbuilder.ModelBuilder;
import gts.modernization.ui.editors.gra2mol.Gra2MoLEditor;
import gts.modernization.ui.editors.gra2mol.util.ModelGrammarExtractor;

import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.eclipse.gmt.modisco.core.modeling.Model;
import org.eclipse.gmt.modisco.core.modeling.ModelElement;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.ITextViewer;
import org.eclipse.jface.text.contentassist.CompletionProposal;
import org.eclipse.jface.text.contentassist.ICompletionProposal;
import org.eclipse.jface.text.contentassist.IContentAssistProcessor;
import org.eclipse.jface.text.contentassist.IContextInformation;
import org.eclipse.jface.text.contentassist.IContextInformationValidator;
import org.eclipse.swt.graphics.Image;

public class QueryAssistProcessor implements IContentAssistProcessor {

	public static String SINGLE_SLASH = "__single_slash";
	public static String DOUBLE_SLASH = "__double_slash";
	public static String TRIPLE_SLASH = "__triple_slash";

	public static String metamodelPath = Gra2MoLEditor.getAbsoluteInstallPath() + "resources/Grammar.ecore";
	public static String modelPath = Gra2MoLEditor.getAbsoluteInstallPath() + "resources/javaGrammar.ecore";

	public static String nodeIconPath = "icons/node.gif";

	private Model model;
	private List<ModelElement> rules;
	private Image nodeIcon = null;

	public QueryAssistProcessor() {
		super();
		try {
			nodeIcon = ImageDescriptor.createFromURL(new URL(Gra2MoLEditor.getInstallURL(), nodeIconPath)).createImage();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void setGrammar(String grammarPath) {
		ModelGrammarExtractor mge = new ModelGrammarExtractor();
		if(grammarPath != null) {
			this.model = mge.discover(grammarPath);
			this.rules = retrieveSintacticRules(this.model);
		}
	}

	public static void main(String[] args) {
		System.out.println("Mis pruebas");
		//		QueryAssistProcessor qa = new QueryAssistProcessor();
		//		qa.retrieveRuleDerivations("classOrInterfaceDeclaration", qa.rules);
	}

	@Override
	public ICompletionProposal[] computeCompletionProposals(ITextViewer viewer, int offset) {

//				System.out.println("Computing query completion...");
		IDocument document = viewer.getDocument();
		CompletionProposal result[] = {};
		if(this.model != null && this.rules != null) {
			try  {
				String query = extractQuery(viewer, offset);
//								System.out.println("Detected query: " + query);

				String parentNode = extractParentNode(query);
//								System.out.println("Parent: " + parentNode);

				String restNode = extractRestNode(query);
//								System.out.println("Rest: " + restNode);

				String type = extractOperatorType(query);
				List<String> tips = new ArrayList<String>();
//								System.out.println("Type: " + type);

				// Builds the possible tips (it depends on the operator)
				// (If we have detected the type of the parent)
				if(type != null && type.equals(QueryAssistProcessor.SINGLE_SLASH)) {				
					tips = retrieveRuleDerivations(parentNode, this.rules);
				} else if (type != null && (type.equals(QueryAssistProcessor.DOUBLE_SLASH) || type.equals(QueryAssistProcessor.TRIPLE_SLASH))) {
					tips = retrieveRecursiveRuleDerivations(parentNode, this.rules);
				} else if (parentNode == null && restNode != null) {
					tips = retrieveRulesStartsWith(restNode, rules);
				} else if (parentNode == null && restNode == null) {
					tips = retrieveRulesNames(this.rules);
				}

				// Sort the tip list		
				Object[] arrayTips = tips.toArray();
				Arrays.sort(arrayTips);
				tips = new ArrayList<String>();
				for(int i = 0; i < arrayTips.length; i++) {
					tips.add((String) arrayTips[i]);
				}

				// Builds the result
				if(tips.size() == 0 || restNode == null) { 
					// There is no rest
					result = new CompletionProposal[tips.size()];
					for(int i = 0; i < tips.size(); i++) {
						result[i] = new CompletionProposal(tips.get(i), offset, 0, ((String) tips.get(i)).length(), nodeIcon, tips.get(i), null, null);
					}
				} else {
					ArrayList<CompletionProposal> partialResult = new ArrayList<CompletionProposal>();
					for(int i = 0; i < tips.size(); i++) {
						String tip = tips.get(i);
						if(tip.startsWith(restNode)) {
							String restTip = tip.substring(restNode.length(), tip.length());
							partialResult.add(new CompletionProposal(restTip, offset, 0, restTip.length(), nodeIcon, tip, null, null));
						}
					}				
					result = new CompletionProposal[partialResult.size()];					
					for(int j = 0; j < partialResult.size(); j++) {
						result[j] = partialResult.get(j);
					}	
				}
			} catch(Exception e) {
				e.printStackTrace();
			}
		}

		//		System.out.println("Devueltos: " + result.length);
		return result;
	}

	/**
	 * Extracts the sintactic rules from the grammar definition
	 * @param m
	 * @return
	 */
	private List<ModelElement> retrieveSintacticRules(Model m) {
		List<ModelElement> result = new ArrayList<ModelElement>();

		// Extracts the first element
		Collection<ModelElement> content = (Collection<ModelElement>) m.getContents();
		ModelElement me = (ModelElement) content.toArray()[0];

		// Extracts grammarDefs
		List<ModelElement> grammarDefsList = (List<ModelElement>) me.get("grammarDefs");
		if(grammarDefsList != null && grammarDefsList.size() > 0) {
			ModelElement grammarDef = (ModelElement) grammarDefsList.toArray()[0];

			// Extracts the rules of the grammar definition
			List<ModelElement> rulesList = (List<ModelElement>) grammarDef.get("rules");		

			Iterator<ModelElement> rulesIt = rulesList.iterator();
			while(rulesIt.hasNext()) {
				ModelElement rule = rulesIt.next();
				String name = (String) rule.getReferenceModelElement().get("name");
				if(name.equals("SintacticRule")) {
					result.add(rule);
				}			
			}
		}

		return result;				
	}

	/**
	 * Locates the parent rule in the rules and extracts its children (and recursive).
	 * @param parent
	 * @return
	 */
	private List<String> retrieveRecursiveRuleDerivations(String parent, List<ModelElement> rules) {
		return retrieveRecursiveRuleDerivationsAux(parent, new ArrayList<String>(), rules);
	}

	/**
	 * This method is used by retrieveRecursiveRuleDerivations
	 * @param parent
	 * @param visitedRules
	 * @param rules
	 * @return
	 */
	private List<String> retrieveRecursiveRuleDerivationsAux(String parent, List<String> visitedRules, List<ModelElement> rules) {
		List<String> result = new ArrayList<String>();

		List<String> partialRules = retrieveRuleDerivations(parent, rules);
		Iterator<String> itPartialResult = partialRules.iterator();
		while(itPartialResult.hasNext()) {
			String partialRule = itPartialResult.next();
			if(!visitedRules.contains(partialRule)) {
				result.add(partialRule);
				visitedRules.add(partialRule);
				result.addAll(retrieveRecursiveRuleDerivationsAux(partialRule, visitedRules, rules));
			}
		}		
		return result;
	}

	/**
	 * Locates the parent rule in the rules and extracts its children (only sintactic derivations)
	 * @param parent
	 * @return
	 */
	private List<String> retrieveRuleDerivations(String parent, List<ModelElement> rules) {
		List<String> result = new ArrayList<String>();

		ModelElement ruleModelElement = retrieveRule(parent, rules);

		if(ruleModelElement != null) {
			List<ModelElement> derivationsList = (List<ModelElement>) ruleModelElement.get("derivations");	

			Iterator<ModelElement> itDerivations = derivationsList.iterator();
			while(itDerivations.hasNext()) {
				ModelElement derivationModelElement = itDerivations.next();
				String name = (String) derivationModelElement.getReferenceModelElement().get("name");
				if(name.equals("SintacticRule")) {
					result.add((String) derivationModelElement.get("name"));
				}	
			}
		}
		return result;
	}

	/**
	 * Locates the rules that starts with the argument (only sintactic rules)
	 * @param startsWith
	 * @param rules
	 * @return
	 */
	private List<String> retrieveRulesStartsWith(String startsWith, List<ModelElement> rules) {
		List<String> result = new ArrayList<String>();

		Iterator<ModelElement> itRules = rules.iterator();
		while(itRules.hasNext()) {
			ModelElement ruleModelElement = itRules.next();

			String type = (String) ruleModelElement.getReferenceModelElement().get("name");
			if(type.equals("SintacticRule")) {
				if (((String) ruleModelElement.get("name")).startsWith(startsWith)) {
					result.add((String) ruleModelElement.get("name"));
				}
			}
		}

		return result;
	}

	private List<String> retrieveRulesNames(List<ModelElement> rules) {
		List<String> result = new ArrayList<String>();

		Iterator<ModelElement> itRules = rules.iterator();
		while(itRules.hasNext()) {
			ModelElement ruleModelElement = itRules.next();

			String type = (String) ruleModelElement.getReferenceModelElement().get("name");
			if(type.equals("SintacticRule")) {
				result.add((String) ruleModelElement.get("name"));
			}
		}

		return result;
	}

	/**
	 * Locates the rule in the rules
	 * @param ruleName
	 * @param rules
	 * @return
	 */
	private ModelElement retrieveRule(String ruleName, List<ModelElement> rules) {
		ModelElement result = null;

		// Extracts the rules of the grammar definition
		List<ModelElement> rulesList = rules;				
		Iterator<ModelElement> itRules = rulesList.iterator();

		while(itRules.hasNext()) {
			ModelElement ruleModelElement = itRules.next();					
			//			System.out.println("  Rule:" + ruleModelElement.get("name"));

			// If the rule is the parent argument, extract its derivations
			if(ruleModelElement.get("name").equals(ruleName)) {
				result = ruleModelElement;
				break;
			}
		}
		return result;
	}

	/**
	 * Creates a ModelBuilder (from grammar2Model) and load the model of the grammar
	 * @return
	 */
	private Model retrieveModel() {
		String metamodel = QueryAssistProcessor.metamodelPath;
		ModelBuilder mb = new ModelBuilder(metamodel, "Grammar");
		String modelPath = QueryAssistProcessor.modelPath;
		return mb.load(modelPath);	
	}

	/**
	 * Extract the type of the last operator (/, // or ///)
	 * @param query
	 * @return
	 */
	private String extractOperatorType(String query) {
		int singleSlash = query.lastIndexOf("/");
		int doubleSlash = query.lastIndexOf("//");
		int tripleSlash = query.lastIndexOf("///");

		String subString = "";
		if(singleSlash > 0 && singleSlash > doubleSlash+1 && singleSlash > tripleSlash+2) {
			return QueryAssistProcessor.SINGLE_SLASH;
		} else if(doubleSlash > 0 && doubleSlash+1 >= singleSlash && doubleSlash+1 > tripleSlash+2) {
			return QueryAssistProcessor.DOUBLE_SLASH;		
		} else if(tripleSlash > 0 && tripleSlash+2 >= singleSlash && tripleSlash+2 >= doubleSlash+1) {
			return QueryAssistProcessor.TRIPLE_SLASH;
		} else return null;

		//		if(singleSlash > 0 && doubleSlash < 0 && tripleSlash < 0) {
		//			return QueryAssistProcessor.SINGLE_SLASH;
		//		} else if(singleSlash > 0 && doubleSlash > 0 && tripleSlash < 0) {
		//			return QueryAssistProcessor.DOUBLE_SLASH;		
		//		} else if(singleSlash > 0 && doubleSlash > 0 && tripleSlash > 0) {
		//			return QueryAssistProcessor.TRIPLE_SLASH;
		//		} else return null;
	}

	/**
	 * Extracts the rest of string that is located later the last slash
	 * @param query
	 * @return
	 */
	private String extractRestNode(String query) {
		String result = null;

		// Delete the last slash
		int lastSlash = query.lastIndexOf("/");
		if(lastSlash != (query.length() - 1)) {
			result = query.substring(lastSlash+1, query.length());
		}

		// Delete the sharp character (if it exists)
		if(result != null) {
			int sharp = result.indexOf("#");
			if(sharp == 0) {
				result = result.substring(1, result.length());
			}
		}

		return result;
	}

	/**
	 * Extract the last complete node declaration of the query. This node will act as parent of the
	 * content assisted completion. For instance, in the string "/node1/node2/t" the parent node is node2
	 * and t is the tip for the content assisted completion.
	 * @param query
	 * @return
	 */
	private String extractParentNode(String query) {
		String result = null;

		int singleSlash = query.lastIndexOf("/");
		int doubleSlash = query.lastIndexOf("//");
		int tripleSlash = query.lastIndexOf("///");

		String subString = "";		

		if(singleSlash > 0 && singleSlash > doubleSlash+1 && singleSlash > tripleSlash+2) {
			subString = query.substring(0, singleSlash);
		} else if(doubleSlash > 0 && doubleSlash+1 >= singleSlash && doubleSlash+1 > tripleSlash+2) {
			subString = query.substring(0, doubleSlash);					
		} else if(tripleSlash > 0 && tripleSlash+2 >= singleSlash && tripleSlash+2 >= doubleSlash+1) {
			subString = query.substring(0, tripleSlash);
		}

		// Extracts the parent
		int lastSlash = subString.lastIndexOf('/');
		if(lastSlash > -1) {
			result = subString.substring(lastSlash+1, subString.length());
		}

		// Delete the sharp character (if it exists)
		if(result != null) {
			int sharp = result.indexOf("#");
			if(sharp == 0) {
				result = result.substring(1, result.length());
			}
		}

		return result;
	}

	/**
	 * Extract the query of the line 
	 * @param viewer
	 * @param offset
	 * @return
	 */
	private String extractQuery(ITextViewer viewer, int offset) {
		String result = null;
		String line = extractEditedLine(viewer, offset);

		int hasFrom = line.indexOf("from");
		if(hasFrom >= 0) {
			result = "/" + line.substring(5, line.length());
		} else {
			int firstSlash = line.indexOf('/');
			result = line.substring(firstSlash);
		}

		return result;
	}

	/**
	 * Extracts the line that is being edited
	 * @param viewer
	 * @param offset
	 * @return
	 */
	private String extractEditedLine(ITextViewer viewer, int offset) {
		String result = null;

		IDocument document = viewer.getDocument();
		try  {
			int lastEditedLine = document.getLineOfOffset(offset);
			int lineLenght = document.getLineLength(lastEditedLine);
			result = document.get().substring(offset-lineLenght, offset);	
			result = result.trim();
		} catch(Exception e) {
			e.printStackTrace();
		}		
		return result;
	}


	@Override
	public IContextInformation[] computeContextInformation(ITextViewer viewer, int offset) {
		System.out.println("computeContextInformation");
		return null;
	}

	@Override
	public char[] getCompletionProposalAutoActivationCharacters() {
		//		System.out.println("getCompletionProposalAutoActivationCharacters");
		return "/".toCharArray();
	}

	@Override
	public char[] getContextInformationAutoActivationCharacters() {
		//		System.out.println("getContextInformationAutoActivationCharacters");
		return null;
	}

	@Override
	public IContextInformationValidator getContextInformationValidator() {
		System.out.println("getContextInformationValidator");
		return null;
	}

	@Override
	public String getErrorMessage() {
		//		System.out.println("getErrorMessage");
		return "Han llamado a getErrorMessage";
	}

}
