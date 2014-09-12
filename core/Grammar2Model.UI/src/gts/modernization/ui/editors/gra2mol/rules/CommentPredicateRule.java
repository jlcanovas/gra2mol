package gts.modernization.ui.editors.gra2mol.rules;

import org.eclipse.jface.text.rules.ICharacterScanner;
import org.eclipse.jface.text.rules.IPredicateRule;
import org.eclipse.jface.text.rules.IToken;
import org.eclipse.jface.text.rules.Token;

public class CommentPredicateRule implements IPredicateRule {
	IToken fToken;

	public CommentPredicateRule(IToken token) {
		super();
		this.fToken = token;
	}

	public IToken evaluate(ICharacterScanner scanner) {
		int c = scanner.read();

		if (c == '-')	{
			c = scanner.read();
			if(c == '-') {
				do {
					c = scanner.read();
				} while (c != '\n' && c != 13 && c != -1);
				return fToken;
			}
			scanner.unread();
		}
		scanner.unread();
		return Token.UNDEFINED;
	}

	public IToken evaluate(ICharacterScanner scanner, boolean resume) {
		return this.evaluate(scanner);
	}

	@Override
	public IToken getSuccessToken() {
		return fToken;
	}
}
