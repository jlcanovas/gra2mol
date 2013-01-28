package gts.modernization.ui.editors.gra2mol.scanners;

import gts.modernization.ui.editors.gra2mol.rules.CommentPredicateRule;
import gts.modernization.ui.editors.gra2mol.rules.NonMatchingRule;

import org.eclipse.jface.text.rules.IPredicateRule;
import org.eclipse.jface.text.rules.IToken;
import org.eclipse.jface.text.rules.MultiLineRule;
import org.eclipse.jface.text.rules.RuleBasedPartitionScanner;
import org.eclipse.jface.text.rules.SingleLineRule;
import org.eclipse.jface.text.rules.Token;


public class Gra2MoLPartitionScanner extends RuleBasedPartitionScanner {

	public final static String GRA2MOL_RULE = "__gra2mol_rule";
	public final static String GRA2MOL_HASH = "__gra2mol_hash";
	public final static String GRA2MOL_COMMENT = "__gra2mol_comment";
	
	public Gra2MoLPartitionScanner() {

		IToken gra2molRule = new Token(GRA2MOL_RULE);
		IToken gra2molHash = new Token(GRA2MOL_HASH);
		IToken gra2molComment = new Token(GRA2MOL_COMMENT);

		IPredicateRule[] rules = new IPredicateRule[] {
				new NonMatchingRule(),
				new MultiLineRule("rule", "end_rule", gra2molRule),
				new MultiLineRule("skip_rule", "end_rule", gra2molRule),
				new MultiLineRule("mixin_rule", "end_rule", gra2molRule),
				new MultiLineRule("hash", "end_hash", gra2molHash),
				new CommentPredicateRule(gra2molComment)
		};

		setPredicateRules(rules);
	}
}
