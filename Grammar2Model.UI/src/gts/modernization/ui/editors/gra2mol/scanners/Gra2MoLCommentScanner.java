package gts.modernization.ui.editors.gra2mol.scanners;

import gts.modernization.ui.editors.gra2mol.ColorManager;
import gts.modernization.ui.editors.gra2mol.IXMLColorConstants;
import gts.modernization.ui.editors.gra2mol.XMLWhitespaceDetector;
import gts.modernization.ui.editors.gra2mol.rules.CommentRule;

import org.eclipse.jface.text.TextAttribute;
import org.eclipse.jface.text.rules.IRule;
import org.eclipse.jface.text.rules.IToken;
import org.eclipse.jface.text.rules.RuleBasedScanner;
import org.eclipse.jface.text.rules.Token;
import org.eclipse.jface.text.rules.WhitespaceRule;
import org.eclipse.swt.SWT;

public class Gra2MoLCommentScanner extends RuleBasedScanner {
	public Gra2MoLCommentScanner(ColorManager manager) {
		IToken commentSubpart = 
			new Token(
					new TextAttribute(
							manager.getColor(IXMLColorConstants.COLOR_GREEN), 
							null,
							SWT.ITALIC));

		IRule[] rules = new IRule[] { 
				new CommentRule(commentSubpart),
				new WhitespaceRule(new XMLWhitespaceDetector())
				};

		setRules(rules);
	}
}
