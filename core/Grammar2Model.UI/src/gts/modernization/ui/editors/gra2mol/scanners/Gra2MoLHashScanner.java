package gts.modernization.ui.editors.gra2mol.scanners;

import gts.modernization.ui.editors.gra2mol.ColorManager;
import gts.modernization.ui.editors.gra2mol.IXMLColorConstants;
import gts.modernization.ui.editors.gra2mol.XMLWhitespaceDetector;
import gts.modernization.ui.editors.gra2mol.rules.KeywordRule;

import org.eclipse.jface.text.TextAttribute;
import org.eclipse.jface.text.rules.IRule;
import org.eclipse.jface.text.rules.IToken;
import org.eclipse.jface.text.rules.RuleBasedScanner;
import org.eclipse.jface.text.rules.SingleLineRule;
import org.eclipse.jface.text.rules.Token;
import org.eclipse.jface.text.rules.WhitespaceRule;
import org.eclipse.swt.SWT;

public class Gra2MoLHashScanner extends RuleBasedScanner {
	public Gra2MoLHashScanner(ColorManager manager) {
		IToken hashSubpart =
			new Token(
					new TextAttribute(
							manager.getColor(IXMLColorConstants.COLOR_BURDEOS), 
							null,
							SWT.BOLD));
		IToken nameSubpart =
			new Token(
				new TextAttribute(
						manager.getColor(IXMLColorConstants.COLOR_BLACK), 
						null,
						SWT.BOLD));
		
		IToken quotedSubpart =
			new Token(
				new TextAttribute(
						manager.getColor(IXMLColorConstants.COLOR_LIGHTBLUE)));

		IRule[] rules = new IRule[] {
				new KeywordRule("hash", hashSubpart, false),
				new SingleLineRule("'", "'", nameSubpart),
				new SingleLineRule("\"", "\"", quotedSubpart),
				new KeywordRule("end_hash", hashSubpart, true),
				new WhitespaceRule(new XMLWhitespaceDetector())
				};

		setRules(rules);
	}
}
