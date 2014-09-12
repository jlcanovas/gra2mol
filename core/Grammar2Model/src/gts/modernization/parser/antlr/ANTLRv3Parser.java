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


// $ANTLR 3.2 Sep 23, 2009 12:02:23 C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3 2010-01-24 22:46:00

	package gts.modernization.parser.antlr;

	import gts.modernization.parser.antlr.*;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.tree.*;

/** ANTLR v3 grammar written in ANTLR v3 with AST construction */
public class ANTLRv3Parser extends Parser {
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
    public static final int RULE=7;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int ACTION_ESC=62;
    public static final int PARSER_GRAMMAR=25;
    public static final int SRC=52;
    public static final int CHAR_RANGE=14;
    public static final int INT=47;
    public static final int EPSILON=15;
    public static final int T__85=85;
    public static final int T__84=84;
    public static final int T__87=87;
    public static final int T__86=86;
    public static final int T__89=89;
    public static final int REWRITE=40;
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


        public ANTLRv3Parser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public ANTLRv3Parser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return ANTLRv3Parser.tokenNames; }
    public String getGrammarFileName() { return "C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3"; }


    	int gtype;


    public static class grammarDef_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "grammarDef"
    // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:94:1: grammarDef : ( DOC_COMMENT )? ( 'lexer' | 'parser' | 'tree' | ) g= 'grammar' id ';' ( optionsSpec )? ( tokensSpec )? ( attrScope )* ( action )* ( rule )+ EOF -> ^( id ( DOC_COMMENT )? ( optionsSpec )? ( tokensSpec )? ( attrScope )* ( action )* ( rule )+ ) ;
    public final ANTLRv3Parser.grammarDef_return grammarDef() throws RecognitionException {
        ANTLRv3Parser.grammarDef_return retval = new ANTLRv3Parser.grammarDef_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token g=null;
        Token DOC_COMMENT1=null;
        Token string_literal2=null;
        Token string_literal3=null;
        Token string_literal4=null;
        Token char_literal6=null;
        Token EOF12=null;
        ANTLRv3Parser.id_return id5 = null;

        ANTLRv3Parser.optionsSpec_return optionsSpec7 = null;

        ANTLRv3Parser.tokensSpec_return tokensSpec8 = null;

        ANTLRv3Parser.attrScope_return attrScope9 = null;

        ANTLRv3Parser.action_return action10 = null;

        ANTLRv3Parser.rule_return rule11 = null;


        CommonTree g_tree=null;
        CommonTree DOC_COMMENT1_tree=null;
        CommonTree string_literal2_tree=null;
        CommonTree string_literal3_tree=null;
        CommonTree string_literal4_tree=null;
        CommonTree char_literal6_tree=null;
        CommonTree EOF12_tree=null;
        RewriteRuleTokenStream stream_67=new RewriteRuleTokenStream(adaptor,"token 67");
        RewriteRuleTokenStream stream_DOC_COMMENT=new RewriteRuleTokenStream(adaptor,"token DOC_COMMENT");
        RewriteRuleTokenStream stream_66=new RewriteRuleTokenStream(adaptor,"token 66");
        RewriteRuleTokenStream stream_69=new RewriteRuleTokenStream(adaptor,"token 69");
        RewriteRuleTokenStream stream_68=new RewriteRuleTokenStream(adaptor,"token 68");
        RewriteRuleTokenStream stream_65=new RewriteRuleTokenStream(adaptor,"token 65");
        RewriteRuleTokenStream stream_EOF=new RewriteRuleTokenStream(adaptor,"token EOF");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        RewriteRuleSubtreeStream stream_tokensSpec=new RewriteRuleSubtreeStream(adaptor,"rule tokensSpec");
        RewriteRuleSubtreeStream stream_attrScope=new RewriteRuleSubtreeStream(adaptor,"rule attrScope");
        RewriteRuleSubtreeStream stream_rule=new RewriteRuleSubtreeStream(adaptor,"rule rule");
        RewriteRuleSubtreeStream stream_action=new RewriteRuleSubtreeStream(adaptor,"rule action");
        RewriteRuleSubtreeStream stream_optionsSpec=new RewriteRuleSubtreeStream(adaptor,"rule optionsSpec");
        try {
            // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:95:5: ( ( DOC_COMMENT )? ( 'lexer' | 'parser' | 'tree' | ) g= 'grammar' id ';' ( optionsSpec )? ( tokensSpec )? ( attrScope )* ( action )* ( rule )+ EOF -> ^( id ( DOC_COMMENT )? ( optionsSpec )? ( tokensSpec )? ( attrScope )* ( action )* ( rule )+ ) )
            // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:95:9: ( DOC_COMMENT )? ( 'lexer' | 'parser' | 'tree' | ) g= 'grammar' id ';' ( optionsSpec )? ( tokensSpec )? ( attrScope )* ( action )* ( rule )+ EOF
            {
            // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:95:9: ( DOC_COMMENT )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==DOC_COMMENT) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:95:9: DOC_COMMENT
                    {
                    DOC_COMMENT1=(Token)match(input,DOC_COMMENT,FOLLOW_DOC_COMMENT_in_grammarDef346);  
                    stream_DOC_COMMENT.add(DOC_COMMENT1);


                    }
                    break;

            }

            // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:96:6: ( 'lexer' | 'parser' | 'tree' | )
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
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:96:8: 'lexer'
                    {
                    string_literal2=(Token)match(input,65,FOLLOW_65_in_grammarDef356);  
                    stream_65.add(string_literal2);

                    gtype=LEXER_GRAMMAR;

                    }
                    break;
                case 2 :
                    // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:97:10: 'parser'
                    {
                    string_literal3=(Token)match(input,66,FOLLOW_66_in_grammarDef374);  
                    stream_66.add(string_literal3);

                    gtype=PARSER_GRAMMAR;

                    }
                    break;
                case 3 :
                    // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:98:10: 'tree'
                    {
                    string_literal4=(Token)match(input,67,FOLLOW_67_in_grammarDef390);  
                    stream_67.add(string_literal4);

                    gtype=TREE_GRAMMAR;

                    }
                    break;
                case 4 :
                    // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:99:14: 
                    {
                    gtype=COMBINED_GRAMMAR;

                    }
                    break;

            }

            g=(Token)match(input,68,FOLLOW_68_in_grammarDef431);  
            stream_68.add(g);

            pushFollow(FOLLOW_id_in_grammarDef433);
            id5=id();

            state._fsp--;

            stream_id.add(id5.getTree());
            char_literal6=(Token)match(input,69,FOLLOW_69_in_grammarDef435);  
            stream_69.add(char_literal6);

            // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:101:25: ( optionsSpec )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==OPTIONS) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:101:25: optionsSpec
                    {
                    pushFollow(FOLLOW_optionsSpec_in_grammarDef437);
                    optionsSpec7=optionsSpec();

                    state._fsp--;

                    stream_optionsSpec.add(optionsSpec7.getTree());

                    }
                    break;

            }

            // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:101:38: ( tokensSpec )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==TOKENS) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:101:38: tokensSpec
                    {
                    pushFollow(FOLLOW_tokensSpec_in_grammarDef440);
                    tokensSpec8=tokensSpec();

                    state._fsp--;

                    stream_tokensSpec.add(tokensSpec8.getTree());

                    }
                    break;

            }

            // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:101:50: ( attrScope )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==SCOPE) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:101:50: attrScope
            	    {
            	    pushFollow(FOLLOW_attrScope_in_grammarDef443);
            	    attrScope9=attrScope();

            	    state._fsp--;

            	    stream_attrScope.add(attrScope9.getTree());

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:101:61: ( action )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==72) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:101:61: action
            	    {
            	    pushFollow(FOLLOW_action_in_grammarDef446);
            	    action10=action();

            	    state._fsp--;

            	    stream_action.add(action10.getTree());

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:102:6: ( rule )+
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
            	    // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:102:6: rule
            	    {
            	    pushFollow(FOLLOW_rule_in_grammarDef454);
            	    rule11=rule();

            	    state._fsp--;

            	    stream_rule.add(rule11.getTree());

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

            EOF12=(Token)match(input,EOF,FOLLOW_EOF_in_grammarDef462);  
            stream_EOF.add(EOF12);



            // AST REWRITE
            // elements: id, DOC_COMMENT, attrScope, action, optionsSpec, rule, tokensSpec
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 104:6: -> ^( id ( DOC_COMMENT )? ( optionsSpec )? ( tokensSpec )? ( attrScope )* ( action )* ( rule )+ )
            {
                // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:104:9: ^( id ( DOC_COMMENT )? ( optionsSpec )? ( tokensSpec )? ( attrScope )* ( action )* ( rule )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(adaptor.create(gtype,g), root_1);

                adaptor.addChild(root_1, stream_id.nextTree());
                // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:105:12: ( DOC_COMMENT )?
                if ( stream_DOC_COMMENT.hasNext() ) {
                    adaptor.addChild(root_1, stream_DOC_COMMENT.nextNode());

                }
                stream_DOC_COMMENT.reset();
                // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:105:25: ( optionsSpec )?
                if ( stream_optionsSpec.hasNext() ) {
                    adaptor.addChild(root_1, stream_optionsSpec.nextTree());

                }
                stream_optionsSpec.reset();
                // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:105:38: ( tokensSpec )?
                if ( stream_tokensSpec.hasNext() ) {
                    adaptor.addChild(root_1, stream_tokensSpec.nextTree());

                }
                stream_tokensSpec.reset();
                // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:105:50: ( attrScope )*
                while ( stream_attrScope.hasNext() ) {
                    adaptor.addChild(root_1, stream_attrScope.nextTree());

                }
                stream_attrScope.reset();
                // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:105:61: ( action )*
                while ( stream_action.hasNext() ) {
                    adaptor.addChild(root_1, stream_action.nextTree());

                }
                stream_action.reset();
                if ( !(stream_rule.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_rule.hasNext() ) {
                    adaptor.addChild(root_1, stream_rule.nextTree());

                }
                stream_rule.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "grammarDef"

    public static class tokensSpec_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "tokensSpec"
    // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:109:1: tokensSpec : TOKENS ( tokenSpec )+ '}' -> ^( TOKENS ( tokenSpec )+ ) ;
    public final ANTLRv3Parser.tokensSpec_return tokensSpec() throws RecognitionException {
        ANTLRv3Parser.tokensSpec_return retval = new ANTLRv3Parser.tokensSpec_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token TOKENS13=null;
        Token char_literal15=null;
        ANTLRv3Parser.tokenSpec_return tokenSpec14 = null;


        CommonTree TOKENS13_tree=null;
        CommonTree char_literal15_tree=null;
        RewriteRuleTokenStream stream_TOKENS=new RewriteRuleTokenStream(adaptor,"token TOKENS");
        RewriteRuleTokenStream stream_70=new RewriteRuleTokenStream(adaptor,"token 70");
        RewriteRuleSubtreeStream stream_tokenSpec=new RewriteRuleSubtreeStream(adaptor,"rule tokenSpec");
        try {
            // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:110:2: ( TOKENS ( tokenSpec )+ '}' -> ^( TOKENS ( tokenSpec )+ ) )
            // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:110:4: TOKENS ( tokenSpec )+ '}'
            {
            TOKENS13=(Token)match(input,TOKENS,FOLLOW_TOKENS_in_tokensSpec523);  
            stream_TOKENS.add(TOKENS13);

            // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:110:11: ( tokenSpec )+
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
            	    // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:110:11: tokenSpec
            	    {
            	    pushFollow(FOLLOW_tokenSpec_in_tokensSpec525);
            	    tokenSpec14=tokenSpec();

            	    state._fsp--;

            	    stream_tokenSpec.add(tokenSpec14.getTree());

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

            char_literal15=(Token)match(input,70,FOLLOW_70_in_tokensSpec528);  
            stream_70.add(char_literal15);



            // AST REWRITE
            // elements: tokenSpec, TOKENS
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 110:26: -> ^( TOKENS ( tokenSpec )+ )
            {
                // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:110:29: ^( TOKENS ( tokenSpec )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_TOKENS.nextNode(), root_1);

                if ( !(stream_tokenSpec.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_tokenSpec.hasNext() ) {
                    adaptor.addChild(root_1, stream_tokenSpec.nextTree());

                }
                stream_tokenSpec.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "tokensSpec"

    public static class tokenSpec_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "tokenSpec"
    // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:113:1: tokenSpec : TOKEN_REF ( '=' (lit= STRING_LITERAL | lit= CHAR_LITERAL ) -> ^( '=' TOKEN_REF $lit) | -> TOKEN_REF ) ';' ;
    public final ANTLRv3Parser.tokenSpec_return tokenSpec() throws RecognitionException {
        ANTLRv3Parser.tokenSpec_return retval = new ANTLRv3Parser.tokenSpec_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token lit=null;
        Token TOKEN_REF16=null;
        Token char_literal17=null;
        Token char_literal18=null;

        CommonTree lit_tree=null;
        CommonTree TOKEN_REF16_tree=null;
        CommonTree char_literal17_tree=null;
        CommonTree char_literal18_tree=null;
        RewriteRuleTokenStream stream_69=new RewriteRuleTokenStream(adaptor,"token 69");
        RewriteRuleTokenStream stream_STRING_LITERAL=new RewriteRuleTokenStream(adaptor,"token STRING_LITERAL");
        RewriteRuleTokenStream stream_CHAR_LITERAL=new RewriteRuleTokenStream(adaptor,"token CHAR_LITERAL");
        RewriteRuleTokenStream stream_71=new RewriteRuleTokenStream(adaptor,"token 71");
        RewriteRuleTokenStream stream_TOKEN_REF=new RewriteRuleTokenStream(adaptor,"token TOKEN_REF");

        try {
            // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:114:2: ( TOKEN_REF ( '=' (lit= STRING_LITERAL | lit= CHAR_LITERAL ) -> ^( '=' TOKEN_REF $lit) | -> TOKEN_REF ) ';' )
            // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:114:4: TOKEN_REF ( '=' (lit= STRING_LITERAL | lit= CHAR_LITERAL ) -> ^( '=' TOKEN_REF $lit) | -> TOKEN_REF ) ';'
            {
            TOKEN_REF16=(Token)match(input,TOKEN_REF,FOLLOW_TOKEN_REF_in_tokenSpec548);  
            stream_TOKEN_REF.add(TOKEN_REF16);

            // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:115:3: ( '=' (lit= STRING_LITERAL | lit= CHAR_LITERAL ) -> ^( '=' TOKEN_REF $lit) | -> TOKEN_REF )
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
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:115:5: '=' (lit= STRING_LITERAL | lit= CHAR_LITERAL )
                    {
                    char_literal17=(Token)match(input,71,FOLLOW_71_in_tokenSpec554);  
                    stream_71.add(char_literal17);

                    // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:115:9: (lit= STRING_LITERAL | lit= CHAR_LITERAL )
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
                            new NoViableAltException("", 9, 0, input);

                        throw nvae;
                    }
                    switch (alt9) {
                        case 1 :
                            // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:115:10: lit= STRING_LITERAL
                            {
                            lit=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_tokenSpec559);  
                            stream_STRING_LITERAL.add(lit);


                            }
                            break;
                        case 2 :
                            // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:115:29: lit= CHAR_LITERAL
                            {
                            lit=(Token)match(input,CHAR_LITERAL,FOLLOW_CHAR_LITERAL_in_tokenSpec563);  
                            stream_CHAR_LITERAL.add(lit);


                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: 71, lit, TOKEN_REF
                    // token labels: lit
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_lit=new RewriteRuleTokenStream(adaptor,"token lit",lit);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 115:47: -> ^( '=' TOKEN_REF $lit)
                    {
                        // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:115:50: ^( '=' TOKEN_REF $lit)
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_71.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_TOKEN_REF.nextNode());
                        adaptor.addChild(root_1, stream_lit.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:116:16: 
                    {

                    // AST REWRITE
                    // elements: TOKEN_REF
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 116:16: -> TOKEN_REF
                    {
                        adaptor.addChild(root_0, stream_TOKEN_REF.nextNode());

                    }

                    retval.tree = root_0;
                    }
                    break;

            }

            char_literal18=(Token)match(input,69,FOLLOW_69_in_tokenSpec602);  
            stream_69.add(char_literal18);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "tokenSpec"

    public static class attrScope_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "attrScope"
    // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:121:1: attrScope : 'scope' id ACTION -> ^( 'scope' id ACTION ) ;
    public final ANTLRv3Parser.attrScope_return attrScope() throws RecognitionException {
        ANTLRv3Parser.attrScope_return retval = new ANTLRv3Parser.attrScope_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal19=null;
        Token ACTION21=null;
        ANTLRv3Parser.id_return id20 = null;


        CommonTree string_literal19_tree=null;
        CommonTree ACTION21_tree=null;
        RewriteRuleTokenStream stream_SCOPE=new RewriteRuleTokenStream(adaptor,"token SCOPE");
        RewriteRuleTokenStream stream_ACTION=new RewriteRuleTokenStream(adaptor,"token ACTION");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        try {
            // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:122:2: ( 'scope' id ACTION -> ^( 'scope' id ACTION ) )
            // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:122:4: 'scope' id ACTION
            {
            string_literal19=(Token)match(input,SCOPE,FOLLOW_SCOPE_in_attrScope613);  
            stream_SCOPE.add(string_literal19);

            pushFollow(FOLLOW_id_in_attrScope615);
            id20=id();

            state._fsp--;

            stream_id.add(id20.getTree());
            ACTION21=(Token)match(input,ACTION,FOLLOW_ACTION_in_attrScope617);  
            stream_ACTION.add(ACTION21);



            // AST REWRITE
            // elements: ACTION, SCOPE, id
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 122:22: -> ^( 'scope' id ACTION )
            {
                // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:122:25: ^( 'scope' id ACTION )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_SCOPE.nextNode(), root_1);

                adaptor.addChild(root_1, stream_id.nextTree());
                adaptor.addChild(root_1, stream_ACTION.nextNode());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "attrScope"

    public static class action_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "action"
    // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:125:1: action : '@' ( actionScopeName '::' )? id ACTION -> ^( '@' ( actionScopeName )? id ACTION ) ;
    public final ANTLRv3Parser.action_return action() throws RecognitionException {
        ANTLRv3Parser.action_return retval = new ANTLRv3Parser.action_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal22=null;
        Token string_literal24=null;
        Token ACTION26=null;
        ANTLRv3Parser.actionScopeName_return actionScopeName23 = null;

        ANTLRv3Parser.id_return id25 = null;


        CommonTree char_literal22_tree=null;
        CommonTree string_literal24_tree=null;
        CommonTree ACTION26_tree=null;
        RewriteRuleTokenStream stream_72=new RewriteRuleTokenStream(adaptor,"token 72");
        RewriteRuleTokenStream stream_ACTION=new RewriteRuleTokenStream(adaptor,"token ACTION");
        RewriteRuleTokenStream stream_73=new RewriteRuleTokenStream(adaptor,"token 73");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        RewriteRuleSubtreeStream stream_actionScopeName=new RewriteRuleSubtreeStream(adaptor,"rule actionScopeName");
        try {
            // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:127:2: ( '@' ( actionScopeName '::' )? id ACTION -> ^( '@' ( actionScopeName )? id ACTION ) )
            // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:127:4: '@' ( actionScopeName '::' )? id ACTION
            {
            char_literal22=(Token)match(input,72,FOLLOW_72_in_action640);  
            stream_72.add(char_literal22);

            // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:127:8: ( actionScopeName '::' )?
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
                    // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:127:9: actionScopeName '::'
                    {
                    pushFollow(FOLLOW_actionScopeName_in_action643);
                    actionScopeName23=actionScopeName();

                    state._fsp--;

                    stream_actionScopeName.add(actionScopeName23.getTree());
                    string_literal24=(Token)match(input,73,FOLLOW_73_in_action645);  
                    stream_73.add(string_literal24);


                    }
                    break;

            }

            pushFollow(FOLLOW_id_in_action649);
            id25=id();

            state._fsp--;

            stream_id.add(id25.getTree());
            ACTION26=(Token)match(input,ACTION,FOLLOW_ACTION_in_action651);  
            stream_ACTION.add(ACTION26);



            // AST REWRITE
            // elements: actionScopeName, id, 72, ACTION
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 127:42: -> ^( '@' ( actionScopeName )? id ACTION )
            {
                // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:127:45: ^( '@' ( actionScopeName )? id ACTION )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_72.nextNode(), root_1);

                // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:127:51: ( actionScopeName )?
                if ( stream_actionScopeName.hasNext() ) {
                    adaptor.addChild(root_1, stream_actionScopeName.nextTree());

                }
                stream_actionScopeName.reset();
                adaptor.addChild(root_1, stream_id.nextTree());
                adaptor.addChild(root_1, stream_ACTION.nextNode());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "action"

    public static class actionScopeName_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "actionScopeName"
    // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:130:1: actionScopeName : ( id | l= 'lexer' -> ID[$l] | p= 'parser' -> ID[$p] );
    public final ANTLRv3Parser.actionScopeName_return actionScopeName() throws RecognitionException {
        ANTLRv3Parser.actionScopeName_return retval = new ANTLRv3Parser.actionScopeName_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token l=null;
        Token p=null;
        ANTLRv3Parser.id_return id27 = null;


        CommonTree l_tree=null;
        CommonTree p_tree=null;
        RewriteRuleTokenStream stream_66=new RewriteRuleTokenStream(adaptor,"token 66");
        RewriteRuleTokenStream stream_65=new RewriteRuleTokenStream(adaptor,"token 65");

        try {
            // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:134:2: ( id | l= 'lexer' -> ID[$l] | p= 'parser' -> ID[$p] )
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
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:134:4: id
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_id_in_actionScopeName677);
                    id27=id();

                    state._fsp--;

                    adaptor.addChild(root_0, id27.getTree());

                    }
                    break;
                case 2 :
                    // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:135:4: l= 'lexer'
                    {
                    l=(Token)match(input,65,FOLLOW_65_in_actionScopeName684);  
                    stream_65.add(l);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 135:14: -> ID[$l]
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(ID, l));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:136:9: p= 'parser'
                    {
                    p=(Token)match(input,66,FOLLOW_66_in_actionScopeName701);  
                    stream_66.add(p);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 136:20: -> ID[$p]
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(ID, p));

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "actionScopeName"

    public static class optionsSpec_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "optionsSpec"
    // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:139:1: optionsSpec : OPTIONS ( option ';' )+ '}' -> ^( OPTIONS ( option )+ ) ;
    public final ANTLRv3Parser.optionsSpec_return optionsSpec() throws RecognitionException {
        ANTLRv3Parser.optionsSpec_return retval = new ANTLRv3Parser.optionsSpec_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token OPTIONS28=null;
        Token char_literal30=null;
        Token char_literal31=null;
        ANTLRv3Parser.option_return option29 = null;


        CommonTree OPTIONS28_tree=null;
        CommonTree char_literal30_tree=null;
        CommonTree char_literal31_tree=null;
        RewriteRuleTokenStream stream_69=new RewriteRuleTokenStream(adaptor,"token 69");
        RewriteRuleTokenStream stream_70=new RewriteRuleTokenStream(adaptor,"token 70");
        RewriteRuleTokenStream stream_OPTIONS=new RewriteRuleTokenStream(adaptor,"token OPTIONS");
        RewriteRuleSubtreeStream stream_option=new RewriteRuleSubtreeStream(adaptor,"rule option");
        try {
            // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:140:2: ( OPTIONS ( option ';' )+ '}' -> ^( OPTIONS ( option )+ ) )
            // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:140:4: OPTIONS ( option ';' )+ '}'
            {
            OPTIONS28=(Token)match(input,OPTIONS,FOLLOW_OPTIONS_in_optionsSpec717);  
            stream_OPTIONS.add(OPTIONS28);

            // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:140:12: ( option ';' )+
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
            	    // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:140:13: option ';'
            	    {
            	    pushFollow(FOLLOW_option_in_optionsSpec720);
            	    option29=option();

            	    state._fsp--;

            	    stream_option.add(option29.getTree());
            	    char_literal30=(Token)match(input,69,FOLLOW_69_in_optionsSpec722);  
            	    stream_69.add(char_literal30);


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

            char_literal31=(Token)match(input,70,FOLLOW_70_in_optionsSpec726);  
            stream_70.add(char_literal31);



            // AST REWRITE
            // elements: OPTIONS, option
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 140:30: -> ^( OPTIONS ( option )+ )
            {
                // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:140:33: ^( OPTIONS ( option )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_OPTIONS.nextNode(), root_1);

                if ( !(stream_option.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_option.hasNext() ) {
                    adaptor.addChild(root_1, stream_option.nextTree());

                }
                stream_option.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "optionsSpec"

    public static class option_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "option"
    // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:143:1: option : id '=' optionValue -> ^( '=' id optionValue ) ;
    public final ANTLRv3Parser.option_return option() throws RecognitionException {
        ANTLRv3Parser.option_return retval = new ANTLRv3Parser.option_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal33=null;
        ANTLRv3Parser.id_return id32 = null;

        ANTLRv3Parser.optionValue_return optionValue34 = null;


        CommonTree char_literal33_tree=null;
        RewriteRuleTokenStream stream_71=new RewriteRuleTokenStream(adaptor,"token 71");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        RewriteRuleSubtreeStream stream_optionValue=new RewriteRuleSubtreeStream(adaptor,"rule optionValue");
        try {
            // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:144:5: ( id '=' optionValue -> ^( '=' id optionValue ) )
            // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:144:9: id '=' optionValue
            {
            pushFollow(FOLLOW_id_in_option751);
            id32=id();

            state._fsp--;

            stream_id.add(id32.getTree());
            char_literal33=(Token)match(input,71,FOLLOW_71_in_option753);  
            stream_71.add(char_literal33);

            pushFollow(FOLLOW_optionValue_in_option755);
            optionValue34=optionValue();

            state._fsp--;

            stream_optionValue.add(optionValue34.getTree());


            // AST REWRITE
            // elements: id, 71, optionValue
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 144:28: -> ^( '=' id optionValue )
            {
                // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:144:31: ^( '=' id optionValue )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_71.nextNode(), root_1);

                adaptor.addChild(root_1, stream_id.nextTree());
                adaptor.addChild(root_1, stream_optionValue.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "option"

    public static class optionValue_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "optionValue"
    // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:147:1: optionValue : ( id | STRING_LITERAL | CHAR_LITERAL | INT | s= '*' -> STRING_LITERAL[$s] );
    public final ANTLRv3Parser.optionValue_return optionValue() throws RecognitionException {
        ANTLRv3Parser.optionValue_return retval = new ANTLRv3Parser.optionValue_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token s=null;
        Token STRING_LITERAL36=null;
        Token CHAR_LITERAL37=null;
        Token INT38=null;
        ANTLRv3Parser.id_return id35 = null;


        CommonTree s_tree=null;
        CommonTree STRING_LITERAL36_tree=null;
        CommonTree CHAR_LITERAL37_tree=null;
        CommonTree INT38_tree=null;
        RewriteRuleTokenStream stream_74=new RewriteRuleTokenStream(adaptor,"token 74");

        try {
            // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:148:5: ( id | STRING_LITERAL | CHAR_LITERAL | INT | s= '*' -> STRING_LITERAL[$s] )
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
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:148:9: id
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_id_in_optionValue784);
                    id35=id();

                    state._fsp--;

                    adaptor.addChild(root_0, id35.getTree());

                    }
                    break;
                case 2 :
                    // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:149:9: STRING_LITERAL
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    STRING_LITERAL36=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_optionValue794); 
                    STRING_LITERAL36_tree = (CommonTree)adaptor.create(STRING_LITERAL36);
                    adaptor.addChild(root_0, STRING_LITERAL36_tree);


                    }
                    break;
                case 3 :
                    // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:150:9: CHAR_LITERAL
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    CHAR_LITERAL37=(Token)match(input,CHAR_LITERAL,FOLLOW_CHAR_LITERAL_in_optionValue804); 
                    CHAR_LITERAL37_tree = (CommonTree)adaptor.create(CHAR_LITERAL37);
                    adaptor.addChild(root_0, CHAR_LITERAL37_tree);


                    }
                    break;
                case 4 :
                    // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:151:9: INT
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    INT38=(Token)match(input,INT,FOLLOW_INT_in_optionValue814); 
                    INT38_tree = (CommonTree)adaptor.create(INT38);
                    adaptor.addChild(root_0, INT38_tree);


                    }
                    break;
                case 5 :
                    // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:152:7: s= '*'
                    {
                    s=(Token)match(input,74,FOLLOW_74_in_optionValue824);  
                    stream_74.add(s);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 152:13: -> STRING_LITERAL[$s]
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(STRING_LITERAL, s));

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "optionValue"

    protected static class rule_scope {
        String name;
    }
    protected Stack rule_stack = new Stack();

    public static class rule_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "rule"
    // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:155:1: rule : ( DOC_COMMENT )? (modifier= ( 'protected' | 'public' | 'private' | 'fragment' ) )? id ( '!' )? (arg= ARG_ACTION )? ( 'returns' rt= ARG_ACTION )? ( throwsSpec )? ( optionsSpec )? ( ruleScopeSpec )? ( ruleAction )* ':' altList ';' ( exceptionGroup )? -> ^( RULE id ( ^( ARG $arg) )? ( ^( RET $rt) )? ( optionsSpec )? ( ruleScopeSpec )? ( ruleAction )* altList ( exceptionGroup )? EOR[\"EOR\"] ) ;
    public final ANTLRv3Parser.rule_return rule() throws RecognitionException {
        rule_stack.push(new rule_scope());
        ANTLRv3Parser.rule_return retval = new ANTLRv3Parser.rule_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token modifier=null;
        Token arg=null;
        Token rt=null;
        Token DOC_COMMENT39=null;
        Token string_literal40=null;
        Token string_literal41=null;
        Token string_literal42=null;
        Token string_literal43=null;
        Token char_literal45=null;
        Token string_literal46=null;
        Token char_literal51=null;
        Token char_literal53=null;
        ANTLRv3Parser.id_return id44 = null;

        ANTLRv3Parser.throwsSpec_return throwsSpec47 = null;

        ANTLRv3Parser.optionsSpec_return optionsSpec48 = null;

        ANTLRv3Parser.ruleScopeSpec_return ruleScopeSpec49 = null;

        ANTLRv3Parser.ruleAction_return ruleAction50 = null;

        ANTLRv3Parser.altList_return altList52 = null;

        ANTLRv3Parser.exceptionGroup_return exceptionGroup54 = null;


        CommonTree modifier_tree=null;
        CommonTree arg_tree=null;
        CommonTree rt_tree=null;
        CommonTree DOC_COMMENT39_tree=null;
        CommonTree string_literal40_tree=null;
        CommonTree string_literal41_tree=null;
        CommonTree string_literal42_tree=null;
        CommonTree string_literal43_tree=null;
        CommonTree char_literal45_tree=null;
        CommonTree string_literal46_tree=null;
        CommonTree char_literal51_tree=null;
        CommonTree char_literal53_tree=null;
        RewriteRuleTokenStream stream_DOC_COMMENT=new RewriteRuleTokenStream(adaptor,"token DOC_COMMENT");
        RewriteRuleTokenStream stream_79=new RewriteRuleTokenStream(adaptor,"token 79");
        RewriteRuleTokenStream stream_78=new RewriteRuleTokenStream(adaptor,"token 78");
        RewriteRuleTokenStream stream_69=new RewriteRuleTokenStream(adaptor,"token 69");
        RewriteRuleTokenStream stream_77=new RewriteRuleTokenStream(adaptor,"token 77");
        RewriteRuleTokenStream stream_BANG=new RewriteRuleTokenStream(adaptor,"token BANG");
        RewriteRuleTokenStream stream_FRAGMENT=new RewriteRuleTokenStream(adaptor,"token FRAGMENT");
        RewriteRuleTokenStream stream_75=new RewriteRuleTokenStream(adaptor,"token 75");
        RewriteRuleTokenStream stream_ARG_ACTION=new RewriteRuleTokenStream(adaptor,"token ARG_ACTION");
        RewriteRuleTokenStream stream_76=new RewriteRuleTokenStream(adaptor,"token 76");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        RewriteRuleSubtreeStream stream_exceptionGroup=new RewriteRuleSubtreeStream(adaptor,"rule exceptionGroup");
        RewriteRuleSubtreeStream stream_throwsSpec=new RewriteRuleSubtreeStream(adaptor,"rule throwsSpec");
        RewriteRuleSubtreeStream stream_ruleScopeSpec=new RewriteRuleSubtreeStream(adaptor,"rule ruleScopeSpec");
        RewriteRuleSubtreeStream stream_optionsSpec=new RewriteRuleSubtreeStream(adaptor,"rule optionsSpec");
        RewriteRuleSubtreeStream stream_altList=new RewriteRuleSubtreeStream(adaptor,"rule altList");
        RewriteRuleSubtreeStream stream_ruleAction=new RewriteRuleSubtreeStream(adaptor,"rule ruleAction");
        try {
            // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:159:2: ( ( DOC_COMMENT )? (modifier= ( 'protected' | 'public' | 'private' | 'fragment' ) )? id ( '!' )? (arg= ARG_ACTION )? ( 'returns' rt= ARG_ACTION )? ( throwsSpec )? ( optionsSpec )? ( ruleScopeSpec )? ( ruleAction )* ':' altList ';' ( exceptionGroup )? -> ^( RULE id ( ^( ARG $arg) )? ( ^( RET $rt) )? ( optionsSpec )? ( ruleScopeSpec )? ( ruleAction )* altList ( exceptionGroup )? EOR[\"EOR\"] ) )
            // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:159:4: ( DOC_COMMENT )? (modifier= ( 'protected' | 'public' | 'private' | 'fragment' ) )? id ( '!' )? (arg= ARG_ACTION )? ( 'returns' rt= ARG_ACTION )? ( throwsSpec )? ( optionsSpec )? ( ruleScopeSpec )? ( ruleAction )* ':' altList ';' ( exceptionGroup )?
            {
            // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:159:4: ( DOC_COMMENT )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==DOC_COMMENT) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:159:4: DOC_COMMENT
                    {
                    DOC_COMMENT39=(Token)match(input,DOC_COMMENT,FOLLOW_DOC_COMMENT_in_rule849);  
                    stream_DOC_COMMENT.add(DOC_COMMENT39);


                    }
                    break;

            }

            // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:160:3: (modifier= ( 'protected' | 'public' | 'private' | 'fragment' ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==FRAGMENT||(LA17_0>=75 && LA17_0<=77)) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:160:5: modifier= ( 'protected' | 'public' | 'private' | 'fragment' )
                    {
                    // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:160:14: ( 'protected' | 'public' | 'private' | 'fragment' )
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
                            new NoViableAltException("", 16, 0, input);

                        throw nvae;
                    }

                    switch (alt16) {
                        case 1 :
                            // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:160:15: 'protected'
                            {
                            string_literal40=(Token)match(input,75,FOLLOW_75_in_rule859);  
                            stream_75.add(string_literal40);


                            }
                            break;
                        case 2 :
                            // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:160:27: 'public'
                            {
                            string_literal41=(Token)match(input,76,FOLLOW_76_in_rule861);  
                            stream_76.add(string_literal41);


                            }
                            break;
                        case 3 :
                            // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:160:36: 'private'
                            {
                            string_literal42=(Token)match(input,77,FOLLOW_77_in_rule863);  
                            stream_77.add(string_literal42);


                            }
                            break;
                        case 4 :
                            // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:160:46: 'fragment'
                            {
                            string_literal43=(Token)match(input,FRAGMENT,FOLLOW_FRAGMENT_in_rule865);  
                            stream_FRAGMENT.add(string_literal43);


                            }
                            break;

                    }


                    }
                    break;

            }

            pushFollow(FOLLOW_id_in_rule873);
            id44=id();

            state._fsp--;

            stream_id.add(id44.getTree());
            ((rule_scope)rule_stack.peek()).name = (id44!=null?input.toString(id44.start,id44.stop):null);
            // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:162:3: ( '!' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==BANG) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:162:3: '!'
                    {
                    char_literal45=(Token)match(input,BANG,FOLLOW_BANG_in_rule879);  
                    stream_BANG.add(char_literal45);


                    }
                    break;

            }

            // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:163:3: (arg= ARG_ACTION )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==ARG_ACTION) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:163:5: arg= ARG_ACTION
                    {
                    arg=(Token)match(input,ARG_ACTION,FOLLOW_ARG_ACTION_in_rule888);  
                    stream_ARG_ACTION.add(arg);


                    }
                    break;

            }

            // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:164:3: ( 'returns' rt= ARG_ACTION )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==78) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:164:5: 'returns' rt= ARG_ACTION
                    {
                    string_literal46=(Token)match(input,78,FOLLOW_78_in_rule897);  
                    stream_78.add(string_literal46);

                    rt=(Token)match(input,ARG_ACTION,FOLLOW_ARG_ACTION_in_rule901);  
                    stream_ARG_ACTION.add(rt);


                    }
                    break;

            }

            // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:165:3: ( throwsSpec )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==80) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:165:3: throwsSpec
                    {
                    pushFollow(FOLLOW_throwsSpec_in_rule909);
                    throwsSpec47=throwsSpec();

                    state._fsp--;

                    stream_throwsSpec.add(throwsSpec47.getTree());

                    }
                    break;

            }

            // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:165:15: ( optionsSpec )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==OPTIONS) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:165:15: optionsSpec
                    {
                    pushFollow(FOLLOW_optionsSpec_in_rule912);
                    optionsSpec48=optionsSpec();

                    state._fsp--;

                    stream_optionsSpec.add(optionsSpec48.getTree());

                    }
                    break;

            }

            // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:165:28: ( ruleScopeSpec )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==SCOPE) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:165:28: ruleScopeSpec
                    {
                    pushFollow(FOLLOW_ruleScopeSpec_in_rule915);
                    ruleScopeSpec49=ruleScopeSpec();

                    state._fsp--;

                    stream_ruleScopeSpec.add(ruleScopeSpec49.getTree());

                    }
                    break;

            }

            // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:165:43: ( ruleAction )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==72) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:165:43: ruleAction
            	    {
            	    pushFollow(FOLLOW_ruleAction_in_rule918);
            	    ruleAction50=ruleAction();

            	    state._fsp--;

            	    stream_ruleAction.add(ruleAction50.getTree());

            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            char_literal51=(Token)match(input,79,FOLLOW_79_in_rule923);  
            stream_79.add(char_literal51);

            pushFollow(FOLLOW_altList_in_rule925);
            altList52=altList();

            state._fsp--;

            stream_altList.add(altList52.getTree());
            char_literal53=(Token)match(input,69,FOLLOW_69_in_rule927);  
            stream_69.add(char_literal53);

            // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:167:3: ( exceptionGroup )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( ((LA25_0>=85 && LA25_0<=86)) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:167:3: exceptionGroup
                    {
                    pushFollow(FOLLOW_exceptionGroup_in_rule931);
                    exceptionGroup54=exceptionGroup();

                    state._fsp--;

                    stream_exceptionGroup.add(exceptionGroup54.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: ruleScopeSpec, optionsSpec, arg, altList, exceptionGroup, ruleAction, rt, id
            // token labels: arg, rt
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleTokenStream stream_arg=new RewriteRuleTokenStream(adaptor,"token arg",arg);
            RewriteRuleTokenStream stream_rt=new RewriteRuleTokenStream(adaptor,"token rt",rt);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 168:6: -> ^( RULE id ( ^( ARG $arg) )? ( ^( RET $rt) )? ( optionsSpec )? ( ruleScopeSpec )? ( ruleAction )* altList ( exceptionGroup )? EOR[\"EOR\"] )
            {
                // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:168:9: ^( RULE id ( ^( ARG $arg) )? ( ^( RET $rt) )? ( optionsSpec )? ( ruleScopeSpec )? ( ruleAction )* altList ( exceptionGroup )? EOR[\"EOR\"] )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(RULE, "RULE"), root_1);

                adaptor.addChild(root_1, stream_id.nextTree());
                adaptor.addChild(root_1, modifier!=null?adaptor.create(modifier):null);
                // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:168:67: ( ^( ARG $arg) )?
                if ( stream_arg.hasNext() ) {
                    // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:168:67: ^( ARG $arg)
                    {
                    CommonTree root_2 = (CommonTree)adaptor.nil();
                    root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ARG, "ARG"), root_2);

                    adaptor.addChild(root_2, stream_arg.nextNode());

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_arg.reset();
                // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:168:80: ( ^( RET $rt) )?
                if ( stream_rt.hasNext() ) {
                    // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:168:80: ^( RET $rt)
                    {
                    CommonTree root_2 = (CommonTree)adaptor.nil();
                    root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(RET, "RET"), root_2);

                    adaptor.addChild(root_2, stream_rt.nextNode());

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_rt.reset();
                // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:169:9: ( optionsSpec )?
                if ( stream_optionsSpec.hasNext() ) {
                    adaptor.addChild(root_1, stream_optionsSpec.nextTree());

                }
                stream_optionsSpec.reset();
                // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:169:22: ( ruleScopeSpec )?
                if ( stream_ruleScopeSpec.hasNext() ) {
                    adaptor.addChild(root_1, stream_ruleScopeSpec.nextTree());

                }
                stream_ruleScopeSpec.reset();
                // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:169:37: ( ruleAction )*
                while ( stream_ruleAction.hasNext() ) {
                    adaptor.addChild(root_1, stream_ruleAction.nextTree());

                }
                stream_ruleAction.reset();
                adaptor.addChild(root_1, stream_altList.nextTree());
                // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:171:9: ( exceptionGroup )?
                if ( stream_exceptionGroup.hasNext() ) {
                    adaptor.addChild(root_1, stream_exceptionGroup.nextTree());

                }
                stream_exceptionGroup.reset();
                adaptor.addChild(root_1, (CommonTree)adaptor.create(EOR, "EOR"));

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            rule_stack.pop();
        }
        return retval;
    }
    // $ANTLR end "rule"

    public static class ruleAction_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ruleAction"
    // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:176:1: ruleAction : '@' id ACTION -> ^( '@' id ACTION ) ;
    public final ANTLRv3Parser.ruleAction_return ruleAction() throws RecognitionException {
        ANTLRv3Parser.ruleAction_return retval = new ANTLRv3Parser.ruleAction_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal55=null;
        Token ACTION57=null;
        ANTLRv3Parser.id_return id56 = null;


        CommonTree char_literal55_tree=null;
        CommonTree ACTION57_tree=null;
        RewriteRuleTokenStream stream_72=new RewriteRuleTokenStream(adaptor,"token 72");
        RewriteRuleTokenStream stream_ACTION=new RewriteRuleTokenStream(adaptor,"token ACTION");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        try {
            // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:178:2: ( '@' id ACTION -> ^( '@' id ACTION ) )
            // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:178:4: '@' id ACTION
            {
            char_literal55=(Token)match(input,72,FOLLOW_72_in_ruleAction1033);  
            stream_72.add(char_literal55);

            pushFollow(FOLLOW_id_in_ruleAction1035);
            id56=id();

            state._fsp--;

            stream_id.add(id56.getTree());
            ACTION57=(Token)match(input,ACTION,FOLLOW_ACTION_in_ruleAction1037);  
            stream_ACTION.add(ACTION57);



            // AST REWRITE
            // elements: id, 72, ACTION
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 178:18: -> ^( '@' id ACTION )
            {
                // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:178:21: ^( '@' id ACTION )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_72.nextNode(), root_1);

                adaptor.addChild(root_1, stream_id.nextTree());
                adaptor.addChild(root_1, stream_ACTION.nextNode());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "ruleAction"

    public static class throwsSpec_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "throwsSpec"
    // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:181:1: throwsSpec : 'throws' id ( ',' id )* -> ^( 'throws' ( id )+ ) ;
    public final ANTLRv3Parser.throwsSpec_return throwsSpec() throws RecognitionException {
        ANTLRv3Parser.throwsSpec_return retval = new ANTLRv3Parser.throwsSpec_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal58=null;
        Token char_literal60=null;
        ANTLRv3Parser.id_return id59 = null;

        ANTLRv3Parser.id_return id61 = null;


        CommonTree string_literal58_tree=null;
        CommonTree char_literal60_tree=null;
        RewriteRuleTokenStream stream_80=new RewriteRuleTokenStream(adaptor,"token 80");
        RewriteRuleTokenStream stream_81=new RewriteRuleTokenStream(adaptor,"token 81");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        try {
            // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:182:2: ( 'throws' id ( ',' id )* -> ^( 'throws' ( id )+ ) )
            // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:182:4: 'throws' id ( ',' id )*
            {
            string_literal58=(Token)match(input,80,FOLLOW_80_in_throwsSpec1058);  
            stream_80.add(string_literal58);

            pushFollow(FOLLOW_id_in_throwsSpec1060);
            id59=id();

            state._fsp--;

            stream_id.add(id59.getTree());
            // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:182:16: ( ',' id )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==81) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:182:18: ',' id
            	    {
            	    char_literal60=(Token)match(input,81,FOLLOW_81_in_throwsSpec1064);  
            	    stream_81.add(char_literal60);

            	    pushFollow(FOLLOW_id_in_throwsSpec1066);
            	    id61=id();

            	    state._fsp--;

            	    stream_id.add(id61.getTree());

            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);



            // AST REWRITE
            // elements: 80, id
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 182:28: -> ^( 'throws' ( id )+ )
            {
                // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:182:31: ^( 'throws' ( id )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_80.nextNode(), root_1);

                if ( !(stream_id.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_id.hasNext() ) {
                    adaptor.addChild(root_1, stream_id.nextTree());

                }
                stream_id.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "throwsSpec"

    public static class ruleScopeSpec_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ruleScopeSpec"
    // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:185:1: ruleScopeSpec : ( 'scope' ACTION -> ^( 'scope' ACTION ) | 'scope' id ( ',' id )* ';' -> ^( 'scope' ( id )+ ) | 'scope' ACTION 'scope' id ( ',' id )* ';' -> ^( 'scope' ACTION ( id )+ ) );
    public final ANTLRv3Parser.ruleScopeSpec_return ruleScopeSpec() throws RecognitionException {
        ANTLRv3Parser.ruleScopeSpec_return retval = new ANTLRv3Parser.ruleScopeSpec_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal62=null;
        Token ACTION63=null;
        Token string_literal64=null;
        Token char_literal66=null;
        Token char_literal68=null;
        Token string_literal69=null;
        Token ACTION70=null;
        Token string_literal71=null;
        Token char_literal73=null;
        Token char_literal75=null;
        ANTLRv3Parser.id_return id65 = null;

        ANTLRv3Parser.id_return id67 = null;

        ANTLRv3Parser.id_return id72 = null;

        ANTLRv3Parser.id_return id74 = null;


        CommonTree string_literal62_tree=null;
        CommonTree ACTION63_tree=null;
        CommonTree string_literal64_tree=null;
        CommonTree char_literal66_tree=null;
        CommonTree char_literal68_tree=null;
        CommonTree string_literal69_tree=null;
        CommonTree ACTION70_tree=null;
        CommonTree string_literal71_tree=null;
        CommonTree char_literal73_tree=null;
        CommonTree char_literal75_tree=null;
        RewriteRuleTokenStream stream_69=new RewriteRuleTokenStream(adaptor,"token 69");
        RewriteRuleTokenStream stream_SCOPE=new RewriteRuleTokenStream(adaptor,"token SCOPE");
        RewriteRuleTokenStream stream_81=new RewriteRuleTokenStream(adaptor,"token 81");
        RewriteRuleTokenStream stream_ACTION=new RewriteRuleTokenStream(adaptor,"token ACTION");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        try {
            // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:186:2: ( 'scope' ACTION -> ^( 'scope' ACTION ) | 'scope' id ( ',' id )* ';' -> ^( 'scope' ( id )+ ) | 'scope' ACTION 'scope' id ( ',' id )* ';' -> ^( 'scope' ACTION ( id )+ ) )
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
                            new NoViableAltException("", 29, 2, input);

                        throw nvae;
                    }
                }
                else if ( (LA29_1==TOKEN_REF||LA29_1==RULE_REF) ) {
                    alt29=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 29, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:186:4: 'scope' ACTION
                    {
                    string_literal62=(Token)match(input,SCOPE,FOLLOW_SCOPE_in_ruleScopeSpec1089);  
                    stream_SCOPE.add(string_literal62);

                    ACTION63=(Token)match(input,ACTION,FOLLOW_ACTION_in_ruleScopeSpec1091);  
                    stream_ACTION.add(ACTION63);



                    // AST REWRITE
                    // elements: SCOPE, ACTION
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 186:19: -> ^( 'scope' ACTION )
                    {
                        // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:186:22: ^( 'scope' ACTION )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_SCOPE.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_ACTION.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:187:4: 'scope' id ( ',' id )* ';'
                    {
                    string_literal64=(Token)match(input,SCOPE,FOLLOW_SCOPE_in_ruleScopeSpec1104);  
                    stream_SCOPE.add(string_literal64);

                    pushFollow(FOLLOW_id_in_ruleScopeSpec1106);
                    id65=id();

                    state._fsp--;

                    stream_id.add(id65.getTree());
                    // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:187:15: ( ',' id )*
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( (LA27_0==81) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:187:16: ',' id
                    	    {
                    	    char_literal66=(Token)match(input,81,FOLLOW_81_in_ruleScopeSpec1109);  
                    	    stream_81.add(char_literal66);

                    	    pushFollow(FOLLOW_id_in_ruleScopeSpec1111);
                    	    id67=id();

                    	    state._fsp--;

                    	    stream_id.add(id67.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop27;
                        }
                    } while (true);

                    char_literal68=(Token)match(input,69,FOLLOW_69_in_ruleScopeSpec1115);  
                    stream_69.add(char_literal68);



                    // AST REWRITE
                    // elements: id, SCOPE
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 187:29: -> ^( 'scope' ( id )+ )
                    {
                        // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:187:32: ^( 'scope' ( id )+ )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_SCOPE.nextNode(), root_1);

                        if ( !(stream_id.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_id.hasNext() ) {
                            adaptor.addChild(root_1, stream_id.nextTree());

                        }
                        stream_id.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:188:4: 'scope' ACTION 'scope' id ( ',' id )* ';'
                    {
                    string_literal69=(Token)match(input,SCOPE,FOLLOW_SCOPE_in_ruleScopeSpec1129);  
                    stream_SCOPE.add(string_literal69);

                    ACTION70=(Token)match(input,ACTION,FOLLOW_ACTION_in_ruleScopeSpec1131);  
                    stream_ACTION.add(ACTION70);

                    string_literal71=(Token)match(input,SCOPE,FOLLOW_SCOPE_in_ruleScopeSpec1135);  
                    stream_SCOPE.add(string_literal71);

                    pushFollow(FOLLOW_id_in_ruleScopeSpec1137);
                    id72=id();

                    state._fsp--;

                    stream_id.add(id72.getTree());
                    // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:189:14: ( ',' id )*
                    loop28:
                    do {
                        int alt28=2;
                        int LA28_0 = input.LA(1);

                        if ( (LA28_0==81) ) {
                            alt28=1;
                        }


                        switch (alt28) {
                    	case 1 :
                    	    // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:189:15: ',' id
                    	    {
                    	    char_literal73=(Token)match(input,81,FOLLOW_81_in_ruleScopeSpec1140);  
                    	    stream_81.add(char_literal73);

                    	    pushFollow(FOLLOW_id_in_ruleScopeSpec1142);
                    	    id74=id();

                    	    state._fsp--;

                    	    stream_id.add(id74.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop28;
                        }
                    } while (true);

                    char_literal75=(Token)match(input,69,FOLLOW_69_in_ruleScopeSpec1146);  
                    stream_69.add(char_literal75);



                    // AST REWRITE
                    // elements: SCOPE, id, ACTION
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 190:3: -> ^( 'scope' ACTION ( id )+ )
                    {
                        // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:190:6: ^( 'scope' ACTION ( id )+ )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_SCOPE.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_ACTION.nextNode());
                        if ( !(stream_id.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_id.hasNext() ) {
                            adaptor.addChild(root_1, stream_id.nextTree());

                        }
                        stream_id.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "ruleScopeSpec"

    public static class block_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "block"
    // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:193:1: block : lp= '(' ( (opts= optionsSpec )? ':' )? a1= alternative rewrite ( '|' a2= alternative rewrite )* rp= ')' -> ^( BLOCK[$lp,\"BLOCK\"] ( optionsSpec )? ( alternative )+ EOB[$rp,\"EOB\"] ) ;
    public final ANTLRv3Parser.block_return block() throws RecognitionException {
        ANTLRv3Parser.block_return retval = new ANTLRv3Parser.block_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token lp=null;
        Token rp=null;
        Token char_literal76=null;
        Token char_literal78=null;
        ANTLRv3Parser.optionsSpec_return opts = null;

        ANTLRv3Parser.alternative_return a1 = null;

        ANTLRv3Parser.alternative_return a2 = null;

        ANTLRv3Parser.rewrite_return rewrite77 = null;

        ANTLRv3Parser.rewrite_return rewrite79 = null;


        CommonTree lp_tree=null;
        CommonTree rp_tree=null;
        CommonTree char_literal76_tree=null;
        CommonTree char_literal78_tree=null;
        RewriteRuleTokenStream stream_79=new RewriteRuleTokenStream(adaptor,"token 79");
        RewriteRuleTokenStream stream_82=new RewriteRuleTokenStream(adaptor,"token 82");
        RewriteRuleTokenStream stream_83=new RewriteRuleTokenStream(adaptor,"token 83");
        RewriteRuleTokenStream stream_84=new RewriteRuleTokenStream(adaptor,"token 84");
        RewriteRuleSubtreeStream stream_rewrite=new RewriteRuleSubtreeStream(adaptor,"rule rewrite");
        RewriteRuleSubtreeStream stream_alternative=new RewriteRuleSubtreeStream(adaptor,"rule alternative");
        RewriteRuleSubtreeStream stream_optionsSpec=new RewriteRuleSubtreeStream(adaptor,"rule optionsSpec");
        try {
            // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:194:5: (lp= '(' ( (opts= optionsSpec )? ':' )? a1= alternative rewrite ( '|' a2= alternative rewrite )* rp= ')' -> ^( BLOCK[$lp,\"BLOCK\"] ( optionsSpec )? ( alternative )+ EOB[$rp,\"EOB\"] ) )
            // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:194:9: lp= '(' ( (opts= optionsSpec )? ':' )? a1= alternative rewrite ( '|' a2= alternative rewrite )* rp= ')'
            {
            lp=(Token)match(input,82,FOLLOW_82_in_block1178);  
            stream_82.add(lp);

            // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:195:3: ( (opts= optionsSpec )? ':' )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==OPTIONS||LA31_0==79) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:195:5: (opts= optionsSpec )? ':'
                    {
                    // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:195:5: (opts= optionsSpec )?
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0==OPTIONS) ) {
                        alt30=1;
                    }
                    switch (alt30) {
                        case 1 :
                            // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:195:6: opts= optionsSpec
                            {
                            pushFollow(FOLLOW_optionsSpec_in_block1187);
                            opts=optionsSpec();

                            state._fsp--;

                            stream_optionsSpec.add(opts.getTree());

                            }
                            break;

                    }

                    char_literal76=(Token)match(input,79,FOLLOW_79_in_block1191);  
                    stream_79.add(char_literal76);


                    }
                    break;

            }

            pushFollow(FOLLOW_alternative_in_block1200);
            a1=alternative();

            state._fsp--;

            stream_alternative.add(a1.getTree());
            pushFollow(FOLLOW_rewrite_in_block1202);
            rewrite77=rewrite();

            state._fsp--;

            stream_rewrite.add(rewrite77.getTree());
            // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:196:26: ( '|' a2= alternative rewrite )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==83) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:196:28: '|' a2= alternative rewrite
            	    {
            	    char_literal78=(Token)match(input,83,FOLLOW_83_in_block1206);  
            	    stream_83.add(char_literal78);

            	    pushFollow(FOLLOW_alternative_in_block1210);
            	    a2=alternative();

            	    state._fsp--;

            	    stream_alternative.add(a2.getTree());
            	    pushFollow(FOLLOW_rewrite_in_block1212);
            	    rewrite79=rewrite();

            	    state._fsp--;

            	    stream_rewrite.add(rewrite79.getTree());

            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

            rp=(Token)match(input,84,FOLLOW_84_in_block1227);  
            stream_84.add(rp);



            // AST REWRITE
            // elements: alternative, optionsSpec
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 198:9: -> ^( BLOCK[$lp,\"BLOCK\"] ( optionsSpec )? ( alternative )+ EOB[$rp,\"EOB\"] )
            {
                // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:198:12: ^( BLOCK[$lp,\"BLOCK\"] ( optionsSpec )? ( alternative )+ EOB[$rp,\"EOB\"] )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BLOCK, lp, "BLOCK"), root_1);

                // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:198:34: ( optionsSpec )?
                if ( stream_optionsSpec.hasNext() ) {
                    adaptor.addChild(root_1, stream_optionsSpec.nextTree());

                }
                stream_optionsSpec.reset();
                if ( !(stream_alternative.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_alternative.hasNext() ) {
                    adaptor.addChild(root_1, stream_alternative.nextTree());

                }
                stream_alternative.reset();
                adaptor.addChild(root_1, (CommonTree)adaptor.create(EOB, rp, "EOB"));

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "block"

    public static class altList_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "altList"
    // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:201:1: altList : a1= alternative rewrite ( '|' a2= alternative rewrite )* -> ^( ( alternative )+ EOB[\"EOB\"] ) ;
    public final ANTLRv3Parser.altList_return altList() throws RecognitionException {
        ANTLRv3Parser.altList_return retval = new ANTLRv3Parser.altList_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal81=null;
        ANTLRv3Parser.alternative_return a1 = null;

        ANTLRv3Parser.alternative_return a2 = null;

        ANTLRv3Parser.rewrite_return rewrite80 = null;

        ANTLRv3Parser.rewrite_return rewrite82 = null;


        CommonTree char_literal81_tree=null;
        RewriteRuleTokenStream stream_83=new RewriteRuleTokenStream(adaptor,"token 83");
        RewriteRuleSubtreeStream stream_rewrite=new RewriteRuleSubtreeStream(adaptor,"rule rewrite");
        RewriteRuleSubtreeStream stream_alternative=new RewriteRuleSubtreeStream(adaptor,"rule alternative");

        	// must create root manually as it's used by invoked rules in real antlr tool.
        	// leave here to demonstrate use of {...} in rewrite rule
        	// it's really BLOCK[firstToken,"BLOCK"]; set line/col to previous ( or : token.
            CommonTree blkRoot = (CommonTree)adaptor.create(BLOCK,input.LT(-1),"BLOCK");

        try {
            // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:208:5: (a1= alternative rewrite ( '|' a2= alternative rewrite )* -> ^( ( alternative )+ EOB[\"EOB\"] ) )
            // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:208:9: a1= alternative rewrite ( '|' a2= alternative rewrite )*
            {
            pushFollow(FOLLOW_alternative_in_altList1279);
            a1=alternative();

            state._fsp--;

            stream_alternative.add(a1.getTree());
            pushFollow(FOLLOW_rewrite_in_altList1281);
            rewrite80=rewrite();

            state._fsp--;

            stream_rewrite.add(rewrite80.getTree());
            // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:208:32: ( '|' a2= alternative rewrite )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==83) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:208:34: '|' a2= alternative rewrite
            	    {
            	    char_literal81=(Token)match(input,83,FOLLOW_83_in_altList1285);  
            	    stream_83.add(char_literal81);

            	    pushFollow(FOLLOW_alternative_in_altList1289);
            	    a2=alternative();

            	    state._fsp--;

            	    stream_alternative.add(a2.getTree());
            	    pushFollow(FOLLOW_rewrite_in_altList1291);
            	    rewrite82=rewrite();

            	    state._fsp--;

            	    stream_rewrite.add(rewrite82.getTree());

            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);



            // AST REWRITE
            // elements: alternative
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 209:3: -> ^( ( alternative )+ EOB[\"EOB\"] )
            {
                // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:209:6: ^( ( alternative )+ EOB[\"EOB\"] )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(blkRoot, root_1);

                if ( !(stream_alternative.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_alternative.hasNext() ) {
                    adaptor.addChild(root_1, stream_alternative.nextTree());

                }
                stream_alternative.reset();
                adaptor.addChild(root_1, (CommonTree)adaptor.create(EOB, "EOB"));

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "altList"

    public static class alternative_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "alternative"
    // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:212:1: alternative : ( ( element )+ -> ^( ALT[firstToken,\"ALT\"] ( element )+ EOA[\"EOA\"] ) | -> ^( ALT[prevToken,\"ALT\"] EPSILON[prevToken,\"EPSILON\"] EOA[\"EOA\"] ) );
    public final ANTLRv3Parser.alternative_return alternative() throws RecognitionException {
        ANTLRv3Parser.alternative_return retval = new ANTLRv3Parser.alternative_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        ANTLRv3Parser.element_return element83 = null;


        RewriteRuleSubtreeStream stream_element=new RewriteRuleSubtreeStream(adaptor,"rule element");

        	Token firstToken = input.LT(1);
        	Token prevToken = input.LT(-1); // either : or | I think

        try {
            // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:217:5: ( ( element )+ -> ^( ALT[firstToken,\"ALT\"] ( element )+ EOA[\"EOA\"] ) | -> ^( ALT[prevToken,\"ALT\"] EPSILON[prevToken,\"EPSILON\"] EOA[\"EOA\"] ) )
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
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }
            switch (alt35) {
                case 1 :
                    // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:217:9: ( element )+
                    {
                    // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:217:9: ( element )+
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
                    	    // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:217:9: element
                    	    {
                    	    pushFollow(FOLLOW_element_in_alternative1336);
                    	    element83=element();

                    	    state._fsp--;

                    	    stream_element.add(element83.getTree());

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



                    // AST REWRITE
                    // elements: element
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 217:18: -> ^( ALT[firstToken,\"ALT\"] ( element )+ EOA[\"EOA\"] )
                    {
                        // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:217:21: ^( ALT[firstToken,\"ALT\"] ( element )+ EOA[\"EOA\"] )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ALT, firstToken, "ALT"), root_1);

                        if ( !(stream_element.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_element.hasNext() ) {
                            adaptor.addChild(root_1, stream_element.nextTree());

                        }
                        stream_element.reset();
                        adaptor.addChild(root_1, (CommonTree)adaptor.create(EOA, "EOA"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:218:9: 
                    {

                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 218:9: -> ^( ALT[prevToken,\"ALT\"] EPSILON[prevToken,\"EPSILON\"] EOA[\"EOA\"] )
                    {
                        // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:218:12: ^( ALT[prevToken,\"ALT\"] EPSILON[prevToken,\"EPSILON\"] EOA[\"EOA\"] )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ALT, prevToken, "ALT"), root_1);

                        adaptor.addChild(root_1, (CommonTree)adaptor.create(EPSILON, prevToken, "EPSILON"));
                        adaptor.addChild(root_1, (CommonTree)adaptor.create(EOA, "EOA"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "alternative"

    public static class exceptionGroup_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "exceptionGroup"
    // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:221:1: exceptionGroup : ( ( exceptionHandler )+ ( finallyClause )? | finallyClause );
    public final ANTLRv3Parser.exceptionGroup_return exceptionGroup() throws RecognitionException {
        ANTLRv3Parser.exceptionGroup_return retval = new ANTLRv3Parser.exceptionGroup_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        ANTLRv3Parser.exceptionHandler_return exceptionHandler84 = null;

        ANTLRv3Parser.finallyClause_return finallyClause85 = null;

        ANTLRv3Parser.finallyClause_return finallyClause86 = null;



        try {
            // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:222:2: ( ( exceptionHandler )+ ( finallyClause )? | finallyClause )
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
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }
            switch (alt38) {
                case 1 :
                    // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:222:4: ( exceptionHandler )+ ( finallyClause )?
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:222:4: ( exceptionHandler )+
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
                    	    // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:222:6: exceptionHandler
                    	    {
                    	    pushFollow(FOLLOW_exceptionHandler_in_exceptionGroup1387);
                    	    exceptionHandler84=exceptionHandler();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, exceptionHandler84.getTree());

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

                    // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:222:26: ( finallyClause )?
                    int alt37=2;
                    int LA37_0 = input.LA(1);

                    if ( (LA37_0==86) ) {
                        alt37=1;
                    }
                    switch (alt37) {
                        case 1 :
                            // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:222:28: finallyClause
                            {
                            pushFollow(FOLLOW_finallyClause_in_exceptionGroup1394);
                            finallyClause85=finallyClause();

                            state._fsp--;

                            adaptor.addChild(root_0, finallyClause85.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:223:4: finallyClause
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_finallyClause_in_exceptionGroup1402);
                    finallyClause86=finallyClause();

                    state._fsp--;

                    adaptor.addChild(root_0, finallyClause86.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "exceptionGroup"

    public static class exceptionHandler_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "exceptionHandler"
    // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:226:1: exceptionHandler : 'catch' ARG_ACTION ACTION -> ^( 'catch' ARG_ACTION ACTION ) ;
    public final ANTLRv3Parser.exceptionHandler_return exceptionHandler() throws RecognitionException {
        ANTLRv3Parser.exceptionHandler_return retval = new ANTLRv3Parser.exceptionHandler_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal87=null;
        Token ARG_ACTION88=null;
        Token ACTION89=null;

        CommonTree string_literal87_tree=null;
        CommonTree ARG_ACTION88_tree=null;
        CommonTree ACTION89_tree=null;
        RewriteRuleTokenStream stream_ACTION=new RewriteRuleTokenStream(adaptor,"token ACTION");
        RewriteRuleTokenStream stream_ARG_ACTION=new RewriteRuleTokenStream(adaptor,"token ARG_ACTION");
        RewriteRuleTokenStream stream_85=new RewriteRuleTokenStream(adaptor,"token 85");

        try {
            // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:227:5: ( 'catch' ARG_ACTION ACTION -> ^( 'catch' ARG_ACTION ACTION ) )
            // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:227:10: 'catch' ARG_ACTION ACTION
            {
            string_literal87=(Token)match(input,85,FOLLOW_85_in_exceptionHandler1422);  
            stream_85.add(string_literal87);

            ARG_ACTION88=(Token)match(input,ARG_ACTION,FOLLOW_ARG_ACTION_in_exceptionHandler1424);  
            stream_ARG_ACTION.add(ARG_ACTION88);

            ACTION89=(Token)match(input,ACTION,FOLLOW_ACTION_in_exceptionHandler1426);  
            stream_ACTION.add(ACTION89);



            // AST REWRITE
            // elements: 85, ACTION, ARG_ACTION
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 227:36: -> ^( 'catch' ARG_ACTION ACTION )
            {
                // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:227:39: ^( 'catch' ARG_ACTION ACTION )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_85.nextNode(), root_1);

                adaptor.addChild(root_1, stream_ARG_ACTION.nextNode());
                adaptor.addChild(root_1, stream_ACTION.nextNode());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "exceptionHandler"

    public static class finallyClause_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "finallyClause"
    // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:230:1: finallyClause : 'finally' ACTION -> ^( 'finally' ACTION ) ;
    public final ANTLRv3Parser.finallyClause_return finallyClause() throws RecognitionException {
        ANTLRv3Parser.finallyClause_return retval = new ANTLRv3Parser.finallyClause_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal90=null;
        Token ACTION91=null;

        CommonTree string_literal90_tree=null;
        CommonTree ACTION91_tree=null;
        RewriteRuleTokenStream stream_ACTION=new RewriteRuleTokenStream(adaptor,"token ACTION");
        RewriteRuleTokenStream stream_86=new RewriteRuleTokenStream(adaptor,"token 86");

        try {
            // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:231:5: ( 'finally' ACTION -> ^( 'finally' ACTION ) )
            // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:231:10: 'finally' ACTION
            {
            string_literal90=(Token)match(input,86,FOLLOW_86_in_finallyClause1456);  
            stream_86.add(string_literal90);

            ACTION91=(Token)match(input,ACTION,FOLLOW_ACTION_in_finallyClause1458);  
            stream_ACTION.add(ACTION91);



            // AST REWRITE
            // elements: ACTION, 86
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 231:27: -> ^( 'finally' ACTION )
            {
                // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:231:30: ^( 'finally' ACTION )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_86.nextNode(), root_1);

                adaptor.addChild(root_1, stream_ACTION.nextNode());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "finallyClause"

    public static class element_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "element"
    // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:234:1: element : elementNoOptionSpec ;
    public final ANTLRv3Parser.element_return element() throws RecognitionException {
        ANTLRv3Parser.element_return retval = new ANTLRv3Parser.element_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        ANTLRv3Parser.elementNoOptionSpec_return elementNoOptionSpec92 = null;



        try {
            // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:235:2: ( elementNoOptionSpec )
            // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:235:4: elementNoOptionSpec
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_elementNoOptionSpec_in_element1480);
            elementNoOptionSpec92=elementNoOptionSpec();

            state._fsp--;

            adaptor.addChild(root_0, elementNoOptionSpec92.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "element"

    public static class elementNoOptionSpec_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "elementNoOptionSpec"
    // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:238:1: elementNoOptionSpec : ( id (labelOp= '=' | labelOp= '+=' ) atom ( ebnfSuffix -> ^( ebnfSuffix ^( BLOCK[\"BLOCK\"] ^( ALT[\"ALT\"] ^( $labelOp id atom ) EOA[\"EOA\"] ) EOB[\"EOB\"] ) ) | -> ^( $labelOp id atom ) ) | id (labelOp= '=' | labelOp= '+=' ) block ( ebnfSuffix -> ^( ebnfSuffix ^( BLOCK[\"BLOCK\"] ^( ALT[\"ALT\"] ^( $labelOp id block ) EOA[\"EOA\"] ) EOB[\"EOB\"] ) ) | -> ^( $labelOp id block ) ) | atom ( ebnfSuffix -> ^( BLOCK[\"BLOCK\"] ^( ALT[\"ALT\"] atom EOA[\"EOA\"] ) EOB[\"EOB\"] ) | -> atom ) | ebnf | ACTION | SEMPRED ( '=>' -> GATED_SEMPRED | -> SEMPRED ) | treeSpec );
    public final ANTLRv3Parser.elementNoOptionSpec_return elementNoOptionSpec() throws RecognitionException {
        ANTLRv3Parser.elementNoOptionSpec_return retval = new ANTLRv3Parser.elementNoOptionSpec_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token labelOp=null;
        Token ACTION102=null;
        Token SEMPRED103=null;
        Token string_literal104=null;
        ANTLRv3Parser.id_return id93 = null;

        ANTLRv3Parser.atom_return atom94 = null;

        ANTLRv3Parser.ebnfSuffix_return ebnfSuffix95 = null;

        ANTLRv3Parser.id_return id96 = null;

        ANTLRv3Parser.block_return block97 = null;

        ANTLRv3Parser.ebnfSuffix_return ebnfSuffix98 = null;

        ANTLRv3Parser.atom_return atom99 = null;

        ANTLRv3Parser.ebnfSuffix_return ebnfSuffix100 = null;

        ANTLRv3Parser.ebnf_return ebnf101 = null;

        ANTLRv3Parser.treeSpec_return treeSpec105 = null;


        CommonTree labelOp_tree=null;
        CommonTree ACTION102_tree=null;
        CommonTree SEMPRED103_tree=null;
        CommonTree string_literal104_tree=null;
        RewriteRuleTokenStream stream_SEMPRED=new RewriteRuleTokenStream(adaptor,"token SEMPRED");
        RewriteRuleTokenStream stream_71=new RewriteRuleTokenStream(adaptor,"token 71");
        RewriteRuleTokenStream stream_87=new RewriteRuleTokenStream(adaptor,"token 87");
        RewriteRuleTokenStream stream_88=new RewriteRuleTokenStream(adaptor,"token 88");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        RewriteRuleSubtreeStream stream_atom=new RewriteRuleSubtreeStream(adaptor,"rule atom");
        RewriteRuleSubtreeStream stream_ebnfSuffix=new RewriteRuleSubtreeStream(adaptor,"rule ebnfSuffix");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:239:2: ( id (labelOp= '=' | labelOp= '+=' ) atom ( ebnfSuffix -> ^( ebnfSuffix ^( BLOCK[\"BLOCK\"] ^( ALT[\"ALT\"] ^( $labelOp id atom ) EOA[\"EOA\"] ) EOB[\"EOB\"] ) ) | -> ^( $labelOp id atom ) ) | id (labelOp= '=' | labelOp= '+=' ) block ( ebnfSuffix -> ^( ebnfSuffix ^( BLOCK[\"BLOCK\"] ^( ALT[\"ALT\"] ^( $labelOp id block ) EOA[\"EOA\"] ) EOB[\"EOB\"] ) ) | -> ^( $labelOp id block ) ) | atom ( ebnfSuffix -> ^( BLOCK[\"BLOCK\"] ^( ALT[\"ALT\"] atom EOA[\"EOA\"] ) EOB[\"EOB\"] ) | -> atom ) | ebnf | ACTION | SEMPRED ( '=>' -> GATED_SEMPRED | -> SEMPRED ) | treeSpec )
            int alt45=7;
            alt45 = dfa45.predict(input);
            switch (alt45) {
                case 1 :
                    // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:239:4: id (labelOp= '=' | labelOp= '+=' ) atom ( ebnfSuffix -> ^( ebnfSuffix ^( BLOCK[\"BLOCK\"] ^( ALT[\"ALT\"] ^( $labelOp id atom ) EOA[\"EOA\"] ) EOB[\"EOB\"] ) ) | -> ^( $labelOp id atom ) )
                    {
                    pushFollow(FOLLOW_id_in_elementNoOptionSpec1491);
                    id93=id();

                    state._fsp--;

                    stream_id.add(id93.getTree());
                    // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:239:7: (labelOp= '=' | labelOp= '+=' )
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
                            new NoViableAltException("", 39, 0, input);

                        throw nvae;
                    }
                    switch (alt39) {
                        case 1 :
                            // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:239:8: labelOp= '='
                            {
                            labelOp=(Token)match(input,71,FOLLOW_71_in_elementNoOptionSpec1496);  
                            stream_71.add(labelOp);


                            }
                            break;
                        case 2 :
                            // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:239:20: labelOp= '+='
                            {
                            labelOp=(Token)match(input,87,FOLLOW_87_in_elementNoOptionSpec1500);  
                            stream_87.add(labelOp);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_atom_in_elementNoOptionSpec1503);
                    atom94=atom();

                    state._fsp--;

                    stream_atom.add(atom94.getTree());
                    // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:240:3: ( ebnfSuffix -> ^( ebnfSuffix ^( BLOCK[\"BLOCK\"] ^( ALT[\"ALT\"] ^( $labelOp id atom ) EOA[\"EOA\"] ) EOB[\"EOB\"] ) ) | -> ^( $labelOp id atom ) )
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
                            new NoViableAltException("", 40, 0, input);

                        throw nvae;
                    }
                    switch (alt40) {
                        case 1 :
                            // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:240:5: ebnfSuffix
                            {
                            pushFollow(FOLLOW_ebnfSuffix_in_elementNoOptionSpec1509);
                            ebnfSuffix95=ebnfSuffix();

                            state._fsp--;

                            stream_ebnfSuffix.add(ebnfSuffix95.getTree());


                            // AST REWRITE
                            // elements: id, ebnfSuffix, atom, labelOp
                            // token labels: labelOp
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            retval.tree = root_0;
                            RewriteRuleTokenStream stream_labelOp=new RewriteRuleTokenStream(adaptor,"token labelOp",labelOp);
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (CommonTree)adaptor.nil();
                            // 240:16: -> ^( ebnfSuffix ^( BLOCK[\"BLOCK\"] ^( ALT[\"ALT\"] ^( $labelOp id atom ) EOA[\"EOA\"] ) EOB[\"EOB\"] ) )
                            {
                                // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:240:19: ^( ebnfSuffix ^( BLOCK[\"BLOCK\"] ^( ALT[\"ALT\"] ^( $labelOp id atom ) EOA[\"EOA\"] ) EOB[\"EOB\"] ) )
                                {
                                CommonTree root_1 = (CommonTree)adaptor.nil();
                                root_1 = (CommonTree)adaptor.becomeRoot(stream_ebnfSuffix.nextNode(), root_1);

                                // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:240:33: ^( BLOCK[\"BLOCK\"] ^( ALT[\"ALT\"] ^( $labelOp id atom ) EOA[\"EOA\"] ) EOB[\"EOB\"] )
                                {
                                CommonTree root_2 = (CommonTree)adaptor.nil();
                                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BLOCK, "BLOCK"), root_2);

                                // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:240:50: ^( ALT[\"ALT\"] ^( $labelOp id atom ) EOA[\"EOA\"] )
                                {
                                CommonTree root_3 = (CommonTree)adaptor.nil();
                                root_3 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ALT, "ALT"), root_3);

                                // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:240:63: ^( $labelOp id atom )
                                {
                                CommonTree root_4 = (CommonTree)adaptor.nil();
                                root_4 = (CommonTree)adaptor.becomeRoot(stream_labelOp.nextNode(), root_4);

                                adaptor.addChild(root_4, stream_id.nextTree());
                                adaptor.addChild(root_4, stream_atom.nextTree());

                                adaptor.addChild(root_3, root_4);
                                }
                                adaptor.addChild(root_3, (CommonTree)adaptor.create(EOA, "EOA"));

                                adaptor.addChild(root_2, root_3);
                                }
                                adaptor.addChild(root_2, (CommonTree)adaptor.create(EOB, "EOB"));

                                adaptor.addChild(root_1, root_2);
                                }

                                adaptor.addChild(root_0, root_1);
                                }

                            }

                            retval.tree = root_0;
                            }
                            break;
                        case 2 :
                            // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:241:8: 
                            {

                            // AST REWRITE
                            // elements: atom, id, labelOp
                            // token labels: labelOp
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            retval.tree = root_0;
                            RewriteRuleTokenStream stream_labelOp=new RewriteRuleTokenStream(adaptor,"token labelOp",labelOp);
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (CommonTree)adaptor.nil();
                            // 241:8: -> ^( $labelOp id atom )
                            {
                                // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:241:11: ^( $labelOp id atom )
                                {
                                CommonTree root_1 = (CommonTree)adaptor.nil();
                                root_1 = (CommonTree)adaptor.becomeRoot(stream_labelOp.nextNode(), root_1);

                                adaptor.addChild(root_1, stream_id.nextTree());
                                adaptor.addChild(root_1, stream_atom.nextTree());

                                adaptor.addChild(root_0, root_1);
                                }

                            }

                            retval.tree = root_0;
                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:243:4: id (labelOp= '=' | labelOp= '+=' ) block ( ebnfSuffix -> ^( ebnfSuffix ^( BLOCK[\"BLOCK\"] ^( ALT[\"ALT\"] ^( $labelOp id block ) EOA[\"EOA\"] ) EOB[\"EOB\"] ) ) | -> ^( $labelOp id block ) )
                    {
                    pushFollow(FOLLOW_id_in_elementNoOptionSpec1568);
                    id96=id();

                    state._fsp--;

                    stream_id.add(id96.getTree());
                    // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:243:7: (labelOp= '=' | labelOp= '+=' )
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
                            new NoViableAltException("", 41, 0, input);

                        throw nvae;
                    }
                    switch (alt41) {
                        case 1 :
                            // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:243:8: labelOp= '='
                            {
                            labelOp=(Token)match(input,71,FOLLOW_71_in_elementNoOptionSpec1573);  
                            stream_71.add(labelOp);


                            }
                            break;
                        case 2 :
                            // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:243:20: labelOp= '+='
                            {
                            labelOp=(Token)match(input,87,FOLLOW_87_in_elementNoOptionSpec1577);  
                            stream_87.add(labelOp);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_block_in_elementNoOptionSpec1580);
                    block97=block();

                    state._fsp--;

                    stream_block.add(block97.getTree());
                    // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:244:3: ( ebnfSuffix -> ^( ebnfSuffix ^( BLOCK[\"BLOCK\"] ^( ALT[\"ALT\"] ^( $labelOp id block ) EOA[\"EOA\"] ) EOB[\"EOB\"] ) ) | -> ^( $labelOp id block ) )
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
                            new NoViableAltException("", 42, 0, input);

                        throw nvae;
                    }
                    switch (alt42) {
                        case 1 :
                            // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:244:5: ebnfSuffix
                            {
                            pushFollow(FOLLOW_ebnfSuffix_in_elementNoOptionSpec1586);
                            ebnfSuffix98=ebnfSuffix();

                            state._fsp--;

                            stream_ebnfSuffix.add(ebnfSuffix98.getTree());


                            // AST REWRITE
                            // elements: labelOp, id, block, ebnfSuffix
                            // token labels: labelOp
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            retval.tree = root_0;
                            RewriteRuleTokenStream stream_labelOp=new RewriteRuleTokenStream(adaptor,"token labelOp",labelOp);
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (CommonTree)adaptor.nil();
                            // 244:16: -> ^( ebnfSuffix ^( BLOCK[\"BLOCK\"] ^( ALT[\"ALT\"] ^( $labelOp id block ) EOA[\"EOA\"] ) EOB[\"EOB\"] ) )
                            {
                                // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:244:19: ^( ebnfSuffix ^( BLOCK[\"BLOCK\"] ^( ALT[\"ALT\"] ^( $labelOp id block ) EOA[\"EOA\"] ) EOB[\"EOB\"] ) )
                                {
                                CommonTree root_1 = (CommonTree)adaptor.nil();
                                root_1 = (CommonTree)adaptor.becomeRoot(stream_ebnfSuffix.nextNode(), root_1);

                                // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:244:33: ^( BLOCK[\"BLOCK\"] ^( ALT[\"ALT\"] ^( $labelOp id block ) EOA[\"EOA\"] ) EOB[\"EOB\"] )
                                {
                                CommonTree root_2 = (CommonTree)adaptor.nil();
                                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BLOCK, "BLOCK"), root_2);

                                // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:244:50: ^( ALT[\"ALT\"] ^( $labelOp id block ) EOA[\"EOA\"] )
                                {
                                CommonTree root_3 = (CommonTree)adaptor.nil();
                                root_3 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ALT, "ALT"), root_3);

                                // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:244:63: ^( $labelOp id block )
                                {
                                CommonTree root_4 = (CommonTree)adaptor.nil();
                                root_4 = (CommonTree)adaptor.becomeRoot(stream_labelOp.nextNode(), root_4);

                                adaptor.addChild(root_4, stream_id.nextTree());
                                adaptor.addChild(root_4, stream_block.nextTree());

                                adaptor.addChild(root_3, root_4);
                                }
                                adaptor.addChild(root_3, (CommonTree)adaptor.create(EOA, "EOA"));

                                adaptor.addChild(root_2, root_3);
                                }
                                adaptor.addChild(root_2, (CommonTree)adaptor.create(EOB, "EOB"));

                                adaptor.addChild(root_1, root_2);
                                }

                                adaptor.addChild(root_0, root_1);
                                }

                            }

                            retval.tree = root_0;
                            }
                            break;
                        case 2 :
                            // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:245:8: 
                            {

                            // AST REWRITE
                            // elements: block, labelOp, id
                            // token labels: labelOp
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            retval.tree = root_0;
                            RewriteRuleTokenStream stream_labelOp=new RewriteRuleTokenStream(adaptor,"token labelOp",labelOp);
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (CommonTree)adaptor.nil();
                            // 245:8: -> ^( $labelOp id block )
                            {
                                // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:245:11: ^( $labelOp id block )
                                {
                                CommonTree root_1 = (CommonTree)adaptor.nil();
                                root_1 = (CommonTree)adaptor.becomeRoot(stream_labelOp.nextNode(), root_1);

                                adaptor.addChild(root_1, stream_id.nextTree());
                                adaptor.addChild(root_1, stream_block.nextTree());

                                adaptor.addChild(root_0, root_1);
                                }

                            }

                            retval.tree = root_0;
                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:247:4: atom ( ebnfSuffix -> ^( BLOCK[\"BLOCK\"] ^( ALT[\"ALT\"] atom EOA[\"EOA\"] ) EOB[\"EOB\"] ) | -> atom )
                    {
                    pushFollow(FOLLOW_atom_in_elementNoOptionSpec1645);
                    atom99=atom();

                    state._fsp--;

                    stream_atom.add(atom99.getTree());
                    // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:248:3: ( ebnfSuffix -> ^( BLOCK[\"BLOCK\"] ^( ALT[\"ALT\"] atom EOA[\"EOA\"] ) EOB[\"EOB\"] ) | -> atom )
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
                            new NoViableAltException("", 43, 0, input);

                        throw nvae;
                    }
                    switch (alt43) {
                        case 1 :
                            // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:248:5: ebnfSuffix
                            {
                            pushFollow(FOLLOW_ebnfSuffix_in_elementNoOptionSpec1651);
                            ebnfSuffix100=ebnfSuffix();

                            state._fsp--;

                            stream_ebnfSuffix.add(ebnfSuffix100.getTree());


                            // AST REWRITE
                            // elements: atom
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (CommonTree)adaptor.nil();
                            // 248:16: -> ^( BLOCK[\"BLOCK\"] ^( ALT[\"ALT\"] atom EOA[\"EOA\"] ) EOB[\"EOB\"] )
                            {
                                // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:248:19: ^( BLOCK[\"BLOCK\"] ^( ALT[\"ALT\"] atom EOA[\"EOA\"] ) EOB[\"EOB\"] )
                                {
                                CommonTree root_1 = (CommonTree)adaptor.nil();
                                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BLOCK, "BLOCK"), root_1);

                                // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:248:36: ^( ALT[\"ALT\"] atom EOA[\"EOA\"] )
                                {
                                CommonTree root_2 = (CommonTree)adaptor.nil();
                                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ALT, "ALT"), root_2);

                                adaptor.addChild(root_2, stream_atom.nextTree());
                                adaptor.addChild(root_2, (CommonTree)adaptor.create(EOA, "EOA"));

                                adaptor.addChild(root_1, root_2);
                                }
                                adaptor.addChild(root_1, (CommonTree)adaptor.create(EOB, "EOB"));

                                adaptor.addChild(root_0, root_1);
                                }

                            }

                            retval.tree = root_0;
                            }
                            break;
                        case 2 :
                            // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:249:8: 
                            {

                            // AST REWRITE
                            // elements: atom
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (CommonTree)adaptor.nil();
                            // 249:8: -> atom
                            {
                                adaptor.addChild(root_0, stream_atom.nextTree());

                            }

                            retval.tree = root_0;
                            }
                            break;

                    }


                    }
                    break;
                case 4 :
                    // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:251:4: ebnf
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_ebnf_in_elementNoOptionSpec1691);
                    ebnf101=ebnf();

                    state._fsp--;

                    adaptor.addChild(root_0, ebnf101.getTree());

                    }
                    break;
                case 5 :
                    // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:252:6: ACTION
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    ACTION102=(Token)match(input,ACTION,FOLLOW_ACTION_in_elementNoOptionSpec1698); 
                    ACTION102_tree = (CommonTree)adaptor.create(ACTION102);
                    adaptor.addChild(root_0, ACTION102_tree);


                    }
                    break;
                case 6 :
                    // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:253:6: SEMPRED ( '=>' -> GATED_SEMPRED | -> SEMPRED )
                    {
                    SEMPRED103=(Token)match(input,SEMPRED,FOLLOW_SEMPRED_in_elementNoOptionSpec1705);  
                    stream_SEMPRED.add(SEMPRED103);

                    // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:253:14: ( '=>' -> GATED_SEMPRED | -> SEMPRED )
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
                            new NoViableAltException("", 44, 0, input);

                        throw nvae;
                    }
                    switch (alt44) {
                        case 1 :
                            // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:253:16: '=>'
                            {
                            string_literal104=(Token)match(input,88,FOLLOW_88_in_elementNoOptionSpec1709);  
                            stream_88.add(string_literal104);



                            // AST REWRITE
                            // elements: 
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (CommonTree)adaptor.nil();
                            // 253:21: -> GATED_SEMPRED
                            {
                                adaptor.addChild(root_0, (CommonTree)adaptor.create(GATED_SEMPRED, "GATED_SEMPRED"));

                            }

                            retval.tree = root_0;
                            }
                            break;
                        case 2 :
                            // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:253:40: 
                            {

                            // AST REWRITE
                            // elements: SEMPRED
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (CommonTree)adaptor.nil();
                            // 253:40: -> SEMPRED
                            {
                                adaptor.addChild(root_0, stream_SEMPRED.nextNode());

                            }

                            retval.tree = root_0;
                            }
                            break;

                    }


                    }
                    break;
                case 7 :
                    // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:254:6: treeSpec
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_treeSpec_in_elementNoOptionSpec1728);
                    treeSpec105=treeSpec();

                    state._fsp--;

                    adaptor.addChild(root_0, treeSpec105.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "elementNoOptionSpec"

    public static class atom_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "atom"
    // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:257:1: atom : ( range ( (op= '^' | op= '!' ) -> ^( $op range ) | -> range ) | terminal | notSet ( (op= '^' | op= '!' ) -> ^( $op notSet ) | -> notSet ) | RULE_REF (arg= ARG_ACTION )? ( (op= '^' | op= '!' ) )? -> {$arg!=null&&op!=null}? ^( $op RULE_REF $arg) -> {$arg!=null}? ^( RULE_REF $arg) -> {$op!=null}? ^( $op RULE_REF ) -> RULE_REF );
    public final ANTLRv3Parser.atom_return atom() throws RecognitionException {
        ANTLRv3Parser.atom_return retval = new ANTLRv3Parser.atom_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token op=null;
        Token arg=null;
        Token RULE_REF109=null;
        ANTLRv3Parser.range_return range106 = null;

        ANTLRv3Parser.terminal_return terminal107 = null;

        ANTLRv3Parser.notSet_return notSet108 = null;


        CommonTree op_tree=null;
        CommonTree arg_tree=null;
        CommonTree RULE_REF109_tree=null;
        RewriteRuleTokenStream stream_BANG=new RewriteRuleTokenStream(adaptor,"token BANG");
        RewriteRuleTokenStream stream_ROOT=new RewriteRuleTokenStream(adaptor,"token ROOT");
        RewriteRuleTokenStream stream_RULE_REF=new RewriteRuleTokenStream(adaptor,"token RULE_REF");
        RewriteRuleTokenStream stream_ARG_ACTION=new RewriteRuleTokenStream(adaptor,"token ARG_ACTION");
        RewriteRuleSubtreeStream stream_range=new RewriteRuleSubtreeStream(adaptor,"rule range");
        RewriteRuleSubtreeStream stream_notSet=new RewriteRuleSubtreeStream(adaptor,"rule notSet");
        try {
            // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:257:5: ( range ( (op= '^' | op= '!' ) -> ^( $op range ) | -> range ) | terminal | notSet ( (op= '^' | op= '!' ) -> ^( $op notSet ) | -> notSet ) | RULE_REF (arg= ARG_ACTION )? ( (op= '^' | op= '!' ) )? -> {$arg!=null&&op!=null}? ^( $op RULE_REF $arg) -> {$arg!=null}? ^( RULE_REF $arg) -> {$op!=null}? ^( $op RULE_REF ) -> RULE_REF )
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
                        new NoViableAltException("", 53, 1, input);

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
                    new NoViableAltException("", 53, 0, input);

                throw nvae;
            }

            switch (alt53) {
                case 1 :
                    // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:257:9: range ( (op= '^' | op= '!' ) -> ^( $op range ) | -> range )
                    {
                    pushFollow(FOLLOW_range_in_atom1739);
                    range106=range();

                    state._fsp--;

                    stream_range.add(range106.getTree());
                    // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:257:15: ( (op= '^' | op= '!' ) -> ^( $op range ) | -> range )
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
                            new NoViableAltException("", 47, 0, input);

                        throw nvae;
                    }
                    switch (alt47) {
                        case 1 :
                            // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:257:17: (op= '^' | op= '!' )
                            {
                            // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:257:17: (op= '^' | op= '!' )
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
                                    new NoViableAltException("", 46, 0, input);

                                throw nvae;
                            }
                            switch (alt46) {
                                case 1 :
                                    // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:257:18: op= '^'
                                    {
                                    op=(Token)match(input,ROOT,FOLLOW_ROOT_in_atom1746);  
                                    stream_ROOT.add(op);


                                    }
                                    break;
                                case 2 :
                                    // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:257:25: op= '!'
                                    {
                                    op=(Token)match(input,BANG,FOLLOW_BANG_in_atom1750);  
                                    stream_BANG.add(op);


                                    }
                                    break;

                            }



                            // AST REWRITE
                            // elements: range, op
                            // token labels: op
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            retval.tree = root_0;
                            RewriteRuleTokenStream stream_op=new RewriteRuleTokenStream(adaptor,"token op",op);
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (CommonTree)adaptor.nil();
                            // 257:33: -> ^( $op range )
                            {
                                // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:257:36: ^( $op range )
                                {
                                CommonTree root_1 = (CommonTree)adaptor.nil();
                                root_1 = (CommonTree)adaptor.becomeRoot(stream_op.nextNode(), root_1);

                                adaptor.addChild(root_1, stream_range.nextTree());

                                adaptor.addChild(root_0, root_1);
                                }

                            }

                            retval.tree = root_0;
                            }
                            break;
                        case 2 :
                            // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:257:51: 
                            {

                            // AST REWRITE
                            // elements: range
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (CommonTree)adaptor.nil();
                            // 257:51: -> range
                            {
                                adaptor.addChild(root_0, stream_range.nextTree());

                            }

                            retval.tree = root_0;
                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:258:9: terminal
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_terminal_in_atom1778);
                    terminal107=terminal();

                    state._fsp--;

                    adaptor.addChild(root_0, terminal107.getTree());

                    }
                    break;
                case 3 :
                    // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:259:7: notSet ( (op= '^' | op= '!' ) -> ^( $op notSet ) | -> notSet )
                    {
                    pushFollow(FOLLOW_notSet_in_atom1786);
                    notSet108=notSet();

                    state._fsp--;

                    stream_notSet.add(notSet108.getTree());
                    // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:259:14: ( (op= '^' | op= '!' ) -> ^( $op notSet ) | -> notSet )
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
                            new NoViableAltException("", 49, 0, input);

                        throw nvae;
                    }
                    switch (alt49) {
                        case 1 :
                            // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:259:16: (op= '^' | op= '!' )
                            {
                            // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:259:16: (op= '^' | op= '!' )
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
                                    new NoViableAltException("", 48, 0, input);

                                throw nvae;
                            }
                            switch (alt48) {
                                case 1 :
                                    // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:259:17: op= '^'
                                    {
                                    op=(Token)match(input,ROOT,FOLLOW_ROOT_in_atom1793);  
                                    stream_ROOT.add(op);


                                    }
                                    break;
                                case 2 :
                                    // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:259:24: op= '!'
                                    {
                                    op=(Token)match(input,BANG,FOLLOW_BANG_in_atom1797);  
                                    stream_BANG.add(op);


                                    }
                                    break;

                            }



                            // AST REWRITE
                            // elements: op, notSet
                            // token labels: op
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            retval.tree = root_0;
                            RewriteRuleTokenStream stream_op=new RewriteRuleTokenStream(adaptor,"token op",op);
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (CommonTree)adaptor.nil();
                            // 259:32: -> ^( $op notSet )
                            {
                                // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:259:35: ^( $op notSet )
                                {
                                CommonTree root_1 = (CommonTree)adaptor.nil();
                                root_1 = (CommonTree)adaptor.becomeRoot(stream_op.nextNode(), root_1);

                                adaptor.addChild(root_1, stream_notSet.nextTree());

                                adaptor.addChild(root_0, root_1);
                                }

                            }

                            retval.tree = root_0;
                            }
                            break;
                        case 2 :
                            // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:259:51: 
                            {

                            // AST REWRITE
                            // elements: notSet
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (CommonTree)adaptor.nil();
                            // 259:51: -> notSet
                            {
                                adaptor.addChild(root_0, stream_notSet.nextTree());

                            }

                            retval.tree = root_0;
                            }
                            break;

                    }


                    }
                    break;
                case 4 :
                    // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:260:9: RULE_REF (arg= ARG_ACTION )? ( (op= '^' | op= '!' ) )?
                    {
                    RULE_REF109=(Token)match(input,RULE_REF,FOLLOW_RULE_REF_in_atom1825);  
                    stream_RULE_REF.add(RULE_REF109);

                    // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:260:18: (arg= ARG_ACTION )?
                    int alt50=2;
                    int LA50_0 = input.LA(1);

                    if ( (LA50_0==ARG_ACTION) ) {
                        alt50=1;
                    }
                    switch (alt50) {
                        case 1 :
                            // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:260:20: arg= ARG_ACTION
                            {
                            arg=(Token)match(input,ARG_ACTION,FOLLOW_ARG_ACTION_in_atom1831);  
                            stream_ARG_ACTION.add(arg);


                            }
                            break;

                    }

                    // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:260:38: ( (op= '^' | op= '!' ) )?
                    int alt52=2;
                    int LA52_0 = input.LA(1);

                    if ( ((LA52_0>=ROOT && LA52_0<=BANG)) ) {
                        alt52=1;
                    }
                    switch (alt52) {
                        case 1 :
                            // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:260:40: (op= '^' | op= '!' )
                            {
                            // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:260:40: (op= '^' | op= '!' )
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
                                    new NoViableAltException("", 51, 0, input);

                                throw nvae;
                            }
                            switch (alt51) {
                                case 1 :
                                    // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:260:41: op= '^'
                                    {
                                    op=(Token)match(input,ROOT,FOLLOW_ROOT_in_atom1841);  
                                    stream_ROOT.add(op);


                                    }
                                    break;
                                case 2 :
                                    // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:260:48: op= '!'
                                    {
                                    op=(Token)match(input,BANG,FOLLOW_BANG_in_atom1845);  
                                    stream_BANG.add(op);


                                    }
                                    break;

                            }


                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: RULE_REF, op, arg, op, RULE_REF, arg, RULE_REF, RULE_REF
                    // token labels: arg, op
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_arg=new RewriteRuleTokenStream(adaptor,"token arg",arg);
                    RewriteRuleTokenStream stream_op=new RewriteRuleTokenStream(adaptor,"token op",op);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 261:6: -> {$arg!=null&&op!=null}? ^( $op RULE_REF $arg)
                    if (arg!=null&&op!=null) {
                        // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:261:33: ^( $op RULE_REF $arg)
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_op.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_RULE_REF.nextNode());
                        adaptor.addChild(root_1, stream_arg.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }
                    else // 262:6: -> {$arg!=null}? ^( RULE_REF $arg)
                    if (arg!=null) {
                        // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:262:25: ^( RULE_REF $arg)
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_RULE_REF.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_arg.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }
                    else // 263:6: -> {$op!=null}? ^( $op RULE_REF )
                    if (op!=null) {
                        // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:263:25: ^( $op RULE_REF )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_op.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_RULE_REF.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }
                    else // 264:6: -> RULE_REF
                    {
                        adaptor.addChild(root_0, stream_RULE_REF.nextNode());

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "atom"

    public static class notSet_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "notSet"
    // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:267:1: notSet : '~' ( notTerminal -> ^( '~' notTerminal ) | block -> ^( '~' block ) ) ;
    public final ANTLRv3Parser.notSet_return notSet() throws RecognitionException {
        ANTLRv3Parser.notSet_return retval = new ANTLRv3Parser.notSet_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal110=null;
        ANTLRv3Parser.notTerminal_return notTerminal111 = null;

        ANTLRv3Parser.block_return block112 = null;


        CommonTree char_literal110_tree=null;
        RewriteRuleTokenStream stream_89=new RewriteRuleTokenStream(adaptor,"token 89");
        RewriteRuleSubtreeStream stream_notTerminal=new RewriteRuleSubtreeStream(adaptor,"rule notTerminal");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:268:2: ( '~' ( notTerminal -> ^( '~' notTerminal ) | block -> ^( '~' block ) ) )
            // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:268:4: '~' ( notTerminal -> ^( '~' notTerminal ) | block -> ^( '~' block ) )
            {
            char_literal110=(Token)match(input,89,FOLLOW_89_in_notSet1928);  
            stream_89.add(char_literal110);

            // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:269:3: ( notTerminal -> ^( '~' notTerminal ) | block -> ^( '~' block ) )
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
                    new NoViableAltException("", 54, 0, input);

                throw nvae;
            }
            switch (alt54) {
                case 1 :
                    // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:269:5: notTerminal
                    {
                    pushFollow(FOLLOW_notTerminal_in_notSet1934);
                    notTerminal111=notTerminal();

                    state._fsp--;

                    stream_notTerminal.add(notTerminal111.getTree());


                    // AST REWRITE
                    // elements: 89, notTerminal
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 269:17: -> ^( '~' notTerminal )
                    {
                        // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:269:20: ^( '~' notTerminal )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_89.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_notTerminal.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:270:5: block
                    {
                    pushFollow(FOLLOW_block_in_notSet1948);
                    block112=block();

                    state._fsp--;

                    stream_block.add(block112.getTree());


                    // AST REWRITE
                    // elements: block, 89
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 270:12: -> ^( '~' block )
                    {
                        // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:270:15: ^( '~' block )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_89.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_block.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "notSet"

    public static class treeSpec_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "treeSpec"
    // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:274:1: treeSpec : '^(' element ( element )+ ')' -> ^( TREE_BEGIN ( element )+ ) ;
    public final ANTLRv3Parser.treeSpec_return treeSpec() throws RecognitionException {
        ANTLRv3Parser.treeSpec_return retval = new ANTLRv3Parser.treeSpec_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal113=null;
        Token char_literal116=null;
        ANTLRv3Parser.element_return element114 = null;

        ANTLRv3Parser.element_return element115 = null;


        CommonTree string_literal113_tree=null;
        CommonTree char_literal116_tree=null;
        RewriteRuleTokenStream stream_TREE_BEGIN=new RewriteRuleTokenStream(adaptor,"token TREE_BEGIN");
        RewriteRuleTokenStream stream_84=new RewriteRuleTokenStream(adaptor,"token 84");
        RewriteRuleSubtreeStream stream_element=new RewriteRuleSubtreeStream(adaptor,"rule element");
        try {
            // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:275:2: ( '^(' element ( element )+ ')' -> ^( TREE_BEGIN ( element )+ ) )
            // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:275:4: '^(' element ( element )+ ')'
            {
            string_literal113=(Token)match(input,TREE_BEGIN,FOLLOW_TREE_BEGIN_in_treeSpec1972);  
            stream_TREE_BEGIN.add(string_literal113);

            pushFollow(FOLLOW_element_in_treeSpec1974);
            element114=element();

            state._fsp--;

            stream_element.add(element114.getTree());
            // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:275:17: ( element )+
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
            	    // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:275:19: element
            	    {
            	    pushFollow(FOLLOW_element_in_treeSpec1978);
            	    element115=element();

            	    state._fsp--;

            	    stream_element.add(element115.getTree());

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

            char_literal116=(Token)match(input,84,FOLLOW_84_in_treeSpec1983);  
            stream_84.add(char_literal116);



            // AST REWRITE
            // elements: element
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 275:34: -> ^( TREE_BEGIN ( element )+ )
            {
                // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:275:37: ^( TREE_BEGIN ( element )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TREE_BEGIN, "TREE_BEGIN"), root_1);

                if ( !(stream_element.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_element.hasNext() ) {
                    adaptor.addChild(root_1, stream_element.nextTree());

                }
                stream_element.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "treeSpec"

    public static class ebnf_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ebnf"
    // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:278:1: ebnf : block ( '?' -> ^( OPTIONAL[op] block ) | '*' -> ^( CLOSURE[op] block ) | '+' -> ^( POSITIVE_CLOSURE[op] block ) | '^' -> ^( '^' block ) | '!' -> ^( '!' block ) | '=>' -> {gtype==COMBINED_GRAMMAR &&\r\n\t\t\t\t\t Character.isUpperCase($rule::name.charAt(0))}? ^( SYNPRED[\"=>\"] block ) -> SYN_SEMPRED | -> block ) ;
    public final ANTLRv3Parser.ebnf_return ebnf() throws RecognitionException {
        ANTLRv3Parser.ebnf_return retval = new ANTLRv3Parser.ebnf_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal118=null;
        Token char_literal119=null;
        Token char_literal120=null;
        Token char_literal121=null;
        Token char_literal122=null;
        Token string_literal123=null;
        ANTLRv3Parser.block_return block117 = null;


        CommonTree char_literal118_tree=null;
        CommonTree char_literal119_tree=null;
        CommonTree char_literal120_tree=null;
        CommonTree char_literal121_tree=null;
        CommonTree char_literal122_tree=null;
        CommonTree string_literal123_tree=null;
        RewriteRuleTokenStream stream_BANG=new RewriteRuleTokenStream(adaptor,"token BANG");
        RewriteRuleTokenStream stream_91=new RewriteRuleTokenStream(adaptor,"token 91");
        RewriteRuleTokenStream stream_90=new RewriteRuleTokenStream(adaptor,"token 90");
        RewriteRuleTokenStream stream_ROOT=new RewriteRuleTokenStream(adaptor,"token ROOT");
        RewriteRuleTokenStream stream_74=new RewriteRuleTokenStream(adaptor,"token 74");
        RewriteRuleTokenStream stream_88=new RewriteRuleTokenStream(adaptor,"token 88");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");

            Token firstToken = input.LT(1);

        try {
            // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:287:2: ( block ( '?' -> ^( OPTIONAL[op] block ) | '*' -> ^( CLOSURE[op] block ) | '+' -> ^( POSITIVE_CLOSURE[op] block ) | '^' -> ^( '^' block ) | '!' -> ^( '!' block ) | '=>' -> {gtype==COMBINED_GRAMMAR &&\r\n\t\t\t\t\t Character.isUpperCase($rule::name.charAt(0))}? ^( SYNPRED[\"=>\"] block ) -> SYN_SEMPRED | -> block ) )
            // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:287:4: block ( '?' -> ^( OPTIONAL[op] block ) | '*' -> ^( CLOSURE[op] block ) | '+' -> ^( POSITIVE_CLOSURE[op] block ) | '^' -> ^( '^' block ) | '!' -> ^( '!' block ) | '=>' -> {gtype==COMBINED_GRAMMAR &&\r\n\t\t\t\t\t Character.isUpperCase($rule::name.charAt(0))}? ^( SYNPRED[\"=>\"] block ) -> SYN_SEMPRED | -> block )
            {
            pushFollow(FOLLOW_block_in_ebnf2015);
            block117=block();

            state._fsp--;

            stream_block.add(block117.getTree());
            Token op=input.LT(1);
            // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:288:3: ( '?' -> ^( OPTIONAL[op] block ) | '*' -> ^( CLOSURE[op] block ) | '+' -> ^( POSITIVE_CLOSURE[op] block ) | '^' -> ^( '^' block ) | '!' -> ^( '!' block ) | '=>' -> {gtype==COMBINED_GRAMMAR &&\r\n\t\t\t\t\t Character.isUpperCase($rule::name.charAt(0))}? ^( SYNPRED[\"=>\"] block ) -> SYN_SEMPRED | -> block )
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
                    new NoViableAltException("", 56, 0, input);

                throw nvae;
            }

            switch (alt56) {
                case 1 :
                    // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:288:5: '?'
                    {
                    char_literal118=(Token)match(input,90,FOLLOW_90_in_ebnf2023);  
                    stream_90.add(char_literal118);



                    // AST REWRITE
                    // elements: block
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 288:10: -> ^( OPTIONAL[op] block )
                    {
                        // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:288:13: ^( OPTIONAL[op] block )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(OPTIONAL, op), root_1);

                        adaptor.addChild(root_1, stream_block.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:289:5: '*'
                    {
                    char_literal119=(Token)match(input,74,FOLLOW_74_in_ebnf2039);  
                    stream_74.add(char_literal119);



                    // AST REWRITE
                    // elements: block
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 289:10: -> ^( CLOSURE[op] block )
                    {
                        // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:289:13: ^( CLOSURE[op] block )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CLOSURE, op), root_1);

                        adaptor.addChild(root_1, stream_block.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:290:5: '+'
                    {
                    char_literal120=(Token)match(input,91,FOLLOW_91_in_ebnf2055);  
                    stream_91.add(char_literal120);



                    // AST REWRITE
                    // elements: block
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 290:10: -> ^( POSITIVE_CLOSURE[op] block )
                    {
                        // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:290:13: ^( POSITIVE_CLOSURE[op] block )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(POSITIVE_CLOSURE, op), root_1);

                        adaptor.addChild(root_1, stream_block.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 4 :
                    // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:291:7: '^'
                    {
                    char_literal121=(Token)match(input,ROOT,FOLLOW_ROOT_in_ebnf2073);  
                    stream_ROOT.add(char_literal121);



                    // AST REWRITE
                    // elements: ROOT, block
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 291:12: -> ^( '^' block )
                    {
                        // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:291:15: ^( '^' block )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_ROOT.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_block.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 5 :
                    // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:292:7: '!'
                    {
                    char_literal122=(Token)match(input,BANG,FOLLOW_BANG_in_ebnf2090);  
                    stream_BANG.add(char_literal122);



                    // AST REWRITE
                    // elements: block, BANG
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 292:12: -> ^( '!' block )
                    {
                        // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:292:15: ^( '!' block )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_BANG.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_block.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 6 :
                    // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:293:7: '=>'
                    {
                    string_literal123=(Token)match(input,88,FOLLOW_88_in_ebnf2107);  
                    stream_88.add(string_literal123);



                    // AST REWRITE
                    // elements: block
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 294:6: -> {gtype==COMBINED_GRAMMAR &&\r\n\t\t\t\t\t Character.isUpperCase($rule::name.charAt(0))}? ^( SYNPRED[\"=>\"] block )
                    if (gtype==COMBINED_GRAMMAR &&
                    					    Character.isUpperCase(((rule_scope)rule_stack.peek()).name.charAt(0))) {
                        // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:297:9: ^( SYNPRED[\"=>\"] block )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SYNPRED, "=>"), root_1);

                        adaptor.addChild(root_1, stream_block.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }
                    else // 299:6: -> SYN_SEMPRED
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(SYN_SEMPRED, "SYN_SEMPRED"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 7 :
                    // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:300:13: 
                    {

                    // AST REWRITE
                    // elements: block
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 300:13: -> block
                    {
                        adaptor.addChild(root_0, stream_block.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);


            	((CommonTree)retval.tree).getToken().setLine(firstToken.getLine());
            	((CommonTree)retval.tree).getToken().setCharPositionInLine(firstToken.getCharPositionInLine());

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "ebnf"

    public static class range_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "range"
    // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:304:1: range : c1= CHAR_LITERAL RANGE c2= CHAR_LITERAL -> ^( CHAR_RANGE[$c1,\"..\"] $c1 $c2) ;
    public final ANTLRv3Parser.range_return range() throws RecognitionException {
        ANTLRv3Parser.range_return retval = new ANTLRv3Parser.range_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token c1=null;
        Token c2=null;
        Token RANGE124=null;

        CommonTree c1_tree=null;
        CommonTree c2_tree=null;
        CommonTree RANGE124_tree=null;
        RewriteRuleTokenStream stream_RANGE=new RewriteRuleTokenStream(adaptor,"token RANGE");
        RewriteRuleTokenStream stream_CHAR_LITERAL=new RewriteRuleTokenStream(adaptor,"token CHAR_LITERAL");

        try {
            // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:305:2: (c1= CHAR_LITERAL RANGE c2= CHAR_LITERAL -> ^( CHAR_RANGE[$c1,\"..\"] $c1 $c2) )
            // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:305:4: c1= CHAR_LITERAL RANGE c2= CHAR_LITERAL
            {
            c1=(Token)match(input,CHAR_LITERAL,FOLLOW_CHAR_LITERAL_in_range2190);  
            stream_CHAR_LITERAL.add(c1);

            RANGE124=(Token)match(input,RANGE,FOLLOW_RANGE_in_range2192);  
            stream_RANGE.add(RANGE124);

            c2=(Token)match(input,CHAR_LITERAL,FOLLOW_CHAR_LITERAL_in_range2196);  
            stream_CHAR_LITERAL.add(c2);



            // AST REWRITE
            // elements: c2, c1
            // token labels: c1, c2
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleTokenStream stream_c1=new RewriteRuleTokenStream(adaptor,"token c1",c1);
            RewriteRuleTokenStream stream_c2=new RewriteRuleTokenStream(adaptor,"token c2",c2);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 305:42: -> ^( CHAR_RANGE[$c1,\"..\"] $c1 $c2)
            {
                // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:305:45: ^( CHAR_RANGE[$c1,\"..\"] $c1 $c2)
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CHAR_RANGE, c1, ".."), root_1);

                adaptor.addChild(root_1, stream_c1.nextNode());
                adaptor.addChild(root_1, stream_c2.nextNode());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "range"

    public static class terminal_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "terminal"
    // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:308:1: terminal : ( CHAR_LITERAL -> CHAR_LITERAL | TOKEN_REF ( ARG_ACTION -> ^( TOKEN_REF ARG_ACTION ) | -> TOKEN_REF ) | STRING_LITERAL -> STRING_LITERAL | '.' -> '.' ) ( '^' -> ^( '^' $terminal) | '!' -> ^( '!' $terminal) )? ;
    public final ANTLRv3Parser.terminal_return terminal() throws RecognitionException {
        ANTLRv3Parser.terminal_return retval = new ANTLRv3Parser.terminal_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token CHAR_LITERAL125=null;
        Token TOKEN_REF126=null;
        Token ARG_ACTION127=null;
        Token STRING_LITERAL128=null;
        Token char_literal129=null;
        Token char_literal130=null;
        Token char_literal131=null;

        CommonTree CHAR_LITERAL125_tree=null;
        CommonTree TOKEN_REF126_tree=null;
        CommonTree ARG_ACTION127_tree=null;
        CommonTree STRING_LITERAL128_tree=null;
        CommonTree char_literal129_tree=null;
        CommonTree char_literal130_tree=null;
        CommonTree char_literal131_tree=null;
        RewriteRuleTokenStream stream_STRING_LITERAL=new RewriteRuleTokenStream(adaptor,"token STRING_LITERAL");
        RewriteRuleTokenStream stream_BANG=new RewriteRuleTokenStream(adaptor,"token BANG");
        RewriteRuleTokenStream stream_92=new RewriteRuleTokenStream(adaptor,"token 92");
        RewriteRuleTokenStream stream_CHAR_LITERAL=new RewriteRuleTokenStream(adaptor,"token CHAR_LITERAL");
        RewriteRuleTokenStream stream_ROOT=new RewriteRuleTokenStream(adaptor,"token ROOT");
        RewriteRuleTokenStream stream_TOKEN_REF=new RewriteRuleTokenStream(adaptor,"token TOKEN_REF");
        RewriteRuleTokenStream stream_ARG_ACTION=new RewriteRuleTokenStream(adaptor,"token ARG_ACTION");

        try {
            // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:309:5: ( ( CHAR_LITERAL -> CHAR_LITERAL | TOKEN_REF ( ARG_ACTION -> ^( TOKEN_REF ARG_ACTION ) | -> TOKEN_REF ) | STRING_LITERAL -> STRING_LITERAL | '.' -> '.' ) ( '^' -> ^( '^' $terminal) | '!' -> ^( '!' $terminal) )? )
            // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:309:9: ( CHAR_LITERAL -> CHAR_LITERAL | TOKEN_REF ( ARG_ACTION -> ^( TOKEN_REF ARG_ACTION ) | -> TOKEN_REF ) | STRING_LITERAL -> STRING_LITERAL | '.' -> '.' ) ( '^' -> ^( '^' $terminal) | '!' -> ^( '!' $terminal) )?
            {
            // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:309:9: ( CHAR_LITERAL -> CHAR_LITERAL | TOKEN_REF ( ARG_ACTION -> ^( TOKEN_REF ARG_ACTION ) | -> TOKEN_REF ) | STRING_LITERAL -> STRING_LITERAL | '.' -> '.' )
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
                    new NoViableAltException("", 58, 0, input);

                throw nvae;
            }

            switch (alt58) {
                case 1 :
                    // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:309:11: CHAR_LITERAL
                    {
                    CHAR_LITERAL125=(Token)match(input,CHAR_LITERAL,FOLLOW_CHAR_LITERAL_in_terminal2227);  
                    stream_CHAR_LITERAL.add(CHAR_LITERAL125);



                    // AST REWRITE
                    // elements: CHAR_LITERAL
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 309:27: -> CHAR_LITERAL
                    {
                        adaptor.addChild(root_0, stream_CHAR_LITERAL.nextNode());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:311:7: TOKEN_REF ( ARG_ACTION -> ^( TOKEN_REF ARG_ACTION ) | -> TOKEN_REF )
                    {
                    TOKEN_REF126=(Token)match(input,TOKEN_REF,FOLLOW_TOKEN_REF_in_terminal2249);  
                    stream_TOKEN_REF.add(TOKEN_REF126);

                    // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:312:4: ( ARG_ACTION -> ^( TOKEN_REF ARG_ACTION ) | -> TOKEN_REF )
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
                            new NoViableAltException("", 57, 0, input);

                        throw nvae;
                    }
                    switch (alt57) {
                        case 1 :
                            // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:312:6: ARG_ACTION
                            {
                            ARG_ACTION127=(Token)match(input,ARG_ACTION,FOLLOW_ARG_ACTION_in_terminal2256);  
                            stream_ARG_ACTION.add(ARG_ACTION127);



                            // AST REWRITE
                            // elements: TOKEN_REF, ARG_ACTION
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (CommonTree)adaptor.nil();
                            // 312:20: -> ^( TOKEN_REF ARG_ACTION )
                            {
                                // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:312:23: ^( TOKEN_REF ARG_ACTION )
                                {
                                CommonTree root_1 = (CommonTree)adaptor.nil();
                                root_1 = (CommonTree)adaptor.becomeRoot(stream_TOKEN_REF.nextNode(), root_1);

                                adaptor.addChild(root_1, stream_ARG_ACTION.nextNode());

                                adaptor.addChild(root_0, root_1);
                                }

                            }

                            retval.tree = root_0;
                            }
                            break;
                        case 2 :
                            // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:313:12: 
                            {

                            // AST REWRITE
                            // elements: TOKEN_REF
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (CommonTree)adaptor.nil();
                            // 313:12: -> TOKEN_REF
                            {
                                adaptor.addChild(root_0, stream_TOKEN_REF.nextNode());

                            }

                            retval.tree = root_0;
                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:315:7: STRING_LITERAL
                    {
                    STRING_LITERAL128=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_terminal2295);  
                    stream_STRING_LITERAL.add(STRING_LITERAL128);



                    // AST REWRITE
                    // elements: STRING_LITERAL
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 315:25: -> STRING_LITERAL
                    {
                        adaptor.addChild(root_0, stream_STRING_LITERAL.nextNode());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 4 :
                    // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:316:7: '.'
                    {
                    char_literal129=(Token)match(input,92,FOLLOW_92_in_terminal2310);  
                    stream_92.add(char_literal129);



                    // AST REWRITE
                    // elements: 92
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 316:17: -> '.'
                    {
                        adaptor.addChild(root_0, stream_92.nextNode());

                    }

                    retval.tree = root_0;
                    }
                    break;

            }

            // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:318:3: ( '^' -> ^( '^' $terminal) | '!' -> ^( '!' $terminal) )?
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
                    // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:318:5: '^'
                    {
                    char_literal130=(Token)match(input,ROOT,FOLLOW_ROOT_in_terminal2331);  
                    stream_ROOT.add(char_literal130);



                    // AST REWRITE
                    // elements: ROOT, terminal
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 318:15: -> ^( '^' $terminal)
                    {
                        // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:318:18: ^( '^' $terminal)
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_ROOT.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_retval.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:319:5: '!'
                    {
                    char_literal131=(Token)match(input,BANG,FOLLOW_BANG_in_terminal2352);  
                    stream_BANG.add(char_literal131);



                    // AST REWRITE
                    // elements: BANG, terminal
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 319:15: -> ^( '!' $terminal)
                    {
                        // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:319:18: ^( '!' $terminal)
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_BANG.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_retval.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "terminal"

    public static class notTerminal_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "notTerminal"
    // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:323:1: notTerminal : ( CHAR_LITERAL | TOKEN_REF | STRING_LITERAL );
    public final ANTLRv3Parser.notTerminal_return notTerminal() throws RecognitionException {
        ANTLRv3Parser.notTerminal_return retval = new ANTLRv3Parser.notTerminal_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set132=null;

        CommonTree set132_tree=null;

        try {
            // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:324:2: ( CHAR_LITERAL | TOKEN_REF | STRING_LITERAL )
            // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:
            {
            root_0 = (CommonTree)adaptor.nil();

            set132=(Token)input.LT(1);
            if ( (input.LA(1)>=TOKEN_REF && input.LA(1)<=CHAR_LITERAL) ) {
                input.consume();
                adaptor.addChild(root_0, (CommonTree)adaptor.create(set132));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "notTerminal"

    public static class ebnfSuffix_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ebnfSuffix"
    // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:329:1: ebnfSuffix : ( '?' -> OPTIONAL[op] | '*' -> CLOSURE[op] | '+' -> POSITIVE_CLOSURE[op] );
    public final ANTLRv3Parser.ebnfSuffix_return ebnfSuffix() throws RecognitionException {
        ANTLRv3Parser.ebnfSuffix_return retval = new ANTLRv3Parser.ebnfSuffix_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal133=null;
        Token char_literal134=null;
        Token char_literal135=null;

        CommonTree char_literal133_tree=null;
        CommonTree char_literal134_tree=null;
        CommonTree char_literal135_tree=null;
        RewriteRuleTokenStream stream_91=new RewriteRuleTokenStream(adaptor,"token 91");
        RewriteRuleTokenStream stream_90=new RewriteRuleTokenStream(adaptor,"token 90");
        RewriteRuleTokenStream stream_74=new RewriteRuleTokenStream(adaptor,"token 74");


        	Token op = input.LT(1);

        try {
            // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:333:2: ( '?' -> OPTIONAL[op] | '*' -> CLOSURE[op] | '+' -> POSITIVE_CLOSURE[op] )
            int alt60=3;
            switch ( input.LA(1) ) {
            case 90:
                {
                alt60=1;
                }
                break;
            case 74:
                {
                alt60=2;
                }
                break;
            case 91:
                {
                alt60=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 60, 0, input);

                throw nvae;
            }

            switch (alt60) {
                case 1 :
                    // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:333:4: '?'
                    {
                    char_literal133=(Token)match(input,90,FOLLOW_90_in_ebnfSuffix2412);  
                    stream_90.add(char_literal133);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 333:8: -> OPTIONAL[op]
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(OPTIONAL, op));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:334:6: '*'
                    {
                    char_literal134=(Token)match(input,74,FOLLOW_74_in_ebnfSuffix2424);  
                    stream_74.add(char_literal134);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 334:10: -> CLOSURE[op]
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(CLOSURE, op));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:335:7: '+'
                    {
                    char_literal135=(Token)match(input,91,FOLLOW_91_in_ebnfSuffix2437);  
                    stream_91.add(char_literal135);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 335:11: -> POSITIVE_CLOSURE[op]
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(POSITIVE_CLOSURE, op));

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "ebnfSuffix"

    public static class rewrite_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "rewrite"
    // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:342:1: rewrite : ( (rew+= '->' preds+= SEMPRED predicated+= rewrite_alternative )* rew2= '->' last= rewrite_alternative -> ( ^( $rew $preds $predicated) )* ^( $rew2 $last) | );
    public final ANTLRv3Parser.rewrite_return rewrite() throws RecognitionException {
        ANTLRv3Parser.rewrite_return retval = new ANTLRv3Parser.rewrite_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token rew2=null;
        Token rew=null;
        Token preds=null;
        List list_rew=null;
        List list_preds=null;
        List list_predicated=null;
        ANTLRv3Parser.rewrite_alternative_return last = null;

        RuleReturnScope predicated = null;
        CommonTree rew2_tree=null;
        CommonTree rew_tree=null;
        CommonTree preds_tree=null;
        RewriteRuleTokenStream stream_SEMPRED=new RewriteRuleTokenStream(adaptor,"token SEMPRED");
        RewriteRuleTokenStream stream_REWRITE=new RewriteRuleTokenStream(adaptor,"token REWRITE");
        RewriteRuleSubtreeStream stream_rewrite_alternative=new RewriteRuleSubtreeStream(adaptor,"rule rewrite_alternative");

        	Token firstToken = input.LT(1);

        try {
            // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:346:2: ( (rew+= '->' preds+= SEMPRED predicated+= rewrite_alternative )* rew2= '->' last= rewrite_alternative -> ( ^( $rew $preds $predicated) )* ^( $rew2 $last) | )
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==REWRITE) ) {
                alt62=1;
            }
            else if ( (LA62_0==69||(LA62_0>=83 && LA62_0<=84)) ) {
                alt62=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 62, 0, input);

                throw nvae;
            }
            switch (alt62) {
                case 1 :
                    // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:346:4: (rew+= '->' preds+= SEMPRED predicated+= rewrite_alternative )* rew2= '->' last= rewrite_alternative
                    {
                    // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:346:4: (rew+= '->' preds+= SEMPRED predicated+= rewrite_alternative )*
                    loop61:
                    do {
                        int alt61=2;
                        int LA61_0 = input.LA(1);

                        if ( (LA61_0==REWRITE) ) {
                            int LA61_1 = input.LA(2);

                            if ( (LA61_1==SEMPRED) ) {
                                alt61=1;
                            }


                        }


                        switch (alt61) {
                    	case 1 :
                    	    // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:346:5: rew+= '->' preds+= SEMPRED predicated+= rewrite_alternative
                    	    {
                    	    rew=(Token)match(input,REWRITE,FOLLOW_REWRITE_in_rewrite2466);  
                    	    stream_REWRITE.add(rew);

                    	    if (list_rew==null) list_rew=new ArrayList();
                    	    list_rew.add(rew);

                    	    preds=(Token)match(input,SEMPRED,FOLLOW_SEMPRED_in_rewrite2470);  
                    	    stream_SEMPRED.add(preds);

                    	    if (list_preds==null) list_preds=new ArrayList();
                    	    list_preds.add(preds);

                    	    pushFollow(FOLLOW_rewrite_alternative_in_rewrite2474);
                    	    predicated=rewrite_alternative();

                    	    state._fsp--;

                    	    stream_rewrite_alternative.add(predicated.getTree());
                    	    if (list_predicated==null) list_predicated=new ArrayList();
                    	    list_predicated.add(predicated.getTree());


                    	    }
                    	    break;

                    	default :
                    	    break loop61;
                        }
                    } while (true);

                    rew2=(Token)match(input,REWRITE,FOLLOW_REWRITE_in_rewrite2482);  
                    stream_REWRITE.add(rew2);

                    pushFollow(FOLLOW_rewrite_alternative_in_rewrite2486);
                    last=rewrite_alternative();

                    state._fsp--;

                    stream_rewrite_alternative.add(last.getTree());


                    // AST REWRITE
                    // elements: last, rew2, predicated, rew, preds
                    // token labels: rew2
                    // rule labels: retval, last
                    // token list labels: rew, preds
                    // rule list labels: predicated
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_rew2=new RewriteRuleTokenStream(adaptor,"token rew2",rew2);
                    RewriteRuleTokenStream stream_rew=new RewriteRuleTokenStream(adaptor,"token rew", list_rew);
                    RewriteRuleTokenStream stream_preds=new RewriteRuleTokenStream(adaptor,"token preds", list_preds);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_last=new RewriteRuleSubtreeStream(adaptor,"rule last",last!=null?last.tree:null);
                    RewriteRuleSubtreeStream stream_predicated=new RewriteRuleSubtreeStream(adaptor,"token predicated",list_predicated);
                    root_0 = (CommonTree)adaptor.nil();
                    // 348:9: -> ( ^( $rew $preds $predicated) )* ^( $rew2 $last)
                    {
                        // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:348:12: ( ^( $rew $preds $predicated) )*
                        while ( stream_predicated.hasNext()||stream_rew.hasNext()||stream_preds.hasNext() ) {
                            // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:348:12: ^( $rew $preds $predicated)
                            {
                            CommonTree root_1 = (CommonTree)adaptor.nil();
                            root_1 = (CommonTree)adaptor.becomeRoot(stream_rew.nextNode(), root_1);

                            adaptor.addChild(root_1, stream_preds.nextNode());
                            adaptor.addChild(root_1, stream_predicated.nextTree());

                            adaptor.addChild(root_0, root_1);
                            }

                        }
                        stream_predicated.reset();
                        stream_rew.reset();
                        stream_preds.reset();
                        // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:348:40: ^( $rew2 $last)
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_rew2.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_last.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:350:2: 
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "rewrite"

    public static class rewrite_alternative_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "rewrite_alternative"
    // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:352:1: rewrite_alternative : ( rewrite_template | rewrite_tree_alternative | -> ^( ALT[\"ALT\"] EPSILON[\"EPSILON\"] EOA[\"EOA\"] ) );
    public final ANTLRv3Parser.rewrite_alternative_return rewrite_alternative() throws RecognitionException {
        ANTLRv3Parser.rewrite_alternative_return retval = new ANTLRv3Parser.rewrite_alternative_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        ANTLRv3Parser.rewrite_template_return rewrite_template136 = null;

        ANTLRv3Parser.rewrite_tree_alternative_return rewrite_tree_alternative137 = null;



        try {
            // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:353:2: ( rewrite_template | rewrite_tree_alternative | -> ^( ALT[\"ALT\"] EPSILON[\"EPSILON\"] EOA[\"EOA\"] ) )
            int alt63=3;
            alt63 = dfa63.predict(input);
            switch (alt63) {
                case 1 :
                    // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:353:4: rewrite_template
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_rewrite_template_in_rewrite_alternative2530);
                    rewrite_template136=rewrite_template();

                    state._fsp--;

                    adaptor.addChild(root_0, rewrite_template136.getTree());

                    }
                    break;
                case 2 :
                    // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:354:4: rewrite_tree_alternative
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_rewrite_tree_alternative_in_rewrite_alternative2535);
                    rewrite_tree_alternative137=rewrite_tree_alternative();

                    state._fsp--;

                    adaptor.addChild(root_0, rewrite_tree_alternative137.getTree());

                    }
                    break;
                case 3 :
                    // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:355:29: 
                    {

                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 355:29: -> ^( ALT[\"ALT\"] EPSILON[\"EPSILON\"] EOA[\"EOA\"] )
                    {
                        // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:355:32: ^( ALT[\"ALT\"] EPSILON[\"EPSILON\"] EOA[\"EOA\"] )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ALT, "ALT"), root_1);

                        adaptor.addChild(root_1, (CommonTree)adaptor.create(EPSILON, "EPSILON"));
                        adaptor.addChild(root_1, (CommonTree)adaptor.create(EOA, "EOA"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "rewrite_alternative"

    public static class rewrite_template_block_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "rewrite_template_block"
    // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:358:1: rewrite_template_block : lp= '(' rewrite_template ')' -> ^( BLOCK[$lp,\"BLOCK\"] rewrite_template EOB[$lp,\"EOB\"] ) ;
    public final ANTLRv3Parser.rewrite_template_block_return rewrite_template_block() throws RecognitionException {
        ANTLRv3Parser.rewrite_template_block_return retval = new ANTLRv3Parser.rewrite_template_block_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token lp=null;
        Token char_literal139=null;
        ANTLRv3Parser.rewrite_template_return rewrite_template138 = null;


        CommonTree lp_tree=null;
        CommonTree char_literal139_tree=null;
        RewriteRuleTokenStream stream_82=new RewriteRuleTokenStream(adaptor,"token 82");
        RewriteRuleTokenStream stream_84=new RewriteRuleTokenStream(adaptor,"token 84");
        RewriteRuleSubtreeStream stream_rewrite_template=new RewriteRuleSubtreeStream(adaptor,"rule rewrite_template");
        try {
            // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:359:5: (lp= '(' rewrite_template ')' -> ^( BLOCK[$lp,\"BLOCK\"] rewrite_template EOB[$lp,\"EOB\"] ) )
            // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:359:9: lp= '(' rewrite_template ')'
            {
            lp=(Token)match(input,82,FOLLOW_82_in_rewrite_template_block2577);  
            stream_82.add(lp);

            pushFollow(FOLLOW_rewrite_template_in_rewrite_template_block2579);
            rewrite_template138=rewrite_template();

            state._fsp--;

            stream_rewrite_template.add(rewrite_template138.getTree());
            char_literal139=(Token)match(input,84,FOLLOW_84_in_rewrite_template_block2581);  
            stream_84.add(char_literal139);



            // AST REWRITE
            // elements: rewrite_template
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 359:37: -> ^( BLOCK[$lp,\"BLOCK\"] rewrite_template EOB[$lp,\"EOB\"] )
            {
                // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:359:40: ^( BLOCK[$lp,\"BLOCK\"] rewrite_template EOB[$lp,\"EOB\"] )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BLOCK, lp, "BLOCK"), root_1);

                adaptor.addChild(root_1, stream_rewrite_template.nextTree());
                adaptor.addChild(root_1, (CommonTree)adaptor.create(EOB, lp, "EOB"));

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "rewrite_template_block"

    public static class rewrite_tree_block_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "rewrite_tree_block"
    // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:362:1: rewrite_tree_block : lp= '(' rewrite_tree_alternative ')' -> ^( BLOCK[$lp,\"BLOCK\"] rewrite_tree_alternative EOB[$lp,\"EOB\"] ) ;
    public final ANTLRv3Parser.rewrite_tree_block_return rewrite_tree_block() throws RecognitionException {
        ANTLRv3Parser.rewrite_tree_block_return retval = new ANTLRv3Parser.rewrite_tree_block_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token lp=null;
        Token char_literal141=null;
        ANTLRv3Parser.rewrite_tree_alternative_return rewrite_tree_alternative140 = null;


        CommonTree lp_tree=null;
        CommonTree char_literal141_tree=null;
        RewriteRuleTokenStream stream_82=new RewriteRuleTokenStream(adaptor,"token 82");
        RewriteRuleTokenStream stream_84=new RewriteRuleTokenStream(adaptor,"token 84");
        RewriteRuleSubtreeStream stream_rewrite_tree_alternative=new RewriteRuleSubtreeStream(adaptor,"rule rewrite_tree_alternative");
        try {
            // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:363:5: (lp= '(' rewrite_tree_alternative ')' -> ^( BLOCK[$lp,\"BLOCK\"] rewrite_tree_alternative EOB[$lp,\"EOB\"] ) )
            // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:363:9: lp= '(' rewrite_tree_alternative ')'
            {
            lp=(Token)match(input,82,FOLLOW_82_in_rewrite_tree_block2614);  
            stream_82.add(lp);

            pushFollow(FOLLOW_rewrite_tree_alternative_in_rewrite_tree_block2616);
            rewrite_tree_alternative140=rewrite_tree_alternative();

            state._fsp--;

            stream_rewrite_tree_alternative.add(rewrite_tree_alternative140.getTree());
            char_literal141=(Token)match(input,84,FOLLOW_84_in_rewrite_tree_block2618);  
            stream_84.add(char_literal141);



            // AST REWRITE
            // elements: rewrite_tree_alternative
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 364:6: -> ^( BLOCK[$lp,\"BLOCK\"] rewrite_tree_alternative EOB[$lp,\"EOB\"] )
            {
                // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:364:9: ^( BLOCK[$lp,\"BLOCK\"] rewrite_tree_alternative EOB[$lp,\"EOB\"] )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BLOCK, lp, "BLOCK"), root_1);

                adaptor.addChild(root_1, stream_rewrite_tree_alternative.nextTree());
                adaptor.addChild(root_1, (CommonTree)adaptor.create(EOB, lp, "EOB"));

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "rewrite_tree_block"

    public static class rewrite_tree_alternative_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "rewrite_tree_alternative"
    // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:367:1: rewrite_tree_alternative : ( rewrite_tree_element )+ -> ^( ALT[\"ALT\"] ( rewrite_tree_element )+ EOA[\"EOA\"] ) ;
    public final ANTLRv3Parser.rewrite_tree_alternative_return rewrite_tree_alternative() throws RecognitionException {
        ANTLRv3Parser.rewrite_tree_alternative_return retval = new ANTLRv3Parser.rewrite_tree_alternative_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        ANTLRv3Parser.rewrite_tree_element_return rewrite_tree_element142 = null;


        RewriteRuleSubtreeStream stream_rewrite_tree_element=new RewriteRuleSubtreeStream(adaptor,"rule rewrite_tree_element");
        try {
            // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:368:5: ( ( rewrite_tree_element )+ -> ^( ALT[\"ALT\"] ( rewrite_tree_element )+ EOA[\"EOA\"] ) )
            // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:368:7: ( rewrite_tree_element )+
            {
            // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:368:7: ( rewrite_tree_element )+
            int cnt64=0;
            loop64:
            do {
                int alt64=2;
                int LA64_0 = input.LA(1);

                if ( (LA64_0==TREE_BEGIN||(LA64_0>=TOKEN_REF && LA64_0<=ACTION)||LA64_0==RULE_REF||LA64_0==82||LA64_0==93) ) {
                    alt64=1;
                }


                switch (alt64) {
            	case 1 :
            	    // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:368:7: rewrite_tree_element
            	    {
            	    pushFollow(FOLLOW_rewrite_tree_element_in_rewrite_tree_alternative2652);
            	    rewrite_tree_element142=rewrite_tree_element();

            	    state._fsp--;

            	    stream_rewrite_tree_element.add(rewrite_tree_element142.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt64 >= 1 ) break loop64;
                        EarlyExitException eee =
                            new EarlyExitException(64, input);
                        throw eee;
                }
                cnt64++;
            } while (true);



            // AST REWRITE
            // elements: rewrite_tree_element
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 368:29: -> ^( ALT[\"ALT\"] ( rewrite_tree_element )+ EOA[\"EOA\"] )
            {
                // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:368:32: ^( ALT[\"ALT\"] ( rewrite_tree_element )+ EOA[\"EOA\"] )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ALT, "ALT"), root_1);

                if ( !(stream_rewrite_tree_element.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_rewrite_tree_element.hasNext() ) {
                    adaptor.addChild(root_1, stream_rewrite_tree_element.nextTree());

                }
                stream_rewrite_tree_element.reset();
                adaptor.addChild(root_1, (CommonTree)adaptor.create(EOA, "EOA"));

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "rewrite_tree_alternative"

    public static class rewrite_tree_element_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "rewrite_tree_element"
    // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:371:1: rewrite_tree_element : ( rewrite_tree_atom | rewrite_tree_atom ebnfSuffix -> ^( ebnfSuffix ^( BLOCK[\"BLOCK\"] ^( ALT[\"ALT\"] rewrite_tree_atom EOA[\"EOA\"] ) EOB[\"EOB\"] ) ) | rewrite_tree ( ebnfSuffix -> ^( BLOCK[\"BLOCK\"] ^( ALT[\"ALT\"] rewrite_tree EOA[\"EOA\"] ) EOB[\"EOB\"] ) | -> rewrite_tree ) | rewrite_tree_ebnf );
    public final ANTLRv3Parser.rewrite_tree_element_return rewrite_tree_element() throws RecognitionException {
        ANTLRv3Parser.rewrite_tree_element_return retval = new ANTLRv3Parser.rewrite_tree_element_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        ANTLRv3Parser.rewrite_tree_atom_return rewrite_tree_atom143 = null;

        ANTLRv3Parser.rewrite_tree_atom_return rewrite_tree_atom144 = null;

        ANTLRv3Parser.ebnfSuffix_return ebnfSuffix145 = null;

        ANTLRv3Parser.rewrite_tree_return rewrite_tree146 = null;

        ANTLRv3Parser.ebnfSuffix_return ebnfSuffix147 = null;

        ANTLRv3Parser.rewrite_tree_ebnf_return rewrite_tree_ebnf148 = null;


        RewriteRuleSubtreeStream stream_rewrite_tree=new RewriteRuleSubtreeStream(adaptor,"rule rewrite_tree");
        RewriteRuleSubtreeStream stream_ebnfSuffix=new RewriteRuleSubtreeStream(adaptor,"rule ebnfSuffix");
        RewriteRuleSubtreeStream stream_rewrite_tree_atom=new RewriteRuleSubtreeStream(adaptor,"rule rewrite_tree_atom");
        try {
            // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:372:2: ( rewrite_tree_atom | rewrite_tree_atom ebnfSuffix -> ^( ebnfSuffix ^( BLOCK[\"BLOCK\"] ^( ALT[\"ALT\"] rewrite_tree_atom EOA[\"EOA\"] ) EOB[\"EOB\"] ) ) | rewrite_tree ( ebnfSuffix -> ^( BLOCK[\"BLOCK\"] ^( ALT[\"ALT\"] rewrite_tree EOA[\"EOA\"] ) EOB[\"EOB\"] ) | -> rewrite_tree ) | rewrite_tree_ebnf )
            int alt66=4;
            alt66 = dfa66.predict(input);
            switch (alt66) {
                case 1 :
                    // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:372:4: rewrite_tree_atom
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_rewrite_tree_atom_in_rewrite_tree_element2680);
                    rewrite_tree_atom143=rewrite_tree_atom();

                    state._fsp--;

                    adaptor.addChild(root_0, rewrite_tree_atom143.getTree());

                    }
                    break;
                case 2 :
                    // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:373:4: rewrite_tree_atom ebnfSuffix
                    {
                    pushFollow(FOLLOW_rewrite_tree_atom_in_rewrite_tree_element2685);
                    rewrite_tree_atom144=rewrite_tree_atom();

                    state._fsp--;

                    stream_rewrite_tree_atom.add(rewrite_tree_atom144.getTree());
                    pushFollow(FOLLOW_ebnfSuffix_in_rewrite_tree_element2687);
                    ebnfSuffix145=ebnfSuffix();

                    state._fsp--;

                    stream_ebnfSuffix.add(ebnfSuffix145.getTree());


                    // AST REWRITE
                    // elements: rewrite_tree_atom, ebnfSuffix
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 374:3: -> ^( ebnfSuffix ^( BLOCK[\"BLOCK\"] ^( ALT[\"ALT\"] rewrite_tree_atom EOA[\"EOA\"] ) EOB[\"EOB\"] ) )
                    {
                        // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:374:6: ^( ebnfSuffix ^( BLOCK[\"BLOCK\"] ^( ALT[\"ALT\"] rewrite_tree_atom EOA[\"EOA\"] ) EOB[\"EOB\"] ) )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_ebnfSuffix.nextNode(), root_1);

                        // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:374:20: ^( BLOCK[\"BLOCK\"] ^( ALT[\"ALT\"] rewrite_tree_atom EOA[\"EOA\"] ) EOB[\"EOB\"] )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BLOCK, "BLOCK"), root_2);

                        // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:374:37: ^( ALT[\"ALT\"] rewrite_tree_atom EOA[\"EOA\"] )
                        {
                        CommonTree root_3 = (CommonTree)adaptor.nil();
                        root_3 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ALT, "ALT"), root_3);

                        adaptor.addChild(root_3, stream_rewrite_tree_atom.nextTree());
                        adaptor.addChild(root_3, (CommonTree)adaptor.create(EOA, "EOA"));

                        adaptor.addChild(root_2, root_3);
                        }
                        adaptor.addChild(root_2, (CommonTree)adaptor.create(EOB, "EOB"));

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:375:6: rewrite_tree ( ebnfSuffix -> ^( BLOCK[\"BLOCK\"] ^( ALT[\"ALT\"] rewrite_tree EOA[\"EOA\"] ) EOB[\"EOB\"] ) | -> rewrite_tree )
                    {
                    pushFollow(FOLLOW_rewrite_tree_in_rewrite_tree_element2721);
                    rewrite_tree146=rewrite_tree();

                    state._fsp--;

                    stream_rewrite_tree.add(rewrite_tree146.getTree());
                    // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:376:3: ( ebnfSuffix -> ^( BLOCK[\"BLOCK\"] ^( ALT[\"ALT\"] rewrite_tree EOA[\"EOA\"] ) EOB[\"EOB\"] ) | -> rewrite_tree )
                    int alt65=2;
                    int LA65_0 = input.LA(1);

                    if ( (LA65_0==74||(LA65_0>=90 && LA65_0<=91)) ) {
                        alt65=1;
                    }
                    else if ( (LA65_0==TREE_BEGIN||LA65_0==REWRITE||(LA65_0>=TOKEN_REF && LA65_0<=ACTION)||LA65_0==RULE_REF||LA65_0==69||(LA65_0>=82 && LA65_0<=84)||LA65_0==93) ) {
                        alt65=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 65, 0, input);

                        throw nvae;
                    }
                    switch (alt65) {
                        case 1 :
                            // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:376:5: ebnfSuffix
                            {
                            pushFollow(FOLLOW_ebnfSuffix_in_rewrite_tree_element2727);
                            ebnfSuffix147=ebnfSuffix();

                            state._fsp--;

                            stream_ebnfSuffix.add(ebnfSuffix147.getTree());


                            // AST REWRITE
                            // elements: rewrite_tree
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (CommonTree)adaptor.nil();
                            // 377:4: -> ^( BLOCK[\"BLOCK\"] ^( ALT[\"ALT\"] rewrite_tree EOA[\"EOA\"] ) EOB[\"EOB\"] )
                            {
                                // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:377:7: ^( BLOCK[\"BLOCK\"] ^( ALT[\"ALT\"] rewrite_tree EOA[\"EOA\"] ) EOB[\"EOB\"] )
                                {
                                CommonTree root_1 = (CommonTree)adaptor.nil();
                                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BLOCK, "BLOCK"), root_1);

                                // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:377:24: ^( ALT[\"ALT\"] rewrite_tree EOA[\"EOA\"] )
                                {
                                CommonTree root_2 = (CommonTree)adaptor.nil();
                                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ALT, "ALT"), root_2);

                                adaptor.addChild(root_2, stream_rewrite_tree.nextTree());
                                adaptor.addChild(root_2, (CommonTree)adaptor.create(EOA, "EOA"));

                                adaptor.addChild(root_1, root_2);
                                }
                                adaptor.addChild(root_1, (CommonTree)adaptor.create(EOB, "EOB"));

                                adaptor.addChild(root_0, root_1);
                                }

                            }

                            retval.tree = root_0;
                            }
                            break;
                        case 2 :
                            // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:378:5: 
                            {

                            // AST REWRITE
                            // elements: rewrite_tree
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (CommonTree)adaptor.nil();
                            // 378:5: -> rewrite_tree
                            {
                                adaptor.addChild(root_0, stream_rewrite_tree.nextTree());

                            }

                            retval.tree = root_0;
                            }
                            break;

                    }


                    }
                    break;
                case 4 :
                    // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:380:6: rewrite_tree_ebnf
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_rewrite_tree_ebnf_in_rewrite_tree_element2769);
                    rewrite_tree_ebnf148=rewrite_tree_ebnf();

                    state._fsp--;

                    adaptor.addChild(root_0, rewrite_tree_ebnf148.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "rewrite_tree_element"

    public static class rewrite_tree_atom_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "rewrite_tree_atom"
    // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:383:1: rewrite_tree_atom : ( CHAR_LITERAL | TOKEN_REF ( ARG_ACTION )? -> ^( TOKEN_REF ( ARG_ACTION )? ) | RULE_REF | STRING_LITERAL | d= '$' id -> LABEL[$d,$id.text] | ACTION );
    public final ANTLRv3Parser.rewrite_tree_atom_return rewrite_tree_atom() throws RecognitionException {
        ANTLRv3Parser.rewrite_tree_atom_return retval = new ANTLRv3Parser.rewrite_tree_atom_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token d=null;
        Token CHAR_LITERAL149=null;
        Token TOKEN_REF150=null;
        Token ARG_ACTION151=null;
        Token RULE_REF152=null;
        Token STRING_LITERAL153=null;
        Token ACTION155=null;
        ANTLRv3Parser.id_return id154 = null;


        CommonTree d_tree=null;
        CommonTree CHAR_LITERAL149_tree=null;
        CommonTree TOKEN_REF150_tree=null;
        CommonTree ARG_ACTION151_tree=null;
        CommonTree RULE_REF152_tree=null;
        CommonTree STRING_LITERAL153_tree=null;
        CommonTree ACTION155_tree=null;
        RewriteRuleTokenStream stream_93=new RewriteRuleTokenStream(adaptor,"token 93");
        RewriteRuleTokenStream stream_TOKEN_REF=new RewriteRuleTokenStream(adaptor,"token TOKEN_REF");
        RewriteRuleTokenStream stream_ARG_ACTION=new RewriteRuleTokenStream(adaptor,"token ARG_ACTION");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        try {
            // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:384:5: ( CHAR_LITERAL | TOKEN_REF ( ARG_ACTION )? -> ^( TOKEN_REF ( ARG_ACTION )? ) | RULE_REF | STRING_LITERAL | d= '$' id -> LABEL[$d,$id.text] | ACTION )
            int alt68=6;
            switch ( input.LA(1) ) {
            case CHAR_LITERAL:
                {
                alt68=1;
                }
                break;
            case TOKEN_REF:
                {
                alt68=2;
                }
                break;
            case RULE_REF:
                {
                alt68=3;
                }
                break;
            case STRING_LITERAL:
                {
                alt68=4;
                }
                break;
            case 93:
                {
                alt68=5;
                }
                break;
            case ACTION:
                {
                alt68=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 68, 0, input);

                throw nvae;
            }

            switch (alt68) {
                case 1 :
                    // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:384:9: CHAR_LITERAL
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    CHAR_LITERAL149=(Token)match(input,CHAR_LITERAL,FOLLOW_CHAR_LITERAL_in_rewrite_tree_atom2785); 
                    CHAR_LITERAL149_tree = (CommonTree)adaptor.create(CHAR_LITERAL149);
                    adaptor.addChild(root_0, CHAR_LITERAL149_tree);


                    }
                    break;
                case 2 :
                    // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:385:6: TOKEN_REF ( ARG_ACTION )?
                    {
                    TOKEN_REF150=(Token)match(input,TOKEN_REF,FOLLOW_TOKEN_REF_in_rewrite_tree_atom2792);  
                    stream_TOKEN_REF.add(TOKEN_REF150);

                    // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:385:16: ( ARG_ACTION )?
                    int alt67=2;
                    int LA67_0 = input.LA(1);

                    if ( (LA67_0==ARG_ACTION) ) {
                        alt67=1;
                    }
                    switch (alt67) {
                        case 1 :
                            // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:385:16: ARG_ACTION
                            {
                            ARG_ACTION151=(Token)match(input,ARG_ACTION,FOLLOW_ARG_ACTION_in_rewrite_tree_atom2794);  
                            stream_ARG_ACTION.add(ARG_ACTION151);


                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: TOKEN_REF, ARG_ACTION
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 385:28: -> ^( TOKEN_REF ( ARG_ACTION )? )
                    {
                        // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:385:31: ^( TOKEN_REF ( ARG_ACTION )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_TOKEN_REF.nextNode(), root_1);

                        // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:385:43: ( ARG_ACTION )?
                        if ( stream_ARG_ACTION.hasNext() ) {
                            adaptor.addChild(root_1, stream_ARG_ACTION.nextNode());

                        }
                        stream_ARG_ACTION.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:386:9: RULE_REF
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    RULE_REF152=(Token)match(input,RULE_REF,FOLLOW_RULE_REF_in_rewrite_tree_atom2815); 
                    RULE_REF152_tree = (CommonTree)adaptor.create(RULE_REF152);
                    adaptor.addChild(root_0, RULE_REF152_tree);


                    }
                    break;
                case 4 :
                    // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:387:6: STRING_LITERAL
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    STRING_LITERAL153=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_rewrite_tree_atom2822); 
                    STRING_LITERAL153_tree = (CommonTree)adaptor.create(STRING_LITERAL153);
                    adaptor.addChild(root_0, STRING_LITERAL153_tree);


                    }
                    break;
                case 5 :
                    // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:388:6: d= '$' id
                    {
                    d=(Token)match(input,93,FOLLOW_93_in_rewrite_tree_atom2831);  
                    stream_93.add(d);

                    pushFollow(FOLLOW_id_in_rewrite_tree_atom2833);
                    id154=id();

                    state._fsp--;

                    stream_id.add(id154.getTree());


                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 388:15: -> LABEL[$d,$id.text]
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(LABEL, d, (id154!=null?input.toString(id154.start,id154.stop):null)));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 6 :
                    // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:389:4: ACTION
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    ACTION155=(Token)match(input,ACTION,FOLLOW_ACTION_in_rewrite_tree_atom2844); 
                    ACTION155_tree = (CommonTree)adaptor.create(ACTION155);
                    adaptor.addChild(root_0, ACTION155_tree);


                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "rewrite_tree_atom"

    public static class rewrite_tree_ebnf_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "rewrite_tree_ebnf"
    // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:392:1: rewrite_tree_ebnf : rewrite_tree_block ebnfSuffix -> ^( ebnfSuffix rewrite_tree_block ) ;
    public final ANTLRv3Parser.rewrite_tree_ebnf_return rewrite_tree_ebnf() throws RecognitionException {
        ANTLRv3Parser.rewrite_tree_ebnf_return retval = new ANTLRv3Parser.rewrite_tree_ebnf_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        ANTLRv3Parser.rewrite_tree_block_return rewrite_tree_block156 = null;

        ANTLRv3Parser.ebnfSuffix_return ebnfSuffix157 = null;


        RewriteRuleSubtreeStream stream_ebnfSuffix=new RewriteRuleSubtreeStream(adaptor,"rule ebnfSuffix");
        RewriteRuleSubtreeStream stream_rewrite_tree_block=new RewriteRuleSubtreeStream(adaptor,"rule rewrite_tree_block");

            Token firstToken = input.LT(1);

        try {
            // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:400:2: ( rewrite_tree_block ebnfSuffix -> ^( ebnfSuffix rewrite_tree_block ) )
            // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:400:4: rewrite_tree_block ebnfSuffix
            {
            pushFollow(FOLLOW_rewrite_tree_block_in_rewrite_tree_ebnf2865);
            rewrite_tree_block156=rewrite_tree_block();

            state._fsp--;

            stream_rewrite_tree_block.add(rewrite_tree_block156.getTree());
            pushFollow(FOLLOW_ebnfSuffix_in_rewrite_tree_ebnf2867);
            ebnfSuffix157=ebnfSuffix();

            state._fsp--;

            stream_ebnfSuffix.add(ebnfSuffix157.getTree());


            // AST REWRITE
            // elements: ebnfSuffix, rewrite_tree_block
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 400:34: -> ^( ebnfSuffix rewrite_tree_block )
            {
                // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:400:37: ^( ebnfSuffix rewrite_tree_block )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_ebnfSuffix.nextNode(), root_1);

                adaptor.addChild(root_1, stream_rewrite_tree_block.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);


            	((CommonTree)retval.tree).getToken().setLine(firstToken.getLine());
            	((CommonTree)retval.tree).getToken().setCharPositionInLine(firstToken.getCharPositionInLine());

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "rewrite_tree_ebnf"

    public static class rewrite_tree_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "rewrite_tree"
    // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:403:1: rewrite_tree : '^(' rewrite_tree_atom ( rewrite_tree_element )* ')' -> ^( TREE_BEGIN rewrite_tree_atom ( rewrite_tree_element )* ) ;
    public final ANTLRv3Parser.rewrite_tree_return rewrite_tree() throws RecognitionException {
        ANTLRv3Parser.rewrite_tree_return retval = new ANTLRv3Parser.rewrite_tree_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal158=null;
        Token char_literal161=null;
        ANTLRv3Parser.rewrite_tree_atom_return rewrite_tree_atom159 = null;

        ANTLRv3Parser.rewrite_tree_element_return rewrite_tree_element160 = null;


        CommonTree string_literal158_tree=null;
        CommonTree char_literal161_tree=null;
        RewriteRuleTokenStream stream_TREE_BEGIN=new RewriteRuleTokenStream(adaptor,"token TREE_BEGIN");
        RewriteRuleTokenStream stream_84=new RewriteRuleTokenStream(adaptor,"token 84");
        RewriteRuleSubtreeStream stream_rewrite_tree_element=new RewriteRuleSubtreeStream(adaptor,"rule rewrite_tree_element");
        RewriteRuleSubtreeStream stream_rewrite_tree_atom=new RewriteRuleSubtreeStream(adaptor,"rule rewrite_tree_atom");
        try {
            // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:404:2: ( '^(' rewrite_tree_atom ( rewrite_tree_element )* ')' -> ^( TREE_BEGIN rewrite_tree_atom ( rewrite_tree_element )* ) )
            // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:404:4: '^(' rewrite_tree_atom ( rewrite_tree_element )* ')'
            {
            string_literal158=(Token)match(input,TREE_BEGIN,FOLLOW_TREE_BEGIN_in_rewrite_tree2887);  
            stream_TREE_BEGIN.add(string_literal158);

            pushFollow(FOLLOW_rewrite_tree_atom_in_rewrite_tree2889);
            rewrite_tree_atom159=rewrite_tree_atom();

            state._fsp--;

            stream_rewrite_tree_atom.add(rewrite_tree_atom159.getTree());
            // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:404:27: ( rewrite_tree_element )*
            loop69:
            do {
                int alt69=2;
                int LA69_0 = input.LA(1);

                if ( (LA69_0==TREE_BEGIN||(LA69_0>=TOKEN_REF && LA69_0<=ACTION)||LA69_0==RULE_REF||LA69_0==82||LA69_0==93) ) {
                    alt69=1;
                }


                switch (alt69) {
            	case 1 :
            	    // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:404:27: rewrite_tree_element
            	    {
            	    pushFollow(FOLLOW_rewrite_tree_element_in_rewrite_tree2891);
            	    rewrite_tree_element160=rewrite_tree_element();

            	    state._fsp--;

            	    stream_rewrite_tree_element.add(rewrite_tree_element160.getTree());

            	    }
            	    break;

            	default :
            	    break loop69;
                }
            } while (true);

            char_literal161=(Token)match(input,84,FOLLOW_84_in_rewrite_tree2894);  
            stream_84.add(char_literal161);



            // AST REWRITE
            // elements: rewrite_tree_atom, rewrite_tree_element
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 405:3: -> ^( TREE_BEGIN rewrite_tree_atom ( rewrite_tree_element )* )
            {
                // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:405:6: ^( TREE_BEGIN rewrite_tree_atom ( rewrite_tree_element )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TREE_BEGIN, "TREE_BEGIN"), root_1);

                adaptor.addChild(root_1, stream_rewrite_tree_atom.nextTree());
                // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:405:37: ( rewrite_tree_element )*
                while ( stream_rewrite_tree_element.hasNext() ) {
                    adaptor.addChild(root_1, stream_rewrite_tree_element.nextTree());

                }
                stream_rewrite_tree_element.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "rewrite_tree"

    public static class rewrite_template_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "rewrite_template"
    // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:408:1: rewrite_template : ({...}? id lp= '(' rewrite_template_args ')' st= ( DOUBLE_QUOTE_STRING_LITERAL | DOUBLE_ANGLE_STRING_LITERAL ) -> ^( TEMPLATE[$lp,\"TEMPLATE\"] id rewrite_template_args $st) | rewrite_template_ref | rewrite_indirect_template_head | ACTION );
    public final ANTLRv3Parser.rewrite_template_return rewrite_template() throws RecognitionException {
        ANTLRv3Parser.rewrite_template_return retval = new ANTLRv3Parser.rewrite_template_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token lp=null;
        Token st=null;
        Token char_literal164=null;
        Token DOUBLE_QUOTE_STRING_LITERAL165=null;
        Token DOUBLE_ANGLE_STRING_LITERAL166=null;
        Token ACTION169=null;
        ANTLRv3Parser.id_return id162 = null;

        ANTLRv3Parser.rewrite_template_args_return rewrite_template_args163 = null;

        ANTLRv3Parser.rewrite_template_ref_return rewrite_template_ref167 = null;

        ANTLRv3Parser.rewrite_indirect_template_head_return rewrite_indirect_template_head168 = null;


        CommonTree lp_tree=null;
        CommonTree st_tree=null;
        CommonTree char_literal164_tree=null;
        CommonTree DOUBLE_QUOTE_STRING_LITERAL165_tree=null;
        CommonTree DOUBLE_ANGLE_STRING_LITERAL166_tree=null;
        CommonTree ACTION169_tree=null;
        RewriteRuleTokenStream stream_DOUBLE_QUOTE_STRING_LITERAL=new RewriteRuleTokenStream(adaptor,"token DOUBLE_QUOTE_STRING_LITERAL");
        RewriteRuleTokenStream stream_82=new RewriteRuleTokenStream(adaptor,"token 82");
        RewriteRuleTokenStream stream_DOUBLE_ANGLE_STRING_LITERAL=new RewriteRuleTokenStream(adaptor,"token DOUBLE_ANGLE_STRING_LITERAL");
        RewriteRuleTokenStream stream_84=new RewriteRuleTokenStream(adaptor,"token 84");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        RewriteRuleSubtreeStream stream_rewrite_template_args=new RewriteRuleSubtreeStream(adaptor,"rule rewrite_template_args");
        try {
            // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:420:2: ({...}? id lp= '(' rewrite_template_args ')' st= ( DOUBLE_QUOTE_STRING_LITERAL | DOUBLE_ANGLE_STRING_LITERAL ) -> ^( TEMPLATE[$lp,\"TEMPLATE\"] id rewrite_template_args $st) | rewrite_template_ref | rewrite_indirect_template_head | ACTION )
            int alt71=4;
            alt71 = dfa71.predict(input);
            switch (alt71) {
                case 1 :
                    // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:421:3: {...}? id lp= '(' rewrite_template_args ')' st= ( DOUBLE_QUOTE_STRING_LITERAL | DOUBLE_ANGLE_STRING_LITERAL )
                    {
                    if ( !((input.LT(1).getText().equals("template"))) ) {
                        throw new FailedPredicateException(input, "rewrite_template", "input.LT(1).getText().equals(\"template\")");
                    }
                    pushFollow(FOLLOW_id_in_rewrite_template2930);
                    id162=id();

                    state._fsp--;

                    stream_id.add(id162.getTree());
                    lp=(Token)match(input,82,FOLLOW_82_in_rewrite_template2934);  
                    stream_82.add(lp);

                    pushFollow(FOLLOW_rewrite_template_args_in_rewrite_template2936);
                    rewrite_template_args163=rewrite_template_args();

                    state._fsp--;

                    stream_rewrite_template_args.add(rewrite_template_args163.getTree());
                    char_literal164=(Token)match(input,84,FOLLOW_84_in_rewrite_template2938);  
                    stream_84.add(char_literal164);

                    // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:423:6: ( DOUBLE_QUOTE_STRING_LITERAL | DOUBLE_ANGLE_STRING_LITERAL )
                    int alt70=2;
                    int LA70_0 = input.LA(1);

                    if ( (LA70_0==DOUBLE_QUOTE_STRING_LITERAL) ) {
                        alt70=1;
                    }
                    else if ( (LA70_0==DOUBLE_ANGLE_STRING_LITERAL) ) {
                        alt70=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 70, 0, input);

                        throw nvae;
                    }
                    switch (alt70) {
                        case 1 :
                            // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:423:8: DOUBLE_QUOTE_STRING_LITERAL
                            {
                            DOUBLE_QUOTE_STRING_LITERAL165=(Token)match(input,DOUBLE_QUOTE_STRING_LITERAL,FOLLOW_DOUBLE_QUOTE_STRING_LITERAL_in_rewrite_template2946);  
                            stream_DOUBLE_QUOTE_STRING_LITERAL.add(DOUBLE_QUOTE_STRING_LITERAL165);


                            }
                            break;
                        case 2 :
                            // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:423:38: DOUBLE_ANGLE_STRING_LITERAL
                            {
                            DOUBLE_ANGLE_STRING_LITERAL166=(Token)match(input,DOUBLE_ANGLE_STRING_LITERAL,FOLLOW_DOUBLE_ANGLE_STRING_LITERAL_in_rewrite_template2950);  
                            stream_DOUBLE_ANGLE_STRING_LITERAL.add(DOUBLE_ANGLE_STRING_LITERAL166);


                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: id, rewrite_template_args, st
                    // token labels: st
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_st=new RewriteRuleTokenStream(adaptor,"token st",st);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 424:3: -> ^( TEMPLATE[$lp,\"TEMPLATE\"] id rewrite_template_args $st)
                    {
                        // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:424:6: ^( TEMPLATE[$lp,\"TEMPLATE\"] id rewrite_template_args $st)
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TEMPLATE, lp, "TEMPLATE"), root_1);

                        adaptor.addChild(root_1, stream_id.nextTree());
                        adaptor.addChild(root_1, stream_rewrite_template_args.nextTree());
                        adaptor.addChild(root_1, stream_st.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:427:3: rewrite_template_ref
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_rewrite_template_ref_in_rewrite_template2977);
                    rewrite_template_ref167=rewrite_template_ref();

                    state._fsp--;

                    adaptor.addChild(root_0, rewrite_template_ref167.getTree());

                    }
                    break;
                case 3 :
                    // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:430:3: rewrite_indirect_template_head
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_rewrite_indirect_template_head_in_rewrite_template2986);
                    rewrite_indirect_template_head168=rewrite_indirect_template_head();

                    state._fsp--;

                    adaptor.addChild(root_0, rewrite_indirect_template_head168.getTree());

                    }
                    break;
                case 4 :
                    // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:433:3: ACTION
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    ACTION169=(Token)match(input,ACTION,FOLLOW_ACTION_in_rewrite_template2995); 
                    ACTION169_tree = (CommonTree)adaptor.create(ACTION169);
                    adaptor.addChild(root_0, ACTION169_tree);


                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "rewrite_template"

    public static class rewrite_template_ref_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "rewrite_template_ref"
    // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:436:1: rewrite_template_ref : id lp= '(' rewrite_template_args ')' -> ^( TEMPLATE[$lp,\"TEMPLATE\"] id rewrite_template_args ) ;
    public final ANTLRv3Parser.rewrite_template_ref_return rewrite_template_ref() throws RecognitionException {
        ANTLRv3Parser.rewrite_template_ref_return retval = new ANTLRv3Parser.rewrite_template_ref_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token lp=null;
        Token char_literal172=null;
        ANTLRv3Parser.id_return id170 = null;

        ANTLRv3Parser.rewrite_template_args_return rewrite_template_args171 = null;


        CommonTree lp_tree=null;
        CommonTree char_literal172_tree=null;
        RewriteRuleTokenStream stream_82=new RewriteRuleTokenStream(adaptor,"token 82");
        RewriteRuleTokenStream stream_84=new RewriteRuleTokenStream(adaptor,"token 84");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        RewriteRuleSubtreeStream stream_rewrite_template_args=new RewriteRuleSubtreeStream(adaptor,"rule rewrite_template_args");
        try {
            // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:438:2: ( id lp= '(' rewrite_template_args ')' -> ^( TEMPLATE[$lp,\"TEMPLATE\"] id rewrite_template_args ) )
            // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:438:4: id lp= '(' rewrite_template_args ')'
            {
            pushFollow(FOLLOW_id_in_rewrite_template_ref3008);
            id170=id();

            state._fsp--;

            stream_id.add(id170.getTree());
            lp=(Token)match(input,82,FOLLOW_82_in_rewrite_template_ref3012);  
            stream_82.add(lp);

            pushFollow(FOLLOW_rewrite_template_args_in_rewrite_template_ref3014);
            rewrite_template_args171=rewrite_template_args();

            state._fsp--;

            stream_rewrite_template_args.add(rewrite_template_args171.getTree());
            char_literal172=(Token)match(input,84,FOLLOW_84_in_rewrite_template_ref3016);  
            stream_84.add(char_literal172);



            // AST REWRITE
            // elements: id, rewrite_template_args
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 439:3: -> ^( TEMPLATE[$lp,\"TEMPLATE\"] id rewrite_template_args )
            {
                // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:439:6: ^( TEMPLATE[$lp,\"TEMPLATE\"] id rewrite_template_args )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TEMPLATE, lp, "TEMPLATE"), root_1);

                adaptor.addChild(root_1, stream_id.nextTree());
                adaptor.addChild(root_1, stream_rewrite_template_args.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "rewrite_template_ref"

    public static class rewrite_indirect_template_head_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "rewrite_indirect_template_head"
    // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:442:1: rewrite_indirect_template_head : lp= '(' ACTION ')' '(' rewrite_template_args ')' -> ^( TEMPLATE[$lp,\"TEMPLATE\"] ACTION rewrite_template_args ) ;
    public final ANTLRv3Parser.rewrite_indirect_template_head_return rewrite_indirect_template_head() throws RecognitionException {
        ANTLRv3Parser.rewrite_indirect_template_head_return retval = new ANTLRv3Parser.rewrite_indirect_template_head_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token lp=null;
        Token ACTION173=null;
        Token char_literal174=null;
        Token char_literal175=null;
        Token char_literal177=null;
        ANTLRv3Parser.rewrite_template_args_return rewrite_template_args176 = null;


        CommonTree lp_tree=null;
        CommonTree ACTION173_tree=null;
        CommonTree char_literal174_tree=null;
        CommonTree char_literal175_tree=null;
        CommonTree char_literal177_tree=null;
        RewriteRuleTokenStream stream_82=new RewriteRuleTokenStream(adaptor,"token 82");
        RewriteRuleTokenStream stream_ACTION=new RewriteRuleTokenStream(adaptor,"token ACTION");
        RewriteRuleTokenStream stream_84=new RewriteRuleTokenStream(adaptor,"token 84");
        RewriteRuleSubtreeStream stream_rewrite_template_args=new RewriteRuleSubtreeStream(adaptor,"rule rewrite_template_args");
        try {
            // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:444:2: (lp= '(' ACTION ')' '(' rewrite_template_args ')' -> ^( TEMPLATE[$lp,\"TEMPLATE\"] ACTION rewrite_template_args ) )
            // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:444:4: lp= '(' ACTION ')' '(' rewrite_template_args ')'
            {
            lp=(Token)match(input,82,FOLLOW_82_in_rewrite_indirect_template_head3044);  
            stream_82.add(lp);

            ACTION173=(Token)match(input,ACTION,FOLLOW_ACTION_in_rewrite_indirect_template_head3046);  
            stream_ACTION.add(ACTION173);

            char_literal174=(Token)match(input,84,FOLLOW_84_in_rewrite_indirect_template_head3048);  
            stream_84.add(char_literal174);

            char_literal175=(Token)match(input,82,FOLLOW_82_in_rewrite_indirect_template_head3050);  
            stream_82.add(char_literal175);

            pushFollow(FOLLOW_rewrite_template_args_in_rewrite_indirect_template_head3052);
            rewrite_template_args176=rewrite_template_args();

            state._fsp--;

            stream_rewrite_template_args.add(rewrite_template_args176.getTree());
            char_literal177=(Token)match(input,84,FOLLOW_84_in_rewrite_indirect_template_head3054);  
            stream_84.add(char_literal177);



            // AST REWRITE
            // elements: ACTION, rewrite_template_args
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 445:3: -> ^( TEMPLATE[$lp,\"TEMPLATE\"] ACTION rewrite_template_args )
            {
                // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:445:6: ^( TEMPLATE[$lp,\"TEMPLATE\"] ACTION rewrite_template_args )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TEMPLATE, lp, "TEMPLATE"), root_1);

                adaptor.addChild(root_1, stream_ACTION.nextNode());
                adaptor.addChild(root_1, stream_rewrite_template_args.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "rewrite_indirect_template_head"

    public static class rewrite_template_args_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "rewrite_template_args"
    // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:448:1: rewrite_template_args : ( rewrite_template_arg ( ',' rewrite_template_arg )* -> ^( ARGLIST ( rewrite_template_arg )+ ) | -> ARGLIST );
    public final ANTLRv3Parser.rewrite_template_args_return rewrite_template_args() throws RecognitionException {
        ANTLRv3Parser.rewrite_template_args_return retval = new ANTLRv3Parser.rewrite_template_args_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal179=null;
        ANTLRv3Parser.rewrite_template_arg_return rewrite_template_arg178 = null;

        ANTLRv3Parser.rewrite_template_arg_return rewrite_template_arg180 = null;


        CommonTree char_literal179_tree=null;
        RewriteRuleTokenStream stream_81=new RewriteRuleTokenStream(adaptor,"token 81");
        RewriteRuleSubtreeStream stream_rewrite_template_arg=new RewriteRuleSubtreeStream(adaptor,"rule rewrite_template_arg");
        try {
            // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:449:2: ( rewrite_template_arg ( ',' rewrite_template_arg )* -> ^( ARGLIST ( rewrite_template_arg )+ ) | -> ARGLIST )
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==TOKEN_REF||LA73_0==RULE_REF) ) {
                alt73=1;
            }
            else if ( (LA73_0==84) ) {
                alt73=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 73, 0, input);

                throw nvae;
            }
            switch (alt73) {
                case 1 :
                    // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:449:4: rewrite_template_arg ( ',' rewrite_template_arg )*
                    {
                    pushFollow(FOLLOW_rewrite_template_arg_in_rewrite_template_args3078);
                    rewrite_template_arg178=rewrite_template_arg();

                    state._fsp--;

                    stream_rewrite_template_arg.add(rewrite_template_arg178.getTree());
                    // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:449:25: ( ',' rewrite_template_arg )*
                    loop72:
                    do {
                        int alt72=2;
                        int LA72_0 = input.LA(1);

                        if ( (LA72_0==81) ) {
                            alt72=1;
                        }


                        switch (alt72) {
                    	case 1 :
                    	    // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:449:26: ',' rewrite_template_arg
                    	    {
                    	    char_literal179=(Token)match(input,81,FOLLOW_81_in_rewrite_template_args3081);  
                    	    stream_81.add(char_literal179);

                    	    pushFollow(FOLLOW_rewrite_template_arg_in_rewrite_template_args3083);
                    	    rewrite_template_arg180=rewrite_template_arg();

                    	    state._fsp--;

                    	    stream_rewrite_template_arg.add(rewrite_template_arg180.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop72;
                        }
                    } while (true);



                    // AST REWRITE
                    // elements: rewrite_template_arg
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 450:3: -> ^( ARGLIST ( rewrite_template_arg )+ )
                    {
                        // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:450:6: ^( ARGLIST ( rewrite_template_arg )+ )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ARGLIST, "ARGLIST"), root_1);

                        if ( !(stream_rewrite_template_arg.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_rewrite_template_arg.hasNext() ) {
                            adaptor.addChild(root_1, stream_rewrite_template_arg.nextTree());

                        }
                        stream_rewrite_template_arg.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:451:4: 
                    {

                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 451:4: -> ARGLIST
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(ARGLIST, "ARGLIST"));

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "rewrite_template_args"

    public static class rewrite_template_arg_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "rewrite_template_arg"
    // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:454:1: rewrite_template_arg : id '=' ACTION -> ^( ARG[$id.start] id ACTION ) ;
    public final ANTLRv3Parser.rewrite_template_arg_return rewrite_template_arg() throws RecognitionException {
        ANTLRv3Parser.rewrite_template_arg_return retval = new ANTLRv3Parser.rewrite_template_arg_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal182=null;
        Token ACTION183=null;
        ANTLRv3Parser.id_return id181 = null;


        CommonTree char_literal182_tree=null;
        CommonTree ACTION183_tree=null;
        RewriteRuleTokenStream stream_71=new RewriteRuleTokenStream(adaptor,"token 71");
        RewriteRuleTokenStream stream_ACTION=new RewriteRuleTokenStream(adaptor,"token ACTION");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        try {
            // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:455:2: ( id '=' ACTION -> ^( ARG[$id.start] id ACTION ) )
            // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:455:6: id '=' ACTION
            {
            pushFollow(FOLLOW_id_in_rewrite_template_arg3116);
            id181=id();

            state._fsp--;

            stream_id.add(id181.getTree());
            char_literal182=(Token)match(input,71,FOLLOW_71_in_rewrite_template_arg3118);  
            stream_71.add(char_literal182);

            ACTION183=(Token)match(input,ACTION,FOLLOW_ACTION_in_rewrite_template_arg3120);  
            stream_ACTION.add(ACTION183);



            // AST REWRITE
            // elements: id, ACTION
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 455:20: -> ^( ARG[$id.start] id ACTION )
            {
                // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:455:23: ^( ARG[$id.start] id ACTION )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ARG, (id181!=null?((Token)id181.start):null)), root_1);

                adaptor.addChild(root_1, stream_id.nextTree());
                adaptor.addChild(root_1, stream_ACTION.nextNode());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "rewrite_template_arg"

    public static class id_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "id"
    // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:458:1: id : ( TOKEN_REF -> ID[$TOKEN_REF] | RULE_REF -> ID[$RULE_REF] );
    public final ANTLRv3Parser.id_return id() throws RecognitionException {
        ANTLRv3Parser.id_return retval = new ANTLRv3Parser.id_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token TOKEN_REF184=null;
        Token RULE_REF185=null;

        CommonTree TOKEN_REF184_tree=null;
        CommonTree RULE_REF185_tree=null;
        RewriteRuleTokenStream stream_RULE_REF=new RewriteRuleTokenStream(adaptor,"token RULE_REF");
        RewriteRuleTokenStream stream_TOKEN_REF=new RewriteRuleTokenStream(adaptor,"token TOKEN_REF");

        try {
            // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:458:4: ( TOKEN_REF -> ID[$TOKEN_REF] | RULE_REF -> ID[$RULE_REF] )
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==TOKEN_REF) ) {
                alt74=1;
            }
            else if ( (LA74_0==RULE_REF) ) {
                alt74=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 74, 0, input);

                throw nvae;
            }
            switch (alt74) {
                case 1 :
                    // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:458:6: TOKEN_REF
                    {
                    TOKEN_REF184=(Token)match(input,TOKEN_REF,FOLLOW_TOKEN_REF_in_id3141);  
                    stream_TOKEN_REF.add(TOKEN_REF184);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 458:16: -> ID[$TOKEN_REF]
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(ID, TOKEN_REF184));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // C:\\eclipses\\eclipse-3.5\\workspace\\Grammar2Model\\src/ANTLRv3.g3:459:4: RULE_REF
                    {
                    RULE_REF185=(Token)match(input,RULE_REF,FOLLOW_RULE_REF_in_id3151);  
                    stream_RULE_REF.add(RULE_REF185);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 459:14: -> ID[$RULE_REF]
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(ID, RULE_REF185));

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "id"

    // Delegated rules


    protected DFA45 dfa45 = new DFA45(this);
    protected DFA63 dfa63 = new DFA63(this);
    protected DFA66 dfa66 = new DFA66(this);
    protected DFA71 dfa71 = new DFA71(this);
    static final String DFA45_eotS =
        "\14\uffff";
    static final String DFA45_eofS =
        "\14\uffff";
    static final String DFA45_minS =
        "\3\40\5\uffff\2\52\2\uffff";
    static final String DFA45_maxS =
        "\3\134\5\uffff\2\134\2\uffff";
    static final String DFA45_acceptS =
        "\3\uffff\1\3\1\4\1\5\1\6\1\7\2\uffff\1\2\1\1";
    static final String DFA45_specialS =
        "\14\uffff}>";
    static final String[] DFA45_transitionS = {
            "\1\6\4\uffff\1\7\4\uffff\1\1\2\3\1\5\3\uffff\1\2\40\uffff\1"+
            "\4\6\uffff\1\3\2\uffff\1\3",
            "\1\3\4\uffff\4\3\1\uffff\4\3\2\uffff\2\3\23\uffff\1\3\1\uffff"+
            "\1\10\2\uffff\1\3\7\uffff\3\3\2\uffff\1\11\1\uffff\4\3",
            "\1\3\4\uffff\4\3\1\uffff\4\3\2\uffff\2\3\23\uffff\1\3\1\uffff"+
            "\1\10\2\uffff\1\3\7\uffff\3\3\2\uffff\1\11\1\uffff\4\3",
            "",
            "",
            "",
            "",
            "",
            "\3\13\4\uffff\1\13\40\uffff\1\12\6\uffff\1\13\2\uffff\1\13",
            "\3\13\4\uffff\1\13\40\uffff\1\12\6\uffff\1\13\2\uffff\1\13",
            "",
            ""
    };

    static final short[] DFA45_eot = DFA.unpackEncodedString(DFA45_eotS);
    static final short[] DFA45_eof = DFA.unpackEncodedString(DFA45_eofS);
    static final char[] DFA45_min = DFA.unpackEncodedStringToUnsignedChars(DFA45_minS);
    static final char[] DFA45_max = DFA.unpackEncodedStringToUnsignedChars(DFA45_maxS);
    static final short[] DFA45_accept = DFA.unpackEncodedString(DFA45_acceptS);
    static final short[] DFA45_special = DFA.unpackEncodedString(DFA45_specialS);
    static final short[][] DFA45_transition;

    static {
        int numStates = DFA45_transitionS.length;
        DFA45_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA45_transition[i] = DFA.unpackEncodedString(DFA45_transitionS[i]);
        }
    }

    class DFA45 extends DFA {

        public DFA45(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 45;
            this.eot = DFA45_eot;
            this.eof = DFA45_eof;
            this.min = DFA45_min;
            this.max = DFA45_max;
            this.accept = DFA45_accept;
            this.special = DFA45_special;
            this.transition = DFA45_transition;
        }
        public String getDescription() {
            return "238:1: elementNoOptionSpec : ( id (labelOp= '=' | labelOp= '+=' ) atom ( ebnfSuffix -> ^( ebnfSuffix ^( BLOCK[\"BLOCK\"] ^( ALT[\"ALT\"] ^( $labelOp id atom ) EOA[\"EOA\"] ) EOB[\"EOB\"] ) ) | -> ^( $labelOp id atom ) ) | id (labelOp= '=' | labelOp= '+=' ) block ( ebnfSuffix -> ^( ebnfSuffix ^( BLOCK[\"BLOCK\"] ^( ALT[\"ALT\"] ^( $labelOp id block ) EOA[\"EOA\"] ) EOB[\"EOB\"] ) ) | -> ^( $labelOp id block ) ) | atom ( ebnfSuffix -> ^( BLOCK[\"BLOCK\"] ^( ALT[\"ALT\"] atom EOA[\"EOA\"] ) EOB[\"EOB\"] ) | -> atom ) | ebnf | ACTION | SEMPRED ( '=>' -> GATED_SEMPRED | -> SEMPRED ) | treeSpec );";
        }
    }
    static final String DFA63_eotS =
        "\14\uffff";
    static final String DFA63_eofS =
        "\14\uffff";
    static final String DFA63_minS =
        "\4\45\3\uffff\4\45\1\112";
    static final String DFA63_maxS =
        "\4\135\3\uffff\4\135\1\133";
    static final String DFA63_acceptS =
        "\4\uffff\1\1\1\2\1\3\5\uffff";
    static final String DFA63_specialS =
        "\14\uffff}>";
    static final String[] DFA63_transitionS = {
            "\1\5\2\uffff\1\6\1\uffff\1\1\2\5\1\4\3\uffff\1\2\23\uffff\1"+
            "\6\14\uffff\1\3\2\6\10\uffff\1\5",
            "\1\5\2\uffff\1\5\1\uffff\4\5\2\uffff\2\5\23\uffff\1\5\4\uffff"+
            "\1\5\7\uffff\1\7\2\5\5\uffff\2\5\1\uffff\1\5",
            "\1\5\2\uffff\1\5\1\uffff\4\5\3\uffff\1\5\23\uffff\1\5\4\uffff"+
            "\1\5\7\uffff\1\7\2\5\5\uffff\2\5\1\uffff\1\5",
            "\1\5\4\uffff\3\5\1\10\3\uffff\1\5\40\uffff\1\5\12\uffff\1"+
            "\5",
            "",
            "",
            "",
            "\1\5\4\uffff\1\11\3\5\3\uffff\1\12\40\uffff\1\5\1\uffff\1"+
            "\4\10\uffff\1\5",
            "\1\5\4\uffff\4\5\3\uffff\1\5\30\uffff\1\5\7\uffff\1\5\1\uffff"+
            "\1\13\5\uffff\2\5\1\uffff\1\5",
            "\1\5\4\uffff\4\5\2\uffff\2\5\25\uffff\1\4\2\uffff\1\5\7\uffff"+
            "\1\5\1\uffff\1\5\5\uffff\2\5\1\uffff\1\5",
            "\1\5\4\uffff\4\5\3\uffff\1\5\25\uffff\1\4\2\uffff\1\5\7\uffff"+
            "\1\5\1\uffff\1\5\5\uffff\2\5\1\uffff\1\5",
            "\1\5\7\uffff\1\4\7\uffff\2\5"
    };

    static final short[] DFA63_eot = DFA.unpackEncodedString(DFA63_eotS);
    static final short[] DFA63_eof = DFA.unpackEncodedString(DFA63_eofS);
    static final char[] DFA63_min = DFA.unpackEncodedStringToUnsignedChars(DFA63_minS);
    static final char[] DFA63_max = DFA.unpackEncodedStringToUnsignedChars(DFA63_maxS);
    static final short[] DFA63_accept = DFA.unpackEncodedString(DFA63_acceptS);
    static final short[] DFA63_special = DFA.unpackEncodedString(DFA63_specialS);
    static final short[][] DFA63_transition;

    static {
        int numStates = DFA63_transitionS.length;
        DFA63_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA63_transition[i] = DFA.unpackEncodedString(DFA63_transitionS[i]);
        }
    }

    class DFA63 extends DFA {

        public DFA63(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 63;
            this.eot = DFA63_eot;
            this.eof = DFA63_eof;
            this.min = DFA63_min;
            this.max = DFA63_max;
            this.accept = DFA63_accept;
            this.special = DFA63_special;
            this.transition = DFA63_transition;
        }
        public String getDescription() {
            return "352:1: rewrite_alternative : ( rewrite_template | rewrite_tree_alternative | -> ^( ALT[\"ALT\"] EPSILON[\"EPSILON\"] EOA[\"EOA\"] ) );";
        }
    }
    static final String DFA66_eotS =
        "\16\uffff";
    static final String DFA66_eofS =
        "\16\uffff";
    static final String DFA66_minS =
        "\5\45\1\52\1\45\4\uffff\3\45";
    static final String DFA66_maxS =
        "\5\135\1\61\1\135\4\uffff\3\135";
    static final String DFA66_acceptS =
        "\7\uffff\1\3\1\4\1\2\1\1\3\uffff";
    static final String DFA66_specialS =
        "\16\uffff}>";
    static final String[] DFA66_transitionS = {
            "\1\7\4\uffff\1\2\1\4\1\1\1\6\3\uffff\1\3\40\uffff\1\10\12\uffff"+
            "\1\5",
            "\1\12\2\uffff\1\12\1\uffff\4\12\3\uffff\1\12\23\uffff\1\12"+
            "\4\uffff\1\11\7\uffff\3\12\5\uffff\2\11\1\uffff\1\12",
            "\1\12\2\uffff\1\12\1\uffff\4\12\2\uffff\1\13\1\12\23\uffff"+
            "\1\12\4\uffff\1\11\7\uffff\3\12\5\uffff\2\11\1\uffff\1\12",
            "\1\12\2\uffff\1\12\1\uffff\4\12\3\uffff\1\12\23\uffff\1\12"+
            "\4\uffff\1\11\7\uffff\3\12\5\uffff\2\11\1\uffff\1\12",
            "\1\12\2\uffff\1\12\1\uffff\4\12\3\uffff\1\12\23\uffff\1\12"+
            "\4\uffff\1\11\7\uffff\3\12\5\uffff\2\11\1\uffff\1\12",
            "\1\14\6\uffff\1\15",
            "\1\12\2\uffff\1\12\1\uffff\4\12\3\uffff\1\12\23\uffff\1\12"+
            "\4\uffff\1\11\7\uffff\3\12\5\uffff\2\11\1\uffff\1\12",
            "",
            "",
            "",
            "",
            "\1\12\2\uffff\1\12\1\uffff\4\12\3\uffff\1\12\23\uffff\1\12"+
            "\4\uffff\1\11\7\uffff\3\12\5\uffff\2\11\1\uffff\1\12",
            "\1\12\2\uffff\1\12\1\uffff\4\12\3\uffff\1\12\23\uffff\1\12"+
            "\4\uffff\1\11\7\uffff\3\12\5\uffff\2\11\1\uffff\1\12",
            "\1\12\2\uffff\1\12\1\uffff\4\12\3\uffff\1\12\23\uffff\1\12"+
            "\4\uffff\1\11\7\uffff\3\12\5\uffff\2\11\1\uffff\1\12"
    };

    static final short[] DFA66_eot = DFA.unpackEncodedString(DFA66_eotS);
    static final short[] DFA66_eof = DFA.unpackEncodedString(DFA66_eofS);
    static final char[] DFA66_min = DFA.unpackEncodedStringToUnsignedChars(DFA66_minS);
    static final char[] DFA66_max = DFA.unpackEncodedStringToUnsignedChars(DFA66_maxS);
    static final short[] DFA66_accept = DFA.unpackEncodedString(DFA66_acceptS);
    static final short[] DFA66_special = DFA.unpackEncodedString(DFA66_specialS);
    static final short[][] DFA66_transition;

    static {
        int numStates = DFA66_transitionS.length;
        DFA66_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA66_transition[i] = DFA.unpackEncodedString(DFA66_transitionS[i]);
        }
    }

    class DFA66 extends DFA {

        public DFA66(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 66;
            this.eot = DFA66_eot;
            this.eof = DFA66_eof;
            this.min = DFA66_min;
            this.max = DFA66_max;
            this.accept = DFA66_accept;
            this.special = DFA66_special;
            this.transition = DFA66_transition;
        }
        public String getDescription() {
            return "371:1: rewrite_tree_element : ( rewrite_tree_atom | rewrite_tree_atom ebnfSuffix -> ^( ebnfSuffix ^( BLOCK[\"BLOCK\"] ^( ALT[\"ALT\"] rewrite_tree_atom EOA[\"EOA\"] ) EOB[\"EOB\"] ) ) | rewrite_tree ( ebnfSuffix -> ^( BLOCK[\"BLOCK\"] ^( ALT[\"ALT\"] rewrite_tree EOA[\"EOA\"] ) EOB[\"EOB\"] ) | -> rewrite_tree ) | rewrite_tree_ebnf );";
        }
    }
    static final String DFA71_eotS =
        "\22\uffff";
    static final String DFA71_eofS =
        "\22\uffff";
    static final String DFA71_minS =
        "\1\52\2\122\2\uffff\1\52\2\107\1\50\1\55\2\uffff\1\121\1\52\2\107"+
        "\1\55\1\121";
    static final String DFA71_maxS =
        "\3\122\2\uffff\1\124\2\107\1\124\1\55\2\uffff\1\124\1\61\2\107"+
        "\1\55\1\124";
    static final String DFA71_acceptS =
        "\3\uffff\1\3\1\4\5\uffff\1\2\1\1\6\uffff";
    static final String DFA71_specialS =
        "\22\uffff}>";
    static final String[] DFA71_transitionS = {
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

    static final short[] DFA71_eot = DFA.unpackEncodedString(DFA71_eotS);
    static final short[] DFA71_eof = DFA.unpackEncodedString(DFA71_eofS);
    static final char[] DFA71_min = DFA.unpackEncodedStringToUnsignedChars(DFA71_minS);
    static final char[] DFA71_max = DFA.unpackEncodedStringToUnsignedChars(DFA71_maxS);
    static final short[] DFA71_accept = DFA.unpackEncodedString(DFA71_acceptS);
    static final short[] DFA71_special = DFA.unpackEncodedString(DFA71_specialS);
    static final short[][] DFA71_transition;

    static {
        int numStates = DFA71_transitionS.length;
        DFA71_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA71_transition[i] = DFA.unpackEncodedString(DFA71_transitionS[i]);
        }
    }

    class DFA71 extends DFA {

        public DFA71(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 71;
            this.eot = DFA71_eot;
            this.eof = DFA71_eof;
            this.min = DFA71_min;
            this.max = DFA71_max;
            this.accept = DFA71_accept;
            this.special = DFA71_special;
            this.transition = DFA71_transition;
        }
        public String getDescription() {
            return "408:1: rewrite_template : ({...}? id lp= '(' rewrite_template_args ')' st= ( DOUBLE_QUOTE_STRING_LITERAL | DOUBLE_ANGLE_STRING_LITERAL ) -> ^( TEMPLATE[$lp,\"TEMPLATE\"] id rewrite_template_args $st) | rewrite_template_ref | rewrite_indirect_template_head | ACTION );";
        }
    }
 

    public static final BitSet FOLLOW_DOC_COMMENT_in_grammarDef346 = new BitSet(new long[]{0x0000000000000000L,0x000000000000001EL});
    public static final BitSet FOLLOW_65_in_grammarDef356 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_66_in_grammarDef374 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_67_in_grammarDef390 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_grammarDef431 = new BitSet(new long[]{0x0002040000000000L});
    public static final BitSet FOLLOW_id_in_grammarDef433 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_grammarDef435 = new BitSet(new long[]{0x0002461080000010L,0x0000000000003900L});
    public static final BitSet FOLLOW_optionsSpec_in_grammarDef437 = new BitSet(new long[]{0x0002461080000010L,0x0000000000003900L});
    public static final BitSet FOLLOW_tokensSpec_in_grammarDef440 = new BitSet(new long[]{0x0002461080000010L,0x0000000000003900L});
    public static final BitSet FOLLOW_attrScope_in_grammarDef443 = new BitSet(new long[]{0x0002461080000010L,0x0000000000003900L});
    public static final BitSet FOLLOW_action_in_grammarDef446 = new BitSet(new long[]{0x0002461080000010L,0x0000000000003900L});
    public static final BitSet FOLLOW_rule_in_grammarDef454 = new BitSet(new long[]{0x0002461080000010L,0x0000000000003900L});
    public static final BitSet FOLLOW_EOF_in_grammarDef462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOKENS_in_tokensSpec523 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_tokenSpec_in_tokensSpec525 = new BitSet(new long[]{0x0000040000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_tokensSpec528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOKEN_REF_in_tokenSpec548 = new BitSet(new long[]{0x0000000000000000L,0x00000000000000A0L});
    public static final BitSet FOLLOW_71_in_tokenSpec554 = new BitSet(new long[]{0x0000180000000000L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_tokenSpec559 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_CHAR_LITERAL_in_tokenSpec563 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_tokenSpec602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SCOPE_in_attrScope613 = new BitSet(new long[]{0x0002040000000000L});
    public static final BitSet FOLLOW_id_in_attrScope615 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_ACTION_in_attrScope617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_action640 = new BitSet(new long[]{0x0002040000000000L,0x0000000000000006L});
    public static final BitSet FOLLOW_actionScopeName_in_action643 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_73_in_action645 = new BitSet(new long[]{0x0002040000000000L});
    public static final BitSet FOLLOW_id_in_action649 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_ACTION_in_action651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_actionScopeName677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_actionScopeName684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_actionScopeName701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPTIONS_in_optionsSpec717 = new BitSet(new long[]{0x0002040000000000L});
    public static final BitSet FOLLOW_option_in_optionsSpec720 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_optionsSpec722 = new BitSet(new long[]{0x0002040000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_optionsSpec726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_option751 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_option753 = new BitSet(new long[]{0x00029C0000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_optionValue_in_option755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_optionValue784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_optionValue794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHAR_LITERAL_in_optionValue804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_optionValue814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_optionValue824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOC_COMMENT_in_rule849 = new BitSet(new long[]{0x0002041000000000L,0x0000000000003800L});
    public static final BitSet FOLLOW_75_in_rule859 = new BitSet(new long[]{0x0002040000000000L});
    public static final BitSet FOLLOW_76_in_rule861 = new BitSet(new long[]{0x0002040000000000L});
    public static final BitSet FOLLOW_77_in_rule863 = new BitSet(new long[]{0x0002040000000000L});
    public static final BitSet FOLLOW_FRAGMENT_in_rule865 = new BitSet(new long[]{0x0002040000000000L});
    public static final BitSet FOLLOW_id_in_rule873 = new BitSet(new long[]{0x0001408080000000L,0x000000000001C100L});
    public static final BitSet FOLLOW_BANG_in_rule879 = new BitSet(new long[]{0x0001400080000000L,0x000000000001C100L});
    public static final BitSet FOLLOW_ARG_ACTION_in_rule888 = new BitSet(new long[]{0x0000400080000000L,0x000000000001C100L});
    public static final BitSet FOLLOW_78_in_rule897 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_ARG_ACTION_in_rule901 = new BitSet(new long[]{0x0000400080000000L,0x0000000000018100L});
    public static final BitSet FOLLOW_throwsSpec_in_rule909 = new BitSet(new long[]{0x0000400080000000L,0x0000000000008100L});
    public static final BitSet FOLLOW_optionsSpec_in_rule912 = new BitSet(new long[]{0x0000000080000000L,0x0000000000008100L});
    public static final BitSet FOLLOW_ruleScopeSpec_in_rule915 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008100L});
    public static final BitSet FOLLOW_ruleAction_in_rule918 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008100L});
    public static final BitSet FOLLOW_79_in_rule923 = new BitSet(new long[]{0x00023D2100000000L,0x00000000120C0000L});
    public static final BitSet FOLLOW_altList_in_rule925 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_rule927 = new BitSet(new long[]{0x0000000000000002L,0x0000000000600000L});
    public static final BitSet FOLLOW_exceptionGroup_in_rule931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleAction1033 = new BitSet(new long[]{0x0002040000000000L});
    public static final BitSet FOLLOW_id_in_ruleAction1035 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_ACTION_in_ruleAction1037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_throwsSpec1058 = new BitSet(new long[]{0x0002040000000000L});
    public static final BitSet FOLLOW_id_in_throwsSpec1060 = new BitSet(new long[]{0x0000000000000002L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_throwsSpec1064 = new BitSet(new long[]{0x0002040000000000L});
    public static final BitSet FOLLOW_id_in_throwsSpec1066 = new BitSet(new long[]{0x0000000000000002L,0x0000000000020000L});
    public static final BitSet FOLLOW_SCOPE_in_ruleScopeSpec1089 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_ACTION_in_ruleScopeSpec1091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SCOPE_in_ruleScopeSpec1104 = new BitSet(new long[]{0x0002040000000000L});
    public static final BitSet FOLLOW_id_in_ruleScopeSpec1106 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020020L});
    public static final BitSet FOLLOW_81_in_ruleScopeSpec1109 = new BitSet(new long[]{0x0002040000000000L});
    public static final BitSet FOLLOW_id_in_ruleScopeSpec1111 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020020L});
    public static final BitSet FOLLOW_69_in_ruleScopeSpec1115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SCOPE_in_ruleScopeSpec1129 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_ACTION_in_ruleScopeSpec1131 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_SCOPE_in_ruleScopeSpec1135 = new BitSet(new long[]{0x0002040000000000L});
    public static final BitSet FOLLOW_id_in_ruleScopeSpec1137 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020020L});
    public static final BitSet FOLLOW_81_in_ruleScopeSpec1140 = new BitSet(new long[]{0x0002040000000000L});
    public static final BitSet FOLLOW_id_in_ruleScopeSpec1142 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020020L});
    public static final BitSet FOLLOW_69_in_ruleScopeSpec1146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_block1178 = new BitSet(new long[]{0x00027D2100000000L,0x00000000121C8000L});
    public static final BitSet FOLLOW_optionsSpec_in_block1187 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_79_in_block1191 = new BitSet(new long[]{0x00023D2100000000L,0x00000000121C0000L});
    public static final BitSet FOLLOW_alternative_in_block1200 = new BitSet(new long[]{0x0000010000000000L,0x0000000000180000L});
    public static final BitSet FOLLOW_rewrite_in_block1202 = new BitSet(new long[]{0x0000000000000000L,0x0000000000180000L});
    public static final BitSet FOLLOW_83_in_block1206 = new BitSet(new long[]{0x00023D2100000000L,0x00000000121C0000L});
    public static final BitSet FOLLOW_alternative_in_block1210 = new BitSet(new long[]{0x0000010000000000L,0x0000000000180000L});
    public static final BitSet FOLLOW_rewrite_in_block1212 = new BitSet(new long[]{0x0000000000000000L,0x0000000000180000L});
    public static final BitSet FOLLOW_84_in_block1227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_alternative_in_altList1279 = new BitSet(new long[]{0x0000010000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_rewrite_in_altList1281 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_altList1285 = new BitSet(new long[]{0x00023D2100000000L,0x00000000120C0000L});
    public static final BitSet FOLLOW_alternative_in_altList1289 = new BitSet(new long[]{0x0000010000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_rewrite_in_altList1291 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080000L});
    public static final BitSet FOLLOW_element_in_alternative1336 = new BitSet(new long[]{0x00023C2100000002L,0x0000000012040000L});
    public static final BitSet FOLLOW_exceptionHandler_in_exceptionGroup1387 = new BitSet(new long[]{0x0000000000000002L,0x0000000000600000L});
    public static final BitSet FOLLOW_finallyClause_in_exceptionGroup1394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_finallyClause_in_exceptionGroup1402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_exceptionHandler1422 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_ARG_ACTION_in_exceptionHandler1424 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_ACTION_in_exceptionHandler1426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_finallyClause1456 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_ACTION_in_finallyClause1458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_elementNoOptionSpec_in_element1480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_elementNoOptionSpec1491 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800080L});
    public static final BitSet FOLLOW_71_in_elementNoOptionSpec1496 = new BitSet(new long[]{0x00021C0000000000L,0x0000000012000000L});
    public static final BitSet FOLLOW_87_in_elementNoOptionSpec1500 = new BitSet(new long[]{0x00021C0000000000L,0x0000000012000000L});
    public static final BitSet FOLLOW_atom_in_elementNoOptionSpec1503 = new BitSet(new long[]{0x0000000000000002L,0x000000000C000400L});
    public static final BitSet FOLLOW_ebnfSuffix_in_elementNoOptionSpec1509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_elementNoOptionSpec1568 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800080L});
    public static final BitSet FOLLOW_71_in_elementNoOptionSpec1573 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_87_in_elementNoOptionSpec1577 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_block_in_elementNoOptionSpec1580 = new BitSet(new long[]{0x0000000000000002L,0x000000000C000400L});
    public static final BitSet FOLLOW_ebnfSuffix_in_elementNoOptionSpec1586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atom_in_elementNoOptionSpec1645 = new BitSet(new long[]{0x0000000000000002L,0x000000000C000400L});
    public static final BitSet FOLLOW_ebnfSuffix_in_elementNoOptionSpec1651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ebnf_in_elementNoOptionSpec1691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ACTION_in_elementNoOptionSpec1698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEMPRED_in_elementNoOptionSpec1705 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000000L});
    public static final BitSet FOLLOW_88_in_elementNoOptionSpec1709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_treeSpec_in_elementNoOptionSpec1728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_range_in_atom1739 = new BitSet(new long[]{0x000000C000000002L});
    public static final BitSet FOLLOW_ROOT_in_atom1746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BANG_in_atom1750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_terminal_in_atom1778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_notSet_in_atom1786 = new BitSet(new long[]{0x000000C000000002L});
    public static final BitSet FOLLOW_ROOT_in_atom1793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BANG_in_atom1797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_REF_in_atom1825 = new BitSet(new long[]{0x000100C000000002L});
    public static final BitSet FOLLOW_ARG_ACTION_in_atom1831 = new BitSet(new long[]{0x000000C000000002L});
    public static final BitSet FOLLOW_ROOT_in_atom1841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BANG_in_atom1845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_notSet1928 = new BitSet(new long[]{0x00001C0000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_notTerminal_in_notSet1934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_notSet1948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TREE_BEGIN_in_treeSpec1972 = new BitSet(new long[]{0x00023C2100000000L,0x0000000012040000L});
    public static final BitSet FOLLOW_element_in_treeSpec1974 = new BitSet(new long[]{0x00023C2100000000L,0x0000000012040000L});
    public static final BitSet FOLLOW_element_in_treeSpec1978 = new BitSet(new long[]{0x00023C2100000000L,0x0000000012140000L});
    public static final BitSet FOLLOW_84_in_treeSpec1983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_ebnf2015 = new BitSet(new long[]{0x000000C000000002L,0x000000000D000400L});
    public static final BitSet FOLLOW_90_in_ebnf2023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ebnf2039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_91_in_ebnf2055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ROOT_in_ebnf2073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BANG_in_ebnf2090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_ebnf2107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHAR_LITERAL_in_range2190 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_RANGE_in_range2192 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_CHAR_LITERAL_in_range2196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHAR_LITERAL_in_terminal2227 = new BitSet(new long[]{0x000000C000000002L});
    public static final BitSet FOLLOW_TOKEN_REF_in_terminal2249 = new BitSet(new long[]{0x000100C000000002L});
    public static final BitSet FOLLOW_ARG_ACTION_in_terminal2256 = new BitSet(new long[]{0x000000C000000002L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_terminal2295 = new BitSet(new long[]{0x000000C000000002L});
    public static final BitSet FOLLOW_92_in_terminal2310 = new BitSet(new long[]{0x000000C000000002L});
    public static final BitSet FOLLOW_ROOT_in_terminal2331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BANG_in_terminal2352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_notTerminal0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_ebnfSuffix2412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ebnfSuffix2424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_91_in_ebnfSuffix2437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REWRITE_in_rewrite2466 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_SEMPRED_in_rewrite2470 = new BitSet(new long[]{0x00023D2000000000L,0x0000000020040000L});
    public static final BitSet FOLLOW_rewrite_alternative_in_rewrite2474 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_REWRITE_in_rewrite2482 = new BitSet(new long[]{0x00023C2000000000L,0x0000000020040000L});
    public static final BitSet FOLLOW_rewrite_alternative_in_rewrite2486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rewrite_template_in_rewrite_alternative2530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rewrite_tree_alternative_in_rewrite_alternative2535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_rewrite_template_block2577 = new BitSet(new long[]{0x0002240000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_rewrite_template_in_rewrite_template_block2579 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_rewrite_template_block2581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_rewrite_tree_block2614 = new BitSet(new long[]{0x00023C2000000000L,0x0000000020040000L});
    public static final BitSet FOLLOW_rewrite_tree_alternative_in_rewrite_tree_block2616 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_rewrite_tree_block2618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rewrite_tree_element_in_rewrite_tree_alternative2652 = new BitSet(new long[]{0x00023C2000000002L,0x0000000020040000L});
    public static final BitSet FOLLOW_rewrite_tree_atom_in_rewrite_tree_element2680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rewrite_tree_atom_in_rewrite_tree_element2685 = new BitSet(new long[]{0x0000000000000000L,0x000000000C000400L});
    public static final BitSet FOLLOW_ebnfSuffix_in_rewrite_tree_element2687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rewrite_tree_in_rewrite_tree_element2721 = new BitSet(new long[]{0x0000000000000002L,0x000000000C000400L});
    public static final BitSet FOLLOW_ebnfSuffix_in_rewrite_tree_element2727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rewrite_tree_ebnf_in_rewrite_tree_element2769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHAR_LITERAL_in_rewrite_tree_atom2785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOKEN_REF_in_rewrite_tree_atom2792 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_ARG_ACTION_in_rewrite_tree_atom2794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_REF_in_rewrite_tree_atom2815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_rewrite_tree_atom2822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_93_in_rewrite_tree_atom2831 = new BitSet(new long[]{0x0002040000000000L});
    public static final BitSet FOLLOW_id_in_rewrite_tree_atom2833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ACTION_in_rewrite_tree_atom2844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rewrite_tree_block_in_rewrite_tree_ebnf2865 = new BitSet(new long[]{0x0000000000000000L,0x000000000C000400L});
    public static final BitSet FOLLOW_ebnfSuffix_in_rewrite_tree_ebnf2867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TREE_BEGIN_in_rewrite_tree2887 = new BitSet(new long[]{0x00023C0000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_rewrite_tree_atom_in_rewrite_tree2889 = new BitSet(new long[]{0x00023C2000000000L,0x0000000020140000L});
    public static final BitSet FOLLOW_rewrite_tree_element_in_rewrite_tree2891 = new BitSet(new long[]{0x00023C2000000000L,0x0000000020140000L});
    public static final BitSet FOLLOW_84_in_rewrite_tree2894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_rewrite_template2930 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_rewrite_template2934 = new BitSet(new long[]{0x0002040000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_rewrite_template_args_in_rewrite_template2936 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_rewrite_template2938 = new BitSet(new long[]{0x000C000000000000L});
    public static final BitSet FOLLOW_DOUBLE_QUOTE_STRING_LITERAL_in_rewrite_template2946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOUBLE_ANGLE_STRING_LITERAL_in_rewrite_template2950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rewrite_template_ref_in_rewrite_template2977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rewrite_indirect_template_head_in_rewrite_template2986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ACTION_in_rewrite_template2995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_rewrite_template_ref3008 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_rewrite_template_ref3012 = new BitSet(new long[]{0x0002040000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_rewrite_template_args_in_rewrite_template_ref3014 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_rewrite_template_ref3016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_rewrite_indirect_template_head3044 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_ACTION_in_rewrite_indirect_template_head3046 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_rewrite_indirect_template_head3048 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_rewrite_indirect_template_head3050 = new BitSet(new long[]{0x0002040000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_rewrite_template_args_in_rewrite_indirect_template_head3052 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_rewrite_indirect_template_head3054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rewrite_template_arg_in_rewrite_template_args3078 = new BitSet(new long[]{0x0000000000000002L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_rewrite_template_args3081 = new BitSet(new long[]{0x0002040000000000L});
    public static final BitSet FOLLOW_rewrite_template_arg_in_rewrite_template_args3083 = new BitSet(new long[]{0x0000000000000002L,0x0000000000020000L});
    public static final BitSet FOLLOW_id_in_rewrite_template_arg3116 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_rewrite_template_arg3118 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_ACTION_in_rewrite_template_arg3120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOKEN_REF_in_id3141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_REF_in_id3151 = new BitSet(new long[]{0x0000000000000002L});

}