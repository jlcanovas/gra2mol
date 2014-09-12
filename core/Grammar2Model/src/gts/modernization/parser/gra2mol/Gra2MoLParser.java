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


// $ANTLR 3.2 Sep 23, 2009 12:02:23 /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3 2010-12-06 18:38:21

	package gts.modernization.parser.gra2mol;

	import gts.modernization.model.Gra2MoL.Core.*;
	import gts.modernization.model.Gra2MoL.Core.impl.*;
	import gts.modernization.model.Gra2MoL.Core.util.*;
	import gts.modernization.model.Gra2MoL.Query.*;
	import gts.modernization.model.Gra2MoL.Query.impl.*;
	import gts.modernization.model.Gra2MoL.Query.util.*;
	import java.util.Iterator;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.stringtemplate.*;
import org.antlr.stringtemplate.language.*;
import java.util.HashMap;
public class Gra2MoLParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ML_COMMENT", "OL_COMMENT", "DQVALUE", "ID", "QUOTE", "DOT", "DDOTS", "NUMBER", "TRIPLEBAR", "DOUBLEBAR", "BAR", "AND", "OR", "NOT", "AT", "AL", "PLUS", "IDESC", "DOUBLEQUOTE", "OPERATION", "WS", "'grammar'", "':'", "';'", "'metamodel'", "'hash'", "','", "'end_hash'", "'->'", "'default'", "'G'", "'('", "')'", "'MM'", "'end_rule'", "'mixin_rule'", "'rule'", "'skip_rule'", "'copy_rule'", "'from'", "'['", "'unique'", "']'", "'{'", "'}'", "'context'", "'mixin'", "'to'", "'queries'", "'for'", "'each'", "'in'", "'greater'", "'ext'", "'first'", "'last'", "'all'", "'mappings'", "'do'", "'='", "'if'", "'then'", "'else'", "'end_if'", "'skip'", "'*'", "'new'", "'map'", "'extract'", "'extractID'", "'execute'", "'removeQuotes'", "'count'", "'convertHexToString'"
    };
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__29=29;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__62=62;
    public static final int IDESC=21;
    public static final int T__26=26;
    public static final int T__63=63;
    public static final int T__25=25;
    public static final int NOT=17;
    public static final int AND=15;
    public static final int ID=7;
    public static final int T__61=61;
    public static final int DOUBLEQUOTE=22;
    public static final int EOF=-1;
    public static final int T__60=60;
    public static final int AT=18;
    public static final int T__55=55;
    public static final int ML_COMMENT=4;
    public static final int T__56=56;
    public static final int QUOTE=8;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__59=59;
    public static final int DOUBLEBAR=13;
    public static final int PLUS=20;
    public static final int DOT=9;
    public static final int AL=19;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int NUMBER=11;
    public static final int OL_COMMENT=5;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int WS=24;
    public static final int T__71=71;
    public static final int T__33=33;
    public static final int T__72=72;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int TRIPLEBAR=12;
    public static final int T__70=70;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int DDOTS=10;
    public static final int OR=16;
    public static final int DQVALUE=6;
    public static final int OPERATION=23;
    public static final int T__76=76;
    public static final int T__75=75;
    public static final int T__74=74;
    public static final int T__73=73;
    public static final int BAR=14;
    public static final int T__77=77;

    // delegates
    // delegators


        public Gra2MoLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public Gra2MoLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected StringTemplateGroup templateLib =
      new StringTemplateGroup("Gra2MoLParserTemplates", AngleBracketTemplateLexer.class);

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

    public String[] getTokenNames() { return Gra2MoLParser.tokenNames; }
    public String getGrammarFileName() { return "/Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3"; }


    public static class comment_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "comment"
    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:24:1: comment : ( ML_COMMENT | OL_COMMENT );
    public final Gra2MoLParser.comment_return comment() throws RecognitionException {
        Gra2MoLParser.comment_return retval = new Gra2MoLParser.comment_return();
        retval.start = input.LT(1);

        try {
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:25:2: ( ML_COMMENT | OL_COMMENT )
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:
            {
            if ( (input.LA(1)>=ML_COMMENT && input.LA(1)<=OL_COMMENT) ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
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
    // $ANTLR end "comment"

    public static class transformationDefinition_return extends ParserRuleReturnScope {
        public Transformation transformationReturn;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "transformationDefinition"
    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:29:1: transformationDefinition returns [Transformation transformationReturn] : ( 'grammar' ':' sourceGrammar= DQVALUE ';' )? ( 'metamodel' ':' targetMetamodel= DQVALUE ';' )? (hashes+= hash )* (rules+= rule )* ( comment )? ;
    public final Gra2MoLParser.transformationDefinition_return transformationDefinition() throws RecognitionException {
        Gra2MoLParser.transformationDefinition_return retval = new Gra2MoLParser.transformationDefinition_return();
        retval.start = input.LT(1);

        Token sourceGrammar=null;
        Token targetMetamodel=null;
        List list_hashes=null;
        List list_rules=null;
        RuleReturnScope hashes = null;
        RuleReturnScope rules = null;
        try {
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:30:2: ( ( 'grammar' ':' sourceGrammar= DQVALUE ';' )? ( 'metamodel' ':' targetMetamodel= DQVALUE ';' )? (hashes+= hash )* (rules+= rule )* ( comment )? )
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:30:4: ( 'grammar' ':' sourceGrammar= DQVALUE ';' )? ( 'metamodel' ':' targetMetamodel= DQVALUE ';' )? (hashes+= hash )* (rules+= rule )* ( comment )?
            {
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:30:4: ( 'grammar' ':' sourceGrammar= DQVALUE ';' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==25) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:30:5: 'grammar' ':' sourceGrammar= DQVALUE ';'
                    {
                    match(input,25,FOLLOW_25_in_transformationDefinition60); 
                    match(input,26,FOLLOW_26_in_transformationDefinition62); 
                    sourceGrammar=(Token)match(input,DQVALUE,FOLLOW_DQVALUE_in_transformationDefinition66); 
                    match(input,27,FOLLOW_27_in_transformationDefinition68); 

                    }
                    break;

            }

            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:31:3: ( 'metamodel' ':' targetMetamodel= DQVALUE ';' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==28) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:31:4: 'metamodel' ':' targetMetamodel= DQVALUE ';'
                    {
                    match(input,28,FOLLOW_28_in_transformationDefinition76); 
                    match(input,26,FOLLOW_26_in_transformationDefinition78); 
                    targetMetamodel=(Token)match(input,DQVALUE,FOLLOW_DQVALUE_in_transformationDefinition82); 
                    match(input,27,FOLLOW_27_in_transformationDefinition84); 

                    }
                    break;

            }

            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:32:9: (hashes+= hash )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=ML_COMMENT && LA3_0<=OL_COMMENT)) ) {
                    int LA3_1 = input.LA(2);

                    if ( (LA3_1==29) ) {
                        alt3=1;
                    }


                }
                else if ( (LA3_0==29) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:32:9: hashes+= hash
            	    {
            	    pushFollow(FOLLOW_hash_in_transformationDefinition92);
            	    hashes=hash();

            	    state._fsp--;

            	    if (list_hashes==null) list_hashes=new ArrayList();
            	    list_hashes.add(((hash_return) hashes).hashReturn);


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:32:22: (rules+= rule )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=ML_COMMENT && LA4_0<=OL_COMMENT)) ) {
                    int LA4_1 = input.LA(2);

                    if ( ((LA4_1>=39 && LA4_1<=42)) ) {
                        alt4=1;
                    }


                }
                else if ( ((LA4_0>=39 && LA4_0<=42)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:32:22: rules+= rule
            	    {
            	    pushFollow(FOLLOW_rule_in_transformationDefinition97);
            	    rules=rule();

            	    state._fsp--;

            	    if (list_rules==null) list_rules=new ArrayList();
            	    list_rules.add(((rule_return) rules).ruleReturn);


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:32:30: ( comment )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=ML_COMMENT && LA5_0<=OL_COMMENT)) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:32:30: comment
                    {
                    pushFollow(FOLLOW_comment_in_transformationDefinition100);
                    comment();

                    state._fsp--;


                    }
                    break;

            }


            		Transformation tDef = CoreFactoryImpl.eINSTANCE.createTransformation();
            		if(sourceGrammar != null) tDef.setSourceGrammar((sourceGrammar!=null?sourceGrammar.getText():null)); 
            		if(targetMetamodel != null) tDef.setTargetMetamodel((targetMetamodel!=null?targetMetamodel.getText():null)); 
            		if(list_rules != null) tDef.getRules().addAll(list_rules); 
            		if(list_hashes != null) tDef.getHashes().addAll(list_hashes); 
            		retval.transformationReturn = tDef;
            	

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
    // $ANTLR end "transformationDefinition"

    public static class hash_return extends ParserRuleReturnScope {
        public Hash hashReturn;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "hash"
    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:43:1: hash returns [Hash hashReturn] : ( comment )? 'hash' name= ID content+= hashValue ( ',' content+= hashValue )* 'end_hash' ;
    public final Gra2MoLParser.hash_return hash() throws RecognitionException {
        Gra2MoLParser.hash_return retval = new Gra2MoLParser.hash_return();
        retval.start = input.LT(1);

        Token name=null;
        List list_content=null;
        RuleReturnScope content = null;
        try {
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:44:2: ( ( comment )? 'hash' name= ID content+= hashValue ( ',' content+= hashValue )* 'end_hash' )
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:44:4: ( comment )? 'hash' name= ID content+= hashValue ( ',' content+= hashValue )* 'end_hash'
            {
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:44:4: ( comment )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=ML_COMMENT && LA6_0<=OL_COMMENT)) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:44:4: comment
                    {
                    pushFollow(FOLLOW_comment_in_hash120);
                    comment();

                    state._fsp--;


                    }
                    break;

            }

            match(input,29,FOLLOW_29_in_hash123); 
            name=(Token)match(input,ID,FOLLOW_ID_in_hash127); 
            pushFollow(FOLLOW_hashValue_in_hash131);
            content=hashValue();

            state._fsp--;

            if (list_content==null) list_content=new ArrayList();
            list_content.add(((hashValue_return) content).hashValueReturn);

            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:44:47: ( ',' content+= hashValue )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==30) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:44:48: ',' content+= hashValue
            	    {
            	    match(input,30,FOLLOW_30_in_hash134); 
            	    pushFollow(FOLLOW_hashValue_in_hash138);
            	    content=hashValue();

            	    state._fsp--;

            	    if (list_content==null) list_content=new ArrayList();
            	    list_content.add(((hashValue_return) content).hashValueReturn);


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            match(input,31,FOLLOW_31_in_hash142); 

            		Hash m = CoreFactoryImpl.eINSTANCE.createHash();
            		m.setName((name!=null?name.getText():null));
            		if(list_content != null) m.getContent().addAll(list_content);
            		retval.hashReturn = m;
            	

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
    // $ANTLR end "hash"

    public static class hashValue_return extends ParserRuleReturnScope {
        public HashValue hashValueReturn;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "hashValue"
    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:53:1: hashValue returns [HashValue hashValueReturn] : (from= hashValuePart '->' to= hashValuePart | 'default' '->' to= hashValuePart );
    public final Gra2MoLParser.hashValue_return hashValue() throws RecognitionException {
        Gra2MoLParser.hashValue_return retval = new Gra2MoLParser.hashValue_return();
        retval.start = input.LT(1);

        Gra2MoLParser.hashValuePart_return from = null;

        Gra2MoLParser.hashValuePart_return to = null;


        try {
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:54:2: (from= hashValuePart '->' to= hashValuePart | 'default' '->' to= hashValuePart )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==DQVALUE||LA8_0==34||LA8_0==37) ) {
                alt8=1;
            }
            else if ( (LA8_0==33) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:54:4: from= hashValuePart '->' to= hashValuePart
                    {
                    pushFollow(FOLLOW_hashValuePart_in_hashValue164);
                    from=hashValuePart();

                    state._fsp--;

                    match(input,32,FOLLOW_32_in_hashValue166); 
                    pushFollow(FOLLOW_hashValuePart_in_hashValue170);
                    to=hashValuePart();

                    state._fsp--;


                    		HashValue mv = CoreFactoryImpl.eINSTANCE.createHashValue();
                    		mv.setFromElement((from!=null?from.element:null));
                    		mv.setFromElementType((from!=null?from.type:null));
                    		mv.setToElement((to!=null?to.element:null));
                    		mv.setToElementType((to!=null?to.type:null));
                    		retval.hashValueReturn = mv;
                    	

                    }
                    break;
                case 2 :
                    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:63:4: 'default' '->' to= hashValuePart
                    {
                    match(input,33,FOLLOW_33_in_hashValue178); 
                    match(input,32,FOLLOW_32_in_hashValue180); 
                    pushFollow(FOLLOW_hashValuePart_in_hashValue184);
                    to=hashValuePart();

                    state._fsp--;


                    		HashValue mv = CoreFactoryImpl.eINSTANCE.createHashValue();
                    		mv.setFromElement("DEFAULT");
                    		mv.setFromElementType(HashValueType.DEFAULT);
                    		mv.setToElement((to!=null?to.element:null));
                    		mv.setToElementType((to!=null?to.type:null));
                    		retval.hashValueReturn = mv;
                    	

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
    // $ANTLR end "hashValue"

    public static class hashValuePart_return extends ParserRuleReturnScope {
        public String element;
        public HashValueType type;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "hashValuePart"
    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:74:1: hashValuePart returns [String element, HashValueType type] : (e= DQVALUE | 'G' '(' e= ID ')' | 'MM' '(' nm= normalName ')' );
    public final Gra2MoLParser.hashValuePart_return hashValuePart() throws RecognitionException {
        Gra2MoLParser.hashValuePart_return retval = new Gra2MoLParser.hashValuePart_return();
        retval.start = input.LT(1);

        Token e=null;
        Gra2MoLParser.normalName_return nm = null;


        try {
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:75:2: (e= DQVALUE | 'G' '(' e= ID ')' | 'MM' '(' nm= normalName ')' )
            int alt9=3;
            switch ( input.LA(1) ) {
            case DQVALUE:
                {
                alt9=1;
                }
                break;
            case 34:
                {
                alt9=2;
                }
                break;
            case 37:
                {
                alt9=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:75:4: e= DQVALUE
                    {
                    e=(Token)match(input,DQVALUE,FOLLOW_DQVALUE_in_hashValuePart204); 

                    		retval.element = ((e!=null?e.getText():null)).substring(1, ((e!=null?e.getText():null)).length()-1);
                    		retval.type = HashValueType.VALUE;
                    	

                    }
                    break;
                case 2 :
                    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:80:4: 'G' '(' e= ID ')'
                    {
                    match(input,34,FOLLOW_34_in_hashValuePart213); 
                    match(input,35,FOLLOW_35_in_hashValuePart215); 
                    e=(Token)match(input,ID,FOLLOW_ID_in_hashValuePart219); 
                    match(input,36,FOLLOW_36_in_hashValuePart221); 

                    		retval.element = (e!=null?e.getText():null);
                    		retval.type = HashValueType.GRAMMAR_ELEMENT;
                    	

                    }
                    break;
                case 3 :
                    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:85:4: 'MM' '(' nm= normalName ')'
                    {
                    match(input,37,FOLLOW_37_in_hashValuePart230); 
                    match(input,35,FOLLOW_35_in_hashValuePart232); 
                    pushFollow(FOLLOW_normalName_in_hashValuePart236);
                    nm=normalName();

                    state._fsp--;

                    match(input,36,FOLLOW_36_in_hashValuePart238); 

                    		retval.element = (nm!=null?input.toString(nm.start,nm.stop):null);
                    		retval.type = HashValueType.METAMODEL_ELEMENT;
                    	

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
    // $ANTLR end "hashValuePart"

    public static class rule_return extends ParserRuleReturnScope {
        public Rule ruleReturn;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "rule"
    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:92:1: rule returns [Rule ruleReturn] : (mRule= mixinRule | stRule= standardRule );
    public final Gra2MoLParser.rule_return rule() throws RecognitionException {
        Gra2MoLParser.rule_return retval = new Gra2MoLParser.rule_return();
        retval.start = input.LT(1);

        Gra2MoLParser.mixinRule_return mRule = null;

        Gra2MoLParser.standardRule_return stRule = null;


        try {
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:93:2: (mRule= mixinRule | stRule= standardRule )
            int alt10=2;
            switch ( input.LA(1) ) {
            case ML_COMMENT:
            case OL_COMMENT:
                {
                int LA10_1 = input.LA(2);

                if ( (LA10_1==39) ) {
                    alt10=1;
                }
                else if ( ((LA10_1>=40 && LA10_1<=42)) ) {
                    alt10=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 1, input);

                    throw nvae;
                }
                }
                break;
            case 39:
                {
                alt10=1;
                }
                break;
            case 40:
            case 41:
            case 42:
                {
                alt10=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:93:5: mRule= mixinRule
                    {
                    pushFollow(FOLLOW_mixinRule_in_rule262);
                    mRule=mixinRule();

                    state._fsp--;


                    		retval.ruleReturn = (Rule) (mRule!=null?mRule.mixinRuleReturn:null); 
                    	

                    }
                    break;
                case 2 :
                    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:97:4: stRule= standardRule
                    {
                    pushFollow(FOLLOW_standardRule_in_rule272);
                    stRule=standardRule();

                    state._fsp--;


                    		retval.ruleReturn = (Rule) (stRule!=null?stRule.standardRuleReturn:null); 
                    	

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
    // $ANTLR end "rule"

    public static class standardRule_return extends ParserRuleReturnScope {
        public Rule standardRuleReturn;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "standardRule"
    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:103:1: standardRule returns [Rule standardRuleReturn] : ( comment )? typeR= ruleType name= ruleName fElement= fromElement (cElement= contextElement )? (tElement= toElement )? (mElement= mixinElement )? qList= queryList iList= initList 'end_rule' ;
    public final Gra2MoLParser.standardRule_return standardRule() throws RecognitionException {
        Gra2MoLParser.standardRule_return retval = new Gra2MoLParser.standardRule_return();
        retval.start = input.LT(1);

        Gra2MoLParser.ruleType_return typeR = null;

        Gra2MoLParser.ruleName_return name = null;

        Gra2MoLParser.fromElement_return fElement = null;

        Gra2MoLParser.contextElement_return cElement = null;

        Gra2MoLParser.toElement_return tElement = null;

        Gra2MoLParser.mixinElement_return mElement = null;

        Gra2MoLParser.queryList_return qList = null;

        Gra2MoLParser.initList_return iList = null;


        try {
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:104:2: ( ( comment )? typeR= ruleType name= ruleName fElement= fromElement (cElement= contextElement )? (tElement= toElement )? (mElement= mixinElement )? qList= queryList iList= initList 'end_rule' )
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:104:4: ( comment )? typeR= ruleType name= ruleName fElement= fromElement (cElement= contextElement )? (tElement= toElement )? (mElement= mixinElement )? qList= queryList iList= initList 'end_rule'
            {
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:104:4: ( comment )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=ML_COMMENT && LA11_0<=OL_COMMENT)) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:104:4: comment
                    {
                    pushFollow(FOLLOW_comment_in_standardRule291);
                    comment();

                    state._fsp--;


                    }
                    break;

            }

            pushFollow(FOLLOW_ruleType_in_standardRule296);
            typeR=ruleType();

            state._fsp--;

            pushFollow(FOLLOW_ruleName_in_standardRule300);
            name=ruleName();

            state._fsp--;

            pushFollow(FOLLOW_fromElement_in_standardRule304);
            fElement=fromElement();

            state._fsp--;

            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:104:63: (cElement= contextElement )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==49) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:104:64: cElement= contextElement
                    {
                    pushFollow(FOLLOW_contextElement_in_standardRule309);
                    cElement=contextElement();

                    state._fsp--;


                    }
                    break;

            }

            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:104:90: (tElement= toElement )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=ML_COMMENT && LA13_0<=OL_COMMENT)) ) {
                int LA13_1 = input.LA(2);

                if ( (LA13_1==51) ) {
                    alt13=1;
                }
            }
            else if ( (LA13_0==51) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:104:91: tElement= toElement
                    {
                    pushFollow(FOLLOW_toElement_in_standardRule316);
                    tElement=toElement();

                    state._fsp--;


                    }
                    break;

            }

            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:104:112: (mElement= mixinElement )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==50) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:104:113: mElement= mixinElement
                    {
                    pushFollow(FOLLOW_mixinElement_in_standardRule323);
                    mElement=mixinElement();

                    state._fsp--;


                    }
                    break;

            }

            pushFollow(FOLLOW_queryList_in_standardRule329);
            qList=queryList();

            state._fsp--;

            pushFollow(FOLLOW_initList_in_standardRule333);
            iList=initList();

            state._fsp--;

            match(input,38,FOLLOW_38_in_standardRule335); 
            		
            		StandardRule r = CoreFactoryImpl.eINSTANCE.createStandardRule();
            		r.setType((typeR!=null?typeR.rt:null));
            		r.setName((name!=null?name.name:null));		
            		r.setFrom((fElement!=null?fElement.fromElem:null));
            		if(cElement != null) r.getContext().addAll((cElement!=null?cElement.context:null));
            		if(tElement != null) r.setTo((tElement!=null?tElement.toElem:null));
            		if(mElement != null) r.getMixins().addAll((mElement!=null?mElement.mixins:null));
            		if((qList!=null?qList.returnList:null) != null) r.getQueries().addAll((qList!=null?qList.returnList:null));
            		if((iList!=null?iList.initListReturn:null) != null) r.setInits((iList!=null?iList.initListReturn:null));		
            		retval.standardRuleReturn = r;
            	

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
    // $ANTLR end "standardRule"

    public static class mixinRule_return extends ParserRuleReturnScope {
        public Rule mixinRuleReturn;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "mixinRule"
    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:119:1: mixinRule returns [Rule mixinRuleReturn] : ( comment )? 'mixin_rule' name= ruleName qList= queryList iList= initList 'end_rule' ;
    public final Gra2MoLParser.mixinRule_return mixinRule() throws RecognitionException {
        Gra2MoLParser.mixinRule_return retval = new Gra2MoLParser.mixinRule_return();
        retval.start = input.LT(1);

        Gra2MoLParser.ruleName_return name = null;

        Gra2MoLParser.queryList_return qList = null;

        Gra2MoLParser.initList_return iList = null;


        try {
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:120:2: ( ( comment )? 'mixin_rule' name= ruleName qList= queryList iList= initList 'end_rule' )
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:120:4: ( comment )? 'mixin_rule' name= ruleName qList= queryList iList= initList 'end_rule'
            {
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:120:4: ( comment )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0>=ML_COMMENT && LA15_0<=OL_COMMENT)) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:120:4: comment
                    {
                    pushFollow(FOLLOW_comment_in_mixinRule353);
                    comment();

                    state._fsp--;


                    }
                    break;

            }

            match(input,39,FOLLOW_39_in_mixinRule356); 
            pushFollow(FOLLOW_ruleName_in_mixinRule360);
            name=ruleName();

            state._fsp--;

            pushFollow(FOLLOW_queryList_in_mixinRule364);
            qList=queryList();

            state._fsp--;

            pushFollow(FOLLOW_initList_in_mixinRule368);
            iList=initList();

            state._fsp--;

            match(input,38,FOLLOW_38_in_mixinRule370); 
            		
            		MixinRule r = CoreFactoryImpl.eINSTANCE.createMixinRule();
            		r.setName((name!=null?name.name:null));		
            		if((qList!=null?qList.returnList:null) != null) r.getQueries().addAll((qList!=null?qList.returnList:null));
            		if((iList!=null?iList.initListReturn:null) != null) r.setInits((iList!=null?iList.initListReturn:null));		
            		retval.mixinRuleReturn = r;
            	

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
    // $ANTLR end "mixinRule"

    public static class ruleType_return extends ParserRuleReturnScope {
        public RuleType rt;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "ruleType"
    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:130:1: ruleType returns [RuleType rt] : ( 'rule' | 'skip_rule' | 'copy_rule' );
    public final Gra2MoLParser.ruleType_return ruleType() throws RecognitionException {
        Gra2MoLParser.ruleType_return retval = new Gra2MoLParser.ruleType_return();
        retval.start = input.LT(1);

        try {
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:131:2: ( 'rule' | 'skip_rule' | 'copy_rule' )
            int alt16=3;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt16=1;
                }
                break;
            case 41:
                {
                alt16=2;
                }
                break;
            case 42:
                {
                alt16=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:131:4: 'rule'
                    {
                    match(input,40,FOLLOW_40_in_ruleType388); 

                    			retval.rt = RuleType.NORMAL;
                    		

                    }
                    break;
                case 2 :
                    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:135:4: 'skip_rule'
                    {
                    match(input,41,FOLLOW_41_in_ruleType397); 

                    			retval.rt = RuleType.SKIP;
                    		

                    }
                    break;
                case 3 :
                    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:139:4: 'copy_rule'
                    {
                    match(input,42,FOLLOW_42_in_ruleType406); 

                    			retval.rt = RuleType.COPY;
                    		

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
    // $ANTLR end "ruleType"

    public static class ruleName_return extends ParserRuleReturnScope {
        public String name;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "ruleName"
    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:145:1: ruleName returns [String name] : ( QUOTE )? ID ( QUOTE )? ;
    public final Gra2MoLParser.ruleName_return ruleName() throws RecognitionException {
        Gra2MoLParser.ruleName_return retval = new Gra2MoLParser.ruleName_return();
        retval.start = input.LT(1);

        Token ID1=null;

        try {
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:146:2: ( ( QUOTE )? ID ( QUOTE )? )
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:146:4: ( QUOTE )? ID ( QUOTE )?
            {
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:146:4: ( QUOTE )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==QUOTE) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:146:5: QUOTE
                    {
                    match(input,QUOTE,FOLLOW_QUOTE_in_ruleName426); 

                    }
                    break;

            }

            ID1=(Token)match(input,ID,FOLLOW_ID_in_ruleName430); 
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:146:16: ( QUOTE )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==QUOTE) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:146:17: QUOTE
                    {
                    match(input,QUOTE,FOLLOW_QUOTE_in_ruleName433); 

                    }
                    break;

            }


            		retval.name = (ID1!=null?ID1.getText():null);
            	

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
    // $ANTLR end "ruleName"

    public static class fromElement_return extends ParserRuleReturnScope {
        public FromElement fromElem;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "fromElement"
    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:152:1: fromElement returns [FromElement fromElem] : ( ( comment )? 'from' elem= id ( '[' uniq= 'unique' ']' )? ( '{' fExp= filterExpression '}' )? (fUnit= filterUnit )? (al= ID )? | ( comment )? 'from' fUnit= filterUnit (al= ID )? );
    public final Gra2MoLParser.fromElement_return fromElement() throws RecognitionException {
        Gra2MoLParser.fromElement_return retval = new Gra2MoLParser.fromElement_return();
        retval.start = input.LT(1);

        Token uniq=null;
        Token al=null;
        Gra2MoLParser.id_return elem = null;

        Gra2MoLParser.filterExpression_return fExp = null;

        Gra2MoLParser.filterUnit_return fUnit = null;


        try {
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:153:2: ( ( comment )? 'from' elem= id ( '[' uniq= 'unique' ']' )? ( '{' fExp= filterExpression '}' )? (fUnit= filterUnit )? (al= ID )? | ( comment )? 'from' fUnit= filterUnit (al= ID )? )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( ((LA26_0>=ML_COMMENT && LA26_0<=OL_COMMENT)) ) {
                int LA26_1 = input.LA(2);

                if ( (LA26_1==43) ) {
                    int LA26_2 = input.LA(3);

                    if ( (LA26_2==ID||LA26_2==IDESC) ) {
                        alt26=1;
                    }
                    else if ( ((LA26_2>=TRIPLEBAR && LA26_2<=BAR)) ) {
                        alt26=2;
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
            else if ( (LA26_0==43) ) {
                int LA26_2 = input.LA(2);

                if ( (LA26_2==ID||LA26_2==IDESC) ) {
                    alt26=1;
                }
                else if ( ((LA26_2>=TRIPLEBAR && LA26_2<=BAR)) ) {
                    alt26=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 26, 2, input);

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
                    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:153:5: ( comment )? 'from' elem= id ( '[' uniq= 'unique' ']' )? ( '{' fExp= filterExpression '}' )? (fUnit= filterUnit )? (al= ID )?
                    {
                    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:153:5: ( comment )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( ((LA19_0>=ML_COMMENT && LA19_0<=OL_COMMENT)) ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:153:5: comment
                            {
                            pushFollow(FOLLOW_comment_in_fromElement454);
                            comment();

                            state._fsp--;


                            }
                            break;

                    }

                    match(input,43,FOLLOW_43_in_fromElement457); 
                    pushFollow(FOLLOW_id_in_fromElement461);
                    elem=id();

                    state._fsp--;

                    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:153:29: ( '[' uniq= 'unique' ']' )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==44) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:153:30: '[' uniq= 'unique' ']'
                            {
                            match(input,44,FOLLOW_44_in_fromElement464); 
                            uniq=(Token)match(input,45,FOLLOW_45_in_fromElement468); 
                            match(input,46,FOLLOW_46_in_fromElement470); 

                            }
                            break;

                    }

                    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:153:54: ( '{' fExp= filterExpression '}' )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==47) ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:153:55: '{' fExp= filterExpression '}'
                            {
                            match(input,47,FOLLOW_47_in_fromElement475); 
                            pushFollow(FOLLOW_filterExpression_in_fromElement479);
                            fExp=filterExpression();

                            state._fsp--;

                            match(input,48,FOLLOW_48_in_fromElement481); 

                            }
                            break;

                    }

                    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:153:87: (fUnit= filterUnit )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( ((LA22_0>=TRIPLEBAR && LA22_0<=BAR)) ) {
                        alt22=1;
                    }
                    switch (alt22) {
                        case 1 :
                            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:153:88: fUnit= filterUnit
                            {
                            pushFollow(FOLLOW_filterUnit_in_fromElement488);
                            fUnit=filterUnit();

                            state._fsp--;


                            }
                            break;

                    }

                    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:153:107: (al= ID )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==ID) ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:153:108: al= ID
                            {
                            al=(Token)match(input,ID,FOLLOW_ID_in_fromElement495); 

                            }
                            break;

                    }


                    		FromElement fElement = CoreFactoryImpl.eINSTANCE.createFromElement();
                    		fElement.setName((elem!=null?elem.identifier:null));
                    		if(al != null) { fElement.setAlias((al!=null?al.getText():null)); }
                    		
                    		QueryUnit qUnit = QueryFactoryImpl.eINSTANCE.createQueryUnit();
                    		qUnit.setAbsoluteQuery(false);
                    		if(al != null) { qUnit.setVariable((al!=null?al.getText():null)); }
                    		
                    		FilterUnit fu = QueryFactoryImpl.eINSTANCE.createFilterUnit();
                    		fu.setType(FilterType.DIRECT);
                    		QueryElement qe = QueryFactoryImpl.eINSTANCE.createQueryElement();
                    		qe.setMark(true);
                    		qe.setName((elem!=null?elem.identifier:null));
                    		qe.setType(QueryElementType.NODE);
                    		fu.setElement(qe);
                    		if(uniq != null) fu.setOperation(FilterOperationType.UNIQUE);
                    		if(fExp != null) fu.setExpression((fExp!=null?fExp.filterExpressionReturn:null));
                    		if(fUnit != null) fu.setNext((fUnit!=null?fUnit.filterUnitReturn:null));
                    		qUnit.setFilter(fu);
                    		
                    		fElement.setFilter(qUnit);
                    		retval.fromElem = fElement;
                    	

                    }
                    break;
                case 2 :
                    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:178:4: ( comment )? 'from' fUnit= filterUnit (al= ID )?
                    {
                    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:178:4: ( comment )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( ((LA24_0>=ML_COMMENT && LA24_0<=OL_COMMENT)) ) {
                        alt24=1;
                    }
                    switch (alt24) {
                        case 1 :
                            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:178:4: comment
                            {
                            pushFollow(FOLLOW_comment_in_fromElement505);
                            comment();

                            state._fsp--;


                            }
                            break;

                    }

                    match(input,43,FOLLOW_43_in_fromElement508); 
                    pushFollow(FOLLOW_filterUnit_in_fromElement512);
                    fUnit=filterUnit();

                    state._fsp--;

                    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:178:37: (al= ID )?
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==ID) ) {
                        alt25=1;
                    }
                    switch (alt25) {
                        case 1 :
                            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:178:38: al= ID
                            {
                            al=(Token)match(input,ID,FOLLOW_ID_in_fromElement517); 

                            }
                            break;

                    }


                    		FromElement fElement = CoreFactoryImpl.eINSTANCE.createFromElement();
                    		
                    		QueryUnit qUnit = QueryFactoryImpl.eINSTANCE.createQueryUnit();
                    		qUnit.setAbsoluteQuery(true);
                    		if(al != null) { qUnit.setVariable((al!=null?al.getText():null)); }
                    		if(fUnit != null) { qUnit.setFilter((fUnit!=null?fUnit.filterUnitReturn:null)); }
                    		fElement.setFilter(qUnit);
                    		if(qUnit.getMarkedFilterUnit() != null && qUnit.getMarkedFilterUnit().getElement() != null) {
                    			fElement.setName(qUnit.getMarkedFilterUnit().getElement().getName());
                    		}
                    		if(al != null) { fElement.setAlias((al!=null?al.getText():null)); }	
                    		retval.fromElem = fElement;	
                    	

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
    // $ANTLR end "fromElement"

    public static class contextElement_return extends ParserRuleReturnScope {
        public List context;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "contextElement"
    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:195:1: contextElement returns [List context] : 'context' ctx+= ID ( ',' ctx+= ID )* ;
    public final Gra2MoLParser.contextElement_return contextElement() throws RecognitionException {
        Gra2MoLParser.contextElement_return retval = new Gra2MoLParser.contextElement_return();
        retval.start = input.LT(1);

        Token ctx=null;
        List list_ctx=null;


        	retval.context = new ArrayList();

        try {
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:199:2: ( 'context' ctx+= ID ( ',' ctx+= ID )* )
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:199:4: 'context' ctx+= ID ( ',' ctx+= ID )*
            {
            match(input,49,FOLLOW_49_in_contextElement544); 
            ctx=(Token)match(input,ID,FOLLOW_ID_in_contextElement548); 
            if (list_ctx==null) list_ctx=new ArrayList();
            list_ctx.add(ctx);

            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:199:22: ( ',' ctx+= ID )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==30) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:199:23: ',' ctx+= ID
            	    {
            	    match(input,30,FOLLOW_30_in_contextElement551); 
            	    ctx=(Token)match(input,ID,FOLLOW_ID_in_contextElement555); 
            	    if (list_ctx==null) list_ctx=new ArrayList();
            	    list_ctx.add(ctx);


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);


            		 	for(Iterator it = list_ctx.iterator(); it.hasNext(); )  { 
            				Token t = (Token) it.next(); 
            				retval.context.add(t.getText());
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
    // $ANTLR end "contextElement"

    public static class mixinElement_return extends ParserRuleReturnScope {
        public List mixins;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "mixinElement"
    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:208:1: mixinElement returns [List mixins] : 'mixin' mx+= ID ( ',' mx+= ID )* ;
    public final Gra2MoLParser.mixinElement_return mixinElement() throws RecognitionException {
        Gra2MoLParser.mixinElement_return retval = new Gra2MoLParser.mixinElement_return();
        retval.start = input.LT(1);

        Token mx=null;
        List list_mx=null;


        	retval.mixins = new ArrayList();

        try {
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:212:2: ( 'mixin' mx+= ID ( ',' mx+= ID )* )
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:212:4: 'mixin' mx+= ID ( ',' mx+= ID )*
            {
            match(input,50,FOLLOW_50_in_mixinElement584); 
            mx=(Token)match(input,ID,FOLLOW_ID_in_mixinElement588); 
            if (list_mx==null) list_mx=new ArrayList();
            list_mx.add(mx);

            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:212:19: ( ',' mx+= ID )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==30) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:212:20: ',' mx+= ID
            	    {
            	    match(input,30,FOLLOW_30_in_mixinElement591); 
            	    mx=(Token)match(input,ID,FOLLOW_ID_in_mixinElement595); 
            	    if (list_mx==null) list_mx=new ArrayList();
            	    list_mx.add(mx);


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);


            		 	for(Iterator it = list_mx.iterator(); it.hasNext(); )  { 
            				Token t = (Token) it.next(); 
            				retval.mixins.add(t.getText());
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
    // $ANTLR end "mixinElement"

    public static class toElement_return extends ParserRuleReturnScope {
        public ToElement toElem;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "toElement"
    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:221:1: toElement returns [ToElement toElem] : ( comment )? 'to' normalName (al= ID )? ;
    public final Gra2MoLParser.toElement_return toElement() throws RecognitionException {
        Gra2MoLParser.toElement_return retval = new Gra2MoLParser.toElement_return();
        retval.start = input.LT(1);

        Token al=null;
        Gra2MoLParser.normalName_return normalName2 = null;


        try {
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:222:2: ( ( comment )? 'to' normalName (al= ID )? )
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:222:5: ( comment )? 'to' normalName (al= ID )?
            {
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:222:5: ( comment )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( ((LA29_0>=ML_COMMENT && LA29_0<=OL_COMMENT)) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:222:5: comment
                    {
                    pushFollow(FOLLOW_comment_in_toElement617);
                    comment();

                    state._fsp--;


                    }
                    break;

            }

            match(input,51,FOLLOW_51_in_toElement620); 
            pushFollow(FOLLOW_normalName_in_toElement622);
            normalName2=normalName();

            state._fsp--;

            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:222:30: (al= ID )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==ID) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:222:31: al= ID
                    {
                    al=(Token)match(input,ID,FOLLOW_ID_in_toElement627); 

                    }
                    break;

            }


            		ToElement tElement = CoreFactoryImpl.eINSTANCE.createToElement();
            		tElement.setName((normalName2!=null?input.toString(normalName2.start,normalName2.stop):null));
            		if (al != null) { tElement.setAlias((al!=null?al.getText():null)); }
            		retval.toElem = tElement;
            	

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
    // $ANTLR end "toElement"

    public static class normalName_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "normalName"
    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:231:1: normalName : ID ( ( DOT | DDOTS ) ID )* ;
    public final Gra2MoLParser.normalName_return normalName() throws RecognitionException {
        Gra2MoLParser.normalName_return retval = new Gra2MoLParser.normalName_return();
        retval.start = input.LT(1);

        try {
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:232:2: ( ID ( ( DOT | DDOTS ) ID )* )
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:232:5: ID ( ( DOT | DDOTS ) ID )*
            {
            match(input,ID,FOLLOW_ID_in_normalName644); 
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:232:8: ( ( DOT | DDOTS ) ID )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( ((LA31_0>=DOT && LA31_0<=DDOTS)) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:232:9: ( DOT | DDOTS ) ID
            	    {
            	    if ( (input.LA(1)>=DOT && input.LA(1)<=DDOTS) ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    match(input,ID,FOLLOW_ID_in_normalName655); 

            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);


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
    // $ANTLR end "normalName"

    public static class queryList_return extends ParserRuleReturnScope {
        public List returnList;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "queryList"
    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:235:1: queryList returns [List returnList] : ( comment )? 'queries' (qList+= query )* ;
    public final Gra2MoLParser.queryList_return queryList() throws RecognitionException {
        Gra2MoLParser.queryList_return retval = new Gra2MoLParser.queryList_return();
        retval.start = input.LT(1);

        List list_qList=null;
        RuleReturnScope qList = null;
        try {
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:236:2: ( ( comment )? 'queries' (qList+= query )* )
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:236:4: ( comment )? 'queries' (qList+= query )*
            {
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:236:4: ( comment )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( ((LA32_0>=ML_COMMENT && LA32_0<=OL_COMMENT)) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:236:4: comment
                    {
                    pushFollow(FOLLOW_comment_in_queryList673);
                    comment();

                    state._fsp--;


                    }
                    break;

            }

            match(input,52,FOLLOW_52_in_queryList676); 
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:236:28: (qList+= query )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( ((LA33_0>=ML_COMMENT && LA33_0<=OL_COMMENT)) ) {
                    int LA33_1 = input.LA(2);

                    if ( (LA33_1==ID) ) {
                        alt33=1;
                    }


                }
                else if ( (LA33_0==ID) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:236:28: qList+= query
            	    {
            	    pushFollow(FOLLOW_query_in_queryList680);
            	    qList=query();

            	    state._fsp--;

            	    if (list_qList==null) list_qList=new ArrayList();
            	    list_qList.add(((query_return) qList).queryReturn);


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);


            		retval.returnList = list_qList;
            	

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
    // $ANTLR end "queryList"

    public static class query_return extends ParserRuleReturnScope {
        public QueryUnit queryReturn;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "query"
    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:242:1: query returns [QueryUnit queryReturn] : ( comment )? var= ID ':' ( '{' control= queryControl '}' )? ( '(' cast= ID ')' )? fUnit= filterUnit ';' ;
    public final Gra2MoLParser.query_return query() throws RecognitionException {
        Gra2MoLParser.query_return retval = new Gra2MoLParser.query_return();
        retval.start = input.LT(1);

        Token var=null;
        Token cast=null;
        Gra2MoLParser.queryControl_return control = null;

        Gra2MoLParser.filterUnit_return fUnit = null;


        try {
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:243:2: ( ( comment )? var= ID ':' ( '{' control= queryControl '}' )? ( '(' cast= ID ')' )? fUnit= filterUnit ';' )
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:243:4: ( comment )? var= ID ':' ( '{' control= queryControl '}' )? ( '(' cast= ID ')' )? fUnit= filterUnit ';'
            {
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:243:4: ( comment )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( ((LA34_0>=ML_COMMENT && LA34_0<=OL_COMMENT)) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:243:4: comment
                    {
                    pushFollow(FOLLOW_comment_in_query699);
                    comment();

                    state._fsp--;


                    }
                    break;

            }

            var=(Token)match(input,ID,FOLLOW_ID_in_query704); 
            match(input,26,FOLLOW_26_in_query706); 
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:243:24: ( '{' control= queryControl '}' )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==47) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:243:26: '{' control= queryControl '}'
                    {
                    match(input,47,FOLLOW_47_in_query710); 
                    pushFollow(FOLLOW_queryControl_in_query714);
                    control=queryControl();

                    state._fsp--;

                    match(input,48,FOLLOW_48_in_query716); 

                    }
                    break;

            }

            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:243:58: ( '(' cast= ID ')' )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==35) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:243:59: '(' cast= ID ')'
                    {
                    match(input,35,FOLLOW_35_in_query722); 
                    cast=(Token)match(input,ID,FOLLOW_ID_in_query726); 
                    match(input,36,FOLLOW_36_in_query728); 

                    }
                    break;

            }

            pushFollow(FOLLOW_filterUnit_in_query734);
            fUnit=filterUnit();

            state._fsp--;

            match(input,27,FOLLOW_27_in_query736); 

            		QueryUnit qu = QueryFactoryImpl.eINSTANCE.createQueryUnit();
            		qu.setVariable((var!=null?var.getText():null));
            		if(control != null) qu.setControl((control!=null?control.queryControlReturn:null));
            		if(cast != null) qu.setCast((cast!=null?cast.getText():null));
            		qu.setFilter((fUnit!=null?fUnit.filterUnitReturn:null));
            		retval.queryReturn = qu;
            	

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
    // $ANTLR end "query"

    public static class queryControl_return extends ParserRuleReturnScope {
        public QueryControl queryControlReturn;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "queryControl"
    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:254:1: queryControl returns [QueryControl queryControlReturn] : ( 'for' 'each' var= ID 'in' qvar= ID | 'greater' (nodeId= ID ( '[' nodePos= NUMBER ']' )? DOT )? var= ID | 'ext' op= normalName ( '(' pList+= param ( ',' pList+= param )? ')' )? );
    public final Gra2MoLParser.queryControl_return queryControl() throws RecognitionException {
        Gra2MoLParser.queryControl_return retval = new Gra2MoLParser.queryControl_return();
        retval.start = input.LT(1);

        Token var=null;
        Token qvar=null;
        Token nodeId=null;
        Token nodePos=null;
        List list_pList=null;
        Gra2MoLParser.normalName_return op = null;

        RuleReturnScope pList = null;
        try {
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:255:2: ( 'for' 'each' var= ID 'in' qvar= ID | 'greater' (nodeId= ID ( '[' nodePos= NUMBER ']' )? DOT )? var= ID | 'ext' op= normalName ( '(' pList+= param ( ',' pList+= param )? ')' )? )
            int alt41=3;
            switch ( input.LA(1) ) {
            case 53:
                {
                alt41=1;
                }
                break;
            case 56:
                {
                alt41=2;
                }
                break;
            case 57:
                {
                alt41=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }

            switch (alt41) {
                case 1 :
                    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:255:4: 'for' 'each' var= ID 'in' qvar= ID
                    {
                    match(input,53,FOLLOW_53_in_queryControl757); 
                    match(input,54,FOLLOW_54_in_queryControl759); 
                    var=(Token)match(input,ID,FOLLOW_ID_in_queryControl763); 
                    match(input,55,FOLLOW_55_in_queryControl765); 
                    qvar=(Token)match(input,ID,FOLLOW_ID_in_queryControl769); 

                    		QueryControlFor qcf = QueryFactoryImpl.eINSTANCE.createQueryControlFor();
                    		if(var != null) qcf.setVariable((var!=null?var.getText():null));
                    		if(qvar != null) qcf.setQueryVariable((qvar!=null?qvar.getText():null));			
                    		retval.queryControlReturn = qcf;	
                    	

                    }
                    break;
                case 2 :
                    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:262:4: 'greater' (nodeId= ID ( '[' nodePos= NUMBER ']' )? DOT )? var= ID
                    {
                    match(input,56,FOLLOW_56_in_queryControl777); 
                    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:262:14: (nodeId= ID ( '[' nodePos= NUMBER ']' )? DOT )?
                    int alt38=2;
                    int LA38_0 = input.LA(1);

                    if ( (LA38_0==ID) ) {
                        int LA38_1 = input.LA(2);

                        if ( (LA38_1==DOT||LA38_1==44) ) {
                            alt38=1;
                        }
                    }
                    switch (alt38) {
                        case 1 :
                            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:262:15: nodeId= ID ( '[' nodePos= NUMBER ']' )? DOT
                            {
                            nodeId=(Token)match(input,ID,FOLLOW_ID_in_queryControl782); 
                            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:262:25: ( '[' nodePos= NUMBER ']' )?
                            int alt37=2;
                            int LA37_0 = input.LA(1);

                            if ( (LA37_0==44) ) {
                                alt37=1;
                            }
                            switch (alt37) {
                                case 1 :
                                    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:262:26: '[' nodePos= NUMBER ']'
                                    {
                                    match(input,44,FOLLOW_44_in_queryControl785); 
                                    nodePos=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_queryControl789); 
                                    match(input,46,FOLLOW_46_in_queryControl791); 

                                    }
                                    break;

                            }

                            match(input,DOT,FOLLOW_DOT_in_queryControl795); 

                            }
                            break;

                    }

                    var=(Token)match(input,ID,FOLLOW_ID_in_queryControl801); 

                    		QueryControlGreater qcf = QueryFactoryImpl.eINSTANCE.createQueryControlGreater();
                    		if(nodeId != null) qcf.setNodeId((nodeId!=null?nodeId.getText():null));		
                    		if(nodePos != null) qcf.setNodePosition(Integer.parseInt((nodePos!=null?nodePos.getText():null)));		
                    		if(var != null) qcf.setVariable((var!=null?var.getText():null));		
                    		retval.queryControlReturn = qcf;	
                    	

                    }
                    break;
                case 3 :
                    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:270:4: 'ext' op= normalName ( '(' pList+= param ( ',' pList+= param )? ')' )?
                    {
                    match(input,57,FOLLOW_57_in_queryControl810); 
                    pushFollow(FOLLOW_normalName_in_queryControl814);
                    op=normalName();

                    state._fsp--;

                    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:270:24: ( '(' pList+= param ( ',' pList+= param )? ')' )?
                    int alt40=2;
                    int LA40_0 = input.LA(1);

                    if ( (LA40_0==35) ) {
                        alt40=1;
                    }
                    switch (alt40) {
                        case 1 :
                            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:270:25: '(' pList+= param ( ',' pList+= param )? ')'
                            {
                            match(input,35,FOLLOW_35_in_queryControl817); 
                            pushFollow(FOLLOW_param_in_queryControl821);
                            pList=param();

                            state._fsp--;

                            if (list_pList==null) list_pList=new ArrayList();
                            list_pList.add(((param_return) pList).paramReturn);

                            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:270:42: ( ',' pList+= param )?
                            int alt39=2;
                            int LA39_0 = input.LA(1);

                            if ( (LA39_0==30) ) {
                                alt39=1;
                            }
                            switch (alt39) {
                                case 1 :
                                    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:270:43: ',' pList+= param
                                    {
                                    match(input,30,FOLLOW_30_in_queryControl824); 
                                    pushFollow(FOLLOW_param_in_queryControl828);
                                    pList=param();

                                    state._fsp--;

                                    if (list_pList==null) list_pList=new ArrayList();
                                    list_pList.add(((param_return) pList).paramReturn);


                                    }
                                    break;

                            }

                            match(input,36,FOLLOW_36_in_queryControl832); 

                            }
                            break;

                    }


                    		QueryControlExtension qce = QueryFactoryImpl.eINSTANCE.createQueryControlExtension();
                    		qce.setOperation((op!=null?input.toString(op.start,op.stop):null));
                    		if(list_pList != null) qce.getParams().addAll(list_pList);
                    		retval.queryControlReturn = qce;
                    	

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
    // $ANTLR end "queryControl"

    public static class filterUnit_return extends ParserRuleReturnScope {
        public FilterUnit filterUnitReturn;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "filterUnit"
    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:279:1: filterUnit returns [FilterUnit filterUnitReturn] : e= filterUnitElement ( '{' fExp= filterExpression '}' )? (fUnit= filterUnit )? ;
    public final Gra2MoLParser.filterUnit_return filterUnit() throws RecognitionException {
        Gra2MoLParser.filterUnit_return retval = new Gra2MoLParser.filterUnit_return();
        retval.start = input.LT(1);

        Gra2MoLParser.filterUnitElement_return e = null;

        Gra2MoLParser.filterExpression_return fExp = null;

        Gra2MoLParser.filterUnit_return fUnit = null;


        try {
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:280:2: (e= filterUnitElement ( '{' fExp= filterExpression '}' )? (fUnit= filterUnit )? )
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:280:4: e= filterUnitElement ( '{' fExp= filterExpression '}' )? (fUnit= filterUnit )?
            {
            pushFollow(FOLLOW_filterUnitElement_in_filterUnit855);
            e=filterUnitElement();

            state._fsp--;

            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:280:24: ( '{' fExp= filterExpression '}' )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==47) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:280:25: '{' fExp= filterExpression '}'
                    {
                    match(input,47,FOLLOW_47_in_filterUnit858); 
                    pushFollow(FOLLOW_filterExpression_in_filterUnit862);
                    fExp=filterExpression();

                    state._fsp--;

                    match(input,48,FOLLOW_48_in_filterUnit864); 

                    }
                    break;

            }

            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:280:57: (fUnit= filterUnit )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( ((LA43_0>=TRIPLEBAR && LA43_0<=BAR)) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:280:58: fUnit= filterUnit
                    {
                    pushFollow(FOLLOW_filterUnit_in_filterUnit871);
                    fUnit=filterUnit();

                    state._fsp--;


                    }
                    break;

            }


            		FilterUnit fu = QueryFactoryImpl.eINSTANCE.createFilterUnit();
            		fu.setType((e!=null?e.type:null));
            		fu.setElement((e!=null?e.element:null));
            		fu.setOperation((e!=null?e.operation:null));
            		fu.setPosition((e!=null?e.position:0));
            		if(fExp != null) fu.setExpression((fExp!=null?fExp.filterExpressionReturn:null));
            		if(fUnit != null) fu.setNext((fUnit!=null?fUnit.filterUnitReturn:null));
            		retval.filterUnitReturn = fu;
            	

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
    // $ANTLR end "filterUnit"

    public static class filterUnitElement_return extends ParserRuleReturnScope {
        public FilterType type;
        public QueryElement element;
        public FilterOperationType operation;
        public int position;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "filterUnitElement"
    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:293:1: filterUnitElement returns [FilterType type, QueryElement element, FilterOperationType operation, int position] : ( TRIPLEBAR filterElement (fo= filterOperation )? | DOUBLEBAR filterElement (fo= filterOperation )? | BAR filterElement (fo= filterOperation )? );
    public final Gra2MoLParser.filterUnitElement_return filterUnitElement() throws RecognitionException {
        Gra2MoLParser.filterUnitElement_return retval = new Gra2MoLParser.filterUnitElement_return();
        retval.start = input.LT(1);

        Gra2MoLParser.filterOperation_return fo = null;

        Gra2MoLParser.filterElement_return filterElement3 = null;

        Gra2MoLParser.filterElement_return filterElement4 = null;

        Gra2MoLParser.filterElement_return filterElement5 = null;



        	retval.operation = FilterOperationType.NORMAL;
        	retval.position = 0;

        try {
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:298:2: ( TRIPLEBAR filterElement (fo= filterOperation )? | DOUBLEBAR filterElement (fo= filterOperation )? | BAR filterElement (fo= filterOperation )? )
            int alt47=3;
            switch ( input.LA(1) ) {
            case TRIPLEBAR:
                {
                alt47=1;
                }
                break;
            case DOUBLEBAR:
                {
                alt47=2;
                }
                break;
            case BAR:
                {
                alt47=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }

            switch (alt47) {
                case 1 :
                    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:298:5: TRIPLEBAR filterElement (fo= filterOperation )?
                    {
                    match(input,TRIPLEBAR,FOLLOW_TRIPLEBAR_in_filterUnitElement897); 
                    pushFollow(FOLLOW_filterElement_in_filterUnitElement899);
                    filterElement3=filterElement();

                    state._fsp--;

                    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:298:29: (fo= filterOperation )?
                    int alt44=2;
                    int LA44_0 = input.LA(1);

                    if ( (LA44_0==DOT||LA44_0==44) ) {
                        alt44=1;
                    }
                    switch (alt44) {
                        case 1 :
                            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:298:30: fo= filterOperation
                            {
                            pushFollow(FOLLOW_filterOperation_in_filterUnitElement904);
                            fo=filterOperation();

                            state._fsp--;


                            }
                            break;

                    }


                    		retval.type = FilterType.RECURSIVE;
                    		retval.element = (filterElement3!=null?filterElement3.filterElementReturn:null);
                    		if(fo != null) {
                    			retval.operation = (fo!=null?fo.operation:null);
                    			retval.position = (fo!=null?fo.position:0);			
                    		} 
                    	

                    }
                    break;
                case 2 :
                    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:307:4: DOUBLEBAR filterElement (fo= filterOperation )?
                    {
                    match(input,DOUBLEBAR,FOLLOW_DOUBLEBAR_in_filterUnitElement916); 
                    pushFollow(FOLLOW_filterElement_in_filterUnitElement918);
                    filterElement4=filterElement();

                    state._fsp--;

                    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:307:28: (fo= filterOperation )?
                    int alt45=2;
                    int LA45_0 = input.LA(1);

                    if ( (LA45_0==DOT||LA45_0==44) ) {
                        alt45=1;
                    }
                    switch (alt45) {
                        case 1 :
                            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:307:29: fo= filterOperation
                            {
                            pushFollow(FOLLOW_filterOperation_in_filterUnitElement923);
                            fo=filterOperation();

                            state._fsp--;


                            }
                            break;

                    }


                    		retval.type = FilterType.INDIRECT;
                    		retval.element = (filterElement4!=null?filterElement4.filterElementReturn:null);
                    		if(fo != null) {
                    			retval.operation = (fo!=null?fo.operation:null);
                    			retval.position = (fo!=null?fo.position:0);			
                    		} 
                    	

                    }
                    break;
                case 3 :
                    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:316:4: BAR filterElement (fo= filterOperation )?
                    {
                    match(input,BAR,FOLLOW_BAR_in_filterUnitElement934); 
                    pushFollow(FOLLOW_filterElement_in_filterUnitElement936);
                    filterElement5=filterElement();

                    state._fsp--;

                    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:316:22: (fo= filterOperation )?
                    int alt46=2;
                    int LA46_0 = input.LA(1);

                    if ( (LA46_0==DOT||LA46_0==44) ) {
                        alt46=1;
                    }
                    switch (alt46) {
                        case 1 :
                            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:316:23: fo= filterOperation
                            {
                            pushFollow(FOLLOW_filterOperation_in_filterUnitElement941);
                            fo=filterOperation();

                            state._fsp--;


                            }
                            break;

                    }


                    		retval.type = FilterType.DIRECT;
                    		retval.element = (filterElement5!=null?filterElement5.filterElementReturn:null);
                    		if(fo != null) {
                    			retval.operation = (fo!=null?fo.operation:null);
                    			retval.position = (fo!=null?fo.position:0);			
                    		} 
                    	

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
    // $ANTLR end "filterUnitElement"

    public static class filterOperation_return extends ParserRuleReturnScope {
        public FilterOperationType operation;
        public int position;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "filterOperation"
    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:327:1: filterOperation returns [FilterOperationType operation, int position] : ( '[' 'first' ']' | '[' pos= NUMBER ']' | '[' 'last' ']' | DOT | '[' 'unique' ']' );
    public final Gra2MoLParser.filterOperation_return filterOperation() throws RecognitionException {
        Gra2MoLParser.filterOperation_return retval = new Gra2MoLParser.filterOperation_return();
        retval.start = input.LT(1);

        Token pos=null;


        	retval.position = -1;

        try {
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:331:2: ( '[' 'first' ']' | '[' pos= NUMBER ']' | '[' 'last' ']' | DOT | '[' 'unique' ']' )
            int alt48=5;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==44) ) {
                switch ( input.LA(2) ) {
                case 58:
                    {
                    alt48=1;
                    }
                    break;
                case NUMBER:
                    {
                    alt48=2;
                    }
                    break;
                case 59:
                    {
                    alt48=3;
                    }
                    break;
                case 45:
                    {
                    alt48=5;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 48, 1, input);

                    throw nvae;
                }

            }
            else if ( (LA48_0==DOT) ) {
                alt48=4;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }
            switch (alt48) {
                case 1 :
                    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:331:4: '[' 'first' ']'
                    {
                    match(input,44,FOLLOW_44_in_filterOperation968); 
                    match(input,58,FOLLOW_58_in_filterOperation970); 
                    match(input,46,FOLLOW_46_in_filterOperation972); 

                    			retval.operation = FilterOperationType.POSITION;
                    			retval.position = 0;
                    		

                    }
                    break;
                case 2 :
                    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:336:4: '[' pos= NUMBER ']'
                    {
                    match(input,44,FOLLOW_44_in_filterOperation982); 
                    pos=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_filterOperation986); 
                    match(input,46,FOLLOW_46_in_filterOperation988); 

                    			retval.operation = FilterOperationType.POSITION;
                    			if(pos != null) retval.position = (Integer.parseInt((pos!=null?pos.getText():null)));
                    			else retval.position = 0;
                    		

                    }
                    break;
                case 3 :
                    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:342:4: '[' 'last' ']'
                    {
                    match(input,44,FOLLOW_44_in_filterOperation997); 
                    match(input,59,FOLLOW_59_in_filterOperation999); 
                    match(input,46,FOLLOW_46_in_filterOperation1001); 

                    			retval.operation = FilterOperationType.POSITION;
                    			retval.position = -1;
                    		

                    }
                    break;
                case 4 :
                    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:347:4: DOT
                    {
                    match(input,DOT,FOLLOW_DOT_in_filterOperation1010); 

                    			retval.operation = FilterOperationType.POSITION;
                    			retval.position = 0;
                    		

                    }
                    break;
                case 5 :
                    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:352:4: '[' 'unique' ']'
                    {
                    match(input,44,FOLLOW_44_in_filterOperation1019); 
                    match(input,45,FOLLOW_45_in_filterOperation1021); 
                    match(input,46,FOLLOW_46_in_filterOperation1023); 

                    			retval.operation = FilterOperationType.UNIQUE;
                    		

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
    // $ANTLR end "filterOperation"

    public static class filterExpression_return extends ParserRuleReturnScope {
        public FilterExpression filterExpressionReturn;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "filterExpression"
    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:358:1: filterExpression returns [FilterExpression filterExpressionReturn] : fExp1= filterExpressionAlt ( AND fExp2+= filterExpressionAlt )* ;
    public final Gra2MoLParser.filterExpression_return filterExpression() throws RecognitionException {
        Gra2MoLParser.filterExpression_return retval = new Gra2MoLParser.filterExpression_return();
        retval.start = input.LT(1);

        List list_fExp2=null;
        Gra2MoLParser.filterExpressionAlt_return fExp1 = null;

        RuleReturnScope fExp2 = null;
        try {
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:359:2: (fExp1= filterExpressionAlt ( AND fExp2+= filterExpressionAlt )* )
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:359:4: fExp1= filterExpressionAlt ( AND fExp2+= filterExpressionAlt )*
            {
            pushFollow(FOLLOW_filterExpressionAlt_in_filterExpression1044);
            fExp1=filterExpressionAlt();

            state._fsp--;

            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:359:30: ( AND fExp2+= filterExpressionAlt )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==AND) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:359:31: AND fExp2+= filterExpressionAlt
            	    {
            	    match(input,AND,FOLLOW_AND_in_filterExpression1047); 
            	    pushFollow(FOLLOW_filterExpressionAlt_in_filterExpression1051);
            	    fExp2=filterExpressionAlt();

            	    state._fsp--;

            	    if (list_fExp2==null) list_fExp2=new ArrayList();
            	    list_fExp2.add(((filterExpressionAlt_return) fExp2).filterExpressionAltReturn);


            	    }
            	    break;

            	default :
            	    break loop49;
                }
            } while (true);


            		if((fExp1!=null?fExp1.filterExpressionAltReturn:null) != null && list_fExp2 == null) {
            			retval.filterExpressionReturn = (fExp1!=null?fExp1.filterExpressionAltReturn:null);
            		} else if((fExp1!=null?fExp1.filterExpressionAltReturn:null) != null && list_fExp2 != null) {
            			FilterExpressionComplex fe = QueryFactoryImpl.eINSTANCE.createFilterExpressionComplex();
            			fe.setType(FilterExpressionType.AND);
            			fe.getExpressions().add((fExp1!=null?fExp1.filterExpressionAltReturn:null));
            			fe.getExpressions().addAll(list_fExp2);
            			retval.filterExpressionReturn = fe;
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
    // $ANTLR end "filterExpression"

    public static class filterExpressionAlt_return extends ParserRuleReturnScope {
        public FilterExpression filterExpressionAltReturn;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "filterExpressionAlt"
    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:373:1: filterExpressionAlt returns [FilterExpression filterExpressionAltReturn] : fExpAlt1= filterExpressionAtom ( OR fExpAlt2+= filterExpressionAtom )* ;
    public final Gra2MoLParser.filterExpressionAlt_return filterExpressionAlt() throws RecognitionException {
        Gra2MoLParser.filterExpressionAlt_return retval = new Gra2MoLParser.filterExpressionAlt_return();
        retval.start = input.LT(1);

        List list_fExpAlt2=null;
        Gra2MoLParser.filterExpressionAtom_return fExpAlt1 = null;

        RuleReturnScope fExpAlt2 = null;
        try {
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:374:2: (fExpAlt1= filterExpressionAtom ( OR fExpAlt2+= filterExpressionAtom )* )
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:374:4: fExpAlt1= filterExpressionAtom ( OR fExpAlt2+= filterExpressionAtom )*
            {
            pushFollow(FOLLOW_filterExpressionAtom_in_filterExpressionAlt1074);
            fExpAlt1=filterExpressionAtom();

            state._fsp--;

            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:374:34: ( OR fExpAlt2+= filterExpressionAtom )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==OR) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:374:35: OR fExpAlt2+= filterExpressionAtom
            	    {
            	    match(input,OR,FOLLOW_OR_in_filterExpressionAlt1077); 
            	    pushFollow(FOLLOW_filterExpressionAtom_in_filterExpressionAlt1081);
            	    fExpAlt2=filterExpressionAtom();

            	    state._fsp--;

            	    if (list_fExpAlt2==null) list_fExpAlt2=new ArrayList();
            	    list_fExpAlt2.add(((filterExpressionAtom_return) fExpAlt2).filterExpressionAtomReturn);


            	    }
            	    break;

            	default :
            	    break loop50;
                }
            } while (true);


            		if((fExpAlt1!=null?fExpAlt1.filterExpressionAtomReturn:null) != null && list_fExpAlt2 == null) {
            			retval.filterExpressionAltReturn = (fExpAlt1!=null?fExpAlt1.filterExpressionAtomReturn:null);
            		} else if((fExpAlt1!=null?fExpAlt1.filterExpressionAtomReturn:null) != null && list_fExpAlt2 != null) {
            			FilterExpressionComplex fe = QueryFactoryImpl.eINSTANCE.createFilterExpressionComplex();
            			fe.setType(FilterExpressionType.OR);
            			fe.getExpressions().add((fExpAlt1!=null?fExpAlt1.filterExpressionAtomReturn:null));
            			fe.getExpressions().addAll(list_fExpAlt2);
            			retval.filterExpressionAltReturn = fe;
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
    // $ANTLR end "filterExpressionAlt"

    public static class filterExpressionAtom_return extends ParserRuleReturnScope {
        public FilterExpression filterExpressionAtomReturn;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "filterExpressionAtom"
    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:387:1: filterExpressionAtom returns [FilterExpression filterExpressionAtomReturn] : ( (global= 'all' )? (not= NOT )? expressionElement DOT op= ID ( '(' pList+= param ( ',' pList+= param )* ')' )? | (not= NOT )? '(' fep= filterExpression ')' );
    public final Gra2MoLParser.filterExpressionAtom_return filterExpressionAtom() throws RecognitionException {
        Gra2MoLParser.filterExpressionAtom_return retval = new Gra2MoLParser.filterExpressionAtom_return();
        retval.start = input.LT(1);

        Token global=null;
        Token not=null;
        Token op=null;
        List list_pList=null;
        Gra2MoLParser.filterExpression_return fep = null;

        Gra2MoLParser.expressionElement_return expressionElement6 = null;

        RuleReturnScope pList = null;
        try {
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:388:2: ( (global= 'all' )? (not= NOT )? expressionElement DOT op= ID ( '(' pList+= param ( ',' pList+= param )* ')' )? | (not= NOT )? '(' fep= filterExpression ')' )
            int alt56=2;
            switch ( input.LA(1) ) {
            case ID:
            case AT:
            case 60:
                {
                alt56=1;
                }
                break;
            case NOT:
                {
                int LA56_2 = input.LA(2);

                if ( (LA56_2==35) ) {
                    alt56=2;
                }
                else if ( (LA56_2==ID||LA56_2==AT) ) {
                    alt56=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 56, 2, input);

                    throw nvae;
                }
                }
                break;
            case 35:
                {
                alt56=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;
            }

            switch (alt56) {
                case 1 :
                    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:388:4: (global= 'all' )? (not= NOT )? expressionElement DOT op= ID ( '(' pList+= param ( ',' pList+= param )* ')' )?
                    {
                    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:388:4: (global= 'all' )?
                    int alt51=2;
                    int LA51_0 = input.LA(1);

                    if ( (LA51_0==60) ) {
                        alt51=1;
                    }
                    switch (alt51) {
                        case 1 :
                            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:388:5: global= 'all'
                            {
                            global=(Token)match(input,60,FOLLOW_60_in_filterExpressionAtom1104); 

                            }
                            break;

                    }

                    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:388:20: (not= NOT )?
                    int alt52=2;
                    int LA52_0 = input.LA(1);

                    if ( (LA52_0==NOT) ) {
                        alt52=1;
                    }
                    switch (alt52) {
                        case 1 :
                            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:388:21: not= NOT
                            {
                            not=(Token)match(input,NOT,FOLLOW_NOT_in_filterExpressionAtom1111); 

                            }
                            break;

                    }

                    pushFollow(FOLLOW_expressionElement_in_filterExpressionAtom1115);
                    expressionElement6=expressionElement();

                    state._fsp--;

                    match(input,DOT,FOLLOW_DOT_in_filterExpressionAtom1117); 
                    op=(Token)match(input,ID,FOLLOW_ID_in_filterExpressionAtom1121); 
                    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:388:59: ( '(' pList+= param ( ',' pList+= param )* ')' )?
                    int alt54=2;
                    int LA54_0 = input.LA(1);

                    if ( (LA54_0==35) ) {
                        alt54=1;
                    }
                    switch (alt54) {
                        case 1 :
                            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:388:60: '(' pList+= param ( ',' pList+= param )* ')'
                            {
                            match(input,35,FOLLOW_35_in_filterExpressionAtom1124); 
                            pushFollow(FOLLOW_param_in_filterExpressionAtom1128);
                            pList=param();

                            state._fsp--;

                            if (list_pList==null) list_pList=new ArrayList();
                            list_pList.add(((param_return) pList).paramReturn);

                            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:388:77: ( ',' pList+= param )*
                            loop53:
                            do {
                                int alt53=2;
                                int LA53_0 = input.LA(1);

                                if ( (LA53_0==30) ) {
                                    alt53=1;
                                }


                                switch (alt53) {
                            	case 1 :
                            	    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:388:78: ',' pList+= param
                            	    {
                            	    match(input,30,FOLLOW_30_in_filterExpressionAtom1131); 
                            	    pushFollow(FOLLOW_param_in_filterExpressionAtom1135);
                            	    pList=param();

                            	    state._fsp--;

                            	    if (list_pList==null) list_pList=new ArrayList();
                            	    list_pList.add(((param_return) pList).paramReturn);


                            	    }
                            	    break;

                            	default :
                            	    break loop53;
                                }
                            } while (true);

                            match(input,36,FOLLOW_36_in_filterExpressionAtom1139); 

                            }
                            break;

                    }


                    			FilterExpressionUnit fe = QueryFactoryImpl.eINSTANCE.createFilterExpressionUnit();
                    			fe.setElement((expressionElement6!=null?expressionElement6.expressionElementReturn:null));
                    			fe.setOperation((op!=null?op.getText():null));
                    			if(global != null) fe.setGlobal(true);
                    			if(list_pList != null) fe.getParameters().addAll(list_pList); 
                    			if(not != null) {
                    				FilterExpressionComplex fec = QueryFactoryImpl.eINSTANCE.createFilterExpressionComplex();
                    				fec.setType(FilterExpressionType.NOT);
                    				fec.getExpressions().add(fe);
                    				retval.filterExpressionAtomReturn = fec;			
                    			} else {
                    				retval.filterExpressionAtomReturn = fe;		
                    			}
                    		

                    }
                    break;
                case 2 :
                    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:404:4: (not= NOT )? '(' fep= filterExpression ')'
                    {
                    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:404:4: (not= NOT )?
                    int alt55=2;
                    int LA55_0 = input.LA(1);

                    if ( (LA55_0==NOT) ) {
                        alt55=1;
                    }
                    switch (alt55) {
                        case 1 :
                            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:404:5: not= NOT
                            {
                            not=(Token)match(input,NOT,FOLLOW_NOT_in_filterExpressionAtom1153); 

                            }
                            break;

                    }

                    match(input,35,FOLLOW_35_in_filterExpressionAtom1157); 
                    pushFollow(FOLLOW_filterExpression_in_filterExpressionAtom1161);
                    fep=filterExpression();

                    state._fsp--;

                    match(input,36,FOLLOW_36_in_filterExpressionAtom1163); 

                    			if(not == null) {
                    				retval.filterExpressionAtomReturn = (fep!=null?fep.filterExpressionReturn:null);
                    			} else {
                    				FilterExpressionComplex fe = QueryFactoryImpl.eINSTANCE.createFilterExpressionComplex();
                    				fe.setType(FilterExpressionType.NOT);
                    				fe.getExpressions().add((fep!=null?fep.filterExpressionReturn:null));
                    				retval.filterExpressionAtomReturn = fe;			
                    			}
                    		

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
    // $ANTLR end "filterExpressionAtom"

    public static class expressionElement_return extends ParserRuleReturnScope {
        public ExpressionElement expressionElementReturn;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "expressionElement"
    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:417:1: expressionElement returns [ExpressionElement expressionElementReturn] : ( AT '[' pos= NUMBER ']' | ID ( '[' (pos= NUMBER | last= 'last' ) ']' )? );
    public final Gra2MoLParser.expressionElement_return expressionElement() throws RecognitionException {
        Gra2MoLParser.expressionElement_return retval = new Gra2MoLParser.expressionElement_return();
        retval.start = input.LT(1);

        Token pos=null;
        Token last=null;
        Token ID7=null;


        	ExpressionElement ee = QueryFactoryImpl.eINSTANCE.createExpressionElement();

        try {
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:421:2: ( AT '[' pos= NUMBER ']' | ID ( '[' (pos= NUMBER | last= 'last' ) ']' )? )
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==AT) ) {
                alt59=1;
            }
            else if ( (LA59_0==ID) ) {
                alt59=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 59, 0, input);

                throw nvae;
            }
            switch (alt59) {
                case 1 :
                    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:421:5: AT '[' pos= NUMBER ']'
                    {
                    match(input,AT,FOLLOW_AT_in_expressionElement1189); 
                    match(input,44,FOLLOW_44_in_expressionElement1191); 
                    pos=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_expressionElement1195); 
                    match(input,46,FOLLOW_46_in_expressionElement1197); 

                    			ee.setName("TOKEN");
                    			ee.setType(ExpressionElementType.TOKEN);
                    			ee.setPosition(Integer.parseInt((pos!=null?pos.getText():null)));
                    			retval.expressionElementReturn = ee;
                    		

                    }
                    break;
                case 2 :
                    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:428:4: ID ( '[' (pos= NUMBER | last= 'last' ) ']' )?
                    {
                    ID7=(Token)match(input,ID,FOLLOW_ID_in_expressionElement1207); 
                    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:428:7: ( '[' (pos= NUMBER | last= 'last' ) ']' )?
                    int alt58=2;
                    int LA58_0 = input.LA(1);

                    if ( (LA58_0==44) ) {
                        alt58=1;
                    }
                    switch (alt58) {
                        case 1 :
                            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:428:8: '[' (pos= NUMBER | last= 'last' ) ']'
                            {
                            match(input,44,FOLLOW_44_in_expressionElement1210); 
                            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:428:12: (pos= NUMBER | last= 'last' )
                            int alt57=2;
                            int LA57_0 = input.LA(1);

                            if ( (LA57_0==NUMBER) ) {
                                alt57=1;
                            }
                            else if ( (LA57_0==59) ) {
                                alt57=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 57, 0, input);

                                throw nvae;
                            }
                            switch (alt57) {
                                case 1 :
                                    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:428:13: pos= NUMBER
                                    {
                                    pos=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_expressionElement1215); 

                                    }
                                    break;
                                case 2 :
                                    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:428:26: last= 'last'
                                    {
                                    last=(Token)match(input,59,FOLLOW_59_in_expressionElement1221); 

                                    }
                                    break;

                            }

                            match(input,46,FOLLOW_46_in_expressionElement1224); 

                            }
                            break;

                    }


                    			ee.setName((ID7!=null?ID7.getText():null));
                    			ee.setType(ExpressionElementType.LEAF);
                    			if(pos != null) ee.setPosition(Integer.parseInt((pos!=null?pos.getText():null)));
                    			else if (last != null) ee.setPosition(-1);
                    			else ee.setPosition(0);
                    			retval.expressionElementReturn = ee;	
                    		

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
    // $ANTLR end "expressionElement"

    public static class filterElement_return extends ParserRuleReturnScope {
        public QueryElement filterElementReturn;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "filterElement"
    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:439:1: filterElement returns [QueryElement filterElementReturn] : ( AL i= id | i= id );
    public final Gra2MoLParser.filterElement_return filterElement() throws RecognitionException {
        Gra2MoLParser.filterElement_return retval = new Gra2MoLParser.filterElement_return();
        retval.start = input.LT(1);

        Gra2MoLParser.id_return i = null;



        	QueryElement qe = QueryFactoryImpl.eINSTANCE.createQueryElement();

        try {
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:443:2: ( AL i= id | i= id )
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==AL) ) {
                alt60=1;
            }
            else if ( (LA60_0==ID||LA60_0==IDESC) ) {
                alt60=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 60, 0, input);

                throw nvae;
            }
            switch (alt60) {
                case 1 :
                    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:443:4: AL i= id
                    {
                    match(input,AL,FOLLOW_AL_in_filterElement1251); 
                    pushFollow(FOLLOW_id_in_filterElement1255);
                    i=id();

                    state._fsp--;


                    			qe.setMark(true);
                    			qe.setName((i!=null?i.identifier:null));
                    			qe.setType(QueryElementType.NODE);
                    			retval.filterElementReturn = qe;
                    		

                    }
                    break;
                case 2 :
                    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:450:5: i= id
                    {
                    pushFollow(FOLLOW_id_in_filterElement1268);
                    i=id();

                    state._fsp--;


                    			qe.setMark(false);
                    			qe.setName((i!=null?i.identifier:null));
                    			qe.setType(QueryElementType.NODE);
                    			retval.filterElementReturn = qe;
                    		

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
    // $ANTLR end "filterElement"

    public static class initList_return extends ParserRuleReturnScope {
        public InitUnitGroup initListReturn;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "initList"
    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:459:1: initList returns [InitUnitGroup initListReturn] : ( comment )? ( 'mappings' | 'do' ) (iList+= init )* ;
    public final Gra2MoLParser.initList_return initList() throws RecognitionException {
        Gra2MoLParser.initList_return retval = new Gra2MoLParser.initList_return();
        retval.start = input.LT(1);

        List list_iList=null;
        RuleReturnScope iList = null;
        try {
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:460:2: ( ( comment )? ( 'mappings' | 'do' ) (iList+= init )* )
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:460:4: ( comment )? ( 'mappings' | 'do' ) (iList+= init )*
            {
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:460:4: ( comment )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( ((LA61_0>=ML_COMMENT && LA61_0<=OL_COMMENT)) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:460:4: comment
                    {
                    pushFollow(FOLLOW_comment_in_initList1290);
                    comment();

                    state._fsp--;


                    }
                    break;

            }

            if ( (input.LA(1)>=61 && input.LA(1)<=62) ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:460:38: (iList+= init )*
            loop62:
            do {
                int alt62=2;
                int LA62_0 = input.LA(1);

                if ( ((LA62_0>=ML_COMMENT && LA62_0<=OL_COMMENT)||LA62_0==ID||LA62_0==IDESC||LA62_0==64||LA62_0==68) ) {
                    alt62=1;
                }


                switch (alt62) {
            	case 1 :
            	    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:460:38: iList+= init
            	    {
            	    pushFollow(FOLLOW_init_in_initList1303);
            	    iList=init();

            	    state._fsp--;

            	    if (list_iList==null) list_iList=new ArrayList();
            	    list_iList.add(((init_return) iList).initReturn);


            	    }
            	    break;

            	default :
            	    break loop62;
                }
            } while (true);


            		InitUnitGroup ig = CoreFactoryImpl.eINSTANCE.createInitUnitGroup();
            		ig.setType(InitUnitGroupType.NORMAL);
            		if(list_iList != null) ig.getInits().addAll(list_iList);	
            		ig.setExpression(null);
            		retval.initListReturn = ig;
            	

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
    // $ANTLR end "initList"

    public static class init_return extends ParserRuleReturnScope {
        public InitUnit initReturn;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "init"
    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:470:1: init returns [InitUnit initReturn] : ( ( comment )? initName '=' initElementValue ';' | ( comment )? 'if' '(' fExp= filterExpression ')' 'then' (is+= init )* ( 'else' (is2+= init )* )? 'end_if' | 'skip' s= ID ';' );
    public final Gra2MoLParser.init_return init() throws RecognitionException {
        Gra2MoLParser.init_return retval = new Gra2MoLParser.init_return();
        retval.start = input.LT(1);

        Token s=null;
        List list_is=null;
        List list_is2=null;
        Gra2MoLParser.filterExpression_return fExp = null;

        Gra2MoLParser.initName_return initName8 = null;

        Gra2MoLParser.initElementValue_return initElementValue9 = null;

        RuleReturnScope is = null;
        RuleReturnScope is2 = null;
        try {
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:471:2: ( ( comment )? initName '=' initElementValue ';' | ( comment )? 'if' '(' fExp= filterExpression ')' 'then' (is+= init )* ( 'else' (is2+= init )* )? 'end_if' | 'skip' s= ID ';' )
            int alt68=3;
            switch ( input.LA(1) ) {
            case ML_COMMENT:
            case OL_COMMENT:
                {
                int LA68_1 = input.LA(2);

                if ( (LA68_1==ID||LA68_1==IDESC) ) {
                    alt68=1;
                }
                else if ( (LA68_1==64) ) {
                    alt68=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 68, 1, input);

                    throw nvae;
                }
                }
                break;
            case ID:
            case IDESC:
                {
                alt68=1;
                }
                break;
            case 64:
                {
                alt68=2;
                }
                break;
            case 68:
                {
                alt68=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 68, 0, input);

                throw nvae;
            }

            switch (alt68) {
                case 1 :
                    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:471:4: ( comment )? initName '=' initElementValue ';'
                    {
                    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:471:4: ( comment )?
                    int alt63=2;
                    int LA63_0 = input.LA(1);

                    if ( ((LA63_0>=ML_COMMENT && LA63_0<=OL_COMMENT)) ) {
                        alt63=1;
                    }
                    switch (alt63) {
                        case 1 :
                            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:471:4: comment
                            {
                            pushFollow(FOLLOW_comment_in_init1323);
                            comment();

                            state._fsp--;


                            }
                            break;

                    }

                    pushFollow(FOLLOW_initName_in_init1326);
                    initName8=initName();

                    state._fsp--;

                    match(input,63,FOLLOW_63_in_init1328); 
                    pushFollow(FOLLOW_initElementValue_in_init1330);
                    initElementValue9=initElementValue();

                    state._fsp--;

                    match(input,27,FOLLOW_27_in_init1332); 

                    		InitUnitElement iu = CoreFactoryImpl.eINSTANCE.createInitUnitElement();
                    		iu.setElement((initName8!=null?initName8.value:null));
                    		if((initName8!=null?initName8.extension:null) != null) iu.getExtension().addAll((initName8!=null?initName8.extension:null));		
                    		iu.setValue((initElementValue9!=null?initElementValue9.initElementValueReturn:null));
                    		retval.initReturn = iu;
                    	

                    }
                    break;
                case 2 :
                    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:479:4: ( comment )? 'if' '(' fExp= filterExpression ')' 'then' (is+= init )* ( 'else' (is2+= init )* )? 'end_if'
                    {
                    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:479:4: ( comment )?
                    int alt64=2;
                    int LA64_0 = input.LA(1);

                    if ( ((LA64_0>=ML_COMMENT && LA64_0<=OL_COMMENT)) ) {
                        alt64=1;
                    }
                    switch (alt64) {
                        case 1 :
                            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:479:4: comment
                            {
                            pushFollow(FOLLOW_comment_in_init1340);
                            comment();

                            state._fsp--;


                            }
                            break;

                    }

                    match(input,64,FOLLOW_64_in_init1343); 
                    match(input,35,FOLLOW_35_in_init1345); 
                    pushFollow(FOLLOW_filterExpression_in_init1349);
                    fExp=filterExpression();

                    state._fsp--;

                    match(input,36,FOLLOW_36_in_init1351); 
                    match(input,65,FOLLOW_65_in_init1353); 
                    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:479:55: (is+= init )*
                    loop65:
                    do {
                        int alt65=2;
                        int LA65_0 = input.LA(1);

                        if ( ((LA65_0>=ML_COMMENT && LA65_0<=OL_COMMENT)||LA65_0==ID||LA65_0==IDESC||LA65_0==64||LA65_0==68) ) {
                            alt65=1;
                        }


                        switch (alt65) {
                    	case 1 :
                    	    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:479:56: is+= init
                    	    {
                    	    pushFollow(FOLLOW_init_in_init1358);
                    	    is=init();

                    	    state._fsp--;

                    	    if (list_is==null) list_is=new ArrayList();
                    	    list_is.add(((init_return) is).initReturn);


                    	    }
                    	    break;

                    	default :
                    	    break loop65;
                        }
                    } while (true);

                    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:479:67: ( 'else' (is2+= init )* )?
                    int alt67=2;
                    int LA67_0 = input.LA(1);

                    if ( (LA67_0==66) ) {
                        alt67=1;
                    }
                    switch (alt67) {
                        case 1 :
                            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:479:68: 'else' (is2+= init )*
                            {
                            match(input,66,FOLLOW_66_in_init1363); 
                            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:479:75: (is2+= init )*
                            loop66:
                            do {
                                int alt66=2;
                                int LA66_0 = input.LA(1);

                                if ( ((LA66_0>=ML_COMMENT && LA66_0<=OL_COMMENT)||LA66_0==ID||LA66_0==IDESC||LA66_0==64||LA66_0==68) ) {
                                    alt66=1;
                                }


                                switch (alt66) {
                            	case 1 :
                            	    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:479:76: is2+= init
                            	    {
                            	    pushFollow(FOLLOW_init_in_init1368);
                            	    is2=init();

                            	    state._fsp--;

                            	    if (list_is2==null) list_is2=new ArrayList();
                            	    list_is2.add(((init_return) is2).initReturn);


                            	    }
                            	    break;

                            	default :
                            	    break loop66;
                                }
                            } while (true);


                            }
                            break;

                    }

                    match(input,67,FOLLOW_67_in_init1374); 

                    		InitUnitGroup ig = CoreFactoryImpl.eINSTANCE.createInitUnitGroup();
                    		ig.setType(InitUnitGroupType.IF);
                    		if(list_is != null) ig.getInits().addAll(list_is);	
                    		if(list_is2 != null) {
                    			InitUnitGroup ig2 = CoreFactoryImpl.eINSTANCE.createInitUnitGroup();
                    			ig2.setType(InitUnitGroupType.ELSE);
                    			if(list_is2 != null) ig2.getInits().addAll(list_is2);
                    			ig.getInits().add(ig2);
                    		}	
                    		ig.setExpression((fExp!=null?fExp.filterExpressionReturn:null));
                    		retval.initReturn = ig;
                    	

                    }
                    break;
                case 3 :
                    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:493:4: 'skip' s= ID ';'
                    {
                    match(input,68,FOLLOW_68_in_init1382); 
                    s=(Token)match(input,ID,FOLLOW_ID_in_init1386); 
                    match(input,27,FOLLOW_27_in_init1388); 
                    		
                    			InitUnitElement iu = CoreFactoryImpl.eINSTANCE.createInitUnitElement();
                    			iu.setElement("SKIP");
                    			
                    			InitUnitElementValue iev = CoreFactoryImpl.eINSTANCE.createInitUnitElementValue();
                    			iev.setType(InitUnitElementValueType.SKIP);
                    			iev.setValue((s!=null?s.getText():null));
                    			 
                    			iu.setValue(iev);
                    			retval.initReturn = iu;
                    		

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
    // $ANTLR end "init"

    public static class initName_return extends ParserRuleReturnScope {
        public String value;
        public List extension;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "initName"
    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:507:1: initName returns [String value, List extension] : v= id ( DOT e+= ID )* ;
    public final Gra2MoLParser.initName_return initName() throws RecognitionException {
        Gra2MoLParser.initName_return retval = new Gra2MoLParser.initName_return();
        retval.start = input.LT(1);

        Token e=null;
        List list_e=null;
        Gra2MoLParser.id_return v = null;


        try {
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:508:2: (v= id ( DOT e+= ID )* )
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:508:4: v= id ( DOT e+= ID )*
            {
            pushFollow(FOLLOW_id_in_initName1410);
            v=id();

            state._fsp--;

            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:508:9: ( DOT e+= ID )*
            loop69:
            do {
                int alt69=2;
                int LA69_0 = input.LA(1);

                if ( (LA69_0==DOT) ) {
                    alt69=1;
                }


                switch (alt69) {
            	case 1 :
            	    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:508:10: DOT e+= ID
            	    {
            	    match(input,DOT,FOLLOW_DOT_in_initName1413); 
            	    e=(Token)match(input,ID,FOLLOW_ID_in_initName1417); 
            	    if (list_e==null) list_e=new ArrayList();
            	    list_e.add(e);


            	    }
            	    break;

            	default :
            	    break loop69;
                }
            } while (true);


            			retval.value = (v!=null?v.identifier:null);
            			if(list_e != null) {
            				retval.extension = new ArrayList();
            				for(Iterator it = list_e.iterator(); it.hasNext(); )  { 
            		        	Token t = (Token) it.next(); 
            					retval.extension.add(t.getText());
            				}
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
    // $ANTLR end "initName"

    public static class initElementValue_return extends ParserRuleReturnScope {
        public InitUnitElementValue initElementValueReturn;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "initElementValue"
    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:521:1: initElementValue returns [InitUnitElementValue initElementValueReturn] : ( ID | e= DQVALUE | NUMBER | i1= ID DOT i2= ID (ast= '*' | '[' ip= param ']' )? | ip1= param PLUS ip2= param ( PLUS ip3+= param )* | 'new' normalName | 'map' map= ID '(' p= param ')' | 'extract' c= ID | 'extractID' c= ID | 'execute' rul= ID res= ID | 'removeQuotes' i1= ID DOT i2= ID ( '[' ip= param ']' )? | 'count' c= ID | 'convertHexToString' i1= ID DOT i2= ID | 'ext' op= normalName ( '(' pList+= param ( ',' pList+= param )? ')' )? );
    public final Gra2MoLParser.initElementValue_return initElementValue() throws RecognitionException {
        Gra2MoLParser.initElementValue_return retval = new Gra2MoLParser.initElementValue_return();
        retval.start = input.LT(1);

        Token e=null;
        Token i1=null;
        Token i2=null;
        Token ast=null;
        Token map=null;
        Token c=null;
        Token rul=null;
        Token res=null;
        Token ID10=null;
        Token NUMBER11=null;
        List list_ip3=null;
        List list_pList=null;
        Gra2MoLParser.param_return ip = null;

        Gra2MoLParser.param_return ip1 = null;

        Gra2MoLParser.param_return ip2 = null;

        Gra2MoLParser.param_return p = null;

        Gra2MoLParser.normalName_return op = null;

        Gra2MoLParser.normalName_return normalName12 = null;

        RuleReturnScope ip3 = null;
        RuleReturnScope pList = null;

        	retval.initElementValueReturn = CoreFactoryImpl.eINSTANCE.createInitUnitElementValue();

        try {
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:525:2: ( ID | e= DQVALUE | NUMBER | i1= ID DOT i2= ID (ast= '*' | '[' ip= param ']' )? | ip1= param PLUS ip2= param ( PLUS ip3+= param )* | 'new' normalName | 'map' map= ID '(' p= param ')' | 'extract' c= ID | 'extractID' c= ID | 'execute' rul= ID res= ID | 'removeQuotes' i1= ID DOT i2= ID ( '[' ip= param ']' )? | 'count' c= ID | 'convertHexToString' i1= ID DOT i2= ID | 'ext' op= normalName ( '(' pList+= param ( ',' pList+= param )? ')' )? )
            int alt75=14;
            alt75 = dfa75.predict(input);
            switch (alt75) {
                case 1 :
                    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:525:4: ID
                    {
                    ID10=(Token)match(input,ID,FOLLOW_ID_in_initElementValue1445); 
                     	
                    			retval.initElementValueReturn.setType(InitUnitElementValueType.QUERY_RESULT);
                    			retval.initElementValueReturn.setValue((ID10!=null?ID10.getText():null)); 
                    		

                    }
                    break;
                case 2 :
                    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:530:4: e= DQVALUE
                    {
                    e=(Token)match(input,DQVALUE,FOLLOW_DQVALUE_in_initElementValue1457); 

                    			retval.initElementValueReturn.setType(InitUnitElementValueType.VALUE);
                    			retval.initElementValueReturn.setValue(((e!=null?e.getText():null)).substring(1, ((e!=null?e.getText():null)).length()-1)); 
                    		 

                    }
                    break;
                case 3 :
                    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:535:4: NUMBER
                    {
                    NUMBER11=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_initElementValue1467); 

                    			retval.initElementValueReturn.setType(InitUnitElementValueType.VALUE);
                    			retval.initElementValueReturn.setValue((NUMBER11!=null?NUMBER11.getText():null)); 
                    		

                    }
                    break;
                case 4 :
                    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:540:4: i1= ID DOT i2= ID (ast= '*' | '[' ip= param ']' )?
                    {
                    i1=(Token)match(input,ID,FOLLOW_ID_in_initElementValue1479); 
                    match(input,DOT,FOLLOW_DOT_in_initElementValue1481); 
                    i2=(Token)match(input,ID,FOLLOW_ID_in_initElementValue1485); 
                    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:540:20: (ast= '*' | '[' ip= param ']' )?
                    int alt70=3;
                    int LA70_0 = input.LA(1);

                    if ( (LA70_0==69) ) {
                        alt70=1;
                    }
                    else if ( (LA70_0==44) ) {
                        alt70=2;
                    }
                    switch (alt70) {
                        case 1 :
                            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:540:21: ast= '*'
                            {
                            ast=(Token)match(input,69,FOLLOW_69_in_initElementValue1490); 

                            }
                            break;
                        case 2 :
                            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:540:31: '[' ip= param ']'
                            {
                            match(input,44,FOLLOW_44_in_initElementValue1494); 
                            pushFollow(FOLLOW_param_in_initElementValue1500);
                            ip=param();

                            state._fsp--;

                            match(input,46,FOLLOW_46_in_initElementValue1502); 

                            }
                            break;

                    }

                     
                    			retval.initElementValueReturn.setType(InitUnitElementValueType.QUERY_ACCESS);
                    			retval.initElementValueReturn.setValue((i1!=null?i1.getText():null)); 
                    			retval.initElementValueReturn.setExtension((i2!=null?i2.getText():null)); 
                    			if (ip!=null) retval.initElementValueReturn.getParams().add((ip!=null?ip.paramReturn:null));
                    			else if(ast!=null) {
                    				Parameter par = CoreFactoryImpl.eINSTANCE.createParameter();
                    				par.setType(ParameterType.MULTIPLE);
                    				retval.initElementValueReturn.getParams().add(par);
                    			}
                    		

                    }
                    break;
                case 5 :
                    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:552:4: ip1= param PLUS ip2= param ( PLUS ip3+= param )*
                    {
                    pushFollow(FOLLOW_param_in_initElementValue1515);
                    ip1=param();

                    state._fsp--;

                    match(input,PLUS,FOLLOW_PLUS_in_initElementValue1517); 
                    pushFollow(FOLLOW_param_in_initElementValue1521);
                    ip2=param();

                    state._fsp--;

                    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:552:29: ( PLUS ip3+= param )*
                    loop71:
                    do {
                        int alt71=2;
                        int LA71_0 = input.LA(1);

                        if ( (LA71_0==PLUS) ) {
                            alt71=1;
                        }


                        switch (alt71) {
                    	case 1 :
                    	    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:552:30: PLUS ip3+= param
                    	    {
                    	    match(input,PLUS,FOLLOW_PLUS_in_initElementValue1524); 
                    	    pushFollow(FOLLOW_param_in_initElementValue1528);
                    	    ip3=param();

                    	    state._fsp--;

                    	    if (list_ip3==null) list_ip3=new ArrayList();
                    	    list_ip3.add(((param_return) ip3).paramReturn);


                    	    }
                    	    break;

                    	default :
                    	    break loop71;
                        }
                    } while (true);

                     
                    			retval.initElementValueReturn.setType(InitUnitElementValueType.OPERATION_CONCAT);
                    			retval.initElementValueReturn.getParams().add((ip1!=null?ip1.paramReturn:null)); 
                    			retval.initElementValueReturn.getParams().add((ip2!=null?ip2.paramReturn:null));
                    			if(ip3 != null) retval.initElementValueReturn.getParams().addAll(list_ip3);
                    		

                    }
                    break;
                case 6 :
                    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:559:4: 'new' normalName
                    {
                    match(input,70,FOLLOW_70_in_initElementValue1540); 
                    pushFollow(FOLLOW_normalName_in_initElementValue1542);
                    normalName12=normalName();

                    state._fsp--;


                    			retval.initElementValueReturn.setType(InitUnitElementValueType.OPERATION_CREATION);
                    			retval.initElementValueReturn.setValue((normalName12!=null?input.toString(normalName12.start,normalName12.stop):null)); 
                    		

                    }
                    break;
                case 7 :
                    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:564:4: 'map' map= ID '(' p= param ')'
                    {
                    match(input,71,FOLLOW_71_in_initElementValue1551); 
                    map=(Token)match(input,ID,FOLLOW_ID_in_initElementValue1555); 
                    match(input,35,FOLLOW_35_in_initElementValue1557); 
                    pushFollow(FOLLOW_param_in_initElementValue1561);
                    p=param();

                    state._fsp--;

                    match(input,36,FOLLOW_36_in_initElementValue1564); 

                    			retval.initElementValueReturn.setType(InitUnitElementValueType.HASH);
                    			retval.initElementValueReturn.setValue((map!=null?map.getText():null));
                    			retval.initElementValueReturn.getParams().add((p!=null?p.paramReturn:null));
                    		

                    }
                    break;
                case 8 :
                    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:570:4: 'extract' c= ID
                    {
                    match(input,72,FOLLOW_72_in_initElementValue1573); 
                    c=(Token)match(input,ID,FOLLOW_ID_in_initElementValue1577); 

                    			retval.initElementValueReturn.setType(InitUnitElementValueType.OPERATION_EXTRACT);
                    			retval.initElementValueReturn.setValue((c!=null?c.getText():null));
                    		

                    }
                    break;
                case 9 :
                    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:575:4: 'extractID' c= ID
                    {
                    match(input,73,FOLLOW_73_in_initElementValue1589); 
                    c=(Token)match(input,ID,FOLLOW_ID_in_initElementValue1593); 

                    			retval.initElementValueReturn.setType(InitUnitElementValueType.OPERATION_EXTRACTID);
                    			retval.initElementValueReturn.setValue((c!=null?c.getText():null));
                    		

                    }
                    break;
                case 10 :
                    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:580:4: 'execute' rul= ID res= ID
                    {
                    match(input,74,FOLLOW_74_in_initElementValue1607); 
                    rul=(Token)match(input,ID,FOLLOW_ID_in_initElementValue1611); 
                    res=(Token)match(input,ID,FOLLOW_ID_in_initElementValue1615); 

                    			retval.initElementValueReturn.setType(InitUnitElementValueType.OPERATION_CALL);
                    			retval.initElementValueReturn.setValue((rul!=null?rul.getText():null));
                    			retval.initElementValueReturn.setExtension((res!=null?res.getText():null));
                    		

                    }
                    break;
                case 11 :
                    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:586:4: 'removeQuotes' i1= ID DOT i2= ID ( '[' ip= param ']' )?
                    {
                    match(input,75,FOLLOW_75_in_initElementValue1626); 
                    i1=(Token)match(input,ID,FOLLOW_ID_in_initElementValue1630); 
                    match(input,DOT,FOLLOW_DOT_in_initElementValue1632); 
                    i2=(Token)match(input,ID,FOLLOW_ID_in_initElementValue1636); 
                    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:586:35: ( '[' ip= param ']' )?
                    int alt72=2;
                    int LA72_0 = input.LA(1);

                    if ( (LA72_0==44) ) {
                        alt72=1;
                    }
                    switch (alt72) {
                        case 1 :
                            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:586:36: '[' ip= param ']'
                            {
                            match(input,44,FOLLOW_44_in_initElementValue1639); 
                            pushFollow(FOLLOW_param_in_initElementValue1645);
                            ip=param();

                            state._fsp--;

                            match(input,46,FOLLOW_46_in_initElementValue1647); 

                            }
                            break;

                    }


                    			retval.initElementValueReturn.setType(InitUnitElementValueType.OPERATION_REMOVE_QUOTES);
                    			retval.initElementValueReturn.setValue((i1!=null?i1.getText():null)); 
                    			retval.initElementValueReturn.setExtension((i2!=null?i2.getText():null)); 
                    			if (ip!=null) retval.initElementValueReturn.getParams().add((ip!=null?ip.paramReturn:null));
                    		

                    }
                    break;
                case 12 :
                    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:593:4: 'count' c= ID
                    {
                    match(input,76,FOLLOW_76_in_initElementValue1659); 
                    c=(Token)match(input,ID,FOLLOW_ID_in_initElementValue1663); 

                    			retval.initElementValueReturn.setType(InitUnitElementValueType.OPERATION_COUNT);
                    			retval.initElementValueReturn.setValue((c!=null?c.getText():null)); 
                    		

                    }
                    break;
                case 13 :
                    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:598:4: 'convertHexToString' i1= ID DOT i2= ID
                    {
                    match(input,77,FOLLOW_77_in_initElementValue1674); 
                    i1=(Token)match(input,ID,FOLLOW_ID_in_initElementValue1678); 
                    match(input,DOT,FOLLOW_DOT_in_initElementValue1680); 
                    i2=(Token)match(input,ID,FOLLOW_ID_in_initElementValue1684); 

                    			retval.initElementValueReturn.setType(InitUnitElementValueType.OPERATION_CONVERTH2S);
                    			retval.initElementValueReturn.setValue((i1!=null?i1.getText():null)); 
                    			retval.initElementValueReturn.setExtension((i2!=null?i2.getText():null)); 
                    		

                    }
                    break;
                case 14 :
                    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:604:4: 'ext' op= normalName ( '(' pList+= param ( ',' pList+= param )? ')' )?
                    {
                    match(input,57,FOLLOW_57_in_initElementValue1697); 
                    pushFollow(FOLLOW_normalName_in_initElementValue1701);
                    op=normalName();

                    state._fsp--;

                    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:604:24: ( '(' pList+= param ( ',' pList+= param )? ')' )?
                    int alt74=2;
                    int LA74_0 = input.LA(1);

                    if ( (LA74_0==35) ) {
                        alt74=1;
                    }
                    switch (alt74) {
                        case 1 :
                            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:604:25: '(' pList+= param ( ',' pList+= param )? ')'
                            {
                            match(input,35,FOLLOW_35_in_initElementValue1704); 
                            pushFollow(FOLLOW_param_in_initElementValue1708);
                            pList=param();

                            state._fsp--;

                            if (list_pList==null) list_pList=new ArrayList();
                            list_pList.add(((param_return) pList).paramReturn);

                            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:604:42: ( ',' pList+= param )?
                            int alt73=2;
                            int LA73_0 = input.LA(1);

                            if ( (LA73_0==30) ) {
                                alt73=1;
                            }
                            switch (alt73) {
                                case 1 :
                                    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:604:43: ',' pList+= param
                                    {
                                    match(input,30,FOLLOW_30_in_initElementValue1711); 
                                    pushFollow(FOLLOW_param_in_initElementValue1715);
                                    pList=param();

                                    state._fsp--;

                                    if (list_pList==null) list_pList=new ArrayList();
                                    list_pList.add(((param_return) pList).paramReturn);


                                    }
                                    break;

                            }

                            match(input,36,FOLLOW_36_in_initElementValue1719); 

                            }
                            break;

                    }


                    			retval.initElementValueReturn.setType(InitUnitElementValueType.OPERATION_EXTENSION);
                    			retval.initElementValueReturn.setValue((op!=null?input.toString(op.start,op.stop):null)); 
                    			if(list_pList != null) retval.initElementValueReturn.getParams().addAll(list_pList);
                    		

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
    // $ANTLR end "initElementValue"

    public static class param_return extends ParserRuleReturnScope {
        public Parameter paramReturn;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "param"
    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:612:1: param returns [Parameter paramReturn] : (i1= ID ( '[' ip1= ( 'last' | NUMBER | ID ) ']' )? DOT i2= ID ( '[' ip2= ( 'last' | NUMBER | ID ) ']' )? | i1= ID | e= DQVALUE | NUMBER );
    public final Gra2MoLParser.param_return param() throws RecognitionException {
        Gra2MoLParser.param_return retval = new Gra2MoLParser.param_return();
        retval.start = input.LT(1);

        Token i1=null;
        Token ip1=null;
        Token i2=null;
        Token ip2=null;
        Token e=null;
        Token NUMBER13=null;


        	retval.paramReturn = CoreFactoryImpl.eINSTANCE.createParameter();

        try {
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:616:2: (i1= ID ( '[' ip1= ( 'last' | NUMBER | ID ) ']' )? DOT i2= ID ( '[' ip2= ( 'last' | NUMBER | ID ) ']' )? | i1= ID | e= DQVALUE | NUMBER )
            int alt78=4;
            switch ( input.LA(1) ) {
            case ID:
                {
                int LA78_1 = input.LA(2);

                if ( (LA78_1==PLUS||LA78_1==27||LA78_1==30||LA78_1==36||LA78_1==46) ) {
                    alt78=2;
                }
                else if ( (LA78_1==DOT||LA78_1==44) ) {
                    alt78=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 78, 1, input);

                    throw nvae;
                }
                }
                break;
            case DQVALUE:
                {
                alt78=3;
                }
                break;
            case NUMBER:
                {
                alt78=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 78, 0, input);

                throw nvae;
            }

            switch (alt78) {
                case 1 :
                    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:616:4: i1= ID ( '[' ip1= ( 'last' | NUMBER | ID ) ']' )? DOT i2= ID ( '[' ip2= ( 'last' | NUMBER | ID ) ']' )?
                    {
                    i1=(Token)match(input,ID,FOLLOW_ID_in_param1752); 
                    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:616:10: ( '[' ip1= ( 'last' | NUMBER | ID ) ']' )?
                    int alt76=2;
                    int LA76_0 = input.LA(1);

                    if ( (LA76_0==44) ) {
                        alt76=1;
                    }
                    switch (alt76) {
                        case 1 :
                            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:616:11: '[' ip1= ( 'last' | NUMBER | ID ) ']'
                            {
                            match(input,44,FOLLOW_44_in_param1755); 
                            ip1=(Token)input.LT(1);
                            if ( input.LA(1)==ID||input.LA(1)==NUMBER||input.LA(1)==59 ) {
                                input.consume();
                                state.errorRecovery=false;
                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                throw mse;
                            }

                            match(input,46,FOLLOW_46_in_param1768); 

                            }
                            break;

                    }

                    match(input,DOT,FOLLOW_DOT_in_param1772); 
                    i2=(Token)match(input,ID,FOLLOW_ID_in_param1776); 
                    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:616:55: ( '[' ip2= ( 'last' | NUMBER | ID ) ']' )?
                    int alt77=2;
                    int LA77_0 = input.LA(1);

                    if ( (LA77_0==44) ) {
                        alt77=1;
                    }
                    switch (alt77) {
                        case 1 :
                            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:616:56: '[' ip2= ( 'last' | NUMBER | ID ) ']'
                            {
                            match(input,44,FOLLOW_44_in_param1779); 
                            ip2=(Token)input.LT(1);
                            if ( input.LA(1)==ID||input.LA(1)==NUMBER||input.LA(1)==59 ) {
                                input.consume();
                                state.errorRecovery=false;
                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                throw mse;
                            }

                            match(input,46,FOLLOW_46_in_param1792); 

                            }
                            break;

                    }

                     
                    			retval.paramReturn.setType(ParameterType.QUERY_ACCESS);
                    			retval.paramReturn.setValue((i1!=null?i1.getText():null)); 
                    			if(ip1 != null) retval.paramReturn.setValuePosition((ip1!=null?ip1.getText():null));
                    			else retval.paramReturn.setValuePosition("0");
                    			retval.paramReturn.setExtension((i2!=null?i2.getText():null)); 
                    			if(ip2 != null) retval.paramReturn.setExtensionPosition((ip2!=null?ip2.getText():null)); 
                    			else retval.paramReturn.setExtensionPosition("0");
                    		

                    }
                    break;
                case 2 :
                    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:626:4: i1= ID
                    {
                    i1=(Token)match(input,ID,FOLLOW_ID_in_param1806); 
                     
                    			retval.paramReturn.setType(ParameterType.VARIABLE);
                    			retval.paramReturn.setValue((i1!=null?i1.getText():null)); 
                    		

                    }
                    break;
                case 3 :
                    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:631:4: e= DQVALUE
                    {
                    e=(Token)match(input,DQVALUE,FOLLOW_DQVALUE_in_param1818); 
                     
                    			retval.paramReturn.setType(ParameterType.STRING_VALUE);
                    			retval.paramReturn.setValue(((e!=null?e.getText():null)).substring(1, ((e!=null?e.getText():null)).length()-1)); 
                    		

                    }
                    break;
                case 4 :
                    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:636:5: NUMBER
                    {
                    NUMBER13=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_param1829); 
                     
                    			retval.paramReturn.setType(ParameterType.NUMBER_VALUE);
                    			retval.paramReturn.setValue((NUMBER13!=null?NUMBER13.getText():null)); 
                    		

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
    // $ANTLR end "param"

    public static class id_return extends ParserRuleReturnScope {
        public String identifier;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "id"
    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:643:1: id returns [String identifier] : (v= IDESC | v= ID );
    public final Gra2MoLParser.id_return id() throws RecognitionException {
        Gra2MoLParser.id_return retval = new Gra2MoLParser.id_return();
        retval.start = input.LT(1);

        Token v=null;

        try {
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:644:2: (v= IDESC | v= ID )
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==IDESC) ) {
                alt79=1;
            }
            else if ( (LA79_0==ID) ) {
                alt79=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 79, 0, input);

                throw nvae;
            }
            switch (alt79) {
                case 1 :
                    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:644:4: v= IDESC
                    {
                    v=(Token)match(input,IDESC,FOLLOW_IDESC_in_id1853); 

                    			retval.identifier = ((v!=null?v.getText():null)).substring(1, ((v!=null?v.getText():null)).length());
                    		

                    }
                    break;
                case 2 :
                    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:648:4: v= ID
                    {
                    v=(Token)match(input,ID,FOLLOW_ID_in_id1865); 

                    			retval.identifier = (v!=null?v.getText():null);
                    		

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
    // $ANTLR end "id"

    // Delegated rules


    protected DFA75 dfa75 = new DFA75(this);
    static final String DFA75_eotS =
        "\30\uffff";
    static final String DFA75_eofS =
        "\30\uffff";
    static final String DFA75_minS =
        "\1\6\1\11\2\24\11\uffff\1\7\4\uffff\1\24\1\6\1\uffff\1\11\1\56\1"+
        "\24";
    static final String DFA75_maxS =
        "\1\115\1\54\2\33\11\uffff\1\7\4\uffff\1\105\1\73\1\uffff\2\56\1"+
        "\33";
    static final String DFA75_acceptS =
        "\4\uffff\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\uffff\1\1"+
        "\1\5\1\2\1\3\2\uffff\1\4\3\uffff";
    static final String DFA75_specialS =
        "\30\uffff}>";
    static final String[] DFA75_transitionS = {
            "\1\2\1\1\3\uffff\1\3\55\uffff\1\14\14\uffff\1\4\1\5\1\6\1\7"+
            "\1\10\1\11\1\12\1\13",
            "\1\15\12\uffff\1\17\6\uffff\1\16\20\uffff\1\17",
            "\1\17\6\uffff\1\20",
            "\1\17\6\uffff\1\21",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\22",
            "",
            "",
            "",
            "",
            "\1\17\6\uffff\1\24\20\uffff\1\23\30\uffff\1\24",
            "\1\24\1\25\3\uffff\1\26\57\uffff\1\17",
            "",
            "\1\24\42\uffff\1\24\1\uffff\1\27",
            "\1\27",
            "\1\17\6\uffff\1\24"
    };

    static final short[] DFA75_eot = DFA.unpackEncodedString(DFA75_eotS);
    static final short[] DFA75_eof = DFA.unpackEncodedString(DFA75_eofS);
    static final char[] DFA75_min = DFA.unpackEncodedStringToUnsignedChars(DFA75_minS);
    static final char[] DFA75_max = DFA.unpackEncodedStringToUnsignedChars(DFA75_maxS);
    static final short[] DFA75_accept = DFA.unpackEncodedString(DFA75_acceptS);
    static final short[] DFA75_special = DFA.unpackEncodedString(DFA75_specialS);
    static final short[][] DFA75_transition;

    static {
        int numStates = DFA75_transitionS.length;
        DFA75_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA75_transition[i] = DFA.unpackEncodedString(DFA75_transitionS[i]);
        }
    }

    class DFA75 extends DFA {

        public DFA75(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 75;
            this.eot = DFA75_eot;
            this.eof = DFA75_eof;
            this.min = DFA75_min;
            this.max = DFA75_max;
            this.accept = DFA75_accept;
            this.special = DFA75_special;
            this.transition = DFA75_transition;
        }
        public String getDescription() {
            return "521:1: initElementValue returns [InitUnitElementValue initElementValueReturn] : ( ID | e= DQVALUE | NUMBER | i1= ID DOT i2= ID (ast= '*' | '[' ip= param ']' )? | ip1= param PLUS ip2= param ( PLUS ip3+= param )* | 'new' normalName | 'map' map= ID '(' p= param ')' | 'extract' c= ID | 'extractID' c= ID | 'execute' rul= ID res= ID | 'removeQuotes' i1= ID DOT i2= ID ( '[' ip= param ']' )? | 'count' c= ID | 'convertHexToString' i1= ID DOT i2= ID | 'ext' op= normalName ( '(' pList+= param ( ',' pList+= param )? ')' )? );";
        }
    }
 

    public static final BitSet FOLLOW_set_in_comment0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_transformationDefinition60 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_transformationDefinition62 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DQVALUE_in_transformationDefinition66 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_transformationDefinition68 = new BitSet(new long[]{0x0000078030000032L});
    public static final BitSet FOLLOW_28_in_transformationDefinition76 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_transformationDefinition78 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DQVALUE_in_transformationDefinition82 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_transformationDefinition84 = new BitSet(new long[]{0x0000078020000032L});
    public static final BitSet FOLLOW_hash_in_transformationDefinition92 = new BitSet(new long[]{0x0000078020000032L});
    public static final BitSet FOLLOW_rule_in_transformationDefinition97 = new BitSet(new long[]{0x0000078000000032L});
    public static final BitSet FOLLOW_comment_in_transformationDefinition100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_comment_in_hash120 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_hash123 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ID_in_hash127 = new BitSet(new long[]{0x0000002600000040L});
    public static final BitSet FOLLOW_hashValue_in_hash131 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_30_in_hash134 = new BitSet(new long[]{0x0000002600000040L});
    public static final BitSet FOLLOW_hashValue_in_hash138 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_31_in_hash142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_hashValuePart_in_hashValue164 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_hashValue166 = new BitSet(new long[]{0x0000002400000040L});
    public static final BitSet FOLLOW_hashValuePart_in_hashValue170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_hashValue178 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_hashValue180 = new BitSet(new long[]{0x0000002400000040L});
    public static final BitSet FOLLOW_hashValuePart_in_hashValue184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DQVALUE_in_hashValuePart204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_hashValuePart213 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_hashValuePart215 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ID_in_hashValuePart219 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_hashValuePart221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_hashValuePart230 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_hashValuePart232 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_normalName_in_hashValuePart236 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_hashValuePart238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mixinRule_in_rule262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_standardRule_in_rule272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_comment_in_standardRule291 = new BitSet(new long[]{0x0000078000000030L});
    public static final BitSet FOLLOW_ruleType_in_standardRule296 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_ruleName_in_standardRule300 = new BitSet(new long[]{0x0000080000000030L});
    public static final BitSet FOLLOW_fromElement_in_standardRule304 = new BitSet(new long[]{0x001E000000000030L});
    public static final BitSet FOLLOW_contextElement_in_standardRule309 = new BitSet(new long[]{0x001E000000000030L});
    public static final BitSet FOLLOW_toElement_in_standardRule316 = new BitSet(new long[]{0x001E000000000030L});
    public static final BitSet FOLLOW_mixinElement_in_standardRule323 = new BitSet(new long[]{0x001E000000000030L});
    public static final BitSet FOLLOW_queryList_in_standardRule329 = new BitSet(new long[]{0x6000000000000030L});
    public static final BitSet FOLLOW_initList_in_standardRule333 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_standardRule335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_comment_in_mixinRule353 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_mixinRule356 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_ruleName_in_mixinRule360 = new BitSet(new long[]{0x001E000000000030L});
    public static final BitSet FOLLOW_queryList_in_mixinRule364 = new BitSet(new long[]{0x6000000000000030L});
    public static final BitSet FOLLOW_initList_in_mixinRule368 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_mixinRule370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleType388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleType397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleType406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QUOTE_in_ruleName426 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ID_in_ruleName430 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_QUOTE_in_ruleName433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_comment_in_fromElement454 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_fromElement457 = new BitSet(new long[]{0x0000000000200080L});
    public static final BitSet FOLLOW_id_in_fromElement461 = new BitSet(new long[]{0x0000900000007082L});
    public static final BitSet FOLLOW_44_in_fromElement464 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_fromElement468 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_fromElement470 = new BitSet(new long[]{0x0000800000007082L});
    public static final BitSet FOLLOW_47_in_fromElement475 = new BitSet(new long[]{0x1000000800060080L});
    public static final BitSet FOLLOW_filterExpression_in_fromElement479 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_fromElement481 = new BitSet(new long[]{0x0000000000007082L});
    public static final BitSet FOLLOW_filterUnit_in_fromElement488 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_ID_in_fromElement495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_comment_in_fromElement505 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_fromElement508 = new BitSet(new long[]{0x0000000000007000L});
    public static final BitSet FOLLOW_filterUnit_in_fromElement512 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_ID_in_fromElement517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_contextElement544 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ID_in_contextElement548 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_30_in_contextElement551 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ID_in_contextElement555 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_50_in_mixinElement584 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ID_in_mixinElement588 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_30_in_mixinElement591 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ID_in_mixinElement595 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_comment_in_toElement617 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_toElement620 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_normalName_in_toElement622 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_ID_in_toElement627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_normalName644 = new BitSet(new long[]{0x0000000000000602L});
    public static final BitSet FOLLOW_set_in_normalName647 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ID_in_normalName655 = new BitSet(new long[]{0x0000000000000602L});
    public static final BitSet FOLLOW_comment_in_queryList673 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_queryList676 = new BitSet(new long[]{0x00000000000000B2L});
    public static final BitSet FOLLOW_query_in_queryList680 = new BitSet(new long[]{0x00000000000000B2L});
    public static final BitSet FOLLOW_comment_in_query699 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ID_in_query704 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_query706 = new BitSet(new long[]{0x0000800800007000L});
    public static final BitSet FOLLOW_47_in_query710 = new BitSet(new long[]{0x0320000000000000L});
    public static final BitSet FOLLOW_queryControl_in_query714 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_query716 = new BitSet(new long[]{0x0000000800007000L});
    public static final BitSet FOLLOW_35_in_query722 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ID_in_query726 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_query728 = new BitSet(new long[]{0x0000000000007000L});
    public static final BitSet FOLLOW_filterUnit_in_query734 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_query736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_queryControl757 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_queryControl759 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ID_in_queryControl763 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_queryControl765 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ID_in_queryControl769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_queryControl777 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ID_in_queryControl782 = new BitSet(new long[]{0x0000100000000200L});
    public static final BitSet FOLLOW_44_in_queryControl785 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_NUMBER_in_queryControl789 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_queryControl791 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_DOT_in_queryControl795 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ID_in_queryControl801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_queryControl810 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_normalName_in_queryControl814 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_35_in_queryControl817 = new BitSet(new long[]{0x00000000000008C0L});
    public static final BitSet FOLLOW_param_in_queryControl821 = new BitSet(new long[]{0x0000001040000000L});
    public static final BitSet FOLLOW_30_in_queryControl824 = new BitSet(new long[]{0x00000000000008C0L});
    public static final BitSet FOLLOW_param_in_queryControl828 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_queryControl832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_filterUnitElement_in_filterUnit855 = new BitSet(new long[]{0x0000800000007002L});
    public static final BitSet FOLLOW_47_in_filterUnit858 = new BitSet(new long[]{0x1000000800060080L});
    public static final BitSet FOLLOW_filterExpression_in_filterUnit862 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_filterUnit864 = new BitSet(new long[]{0x0000000000007002L});
    public static final BitSet FOLLOW_filterUnit_in_filterUnit871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRIPLEBAR_in_filterUnitElement897 = new BitSet(new long[]{0x0000000000280080L});
    public static final BitSet FOLLOW_filterElement_in_filterUnitElement899 = new BitSet(new long[]{0x0000100000000202L});
    public static final BitSet FOLLOW_filterOperation_in_filterUnitElement904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOUBLEBAR_in_filterUnitElement916 = new BitSet(new long[]{0x0000000000280080L});
    public static final BitSet FOLLOW_filterElement_in_filterUnitElement918 = new BitSet(new long[]{0x0000100000000202L});
    public static final BitSet FOLLOW_filterOperation_in_filterUnitElement923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BAR_in_filterUnitElement934 = new BitSet(new long[]{0x0000000000280080L});
    public static final BitSet FOLLOW_filterElement_in_filterUnitElement936 = new BitSet(new long[]{0x0000100000000202L});
    public static final BitSet FOLLOW_filterOperation_in_filterUnitElement941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_filterOperation968 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_filterOperation970 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_filterOperation972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_filterOperation982 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_NUMBER_in_filterOperation986 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_filterOperation988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_filterOperation997 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_filterOperation999 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_filterOperation1001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOT_in_filterOperation1010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_filterOperation1019 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_filterOperation1021 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_filterOperation1023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_filterExpressionAlt_in_filterExpression1044 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_AND_in_filterExpression1047 = new BitSet(new long[]{0x1000000800060080L});
    public static final BitSet FOLLOW_filterExpressionAlt_in_filterExpression1051 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_filterExpressionAtom_in_filterExpressionAlt1074 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_OR_in_filterExpressionAlt1077 = new BitSet(new long[]{0x1000000800060080L});
    public static final BitSet FOLLOW_filterExpressionAtom_in_filterExpressionAlt1081 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_60_in_filterExpressionAtom1104 = new BitSet(new long[]{0x1000000000060080L});
    public static final BitSet FOLLOW_NOT_in_filterExpressionAtom1111 = new BitSet(new long[]{0x1000000000060080L});
    public static final BitSet FOLLOW_expressionElement_in_filterExpressionAtom1115 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_DOT_in_filterExpressionAtom1117 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ID_in_filterExpressionAtom1121 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_35_in_filterExpressionAtom1124 = new BitSet(new long[]{0x00000000000008C0L});
    public static final BitSet FOLLOW_param_in_filterExpressionAtom1128 = new BitSet(new long[]{0x0000001040000000L});
    public static final BitSet FOLLOW_30_in_filterExpressionAtom1131 = new BitSet(new long[]{0x00000000000008C0L});
    public static final BitSet FOLLOW_param_in_filterExpressionAtom1135 = new BitSet(new long[]{0x0000001040000000L});
    public static final BitSet FOLLOW_36_in_filterExpressionAtom1139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_filterExpressionAtom1153 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_filterExpressionAtom1157 = new BitSet(new long[]{0x1000000800060080L});
    public static final BitSet FOLLOW_filterExpression_in_filterExpressionAtom1161 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_filterExpressionAtom1163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AT_in_expressionElement1189 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_expressionElement1191 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_NUMBER_in_expressionElement1195 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_expressionElement1197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_expressionElement1207 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_44_in_expressionElement1210 = new BitSet(new long[]{0x0800000000000800L});
    public static final BitSet FOLLOW_NUMBER_in_expressionElement1215 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_59_in_expressionElement1221 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_expressionElement1224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AL_in_filterElement1251 = new BitSet(new long[]{0x0000000000200080L});
    public static final BitSet FOLLOW_id_in_filterElement1255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_filterElement1268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_comment_in_initList1290 = new BitSet(new long[]{0x6000000000000000L});
    public static final BitSet FOLLOW_set_in_initList1293 = new BitSet(new long[]{0x00000000002000B2L,0x0000000000000011L});
    public static final BitSet FOLLOW_init_in_initList1303 = new BitSet(new long[]{0x00000000002000B2L,0x0000000000000011L});
    public static final BitSet FOLLOW_comment_in_init1323 = new BitSet(new long[]{0x00000000002000B0L});
    public static final BitSet FOLLOW_initName_in_init1326 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_63_in_init1328 = new BitSet(new long[]{0x02000000000008C0L,0x0000000000003FC0L});
    public static final BitSet FOLLOW_initElementValue_in_init1330 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_init1332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_comment_in_init1340 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_init1343 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_init1345 = new BitSet(new long[]{0x1000000800060080L});
    public static final BitSet FOLLOW_filterExpression_in_init1349 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_init1351 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_init1353 = new BitSet(new long[]{0x00000000002000B0L,0x000000000000001DL});
    public static final BitSet FOLLOW_init_in_init1358 = new BitSet(new long[]{0x00000000002000B0L,0x000000000000001DL});
    public static final BitSet FOLLOW_66_in_init1363 = new BitSet(new long[]{0x00000000002000B0L,0x0000000000000019L});
    public static final BitSet FOLLOW_init_in_init1368 = new BitSet(new long[]{0x00000000002000B0L,0x0000000000000019L});
    public static final BitSet FOLLOW_67_in_init1374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_init1382 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ID_in_init1386 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_init1388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_initName1410 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_DOT_in_initName1413 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ID_in_initName1417 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_ID_in_initElementValue1445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DQVALUE_in_initElementValue1457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_initElementValue1467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_initElementValue1479 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_DOT_in_initElementValue1481 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ID_in_initElementValue1485 = new BitSet(new long[]{0x0000100000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_initElementValue1490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_initElementValue1494 = new BitSet(new long[]{0x00000000000008C0L});
    public static final BitSet FOLLOW_param_in_initElementValue1500 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_initElementValue1502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_param_in_initElementValue1515 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_PLUS_in_initElementValue1517 = new BitSet(new long[]{0x00000000000008C0L});
    public static final BitSet FOLLOW_param_in_initElementValue1521 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_PLUS_in_initElementValue1524 = new BitSet(new long[]{0x00000000000008C0L});
    public static final BitSet FOLLOW_param_in_initElementValue1528 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_70_in_initElementValue1540 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_normalName_in_initElementValue1542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_initElementValue1551 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ID_in_initElementValue1555 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_initElementValue1557 = new BitSet(new long[]{0x00000000000008C0L});
    public static final BitSet FOLLOW_param_in_initElementValue1561 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_initElementValue1564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_initElementValue1573 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ID_in_initElementValue1577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_initElementValue1589 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ID_in_initElementValue1593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_initElementValue1607 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ID_in_initElementValue1611 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ID_in_initElementValue1615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_initElementValue1626 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ID_in_initElementValue1630 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_DOT_in_initElementValue1632 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ID_in_initElementValue1636 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_44_in_initElementValue1639 = new BitSet(new long[]{0x00000000000008C0L});
    public static final BitSet FOLLOW_param_in_initElementValue1645 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_initElementValue1647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_initElementValue1659 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ID_in_initElementValue1663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_initElementValue1674 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ID_in_initElementValue1678 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_DOT_in_initElementValue1680 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ID_in_initElementValue1684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_initElementValue1697 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_normalName_in_initElementValue1701 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_35_in_initElementValue1704 = new BitSet(new long[]{0x00000000000008C0L});
    public static final BitSet FOLLOW_param_in_initElementValue1708 = new BitSet(new long[]{0x0000001040000000L});
    public static final BitSet FOLLOW_30_in_initElementValue1711 = new BitSet(new long[]{0x00000000000008C0L});
    public static final BitSet FOLLOW_param_in_initElementValue1715 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_initElementValue1719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_param1752 = new BitSet(new long[]{0x0000100000000200L});
    public static final BitSet FOLLOW_44_in_param1755 = new BitSet(new long[]{0x0800000000000880L});
    public static final BitSet FOLLOW_set_in_param1759 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_param1768 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_DOT_in_param1772 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ID_in_param1776 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_44_in_param1779 = new BitSet(new long[]{0x0800000000000880L});
    public static final BitSet FOLLOW_set_in_param1783 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_param1792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_param1806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DQVALUE_in_param1818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_param1829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDESC_in_id1853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_id1865 = new BitSet(new long[]{0x0000000000000002L});

}