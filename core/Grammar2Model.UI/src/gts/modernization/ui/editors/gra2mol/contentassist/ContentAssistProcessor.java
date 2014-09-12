package gts.modernization.ui.editors.gra2mol.contentassist;

import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.ITextViewer;
import org.eclipse.jface.text.contentassist.CompletionProposal;
import org.eclipse.jface.text.contentassist.ICompletionProposal;
import org.eclipse.jface.text.contentassist.IContentAssistProcessor;
import org.eclipse.jface.text.contentassist.IContextInformation;
import org.eclipse.jface.text.contentassist.IContextInformationValidator;

public class ContentAssistProcessor implements IContentAssistProcessor {

	public ContentAssistProcessor() {
		super();
	}
	
	@Override
	public ICompletionProposal[] computeCompletionProposals(ITextViewer viewer, int offset) {

		System.out.println("computeCompletionProposals");
        IDocument document = viewer.getDocument();
        try  {
        System.out.println("Document:");
        System.out.println("getLength: " + document.getLength());
        System.out.println("getNumberOfLines: " + document.getNumberOfLines());
        System.out.println("getLineOffset(0): " + document.getLineOffset(0));
        System.out.println("getLineOffset(1): " + document.getLineOffset(1));
        System.out.println("getLineOffset(2): " + document.getLineOffset(2));
        System.out.println("getLineOffset(3): " + document.getLineOffset(3));
        System.out.println("getLineOffset(" + (document.getNumberOfLines()-1) + "): " + document.getLineOffset(document.getNumberOfLines()-1));
        } catch(Exception e) {
        	e.printStackTrace();
        }
        
        CompletionProposal result[] = { new CompletionProposal("hola", 2, 4, 2) };
		return result;
	}

	@Override
	public IContextInformation[] computeContextInformation(ITextViewer viewer, int offset) {
		System.out.println("computeContextInformation");
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public char[] getCompletionProposalAutoActivationCharacters() {
//		System.out.println("getCompletionProposalAutoActivationCharacters");
		return "y".toCharArray();
	}

	@Override
	public char[] getContextInformationAutoActivationCharacters() {
//		System.out.println("getContextInformationAutoActivationCharacters");
		return "u".toCharArray();
	}

	@Override
	public IContextInformationValidator getContextInformationValidator() {
		System.out.println("getContextInformationValidator");
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getErrorMessage() {
		System.out.println("getErrorMessage");
		// TODO Auto-generated method stub
		return null;
	}

}
