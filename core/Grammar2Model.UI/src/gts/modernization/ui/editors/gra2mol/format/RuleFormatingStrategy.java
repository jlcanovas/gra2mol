package gts.modernization.ui.editors.gra2mol.format;

public class RuleFormatingStrategy extends DefaultFormattingStrategy {
	private static final String lineSeparator = System.getProperty("line.separator");

	public RuleFormatingStrategy() {
		super();
	}

	public String format(String content, boolean isLineStart, String indentation, int[] positions) {
		if (indentation.length() == 0)
			return content;
		return lineSeparator + content.trim() + lineSeparator + indentation;
	}

}
