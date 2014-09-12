package gts.modernization.ui.editors.gra2mol.scanners;

import gts.modernization.ui.editors.gra2mol.ColorManager;
import gts.modernization.ui.editors.gra2mol.IXMLColorConstants;
import gts.modernization.ui.editors.gra2mol.XMLWhitespaceDetector;
import gts.modernization.ui.editors.gra2mol.rules.CommentRule;
import gts.modernization.ui.editors.gra2mol.rules.KeywordRule;
import gts.modernization.ui.editors.gra2mol.rules.OnceRule;

import org.eclipse.jface.text.TextAttribute;
import org.eclipse.jface.text.rules.IRule;
import org.eclipse.jface.text.rules.IToken;
import org.eclipse.jface.text.rules.RuleBasedScanner;
import org.eclipse.jface.text.rules.SingleLineRule;
import org.eclipse.jface.text.rules.Token;
import org.eclipse.jface.text.rules.WhitespaceRule;
import org.eclipse.swt.SWT;


public class Gra2MoLRuleScanner extends RuleBasedScanner {
	public Gra2MoLRuleScanner(ColorManager manager) {
		IToken ruleSubpart =
			new Token(
				new TextAttribute(
						manager.getColor(IXMLColorConstants.COLOR_BURDEOS), 
						null,
						SWT.BOLD));
		
		IToken fromSubpart =
			new Token(
				new TextAttribute(
						manager.getColor(IXMLColorConstants.COLOR_BLUE), 
						null,
						SWT.BOLD));
		
		IToken contextSubpart =
			new Token(
				new TextAttribute(
						manager.getColor(IXMLColorConstants.COLOR_BLUE), 
						null,
						SWT.BOLD));
		
		IToken toSubpart =
			new Token(
				new TextAttribute(
						manager.getColor(IXMLColorConstants.COLOR_BLUE), 
						null,
						SWT.BOLD));
		

		IToken mixinSubpart =
			new Token(
				new TextAttribute(
						manager.getColor(IXMLColorConstants.COLOR_BLUE), 
						null,
						SWT.BOLD));
		
		IToken queriesSubpart =
			new Token(
				new TextAttribute(
						manager.getColor(IXMLColorConstants.COLOR_BLUE), 
						null,
						SWT.BOLD));
		
		IToken queryDefSubpart =
			new Token(
				new TextAttribute(
						manager.getColor(IXMLColorConstants.COLOR_BLACK), 
						null,
						SWT.BOLD));
		
		IToken mappingsSubpart =
			new Token(
				new TextAttribute(
						manager.getColor(IXMLColorConstants.COLOR_BLUE), 
						null,
						SWT.BOLD));
		
		IToken nameSubpart =
			new Token(
				new TextAttribute(
						manager.getColor(IXMLColorConstants.COLOR_BLACK), 
						null,
						SWT.BOLD));
		
		IToken commentSubpart = 
			new Token(
					new TextAttribute(
							manager.getColor(IXMLColorConstants.COLOR_GREEN), 
							null,
							SWT.ITALIC));
		
		IToken quotedSubpart =
			new Token(
				new TextAttribute(
						manager.getColor(IXMLColorConstants.COLOR_LIGHTBLUE)));

		IRule[] rules = new IRule[] { 
				new KeywordRule("rule", ruleSubpart, false),
				new KeywordRule("skip_rule", ruleSubpart, false),
				new KeywordRule("mixin_rule", ruleSubpart, false),
				new SingleLineRule("'", "'", nameSubpart),
				new KeywordRule("from", fromSubpart, false),
				new KeywordRule("context", contextSubpart, false),
				new KeywordRule("to", toSubpart, false),
				new KeywordRule("mixin", mixinSubpart, false),
				new KeywordRule("queries", queriesSubpart, false),
				new KeywordRule("mappings", mappingsSubpart, false),
				new SingleLineRule("\"", "\"", quotedSubpart),
				new KeywordRule("end_rule", ruleSubpart, true),
				new CommentRule(commentSubpart),
				new WhitespaceRule(new XMLWhitespaceDetector())
				};

		setRules(rules);
	}
}
