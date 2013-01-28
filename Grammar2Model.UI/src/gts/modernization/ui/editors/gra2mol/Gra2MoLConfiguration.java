package gts.modernization.ui.editors.gra2mol;

import gts.modernization.interpreter.actions.QueryAccessAction;
import gts.modernization.ui.editors.gra2mol.contentassist.ContentAssistProcessor;
import gts.modernization.ui.editors.gra2mol.contentassist.QueryAssistProcessor;
import gts.modernization.ui.editors.gra2mol.format.DefaultFormattingStrategy;
import gts.modernization.ui.editors.gra2mol.format.RuleFormatingStrategy;
import gts.modernization.ui.editors.gra2mol.properties.Gra2MoLPropertyPage;
import gts.modernization.ui.editors.gra2mol.scanners.Gra2MoLCommentScanner;
import gts.modernization.ui.editors.gra2mol.scanners.Gra2MoLHashScanner;
import gts.modernization.ui.editors.gra2mol.scanners.Gra2MoLPartitionScanner;
import gts.modernization.ui.editors.gra2mol.scanners.Gra2MoLRuleScanner;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.QualifiedName;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.TextAttribute;
import org.eclipse.jface.text.contentassist.ContentAssistant;
import org.eclipse.jface.text.contentassist.IContentAssistProcessor;
import org.eclipse.jface.text.contentassist.IContentAssistant;
import org.eclipse.jface.text.formatter.ContentFormatter;
import org.eclipse.jface.text.formatter.IContentFormatter;
import org.eclipse.jface.text.presentation.IPresentationReconciler;
import org.eclipse.jface.text.presentation.PresentationReconciler;
import org.eclipse.jface.text.rules.DefaultDamagerRepairer;
import org.eclipse.jface.text.rules.Token;
import org.eclipse.jface.text.source.ISourceViewer;
import org.eclipse.jface.text.source.SourceViewerConfiguration;


public class Gra2MoLConfiguration extends SourceViewerConfiguration {
	private XMLDoubleClickStrategy doubleClickStrategy;
	private Gra2MoLHashScanner hashScanner;
	private Gra2MoLRuleScanner ruleScanner;
	private Gra2MoLCommentScanner commentScanner;
	private ColorManager colorManager;
	
	private QueryAssistProcessor queryAssistProcessor;

	public void update(IFile file) {
		try {
			String grammarPath = file.getPersistentProperty(new QualifiedName("", Gra2MoLPropertyPage.SOURCEGRAMMAR_PROPERTY));
			queryAssistProcessor.setGrammar(grammarPath);
		} catch (CoreException e) {
			e.printStackTrace();
		}
	}
	
	public Gra2MoLConfiguration(ColorManager colorManager) {
		this.colorManager = colorManager;
		this.queryAssistProcessor = new QueryAssistProcessor();
	}
	public String[] getConfiguredContentTypes(ISourceViewer sourceViewer) {
		return new String[] {
			IDocument.DEFAULT_CONTENT_TYPE,
			Gra2MoLPartitionScanner.GRA2MOL_RULE,
			Gra2MoLPartitionScanner.GRA2MOL_HASH,
			Gra2MoLPartitionScanner.GRA2MOL_COMMENT
			};
	}
	
//	public ITextDoubleClickStrategy getDoubleClickStrategy(
//		ISourceViewer sourceViewer,
//		String contentType) {
//		if (doubleClickStrategy == null)
//			doubleClickStrategy = new XMLDoubleClickStrategy();
//		return doubleClickStrategy;
//	}

	protected Gra2MoLRuleScanner getRuleScanner() {
		if (ruleScanner == null) {
			ruleScanner = new Gra2MoLRuleScanner(colorManager);
			ruleScanner.setDefaultReturnToken(
				new Token(
					new TextAttribute(
						colorManager.getColor(IXMLColorConstants.DEFAULT))));
		}
		return ruleScanner;
	}
	
	protected Gra2MoLHashScanner getHashScanner() {
		if (hashScanner == null) {
			hashScanner = new Gra2MoLHashScanner(colorManager);
			hashScanner.setDefaultReturnToken(
				new Token(
					new TextAttribute(
						colorManager.getColor(IXMLColorConstants.DEFAULT))));
		}
		return hashScanner;
	}
	
	protected Gra2MoLCommentScanner getCommentScanner() {
		if (commentScanner == null) {
			commentScanner = new Gra2MoLCommentScanner(colorManager);
			commentScanner.setDefaultReturnToken(
				new Token(
					new TextAttribute(
						colorManager.getColor(IXMLColorConstants.DEFAULT))));
		}
		return commentScanner;
	}

	public IPresentationReconciler getPresentationReconciler(ISourceViewer sourceViewer) {
		PresentationReconciler reconciler = new PresentationReconciler();

		DefaultDamagerRepairer dr =	new DefaultDamagerRepairer(getRuleScanner());
		reconciler.setDamager(dr, Gra2MoLPartitionScanner.GRA2MOL_RULE);
		reconciler.setRepairer(dr, Gra2MoLPartitionScanner.GRA2MOL_RULE);

		dr = new DefaultDamagerRepairer(getHashScanner());
		reconciler.setDamager(dr, Gra2MoLPartitionScanner.GRA2MOL_HASH);
		reconciler.setRepairer(dr, Gra2MoLPartitionScanner.GRA2MOL_HASH);
		
		dr = new DefaultDamagerRepairer(getCommentScanner());
		reconciler.setDamager(dr, Gra2MoLPartitionScanner.GRA2MOL_COMMENT);
		reconciler.setRepairer(dr, Gra2MoLPartitionScanner.GRA2MOL_COMMENT);

		return reconciler;
	}
	
    public IContentFormatter getContentFormatter(ISourceViewer sourceViewer) {
        ContentFormatter formatter = new ContentFormatter();
        
        DefaultFormattingStrategy defaultStrategy = new DefaultFormattingStrategy();
        RuleFormatingStrategy ruleStrategy = new RuleFormatingStrategy();
        
        formatter.setFormattingStrategy(defaultStrategy, IDocument.DEFAULT_CONTENT_TYPE);
        formatter.setFormattingStrategy(ruleStrategy, Gra2MoLPartitionScanner.GRA2MOL_RULE);

        return formatter;
    }
    
    public IContentAssistant getContentAssistant(ISourceViewer sourceViewer) {
    	ContentAssistant assistant = new ContentAssistant();
    	
    	IContentAssistProcessor contentAssistProcessor = new ContentAssistProcessor();
    	IContentAssistProcessor queryAssistProcessor = this.queryAssistProcessor;
    	
    	assistant.setContentAssistProcessor(queryAssistProcessor, Gra2MoLPartitionScanner.GRA2MOL_RULE);
    	assistant.setContentAssistProcessor(contentAssistProcessor, Gra2MoLPartitionScanner.GRA2MOL_COMMENT);
    	assistant.setContentAssistProcessor(contentAssistProcessor, Gra2MoLPartitionScanner.GRA2MOL_HASH);
    	assistant.setContentAssistProcessor(contentAssistProcessor, IDocument.DEFAULT_CONTENT_TYPE);
    	assistant.setAutoActivationDelay(500);
    	assistant.enableAutoActivation(true);
    	assistant.setProposalPopupOrientation(IContentAssistant.CONTEXT_INFO_BELOW);
    	assistant.setContextInformationPopupOrientation(IContentAssistant.CONTEXT_INFO_BELOW);
    	return assistant;
    }

}