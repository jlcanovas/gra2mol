package gts.modernization.ui.editors.gra2mol.rules;

import org.eclipse.jface.text.rules.ICharacterScanner;
import org.eclipse.jface.text.rules.IToken;
import org.eclipse.jface.text.rules.SingleLineRule;
import org.eclipse.jface.text.rules.Token;

public class OnceRule extends SingleLineRule {
	private boolean time = true;
	
	public OnceRule(String startSequence, String endSequence, IToken token) {
		super(startSequence, endSequence, token, 'e');
	}

	public IToken evaluate(ICharacterScanner scanner, boolean resume) {
		if(time) {
			time = false;
			return super.evaluate(scanner, resume);
		}
		else return super.evaluate(null, resume);
	}
}
