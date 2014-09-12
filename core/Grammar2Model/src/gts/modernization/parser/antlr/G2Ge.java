/*******************************************************************************
 * Copyright (c) 2008, 2011
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Javier Canovas (jlcanovas@um.es) 
 *******************************************************************************/


// $ANTLR 3.2 Sep 23, 2009 12:02:23 C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3 2010-01-24 22:46:36

package gts.modernization.parser.antlr;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;

import org.antlr.runtime.BaseRecognizer;
import org.antlr.runtime.BitSet;
import org.antlr.runtime.DFA;
import org.antlr.runtime.EarlyExitException;
import org.antlr.runtime.MismatchedSetException;
import org.antlr.runtime.NoViableAltException;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.RecognizerSharedState;
import org.antlr.runtime.RuleReturnScope;
import org.antlr.runtime.Token;
import org.antlr.runtime.TokenRewriteStream;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.TreeNodeStream;
import org.antlr.runtime.tree.TreeParser;
import org.antlr.runtime.tree.TreeRuleReturnScope;
import org.antlr.stringtemplate.StringTemplate;
import org.antlr.stringtemplate.StringTemplateGroup;
import org.antlr.stringtemplate.language.AngleBracketTemplateLexer;
/** ANTLR v3 tree grammar to walk trees created by ANTLRv3.g  */
public class G2Ge extends TreeParser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "DOC_COMMENT", "PARSER", "LEXER", "RULE", "BLOCK", "OPTIONAL", "CLOSURE", "POSITIVE_CLOSURE", "SYNPRED", "RANGE", "CHAR_RANGE", "EPSILON", "ALT", "EOR", "EOB", "EOA", "ID", "ARG", "ARGLIST", "RET", "LEXER_GRAMMAR", "PARSER_GRAMMAR", "TREE_GRAMMAR", "COMBINED_GRAMMAR", "INITACTION", "LABEL", "TEMPLATE", "SCOPE", "SEMPRED", "GATED_SEMPRED", "SYN_SEMPRED", "BACKTRACK_SEMPRED", "FRAGMENT", "TREE_BEGIN", "ROOT", "BANG", "REWRITE", "TOKENS", "TOKEN_REF", "STRING_LITERAL", "CHAR_LITERAL", "ACTION", "OPTIONS", "INT", "ARG_ACTION", "RULE_REF", "DOUBLE_QUOTE_STRING_LITERAL", "DOUBLE_ANGLE_STRING_LITERAL", "SRC", "SL_COMMENT", "ML_COMMENT", "LITERAL_CHAR", "ESC", "XDIGIT", "NESTED_ARG_ACTION", "ACTION_STRING_LITERAL", "ACTION_CHAR_LITERAL", "NESTED_ACTION", "ACTION_ESC", "WS_LOOP", "WS", "'lexer'", "'parser'", "'tree'", "'grammar'", "';'", "'}'", "'='", "'@'", "'::'", "'*'", "'protected'", "'public'", "'private'", "'returns'", "':'", "'throws'", "','", "'('", "'|'", "')'", "'catch'", "'finally'", "'+='", "'=>'", "'~'", "'?'", "'+'", "'.'", "'$'"
	};
	public static final int BACKTRACK_SEMPRED=35;
	public static final int DOUBLE_ANGLE_STRING_LITERAL=51;
	public static final int LEXER_GRAMMAR=24;
	public static final int EOA=19;
	public static final int ARGLIST=22;
	public static final int EOF=-1;
	public static final int SEMPRED=32;
	public static final int ACTION=45;
	public static final int EOB=18;
	public static final int TOKEN_REF=42;
	public static final int T__93=93;
	public static final int T__91=91;
	public static final int RET=23;
	public static final int T__92=92;
	public static final int STRING_LITERAL=43;
	public static final int T__90=90;
	public static final int ARG=21;
	public static final int EOR=17;
	public static final int ARG_ACTION=48;
	public static final int DOUBLE_QUOTE_STRING_LITERAL=50;
	public static final int NESTED_ARG_ACTION=58;
	public static final int ACTION_CHAR_LITERAL=60;
	public static final int INITACTION=28;
	public static final int T__80=80;
	public static final int T__81=81;
	public static final int T__82=82;
	public static final int RULE=7;
	public static final int ACTION_ESC=62;
	public static final int T__83=83;
	public static final int PARSER_GRAMMAR=25;
	public static final int SRC=52;
	public static final int INT=47;
	public static final int CHAR_RANGE=14;
	public static final int EPSILON=15;
	public static final int T__85=85;
	public static final int T__84=84;
	public static final int T__87=87;
	public static final int T__86=86;
	public static final int REWRITE=40;
	public static final int T__89=89;
	public static final int T__88=88;
	public static final int WS=64;
	public static final int T__71=71;
	public static final int T__72=72;
	public static final int COMBINED_GRAMMAR=27;
	public static final int T__70=70;
	public static final int LEXER=6;
	public static final int SL_COMMENT=53;
	public static final int TREE_GRAMMAR=26;
	public static final int T__76=76;
	public static final int CLOSURE=10;
	public static final int T__75=75;
	public static final int PARSER=5;
	public static final int T__74=74;
	public static final int T__73=73;
	public static final int T__79=79;
	public static final int T__78=78;
	public static final int T__77=77;
	public static final int T__68=68;
	public static final int T__69=69;
	public static final int T__66=66;
	public static final int T__67=67;
	public static final int T__65=65;
	public static final int NESTED_ACTION=61;
	public static final int ESC=56;
	public static final int FRAGMENT=36;
	public static final int ID=20;
	public static final int TREE_BEGIN=37;
	public static final int ML_COMMENT=54;
	public static final int ALT=16;
	public static final int SCOPE=31;
	public static final int DOC_COMMENT=4;
	public static final int WS_LOOP=63;
	public static final int RANGE=13;
	public static final int TOKENS=41;
	public static final int GATED_SEMPRED=33;
	public static final int LITERAL_CHAR=55;
	public static final int BANG=39;
	public static final int ACTION_STRING_LITERAL=59;
	public static final int ROOT=38;
	public static final int RULE_REF=49;
	public static final int SYNPRED=12;
	public static final int OPTIONAL=9;
	public static final int CHAR_LITERAL=44;
	public static final int LABEL=29;
	public static final int TEMPLATE=30;
	public static final int SYN_SEMPRED=34;
	public static final int XDIGIT=57;
	public static final int BLOCK=8;
	public static final int POSITIVE_CLOSURE=11;
	public static final int OPTIONS=46;

	// delegates
	// delegators


	public G2Ge(TreeNodeStream input) {
		this(input, new RecognizerSharedState());
	}
	public G2Ge(TreeNodeStream input, RecognizerSharedState state) {
		super(input, state);

	}

	protected StringTemplateGroup templateLib =
		new StringTemplateGroup("G2GeTemplates", AngleBracketTemplateLexer.class);

	public void setTemplateLib(StringTemplateGroup templateLib) {
		this.templateLib = templateLib;
	}
	public StringTemplateGroup getTemplateLib() {
		return templateLib;
	}
	/** allows convenient multi-value initialization:
	 *  "new STAttrMap().put(...).put(...)"
	 */
	public static class STAttrMap extends HashMap {
		public STAttrMap put(String attrName, Object value) {
			super.put(attrName, value);
			return this;
		}
		public STAttrMap put(String attrName, int value) {
			super.put(attrName, new Integer(value));
			return this;
		}
	}

	public String[] getTokenNames() { return G2Ge.tokenNames; }
	public String getGrammarFileName() { return "C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3"; }


	boolean existsHeader = false;
	boolean existsOutput = false;
	boolean mainRule = true;
	String pathTemplates;

	public G2Ge(TreeNodeStream input, String pathTemplates) {
		super(input);
		this.pathTemplates = pathTemplates;
	}


	protected static class grammarDef_scope {
		boolean inMainOptions;
	}
	protected Stack grammarDef_stack = new Stack();

	public static class grammarDef_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};

	// $ANTLR start "grammarDef"
	// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:29:1: grammarDef : ^( grammarType name= ID ( DOC_COMMENT )? ( optionsSpec )? ( tokensSpec )? ( attrScope )* ( action )* ( rule )+ ) -> normalRule(assign=sol);
	public final G2Ge.grammarDef_return grammarDef() throws RecognitionException {
		grammarDef_stack.push(new grammarDef_scope());
		G2Ge.grammarDef_return retval = new G2Ge.grammarDef_return();
		retval.start = input.LT(1);

		CommonTree name=null;


		((grammarDef_scope)grammarDef_stack.peek()).inMainOptions = false;

		try {
			// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:36:5: ( ^( grammarType name= ID ( DOC_COMMENT )? ( optionsSpec )? ( tokensSpec )? ( attrScope )* ( action )* ( rule )+ ) -> normalRule(assign=sol))
			// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:36:9: ^( grammarType name= ID ( DOC_COMMENT )? ( optionsSpec )? ( tokensSpec )? ( attrScope )* ( action )* ( rule )+ )
			{
				pushFollow(FOLLOW_grammarType_in_grammarDef79);
				grammarType();

				state._fsp--;


				match(input, Token.DOWN, null); 
				name=(CommonTree)match(input,ID,FOLLOW_ID_in_grammarDef83); 
				ANTLRUtil.initialize((name!=null?name.getText():null), pathTemplates); 
				// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:36:85: ( DOC_COMMENT )?
				int alt1=2;
				int LA1_0 = input.LA(1);

				if ( (LA1_0==DOC_COMMENT) ) {
					alt1=1;
				}
				switch (alt1) {
				case 1 :
					// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:36:85: DOC_COMMENT
				{
					match(input,DOC_COMMENT,FOLLOW_DOC_COMMENT_in_grammarDef87); 

				}
				break;

				}

				((grammarDef_scope)grammarDef_stack.peek()).inMainOptions = true; 
				// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:37:45: ( optionsSpec )?
				int alt2=2;
				int LA2_0 = input.LA(1);

				if ( (LA2_0==OPTIONS) ) {
					alt2=1;
				}
				switch (alt2) {
				case 1 :
					// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:37:45: optionsSpec
				{
					pushFollow(FOLLOW_optionsSpec_in_grammarDef98);
					optionsSpec();

					state._fsp--;


				}
				break;

				}

				((grammarDef_scope)grammarDef_stack.peek()).inMainOptions = false; 
				// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:38:6: ( tokensSpec )?
				int alt3=2;
				int LA3_0 = input.LA(1);

				if ( (LA3_0==TOKENS) ) {
					alt3=1;
				}
				switch (alt3) {
				case 1 :
					// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:38:6: tokensSpec
				{
					pushFollow(FOLLOW_tokensSpec_in_grammarDef108);
					tokensSpec();

					state._fsp--;


				}
				break;

				}

				// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:38:18: ( attrScope )*
				loop4:
					do {
						int alt4=2;
						int LA4_0 = input.LA(1);

						if ( (LA4_0==SCOPE) ) {
							alt4=1;
						}


						switch (alt4) {
						case 1 :
							// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:38:18: attrScope
						{
							pushFollow(FOLLOW_attrScope_in_grammarDef111);
							attrScope();

							state._fsp--;


						}
						break;

						default :
							break loop4;
						}
					} while (true);

				// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:38:29: ( action )*
				loop5:
					do {
						int alt5=2;
						int LA5_0 = input.LA(1);

						if ( (LA5_0==72) ) {
							alt5=1;
						}


						switch (alt5) {
						case 1 :
							// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:38:29: action
						{
							pushFollow(FOLLOW_action_in_grammarDef114);
							action();

							state._fsp--;


						}
						break;

						default :
							break loop5;
						}
					} while (true);

				// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:38:37: ( rule )+
				int cnt6=0;
				loop6:
					do {
						int alt6=2;
						int LA6_0 = input.LA(1);

						if ( (LA6_0==RULE) ) {
							alt6=1;
						}


						switch (alt6) {
						case 1 :
							// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:38:37: rule
						{
							pushFollow(FOLLOW_rule_in_grammarDef117);
							rule();

							state._fsp--;


						}
						break;

						default :
							if ( cnt6 >= 1 ) break loop6;
							EarlyExitException eee =
								new EarlyExitException(6, input);
							throw eee;
						}
						cnt6++;
					} while (true);


				match(input, Token.UP, null); 

				String sol = input.getTokenStream().toString(
						input.getTreeAdaptor().getTokenStartIndex(retval.start),
						input.getTreeAdaptor().getTokenStopIndex(retval.start));
				if(!existsOutput) {
					sol = ANTLRUtil.addOutput(input.getTokenStream().toString(
							input.getTreeAdaptor().getTokenStartIndex(retval.start),
							input.getTreeAdaptor().getTokenStopIndex(retval.start)));
					existsOutput = true;
				}



				// TEMPLATE REWRITE
				// 47:3: -> normalRule(assign=sol)
				{
					retval.st = templateLib.getInstanceOf("normalRule",
							new STAttrMap().put("assign", sol));
				}

				((TokenRewriteStream)input.getTokenStream()).replace(
						input.getTreeAdaptor().getTokenStartIndex(retval.start),
						input.getTreeAdaptor().getTokenStopIndex(retval.start),
						retval.st);
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			grammarDef_stack.pop();
		}
		return retval;
	}
	// $ANTLR end "grammarDef"

	public static class grammarType_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};

	// $ANTLR start "grammarType"
	// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:50:1: grammarType : ( LEXER_GRAMMAR | PARSER_GRAMMAR | TREE_GRAMMAR | COMBINED_GRAMMAR );
	public final G2Ge.grammarType_return grammarType() throws RecognitionException {
		G2Ge.grammarType_return retval = new G2Ge.grammarType_return();
		retval.start = input.LT(1);

		try {
			// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:51:2: ( LEXER_GRAMMAR | PARSER_GRAMMAR | TREE_GRAMMAR | COMBINED_GRAMMAR )
			// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:
			{
				if ( (input.LA(1)>=LEXER_GRAMMAR && input.LA(1)<=COMBINED_GRAMMAR) ) {
					input.consume();
					state.errorRecovery=false;
				}
				else {
					MismatchedSetException mse = new MismatchedSetException(null,input);
					throw mse;
				}


			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
		}
		return retval;
	}
	// $ANTLR end "grammarType"

	public static class tokensSpec_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};

	// $ANTLR start "tokensSpec"
	// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:57:1: tokensSpec : ^( TOKENS ( tokenSpec )+ ) ;
	public final G2Ge.tokensSpec_return tokensSpec() throws RecognitionException {
		G2Ge.tokensSpec_return retval = new G2Ge.tokensSpec_return();
		retval.start = input.LT(1);

		try {
			// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:58:2: ( ^( TOKENS ( tokenSpec )+ ) )
			// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:58:4: ^( TOKENS ( tokenSpec )+ )
			{
				match(input,TOKENS,FOLLOW_TOKENS_in_tokensSpec197); 

				match(input, Token.DOWN, null); 
				// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:58:13: ( tokenSpec )+
				int cnt7=0;
				loop7:
					do {
						int alt7=2;
						int LA7_0 = input.LA(1);

						if ( (LA7_0==TOKEN_REF||LA7_0==71) ) {
							alt7=1;
						}


						switch (alt7) {
						case 1 :
							// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:58:13: tokenSpec
						{
							pushFollow(FOLLOW_tokenSpec_in_tokensSpec199);
							tokenSpec();

							state._fsp--;


						}
						break;

						default :
							if ( cnt7 >= 1 ) break loop7;
							EarlyExitException eee =
								new EarlyExitException(7, input);
							throw eee;
						}
						cnt7++;
					} while (true);


				match(input, Token.UP, null); 

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
		}
		return retval;
	}
	// $ANTLR end "tokensSpec"

	public static class tokenSpec_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};

	// $ANTLR start "tokenSpec"
	// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:61:1: tokenSpec : ( ^( '=' TOKEN_REF STRING_LITERAL ) | ^( '=' TOKEN_REF CHAR_LITERAL ) | TOKEN_REF );
	public final G2Ge.tokenSpec_return tokenSpec() throws RecognitionException {
		G2Ge.tokenSpec_return retval = new G2Ge.tokenSpec_return();
		retval.start = input.LT(1);

		try {
			// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:62:2: ( ^( '=' TOKEN_REF STRING_LITERAL ) | ^( '=' TOKEN_REF CHAR_LITERAL ) | TOKEN_REF )
			int alt8=3;
			int LA8_0 = input.LA(1);

			if ( (LA8_0==71) ) {
				int LA8_1 = input.LA(2);

				if ( (LA8_1==DOWN) ) {
					int LA8_3 = input.LA(3);

					if ( (LA8_3==TOKEN_REF) ) {
						int LA8_4 = input.LA(4);

						if ( (LA8_4==STRING_LITERAL) ) {
							alt8=1;
						}
						else if ( (LA8_4==CHAR_LITERAL) ) {
							alt8=2;
						}
						else {
							NoViableAltException nvae =
								new NoViableAltException("", 8, 4, input);

							throw nvae;
						}
					}
					else {
						NoViableAltException nvae =
							new NoViableAltException("", 8, 3, input);

						throw nvae;
					}
				}
				else {
					NoViableAltException nvae =
						new NoViableAltException("", 8, 1, input);

					throw nvae;
				}
			}
			else if ( (LA8_0==TOKEN_REF) ) {
				alt8=3;
			}
			else {
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);

				throw nvae;
			}
			switch (alt8) {
			case 1 :
				// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:62:4: ^( '=' TOKEN_REF STRING_LITERAL )
			{
				match(input,71,FOLLOW_71_in_tokenSpec213); 

				match(input, Token.DOWN, null); 
				match(input,TOKEN_REF,FOLLOW_TOKEN_REF_in_tokenSpec215); 
				match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_tokenSpec217); 

				match(input, Token.UP, null); 

			}
			break;
			case 2 :
				// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:63:4: ^( '=' TOKEN_REF CHAR_LITERAL )
			{
				match(input,71,FOLLOW_71_in_tokenSpec224); 

				match(input, Token.DOWN, null); 
				match(input,TOKEN_REF,FOLLOW_TOKEN_REF_in_tokenSpec226); 
				match(input,CHAR_LITERAL,FOLLOW_CHAR_LITERAL_in_tokenSpec228); 

				match(input, Token.UP, null); 

			}
			break;
			case 3 :
				// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:64:4: TOKEN_REF
			{
				match(input,TOKEN_REF,FOLLOW_TOKEN_REF_in_tokenSpec234); 

			}
			break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
		}
		return retval;
	}
	// $ANTLR end "tokenSpec"

	public static class attrScope_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};

	// $ANTLR start "attrScope"
	// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:67:1: attrScope : ^( 'scope' ID ACTION ) ;
	public final G2Ge.attrScope_return attrScope() throws RecognitionException {
		G2Ge.attrScope_return retval = new G2Ge.attrScope_return();
		retval.start = input.LT(1);

		try {
			// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:68:2: ( ^( 'scope' ID ACTION ) )
			// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:68:4: ^( 'scope' ID ACTION )
			{
				match(input,SCOPE,FOLLOW_SCOPE_in_attrScope247); 

				match(input, Token.DOWN, null); 
				match(input,ID,FOLLOW_ID_in_attrScope249); 
				match(input,ACTION,FOLLOW_ACTION_in_attrScope251); 

				match(input, Token.UP, null); 

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
		}
		return retval;
	}
	// $ANTLR end "attrScope"

	protected static class action_scope {
		String type;
	}
	protected Stack action_stack = new Stack();

	public static class action_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};

	// $ANTLR start "action"
	// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:71:1: action : ( ^( '@' ID ID ACTION ) | ^( '@' i= ID myAction ) );
	public final G2Ge.action_return action() throws RecognitionException {
		action_stack.push(new action_scope());
		G2Ge.action_return retval = new G2Ge.action_return();
		retval.start = input.LT(1);

		CommonTree i=null;


		((action_scope)action_stack.peek()).type = "";

		try {
			// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:78:2: ( ^( '@' ID ID ACTION ) | ^( '@' i= ID myAction ) )
			int alt9=2;
			int LA9_0 = input.LA(1);

			if ( (LA9_0==72) ) {
				int LA9_1 = input.LA(2);

				if ( (LA9_1==DOWN) ) {
					int LA9_2 = input.LA(3);

					if ( (LA9_2==ID) ) {
						int LA9_3 = input.LA(4);

						if ( (LA9_3==ID) ) {
							alt9=1;
						}
						else if ( (LA9_3==ACTION) ) {
							alt9=2;
						}
						else {
							NoViableAltException nvae =
								new NoViableAltException("", 9, 3, input);

							throw nvae;
						}
					}
					else {
						NoViableAltException nvae =
							new NoViableAltException("", 9, 2, input);

						throw nvae;
					}
				}
				else {
					NoViableAltException nvae =
						new NoViableAltException("", 9, 1, input);

					throw nvae;
				}
			}
			else {
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);

				throw nvae;
			}
			switch (alt9) {
			case 1 :
				// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:78:4: ^( '@' ID ID ACTION )
			{
				match(input,72,FOLLOW_72_in_action273); 

				match(input, Token.DOWN, null); 
				match(input,ID,FOLLOW_ID_in_action275); 
				match(input,ID,FOLLOW_ID_in_action277); 
				match(input,ACTION,FOLLOW_ACTION_in_action279); 

				match(input, Token.UP, null); 

			}
			break;
			case 2 :
				// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:79:4: ^( '@' i= ID myAction )
			{
				match(input,72,FOLLOW_72_in_action286); 

				match(input, Token.DOWN, null); 
				i=(CommonTree)match(input,ID,FOLLOW_ID_in_action290); 
				if((i!=null?i.getText():null).equals("header")) { existsHeader = true;  ((action_scope)action_stack.peek()).type = "header"; }
				pushFollow(FOLLOW_myAction_in_action294);
				myAction();

				state._fsp--;


				match(input, Token.UP, null); 

			}
			break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			action_stack.pop();
		}
		return retval;
	}
	// $ANTLR end "action"

	public static class myAction_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};

	// $ANTLR start "myAction"
	// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:82:1: myAction : ACTION -> normalRule(assign=sol);
	public final G2Ge.myAction_return myAction() throws RecognitionException {
		G2Ge.myAction_return retval = new G2Ge.myAction_return();
		retval.start = input.LT(1);

		try {
			// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:83:2: ( ACTION -> normalRule(assign=sol))
			// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:83:5: ACTION
			{
				match(input,ACTION,FOLLOW_ACTION_in_myAction308); 

				String sol = input.getTokenStream().toString(
						input.getTreeAdaptor().getTokenStartIndex(retval.start),
						input.getTreeAdaptor().getTokenStopIndex(retval.start));
				if(((action_scope)action_stack.peek()).type.equals("header")) { 
					sol = ANTLRUtil.insertHeader(sol);
				} 



				// TEMPLATE REWRITE
				// 90:7: -> normalRule(assign=sol)
				{
					retval.st = templateLib.getInstanceOf("normalRule",
							new STAttrMap().put("assign", sol));
				}

				((TokenRewriteStream)input.getTokenStream()).replace(
						input.getTreeAdaptor().getTokenStartIndex(retval.start),
						input.getTreeAdaptor().getTokenStopIndex(retval.start),
						retval.st);
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
		}
		return retval;
	}
	// $ANTLR end "myAction"

	public static class optionsSpec_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};

	// $ANTLR start "optionsSpec"
	// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:93:1: optionsSpec : ^( OPTIONS ( option )+ ) -> normalRule(assign=sol);
	public final G2Ge.optionsSpec_return optionsSpec() throws RecognitionException {
		G2Ge.optionsSpec_return retval = new G2Ge.optionsSpec_return();
		retval.start = input.LT(1);

		try {
			// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:94:2: ( ^( OPTIONS ( option )+ ) -> normalRule(assign=sol))
			// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:94:4: ^( OPTIONS ( option )+ )
			{
				match(input,OPTIONS,FOLLOW_OPTIONS_in_optionsSpec343); 

				match(input, Token.DOWN, null); 
				// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:94:14: ( option )+
				int cnt10=0;
				loop10:
					do {
						int alt10=2;
						int LA10_0 = input.LA(1);

						if ( (LA10_0==71) ) {
							alt10=1;
						}


						switch (alt10) {
						case 1 :
							// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:94:14: option
						{
							pushFollow(FOLLOW_option_in_optionsSpec345);
							option();

							state._fsp--;


						}
						break;

						default :
							if ( cnt10 >= 1 ) break loop10;
							EarlyExitException eee =
								new EarlyExitException(10, input);
							throw eee;
						}
						cnt10++;
					} while (true);


				match(input, Token.UP, null); 

				String sol = input.getTokenStream().toString(
						input.getTreeAdaptor().getTokenStartIndex(retval.start),
						input.getTreeAdaptor().getTokenStopIndex(retval.start));
				if(((grammarDef_scope)grammarDef_stack.peek()).inMainOptions && !existsOutput) {
					sol = ANTLRUtil.insertOutput(sol);
					existsOutput = true;
				}



				// TEMPLATE REWRITE
				// 102:3: -> normalRule(assign=sol)
				{
					retval.st = templateLib.getInstanceOf("normalRule",
							new STAttrMap().put("assign", sol));
				}

				((TokenRewriteStream)input.getTokenStream()).replace(
						input.getTreeAdaptor().getTokenStartIndex(retval.start),
						input.getTreeAdaptor().getTokenStopIndex(retval.start),
						retval.st);
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
		}
		return retval;
	}
	// $ANTLR end "optionsSpec"

	public static class option_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};

	// $ANTLR start "option"
	// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:105:1: option : ^( '=' ID optionValue ) ;
	public final G2Ge.option_return option() throws RecognitionException {
		G2Ge.option_return retval = new G2Ge.option_return();
		retval.start = input.LT(1);

		try {
			// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:106:5: ( ^( '=' ID optionValue ) )
			// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:106:9: ^( '=' ID optionValue )
			{
				match(input,71,FOLLOW_71_in_option383); 

				match(input, Token.DOWN, null); 
				match(input,ID,FOLLOW_ID_in_option385); 
				pushFollow(FOLLOW_optionValue_in_option387);
				optionValue();

				state._fsp--;


				match(input, Token.UP, null); 

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
		}
		return retval;
	}
	// $ANTLR end "option"

	public static class optionValue_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};

	// $ANTLR start "optionValue"
	// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:109:1: optionValue : ( ID | STRING_LITERAL | CHAR_LITERAL | INT );
	public final G2Ge.optionValue_return optionValue() throws RecognitionException {
		G2Ge.optionValue_return retval = new G2Ge.optionValue_return();
		retval.start = input.LT(1);

		try {
			// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:110:5: ( ID | STRING_LITERAL | CHAR_LITERAL | INT )
			// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:
			{
				if ( input.LA(1)==ID||(input.LA(1)>=STRING_LITERAL && input.LA(1)<=CHAR_LITERAL)||input.LA(1)==INT ) {
					input.consume();
					state.errorRecovery=false;
				}
				else {
					MismatchedSetException mse = new MismatchedSetException(null,input);
					throw mse;
				}


			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
		}
		return retval;
	}
	// $ANTLR end "optionValue"

	protected static class rule_scope {
		int deep;
		String name;
		boolean existsReturn;
		boolean mainRule;
	}
	protected Stack rule_stack = new Stack();

	public static class rule_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};

	// $ANTLR start "rule"
	// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:116:1: rule : ^( RULE ID ( modifier )? ( ^( ARG ARG_ACTION ) )? ( ^( RET ret_param ) )? ( optionsSpec )? ( ruleScopeSpec )? ( ruleAction )* altList ( exceptionGroup )? EOR ) -> normalRule(assign=sol);
	public final G2Ge.rule_return rule() throws RecognitionException {
		rule_stack.push(new rule_scope());
		G2Ge.rule_return retval = new G2Ge.rule_return();
		retval.start = input.LT(1);

		CommonTree ID1=null;


		((rule_scope)rule_stack.peek()).deep = 0;
		((rule_scope)rule_stack.peek()).existsReturn = false;

		try {
			// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:127:2: ( ^( RULE ID ( modifier )? ( ^( ARG ARG_ACTION ) )? ( ^( RET ret_param ) )? ( optionsSpec )? ( ruleScopeSpec )? ( ruleAction )* altList ( exceptionGroup )? EOR ) -> normalRule(assign=sol))
			// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:127:4: ^( RULE ID ( modifier )? ( ^( ARG ARG_ACTION ) )? ( ^( RET ret_param ) )? ( optionsSpec )? ( ruleScopeSpec )? ( ruleAction )* altList ( exceptionGroup )? EOR )
			{
				match(input,RULE,FOLLOW_RULE_in_rule462); 

				match(input, Token.DOWN, null); 
				ID1=(CommonTree)match(input,ID,FOLLOW_ID_in_rule464); 
				((rule_scope)rule_stack.peek()).name = (ID1!=null?ID1.getText():null); 
				// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:127:43: ( modifier )?
				int alt11=2;
				int LA11_0 = input.LA(1);

				if ( (LA11_0==FRAGMENT||(LA11_0>=75 && LA11_0<=77)) ) {
					alt11=1;
				}
				switch (alt11) {
				case 1 :
					// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:127:43: modifier
				{
					pushFollow(FOLLOW_modifier_in_rule468);
					modifier();

					state._fsp--;


				}
				break;

				}

				// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:127:53: ( ^( ARG ARG_ACTION ) )?
				int alt12=2;
				int LA12_0 = input.LA(1);

				if ( (LA12_0==ARG) ) {
					alt12=1;
				}
				switch (alt12) {
				case 1 :
					// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:127:54: ^( ARG ARG_ACTION )
				{
					match(input,ARG,FOLLOW_ARG_in_rule473); 

					match(input, Token.DOWN, null); 
					match(input,ARG_ACTION,FOLLOW_ARG_ACTION_in_rule475); 

					match(input, Token.UP, null); 

				}
				break;

				}

				// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:127:74: ( ^( RET ret_param ) )?
				int alt13=2;
				int LA13_0 = input.LA(1);

				if ( (LA13_0==RET) ) {
					alt13=1;
				}
				switch (alt13) {
				case 1 :
					// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:127:75: ^( RET ret_param )
				{
					match(input,RET,FOLLOW_RET_in_rule482); 

					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_ret_param_in_rule484);
					ret_param();

					state._fsp--;


					match(input, Token.UP, null); 

				}
				break;

				}

				// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:128:9: ( optionsSpec )?
				int alt14=2;
				int LA14_0 = input.LA(1);

				if ( (LA14_0==OPTIONS) ) {
					alt14=1;
				}
				switch (alt14) {
				case 1 :
					// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:128:9: optionsSpec
				{
					pushFollow(FOLLOW_optionsSpec_in_rule497);
					optionsSpec();

					state._fsp--;


				}
				break;

				}

				// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:128:22: ( ruleScopeSpec )?
				int alt15=2;
				int LA15_0 = input.LA(1);

				if ( (LA15_0==SCOPE) ) {
					alt15=1;
				}
				switch (alt15) {
				case 1 :
					// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:128:22: ruleScopeSpec
				{
					pushFollow(FOLLOW_ruleScopeSpec_in_rule500);
					ruleScopeSpec();

					state._fsp--;


				}
				break;

				}

				// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:128:37: ( ruleAction )*
				loop16:
					do {
						int alt16=2;
						int LA16_0 = input.LA(1);

						if ( (LA16_0==72) ) {
							alt16=1;
						}


						switch (alt16) {
						case 1 :
							// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:128:37: ruleAction
						{
							pushFollow(FOLLOW_ruleAction_in_rule503);
							ruleAction();

							state._fsp--;


						}
						break;

						default :
							break loop16;
						}
					} while (true);

				pushFollow(FOLLOW_altList_in_rule514);
				altList();

				state._fsp--;

				// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:130:9: ( exceptionGroup )?
				int alt17=2;
				int LA17_0 = input.LA(1);

				if ( ((LA17_0>=85 && LA17_0<=86)) ) {
					alt17=1;
				}
				switch (alt17) {
				case 1 :
					// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:130:9: exceptionGroup
				{
					pushFollow(FOLLOW_exceptionGroup_in_rule524);
					exceptionGroup();

					state._fsp--;


				}
				break;

				}

				match(input,EOR,FOLLOW_EOR_in_rule527); 

				match(input, Token.UP, null); 

				String sol = input.getTokenStream().toString(
						input.getTreeAdaptor().getTokenStartIndex(retval.start),
						input.getTreeAdaptor().getTokenStopIndex(retval.start));
				if(!((rule_scope)rule_stack.peek()).existsReturn && ANTLRUtil.isParserRule(((rule_scope)rule_stack.peek()).name)) {
					sol = ANTLRUtil.insertReturn(input.getTokenStream().toString(
							input.getTreeAdaptor().getTokenStartIndex(retval.start),
							input.getTreeAdaptor().getTokenStopIndex(retval.start)));
					((rule_scope)rule_stack.peek()).existsReturn = true;
				}
				if(!existsHeader) { 
					sol = ANTLRUtil.addHeader(sol);
					existsHeader = true;
				} 
				mainRule = false;



				// TEMPLATE REWRITE
				// 144:7: -> normalRule(assign=sol)
				{
					retval.st = templateLib.getInstanceOf("normalRule",
							new STAttrMap().put("assign", sol));
				}

				((TokenRewriteStream)input.getTokenStream()).replace(
						input.getTreeAdaptor().getTokenStartIndex(retval.start),
						input.getTreeAdaptor().getTokenStopIndex(retval.start),
						retval.st);
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			rule_stack.pop();
		}
		return retval;
	}
	// $ANTLR end "rule"

	public static class ret_param_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};

	// $ANTLR start "ret_param"
	// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:147:1: ret_param : ARG_ACTION -> normalRule(assign=sol);
	public final G2Ge.ret_param_return ret_param() throws RecognitionException {
		G2Ge.ret_param_return retval = new G2Ge.ret_param_return();
		retval.start = input.LT(1);

		try {
			// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:148:2: ( ARG_ACTION -> normalRule(assign=sol))
			// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:148:5: ARG_ACTION
			{
				match(input,ARG_ACTION,FOLLOW_ARG_ACTION_in_ret_param572); 

				((rule_scope)rule_stack.peek()).existsReturn = true; 
				String sol = ANTLRUtil.insertReturnIntoReturn(input.getTokenStream().toString(
						input.getTreeAdaptor().getTokenStartIndex(retval.start),
						input.getTreeAdaptor().getTokenStopIndex(retval.start)));



				// TEMPLATE REWRITE
				// 153:3: -> normalRule(assign=sol)
				{
					retval.st = templateLib.getInstanceOf("normalRule",
							new STAttrMap().put("assign", sol));
				}

				((TokenRewriteStream)input.getTokenStream()).replace(
						input.getTreeAdaptor().getTokenStartIndex(retval.start),
						input.getTreeAdaptor().getTokenStopIndex(retval.start),
						retval.st);
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
		}
		return retval;
	}
	// $ANTLR end "ret_param"

	public static class modifier_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};

	// $ANTLR start "modifier"
	// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:156:1: modifier : ( 'protected' | 'public' | 'private' | 'fragment' );
	public final G2Ge.modifier_return modifier() throws RecognitionException {
		G2Ge.modifier_return retval = new G2Ge.modifier_return();
		retval.start = input.LT(1);

		try {
			// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:157:2: ( 'protected' | 'public' | 'private' | 'fragment' )
			// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:
			{
				if ( input.LA(1)==FRAGMENT||(input.LA(1)>=75 && input.LA(1)<=77) ) {
					input.consume();
					state.errorRecovery=false;
				}
				else {
					MismatchedSetException mse = new MismatchedSetException(null,input);
					throw mse;
				}


			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
		}
		return retval;
	}
	// $ANTLR end "modifier"

	public static class ruleAction_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};

	// $ANTLR start "ruleAction"
	// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:160:1: ruleAction : ^( '@' ID ACTION ) ;
	public final G2Ge.ruleAction_return ruleAction() throws RecognitionException {
		G2Ge.ruleAction_return retval = new G2Ge.ruleAction_return();
		retval.start = input.LT(1);

		try {
			// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:162:2: ( ^( '@' ID ACTION ) )
			// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:162:4: ^( '@' ID ACTION )
			{
				match(input,72,FOLLOW_72_in_ruleAction619); 

				match(input, Token.DOWN, null); 
				match(input,ID,FOLLOW_ID_in_ruleAction621); 
				match(input,ACTION,FOLLOW_ACTION_in_ruleAction623); 

				match(input, Token.UP, null); 

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
		}
		return retval;
	}
	// $ANTLR end "ruleAction"

	public static class throwsSpec_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};

	// $ANTLR start "throwsSpec"
	// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:165:1: throwsSpec : ^( 'throws' ( ID )+ ) ;
	public final G2Ge.throwsSpec_return throwsSpec() throws RecognitionException {
		G2Ge.throwsSpec_return retval = new G2Ge.throwsSpec_return();
		retval.start = input.LT(1);

		try {
			// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:166:2: ( ^( 'throws' ( ID )+ ) )
			// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:166:4: ^( 'throws' ( ID )+ )
			{
				match(input,80,FOLLOW_80_in_throwsSpec636); 

				match(input, Token.DOWN, null); 
				// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:166:15: ( ID )+
				int cnt18=0;
				loop18:
					do {
						int alt18=2;
						int LA18_0 = input.LA(1);

						if ( (LA18_0==ID) ) {
							alt18=1;
						}


						switch (alt18) {
						case 1 :
							// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:166:15: ID
						{
							match(input,ID,FOLLOW_ID_in_throwsSpec638); 

						}
						break;

						default :
							if ( cnt18 >= 1 ) break loop18;
							EarlyExitException eee =
								new EarlyExitException(18, input);
							throw eee;
						}
						cnt18++;
					} while (true);


				match(input, Token.UP, null); 

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
		}
		return retval;
	}
	// $ANTLR end "throwsSpec"

	public static class ruleScopeSpec_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};

	// $ANTLR start "ruleScopeSpec"
	// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:169:1: ruleScopeSpec : ( ^( 'scope' ACTION ) | ^( 'scope' ACTION ( ID )+ ) | ^( 'scope' ( ID )+ ) );
	public final G2Ge.ruleScopeSpec_return ruleScopeSpec() throws RecognitionException {
		G2Ge.ruleScopeSpec_return retval = new G2Ge.ruleScopeSpec_return();
		retval.start = input.LT(1);

		try {
			// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:170:2: ( ^( 'scope' ACTION ) | ^( 'scope' ACTION ( ID )+ ) | ^( 'scope' ( ID )+ ) )
			int alt21=3;
			int LA21_0 = input.LA(1);

			if ( (LA21_0==SCOPE) ) {
				int LA21_1 = input.LA(2);

				if ( (LA21_1==DOWN) ) {
					int LA21_2 = input.LA(3);

					if ( (LA21_2==ACTION) ) {
						int LA21_3 = input.LA(4);

						if ( (LA21_3==UP) ) {
							alt21=1;
						}
						else if ( (LA21_3==ID) ) {
							alt21=2;
						}
						else {
							NoViableAltException nvae =
								new NoViableAltException("", 21, 3, input);

							throw nvae;
						}
					}
					else if ( (LA21_2==ID) ) {
						alt21=3;
					}
					else {
						NoViableAltException nvae =
							new NoViableAltException("", 21, 2, input);

						throw nvae;
					}
				}
				else {
					NoViableAltException nvae =
						new NoViableAltException("", 21, 1, input);

					throw nvae;
				}
			}
			else {
				NoViableAltException nvae =
					new NoViableAltException("", 21, 0, input);

				throw nvae;
			}
			switch (alt21) {
			case 1 :
				// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:170:4: ^( 'scope' ACTION )
			{
				match(input,SCOPE,FOLLOW_SCOPE_in_ruleScopeSpec653); 

				match(input, Token.DOWN, null); 
				match(input,ACTION,FOLLOW_ACTION_in_ruleScopeSpec655); 

				match(input, Token.UP, null); 

			}
			break;
			case 2 :
				// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:171:4: ^( 'scope' ACTION ( ID )+ )
			{
				match(input,SCOPE,FOLLOW_SCOPE_in_ruleScopeSpec662); 

				match(input, Token.DOWN, null); 
				match(input,ACTION,FOLLOW_ACTION_in_ruleScopeSpec664); 
				// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:171:21: ( ID )+
				int cnt19=0;
				loop19:
					do {
						int alt19=2;
						int LA19_0 = input.LA(1);

						if ( (LA19_0==ID) ) {
							alt19=1;
						}


						switch (alt19) {
						case 1 :
							// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:171:21: ID
							{
								match(input,ID,FOLLOW_ID_in_ruleScopeSpec666); 

							}
							break;

						default :
							if ( cnt19 >= 1 ) break loop19;
							EarlyExitException eee =
								new EarlyExitException(19, input);
							throw eee;
						}
						cnt19++;
					} while (true);


				match(input, Token.UP, null); 

			}
			break;
			case 3 :
				// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:172:4: ^( 'scope' ( ID )+ )
			{
				match(input,SCOPE,FOLLOW_SCOPE_in_ruleScopeSpec674); 

				match(input, Token.DOWN, null); 
				// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:172:14: ( ID )+
				int cnt20=0;
				loop20:
					do {
						int alt20=2;
						int LA20_0 = input.LA(1);

						if ( (LA20_0==ID) ) {
							alt20=1;
						}


						switch (alt20) {
						case 1 :
							// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:172:14: ID
							{
								match(input,ID,FOLLOW_ID_in_ruleScopeSpec676); 

							}
							break;

						default :
							if ( cnt20 >= 1 ) break loop20;
							EarlyExitException eee =
								new EarlyExitException(20, input);
							throw eee;
						}
						cnt20++;
					} while (true);


				match(input, Token.UP, null); 

			}
			break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
		}
		return retval;
	}
	// $ANTLR end "ruleScopeSpec"

	public static class block_return extends TreeRuleReturnScope {
		public List units;
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};

	// $ANTLR start "block"
	// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:175:1: block[boolean inClosure] returns [List units] : ^( BLOCK ( optionsSpec )? (a+= alternative[inClosure] )+ EOB ) ;
	public final G2Ge.block_return block(boolean inClosure) throws RecognitionException {
		G2Ge.block_return retval = new G2Ge.block_return();
		retval.start = input.LT(1);

		List list_a=null;
		RuleReturnScope a = null;
		try {
			// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:176:5: ( ^( BLOCK ( optionsSpec )? (a+= alternative[inClosure] )+ EOB ) )
			// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:176:9: ^( BLOCK ( optionsSpec )? (a+= alternative[inClosure] )+ EOB )
			{
				match(input,BLOCK,FOLLOW_BLOCK_in_block701); 

				match(input, Token.DOWN, null); 
				// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:176:18: ( optionsSpec )?
				int alt22=2;
				int LA22_0 = input.LA(1);

				if ( (LA22_0==OPTIONS) ) {
					alt22=1;
				}
				switch (alt22) {
				case 1 :
					// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:176:18: optionsSpec
				{
					pushFollow(FOLLOW_optionsSpec_in_block703);
					optionsSpec();

					state._fsp--;


				}
				break;

				}

				((rule_scope)rule_stack.peek()).deep++;
				// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:176:49: (a+= alternative[inClosure] )+
				int cnt23=0;
				loop23:
					do {
						int alt23=2;
						int LA23_0 = input.LA(1);

						if ( (LA23_0==ALT) ) {
							alt23=1;
						}


						switch (alt23) {
						case 1 :
							// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:176:49: a+= alternative[inClosure]
						{
							pushFollow(FOLLOW_alternative_in_block710);
							a=alternative(inClosure);

							state._fsp--;

							if (list_a==null) list_a=new ArrayList();
							list_a.add(a);


						}
						break;

						default :
							if ( cnt23 >= 1 ) break loop23;
							EarlyExitException eee =
								new EarlyExitException(23, input);
							throw eee;
						}
						cnt23++;
					} while (true);

				((rule_scope)rule_stack.peek()).deep--;
				match(input,EOB,FOLLOW_EOB_in_block716); 

				match(input, Token.UP, null); 

				retval.units = list_a;


			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
		}
		return retval;
	}
	// $ANTLR end "block"

	public static class altList_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};

	// $ANTLR start "altList"
	// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:182:1: altList : ^( BLOCK ( alternative[false] )+ EOB ) ;
	public final G2Ge.altList_return altList() throws RecognitionException {
		G2Ge.altList_return retval = new G2Ge.altList_return();
		retval.start = input.LT(1);

		try {
			// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:183:5: ( ^( BLOCK ( alternative[false] )+ EOB ) )
			// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:183:9: ^( BLOCK ( alternative[false] )+ EOB )
			{
				match(input,BLOCK,FOLLOW_BLOCK_in_altList749); 

				((rule_scope)rule_stack.peek()).deep++; 

				match(input, Token.DOWN, null); 
				// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:183:36: ( alternative[false] )+
				int cnt24=0;
				loop24:
					do {
						int alt24=2;
						int LA24_0 = input.LA(1);

						if ( (LA24_0==ALT) ) {
							alt24=1;
						}


						switch (alt24) {
						case 1 :
							// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:183:37: alternative[false]
						{
							pushFollow(FOLLOW_alternative_in_altList754);
							alternative(false);

							state._fsp--;


						}
						break;

						default :
							if ( cnt24 >= 1 ) break loop24;
							EarlyExitException eee =
								new EarlyExitException(24, input);
							throw eee;
						}
						cnt24++;
					} while (true);

				match(input,EOB,FOLLOW_EOB_in_altList759); 

				match(input, Token.UP, null); 

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
		}
		return retval;
	}
	// $ANTLR end "altList"

	public static class alternative_return extends TreeRuleReturnScope {
		public List units;
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};

	// $ANTLR start "alternative"
	// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:186:1: alternative[boolean inClosure] returns [List units] : ( ^( ALT (e+= element[inClosure] )+ EOA ) -> {($rule::deep == 1) && (ANTLRUtil.isParserRule($rule::name))}? rewriteRule(assign=$textlist=sol) -> normalRule(assign=$text) | ^( ALT EPSILON EOA ) );
	public final G2Ge.alternative_return alternative(boolean inClosure) throws RecognitionException {
		G2Ge.alternative_return retval = new G2Ge.alternative_return();
		retval.start = input.LT(1);

		List list_e=null;
		RuleReturnScope e = null;

		if(((rule_scope)rule_stack.peek()).deep == 1) ANTLRUtil.initIds();

		try {
			// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:190:5: ( ^( ALT (e+= element[inClosure] )+ EOA ) -> {($rule::deep == 1) && (ANTLRUtil.isParserRule($rule::name))}? rewriteRule(assign=$textlist=sol) -> normalRule(assign=$text) | ^( ALT EPSILON EOA ) )
			int alt26=2;
			int LA26_0 = input.LA(1);

			if ( (LA26_0==ALT) ) {
				int LA26_1 = input.LA(2);

				if ( (LA26_1==DOWN) ) {
					int LA26_2 = input.LA(3);

					if ( (LA26_2==EPSILON) ) {
						alt26=2;
					}
					else if ( ((LA26_2>=BLOCK && LA26_2<=SYNPRED)||LA26_2==CHAR_RANGE||(LA26_2>=SEMPRED && LA26_2<=SYN_SEMPRED)||(LA26_2>=TREE_BEGIN && LA26_2<=BANG)||(LA26_2>=TOKEN_REF && LA26_2<=ACTION)||LA26_2==RULE_REF||LA26_2==71||LA26_2==87||LA26_2==89||LA26_2==92) ) {
						alt26=1;
					}
					else {
						NoViableAltException nvae =
							new NoViableAltException("", 26, 2, input);

						throw nvae;
					}
				}
				else {
					NoViableAltException nvae =
						new NoViableAltException("", 26, 1, input);

					throw nvae;
				}
			}
			else {
				NoViableAltException nvae =
					new NoViableAltException("", 26, 0, input);

				throw nvae;
			}
			switch (alt26) {
			case 1 :
				// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:190:9: ^( ALT (e+= element[inClosure] )+ EOA )
			{
				match(input,ALT,FOLLOW_ALT_in_alternative792); 

				match(input, Token.DOWN, null); 
				// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:190:16: (e+= element[inClosure] )+
				int cnt25=0;
				loop25:
					do {
						int alt25=2;
						int LA25_0 = input.LA(1);

						if ( ((LA25_0>=BLOCK && LA25_0<=SYNPRED)||LA25_0==CHAR_RANGE||(LA25_0>=SEMPRED && LA25_0<=SYN_SEMPRED)||(LA25_0>=TREE_BEGIN && LA25_0<=BANG)||(LA25_0>=TOKEN_REF && LA25_0<=ACTION)||LA25_0==RULE_REF||LA25_0==71||LA25_0==87||LA25_0==89||LA25_0==92) ) {
							alt25=1;
						}


						switch (alt25) {
						case 1 :
							// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:190:16: e+= element[inClosure]
							                                                                                        {
							                                                                                        	pushFollow(FOLLOW_element_in_alternative796);
							                                                                                        	e=element(inClosure);

							                                                                                        	state._fsp--;

							                                                                                        	if (list_e==null) list_e=new ArrayList();
							                                                                                        	list_e.add(e);


							                                                                                        }
							                                                                                        break;

						default :
							if ( cnt25 >= 1 ) break loop25;
							EarlyExitException eee =
								new EarlyExitException(25, input);
							throw eee;
						}
						cnt25++;
					} while (true);

				match(input,EOA,FOLLOW_EOA_in_alternative800); 

				match(input, Token.UP, null); 

				String sol = ""; 
				if(((rule_scope)rule_stack.peek()).deep == 1)  { sol = ANTLRUtil.createRewriteRule(((rule_scope)rule_stack.peek()).name, list_e, mainRule); }
				retval.units = list_e; 



				// TEMPLATE REWRITE
				// 196:6: -> {($rule::deep == 1) && (ANTLRUtil.isParserRule($rule::name))}? rewriteRule(assign=$textlist=sol)
				if ((((rule_scope)rule_stack.peek()).deep == 1) && (ANTLRUtil.isParserRule(((rule_scope)rule_stack.peek()).name))) {
					retval.st = templateLib.getInstanceOf("rewriteRule",
							new STAttrMap().put("assign", input.getTokenStream().toString(
									input.getTreeAdaptor().getTokenStartIndex(retval.start),
									input.getTreeAdaptor().getTokenStopIndex(retval.start))).put("list", sol));
				}
				else // 197:6: -> normalRule(assign=$text)
				{
					retval.st = templateLib.getInstanceOf("normalRule",
							new STAttrMap().put("assign", input.getTokenStream().toString(
									input.getTreeAdaptor().getTokenStartIndex(retval.start),
									input.getTreeAdaptor().getTokenStopIndex(retval.start))));
				}

				// JavierCanovas: I had to include this IF
				int start = input.getTreeAdaptor().getTokenStartIndex(retval.start);
				int end = input.getTreeAdaptor().getTokenStartIndex(retval.start);
				if(start != -1 || end != -1){                    
					((TokenRewriteStream)input.getTokenStream()).replace(
							input.getTreeAdaptor().getTokenStartIndex(retval.start),
							input.getTreeAdaptor().getTokenStopIndex(retval.start),
							retval.st);
				}
			}
			break;
			case 2 :
				// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:198:9: ^( ALT EPSILON EOA )
			{
				match(input,ALT,FOLLOW_ALT_in_alternative864); 

				match(input, Token.DOWN, null); 
				match(input,EPSILON,FOLLOW_EPSILON_in_alternative866); 
				match(input,EOA,FOLLOW_EOA_in_alternative868); 

				match(input, Token.UP, null); 

			}
			break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
		}
		return retval;
	}
	// $ANTLR end "alternative"

	public static class exceptionGroup_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};

	// $ANTLR start "exceptionGroup"
	// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:201:1: exceptionGroup : ( ( exceptionHandler )+ ( finallyClause )? | finallyClause );
	public final G2Ge.exceptionGroup_return exceptionGroup() throws RecognitionException {
		G2Ge.exceptionGroup_return retval = new G2Ge.exceptionGroup_return();
		retval.start = input.LT(1);

		try {
			// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:202:2: ( ( exceptionHandler )+ ( finallyClause )? | finallyClause )
			int alt29=2;
			int LA29_0 = input.LA(1);

			if ( (LA29_0==85) ) {
				alt29=1;
			}
			else if ( (LA29_0==86) ) {
				alt29=2;
			}
			else {
				NoViableAltException nvae =
					new NoViableAltException("", 29, 0, input);

				throw nvae;
			}
			switch (alt29) {
			case 1 :
				// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:202:4: ( exceptionHandler )+ ( finallyClause )?
			{
				// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:202:4: ( exceptionHandler )+
				int cnt27=0;
				loop27:
					do {
						int alt27=2;
						int LA27_0 = input.LA(1);

						if ( (LA27_0==85) ) {
							alt27=1;
						}


						switch (alt27) {
						case 1 :
							// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:202:4: exceptionHandler
							{
								pushFollow(FOLLOW_exceptionHandler_in_exceptionGroup883);
								exceptionHandler();

								state._fsp--;


							}
							break;

						default :
							if ( cnt27 >= 1 ) break loop27;
							EarlyExitException eee =
								new EarlyExitException(27, input);
							throw eee;
						}
						cnt27++;
					} while (true);

				// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:202:22: ( finallyClause )?
				int alt28=2;
				int LA28_0 = input.LA(1);

				if ( (LA28_0==86) ) {
					alt28=1;
				}
				switch (alt28) {
				case 1 :
					// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:202:22: finallyClause
				{
					pushFollow(FOLLOW_finallyClause_in_exceptionGroup886);
					finallyClause();

					state._fsp--;


				}
				break;

				}


			}
			break;
			case 2 :
				// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:203:4: finallyClause
			{
				pushFollow(FOLLOW_finallyClause_in_exceptionGroup892);
				finallyClause();

				state._fsp--;


			}
			break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
		}
		return retval;
	}
	// $ANTLR end "exceptionGroup"

	public static class exceptionHandler_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};

	// $ANTLR start "exceptionHandler"
	// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:206:1: exceptionHandler : ^( 'catch' ARG_ACTION ACTION ) ;
	public final G2Ge.exceptionHandler_return exceptionHandler() throws RecognitionException {
		G2Ge.exceptionHandler_return retval = new G2Ge.exceptionHandler_return();
		retval.start = input.LT(1);

		try {
			// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:207:5: ( ^( 'catch' ARG_ACTION ACTION ) )
			// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:207:10: ^( 'catch' ARG_ACTION ACTION )
			{
				match(input,85,FOLLOW_85_in_exceptionHandler913); 

				match(input, Token.DOWN, null); 
				match(input,ARG_ACTION,FOLLOW_ARG_ACTION_in_exceptionHandler915); 
				match(input,ACTION,FOLLOW_ACTION_in_exceptionHandler917); 

				match(input, Token.UP, null); 

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
		}
		return retval;
	}
	// $ANTLR end "exceptionHandler"

	public static class finallyClause_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};

	// $ANTLR start "finallyClause"
	// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:210:1: finallyClause : ^( 'finally' ACTION ) ;
	public final G2Ge.finallyClause_return finallyClause() throws RecognitionException {
		G2Ge.finallyClause_return retval = new G2Ge.finallyClause_return();
		retval.start = input.LT(1);

		try {
			// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:211:5: ( ^( 'finally' ACTION ) )
			// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:211:10: ^( 'finally' ACTION )
			{
				match(input,86,FOLLOW_86_in_finallyClause940); 

				match(input, Token.DOWN, null); 
				match(input,ACTION,FOLLOW_ACTION_in_finallyClause942); 

				match(input, Token.UP, null); 

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
		}
		return retval;
	}
	// $ANTLR end "finallyClause"

	public static class element_return extends TreeRuleReturnScope {
		public String id;
		public String type;
		public String content;
		public int pos;
		public int line;
		public List complex;
		public boolean aggregation;
		public boolean autoId;
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};

	// $ANTLR start "element"
	// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:214:1: element[boolean inClosure] returns [String id, String type, String content, int pos, int line, List complex, boolean aggregation, boolean autoId] : elementNoOptionSpec[inClosure] ;
	public final G2Ge.element_return element(boolean inClosure) throws RecognitionException {
		G2Ge.element_return retval = new G2Ge.element_return();
		retval.start = input.LT(1);

		G2Ge.elementNoOptionSpec_return elementNoOptionSpec2 = null;


		try {
			// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:215:2: ( elementNoOptionSpec[inClosure] )
			// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:215:4: elementNoOptionSpec[inClosure]
			{
				pushFollow(FOLLOW_elementNoOptionSpec_in_element962);
				elementNoOptionSpec2=elementNoOptionSpec(inClosure);

				state._fsp--;


				retval.id = (elementNoOptionSpec2!=null?elementNoOptionSpec2.id:null);		
				retval.type = (elementNoOptionSpec2!=null?elementNoOptionSpec2.type:null);	
				retval.content = (elementNoOptionSpec2!=null?elementNoOptionSpec2.content:null);	
				retval.pos = (elementNoOptionSpec2!=null?elementNoOptionSpec2.pos:0);	
				retval.line = (elementNoOptionSpec2!=null?elementNoOptionSpec2.line:0);	
				retval.complex = (elementNoOptionSpec2!=null?elementNoOptionSpec2.complex:null);	
				retval.aggregation = (elementNoOptionSpec2!=null?elementNoOptionSpec2.aggregation:false);	
				retval.autoId = (elementNoOptionSpec2!=null?elementNoOptionSpec2.autoId:false);	


			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
		}
		return retval;
	}
	// $ANTLR end "element"

	public static class elementNoOptionSpec_return extends TreeRuleReturnScope {
		public String id;
		public String type;
		public String content;
		public int pos;
		public int line;
		public List complex;
		public boolean aggregation;
		public boolean autoId;
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};

	// $ANTLR start "elementNoOptionSpec"
	// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:228:1: elementNoOptionSpec[boolean inClosure] returns [String id, String type, String content, int pos, int line, List complex, boolean aggregation, boolean autoId] : ( ^( ( '=' | '+=' ) i= ID b= block[inClosure] ) -> normalRule(assign=sol) | ^( (t1= '=' | t2= '+=' ) i= ID atom[true, false] ) -> {inClosure && $atom.type == GrammarElement.TERMINAL}? insertIdAggregation(id=$i.textrule=$atom.contain) -> normalRule(assign=sol) | a= atom[false, inClosure] | e= ebnf | ac= ACTION | SEMPRED | GATED_SEMPRED | treeSpec );
	public final G2Ge.elementNoOptionSpec_return elementNoOptionSpec(boolean inClosure) throws RecognitionException {
		G2Ge.elementNoOptionSpec_return retval = new G2Ge.elementNoOptionSpec_return();
		retval.start = input.LT(1);

		CommonTree i=null;
		CommonTree t1=null;
		CommonTree t2=null;
		CommonTree ac=null;
		G2Ge.block_return b = null;

		G2Ge.atom_return a = null;

		G2Ge.ebnf_return e = null;

		G2Ge.atom_return atom3 = null;



		retval.complex = null;
		retval.autoId = false;	
		retval.aggregation = false;

		try {
			// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:234:2: ( ^( ( '=' | '+=' ) i= ID b= block[inClosure] ) -> normalRule(assign=sol) | ^( (t1= '=' | t2= '+=' ) i= ID atom[true, false] ) -> {inClosure && $atom.type == GrammarElement.TERMINAL}? insertIdAggregation(id=$i.textrule=$atom.contain) -> normalRule(assign=sol) | a= atom[false, inClosure] | e= ebnf | ac= ACTION | SEMPRED | GATED_SEMPRED | treeSpec )
			int alt32=8;
			alt32 = dfa32.predict(input);
			switch (alt32) {
			case 1 :
				// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:234:4: ^( ( '=' | '+=' ) i= ID b= block[inClosure] )
			{
				// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:234:6: ( '=' | '+=' )
				int alt30=2;
				int LA30_0 = input.LA(1);

				if ( (LA30_0==71) ) {
					alt30=1;
				}
				else if ( (LA30_0==87) ) {
					alt30=2;
				}
				else {
					NoViableAltException nvae =
						new NoViableAltException("", 30, 0, input);

					throw nvae;
				}
				switch (alt30) {
				case 1 :
					// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:234:7: '='
				{
					match(input,71,FOLLOW_71_in_elementNoOptionSpec990); 

				}
				break;
				case 2 :
					// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:234:11: '+='
				{
					match(input,87,FOLLOW_87_in_elementNoOptionSpec992); 

				}
				break;

				}


				match(input, Token.DOWN, null); 
				i=(CommonTree)match(input,ID,FOLLOW_ID_in_elementNoOptionSpec997); 
				pushFollow(FOLLOW_block_in_elementNoOptionSpec1001);
				b=block(inClosure);

				state._fsp--;


				match(input, Token.UP, null); 

				retval.id = (i!=null?i.getText():null);		
				retval.type = GrammarElement.PREFIX;	
				retval.content = GrammarElement.PREFIX;	
				retval.complex = (b!=null?b.units:null);	
				retval.aggregation = true;	
				retval.autoId = false;	

				String sol = ANTLRUtil.correctAssign(null, input.getTokenStream().toString(
						input.getTreeAdaptor().getTokenStartIndex(retval.start),
						input.getTreeAdaptor().getTokenStopIndex(retval.start)));



				// TEMPLATE REWRITE
				// 245:3: -> normalRule(assign=sol)
				{
					retval.st = templateLib.getInstanceOf("normalRule",
							new STAttrMap().put("assign", sol));
				}

				((TokenRewriteStream)input.getTokenStream()).replace(
						input.getTreeAdaptor().getTokenStartIndex(retval.start),
						input.getTreeAdaptor().getTokenStopIndex(retval.start),
						retval.st);
			}
			break;
			case 2 :
				// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:246:4: ^( (t1= '=' | t2= '+=' ) i= ID atom[true, false] )
			{
				// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:246:6: (t1= '=' | t2= '+=' )
				int alt31=2;
				int LA31_0 = input.LA(1);

				if ( (LA31_0==71) ) {
					alt31=1;
				}
				else if ( (LA31_0==87) ) {
					alt31=2;
				}
				else {
					NoViableAltException nvae =
						new NoViableAltException("", 31, 0, input);

					throw nvae;
				}
				switch (alt31) {
				case 1 :
					// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:246:7: t1= '='
				{
					t1=(CommonTree)match(input,71,FOLLOW_71_in_elementNoOptionSpec1029); 

				}
				break;
				case 2 :
					// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:246:14: t2= '+='
				{
					t2=(CommonTree)match(input,87,FOLLOW_87_in_elementNoOptionSpec1033); 

				}
				break;

				}


				match(input, Token.DOWN, null); 
				i=(CommonTree)match(input,ID,FOLLOW_ID_in_elementNoOptionSpec1038); 
				pushFollow(FOLLOW_atom_in_elementNoOptionSpec1040);
				atom3=atom(true, false);

				state._fsp--;


				match(input, Token.UP, null); 

				retval.id = (i!=null?i.getText():null); 		
				retval.type = (atom3!=null?atom3.type:null);	
				if((inClosure && (atom3!=null?atom3.type:null) == GrammarElement.TERMINAL) || ((atom3!=null?atom3.type:null) == GrammarElement.RULE)) retval.aggregation = true;
				else retval.aggregation = false;
				retval.content = (atom3!=null?(input.getTokenStream().toString(
						input.getTreeAdaptor().getTokenStartIndex(atom3.start),
						input.getTreeAdaptor().getTokenStopIndex(atom3.start))):null);
				retval.pos = (atom3!=null?((CommonTree)atom3.start):null).token.getCharPositionInLine();
				retval.line = (atom3!=null?((CommonTree)atom3.start):null).token.getLine();
				retval.autoId = false;	

				String sol = ANTLRUtil.correctAssign((atom3!=null?atom3.type:null), input.getTokenStream().toString(
						input.getTreeAdaptor().getTokenStartIndex(retval.start),
						input.getTreeAdaptor().getTokenStopIndex(retval.start)));



				// TEMPLATE REWRITE
				// 259:3: -> {inClosure && $atom.type == GrammarElement.TERMINAL}? insertIdAggregation(id=$i.textrule=$atom.contain)
						if (inClosure && (atom3!=null?atom3.type:null) == GrammarElement.TERMINAL) {
							retval.st = templateLib.getInstanceOf("insertIdAggregation",
									new STAttrMap().put("id", (i!=null?i.getText():null)).put("rule", (atom3!=null?atom3.contain:null)));
						}
						else // 260:6: -> normalRule(assign=sol)
						{
							retval.st = templateLib.getInstanceOf("normalRule",
									new STAttrMap().put("assign", sol));
						}

						((TokenRewriteStream)input.getTokenStream()).replace(
								input.getTreeAdaptor().getTokenStartIndex(retval.start),
								input.getTreeAdaptor().getTokenStopIndex(retval.start),
								retval.st);
			}
			break;
			case 3 :
				// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:261:4: a= atom[false, inClosure]
			{
				pushFollow(FOLLOW_atom_in_elementNoOptionSpec1086);
				a=atom(false, inClosure);

				state._fsp--;


				retval.id = (a!=null?a.id:null);		
				retval.type = (a!=null?a.type:null);	
				retval.content = (a!=null?a.contain:null);	
				retval.pos = (a!=null?((CommonTree)a.start):null).token.getCharPositionInLine();
				retval.line = (a!=null?((CommonTree)a.start):null).token.getLine();
				retval.autoId = true;	
				retval.aggregation = (a!=null?a.aggregation:false);


			}
			break;
			case 4 :
				// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:271:4: e= ebnf
			{
				pushFollow(FOLLOW_ebnf_in_elementNoOptionSpec1098);
				e=ebnf();

				state._fsp--;


				retval.id = GrammarElement.EBNF;	 	
				retval.type = GrammarElement.EBNF;	
				retval.content = (e!=null?e.suffix:null);	
				retval.complex = (e!=null?e.complex:null);	
				retval.pos = (e!=null?((CommonTree)e.start):null).token.getCharPositionInLine();
				retval.line = (e!=null?((CommonTree)e.start):null).token.getLine();


			}
			break;
			case 5 :
				// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:280:6: ac= ACTION
			{
				ac=(CommonTree)match(input,ACTION,FOLLOW_ACTION_in_elementNoOptionSpec1113); 

				retval.id = GrammarElement.ACTION;		
				retval.type = GrammarElement.ACTION;	
				retval.content = (ac!=null?ac.getText():null);	


			}
			break;
			case 6 :
				// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:286:6: SEMPRED
			{
				match(input,SEMPRED,FOLLOW_SEMPRED_in_elementNoOptionSpec1126); 

			}
			break;
			case 7 :
				// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:287:4: GATED_SEMPRED
			{
				match(input,GATED_SEMPRED,FOLLOW_GATED_SEMPRED_in_elementNoOptionSpec1132); 

			}
			break;
			case 8 :
				// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:288:6: treeSpec
			{
				pushFollow(FOLLOW_treeSpec_in_elementNoOptionSpec1140);
				treeSpec();

				state._fsp--;


			}
			break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
		}
		return retval;
	}
	// $ANTLR end "elementNoOptionSpec"

	public static class atom_return extends TreeRuleReturnScope {
		public String id;
		public String contain;
		public String type;
		public boolean aggregation;
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};

	// $ANTLR start "atom"
	// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:291:1: atom[boolean inAssignment, boolean inClosure] returns [String id, String contain, String type, boolean aggregation] : ( ^( ( '^' | '!' ) atom[false, false] ) -> normalRule(assign=newText) | range | notSet | ^( RULE_REF ARG_ACTION ) | r= RULE_REF -> {!inAssignment && ANTLRUtil.isParserRule($rule::name)}? insertIdAggregation(id=newIdrule=$text) -> normalRule(assign=$text) | t= terminal[inAssignment, inClosure] );
	public final G2Ge.atom_return atom(boolean inAssignment, boolean inClosure) throws RecognitionException {
		G2Ge.atom_return retval = new G2Ge.atom_return();
		retval.start = input.LT(1);

		CommonTree r=null;
		G2Ge.terminal_return t = null;



		retval.id = GrammarElement.TOKEN;
		retval.aggregation = false;

		try {
			// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:296:2: ( ^( ( '^' | '!' ) atom[false, false] ) -> normalRule(assign=newText) | range | notSet | ^( RULE_REF ARG_ACTION ) | r= RULE_REF -> {!inAssignment && ANTLRUtil.isParserRule($rule::name)}? insertIdAggregation(id=newIdrule=$text) -> normalRule(assign=$text) | t= terminal[inAssignment, inClosure] )
			int alt34=6;
			switch ( input.LA(1) ) {
			case ROOT:
			case BANG:
			{
				alt34=1;
			}
			break;
			case CHAR_RANGE:
			{
				alt34=2;
			}
			break;
			case 89:
			{
				alt34=3;
			}
			break;
			case RULE_REF:
			{
				int LA34_4 = input.LA(2);

				if ( (LA34_4==DOWN) ) {
					alt34=4;
				}
				else if ( (LA34_4==UP||(LA34_4>=BLOCK && LA34_4<=SYNPRED)||LA34_4==CHAR_RANGE||LA34_4==EOA||(LA34_4>=SEMPRED && LA34_4<=SYN_SEMPRED)||(LA34_4>=TREE_BEGIN && LA34_4<=BANG)||(LA34_4>=TOKEN_REF && LA34_4<=ACTION)||LA34_4==RULE_REF||LA34_4==71||LA34_4==87||LA34_4==89||LA34_4==92) ) {
					alt34=5;
				}
				else {
					NoViableAltException nvae =
						new NoViableAltException("", 34, 4, input);

					throw nvae;
				}
			}
			break;
			case TOKEN_REF:
			case STRING_LITERAL:
			case CHAR_LITERAL:
			case 92:
			{
				alt34=6;
			}
			break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 34, 0, input);

				throw nvae;
			}

			switch (alt34) {
			case 1 :
				// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:296:6: ^( ( '^' | '!' ) atom[false, false] )
			{
				// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:296:8: ( '^' | '!' )
				int alt33=2;
				int LA33_0 = input.LA(1);

				if ( (LA33_0==ROOT) ) {
					alt33=1;
				}
				else if ( (LA33_0==BANG) ) {
					alt33=2;
				}
				else {
					NoViableAltException nvae =
						new NoViableAltException("", 33, 0, input);

					throw nvae;
				}
				switch (alt33) {
				case 1 :
					// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:296:9: '^'
				{
					match(input,ROOT,FOLLOW_ROOT_in_atom1166); 

				}
				break;
				case 2 :
					// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:296:13: '!'
				{
					match(input,BANG,FOLLOW_BANG_in_atom1168); 

				}
				break;

				}


				match(input, Token.DOWN, null); 
				pushFollow(FOLLOW_atom_in_atom1171);
				atom(false, false);

				state._fsp--;


				match(input, Token.UP, null); 

				String newText = ANTLRUtil.removeASTCharacters(input.getTokenStream().toString(
						input.getTreeAdaptor().getTokenStartIndex(retval.start),
						input.getTreeAdaptor().getTokenStopIndex(retval.start)));		



				// TEMPLATE REWRITE
				// 300:3: -> normalRule(assign=newText)
				{
					retval.st = templateLib.getInstanceOf("normalRule",
							new STAttrMap().put("assign", newText));
				}

				((TokenRewriteStream)input.getTokenStream()).replace(
						input.getTreeAdaptor().getTokenStartIndex(retval.start),
						input.getTreeAdaptor().getTokenStopIndex(retval.start),
						retval.st);
			}
			break;
			case 2 :
				// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:301:4: range
			{
				pushFollow(FOLLOW_range_in_atom1193);
				range();

				state._fsp--;


			}
			break;
			case 3 :
				// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:302:4: notSet
			{
				pushFollow(FOLLOW_notSet_in_atom1198);
				notSet();

				state._fsp--;


			}
			break;
			case 4 :
				// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:303:7: ^( RULE_REF ARG_ACTION )
			{
				match(input,RULE_REF,FOLLOW_RULE_REF_in_atom1207); 

				match(input, Token.DOWN, null); 
				match(input,ARG_ACTION,FOLLOW_ARG_ACTION_in_atom1209); 

				match(input, Token.UP, null); 

			}
			break;
			case 5 :
				// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:304:7: r= RULE_REF
			{
				r=(CommonTree)match(input,RULE_REF,FOLLOW_RULE_REF_in_atom1220); 

				String newId = "";
				if(!inAssignment && ANTLRUtil.isParserRule(((rule_scope)rule_stack.peek()).name)) {
					newId = ANTLRUtil.createId((r!=null?r.getText():null));
					retval.id = newId;
					retval.aggregation = true;
				}
				retval.type = GrammarElement.RULE; 
				retval.contain = (r!=null?r.getText():null); 



				// TEMPLATE REWRITE
				// 315:6: -> {!inAssignment && ANTLRUtil.isParserRule($rule::name)}? insertIdAggregation(id=newIdrule=$text)
						if (!inAssignment && ANTLRUtil.isParserRule(((rule_scope)rule_stack.peek()).name)) {
							retval.st = templateLib.getInstanceOf("insertIdAggregation",
									new STAttrMap().put("id", newId).put("rule", input.getTokenStream().toString(
											input.getTreeAdaptor().getTokenStartIndex(retval.start),
											input.getTreeAdaptor().getTokenStopIndex(retval.start))));
						}
						else // 316:6: -> normalRule(assign=$text)
						{
							retval.st = templateLib.getInstanceOf("normalRule",
									new STAttrMap().put("assign", input.getTokenStream().toString(
											input.getTreeAdaptor().getTokenStartIndex(retval.start),
											input.getTreeAdaptor().getTokenStopIndex(retval.start))));
						}

						((TokenRewriteStream)input.getTokenStream()).replace(
								input.getTreeAdaptor().getTokenStartIndex(retval.start),
								input.getTreeAdaptor().getTokenStopIndex(retval.start),
								retval.st);
			}
			break;
			case 6 :
				// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:317:9: t= terminal[inAssignment, inClosure]
			{
				pushFollow(FOLLOW_terminal_in_atom1275);
				t=terminal(inAssignment, inClosure);

				state._fsp--;


				retval.id = (t!=null?t.id:null);
				retval.type = GrammarElement.TERMINAL; 
				retval.contain = (t!=null?t.contain:null); 
				retval.aggregation = (t!=null?t.aggregation:false);


			}
			break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
		}
		return retval;
	}
	// $ANTLR end "atom"

	public static class notSet_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};

	// $ANTLR start "notSet"
	// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:326:1: notSet : ( ^( '~' notTerminal ) | ^( '~' block[false] ) );
	public final G2Ge.notSet_return notSet() throws RecognitionException {
		G2Ge.notSet_return retval = new G2Ge.notSet_return();
		retval.start = input.LT(1);

		try {
			// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:327:2: ( ^( '~' notTerminal ) | ^( '~' block[false] ) )
			int alt35=2;
			int LA35_0 = input.LA(1);

			if ( (LA35_0==89) ) {
				int LA35_1 = input.LA(2);

				if ( (LA35_1==DOWN) ) {
					int LA35_2 = input.LA(3);

					if ( (LA35_2==BLOCK) ) {
						alt35=2;
					}
					else if ( ((LA35_2>=TOKEN_REF && LA35_2<=CHAR_LITERAL)) ) {
						alt35=1;
					}
					else {
						NoViableAltException nvae =
							new NoViableAltException("", 35, 2, input);

						throw nvae;
					}
				}
				else {
					NoViableAltException nvae =
						new NoViableAltException("", 35, 1, input);

					throw nvae;
				}
			}
			else {
				NoViableAltException nvae =
					new NoViableAltException("", 35, 0, input);

				throw nvae;
			}
			switch (alt35) {
			case 1 :
				// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:327:4: ^( '~' notTerminal )
			{
				match(input,89,FOLLOW_89_in_notSet1298); 

				match(input, Token.DOWN, null); 
				pushFollow(FOLLOW_notTerminal_in_notSet1300);
				notTerminal();

				state._fsp--;


				match(input, Token.UP, null); 

			}
			break;
			case 2 :
				// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:328:4: ^( '~' block[false] )
			{
				match(input,89,FOLLOW_89_in_notSet1307); 

				match(input, Token.DOWN, null); 
				pushFollow(FOLLOW_block_in_notSet1309);
				block(false);

				state._fsp--;


				match(input, Token.UP, null); 

			}
			break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
		}
		return retval;
	}
	// $ANTLR end "notSet"

	public static class treeSpec_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};

	// $ANTLR start "treeSpec"
	// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:331:1: treeSpec : ^( TREE_BEGIN ( element[false] )+ ) ;
	public final G2Ge.treeSpec_return treeSpec() throws RecognitionException {
		G2Ge.treeSpec_return retval = new G2Ge.treeSpec_return();
		retval.start = input.LT(1);

		try {
			// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:332:2: ( ^( TREE_BEGIN ( element[false] )+ ) )
			// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:332:4: ^( TREE_BEGIN ( element[false] )+ )
			{
				match(input,TREE_BEGIN,FOLLOW_TREE_BEGIN_in_treeSpec1323); 

				match(input, Token.DOWN, null); 
				// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:332:17: ( element[false] )+
				int cnt36=0;
				loop36:
					do {
						int alt36=2;
						int LA36_0 = input.LA(1);

						if ( ((LA36_0>=BLOCK && LA36_0<=SYNPRED)||LA36_0==CHAR_RANGE||(LA36_0>=SEMPRED && LA36_0<=SYN_SEMPRED)||(LA36_0>=TREE_BEGIN && LA36_0<=BANG)||(LA36_0>=TOKEN_REF && LA36_0<=ACTION)||LA36_0==RULE_REF||LA36_0==71||LA36_0==87||LA36_0==89||LA36_0==92) ) {
							alt36=1;
						}


						switch (alt36) {
						case 1 :
							// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:332:17: element[false]
						{
							pushFollow(FOLLOW_element_in_treeSpec1325);
							element(false);

							state._fsp--;


						}
						break;

						default :
							if ( cnt36 >= 1 ) break loop36;
							EarlyExitException eee =
								new EarlyExitException(36, input);
							throw eee;
						}
						cnt36++;
					} while (true);


				match(input, Token.UP, null); 

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
		}
		return retval;
	}
	// $ANTLR end "treeSpec"

	public static class ebnf_return extends TreeRuleReturnScope {
		public List complex;
		public String suffix;
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};

	// $ANTLR start "ebnf"
	// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:335:1: ebnf returns [List complex, String suffix] : ( ^( SYNPRED b= block[false] ) | SYN_SEMPRED | ^(s= ebnfSuffix b= block[$s.isAggregation] ) | b= block[false] );
	public final G2Ge.ebnf_return ebnf() throws RecognitionException {
		G2Ge.ebnf_return retval = new G2Ge.ebnf_return();
		retval.start = input.LT(1);

		G2Ge.block_return b = null;

		G2Ge.ebnfSuffix_return s = null;


		try {
			// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:337:2: ( ^( SYNPRED b= block[false] ) | SYN_SEMPRED | ^(s= ebnfSuffix b= block[$s.isAggregation] ) | b= block[false] )
			int alt37=4;
			switch ( input.LA(1) ) {
			case SYNPRED:
			{
				alt37=1;
			}
			break;
			case SYN_SEMPRED:
			{
				alt37=2;
			}
			break;
			case OPTIONAL:
			case CLOSURE:
			case POSITIVE_CLOSURE:
			{
				alt37=3;
			}
			break;
			case BLOCK:
			{
				alt37=4;
			}
			break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 37, 0, input);

				throw nvae;
			}

			switch (alt37) {
			case 1 :
				// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:337:4: ^( SYNPRED b= block[false] )
				{
					match(input,SYNPRED,FOLLOW_SYNPRED_in_ebnf1347); 

					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_block_in_ebnf1351);
					b=block(false);

					state._fsp--;


					match(input, Token.UP, null); 

					retval.complex = (b!=null?b.units:null);


				}
				break;
			case 2 :
				// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:341:4: SYN_SEMPRED
			{
				match(input,SYN_SEMPRED,FOLLOW_SYN_SEMPRED_in_ebnf1363); 

			}
			break;
			case 3 :
				// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:342:4: ^(s= ebnfSuffix b= block[$s.isAggregation] )
			{
				pushFollow(FOLLOW_ebnfSuffix_in_ebnf1372);
				s=ebnfSuffix();

				state._fsp--;


				match(input, Token.DOWN, null); 
				pushFollow(FOLLOW_block_in_ebnf1376);
				b=block((s!=null?s.isAggregation:false));

				state._fsp--;


				match(input, Token.UP, null); 

				retval.complex = (b!=null?b.units:null);
				retval.suffix = (s!=null?s.suffix:null);


			}
			break;
			case 4 :
				// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:347:4: b= block[false]
			{
				pushFollow(FOLLOW_block_in_ebnf1390);
				b=block(false);

				state._fsp--;


				retval.complex = (b!=null?b.units:null);
				retval.suffix = GrammarElement.ALTERNATIVE;


			}
			break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
		}
		return retval;
	}
	// $ANTLR end "ebnf"

	public static class range_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};

	// $ANTLR start "range"
	// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:354:1: range : ^( CHAR_RANGE CHAR_LITERAL CHAR_LITERAL ) ;
	public final G2Ge.range_return range() throws RecognitionException {
		G2Ge.range_return retval = new G2Ge.range_return();
		retval.start = input.LT(1);

		try {
			// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:355:2: ( ^( CHAR_RANGE CHAR_LITERAL CHAR_LITERAL ) )
			// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:355:4: ^( CHAR_RANGE CHAR_LITERAL CHAR_LITERAL )
			{
				match(input,CHAR_RANGE,FOLLOW_CHAR_RANGE_in_range1407); 

				match(input, Token.DOWN, null); 
				match(input,CHAR_LITERAL,FOLLOW_CHAR_LITERAL_in_range1409); 
				match(input,CHAR_LITERAL,FOLLOW_CHAR_LITERAL_in_range1411); 

				match(input, Token.UP, null); 

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
		}
		return retval;
	}
	// $ANTLR end "range"

	public static class terminal_return extends TreeRuleReturnScope {
		public String id;
		public String contain;
		public boolean aggregation;
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};

	// $ANTLR start "terminal"
	// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:358:1: terminal[boolean inAssignment, boolean inClosure] returns [String id, String contain, boolean aggregation] : (c= CHAR_LITERAL -> {!inAssignment && ANTLRUtil.isParserRule($rule::name)}? insertId(id=newIdrule=$text) -> normalRule(assign=$text) | t= TOKEN_REF -> {!inAssignment && ANTLRUtil.isParserRule($rule::name) && !inClosure}? insertId(id=newIdrule=$text) -> {!inAssignment && ANTLRUtil.isParserRule($rule::name) && inClosure}? insertIdAggregation(id=newIdrule=$text) -> normalRule(assign=$text) | s= STRING_LITERAL -> {!inAssignment && ANTLRUtil.isParserRule($rule::name)}? insertId(id=newIdrule=$text) -> normalRule(assign=$text) | ^( TOKEN_REF ARG_ACTION ) | '.' );
	public final G2Ge.terminal_return terminal(boolean inAssignment, boolean inClosure) throws RecognitionException {
		G2Ge.terminal_return retval = new G2Ge.terminal_return();
		retval.start = input.LT(1);

		CommonTree c=null;
		CommonTree t=null;
		CommonTree s=null;


		retval.id = GrammarElement.TOKEN;
		retval.aggregation = false;

		try {
			// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:363:5: (c= CHAR_LITERAL -> {!inAssignment && ANTLRUtil.isParserRule($rule::name)}? insertId(id=newIdrule=$text) -> normalRule(assign=$text) | t= TOKEN_REF -> {!inAssignment && ANTLRUtil.isParserRule($rule::name) && !inClosure}? insertId(id=newIdrule=$text) -> {!inAssignment && ANTLRUtil.isParserRule($rule::name) && inClosure}? insertIdAggregation(id=newIdrule=$text) -> normalRule(assign=$text) | s= STRING_LITERAL -> {!inAssignment && ANTLRUtil.isParserRule($rule::name)}? insertId(id=newIdrule=$text) -> normalRule(assign=$text) | ^( TOKEN_REF ARG_ACTION ) | '.' )
			int alt38=5;
			switch ( input.LA(1) ) {
			case CHAR_LITERAL:
			{
				alt38=1;
			}
			break;
			case TOKEN_REF:
			{
				int LA38_2 = input.LA(2);

				if ( (LA38_2==DOWN) ) {
					alt38=4;
				}
				else if ( (LA38_2==UP||(LA38_2>=BLOCK && LA38_2<=SYNPRED)||LA38_2==CHAR_RANGE||LA38_2==EOA||(LA38_2>=SEMPRED && LA38_2<=SYN_SEMPRED)||(LA38_2>=TREE_BEGIN && LA38_2<=BANG)||(LA38_2>=TOKEN_REF && LA38_2<=ACTION)||LA38_2==RULE_REF||LA38_2==71||LA38_2==87||LA38_2==89||LA38_2==92) ) {
					alt38=2;
				}
				else {
					NoViableAltException nvae =
						new NoViableAltException("", 38, 2, input);

					throw nvae;
				}
			}
			break;
			case STRING_LITERAL:
			{
				alt38=3;
			}
			break;
			case 92:
			{
				alt38=5;
			}
			break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 38, 0, input);

				throw nvae;
			}

			switch (alt38) {
			case 1 :
				// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:363:9: c= CHAR_LITERAL
			{
				c=(CommonTree)match(input,CHAR_LITERAL,FOLLOW_CHAR_LITERAL_in_terminal1440); 

				String newId = "";
				if(!inAssignment && ANTLRUtil.isParserRule(((rule_scope)rule_stack.peek()).name)) {
					newId = ANTLRUtil.createTokenId();
					retval.id = newId;
				}
				retval.contain = input.getTokenStream().toString(
						input.getTreeAdaptor().getTokenStartIndex(retval.start),
						input.getTreeAdaptor().getTokenStopIndex(retval.start));



				// TEMPLATE REWRITE
				// 372:6: -> {!inAssignment && ANTLRUtil.isParserRule($rule::name)}? insertId(id=newIdrule=$text)
						if (!inAssignment && ANTLRUtil.isParserRule(((rule_scope)rule_stack.peek()).name)) {
							retval.st = templateLib.getInstanceOf("insertId",
									new STAttrMap().put("id", newId).put("rule", input.getTokenStream().toString(
											input.getTreeAdaptor().getTokenStartIndex(retval.start),
											input.getTreeAdaptor().getTokenStopIndex(retval.start))));
						}
						else // 373:6: -> normalRule(assign=$text)
						{
							retval.st = templateLib.getInstanceOf("normalRule",
									new STAttrMap().put("assign", input.getTokenStream().toString(
											input.getTreeAdaptor().getTokenStartIndex(retval.start),
											input.getTreeAdaptor().getTokenStopIndex(retval.start))));
						}

						((TokenRewriteStream)input.getTokenStream()).replace(
								input.getTreeAdaptor().getTokenStartIndex(retval.start),
								input.getTreeAdaptor().getTokenStopIndex(retval.start),
								retval.st);
			}
			break;
			case 2 :
				// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:374:7: t= TOKEN_REF
			{
				t=(CommonTree)match(input,TOKEN_REF,FOLLOW_TOKEN_REF_in_terminal1492); 

				String newId = "";
				if(!inAssignment && ANTLRUtil.isParserRule(((rule_scope)rule_stack.peek()).name)) {
					newId = ANTLRUtil.createId((t!=null?t.getText():null));
					retval.id = newId;
				}    		
				if(inClosure) {
					newId = newId + "_List";
					retval.id = newId;
					retval.aggregation = true;
				}
				retval.contain = input.getTokenStream().toString(
						input.getTreeAdaptor().getTokenStartIndex(retval.start),
						input.getTreeAdaptor().getTokenStopIndex(retval.start));



				// TEMPLATE REWRITE
				// 388:6: -> {!inAssignment && ANTLRUtil.isParserRule($rule::name) && !inClosure}? insertId(id=newIdrule=$text)
				if (!inAssignment && ANTLRUtil.isParserRule(((rule_scope)rule_stack.peek()).name) && !inClosure) {
					retval.st = templateLib.getInstanceOf("insertId",
							new STAttrMap().put("id", newId).put("rule", input.getTokenStream().toString(
									input.getTreeAdaptor().getTokenStartIndex(retval.start),
									input.getTreeAdaptor().getTokenStopIndex(retval.start))));
				}
				else // 389:6: -> {!inAssignment && ANTLRUtil.isParserRule($rule::name) && inClosure}? insertIdAggregation(id=newIdrule=$text)
					if (!inAssignment && ANTLRUtil.isParserRule(((rule_scope)rule_stack.peek()).name) && inClosure) {
						retval.st = templateLib.getInstanceOf("insertIdAggregation",
								new STAttrMap().put("id", newId).put("rule", input.getTokenStream().toString(
										input.getTreeAdaptor().getTokenStartIndex(retval.start),
										input.getTreeAdaptor().getTokenStopIndex(retval.start))));
					}
					else // 390:6: -> normalRule(assign=$text)
					{
						retval.st = templateLib.getInstanceOf("normalRule",
								new STAttrMap().put("assign", input.getTokenStream().toString(
										input.getTreeAdaptor().getTokenStartIndex(retval.start),
										input.getTreeAdaptor().getTokenStopIndex(retval.start))));
					}

				((TokenRewriteStream)input.getTokenStream()).replace(
						input.getTreeAdaptor().getTokenStartIndex(retval.start),
						input.getTreeAdaptor().getTokenStopIndex(retval.start),
						retval.st);
			}
			break;
			case 3 :
				// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:391:7: s= STRING_LITERAL
			{
				s=(CommonTree)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_terminal1565); 

				String newId = "";
				if(!inAssignment && ANTLRUtil.isParserRule(((rule_scope)rule_stack.peek()).name)) {
					newId = ANTLRUtil.createTokenId();
					retval.id = newId;
				}
				retval.contain = input.getTokenStream().toString(
						input.getTreeAdaptor().getTokenStartIndex(retval.start),
						input.getTreeAdaptor().getTokenStopIndex(retval.start));



				// TEMPLATE REWRITE
				// 400:6: -> {!inAssignment && ANTLRUtil.isParserRule($rule::name)}? insertId(id=newIdrule=$text)
						if (!inAssignment && ANTLRUtil.isParserRule(((rule_scope)rule_stack.peek()).name)) {
							retval.st = templateLib.getInstanceOf("insertId",
									new STAttrMap().put("id", newId).put("rule", input.getTokenStream().toString(
											input.getTreeAdaptor().getTokenStartIndex(retval.start),
											input.getTreeAdaptor().getTokenStopIndex(retval.start))));
						}
						else // 401:6: -> normalRule(assign=$text)
						{
							retval.st = templateLib.getInstanceOf("normalRule",
									new STAttrMap().put("assign", input.getTokenStream().toString(
											input.getTreeAdaptor().getTokenStartIndex(retval.start),
											input.getTreeAdaptor().getTokenStopIndex(retval.start))));
						}

						((TokenRewriteStream)input.getTokenStream()).replace(
								input.getTreeAdaptor().getTokenStartIndex(retval.start),
								input.getTreeAdaptor().getTokenStopIndex(retval.start),
								retval.st);
			}
			break;
			case 4 :
				// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:402:7: ^( TOKEN_REF ARG_ACTION )
			{
				match(input,TOKEN_REF,FOLLOW_TOKEN_REF_in_terminal1616); 

				match(input, Token.DOWN, null); 
				match(input,ARG_ACTION,FOLLOW_ARG_ACTION_in_terminal1618); 

				match(input, Token.UP, null); 

			}
			break;
			case 5 :
				// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:403:7: '.'
			{
				match(input,92,FOLLOW_92_in_terminal1627); 

			}
			break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
		}
		return retval;
	}
	// $ANTLR end "terminal"

	public static class notTerminal_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};

	// $ANTLR start "notTerminal"
	// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:406:1: notTerminal : ( CHAR_LITERAL | TOKEN_REF | STRING_LITERAL );
	public final G2Ge.notTerminal_return notTerminal() throws RecognitionException {
		G2Ge.notTerminal_return retval = new G2Ge.notTerminal_return();
		retval.start = input.LT(1);

		try {
			// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:407:2: ( CHAR_LITERAL | TOKEN_REF | STRING_LITERAL )
			// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:
			{
				if ( (input.LA(1)>=TOKEN_REF && input.LA(1)<=CHAR_LITERAL) ) {
					input.consume();
					state.errorRecovery=false;
				}
				else {
					MismatchedSetException mse = new MismatchedSetException(null,input);
					throw mse;
				}


			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
		}
		return retval;
	}
	// $ANTLR end "notTerminal"

	public static class ebnfSuffix_return extends TreeRuleReturnScope {
		public String suffix;
		public boolean isAggregation;
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};

	// $ANTLR start "ebnfSuffix"
	// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:412:1: ebnfSuffix returns [String suffix, boolean isAggregation] : ( OPTIONAL | CLOSURE | POSITIVE_CLOSURE );
	public final G2Ge.ebnfSuffix_return ebnfSuffix() throws RecognitionException {
		G2Ge.ebnfSuffix_return retval = new G2Ge.ebnfSuffix_return();
		retval.start = input.LT(1);

		try {
			// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:413:2: ( OPTIONAL | CLOSURE | POSITIVE_CLOSURE )
			int alt39=3;
			switch ( input.LA(1) ) {
			case OPTIONAL:
			{
				alt39=1;
			}
			break;
			case CLOSURE:
			{
				alt39=2;
			}
			break;
			case POSITIVE_CLOSURE:
			{
				alt39=3;
			}
			break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 39, 0, input);

				throw nvae;
			}

			switch (alt39) {
			case 1 :
				// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:413:4: OPTIONAL
				{
					match(input,OPTIONAL,FOLLOW_OPTIONAL_in_ebnfSuffix1666); 
					retval.suffix = GrammarElement.OPTIONAL; retval.isAggregation = false; 

				}
				break;
			case 2 :
				// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:414:6: CLOSURE
			{
				match(input,CLOSURE,FOLLOW_CLOSURE_in_ebnfSuffix1675); 
				retval.suffix = GrammarElement.CLOSURE; retval.isAggregation = true; 

			}
			break;
			case 3 :
				// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:415:7: POSITIVE_CLOSURE
			{
				match(input,POSITIVE_CLOSURE,FOLLOW_POSITIVE_CLOSURE_in_ebnfSuffix1685); 
				retval.suffix = GrammarElement.PCLOSURE; retval.isAggregation = false; 

			}
			break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
		}
		return retval;
	}
	// $ANTLR end "ebnfSuffix"

	public static class rewrite_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};

	// $ANTLR start "rewrite"
	// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:420:1: rewrite : ( ( ^( '->' SEMPRED rewrite_alternative ) )* ^( '->' rewrite_alternative ) | );
	public final G2Ge.rewrite_return rewrite() throws RecognitionException {
		G2Ge.rewrite_return retval = new G2Ge.rewrite_return();
		retval.start = input.LT(1);

		try {
			// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:421:2: ( ( ^( '->' SEMPRED rewrite_alternative ) )* ^( '->' rewrite_alternative ) | )
			int alt41=2;
			int LA41_0 = input.LA(1);

			if ( (LA41_0==REWRITE) ) {
				alt41=1;
			}
			else if ( (LA41_0==EOF) ) {
				alt41=2;
			}
			else {
				NoViableAltException nvae =
					new NoViableAltException("", 41, 0, input);

				throw nvae;
			}
			switch (alt41) {
			case 1 :
				// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:421:4: ( ^( '->' SEMPRED rewrite_alternative ) )* ^( '->' rewrite_alternative )
			{
				// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:421:4: ( ^( '->' SEMPRED rewrite_alternative ) )*
				loop40:
					do {
						int alt40=2;
						int LA40_0 = input.LA(1);

						if ( (LA40_0==REWRITE) ) {
							int LA40_1 = input.LA(2);

							if ( (LA40_1==DOWN) ) {
								int LA40_2 = input.LA(3);

								if ( (LA40_2==SEMPRED) ) {
									alt40=1;
								}


							}


						}


						switch (alt40) {
						case 1 :
							// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:421:5: ^( '->' SEMPRED rewrite_alternative )
							{
								match(input,REWRITE,FOLLOW_REWRITE_in_rewrite1703); 

								match(input, Token.DOWN, null); 
								match(input,SEMPRED,FOLLOW_SEMPRED_in_rewrite1705); 
								pushFollow(FOLLOW_rewrite_alternative_in_rewrite1707);
								rewrite_alternative();

								state._fsp--;


								match(input, Token.UP, null); 

							}
							break;

						default :
							break loop40;
						}
					} while (true);

			match(input,REWRITE,FOLLOW_REWRITE_in_rewrite1713); 

			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_rewrite_alternative_in_rewrite1715);
			rewrite_alternative();

			state._fsp--;


			match(input, Token.UP, null); 

			}
			break;
			case 2 :
				// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:423:2: 
			{
			}
			break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
		}
		return retval;
	}
	// $ANTLR end "rewrite"

	public static class rewrite_alternative_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};

	// $ANTLR start "rewrite_alternative"
	// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:425:1: rewrite_alternative : ( rewrite_template | rewrite_tree_alternative | ^( ALT EPSILON EOA ) );
	public final G2Ge.rewrite_alternative_return rewrite_alternative() throws RecognitionException {
		G2Ge.rewrite_alternative_return retval = new G2Ge.rewrite_alternative_return();
		retval.start = input.LT(1);

		try {
			// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:426:2: ( rewrite_template | rewrite_tree_alternative | ^( ALT EPSILON EOA ) )
			int alt42=3;
			int LA42_0 = input.LA(1);

			if ( (LA42_0==TEMPLATE||LA42_0==ACTION) ) {
				alt42=1;
			}
			else if ( (LA42_0==ALT) ) {
				int LA42_2 = input.LA(2);

				if ( (LA42_2==DOWN) ) {
					int LA42_3 = input.LA(3);

					if ( (LA42_3==EPSILON) ) {
						alt42=3;
					}
					else if ( ((LA42_3>=BLOCK && LA42_3<=POSITIVE_CLOSURE)||LA42_3==LABEL||LA42_3==TREE_BEGIN||(LA42_3>=TOKEN_REF && LA42_3<=ACTION)||LA42_3==RULE_REF) ) {
						alt42=2;
					}
					else {
						NoViableAltException nvae =
							new NoViableAltException("", 42, 3, input);

						throw nvae;
					}
				}
				else {
					NoViableAltException nvae =
						new NoViableAltException("", 42, 2, input);

					throw nvae;
				}
			}
			else {
				NoViableAltException nvae =
					new NoViableAltException("", 42, 0, input);

				throw nvae;
			}
			switch (alt42) {
			case 1 :
				// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:426:4: rewrite_template
			{
				pushFollow(FOLLOW_rewrite_template_in_rewrite_alternative1730);
				rewrite_template();

				state._fsp--;


			}
			break;
			case 2 :
				// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:427:4: rewrite_tree_alternative
			{
				pushFollow(FOLLOW_rewrite_tree_alternative_in_rewrite_alternative1735);
				rewrite_tree_alternative();

				state._fsp--;


			}
			break;
			case 3 :
				// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:428:9: ^( ALT EPSILON EOA )
			{
				match(input,ALT,FOLLOW_ALT_in_rewrite_alternative1746); 

				match(input, Token.DOWN, null); 
				match(input,EPSILON,FOLLOW_EPSILON_in_rewrite_alternative1748); 
				match(input,EOA,FOLLOW_EOA_in_rewrite_alternative1750); 

				match(input, Token.UP, null); 

			}
			break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
		}
		return retval;
	}
	// $ANTLR end "rewrite_alternative"

	public static class rewrite_template_block_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};

	// $ANTLR start "rewrite_template_block"
	// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:431:1: rewrite_template_block : ^( BLOCK rewrite_template EOB ) ;
	public final G2Ge.rewrite_template_block_return rewrite_template_block() throws RecognitionException {
		G2Ge.rewrite_template_block_return retval = new G2Ge.rewrite_template_block_return();
		retval.start = input.LT(1);

		try {
			// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:432:5: ( ^( BLOCK rewrite_template EOB ) )
			// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:432:9: ^( BLOCK rewrite_template EOB )
			{
				match(input,BLOCK,FOLLOW_BLOCK_in_rewrite_template_block1769); 

				match(input, Token.DOWN, null); 
				pushFollow(FOLLOW_rewrite_template_in_rewrite_template_block1771);
				rewrite_template();

				state._fsp--;

				match(input,EOB,FOLLOW_EOB_in_rewrite_template_block1773); 

				match(input, Token.UP, null); 

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
		}
		return retval;
	}
	// $ANTLR end "rewrite_template_block"

	public static class rewrite_tree_block_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};

	// $ANTLR start "rewrite_tree_block"
	// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:435:1: rewrite_tree_block : ^( BLOCK rewrite_tree_alternative EOB ) ;
	public final G2Ge.rewrite_tree_block_return rewrite_tree_block() throws RecognitionException {
		G2Ge.rewrite_tree_block_return retval = new G2Ge.rewrite_tree_block_return();
		retval.start = input.LT(1);

		try {
			// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:436:5: ( ^( BLOCK rewrite_tree_alternative EOB ) )
			// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:436:9: ^( BLOCK rewrite_tree_alternative EOB )
			{
				match(input,BLOCK,FOLLOW_BLOCK_in_rewrite_tree_block1794); 

				match(input, Token.DOWN, null); 
				pushFollow(FOLLOW_rewrite_tree_alternative_in_rewrite_tree_block1796);
				rewrite_tree_alternative();

				state._fsp--;

				match(input,EOB,FOLLOW_EOB_in_rewrite_tree_block1798); 

				match(input, Token.UP, null); 

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
		}
		return retval;
	}
	// $ANTLR end "rewrite_tree_block"

	public static class rewrite_tree_alternative_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};

	// $ANTLR start "rewrite_tree_alternative"
	// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:439:1: rewrite_tree_alternative : ^( ALT ( rewrite_tree_element )+ EOA ) ;
	public final G2Ge.rewrite_tree_alternative_return rewrite_tree_alternative() throws RecognitionException {
		G2Ge.rewrite_tree_alternative_return retval = new G2Ge.rewrite_tree_alternative_return();
		retval.start = input.LT(1);

		try {
			// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:440:5: ( ^( ALT ( rewrite_tree_element )+ EOA ) )
			// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:440:7: ^( ALT ( rewrite_tree_element )+ EOA )
			{
				match(input,ALT,FOLLOW_ALT_in_rewrite_tree_alternative1817); 

				match(input, Token.DOWN, null); 
				// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:440:13: ( rewrite_tree_element )+
				int cnt43=0;
				loop43:
					do {
						int alt43=2;
						int LA43_0 = input.LA(1);

						if ( ((LA43_0>=BLOCK && LA43_0<=POSITIVE_CLOSURE)||LA43_0==LABEL||LA43_0==TREE_BEGIN||(LA43_0>=TOKEN_REF && LA43_0<=ACTION)||LA43_0==RULE_REF) ) {
							alt43=1;
						}


						switch (alt43) {
						case 1 :
							// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:440:13: rewrite_tree_element
						{
							pushFollow(FOLLOW_rewrite_tree_element_in_rewrite_tree_alternative1819);
							rewrite_tree_element();

							state._fsp--;


						}
						break;

						default :
							if ( cnt43 >= 1 ) break loop43;
							EarlyExitException eee =
								new EarlyExitException(43, input);
							throw eee;
						}
						cnt43++;
					} while (true);

				match(input,EOA,FOLLOW_EOA_in_rewrite_tree_alternative1822); 

				match(input, Token.UP, null); 

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
		}
		return retval;
	}
	// $ANTLR end "rewrite_tree_alternative"

	public static class rewrite_tree_element_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};

	// $ANTLR start "rewrite_tree_element"
	// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:443:1: rewrite_tree_element : ( rewrite_tree_atom | rewrite_tree | rewrite_tree_block | rewrite_tree_ebnf );
	public final G2Ge.rewrite_tree_element_return rewrite_tree_element() throws RecognitionException {
		G2Ge.rewrite_tree_element_return retval = new G2Ge.rewrite_tree_element_return();
		retval.start = input.LT(1);

		try {
			// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:444:2: ( rewrite_tree_atom | rewrite_tree | rewrite_tree_block | rewrite_tree_ebnf )
			int alt44=4;
			switch ( input.LA(1) ) {
			case LABEL:
			case TOKEN_REF:
			case STRING_LITERAL:
			case CHAR_LITERAL:
			case ACTION:
			case RULE_REF:
			{
				alt44=1;
			}
			break;
			case TREE_BEGIN:
			{
				alt44=2;
			}
			break;
			case BLOCK:
			{
				alt44=3;
			}
			break;
			case OPTIONAL:
			case CLOSURE:
			case POSITIVE_CLOSURE:
			{
				alt44=4;
			}
			break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 44, 0, input);

				throw nvae;
			}

			switch (alt44) {
			case 1 :
				// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:444:4: rewrite_tree_atom
				{
					pushFollow(FOLLOW_rewrite_tree_atom_in_rewrite_tree_element1837);
					rewrite_tree_atom();

					state._fsp--;


				}
				break;
			case 2 :
				// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:445:4: rewrite_tree
			{
				pushFollow(FOLLOW_rewrite_tree_in_rewrite_tree_element1842);
				rewrite_tree();

				state._fsp--;


			}
			break;
			case 3 :
				// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:446:6: rewrite_tree_block
			{
				pushFollow(FOLLOW_rewrite_tree_block_in_rewrite_tree_element1849);
				rewrite_tree_block();

				state._fsp--;


			}
			break;
			case 4 :
				// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:447:6: rewrite_tree_ebnf
			{
				pushFollow(FOLLOW_rewrite_tree_ebnf_in_rewrite_tree_element1856);
				rewrite_tree_ebnf();

				state._fsp--;


			}
			break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
		}
		return retval;
	}
	// $ANTLR end "rewrite_tree_element"

	public static class rewrite_tree_atom_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};

	// $ANTLR start "rewrite_tree_atom"
	// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:450:1: rewrite_tree_atom : ( CHAR_LITERAL | TOKEN_REF | ^( TOKEN_REF ARG_ACTION ) | RULE_REF | STRING_LITERAL | LABEL | ACTION );
	public final G2Ge.rewrite_tree_atom_return rewrite_tree_atom() throws RecognitionException {
		G2Ge.rewrite_tree_atom_return retval = new G2Ge.rewrite_tree_atom_return();
		retval.start = input.LT(1);

		try {
			// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:451:5: ( CHAR_LITERAL | TOKEN_REF | ^( TOKEN_REF ARG_ACTION ) | RULE_REF | STRING_LITERAL | LABEL | ACTION )
			int alt45=7;
			switch ( input.LA(1) ) {
			case CHAR_LITERAL:
			{
				alt45=1;
			}
			break;
			case TOKEN_REF:
			{
				int LA45_2 = input.LA(2);

				if ( (LA45_2==DOWN) ) {
					alt45=3;
				}
				else if ( (LA45_2==UP||(LA45_2>=BLOCK && LA45_2<=POSITIVE_CLOSURE)||LA45_2==EOA||LA45_2==LABEL||LA45_2==TREE_BEGIN||(LA45_2>=TOKEN_REF && LA45_2<=ACTION)||LA45_2==RULE_REF) ) {
					alt45=2;
				}
				else {
					NoViableAltException nvae =
						new NoViableAltException("", 45, 2, input);

					throw nvae;
				}
			}
			break;
			case RULE_REF:
			{
				alt45=4;
			}
			break;
			case STRING_LITERAL:
			{
				alt45=5;
			}
			break;
			case LABEL:
			{
				alt45=6;
			}
			break;
			case ACTION:
			{
				alt45=7;
			}
			break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 45, 0, input);

				throw nvae;
			}

			switch (alt45) {
			case 1 :
				// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:451:9: CHAR_LITERAL
			{
				match(input,CHAR_LITERAL,FOLLOW_CHAR_LITERAL_in_rewrite_tree_atom1872); 

			}
			break;
			case 2 :
				// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:452:6: TOKEN_REF
			{
				match(input,TOKEN_REF,FOLLOW_TOKEN_REF_in_rewrite_tree_atom1879); 

			}
			break;
			case 3 :
				// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:453:6: ^( TOKEN_REF ARG_ACTION )
			{
				match(input,TOKEN_REF,FOLLOW_TOKEN_REF_in_rewrite_tree_atom1887); 

				match(input, Token.DOWN, null); 
				match(input,ARG_ACTION,FOLLOW_ARG_ACTION_in_rewrite_tree_atom1889); 

				match(input, Token.UP, null); 

			}
			break;
			case 4 :
				// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:454:9: RULE_REF
			{
				match(input,RULE_REF,FOLLOW_RULE_REF_in_rewrite_tree_atom1901); 

			}
			break;
			case 5 :
				// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:455:6: STRING_LITERAL
			{
				match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_rewrite_tree_atom1908); 

			}
			break;
			case 6 :
				// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:456:6: LABEL
			{
				match(input,LABEL,FOLLOW_LABEL_in_rewrite_tree_atom1915); 

			}
			break;
			case 7 :
				// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:457:4: ACTION
			{
				match(input,ACTION,FOLLOW_ACTION_in_rewrite_tree_atom1920); 

			}
			break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
		}
		return retval;
	}
	// $ANTLR end "rewrite_tree_atom"

	public static class rewrite_tree_ebnf_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};

	// $ANTLR start "rewrite_tree_ebnf"
	// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:460:1: rewrite_tree_ebnf : ^( ebnfSuffix rewrite_tree_block ) ;
	public final G2Ge.rewrite_tree_ebnf_return rewrite_tree_ebnf() throws RecognitionException {
		G2Ge.rewrite_tree_ebnf_return retval = new G2Ge.rewrite_tree_ebnf_return();
		retval.start = input.LT(1);

		try {
			// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:461:2: ( ^( ebnfSuffix rewrite_tree_block ) )
			// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:461:4: ^( ebnfSuffix rewrite_tree_block )
			{
				pushFollow(FOLLOW_ebnfSuffix_in_rewrite_tree_ebnf1932);
				ebnfSuffix();

				state._fsp--;


				match(input, Token.DOWN, null); 
				pushFollow(FOLLOW_rewrite_tree_block_in_rewrite_tree_ebnf1934);
				rewrite_tree_block();

				state._fsp--;


				match(input, Token.UP, null); 

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
		}
		return retval;
	}
	// $ANTLR end "rewrite_tree_ebnf"

	public static class rewrite_tree_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};

	// $ANTLR start "rewrite_tree"
	// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:464:1: rewrite_tree : ^( TREE_BEGIN rewrite_tree_atom ( rewrite_tree_element )* ) ;
	public final G2Ge.rewrite_tree_return rewrite_tree() throws RecognitionException {
		G2Ge.rewrite_tree_return retval = new G2Ge.rewrite_tree_return();
		retval.start = input.LT(1);

		try {
			// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:465:2: ( ^( TREE_BEGIN rewrite_tree_atom ( rewrite_tree_element )* ) )
			// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:465:4: ^( TREE_BEGIN rewrite_tree_atom ( rewrite_tree_element )* )
			{
				match(input,TREE_BEGIN,FOLLOW_TREE_BEGIN_in_rewrite_tree1948); 

				match(input, Token.DOWN, null); 
				pushFollow(FOLLOW_rewrite_tree_atom_in_rewrite_tree1950);
				rewrite_tree_atom();

				state._fsp--;

				// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:465:35: ( rewrite_tree_element )*
				loop46:
					do {
						int alt46=2;
						int LA46_0 = input.LA(1);

						if ( ((LA46_0>=BLOCK && LA46_0<=POSITIVE_CLOSURE)||LA46_0==LABEL||LA46_0==TREE_BEGIN||(LA46_0>=TOKEN_REF && LA46_0<=ACTION)||LA46_0==RULE_REF) ) {
							alt46=1;
						}


						switch (alt46) {
						case 1 :
							// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:465:35: rewrite_tree_element
						{
							pushFollow(FOLLOW_rewrite_tree_element_in_rewrite_tree1952);
							rewrite_tree_element();

							state._fsp--;


						}
						break;

						default :
							break loop46;
						}
					} while (true);


				match(input, Token.UP, null); 

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
		}
		return retval;
	}
	// $ANTLR end "rewrite_tree"

	public static class rewrite_template_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};

	// $ANTLR start "rewrite_template"
	// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:468:1: rewrite_template : ( ^( TEMPLATE ID rewrite_template_args ( DOUBLE_QUOTE_STRING_LITERAL | DOUBLE_ANGLE_STRING_LITERAL ) ) | rewrite_template_ref | rewrite_indirect_template_head | ACTION );
	public final G2Ge.rewrite_template_return rewrite_template() throws RecognitionException {
		G2Ge.rewrite_template_return retval = new G2Ge.rewrite_template_return();
		retval.start = input.LT(1);

		try {
			// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:469:2: ( ^( TEMPLATE ID rewrite_template_args ( DOUBLE_QUOTE_STRING_LITERAL | DOUBLE_ANGLE_STRING_LITERAL ) ) | rewrite_template_ref | rewrite_indirect_template_head | ACTION )
			int alt47=4;
			alt47 = dfa47.predict(input);
			switch (alt47) {
			case 1 :
				// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:469:6: ^( TEMPLATE ID rewrite_template_args ( DOUBLE_QUOTE_STRING_LITERAL | DOUBLE_ANGLE_STRING_LITERAL ) )
			{
				match(input,TEMPLATE,FOLLOW_TEMPLATE_in_rewrite_template1970); 

				match(input, Token.DOWN, null); 
				match(input,ID,FOLLOW_ID_in_rewrite_template1972); 
				pushFollow(FOLLOW_rewrite_template_args_in_rewrite_template1974);
				rewrite_template_args();

				state._fsp--;

				if ( (input.LA(1)>=DOUBLE_QUOTE_STRING_LITERAL && input.LA(1)<=DOUBLE_ANGLE_STRING_LITERAL) ) {
					input.consume();
					state.errorRecovery=false;
				}
				else {
					MismatchedSetException mse = new MismatchedSetException(null,input);
					throw mse;
				}


				match(input, Token.UP, null); 

			}
			break;
			case 2 :
				// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:472:4: rewrite_template_ref
			{
				pushFollow(FOLLOW_rewrite_template_ref_in_rewrite_template1997);
				rewrite_template_ref();

				state._fsp--;


			}
			break;
			case 3 :
				// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:473:4: rewrite_indirect_template_head
			{
				pushFollow(FOLLOW_rewrite_indirect_template_head_in_rewrite_template2002);
				rewrite_indirect_template_head();

				state._fsp--;


			}
			break;
			case 4 :
				// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:474:4: ACTION
			{
				match(input,ACTION,FOLLOW_ACTION_in_rewrite_template2007); 

			}
			break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
		}
		return retval;
	}
	// $ANTLR end "rewrite_template"

	public static class rewrite_template_ref_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};

	// $ANTLR start "rewrite_template_ref"
	// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:477:1: rewrite_template_ref : ^( TEMPLATE ID rewrite_template_args ) ;
	public final G2Ge.rewrite_template_ref_return rewrite_template_ref() throws RecognitionException {
		G2Ge.rewrite_template_ref_return retval = new G2Ge.rewrite_template_ref_return();
		retval.start = input.LT(1);

		try {
			// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:479:2: ( ^( TEMPLATE ID rewrite_template_args ) )
			// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:479:4: ^( TEMPLATE ID rewrite_template_args )
			{
				match(input,TEMPLATE,FOLLOW_TEMPLATE_in_rewrite_template_ref2021); 

				match(input, Token.DOWN, null); 
				match(input,ID,FOLLOW_ID_in_rewrite_template_ref2023); 
				pushFollow(FOLLOW_rewrite_template_args_in_rewrite_template_ref2025);
				rewrite_template_args();

				state._fsp--;


				match(input, Token.UP, null); 

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
		}
		return retval;
	}
	// $ANTLR end "rewrite_template_ref"

	public static class rewrite_indirect_template_head_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};

	// $ANTLR start "rewrite_indirect_template_head"
	// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:482:1: rewrite_indirect_template_head : ^( TEMPLATE ACTION rewrite_template_args ) ;
	public final G2Ge.rewrite_indirect_template_head_return rewrite_indirect_template_head() throws RecognitionException {
		G2Ge.rewrite_indirect_template_head_return retval = new G2Ge.rewrite_indirect_template_head_return();
		retval.start = input.LT(1);

		try {
			// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:484:2: ( ^( TEMPLATE ACTION rewrite_template_args ) )
			// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:484:4: ^( TEMPLATE ACTION rewrite_template_args )
			{
				match(input,TEMPLATE,FOLLOW_TEMPLATE_in_rewrite_indirect_template_head2041); 

				match(input, Token.DOWN, null); 
				match(input,ACTION,FOLLOW_ACTION_in_rewrite_indirect_template_head2043); 
				pushFollow(FOLLOW_rewrite_template_args_in_rewrite_indirect_template_head2045);
				rewrite_template_args();

				state._fsp--;


				match(input, Token.UP, null); 

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
		}
		return retval;
	}
	// $ANTLR end "rewrite_indirect_template_head"

	public static class rewrite_template_args_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};

	// $ANTLR start "rewrite_template_args"
	// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:487:1: rewrite_template_args : ( ^( ARGLIST ( rewrite_template_arg )+ ) | ARGLIST );
	public final G2Ge.rewrite_template_args_return rewrite_template_args() throws RecognitionException {
		G2Ge.rewrite_template_args_return retval = new G2Ge.rewrite_template_args_return();
		retval.start = input.LT(1);

		try {
			// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:488:2: ( ^( ARGLIST ( rewrite_template_arg )+ ) | ARGLIST )
			int alt49=2;
			int LA49_0 = input.LA(1);

			if ( (LA49_0==ARGLIST) ) {
				int LA49_1 = input.LA(2);

				if ( (LA49_1==DOWN) ) {
					alt49=1;
				}
				else if ( (LA49_1==UP||(LA49_1>=DOUBLE_QUOTE_STRING_LITERAL && LA49_1<=DOUBLE_ANGLE_STRING_LITERAL)) ) {
					alt49=2;
				}
				else {
					NoViableAltException nvae =
						new NoViableAltException("", 49, 1, input);

					throw nvae;
				}
			}
			else {
				NoViableAltException nvae =
					new NoViableAltException("", 49, 0, input);

				throw nvae;
			}
			switch (alt49) {
			case 1 :
				// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:488:4: ^( ARGLIST ( rewrite_template_arg )+ )
			{
				match(input,ARGLIST,FOLLOW_ARGLIST_in_rewrite_template_args2058); 

				match(input, Token.DOWN, null); 
				// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:488:14: ( rewrite_template_arg )+
				int cnt48=0;
				loop48:
					do {
						int alt48=2;
						int LA48_0 = input.LA(1);

						if ( (LA48_0==ARG) ) {
							alt48=1;
						}


						switch (alt48) {
						case 1 :
							// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:488:14: rewrite_template_arg
							{
								pushFollow(FOLLOW_rewrite_template_arg_in_rewrite_template_args2060);
								rewrite_template_arg();

								state._fsp--;


							}
							break;

						default :
							if ( cnt48 >= 1 ) break loop48;
							EarlyExitException eee =
								new EarlyExitException(48, input);
							throw eee;
						}
						cnt48++;
					} while (true);


				match(input, Token.UP, null); 

			}
			break;
			case 2 :
				// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:489:4: ARGLIST
			{
				match(input,ARGLIST,FOLLOW_ARGLIST_in_rewrite_template_args2067); 

			}
			break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
		}
		return retval;
	}
	// $ANTLR end "rewrite_template_args"

	public static class rewrite_template_arg_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};

	// $ANTLR start "rewrite_template_arg"
	// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:492:1: rewrite_template_arg : ^( ARG ID ACTION ) ;
	public final G2Ge.rewrite_template_arg_return rewrite_template_arg() throws RecognitionException {
		G2Ge.rewrite_template_arg_return retval = new G2Ge.rewrite_template_arg_return();
		retval.start = input.LT(1);

		try {
			// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:493:2: ( ^( ARG ID ACTION ) )
			// C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/G2Ge.g3:493:6: ^( ARG ID ACTION )
			{
				match(input,ARG,FOLLOW_ARG_in_rewrite_template_arg2081); 

				match(input, Token.DOWN, null); 
				match(input,ID,FOLLOW_ID_in_rewrite_template_arg2083); 
				match(input,ACTION,FOLLOW_ACTION_in_rewrite_template_arg2085); 

				match(input, Token.UP, null); 

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
		}
		return retval;
	}
	// $ANTLR end "rewrite_template_arg"

	// Delegated rules


	protected DFA32 dfa32 = new DFA32(this);
	protected DFA47 dfa47 = new DFA47(this);
	static final String DFA32_eotS =
		"\15\uffff";
	static final String DFA32_eofS =
		"\15\uffff";
	static final String DFA32_minS =
		"\1\10\2\2\6\uffff\1\24\1\10\2\uffff";
	static final String DFA32_maxS =
		"\1\134\2\2\6\uffff\1\24\1\134\2\uffff";
	static final String DFA32_acceptS =
		"\3\uffff\1\3\1\4\1\5\1\6\1\7\1\10\2\uffff\1\1\1\2";
	static final String DFA32_specialS =
		"\15\uffff}>";
	static final String[] DFA32_transitionS = {
		"\5\4\1\uffff\1\3\21\uffff\1\6\1\7\1\4\2\uffff\1\10\2\3\2\uffff"+
		"\3\3\1\5\3\uffff\1\3\25\uffff\1\1\17\uffff\1\2\1\uffff\1\3\2"+
		"\uffff\1\3",
		"\1\11",
		"\1\11",
		"",
		"",
		"",
		"",
		"",
		"",
		"\1\12",
		"\1\13\5\uffff\1\14\27\uffff\2\14\2\uffff\3\14\4\uffff\1\14"+
		"\47\uffff\1\14\2\uffff\1\14",
		"",
		""
	};

	static final short[] DFA32_eot = DFA.unpackEncodedString(DFA32_eotS);
	static final short[] DFA32_eof = DFA.unpackEncodedString(DFA32_eofS);
	static final char[] DFA32_min = DFA.unpackEncodedStringToUnsignedChars(DFA32_minS);
	static final char[] DFA32_max = DFA.unpackEncodedStringToUnsignedChars(DFA32_maxS);
	static final short[] DFA32_accept = DFA.unpackEncodedString(DFA32_acceptS);
	static final short[] DFA32_special = DFA.unpackEncodedString(DFA32_specialS);
	static final short[][] DFA32_transition;

	static {
		int numStates = DFA32_transitionS.length;
		DFA32_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA32_transition[i] = DFA.unpackEncodedString(DFA32_transitionS[i]);
		}
	}

	class DFA32 extends DFA {

		public DFA32(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 32;
			this.eot = DFA32_eot;
			this.eof = DFA32_eof;
			this.min = DFA32_min;
			this.max = DFA32_max;
			this.accept = DFA32_accept;
			this.special = DFA32_special;
			this.transition = DFA32_transition;
		}
		public String getDescription() {
			return "228:1: elementNoOptionSpec[boolean inClosure] returns [String id, String type, String content, int pos, int line, List complex, boolean aggregation, boolean autoId] : ( ^( ( '=' | '+=' ) i= ID b= block[inClosure] ) -> normalRule(assign=sol) | ^( (t1= '=' | t2= '+=' ) i= ID atom[true, false] ) -> {inClosure && $atom.type == GrammarElement.TERMINAL}? insertIdAggregation(id=$i.textrule=$atom.contain) -> normalRule(assign=sol) | a= atom[false, inClosure] | e= ebnf | ac= ACTION | SEMPRED | GATED_SEMPRED | treeSpec );";
		}
	}
	static final String DFA47_eotS =
		"\20\uffff";
	static final String DFA47_eofS =
		"\20\uffff";
	static final String DFA47_minS =
		"\1\36\1\2\1\uffff\1\24\1\26\1\uffff\1\2\1\25\2\uffff\1\2\1\24\1"+
		"\55\3\3";
	static final String DFA47_maxS =
		"\1\55\1\2\1\uffff\1\55\1\26\1\uffff\1\63\1\25\2\uffff\1\2\1\24"+
		"\1\55\1\3\1\25\1\63";
	static final String DFA47_acceptS =
		"\2\uffff\1\4\2\uffff\1\3\2\uffff\1\2\1\1\6\uffff";
	static final String DFA47_specialS =
		"\20\uffff}>";
	static final String[] DFA47_transitionS = {
		"\1\1\16\uffff\1\2",
		"\1\3",
		"",
		"\1\4\30\uffff\1\5",
		"\1\6",
		"",
		"\1\7\1\10\56\uffff\2\11",
		"\1\12",
		"",
		"",
		"\1\13",
		"\1\14",
		"\1\15",
		"\1\16",
		"\1\17\21\uffff\1\12",
		"\1\10\56\uffff\2\11"
	};

	static final short[] DFA47_eot = DFA.unpackEncodedString(DFA47_eotS);
	static final short[] DFA47_eof = DFA.unpackEncodedString(DFA47_eofS);
	static final char[] DFA47_min = DFA.unpackEncodedStringToUnsignedChars(DFA47_minS);
	static final char[] DFA47_max = DFA.unpackEncodedStringToUnsignedChars(DFA47_maxS);
	static final short[] DFA47_accept = DFA.unpackEncodedString(DFA47_acceptS);
	static final short[] DFA47_special = DFA.unpackEncodedString(DFA47_specialS);
	static final short[][] DFA47_transition;

	static {
		int numStates = DFA47_transitionS.length;
		DFA47_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA47_transition[i] = DFA.unpackEncodedString(DFA47_transitionS[i]);
		}
	}

	class DFA47 extends DFA {

		public DFA47(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 47;
			this.eot = DFA47_eot;
			this.eof = DFA47_eof;
			this.min = DFA47_min;
			this.max = DFA47_max;
			this.accept = DFA47_accept;
			this.special = DFA47_special;
			this.transition = DFA47_transition;
		}
		public String getDescription() {
			return "468:1: rewrite_template : ( ^( TEMPLATE ID rewrite_template_args ( DOUBLE_QUOTE_STRING_LITERAL | DOUBLE_ANGLE_STRING_LITERAL ) ) | rewrite_template_ref | rewrite_indirect_template_head | ACTION );";
		}
	}


	public static final BitSet FOLLOW_grammarType_in_grammarDef79 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_grammarDef83 = new BitSet(new long[]{0x0000420080000090L,0x0000000000000100L});
	public static final BitSet FOLLOW_DOC_COMMENT_in_grammarDef87 = new BitSet(new long[]{0x0000420080000090L,0x0000000000000100L});
	public static final BitSet FOLLOW_optionsSpec_in_grammarDef98 = new BitSet(new long[]{0x0000420080000090L,0x0000000000000100L});
	public static final BitSet FOLLOW_tokensSpec_in_grammarDef108 = new BitSet(new long[]{0x0000420080000090L,0x0000000000000100L});
	public static final BitSet FOLLOW_attrScope_in_grammarDef111 = new BitSet(new long[]{0x0000420080000090L,0x0000000000000100L});
	public static final BitSet FOLLOW_action_in_grammarDef114 = new BitSet(new long[]{0x0000420080000090L,0x0000000000000100L});
	public static final BitSet FOLLOW_rule_in_grammarDef117 = new BitSet(new long[]{0x0000420080000098L,0x0000000000000100L});
	public static final BitSet FOLLOW_set_in_grammarType0 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TOKENS_in_tokensSpec197 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_tokenSpec_in_tokensSpec199 = new BitSet(new long[]{0x0000040000000008L,0x0000000000000080L});
	public static final BitSet FOLLOW_71_in_tokenSpec213 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_TOKEN_REF_in_tokenSpec215 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_STRING_LITERAL_in_tokenSpec217 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_71_in_tokenSpec224 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_TOKEN_REF_in_tokenSpec226 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_CHAR_LITERAL_in_tokenSpec228 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_TOKEN_REF_in_tokenSpec234 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SCOPE_in_attrScope247 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_attrScope249 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_ACTION_in_attrScope251 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_72_in_action273 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_action275 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_ID_in_action277 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_ACTION_in_action279 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_72_in_action286 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_action290 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_myAction_in_action294 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ACTION_in_myAction308 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OPTIONS_in_optionsSpec343 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_option_in_optionsSpec345 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000080L});
	public static final BitSet FOLLOW_71_in_option383 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_option385 = new BitSet(new long[]{0x0000980000100000L});
	public static final BitSet FOLLOW_optionValue_in_option387 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_set_in_optionValue0 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RULE_in_rule462 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_rule464 = new BitSet(new long[]{0x0000401080A00100L,0x0000000000003900L});
	public static final BitSet FOLLOW_modifier_in_rule468 = new BitSet(new long[]{0x0000401080A00100L,0x0000000000003900L});
	public static final BitSet FOLLOW_ARG_in_rule473 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ARG_ACTION_in_rule475 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_RET_in_rule482 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ret_param_in_rule484 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_optionsSpec_in_rule497 = new BitSet(new long[]{0x0000401080A00100L,0x0000000000003900L});
	public static final BitSet FOLLOW_ruleScopeSpec_in_rule500 = new BitSet(new long[]{0x0000401080A00100L,0x0000000000003900L});
	public static final BitSet FOLLOW_ruleAction_in_rule503 = new BitSet(new long[]{0x0000401080A00100L,0x0000000000003900L});
	public static final BitSet FOLLOW_altList_in_rule514 = new BitSet(new long[]{0x0000000000020000L,0x0000000000600000L});
	public static final BitSet FOLLOW_exceptionGroup_in_rule524 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_EOR_in_rule527 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ARG_ACTION_in_ret_param572 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_modifier0 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_72_in_ruleAction619 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_ruleAction621 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_ACTION_in_ruleAction623 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_80_in_throwsSpec636 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_throwsSpec638 = new BitSet(new long[]{0x0000000000100008L});
	public static final BitSet FOLLOW_SCOPE_in_ruleScopeSpec653 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ACTION_in_ruleScopeSpec655 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_SCOPE_in_ruleScopeSpec662 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ACTION_in_ruleScopeSpec664 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_ID_in_ruleScopeSpec666 = new BitSet(new long[]{0x0000000000100008L});
	public static final BitSet FOLLOW_SCOPE_in_ruleScopeSpec674 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_ruleScopeSpec676 = new BitSet(new long[]{0x0000000000100008L});
	public static final BitSet FOLLOW_BLOCK_in_block701 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_optionsSpec_in_block703 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_alternative_in_block710 = new BitSet(new long[]{0x0000000000050000L});
	public static final BitSet FOLLOW_EOB_in_block716 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_BLOCK_in_altList749 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_alternative_in_altList754 = new BitSet(new long[]{0x0000000000050000L});
	public static final BitSet FOLLOW_EOB_in_altList759 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ALT_in_alternative792 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_element_in_alternative796 = new BitSet(new long[]{0x00023CE700085F00L,0x0000000012800080L});
	public static final BitSet FOLLOW_EOA_in_alternative800 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ALT_in_alternative864 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_EPSILON_in_alternative866 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_EOA_in_alternative868 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_exceptionHandler_in_exceptionGroup883 = new BitSet(new long[]{0x0000000000000002L,0x0000000000600000L});
	public static final BitSet FOLLOW_finallyClause_in_exceptionGroup886 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_finallyClause_in_exceptionGroup892 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_85_in_exceptionHandler913 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ARG_ACTION_in_exceptionHandler915 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_ACTION_in_exceptionHandler917 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_86_in_finallyClause940 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ACTION_in_finallyClause942 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_elementNoOptionSpec_in_element962 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_71_in_elementNoOptionSpec990 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_87_in_elementNoOptionSpec992 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_elementNoOptionSpec997 = new BitSet(new long[]{0x0000000400001F00L});
	public static final BitSet FOLLOW_block_in_elementNoOptionSpec1001 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_71_in_elementNoOptionSpec1029 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_87_in_elementNoOptionSpec1033 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_elementNoOptionSpec1038 = new BitSet(new long[]{0x00021CC000004000L,0x0000000012000000L});
	public static final BitSet FOLLOW_atom_in_elementNoOptionSpec1040 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_atom_in_elementNoOptionSpec1086 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ebnf_in_elementNoOptionSpec1098 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ACTION_in_elementNoOptionSpec1113 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SEMPRED_in_elementNoOptionSpec1126 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GATED_SEMPRED_in_elementNoOptionSpec1132 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_treeSpec_in_elementNoOptionSpec1140 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ROOT_in_atom1166 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_BANG_in_atom1168 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_atom_in_atom1171 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_range_in_atom1193 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_notSet_in_atom1198 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RULE_REF_in_atom1207 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ARG_ACTION_in_atom1209 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_RULE_REF_in_atom1220 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_terminal_in_atom1275 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_89_in_notSet1298 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_notTerminal_in_notSet1300 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_89_in_notSet1307 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_block_in_notSet1309 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_TREE_BEGIN_in_treeSpec1323 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_element_in_treeSpec1325 = new BitSet(new long[]{0x00023CE700085F08L,0x0000000012800080L});
	public static final BitSet FOLLOW_SYNPRED_in_ebnf1347 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_block_in_ebnf1351 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_SYN_SEMPRED_in_ebnf1363 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ebnfSuffix_in_ebnf1372 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_block_in_ebnf1376 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_block_in_ebnf1390 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHAR_RANGE_in_range1407 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_CHAR_LITERAL_in_range1409 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_CHAR_LITERAL_in_range1411 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_CHAR_LITERAL_in_terminal1440 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TOKEN_REF_in_terminal1492 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_LITERAL_in_terminal1565 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TOKEN_REF_in_terminal1616 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ARG_ACTION_in_terminal1618 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_92_in_terminal1627 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_notTerminal0 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OPTIONAL_in_ebnfSuffix1666 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CLOSURE_in_ebnfSuffix1675 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_POSITIVE_CLOSURE_in_ebnfSuffix1685 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_REWRITE_in_rewrite1703 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_SEMPRED_in_rewrite1705 = new BitSet(new long[]{0x0000200040010000L});
	public static final BitSet FOLLOW_rewrite_alternative_in_rewrite1707 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_REWRITE_in_rewrite1713 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_rewrite_alternative_in_rewrite1715 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_rewrite_template_in_rewrite_alternative1730 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rewrite_tree_alternative_in_rewrite_alternative1735 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ALT_in_rewrite_alternative1746 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_EPSILON_in_rewrite_alternative1748 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_EOA_in_rewrite_alternative1750 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_BLOCK_in_rewrite_template_block1769 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_rewrite_template_in_rewrite_template_block1771 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_EOB_in_rewrite_template_block1773 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_BLOCK_in_rewrite_tree_block1794 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_rewrite_tree_alternative_in_rewrite_tree_block1796 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_EOB_in_rewrite_tree_block1798 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ALT_in_rewrite_tree_alternative1817 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_rewrite_tree_element_in_rewrite_tree_alternative1819 = new BitSet(new long[]{0x00023C2020080F00L});
	public static final BitSet FOLLOW_EOA_in_rewrite_tree_alternative1822 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_rewrite_tree_atom_in_rewrite_tree_element1837 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rewrite_tree_in_rewrite_tree_element1842 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rewrite_tree_block_in_rewrite_tree_element1849 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rewrite_tree_ebnf_in_rewrite_tree_element1856 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHAR_LITERAL_in_rewrite_tree_atom1872 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TOKEN_REF_in_rewrite_tree_atom1879 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TOKEN_REF_in_rewrite_tree_atom1887 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ARG_ACTION_in_rewrite_tree_atom1889 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_RULE_REF_in_rewrite_tree_atom1901 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_LITERAL_in_rewrite_tree_atom1908 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LABEL_in_rewrite_tree_atom1915 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ACTION_in_rewrite_tree_atom1920 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ebnfSuffix_in_rewrite_tree_ebnf1932 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_rewrite_tree_block_in_rewrite_tree_ebnf1934 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_TREE_BEGIN_in_rewrite_tree1948 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_rewrite_tree_atom_in_rewrite_tree1950 = new BitSet(new long[]{0x00023C2020080F08L});
	public static final BitSet FOLLOW_rewrite_tree_element_in_rewrite_tree1952 = new BitSet(new long[]{0x00023C2020080F08L});
	public static final BitSet FOLLOW_TEMPLATE_in_rewrite_template1970 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_rewrite_template1972 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_rewrite_template_args_in_rewrite_template1974 = new BitSet(new long[]{0x000C000000000000L});
	public static final BitSet FOLLOW_set_in_rewrite_template1981 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_rewrite_template_ref_in_rewrite_template1997 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rewrite_indirect_template_head_in_rewrite_template2002 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ACTION_in_rewrite_template2007 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TEMPLATE_in_rewrite_template_ref2021 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_rewrite_template_ref2023 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_rewrite_template_args_in_rewrite_template_ref2025 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_TEMPLATE_in_rewrite_indirect_template_head2041 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ACTION_in_rewrite_indirect_template_head2043 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_rewrite_template_args_in_rewrite_indirect_template_head2045 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ARGLIST_in_rewrite_template_args2058 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_rewrite_template_arg_in_rewrite_template_args2060 = new BitSet(new long[]{0x0000000000200008L});
	public static final BitSet FOLLOW_ARGLIST_in_rewrite_template_args2067 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ARG_in_rewrite_template_arg2081 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_rewrite_template_arg2083 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_ACTION_in_rewrite_template_arg2085 = new BitSet(new long[]{0x0000000000000008L});

}