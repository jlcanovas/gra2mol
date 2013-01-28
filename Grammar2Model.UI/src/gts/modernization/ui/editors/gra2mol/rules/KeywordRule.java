package gts.modernization.ui.editors.gra2mol.rules;

import org.eclipse.jface.text.rules.ICharacterScanner;
import org.eclipse.jface.text.rules.IRule;
import org.eclipse.jface.text.rules.IToken;
import org.eclipse.jface.text.rules.Token;

public class KeywordRule implements IRule {
	IToken fToken;
	StringBuffer buffer = new StringBuffer();
	int charsRead = 0;
	int realChars = 0;
	boolean endsPartition;

	private String matchString;

	public KeywordRule(String keyword, IToken token, boolean endsPartition) {
		super();
		this.fToken = token;
		this.matchString = keyword;
		this.endsPartition = endsPartition;
	}

	public IToken evaluate(ICharacterScanner scanner) {
		buffer.setLength(0);
		charsRead = 0;

		int c = read(scanner);

		// This variable is activate if we can analize the matchString
		boolean once = false;
		if(c == matchString.charAt(0)) {
			// The first character is the first of the matchString
			once = true;
		} else {
			// We skip the white spaces, new lines, etc...
			while(c == ' ' || c == '\t' || c == '\n' || c == 13) {
				c = read(scanner);
				once = true;
			}
		} 

		if (once && c == matchString.charAt(0))	{
			// We read the word
			realChars = 1;
			do {
				c = read(scanner);
				realChars++;
			} while (isOK((char) c));
			
			if (realChars == matchString.length() && matchString.charAt(realChars - 1) == c) {
				// We have detected the matchString
				c = read(scanner);
				if(!endsPartition) {
					// If the token doesn't end the partition we have to read a non-character  more
					if(c == ' ' || c == '\t' || c == '\n' || c == 13) {
						return fToken;
					} else {
						scanner.unread();
						return Token.UNDEFINED;
					}
				} else {
					// If the token ends the partition, we can match the token
					return fToken;
				}
			} else {
				rewind(scanner);
				return Token.UNDEFINED;
			}
		}

		rewind(scanner);
		return Token.UNDEFINED;
	}

	private void rewind(ICharacterScanner scanner) {
		int rewindLength = charsRead;
		while (rewindLength > 0) {
			scanner.unread();
			rewindLength--;
		}
	}

	private int read(ICharacterScanner scanner) {
		int c = scanner.read();
		buffer.append((char) c);
		charsRead++;
		return c;
	}

	private boolean isOK(char c) {
		if (realChars >= matchString.length())
			return false;
		if (matchString.charAt(realChars - 1) == c)
			return true;
		else
			return false;
	}
}
