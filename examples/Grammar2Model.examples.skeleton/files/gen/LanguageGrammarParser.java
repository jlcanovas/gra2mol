// $ANTLR 3.2 Sep 23, 2009 12:02:23 files/gen/LanguageGrammar.g 2011-12-05 16:50:19

	import gts.modernization.model.CST.impl.*;
	import gts.modernization.model.CST.*;
	import java.util.Iterator;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import org.antlr.stringtemplate.*;
import org.antlr.stringtemplate.language.*;
import java.util.HashMap;
/** 
 * An example grammar for a simple language
 */
public class LanguageGrammarParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "DQVAL", "DQUOTE", "WS", "COMMENT", "LINE_COMMENT", "'print'"
    };
    public static final int WS=6;
    public static final int LINE_COMMENT=8;
    public static final int DQUOTE=5;
    public static final int DQVAL=4;
    public static final int COMMENT=7;
    public static final int EOF=-1;
    public static final int T__9=9;

    // delegates
    // delegators


        public LanguageGrammarParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public LanguageGrammarParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected StringTemplateGroup templateLib =
      new StringTemplateGroup("LanguageGrammarParserTemplates", AngleBracketTemplateLexer.class);

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

    public String[] getTokenNames() { return LanguageGrammarParser.tokenNames; }
    public String getGrammarFileName() { return "files/gen/LanguageGrammar.g"; }


    public static class mainRule_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "mainRule"
    // files/gen/LanguageGrammar.g:22:1: mainRule returns [Node returnNode] : (statementGen+= statement )* ;
    public final LanguageGrammarParser.mainRule_return mainRule() throws RecognitionException {
        LanguageGrammarParser.mainRule_return retval = new LanguageGrammarParser.mainRule_return();
        retval.start = input.LT(1);

        List list_statementGen=null;
        RuleReturnScope statementGen = null;
        try {
            // files/gen/LanguageGrammar.g:23:1: ( (statementGen+= statement )* )
            // files/gen/LanguageGrammar.g:23:3: (statementGen+= statement )*
            {
            // files/gen/LanguageGrammar.g:23:15: (statementGen+= statement )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==9) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // files/gen/LanguageGrammar.g:0:0: statementGen+= statement
            	    {
            	    pushFollow(FOLLOW_statement_in_mainRule48);
            	    statementGen=statement();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if (list_statementGen==null) list_statementGen=new ArrayList();
            	    list_statementGen.add(statementGen);


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            if ( state.backtracking==0 ) {

              		// Create return CST Node
              		Node mainRuleReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
              		mainRuleReturnNode.setKind("mainRule");
              	    // Create a CST Node
              		if(list_statementGen != null) {
              	        for(Iterator it = list_statementGen.iterator(); it.hasNext(); )  { 
              	            LanguageGrammarParser.statement_return r = (LanguageGrammarParser.statement_return) it.next(); 
              	            if(r != null && r.returnNode != null) {
              	            	r.returnNode.setKind("statement");
              	            	mainRuleReturnNode.getChildren().add(r.returnNode);
              	            } 
              	        }
              	    }
              		// Returns the Node with CST Leaves/Nodes
              		retval.returnNode = mainRuleReturnNode;
              	
            }

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "mainRule"

    public static class statement_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "statement"
    // files/gen/LanguageGrammar.g:44:1: statement returns [Node returnNode] : print_statementGen+= print_statement ;
    public final LanguageGrammarParser.statement_return statement() throws RecognitionException {
        LanguageGrammarParser.statement_return retval = new LanguageGrammarParser.statement_return();
        retval.start = input.LT(1);

        List list_print_statementGen=null;
        RuleReturnScope print_statementGen = null;
        try {
            // files/gen/LanguageGrammar.g:45:1: (print_statementGen+= print_statement )
            // files/gen/LanguageGrammar.g:45:3: print_statementGen+= print_statement
            {
            pushFollow(FOLLOW_print_statement_in_statement73);
            print_statementGen=print_statement();

            state._fsp--;
            if (state.failed) return retval;
            if (list_print_statementGen==null) list_print_statementGen=new ArrayList();
            list_print_statementGen.add(print_statementGen);

            if ( state.backtracking==0 ) {

              		// Create return CST Node
              		Node statementReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
              		statementReturnNode.setKind("statement");
              	    // Create a CST Node
              		if(list_print_statementGen != null) {
              	        for(Iterator it = list_print_statementGen.iterator(); it.hasNext(); )  { 
              	            LanguageGrammarParser.print_statement_return r = (LanguageGrammarParser.print_statement_return) it.next(); 
              	            if(r != null && r.returnNode != null) {
              	            	r.returnNode.setKind("print_statement");
              	            	statementReturnNode.getChildren().add(r.returnNode);
              	            } 
              	        }
              	    }
              		// Returns the Node with CST Leaves/Nodes
              		retval.returnNode = statementReturnNode;
              	
            }

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "statement"

    public static class print_statement_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "print_statement"
    // files/gen/LanguageGrammar.g:65:1: print_statement returns [Node returnNode] : TK_0= 'print' DQVALGen= DQVAL ;
    public final LanguageGrammarParser.print_statement_return print_statement() throws RecognitionException {
        LanguageGrammarParser.print_statement_return retval = new LanguageGrammarParser.print_statement_return();
        retval.start = input.LT(1);

        Token TK_0=null;
        Token DQVALGen=null;

        try {
            // files/gen/LanguageGrammar.g:66:1: (TK_0= 'print' DQVALGen= DQVAL )
            // files/gen/LanguageGrammar.g:66:3: TK_0= 'print' DQVALGen= DQVAL
            {
            TK_0=(Token)match(input,9,FOLLOW_9_in_print_statement95); if (state.failed) return retval;
            DQVALGen=(Token)match(input,DQVAL,FOLLOW_DQVAL_in_print_statement99); if (state.failed) return retval;
            if ( state.backtracking==0 ) {

              		// Create return CST Node
              		Node print_statementReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
              		print_statementReturnNode.setKind("print_statement");
              	    // Create a Token CST Leaf	
              	    if(TK_0 != null) {
              			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
              	 		TK_0Leaf.setKind("TOKEN");
              	 		TK_0Leaf.setValue((TK_0!=null?TK_0.getText():null));
              			TK_0Leaf.setPos(TK_0.getCharPositionInLine());
              			TK_0Leaf.setLine(TK_0.getLine());
              	 		print_statementReturnNode.getChildren().add(TK_0Leaf);
              	 	}
              	    // Create a CST Leaf
              		if(DQVALGen != null) {
              			Leaf DQVALGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf();
              			DQVALGenLeaf.setKind("DQVAL");
              			DQVALGenLeaf.setValue((DQVALGen!=null?DQVALGen.getText():null));
              			DQVALGenLeaf.setPos(DQVALGen.getCharPositionInLine());
              			DQVALGenLeaf.setLine(DQVALGen.getLine());
              			print_statementReturnNode.getChildren().add(DQVALGenLeaf);
              		}
              		// Returns the Node with CST Leaves/Nodes
              		retval.returnNode = print_statementReturnNode;
              	
            }

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "print_statement"

    // Delegated rules


 

    public static final BitSet FOLLOW_statement_in_mainRule48 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_print_statement_in_statement73 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_9_in_print_statement95 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_DQVAL_in_print_statement99 = new BitSet(new long[]{0x0000000000000002L});

}