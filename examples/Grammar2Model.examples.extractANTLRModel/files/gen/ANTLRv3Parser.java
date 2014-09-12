// $ANTLR 3.0.1 /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3 2009-01-12 17:09:08

	import gts.modernization.model.CST.impl.*;
	import gts.modernization.model.CST.*;
	import java.util.Iterator;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.stringtemplate.*;
import org.antlr.stringtemplate.language.*;
import java.util.HashMap;
/** ANTLR v3 grammar written in ANTLR v3 with AST construction */
public class ANTLRv3Parser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "DOC_COMMENT", "PARSER", "LEXER", "RULE", "BLOCK", "OPTIONAL", "CLOSURE", "POSITIVE_CLOSURE", "SYNPRED", "RANGE", "CHAR_RANGE", "EPSILON", "ALT", "EOR", "EOB", "EOA", "ID", "ARG", "ARGLIST", "RET", "LEXER_GRAMMAR", "PARSER_GRAMMAR", "TREE_GRAMMAR", "COMBINED_GRAMMAR", "INITACTION", "LABEL", "TEMPLATE", "SCOPE", "SEMPRED", "GATED_SEMPRED", "SYN_SEMPRED", "BACKTRACK_SEMPRED", "FRAGMENT", "TREE_BEGIN", "ROOT", "BANG", "REWRITE", "TOKENS", "TOKEN_REF", "STRING_LITERAL", "CHAR_LITERAL", "ACTION", "OPTIONS", "INT", "ARG_ACTION", "RULE_REF", "DOUBLE_QUOTE_STRING_LITERAL", "DOUBLE_ANGLE_STRING_LITERAL", "SRC", "SL_COMMENT", "ML_COMMENT", "LITERAL_CHAR", "ESC", "XDIGIT", "NESTED_ARG_ACTION", "ACTION_STRING_LITERAL", "ACTION_CHAR_LITERAL", "NESTED_ACTION", "ACTION_ESC", "WS_LOOP", "WS", "'lexer'", "'parser'", "'tree'", "'grammar'", "';'", "'}'", "'='", "'@'", "'::'", "'*'", "'protected'", "'public'", "'private'", "'returns'", "':'", "'throws'", "','", "'('", "'|'", "')'", "'catch'", "'finally'", "'+='", "'=>'", "'~'", "'?'", "'+'", "'.'", "'$'"
    };
    public static final int NESTED_ACTION=61;
    public static final int BACKTRACK_SEMPRED=35;
    public static final int DOUBLE_ANGLE_STRING_LITERAL=51;
    public static final int ESC=56;
    public static final int LEXER_GRAMMAR=24;
    public static final int FRAGMENT=36;
    public static final int EOA=19;
    public static final int ARGLIST=22;
    public static final int ID=20;
    public static final int EOF=-1;
    public static final int TREE_BEGIN=37;
    public static final int SEMPRED=32;
    public static final int ACTION=45;
    public static final int EOB=18;
    public static final int TOKEN_REF=42;
    public static final int ML_COMMENT=54;
    public static final int RET=23;
    public static final int STRING_LITERAL=43;
    public static final int ALT=16;
    public static final int ARG=21;
    public static final int SCOPE=31;
    public static final int EOR=17;
    public static final int ARG_ACTION=48;
    public static final int DOC_COMMENT=4;
    public static final int DOUBLE_QUOTE_STRING_LITERAL=50;
    public static final int NESTED_ARG_ACTION=58;
    public static final int ACTION_CHAR_LITERAL=60;
    public static final int INITACTION=28;
    public static final int RULE=7;
    public static final int ACTION_ESC=62;
    public static final int PARSER_GRAMMAR=25;
    public static final int SRC=52;
    public static final int WS_LOOP=63;
    public static final int RANGE=13;
    public static final int TOKENS=41;
    public static final int LITERAL_CHAR=55;
    public static final int GATED_SEMPRED=33;
    public static final int ACTION_STRING_LITERAL=59;
    public static final int INT=47;
    public static final int CHAR_RANGE=14;
    public static final int BANG=39;
    public static final int EPSILON=15;
    public static final int ROOT=38;
    public static final int RULE_REF=49;
    public static final int REWRITE=40;
    public static final int SYNPRED=12;
    public static final int OPTIONAL=9;
    public static final int WS=64;
    public static final int COMBINED_GRAMMAR=27;
    public static final int CHAR_LITERAL=44;
    public static final int LABEL=29;
    public static final int TEMPLATE=30;
    public static final int SYN_SEMPRED=34;
    public static final int LEXER=6;
    public static final int XDIGIT=57;
    public static final int BLOCK=8;
    public static final int SL_COMMENT=53;
    public static final int TREE_GRAMMAR=26;
    public static final int CLOSURE=10;
    public static final int PARSER=5;
    public static final int POSITIVE_CLOSURE=11;
    public static final int OPTIONS=46;

        public ANTLRv3Parser(TokenStream input) {
            super(input);
        }
        
    protected StringTemplateGroup templateLib =
      new StringTemplateGroup("ANTLRv3ParserTemplates", AngleBracketTemplateLexer.class);

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

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "/home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3"; }

    
    	int gtype;


    public static class grammarDef_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start grammarDef
    // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:65:1: grammarDef returns [Node returnNode] : (DOC_COMMENTGen= DOC_COMMENT )? (TK_0= 'lexer' | TK_1= 'parser' | TK_2= 'tree' | ) TK_3= 'grammar' idGen+= id TK_4= ';' (optionsSpecGen+= optionsSpec )? (tokensSpecGen+= tokensSpec )? (attrScopeGen+= attrScope )* (actionGen+= action )* (ruleGen+= rule )+ EOFGen= EOF ;
    public final grammarDef_return grammarDef() throws RecognitionException {
        grammarDef_return retval = new grammarDef_return();
        retval.start = input.LT(1);

        Token DOC_COMMENTGen=null;
        Token TK_0=null;
        Token TK_1=null;
        Token TK_2=null;
        Token TK_3=null;
        Token TK_4=null;
        Token EOFGen=null;
        List list_idGen=null;
        List list_optionsSpecGen=null;
        List list_tokensSpecGen=null;
        List list_attrScopeGen=null;
        List list_actionGen=null;
        List list_ruleGen=null;
        RuleReturnScope idGen = null;
        RuleReturnScope optionsSpecGen = null;
        RuleReturnScope tokensSpecGen = null;
        RuleReturnScope attrScopeGen = null;
        RuleReturnScope actionGen = null;
        RuleReturnScope ruleGen = null;
        try {
            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:66:1: ( (DOC_COMMENTGen= DOC_COMMENT )? (TK_0= 'lexer' | TK_1= 'parser' | TK_2= 'tree' | ) TK_3= 'grammar' idGen+= id TK_4= ';' (optionsSpecGen+= optionsSpec )? (tokensSpecGen+= tokensSpec )? (attrScopeGen+= attrScope )* (actionGen+= action )* (ruleGen+= rule )+ EOFGen= EOF )
            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:66:5: (DOC_COMMENTGen= DOC_COMMENT )? (TK_0= 'lexer' | TK_1= 'parser' | TK_2= 'tree' | ) TK_3= 'grammar' idGen+= id TK_4= ';' (optionsSpecGen+= optionsSpec )? (tokensSpecGen+= tokensSpec )? (attrScopeGen+= attrScope )* (actionGen+= action )* (ruleGen+= rule )+ EOFGen= EOF
            {
            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:66:19: (DOC_COMMENTGen= DOC_COMMENT )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==DOC_COMMENT) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:66:19: DOC_COMMENTGen= DOC_COMMENT
                    {
                    DOC_COMMENTGen=(Token)input.LT(1);
                    match(input,DOC_COMMENT,FOLLOW_DOC_COMMENT_in_grammarDef337); 

                    }
                    break;

            }

            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:67:6: (TK_0= 'lexer' | TK_1= 'parser' | TK_2= 'tree' | )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 65:
                {
                alt2=1;
                }
                break;
            case 66:
                {
                alt2=2;
                }
                break;
            case 67:
                {
                alt2=3;
                }
                break;
            case 68:
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("67:6: (TK_0= 'lexer' | TK_1= 'parser' | TK_2= 'tree' | )", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:67:8: TK_0= 'lexer'
                    {
                    TK_0=(Token)input.LT(1);
                    match(input,65,FOLLOW_65_in_grammarDef349); 

                    }
                    break;
                case 2 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:68:10: TK_1= 'parser'
                    {
                    TK_1=(Token)input.LT(1);
                    match(input,66,FOLLOW_66_in_grammarDef363); 

                    }
                    break;
                case 3 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:69:10: TK_2= 'tree'
                    {
                    TK_2=(Token)input.LT(1);
                    match(input,67,FOLLOW_67_in_grammarDef377); 

                    }
                    break;
                case 4 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:71:6: 
                    {
                    }
                    break;

            }

            TK_3=(Token)input.LT(1);
            match(input,68,FOLLOW_68_in_grammarDef410); 
            pushFollow(FOLLOW_id_in_grammarDef414);
            idGen=id();
            _fsp--;

            if (list_idGen==null) list_idGen=new ArrayList();
            list_idGen.add(idGen);

            TK_4=(Token)input.LT(1);
            match(input,69,FOLLOW_69_in_grammarDef418); 
            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:72:54: (optionsSpecGen+= optionsSpec )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==OPTIONS) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:72:54: optionsSpecGen+= optionsSpec
                    {
                    pushFollow(FOLLOW_optionsSpec_in_grammarDef422);
                    optionsSpecGen=optionsSpec();
                    _fsp--;

                    if (list_optionsSpecGen==null) list_optionsSpecGen=new ArrayList();
                    list_optionsSpecGen.add(optionsSpecGen);


                    }
                    break;

            }

            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:72:82: (tokensSpecGen+= tokensSpec )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==TOKENS) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:72:82: tokensSpecGen+= tokensSpec
                    {
                    pushFollow(FOLLOW_tokensSpec_in_grammarDef427);
                    tokensSpecGen=tokensSpec();
                    _fsp--;

                    if (list_tokensSpecGen==null) list_tokensSpecGen=new ArrayList();
                    list_tokensSpecGen.add(tokensSpecGen);


                    }
                    break;

            }

            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:72:108: (attrScopeGen+= attrScope )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==SCOPE) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:72:108: attrScopeGen+= attrScope
            	    {
            	    pushFollow(FOLLOW_attrScope_in_grammarDef432);
            	    attrScopeGen=attrScope();
            	    _fsp--;

            	    if (list_attrScopeGen==null) list_attrScopeGen=new ArrayList();
            	    list_attrScopeGen.add(attrScopeGen);


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:72:130: (actionGen+= action )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==72) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:72:130: actionGen+= action
            	    {
            	    pushFollow(FOLLOW_action_in_grammarDef437);
            	    actionGen=action();
            	    _fsp--;

            	    if (list_actionGen==null) list_actionGen=new ArrayList();
            	    list_actionGen.add(actionGen);


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:73:13: (ruleGen+= rule )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==DOC_COMMENT||LA7_0==FRAGMENT||LA7_0==TOKEN_REF||LA7_0==RULE_REF||(LA7_0>=75 && LA7_0<=77)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:73:13: ruleGen+= rule
            	    {
            	    pushFollow(FOLLOW_rule_in_grammarDef447);
            	    ruleGen=rule();
            	    _fsp--;

            	    if (list_ruleGen==null) list_ruleGen=new ArrayList();
            	    list_ruleGen.add(ruleGen);


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

            EOFGen=(Token)input.LT(1);
            match(input,EOF,FOLLOW_EOF_in_grammarDef457); 
            
            		// Create return CST Node
            		Node grammarDefReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
            		grammarDefReturnNode.setKind("grammarDef");
            	    // Create a CST Leaf
            		if(DOC_COMMENTGen != null) {
            			Leaf DOC_COMMENTGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf();
            			DOC_COMMENTGenLeaf.setKind("DOC_COMMENT");
            			DOC_COMMENTGenLeaf.setValue(DOC_COMMENTGen.getText());
            			DOC_COMMENTGenLeaf.setPos(DOC_COMMENTGen.getCharPositionInLine());
            			DOC_COMMENTGenLeaf.setLine(DOC_COMMENTGen.getLine());
            			grammarDefReturnNode.getChildren().add(DOC_COMMENTGenLeaf);
            		}
            	    // Create a Token CST Leaf	
            	    if(TK_0 != null) {
            			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
            	 		TK_0Leaf.setKind("TOKEN");
            	 		TK_0Leaf.setValue(TK_0.getText());
            			TK_0Leaf.setPos(TK_0.getCharPositionInLine());
            			TK_0Leaf.setLine(TK_0.getLine());
            	 		grammarDefReturnNode.getChildren().add(TK_0Leaf);
            	 	}
            	    // Create a Token CST Leaf	
            	    if(TK_1 != null) {
            			Leaf TK_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
            	 		TK_1Leaf.setKind("TOKEN");
            	 		TK_1Leaf.setValue(TK_1.getText());
            			TK_1Leaf.setPos(TK_1.getCharPositionInLine());
            			TK_1Leaf.setLine(TK_1.getLine());
            	 		grammarDefReturnNode.getChildren().add(TK_1Leaf);
            	 	}
            	    // Create a Token CST Leaf	
            	    if(TK_2 != null) {
            			Leaf TK_2Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
            	 		TK_2Leaf.setKind("TOKEN");
            	 		TK_2Leaf.setValue(TK_2.getText());
            			TK_2Leaf.setPos(TK_2.getCharPositionInLine());
            			TK_2Leaf.setLine(TK_2.getLine());
            	 		grammarDefReturnNode.getChildren().add(TK_2Leaf);
            	 	}
            	    // Create a Token CST Leaf	
            	    if(TK_3 != null) {
            			Leaf TK_3Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
            	 		TK_3Leaf.setKind("TOKEN");
            	 		TK_3Leaf.setValue(TK_3.getText());
            			TK_3Leaf.setPos(TK_3.getCharPositionInLine());
            			TK_3Leaf.setLine(TK_3.getLine());
            	 		grammarDefReturnNode.getChildren().add(TK_3Leaf);
            	 	}
            	    // Create a CST Node
            		if(list_idGen != null) {
            	        for(Iterator it = list_idGen.iterator(); it.hasNext(); )  { 
            	            ANTLRv3Parser.id_return r = (ANTLRv3Parser.id_return) it.next(); 
            	            if(r != null && r.returnNode != null) {
            	            	r.returnNode.setKind("id");
            	            	grammarDefReturnNode.getChildren().add(r.returnNode);
            	            } 
            	        }
            	    }
            	    // Create a Token CST Leaf	
            	    if(TK_4 != null) {
            			Leaf TK_4Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
            	 		TK_4Leaf.setKind("TOKEN");
            	 		TK_4Leaf.setValue(TK_4.getText());
            			TK_4Leaf.setPos(TK_4.getCharPositionInLine());
            			TK_4Leaf.setLine(TK_4.getLine());
            	 		grammarDefReturnNode.getChildren().add(TK_4Leaf);
            	 	}
            	    // Create a CST Node
            		if(list_optionsSpecGen != null) {
            	        for(Iterator it = list_optionsSpecGen.iterator(); it.hasNext(); )  { 
            	            ANTLRv3Parser.optionsSpec_return r = (ANTLRv3Parser.optionsSpec_return) it.next(); 
            	            if(r != null && r.returnNode != null) {
            	            	r.returnNode.setKind("optionsSpec");
            	            	grammarDefReturnNode.getChildren().add(r.returnNode);
            	            } 
            	        }
            	    }
            	    // Create a CST Node
            		if(list_tokensSpecGen != null) {
            	        for(Iterator it = list_tokensSpecGen.iterator(); it.hasNext(); )  { 
            	            ANTLRv3Parser.tokensSpec_return r = (ANTLRv3Parser.tokensSpec_return) it.next(); 
            	            if(r != null && r.returnNode != null) {
            	            	r.returnNode.setKind("tokensSpec");
            	            	grammarDefReturnNode.getChildren().add(r.returnNode);
            	            } 
            	        }
            	    }
            	    // Create a CST Node
            		if(list_attrScopeGen != null) {
            	        for(Iterator it = list_attrScopeGen.iterator(); it.hasNext(); )  { 
            	            ANTLRv3Parser.attrScope_return r = (ANTLRv3Parser.attrScope_return) it.next(); 
            	            if(r != null && r.returnNode != null) {
            	            	r.returnNode.setKind("attrScope");
            	            	grammarDefReturnNode.getChildren().add(r.returnNode);
            	            } 
            	        }
            	    }
            	    // Create a CST Node
            		if(list_actionGen != null) {
            	        for(Iterator it = list_actionGen.iterator(); it.hasNext(); )  { 
            	            ANTLRv3Parser.action_return r = (ANTLRv3Parser.action_return) it.next(); 
            	            if(r != null && r.returnNode != null) {
            	            	r.returnNode.setKind("action");
            	            	grammarDefReturnNode.getChildren().add(r.returnNode);
            	            } 
            	        }
            	    }
            	    // Create a CST Node
            		if(list_ruleGen != null) {
            	        for(Iterator it = list_ruleGen.iterator(); it.hasNext(); )  { 
            	            ANTLRv3Parser.rule_return r = (ANTLRv3Parser.rule_return) it.next(); 
            	            if(r != null && r.returnNode != null) {
            	            	r.returnNode.setKind("rule");
            	            	grammarDefReturnNode.getChildren().add(r.returnNode);
            	            } 
            	        }
            	    }
            	    // Create a CST Leaf
            		if(EOFGen != null) {
            			Leaf EOFGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf();
            			EOFGenLeaf.setKind("EOF");
            			EOFGenLeaf.setValue(EOFGen.getText());
            			EOFGenLeaf.setPos(EOFGen.getCharPositionInLine());
            			EOFGenLeaf.setLine(EOFGen.getLine());
            			grammarDefReturnNode.getChildren().add(EOFGenLeaf);
            		}
            		// Returns the Node with CST Leaves/Nodes
            		retval.returnNode = grammarDefReturnNode;
            	

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
    // $ANTLR end grammarDef

    public static class tokensSpec_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start tokensSpec
    // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:207:1: tokensSpec returns [Node returnNode] : TOKENSGen= TOKENS (tokenSpecGen+= tokenSpec )+ TK_0= '}' ;
    public final tokensSpec_return tokensSpec() throws RecognitionException {
        tokensSpec_return retval = new tokensSpec_return();
        retval.start = input.LT(1);

        Token TOKENSGen=null;
        Token TK_0=null;
        List list_tokenSpecGen=null;
        RuleReturnScope tokenSpecGen = null;
        try {
            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:208:1: (TOKENSGen= TOKENS (tokenSpecGen+= tokenSpec )+ TK_0= '}' )
            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:208:3: TOKENSGen= TOKENS (tokenSpecGen+= tokenSpec )+ TK_0= '}'
            {
            TOKENSGen=(Token)input.LT(1);
            match(input,TOKENS,FOLLOW_TOKENS_in_tokensSpec481); 
            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:208:32: (tokenSpecGen+= tokenSpec )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==TOKEN_REF) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:208:32: tokenSpecGen+= tokenSpec
            	    {
            	    pushFollow(FOLLOW_tokenSpec_in_tokensSpec485);
            	    tokenSpecGen=tokenSpec();
            	    _fsp--;

            	    if (list_tokenSpecGen==null) list_tokenSpecGen=new ArrayList();
            	    list_tokenSpecGen.add(tokenSpecGen);


            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);

            TK_0=(Token)input.LT(1);
            match(input,70,FOLLOW_70_in_tokensSpec490); 
            
            		// Create return CST Node
            		Node tokensSpecReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
            		tokensSpecReturnNode.setKind("tokensSpec");
            	    // Create a CST Leaf
            		if(TOKENSGen != null) {
            			Leaf TOKENSGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf();
            			TOKENSGenLeaf.setKind("TOKENS");
            			TOKENSGenLeaf.setValue(TOKENSGen.getText());
            			TOKENSGenLeaf.setPos(TOKENSGen.getCharPositionInLine());
            			TOKENSGenLeaf.setLine(TOKENSGen.getLine());
            			tokensSpecReturnNode.getChildren().add(TOKENSGenLeaf);
            		}
            	    // Create a CST Node
            		if(list_tokenSpecGen != null) {
            	        for(Iterator it = list_tokenSpecGen.iterator(); it.hasNext(); )  { 
            	            ANTLRv3Parser.tokenSpec_return r = (ANTLRv3Parser.tokenSpec_return) it.next(); 
            	            if(r != null && r.returnNode != null) {
            	            	r.returnNode.setKind("tokenSpec");
            	            	tokensSpecReturnNode.getChildren().add(r.returnNode);
            	            } 
            	        }
            	    }
            	    // Create a Token CST Leaf	
            	    if(TK_0 != null) {
            			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
            	 		TK_0Leaf.setKind("TOKEN");
            	 		TK_0Leaf.setValue(TK_0.getText());
            			TK_0Leaf.setPos(TK_0.getCharPositionInLine());
            			TK_0Leaf.setLine(TK_0.getLine());
            	 		tokensSpecReturnNode.getChildren().add(TK_0Leaf);
            	 	}
            		// Returns the Node with CST Leaves/Nodes
            		retval.returnNode = tokensSpecReturnNode;
            	

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
    // $ANTLR end tokensSpec

    public static class tokenSpec_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start tokenSpec
    // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:246:1: tokenSpec returns [Node returnNode] : TOKEN_REFGen= TOKEN_REF (TK_0= '=' (STRING_LITERALGen= STRING_LITERAL | CHAR_LITERALGen= CHAR_LITERAL ) | ) TK_1= ';' ;
    public final tokenSpec_return tokenSpec() throws RecognitionException {
        tokenSpec_return retval = new tokenSpec_return();
        retval.start = input.LT(1);

        Token TOKEN_REFGen=null;
        Token TK_0=null;
        Token STRING_LITERALGen=null;
        Token CHAR_LITERALGen=null;
        Token TK_1=null;

        try {
            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:247:1: (TOKEN_REFGen= TOKEN_REF (TK_0= '=' (STRING_LITERALGen= STRING_LITERAL | CHAR_LITERALGen= CHAR_LITERAL ) | ) TK_1= ';' )
            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:247:3: TOKEN_REFGen= TOKEN_REF (TK_0= '=' (STRING_LITERALGen= STRING_LITERAL | CHAR_LITERALGen= CHAR_LITERAL ) | ) TK_1= ';'
            {
            TOKEN_REFGen=(Token)input.LT(1);
            match(input,TOKEN_REF,FOLLOW_TOKEN_REF_in_tokenSpec512); 
            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:248:3: (TK_0= '=' (STRING_LITERALGen= STRING_LITERAL | CHAR_LITERALGen= CHAR_LITERAL ) | )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==71) ) {
                alt10=1;
            }
            else if ( (LA10_0==69) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("248:3: (TK_0= '=' (STRING_LITERALGen= STRING_LITERAL | CHAR_LITERALGen= CHAR_LITERAL ) | )", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:248:5: TK_0= '=' (STRING_LITERALGen= STRING_LITERAL | CHAR_LITERALGen= CHAR_LITERAL )
                    {
                    TK_0=(Token)input.LT(1);
                    match(input,71,FOLLOW_71_in_tokenSpec520); 
                    // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:248:14: (STRING_LITERALGen= STRING_LITERAL | CHAR_LITERALGen= CHAR_LITERAL )
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==STRING_LITERAL) ) {
                        alt9=1;
                    }
                    else if ( (LA9_0==CHAR_LITERAL) ) {
                        alt9=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("248:14: (STRING_LITERALGen= STRING_LITERAL | CHAR_LITERALGen= CHAR_LITERAL )", 9, 0, input);

                        throw nvae;
                    }
                    switch (alt9) {
                        case 1 :
                            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:248:15: STRING_LITERALGen= STRING_LITERAL
                            {
                            STRING_LITERALGen=(Token)input.LT(1);
                            match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_tokenSpec525); 

                            }
                            break;
                        case 2 :
                            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:248:48: CHAR_LITERALGen= CHAR_LITERAL
                            {
                            CHAR_LITERALGen=(Token)input.LT(1);
                            match(input,CHAR_LITERAL,FOLLOW_CHAR_LITERAL_in_tokenSpec529); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:250:3: 
                    {
                    }
                    break;

            }

            TK_1=(Token)input.LT(1);
            match(input,69,FOLLOW_69_in_tokenSpec557); 
            
            		// Create return CST Node
            		Node tokenSpecReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
            		tokenSpecReturnNode.setKind("tokenSpec");
            	    // Create a CST Leaf
            		if(TOKEN_REFGen != null) {
            			Leaf TOKEN_REFGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf();
            			TOKEN_REFGenLeaf.setKind("TOKEN_REF");
            			TOKEN_REFGenLeaf.setValue(TOKEN_REFGen.getText());
            			TOKEN_REFGenLeaf.setPos(TOKEN_REFGen.getCharPositionInLine());
            			TOKEN_REFGenLeaf.setLine(TOKEN_REFGen.getLine());
            			tokenSpecReturnNode.getChildren().add(TOKEN_REFGenLeaf);
            		}
            	    // Create a Token CST Leaf	
            	    if(TK_0 != null) {
            			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
            	 		TK_0Leaf.setKind("TOKEN");
            	 		TK_0Leaf.setValue(TK_0.getText());
            			TK_0Leaf.setPos(TK_0.getCharPositionInLine());
            			TK_0Leaf.setLine(TK_0.getLine());
            	 		tokenSpecReturnNode.getChildren().add(TK_0Leaf);
            	 	}
            	    // Create a CST Leaf
            		if(STRING_LITERALGen != null) {
            			Leaf STRING_LITERALGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf();
            			STRING_LITERALGenLeaf.setKind("STRING_LITERAL");
            			STRING_LITERALGenLeaf.setValue(STRING_LITERALGen.getText());
            			STRING_LITERALGenLeaf.setPos(STRING_LITERALGen.getCharPositionInLine());
            			STRING_LITERALGenLeaf.setLine(STRING_LITERALGen.getLine());
            			tokenSpecReturnNode.getChildren().add(STRING_LITERALGenLeaf);
            		}
            	    // Create a CST Leaf
            		if(CHAR_LITERALGen != null) {
            			Leaf CHAR_LITERALGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf();
            			CHAR_LITERALGenLeaf.setKind("CHAR_LITERAL");
            			CHAR_LITERALGenLeaf.setValue(CHAR_LITERALGen.getText());
            			CHAR_LITERALGenLeaf.setPos(CHAR_LITERALGen.getCharPositionInLine());
            			CHAR_LITERALGenLeaf.setLine(CHAR_LITERALGen.getLine());
            			tokenSpecReturnNode.getChildren().add(CHAR_LITERALGenLeaf);
            		}
            	    // Create a Token CST Leaf	
            	    if(TK_1 != null) {
            			Leaf TK_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
            	 		TK_1Leaf.setKind("TOKEN");
            	 		TK_1Leaf.setValue(TK_1.getText());
            			TK_1Leaf.setPos(TK_1.getCharPositionInLine());
            			TK_1Leaf.setLine(TK_1.getLine());
            	 		tokenSpecReturnNode.getChildren().add(TK_1Leaf);
            	 	}
            		// Returns the Node with CST Leaves/Nodes
            		retval.returnNode = tokenSpecReturnNode;
            	

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
    // $ANTLR end tokenSpec

    public static class attrScope_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start attrScope
    // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:306:1: attrScope returns [Node returnNode] : TK_0= 'scope' idGen+= id ACTIONGen= ACTION ;
    public final attrScope_return attrScope() throws RecognitionException {
        attrScope_return retval = new attrScope_return();
        retval.start = input.LT(1);

        Token TK_0=null;
        Token ACTIONGen=null;
        List list_idGen=null;
        RuleReturnScope idGen = null;
        try {
            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:307:1: (TK_0= 'scope' idGen+= id ACTIONGen= ACTION )
            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:307:3: TK_0= 'scope' idGen+= id ACTIONGen= ACTION
            {
            TK_0=(Token)input.LT(1);
            match(input,SCOPE,FOLLOW_SCOPE_in_attrScope578); 
            pushFollow(FOLLOW_id_in_attrScope582);
            idGen=id();
            _fsp--;

            if (list_idGen==null) list_idGen=new ArrayList();
            list_idGen.add(idGen);

            ACTIONGen=(Token)input.LT(1);
            match(input,ACTION,FOLLOW_ACTION_in_attrScope586); 
            
            		// Create return CST Node
            		Node attrScopeReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
            		attrScopeReturnNode.setKind("attrScope");
            	    // Create a Token CST Leaf	
            	    if(TK_0 != null) {
            			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
            	 		TK_0Leaf.setKind("TOKEN");
            	 		TK_0Leaf.setValue(TK_0.getText());
            			TK_0Leaf.setPos(TK_0.getCharPositionInLine());
            			TK_0Leaf.setLine(TK_0.getLine());
            	 		attrScopeReturnNode.getChildren().add(TK_0Leaf);
            	 	}
            	    // Create a CST Node
            		if(list_idGen != null) {
            	        for(Iterator it = list_idGen.iterator(); it.hasNext(); )  { 
            	            ANTLRv3Parser.id_return r = (ANTLRv3Parser.id_return) it.next(); 
            	            if(r != null && r.returnNode != null) {
            	            	r.returnNode.setKind("id");
            	            	attrScopeReturnNode.getChildren().add(r.returnNode);
            	            } 
            	        }
            	    }
            	    // Create a CST Leaf
            		if(ACTIONGen != null) {
            			Leaf ACTIONGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf();
            			ACTIONGenLeaf.setKind("ACTION");
            			ACTIONGenLeaf.setValue(ACTIONGen.getText());
            			ACTIONGenLeaf.setPos(ACTIONGen.getCharPositionInLine());
            			ACTIONGenLeaf.setLine(ACTIONGen.getLine());
            			attrScopeReturnNode.getChildren().add(ACTIONGenLeaf);
            		}
            		// Returns the Node with CST Leaves/Nodes
            		retval.returnNode = attrScopeReturnNode;
            	

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
    // $ANTLR end attrScope

    public static class action_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start action
    // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:345:1: action returns [Node returnNode] : TK_0= '@' (actionScopeNameGen+= actionScopeName TK_1= '::' )? idGen+= id ACTIONGen= ACTION ;
    public final action_return action() throws RecognitionException {
        action_return retval = new action_return();
        retval.start = input.LT(1);

        Token TK_0=null;
        Token TK_1=null;
        Token ACTIONGen=null;
        List list_actionScopeNameGen=null;
        List list_idGen=null;
        RuleReturnScope actionScopeNameGen = null;
        RuleReturnScope idGen = null;
        try {
            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:346:1: (TK_0= '@' (actionScopeNameGen+= actionScopeName TK_1= '::' )? idGen+= id ACTIONGen= ACTION )
            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:346:3: TK_0= '@' (actionScopeNameGen+= actionScopeName TK_1= '::' )? idGen+= id ACTIONGen= ACTION
            {
            TK_0=(Token)input.LT(1);
            match(input,72,FOLLOW_72_in_action607); 
            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:346:12: (actionScopeNameGen+= actionScopeName TK_1= '::' )?
            int alt11=2;
            switch ( input.LA(1) ) {
                case TOKEN_REF:
                    {
                    int LA11_1 = input.LA(2);

                    if ( (LA11_1==73) ) {
                        alt11=1;
                    }
                    }
                    break;
                case RULE_REF:
                    {
                    int LA11_2 = input.LA(2);

                    if ( (LA11_2==73) ) {
                        alt11=1;
                    }
                    }
                    break;
                case 65:
                case 66:
                    {
                    alt11=1;
                    }
                    break;
            }

            switch (alt11) {
                case 1 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:346:13: actionScopeNameGen+= actionScopeName TK_1= '::'
                    {
                    pushFollow(FOLLOW_actionScopeName_in_action612);
                    actionScopeNameGen=actionScopeName();
                    _fsp--;

                    if (list_actionScopeNameGen==null) list_actionScopeNameGen=new ArrayList();
                    list_actionScopeNameGen.add(actionScopeNameGen);

                    TK_1=(Token)input.LT(1);
                    match(input,73,FOLLOW_73_in_action616); 

                    }
                    break;

            }

            pushFollow(FOLLOW_id_in_action622);
            idGen=id();
            _fsp--;

            if (list_idGen==null) list_idGen=new ArrayList();
            list_idGen.add(idGen);

            ACTIONGen=(Token)input.LT(1);
            match(input,ACTION,FOLLOW_ACTION_in_action626); 
            
            		// Create return CST Node
            		Node actionReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
            		actionReturnNode.setKind("action");
            	    // Create a Token CST Leaf	
            	    if(TK_0 != null) {
            			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
            	 		TK_0Leaf.setKind("TOKEN");
            	 		TK_0Leaf.setValue(TK_0.getText());
            			TK_0Leaf.setPos(TK_0.getCharPositionInLine());
            			TK_0Leaf.setLine(TK_0.getLine());
            	 		actionReturnNode.getChildren().add(TK_0Leaf);
            	 	}
            	    // Create a CST Node
            		if(list_actionScopeNameGen != null) {
            	        for(Iterator it = list_actionScopeNameGen.iterator(); it.hasNext(); )  { 
            	            ANTLRv3Parser.actionScopeName_return r = (ANTLRv3Parser.actionScopeName_return) it.next(); 
            	            if(r != null && r.returnNode != null) {
            	            	r.returnNode.setKind("actionScopeName");
            	            	actionReturnNode.getChildren().add(r.returnNode);
            	            } 
            	        }
            	    }
            	    // Create a Token CST Leaf	
            	    if(TK_1 != null) {
            			Leaf TK_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
            	 		TK_1Leaf.setKind("TOKEN");
            	 		TK_1Leaf.setValue(TK_1.getText());
            			TK_1Leaf.setPos(TK_1.getCharPositionInLine());
            			TK_1Leaf.setLine(TK_1.getLine());
            	 		actionReturnNode.getChildren().add(TK_1Leaf);
            	 	}
            	    // Create a CST Node
            		if(list_idGen != null) {
            	        for(Iterator it = list_idGen.iterator(); it.hasNext(); )  { 
            	            ANTLRv3Parser.id_return r = (ANTLRv3Parser.id_return) it.next(); 
            	            if(r != null && r.returnNode != null) {
            	            	r.returnNode.setKind("id");
            	            	actionReturnNode.getChildren().add(r.returnNode);
            	            } 
            	        }
            	    }
            	    // Create a CST Leaf
            		if(ACTIONGen != null) {
            			Leaf ACTIONGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf();
            			ACTIONGenLeaf.setKind("ACTION");
            			ACTIONGenLeaf.setValue(ACTIONGen.getText());
            			ACTIONGenLeaf.setPos(ACTIONGen.getCharPositionInLine());
            			ACTIONGenLeaf.setLine(ACTIONGen.getLine());
            			actionReturnNode.getChildren().add(ACTIONGenLeaf);
            		}
            		// Returns the Node with CST Leaves/Nodes
            		retval.returnNode = actionReturnNode;
            	

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
    // $ANTLR end action

    public static class actionScopeName_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start actionScopeName
    // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:404:1: actionScopeName returns [Node returnNode] : (idGen+= id | TK_0= 'lexer' | TK_0= 'parser' );
    public final actionScopeName_return actionScopeName() throws RecognitionException {
        actionScopeName_return retval = new actionScopeName_return();
        retval.start = input.LT(1);

        Token TK_0=null;
        List list_idGen=null;
        RuleReturnScope idGen = null;
        try {
            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:405:1: (idGen+= id | TK_0= 'lexer' | TK_0= 'parser' )
            int alt12=3;
            switch ( input.LA(1) ) {
            case TOKEN_REF:
            case RULE_REF:
                {
                alt12=1;
                }
                break;
            case 65:
                {
                alt12=2;
                }
                break;
            case 66:
                {
                alt12=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("404:1: actionScopeName returns [Node returnNode] : (idGen+= id | TK_0= 'lexer' | TK_0= 'parser' );", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:405:3: idGen+= id
                    {
                    pushFollow(FOLLOW_id_in_actionScopeName649);
                    idGen=id();
                    _fsp--;

                    if (list_idGen==null) list_idGen=new ArrayList();
                    list_idGen.add(idGen);

                    
                    		// Create return CST Node
                    		Node actionScopeNameReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                    		actionScopeNameReturnNode.setKind("actionScopeName");
                    	    // Create a CST Node
                    		if(list_idGen != null) {
                    	        for(Iterator it = list_idGen.iterator(); it.hasNext(); )  { 
                    	            ANTLRv3Parser.id_return r = (ANTLRv3Parser.id_return) it.next(); 
                    	            if(r != null && r.returnNode != null) {
                    	            	r.returnNode.setKind("id");
                    	            	actionScopeNameReturnNode.getChildren().add(r.returnNode);
                    	            } 
                    	        }
                    	    }
                    		// Returns the Node with CST Leaves/Nodes
                    		retval.returnNode = actionScopeNameReturnNode;
                    	

                    }
                    break;
                case 2 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:423:4: TK_0= 'lexer'
                    {
                    TK_0=(Token)input.LT(1);
                    match(input,65,FOLLOW_65_in_actionScopeName660); 
                    
                    		// Create return CST Node
                    		Node actionScopeNameReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                    		actionScopeNameReturnNode.setKind("actionScopeName");
                    	    // Create a Token CST Leaf	
                    	    if(TK_0 != null) {
                    			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                    	 		TK_0Leaf.setKind("TOKEN");
                    	 		TK_0Leaf.setValue(TK_0.getText());
                    			TK_0Leaf.setPos(TK_0.getCharPositionInLine());
                    			TK_0Leaf.setLine(TK_0.getLine());
                    	 		actionScopeNameReturnNode.getChildren().add(TK_0Leaf);
                    	 	}
                    		// Returns the Node with CST Leaves/Nodes
                    		retval.returnNode = actionScopeNameReturnNode;
                    	

                    }
                    break;
                case 3 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:440:9: TK_0= 'parser'
                    {
                    TK_0=(Token)input.LT(1);
                    match(input,66,FOLLOW_66_in_actionScopeName677); 
                    
                    		// Create return CST Node
                    		Node actionScopeNameReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                    		actionScopeNameReturnNode.setKind("actionScopeName");
                    	    // Create a Token CST Leaf	
                    	    if(TK_0 != null) {
                    			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                    	 		TK_0Leaf.setKind("TOKEN");
                    	 		TK_0Leaf.setValue(TK_0.getText());
                    			TK_0Leaf.setPos(TK_0.getCharPositionInLine());
                    			TK_0Leaf.setLine(TK_0.getLine());
                    	 		actionScopeNameReturnNode.getChildren().add(TK_0Leaf);
                    	 	}
                    		// Returns the Node with CST Leaves/Nodes
                    		retval.returnNode = actionScopeNameReturnNode;
                    	

                    }
                    break;

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
    // $ANTLR end actionScopeName

    public static class optionsSpec_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start optionsSpec
    // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:459:1: optionsSpec returns [Node returnNode] : OPTIONSGen= OPTIONS (optionGen+= option TK_0= ';' )+ TK_1= '}' ;
    public final optionsSpec_return optionsSpec() throws RecognitionException {
        optionsSpec_return retval = new optionsSpec_return();
        retval.start = input.LT(1);

        Token OPTIONSGen=null;
        Token TK_0=null;
        Token TK_1=null;
        List list_optionGen=null;
        RuleReturnScope optionGen = null;
        try {
            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:460:1: (OPTIONSGen= OPTIONS (optionGen+= option TK_0= ';' )+ TK_1= '}' )
            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:460:3: OPTIONSGen= OPTIONS (optionGen+= option TK_0= ';' )+ TK_1= '}'
            {
            OPTIONSGen=(Token)input.LT(1);
            match(input,OPTIONS,FOLLOW_OPTIONS_in_optionsSpec698); 
            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:460:22: (optionGen+= option TK_0= ';' )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==TOKEN_REF||LA13_0==RULE_REF) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:460:23: optionGen+= option TK_0= ';'
            	    {
            	    pushFollow(FOLLOW_option_in_optionsSpec703);
            	    optionGen=option();
            	    _fsp--;

            	    if (list_optionGen==null) list_optionGen=new ArrayList();
            	    list_optionGen.add(optionGen);

            	    TK_0=(Token)input.LT(1);
            	    match(input,69,FOLLOW_69_in_optionsSpec707); 

            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
            } while (true);

            TK_1=(Token)input.LT(1);
            match(input,70,FOLLOW_70_in_optionsSpec713); 
            
            		// Create return CST Node
            		Node optionsSpecReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
            		optionsSpecReturnNode.setKind("optionsSpec");
            	    // Create a CST Leaf
            		if(OPTIONSGen != null) {
            			Leaf OPTIONSGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf();
            			OPTIONSGenLeaf.setKind("OPTIONS");
            			OPTIONSGenLeaf.setValue(OPTIONSGen.getText());
            			OPTIONSGenLeaf.setPos(OPTIONSGen.getCharPositionInLine());
            			OPTIONSGenLeaf.setLine(OPTIONSGen.getLine());
            			optionsSpecReturnNode.getChildren().add(OPTIONSGenLeaf);
            		}
            	
            		// Create a special CST Node for terminal optionGen aggregation
            		if(list_optionGen != null) {
            	    for(int pos = 0; pos < list_optionGen.size(); pos++ )  { 
            		// No Terminal extractor
            	    if(list_optionGen != null) {		
            	    	ANTLRv3Parser.option_return r = (ANTLRv3Parser.option_return) list_optionGen.get(pos); 
            	    	if(r != null && r.returnNode != null) {
            	        	r.returnNode.setKind("option");
            	    		optionsSpecReturnNode.getChildren().add(r.returnNode);
            	    	} 
            		}
            	    // Create a Token CST Leaf	
            	    if(TK_0 != null) {
            			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
            	 		TK_0Leaf.setKind("TOKEN");
            	 		TK_0Leaf.setValue(TK_0.getText());
            			TK_0Leaf.setPos(TK_0.getCharPositionInLine());
            			TK_0Leaf.setLine(TK_0.getLine());
            	 		optionsSpecReturnNode.getChildren().add(TK_0Leaf);
            	 	}
            		}
            		}
            	
            	    // Create a Token CST Leaf	
            	    if(TK_1 != null) {
            			Leaf TK_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
            	 		TK_1Leaf.setKind("TOKEN");
            	 		TK_1Leaf.setValue(TK_1.getText());
            			TK_1Leaf.setPos(TK_1.getCharPositionInLine());
            			TK_1Leaf.setLine(TK_1.getLine());
            	 		optionsSpecReturnNode.getChildren().add(TK_1Leaf);
            	 	}
            		// Returns the Node with CST Leaves/Nodes
            		retval.returnNode = optionsSpecReturnNode;
            	

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
    // $ANTLR end optionsSpec

    public static class option_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start option
    // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:512:1: option returns [Node returnNode] : idGen+= id TK_0= '=' optionValueGen+= optionValue ;
    public final option_return option() throws RecognitionException {
        option_return retval = new option_return();
        retval.start = input.LT(1);

        Token TK_0=null;
        List list_idGen=null;
        List list_optionValueGen=null;
        RuleReturnScope idGen = null;
        RuleReturnScope optionValueGen = null;
        try {
            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:513:1: (idGen+= id TK_0= '=' optionValueGen+= optionValue )
            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:513:5: idGen+= id TK_0= '=' optionValueGen+= optionValue
            {
            pushFollow(FOLLOW_id_in_option736);
            idGen=id();
            _fsp--;

            if (list_idGen==null) list_idGen=new ArrayList();
            list_idGen.add(idGen);

            TK_0=(Token)input.LT(1);
            match(input,71,FOLLOW_71_in_option740); 
            pushFollow(FOLLOW_optionValue_in_option744);
            optionValueGen=optionValue();
            _fsp--;

            if (list_optionValueGen==null) list_optionValueGen=new ArrayList();
            list_optionValueGen.add(optionValueGen);

            
            		// Create return CST Node
            		Node optionReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
            		optionReturnNode.setKind("option");
            	    // Create a CST Node
            		if(list_idGen != null) {
            	        for(Iterator it = list_idGen.iterator(); it.hasNext(); )  { 
            	            ANTLRv3Parser.id_return r = (ANTLRv3Parser.id_return) it.next(); 
            	            if(r != null && r.returnNode != null) {
            	            	r.returnNode.setKind("id");
            	            	optionReturnNode.getChildren().add(r.returnNode);
            	            } 
            	        }
            	    }
            	    // Create a Token CST Leaf	
            	    if(TK_0 != null) {
            			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
            	 		TK_0Leaf.setKind("TOKEN");
            	 		TK_0Leaf.setValue(TK_0.getText());
            			TK_0Leaf.setPos(TK_0.getCharPositionInLine());
            			TK_0Leaf.setLine(TK_0.getLine());
            	 		optionReturnNode.getChildren().add(TK_0Leaf);
            	 	}
            	    // Create a CST Node
            		if(list_optionValueGen != null) {
            	        for(Iterator it = list_optionValueGen.iterator(); it.hasNext(); )  { 
            	            ANTLRv3Parser.optionValue_return r = (ANTLRv3Parser.optionValue_return) it.next(); 
            	            if(r != null && r.returnNode != null) {
            	            	r.returnNode.setKind("optionValue");
            	            	optionReturnNode.getChildren().add(r.returnNode);
            	            } 
            	        }
            	    }
            		// Returns the Node with CST Leaves/Nodes
            		retval.returnNode = optionReturnNode;
            	

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
    // $ANTLR end option

    public static class optionValue_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start optionValue
    // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:552:1: optionValue returns [Node returnNode] : (idGen+= id | STRING_LITERALGen= STRING_LITERAL | CHAR_LITERALGen= CHAR_LITERAL | INTGen= INT | s= '*' );
    public final optionValue_return optionValue() throws RecognitionException {
        optionValue_return retval = new optionValue_return();
        retval.start = input.LT(1);

        Token STRING_LITERALGen=null;
        Token CHAR_LITERALGen=null;
        Token INTGen=null;
        Token s=null;
        List list_idGen=null;
        RuleReturnScope idGen = null;
        try {
            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:553:1: (idGen+= id | STRING_LITERALGen= STRING_LITERAL | CHAR_LITERALGen= CHAR_LITERAL | INTGen= INT | s= '*' )
            int alt14=5;
            switch ( input.LA(1) ) {
            case TOKEN_REF:
            case RULE_REF:
                {
                alt14=1;
                }
                break;
            case STRING_LITERAL:
                {
                alt14=2;
                }
                break;
            case CHAR_LITERAL:
                {
                alt14=3;
                }
                break;
            case INT:
                {
                alt14=4;
                }
                break;
            case 74:
                {
                alt14=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("552:1: optionValue returns [Node returnNode] : (idGen+= id | STRING_LITERALGen= STRING_LITERAL | CHAR_LITERALGen= CHAR_LITERAL | INTGen= INT | s= '*' );", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:553:5: idGen+= id
                    {
                    pushFollow(FOLLOW_id_in_optionValue771);
                    idGen=id();
                    _fsp--;

                    if (list_idGen==null) list_idGen=new ArrayList();
                    list_idGen.add(idGen);

                    
                    		// Create return CST Node
                    		Node optionValueReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                    		optionValueReturnNode.setKind("optionValue");
                    	    // Create a CST Node
                    		if(list_idGen != null) {
                    	        for(Iterator it = list_idGen.iterator(); it.hasNext(); )  { 
                    	            ANTLRv3Parser.id_return r = (ANTLRv3Parser.id_return) it.next(); 
                    	            if(r != null && r.returnNode != null) {
                    	            	r.returnNode.setKind("id");
                    	            	optionValueReturnNode.getChildren().add(r.returnNode);
                    	            } 
                    	        }
                    	    }
                    		// Returns the Node with CST Leaves/Nodes
                    		retval.returnNode = optionValueReturnNode;
                    	

                    }
                    break;
                case 2 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:571:9: STRING_LITERALGen= STRING_LITERAL
                    {
                    STRING_LITERALGen=(Token)input.LT(1);
                    match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_optionValue787); 
                    
                    		// Create return CST Node
                    		Node optionValueReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                    		optionValueReturnNode.setKind("optionValue");
                    	    // Create a CST Leaf
                    		if(STRING_LITERALGen != null) {
                    			Leaf STRING_LITERALGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                    			STRING_LITERALGenLeaf.setKind("STRING_LITERAL");
                    			STRING_LITERALGenLeaf.setValue(STRING_LITERALGen.getText());
                    			STRING_LITERALGenLeaf.setPos(STRING_LITERALGen.getCharPositionInLine());
                    			STRING_LITERALGenLeaf.setLine(STRING_LITERALGen.getLine());
                    			optionValueReturnNode.getChildren().add(STRING_LITERALGenLeaf);
                    		}
                    		// Returns the Node with CST Leaves/Nodes
                    		retval.returnNode = optionValueReturnNode;
                    	

                    }
                    break;
                case 3 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:588:9: CHAR_LITERALGen= CHAR_LITERAL
                    {
                    CHAR_LITERALGen=(Token)input.LT(1);
                    match(input,CHAR_LITERAL,FOLLOW_CHAR_LITERAL_in_optionValue803); 
                    
                    		// Create return CST Node
                    		Node optionValueReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                    		optionValueReturnNode.setKind("optionValue");
                    	    // Create a CST Leaf
                    		if(CHAR_LITERALGen != null) {
                    			Leaf CHAR_LITERALGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                    			CHAR_LITERALGenLeaf.setKind("CHAR_LITERAL");
                    			CHAR_LITERALGenLeaf.setValue(CHAR_LITERALGen.getText());
                    			CHAR_LITERALGenLeaf.setPos(CHAR_LITERALGen.getCharPositionInLine());
                    			CHAR_LITERALGenLeaf.setLine(CHAR_LITERALGen.getLine());
                    			optionValueReturnNode.getChildren().add(CHAR_LITERALGenLeaf);
                    		}
                    		// Returns the Node with CST Leaves/Nodes
                    		retval.returnNode = optionValueReturnNode;
                    	

                    }
                    break;
                case 4 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:605:9: INTGen= INT
                    {
                    INTGen=(Token)input.LT(1);
                    match(input,INT,FOLLOW_INT_in_optionValue819); 
                    
                    		// Create return CST Node
                    		Node optionValueReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                    		optionValueReturnNode.setKind("optionValue");
                    	    // Create a CST Leaf
                    		if(INTGen != null) {
                    			Leaf INTGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                    			INTGenLeaf.setKind("INT");
                    			INTGenLeaf.setValue(INTGen.getText());
                    			INTGenLeaf.setPos(INTGen.getCharPositionInLine());
                    			INTGenLeaf.setLine(INTGen.getLine());
                    			optionValueReturnNode.getChildren().add(INTGenLeaf);
                    		}
                    		// Returns the Node with CST Leaves/Nodes
                    		retval.returnNode = optionValueReturnNode;
                    	

                    }
                    break;
                case 5 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:622:7: s= '*'
                    {
                    s=(Token)input.LT(1);
                    match(input,74,FOLLOW_74_in_optionValue833); 
                    
                    		// Create return CST Node
                    		Node optionValueReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                    		optionValueReturnNode.setKind("optionValue");
                    	    // Create a CST Leaf
                    		if(s != null) {
                    			Leaf sLeaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                    			sLeaf.setKind("s");
                    			sLeaf.setValue(s.getText());
                    			sLeaf.setPos(s.getCharPositionInLine());
                    			sLeaf.setLine(s.getLine());
                    			optionValueReturnNode.getChildren().add(sLeaf);
                    		}
                    		// Returns the Node with CST Leaves/Nodes
                    		retval.returnNode = optionValueReturnNode;
                    	

                    }
                    break;

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
    // $ANTLR end optionValue

    public static class rule_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start rule
    // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:641:1: rule returns [Node returnNode] : (DOC_COMMENTGen= DOC_COMMENT )? ( (TK_0= 'protected' | TK_1= 'public' | TK_2= 'private' | TK_3= 'fragment' ) )? ruleName+= id (TK_4= '!' )? (ARG_ACTIONGen= ARG_ACTION )? (TK_5= 'returns' ARG_ACTIONGen_1= ARG_ACTION )? (throwsSpecGen+= throwsSpec )? (optionsSpecGen+= optionsSpec )? (ruleScopeSpecGen+= ruleScopeSpec )? (ruleActionGen+= ruleAction )* TK_6= ':' altListGen+= altList TK_7= ';' (exceptionGroupGen+= exceptionGroup )? ;
    public final rule_return rule() throws RecognitionException {
        rule_return retval = new rule_return();
        retval.start = input.LT(1);

        Token DOC_COMMENTGen=null;
        Token TK_0=null;
        Token TK_1=null;
        Token TK_2=null;
        Token TK_3=null;
        Token TK_4=null;
        Token ARG_ACTIONGen=null;
        Token TK_5=null;
        Token ARG_ACTIONGen_1=null;
        Token TK_6=null;
        Token TK_7=null;
        List list_ruleName=null;
        List list_throwsSpecGen=null;
        List list_optionsSpecGen=null;
        List list_ruleScopeSpecGen=null;
        List list_ruleActionGen=null;
        List list_altListGen=null;
        List list_exceptionGroupGen=null;
        RuleReturnScope ruleName = null;
        RuleReturnScope throwsSpecGen = null;
        RuleReturnScope optionsSpecGen = null;
        RuleReturnScope ruleScopeSpecGen = null;
        RuleReturnScope ruleActionGen = null;
        RuleReturnScope altListGen = null;
        RuleReturnScope exceptionGroupGen = null;
        try {
            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:642:1: ( (DOC_COMMENTGen= DOC_COMMENT )? ( (TK_0= 'protected' | TK_1= 'public' | TK_2= 'private' | TK_3= 'fragment' ) )? ruleName+= id (TK_4= '!' )? (ARG_ACTIONGen= ARG_ACTION )? (TK_5= 'returns' ARG_ACTIONGen_1= ARG_ACTION )? (throwsSpecGen+= throwsSpec )? (optionsSpecGen+= optionsSpec )? (ruleScopeSpecGen+= ruleScopeSpec )? (ruleActionGen+= ruleAction )* TK_6= ':' altListGen+= altList TK_7= ';' (exceptionGroupGen+= exceptionGroup )? )
            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:642:3: (DOC_COMMENTGen= DOC_COMMENT )? ( (TK_0= 'protected' | TK_1= 'public' | TK_2= 'private' | TK_3= 'fragment' ) )? ruleName+= id (TK_4= '!' )? (ARG_ACTIONGen= ARG_ACTION )? (TK_5= 'returns' ARG_ACTIONGen_1= ARG_ACTION )? (throwsSpecGen+= throwsSpec )? (optionsSpecGen+= optionsSpec )? (ruleScopeSpecGen+= ruleScopeSpec )? (ruleActionGen+= ruleAction )* TK_6= ':' altListGen+= altList TK_7= ';' (exceptionGroupGen+= exceptionGroup )?
            {
            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:642:17: (DOC_COMMENTGen= DOC_COMMENT )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==DOC_COMMENT) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:642:17: DOC_COMMENTGen= DOC_COMMENT
                    {
                    DOC_COMMENTGen=(Token)input.LT(1);
                    match(input,DOC_COMMENT,FOLLOW_DOC_COMMENT_in_rule858); 

                    }
                    break;

            }

            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:643:3: ( (TK_0= 'protected' | TK_1= 'public' | TK_2= 'private' | TK_3= 'fragment' ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==FRAGMENT||(LA17_0>=75 && LA17_0<=77)) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:643:5: (TK_0= 'protected' | TK_1= 'public' | TK_2= 'private' | TK_3= 'fragment' )
                    {
                    // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:643:5: (TK_0= 'protected' | TK_1= 'public' | TK_2= 'private' | TK_3= 'fragment' )
                    int alt16=4;
                    switch ( input.LA(1) ) {
                    case 75:
                        {
                        alt16=1;
                        }
                        break;
                    case 76:
                        {
                        alt16=2;
                        }
                        break;
                    case 77:
                        {
                        alt16=3;
                        }
                        break;
                    case FRAGMENT:
                        {
                        alt16=4;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("643:5: (TK_0= 'protected' | TK_1= 'public' | TK_2= 'private' | TK_3= 'fragment' )", 16, 0, input);

                        throw nvae;
                    }

                    switch (alt16) {
                        case 1 :
                            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:643:6: TK_0= 'protected'
                            {
                            TK_0=(Token)input.LT(1);
                            match(input,75,FOLLOW_75_in_rule868); 

                            }
                            break;
                        case 2 :
                            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:643:23: TK_1= 'public'
                            {
                            TK_1=(Token)input.LT(1);
                            match(input,76,FOLLOW_76_in_rule872); 

                            }
                            break;
                        case 3 :
                            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:643:37: TK_2= 'private'
                            {
                            TK_2=(Token)input.LT(1);
                            match(input,77,FOLLOW_77_in_rule876); 

                            }
                            break;
                        case 4 :
                            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:643:52: TK_3= 'fragment'
                            {
                            TK_3=(Token)input.LT(1);
                            match(input,FRAGMENT,FOLLOW_FRAGMENT_in_rule880); 

                            }
                            break;

                    }


                    }
                    break;

            }

            pushFollow(FOLLOW_id_in_rule890);
            ruleName=id();
            _fsp--;

            if (list_ruleName==null) list_ruleName=new ArrayList();
            list_ruleName.add(ruleName);

            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:645:7: (TK_4= '!' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==BANG) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:645:7: TK_4= '!'
                    {
                    TK_4=(Token)input.LT(1);
                    match(input,BANG,FOLLOW_BANG_in_rule897); 

                    }
                    break;

            }

            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:646:3: (ARG_ACTIONGen= ARG_ACTION )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==ARG_ACTION) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:646:5: ARG_ACTIONGen= ARG_ACTION
                    {
                    ARG_ACTIONGen=(Token)input.LT(1);
                    match(input,ARG_ACTION,FOLLOW_ARG_ACTION_in_rule906); 

                    }
                    break;

            }

            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:647:3: (TK_5= 'returns' ARG_ACTIONGen_1= ARG_ACTION )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==78) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:647:5: TK_5= 'returns' ARG_ACTIONGen_1= ARG_ACTION
                    {
                    TK_5=(Token)input.LT(1);
                    match(input,78,FOLLOW_78_in_rule917); 
                    ARG_ACTIONGen_1=(Token)input.LT(1);
                    match(input,ARG_ACTION,FOLLOW_ARG_ACTION_in_rule921); 

                    }
                    break;

            }

            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:648:16: (throwsSpecGen+= throwsSpec )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==80) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:648:16: throwsSpecGen+= throwsSpec
                    {
                    pushFollow(FOLLOW_throwsSpec_in_rule931);
                    throwsSpecGen=throwsSpec();
                    _fsp--;

                    if (list_throwsSpecGen==null) list_throwsSpecGen=new ArrayList();
                    list_throwsSpecGen.add(throwsSpecGen);


                    }
                    break;

            }

            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:648:44: (optionsSpecGen+= optionsSpec )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==OPTIONS) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:648:44: optionsSpecGen+= optionsSpec
                    {
                    pushFollow(FOLLOW_optionsSpec_in_rule936);
                    optionsSpecGen=optionsSpec();
                    _fsp--;

                    if (list_optionsSpecGen==null) list_optionsSpecGen=new ArrayList();
                    list_optionsSpecGen.add(optionsSpecGen);


                    }
                    break;

            }

            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:648:75: (ruleScopeSpecGen+= ruleScopeSpec )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==SCOPE) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:648:75: ruleScopeSpecGen+= ruleScopeSpec
                    {
                    pushFollow(FOLLOW_ruleScopeSpec_in_rule941);
                    ruleScopeSpecGen=ruleScopeSpec();
                    _fsp--;

                    if (list_ruleScopeSpecGen==null) list_ruleScopeSpecGen=new ArrayList();
                    list_ruleScopeSpecGen.add(ruleScopeSpecGen);


                    }
                    break;

            }

            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:648:105: (ruleActionGen+= ruleAction )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==72) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:648:105: ruleActionGen+= ruleAction
            	    {
            	    pushFollow(FOLLOW_ruleAction_in_rule946);
            	    ruleActionGen=ruleAction();
            	    _fsp--;

            	    if (list_ruleActionGen==null) list_ruleActionGen=new ArrayList();
            	    list_ruleActionGen.add(ruleActionGen);


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            TK_6=(Token)input.LT(1);
            match(input,79,FOLLOW_79_in_rule953); 
            pushFollow(FOLLOW_altList_in_rule957);
            altListGen=altList();
            _fsp--;

            if (list_altListGen==null) list_altListGen=new ArrayList();
            list_altListGen.add(altListGen);

            TK_7=(Token)input.LT(1);
            match(input,69,FOLLOW_69_in_rule961); 
            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:650:20: (exceptionGroupGen+= exceptionGroup )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( ((LA25_0>=85 && LA25_0<=86)) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:650:20: exceptionGroupGen+= exceptionGroup
                    {
                    pushFollow(FOLLOW_exceptionGroup_in_rule967);
                    exceptionGroupGen=exceptionGroup();
                    _fsp--;

                    if (list_exceptionGroupGen==null) list_exceptionGroupGen=new ArrayList();
                    list_exceptionGroupGen.add(exceptionGroupGen);


                    }
                    break;

            }

            
            		// Create return CST Node
            		Node ruleReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
            		ruleReturnNode.setKind("rule");
            	    // Create a CST Leaf
            		if(DOC_COMMENTGen != null) {
            			Leaf DOC_COMMENTGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf();
            			DOC_COMMENTGenLeaf.setKind("DOC_COMMENT");
            			DOC_COMMENTGenLeaf.setValue(DOC_COMMENTGen.getText());
            			DOC_COMMENTGenLeaf.setPos(DOC_COMMENTGen.getCharPositionInLine());
            			DOC_COMMENTGenLeaf.setLine(DOC_COMMENTGen.getLine());
            			ruleReturnNode.getChildren().add(DOC_COMMENTGenLeaf);
            		}
            	    // Create a Token CST Leaf	
            	    if(TK_0 != null) {
            			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
            	 		TK_0Leaf.setKind("TOKEN");
            	 		TK_0Leaf.setValue(TK_0.getText());
            			TK_0Leaf.setPos(TK_0.getCharPositionInLine());
            			TK_0Leaf.setLine(TK_0.getLine());
            	 		ruleReturnNode.getChildren().add(TK_0Leaf);
            	 	}
            	    // Create a Token CST Leaf	
            	    if(TK_1 != null) {
            			Leaf TK_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
            	 		TK_1Leaf.setKind("TOKEN");
            	 		TK_1Leaf.setValue(TK_1.getText());
            			TK_1Leaf.setPos(TK_1.getCharPositionInLine());
            			TK_1Leaf.setLine(TK_1.getLine());
            	 		ruleReturnNode.getChildren().add(TK_1Leaf);
            	 	}
            	    // Create a Token CST Leaf	
            	    if(TK_2 != null) {
            			Leaf TK_2Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
            	 		TK_2Leaf.setKind("TOKEN");
            	 		TK_2Leaf.setValue(TK_2.getText());
            			TK_2Leaf.setPos(TK_2.getCharPositionInLine());
            			TK_2Leaf.setLine(TK_2.getLine());
            	 		ruleReturnNode.getChildren().add(TK_2Leaf);
            	 	}
            	    // Create a Token CST Leaf	
            	    if(TK_3 != null) {
            			Leaf TK_3Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
            	 		TK_3Leaf.setKind("TOKEN");
            	 		TK_3Leaf.setValue(TK_3.getText());
            			TK_3Leaf.setPos(TK_3.getCharPositionInLine());
            			TK_3Leaf.setLine(TK_3.getLine());
            	 		ruleReturnNode.getChildren().add(TK_3Leaf);
            	 	}
            	    // Create a CST Node
            		if(list_ruleName != null) {
            	        for(Iterator it = list_ruleName.iterator(); it.hasNext(); )  { 
            	            ANTLRv3Parser.id_return r = (ANTLRv3Parser.id_return) it.next(); 
            	            if(r != null && r.returnNode != null) {
            	            	r.returnNode.setKind("ruleName");
            	            	ruleReturnNode.getChildren().add(r.returnNode);
            	            } 
            	        }
            	    }
            	    // Create a Token CST Leaf	
            	    if(TK_4 != null) {
            			Leaf TK_4Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
            	 		TK_4Leaf.setKind("TOKEN");
            	 		TK_4Leaf.setValue(TK_4.getText());
            			TK_4Leaf.setPos(TK_4.getCharPositionInLine());
            			TK_4Leaf.setLine(TK_4.getLine());
            	 		ruleReturnNode.getChildren().add(TK_4Leaf);
            	 	}
            	    // Create a CST Leaf
            		if(ARG_ACTIONGen != null) {
            			Leaf ARG_ACTIONGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf();
            			ARG_ACTIONGenLeaf.setKind("ARG_ACTION");
            			ARG_ACTIONGenLeaf.setValue(ARG_ACTIONGen.getText());
            			ARG_ACTIONGenLeaf.setPos(ARG_ACTIONGen.getCharPositionInLine());
            			ARG_ACTIONGenLeaf.setLine(ARG_ACTIONGen.getLine());
            			ruleReturnNode.getChildren().add(ARG_ACTIONGenLeaf);
            		}
            	    // Create a Token CST Leaf	
            	    if(TK_5 != null) {
            			Leaf TK_5Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
            	 		TK_5Leaf.setKind("TOKEN");
            	 		TK_5Leaf.setValue(TK_5.getText());
            			TK_5Leaf.setPos(TK_5.getCharPositionInLine());
            			TK_5Leaf.setLine(TK_5.getLine());
            	 		ruleReturnNode.getChildren().add(TK_5Leaf);
            	 	}
            	    // Create a CST Leaf
            		if(ARG_ACTIONGen_1 != null) {
            			Leaf ARG_ACTIONGen_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
            			ARG_ACTIONGen_1Leaf.setKind("ARG_ACTION");
            			ARG_ACTIONGen_1Leaf.setValue(ARG_ACTIONGen_1.getText());
            			ARG_ACTIONGen_1Leaf.setPos(ARG_ACTIONGen_1.getCharPositionInLine());
            			ARG_ACTIONGen_1Leaf.setLine(ARG_ACTIONGen_1.getLine());
            			ruleReturnNode.getChildren().add(ARG_ACTIONGen_1Leaf);
            		}
            	    // Create a CST Node
            		if(list_throwsSpecGen != null) {
            	        for(Iterator it = list_throwsSpecGen.iterator(); it.hasNext(); )  { 
            	            ANTLRv3Parser.throwsSpec_return r = (ANTLRv3Parser.throwsSpec_return) it.next(); 
            	            if(r != null && r.returnNode != null) {
            	            	r.returnNode.setKind("throwsSpec");
            	            	ruleReturnNode.getChildren().add(r.returnNode);
            	            } 
            	        }
            	    }
            	    // Create a CST Node
            		if(list_optionsSpecGen != null) {
            	        for(Iterator it = list_optionsSpecGen.iterator(); it.hasNext(); )  { 
            	            ANTLRv3Parser.optionsSpec_return r = (ANTLRv3Parser.optionsSpec_return) it.next(); 
            	            if(r != null && r.returnNode != null) {
            	            	r.returnNode.setKind("optionsSpec");
            	            	ruleReturnNode.getChildren().add(r.returnNode);
            	            } 
            	        }
            	    }
            	    // Create a CST Node
            		if(list_ruleScopeSpecGen != null) {
            	        for(Iterator it = list_ruleScopeSpecGen.iterator(); it.hasNext(); )  { 
            	            ANTLRv3Parser.ruleScopeSpec_return r = (ANTLRv3Parser.ruleScopeSpec_return) it.next(); 
            	            if(r != null && r.returnNode != null) {
            	            	r.returnNode.setKind("ruleScopeSpec");
            	            	ruleReturnNode.getChildren().add(r.returnNode);
            	            } 
            	        }
            	    }
            	    // Create a CST Node
            		if(list_ruleActionGen != null) {
            	        for(Iterator it = list_ruleActionGen.iterator(); it.hasNext(); )  { 
            	            ANTLRv3Parser.ruleAction_return r = (ANTLRv3Parser.ruleAction_return) it.next(); 
            	            if(r != null && r.returnNode != null) {
            	            	r.returnNode.setKind("ruleAction");
            	            	ruleReturnNode.getChildren().add(r.returnNode);
            	            } 
            	        }
            	    }
            	    // Create a Token CST Leaf	
            	    if(TK_6 != null) {
            			Leaf TK_6Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
            	 		TK_6Leaf.setKind("TOKEN");
            	 		TK_6Leaf.setValue(TK_6.getText());
            			TK_6Leaf.setPos(TK_6.getCharPositionInLine());
            			TK_6Leaf.setLine(TK_6.getLine());
            	 		ruleReturnNode.getChildren().add(TK_6Leaf);
            	 	}
            	    // Create a CST Node
            		if(list_altListGen != null) {
            	        for(Iterator it = list_altListGen.iterator(); it.hasNext(); )  { 
            	            ANTLRv3Parser.altList_return r = (ANTLRv3Parser.altList_return) it.next(); 
            	            if(r != null && r.returnNode != null) {
            	            	r.returnNode.setKind("altList");
            	            	ruleReturnNode.getChildren().add(r.returnNode);
            	            } 
            	        }
            	    }
            	    // Create a Token CST Leaf	
            	    if(TK_7 != null) {
            			Leaf TK_7Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
            	 		TK_7Leaf.setKind("TOKEN");
            	 		TK_7Leaf.setValue(TK_7.getText());
            			TK_7Leaf.setPos(TK_7.getCharPositionInLine());
            			TK_7Leaf.setLine(TK_7.getLine());
            	 		ruleReturnNode.getChildren().add(TK_7Leaf);
            	 	}
            	    // Create a CST Node
            		if(list_exceptionGroupGen != null) {
            	        for(Iterator it = list_exceptionGroupGen.iterator(); it.hasNext(); )  { 
            	            ANTLRv3Parser.exceptionGroup_return r = (ANTLRv3Parser.exceptionGroup_return) it.next(); 
            	            if(r != null && r.returnNode != null) {
            	            	r.returnNode.setKind("exceptionGroup");
            	            	ruleReturnNode.getChildren().add(r.returnNode);
            	            } 
            	        }
            	    }
            		// Returns the Node with CST Leaves/Nodes
            		retval.returnNode = ruleReturnNode;
            	

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
    // $ANTLR end rule

    public static class ruleAction_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start ruleAction
    // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:829:1: ruleAction returns [Node returnNode] : TK_0= '@' idGen+= id ACTIONGen= ACTION ;
    public final ruleAction_return ruleAction() throws RecognitionException {
        ruleAction_return retval = new ruleAction_return();
        retval.start = input.LT(1);

        Token TK_0=null;
        Token ACTIONGen=null;
        List list_idGen=null;
        RuleReturnScope idGen = null;
        try {
            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:830:1: (TK_0= '@' idGen+= id ACTIONGen= ACTION )
            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:830:3: TK_0= '@' idGen+= id ACTIONGen= ACTION
            {
            TK_0=(Token)input.LT(1);
            match(input,72,FOLLOW_72_in_ruleAction989); 
            pushFollow(FOLLOW_id_in_ruleAction993);
            idGen=id();
            _fsp--;

            if (list_idGen==null) list_idGen=new ArrayList();
            list_idGen.add(idGen);

            ACTIONGen=(Token)input.LT(1);
            match(input,ACTION,FOLLOW_ACTION_in_ruleAction997); 
            
            		// Create return CST Node
            		Node ruleActionReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
            		ruleActionReturnNode.setKind("ruleAction");
            	    // Create a Token CST Leaf	
            	    if(TK_0 != null) {
            			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
            	 		TK_0Leaf.setKind("TOKEN");
            	 		TK_0Leaf.setValue(TK_0.getText());
            			TK_0Leaf.setPos(TK_0.getCharPositionInLine());
            			TK_0Leaf.setLine(TK_0.getLine());
            	 		ruleActionReturnNode.getChildren().add(TK_0Leaf);
            	 	}
            	    // Create a CST Node
            		if(list_idGen != null) {
            	        for(Iterator it = list_idGen.iterator(); it.hasNext(); )  { 
            	            ANTLRv3Parser.id_return r = (ANTLRv3Parser.id_return) it.next(); 
            	            if(r != null && r.returnNode != null) {
            	            	r.returnNode.setKind("id");
            	            	ruleActionReturnNode.getChildren().add(r.returnNode);
            	            } 
            	        }
            	    }
            	    // Create a CST Leaf
            		if(ACTIONGen != null) {
            			Leaf ACTIONGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf();
            			ACTIONGenLeaf.setKind("ACTION");
            			ACTIONGenLeaf.setValue(ACTIONGen.getText());
            			ACTIONGenLeaf.setPos(ACTIONGen.getCharPositionInLine());
            			ACTIONGenLeaf.setLine(ACTIONGen.getLine());
            			ruleActionReturnNode.getChildren().add(ACTIONGenLeaf);
            		}
            		// Returns the Node with CST Leaves/Nodes
            		retval.returnNode = ruleActionReturnNode;
            	

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
    // $ANTLR end ruleAction

    public static class throwsSpec_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start throwsSpec
    // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:868:1: throwsSpec returns [Node returnNode] : TK_0= 'throws' idGen+= id (TK_1= ',' idGen_1+= id )* ;
    public final throwsSpec_return throwsSpec() throws RecognitionException {
        throwsSpec_return retval = new throwsSpec_return();
        retval.start = input.LT(1);

        Token TK_0=null;
        Token TK_1=null;
        List list_idGen=null;
        List list_idGen_1=null;
        RuleReturnScope idGen = null;
        RuleReturnScope idGen_1 = null;
        try {
            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:869:1: (TK_0= 'throws' idGen+= id (TK_1= ',' idGen_1+= id )* )
            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:869:3: TK_0= 'throws' idGen+= id (TK_1= ',' idGen_1+= id )*
            {
            TK_0=(Token)input.LT(1);
            match(input,80,FOLLOW_80_in_throwsSpec1018); 
            pushFollow(FOLLOW_id_in_throwsSpec1022);
            idGen=id();
            _fsp--;

            if (list_idGen==null) list_idGen=new ArrayList();
            list_idGen.add(idGen);

            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:869:27: (TK_1= ',' idGen_1+= id )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==81) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:869:29: TK_1= ',' idGen_1+= id
            	    {
            	    TK_1=(Token)input.LT(1);
            	    match(input,81,FOLLOW_81_in_throwsSpec1028); 
            	    pushFollow(FOLLOW_id_in_throwsSpec1032);
            	    idGen_1=id();
            	    _fsp--;

            	    if (list_idGen_1==null) list_idGen_1=new ArrayList();
            	    list_idGen_1.add(idGen_1);


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

            
            		// Create return CST Node
            		Node throwsSpecReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
            		throwsSpecReturnNode.setKind("throwsSpec");
            	    // Create a Token CST Leaf	
            	    if(TK_0 != null) {
            			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
            	 		TK_0Leaf.setKind("TOKEN");
            	 		TK_0Leaf.setValue(TK_0.getText());
            			TK_0Leaf.setPos(TK_0.getCharPositionInLine());
            			TK_0Leaf.setLine(TK_0.getLine());
            	 		throwsSpecReturnNode.getChildren().add(TK_0Leaf);
            	 	}
            	    // Create a CST Node
            		if(list_idGen != null) {
            	        for(Iterator it = list_idGen.iterator(); it.hasNext(); )  { 
            	            ANTLRv3Parser.id_return r = (ANTLRv3Parser.id_return) it.next(); 
            	            if(r != null && r.returnNode != null) {
            	            	r.returnNode.setKind("id");
            	            	throwsSpecReturnNode.getChildren().add(r.returnNode);
            	            } 
            	        }
            	    }
            	
            		// Create a special CST Node for terminal idGen_1 aggregation
            		if(list_idGen_1 != null) {
            	    for(int pos = 0; pos < list_idGen_1.size(); pos++ )  { 
            	    // Create a Token CST Leaf	
            	    if(TK_1 != null) {
            			Leaf TK_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
            	 		TK_1Leaf.setKind("TOKEN");
            	 		TK_1Leaf.setValue(TK_1.getText());
            			TK_1Leaf.setPos(TK_1.getCharPositionInLine());
            			TK_1Leaf.setLine(TK_1.getLine());
            	 		throwsSpecReturnNode.getChildren().add(TK_1Leaf);
            	 	}
            		// No Terminal extractor
            	    if(list_idGen_1 != null) {		
            	    	ANTLRv3Parser.id_return r = (ANTLRv3Parser.id_return) list_idGen_1.get(pos); 
            	    	if(r != null && r.returnNode != null) {
            	        	r.returnNode.setKind("id");
            	    		throwsSpecReturnNode.getChildren().add(r.returnNode);
            	    	} 
            		}
            		}
            		}
            	
            		// Returns the Node with CST Leaves/Nodes
            		retval.returnNode = throwsSpecReturnNode;
            	

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
    // $ANTLR end throwsSpec

    public static class ruleScopeSpec_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start ruleScopeSpec
    // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:922:1: ruleScopeSpec returns [Node returnNode] : (TK_0= 'scope' ACTIONGen= ACTION | TK_0= 'scope' idGen+= id (TK_1= ',' idGen_1+= id )* TK_2= ';' | TK_0= 'scope' ACTIONGen= ACTION TK_1= 'scope' idGen+= id (TK_2= ',' idGen_1+= id )* TK_3= ';' );
    public final ruleScopeSpec_return ruleScopeSpec() throws RecognitionException {
        ruleScopeSpec_return retval = new ruleScopeSpec_return();
        retval.start = input.LT(1);

        Token TK_0=null;
        Token ACTIONGen=null;
        Token TK_1=null;
        Token TK_2=null;
        Token TK_3=null;
        List list_idGen=null;
        List list_idGen_1=null;
        RuleReturnScope idGen = null;
        RuleReturnScope idGen_1 = null;
        try {
            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:923:1: (TK_0= 'scope' ACTIONGen= ACTION | TK_0= 'scope' idGen+= id (TK_1= ',' idGen_1+= id )* TK_2= ';' | TK_0= 'scope' ACTIONGen= ACTION TK_1= 'scope' idGen+= id (TK_2= ',' idGen_1+= id )* TK_3= ';' )
            int alt29=3;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==SCOPE) ) {
                int LA29_1 = input.LA(2);

                if ( (LA29_1==ACTION) ) {
                    int LA29_2 = input.LA(3);

                    if ( (LA29_2==SCOPE) ) {
                        alt29=3;
                    }
                    else if ( (LA29_2==72||LA29_2==79) ) {
                        alt29=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("922:1: ruleScopeSpec returns [Node returnNode] : (TK_0= 'scope' ACTIONGen= ACTION | TK_0= 'scope' idGen+= id (TK_1= ',' idGen_1+= id )* TK_2= ';' | TK_0= 'scope' ACTIONGen= ACTION TK_1= 'scope' idGen+= id (TK_2= ',' idGen_1+= id )* TK_3= ';' );", 29, 2, input);

                        throw nvae;
                    }
                }
                else if ( (LA29_1==TOKEN_REF||LA29_1==RULE_REF) ) {
                    alt29=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("922:1: ruleScopeSpec returns [Node returnNode] : (TK_0= 'scope' ACTIONGen= ACTION | TK_0= 'scope' idGen+= id (TK_1= ',' idGen_1+= id )* TK_2= ';' | TK_0= 'scope' ACTIONGen= ACTION TK_1= 'scope' idGen+= id (TK_2= ',' idGen_1+= id )* TK_3= ';' );", 29, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("922:1: ruleScopeSpec returns [Node returnNode] : (TK_0= 'scope' ACTIONGen= ACTION | TK_0= 'scope' idGen+= id (TK_1= ',' idGen_1+= id )* TK_2= ';' | TK_0= 'scope' ACTIONGen= ACTION TK_1= 'scope' idGen+= id (TK_2= ',' idGen_1+= id )* TK_3= ';' );", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:923:3: TK_0= 'scope' ACTIONGen= ACTION
                    {
                    TK_0=(Token)input.LT(1);
                    match(input,SCOPE,FOLLOW_SCOPE_in_ruleScopeSpec1057); 
                    ACTIONGen=(Token)input.LT(1);
                    match(input,ACTION,FOLLOW_ACTION_in_ruleScopeSpec1061); 
                    
                    		// Create return CST Node
                    		Node ruleScopeSpecReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                    		ruleScopeSpecReturnNode.setKind("ruleScopeSpec");
                    	    // Create a Token CST Leaf	
                    	    if(TK_0 != null) {
                    			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                    	 		TK_0Leaf.setKind("TOKEN");
                    	 		TK_0Leaf.setValue(TK_0.getText());
                    			TK_0Leaf.setPos(TK_0.getCharPositionInLine());
                    			TK_0Leaf.setLine(TK_0.getLine());
                    	 		ruleScopeSpecReturnNode.getChildren().add(TK_0Leaf);
                    	 	}
                    	    // Create a CST Leaf
                    		if(ACTIONGen != null) {
                    			Leaf ACTIONGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                    			ACTIONGenLeaf.setKind("ACTION");
                    			ACTIONGenLeaf.setValue(ACTIONGen.getText());
                    			ACTIONGenLeaf.setPos(ACTIONGen.getCharPositionInLine());
                    			ACTIONGenLeaf.setLine(ACTIONGen.getLine());
                    			ruleScopeSpecReturnNode.getChildren().add(ACTIONGenLeaf);
                    		}
                    		// Returns the Node with CST Leaves/Nodes
                    		retval.returnNode = ruleScopeSpecReturnNode;
                    	

                    }
                    break;
                case 2 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:949:4: TK_0= 'scope' idGen+= id (TK_1= ',' idGen_1+= id )* TK_2= ';'
                    {
                    TK_0=(Token)input.LT(1);
                    match(input,SCOPE,FOLLOW_SCOPE_in_ruleScopeSpec1073); 
                    pushFollow(FOLLOW_id_in_ruleScopeSpec1077);
                    idGen=id();
                    _fsp--;

                    if (list_idGen==null) list_idGen=new ArrayList();
                    list_idGen.add(idGen);

                    // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:949:27: (TK_1= ',' idGen_1+= id )*
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( (LA27_0==81) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:949:28: TK_1= ',' idGen_1+= id
                    	    {
                    	    TK_1=(Token)input.LT(1);
                    	    match(input,81,FOLLOW_81_in_ruleScopeSpec1082); 
                    	    pushFollow(FOLLOW_id_in_ruleScopeSpec1086);
                    	    idGen_1=id();
                    	    _fsp--;

                    	    if (list_idGen_1==null) list_idGen_1=new ArrayList();
                    	    list_idGen_1.add(idGen_1);


                    	    }
                    	    break;

                    	default :
                    	    break loop27;
                        }
                    } while (true);

                    TK_2=(Token)input.LT(1);
                    match(input,69,FOLLOW_69_in_ruleScopeSpec1092); 
                    
                    		// Create return CST Node
                    		Node ruleScopeSpecReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                    		ruleScopeSpecReturnNode.setKind("ruleScopeSpec");
                    	    // Create a Token CST Leaf	
                    	    if(TK_0 != null) {
                    			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                    	 		TK_0Leaf.setKind("TOKEN");
                    	 		TK_0Leaf.setValue(TK_0.getText());
                    			TK_0Leaf.setPos(TK_0.getCharPositionInLine());
                    			TK_0Leaf.setLine(TK_0.getLine());
                    	 		ruleScopeSpecReturnNode.getChildren().add(TK_0Leaf);
                    	 	}
                    	    // Create a CST Node
                    		if(list_idGen != null) {
                    	        for(Iterator it = list_idGen.iterator(); it.hasNext(); )  { 
                    	            ANTLRv3Parser.id_return r = (ANTLRv3Parser.id_return) it.next(); 
                    	            if(r != null && r.returnNode != null) {
                    	            	r.returnNode.setKind("id");
                    	            	ruleScopeSpecReturnNode.getChildren().add(r.returnNode);
                    	            } 
                    	        }
                    	    }
                    	
                    		// Create a special CST Node for terminal idGen_1 aggregation
                    		if(list_idGen_1 != null) {
                    	    for(int pos = 0; pos < list_idGen_1.size(); pos++ )  { 
                    	    // Create a Token CST Leaf	
                    	    if(TK_1 != null) {
                    			Leaf TK_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                    	 		TK_1Leaf.setKind("TOKEN");
                    	 		TK_1Leaf.setValue(TK_1.getText());
                    			TK_1Leaf.setPos(TK_1.getCharPositionInLine());
                    			TK_1Leaf.setLine(TK_1.getLine());
                    	 		ruleScopeSpecReturnNode.getChildren().add(TK_1Leaf);
                    	 	}
                    		// No Terminal extractor
                    	    if(list_idGen_1 != null) {		
                    	    	ANTLRv3Parser.id_return r = (ANTLRv3Parser.id_return) list_idGen_1.get(pos); 
                    	    	if(r != null && r.returnNode != null) {
                    	        	r.returnNode.setKind("id");
                    	    		ruleScopeSpecReturnNode.getChildren().add(r.returnNode);
                    	    	} 
                    		}
                    		}
                    		}
                    	
                    	    // Create a Token CST Leaf	
                    	    if(TK_2 != null) {
                    			Leaf TK_2Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                    	 		TK_2Leaf.setKind("TOKEN");
                    	 		TK_2Leaf.setValue(TK_2.getText());
                    			TK_2Leaf.setPos(TK_2.getCharPositionInLine());
                    			TK_2Leaf.setLine(TK_2.getLine());
                    	 		ruleScopeSpecReturnNode.getChildren().add(TK_2Leaf);
                    	 	}
                    		// Returns the Node with CST Leaves/Nodes
                    		retval.returnNode = ruleScopeSpecReturnNode;
                    	

                    }
                    break;
                case 3 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:1009:4: TK_0= 'scope' ACTIONGen= ACTION TK_1= 'scope' idGen+= id (TK_2= ',' idGen_1+= id )* TK_3= ';'
                    {
                    TK_0=(Token)input.LT(1);
                    match(input,SCOPE,FOLLOW_SCOPE_in_ruleScopeSpec1104); 
                    ACTIONGen=(Token)input.LT(1);
                    match(input,ACTION,FOLLOW_ACTION_in_ruleScopeSpec1108); 
                    TK_1=(Token)input.LT(1);
                    match(input,SCOPE,FOLLOW_SCOPE_in_ruleScopeSpec1114); 
                    pushFollow(FOLLOW_id_in_ruleScopeSpec1118);
                    idGen=id();
                    _fsp--;

                    if (list_idGen==null) list_idGen=new ArrayList();
                    list_idGen.add(idGen);

                    // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:1010:26: (TK_2= ',' idGen_1+= id )*
                    loop28:
                    do {
                        int alt28=2;
                        int LA28_0 = input.LA(1);

                        if ( (LA28_0==81) ) {
                            alt28=1;
                        }


                        switch (alt28) {
                    	case 1 :
                    	    // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:1010:27: TK_2= ',' idGen_1+= id
                    	    {
                    	    TK_2=(Token)input.LT(1);
                    	    match(input,81,FOLLOW_81_in_ruleScopeSpec1123); 
                    	    pushFollow(FOLLOW_id_in_ruleScopeSpec1127);
                    	    idGen_1=id();
                    	    _fsp--;

                    	    if (list_idGen_1==null) list_idGen_1=new ArrayList();
                    	    list_idGen_1.add(idGen_1);


                    	    }
                    	    break;

                    	default :
                    	    break loop28;
                        }
                    } while (true);

                    TK_3=(Token)input.LT(1);
                    match(input,69,FOLLOW_69_in_ruleScopeSpec1133); 
                    
                    		// Create return CST Node
                    		Node ruleScopeSpecReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                    		ruleScopeSpecReturnNode.setKind("ruleScopeSpec");
                    	    // Create a Token CST Leaf	
                    	    if(TK_0 != null) {
                    			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                    	 		TK_0Leaf.setKind("TOKEN");
                    	 		TK_0Leaf.setValue(TK_0.getText());
                    			TK_0Leaf.setPos(TK_0.getCharPositionInLine());
                    			TK_0Leaf.setLine(TK_0.getLine());
                    	 		ruleScopeSpecReturnNode.getChildren().add(TK_0Leaf);
                    	 	}
                    	    // Create a CST Leaf
                    		if(ACTIONGen != null) {
                    			Leaf ACTIONGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                    			ACTIONGenLeaf.setKind("ACTION");
                    			ACTIONGenLeaf.setValue(ACTIONGen.getText());
                    			ACTIONGenLeaf.setPos(ACTIONGen.getCharPositionInLine());
                    			ACTIONGenLeaf.setLine(ACTIONGen.getLine());
                    			ruleScopeSpecReturnNode.getChildren().add(ACTIONGenLeaf);
                    		}
                    	    // Create a Token CST Leaf	
                    	    if(TK_1 != null) {
                    			Leaf TK_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                    	 		TK_1Leaf.setKind("TOKEN");
                    	 		TK_1Leaf.setValue(TK_1.getText());
                    			TK_1Leaf.setPos(TK_1.getCharPositionInLine());
                    			TK_1Leaf.setLine(TK_1.getLine());
                    	 		ruleScopeSpecReturnNode.getChildren().add(TK_1Leaf);
                    	 	}
                    	    // Create a CST Node
                    		if(list_idGen != null) {
                    	        for(Iterator it = list_idGen.iterator(); it.hasNext(); )  { 
                    	            ANTLRv3Parser.id_return r = (ANTLRv3Parser.id_return) it.next(); 
                    	            if(r != null && r.returnNode != null) {
                    	            	r.returnNode.setKind("id");
                    	            	ruleScopeSpecReturnNode.getChildren().add(r.returnNode);
                    	            } 
                    	        }
                    	    }
                    	
                    		// Create a special CST Node for terminal idGen_1 aggregation
                    		if(list_idGen_1 != null) {
                    	    for(int pos = 0; pos < list_idGen_1.size(); pos++ )  { 
                    	    // Create a Token CST Leaf	
                    	    if(TK_2 != null) {
                    			Leaf TK_2Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                    	 		TK_2Leaf.setKind("TOKEN");
                    	 		TK_2Leaf.setValue(TK_2.getText());
                    			TK_2Leaf.setPos(TK_2.getCharPositionInLine());
                    			TK_2Leaf.setLine(TK_2.getLine());
                    	 		ruleScopeSpecReturnNode.getChildren().add(TK_2Leaf);
                    	 	}
                    		// No Terminal extractor
                    	    if(list_idGen_1 != null) {		
                    	    	ANTLRv3Parser.id_return r = (ANTLRv3Parser.id_return) list_idGen_1.get(pos); 
                    	    	if(r != null && r.returnNode != null) {
                    	        	r.returnNode.setKind("id");
                    	    		ruleScopeSpecReturnNode.getChildren().add(r.returnNode);
                    	    	} 
                    		}
                    		}
                    		}
                    	
                    	    // Create a Token CST Leaf	
                    	    if(TK_3 != null) {
                    			Leaf TK_3Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                    	 		TK_3Leaf.setKind("TOKEN");
                    	 		TK_3Leaf.setValue(TK_3.getText());
                    			TK_3Leaf.setPos(TK_3.getCharPositionInLine());
                    			TK_3Leaf.setLine(TK_3.getLine());
                    	 		ruleScopeSpecReturnNode.getChildren().add(TK_3Leaf);
                    	 	}
                    		// Returns the Node with CST Leaves/Nodes
                    		retval.returnNode = ruleScopeSpecReturnNode;
                    	

                    }
                    break;

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
    // $ANTLR end ruleScopeSpec

    public static class block_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start block
    // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:1090:1: block returns [Node returnNode] : TK_0= '(' ( (optionsSpecGen+= optionsSpec )? TK_1= ':' )? alternativeGen+= alternative rewriteGen+= rewrite (TK_2= '|' alternativeGen_1+= alternative rewriteGen_1+= rewrite )* TK_3= ')' ;
    public final block_return block() throws RecognitionException {
        block_return retval = new block_return();
        retval.start = input.LT(1);

        Token TK_0=null;
        Token TK_1=null;
        Token TK_2=null;
        Token TK_3=null;
        List list_optionsSpecGen=null;
        List list_alternativeGen=null;
        List list_rewriteGen=null;
        List list_alternativeGen_1=null;
        List list_rewriteGen_1=null;
        RuleReturnScope optionsSpecGen = null;
        RuleReturnScope alternativeGen = null;
        RuleReturnScope rewriteGen = null;
        RuleReturnScope alternativeGen_1 = null;
        RuleReturnScope rewriteGen_1 = null;
        try {
            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:1091:1: (TK_0= '(' ( (optionsSpecGen+= optionsSpec )? TK_1= ':' )? alternativeGen+= alternative rewriteGen+= rewrite (TK_2= '|' alternativeGen_1+= alternative rewriteGen_1+= rewrite )* TK_3= ')' )
            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:1091:5: TK_0= '(' ( (optionsSpecGen+= optionsSpec )? TK_1= ':' )? alternativeGen+= alternative rewriteGen+= rewrite (TK_2= '|' alternativeGen_1+= alternative rewriteGen_1+= rewrite )* TK_3= ')'
            {
            TK_0=(Token)input.LT(1);
            match(input,82,FOLLOW_82_in_block1156); 
            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:1092:3: ( (optionsSpecGen+= optionsSpec )? TK_1= ':' )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==OPTIONS||LA31_0==79) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:1092:5: (optionsSpecGen+= optionsSpec )? TK_1= ':'
                    {
                    // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:1092:5: (optionsSpecGen+= optionsSpec )?
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0==OPTIONS) ) {
                        alt30=1;
                    }
                    switch (alt30) {
                        case 1 :
                            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:1092:6: optionsSpecGen+= optionsSpec
                            {
                            pushFollow(FOLLOW_optionsSpec_in_block1165);
                            optionsSpecGen=optionsSpec();
                            _fsp--;

                            if (list_optionsSpecGen==null) list_optionsSpecGen=new ArrayList();
                            list_optionsSpecGen.add(optionsSpecGen);


                            }
                            break;

                    }

                    TK_1=(Token)input.LT(1);
                    match(input,79,FOLLOW_79_in_block1171); 

                    }
                    break;

            }

            pushFollow(FOLLOW_alternative_in_block1180);
            alternativeGen=alternative();
            _fsp--;

            if (list_alternativeGen==null) list_alternativeGen=new ArrayList();
            list_alternativeGen.add(alternativeGen);

            pushFollow(FOLLOW_rewrite_in_block1184);
            rewriteGen=rewrite();
            _fsp--;

            if (list_rewriteGen==null) list_rewriteGen=new ArrayList();
            list_rewriteGen.add(rewriteGen);

            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:1093:51: (TK_2= '|' alternativeGen_1+= alternative rewriteGen_1+= rewrite )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==83) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:1093:53: TK_2= '|' alternativeGen_1+= alternative rewriteGen_1+= rewrite
            	    {
            	    TK_2=(Token)input.LT(1);
            	    match(input,83,FOLLOW_83_in_block1190); 
            	    pushFollow(FOLLOW_alternative_in_block1194);
            	    alternativeGen_1=alternative();
            	    _fsp--;

            	    if (list_alternativeGen_1==null) list_alternativeGen_1=new ArrayList();
            	    list_alternativeGen_1.add(alternativeGen_1);

            	    pushFollow(FOLLOW_rewrite_in_block1198);
            	    rewriteGen_1=rewrite();
            	    _fsp--;

            	    if (list_rewriteGen_1==null) list_rewriteGen_1=new ArrayList();
            	    list_rewriteGen_1.add(rewriteGen_1);


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

            TK_3=(Token)input.LT(1);
            match(input,84,FOLLOW_84_in_block1213); 
            
            		// Create return CST Node
            		Node blockReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
            		blockReturnNode.setKind("block");
            	    // Create a Token CST Leaf	
            	    if(TK_0 != null) {
            			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
            	 		TK_0Leaf.setKind("TOKEN");
            	 		TK_0Leaf.setValue(TK_0.getText());
            			TK_0Leaf.setPos(TK_0.getCharPositionInLine());
            			TK_0Leaf.setLine(TK_0.getLine());
            	 		blockReturnNode.getChildren().add(TK_0Leaf);
            	 	}
            	    // Create a CST Node
            		if(list_optionsSpecGen != null) {
            	        for(Iterator it = list_optionsSpecGen.iterator(); it.hasNext(); )  { 
            	            ANTLRv3Parser.optionsSpec_return r = (ANTLRv3Parser.optionsSpec_return) it.next(); 
            	            if(r != null && r.returnNode != null) {
            	            	r.returnNode.setKind("optionsSpec");
            	            	blockReturnNode.getChildren().add(r.returnNode);
            	            } 
            	        }
            	    }
            	    // Create a Token CST Leaf	
            	    if(TK_1 != null) {
            			Leaf TK_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
            	 		TK_1Leaf.setKind("TOKEN");
            	 		TK_1Leaf.setValue(TK_1.getText());
            			TK_1Leaf.setPos(TK_1.getCharPositionInLine());
            			TK_1Leaf.setLine(TK_1.getLine());
            	 		blockReturnNode.getChildren().add(TK_1Leaf);
            	 	}
            	    // Create a CST Node
            		if(list_alternativeGen != null) {
            	        for(Iterator it = list_alternativeGen.iterator(); it.hasNext(); )  { 
            	            ANTLRv3Parser.alternative_return r = (ANTLRv3Parser.alternative_return) it.next(); 
            	            if(r != null && r.returnNode != null) {
            	            	r.returnNode.setKind("alternative");
            	            	blockReturnNode.getChildren().add(r.returnNode);
            	            } 
            	        }
            	    }
            	    // Create a CST Node
            		if(list_rewriteGen != null) {
            	        for(Iterator it = list_rewriteGen.iterator(); it.hasNext(); )  { 
            	            ANTLRv3Parser.rewrite_return r = (ANTLRv3Parser.rewrite_return) it.next(); 
            	            if(r != null && r.returnNode != null) {
            	            	r.returnNode.setKind("rewrite");
            	            	blockReturnNode.getChildren().add(r.returnNode);
            	            } 
            	        }
            	    }
            	
            		// Create a special CST Node for terminal alternativeGen_1 aggregation
            		if(list_alternativeGen_1 != null) {
            	    for(int pos = 0; pos < list_alternativeGen_1.size(); pos++ )  { 
            	    // Create a Token CST Leaf	
            	    if(TK_2 != null) {
            			Leaf TK_2Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
            	 		TK_2Leaf.setKind("TOKEN");
            	 		TK_2Leaf.setValue(TK_2.getText());
            			TK_2Leaf.setPos(TK_2.getCharPositionInLine());
            			TK_2Leaf.setLine(TK_2.getLine());
            	 		blockReturnNode.getChildren().add(TK_2Leaf);
            	 	}
            		// No Terminal extractor
            	    if(list_alternativeGen_1 != null) {		
            	    	ANTLRv3Parser.alternative_return r = (ANTLRv3Parser.alternative_return) list_alternativeGen_1.get(pos); 
            	    	if(r != null && r.returnNode != null) {
            	        	r.returnNode.setKind("alternative");
            	    		blockReturnNode.getChildren().add(r.returnNode);
            	    	} 
            		}
            		// No Terminal extractor
            	    if(list_rewriteGen_1 != null) {		
            	    	ANTLRv3Parser.rewrite_return r = (ANTLRv3Parser.rewrite_return) list_rewriteGen_1.get(pos); 
            	    	if(r != null && r.returnNode != null) {
            	        	r.returnNode.setKind("rewrite");
            	    		blockReturnNode.getChildren().add(r.returnNode);
            	    	} 
            		}
            		}
            		}
            	
            	    // Create a Token CST Leaf	
            	    if(TK_3 != null) {
            			Leaf TK_3Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
            	 		TK_3Leaf.setKind("TOKEN");
            	 		TK_3Leaf.setValue(TK_3.getText());
            			TK_3Leaf.setPos(TK_3.getCharPositionInLine());
            			TK_3Leaf.setLine(TK_3.getLine());
            	 		blockReturnNode.getChildren().add(TK_3Leaf);
            	 	}
            		// Returns the Node with CST Leaves/Nodes
            		retval.returnNode = blockReturnNode;
            	

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
    // $ANTLR end block

    public static class altList_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start altList
    // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:1193:1: altList returns [Node returnNode] : a1+= alternative rewriteGen+= rewrite (TK_0= '|' a2+= alternative rewriteGen_1+= rewrite )* ;
    public final altList_return altList() throws RecognitionException {
        altList_return retval = new altList_return();
        retval.start = input.LT(1);

        Token TK_0=null;
        List list_a1=null;
        List list_rewriteGen=null;
        List list_a2=null;
        List list_rewriteGen_1=null;
        RuleReturnScope a1 = null;
        RuleReturnScope rewriteGen = null;
        RuleReturnScope a2 = null;
        RuleReturnScope rewriteGen_1 = null;
        try {
            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:1194:1: (a1+= alternative rewriteGen+= rewrite (TK_0= '|' a2+= alternative rewriteGen_1+= rewrite )* )
            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:1194:5: a1+= alternative rewriteGen+= rewrite (TK_0= '|' a2+= alternative rewriteGen_1+= rewrite )*
            {
            pushFollow(FOLLOW_alternative_in_altList1239);
            a1=alternative();
            _fsp--;

            if (list_a1==null) list_a1=new ArrayList();
            list_a1.add(a1);

            pushFollow(FOLLOW_rewrite_in_altList1243);
            rewriteGen=rewrite();
            _fsp--;

            if (list_rewriteGen==null) list_rewriteGen=new ArrayList();
            list_rewriteGen.add(rewriteGen);

            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:1194:41: (TK_0= '|' a2+= alternative rewriteGen_1+= rewrite )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==83) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:1194:43: TK_0= '|' a2+= alternative rewriteGen_1+= rewrite
            	    {
            	    TK_0=(Token)input.LT(1);
            	    match(input,83,FOLLOW_83_in_altList1249); 
            	    pushFollow(FOLLOW_alternative_in_altList1253);
            	    a2=alternative();
            	    _fsp--;

            	    if (list_a2==null) list_a2=new ArrayList();
            	    list_a2.add(a2);

            	    pushFollow(FOLLOW_rewrite_in_altList1257);
            	    rewriteGen_1=rewrite();
            	    _fsp--;

            	    if (list_rewriteGen_1==null) list_rewriteGen_1=new ArrayList();
            	    list_rewriteGen_1.add(rewriteGen_1);


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

            
            		// Create return CST Node
            		Node altListReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
            		altListReturnNode.setKind("altList");
            	    // Create a CST Node
            		if(list_a1 != null) {
            	        for(Iterator it = list_a1.iterator(); it.hasNext(); )  { 
            	            ANTLRv3Parser.alternative_return r = (ANTLRv3Parser.alternative_return) it.next(); 
            	            if(r != null && r.returnNode != null) {
            	            	r.returnNode.setKind("a1");
            	            	altListReturnNode.getChildren().add(r.returnNode);
            	            } 
            	        }
            	    }
            	    // Create a CST Node
            		if(list_rewriteGen != null) {
            	        for(Iterator it = list_rewriteGen.iterator(); it.hasNext(); )  { 
            	            ANTLRv3Parser.rewrite_return r = (ANTLRv3Parser.rewrite_return) it.next(); 
            	            if(r != null && r.returnNode != null) {
            	            	r.returnNode.setKind("rewrite");
            	            	altListReturnNode.getChildren().add(r.returnNode);
            	            } 
            	        }
            	    }
            	
            		// Create a special CST Node for terminal a2 aggregation
            		if(list_a2 != null) {
            	    for(int pos = 0; pos < list_a2.size(); pos++ )  { 
            	    // Create a Token CST Leaf	
            	    if(TK_0 != null) {
            			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
            	 		TK_0Leaf.setKind("TOKEN");
            	 		TK_0Leaf.setValue(TK_0.getText());
            			TK_0Leaf.setPos(TK_0.getCharPositionInLine());
            			TK_0Leaf.setLine(TK_0.getLine());
            	 		altListReturnNode.getChildren().add(TK_0Leaf);
            	 	}
            		// No Terminal extractor
            	    if(list_a2 != null) {		
            	    	ANTLRv3Parser.alternative_return r = (ANTLRv3Parser.alternative_return) list_a2.get(pos); 
            	    	if(r != null && r.returnNode != null) {
            	        	r.returnNode.setKind("a2");
            	    		altListReturnNode.getChildren().add(r.returnNode);
            	    	} 
            		}
            		// No Terminal extractor
            	    if(list_rewriteGen_1 != null) {		
            	    	ANTLRv3Parser.rewrite_return r = (ANTLRv3Parser.rewrite_return) list_rewriteGen_1.get(pos); 
            	    	if(r != null && r.returnNode != null) {
            	        	r.returnNode.setKind("rewrite");
            	    		altListReturnNode.getChildren().add(r.returnNode);
            	    	} 
            		}
            		}
            		}
            	
            		// Returns the Node with CST Leaves/Nodes
            		retval.returnNode = altListReturnNode;
            	

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
    // $ANTLR end altList

    public static class alternative_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start alternative
    // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:1256:1: alternative returns [Node returnNode] : ( (elementGen+= element )+ | );
    public final alternative_return alternative() throws RecognitionException {
        alternative_return retval = new alternative_return();
        retval.start = input.LT(1);

        List list_elementGen=null;
        RuleReturnScope elementGen = null;
        try {
            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:1257:1: ( (elementGen+= element )+ | )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==SEMPRED||LA35_0==TREE_BEGIN||(LA35_0>=TOKEN_REF && LA35_0<=ACTION)||LA35_0==RULE_REF||LA35_0==82||LA35_0==89||LA35_0==92) ) {
                alt35=1;
            }
            else if ( (LA35_0==REWRITE||LA35_0==69||(LA35_0>=83 && LA35_0<=84)) ) {
                alt35=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1256:1: alternative returns [Node returnNode] : ( (elementGen+= element )+ | );", 35, 0, input);

                throw nvae;
            }
            switch (alt35) {
                case 1 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:1257:5: (elementGen+= element )+
                    {
                    // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:1257:15: (elementGen+= element )+
                    int cnt34=0;
                    loop34:
                    do {
                        int alt34=2;
                        int LA34_0 = input.LA(1);

                        if ( (LA34_0==SEMPRED||LA34_0==TREE_BEGIN||(LA34_0>=TOKEN_REF && LA34_0<=ACTION)||LA34_0==RULE_REF||LA34_0==82||LA34_0==89||LA34_0==92) ) {
                            alt34=1;
                        }


                        switch (alt34) {
                    	case 1 :
                    	    // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:1257:15: elementGen+= element
                    	    {
                    	    pushFollow(FOLLOW_element_in_alternative1286);
                    	    elementGen=element();
                    	    _fsp--;

                    	    if (list_elementGen==null) list_elementGen=new ArrayList();
                    	    list_elementGen.add(elementGen);


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt34 >= 1 ) break loop34;
                                EarlyExitException eee =
                                    new EarlyExitException(34, input);
                                throw eee;
                        }
                        cnt34++;
                    } while (true);

                    
                    		// Create return CST Node
                    		Node alternativeReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                    		alternativeReturnNode.setKind("alternative");
                    	    // Create a CST Node
                    		if(list_elementGen != null) {
                    	        for(Iterator it = list_elementGen.iterator(); it.hasNext(); )  { 
                    	            ANTLRv3Parser.element_return r = (ANTLRv3Parser.element_return) it.next(); 
                    	            if(r != null && r.returnNode != null) {
                    	            	r.returnNode.setKind("element");
                    	            	alternativeReturnNode.getChildren().add(r.returnNode);
                    	            } 
                    	        }
                    	    }
                    		// Returns the Node with CST Leaves/Nodes
                    		retval.returnNode = alternativeReturnNode;
                    	

                    }
                    break;
                case 2 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:1276:5: 
                    {
                    }
                    break;

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
    // $ANTLR end alternative

    public static class exceptionGroup_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start exceptionGroup
    // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:1278:1: exceptionGroup returns [Node returnNode] : ( (exceptionHandlerGen+= exceptionHandler )+ (finallyClauseGen+= finallyClause )? | finallyClauseGen+= finallyClause );
    public final exceptionGroup_return exceptionGroup() throws RecognitionException {
        exceptionGroup_return retval = new exceptionGroup_return();
        retval.start = input.LT(1);

        List list_exceptionHandlerGen=null;
        List list_finallyClauseGen=null;
        RuleReturnScope exceptionHandlerGen = null;
        RuleReturnScope finallyClauseGen = null;
        try {
            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:1279:1: ( (exceptionHandlerGen+= exceptionHandler )+ (finallyClauseGen+= finallyClause )? | finallyClauseGen+= finallyClause )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==85) ) {
                alt38=1;
            }
            else if ( (LA38_0==86) ) {
                alt38=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1278:1: exceptionGroup returns [Node returnNode] : ( (exceptionHandlerGen+= exceptionHandler )+ (finallyClauseGen+= finallyClause )? | finallyClauseGen+= finallyClause );", 38, 0, input);

                throw nvae;
            }
            switch (alt38) {
                case 1 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:1279:3: (exceptionHandlerGen+= exceptionHandler )+ (finallyClauseGen+= finallyClause )?
                    {
                    // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:1279:3: (exceptionHandlerGen+= exceptionHandler )+
                    int cnt36=0;
                    loop36:
                    do {
                        int alt36=2;
                        int LA36_0 = input.LA(1);

                        if ( (LA36_0==85) ) {
                            alt36=1;
                        }


                        switch (alt36) {
                    	case 1 :
                    	    // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:1279:5: exceptionHandlerGen+= exceptionHandler
                    	    {
                    	    pushFollow(FOLLOW_exceptionHandler_in_exceptionGroup1323);
                    	    exceptionHandlerGen=exceptionHandler();
                    	    _fsp--;

                    	    if (list_exceptionHandlerGen==null) list_exceptionHandlerGen=new ArrayList();
                    	    list_exceptionHandlerGen.add(exceptionHandlerGen);


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

                    // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:1279:46: (finallyClauseGen+= finallyClause )?
                    int alt37=2;
                    int LA37_0 = input.LA(1);

                    if ( (LA37_0==86) ) {
                        alt37=1;
                    }
                    switch (alt37) {
                        case 1 :
                            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:1279:48: finallyClauseGen+= finallyClause
                            {
                            pushFollow(FOLLOW_finallyClause_in_exceptionGroup1332);
                            finallyClauseGen=finallyClause();
                            _fsp--;

                            if (list_finallyClauseGen==null) list_finallyClauseGen=new ArrayList();
                            list_finallyClauseGen.add(finallyClauseGen);


                            }
                            break;

                    }

                    
                    		// Create return CST Node
                    		Node exceptionGroupReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                    		exceptionGroupReturnNode.setKind("exceptionGroup");
                    	    // Create a CST Node
                    		if(list_exceptionHandlerGen != null) {
                    	        for(Iterator it = list_exceptionHandlerGen.iterator(); it.hasNext(); )  { 
                    	            ANTLRv3Parser.exceptionHandler_return r = (ANTLRv3Parser.exceptionHandler_return) it.next(); 
                    	            if(r != null && r.returnNode != null) {
                    	            	r.returnNode.setKind("exceptionHandler");
                    	            	exceptionGroupReturnNode.getChildren().add(r.returnNode);
                    	            } 
                    	        }
                    	    }
                    	    // Create a CST Node
                    		if(list_finallyClauseGen != null) {
                    	        for(Iterator it = list_finallyClauseGen.iterator(); it.hasNext(); )  { 
                    	            ANTLRv3Parser.finallyClause_return r = (ANTLRv3Parser.finallyClause_return) it.next(); 
                    	            if(r != null && r.returnNode != null) {
                    	            	r.returnNode.setKind("finallyClause");
                    	            	exceptionGroupReturnNode.getChildren().add(r.returnNode);
                    	            } 
                    	        }
                    	    }
                    		// Returns the Node with CST Leaves/Nodes
                    		retval.returnNode = exceptionGroupReturnNode;
                    	

                    }
                    break;
                case 2 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:1307:4: finallyClauseGen+= finallyClause
                    {
                    pushFollow(FOLLOW_finallyClause_in_exceptionGroup1346);
                    finallyClauseGen=finallyClause();
                    _fsp--;

                    if (list_finallyClauseGen==null) list_finallyClauseGen=new ArrayList();
                    list_finallyClauseGen.add(finallyClauseGen);

                    
                    		// Create return CST Node
                    		Node exceptionGroupReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                    		exceptionGroupReturnNode.setKind("exceptionGroup");
                    	    // Create a CST Node
                    		if(list_finallyClauseGen != null) {
                    	        for(Iterator it = list_finallyClauseGen.iterator(); it.hasNext(); )  { 
                    	            ANTLRv3Parser.finallyClause_return r = (ANTLRv3Parser.finallyClause_return) it.next(); 
                    	            if(r != null && r.returnNode != null) {
                    	            	r.returnNode.setKind("finallyClause");
                    	            	exceptionGroupReturnNode.getChildren().add(r.returnNode);
                    	            } 
                    	        }
                    	    }
                    		// Returns the Node with CST Leaves/Nodes
                    		retval.returnNode = exceptionGroupReturnNode;
                    	

                    }
                    break;

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
    // $ANTLR end exceptionGroup

    public static class exceptionHandler_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start exceptionHandler
    // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:1327:1: exceptionHandler returns [Node returnNode] : TK_0= 'catch' ARG_ACTIONGen= ARG_ACTION ACTIONGen= ACTION ;
    public final exceptionHandler_return exceptionHandler() throws RecognitionException {
        exceptionHandler_return retval = new exceptionHandler_return();
        retval.start = input.LT(1);

        Token TK_0=null;
        Token ARG_ACTIONGen=null;
        Token ACTIONGen=null;

        try {
            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:1328:1: (TK_0= 'catch' ARG_ACTIONGen= ARG_ACTION ACTIONGen= ACTION )
            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:1328:6: TK_0= 'catch' ARG_ACTIONGen= ARG_ACTION ACTIONGen= ACTION
            {
            TK_0=(Token)input.LT(1);
            match(input,85,FOLLOW_85_in_exceptionHandler1373); 
            ARG_ACTIONGen=(Token)input.LT(1);
            match(input,ARG_ACTION,FOLLOW_ARG_ACTION_in_exceptionHandler1377); 
            ACTIONGen=(Token)input.LT(1);
            match(input,ACTION,FOLLOW_ACTION_in_exceptionHandler1381); 
            
            		// Create return CST Node
            		Node exceptionHandlerReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
            		exceptionHandlerReturnNode.setKind("exceptionHandler");
            	    // Create a Token CST Leaf	
            	    if(TK_0 != null) {
            			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
            	 		TK_0Leaf.setKind("TOKEN");
            	 		TK_0Leaf.setValue(TK_0.getText());
            			TK_0Leaf.setPos(TK_0.getCharPositionInLine());
            			TK_0Leaf.setLine(TK_0.getLine());
            	 		exceptionHandlerReturnNode.getChildren().add(TK_0Leaf);
            	 	}
            	    // Create a CST Leaf
            		if(ARG_ACTIONGen != null) {
            			Leaf ARG_ACTIONGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf();
            			ARG_ACTIONGenLeaf.setKind("ARG_ACTION");
            			ARG_ACTIONGenLeaf.setValue(ARG_ACTIONGen.getText());
            			ARG_ACTIONGenLeaf.setPos(ARG_ACTIONGen.getCharPositionInLine());
            			ARG_ACTIONGenLeaf.setLine(ARG_ACTIONGen.getLine());
            			exceptionHandlerReturnNode.getChildren().add(ARG_ACTIONGenLeaf);
            		}
            	    // Create a CST Leaf
            		if(ACTIONGen != null) {
            			Leaf ACTIONGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf();
            			ACTIONGenLeaf.setKind("ACTION");
            			ACTIONGenLeaf.setValue(ACTIONGen.getText());
            			ACTIONGenLeaf.setPos(ACTIONGen.getCharPositionInLine());
            			ACTIONGenLeaf.setLine(ACTIONGen.getLine());
            			exceptionHandlerReturnNode.getChildren().add(ACTIONGenLeaf);
            		}
            		// Returns the Node with CST Leaves/Nodes
            		retval.returnNode = exceptionHandlerReturnNode;
            	

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
    // $ANTLR end exceptionHandler

    public static class finallyClause_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start finallyClause
    // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:1365:1: finallyClause returns [Node returnNode] : TK_0= 'finally' ACTIONGen= ACTION ;
    public final finallyClause_return finallyClause() throws RecognitionException {
        finallyClause_return retval = new finallyClause_return();
        retval.start = input.LT(1);

        Token TK_0=null;
        Token ACTIONGen=null;

        try {
            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:1366:1: (TK_0= 'finally' ACTIONGen= ACTION )
            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:1366:6: TK_0= 'finally' ACTIONGen= ACTION
            {
            TK_0=(Token)input.LT(1);
            match(input,86,FOLLOW_86_in_finallyClause1409); 
            ACTIONGen=(Token)input.LT(1);
            match(input,ACTION,FOLLOW_ACTION_in_finallyClause1413); 
            
            		// Create return CST Node
            		Node finallyClauseReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
            		finallyClauseReturnNode.setKind("finallyClause");
            	    // Create a Token CST Leaf	
            	    if(TK_0 != null) {
            			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
            	 		TK_0Leaf.setKind("TOKEN");
            	 		TK_0Leaf.setValue(TK_0.getText());
            			TK_0Leaf.setPos(TK_0.getCharPositionInLine());
            			TK_0Leaf.setLine(TK_0.getLine());
            	 		finallyClauseReturnNode.getChildren().add(TK_0Leaf);
            	 	}
            	    // Create a CST Leaf
            		if(ACTIONGen != null) {
            			Leaf ACTIONGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf();
            			ACTIONGenLeaf.setKind("ACTION");
            			ACTIONGenLeaf.setValue(ACTIONGen.getText());
            			ACTIONGenLeaf.setPos(ACTIONGen.getCharPositionInLine());
            			ACTIONGenLeaf.setLine(ACTIONGen.getLine());
            			finallyClauseReturnNode.getChildren().add(ACTIONGenLeaf);
            		}
            		// Returns the Node with CST Leaves/Nodes
            		retval.returnNode = finallyClauseReturnNode;
            	

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
    // $ANTLR end finallyClause

    public static class element_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start element
    // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:1394:1: element returns [Node returnNode] : elementNoOptionSpecGen+= elementNoOptionSpec ;
    public final element_return element() throws RecognitionException {
        element_return retval = new element_return();
        retval.start = input.LT(1);

        List list_elementNoOptionSpecGen=null;
        RuleReturnScope elementNoOptionSpecGen = null;
        try {
            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:1395:1: (elementNoOptionSpecGen+= elementNoOptionSpec )
            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:1395:3: elementNoOptionSpecGen+= elementNoOptionSpec
            {
            pushFollow(FOLLOW_elementNoOptionSpec_in_element1438);
            elementNoOptionSpecGen=elementNoOptionSpec();
            _fsp--;

            if (list_elementNoOptionSpecGen==null) list_elementNoOptionSpecGen=new ArrayList();
            list_elementNoOptionSpecGen.add(elementNoOptionSpecGen);

            
            		// Create return CST Node
            		Node elementReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
            		elementReturnNode.setKind("element");
            	    // Create a CST Node
            		if(list_elementNoOptionSpecGen != null) {
            	        for(Iterator it = list_elementNoOptionSpecGen.iterator(); it.hasNext(); )  { 
            	            ANTLRv3Parser.elementNoOptionSpec_return r = (ANTLRv3Parser.elementNoOptionSpec_return) it.next(); 
            	            if(r != null && r.returnNode != null) {
            	            	r.returnNode.setKind("elementNoOptionSpec");
            	            	elementReturnNode.getChildren().add(r.returnNode);
            	            } 
            	        }
            	    }
            		// Returns the Node with CST Leaves/Nodes
            		retval.returnNode = elementReturnNode;
            	

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
    // $ANTLR end element

    public static class elementNoOptionSpec_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start elementNoOptionSpec
    // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:1415:1: elementNoOptionSpec returns [Node returnNode] : (idGen+= id (TK_0= '=' | TK_1= '+=' ) ruleName+= atom (ebnfSuffixGen+= ebnfSuffix | ) | idGen+= id (TK_0= '=' | TK_1= '+=' ) blockGen+= block (ebnfSuffixGen+= ebnfSuffix | ) | ruleName+= atom (ebnfSuffixGen+= ebnfSuffix | ) | ebnfGen+= ebnf | ACTIONGen= ACTION | SEMPREDGen= SEMPRED (TK_0= '=>' | ) | treeSpecGen+= treeSpec );
    public final elementNoOptionSpec_return elementNoOptionSpec() throws RecognitionException {
        elementNoOptionSpec_return retval = new elementNoOptionSpec_return();
        retval.start = input.LT(1);

        Token TK_0=null;
        Token TK_1=null;
        Token ACTIONGen=null;
        Token SEMPREDGen=null;
        List list_idGen=null;
        List list_ruleName=null;
        List list_ebnfSuffixGen=null;
        List list_blockGen=null;
        List list_ebnfGen=null;
        List list_treeSpecGen=null;
        RuleReturnScope idGen = null;
        RuleReturnScope ruleName = null;
        RuleReturnScope ebnfSuffixGen = null;
        RuleReturnScope blockGen = null;
        RuleReturnScope ebnfGen = null;
        RuleReturnScope treeSpecGen = null;
        try {
            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:1416:1: (idGen+= id (TK_0= '=' | TK_1= '+=' ) ruleName+= atom (ebnfSuffixGen+= ebnfSuffix | ) | idGen+= id (TK_0= '=' | TK_1= '+=' ) blockGen+= block (ebnfSuffixGen+= ebnfSuffix | ) | ruleName+= atom (ebnfSuffixGen+= ebnfSuffix | ) | ebnfGen+= ebnf | ACTIONGen= ACTION | SEMPREDGen= SEMPRED (TK_0= '=>' | ) | treeSpecGen+= treeSpec )
            int alt45=7;
            switch ( input.LA(1) ) {
            case TOKEN_REF:
                {
                switch ( input.LA(2) ) {
                case 71:
                    {
                    int LA45_8 = input.LA(3);

                    if ( (LA45_8==82) ) {
                        alt45=2;
                    }
                    else if ( ((LA45_8>=TOKEN_REF && LA45_8<=CHAR_LITERAL)||LA45_8==RULE_REF||LA45_8==89||LA45_8==92) ) {
                        alt45=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("1415:1: elementNoOptionSpec returns [Node returnNode] : (idGen+= id (TK_0= '=' | TK_1= '+=' ) ruleName+= atom (ebnfSuffixGen+= ebnfSuffix | ) | idGen+= id (TK_0= '=' | TK_1= '+=' ) blockGen+= block (ebnfSuffixGen+= ebnfSuffix | ) | ruleName+= atom (ebnfSuffixGen+= ebnfSuffix | ) | ebnfGen+= ebnf | ACTIONGen= ACTION | SEMPREDGen= SEMPRED (TK_0= '=>' | ) | treeSpecGen+= treeSpec );", 45, 8, input);

                        throw nvae;
                    }
                    }
                    break;
                case 87:
                    {
                    int LA45_9 = input.LA(3);

                    if ( (LA45_9==82) ) {
                        alt45=2;
                    }
                    else if ( ((LA45_9>=TOKEN_REF && LA45_9<=CHAR_LITERAL)||LA45_9==RULE_REF||LA45_9==89||LA45_9==92) ) {
                        alt45=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("1415:1: elementNoOptionSpec returns [Node returnNode] : (idGen+= id (TK_0= '=' | TK_1= '+=' ) ruleName+= atom (ebnfSuffixGen+= ebnfSuffix | ) | idGen+= id (TK_0= '=' | TK_1= '+=' ) blockGen+= block (ebnfSuffixGen+= ebnfSuffix | ) | ruleName+= atom (ebnfSuffixGen+= ebnfSuffix | ) | ebnfGen+= ebnf | ACTIONGen= ACTION | SEMPREDGen= SEMPRED (TK_0= '=>' | ) | treeSpecGen+= treeSpec );", 45, 9, input);

                        throw nvae;
                    }
                    }
                    break;
                case SEMPRED:
                case TREE_BEGIN:
                case ROOT:
                case BANG:
                case REWRITE:
                case TOKEN_REF:
                case STRING_LITERAL:
                case CHAR_LITERAL:
                case ACTION:
                case ARG_ACTION:
                case RULE_REF:
                case 69:
                case 74:
                case 82:
                case 83:
                case 84:
                case 89:
                case 90:
                case 91:
                case 92:
                    {
                    alt45=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("1415:1: elementNoOptionSpec returns [Node returnNode] : (idGen+= id (TK_0= '=' | TK_1= '+=' ) ruleName+= atom (ebnfSuffixGen+= ebnfSuffix | ) | idGen+= id (TK_0= '=' | TK_1= '+=' ) blockGen+= block (ebnfSuffixGen+= ebnfSuffix | ) | ruleName+= atom (ebnfSuffixGen+= ebnfSuffix | ) | ebnfGen+= ebnf | ACTIONGen= ACTION | SEMPREDGen= SEMPRED (TK_0= '=>' | ) | treeSpecGen+= treeSpec );", 45, 1, input);

                    throw nvae;
                }

                }
                break;
            case RULE_REF:
                {
                switch ( input.LA(2) ) {
                case 71:
                    {
                    int LA45_8 = input.LA(3);

                    if ( (LA45_8==82) ) {
                        alt45=2;
                    }
                    else if ( ((LA45_8>=TOKEN_REF && LA45_8<=CHAR_LITERAL)||LA45_8==RULE_REF||LA45_8==89||LA45_8==92) ) {
                        alt45=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("1415:1: elementNoOptionSpec returns [Node returnNode] : (idGen+= id (TK_0= '=' | TK_1= '+=' ) ruleName+= atom (ebnfSuffixGen+= ebnfSuffix | ) | idGen+= id (TK_0= '=' | TK_1= '+=' ) blockGen+= block (ebnfSuffixGen+= ebnfSuffix | ) | ruleName+= atom (ebnfSuffixGen+= ebnfSuffix | ) | ebnfGen+= ebnf | ACTIONGen= ACTION | SEMPREDGen= SEMPRED (TK_0= '=>' | ) | treeSpecGen+= treeSpec );", 45, 8, input);

                        throw nvae;
                    }
                    }
                    break;
                case 87:
                    {
                    int LA45_9 = input.LA(3);

                    if ( (LA45_9==82) ) {
                        alt45=2;
                    }
                    else if ( ((LA45_9>=TOKEN_REF && LA45_9<=CHAR_LITERAL)||LA45_9==RULE_REF||LA45_9==89||LA45_9==92) ) {
                        alt45=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("1415:1: elementNoOptionSpec returns [Node returnNode] : (idGen+= id (TK_0= '=' | TK_1= '+=' ) ruleName+= atom (ebnfSuffixGen+= ebnfSuffix | ) | idGen+= id (TK_0= '=' | TK_1= '+=' ) blockGen+= block (ebnfSuffixGen+= ebnfSuffix | ) | ruleName+= atom (ebnfSuffixGen+= ebnfSuffix | ) | ebnfGen+= ebnf | ACTIONGen= ACTION | SEMPREDGen= SEMPRED (TK_0= '=>' | ) | treeSpecGen+= treeSpec );", 45, 9, input);

                        throw nvae;
                    }
                    }
                    break;
                case SEMPRED:
                case TREE_BEGIN:
                case ROOT:
                case BANG:
                case REWRITE:
                case TOKEN_REF:
                case STRING_LITERAL:
                case CHAR_LITERAL:
                case ACTION:
                case ARG_ACTION:
                case RULE_REF:
                case 69:
                case 74:
                case 82:
                case 83:
                case 84:
                case 89:
                case 90:
                case 91:
                case 92:
                    {
                    alt45=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("1415:1: elementNoOptionSpec returns [Node returnNode] : (idGen+= id (TK_0= '=' | TK_1= '+=' ) ruleName+= atom (ebnfSuffixGen+= ebnfSuffix | ) | idGen+= id (TK_0= '=' | TK_1= '+=' ) blockGen+= block (ebnfSuffixGen+= ebnfSuffix | ) | ruleName+= atom (ebnfSuffixGen+= ebnfSuffix | ) | ebnfGen+= ebnf | ACTIONGen= ACTION | SEMPREDGen= SEMPRED (TK_0= '=>' | ) | treeSpecGen+= treeSpec );", 45, 2, input);

                    throw nvae;
                }

                }
                break;
            case STRING_LITERAL:
            case CHAR_LITERAL:
            case 89:
            case 92:
                {
                alt45=3;
                }
                break;
            case 82:
                {
                alt45=4;
                }
                break;
            case ACTION:
                {
                alt45=5;
                }
                break;
            case SEMPRED:
                {
                alt45=6;
                }
                break;
            case TREE_BEGIN:
                {
                alt45=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1415:1: elementNoOptionSpec returns [Node returnNode] : (idGen+= id (TK_0= '=' | TK_1= '+=' ) ruleName+= atom (ebnfSuffixGen+= ebnfSuffix | ) | idGen+= id (TK_0= '=' | TK_1= '+=' ) blockGen+= block (ebnfSuffixGen+= ebnfSuffix | ) | ruleName+= atom (ebnfSuffixGen+= ebnfSuffix | ) | ebnfGen+= ebnf | ACTIONGen= ACTION | SEMPREDGen= SEMPRED (TK_0= '=>' | ) | treeSpecGen+= treeSpec );", 45, 0, input);

                throw nvae;
            }

            switch (alt45) {
                case 1 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:1416:3: idGen+= id (TK_0= '=' | TK_1= '+=' ) ruleName+= atom (ebnfSuffixGen+= ebnfSuffix | )
                    {
                    pushFollow(FOLLOW_id_in_elementNoOptionSpec1459);
                    idGen=id();
                    _fsp--;

                    if (list_idGen==null) list_idGen=new ArrayList();
                    list_idGen.add(idGen);

                    // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:1416:13: (TK_0= '=' | TK_1= '+=' )
                    int alt39=2;
                    int LA39_0 = input.LA(1);

                    if ( (LA39_0==71) ) {
                        alt39=1;
                    }
                    else if ( (LA39_0==87) ) {
                        alt39=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("1416:13: (TK_0= '=' | TK_1= '+=' )", 39, 0, input);

                        throw nvae;
                    }
                    switch (alt39) {
                        case 1 :
                            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:1416:14: TK_0= '='
                            {
                            TK_0=(Token)input.LT(1);
                            match(input,71,FOLLOW_71_in_elementNoOptionSpec1464); 

                            }
                            break;
                        case 2 :
                            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:1416:23: TK_1= '+='
                            {
                            TK_1=(Token)input.LT(1);
                            match(input,87,FOLLOW_87_in_elementNoOptionSpec1468); 

                            }
                            break;

                    }

                    pushFollow(FOLLOW_atom_in_elementNoOptionSpec1473);
                    ruleName=atom();
                    _fsp--;

                    if (list_ruleName==null) list_ruleName=new ArrayList();
                    list_ruleName.add(ruleName);

                    // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:1417:3: (ebnfSuffixGen+= ebnfSuffix | )
                    int alt40=2;
                    int LA40_0 = input.LA(1);

                    if ( (LA40_0==74||(LA40_0>=90 && LA40_0<=91)) ) {
                        alt40=1;
                    }
                    else if ( (LA40_0==SEMPRED||LA40_0==TREE_BEGIN||LA40_0==REWRITE||(LA40_0>=TOKEN_REF && LA40_0<=ACTION)||LA40_0==RULE_REF||LA40_0==69||(LA40_0>=82 && LA40_0<=84)||LA40_0==89||LA40_0==92) ) {
                        alt40=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("1417:3: (ebnfSuffixGen+= ebnfSuffix | )", 40, 0, input);

                        throw nvae;
                    }
                    switch (alt40) {
                        case 1 :
                            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:1417:5: ebnfSuffixGen+= ebnfSuffix
                            {
                            pushFollow(FOLLOW_ebnfSuffix_in_elementNoOptionSpec1481);
                            ebnfSuffixGen=ebnfSuffix();
                            _fsp--;

                            if (list_ebnfSuffixGen==null) list_ebnfSuffixGen=new ArrayList();
                            list_ebnfSuffixGen.add(ebnfSuffixGen);


                            }
                            break;
                        case 2 :
                            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:1419:3: 
                            {
                            }
                            break;

                    }

                    
                    		// Create return CST Node
                    		Node elementNoOptionSpecReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                    		elementNoOptionSpecReturnNode.setKind("elementNoOptionSpec");
                    	    // Create a CST Node
                    		if(list_idGen != null) {
                    	        for(Iterator it = list_idGen.iterator(); it.hasNext(); )  { 
                    	            ANTLRv3Parser.id_return r = (ANTLRv3Parser.id_return) it.next(); 
                    	            if(r != null && r.returnNode != null) {
                    	            	r.returnNode.setKind("id");
                    	            	elementNoOptionSpecReturnNode.getChildren().add(r.returnNode);
                    	            } 
                    	        }
                    	    }
                    	    // Create a Token CST Leaf	
                    	    if(TK_0 != null) {
                    			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                    	 		TK_0Leaf.setKind("TOKEN");
                    	 		TK_0Leaf.setValue(TK_0.getText());
                    			TK_0Leaf.setPos(TK_0.getCharPositionInLine());
                    			TK_0Leaf.setLine(TK_0.getLine());
                    	 		elementNoOptionSpecReturnNode.getChildren().add(TK_0Leaf);
                    	 	}
                    	    // Create a Token CST Leaf	
                    	    if(TK_1 != null) {
                    			Leaf TK_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                    	 		TK_1Leaf.setKind("TOKEN");
                    	 		TK_1Leaf.setValue(TK_1.getText());
                    			TK_1Leaf.setPos(TK_1.getCharPositionInLine());
                    			TK_1Leaf.setLine(TK_1.getLine());
                    	 		elementNoOptionSpecReturnNode.getChildren().add(TK_1Leaf);
                    	 	}
                    	    // Create a CST Node
                    		if(list_ruleName != null) {
                    	        for(Iterator it = list_ruleName.iterator(); it.hasNext(); )  { 
                    	            ANTLRv3Parser.atom_return r = (ANTLRv3Parser.atom_return) it.next(); 
                    	            if(r != null && r.returnNode != null) {
                    	            	r.returnNode.setKind("ruleName");
                    	            	elementNoOptionSpecReturnNode.getChildren().add(r.returnNode);
                    	            } 
                    	        }
                    	    }
                    	    // Create a CST Node
                    		if(list_ebnfSuffixGen != null) {
                    	        for(Iterator it = list_ebnfSuffixGen.iterator(); it.hasNext(); )  { 
                    	            ANTLRv3Parser.ebnfSuffix_return r = (ANTLRv3Parser.ebnfSuffix_return) it.next(); 
                    	            if(r != null && r.returnNode != null) {
                    	            	r.returnNode.setKind("ebnfSuffix");
                    	            	elementNoOptionSpecReturnNode.getChildren().add(r.returnNode);
                    	            } 
                    	        }
                    	    }
                    		// Returns the Node with CST Leaves/Nodes
                    		retval.returnNode = elementNoOptionSpecReturnNode;
                    	

                    }
                    break;
                case 2 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:1475:4: idGen+= id (TK_0= '=' | TK_1= '+=' ) blockGen+= block (ebnfSuffixGen+= ebnfSuffix | )
                    {
                    pushFollow(FOLLOW_id_in_elementNoOptionSpec1505);
                    idGen=id();
                    _fsp--;

                    if (list_idGen==null) list_idGen=new ArrayList();
                    list_idGen.add(idGen);

                    // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:1475:14: (TK_0= '=' | TK_1= '+=' )
                    int alt41=2;
                    int LA41_0 = input.LA(1);

                    if ( (LA41_0==71) ) {
                        alt41=1;
                    }
                    else if ( (LA41_0==87) ) {
                        alt41=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("1475:14: (TK_0= '=' | TK_1= '+=' )", 41, 0, input);

                        throw nvae;
                    }
                    switch (alt41) {
                        case 1 :
                            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:1475:15: TK_0= '='
                            {
                            TK_0=(Token)input.LT(1);
                            match(input,71,FOLLOW_71_in_elementNoOptionSpec1510); 

                            }
                            break;
                        case 2 :
                            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:1475:24: TK_1= '+='
                            {
                            TK_1=(Token)input.LT(1);
                            match(input,87,FOLLOW_87_in_elementNoOptionSpec1514); 

                            }
                            break;

                    }

                    pushFollow(FOLLOW_block_in_elementNoOptionSpec1519);
                    blockGen=block();
                    _fsp--;

                    if (list_blockGen==null) list_blockGen=new ArrayList();
                    list_blockGen.add(blockGen);

                    // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:1476:3: (ebnfSuffixGen+= ebnfSuffix | )
                    int alt42=2;
                    int LA42_0 = input.LA(1);

                    if ( (LA42_0==74||(LA42_0>=90 && LA42_0<=91)) ) {
                        alt42=1;
                    }
                    else if ( (LA42_0==SEMPRED||LA42_0==TREE_BEGIN||LA42_0==REWRITE||(LA42_0>=TOKEN_REF && LA42_0<=ACTION)||LA42_0==RULE_REF||LA42_0==69||(LA42_0>=82 && LA42_0<=84)||LA42_0==89||LA42_0==92) ) {
                        alt42=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("1476:3: (ebnfSuffixGen+= ebnfSuffix | )", 42, 0, input);

                        throw nvae;
                    }
                    switch (alt42) {
                        case 1 :
                            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:1476:5: ebnfSuffixGen+= ebnfSuffix
                            {
                            pushFollow(FOLLOW_ebnfSuffix_in_elementNoOptionSpec1527);
                            ebnfSuffixGen=ebnfSuffix();
                            _fsp--;

                            if (list_ebnfSuffixGen==null) list_ebnfSuffixGen=new ArrayList();
                            list_ebnfSuffixGen.add(ebnfSuffixGen);


                            }
                            break;
                        case 2 :
                            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:1478:3: 
                            {
                            }
                            break;

                    }

                    
                    		// Create return CST Node
                    		Node elementNoOptionSpecReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                    		elementNoOptionSpecReturnNode.setKind("elementNoOptionSpec");
                    	    // Create a CST Node
                    		if(list_idGen != null) {
                    	        for(Iterator it = list_idGen.iterator(); it.hasNext(); )  { 
                    	            ANTLRv3Parser.id_return r = (ANTLRv3Parser.id_return) it.next(); 
                    	            if(r != null && r.returnNode != null) {
                    	            	r.returnNode.setKind("id");
                    	            	elementNoOptionSpecReturnNode.getChildren().add(r.returnNode);
                    	            } 
                    	        }
                    	    }
                    	    // Create a Token CST Leaf	
                    	    if(TK_0 != null) {
                    			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                    	 		TK_0Leaf.setKind("TOKEN");
                    	 		TK_0Leaf.setValue(TK_0.getText());
                    			TK_0Leaf.setPos(TK_0.getCharPositionInLine());
                    			TK_0Leaf.setLine(TK_0.getLine());
                    	 		elementNoOptionSpecReturnNode.getChildren().add(TK_0Leaf);
                    	 	}
                    	    // Create a Token CST Leaf	
                    	    if(TK_1 != null) {
                    			Leaf TK_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                    	 		TK_1Leaf.setKind("TOKEN");
                    	 		TK_1Leaf.setValue(TK_1.getText());
                    			TK_1Leaf.setPos(TK_1.getCharPositionInLine());
                    			TK_1Leaf.setLine(TK_1.getLine());
                    	 		elementNoOptionSpecReturnNode.getChildren().add(TK_1Leaf);
                    	 	}
                    	    // Create a CST Node
                    		if(list_blockGen != null) {
                    	        for(Iterator it = list_blockGen.iterator(); it.hasNext(); )  { 
                    	            ANTLRv3Parser.block_return r = (ANTLRv3Parser.block_return) it.next(); 
                    	            if(r != null && r.returnNode != null) {
                    	            	r.returnNode.setKind("block");
                    	            	elementNoOptionSpecReturnNode.getChildren().add(r.returnNode);
                    	            } 
                    	        }
                    	    }
                    	    // Create a CST Node
                    		if(list_ebnfSuffixGen != null) {
                    	        for(Iterator it = list_ebnfSuffixGen.iterator(); it.hasNext(); )  { 
                    	            ANTLRv3Parser.ebnfSuffix_return r = (ANTLRv3Parser.ebnfSuffix_return) it.next(); 
                    	            if(r != null && r.returnNode != null) {
                    	            	r.returnNode.setKind("ebnfSuffix");
                    	            	elementNoOptionSpecReturnNode.getChildren().add(r.returnNode);
                    	            } 
                    	        }
                    	    }
                    		// Returns the Node with CST Leaves/Nodes
                    		retval.returnNode = elementNoOptionSpecReturnNode;
                    	

                    }
                    break;
                case 3 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:1534:4: ruleName+= atom (ebnfSuffixGen+= ebnfSuffix | )
                    {
                    pushFollow(FOLLOW_atom_in_elementNoOptionSpec1551);
                    ruleName=atom();
                    _fsp--;

                    if (list_ruleName==null) list_ruleName=new ArrayList();
                    list_ruleName.add(ruleName);

                    // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:1535:3: (ebnfSuffixGen+= ebnfSuffix | )
                    int alt43=2;
                    int LA43_0 = input.LA(1);

                    if ( (LA43_0==74||(LA43_0>=90 && LA43_0<=91)) ) {
                        alt43=1;
                    }
                    else if ( (LA43_0==SEMPRED||LA43_0==TREE_BEGIN||LA43_0==REWRITE||(LA43_0>=TOKEN_REF && LA43_0<=ACTION)||LA43_0==RULE_REF||LA43_0==69||(LA43_0>=82 && LA43_0<=84)||LA43_0==89||LA43_0==92) ) {
                        alt43=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("1535:3: (ebnfSuffixGen+= ebnfSuffix | )", 43, 0, input);

                        throw nvae;
                    }
                    switch (alt43) {
                        case 1 :
                            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:1535:5: ebnfSuffixGen+= ebnfSuffix
                            {
                            pushFollow(FOLLOW_ebnfSuffix_in_elementNoOptionSpec1559);
                            ebnfSuffixGen=ebnfSuffix();
                            _fsp--;

                            if (list_ebnfSuffixGen==null) list_ebnfSuffixGen=new ArrayList();
                            list_ebnfSuffixGen.add(ebnfSuffixGen);


                            }
                            break;
                        case 2 :
                            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:1537:3: 
                            {
                            }
                            break;

                    }

                    
                    		// Create return CST Node
                    		Node elementNoOptionSpecReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                    		elementNoOptionSpecReturnNode.setKind("elementNoOptionSpec");
                    	    // Create a CST Node
                    		if(list_ruleName != null) {
                    	        for(Iterator it = list_ruleName.iterator(); it.hasNext(); )  { 
                    	            ANTLRv3Parser.atom_return r = (ANTLRv3Parser.atom_return) it.next(); 
                    	            if(r != null && r.returnNode != null) {
                    	            	r.returnNode.setKind("ruleName");
                    	            	elementNoOptionSpecReturnNode.getChildren().add(r.returnNode);
                    	            } 
                    	        }
                    	    }
                    	    // Create a CST Node
                    		if(list_ebnfSuffixGen != null) {
                    	        for(Iterator it = list_ebnfSuffixGen.iterator(); it.hasNext(); )  { 
                    	            ANTLRv3Parser.ebnfSuffix_return r = (ANTLRv3Parser.ebnfSuffix_return) it.next(); 
                    	            if(r != null && r.returnNode != null) {
                    	            	r.returnNode.setKind("ebnfSuffix");
                    	            	elementNoOptionSpecReturnNode.getChildren().add(r.returnNode);
                    	            } 
                    	        }
                    	    }
                    		// Returns the Node with CST Leaves/Nodes
                    		retval.returnNode = elementNoOptionSpecReturnNode;
                    	

                    }
                    break;
                case 4 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:1565:4: ebnfGen+= ebnf
                    {
                    pushFollow(FOLLOW_ebnf_in_elementNoOptionSpec1583);
                    ebnfGen=ebnf();
                    _fsp--;

                    if (list_ebnfGen==null) list_ebnfGen=new ArrayList();
                    list_ebnfGen.add(ebnfGen);

                    
                    		// Create return CST Node
                    		Node elementNoOptionSpecReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                    		elementNoOptionSpecReturnNode.setKind("elementNoOptionSpec");
                    	    // Create a CST Node
                    		if(list_ebnfGen != null) {
                    	        for(Iterator it = list_ebnfGen.iterator(); it.hasNext(); )  { 
                    	            ANTLRv3Parser.ebnf_return r = (ANTLRv3Parser.ebnf_return) it.next(); 
                    	            if(r != null && r.returnNode != null) {
                    	            	r.returnNode.setKind("ebnf");
                    	            	elementNoOptionSpecReturnNode.getChildren().add(r.returnNode);
                    	            } 
                    	        }
                    	    }
                    		// Returns the Node with CST Leaves/Nodes
                    		retval.returnNode = elementNoOptionSpecReturnNode;
                    	

                    }
                    break;
                case 5 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:1583:6: ACTIONGen= ACTION
                    {
                    ACTIONGen=(Token)input.LT(1);
                    match(input,ACTION,FOLLOW_ACTION_in_elementNoOptionSpec1596); 
                    
                    		// Create return CST Node
                    		Node elementNoOptionSpecReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                    		elementNoOptionSpecReturnNode.setKind("elementNoOptionSpec");
                    	    // Create a CST Leaf
                    		if(ACTIONGen != null) {
                    			Leaf ACTIONGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                    			ACTIONGenLeaf.setKind("ACTION");
                    			ACTIONGenLeaf.setValue(ACTIONGen.getText());
                    			ACTIONGenLeaf.setPos(ACTIONGen.getCharPositionInLine());
                    			ACTIONGenLeaf.setLine(ACTIONGen.getLine());
                    			elementNoOptionSpecReturnNode.getChildren().add(ACTIONGenLeaf);
                    		}
                    		// Returns the Node with CST Leaves/Nodes
                    		retval.returnNode = elementNoOptionSpecReturnNode;
                    	

                    }
                    break;
                case 6 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:1600:6: SEMPREDGen= SEMPRED (TK_0= '=>' | )
                    {
                    SEMPREDGen=(Token)input.LT(1);
                    match(input,SEMPRED,FOLLOW_SEMPRED_in_elementNoOptionSpec1609); 
                    // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:1600:25: (TK_0= '=>' | )
                    int alt44=2;
                    int LA44_0 = input.LA(1);

                    if ( (LA44_0==88) ) {
                        alt44=1;
                    }
                    else if ( (LA44_0==SEMPRED||LA44_0==TREE_BEGIN||LA44_0==REWRITE||(LA44_0>=TOKEN_REF && LA44_0<=ACTION)||LA44_0==RULE_REF||LA44_0==69||(LA44_0>=82 && LA44_0<=84)||LA44_0==89||LA44_0==92) ) {
                        alt44=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("1600:25: (TK_0= '=>' | )", 44, 0, input);

                        throw nvae;
                    }
                    switch (alt44) {
                        case 1 :
                            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:1600:27: TK_0= '=>'
                            {
                            TK_0=(Token)input.LT(1);
                            match(input,88,FOLLOW_88_in_elementNoOptionSpec1615); 

                            }
                            break;
                        case 2 :
                            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:1600:40: 
                            {
                            }
                            break;

                    }

                    
                    		// Create return CST Node
                    		Node elementNoOptionSpecReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                    		elementNoOptionSpecReturnNode.setKind("elementNoOptionSpec");
                    	    // Create a CST Leaf
                    		if(SEMPREDGen != null) {
                    			Leaf SEMPREDGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                    			SEMPREDGenLeaf.setKind("SEMPRED");
                    			SEMPREDGenLeaf.setValue(SEMPREDGen.getText());
                    			SEMPREDGenLeaf.setPos(SEMPREDGen.getCharPositionInLine());
                    			SEMPREDGenLeaf.setLine(SEMPREDGen.getLine());
                    			elementNoOptionSpecReturnNode.getChildren().add(SEMPREDGenLeaf);
                    		}
                    	    // Create a Token CST Leaf	
                    	    if(TK_0 != null) {
                    			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                    	 		TK_0Leaf.setKind("TOKEN");
                    	 		TK_0Leaf.setValue(TK_0.getText());
                    			TK_0Leaf.setPos(TK_0.getCharPositionInLine());
                    			TK_0Leaf.setLine(TK_0.getLine());
                    	 		elementNoOptionSpecReturnNode.getChildren().add(TK_0Leaf);
                    	 	}
                    		// Returns the Node with CST Leaves/Nodes
                    		retval.returnNode = elementNoOptionSpecReturnNode;
                    	

                    }
                    break;
                case 7 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:1626:6: treeSpecGen+= treeSpec
                    {
                    pushFollow(FOLLOW_treeSpec_in_elementNoOptionSpec1633);
                    treeSpecGen=treeSpec();
                    _fsp--;

                    if (list_treeSpecGen==null) list_treeSpecGen=new ArrayList();
                    list_treeSpecGen.add(treeSpecGen);

                    
                    		// Create return CST Node
                    		Node elementNoOptionSpecReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                    		elementNoOptionSpecReturnNode.setKind("elementNoOptionSpec");
                    	    // Create a CST Node
                    		if(list_treeSpecGen != null) {
                    	        for(Iterator it = list_treeSpecGen.iterator(); it.hasNext(); )  { 
                    	            ANTLRv3Parser.treeSpec_return r = (ANTLRv3Parser.treeSpec_return) it.next(); 
                    	            if(r != null && r.returnNode != null) {
                    	            	r.returnNode.setKind("treeSpec");
                    	            	elementNoOptionSpecReturnNode.getChildren().add(r.returnNode);
                    	            } 
                    	        }
                    	    }
                    		// Returns the Node with CST Leaves/Nodes
                    		retval.returnNode = elementNoOptionSpecReturnNode;
                    	

                    }
                    break;

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
    // $ANTLR end elementNoOptionSpec

    public static class atom_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start atom
    // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:1646:1: atom returns [Node returnNode] : (rangeGen+= range ( (TK_0= '^' | TK_1= '!' ) | ) | terminalGen+= terminal | notSetGen+= notSet ( (TK_0= '^' | TK_1= '!' ) | ) | RULE_REFGen= RULE_REF (arg= ARG_ACTION )? ( (op= '^' | op= '!' ) )? );
    public final atom_return atom() throws RecognitionException {
        atom_return retval = new atom_return();
        retval.start = input.LT(1);

        Token TK_0=null;
        Token TK_1=null;
        Token RULE_REFGen=null;
        Token arg=null;
        Token op=null;
        List list_rangeGen=null;
        List list_terminalGen=null;
        List list_notSetGen=null;
        RuleReturnScope rangeGen = null;
        RuleReturnScope terminalGen = null;
        RuleReturnScope notSetGen = null;
        try {
            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:1647:1: (rangeGen+= range ( (TK_0= '^' | TK_1= '!' ) | ) | terminalGen+= terminal | notSetGen+= notSet ( (TK_0= '^' | TK_1= '!' ) | ) | RULE_REFGen= RULE_REF (arg= ARG_ACTION )? ( (op= '^' | op= '!' ) )? )
            int alt53=4;
            switch ( input.LA(1) ) {
            case CHAR_LITERAL:
                {
                int LA53_1 = input.LA(2);

                if ( (LA53_1==RANGE) ) {
                    alt53=1;
                }
                else if ( (LA53_1==SEMPRED||(LA53_1>=TREE_BEGIN && LA53_1<=REWRITE)||(LA53_1>=TOKEN_REF && LA53_1<=ACTION)||LA53_1==RULE_REF||LA53_1==69||LA53_1==74||(LA53_1>=82 && LA53_1<=84)||(LA53_1>=89 && LA53_1<=92)) ) {
                    alt53=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("1646:1: atom returns [Node returnNode] : (rangeGen+= range ( (TK_0= '^' | TK_1= '!' ) | ) | terminalGen+= terminal | notSetGen+= notSet ( (TK_0= '^' | TK_1= '!' ) | ) | RULE_REFGen= RULE_REF (arg= ARG_ACTION )? ( (op= '^' | op= '!' ) )? );", 53, 1, input);

                    throw nvae;
                }
                }
                break;
            case TOKEN_REF:
            case STRING_LITERAL:
            case 92:
                {
                alt53=2;
                }
                break;
            case 89:
                {
                alt53=3;
                }
                break;
            case RULE_REF:
                {
                alt53=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1646:1: atom returns [Node returnNode] : (rangeGen+= range ( (TK_0= '^' | TK_1= '!' ) | ) | terminalGen+= terminal | notSetGen+= notSet ( (TK_0= '^' | TK_1= '!' ) | ) | RULE_REFGen= RULE_REF (arg= ARG_ACTION )? ( (op= '^' | op= '!' ) )? );", 53, 0, input);

                throw nvae;
            }

            switch (alt53) {
                case 1 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:1647:5: rangeGen+= range ( (TK_0= '^' | TK_1= '!' ) | )
                    {
                    pushFollow(FOLLOW_range_in_atom1656);
                    rangeGen=range();
                    _fsp--;

                    if (list_rangeGen==null) list_rangeGen=new ArrayList();
                    list_rangeGen.add(rangeGen);

                    // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:1647:21: ( (TK_0= '^' | TK_1= '!' ) | )
                    int alt47=2;
                    int LA47_0 = input.LA(1);

                    if ( ((LA47_0>=ROOT && LA47_0<=BANG)) ) {
                        alt47=1;
                    }
                    else if ( (LA47_0==SEMPRED||LA47_0==TREE_BEGIN||LA47_0==REWRITE||(LA47_0>=TOKEN_REF && LA47_0<=ACTION)||LA47_0==RULE_REF||LA47_0==69||LA47_0==74||(LA47_0>=82 && LA47_0<=84)||(LA47_0>=89 && LA47_0<=92)) ) {
                        alt47=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("1647:21: ( (TK_0= '^' | TK_1= '!' ) | )", 47, 0, input);

                        throw nvae;
                    }
                    switch (alt47) {
                        case 1 :
                            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:1647:23: (TK_0= '^' | TK_1= '!' )
                            {
                            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:1647:23: (TK_0= '^' | TK_1= '!' )
                            int alt46=2;
                            int LA46_0 = input.LA(1);

                            if ( (LA46_0==ROOT) ) {
                                alt46=1;
                            }
                            else if ( (LA46_0==BANG) ) {
                                alt46=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("1647:23: (TK_0= '^' | TK_1= '!' )", 46, 0, input);

                                throw nvae;
                            }
                            switch (alt46) {
                                case 1 :
                                    // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:1647:24: TK_0= '^'
                                    {
                                    TK_0=(Token)input.LT(1);
                                    match(input,ROOT,FOLLOW_ROOT_in_atom1663); 

                                    }
                                    break;
                                case 2 :
                                    // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:1647:33: TK_1= '!'
                                    {
                                    TK_1=(Token)input.LT(1);
                                    match(input,BANG,FOLLOW_BANG_in_atom1667); 

                                    }
                                    break;

                            }


                            }
                            break;
                        case 2 :
                            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:1647:47: 
                            {
                            }
                            break;

                    }

                    
                    		// Create return CST Node
                    		Node atomReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                    		atomReturnNode.setKind("atom");
                    	    // Create a CST Node
                    		if(list_rangeGen != null) {
                    	        for(Iterator it = list_rangeGen.iterator(); it.hasNext(); )  { 
                    	            ANTLRv3Parser.range_return r = (ANTLRv3Parser.range_return) it.next(); 
                    	            if(r != null && r.returnNode != null) {
                    	            	r.returnNode.setKind("range");
                    	            	atomReturnNode.getChildren().add(r.returnNode);
                    	            } 
                    	        }
                    	    }
                    	    // Create a Token CST Leaf	
                    	    if(TK_0 != null) {
                    			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                    	 		TK_0Leaf.setKind("TOKEN");
                    	 		TK_0Leaf.setValue(TK_0.getText());
                    			TK_0Leaf.setPos(TK_0.getCharPositionInLine());
                    			TK_0Leaf.setLine(TK_0.getLine());
                    	 		atomReturnNode.getChildren().add(TK_0Leaf);
                    	 	}
                    	    // Create a Token CST Leaf	
                    	    if(TK_1 != null) {
                    			Leaf TK_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                    	 		TK_1Leaf.setKind("TOKEN");
                    	 		TK_1Leaf.setValue(TK_1.getText());
                    			TK_1Leaf.setPos(TK_1.getCharPositionInLine());
                    			TK_1Leaf.setLine(TK_1.getLine());
                    	 		atomReturnNode.getChildren().add(TK_1Leaf);
                    	 	}
                    		// Returns the Node with CST Leaves/Nodes
                    		retval.returnNode = atomReturnNode;
                    	

                    }
                    break;
                case 2 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:1683:9: terminalGen+= terminal
                    {
                    pushFollow(FOLLOW_terminal_in_atom1690);
                    terminalGen=terminal();
                    _fsp--;

                    if (list_terminalGen==null) list_terminalGen=new ArrayList();
                    list_terminalGen.add(terminalGen);

                    
                    		// Create return CST Node
                    		Node atomReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                    		atomReturnNode.setKind("atom");
                    	    // Create a CST Node
                    		if(list_terminalGen != null) {
                    	        for(Iterator it = list_terminalGen.iterator(); it.hasNext(); )  { 
                    	            ANTLRv3Parser.terminal_return r = (ANTLRv3Parser.terminal_return) it.next(); 
                    	            if(r != null && r.returnNode != null) {
                    	            	r.returnNode.setKind("terminal");
                    	            	atomReturnNode.getChildren().add(r.returnNode);
                    	            } 
                    	        }
                    	    }
                    		// Returns the Node with CST Leaves/Nodes
                    		retval.returnNode = atomReturnNode;
                    	

                    }
                    break;
                case 3 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:1701:7: notSetGen+= notSet ( (TK_0= '^' | TK_1= '!' ) | )
                    {
                    pushFollow(FOLLOW_notSet_in_atom1704);
                    notSetGen=notSet();
                    _fsp--;

                    if (list_notSetGen==null) list_notSetGen=new ArrayList();
                    list_notSetGen.add(notSetGen);

                    // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:1701:25: ( (TK_0= '^' | TK_1= '!' ) | )
                    int alt49=2;
                    int LA49_0 = input.LA(1);

                    if ( ((LA49_0>=ROOT && LA49_0<=BANG)) ) {
                        alt49=1;
                    }
                    else if ( (LA49_0==SEMPRED||LA49_0==TREE_BEGIN||LA49_0==REWRITE||(LA49_0>=TOKEN_REF && LA49_0<=ACTION)||LA49_0==RULE_REF||LA49_0==69||LA49_0==74||(LA49_0>=82 && LA49_0<=84)||(LA49_0>=89 && LA49_0<=92)) ) {
                        alt49=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("1701:25: ( (TK_0= '^' | TK_1= '!' ) | )", 49, 0, input);

                        throw nvae;
                    }
                    switch (alt49) {
                        case 1 :
                            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:1701:27: (TK_0= '^' | TK_1= '!' )
                            {
                            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:1701:27: (TK_0= '^' | TK_1= '!' )
                            int alt48=2;
                            int LA48_0 = input.LA(1);

                            if ( (LA48_0==ROOT) ) {
                                alt48=1;
                            }
                            else if ( (LA48_0==BANG) ) {
                                alt48=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("1701:27: (TK_0= '^' | TK_1= '!' )", 48, 0, input);

                                throw nvae;
                            }
                            switch (alt48) {
                                case 1 :
                                    // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:1701:28: TK_0= '^'
                                    {
                                    TK_0=(Token)input.LT(1);
                                    match(input,ROOT,FOLLOW_ROOT_in_atom1711); 

                                    }
                                    break;
                                case 2 :
                                    // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:1701:37: TK_1= '!'
                                    {
                                    TK_1=(Token)input.LT(1);
                                    match(input,BANG,FOLLOW_BANG_in_atom1715); 

                                    }
                                    break;

                            }


                            }
                            break;
                        case 2 :
                            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:1701:51: 
                            {
                            }
                            break;

                    }

                    
                    		// Create return CST Node
                    		Node atomReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                    		atomReturnNode.setKind("atom");
                    	    // Create a CST Node
                    		if(list_notSetGen != null) {
                    	        for(Iterator it = list_notSetGen.iterator(); it.hasNext(); )  { 
                    	            ANTLRv3Parser.notSet_return r = (ANTLRv3Parser.notSet_return) it.next(); 
                    	            if(r != null && r.returnNode != null) {
                    	            	r.returnNode.setKind("notSet");
                    	            	atomReturnNode.getChildren().add(r.returnNode);
                    	            } 
                    	        }
                    	    }
                    	    // Create a Token CST Leaf	
                    	    if(TK_0 != null) {
                    			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                    	 		TK_0Leaf.setKind("TOKEN");
                    	 		TK_0Leaf.setValue(TK_0.getText());
                    			TK_0Leaf.setPos(TK_0.getCharPositionInLine());
                    			TK_0Leaf.setLine(TK_0.getLine());
                    	 		atomReturnNode.getChildren().add(TK_0Leaf);
                    	 	}
                    	    // Create a Token CST Leaf	
                    	    if(TK_1 != null) {
                    			Leaf TK_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                    	 		TK_1Leaf.setKind("TOKEN");
                    	 		TK_1Leaf.setValue(TK_1.getText());
                    			TK_1Leaf.setPos(TK_1.getCharPositionInLine());
                    			TK_1Leaf.setLine(TK_1.getLine());
                    	 		atomReturnNode.getChildren().add(TK_1Leaf);
                    	 	}
                    		// Returns the Node with CST Leaves/Nodes
                    		retval.returnNode = atomReturnNode;
                    	

                    }
                    break;
                case 4 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:1737:9: RULE_REFGen= RULE_REF (arg= ARG_ACTION )? ( (op= '^' | op= '!' ) )?
                    {
                    RULE_REFGen=(Token)input.LT(1);
                    match(input,RULE_REF,FOLLOW_RULE_REF_in_atom1738); 
                    // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:1737:30: (arg= ARG_ACTION )?
                    int alt50=2;
                    int LA50_0 = input.LA(1);

                    if ( (LA50_0==ARG_ACTION) ) {
                        alt50=1;
                    }
                    switch (alt50) {
                        case 1 :
                            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:1737:32: arg= ARG_ACTION
                            {
                            arg=(Token)input.LT(1);
                            match(input,ARG_ACTION,FOLLOW_ARG_ACTION_in_atom1744); 

                            }
                            break;

                    }

                    // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:1737:50: ( (op= '^' | op= '!' ) )?
                    int alt52=2;
                    int LA52_0 = input.LA(1);

                    if ( ((LA52_0>=ROOT && LA52_0<=BANG)) ) {
                        alt52=1;
                    }
                    switch (alt52) {
                        case 1 :
                            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:1737:52: (op= '^' | op= '!' )
                            {
                            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:1737:52: (op= '^' | op= '!' )
                            int alt51=2;
                            int LA51_0 = input.LA(1);

                            if ( (LA51_0==ROOT) ) {
                                alt51=1;
                            }
                            else if ( (LA51_0==BANG) ) {
                                alt51=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("1737:52: (op= '^' | op= '!' )", 51, 0, input);

                                throw nvae;
                            }
                            switch (alt51) {
                                case 1 :
                                    // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:1737:53: op= '^'
                                    {
                                    op=(Token)input.LT(1);
                                    match(input,ROOT,FOLLOW_ROOT_in_atom1754); 

                                    }
                                    break;
                                case 2 :
                                    // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:1737:60: op= '!'
                                    {
                                    op=(Token)input.LT(1);
                                    match(input,BANG,FOLLOW_BANG_in_atom1758); 

                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    
                    		// Create return CST Node
                    		Node atomReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                    		atomReturnNode.setKind("atom");
                    	    // Create a CST Leaf
                    		if(RULE_REFGen != null) {
                    			Leaf RULE_REFGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                    			RULE_REFGenLeaf.setKind("RULE_REF");
                    			RULE_REFGenLeaf.setValue(RULE_REFGen.getText());
                    			RULE_REFGenLeaf.setPos(RULE_REFGen.getCharPositionInLine());
                    			RULE_REFGenLeaf.setLine(RULE_REFGen.getLine());
                    			atomReturnNode.getChildren().add(RULE_REFGenLeaf);
                    		}
                    	    // Create a CST Leaf
                    		if(arg != null) {
                    			Leaf argLeaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                    			argLeaf.setKind("arg");
                    			argLeaf.setValue(arg.getText());
                    			argLeaf.setPos(arg.getCharPositionInLine());
                    			argLeaf.setLine(arg.getLine());
                    			atomReturnNode.getChildren().add(argLeaf);
                    		}
                    	    // Create a CST Leaf
                    		if(op != null) {
                    			Leaf opLeaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                    			opLeaf.setKind("op");
                    			opLeaf.setValue(op.getText());
                    			opLeaf.setPos(op.getCharPositionInLine());
                    			opLeaf.setLine(op.getLine());
                    			atomReturnNode.getChildren().add(opLeaf);
                    		}
                    	    // Create a CST Leaf
                    		if(op != null) {
                    			Leaf opLeaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                    			opLeaf.setKind("op");
                    			opLeaf.setValue(op.getText());
                    			opLeaf.setPos(op.getCharPositionInLine());
                    			opLeaf.setLine(op.getLine());
                    			atomReturnNode.getChildren().add(opLeaf);
                    		}
                    		// Returns the Node with CST Leaves/Nodes
                    		retval.returnNode = atomReturnNode;
                    	

                    }
                    break;

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
    // $ANTLR end atom

    public static class notSet_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start notSet
    // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:1783:1: notSet returns [Node returnNode] : TK_0= '~' (notTerminalGen+= notTerminal | blockGen+= block ) ;
    public final notSet_return notSet() throws RecognitionException {
        notSet_return retval = new notSet_return();
        retval.start = input.LT(1);

        Token TK_0=null;
        List list_notTerminalGen=null;
        List list_blockGen=null;
        RuleReturnScope notTerminalGen = null;
        RuleReturnScope blockGen = null;
        try {
            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:1784:1: (TK_0= '~' (notTerminalGen+= notTerminal | blockGen+= block ) )
            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:1784:3: TK_0= '~' (notTerminalGen+= notTerminal | blockGen+= block )
            {
            TK_0=(Token)input.LT(1);
            match(input,89,FOLLOW_89_in_notSet1786); 
            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:1785:3: (notTerminalGen+= notTerminal | blockGen+= block )
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( ((LA54_0>=TOKEN_REF && LA54_0<=CHAR_LITERAL)) ) {
                alt54=1;
            }
            else if ( (LA54_0==82) ) {
                alt54=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1785:3: (notTerminalGen+= notTerminal | blockGen+= block )", 54, 0, input);

                throw nvae;
            }
            switch (alt54) {
                case 1 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:1785:5: notTerminalGen+= notTerminal
                    {
                    pushFollow(FOLLOW_notTerminal_in_notSet1794);
                    notTerminalGen=notTerminal();
                    _fsp--;

                    if (list_notTerminalGen==null) list_notTerminalGen=new ArrayList();
                    list_notTerminalGen.add(notTerminalGen);


                    }
                    break;
                case 2 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:1786:5: blockGen+= block
                    {
                    pushFollow(FOLLOW_block_in_notSet1803);
                    blockGen=block();
                    _fsp--;

                    if (list_blockGen==null) list_blockGen=new ArrayList();
                    list_blockGen.add(blockGen);


                    }
                    break;

            }

            
            		// Create return CST Node
            		Node notSetReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
            		notSetReturnNode.setKind("notSet");
            	    // Create a Token CST Leaf	
            	    if(TK_0 != null) {
            			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
            	 		TK_0Leaf.setKind("TOKEN");
            	 		TK_0Leaf.setValue(TK_0.getText());
            			TK_0Leaf.setPos(TK_0.getCharPositionInLine());
            			TK_0Leaf.setLine(TK_0.getLine());
            	 		notSetReturnNode.getChildren().add(TK_0Leaf);
            	 	}
            	    // Create a CST Node
            		if(list_notTerminalGen != null) {
            	        for(Iterator it = list_notTerminalGen.iterator(); it.hasNext(); )  { 
            	            ANTLRv3Parser.notTerminal_return r = (ANTLRv3Parser.notTerminal_return) it.next(); 
            	            if(r != null && r.returnNode != null) {
            	            	r.returnNode.setKind("notTerminal");
            	            	notSetReturnNode.getChildren().add(r.returnNode);
            	            } 
            	        }
            	    }
            	    // Create a CST Node
            		if(list_blockGen != null) {
            	        for(Iterator it = list_blockGen.iterator(); it.hasNext(); )  { 
            	            ANTLRv3Parser.block_return r = (ANTLRv3Parser.block_return) it.next(); 
            	            if(r != null && r.returnNode != null) {
            	            	r.returnNode.setKind("block");
            	            	notSetReturnNode.getChildren().add(r.returnNode);
            	            } 
            	        }
            	    }
            		// Returns the Node with CST Leaves/Nodes
            		retval.returnNode = notSetReturnNode;
            	

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
    // $ANTLR end notSet

    public static class treeSpec_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start treeSpec
    // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:1826:1: treeSpec returns [Node returnNode] : TK_0= '^(' elementGen+= element (elementGen_1+= element )+ TK_1= ')' ;
    public final treeSpec_return treeSpec() throws RecognitionException {
        treeSpec_return retval = new treeSpec_return();
        retval.start = input.LT(1);

        Token TK_0=null;
        Token TK_1=null;
        List list_elementGen=null;
        List list_elementGen_1=null;
        RuleReturnScope elementGen = null;
        RuleReturnScope elementGen_1 = null;
        try {
            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:1827:1: (TK_0= '^(' elementGen+= element (elementGen_1+= element )+ TK_1= ')' )
            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:1827:3: TK_0= '^(' elementGen+= element (elementGen_1+= element )+ TK_1= ')'
            {
            TK_0=(Token)input.LT(1);
            match(input,TREE_BEGIN,FOLLOW_TREE_BEGIN_in_treeSpec1830); 
            pushFollow(FOLLOW_element_in_treeSpec1834);
            elementGen=element();
            _fsp--;

            if (list_elementGen==null) list_elementGen=new ArrayList();
            list_elementGen.add(elementGen);

            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:1827:33: (elementGen_1+= element )+
            int cnt55=0;
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( (LA55_0==SEMPRED||LA55_0==TREE_BEGIN||(LA55_0>=TOKEN_REF && LA55_0<=ACTION)||LA55_0==RULE_REF||LA55_0==82||LA55_0==89||LA55_0==92) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:1827:35: elementGen_1+= element
            	    {
            	    pushFollow(FOLLOW_element_in_treeSpec1840);
            	    elementGen_1=element();
            	    _fsp--;

            	    if (list_elementGen_1==null) list_elementGen_1=new ArrayList();
            	    list_elementGen_1.add(elementGen_1);


            	    }
            	    break;

            	default :
            	    if ( cnt55 >= 1 ) break loop55;
                        EarlyExitException eee =
                            new EarlyExitException(55, input);
                        throw eee;
                }
                cnt55++;
            } while (true);

            TK_1=(Token)input.LT(1);
            match(input,84,FOLLOW_84_in_treeSpec1847); 
            
            		// Create return CST Node
            		Node treeSpecReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
            		treeSpecReturnNode.setKind("treeSpec");
            	    // Create a Token CST Leaf	
            	    if(TK_0 != null) {
            			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
            	 		TK_0Leaf.setKind("TOKEN");
            	 		TK_0Leaf.setValue(TK_0.getText());
            			TK_0Leaf.setPos(TK_0.getCharPositionInLine());
            			TK_0Leaf.setLine(TK_0.getLine());
            	 		treeSpecReturnNode.getChildren().add(TK_0Leaf);
            	 	}
            	    // Create a CST Node
            		if(list_elementGen != null) {
            	        for(Iterator it = list_elementGen.iterator(); it.hasNext(); )  { 
            	            ANTLRv3Parser.element_return r = (ANTLRv3Parser.element_return) it.next(); 
            	            if(r != null && r.returnNode != null) {
            	            	r.returnNode.setKind("element");
            	            	treeSpecReturnNode.getChildren().add(r.returnNode);
            	            } 
            	        }
            	    }
            	    // Create a CST Node
            		if(list_elementGen_1 != null) {
            	        for(Iterator it = list_elementGen_1.iterator(); it.hasNext(); )  { 
            	            ANTLRv3Parser.element_return r = (ANTLRv3Parser.element_return) it.next(); 
            	            if(r != null && r.returnNode != null) {
            	            	r.returnNode.setKind("element");
            	            	treeSpecReturnNode.getChildren().add(r.returnNode);
            	            } 
            	        }
            	    }
            	    // Create a Token CST Leaf	
            	    if(TK_1 != null) {
            			Leaf TK_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
            	 		TK_1Leaf.setKind("TOKEN");
            	 		TK_1Leaf.setValue(TK_1.getText());
            			TK_1Leaf.setPos(TK_1.getCharPositionInLine());
            			TK_1Leaf.setLine(TK_1.getLine());
            	 		treeSpecReturnNode.getChildren().add(TK_1Leaf);
            	 	}
            		// Returns the Node with CST Leaves/Nodes
            		retval.returnNode = treeSpecReturnNode;
            	

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
    // $ANTLR end treeSpec

    public static class ebnf_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start ebnf
    // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:1876:1: ebnf returns [Node returnNode] : blockGen+= block (TK_0= '?' | TK_1= '*' | TK_2= '+' | TK_3= '^' | TK_4= '!' | TK_5= '=>' | ) ;
    public final ebnf_return ebnf() throws RecognitionException {
        ebnf_return retval = new ebnf_return();
        retval.start = input.LT(1);

        Token TK_0=null;
        Token TK_1=null;
        Token TK_2=null;
        Token TK_3=null;
        Token TK_4=null;
        Token TK_5=null;
        List list_blockGen=null;
        RuleReturnScope blockGen = null;
        try {
            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:1877:1: (blockGen+= block (TK_0= '?' | TK_1= '*' | TK_2= '+' | TK_3= '^' | TK_4= '!' | TK_5= '=>' | ) )
            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:1877:3: blockGen+= block (TK_0= '?' | TK_1= '*' | TK_2= '+' | TK_3= '^' | TK_4= '!' | TK_5= '=>' | )
            {
            pushFollow(FOLLOW_block_in_ebnf1870);
            blockGen=block();
            _fsp--;

            if (list_blockGen==null) list_blockGen=new ArrayList();
            list_blockGen.add(blockGen);

            Token op=input.LT(1);
            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:1878:3: (TK_0= '?' | TK_1= '*' | TK_2= '+' | TK_3= '^' | TK_4= '!' | TK_5= '=>' | )
            int alt56=7;
            switch ( input.LA(1) ) {
            case 90:
                {
                alt56=1;
                }
                break;
            case 74:
                {
                alt56=2;
                }
                break;
            case 91:
                {
                alt56=3;
                }
                break;
            case ROOT:
                {
                alt56=4;
                }
                break;
            case BANG:
                {
                alt56=5;
                }
                break;
            case 88:
                {
                alt56=6;
                }
                break;
            case SEMPRED:
            case TREE_BEGIN:
            case REWRITE:
            case TOKEN_REF:
            case STRING_LITERAL:
            case CHAR_LITERAL:
            case ACTION:
            case RULE_REF:
            case 69:
            case 82:
            case 83:
            case 84:
            case 89:
            case 92:
                {
                alt56=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1878:3: (TK_0= '?' | TK_1= '*' | TK_2= '+' | TK_3= '^' | TK_4= '!' | TK_5= '=>' | )", 56, 0, input);

                throw nvae;
            }

            switch (alt56) {
                case 1 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:1878:5: TK_0= '?'
                    {
                    TK_0=(Token)input.LT(1);
                    match(input,90,FOLLOW_90_in_ebnf1880); 

                    }
                    break;
                case 2 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:1879:5: TK_1= '*'
                    {
                    TK_1=(Token)input.LT(1);
                    match(input,74,FOLLOW_74_in_ebnf1890); 

                    }
                    break;
                case 3 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:1880:5: TK_2= '+'
                    {
                    TK_2=(Token)input.LT(1);
                    match(input,91,FOLLOW_91_in_ebnf1900); 

                    }
                    break;
                case 4 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:1881:7: TK_3= '^'
                    {
                    TK_3=(Token)input.LT(1);
                    match(input,ROOT,FOLLOW_ROOT_in_ebnf1912); 

                    }
                    break;
                case 5 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:1882:7: TK_4= '!'
                    {
                    TK_4=(Token)input.LT(1);
                    match(input,BANG,FOLLOW_BANG_in_ebnf1924); 

                    }
                    break;
                case 6 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:1883:7: TK_5= '=>'
                    {
                    TK_5=(Token)input.LT(1);
                    match(input,88,FOLLOW_88_in_ebnf1936); 

                    }
                    break;
                case 7 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:1885:3: 
                    {
                    }
                    break;

            }

            
            		// Create return CST Node
            		Node ebnfReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
            		ebnfReturnNode.setKind("ebnf");
            	    // Create a CST Node
            		if(list_blockGen != null) {
            	        for(Iterator it = list_blockGen.iterator(); it.hasNext(); )  { 
            	            ANTLRv3Parser.block_return r = (ANTLRv3Parser.block_return) it.next(); 
            	            if(r != null && r.returnNode != null) {
            	            	r.returnNode.setKind("block");
            	            	ebnfReturnNode.getChildren().add(r.returnNode);
            	            } 
            	        }
            	    }
            	    // Create a Token CST Leaf	
            	    if(TK_0 != null) {
            			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
            	 		TK_0Leaf.setKind("TOKEN");
            	 		TK_0Leaf.setValue(TK_0.getText());
            			TK_0Leaf.setPos(TK_0.getCharPositionInLine());
            			TK_0Leaf.setLine(TK_0.getLine());
            	 		ebnfReturnNode.getChildren().add(TK_0Leaf);
            	 	}
            	    // Create a Token CST Leaf	
            	    if(TK_1 != null) {
            			Leaf TK_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
            	 		TK_1Leaf.setKind("TOKEN");
            	 		TK_1Leaf.setValue(TK_1.getText());
            			TK_1Leaf.setPos(TK_1.getCharPositionInLine());
            			TK_1Leaf.setLine(TK_1.getLine());
            	 		ebnfReturnNode.getChildren().add(TK_1Leaf);
            	 	}
            	    // Create a Token CST Leaf	
            	    if(TK_2 != null) {
            			Leaf TK_2Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
            	 		TK_2Leaf.setKind("TOKEN");
            	 		TK_2Leaf.setValue(TK_2.getText());
            			TK_2Leaf.setPos(TK_2.getCharPositionInLine());
            			TK_2Leaf.setLine(TK_2.getLine());
            	 		ebnfReturnNode.getChildren().add(TK_2Leaf);
            	 	}
            	    // Create a Token CST Leaf	
            	    if(TK_3 != null) {
            			Leaf TK_3Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
            	 		TK_3Leaf.setKind("TOKEN");
            	 		TK_3Leaf.setValue(TK_3.getText());
            			TK_3Leaf.setPos(TK_3.getCharPositionInLine());
            			TK_3Leaf.setLine(TK_3.getLine());
            	 		ebnfReturnNode.getChildren().add(TK_3Leaf);
            	 	}
            	    // Create a Token CST Leaf	
            	    if(TK_4 != null) {
            			Leaf TK_4Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
            	 		TK_4Leaf.setKind("TOKEN");
            	 		TK_4Leaf.setValue(TK_4.getText());
            			TK_4Leaf.setPos(TK_4.getCharPositionInLine());
            			TK_4Leaf.setLine(TK_4.getLine());
            	 		ebnfReturnNode.getChildren().add(TK_4Leaf);
            	 	}
            	    // Create a Token CST Leaf	
            	    if(TK_5 != null) {
            			Leaf TK_5Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
            	 		TK_5Leaf.setKind("TOKEN");
            	 		TK_5Leaf.setValue(TK_5.getText());
            			TK_5Leaf.setPos(TK_5.getCharPositionInLine());
            			TK_5Leaf.setLine(TK_5.getLine());
            	 		ebnfReturnNode.getChildren().add(TK_5Leaf);
            	 	}
            		// Returns the Node with CST Leaves/Nodes
            		retval.returnNode = ebnfReturnNode;
            	

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
    // $ANTLR end ebnf

    public static class range_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start range
    // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:1959:1: range returns [Node returnNode] : CHAR_LITERALGen= CHAR_LITERAL RANGEGen= RANGE CHAR_LITERALGen_1= CHAR_LITERAL ;
    public final range_return range() throws RecognitionException {
        range_return retval = new range_return();
        retval.start = input.LT(1);

        Token CHAR_LITERALGen=null;
        Token RANGEGen=null;
        Token CHAR_LITERALGen_1=null;

        try {
            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:1960:1: (CHAR_LITERALGen= CHAR_LITERAL RANGEGen= RANGE CHAR_LITERALGen_1= CHAR_LITERAL )
            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:1960:3: CHAR_LITERALGen= CHAR_LITERAL RANGEGen= RANGE CHAR_LITERALGen_1= CHAR_LITERAL
            {
            CHAR_LITERALGen=(Token)input.LT(1);
            match(input,CHAR_LITERAL,FOLLOW_CHAR_LITERAL_in_range1976); 
            RANGEGen=(Token)input.LT(1);
            match(input,RANGE,FOLLOW_RANGE_in_range1980); 
            CHAR_LITERALGen_1=(Token)input.LT(1);
            match(input,CHAR_LITERAL,FOLLOW_CHAR_LITERAL_in_range1984); 
            
            		// Create return CST Node
            		Node rangeReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
            		rangeReturnNode.setKind("range");
            	    // Create a CST Leaf
            		if(CHAR_LITERALGen != null) {
            			Leaf CHAR_LITERALGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf();
            			CHAR_LITERALGenLeaf.setKind("CHAR_LITERAL");
            			CHAR_LITERALGenLeaf.setValue(CHAR_LITERALGen.getText());
            			CHAR_LITERALGenLeaf.setPos(CHAR_LITERALGen.getCharPositionInLine());
            			CHAR_LITERALGenLeaf.setLine(CHAR_LITERALGen.getLine());
            			rangeReturnNode.getChildren().add(CHAR_LITERALGenLeaf);
            		}
            	    // Create a CST Leaf
            		if(RANGEGen != null) {
            			Leaf RANGEGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf();
            			RANGEGenLeaf.setKind("RANGE");
            			RANGEGenLeaf.setValue(RANGEGen.getText());
            			RANGEGenLeaf.setPos(RANGEGen.getCharPositionInLine());
            			RANGEGenLeaf.setLine(RANGEGen.getLine());
            			rangeReturnNode.getChildren().add(RANGEGenLeaf);
            		}
            	    // Create a CST Leaf
            		if(CHAR_LITERALGen_1 != null) {
            			Leaf CHAR_LITERALGen_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
            			CHAR_LITERALGen_1Leaf.setKind("CHAR_LITERAL");
            			CHAR_LITERALGen_1Leaf.setValue(CHAR_LITERALGen_1.getText());
            			CHAR_LITERALGen_1Leaf.setPos(CHAR_LITERALGen_1.getCharPositionInLine());
            			CHAR_LITERALGen_1Leaf.setLine(CHAR_LITERALGen_1.getLine());
            			rangeReturnNode.getChildren().add(CHAR_LITERALGen_1Leaf);
            		}
            		// Returns the Node with CST Leaves/Nodes
            		retval.returnNode = rangeReturnNode;
            	

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
    // $ANTLR end range

    public static class terminal_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start terminal
    // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:1997:1: terminal returns [Node returnNode] : (CHAR_LITERALGen= CHAR_LITERAL | TOKEN_REFGen= TOKEN_REF (ARG_ACTIONGen= ARG_ACTION | ) | STRING_LITERALGen= STRING_LITERAL | TK_0= '.' ) (TK_1= '^' | TK_2= '!' )? ;
    public final terminal_return terminal() throws RecognitionException {
        terminal_return retval = new terminal_return();
        retval.start = input.LT(1);

        Token CHAR_LITERALGen=null;
        Token TOKEN_REFGen=null;
        Token ARG_ACTIONGen=null;
        Token STRING_LITERALGen=null;
        Token TK_0=null;
        Token TK_1=null;
        Token TK_2=null;

        try {
            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:1998:1: ( (CHAR_LITERALGen= CHAR_LITERAL | TOKEN_REFGen= TOKEN_REF (ARG_ACTIONGen= ARG_ACTION | ) | STRING_LITERALGen= STRING_LITERAL | TK_0= '.' ) (TK_1= '^' | TK_2= '!' )? )
            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:1998:5: (CHAR_LITERALGen= CHAR_LITERAL | TOKEN_REFGen= TOKEN_REF (ARG_ACTIONGen= ARG_ACTION | ) | STRING_LITERALGen= STRING_LITERAL | TK_0= '.' ) (TK_1= '^' | TK_2= '!' )?
            {
            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:1998:5: (CHAR_LITERALGen= CHAR_LITERAL | TOKEN_REFGen= TOKEN_REF (ARG_ACTIONGen= ARG_ACTION | ) | STRING_LITERALGen= STRING_LITERAL | TK_0= '.' )
            int alt58=4;
            switch ( input.LA(1) ) {
            case CHAR_LITERAL:
                {
                alt58=1;
                }
                break;
            case TOKEN_REF:
                {
                alt58=2;
                }
                break;
            case STRING_LITERAL:
                {
                alt58=3;
                }
                break;
            case 92:
                {
                alt58=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1998:5: (CHAR_LITERALGen= CHAR_LITERAL | TOKEN_REFGen= TOKEN_REF (ARG_ACTIONGen= ARG_ACTION | ) | STRING_LITERALGen= STRING_LITERAL | TK_0= '.' )", 58, 0, input);

                throw nvae;
            }

            switch (alt58) {
                case 1 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:1998:7: CHAR_LITERALGen= CHAR_LITERAL
                    {
                    CHAR_LITERALGen=(Token)input.LT(1);
                    match(input,CHAR_LITERAL,FOLLOW_CHAR_LITERAL_in_terminal2009); 

                    }
                    break;
                case 2 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:1999:7: TOKEN_REFGen= TOKEN_REF (ARG_ACTIONGen= ARG_ACTION | )
                    {
                    TOKEN_REFGen=(Token)input.LT(1);
                    match(input,TOKEN_REF,FOLLOW_TOKEN_REF_in_terminal2023); 
                    // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:2000:4: (ARG_ACTIONGen= ARG_ACTION | )
                    int alt57=2;
                    int LA57_0 = input.LA(1);

                    if ( (LA57_0==ARG_ACTION) ) {
                        alt57=1;
                    }
                    else if ( (LA57_0==SEMPRED||(LA57_0>=TREE_BEGIN && LA57_0<=REWRITE)||(LA57_0>=TOKEN_REF && LA57_0<=ACTION)||LA57_0==RULE_REF||LA57_0==69||LA57_0==74||(LA57_0>=82 && LA57_0<=84)||(LA57_0>=89 && LA57_0<=92)) ) {
                        alt57=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("2000:4: (ARG_ACTIONGen= ARG_ACTION | )", 57, 0, input);

                        throw nvae;
                    }
                    switch (alt57) {
                        case 1 :
                            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:2000:6: ARG_ACTIONGen= ARG_ACTION
                            {
                            ARG_ACTIONGen=(Token)input.LT(1);
                            match(input,ARG_ACTION,FOLLOW_ARG_ACTION_in_terminal2032); 

                            }
                            break;
                        case 2 :
                            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:2002:4: 
                            {
                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:2003:7: STRING_LITERALGen= STRING_LITERAL
                    {
                    STRING_LITERALGen=(Token)input.LT(1);
                    match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_terminal2062); 

                    }
                    break;
                case 4 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:2004:7: TK_0= '.'
                    {
                    TK_0=(Token)input.LT(1);
                    match(input,92,FOLLOW_92_in_terminal2076); 

                    }
                    break;

            }

            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:2006:3: (TK_1= '^' | TK_2= '!' )?
            int alt59=3;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==ROOT) ) {
                alt59=1;
            }
            else if ( (LA59_0==BANG) ) {
                alt59=2;
            }
            switch (alt59) {
                case 1 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:2006:5: TK_1= '^'
                    {
                    TK_1=(Token)input.LT(1);
                    match(input,ROOT,FOLLOW_ROOT_in_terminal2096); 

                    }
                    break;
                case 2 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:2007:5: TK_2= '!'
                    {
                    TK_2=(Token)input.LT(1);
                    match(input,BANG,FOLLOW_BANG_in_terminal2111); 

                    }
                    break;

            }

            
            		// Create return CST Node
            		Node terminalReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
            		terminalReturnNode.setKind("terminal");
            	    // Create a CST Leaf
            		if(CHAR_LITERALGen != null) {
            			Leaf CHAR_LITERALGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf();
            			CHAR_LITERALGenLeaf.setKind("CHAR_LITERAL");
            			CHAR_LITERALGenLeaf.setValue(CHAR_LITERALGen.getText());
            			CHAR_LITERALGenLeaf.setPos(CHAR_LITERALGen.getCharPositionInLine());
            			CHAR_LITERALGenLeaf.setLine(CHAR_LITERALGen.getLine());
            			terminalReturnNode.getChildren().add(CHAR_LITERALGenLeaf);
            		}
            	    // Create a CST Leaf
            		if(TOKEN_REFGen != null) {
            			Leaf TOKEN_REFGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf();
            			TOKEN_REFGenLeaf.setKind("TOKEN_REF");
            			TOKEN_REFGenLeaf.setValue(TOKEN_REFGen.getText());
            			TOKEN_REFGenLeaf.setPos(TOKEN_REFGen.getCharPositionInLine());
            			TOKEN_REFGenLeaf.setLine(TOKEN_REFGen.getLine());
            			terminalReturnNode.getChildren().add(TOKEN_REFGenLeaf);
            		}
            	    // Create a CST Leaf
            		if(ARG_ACTIONGen != null) {
            			Leaf ARG_ACTIONGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf();
            			ARG_ACTIONGenLeaf.setKind("ARG_ACTION");
            			ARG_ACTIONGenLeaf.setValue(ARG_ACTIONGen.getText());
            			ARG_ACTIONGenLeaf.setPos(ARG_ACTIONGen.getCharPositionInLine());
            			ARG_ACTIONGenLeaf.setLine(ARG_ACTIONGen.getLine());
            			terminalReturnNode.getChildren().add(ARG_ACTIONGenLeaf);
            		}
            	    // Create a CST Leaf
            		if(STRING_LITERALGen != null) {
            			Leaf STRING_LITERALGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf();
            			STRING_LITERALGenLeaf.setKind("STRING_LITERAL");
            			STRING_LITERALGenLeaf.setValue(STRING_LITERALGen.getText());
            			STRING_LITERALGenLeaf.setPos(STRING_LITERALGen.getCharPositionInLine());
            			STRING_LITERALGenLeaf.setLine(STRING_LITERALGen.getLine());
            			terminalReturnNode.getChildren().add(STRING_LITERALGenLeaf);
            		}
            	    // Create a Token CST Leaf	
            	    if(TK_0 != null) {
            			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
            	 		TK_0Leaf.setKind("TOKEN");
            	 		TK_0Leaf.setValue(TK_0.getText());
            			TK_0Leaf.setPos(TK_0.getCharPositionInLine());
            			TK_0Leaf.setLine(TK_0.getLine());
            	 		terminalReturnNode.getChildren().add(TK_0Leaf);
            	 	}
            	    // Create a Token CST Leaf	
            	    if(TK_1 != null) {
            			Leaf TK_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
            	 		TK_1Leaf.setKind("TOKEN");
            	 		TK_1Leaf.setValue(TK_1.getText());
            			TK_1Leaf.setPos(TK_1.getCharPositionInLine());
            			TK_1Leaf.setLine(TK_1.getLine());
            	 		terminalReturnNode.getChildren().add(TK_1Leaf);
            	 	}
            	    // Create a Token CST Leaf	
            	    if(TK_2 != null) {
            			Leaf TK_2Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
            	 		TK_2Leaf.setKind("TOKEN");
            	 		TK_2Leaf.setValue(TK_2.getText());
            			TK_2Leaf.setPos(TK_2.getCharPositionInLine());
            			TK_2Leaf.setLine(TK_2.getLine());
            	 		terminalReturnNode.getChildren().add(TK_2Leaf);
            	 	}
            		// Returns the Node with CST Leaves/Nodes
            		retval.returnNode = terminalReturnNode;
            	

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
    // $ANTLR end terminal

    public static class notTerminal_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start notTerminal
    // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:2081:1: notTerminal returns [Node returnNode] : (CHAR_LITERALGen= CHAR_LITERAL | TOKEN_REFGen= TOKEN_REF | STRING_LITERALGen= STRING_LITERAL );
    public final notTerminal_return notTerminal() throws RecognitionException {
        notTerminal_return retval = new notTerminal_return();
        retval.start = input.LT(1);

        Token CHAR_LITERALGen=null;
        Token TOKEN_REFGen=null;
        Token STRING_LITERALGen=null;

        try {
            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:2082:1: (CHAR_LITERALGen= CHAR_LITERAL | TOKEN_REFGen= TOKEN_REF | STRING_LITERALGen= STRING_LITERAL )
            int alt60=3;
            switch ( input.LA(1) ) {
            case CHAR_LITERAL:
                {
                alt60=1;
                }
                break;
            case TOKEN_REF:
                {
                alt60=2;
                }
                break;
            case STRING_LITERAL:
                {
                alt60=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("2081:1: notTerminal returns [Node returnNode] : (CHAR_LITERALGen= CHAR_LITERAL | TOKEN_REFGen= TOKEN_REF | STRING_LITERALGen= STRING_LITERAL );", 60, 0, input);

                throw nvae;
            }

            switch (alt60) {
                case 1 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:2082:5: CHAR_LITERALGen= CHAR_LITERAL
                    {
                    CHAR_LITERALGen=(Token)input.LT(1);
                    match(input,CHAR_LITERAL,FOLLOW_CHAR_LITERAL_in_notTerminal2146); 
                    
                    		// Create return CST Node
                    		Node notTerminalReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                    		notTerminalReturnNode.setKind("notTerminal");
                    	    // Create a CST Leaf
                    		if(CHAR_LITERALGen != null) {
                    			Leaf CHAR_LITERALGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                    			CHAR_LITERALGenLeaf.setKind("CHAR_LITERAL");
                    			CHAR_LITERALGenLeaf.setValue(CHAR_LITERALGen.getText());
                    			CHAR_LITERALGenLeaf.setPos(CHAR_LITERALGen.getCharPositionInLine());
                    			CHAR_LITERALGenLeaf.setLine(CHAR_LITERALGen.getLine());
                    			notTerminalReturnNode.getChildren().add(CHAR_LITERALGenLeaf);
                    		}
                    		// Returns the Node with CST Leaves/Nodes
                    		retval.returnNode = notTerminalReturnNode;
                    	

                    }
                    break;
                case 2 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:2099:4: TOKEN_REFGen= TOKEN_REF
                    {
                    TOKEN_REFGen=(Token)input.LT(1);
                    match(input,TOKEN_REF,FOLLOW_TOKEN_REF_in_notTerminal2157); 
                    
                    		// Create return CST Node
                    		Node notTerminalReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                    		notTerminalReturnNode.setKind("notTerminal");
                    	    // Create a CST Leaf
                    		if(TOKEN_REFGen != null) {
                    			Leaf TOKEN_REFGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                    			TOKEN_REFGenLeaf.setKind("TOKEN_REF");
                    			TOKEN_REFGenLeaf.setValue(TOKEN_REFGen.getText());
                    			TOKEN_REFGenLeaf.setPos(TOKEN_REFGen.getCharPositionInLine());
                    			TOKEN_REFGenLeaf.setLine(TOKEN_REFGen.getLine());
                    			notTerminalReturnNode.getChildren().add(TOKEN_REFGenLeaf);
                    		}
                    		// Returns the Node with CST Leaves/Nodes
                    		retval.returnNode = notTerminalReturnNode;
                    	

                    }
                    break;
                case 3 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:2116:4: STRING_LITERALGen= STRING_LITERAL
                    {
                    STRING_LITERALGen=(Token)input.LT(1);
                    match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_notTerminal2168); 
                    
                    		// Create return CST Node
                    		Node notTerminalReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                    		notTerminalReturnNode.setKind("notTerminal");
                    	    // Create a CST Leaf
                    		if(STRING_LITERALGen != null) {
                    			Leaf STRING_LITERALGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                    			STRING_LITERALGenLeaf.setKind("STRING_LITERAL");
                    			STRING_LITERALGenLeaf.setValue(STRING_LITERALGen.getText());
                    			STRING_LITERALGenLeaf.setPos(STRING_LITERALGen.getCharPositionInLine());
                    			STRING_LITERALGenLeaf.setLine(STRING_LITERALGen.getLine());
                    			notTerminalReturnNode.getChildren().add(STRING_LITERALGenLeaf);
                    		}
                    		// Returns the Node with CST Leaves/Nodes
                    		retval.returnNode = notTerminalReturnNode;
                    	

                    }
                    break;

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
    // $ANTLR end notTerminal

    public static class ebnfSuffix_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start ebnfSuffix
    // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:2135:1: ebnfSuffix returns [Node returnNode] : (TK_0= '?' | TK_0= '*' | TK_0= '+' );
    public final ebnfSuffix_return ebnfSuffix() throws RecognitionException {
        ebnfSuffix_return retval = new ebnfSuffix_return();
        retval.start = input.LT(1);

        Token TK_0=null;

        try {
            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:2136:1: (TK_0= '?' | TK_0= '*' | TK_0= '+' )
            int alt61=3;
            switch ( input.LA(1) ) {
            case 90:
                {
                alt61=1;
                }
                break;
            case 74:
                {
                alt61=2;
                }
                break;
            case 91:
                {
                alt61=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("2135:1: ebnfSuffix returns [Node returnNode] : (TK_0= '?' | TK_0= '*' | TK_0= '+' );", 61, 0, input);

                throw nvae;
            }

            switch (alt61) {
                case 1 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:2136:3: TK_0= '?'
                    {
                    TK_0=(Token)input.LT(1);
                    match(input,90,FOLLOW_90_in_ebnfSuffix2190); 
                    
                    		// Create return CST Node
                    		Node ebnfSuffixReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                    		ebnfSuffixReturnNode.setKind("ebnfSuffix");
                    	    // Create a Token CST Leaf	
                    	    if(TK_0 != null) {
                    			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                    	 		TK_0Leaf.setKind("TOKEN");
                    	 		TK_0Leaf.setValue(TK_0.getText());
                    			TK_0Leaf.setPos(TK_0.getCharPositionInLine());
                    			TK_0Leaf.setLine(TK_0.getLine());
                    	 		ebnfSuffixReturnNode.getChildren().add(TK_0Leaf);
                    	 	}
                    		// Returns the Node with CST Leaves/Nodes
                    		retval.returnNode = ebnfSuffixReturnNode;
                    	

                    }
                    break;
                case 2 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:2153:6: TK_0= '*'
                    {
                    TK_0=(Token)input.LT(1);
                    match(input,74,FOLLOW_74_in_ebnfSuffix2203); 
                    
                    		// Create return CST Node
                    		Node ebnfSuffixReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                    		ebnfSuffixReturnNode.setKind("ebnfSuffix");
                    	    // Create a Token CST Leaf	
                    	    if(TK_0 != null) {
                    			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                    	 		TK_0Leaf.setKind("TOKEN");
                    	 		TK_0Leaf.setValue(TK_0.getText());
                    			TK_0Leaf.setPos(TK_0.getCharPositionInLine());
                    			TK_0Leaf.setLine(TK_0.getLine());
                    	 		ebnfSuffixReturnNode.getChildren().add(TK_0Leaf);
                    	 	}
                    		// Returns the Node with CST Leaves/Nodes
                    		retval.returnNode = ebnfSuffixReturnNode;
                    	

                    }
                    break;
                case 3 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:2170:7: TK_0= '+'
                    {
                    TK_0=(Token)input.LT(1);
                    match(input,91,FOLLOW_91_in_ebnfSuffix2217); 
                    
                    		// Create return CST Node
                    		Node ebnfSuffixReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                    		ebnfSuffixReturnNode.setKind("ebnfSuffix");
                    	    // Create a Token CST Leaf	
                    	    if(TK_0 != null) {
                    			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                    	 		TK_0Leaf.setKind("TOKEN");
                    	 		TK_0Leaf.setValue(TK_0.getText());
                    			TK_0Leaf.setPos(TK_0.getCharPositionInLine());
                    			TK_0Leaf.setLine(TK_0.getLine());
                    	 		ebnfSuffixReturnNode.getChildren().add(TK_0Leaf);
                    	 	}
                    		// Returns the Node with CST Leaves/Nodes
                    		retval.returnNode = ebnfSuffixReturnNode;
                    	

                    }
                    break;

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
    // $ANTLR end ebnfSuffix

    public static class rewrite_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start rewrite
    // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:2193:1: rewrite returns [Node returnNode] : ( (TK_0= '->' SEMPREDGen_List+= SEMPRED rewrite_alternativeGen+= rewrite_alternative )* TK_1= '->' rewrite_alternativeGen_1+= rewrite_alternative | );
    public final rewrite_return rewrite() throws RecognitionException {
        rewrite_return retval = new rewrite_return();
        retval.start = input.LT(1);

        Token TK_0=null;
        Token TK_1=null;
        Token SEMPREDGen_List=null;
        List list_SEMPREDGen_List=null;
        List list_rewrite_alternativeGen=null;
        List list_rewrite_alternativeGen_1=null;
        RuleReturnScope rewrite_alternativeGen = null;
        RuleReturnScope rewrite_alternativeGen_1 = null;
        try {
            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:2194:1: ( (TK_0= '->' SEMPREDGen_List+= SEMPRED rewrite_alternativeGen+= rewrite_alternative )* TK_1= '->' rewrite_alternativeGen_1+= rewrite_alternative | )
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==REWRITE) ) {
                alt63=1;
            }
            else if ( (LA63_0==69||(LA63_0>=83 && LA63_0<=84)) ) {
                alt63=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("2193:1: rewrite returns [Node returnNode] : ( (TK_0= '->' SEMPREDGen_List+= SEMPRED rewrite_alternativeGen+= rewrite_alternative )* TK_1= '->' rewrite_alternativeGen_1+= rewrite_alternative | );", 63, 0, input);

                throw nvae;
            }
            switch (alt63) {
                case 1 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:2194:3: (TK_0= '->' SEMPREDGen_List+= SEMPRED rewrite_alternativeGen+= rewrite_alternative )* TK_1= '->' rewrite_alternativeGen_1+= rewrite_alternative
                    {
                    // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:2194:3: (TK_0= '->' SEMPREDGen_List+= SEMPRED rewrite_alternativeGen+= rewrite_alternative )*
                    loop62:
                    do {
                        int alt62=2;
                        int LA62_0 = input.LA(1);

                        if ( (LA62_0==REWRITE) ) {
                            int LA62_1 = input.LA(2);

                            if ( (LA62_1==SEMPRED) ) {
                                alt62=1;
                            }


                        }


                        switch (alt62) {
                    	case 1 :
                    	    // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:2194:4: TK_0= '->' SEMPREDGen_List+= SEMPRED rewrite_alternativeGen+= rewrite_alternative
                    	    {
                    	    TK_0=(Token)input.LT(1);
                    	    match(input,REWRITE,FOLLOW_REWRITE_in_rewrite2244); 
                    	    SEMPREDGen_List=(Token)input.LT(1);
                    	    match(input,SEMPRED,FOLLOW_SEMPRED_in_rewrite2248); 
                    	    if (list_SEMPREDGen_List==null) list_SEMPREDGen_List=new ArrayList();
                    	    list_SEMPREDGen_List.add(SEMPREDGen_List);

                    	    pushFollow(FOLLOW_rewrite_alternative_in_rewrite2252);
                    	    rewrite_alternativeGen=rewrite_alternative();
                    	    _fsp--;

                    	    if (list_rewrite_alternativeGen==null) list_rewrite_alternativeGen=new ArrayList();
                    	    list_rewrite_alternativeGen.add(rewrite_alternativeGen);


                    	    }
                    	    break;

                    	default :
                    	    break loop62;
                        }
                    } while (true);

                    TK_1=(Token)input.LT(1);
                    match(input,REWRITE,FOLLOW_REWRITE_in_rewrite2261); 
                    pushFollow(FOLLOW_rewrite_alternative_in_rewrite2265);
                    rewrite_alternativeGen_1=rewrite_alternative();
                    _fsp--;

                    if (list_rewrite_alternativeGen_1==null) list_rewrite_alternativeGen_1=new ArrayList();
                    list_rewrite_alternativeGen_1.add(rewrite_alternativeGen_1);

                    
                    		// Create return CST Node
                    		Node rewriteReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                    		rewriteReturnNode.setKind("rewrite");
                    	
                    		// Create a special CST Node for terminal SEMPREDGen_List aggregation
                    		if(list_SEMPREDGen_List != null) {
                    	    for(int pos = 0; pos < list_SEMPREDGen_List.size(); pos++ )  { 
                    	    // Create a Token CST Leaf	
                    	    if(TK_0 != null) {
                    			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                    	 		TK_0Leaf.setKind("TOKEN");
                    	 		TK_0Leaf.setValue(TK_0.getText());
                    			TK_0Leaf.setPos(TK_0.getCharPositionInLine());
                    			TK_0Leaf.setLine(TK_0.getLine());
                    	 		rewriteReturnNode.getChildren().add(TK_0Leaf);
                    	 	}
                    		// Terminal extractor
                    	    if(list_SEMPREDGen_List != null) {
                    		    Token t = (Token) list_SEMPREDGen_List.get(pos); 
                    		    Leaf SEMPREDGen_ListLeaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                    			SEMPREDGen_ListLeaf.setKind("SEMPRED");
                    			SEMPREDGen_ListLeaf.setValue(t.getText());
                    			SEMPREDGen_ListLeaf.setPos(t.getCharPositionInLine());
                    			SEMPREDGen_ListLeaf.setLine(t.getLine());
                    			rewriteReturnNode.getChildren().add(SEMPREDGen_ListLeaf);
                    		}
                    		// No Terminal extractor
                    	    if(list_rewrite_alternativeGen != null) {		
                    	    	ANTLRv3Parser.rewrite_alternative_return r = (ANTLRv3Parser.rewrite_alternative_return) list_rewrite_alternativeGen.get(pos); 
                    	    	if(r != null && r.returnNode != null) {
                    	        	r.returnNode.setKind("rewrite_alternative");
                    	    		rewriteReturnNode.getChildren().add(r.returnNode);
                    	    	} 
                    		}
                    		}
                    		}
                    	
                    	    // Create a Token CST Leaf	
                    	    if(TK_1 != null) {
                    			Leaf TK_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                    	 		TK_1Leaf.setKind("TOKEN");
                    	 		TK_1Leaf.setValue(TK_1.getText());
                    			TK_1Leaf.setPos(TK_1.getCharPositionInLine());
                    			TK_1Leaf.setLine(TK_1.getLine());
                    	 		rewriteReturnNode.getChildren().add(TK_1Leaf);
                    	 	}
                    	    // Create a CST Node
                    		if(list_rewrite_alternativeGen_1 != null) {
                    	        for(Iterator it = list_rewrite_alternativeGen_1.iterator(); it.hasNext(); )  { 
                    	            ANTLRv3Parser.rewrite_alternative_return r = (ANTLRv3Parser.rewrite_alternative_return) it.next(); 
                    	            if(r != null && r.returnNode != null) {
                    	            	r.returnNode.setKind("rewrite_alternative");
                    	            	rewriteReturnNode.getChildren().add(r.returnNode);
                    	            } 
                    	        }
                    	    }
                    		// Returns the Node with CST Leaves/Nodes
                    		retval.returnNode = rewriteReturnNode;
                    	

                    }
                    break;
                case 2 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:2257:2: 
                    {
                    }
                    break;

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
    // $ANTLR end rewrite

    public static class rewrite_alternative_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start rewrite_alternative
    // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:2259:1: rewrite_alternative returns [Node returnNode] : (rewrite_templateGen+= rewrite_template | rewrite_tree_alternativeGen+= rewrite_tree_alternative | );
    public final rewrite_alternative_return rewrite_alternative() throws RecognitionException {
        rewrite_alternative_return retval = new rewrite_alternative_return();
        retval.start = input.LT(1);

        List list_rewrite_templateGen=null;
        List list_rewrite_tree_alternativeGen=null;
        RuleReturnScope rewrite_templateGen = null;
        RuleReturnScope rewrite_tree_alternativeGen = null;
        try {
            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:2260:1: (rewrite_templateGen+= rewrite_template | rewrite_tree_alternativeGen+= rewrite_tree_alternative | )
            int alt64=3;
            switch ( input.LA(1) ) {
            case TOKEN_REF:
                {
                int LA64_1 = input.LA(2);

                if ( (LA64_1==TREE_BEGIN||LA64_1==REWRITE||(LA64_1>=TOKEN_REF && LA64_1<=ACTION)||(LA64_1>=ARG_ACTION && LA64_1<=RULE_REF)||LA64_1==69||LA64_1==74||(LA64_1>=83 && LA64_1<=84)||(LA64_1>=90 && LA64_1<=91)||LA64_1==93) ) {
                    alt64=2;
                }
                else if ( (LA64_1==82) ) {
                    switch ( input.LA(3) ) {
                    case TOKEN_REF:
                        {
                        int LA64_9 = input.LA(4);

                        if ( (LA64_9==71) ) {
                            alt64=1;
                        }
                        else if ( (LA64_9==TREE_BEGIN||(LA64_9>=TOKEN_REF && LA64_9<=ACTION)||(LA64_9>=ARG_ACTION && LA64_9<=RULE_REF)||LA64_9==74||LA64_9==82||LA64_9==84||(LA64_9>=90 && LA64_9<=91)||LA64_9==93) ) {
                            alt64=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("2259:1: rewrite_alternative returns [Node returnNode] : (rewrite_templateGen+= rewrite_template | rewrite_tree_alternativeGen+= rewrite_tree_alternative | );", 64, 9, input);

                            throw nvae;
                        }
                        }
                        break;
                    case RULE_REF:
                        {
                        int LA64_10 = input.LA(4);

                        if ( (LA64_10==TREE_BEGIN||(LA64_10>=TOKEN_REF && LA64_10<=ACTION)||LA64_10==RULE_REF||LA64_10==74||LA64_10==82||LA64_10==84||(LA64_10>=90 && LA64_10<=91)||LA64_10==93) ) {
                            alt64=2;
                        }
                        else if ( (LA64_10==71) ) {
                            alt64=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("2259:1: rewrite_alternative returns [Node returnNode] : (rewrite_templateGen+= rewrite_template | rewrite_tree_alternativeGen+= rewrite_tree_alternative | );", 64, 10, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 84:
                        {
                        alt64=1;
                        }
                        break;
                    case TREE_BEGIN:
                    case STRING_LITERAL:
                    case CHAR_LITERAL:
                    case ACTION:
                    case 82:
                    case 93:
                        {
                        alt64=2;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("2259:1: rewrite_alternative returns [Node returnNode] : (rewrite_templateGen+= rewrite_template | rewrite_tree_alternativeGen+= rewrite_tree_alternative | );", 64, 7, input);

                        throw nvae;
                    }

                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("2259:1: rewrite_alternative returns [Node returnNode] : (rewrite_templateGen+= rewrite_template | rewrite_tree_alternativeGen+= rewrite_tree_alternative | );", 64, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_REF:
                {
                int LA64_2 = input.LA(2);

                if ( (LA64_2==82) ) {
                    switch ( input.LA(3) ) {
                    case TOKEN_REF:
                        {
                        int LA64_9 = input.LA(4);

                        if ( (LA64_9==71) ) {
                            alt64=1;
                        }
                        else if ( (LA64_9==TREE_BEGIN||(LA64_9>=TOKEN_REF && LA64_9<=ACTION)||(LA64_9>=ARG_ACTION && LA64_9<=RULE_REF)||LA64_9==74||LA64_9==82||LA64_9==84||(LA64_9>=90 && LA64_9<=91)||LA64_9==93) ) {
                            alt64=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("2259:1: rewrite_alternative returns [Node returnNode] : (rewrite_templateGen+= rewrite_template | rewrite_tree_alternativeGen+= rewrite_tree_alternative | );", 64, 9, input);

                            throw nvae;
                        }
                        }
                        break;
                    case RULE_REF:
                        {
                        int LA64_10 = input.LA(4);

                        if ( (LA64_10==TREE_BEGIN||(LA64_10>=TOKEN_REF && LA64_10<=ACTION)||LA64_10==RULE_REF||LA64_10==74||LA64_10==82||LA64_10==84||(LA64_10>=90 && LA64_10<=91)||LA64_10==93) ) {
                            alt64=2;
                        }
                        else if ( (LA64_10==71) ) {
                            alt64=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("2259:1: rewrite_alternative returns [Node returnNode] : (rewrite_templateGen+= rewrite_template | rewrite_tree_alternativeGen+= rewrite_tree_alternative | );", 64, 10, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 84:
                        {
                        alt64=1;
                        }
                        break;
                    case TREE_BEGIN:
                    case STRING_LITERAL:
                    case CHAR_LITERAL:
                    case ACTION:
                    case 82:
                    case 93:
                        {
                        alt64=2;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("2259:1: rewrite_alternative returns [Node returnNode] : (rewrite_templateGen+= rewrite_template | rewrite_tree_alternativeGen+= rewrite_tree_alternative | );", 64, 7, input);

                        throw nvae;
                    }

                }
                else if ( (LA64_2==TREE_BEGIN||LA64_2==REWRITE||(LA64_2>=TOKEN_REF && LA64_2<=ACTION)||LA64_2==RULE_REF||LA64_2==69||LA64_2==74||(LA64_2>=83 && LA64_2<=84)||(LA64_2>=90 && LA64_2<=91)||LA64_2==93) ) {
                    alt64=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("2259:1: rewrite_alternative returns [Node returnNode] : (rewrite_templateGen+= rewrite_template | rewrite_tree_alternativeGen+= rewrite_tree_alternative | );", 64, 2, input);

                    throw nvae;
                }
                }
                break;
            case 82:
                {
                int LA64_3 = input.LA(2);

                if ( (LA64_3==ACTION) ) {
                    int LA64_8 = input.LA(3);

                    if ( (LA64_8==84) ) {
                        int LA64_11 = input.LA(4);

                        if ( (LA64_11==82) ) {
                            alt64=1;
                        }
                        else if ( (LA64_11==74||(LA64_11>=90 && LA64_11<=91)) ) {
                            alt64=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("2259:1: rewrite_alternative returns [Node returnNode] : (rewrite_templateGen+= rewrite_template | rewrite_tree_alternativeGen+= rewrite_tree_alternative | );", 64, 11, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA64_8==TREE_BEGIN||(LA64_8>=TOKEN_REF && LA64_8<=ACTION)||LA64_8==RULE_REF||LA64_8==74||LA64_8==82||(LA64_8>=90 && LA64_8<=91)||LA64_8==93) ) {
                        alt64=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("2259:1: rewrite_alternative returns [Node returnNode] : (rewrite_templateGen+= rewrite_template | rewrite_tree_alternativeGen+= rewrite_tree_alternative | );", 64, 8, input);

                        throw nvae;
                    }
                }
                else if ( (LA64_3==TREE_BEGIN||(LA64_3>=TOKEN_REF && LA64_3<=CHAR_LITERAL)||LA64_3==RULE_REF||LA64_3==82||LA64_3==93) ) {
                    alt64=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("2259:1: rewrite_alternative returns [Node returnNode] : (rewrite_templateGen+= rewrite_template | rewrite_tree_alternativeGen+= rewrite_tree_alternative | );", 64, 3, input);

                    throw nvae;
                }
                }
                break;
            case ACTION:
                {
                alt64=1;
                }
                break;
            case TREE_BEGIN:
            case STRING_LITERAL:
            case CHAR_LITERAL:
            case 93:
                {
                alt64=2;
                }
                break;
            case REWRITE:
            case 69:
            case 83:
            case 84:
                {
                alt64=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("2259:1: rewrite_alternative returns [Node returnNode] : (rewrite_templateGen+= rewrite_template | rewrite_tree_alternativeGen+= rewrite_tree_alternative | );", 64, 0, input);

                throw nvae;
            }

            switch (alt64) {
                case 1 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:2260:3: rewrite_templateGen+= rewrite_template
                    {
                    pushFollow(FOLLOW_rewrite_template_in_rewrite_alternative2289);
                    rewrite_templateGen=rewrite_template();
                    _fsp--;

                    if (list_rewrite_templateGen==null) list_rewrite_templateGen=new ArrayList();
                    list_rewrite_templateGen.add(rewrite_templateGen);

                    
                    		// Create return CST Node
                    		Node rewrite_alternativeReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                    		rewrite_alternativeReturnNode.setKind("rewrite_alternative");
                    	    // Create a CST Node
                    		if(list_rewrite_templateGen != null) {
                    	        for(Iterator it = list_rewrite_templateGen.iterator(); it.hasNext(); )  { 
                    	            ANTLRv3Parser.rewrite_template_return r = (ANTLRv3Parser.rewrite_template_return) it.next(); 
                    	            if(r != null && r.returnNode != null) {
                    	            	r.returnNode.setKind("rewrite_template");
                    	            	rewrite_alternativeReturnNode.getChildren().add(r.returnNode);
                    	            } 
                    	        }
                    	    }
                    		// Returns the Node with CST Leaves/Nodes
                    		retval.returnNode = rewrite_alternativeReturnNode;
                    	

                    }
                    break;
                case 2 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:2278:4: rewrite_tree_alternativeGen+= rewrite_tree_alternative
                    {
                    pushFollow(FOLLOW_rewrite_tree_alternative_in_rewrite_alternative2300);
                    rewrite_tree_alternativeGen=rewrite_tree_alternative();
                    _fsp--;

                    if (list_rewrite_tree_alternativeGen==null) list_rewrite_tree_alternativeGen=new ArrayList();
                    list_rewrite_tree_alternativeGen.add(rewrite_tree_alternativeGen);

                    
                    		// Create return CST Node
                    		Node rewrite_alternativeReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                    		rewrite_alternativeReturnNode.setKind("rewrite_alternative");
                    	    // Create a CST Node
                    		if(list_rewrite_tree_alternativeGen != null) {
                    	        for(Iterator it = list_rewrite_tree_alternativeGen.iterator(); it.hasNext(); )  { 
                    	            ANTLRv3Parser.rewrite_tree_alternative_return r = (ANTLRv3Parser.rewrite_tree_alternative_return) it.next(); 
                    	            if(r != null && r.returnNode != null) {
                    	            	r.returnNode.setKind("rewrite_tree_alternative");
                    	            	rewrite_alternativeReturnNode.getChildren().add(r.returnNode);
                    	            } 
                    	        }
                    	    }
                    		// Returns the Node with CST Leaves/Nodes
                    		retval.returnNode = rewrite_alternativeReturnNode;
                    	

                    }
                    break;
                case 3 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:2297:2: 
                    {
                    }
                    break;

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
    // $ANTLR end rewrite_alternative

    public static class rewrite_template_block_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start rewrite_template_block
    // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:2299:1: rewrite_template_block returns [Node returnNode] : TK_0= '(' rewrite_templateGen+= rewrite_template TK_1= ')' ;
    public final rewrite_template_block_return rewrite_template_block() throws RecognitionException {
        rewrite_template_block_return retval = new rewrite_template_block_return();
        retval.start = input.LT(1);

        Token TK_0=null;
        Token TK_1=null;
        List list_rewrite_templateGen=null;
        RuleReturnScope rewrite_templateGen = null;
        try {
            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:2300:1: (TK_0= '(' rewrite_templateGen+= rewrite_template TK_1= ')' )
            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:2300:5: TK_0= '(' rewrite_templateGen+= rewrite_template TK_1= ')'
            {
            TK_0=(Token)input.LT(1);
            match(input,82,FOLLOW_82_in_rewrite_template_block2335); 
            pushFollow(FOLLOW_rewrite_template_in_rewrite_template_block2339);
            rewrite_templateGen=rewrite_template();
            _fsp--;

            if (list_rewrite_templateGen==null) list_rewrite_templateGen=new ArrayList();
            list_rewrite_templateGen.add(rewrite_templateGen);

            TK_1=(Token)input.LT(1);
            match(input,84,FOLLOW_84_in_rewrite_template_block2343); 
            
            		// Create return CST Node
            		Node rewrite_template_blockReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
            		rewrite_template_blockReturnNode.setKind("rewrite_template_block");
            	    // Create a Token CST Leaf	
            	    if(TK_0 != null) {
            			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
            	 		TK_0Leaf.setKind("TOKEN");
            	 		TK_0Leaf.setValue(TK_0.getText());
            			TK_0Leaf.setPos(TK_0.getCharPositionInLine());
            			TK_0Leaf.setLine(TK_0.getLine());
            	 		rewrite_template_blockReturnNode.getChildren().add(TK_0Leaf);
            	 	}
            	    // Create a CST Node
            		if(list_rewrite_templateGen != null) {
            	        for(Iterator it = list_rewrite_templateGen.iterator(); it.hasNext(); )  { 
            	            ANTLRv3Parser.rewrite_template_return r = (ANTLRv3Parser.rewrite_template_return) it.next(); 
            	            if(r != null && r.returnNode != null) {
            	            	r.returnNode.setKind("rewrite_template");
            	            	rewrite_template_blockReturnNode.getChildren().add(r.returnNode);
            	            } 
            	        }
            	    }
            	    // Create a Token CST Leaf	
            	    if(TK_1 != null) {
            			Leaf TK_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
            	 		TK_1Leaf.setKind("TOKEN");
            	 		TK_1Leaf.setValue(TK_1.getText());
            			TK_1Leaf.setPos(TK_1.getCharPositionInLine());
            			TK_1Leaf.setLine(TK_1.getLine());
            	 		rewrite_template_blockReturnNode.getChildren().add(TK_1Leaf);
            	 	}
            		// Returns the Node with CST Leaves/Nodes
            		retval.returnNode = rewrite_template_blockReturnNode;
            	

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
    // $ANTLR end rewrite_template_block

    public static class rewrite_tree_block_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start rewrite_tree_block
    // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:2338:1: rewrite_tree_block returns [Node returnNode] : TK_0= '(' rewrite_tree_alternativeGen+= rewrite_tree_alternative TK_1= ')' ;
    public final rewrite_tree_block_return rewrite_tree_block() throws RecognitionException {
        rewrite_tree_block_return retval = new rewrite_tree_block_return();
        retval.start = input.LT(1);

        Token TK_0=null;
        Token TK_1=null;
        List list_rewrite_tree_alternativeGen=null;
        RuleReturnScope rewrite_tree_alternativeGen = null;
        try {
            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:2339:1: (TK_0= '(' rewrite_tree_alternativeGen+= rewrite_tree_alternative TK_1= ')' )
            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:2339:5: TK_0= '(' rewrite_tree_alternativeGen+= rewrite_tree_alternative TK_1= ')'
            {
            TK_0=(Token)input.LT(1);
            match(input,82,FOLLOW_82_in_rewrite_tree_block2369); 
            pushFollow(FOLLOW_rewrite_tree_alternative_in_rewrite_tree_block2373);
            rewrite_tree_alternativeGen=rewrite_tree_alternative();
            _fsp--;

            if (list_rewrite_tree_alternativeGen==null) list_rewrite_tree_alternativeGen=new ArrayList();
            list_rewrite_tree_alternativeGen.add(rewrite_tree_alternativeGen);

            TK_1=(Token)input.LT(1);
            match(input,84,FOLLOW_84_in_rewrite_tree_block2377); 
            
            		// Create return CST Node
            		Node rewrite_tree_blockReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
            		rewrite_tree_blockReturnNode.setKind("rewrite_tree_block");
            	    // Create a Token CST Leaf	
            	    if(TK_0 != null) {
            			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
            	 		TK_0Leaf.setKind("TOKEN");
            	 		TK_0Leaf.setValue(TK_0.getText());
            			TK_0Leaf.setPos(TK_0.getCharPositionInLine());
            			TK_0Leaf.setLine(TK_0.getLine());
            	 		rewrite_tree_blockReturnNode.getChildren().add(TK_0Leaf);
            	 	}
            	    // Create a CST Node
            		if(list_rewrite_tree_alternativeGen != null) {
            	        for(Iterator it = list_rewrite_tree_alternativeGen.iterator(); it.hasNext(); )  { 
            	            ANTLRv3Parser.rewrite_tree_alternative_return r = (ANTLRv3Parser.rewrite_tree_alternative_return) it.next(); 
            	            if(r != null && r.returnNode != null) {
            	            	r.returnNode.setKind("rewrite_tree_alternative");
            	            	rewrite_tree_blockReturnNode.getChildren().add(r.returnNode);
            	            } 
            	        }
            	    }
            	    // Create a Token CST Leaf	
            	    if(TK_1 != null) {
            			Leaf TK_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
            	 		TK_1Leaf.setKind("TOKEN");
            	 		TK_1Leaf.setValue(TK_1.getText());
            			TK_1Leaf.setPos(TK_1.getCharPositionInLine());
            			TK_1Leaf.setLine(TK_1.getLine());
            	 		rewrite_tree_blockReturnNode.getChildren().add(TK_1Leaf);
            	 	}
            		// Returns the Node with CST Leaves/Nodes
            		retval.returnNode = rewrite_tree_blockReturnNode;
            	

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
    // $ANTLR end rewrite_tree_block

    public static class rewrite_tree_alternative_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start rewrite_tree_alternative
    // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:2377:1: rewrite_tree_alternative returns [Node returnNode] : (rewrite_tree_elementGen+= rewrite_tree_element )+ ;
    public final rewrite_tree_alternative_return rewrite_tree_alternative() throws RecognitionException {
        rewrite_tree_alternative_return retval = new rewrite_tree_alternative_return();
        retval.start = input.LT(1);

        List list_rewrite_tree_elementGen=null;
        RuleReturnScope rewrite_tree_elementGen = null;
        try {
            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:2378:1: ( (rewrite_tree_elementGen+= rewrite_tree_element )+ )
            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:2378:3: (rewrite_tree_elementGen+= rewrite_tree_element )+
            {
            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:2378:26: (rewrite_tree_elementGen+= rewrite_tree_element )+
            int cnt65=0;
            loop65:
            do {
                int alt65=2;
                int LA65_0 = input.LA(1);

                if ( (LA65_0==TREE_BEGIN||(LA65_0>=TOKEN_REF && LA65_0<=ACTION)||LA65_0==RULE_REF||LA65_0==82||LA65_0==93) ) {
                    alt65=1;
                }


                switch (alt65) {
            	case 1 :
            	    // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:2378:26: rewrite_tree_elementGen+= rewrite_tree_element
            	    {
            	    pushFollow(FOLLOW_rewrite_tree_element_in_rewrite_tree_alternative2401);
            	    rewrite_tree_elementGen=rewrite_tree_element();
            	    _fsp--;

            	    if (list_rewrite_tree_elementGen==null) list_rewrite_tree_elementGen=new ArrayList();
            	    list_rewrite_tree_elementGen.add(rewrite_tree_elementGen);


            	    }
            	    break;

            	default :
            	    if ( cnt65 >= 1 ) break loop65;
                        EarlyExitException eee =
                            new EarlyExitException(65, input);
                        throw eee;
                }
                cnt65++;
            } while (true);

            
            		// Create return CST Node
            		Node rewrite_tree_alternativeReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
            		rewrite_tree_alternativeReturnNode.setKind("rewrite_tree_alternative");
            	    // Create a CST Node
            		if(list_rewrite_tree_elementGen != null) {
            	        for(Iterator it = list_rewrite_tree_elementGen.iterator(); it.hasNext(); )  { 
            	            ANTLRv3Parser.rewrite_tree_element_return r = (ANTLRv3Parser.rewrite_tree_element_return) it.next(); 
            	            if(r != null && r.returnNode != null) {
            	            	r.returnNode.setKind("rewrite_tree_element");
            	            	rewrite_tree_alternativeReturnNode.getChildren().add(r.returnNode);
            	            } 
            	        }
            	    }
            		// Returns the Node with CST Leaves/Nodes
            		retval.returnNode = rewrite_tree_alternativeReturnNode;
            	

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
    // $ANTLR end rewrite_tree_alternative

    public static class rewrite_tree_element_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start rewrite_tree_element
    // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:2398:1: rewrite_tree_element returns [Node returnNode] : (rewrite_tree_atomGen+= rewrite_tree_atom | rewrite_tree_atomGen+= rewrite_tree_atom ebnfSuffixGen+= ebnfSuffix | rewrite_treeGen+= rewrite_tree (ebnfSuffixGen+= ebnfSuffix | ) | rewrite_tree_ebnfGen+= rewrite_tree_ebnf );
    public final rewrite_tree_element_return rewrite_tree_element() throws RecognitionException {
        rewrite_tree_element_return retval = new rewrite_tree_element_return();
        retval.start = input.LT(1);

        List list_rewrite_tree_atomGen=null;
        List list_ebnfSuffixGen=null;
        List list_rewrite_treeGen=null;
        List list_rewrite_tree_ebnfGen=null;
        RuleReturnScope rewrite_tree_atomGen = null;
        RuleReturnScope ebnfSuffixGen = null;
        RuleReturnScope rewrite_treeGen = null;
        RuleReturnScope rewrite_tree_ebnfGen = null;
        try {
            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:2399:1: (rewrite_tree_atomGen+= rewrite_tree_atom | rewrite_tree_atomGen+= rewrite_tree_atom ebnfSuffixGen+= ebnfSuffix | rewrite_treeGen+= rewrite_tree (ebnfSuffixGen+= ebnfSuffix | ) | rewrite_tree_ebnfGen+= rewrite_tree_ebnf )
            int alt67=4;
            switch ( input.LA(1) ) {
            case CHAR_LITERAL:
                {
                int LA67_1 = input.LA(2);

                if ( (LA67_1==74||(LA67_1>=90 && LA67_1<=91)) ) {
                    alt67=2;
                }
                else if ( (LA67_1==TREE_BEGIN||LA67_1==REWRITE||(LA67_1>=TOKEN_REF && LA67_1<=ACTION)||LA67_1==RULE_REF||LA67_1==69||(LA67_1>=82 && LA67_1<=84)||LA67_1==93) ) {
                    alt67=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("2398:1: rewrite_tree_element returns [Node returnNode] : (rewrite_tree_atomGen+= rewrite_tree_atom | rewrite_tree_atomGen+= rewrite_tree_atom ebnfSuffixGen+= ebnfSuffix | rewrite_treeGen+= rewrite_tree (ebnfSuffixGen+= ebnfSuffix | ) | rewrite_tree_ebnfGen+= rewrite_tree_ebnf );", 67, 1, input);

                    throw nvae;
                }
                }
                break;
            case TOKEN_REF:
                {
                switch ( input.LA(2) ) {
                case ARG_ACTION:
                    {
                    int LA67_11 = input.LA(3);

                    if ( (LA67_11==TREE_BEGIN||LA67_11==REWRITE||(LA67_11>=TOKEN_REF && LA67_11<=ACTION)||LA67_11==RULE_REF||LA67_11==69||(LA67_11>=82 && LA67_11<=84)||LA67_11==93) ) {
                        alt67=1;
                    }
                    else if ( (LA67_11==74||(LA67_11>=90 && LA67_11<=91)) ) {
                        alt67=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("2398:1: rewrite_tree_element returns [Node returnNode] : (rewrite_tree_atomGen+= rewrite_tree_atom | rewrite_tree_atomGen+= rewrite_tree_atom ebnfSuffixGen+= ebnfSuffix | rewrite_treeGen+= rewrite_tree (ebnfSuffixGen+= ebnfSuffix | ) | rewrite_tree_ebnfGen+= rewrite_tree_ebnf );", 67, 11, input);

                        throw nvae;
                    }
                    }
                    break;
                case TREE_BEGIN:
                case REWRITE:
                case TOKEN_REF:
                case STRING_LITERAL:
                case CHAR_LITERAL:
                case ACTION:
                case RULE_REF:
                case 69:
                case 82:
                case 83:
                case 84:
                case 93:
                    {
                    alt67=1;
                    }
                    break;
                case 74:
                case 90:
                case 91:
                    {
                    alt67=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("2398:1: rewrite_tree_element returns [Node returnNode] : (rewrite_tree_atomGen+= rewrite_tree_atom | rewrite_tree_atomGen+= rewrite_tree_atom ebnfSuffixGen+= ebnfSuffix | rewrite_treeGen+= rewrite_tree (ebnfSuffixGen+= ebnfSuffix | ) | rewrite_tree_ebnfGen+= rewrite_tree_ebnf );", 67, 2, input);

                    throw nvae;
                }

                }
                break;
            case RULE_REF:
                {
                int LA67_3 = input.LA(2);

                if ( (LA67_3==TREE_BEGIN||LA67_3==REWRITE||(LA67_3>=TOKEN_REF && LA67_3<=ACTION)||LA67_3==RULE_REF||LA67_3==69||(LA67_3>=82 && LA67_3<=84)||LA67_3==93) ) {
                    alt67=1;
                }
                else if ( (LA67_3==74||(LA67_3>=90 && LA67_3<=91)) ) {
                    alt67=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("2398:1: rewrite_tree_element returns [Node returnNode] : (rewrite_tree_atomGen+= rewrite_tree_atom | rewrite_tree_atomGen+= rewrite_tree_atom ebnfSuffixGen+= ebnfSuffix | rewrite_treeGen+= rewrite_tree (ebnfSuffixGen+= ebnfSuffix | ) | rewrite_tree_ebnfGen+= rewrite_tree_ebnf );", 67, 3, input);

                    throw nvae;
                }
                }
                break;
            case STRING_LITERAL:
                {
                int LA67_4 = input.LA(2);

                if ( (LA67_4==74||(LA67_4>=90 && LA67_4<=91)) ) {
                    alt67=2;
                }
                else if ( (LA67_4==TREE_BEGIN||LA67_4==REWRITE||(LA67_4>=TOKEN_REF && LA67_4<=ACTION)||LA67_4==RULE_REF||LA67_4==69||(LA67_4>=82 && LA67_4<=84)||LA67_4==93) ) {
                    alt67=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("2398:1: rewrite_tree_element returns [Node returnNode] : (rewrite_tree_atomGen+= rewrite_tree_atom | rewrite_tree_atomGen+= rewrite_tree_atom ebnfSuffixGen+= ebnfSuffix | rewrite_treeGen+= rewrite_tree (ebnfSuffixGen+= ebnfSuffix | ) | rewrite_tree_ebnfGen+= rewrite_tree_ebnf );", 67, 4, input);

                    throw nvae;
                }
                }
                break;
            case 93:
                {
                int LA67_5 = input.LA(2);

                if ( (LA67_5==TREE_BEGIN||LA67_5==REWRITE||(LA67_5>=TOKEN_REF && LA67_5<=ACTION)||LA67_5==RULE_REF||LA67_5==69||(LA67_5>=82 && LA67_5<=84)||LA67_5==93) ) {
                    alt67=1;
                }
                else if ( (LA67_5==74||(LA67_5>=90 && LA67_5<=91)) ) {
                    alt67=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("2398:1: rewrite_tree_element returns [Node returnNode] : (rewrite_tree_atomGen+= rewrite_tree_atom | rewrite_tree_atomGen+= rewrite_tree_atom ebnfSuffixGen+= ebnfSuffix | rewrite_treeGen+= rewrite_tree (ebnfSuffixGen+= ebnfSuffix | ) | rewrite_tree_ebnfGen+= rewrite_tree_ebnf );", 67, 5, input);

                    throw nvae;
                }
                }
                break;
            case ACTION:
                {
                int LA67_6 = input.LA(2);

                if ( (LA67_6==74||(LA67_6>=90 && LA67_6<=91)) ) {
                    alt67=2;
                }
                else if ( (LA67_6==TREE_BEGIN||LA67_6==REWRITE||(LA67_6>=TOKEN_REF && LA67_6<=ACTION)||LA67_6==RULE_REF||LA67_6==69||(LA67_6>=82 && LA67_6<=84)||LA67_6==93) ) {
                    alt67=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("2398:1: rewrite_tree_element returns [Node returnNode] : (rewrite_tree_atomGen+= rewrite_tree_atom | rewrite_tree_atomGen+= rewrite_tree_atom ebnfSuffixGen+= ebnfSuffix | rewrite_treeGen+= rewrite_tree (ebnfSuffixGen+= ebnfSuffix | ) | rewrite_tree_ebnfGen+= rewrite_tree_ebnf );", 67, 6, input);

                    throw nvae;
                }
                }
                break;
            case TREE_BEGIN:
                {
                alt67=3;
                }
                break;
            case 82:
                {
                alt67=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("2398:1: rewrite_tree_element returns [Node returnNode] : (rewrite_tree_atomGen+= rewrite_tree_atom | rewrite_tree_atomGen+= rewrite_tree_atom ebnfSuffixGen+= ebnfSuffix | rewrite_treeGen+= rewrite_tree (ebnfSuffixGen+= ebnfSuffix | ) | rewrite_tree_ebnfGen+= rewrite_tree_ebnf );", 67, 0, input);

                throw nvae;
            }

            switch (alt67) {
                case 1 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:2399:3: rewrite_tree_atomGen+= rewrite_tree_atom
                    {
                    pushFollow(FOLLOW_rewrite_tree_atom_in_rewrite_tree_element2427);
                    rewrite_tree_atomGen=rewrite_tree_atom();
                    _fsp--;

                    if (list_rewrite_tree_atomGen==null) list_rewrite_tree_atomGen=new ArrayList();
                    list_rewrite_tree_atomGen.add(rewrite_tree_atomGen);

                    
                    		// Create return CST Node
                    		Node rewrite_tree_elementReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                    		rewrite_tree_elementReturnNode.setKind("rewrite_tree_element");
                    	    // Create a CST Node
                    		if(list_rewrite_tree_atomGen != null) {
                    	        for(Iterator it = list_rewrite_tree_atomGen.iterator(); it.hasNext(); )  { 
                    	            ANTLRv3Parser.rewrite_tree_atom_return r = (ANTLRv3Parser.rewrite_tree_atom_return) it.next(); 
                    	            if(r != null && r.returnNode != null) {
                    	            	r.returnNode.setKind("rewrite_tree_atom");
                    	            	rewrite_tree_elementReturnNode.getChildren().add(r.returnNode);
                    	            } 
                    	        }
                    	    }
                    		// Returns the Node with CST Leaves/Nodes
                    		retval.returnNode = rewrite_tree_elementReturnNode;
                    	

                    }
                    break;
                case 2 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:2417:4: rewrite_tree_atomGen+= rewrite_tree_atom ebnfSuffixGen+= ebnfSuffix
                    {
                    pushFollow(FOLLOW_rewrite_tree_atom_in_rewrite_tree_element2438);
                    rewrite_tree_atomGen=rewrite_tree_atom();
                    _fsp--;

                    if (list_rewrite_tree_atomGen==null) list_rewrite_tree_atomGen=new ArrayList();
                    list_rewrite_tree_atomGen.add(rewrite_tree_atomGen);

                    pushFollow(FOLLOW_ebnfSuffix_in_rewrite_tree_element2442);
                    ebnfSuffixGen=ebnfSuffix();
                    _fsp--;

                    if (list_ebnfSuffixGen==null) list_ebnfSuffixGen=new ArrayList();
                    list_ebnfSuffixGen.add(ebnfSuffixGen);

                    
                    		// Create return CST Node
                    		Node rewrite_tree_elementReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                    		rewrite_tree_elementReturnNode.setKind("rewrite_tree_element");
                    	    // Create a CST Node
                    		if(list_rewrite_tree_atomGen != null) {
                    	        for(Iterator it = list_rewrite_tree_atomGen.iterator(); it.hasNext(); )  { 
                    	            ANTLRv3Parser.rewrite_tree_atom_return r = (ANTLRv3Parser.rewrite_tree_atom_return) it.next(); 
                    	            if(r != null && r.returnNode != null) {
                    	            	r.returnNode.setKind("rewrite_tree_atom");
                    	            	rewrite_tree_elementReturnNode.getChildren().add(r.returnNode);
                    	            } 
                    	        }
                    	    }
                    	    // Create a CST Node
                    		if(list_ebnfSuffixGen != null) {
                    	        for(Iterator it = list_ebnfSuffixGen.iterator(); it.hasNext(); )  { 
                    	            ANTLRv3Parser.ebnfSuffix_return r = (ANTLRv3Parser.ebnfSuffix_return) it.next(); 
                    	            if(r != null && r.returnNode != null) {
                    	            	r.returnNode.setKind("ebnfSuffix");
                    	            	rewrite_tree_elementReturnNode.getChildren().add(r.returnNode);
                    	            } 
                    	        }
                    	    }
                    		// Returns the Node with CST Leaves/Nodes
                    		retval.returnNode = rewrite_tree_elementReturnNode;
                    	

                    }
                    break;
                case 3 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:2445:6: rewrite_treeGen+= rewrite_tree (ebnfSuffixGen+= ebnfSuffix | )
                    {
                    pushFollow(FOLLOW_rewrite_tree_in_rewrite_tree_element2455);
                    rewrite_treeGen=rewrite_tree();
                    _fsp--;

                    if (list_rewrite_treeGen==null) list_rewrite_treeGen=new ArrayList();
                    list_rewrite_treeGen.add(rewrite_treeGen);

                    // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:2446:3: (ebnfSuffixGen+= ebnfSuffix | )
                    int alt66=2;
                    int LA66_0 = input.LA(1);

                    if ( (LA66_0==74||(LA66_0>=90 && LA66_0<=91)) ) {
                        alt66=1;
                    }
                    else if ( (LA66_0==TREE_BEGIN||LA66_0==REWRITE||(LA66_0>=TOKEN_REF && LA66_0<=ACTION)||LA66_0==RULE_REF||LA66_0==69||(LA66_0>=82 && LA66_0<=84)||LA66_0==93) ) {
                        alt66=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("2446:3: (ebnfSuffixGen+= ebnfSuffix | )", 66, 0, input);

                        throw nvae;
                    }
                    switch (alt66) {
                        case 1 :
                            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:2446:5: ebnfSuffixGen+= ebnfSuffix
                            {
                            pushFollow(FOLLOW_ebnfSuffix_in_rewrite_tree_element2463);
                            ebnfSuffixGen=ebnfSuffix();
                            _fsp--;

                            if (list_ebnfSuffixGen==null) list_ebnfSuffixGen=new ArrayList();
                            list_ebnfSuffixGen.add(ebnfSuffixGen);


                            }
                            break;
                        case 2 :
                            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:2448:3: 
                            {
                            }
                            break;

                    }

                    
                    		// Create return CST Node
                    		Node rewrite_tree_elementReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                    		rewrite_tree_elementReturnNode.setKind("rewrite_tree_element");
                    	    // Create a CST Node
                    		if(list_rewrite_treeGen != null) {
                    	        for(Iterator it = list_rewrite_treeGen.iterator(); it.hasNext(); )  { 
                    	            ANTLRv3Parser.rewrite_tree_return r = (ANTLRv3Parser.rewrite_tree_return) it.next(); 
                    	            if(r != null && r.returnNode != null) {
                    	            	r.returnNode.setKind("rewrite_tree");
                    	            	rewrite_tree_elementReturnNode.getChildren().add(r.returnNode);
                    	            } 
                    	        }
                    	    }
                    	    // Create a CST Node
                    		if(list_ebnfSuffixGen != null) {
                    	        for(Iterator it = list_ebnfSuffixGen.iterator(); it.hasNext(); )  { 
                    	            ANTLRv3Parser.ebnfSuffix_return r = (ANTLRv3Parser.ebnfSuffix_return) it.next(); 
                    	            if(r != null && r.returnNode != null) {
                    	            	r.returnNode.setKind("ebnfSuffix");
                    	            	rewrite_tree_elementReturnNode.getChildren().add(r.returnNode);
                    	            } 
                    	        }
                    	    }
                    		// Returns the Node with CST Leaves/Nodes
                    		retval.returnNode = rewrite_tree_elementReturnNode;
                    	

                    }
                    break;
                case 4 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:2476:6: rewrite_tree_ebnfGen+= rewrite_tree_ebnf
                    {
                    pushFollow(FOLLOW_rewrite_tree_ebnf_in_rewrite_tree_element2485);
                    rewrite_tree_ebnfGen=rewrite_tree_ebnf();
                    _fsp--;

                    if (list_rewrite_tree_ebnfGen==null) list_rewrite_tree_ebnfGen=new ArrayList();
                    list_rewrite_tree_ebnfGen.add(rewrite_tree_ebnfGen);

                    
                    		// Create return CST Node
                    		Node rewrite_tree_elementReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                    		rewrite_tree_elementReturnNode.setKind("rewrite_tree_element");
                    	    // Create a CST Node
                    		if(list_rewrite_tree_ebnfGen != null) {
                    	        for(Iterator it = list_rewrite_tree_ebnfGen.iterator(); it.hasNext(); )  { 
                    	            ANTLRv3Parser.rewrite_tree_ebnf_return r = (ANTLRv3Parser.rewrite_tree_ebnf_return) it.next(); 
                    	            if(r != null && r.returnNode != null) {
                    	            	r.returnNode.setKind("rewrite_tree_ebnf");
                    	            	rewrite_tree_elementReturnNode.getChildren().add(r.returnNode);
                    	            } 
                    	        }
                    	    }
                    		// Returns the Node with CST Leaves/Nodes
                    		retval.returnNode = rewrite_tree_elementReturnNode;
                    	

                    }
                    break;

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
    // $ANTLR end rewrite_tree_element

    public static class rewrite_tree_atom_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start rewrite_tree_atom
    // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:2496:1: rewrite_tree_atom returns [Node returnNode] : (CHAR_LITERALGen= CHAR_LITERAL | TOKEN_REFGen= TOKEN_REF (ARG_ACTIONGen= ARG_ACTION )? | RULE_REFGen= RULE_REF | STRING_LITERALGen= STRING_LITERAL | TK_0= '$' | ACTIONGen= ACTION );
    public final rewrite_tree_atom_return rewrite_tree_atom() throws RecognitionException {
        rewrite_tree_atom_return retval = new rewrite_tree_atom_return();
        retval.start = input.LT(1);

        Token CHAR_LITERALGen=null;
        Token TOKEN_REFGen=null;
        Token ARG_ACTIONGen=null;
        Token RULE_REFGen=null;
        Token STRING_LITERALGen=null;
        Token TK_0=null;
        Token ACTIONGen=null;

        try {
            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:2497:1: (CHAR_LITERALGen= CHAR_LITERAL | TOKEN_REFGen= TOKEN_REF (ARG_ACTIONGen= ARG_ACTION )? | RULE_REFGen= RULE_REF | STRING_LITERALGen= STRING_LITERAL | TK_0= '$' | ACTIONGen= ACTION )
            int alt69=6;
            switch ( input.LA(1) ) {
            case CHAR_LITERAL:
                {
                alt69=1;
                }
                break;
            case TOKEN_REF:
                {
                alt69=2;
                }
                break;
            case RULE_REF:
                {
                alt69=3;
                }
                break;
            case STRING_LITERAL:
                {
                alt69=4;
                }
                break;
            case 93:
                {
                alt69=5;
                }
                break;
            case ACTION:
                {
                alt69=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("2496:1: rewrite_tree_atom returns [Node returnNode] : (CHAR_LITERALGen= CHAR_LITERAL | TOKEN_REFGen= TOKEN_REF (ARG_ACTIONGen= ARG_ACTION )? | RULE_REFGen= RULE_REF | STRING_LITERALGen= STRING_LITERAL | TK_0= '$' | ACTIONGen= ACTION );", 69, 0, input);

                throw nvae;
            }

            switch (alt69) {
                case 1 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:2497:5: CHAR_LITERALGen= CHAR_LITERAL
                    {
                    CHAR_LITERALGen=(Token)input.LT(1);
                    match(input,CHAR_LITERAL,FOLLOW_CHAR_LITERAL_in_rewrite_tree_atom2508); 
                    
                    		// Create return CST Node
                    		Node rewrite_tree_atomReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                    		rewrite_tree_atomReturnNode.setKind("rewrite_tree_atom");
                    	    // Create a CST Leaf
                    		if(CHAR_LITERALGen != null) {
                    			Leaf CHAR_LITERALGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                    			CHAR_LITERALGenLeaf.setKind("CHAR_LITERAL");
                    			CHAR_LITERALGenLeaf.setValue(CHAR_LITERALGen.getText());
                    			CHAR_LITERALGenLeaf.setPos(CHAR_LITERALGen.getCharPositionInLine());
                    			CHAR_LITERALGenLeaf.setLine(CHAR_LITERALGen.getLine());
                    			rewrite_tree_atomReturnNode.getChildren().add(CHAR_LITERALGenLeaf);
                    		}
                    		// Returns the Node with CST Leaves/Nodes
                    		retval.returnNode = rewrite_tree_atomReturnNode;
                    	

                    }
                    break;
                case 2 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:2514:6: TOKEN_REFGen= TOKEN_REF (ARG_ACTIONGen= ARG_ACTION )?
                    {
                    TOKEN_REFGen=(Token)input.LT(1);
                    match(input,TOKEN_REF,FOLLOW_TOKEN_REF_in_rewrite_tree_atom2521); 
                    // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:2514:42: (ARG_ACTIONGen= ARG_ACTION )?
                    int alt68=2;
                    int LA68_0 = input.LA(1);

                    if ( (LA68_0==ARG_ACTION) ) {
                        alt68=1;
                    }
                    switch (alt68) {
                        case 1 :
                            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:2514:42: ARG_ACTIONGen= ARG_ACTION
                            {
                            ARG_ACTIONGen=(Token)input.LT(1);
                            match(input,ARG_ACTION,FOLLOW_ARG_ACTION_in_rewrite_tree_atom2525); 

                            }
                            break;

                    }

                    
                    		// Create return CST Node
                    		Node rewrite_tree_atomReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                    		rewrite_tree_atomReturnNode.setKind("rewrite_tree_atom");
                    	    // Create a CST Leaf
                    		if(TOKEN_REFGen != null) {
                    			Leaf TOKEN_REFGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                    			TOKEN_REFGenLeaf.setKind("TOKEN_REF");
                    			TOKEN_REFGenLeaf.setValue(TOKEN_REFGen.getText());
                    			TOKEN_REFGenLeaf.setPos(TOKEN_REFGen.getCharPositionInLine());
                    			TOKEN_REFGenLeaf.setLine(TOKEN_REFGen.getLine());
                    			rewrite_tree_atomReturnNode.getChildren().add(TOKEN_REFGenLeaf);
                    		}
                    	    // Create a CST Leaf
                    		if(ARG_ACTIONGen != null) {
                    			Leaf ARG_ACTIONGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                    			ARG_ACTIONGenLeaf.setKind("ARG_ACTION");
                    			ARG_ACTIONGenLeaf.setValue(ARG_ACTIONGen.getText());
                    			ARG_ACTIONGenLeaf.setPos(ARG_ACTIONGen.getCharPositionInLine());
                    			ARG_ACTIONGenLeaf.setLine(ARG_ACTIONGen.getLine());
                    			rewrite_tree_atomReturnNode.getChildren().add(ARG_ACTIONGenLeaf);
                    		}
                    		// Returns the Node with CST Leaves/Nodes
                    		retval.returnNode = rewrite_tree_atomReturnNode;
                    	

                    }
                    break;
                case 3 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:2540:9: RULE_REFGen= RULE_REF
                    {
                    RULE_REFGen=(Token)input.LT(1);
                    match(input,RULE_REF,FOLLOW_RULE_REF_in_rewrite_tree_atom2543); 
                    
                    		// Create return CST Node
                    		Node rewrite_tree_atomReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                    		rewrite_tree_atomReturnNode.setKind("rewrite_tree_atom");
                    	    // Create a CST Leaf
                    		if(RULE_REFGen != null) {
                    			Leaf RULE_REFGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                    			RULE_REFGenLeaf.setKind("RULE_REF");
                    			RULE_REFGenLeaf.setValue(RULE_REFGen.getText());
                    			RULE_REFGenLeaf.setPos(RULE_REFGen.getCharPositionInLine());
                    			RULE_REFGenLeaf.setLine(RULE_REFGen.getLine());
                    			rewrite_tree_atomReturnNode.getChildren().add(RULE_REFGenLeaf);
                    		}
                    		// Returns the Node with CST Leaves/Nodes
                    		retval.returnNode = rewrite_tree_atomReturnNode;
                    	

                    }
                    break;
                case 4 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:2557:6: STRING_LITERALGen= STRING_LITERAL
                    {
                    STRING_LITERALGen=(Token)input.LT(1);
                    match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_rewrite_tree_atom2556); 
                    
                    		// Create return CST Node
                    		Node rewrite_tree_atomReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                    		rewrite_tree_atomReturnNode.setKind("rewrite_tree_atom");
                    	    // Create a CST Leaf
                    		if(STRING_LITERALGen != null) {
                    			Leaf STRING_LITERALGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                    			STRING_LITERALGenLeaf.setKind("STRING_LITERAL");
                    			STRING_LITERALGenLeaf.setValue(STRING_LITERALGen.getText());
                    			STRING_LITERALGenLeaf.setPos(STRING_LITERALGen.getCharPositionInLine());
                    			STRING_LITERALGenLeaf.setLine(STRING_LITERALGen.getLine());
                    			rewrite_tree_atomReturnNode.getChildren().add(STRING_LITERALGenLeaf);
                    		}
                    		// Returns the Node with CST Leaves/Nodes
                    		retval.returnNode = rewrite_tree_atomReturnNode;
                    	

                    }
                    break;
                case 5 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:2574:6: TK_0= '$'
                    {
                    TK_0=(Token)input.LT(1);
                    match(input,93,FOLLOW_93_in_rewrite_tree_atom2569); 
                    
                    		// Create return CST Node
                    		Node rewrite_tree_atomReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                    		rewrite_tree_atomReturnNode.setKind("rewrite_tree_atom");
                    	    // Create a Token CST Leaf	
                    	    if(TK_0 != null) {
                    			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                    	 		TK_0Leaf.setKind("TOKEN");
                    	 		TK_0Leaf.setValue(TK_0.getText());
                    			TK_0Leaf.setPos(TK_0.getCharPositionInLine());
                    			TK_0Leaf.setLine(TK_0.getLine());
                    	 		rewrite_tree_atomReturnNode.getChildren().add(TK_0Leaf);
                    	 	}
                    		// Returns the Node with CST Leaves/Nodes
                    		retval.returnNode = rewrite_tree_atomReturnNode;
                    	

                    }
                    break;
                case 6 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:2591:4: ACTIONGen= ACTION
                    {
                    ACTIONGen=(Token)input.LT(1);
                    match(input,ACTION,FOLLOW_ACTION_in_rewrite_tree_atom2581); 
                    
                    		// Create return CST Node
                    		Node rewrite_tree_atomReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                    		rewrite_tree_atomReturnNode.setKind("rewrite_tree_atom");
                    	    // Create a CST Leaf
                    		if(ACTIONGen != null) {
                    			Leaf ACTIONGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                    			ACTIONGenLeaf.setKind("ACTION");
                    			ACTIONGenLeaf.setValue(ACTIONGen.getText());
                    			ACTIONGenLeaf.setPos(ACTIONGen.getCharPositionInLine());
                    			ACTIONGenLeaf.setLine(ACTIONGen.getLine());
                    			rewrite_tree_atomReturnNode.getChildren().add(ACTIONGenLeaf);
                    		}
                    		// Returns the Node with CST Leaves/Nodes
                    		retval.returnNode = rewrite_tree_atomReturnNode;
                    	

                    }
                    break;

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
    // $ANTLR end rewrite_tree_atom

    public static class rewrite_tree_ebnf_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start rewrite_tree_ebnf
    // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:2610:1: rewrite_tree_ebnf returns [Node returnNode] : rewrite_tree_blockGen+= rewrite_tree_block ebnfSuffixGen+= ebnfSuffix ;
    public final rewrite_tree_ebnf_return rewrite_tree_ebnf() throws RecognitionException {
        rewrite_tree_ebnf_return retval = new rewrite_tree_ebnf_return();
        retval.start = input.LT(1);

        List list_rewrite_tree_blockGen=null;
        List list_ebnfSuffixGen=null;
        RuleReturnScope rewrite_tree_blockGen = null;
        RuleReturnScope ebnfSuffixGen = null;
        try {
            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:2611:1: (rewrite_tree_blockGen+= rewrite_tree_block ebnfSuffixGen+= ebnfSuffix )
            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:2611:3: rewrite_tree_blockGen+= rewrite_tree_block ebnfSuffixGen+= ebnfSuffix
            {
            pushFollow(FOLLOW_rewrite_tree_block_in_rewrite_tree_ebnf2602);
            rewrite_tree_blockGen=rewrite_tree_block();
            _fsp--;

            if (list_rewrite_tree_blockGen==null) list_rewrite_tree_blockGen=new ArrayList();
            list_rewrite_tree_blockGen.add(rewrite_tree_blockGen);

            pushFollow(FOLLOW_ebnfSuffix_in_rewrite_tree_ebnf2606);
            ebnfSuffixGen=ebnfSuffix();
            _fsp--;

            if (list_ebnfSuffixGen==null) list_ebnfSuffixGen=new ArrayList();
            list_ebnfSuffixGen.add(ebnfSuffixGen);

            
            		// Create return CST Node
            		Node rewrite_tree_ebnfReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
            		rewrite_tree_ebnfReturnNode.setKind("rewrite_tree_ebnf");
            	    // Create a CST Node
            		if(list_rewrite_tree_blockGen != null) {
            	        for(Iterator it = list_rewrite_tree_blockGen.iterator(); it.hasNext(); )  { 
            	            ANTLRv3Parser.rewrite_tree_block_return r = (ANTLRv3Parser.rewrite_tree_block_return) it.next(); 
            	            if(r != null && r.returnNode != null) {
            	            	r.returnNode.setKind("rewrite_tree_block");
            	            	rewrite_tree_ebnfReturnNode.getChildren().add(r.returnNode);
            	            } 
            	        }
            	    }
            	    // Create a CST Node
            		if(list_ebnfSuffixGen != null) {
            	        for(Iterator it = list_ebnfSuffixGen.iterator(); it.hasNext(); )  { 
            	            ANTLRv3Parser.ebnfSuffix_return r = (ANTLRv3Parser.ebnfSuffix_return) it.next(); 
            	            if(r != null && r.returnNode != null) {
            	            	r.returnNode.setKind("ebnfSuffix");
            	            	rewrite_tree_ebnfReturnNode.getChildren().add(r.returnNode);
            	            } 
            	        }
            	    }
            		// Returns the Node with CST Leaves/Nodes
            		retval.returnNode = rewrite_tree_ebnfReturnNode;
            	

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
    // $ANTLR end rewrite_tree_ebnf

    public static class rewrite_tree_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start rewrite_tree
    // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:2641:1: rewrite_tree returns [Node returnNode] : TK_0= '^(' rewrite_tree_atomGen+= rewrite_tree_atom (rewrite_tree_elementGen+= rewrite_tree_element )* TK_1= ')' ;
    public final rewrite_tree_return rewrite_tree() throws RecognitionException {
        rewrite_tree_return retval = new rewrite_tree_return();
        retval.start = input.LT(1);

        Token TK_0=null;
        Token TK_1=null;
        List list_rewrite_tree_atomGen=null;
        List list_rewrite_tree_elementGen=null;
        RuleReturnScope rewrite_tree_atomGen = null;
        RuleReturnScope rewrite_tree_elementGen = null;
        try {
            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:2642:1: (TK_0= '^(' rewrite_tree_atomGen+= rewrite_tree_atom (rewrite_tree_elementGen+= rewrite_tree_element )* TK_1= ')' )
            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:2642:3: TK_0= '^(' rewrite_tree_atomGen+= rewrite_tree_atom (rewrite_tree_elementGen+= rewrite_tree_element )* TK_1= ')'
            {
            TK_0=(Token)input.LT(1);
            match(input,TREE_BEGIN,FOLLOW_TREE_BEGIN_in_rewrite_tree2629); 
            pushFollow(FOLLOW_rewrite_tree_atom_in_rewrite_tree2633);
            rewrite_tree_atomGen=rewrite_tree_atom();
            _fsp--;

            if (list_rewrite_tree_atomGen==null) list_rewrite_tree_atomGen=new ArrayList();
            list_rewrite_tree_atomGen.add(rewrite_tree_atomGen);

            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:2642:76: (rewrite_tree_elementGen+= rewrite_tree_element )*
            loop70:
            do {
                int alt70=2;
                int LA70_0 = input.LA(1);

                if ( (LA70_0==TREE_BEGIN||(LA70_0>=TOKEN_REF && LA70_0<=ACTION)||LA70_0==RULE_REF||LA70_0==82||LA70_0==93) ) {
                    alt70=1;
                }


                switch (alt70) {
            	case 1 :
            	    // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:2642:76: rewrite_tree_elementGen+= rewrite_tree_element
            	    {
            	    pushFollow(FOLLOW_rewrite_tree_element_in_rewrite_tree2637);
            	    rewrite_tree_elementGen=rewrite_tree_element();
            	    _fsp--;

            	    if (list_rewrite_tree_elementGen==null) list_rewrite_tree_elementGen=new ArrayList();
            	    list_rewrite_tree_elementGen.add(rewrite_tree_elementGen);


            	    }
            	    break;

            	default :
            	    break loop70;
                }
            } while (true);

            TK_1=(Token)input.LT(1);
            match(input,84,FOLLOW_84_in_rewrite_tree2642); 
            
            		// Create return CST Node
            		Node rewrite_treeReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
            		rewrite_treeReturnNode.setKind("rewrite_tree");
            	    // Create a Token CST Leaf	
            	    if(TK_0 != null) {
            			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
            	 		TK_0Leaf.setKind("TOKEN");
            	 		TK_0Leaf.setValue(TK_0.getText());
            			TK_0Leaf.setPos(TK_0.getCharPositionInLine());
            			TK_0Leaf.setLine(TK_0.getLine());
            	 		rewrite_treeReturnNode.getChildren().add(TK_0Leaf);
            	 	}
            	    // Create a CST Node
            		if(list_rewrite_tree_atomGen != null) {
            	        for(Iterator it = list_rewrite_tree_atomGen.iterator(); it.hasNext(); )  { 
            	            ANTLRv3Parser.rewrite_tree_atom_return r = (ANTLRv3Parser.rewrite_tree_atom_return) it.next(); 
            	            if(r != null && r.returnNode != null) {
            	            	r.returnNode.setKind("rewrite_tree_atom");
            	            	rewrite_treeReturnNode.getChildren().add(r.returnNode);
            	            } 
            	        }
            	    }
            	    // Create a CST Node
            		if(list_rewrite_tree_elementGen != null) {
            	        for(Iterator it = list_rewrite_tree_elementGen.iterator(); it.hasNext(); )  { 
            	            ANTLRv3Parser.rewrite_tree_element_return r = (ANTLRv3Parser.rewrite_tree_element_return) it.next(); 
            	            if(r != null && r.returnNode != null) {
            	            	r.returnNode.setKind("rewrite_tree_element");
            	            	rewrite_treeReturnNode.getChildren().add(r.returnNode);
            	            } 
            	        }
            	    }
            	    // Create a Token CST Leaf	
            	    if(TK_1 != null) {
            			Leaf TK_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
            	 		TK_1Leaf.setKind("TOKEN");
            	 		TK_1Leaf.setValue(TK_1.getText());
            			TK_1Leaf.setPos(TK_1.getCharPositionInLine());
            			TK_1Leaf.setLine(TK_1.getLine());
            	 		rewrite_treeReturnNode.getChildren().add(TK_1Leaf);
            	 	}
            		// Returns the Node with CST Leaves/Nodes
            		retval.returnNode = rewrite_treeReturnNode;
            	

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
    // $ANTLR end rewrite_tree

    public static class rewrite_template_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start rewrite_template
    // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:2690:1: rewrite_template returns [Node returnNode] : (idGen+= id TK_0= '(' rewrite_template_argsGen+= rewrite_template_args TK_1= ')' (DOUBLE_QUOTE_STRING_LITERALGen= DOUBLE_QUOTE_STRING_LITERAL | DOUBLE_ANGLE_STRING_LITERALGen= DOUBLE_ANGLE_STRING_LITERAL ) | rewrite_template_refGen+= rewrite_template_ref | rewrite_indirect_template_headGen+= rewrite_indirect_template_head | ACTIONGen= ACTION );
    public final rewrite_template_return rewrite_template() throws RecognitionException {
        rewrite_template_return retval = new rewrite_template_return();
        retval.start = input.LT(1);

        Token TK_0=null;
        Token TK_1=null;
        Token DOUBLE_QUOTE_STRING_LITERALGen=null;
        Token DOUBLE_ANGLE_STRING_LITERALGen=null;
        Token ACTIONGen=null;
        List list_idGen=null;
        List list_rewrite_template_argsGen=null;
        List list_rewrite_template_refGen=null;
        List list_rewrite_indirect_template_headGen=null;
        RuleReturnScope idGen = null;
        RuleReturnScope rewrite_template_argsGen = null;
        RuleReturnScope rewrite_template_refGen = null;
        RuleReturnScope rewrite_indirect_template_headGen = null;
        try {
            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:2691:1: (idGen+= id TK_0= '(' rewrite_template_argsGen+= rewrite_template_args TK_1= ')' (DOUBLE_QUOTE_STRING_LITERALGen= DOUBLE_QUOTE_STRING_LITERAL | DOUBLE_ANGLE_STRING_LITERALGen= DOUBLE_ANGLE_STRING_LITERAL ) | rewrite_template_refGen+= rewrite_template_ref | rewrite_indirect_template_headGen+= rewrite_indirect_template_head | ACTIONGen= ACTION )
            int alt72=4;
            alt72 = dfa72.predict(input);
            switch (alt72) {
                case 1 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:2691:5: idGen+= id TK_0= '(' rewrite_template_argsGen+= rewrite_template_args TK_1= ')' (DOUBLE_QUOTE_STRING_LITERALGen= DOUBLE_QUOTE_STRING_LITERAL | DOUBLE_ANGLE_STRING_LITERALGen= DOUBLE_ANGLE_STRING_LITERAL )
                    {
                    pushFollow(FOLLOW_id_in_rewrite_template2665);
                    idGen=id();
                    _fsp--;

                    if (list_idGen==null) list_idGen=new ArrayList();
                    list_idGen.add(idGen);

                    TK_0=(Token)input.LT(1);
                    match(input,82,FOLLOW_82_in_rewrite_template2669); 
                    pushFollow(FOLLOW_rewrite_template_args_in_rewrite_template2673);
                    rewrite_template_argsGen=rewrite_template_args();
                    _fsp--;

                    if (list_rewrite_template_argsGen==null) list_rewrite_template_argsGen=new ArrayList();
                    list_rewrite_template_argsGen.add(rewrite_template_argsGen);

                    TK_1=(Token)input.LT(1);
                    match(input,84,FOLLOW_84_in_rewrite_template2677); 
                    // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:2692:3: (DOUBLE_QUOTE_STRING_LITERALGen= DOUBLE_QUOTE_STRING_LITERAL | DOUBLE_ANGLE_STRING_LITERALGen= DOUBLE_ANGLE_STRING_LITERAL )
                    int alt71=2;
                    int LA71_0 = input.LA(1);

                    if ( (LA71_0==DOUBLE_QUOTE_STRING_LITERAL) ) {
                        alt71=1;
                    }
                    else if ( (LA71_0==DOUBLE_ANGLE_STRING_LITERAL) ) {
                        alt71=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("2692:3: (DOUBLE_QUOTE_STRING_LITERALGen= DOUBLE_QUOTE_STRING_LITERAL | DOUBLE_ANGLE_STRING_LITERALGen= DOUBLE_ANGLE_STRING_LITERAL )", 71, 0, input);

                        throw nvae;
                    }
                    switch (alt71) {
                        case 1 :
                            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:2692:5: DOUBLE_QUOTE_STRING_LITERALGen= DOUBLE_QUOTE_STRING_LITERAL
                            {
                            DOUBLE_QUOTE_STRING_LITERALGen=(Token)input.LT(1);
                            match(input,DOUBLE_QUOTE_STRING_LITERAL,FOLLOW_DOUBLE_QUOTE_STRING_LITERAL_in_rewrite_template2685); 

                            }
                            break;
                        case 2 :
                            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:2692:66: DOUBLE_ANGLE_STRING_LITERALGen= DOUBLE_ANGLE_STRING_LITERAL
                            {
                            DOUBLE_ANGLE_STRING_LITERALGen=(Token)input.LT(1);
                            match(input,DOUBLE_ANGLE_STRING_LITERAL,FOLLOW_DOUBLE_ANGLE_STRING_LITERAL_in_rewrite_template2691); 

                            }
                            break;

                    }

                    
                    		// Create return CST Node
                    		Node rewrite_templateReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                    		rewrite_templateReturnNode.setKind("rewrite_template");
                    	    // Create a CST Node
                    		if(list_idGen != null) {
                    	        for(Iterator it = list_idGen.iterator(); it.hasNext(); )  { 
                    	            ANTLRv3Parser.id_return r = (ANTLRv3Parser.id_return) it.next(); 
                    	            if(r != null && r.returnNode != null) {
                    	            	r.returnNode.setKind("id");
                    	            	rewrite_templateReturnNode.getChildren().add(r.returnNode);
                    	            } 
                    	        }
                    	    }
                    	    // Create a Token CST Leaf	
                    	    if(TK_0 != null) {
                    			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                    	 		TK_0Leaf.setKind("TOKEN");
                    	 		TK_0Leaf.setValue(TK_0.getText());
                    			TK_0Leaf.setPos(TK_0.getCharPositionInLine());
                    			TK_0Leaf.setLine(TK_0.getLine());
                    	 		rewrite_templateReturnNode.getChildren().add(TK_0Leaf);
                    	 	}
                    	    // Create a CST Node
                    		if(list_rewrite_template_argsGen != null) {
                    	        for(Iterator it = list_rewrite_template_argsGen.iterator(); it.hasNext(); )  { 
                    	            ANTLRv3Parser.rewrite_template_args_return r = (ANTLRv3Parser.rewrite_template_args_return) it.next(); 
                    	            if(r != null && r.returnNode != null) {
                    	            	r.returnNode.setKind("rewrite_template_args");
                    	            	rewrite_templateReturnNode.getChildren().add(r.returnNode);
                    	            } 
                    	        }
                    	    }
                    	    // Create a Token CST Leaf	
                    	    if(TK_1 != null) {
                    			Leaf TK_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                    	 		TK_1Leaf.setKind("TOKEN");
                    	 		TK_1Leaf.setValue(TK_1.getText());
                    			TK_1Leaf.setPos(TK_1.getCharPositionInLine());
                    			TK_1Leaf.setLine(TK_1.getLine());
                    	 		rewrite_templateReturnNode.getChildren().add(TK_1Leaf);
                    	 	}
                    	    // Create a CST Leaf
                    		if(DOUBLE_QUOTE_STRING_LITERALGen != null) {
                    			Leaf DOUBLE_QUOTE_STRING_LITERALGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                    			DOUBLE_QUOTE_STRING_LITERALGenLeaf.setKind("DOUBLE_QUOTE_STRING_LITERAL");
                    			DOUBLE_QUOTE_STRING_LITERALGenLeaf.setValue(DOUBLE_QUOTE_STRING_LITERALGen.getText());
                    			DOUBLE_QUOTE_STRING_LITERALGenLeaf.setPos(DOUBLE_QUOTE_STRING_LITERALGen.getCharPositionInLine());
                    			DOUBLE_QUOTE_STRING_LITERALGenLeaf.setLine(DOUBLE_QUOTE_STRING_LITERALGen.getLine());
                    			rewrite_templateReturnNode.getChildren().add(DOUBLE_QUOTE_STRING_LITERALGenLeaf);
                    		}
                    	    // Create a CST Leaf
                    		if(DOUBLE_ANGLE_STRING_LITERALGen != null) {
                    			Leaf DOUBLE_ANGLE_STRING_LITERALGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                    			DOUBLE_ANGLE_STRING_LITERALGenLeaf.setKind("DOUBLE_ANGLE_STRING_LITERAL");
                    			DOUBLE_ANGLE_STRING_LITERALGenLeaf.setValue(DOUBLE_ANGLE_STRING_LITERALGen.getText());
                    			DOUBLE_ANGLE_STRING_LITERALGenLeaf.setPos(DOUBLE_ANGLE_STRING_LITERALGen.getCharPositionInLine());
                    			DOUBLE_ANGLE_STRING_LITERALGenLeaf.setLine(DOUBLE_ANGLE_STRING_LITERALGen.getLine());
                    			rewrite_templateReturnNode.getChildren().add(DOUBLE_ANGLE_STRING_LITERALGenLeaf);
                    		}
                    		// Returns the Node with CST Leaves/Nodes
                    		retval.returnNode = rewrite_templateReturnNode;
                    	

                    }
                    break;
                case 2 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:2756:4: rewrite_template_refGen+= rewrite_template_ref
                    {
                    pushFollow(FOLLOW_rewrite_template_ref_in_rewrite_template2704);
                    rewrite_template_refGen=rewrite_template_ref();
                    _fsp--;

                    if (list_rewrite_template_refGen==null) list_rewrite_template_refGen=new ArrayList();
                    list_rewrite_template_refGen.add(rewrite_template_refGen);

                    
                    		// Create return CST Node
                    		Node rewrite_templateReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                    		rewrite_templateReturnNode.setKind("rewrite_template");
                    	    // Create a CST Node
                    		if(list_rewrite_template_refGen != null) {
                    	        for(Iterator it = list_rewrite_template_refGen.iterator(); it.hasNext(); )  { 
                    	            ANTLRv3Parser.rewrite_template_ref_return r = (ANTLRv3Parser.rewrite_template_ref_return) it.next(); 
                    	            if(r != null && r.returnNode != null) {
                    	            	r.returnNode.setKind("rewrite_template_ref");
                    	            	rewrite_templateReturnNode.getChildren().add(r.returnNode);
                    	            } 
                    	        }
                    	    }
                    		// Returns the Node with CST Leaves/Nodes
                    		retval.returnNode = rewrite_templateReturnNode;
                    	

                    }
                    break;
                case 3 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:2774:4: rewrite_indirect_template_headGen+= rewrite_indirect_template_head
                    {
                    pushFollow(FOLLOW_rewrite_indirect_template_head_in_rewrite_template2715);
                    rewrite_indirect_template_headGen=rewrite_indirect_template_head();
                    _fsp--;

                    if (list_rewrite_indirect_template_headGen==null) list_rewrite_indirect_template_headGen=new ArrayList();
                    list_rewrite_indirect_template_headGen.add(rewrite_indirect_template_headGen);

                    
                    		// Create return CST Node
                    		Node rewrite_templateReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                    		rewrite_templateReturnNode.setKind("rewrite_template");
                    	    // Create a CST Node
                    		if(list_rewrite_indirect_template_headGen != null) {
                    	        for(Iterator it = list_rewrite_indirect_template_headGen.iterator(); it.hasNext(); )  { 
                    	            ANTLRv3Parser.rewrite_indirect_template_head_return r = (ANTLRv3Parser.rewrite_indirect_template_head_return) it.next(); 
                    	            if(r != null && r.returnNode != null) {
                    	            	r.returnNode.setKind("rewrite_indirect_template_head");
                    	            	rewrite_templateReturnNode.getChildren().add(r.returnNode);
                    	            } 
                    	        }
                    	    }
                    		// Returns the Node with CST Leaves/Nodes
                    		retval.returnNode = rewrite_templateReturnNode;
                    	

                    }
                    break;
                case 4 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:2792:4: ACTIONGen= ACTION
                    {
                    ACTIONGen=(Token)input.LT(1);
                    match(input,ACTION,FOLLOW_ACTION_in_rewrite_template2726); 
                    
                    		// Create return CST Node
                    		Node rewrite_templateReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                    		rewrite_templateReturnNode.setKind("rewrite_template");
                    	    // Create a CST Leaf
                    		if(ACTIONGen != null) {
                    			Leaf ACTIONGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                    			ACTIONGenLeaf.setKind("ACTION");
                    			ACTIONGenLeaf.setValue(ACTIONGen.getText());
                    			ACTIONGenLeaf.setPos(ACTIONGen.getCharPositionInLine());
                    			ACTIONGenLeaf.setLine(ACTIONGen.getLine());
                    			rewrite_templateReturnNode.getChildren().add(ACTIONGenLeaf);
                    		}
                    		// Returns the Node with CST Leaves/Nodes
                    		retval.returnNode = rewrite_templateReturnNode;
                    	

                    }
                    break;

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
    // $ANTLR end rewrite_template

    public static class rewrite_template_ref_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start rewrite_template_ref
    // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:2811:1: rewrite_template_ref returns [Node returnNode] : idGen+= id TK_0= '(' rewrite_template_argsGen+= rewrite_template_args TK_1= ')' ;
    public final rewrite_template_ref_return rewrite_template_ref() throws RecognitionException {
        rewrite_template_ref_return retval = new rewrite_template_ref_return();
        retval.start = input.LT(1);

        Token TK_0=null;
        Token TK_1=null;
        List list_idGen=null;
        List list_rewrite_template_argsGen=null;
        RuleReturnScope idGen = null;
        RuleReturnScope rewrite_template_argsGen = null;
        try {
            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:2812:1: (idGen+= id TK_0= '(' rewrite_template_argsGen+= rewrite_template_args TK_1= ')' )
            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:2812:3: idGen+= id TK_0= '(' rewrite_template_argsGen+= rewrite_template_args TK_1= ')'
            {
            pushFollow(FOLLOW_id_in_rewrite_template_ref2747);
            idGen=id();
            _fsp--;

            if (list_idGen==null) list_idGen=new ArrayList();
            list_idGen.add(idGen);

            TK_0=(Token)input.LT(1);
            match(input,82,FOLLOW_82_in_rewrite_template_ref2751); 
            pushFollow(FOLLOW_rewrite_template_args_in_rewrite_template_ref2755);
            rewrite_template_argsGen=rewrite_template_args();
            _fsp--;

            if (list_rewrite_template_argsGen==null) list_rewrite_template_argsGen=new ArrayList();
            list_rewrite_template_argsGen.add(rewrite_template_argsGen);

            TK_1=(Token)input.LT(1);
            match(input,84,FOLLOW_84_in_rewrite_template_ref2759); 
            
            		// Create return CST Node
            		Node rewrite_template_refReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
            		rewrite_template_refReturnNode.setKind("rewrite_template_ref");
            	    // Create a CST Node
            		if(list_idGen != null) {
            	        for(Iterator it = list_idGen.iterator(); it.hasNext(); )  { 
            	            ANTLRv3Parser.id_return r = (ANTLRv3Parser.id_return) it.next(); 
            	            if(r != null && r.returnNode != null) {
            	            	r.returnNode.setKind("id");
            	            	rewrite_template_refReturnNode.getChildren().add(r.returnNode);
            	            } 
            	        }
            	    }
            	    // Create a Token CST Leaf	
            	    if(TK_0 != null) {
            			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
            	 		TK_0Leaf.setKind("TOKEN");
            	 		TK_0Leaf.setValue(TK_0.getText());
            			TK_0Leaf.setPos(TK_0.getCharPositionInLine());
            			TK_0Leaf.setLine(TK_0.getLine());
            	 		rewrite_template_refReturnNode.getChildren().add(TK_0Leaf);
            	 	}
            	    // Create a CST Node
            		if(list_rewrite_template_argsGen != null) {
            	        for(Iterator it = list_rewrite_template_argsGen.iterator(); it.hasNext(); )  { 
            	            ANTLRv3Parser.rewrite_template_args_return r = (ANTLRv3Parser.rewrite_template_args_return) it.next(); 
            	            if(r != null && r.returnNode != null) {
            	            	r.returnNode.setKind("rewrite_template_args");
            	            	rewrite_template_refReturnNode.getChildren().add(r.returnNode);
            	            } 
            	        }
            	    }
            	    // Create a Token CST Leaf	
            	    if(TK_1 != null) {
            			Leaf TK_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
            	 		TK_1Leaf.setKind("TOKEN");
            	 		TK_1Leaf.setValue(TK_1.getText());
            			TK_1Leaf.setPos(TK_1.getCharPositionInLine());
            			TK_1Leaf.setLine(TK_1.getLine());
            	 		rewrite_template_refReturnNode.getChildren().add(TK_1Leaf);
            	 	}
            		// Returns the Node with CST Leaves/Nodes
            		retval.returnNode = rewrite_template_refReturnNode;
            	

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
    // $ANTLR end rewrite_template_ref

    public static class rewrite_indirect_template_head_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start rewrite_indirect_template_head
    // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:2860:1: rewrite_indirect_template_head returns [Node returnNode] : TK_0= '(' ACTIONGen= ACTION TK_1= ')' TK_2= '(' rewrite_template_argsGen+= rewrite_template_args TK_3= ')' ;
    public final rewrite_indirect_template_head_return rewrite_indirect_template_head() throws RecognitionException {
        rewrite_indirect_template_head_return retval = new rewrite_indirect_template_head_return();
        retval.start = input.LT(1);

        Token TK_0=null;
        Token ACTIONGen=null;
        Token TK_1=null;
        Token TK_2=null;
        Token TK_3=null;
        List list_rewrite_template_argsGen=null;
        RuleReturnScope rewrite_template_argsGen = null;
        try {
            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:2861:1: (TK_0= '(' ACTIONGen= ACTION TK_1= ')' TK_2= '(' rewrite_template_argsGen+= rewrite_template_args TK_3= ')' )
            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:2861:3: TK_0= '(' ACTIONGen= ACTION TK_1= ')' TK_2= '(' rewrite_template_argsGen+= rewrite_template_args TK_3= ')'
            {
            TK_0=(Token)input.LT(1);
            match(input,82,FOLLOW_82_in_rewrite_indirect_template_head2780); 
            ACTIONGen=(Token)input.LT(1);
            match(input,ACTION,FOLLOW_ACTION_in_rewrite_indirect_template_head2784); 
            TK_1=(Token)input.LT(1);
            match(input,84,FOLLOW_84_in_rewrite_indirect_template_head2788); 
            TK_2=(Token)input.LT(1);
            match(input,82,FOLLOW_82_in_rewrite_indirect_template_head2792); 
            pushFollow(FOLLOW_rewrite_template_args_in_rewrite_indirect_template_head2796);
            rewrite_template_argsGen=rewrite_template_args();
            _fsp--;

            if (list_rewrite_template_argsGen==null) list_rewrite_template_argsGen=new ArrayList();
            list_rewrite_template_argsGen.add(rewrite_template_argsGen);

            TK_3=(Token)input.LT(1);
            match(input,84,FOLLOW_84_in_rewrite_indirect_template_head2800); 
            
            		// Create return CST Node
            		Node rewrite_indirect_template_headReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
            		rewrite_indirect_template_headReturnNode.setKind("rewrite_indirect_template_head");
            	    // Create a Token CST Leaf	
            	    if(TK_0 != null) {
            			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
            	 		TK_0Leaf.setKind("TOKEN");
            	 		TK_0Leaf.setValue(TK_0.getText());
            			TK_0Leaf.setPos(TK_0.getCharPositionInLine());
            			TK_0Leaf.setLine(TK_0.getLine());
            	 		rewrite_indirect_template_headReturnNode.getChildren().add(TK_0Leaf);
            	 	}
            	    // Create a CST Leaf
            		if(ACTIONGen != null) {
            			Leaf ACTIONGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf();
            			ACTIONGenLeaf.setKind("ACTION");
            			ACTIONGenLeaf.setValue(ACTIONGen.getText());
            			ACTIONGenLeaf.setPos(ACTIONGen.getCharPositionInLine());
            			ACTIONGenLeaf.setLine(ACTIONGen.getLine());
            			rewrite_indirect_template_headReturnNode.getChildren().add(ACTIONGenLeaf);
            		}
            	    // Create a Token CST Leaf	
            	    if(TK_1 != null) {
            			Leaf TK_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
            	 		TK_1Leaf.setKind("TOKEN");
            	 		TK_1Leaf.setValue(TK_1.getText());
            			TK_1Leaf.setPos(TK_1.getCharPositionInLine());
            			TK_1Leaf.setLine(TK_1.getLine());
            	 		rewrite_indirect_template_headReturnNode.getChildren().add(TK_1Leaf);
            	 	}
            	    // Create a Token CST Leaf	
            	    if(TK_2 != null) {
            			Leaf TK_2Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
            	 		TK_2Leaf.setKind("TOKEN");
            	 		TK_2Leaf.setValue(TK_2.getText());
            			TK_2Leaf.setPos(TK_2.getCharPositionInLine());
            			TK_2Leaf.setLine(TK_2.getLine());
            	 		rewrite_indirect_template_headReturnNode.getChildren().add(TK_2Leaf);
            	 	}
            	    // Create a CST Node
            		if(list_rewrite_template_argsGen != null) {
            	        for(Iterator it = list_rewrite_template_argsGen.iterator(); it.hasNext(); )  { 
            	            ANTLRv3Parser.rewrite_template_args_return r = (ANTLRv3Parser.rewrite_template_args_return) it.next(); 
            	            if(r != null && r.returnNode != null) {
            	            	r.returnNode.setKind("rewrite_template_args");
            	            	rewrite_indirect_template_headReturnNode.getChildren().add(r.returnNode);
            	            } 
            	        }
            	    }
            	    // Create a Token CST Leaf	
            	    if(TK_3 != null) {
            			Leaf TK_3Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
            	 		TK_3Leaf.setKind("TOKEN");
            	 		TK_3Leaf.setValue(TK_3.getText());
            			TK_3Leaf.setPos(TK_3.getCharPositionInLine());
            			TK_3Leaf.setLine(TK_3.getLine());
            	 		rewrite_indirect_template_headReturnNode.getChildren().add(TK_3Leaf);
            	 	}
            		// Returns the Node with CST Leaves/Nodes
            		retval.returnNode = rewrite_indirect_template_headReturnNode;
            	

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
    // $ANTLR end rewrite_indirect_template_head

    public static class rewrite_template_args_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start rewrite_template_args
    // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:2926:1: rewrite_template_args returns [Node returnNode] : (rewrite_template_argGen+= rewrite_template_arg (TK_0= ',' rewrite_template_argGen_1+= rewrite_template_arg )* | );
    public final rewrite_template_args_return rewrite_template_args() throws RecognitionException {
        rewrite_template_args_return retval = new rewrite_template_args_return();
        retval.start = input.LT(1);

        Token TK_0=null;
        List list_rewrite_template_argGen=null;
        List list_rewrite_template_argGen_1=null;
        RuleReturnScope rewrite_template_argGen = null;
        RuleReturnScope rewrite_template_argGen_1 = null;
        try {
            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:2927:1: (rewrite_template_argGen+= rewrite_template_arg (TK_0= ',' rewrite_template_argGen_1+= rewrite_template_arg )* | )
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==TOKEN_REF||LA74_0==RULE_REF) ) {
                alt74=1;
            }
            else if ( (LA74_0==84) ) {
                alt74=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("2926:1: rewrite_template_args returns [Node returnNode] : (rewrite_template_argGen+= rewrite_template_arg (TK_0= ',' rewrite_template_argGen_1+= rewrite_template_arg )* | );", 74, 0, input);

                throw nvae;
            }
            switch (alt74) {
                case 1 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:2927:3: rewrite_template_argGen+= rewrite_template_arg (TK_0= ',' rewrite_template_argGen_1+= rewrite_template_arg )*
                    {
                    pushFollow(FOLLOW_rewrite_template_arg_in_rewrite_template_args2821);
                    rewrite_template_argGen=rewrite_template_arg();
                    _fsp--;

                    if (list_rewrite_template_argGen==null) list_rewrite_template_argGen=new ArrayList();
                    list_rewrite_template_argGen.add(rewrite_template_argGen);

                    // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:2927:49: (TK_0= ',' rewrite_template_argGen_1+= rewrite_template_arg )*
                    loop73:
                    do {
                        int alt73=2;
                        int LA73_0 = input.LA(1);

                        if ( (LA73_0==81) ) {
                            alt73=1;
                        }


                        switch (alt73) {
                    	case 1 :
                    	    // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:2927:50: TK_0= ',' rewrite_template_argGen_1+= rewrite_template_arg
                    	    {
                    	    TK_0=(Token)input.LT(1);
                    	    match(input,81,FOLLOW_81_in_rewrite_template_args2826); 
                    	    pushFollow(FOLLOW_rewrite_template_arg_in_rewrite_template_args2830);
                    	    rewrite_template_argGen_1=rewrite_template_arg();
                    	    _fsp--;

                    	    if (list_rewrite_template_argGen_1==null) list_rewrite_template_argGen_1=new ArrayList();
                    	    list_rewrite_template_argGen_1.add(rewrite_template_argGen_1);


                    	    }
                    	    break;

                    	default :
                    	    break loop73;
                        }
                    } while (true);

                    
                    		// Create return CST Node
                    		Node rewrite_template_argsReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                    		rewrite_template_argsReturnNode.setKind("rewrite_template_args");
                    	    // Create a CST Node
                    		if(list_rewrite_template_argGen != null) {
                    	        for(Iterator it = list_rewrite_template_argGen.iterator(); it.hasNext(); )  { 
                    	            ANTLRv3Parser.rewrite_template_arg_return r = (ANTLRv3Parser.rewrite_template_arg_return) it.next(); 
                    	            if(r != null && r.returnNode != null) {
                    	            	r.returnNode.setKind("rewrite_template_arg");
                    	            	rewrite_template_argsReturnNode.getChildren().add(r.returnNode);
                    	            } 
                    	        }
                    	    }
                    	
                    		// Create a special CST Node for terminal rewrite_template_argGen_1 aggregation
                    		if(list_rewrite_template_argGen_1 != null) {
                    	    for(int pos = 0; pos < list_rewrite_template_argGen_1.size(); pos++ )  { 
                    	    // Create a Token CST Leaf	
                    	    if(TK_0 != null) {
                    			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                    	 		TK_0Leaf.setKind("TOKEN");
                    	 		TK_0Leaf.setValue(TK_0.getText());
                    			TK_0Leaf.setPos(TK_0.getCharPositionInLine());
                    			TK_0Leaf.setLine(TK_0.getLine());
                    	 		rewrite_template_argsReturnNode.getChildren().add(TK_0Leaf);
                    	 	}
                    		// No Terminal extractor
                    	    if(list_rewrite_template_argGen_1 != null) {		
                    	    	ANTLRv3Parser.rewrite_template_arg_return r = (ANTLRv3Parser.rewrite_template_arg_return) list_rewrite_template_argGen_1.get(pos); 
                    	    	if(r != null && r.returnNode != null) {
                    	        	r.returnNode.setKind("rewrite_template_arg");
                    	    		rewrite_template_argsReturnNode.getChildren().add(r.returnNode);
                    	    	} 
                    		}
                    		}
                    		}
                    	
                    		// Returns the Node with CST Leaves/Nodes
                    		retval.returnNode = rewrite_template_argsReturnNode;
                    	

                    }
                    break;
                case 2 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:2970:2: 
                    {
                    }
                    break;

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
    // $ANTLR end rewrite_template_args

    public static class rewrite_template_arg_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start rewrite_template_arg
    // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:2972:1: rewrite_template_arg returns [Node returnNode] : idGen+= id TK_0= '=' ACTIONGen= ACTION ;
    public final rewrite_template_arg_return rewrite_template_arg() throws RecognitionException {
        rewrite_template_arg_return retval = new rewrite_template_arg_return();
        retval.start = input.LT(1);

        Token TK_0=null;
        Token ACTIONGen=null;
        List list_idGen=null;
        RuleReturnScope idGen = null;
        try {
            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:2973:1: (idGen+= id TK_0= '=' ACTIONGen= ACTION )
            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:2973:5: idGen+= id TK_0= '=' ACTIONGen= ACTION
            {
            pushFollow(FOLLOW_id_in_rewrite_template_arg2859);
            idGen=id();
            _fsp--;

            if (list_idGen==null) list_idGen=new ArrayList();
            list_idGen.add(idGen);

            TK_0=(Token)input.LT(1);
            match(input,71,FOLLOW_71_in_rewrite_template_arg2863); 
            ACTIONGen=(Token)input.LT(1);
            match(input,ACTION,FOLLOW_ACTION_in_rewrite_template_arg2867); 
            
            		// Create return CST Node
            		Node rewrite_template_argReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
            		rewrite_template_argReturnNode.setKind("rewrite_template_arg");
            	    // Create a CST Node
            		if(list_idGen != null) {
            	        for(Iterator it = list_idGen.iterator(); it.hasNext(); )  { 
            	            ANTLRv3Parser.id_return r = (ANTLRv3Parser.id_return) it.next(); 
            	            if(r != null && r.returnNode != null) {
            	            	r.returnNode.setKind("id");
            	            	rewrite_template_argReturnNode.getChildren().add(r.returnNode);
            	            } 
            	        }
            	    }
            	    // Create a Token CST Leaf	
            	    if(TK_0 != null) {
            			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
            	 		TK_0Leaf.setKind("TOKEN");
            	 		TK_0Leaf.setValue(TK_0.getText());
            			TK_0Leaf.setPos(TK_0.getCharPositionInLine());
            			TK_0Leaf.setLine(TK_0.getLine());
            	 		rewrite_template_argReturnNode.getChildren().add(TK_0Leaf);
            	 	}
            	    // Create a CST Leaf
            		if(ACTIONGen != null) {
            			Leaf ACTIONGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf();
            			ACTIONGenLeaf.setKind("ACTION");
            			ACTIONGenLeaf.setValue(ACTIONGen.getText());
            			ACTIONGenLeaf.setPos(ACTIONGen.getCharPositionInLine());
            			ACTIONGenLeaf.setLine(ACTIONGen.getLine());
            			rewrite_template_argReturnNode.getChildren().add(ACTIONGenLeaf);
            		}
            		// Returns the Node with CST Leaves/Nodes
            		retval.returnNode = rewrite_template_argReturnNode;
            	

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
    // $ANTLR end rewrite_template_arg

    public static class id_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start id
    // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:3011:1: id returns [Node returnNode] : (TOKEN_REFGen= TOKEN_REF | RULE_REFGen= RULE_REF );
    public final id_return id() throws RecognitionException {
        id_return retval = new id_return();
        retval.start = input.LT(1);

        Token TOKEN_REFGen=null;
        Token RULE_REFGen=null;

        try {
            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:3012:1: (TOKEN_REFGen= TOKEN_REF | RULE_REFGen= RULE_REF )
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==TOKEN_REF) ) {
                alt75=1;
            }
            else if ( (LA75_0==RULE_REF) ) {
                alt75=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("3011:1: id returns [Node returnNode] : (TOKEN_REFGen= TOKEN_REF | RULE_REFGen= RULE_REF );", 75, 0, input);

                throw nvae;
            }
            switch (alt75) {
                case 1 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:3012:3: TOKEN_REFGen= TOKEN_REF
                    {
                    TOKEN_REFGen=(Token)input.LT(1);
                    match(input,TOKEN_REF,FOLLOW_TOKEN_REF_in_id2889); 
                    
                    		// Create return CST Node
                    		Node idReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                    		idReturnNode.setKind("id");
                    	    // Create a CST Leaf
                    		if(TOKEN_REFGen != null) {
                    			Leaf TOKEN_REFGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                    			TOKEN_REFGenLeaf.setKind("TOKEN_REF");
                    			TOKEN_REFGenLeaf.setValue(TOKEN_REFGen.getText());
                    			TOKEN_REFGenLeaf.setPos(TOKEN_REFGen.getCharPositionInLine());
                    			TOKEN_REFGenLeaf.setLine(TOKEN_REFGen.getLine());
                    			idReturnNode.getChildren().add(TOKEN_REFGenLeaf);
                    		}
                    		// Returns the Node with CST Leaves/Nodes
                    		retval.returnNode = idReturnNode;
                    	

                    }
                    break;
                case 2 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:3029:4: RULE_REFGen= RULE_REF
                    {
                    RULE_REFGen=(Token)input.LT(1);
                    match(input,RULE_REF,FOLLOW_RULE_REF_in_id2901); 
                    
                    		// Create return CST Node
                    		Node idReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                    		idReturnNode.setKind("id");
                    	    // Create a CST Leaf
                    		if(RULE_REFGen != null) {
                    			Leaf RULE_REFGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                    			RULE_REFGenLeaf.setKind("RULE_REF");
                    			RULE_REFGenLeaf.setValue(RULE_REFGen.getText());
                    			RULE_REFGenLeaf.setPos(RULE_REFGen.getCharPositionInLine());
                    			RULE_REFGenLeaf.setLine(RULE_REFGen.getLine());
                    			idReturnNode.getChildren().add(RULE_REFGenLeaf);
                    		}
                    		// Returns the Node with CST Leaves/Nodes
                    		retval.returnNode = idReturnNode;
                    	

                    }
                    break;

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
    // $ANTLR end id


    protected DFA72 dfa72 = new DFA72(this);
    static final String DFA72_eotS =
        "\22\uffff";
    static final String DFA72_eofS =
        "\22\uffff";
    static final String DFA72_minS =
        "\1\52\2\122\2\uffff\1\52\2\107\1\50\1\55\2\uffff\1\121\1\52\2\107"+
        "\1\55\1\121";
    static final String DFA72_maxS =
        "\3\122\2\uffff\1\124\2\107\1\124\1\55\2\uffff\1\124\1\61\2\107\1"+
        "\55\1\124";
    static final String DFA72_acceptS =
        "\3\uffff\1\3\1\4\5\uffff\1\2\1\1\6\uffff";
    static final String DFA72_specialS =
        "\22\uffff}>";
    static final String[] DFA72_transitionS = {
            "\1\1\2\uffff\1\4\3\uffff\1\2\40\uffff\1\3",
            "\1\5",
            "\1\5",
            "",
            "",
            "\1\6\6\uffff\1\7\42\uffff\1\10",
            "\1\11",
            "\1\11",
            "\1\12\11\uffff\2\13\21\uffff\1\12\15\uffff\2\12",
            "\1\14",
            "",
            "",
            "\1\15\2\uffff\1\10",
            "\1\16\6\uffff\1\17",
            "\1\20",
            "\1\20",
            "\1\21",
            "\1\15\2\uffff\1\10"
    };

    static final short[] DFA72_eot = DFA.unpackEncodedString(DFA72_eotS);
    static final short[] DFA72_eof = DFA.unpackEncodedString(DFA72_eofS);
    static final char[] DFA72_min = DFA.unpackEncodedStringToUnsignedChars(DFA72_minS);
    static final char[] DFA72_max = DFA.unpackEncodedStringToUnsignedChars(DFA72_maxS);
    static final short[] DFA72_accept = DFA.unpackEncodedString(DFA72_acceptS);
    static final short[] DFA72_special = DFA.unpackEncodedString(DFA72_specialS);
    static final short[][] DFA72_transition;

    static {
        int numStates = DFA72_transitionS.length;
        DFA72_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA72_transition[i] = DFA.unpackEncodedString(DFA72_transitionS[i]);
        }
    }

    class DFA72 extends DFA {

        public DFA72(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 72;
            this.eot = DFA72_eot;
            this.eof = DFA72_eof;
            this.min = DFA72_min;
            this.max = DFA72_max;
            this.accept = DFA72_accept;
            this.special = DFA72_special;
            this.transition = DFA72_transition;
        }
        public String getDescription() {
            return "2690:1: rewrite_template returns [Node returnNode] : (idGen+= id TK_0= '(' rewrite_template_argsGen+= rewrite_template_args TK_1= ')' (DOUBLE_QUOTE_STRING_LITERALGen= DOUBLE_QUOTE_STRING_LITERAL | DOUBLE_ANGLE_STRING_LITERALGen= DOUBLE_ANGLE_STRING_LITERAL ) | rewrite_template_refGen+= rewrite_template_ref | rewrite_indirect_template_headGen+= rewrite_indirect_template_head | ACTIONGen= ACTION );";
        }
    }
 

    public static final BitSet FOLLOW_DOC_COMMENT_in_grammarDef337 = new BitSet(new long[]{0x0000000000000000L,0x000000000000001EL});
    public static final BitSet FOLLOW_65_in_grammarDef349 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_66_in_grammarDef363 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_67_in_grammarDef377 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_grammarDef410 = new BitSet(new long[]{0x0002040000000000L});
    public static final BitSet FOLLOW_id_in_grammarDef414 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_grammarDef418 = new BitSet(new long[]{0x0002461080000010L,0x0000000000003900L});
    public static final BitSet FOLLOW_optionsSpec_in_grammarDef422 = new BitSet(new long[]{0x0002061080000010L,0x0000000000003900L});
    public static final BitSet FOLLOW_tokensSpec_in_grammarDef427 = new BitSet(new long[]{0x0002041080000010L,0x0000000000003900L});
    public static final BitSet FOLLOW_attrScope_in_grammarDef432 = new BitSet(new long[]{0x0002041080000010L,0x0000000000003900L});
    public static final BitSet FOLLOW_action_in_grammarDef437 = new BitSet(new long[]{0x0002041000000010L,0x0000000000003900L});
    public static final BitSet FOLLOW_rule_in_grammarDef447 = new BitSet(new long[]{0x0002041000000010L,0x0000000000003800L});
    public static final BitSet FOLLOW_EOF_in_grammarDef457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOKENS_in_tokensSpec481 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_tokenSpec_in_tokensSpec485 = new BitSet(new long[]{0x0000040000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_tokensSpec490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOKEN_REF_in_tokenSpec512 = new BitSet(new long[]{0x0000000000000000L,0x00000000000000A0L});
    public static final BitSet FOLLOW_71_in_tokenSpec520 = new BitSet(new long[]{0x0000180000000000L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_tokenSpec525 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_CHAR_LITERAL_in_tokenSpec529 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_tokenSpec557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SCOPE_in_attrScope578 = new BitSet(new long[]{0x0002040000000000L});
    public static final BitSet FOLLOW_id_in_attrScope582 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_ACTION_in_attrScope586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_action607 = new BitSet(new long[]{0x0002040000000000L,0x0000000000000006L});
    public static final BitSet FOLLOW_actionScopeName_in_action612 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_73_in_action616 = new BitSet(new long[]{0x0002040000000000L});
    public static final BitSet FOLLOW_id_in_action622 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_ACTION_in_action626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_actionScopeName649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_actionScopeName660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_actionScopeName677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPTIONS_in_optionsSpec698 = new BitSet(new long[]{0x0002040000000000L});
    public static final BitSet FOLLOW_option_in_optionsSpec703 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_optionsSpec707 = new BitSet(new long[]{0x0002040000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_optionsSpec713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_option736 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_option740 = new BitSet(new long[]{0x00029C0000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_optionValue_in_option744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_optionValue771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_optionValue787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHAR_LITERAL_in_optionValue803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_optionValue819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_optionValue833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOC_COMMENT_in_rule858 = new BitSet(new long[]{0x0002041000000000L,0x0000000000003800L});
    public static final BitSet FOLLOW_75_in_rule868 = new BitSet(new long[]{0x0002040000000000L});
    public static final BitSet FOLLOW_76_in_rule872 = new BitSet(new long[]{0x0002040000000000L});
    public static final BitSet FOLLOW_77_in_rule876 = new BitSet(new long[]{0x0002040000000000L});
    public static final BitSet FOLLOW_FRAGMENT_in_rule880 = new BitSet(new long[]{0x0002040000000000L});
    public static final BitSet FOLLOW_id_in_rule890 = new BitSet(new long[]{0x0001408080000000L,0x000000000001C100L});
    public static final BitSet FOLLOW_BANG_in_rule897 = new BitSet(new long[]{0x0001400080000000L,0x000000000001C100L});
    public static final BitSet FOLLOW_ARG_ACTION_in_rule906 = new BitSet(new long[]{0x0000400080000000L,0x000000000001C100L});
    public static final BitSet FOLLOW_78_in_rule917 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_ARG_ACTION_in_rule921 = new BitSet(new long[]{0x0000400080000000L,0x0000000000018100L});
    public static final BitSet FOLLOW_throwsSpec_in_rule931 = new BitSet(new long[]{0x0000400080000000L,0x0000000000008100L});
    public static final BitSet FOLLOW_optionsSpec_in_rule936 = new BitSet(new long[]{0x0000000080000000L,0x0000000000008100L});
    public static final BitSet FOLLOW_ruleScopeSpec_in_rule941 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008100L});
    public static final BitSet FOLLOW_ruleAction_in_rule946 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008100L});
    public static final BitSet FOLLOW_79_in_rule953 = new BitSet(new long[]{0x00023D2100000000L,0x00000000120C0020L});
    public static final BitSet FOLLOW_altList_in_rule957 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_rule961 = new BitSet(new long[]{0x0000000000000002L,0x0000000000600000L});
    public static final BitSet FOLLOW_exceptionGroup_in_rule967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleAction989 = new BitSet(new long[]{0x0002040000000000L});
    public static final BitSet FOLLOW_id_in_ruleAction993 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_ACTION_in_ruleAction997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_throwsSpec1018 = new BitSet(new long[]{0x0002040000000000L});
    public static final BitSet FOLLOW_id_in_throwsSpec1022 = new BitSet(new long[]{0x0000000000000002L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_throwsSpec1028 = new BitSet(new long[]{0x0002040000000000L});
    public static final BitSet FOLLOW_id_in_throwsSpec1032 = new BitSet(new long[]{0x0000000000000002L,0x0000000000020000L});
    public static final BitSet FOLLOW_SCOPE_in_ruleScopeSpec1057 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_ACTION_in_ruleScopeSpec1061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SCOPE_in_ruleScopeSpec1073 = new BitSet(new long[]{0x0002040000000000L});
    public static final BitSet FOLLOW_id_in_ruleScopeSpec1077 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020020L});
    public static final BitSet FOLLOW_81_in_ruleScopeSpec1082 = new BitSet(new long[]{0x0002040000000000L});
    public static final BitSet FOLLOW_id_in_ruleScopeSpec1086 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020020L});
    public static final BitSet FOLLOW_69_in_ruleScopeSpec1092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SCOPE_in_ruleScopeSpec1104 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_ACTION_in_ruleScopeSpec1108 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_SCOPE_in_ruleScopeSpec1114 = new BitSet(new long[]{0x0002040000000000L});
    public static final BitSet FOLLOW_id_in_ruleScopeSpec1118 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020020L});
    public static final BitSet FOLLOW_81_in_ruleScopeSpec1123 = new BitSet(new long[]{0x0002040000000000L});
    public static final BitSet FOLLOW_id_in_ruleScopeSpec1127 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020020L});
    public static final BitSet FOLLOW_69_in_ruleScopeSpec1133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_block1156 = new BitSet(new long[]{0x00027D2100000000L,0x00000000121C8000L});
    public static final BitSet FOLLOW_optionsSpec_in_block1165 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_79_in_block1171 = new BitSet(new long[]{0x00023D2100000000L,0x00000000121C0000L});
    public static final BitSet FOLLOW_alternative_in_block1180 = new BitSet(new long[]{0x0000010000000000L,0x0000000000180000L});
    public static final BitSet FOLLOW_rewrite_in_block1184 = new BitSet(new long[]{0x0000000000000000L,0x0000000000180000L});
    public static final BitSet FOLLOW_83_in_block1190 = new BitSet(new long[]{0x00023D2100000000L,0x00000000121C0000L});
    public static final BitSet FOLLOW_alternative_in_block1194 = new BitSet(new long[]{0x0000010000000000L,0x0000000000180000L});
    public static final BitSet FOLLOW_rewrite_in_block1198 = new BitSet(new long[]{0x0000000000000000L,0x0000000000180000L});
    public static final BitSet FOLLOW_84_in_block1213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_alternative_in_altList1239 = new BitSet(new long[]{0x0000010000000002L,0x0000000000080000L});
    public static final BitSet FOLLOW_rewrite_in_altList1243 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_altList1249 = new BitSet(new long[]{0x00023D2100000002L,0x00000000120C0000L});
    public static final BitSet FOLLOW_alternative_in_altList1253 = new BitSet(new long[]{0x0000010000000002L,0x0000000000080000L});
    public static final BitSet FOLLOW_rewrite_in_altList1257 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080000L});
    public static final BitSet FOLLOW_element_in_alternative1286 = new BitSet(new long[]{0x00023C2100000002L,0x0000000012040000L});
    public static final BitSet FOLLOW_exceptionHandler_in_exceptionGroup1323 = new BitSet(new long[]{0x0000000000000002L,0x0000000000600000L});
    public static final BitSet FOLLOW_finallyClause_in_exceptionGroup1332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_finallyClause_in_exceptionGroup1346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_exceptionHandler1373 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_ARG_ACTION_in_exceptionHandler1377 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_ACTION_in_exceptionHandler1381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_finallyClause1409 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_ACTION_in_finallyClause1413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_elementNoOptionSpec_in_element1438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_elementNoOptionSpec1459 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800080L});
    public static final BitSet FOLLOW_71_in_elementNoOptionSpec1464 = new BitSet(new long[]{0x00021C0000000000L,0x0000000012000000L});
    public static final BitSet FOLLOW_87_in_elementNoOptionSpec1468 = new BitSet(new long[]{0x00021C0000000000L,0x0000000012000000L});
    public static final BitSet FOLLOW_atom_in_elementNoOptionSpec1473 = new BitSet(new long[]{0x0000000000000002L,0x000000000C000400L});
    public static final BitSet FOLLOW_ebnfSuffix_in_elementNoOptionSpec1481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_elementNoOptionSpec1505 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800080L});
    public static final BitSet FOLLOW_71_in_elementNoOptionSpec1510 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_87_in_elementNoOptionSpec1514 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_block_in_elementNoOptionSpec1519 = new BitSet(new long[]{0x0000000000000002L,0x000000000C000400L});
    public static final BitSet FOLLOW_ebnfSuffix_in_elementNoOptionSpec1527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atom_in_elementNoOptionSpec1551 = new BitSet(new long[]{0x0000000000000002L,0x000000000C000400L});
    public static final BitSet FOLLOW_ebnfSuffix_in_elementNoOptionSpec1559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ebnf_in_elementNoOptionSpec1583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ACTION_in_elementNoOptionSpec1596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEMPRED_in_elementNoOptionSpec1609 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000000L});
    public static final BitSet FOLLOW_88_in_elementNoOptionSpec1615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_treeSpec_in_elementNoOptionSpec1633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_range_in_atom1656 = new BitSet(new long[]{0x000000C000000002L});
    public static final BitSet FOLLOW_ROOT_in_atom1663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BANG_in_atom1667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_terminal_in_atom1690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_notSet_in_atom1704 = new BitSet(new long[]{0x000000C000000002L});
    public static final BitSet FOLLOW_ROOT_in_atom1711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BANG_in_atom1715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_REF_in_atom1738 = new BitSet(new long[]{0x000100C000000002L});
    public static final BitSet FOLLOW_ARG_ACTION_in_atom1744 = new BitSet(new long[]{0x000000C000000002L});
    public static final BitSet FOLLOW_ROOT_in_atom1754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BANG_in_atom1758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_notSet1786 = new BitSet(new long[]{0x00001C0000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_notTerminal_in_notSet1794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_notSet1803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TREE_BEGIN_in_treeSpec1830 = new BitSet(new long[]{0x00023C2100000000L,0x0000000012040000L});
    public static final BitSet FOLLOW_element_in_treeSpec1834 = new BitSet(new long[]{0x00023C2100000000L,0x0000000012040000L});
    public static final BitSet FOLLOW_element_in_treeSpec1840 = new BitSet(new long[]{0x00023C2100000000L,0x0000000012140000L});
    public static final BitSet FOLLOW_84_in_treeSpec1847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_ebnf1870 = new BitSet(new long[]{0x000000C000000002L,0x000000000D000400L});
    public static final BitSet FOLLOW_90_in_ebnf1880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ebnf1890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_91_in_ebnf1900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ROOT_in_ebnf1912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BANG_in_ebnf1924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_ebnf1936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHAR_LITERAL_in_range1976 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_RANGE_in_range1980 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_CHAR_LITERAL_in_range1984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHAR_LITERAL_in_terminal2009 = new BitSet(new long[]{0x000000C000000002L});
    public static final BitSet FOLLOW_TOKEN_REF_in_terminal2023 = new BitSet(new long[]{0x000100C000000002L});
    public static final BitSet FOLLOW_ARG_ACTION_in_terminal2032 = new BitSet(new long[]{0x000000C000000002L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_terminal2062 = new BitSet(new long[]{0x000000C000000002L});
    public static final BitSet FOLLOW_92_in_terminal2076 = new BitSet(new long[]{0x000000C000000002L});
    public static final BitSet FOLLOW_ROOT_in_terminal2096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BANG_in_terminal2111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHAR_LITERAL_in_notTerminal2146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOKEN_REF_in_notTerminal2157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_notTerminal2168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_ebnfSuffix2190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ebnfSuffix2203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_91_in_ebnfSuffix2217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REWRITE_in_rewrite2244 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_SEMPRED_in_rewrite2248 = new BitSet(new long[]{0x00023D2000000000L,0x0000000020040000L});
    public static final BitSet FOLLOW_rewrite_alternative_in_rewrite2252 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_REWRITE_in_rewrite2261 = new BitSet(new long[]{0x00023C2000000002L,0x0000000020040000L});
    public static final BitSet FOLLOW_rewrite_alternative_in_rewrite2265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rewrite_template_in_rewrite_alternative2289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rewrite_tree_alternative_in_rewrite_alternative2300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_rewrite_template_block2335 = new BitSet(new long[]{0x0002240000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_rewrite_template_in_rewrite_template_block2339 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_rewrite_template_block2343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_rewrite_tree_block2369 = new BitSet(new long[]{0x00023C2000000000L,0x0000000020040000L});
    public static final BitSet FOLLOW_rewrite_tree_alternative_in_rewrite_tree_block2373 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_rewrite_tree_block2377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rewrite_tree_element_in_rewrite_tree_alternative2401 = new BitSet(new long[]{0x00023C2000000002L,0x0000000020040000L});
    public static final BitSet FOLLOW_rewrite_tree_atom_in_rewrite_tree_element2427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rewrite_tree_atom_in_rewrite_tree_element2438 = new BitSet(new long[]{0x0000000000000000L,0x000000000C000400L});
    public static final BitSet FOLLOW_ebnfSuffix_in_rewrite_tree_element2442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rewrite_tree_in_rewrite_tree_element2455 = new BitSet(new long[]{0x0000000000000002L,0x000000000C000400L});
    public static final BitSet FOLLOW_ebnfSuffix_in_rewrite_tree_element2463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rewrite_tree_ebnf_in_rewrite_tree_element2485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHAR_LITERAL_in_rewrite_tree_atom2508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOKEN_REF_in_rewrite_tree_atom2521 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_ARG_ACTION_in_rewrite_tree_atom2525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_REF_in_rewrite_tree_atom2543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_rewrite_tree_atom2556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_93_in_rewrite_tree_atom2569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ACTION_in_rewrite_tree_atom2581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rewrite_tree_block_in_rewrite_tree_ebnf2602 = new BitSet(new long[]{0x0000000000000000L,0x000000000C000400L});
    public static final BitSet FOLLOW_ebnfSuffix_in_rewrite_tree_ebnf2606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TREE_BEGIN_in_rewrite_tree2629 = new BitSet(new long[]{0x00023C0000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_rewrite_tree_atom_in_rewrite_tree2633 = new BitSet(new long[]{0x00023C2000000000L,0x0000000020140000L});
    public static final BitSet FOLLOW_rewrite_tree_element_in_rewrite_tree2637 = new BitSet(new long[]{0x00023C2000000000L,0x0000000020140000L});
    public static final BitSet FOLLOW_84_in_rewrite_tree2642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_rewrite_template2665 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_rewrite_template2669 = new BitSet(new long[]{0x0002040000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_rewrite_template_args_in_rewrite_template2673 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_rewrite_template2677 = new BitSet(new long[]{0x000C000000000000L});
    public static final BitSet FOLLOW_DOUBLE_QUOTE_STRING_LITERAL_in_rewrite_template2685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOUBLE_ANGLE_STRING_LITERAL_in_rewrite_template2691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rewrite_template_ref_in_rewrite_template2704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rewrite_indirect_template_head_in_rewrite_template2715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ACTION_in_rewrite_template2726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_rewrite_template_ref2747 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_rewrite_template_ref2751 = new BitSet(new long[]{0x0002040000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_rewrite_template_args_in_rewrite_template_ref2755 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_rewrite_template_ref2759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_rewrite_indirect_template_head2780 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_ACTION_in_rewrite_indirect_template_head2784 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_rewrite_indirect_template_head2788 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_rewrite_indirect_template_head2792 = new BitSet(new long[]{0x0002040000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_rewrite_template_args_in_rewrite_indirect_template_head2796 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_rewrite_indirect_template_head2800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rewrite_template_arg_in_rewrite_template_args2821 = new BitSet(new long[]{0x0000000000000002L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_rewrite_template_args2826 = new BitSet(new long[]{0x0002040000000000L});
    public static final BitSet FOLLOW_rewrite_template_arg_in_rewrite_template_args2830 = new BitSet(new long[]{0x0000000000000002L,0x0000000000020000L});
    public static final BitSet FOLLOW_id_in_rewrite_template_arg2859 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_rewrite_template_arg2863 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_ACTION_in_rewrite_template_arg2867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOKEN_REF_in_id2889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_REF_in_id2901 = new BitSet(new long[]{0x0000000000000002L});

}