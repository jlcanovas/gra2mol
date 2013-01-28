// $ANTLR 3.2 Sep 23, 2009 12:02:23 /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g 2010-12-05 12:58:50

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
public class Gra2MoLParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "DQVALUE", "ID", "QUOTE", "DOT", "DDOTS", "NUMBER", "TRIPLEBAR", "DOUBLEBAR", "BAR", "AND", "OR", "NOT", "AT", "AL", "PLUS", "IDESC", "DOUBLEQUOTE", "OPERATION", "WS", "ML_COMMENT", "OL_COMMENT", "'grammar'", "':'", "';'", "'metamodel'", "'hash'", "','", "'end_hash'", "'->'", "'default'", "'G'", "'('", "')'", "'MM'", "'end_rule'", "'rule'", "'skip_rule'", "'copy_rule'", "'mixin_rule'", "'from'", "'['", "'unique'", "']'", "'{'", "'}'", "'context'", "'to'", "'queries'", "'for'", "'each'", "'in'", "'greater'", "'first'", "'last'", "'all'", "'eq'", "'exists'", "'check'", "'hasResults'", "'startsWith'", "'endsWith'", "'mapping'", "'mappings'", "'do'", "'='", "'if'", "'then'", "'end_if'", "'skip'", "'else'", "'*'", "'new'", "'map'", "'extract'", "'extractID'", "'execute'", "'removeQuotes'", "'count'", "'convertHexToString'", "'ext'"
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
    public static final int IDESC=19;
    public static final int T__26=26;
    public static final int T__63=63;
    public static final int T__25=25;
    public static final int NOT=15;
    public static final int AND=13;
    public static final int ID=5;
    public static final int T__61=61;
    public static final int DOUBLEQUOTE=20;
    public static final int EOF=-1;
    public static final int T__60=60;
    public static final int AT=16;
    public static final int T__55=55;
    public static final int ML_COMMENT=23;
    public static final int T__56=56;
    public static final int QUOTE=6;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__59=59;
    public static final int DOUBLEBAR=11;
    public static final int PLUS=18;
    public static final int DOT=7;
    public static final int AL=17;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__80=80;
    public static final int T__46=46;
    public static final int T__81=81;
    public static final int T__47=47;
    public static final int T__82=82;
    public static final int T__44=44;
    public static final int T__83=83;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int NUMBER=9;
    public static final int OL_COMMENT=24;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int WS=22;
    public static final int T__71=71;
    public static final int T__33=33;
    public static final int T__72=72;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int TRIPLEBAR=10;
    public static final int T__70=70;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int DDOTS=8;
    public static final int OR=14;
    public static final int DQVALUE=4;
    public static final int OPERATION=21;
    public static final int T__76=76;
    public static final int T__75=75;
    public static final int T__74=74;
    public static final int T__73=73;
    public static final int BAR=12;
    public static final int T__79=79;
    public static final int T__78=78;
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
    public String getGrammarFileName() { return "/Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g"; }


    public static class transformation_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "transformation"
    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:20:1: transformation returns [Node returnNode] : (TK_0= 'grammar' TK_1= ':' sourceGrammar= DQVALUE TK_2= ';' )? (TK_3= 'metamodel' TK_4= ':' targetMetamodel= DQVALUE TK_5= ';' )? (hDef+= hash )* (rDef+= rule )* ;
    public final Gra2MoLParser.transformation_return transformation() throws RecognitionException {
        Gra2MoLParser.transformation_return retval = new Gra2MoLParser.transformation_return();
        retval.start = input.LT(1);

        Token TK_0=null;
        Token TK_1=null;
        Token sourceGrammar=null;
        Token TK_2=null;
        Token TK_3=null;
        Token TK_4=null;
        Token targetMetamodel=null;
        Token TK_5=null;
        List list_hDef=null;
        List list_rDef=null;
        RuleReturnScope hDef = null;
        RuleReturnScope rDef = null;
        try {
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:21:1: ( (TK_0= 'grammar' TK_1= ':' sourceGrammar= DQVALUE TK_2= ';' )? (TK_3= 'metamodel' TK_4= ':' targetMetamodel= DQVALUE TK_5= ';' )? (hDef+= hash )* (rDef+= rule )* )
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:21:3: (TK_0= 'grammar' TK_1= ':' sourceGrammar= DQVALUE TK_2= ';' )? (TK_3= 'metamodel' TK_4= ':' targetMetamodel= DQVALUE TK_5= ';' )? (hDef+= hash )* (rDef+= rule )*
            {
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:21:3: (TK_0= 'grammar' TK_1= ':' sourceGrammar= DQVALUE TK_2= ';' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==25) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:21:5: TK_0= 'grammar' TK_1= ':' sourceGrammar= DQVALUE TK_2= ';'
                    {
                    TK_0=(Token)match(input,25,FOLLOW_25_in_transformation49); 
                    TK_1=(Token)match(input,26,FOLLOW_26_in_transformation54); 
                    sourceGrammar=(Token)match(input,DQVALUE,FOLLOW_DQVALUE_in_transformation58); 
                    TK_2=(Token)match(input,27,FOLLOW_27_in_transformation63); 

                    }
                    break;

            }

            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:22:3: (TK_3= 'metamodel' TK_4= ':' targetMetamodel= DQVALUE TK_5= ';' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==28) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:22:5: TK_3= 'metamodel' TK_4= ':' targetMetamodel= DQVALUE TK_5= ';'
                    {
                    TK_3=(Token)match(input,28,FOLLOW_28_in_transformation74); 
                    TK_4=(Token)match(input,26,FOLLOW_26_in_transformation79); 
                    targetMetamodel=(Token)match(input,DQVALUE,FOLLOW_DQVALUE_in_transformation83); 
                    TK_5=(Token)match(input,27,FOLLOW_27_in_transformation88); 

                    }
                    break;

            }

            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:23:7: (hDef+= hash )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==29) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:23:7: hDef+= hash
            	    {
            	    pushFollow(FOLLOW_hash_in_transformation96);
            	    hDef=hash();

            	    state._fsp--;

            	    if (list_hDef==null) list_hDef=new ArrayList();
            	    list_hDef.add(hDef);


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:23:19: (rDef+= rule )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=39 && LA4_0<=42)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:23:19: rDef+= rule
            	    {
            	    pushFollow(FOLLOW_rule_in_transformation101);
            	    rDef=rule();

            	    state._fsp--;

            	    if (list_rDef==null) list_rDef=new ArrayList();
            	    list_rDef.add(rDef);


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            		// Create return CST Node
            		Node transformationReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
            		transformationReturnNode.setKind("transformation");
            	    // Create a Token CST Leaf	
            	    if(TK_0 != null) {
            			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_0!=null?TK_0.getText():null), TK_0.getCharPositionInLine(), TK_0.getLine());
            	 		transformationReturnNode.getChildren().add(TK_0Leaf);
            	 	}
            	    // Create a Token CST Leaf	
            	    if(TK_1 != null) {
            			Leaf TK_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_1!=null?TK_1.getText():null), TK_1.getCharPositionInLine(), TK_1.getLine());
            	 		transformationReturnNode.getChildren().add(TK_1Leaf);
            	 	}
            	    // Create a CST Leaf
            		if(sourceGrammar != null) {
            			Leaf sourceGrammarLeaf = CSTFactoryImpl.eINSTANCE.createLeaf("sourceGrammar", (sourceGrammar!=null?sourceGrammar.getText():null), sourceGrammar.getCharPositionInLine(), sourceGrammar.getLine());
            			transformationReturnNode.getChildren().add(sourceGrammarLeaf);
            		}
            	    // Create a Token CST Leaf	
            	    if(TK_2 != null) {
            			Leaf TK_2Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_2!=null?TK_2.getText():null), TK_2.getCharPositionInLine(), TK_2.getLine());
            	 		transformationReturnNode.getChildren().add(TK_2Leaf);
            	 	}
            	    // Create a Token CST Leaf	
            	    if(TK_3 != null) {
            			Leaf TK_3Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_3!=null?TK_3.getText():null), TK_3.getCharPositionInLine(), TK_3.getLine());
            	 		transformationReturnNode.getChildren().add(TK_3Leaf);
            	 	}
            	    // Create a Token CST Leaf	
            	    if(TK_4 != null) {
            			Leaf TK_4Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_4!=null?TK_4.getText():null), TK_4.getCharPositionInLine(), TK_4.getLine());
            	 		transformationReturnNode.getChildren().add(TK_4Leaf);
            	 	}
            	    // Create a CST Leaf
            		if(targetMetamodel != null) {
            			Leaf targetMetamodelLeaf = CSTFactoryImpl.eINSTANCE.createLeaf("targetMetamodel", (targetMetamodel!=null?targetMetamodel.getText():null), targetMetamodel.getCharPositionInLine(), targetMetamodel.getLine());
            			transformationReturnNode.getChildren().add(targetMetamodelLeaf);
            		}
            	    // Create a Token CST Leaf	
            	    if(TK_5 != null) {
            			Leaf TK_5Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_5!=null?TK_5.getText():null), TK_5.getCharPositionInLine(), TK_5.getLine());
            	 		transformationReturnNode.getChildren().add(TK_5Leaf);
            	 	}
            	    // Create a CST Node
            		if(list_hDef != null) {
            	        for(Iterator it = list_hDef.iterator(); it.hasNext(); )  { 
            	            Gra2MoLParser.hash_return r = (Gra2MoLParser.hash_return) it.next(); 
            	            if(r != null && r.returnNode != null) {
            	            	r.returnNode.setKind("hDef");
            	            	transformationReturnNode.getChildren().add(r.returnNode);
            	            } 
            	        }
            	    }
            	    // Create a CST Node
            		if(list_rDef != null) {
            	        for(Iterator it = list_rDef.iterator(); it.hasNext(); )  { 
            	            Gra2MoLParser.rule_return r = (Gra2MoLParser.rule_return) it.next(); 
            	            if(r != null && r.returnNode != null) {
            	            	r.returnNode.setKind("rDef");
            	            	transformationReturnNode.getChildren().add(r.returnNode);
            	            } 
            	        }
            	    }
            		// Returns the Node with CST Leaves/Nodes
            		retval.returnNode = transformationReturnNode;
            	

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
    // $ANTLR end "transformation"

    public static class hash_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "hash"
    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:93:1: hash returns [Node returnNode] : TK_0= 'hash' IDGen= ID hashValueGen+= hashValue (TK_1= ',' hashValueGen_1+= hashValue )* TK_2= 'end_hash' ;
    public final Gra2MoLParser.hash_return hash() throws RecognitionException {
        Gra2MoLParser.hash_return retval = new Gra2MoLParser.hash_return();
        retval.start = input.LT(1);

        Token TK_0=null;
        Token IDGen=null;
        Token TK_1=null;
        Token TK_2=null;
        List list_hashValueGen=null;
        List list_hashValueGen_1=null;
        RuleReturnScope hashValueGen = null;
        RuleReturnScope hashValueGen_1 = null;
        try {
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:94:1: (TK_0= 'hash' IDGen= ID hashValueGen+= hashValue (TK_1= ',' hashValueGen_1+= hashValue )* TK_2= 'end_hash' )
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:94:5: TK_0= 'hash' IDGen= ID hashValueGen+= hashValue (TK_1= ',' hashValueGen_1+= hashValue )* TK_2= 'end_hash'
            {
            TK_0=(Token)match(input,29,FOLLOW_29_in_hash127); 
            IDGen=(Token)match(input,ID,FOLLOW_ID_in_hash132); 
            pushFollow(FOLLOW_hashValue_in_hash137);
            hashValueGen=hashValue();

            state._fsp--;

            if (list_hashValueGen==null) list_hashValueGen=new ArrayList();
            list_hashValueGen.add(hashValueGen);

            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:94:52: (TK_1= ',' hashValueGen_1+= hashValue )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==30) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:94:54: TK_1= ',' hashValueGen_1+= hashValue
            	    {
            	    TK_1=(Token)match(input,30,FOLLOW_30_in_hash143); 
            	    pushFollow(FOLLOW_hashValue_in_hash148);
            	    hashValueGen_1=hashValue();

            	    state._fsp--;

            	    if (list_hashValueGen_1==null) list_hashValueGen_1=new ArrayList();
            	    list_hashValueGen_1.add(hashValueGen_1);


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            TK_2=(Token)match(input,31,FOLLOW_31_in_hash155); 

            		// Create return CST Node
            		Node hashReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
            		hashReturnNode.setKind("hash");
            	    // Create a Token CST Leaf	
            	    if(TK_0 != null) {
            			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_0!=null?TK_0.getText():null), TK_0.getCharPositionInLine(), TK_0.getLine());
            	 		hashReturnNode.getChildren().add(TK_0Leaf);
            	 	}
            	    // Create a CST Leaf
            		if(IDGen != null) {
            			Leaf IDGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf("ID", (IDGen!=null?IDGen.getText():null), IDGen.getCharPositionInLine(), IDGen.getLine());
            			hashReturnNode.getChildren().add(IDGenLeaf);
            		}
            	    // Create a CST Node
            		if(list_hashValueGen != null) {
            	        for(Iterator it = list_hashValueGen.iterator(); it.hasNext(); )  { 
            	            Gra2MoLParser.hashValue_return r = (Gra2MoLParser.hashValue_return) it.next(); 
            	            if(r != null && r.returnNode != null) {
            	            	r.returnNode.setKind("hashValue");
            	            	hashReturnNode.getChildren().add(r.returnNode);
            	            } 
            	        }
            	    }

            		// Create a special CST Node for terminal hashValueGen_1 aggregation
            		if(list_hashValueGen_1 != null) {
            	    for(int pos = 0; pos < list_hashValueGen_1.size(); pos++ )  { 
            	    // Create a Token CST Leaf	
            	    if(TK_1 != null) {
            			Leaf TK_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_1!=null?TK_1.getText():null), TK_1.getCharPositionInLine(), TK_1.getLine());
            	 		hashReturnNode.getChildren().add(TK_1Leaf);
            	 	}
            		// No Terminal extractor
            	    if(list_hashValueGen_1 != null) {		
            	    	Gra2MoLParser.hashValue_return r = (Gra2MoLParser.hashValue_return) list_hashValueGen_1.get(pos); 
            	    	if(r != null && r.returnNode != null) {
            	        	r.returnNode.setKind("hashValue");
            	    		hashReturnNode.getChildren().add(r.returnNode);
            	    	} 
            		}
            		}
            		}

            	    // Create a Token CST Leaf	
            	    if(TK_2 != null) {
            			Leaf TK_2Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_2!=null?TK_2.getText():null), TK_2.getCharPositionInLine(), TK_2.getLine());
            	 		hashReturnNode.getChildren().add(TK_2Leaf);
            	 	}
            		// Returns the Node with CST Leaves/Nodes
            		retval.returnNode = hashReturnNode;
            	

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
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "hashValue"
    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:149:1: hashValue returns [Node returnNode] : (hashValuePartGen+= hashValuePart TK_0= '->' hashValuePartGen_1+= hashValuePart | TK_0= 'default' TK_1= '->' hashValuePartGen+= hashValuePart );
    public final Gra2MoLParser.hashValue_return hashValue() throws RecognitionException {
        Gra2MoLParser.hashValue_return retval = new Gra2MoLParser.hashValue_return();
        retval.start = input.LT(1);

        Token TK_0=null;
        Token TK_1=null;
        List list_hashValuePartGen=null;
        List list_hashValuePartGen_1=null;
        RuleReturnScope hashValuePartGen = null;
        RuleReturnScope hashValuePartGen_1 = null;
        try {
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:150:1: (hashValuePartGen+= hashValuePart TK_0= '->' hashValuePartGen_1+= hashValuePart | TK_0= 'default' TK_1= '->' hashValuePartGen+= hashValuePart )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==DQVALUE||LA6_0==34||LA6_0==37) ) {
                alt6=1;
            }
            else if ( (LA6_0==33) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:150:4: hashValuePartGen+= hashValuePart TK_0= '->' hashValuePartGen_1+= hashValuePart
                    {
                    pushFollow(FOLLOW_hashValuePart_in_hashValue178);
                    hashValuePartGen=hashValuePart();

                    state._fsp--;

                    if (list_hashValuePartGen==null) list_hashValuePartGen=new ArrayList();
                    list_hashValuePartGen.add(hashValuePartGen);

                    TK_0=(Token)match(input,32,FOLLOW_32_in_hashValue183); 
                    pushFollow(FOLLOW_hashValuePart_in_hashValue188);
                    hashValuePartGen_1=hashValuePart();

                    state._fsp--;

                    if (list_hashValuePartGen_1==null) list_hashValuePartGen_1=new ArrayList();
                    list_hashValuePartGen_1.add(hashValuePartGen_1);


                    		// Create return CST Node
                    		Node hashValueReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                    		hashValueReturnNode.setKind("hashValue");
                    	    // Create a CST Node
                    		if(list_hashValuePartGen != null) {
                    	        for(Iterator it = list_hashValuePartGen.iterator(); it.hasNext(); )  { 
                    	            Gra2MoLParser.hashValuePart_return r = (Gra2MoLParser.hashValuePart_return) it.next(); 
                    	            if(r != null && r.returnNode != null) {
                    	            	r.returnNode.setKind("hashValuePart");
                    	            	hashValueReturnNode.getChildren().add(r.returnNode);
                    	            } 
                    	        }
                    	    }
                    	    // Create a Token CST Leaf	
                    	    if(TK_0 != null) {
                    			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_0!=null?TK_0.getText():null), TK_0.getCharPositionInLine(), TK_0.getLine());
                    	 		hashValueReturnNode.getChildren().add(TK_0Leaf);
                    	 	}
                    	    // Create a CST Node
                    		if(list_hashValuePartGen_1 != null) {
                    	        for(Iterator it = list_hashValuePartGen_1.iterator(); it.hasNext(); )  { 
                    	            Gra2MoLParser.hashValuePart_return r = (Gra2MoLParser.hashValuePart_return) it.next(); 
                    	            if(r != null && r.returnNode != null) {
                    	            	r.returnNode.setKind("hashValuePart");
                    	            	hashValueReturnNode.getChildren().add(r.returnNode);
                    	            } 
                    	        }
                    	    }
                    		// Returns the Node with CST Leaves/Nodes
                    		retval.returnNode = hashValueReturnNode;
                    	

                    }
                    break;
                case 2 :
                    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:183:5: TK_0= 'default' TK_1= '->' hashValuePartGen+= hashValuePart
                    {
                    TK_0=(Token)match(input,33,FOLLOW_33_in_hashValue200); 
                    TK_1=(Token)match(input,32,FOLLOW_32_in_hashValue205); 
                    pushFollow(FOLLOW_hashValuePart_in_hashValue210);
                    hashValuePartGen=hashValuePart();

                    state._fsp--;

                    if (list_hashValuePartGen==null) list_hashValuePartGen=new ArrayList();
                    list_hashValuePartGen.add(hashValuePartGen);


                    		// Create return CST Node
                    		Node hashValueReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                    		hashValueReturnNode.setKind("hashValue");
                    	    // Create a Token CST Leaf	
                    	    if(TK_0 != null) {
                    			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_0!=null?TK_0.getText():null), TK_0.getCharPositionInLine(), TK_0.getLine());
                    	 		hashValueReturnNode.getChildren().add(TK_0Leaf);
                    	 	}
                    	    // Create a Token CST Leaf	
                    	    if(TK_1 != null) {
                    			Leaf TK_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_1!=null?TK_1.getText():null), TK_1.getCharPositionInLine(), TK_1.getLine());
                    	 		hashValueReturnNode.getChildren().add(TK_1Leaf);
                    	 	}
                    	    // Create a CST Node
                    		if(list_hashValuePartGen != null) {
                    	        for(Iterator it = list_hashValuePartGen.iterator(); it.hasNext(); )  { 
                    	            Gra2MoLParser.hashValuePart_return r = (Gra2MoLParser.hashValuePart_return) it.next(); 
                    	            if(r != null && r.returnNode != null) {
                    	            	r.returnNode.setKind("hashValuePart");
                    	            	hashValueReturnNode.getChildren().add(r.returnNode);
                    	            } 
                    	        }
                    	    }
                    		// Returns the Node with CST Leaves/Nodes
                    		retval.returnNode = hashValueReturnNode;
                    	

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
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "hashValuePart"
    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:213:1: hashValuePart returns [Node returnNode] : (DQVALUEGen= DQVALUE | TK_0= 'G' TK_1= '(' IDGen= ID TK_2= ')' | TK_0= 'MM' TK_1= '(' normalNameGen+= normalName TK_2= ')' );
    public final Gra2MoLParser.hashValuePart_return hashValuePart() throws RecognitionException {
        Gra2MoLParser.hashValuePart_return retval = new Gra2MoLParser.hashValuePart_return();
        retval.start = input.LT(1);

        Token DQVALUEGen=null;
        Token TK_0=null;
        Token TK_1=null;
        Token IDGen=null;
        Token TK_2=null;
        List list_normalNameGen=null;
        RuleReturnScope normalNameGen = null;
        try {
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:214:1: (DQVALUEGen= DQVALUE | TK_0= 'G' TK_1= '(' IDGen= ID TK_2= ')' | TK_0= 'MM' TK_1= '(' normalNameGen+= normalName TK_2= ')' )
            int alt7=3;
            switch ( input.LA(1) ) {
            case DQVALUE:
                {
                alt7=1;
                }
                break;
            case 34:
                {
                alt7=2;
                }
                break;
            case 37:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:214:4: DQVALUEGen= DQVALUE
                    {
                    DQVALUEGen=(Token)match(input,DQVALUE,FOLLOW_DQVALUE_in_hashValuePart232); 

                    		// Create return CST Node
                    		Node hashValuePartReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                    		hashValuePartReturnNode.setKind("hashValuePart");
                    	    // Create a CST Leaf
                    		if(DQVALUEGen != null) {
                    			Leaf DQVALUEGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf("DQVALUE", (DQVALUEGen!=null?DQVALUEGen.getText():null), DQVALUEGen.getCharPositionInLine(), DQVALUEGen.getLine());
                    			hashValuePartReturnNode.getChildren().add(DQVALUEGenLeaf);
                    		}
                    		// Returns the Node with CST Leaves/Nodes
                    		retval.returnNode = hashValuePartReturnNode;
                    	

                    }
                    break;
                case 2 :
                    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:227:5: TK_0= 'G' TK_1= '(' IDGen= ID TK_2= ')'
                    {
                    TK_0=(Token)match(input,34,FOLLOW_34_in_hashValuePart244); 
                    TK_1=(Token)match(input,35,FOLLOW_35_in_hashValuePart249); 
                    IDGen=(Token)match(input,ID,FOLLOW_ID_in_hashValuePart254); 
                    TK_2=(Token)match(input,36,FOLLOW_36_in_hashValuePart259); 

                    		// Create return CST Node
                    		Node hashValuePartReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                    		hashValuePartReturnNode.setKind("hashValuePart");
                    	    // Create a Token CST Leaf	
                    	    if(TK_0 != null) {
                    			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_0!=null?TK_0.getText():null), TK_0.getCharPositionInLine(), TK_0.getLine());
                    	 		hashValuePartReturnNode.getChildren().add(TK_0Leaf);
                    	 	}
                    	    // Create a Token CST Leaf	
                    	    if(TK_1 != null) {
                    			Leaf TK_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_1!=null?TK_1.getText():null), TK_1.getCharPositionInLine(), TK_1.getLine());
                    	 		hashValuePartReturnNode.getChildren().add(TK_1Leaf);
                    	 	}
                    	    // Create a CST Leaf
                    		if(IDGen != null) {
                    			Leaf IDGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf("ID", (IDGen!=null?IDGen.getText():null), IDGen.getCharPositionInLine(), IDGen.getLine());
                    			hashValuePartReturnNode.getChildren().add(IDGenLeaf);
                    		}
                    	    // Create a Token CST Leaf	
                    	    if(TK_2 != null) {
                    			Leaf TK_2Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_2!=null?TK_2.getText():null), TK_2.getCharPositionInLine(), TK_2.getLine());
                    	 		hashValuePartReturnNode.getChildren().add(TK_2Leaf);
                    	 	}
                    		// Returns the Node with CST Leaves/Nodes
                    		retval.returnNode = hashValuePartReturnNode;
                    	

                    }
                    break;
                case 3 :
                    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:255:5: TK_0= 'MM' TK_1= '(' normalNameGen+= normalName TK_2= ')'
                    {
                    TK_0=(Token)match(input,37,FOLLOW_37_in_hashValuePart271); 
                    TK_1=(Token)match(input,35,FOLLOW_35_in_hashValuePart276); 
                    pushFollow(FOLLOW_normalName_in_hashValuePart281);
                    normalNameGen=normalName();

                    state._fsp--;

                    if (list_normalNameGen==null) list_normalNameGen=new ArrayList();
                    list_normalNameGen.add(normalNameGen);

                    TK_2=(Token)match(input,36,FOLLOW_36_in_hashValuePart286); 

                    		// Create return CST Node
                    		Node hashValuePartReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                    		hashValuePartReturnNode.setKind("hashValuePart");
                    	    // Create a Token CST Leaf	
                    	    if(TK_0 != null) {
                    			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_0!=null?TK_0.getText():null), TK_0.getCharPositionInLine(), TK_0.getLine());
                    	 		hashValuePartReturnNode.getChildren().add(TK_0Leaf);
                    	 	}
                    	    // Create a Token CST Leaf	
                    	    if(TK_1 != null) {
                    			Leaf TK_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_1!=null?TK_1.getText():null), TK_1.getCharPositionInLine(), TK_1.getLine());
                    	 		hashValuePartReturnNode.getChildren().add(TK_1Leaf);
                    	 	}
                    	    // Create a CST Node
                    		if(list_normalNameGen != null) {
                    	        for(Iterator it = list_normalNameGen.iterator(); it.hasNext(); )  { 
                    	            Gra2MoLParser.normalName_return r = (Gra2MoLParser.normalName_return) it.next(); 
                    	            if(r != null && r.returnNode != null) {
                    	            	r.returnNode.setKind("normalName");
                    	            	hashValuePartReturnNode.getChildren().add(r.returnNode);
                    	            } 
                    	        }
                    	    }
                    	    // Create a Token CST Leaf	
                    	    if(TK_2 != null) {
                    			Leaf TK_2Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_2!=null?TK_2.getText():null), TK_2.getCharPositionInLine(), TK_2.getLine());
                    	 		hashValuePartReturnNode.getChildren().add(TK_2Leaf);
                    	 	}
                    		// Returns the Node with CST Leaves/Nodes
                    		retval.returnNode = hashValuePartReturnNode;
                    	

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
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "rule"
    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:290:1: rule returns [Node returnNode] : ruleTypeGen+= ruleType ruleNameGen+= ruleName fromElementGen+= fromElement (contextElementGen+= contextElement )? (toElementGen+= toElement )? queryListGen+= queryList initListGen+= initList TK_0= 'end_rule' ;
    public final Gra2MoLParser.rule_return rule() throws RecognitionException {
        Gra2MoLParser.rule_return retval = new Gra2MoLParser.rule_return();
        retval.start = input.LT(1);

        Token TK_0=null;
        List list_ruleTypeGen=null;
        List list_ruleNameGen=null;
        List list_fromElementGen=null;
        List list_contextElementGen=null;
        List list_toElementGen=null;
        List list_queryListGen=null;
        List list_initListGen=null;
        RuleReturnScope ruleTypeGen = null;
        RuleReturnScope ruleNameGen = null;
        RuleReturnScope fromElementGen = null;
        RuleReturnScope contextElementGen = null;
        RuleReturnScope toElementGen = null;
        RuleReturnScope queryListGen = null;
        RuleReturnScope initListGen = null;
        try {
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:291:1: (ruleTypeGen+= ruleType ruleNameGen+= ruleName fromElementGen+= fromElement (contextElementGen+= contextElement )? (toElementGen+= toElement )? queryListGen+= queryList initListGen+= initList TK_0= 'end_rule' )
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:291:4: ruleTypeGen+= ruleType ruleNameGen+= ruleName fromElementGen+= fromElement (contextElementGen+= contextElement )? (toElementGen+= toElement )? queryListGen+= queryList initListGen+= initList TK_0= 'end_rule'
            {
            pushFollow(FOLLOW_ruleType_in_rule310);
            ruleTypeGen=ruleType();

            state._fsp--;

            if (list_ruleTypeGen==null) list_ruleTypeGen=new ArrayList();
            list_ruleTypeGen.add(ruleTypeGen);

            pushFollow(FOLLOW_ruleName_in_rule315);
            ruleNameGen=ruleName();

            state._fsp--;

            if (list_ruleNameGen==null) list_ruleNameGen=new ArrayList();
            list_ruleNameGen.add(ruleNameGen);

            pushFollow(FOLLOW_fromElement_in_rule320);
            fromElementGen=fromElement();

            state._fsp--;

            if (list_fromElementGen==null) list_fromElementGen=new ArrayList();
            list_fromElementGen.add(fromElementGen);

            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:291:96: (contextElementGen+= contextElement )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==49) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:291:96: contextElementGen+= contextElement
                    {
                    pushFollow(FOLLOW_contextElement_in_rule325);
                    contextElementGen=contextElement();

                    state._fsp--;

                    if (list_contextElementGen==null) list_contextElementGen=new ArrayList();
                    list_contextElementGen.add(contextElementGen);


                    }
                    break;

            }

            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:291:127: (toElementGen+= toElement )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==50) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:291:127: toElementGen+= toElement
                    {
                    pushFollow(FOLLOW_toElement_in_rule331);
                    toElementGen=toElement();

                    state._fsp--;

                    if (list_toElementGen==null) list_toElementGen=new ArrayList();
                    list_toElementGen.add(toElementGen);


                    }
                    break;

            }

            pushFollow(FOLLOW_queryList_in_rule337);
            queryListGen=queryList();

            state._fsp--;

            if (list_queryListGen==null) list_queryListGen=new ArrayList();
            list_queryListGen.add(queryListGen);

            pushFollow(FOLLOW_initList_in_rule342);
            initListGen=initList();

            state._fsp--;

            if (list_initListGen==null) list_initListGen=new ArrayList();
            list_initListGen.add(initListGen);

            TK_0=(Token)match(input,38,FOLLOW_38_in_rule347); 

            		// Create return CST Node
            		Node ruleReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
            		ruleReturnNode.setKind("rule");
            	    // Create a CST Node
            		if(list_ruleTypeGen != null) {
            	        for(Iterator it = list_ruleTypeGen.iterator(); it.hasNext(); )  { 
            	            Gra2MoLParser.ruleType_return r = (Gra2MoLParser.ruleType_return) it.next(); 
            	            if(r != null && r.returnNode != null) {
            	            	r.returnNode.setKind("ruleType");
            	            	ruleReturnNode.getChildren().add(r.returnNode);
            	            } 
            	        }
            	    }
            	    // Create a CST Node
            		if(list_ruleNameGen != null) {
            	        for(Iterator it = list_ruleNameGen.iterator(); it.hasNext(); )  { 
            	            Gra2MoLParser.ruleName_return r = (Gra2MoLParser.ruleName_return) it.next(); 
            	            if(r != null && r.returnNode != null) {
            	            	r.returnNode.setKind("ruleName");
            	            	ruleReturnNode.getChildren().add(r.returnNode);
            	            } 
            	        }
            	    }
            	    // Create a CST Node
            		if(list_fromElementGen != null) {
            	        for(Iterator it = list_fromElementGen.iterator(); it.hasNext(); )  { 
            	            Gra2MoLParser.fromElement_return r = (Gra2MoLParser.fromElement_return) it.next(); 
            	            if(r != null && r.returnNode != null) {
            	            	r.returnNode.setKind("fromElement");
            	            	ruleReturnNode.getChildren().add(r.returnNode);
            	            } 
            	        }
            	    }
            	    // Create a CST Node
            		if(list_contextElementGen != null) {
            	        for(Iterator it = list_contextElementGen.iterator(); it.hasNext(); )  { 
            	            Gra2MoLParser.contextElement_return r = (Gra2MoLParser.contextElement_return) it.next(); 
            	            if(r != null && r.returnNode != null) {
            	            	r.returnNode.setKind("contextElement");
            	            	ruleReturnNode.getChildren().add(r.returnNode);
            	            } 
            	        }
            	    }
            	    // Create a CST Node
            		if(list_toElementGen != null) {
            	        for(Iterator it = list_toElementGen.iterator(); it.hasNext(); )  { 
            	            Gra2MoLParser.toElement_return r = (Gra2MoLParser.toElement_return) it.next(); 
            	            if(r != null && r.returnNode != null) {
            	            	r.returnNode.setKind("toElement");
            	            	ruleReturnNode.getChildren().add(r.returnNode);
            	            } 
            	        }
            	    }
            	    // Create a CST Node
            		if(list_queryListGen != null) {
            	        for(Iterator it = list_queryListGen.iterator(); it.hasNext(); )  { 
            	            Gra2MoLParser.queryList_return r = (Gra2MoLParser.queryList_return) it.next(); 
            	            if(r != null && r.returnNode != null) {
            	            	r.returnNode.setKind("queryList");
            	            	ruleReturnNode.getChildren().add(r.returnNode);
            	            } 
            	        }
            	    }
            	    // Create a CST Node
            		if(list_initListGen != null) {
            	        for(Iterator it = list_initListGen.iterator(); it.hasNext(); )  { 
            	            Gra2MoLParser.initList_return r = (Gra2MoLParser.initList_return) it.next(); 
            	            if(r != null && r.returnNode != null) {
            	            	r.returnNode.setKind("initList");
            	            	ruleReturnNode.getChildren().add(r.returnNode);
            	            } 
            	        }
            	    }
            	    // Create a Token CST Leaf	
            	    if(TK_0 != null) {
            			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_0!=null?TK_0.getText():null), TK_0.getCharPositionInLine(), TK_0.getLine());
            	 		ruleReturnNode.getChildren().add(TK_0Leaf);
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
    // $ANTLR end "rule"

    public static class ruleType_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "ruleType"
    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:376:1: ruleType returns [Node returnNode] : (TK_0= 'rule' | TK_0= 'skip_rule' | TK_0= 'copy_rule' | TK_0= 'mixin_rule' );
    public final Gra2MoLParser.ruleType_return ruleType() throws RecognitionException {
        Gra2MoLParser.ruleType_return retval = new Gra2MoLParser.ruleType_return();
        retval.start = input.LT(1);

        Token TK_0=null;

        try {
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:377:1: (TK_0= 'rule' | TK_0= 'skip_rule' | TK_0= 'copy_rule' | TK_0= 'mixin_rule' )
            int alt10=4;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt10=1;
                }
                break;
            case 40:
                {
                alt10=2;
                }
                break;
            case 41:
                {
                alt10=3;
                }
                break;
            case 42:
                {
                alt10=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:377:4: TK_0= 'rule'
                    {
                    TK_0=(Token)match(input,39,FOLLOW_39_in_ruleType369); 

                    		// Create return CST Node
                    		Node ruleTypeReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                    		ruleTypeReturnNode.setKind("ruleType");
                    	    // Create a Token CST Leaf	
                    	    if(TK_0 != null) {
                    			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_0!=null?TK_0.getText():null), TK_0.getCharPositionInLine(), TK_0.getLine());
                    	 		ruleTypeReturnNode.getChildren().add(TK_0Leaf);
                    	 	}
                    		// Returns the Node with CST Leaves/Nodes
                    		retval.returnNode = ruleTypeReturnNode;
                    	

                    }
                    break;
                case 2 :
                    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:390:5: TK_0= 'skip_rule'
                    {
                    TK_0=(Token)match(input,40,FOLLOW_40_in_ruleType381); 

                    		// Create return CST Node
                    		Node ruleTypeReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                    		ruleTypeReturnNode.setKind("ruleType");
                    	    // Create a Token CST Leaf	
                    	    if(TK_0 != null) {
                    			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_0!=null?TK_0.getText():null), TK_0.getCharPositionInLine(), TK_0.getLine());
                    	 		ruleTypeReturnNode.getChildren().add(TK_0Leaf);
                    	 	}
                    		// Returns the Node with CST Leaves/Nodes
                    		retval.returnNode = ruleTypeReturnNode;
                    	

                    }
                    break;
                case 3 :
                    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:403:5: TK_0= 'copy_rule'
                    {
                    TK_0=(Token)match(input,41,FOLLOW_41_in_ruleType393); 

                    		// Create return CST Node
                    		Node ruleTypeReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                    		ruleTypeReturnNode.setKind("ruleType");
                    	    // Create a Token CST Leaf	
                    	    if(TK_0 != null) {
                    			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_0!=null?TK_0.getText():null), TK_0.getCharPositionInLine(), TK_0.getLine());
                    	 		ruleTypeReturnNode.getChildren().add(TK_0Leaf);
                    	 	}
                    		// Returns the Node with CST Leaves/Nodes
                    		retval.returnNode = ruleTypeReturnNode;
                    	

                    }
                    break;
                case 4 :
                    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:416:5: TK_0= 'mixin_rule'
                    {
                    TK_0=(Token)match(input,42,FOLLOW_42_in_ruleType405); 

                    		// Create return CST Node
                    		Node ruleTypeReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                    		ruleTypeReturnNode.setKind("ruleType");
                    	    // Create a Token CST Leaf	
                    	    if(TK_0 != null) {
                    			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_0!=null?TK_0.getText():null), TK_0.getCharPositionInLine(), TK_0.getLine());
                    	 		ruleTypeReturnNode.getChildren().add(TK_0Leaf);
                    	 	}
                    		// Returns the Node with CST Leaves/Nodes
                    		retval.returnNode = ruleTypeReturnNode;
                    	

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
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "ruleName"
    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:431:1: ruleName returns [Node returnNode] : (QUOTEGen= QUOTE )? IDGen= ID (QUOTEGen_1= QUOTE )? ;
    public final Gra2MoLParser.ruleName_return ruleName() throws RecognitionException {
        Gra2MoLParser.ruleName_return retval = new Gra2MoLParser.ruleName_return();
        retval.start = input.LT(1);

        Token QUOTEGen=null;
        Token IDGen=null;
        Token QUOTEGen_1=null;

        try {
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:432:1: ( (QUOTEGen= QUOTE )? IDGen= ID (QUOTEGen_1= QUOTE )? )
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:432:3: (QUOTEGen= QUOTE )? IDGen= ID (QUOTEGen_1= QUOTE )?
            {
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:432:3: (QUOTEGen= QUOTE )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==QUOTE) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:432:5: QUOTEGen= QUOTE
                    {
                    QUOTEGen=(Token)match(input,QUOTE,FOLLOW_QUOTE_in_ruleName428); 

                    }
                    break;

            }

            IDGen=(Token)match(input,ID,FOLLOW_ID_in_ruleName435); 
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:432:32: (QUOTEGen_1= QUOTE )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==QUOTE) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:432:34: QUOTEGen_1= QUOTE
                    {
                    QUOTEGen_1=(Token)match(input,QUOTE,FOLLOW_QUOTE_in_ruleName441); 

                    }
                    break;

            }


            		// Create return CST Node
            		Node ruleNameReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
            		ruleNameReturnNode.setKind("ruleName");
            	    // Create a CST Leaf
            		if(QUOTEGen != null) {
            			Leaf QUOTEGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf("QUOTE", (QUOTEGen!=null?QUOTEGen.getText():null), QUOTEGen.getCharPositionInLine(), QUOTEGen.getLine());
            			ruleNameReturnNode.getChildren().add(QUOTEGenLeaf);
            		}
            	    // Create a CST Leaf
            		if(IDGen != null) {
            			Leaf IDGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf("ID", (IDGen!=null?IDGen.getText():null), IDGen.getCharPositionInLine(), IDGen.getLine());
            			ruleNameReturnNode.getChildren().add(IDGenLeaf);
            		}
            	    // Create a CST Leaf
            		if(QUOTEGen_1 != null) {
            			Leaf QUOTEGen_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("QUOTE", (QUOTEGen_1!=null?QUOTEGen_1.getText():null), QUOTEGen_1.getCharPositionInLine(), QUOTEGen_1.getLine());
            			ruleNameReturnNode.getChildren().add(QUOTEGen_1Leaf);
            		}
            		// Returns the Node with CST Leaves/Nodes
            		retval.returnNode = ruleNameReturnNode;
            	

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
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "fromElement"
    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:457:1: fromElement returns [Node returnNode] : TK_0= 'from' idGen+= id (TK_1= '[' TK_2= 'unique' TK_3= ']' )? (TK_4= '{' filterExpressionGen+= filterExpression TK_5= '}' )? (filterUnitGen+= filterUnit )? (IDGen= ID )? ;
    public final Gra2MoLParser.fromElement_return fromElement() throws RecognitionException {
        Gra2MoLParser.fromElement_return retval = new Gra2MoLParser.fromElement_return();
        retval.start = input.LT(1);

        Token TK_0=null;
        Token TK_1=null;
        Token TK_2=null;
        Token TK_3=null;
        Token TK_4=null;
        Token TK_5=null;
        Token IDGen=null;
        List list_idGen=null;
        List list_filterExpressionGen=null;
        List list_filterUnitGen=null;
        RuleReturnScope idGen = null;
        RuleReturnScope filterExpressionGen = null;
        RuleReturnScope filterUnitGen = null;
        try {
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:458:1: (TK_0= 'from' idGen+= id (TK_1= '[' TK_2= 'unique' TK_3= ']' )? (TK_4= '{' filterExpressionGen+= filterExpression TK_5= '}' )? (filterUnitGen+= filterUnit )? (IDGen= ID )? )
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:458:5: TK_0= 'from' idGen+= id (TK_1= '[' TK_2= 'unique' TK_3= ']' )? (TK_4= '{' filterExpressionGen+= filterExpression TK_5= '}' )? (filterUnitGen+= filterUnit )? (IDGen= ID )?
            {
            TK_0=(Token)match(input,43,FOLLOW_43_in_fromElement466); 
            pushFollow(FOLLOW_id_in_fromElement471);
            idGen=id();

            state._fsp--;

            if (list_idGen==null) list_idGen=new ArrayList();
            list_idGen.add(idGen);

            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:458:28: (TK_1= '[' TK_2= 'unique' TK_3= ']' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==44) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:458:30: TK_1= '[' TK_2= 'unique' TK_3= ']'
                    {
                    TK_1=(Token)match(input,44,FOLLOW_44_in_fromElement477); 
                    TK_2=(Token)match(input,45,FOLLOW_45_in_fromElement482); 
                    TK_3=(Token)match(input,46,FOLLOW_46_in_fromElement487); 

                    }
                    break;

            }

            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:458:66: (TK_4= '{' filterExpressionGen+= filterExpression TK_5= '}' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==47) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:458:68: TK_4= '{' filterExpressionGen+= filterExpression TK_5= '}'
                    {
                    TK_4=(Token)match(input,47,FOLLOW_47_in_fromElement495); 
                    pushFollow(FOLLOW_filterExpression_in_fromElement500);
                    filterExpressionGen=filterExpression();

                    state._fsp--;

                    if (list_filterExpressionGen==null) list_filterExpressionGen=new ArrayList();
                    list_filterExpressionGen.add(filterExpressionGen);

                    TK_5=(Token)match(input,48,FOLLOW_48_in_fromElement505); 

                    }
                    break;

            }

            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:458:128: (filterUnitGen+= filterUnit )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0>=TRIPLEBAR && LA15_0<=BAR)) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:458:130: filterUnitGen+= filterUnit
                    {
                    pushFollow(FOLLOW_filterUnit_in_fromElement513);
                    filterUnitGen=filterUnit();

                    state._fsp--;

                    if (list_filterUnitGen==null) list_filterUnitGen=new ArrayList();
                    list_filterUnitGen.add(filterUnitGen);


                    }
                    break;

            }

            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:458:158: (IDGen= ID )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==ID) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:458:160: IDGen= ID
                    {
                    IDGen=(Token)match(input,ID,FOLLOW_ID_in_fromElement521); 

                    }
                    break;

            }


            		// Create return CST Node
            		Node fromElementReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
            		fromElementReturnNode.setKind("fromElement");
            	    // Create a Token CST Leaf	
            	    if(TK_0 != null) {
            			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_0!=null?TK_0.getText():null), TK_0.getCharPositionInLine(), TK_0.getLine());
            	 		fromElementReturnNode.getChildren().add(TK_0Leaf);
            	 	}
            	    // Create a CST Node
            		if(list_idGen != null) {
            	        for(Iterator it = list_idGen.iterator(); it.hasNext(); )  { 
            	            Gra2MoLParser.id_return r = (Gra2MoLParser.id_return) it.next(); 
            	            if(r != null && r.returnNode != null) {
            	            	r.returnNode.setKind("id");
            	            	fromElementReturnNode.getChildren().add(r.returnNode);
            	            } 
            	        }
            	    }
            	    // Create a Token CST Leaf	
            	    if(TK_1 != null) {
            			Leaf TK_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_1!=null?TK_1.getText():null), TK_1.getCharPositionInLine(), TK_1.getLine());
            	 		fromElementReturnNode.getChildren().add(TK_1Leaf);
            	 	}
            	    // Create a Token CST Leaf	
            	    if(TK_2 != null) {
            			Leaf TK_2Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_2!=null?TK_2.getText():null), TK_2.getCharPositionInLine(), TK_2.getLine());
            	 		fromElementReturnNode.getChildren().add(TK_2Leaf);
            	 	}
            	    // Create a Token CST Leaf	
            	    if(TK_3 != null) {
            			Leaf TK_3Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_3!=null?TK_3.getText():null), TK_3.getCharPositionInLine(), TK_3.getLine());
            	 		fromElementReturnNode.getChildren().add(TK_3Leaf);
            	 	}
            	    // Create a Token CST Leaf	
            	    if(TK_4 != null) {
            			Leaf TK_4Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_4!=null?TK_4.getText():null), TK_4.getCharPositionInLine(), TK_4.getLine());
            	 		fromElementReturnNode.getChildren().add(TK_4Leaf);
            	 	}
            	    // Create a CST Node
            		if(list_filterExpressionGen != null) {
            	        for(Iterator it = list_filterExpressionGen.iterator(); it.hasNext(); )  { 
            	            Gra2MoLParser.filterExpression_return r = (Gra2MoLParser.filterExpression_return) it.next(); 
            	            if(r != null && r.returnNode != null) {
            	            	r.returnNode.setKind("filterExpression");
            	            	fromElementReturnNode.getChildren().add(r.returnNode);
            	            } 
            	        }
            	    }
            	    // Create a Token CST Leaf	
            	    if(TK_5 != null) {
            			Leaf TK_5Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_5!=null?TK_5.getText():null), TK_5.getCharPositionInLine(), TK_5.getLine());
            	 		fromElementReturnNode.getChildren().add(TK_5Leaf);
            	 	}
            	    // Create a CST Node
            		if(list_filterUnitGen != null) {
            	        for(Iterator it = list_filterUnitGen.iterator(); it.hasNext(); )  { 
            	            Gra2MoLParser.filterUnit_return r = (Gra2MoLParser.filterUnit_return) it.next(); 
            	            if(r != null && r.returnNode != null) {
            	            	r.returnNode.setKind("filterUnit");
            	            	fromElementReturnNode.getChildren().add(r.returnNode);
            	            } 
            	        }
            	    }
            	    // Create a CST Leaf
            		if(IDGen != null) {
            			Leaf IDGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf("ID", (IDGen!=null?IDGen.getText():null), IDGen.getCharPositionInLine(), IDGen.getLine());
            			fromElementReturnNode.getChildren().add(IDGenLeaf);
            		}
            		// Returns the Node with CST Leaves/Nodes
            		retval.returnNode = fromElementReturnNode;
            	

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
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "contextElement"
    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:533:1: contextElement returns [Node returnNode] : TK_0= 'context' IDGen= ID (TK_1= ',' IDGen_1_List+= ID )* ;
    public final Gra2MoLParser.contextElement_return contextElement() throws RecognitionException {
        Gra2MoLParser.contextElement_return retval = new Gra2MoLParser.contextElement_return();
        retval.start = input.LT(1);

        Token TK_0=null;
        Token IDGen=null;
        Token TK_1=null;
        Token IDGen_1_List=null;
        List list_IDGen_1_List=null;

        try {
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:534:1: (TK_0= 'context' IDGen= ID (TK_1= ',' IDGen_1_List+= ID )* )
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:534:5: TK_0= 'context' IDGen= ID (TK_1= ',' IDGen_1_List+= ID )*
            {
            TK_0=(Token)match(input,49,FOLLOW_49_in_contextElement547); 
            IDGen=(Token)match(input,ID,FOLLOW_ID_in_contextElement552); 
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:534:30: (TK_1= ',' IDGen_1_List+= ID )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==30) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:534:32: TK_1= ',' IDGen_1_List+= ID
            	    {
            	    TK_1=(Token)match(input,30,FOLLOW_30_in_contextElement558); 
            	    IDGen_1_List=(Token)match(input,ID,FOLLOW_ID_in_contextElement563); 
            	    if (list_IDGen_1_List==null) list_IDGen_1_List=new ArrayList();
            	    list_IDGen_1_List.add(IDGen_1_List);


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);


            		// Create return CST Node
            		Node contextElementReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
            		contextElementReturnNode.setKind("contextElement");
            	    // Create a Token CST Leaf	
            	    if(TK_0 != null) {
            			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_0!=null?TK_0.getText():null), TK_0.getCharPositionInLine(), TK_0.getLine());
            	 		contextElementReturnNode.getChildren().add(TK_0Leaf);
            	 	}
            	    // Create a CST Leaf
            		if(IDGen != null) {
            			Leaf IDGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf("ID", (IDGen!=null?IDGen.getText():null), IDGen.getCharPositionInLine(), IDGen.getLine());
            			contextElementReturnNode.getChildren().add(IDGenLeaf);
            		}

            		// Create a special CST Node for terminal IDGen_1_List aggregation
            		if(list_IDGen_1_List != null) {
            	    for(int pos = 0; pos < list_IDGen_1_List.size(); pos++ )  { 
            	    // Create a Token CST Leaf	
            	    if(TK_1 != null) {
            			Leaf TK_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_1!=null?TK_1.getText():null), TK_1.getCharPositionInLine(), TK_1.getLine());
            	 		contextElementReturnNode.getChildren().add(TK_1Leaf);
            	 	}
            		// Terminal extractor
            	    if(list_IDGen_1_List != null) {
            		    Token t = (Token) list_IDGen_1_List.get(pos); 
            		    Leaf IDGen_1_ListLeaf = CSTFactoryImpl.eINSTANCE.createLeaf("ID", t.getText(), t.getCharPositionInLine(), t.getLine());
            			contextElementReturnNode.getChildren().add(IDGen_1_ListLeaf);
            		}
            		}
            		}

            		// Returns the Node with CST Leaves/Nodes
            		retval.returnNode = contextElementReturnNode;
            	

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

    public static class toElement_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "toElement"
    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:572:1: toElement returns [Node returnNode] : TK_0= 'to' normalNameGen+= normalName (al= ID )? ;
    public final Gra2MoLParser.toElement_return toElement() throws RecognitionException {
        Gra2MoLParser.toElement_return retval = new Gra2MoLParser.toElement_return();
        retval.start = input.LT(1);

        Token TK_0=null;
        Token al=null;
        List list_normalNameGen=null;
        RuleReturnScope normalNameGen = null;
        try {
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:573:1: (TK_0= 'to' normalNameGen+= normalName (al= ID )? )
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:573:5: TK_0= 'to' normalNameGen+= normalName (al= ID )?
            {
            TK_0=(Token)match(input,50,FOLLOW_50_in_toElement588); 
            pushFollow(FOLLOW_normalName_in_toElement593);
            normalNameGen=normalName();

            state._fsp--;

            if (list_normalNameGen==null) list_normalNameGen=new ArrayList();
            list_normalNameGen.add(normalNameGen);

            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:573:42: (al= ID )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==ID) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:573:43: al= ID
                    {
                    al=(Token)match(input,ID,FOLLOW_ID_in_toElement598); 

                    }
                    break;

            }


            		// Create return CST Node
            		Node toElementReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
            		toElementReturnNode.setKind("toElement");
            	    // Create a Token CST Leaf	
            	    if(TK_0 != null) {
            			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_0!=null?TK_0.getText():null), TK_0.getCharPositionInLine(), TK_0.getLine());
            	 		toElementReturnNode.getChildren().add(TK_0Leaf);
            	 	}
            	    // Create a CST Node
            		if(list_normalNameGen != null) {
            	        for(Iterator it = list_normalNameGen.iterator(); it.hasNext(); )  { 
            	            Gra2MoLParser.normalName_return r = (Gra2MoLParser.normalName_return) it.next(); 
            	            if(r != null && r.returnNode != null) {
            	            	r.returnNode.setKind("normalName");
            	            	toElementReturnNode.getChildren().add(r.returnNode);
            	            } 
            	        }
            	    }
            	    // Create a CST Leaf
            		if(al != null) {
            			Leaf alLeaf = CSTFactoryImpl.eINSTANCE.createLeaf("al", (al!=null?al.getText():null), al.getCharPositionInLine(), al.getLine());
            			toElementReturnNode.getChildren().add(alLeaf);
            		}
            		// Returns the Node with CST Leaves/Nodes
            		retval.returnNode = toElementReturnNode;
            	

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
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "normalName"
    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:603:1: normalName returns [Node returnNode] : IDGen= ID ( (DOTGen= DOT | DDOTSGen= DDOTS ) IDGen_1_List+= ID )* ;
    public final Gra2MoLParser.normalName_return normalName() throws RecognitionException {
        Gra2MoLParser.normalName_return retval = new Gra2MoLParser.normalName_return();
        retval.start = input.LT(1);

        Token IDGen=null;
        Token DOTGen=null;
        Token DDOTSGen=null;
        Token IDGen_1_List=null;
        List list_IDGen_1_List=null;

        try {
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:604:1: (IDGen= ID ( (DOTGen= DOT | DDOTSGen= DDOTS ) IDGen_1_List+= ID )* )
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:604:5: IDGen= ID ( (DOTGen= DOT | DDOTSGen= DDOTS ) IDGen_1_List+= ID )*
            {
            IDGen=(Token)match(input,ID,FOLLOW_ID_in_normalName623); 
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:604:14: ( (DOTGen= DOT | DDOTSGen= DDOTS ) IDGen_1_List+= ID )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=DOT && LA20_0<=DDOTS)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:604:15: (DOTGen= DOT | DDOTSGen= DDOTS ) IDGen_1_List+= ID
            	    {
            	    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:604:15: (DOTGen= DOT | DDOTSGen= DDOTS )
            	    int alt19=2;
            	    int LA19_0 = input.LA(1);

            	    if ( (LA19_0==DOT) ) {
            	        alt19=1;
            	    }
            	    else if ( (LA19_0==DDOTS) ) {
            	        alt19=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 19, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt19) {
            	        case 1 :
            	            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:604:17: DOTGen= DOT
            	            {
            	            DOTGen=(Token)match(input,DOT,FOLLOW_DOT_in_normalName630); 

            	            }
            	            break;
            	        case 2 :
            	            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:604:31: DDOTSGen= DDOTS
            	            {
            	            DDOTSGen=(Token)match(input,DDOTS,FOLLOW_DDOTS_in_normalName637); 

            	            }
            	            break;

            	    }

            	    IDGen_1_List=(Token)match(input,ID,FOLLOW_ID_in_normalName643); 
            	    if (list_IDGen_1_List==null) list_IDGen_1_List=new ArrayList();
            	    list_IDGen_1_List.add(IDGen_1_List);


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);


            		// Create return CST Node
            		Node normalNameReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
            		normalNameReturnNode.setKind("normalName");
            	    // Create a CST Leaf
            		if(IDGen != null) {
            			Leaf IDGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf("ID", (IDGen!=null?IDGen.getText():null), IDGen.getCharPositionInLine(), IDGen.getLine());
            			normalNameReturnNode.getChildren().add(IDGenLeaf);
            		}

            		// Create a special CST Node for terminal IDGen_1_List aggregation
            		if(list_IDGen_1_List != null) {
            	    for(int pos = 0; pos < list_IDGen_1_List.size(); pos++ )  { 
            	    // Create a CST Leaf
            		if(DOTGen != null) {
            			Leaf DOTGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf("DOT", (DOTGen!=null?DOTGen.getText():null), DOTGen.getCharPositionInLine(), DOTGen.getLine());
            			normalNameReturnNode.getChildren().add(DOTGenLeaf);
            		}
            	    // Create a CST Leaf
            		if(DDOTSGen != null) {
            			Leaf DDOTSGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf("DDOTS", (DDOTSGen!=null?DDOTSGen.getText():null), DDOTSGen.getCharPositionInLine(), DDOTSGen.getLine());
            			normalNameReturnNode.getChildren().add(DDOTSGenLeaf);
            		}
            		// Terminal extractor
            	    if(list_IDGen_1_List != null) {
            		    Token t = (Token) list_IDGen_1_List.get(pos); 
            		    Leaf IDGen_1_ListLeaf = CSTFactoryImpl.eINSTANCE.createLeaf("ID", t.getText(), t.getCharPositionInLine(), t.getLine());
            			normalNameReturnNode.getChildren().add(IDGen_1_ListLeaf);
            		}
            		}
            		}

            		// Returns the Node with CST Leaves/Nodes
            		retval.returnNode = normalNameReturnNode;
            	

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
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "queryList"
    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:642:1: queryList returns [Node returnNode] : TK_0= 'queries' (queryGen+= query )* ;
    public final Gra2MoLParser.queryList_return queryList() throws RecognitionException {
        Gra2MoLParser.queryList_return retval = new Gra2MoLParser.queryList_return();
        retval.start = input.LT(1);

        Token TK_0=null;
        List list_queryGen=null;
        RuleReturnScope queryGen = null;
        try {
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:643:1: (TK_0= 'queries' (queryGen+= query )* )
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:643:4: TK_0= 'queries' (queryGen+= query )*
            {
            TK_0=(Token)match(input,51,FOLLOW_51_in_queryList667); 
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:643:28: (queryGen+= query )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==ID) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:643:28: queryGen+= query
            	    {
            	    pushFollow(FOLLOW_query_in_queryList672);
            	    queryGen=query();

            	    state._fsp--;

            	    if (list_queryGen==null) list_queryGen=new ArrayList();
            	    list_queryGen.add(queryGen);


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);


            		// Create return CST Node
            		Node queryListReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
            		queryListReturnNode.setKind("queryList");
            	    // Create a Token CST Leaf	
            	    if(TK_0 != null) {
            			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_0!=null?TK_0.getText():null), TK_0.getCharPositionInLine(), TK_0.getLine());
            	 		queryListReturnNode.getChildren().add(TK_0Leaf);
            	 	}
            	    // Create a CST Node
            		if(list_queryGen != null) {
            	        for(Iterator it = list_queryGen.iterator(); it.hasNext(); )  { 
            	            Gra2MoLParser.query_return r = (Gra2MoLParser.query_return) it.next(); 
            	            if(r != null && r.returnNode != null) {
            	            	r.returnNode.setKind("query");
            	            	queryListReturnNode.getChildren().add(r.returnNode);
            	            } 
            	        }
            	    }
            		// Returns the Node with CST Leaves/Nodes
            		retval.returnNode = queryListReturnNode;
            	

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
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "query"
    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:668:1: query returns [Node returnNode] : IDGen= ID TK_0= ':' (TK_1= '{' queryControlGen+= queryControl TK_2= '}' )? (TK_3= '(' IDGen_1= ID TK_4= ')' )? filterUnitGen+= filterUnit TK_5= ';' ;
    public final Gra2MoLParser.query_return query() throws RecognitionException {
        Gra2MoLParser.query_return retval = new Gra2MoLParser.query_return();
        retval.start = input.LT(1);

        Token IDGen=null;
        Token TK_0=null;
        Token TK_1=null;
        Token TK_2=null;
        Token TK_3=null;
        Token IDGen_1=null;
        Token TK_4=null;
        Token TK_5=null;
        List list_queryControlGen=null;
        List list_filterUnitGen=null;
        RuleReturnScope queryControlGen = null;
        RuleReturnScope filterUnitGen = null;
        try {
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:669:1: (IDGen= ID TK_0= ':' (TK_1= '{' queryControlGen+= queryControl TK_2= '}' )? (TK_3= '(' IDGen_1= ID TK_4= ')' )? filterUnitGen+= filterUnit TK_5= ';' )
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:669:4: IDGen= ID TK_0= ':' (TK_1= '{' queryControlGen+= queryControl TK_2= '}' )? (TK_3= '(' IDGen_1= ID TK_4= ')' )? filterUnitGen+= filterUnit TK_5= ';'
            {
            IDGen=(Token)match(input,ID,FOLLOW_ID_in_query695); 
            TK_0=(Token)match(input,26,FOLLOW_26_in_query700); 
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:669:23: (TK_1= '{' queryControlGen+= queryControl TK_2= '}' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==47) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:669:26: TK_1= '{' queryControlGen+= queryControl TK_2= '}'
                    {
                    TK_1=(Token)match(input,47,FOLLOW_47_in_query707); 
                    pushFollow(FOLLOW_queryControl_in_query712);
                    queryControlGen=queryControl();

                    state._fsp--;

                    if (list_queryControlGen==null) list_queryControlGen=new ArrayList();
                    list_queryControlGen.add(queryControlGen);

                    TK_2=(Token)match(input,48,FOLLOW_48_in_query717); 

                    }
                    break;

            }

            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:669:79: (TK_3= '(' IDGen_1= ID TK_4= ')' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==35) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:669:81: TK_3= '(' IDGen_1= ID TK_4= ')'
                    {
                    TK_3=(Token)match(input,35,FOLLOW_35_in_query726); 
                    IDGen_1=(Token)match(input,ID,FOLLOW_ID_in_query731); 
                    TK_4=(Token)match(input,36,FOLLOW_36_in_query736); 

                    }
                    break;

            }

            pushFollow(FOLLOW_filterUnit_in_query743);
            filterUnitGen=filterUnit();

            state._fsp--;

            if (list_filterUnitGen==null) list_filterUnitGen=new ArrayList();
            list_filterUnitGen.add(filterUnitGen);

            TK_5=(Token)match(input,27,FOLLOW_27_in_query748); 

            		// Create return CST Node
            		Node queryReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
            		queryReturnNode.setKind("query");
            	    // Create a CST Leaf
            		if(IDGen != null) {
            			Leaf IDGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf("ID", (IDGen!=null?IDGen.getText():null), IDGen.getCharPositionInLine(), IDGen.getLine());
            			queryReturnNode.getChildren().add(IDGenLeaf);
            		}
            	    // Create a Token CST Leaf	
            	    if(TK_0 != null) {
            			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_0!=null?TK_0.getText():null), TK_0.getCharPositionInLine(), TK_0.getLine());
            	 		queryReturnNode.getChildren().add(TK_0Leaf);
            	 	}
            	    // Create a Token CST Leaf	
            	    if(TK_1 != null) {
            			Leaf TK_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_1!=null?TK_1.getText():null), TK_1.getCharPositionInLine(), TK_1.getLine());
            	 		queryReturnNode.getChildren().add(TK_1Leaf);
            	 	}
            	    // Create a CST Node
            		if(list_queryControlGen != null) {
            	        for(Iterator it = list_queryControlGen.iterator(); it.hasNext(); )  { 
            	            Gra2MoLParser.queryControl_return r = (Gra2MoLParser.queryControl_return) it.next(); 
            	            if(r != null && r.returnNode != null) {
            	            	r.returnNode.setKind("queryControl");
            	            	queryReturnNode.getChildren().add(r.returnNode);
            	            } 
            	        }
            	    }
            	    // Create a Token CST Leaf	
            	    if(TK_2 != null) {
            			Leaf TK_2Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_2!=null?TK_2.getText():null), TK_2.getCharPositionInLine(), TK_2.getLine());
            	 		queryReturnNode.getChildren().add(TK_2Leaf);
            	 	}
            	    // Create a Token CST Leaf	
            	    if(TK_3 != null) {
            			Leaf TK_3Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_3!=null?TK_3.getText():null), TK_3.getCharPositionInLine(), TK_3.getLine());
            	 		queryReturnNode.getChildren().add(TK_3Leaf);
            	 	}
            	    // Create a CST Leaf
            		if(IDGen_1 != null) {
            			Leaf IDGen_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("ID", (IDGen_1!=null?IDGen_1.getText():null), IDGen_1.getCharPositionInLine(), IDGen_1.getLine());
            			queryReturnNode.getChildren().add(IDGen_1Leaf);
            		}
            	    // Create a Token CST Leaf	
            	    if(TK_4 != null) {
            			Leaf TK_4Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_4!=null?TK_4.getText():null), TK_4.getCharPositionInLine(), TK_4.getLine());
            	 		queryReturnNode.getChildren().add(TK_4Leaf);
            	 	}
            	    // Create a CST Node
            		if(list_filterUnitGen != null) {
            	        for(Iterator it = list_filterUnitGen.iterator(); it.hasNext(); )  { 
            	            Gra2MoLParser.filterUnit_return r = (Gra2MoLParser.filterUnit_return) it.next(); 
            	            if(r != null && r.returnNode != null) {
            	            	r.returnNode.setKind("filterUnit");
            	            	queryReturnNode.getChildren().add(r.returnNode);
            	            } 
            	        }
            	    }
            	    // Create a Token CST Leaf	
            	    if(TK_5 != null) {
            			Leaf TK_5Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_5!=null?TK_5.getText():null), TK_5.getCharPositionInLine(), TK_5.getLine());
            	 		queryReturnNode.getChildren().add(TK_5Leaf);
            	 	}
            		// Returns the Node with CST Leaves/Nodes
            		retval.returnNode = queryReturnNode;
            	

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
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "queryControl"
    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:739:1: queryControl returns [Node returnNode] : (TK_0= 'for' TK_1= 'each' IDGen= ID TK_2= 'in' IDGen_1= ID | TK_0= 'greater' (IDGen= ID (TK_1= '[' NUMBERGen= NUMBER TK_2= ']' )? DOTGen= DOT )? IDGen_1= ID );
    public final Gra2MoLParser.queryControl_return queryControl() throws RecognitionException {
        Gra2MoLParser.queryControl_return retval = new Gra2MoLParser.queryControl_return();
        retval.start = input.LT(1);

        Token TK_0=null;
        Token TK_1=null;
        Token IDGen=null;
        Token TK_2=null;
        Token IDGen_1=null;
        Token NUMBERGen=null;
        Token DOTGen=null;

        try {
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:740:1: (TK_0= 'for' TK_1= 'each' IDGen= ID TK_2= 'in' IDGen_1= ID | TK_0= 'greater' (IDGen= ID (TK_1= '[' NUMBERGen= NUMBER TK_2= ']' )? DOTGen= DOT )? IDGen_1= ID )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==52) ) {
                alt26=1;
            }
            else if ( (LA26_0==55) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:740:4: TK_0= 'for' TK_1= 'each' IDGen= ID TK_2= 'in' IDGen_1= ID
                    {
                    TK_0=(Token)match(input,52,FOLLOW_52_in_queryControl773); 
                    TK_1=(Token)match(input,53,FOLLOW_53_in_queryControl778); 
                    IDGen=(Token)match(input,ID,FOLLOW_ID_in_queryControl783); 
                    TK_2=(Token)match(input,54,FOLLOW_54_in_queryControl788); 
                    IDGen_1=(Token)match(input,ID,FOLLOW_ID_in_queryControl793); 

                    		// Create return CST Node
                    		Node queryControlReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                    		queryControlReturnNode.setKind("queryControl");
                    	    // Create a Token CST Leaf	
                    	    if(TK_0 != null) {
                    			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_0!=null?TK_0.getText():null), TK_0.getCharPositionInLine(), TK_0.getLine());
                    	 		queryControlReturnNode.getChildren().add(TK_0Leaf);
                    	 	}
                    	    // Create a Token CST Leaf	
                    	    if(TK_1 != null) {
                    			Leaf TK_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_1!=null?TK_1.getText():null), TK_1.getCharPositionInLine(), TK_1.getLine());
                    	 		queryControlReturnNode.getChildren().add(TK_1Leaf);
                    	 	}
                    	    // Create a CST Leaf
                    		if(IDGen != null) {
                    			Leaf IDGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf("ID", (IDGen!=null?IDGen.getText():null), IDGen.getCharPositionInLine(), IDGen.getLine());
                    			queryControlReturnNode.getChildren().add(IDGenLeaf);
                    		}
                    	    // Create a Token CST Leaf	
                    	    if(TK_2 != null) {
                    			Leaf TK_2Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_2!=null?TK_2.getText():null), TK_2.getCharPositionInLine(), TK_2.getLine());
                    	 		queryControlReturnNode.getChildren().add(TK_2Leaf);
                    	 	}
                    	    // Create a CST Leaf
                    		if(IDGen_1 != null) {
                    			Leaf IDGen_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("ID", (IDGen_1!=null?IDGen_1.getText():null), IDGen_1.getCharPositionInLine(), IDGen_1.getLine());
                    			queryControlReturnNode.getChildren().add(IDGen_1Leaf);
                    		}
                    		// Returns the Node with CST Leaves/Nodes
                    		retval.returnNode = queryControlReturnNode;
                    	

                    }
                    break;
                case 2 :
                    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:773:5: TK_0= 'greater' (IDGen= ID (TK_1= '[' NUMBERGen= NUMBER TK_2= ']' )? DOTGen= DOT )? IDGen_1= ID
                    {
                    TK_0=(Token)match(input,55,FOLLOW_55_in_queryControl805); 
                    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:773:20: (IDGen= ID (TK_1= '[' NUMBERGen= NUMBER TK_2= ']' )? DOTGen= DOT )?
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==ID) ) {
                        int LA25_1 = input.LA(2);

                        if ( (LA25_1==DOT||LA25_1==44) ) {
                            alt25=1;
                        }
                    }
                    switch (alt25) {
                        case 1 :
                            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:773:22: IDGen= ID (TK_1= '[' NUMBERGen= NUMBER TK_2= ']' )? DOTGen= DOT
                            {
                            IDGen=(Token)match(input,ID,FOLLOW_ID_in_queryControl811); 
                            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:773:31: (TK_1= '[' NUMBERGen= NUMBER TK_2= ']' )?
                            int alt24=2;
                            int LA24_0 = input.LA(1);

                            if ( (LA24_0==44) ) {
                                alt24=1;
                            }
                            switch (alt24) {
                                case 1 :
                                    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:773:33: TK_1= '[' NUMBERGen= NUMBER TK_2= ']'
                                    {
                                    TK_1=(Token)match(input,44,FOLLOW_44_in_queryControl817); 
                                    NUMBERGen=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_queryControl822); 
                                    TK_2=(Token)match(input,46,FOLLOW_46_in_queryControl827); 

                                    }
                                    break;

                            }

                            DOTGen=(Token)match(input,DOT,FOLLOW_DOT_in_queryControl834); 

                            }
                            break;

                    }

                    IDGen_1=(Token)match(input,ID,FOLLOW_ID_in_queryControl841); 

                    		// Create return CST Node
                    		Node queryControlReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                    		queryControlReturnNode.setKind("queryControl");
                    	    // Create a Token CST Leaf	
                    	    if(TK_0 != null) {
                    			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_0!=null?TK_0.getText():null), TK_0.getCharPositionInLine(), TK_0.getLine());
                    	 		queryControlReturnNode.getChildren().add(TK_0Leaf);
                    	 	}
                    	    // Create a CST Leaf
                    		if(IDGen != null) {
                    			Leaf IDGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf("ID", (IDGen!=null?IDGen.getText():null), IDGen.getCharPositionInLine(), IDGen.getLine());
                    			queryControlReturnNode.getChildren().add(IDGenLeaf);
                    		}
                    	    // Create a Token CST Leaf	
                    	    if(TK_1 != null) {
                    			Leaf TK_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_1!=null?TK_1.getText():null), TK_1.getCharPositionInLine(), TK_1.getLine());
                    	 		queryControlReturnNode.getChildren().add(TK_1Leaf);
                    	 	}
                    	    // Create a CST Leaf
                    		if(NUMBERGen != null) {
                    			Leaf NUMBERGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf("NUMBER", (NUMBERGen!=null?NUMBERGen.getText():null), NUMBERGen.getCharPositionInLine(), NUMBERGen.getLine());
                    			queryControlReturnNode.getChildren().add(NUMBERGenLeaf);
                    		}
                    	    // Create a Token CST Leaf	
                    	    if(TK_2 != null) {
                    			Leaf TK_2Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_2!=null?TK_2.getText():null), TK_2.getCharPositionInLine(), TK_2.getLine());
                    	 		queryControlReturnNode.getChildren().add(TK_2Leaf);
                    	 	}
                    	    // Create a CST Leaf
                    		if(DOTGen != null) {
                    			Leaf DOTGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf("DOT", (DOTGen!=null?DOTGen.getText():null), DOTGen.getCharPositionInLine(), DOTGen.getLine());
                    			queryControlReturnNode.getChildren().add(DOTGenLeaf);
                    		}
                    	    // Create a CST Leaf
                    		if(IDGen_1 != null) {
                    			Leaf IDGen_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("ID", (IDGen_1!=null?IDGen_1.getText():null), IDGen_1.getCharPositionInLine(), IDGen_1.getLine());
                    			queryControlReturnNode.getChildren().add(IDGen_1Leaf);
                    		}
                    		// Returns the Node with CST Leaves/Nodes
                    		retval.returnNode = queryControlReturnNode;
                    	

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
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "filterUnit"
    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:818:1: filterUnit returns [Node returnNode] : filterUnitElementGen+= filterUnitElement (TK_0= '{' filterExpressionGen+= filterExpression TK_1= '}' )? (filterUnitGen+= filterUnit )? ;
    public final Gra2MoLParser.filterUnit_return filterUnit() throws RecognitionException {
        Gra2MoLParser.filterUnit_return retval = new Gra2MoLParser.filterUnit_return();
        retval.start = input.LT(1);

        Token TK_0=null;
        Token TK_1=null;
        List list_filterUnitElementGen=null;
        List list_filterExpressionGen=null;
        List list_filterUnitGen=null;
        RuleReturnScope filterUnitElementGen = null;
        RuleReturnScope filterExpressionGen = null;
        RuleReturnScope filterUnitGen = null;
        try {
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:819:1: (filterUnitElementGen+= filterUnitElement (TK_0= '{' filterExpressionGen+= filterExpression TK_1= '}' )? (filterUnitGen+= filterUnit )? )
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:819:4: filterUnitElementGen+= filterUnitElement (TK_0= '{' filterExpressionGen+= filterExpression TK_1= '}' )? (filterUnitGen+= filterUnit )?
            {
            pushFollow(FOLLOW_filterUnitElement_in_filterUnit865);
            filterUnitElementGen=filterUnitElement();

            state._fsp--;

            if (list_filterUnitElementGen==null) list_filterUnitElementGen=new ArrayList();
            list_filterUnitElementGen.add(filterUnitElementGen);

            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:819:44: (TK_0= '{' filterExpressionGen+= filterExpression TK_1= '}' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==47) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:819:46: TK_0= '{' filterExpressionGen+= filterExpression TK_1= '}'
                    {
                    TK_0=(Token)match(input,47,FOLLOW_47_in_filterUnit871); 
                    pushFollow(FOLLOW_filterExpression_in_filterUnit876);
                    filterExpressionGen=filterExpression();

                    state._fsp--;

                    if (list_filterExpressionGen==null) list_filterExpressionGen=new ArrayList();
                    list_filterExpressionGen.add(filterExpressionGen);

                    TK_1=(Token)match(input,48,FOLLOW_48_in_filterUnit881); 

                    }
                    break;

            }

            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:819:106: (filterUnitGen+= filterUnit )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( ((LA28_0>=TRIPLEBAR && LA28_0<=BAR)) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:819:108: filterUnitGen+= filterUnit
                    {
                    pushFollow(FOLLOW_filterUnit_in_filterUnit889);
                    filterUnitGen=filterUnit();

                    state._fsp--;

                    if (list_filterUnitGen==null) list_filterUnitGen=new ArrayList();
                    list_filterUnitGen.add(filterUnitGen);


                    }
                    break;

            }


            		// Create return CST Node
            		Node filterUnitReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
            		filterUnitReturnNode.setKind("filterUnit");
            	    // Create a CST Node
            		if(list_filterUnitElementGen != null) {
            	        for(Iterator it = list_filterUnitElementGen.iterator(); it.hasNext(); )  { 
            	            Gra2MoLParser.filterUnitElement_return r = (Gra2MoLParser.filterUnitElement_return) it.next(); 
            	            if(r != null && r.returnNode != null) {
            	            	r.returnNode.setKind("filterUnitElement");
            	            	filterUnitReturnNode.getChildren().add(r.returnNode);
            	            } 
            	        }
            	    }
            	    // Create a Token CST Leaf	
            	    if(TK_0 != null) {
            			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_0!=null?TK_0.getText():null), TK_0.getCharPositionInLine(), TK_0.getLine());
            	 		filterUnitReturnNode.getChildren().add(TK_0Leaf);
            	 	}
            	    // Create a CST Node
            		if(list_filterExpressionGen != null) {
            	        for(Iterator it = list_filterExpressionGen.iterator(); it.hasNext(); )  { 
            	            Gra2MoLParser.filterExpression_return r = (Gra2MoLParser.filterExpression_return) it.next(); 
            	            if(r != null && r.returnNode != null) {
            	            	r.returnNode.setKind("filterExpression");
            	            	filterUnitReturnNode.getChildren().add(r.returnNode);
            	            } 
            	        }
            	    }
            	    // Create a Token CST Leaf	
            	    if(TK_1 != null) {
            			Leaf TK_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_1!=null?TK_1.getText():null), TK_1.getCharPositionInLine(), TK_1.getLine());
            	 		filterUnitReturnNode.getChildren().add(TK_1Leaf);
            	 	}
            	    // Create a CST Node
            		if(list_filterUnitGen != null) {
            	        for(Iterator it = list_filterUnitGen.iterator(); it.hasNext(); )  { 
            	            Gra2MoLParser.filterUnit_return r = (Gra2MoLParser.filterUnit_return) it.next(); 
            	            if(r != null && r.returnNode != null) {
            	            	r.returnNode.setKind("filterUnit");
            	            	filterUnitReturnNode.getChildren().add(r.returnNode);
            	            } 
            	        }
            	    }
            		// Returns the Node with CST Leaves/Nodes
            		retval.returnNode = filterUnitReturnNode;
            	

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
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "filterUnitElement"
    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:869:1: filterUnitElement returns [Node returnNode] : (TRIPLEBARGen= TRIPLEBAR filterElementGen+= filterElement (filterOperationGen+= filterOperation )? | DOUBLEBARGen= DOUBLEBAR filterElementGen+= filterElement (filterOperationGen+= filterOperation )? | BARGen= BAR filterElementGen+= filterElement (filterOperationGen+= filterOperation )? );
    public final Gra2MoLParser.filterUnitElement_return filterUnitElement() throws RecognitionException {
        Gra2MoLParser.filterUnitElement_return retval = new Gra2MoLParser.filterUnitElement_return();
        retval.start = input.LT(1);

        Token TRIPLEBARGen=null;
        Token DOUBLEBARGen=null;
        Token BARGen=null;
        List list_filterElementGen=null;
        List list_filterOperationGen=null;
        RuleReturnScope filterElementGen = null;
        RuleReturnScope filterOperationGen = null;
        try {
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:870:1: (TRIPLEBARGen= TRIPLEBAR filterElementGen+= filterElement (filterOperationGen+= filterOperation )? | DOUBLEBARGen= DOUBLEBAR filterElementGen+= filterElement (filterOperationGen+= filterOperation )? | BARGen= BAR filterElementGen+= filterElement (filterOperationGen+= filterOperation )? )
            int alt32=3;
            switch ( input.LA(1) ) {
            case TRIPLEBAR:
                {
                alt32=1;
                }
                break;
            case DOUBLEBAR:
                {
                alt32=2;
                }
                break;
            case BAR:
                {
                alt32=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }

            switch (alt32) {
                case 1 :
                    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:870:5: TRIPLEBARGen= TRIPLEBAR filterElementGen+= filterElement (filterOperationGen+= filterOperation )?
                    {
                    TRIPLEBARGen=(Token)match(input,TRIPLEBAR,FOLLOW_TRIPLEBAR_in_filterUnitElement914); 
                    pushFollow(FOLLOW_filterElement_in_filterUnitElement919);
                    filterElementGen=filterElement();

                    state._fsp--;

                    if (list_filterElementGen==null) list_filterElementGen=new ArrayList();
                    list_filterElementGen.add(filterElementGen);

                    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:870:61: (filterOperationGen+= filterOperation )?
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0==DOT||LA29_0==44) ) {
                        alt29=1;
                    }
                    switch (alt29) {
                        case 1 :
                            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:870:63: filterOperationGen+= filterOperation
                            {
                            pushFollow(FOLLOW_filterOperation_in_filterUnitElement925);
                            filterOperationGen=filterOperation();

                            state._fsp--;

                            if (list_filterOperationGen==null) list_filterOperationGen=new ArrayList();
                            list_filterOperationGen.add(filterOperationGen);


                            }
                            break;

                    }


                    		// Create return CST Node
                    		Node filterUnitElementReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                    		filterUnitElementReturnNode.setKind("filterUnitElement");
                    	    // Create a CST Leaf
                    		if(TRIPLEBARGen != null) {
                    			Leaf TRIPLEBARGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf("TRIPLEBAR", (TRIPLEBARGen!=null?TRIPLEBARGen.getText():null), TRIPLEBARGen.getCharPositionInLine(), TRIPLEBARGen.getLine());
                    			filterUnitElementReturnNode.getChildren().add(TRIPLEBARGenLeaf);
                    		}
                    	    // Create a CST Node
                    		if(list_filterElementGen != null) {
                    	        for(Iterator it = list_filterElementGen.iterator(); it.hasNext(); )  { 
                    	            Gra2MoLParser.filterElement_return r = (Gra2MoLParser.filterElement_return) it.next(); 
                    	            if(r != null && r.returnNode != null) {
                    	            	r.returnNode.setKind("filterElement");
                    	            	filterUnitElementReturnNode.getChildren().add(r.returnNode);
                    	            } 
                    	        }
                    	    }
                    	    // Create a CST Node
                    		if(list_filterOperationGen != null) {
                    	        for(Iterator it = list_filterOperationGen.iterator(); it.hasNext(); )  { 
                    	            Gra2MoLParser.filterOperation_return r = (Gra2MoLParser.filterOperation_return) it.next(); 
                    	            if(r != null && r.returnNode != null) {
                    	            	r.returnNode.setKind("filterOperation");
                    	            	filterUnitElementReturnNode.getChildren().add(r.returnNode);
                    	            } 
                    	        }
                    	    }
                    		// Returns the Node with CST Leaves/Nodes
                    		retval.returnNode = filterUnitElementReturnNode;
                    	

                    }
                    break;
                case 2 :
                    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:903:5: DOUBLEBARGen= DOUBLEBAR filterElementGen+= filterElement (filterOperationGen+= filterOperation )?
                    {
                    DOUBLEBARGen=(Token)match(input,DOUBLEBAR,FOLLOW_DOUBLEBAR_in_filterUnitElement939); 
                    pushFollow(FOLLOW_filterElement_in_filterUnitElement944);
                    filterElementGen=filterElement();

                    state._fsp--;

                    if (list_filterElementGen==null) list_filterElementGen=new ArrayList();
                    list_filterElementGen.add(filterElementGen);

                    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:903:61: (filterOperationGen+= filterOperation )?
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0==DOT||LA30_0==44) ) {
                        alt30=1;
                    }
                    switch (alt30) {
                        case 1 :
                            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:903:63: filterOperationGen+= filterOperation
                            {
                            pushFollow(FOLLOW_filterOperation_in_filterUnitElement950);
                            filterOperationGen=filterOperation();

                            state._fsp--;

                            if (list_filterOperationGen==null) list_filterOperationGen=new ArrayList();
                            list_filterOperationGen.add(filterOperationGen);


                            }
                            break;

                    }


                    		// Create return CST Node
                    		Node filterUnitElementReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                    		filterUnitElementReturnNode.setKind("filterUnitElement");
                    	    // Create a CST Leaf
                    		if(DOUBLEBARGen != null) {
                    			Leaf DOUBLEBARGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf("DOUBLEBAR", (DOUBLEBARGen!=null?DOUBLEBARGen.getText():null), DOUBLEBARGen.getCharPositionInLine(), DOUBLEBARGen.getLine());
                    			filterUnitElementReturnNode.getChildren().add(DOUBLEBARGenLeaf);
                    		}
                    	    // Create a CST Node
                    		if(list_filterElementGen != null) {
                    	        for(Iterator it = list_filterElementGen.iterator(); it.hasNext(); )  { 
                    	            Gra2MoLParser.filterElement_return r = (Gra2MoLParser.filterElement_return) it.next(); 
                    	            if(r != null && r.returnNode != null) {
                    	            	r.returnNode.setKind("filterElement");
                    	            	filterUnitElementReturnNode.getChildren().add(r.returnNode);
                    	            } 
                    	        }
                    	    }
                    	    // Create a CST Node
                    		if(list_filterOperationGen != null) {
                    	        for(Iterator it = list_filterOperationGen.iterator(); it.hasNext(); )  { 
                    	            Gra2MoLParser.filterOperation_return r = (Gra2MoLParser.filterOperation_return) it.next(); 
                    	            if(r != null && r.returnNode != null) {
                    	            	r.returnNode.setKind("filterOperation");
                    	            	filterUnitElementReturnNode.getChildren().add(r.returnNode);
                    	            } 
                    	        }
                    	    }
                    		// Returns the Node with CST Leaves/Nodes
                    		retval.returnNode = filterUnitElementReturnNode;
                    	

                    }
                    break;
                case 3 :
                    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:936:5: BARGen= BAR filterElementGen+= filterElement (filterOperationGen+= filterOperation )?
                    {
                    BARGen=(Token)match(input,BAR,FOLLOW_BAR_in_filterUnitElement964); 
                    pushFollow(FOLLOW_filterElement_in_filterUnitElement969);
                    filterElementGen=filterElement();

                    state._fsp--;

                    if (list_filterElementGen==null) list_filterElementGen=new ArrayList();
                    list_filterElementGen.add(filterElementGen);

                    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:936:49: (filterOperationGen+= filterOperation )?
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( (LA31_0==DOT||LA31_0==44) ) {
                        alt31=1;
                    }
                    switch (alt31) {
                        case 1 :
                            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:936:51: filterOperationGen+= filterOperation
                            {
                            pushFollow(FOLLOW_filterOperation_in_filterUnitElement975);
                            filterOperationGen=filterOperation();

                            state._fsp--;

                            if (list_filterOperationGen==null) list_filterOperationGen=new ArrayList();
                            list_filterOperationGen.add(filterOperationGen);


                            }
                            break;

                    }


                    		// Create return CST Node
                    		Node filterUnitElementReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                    		filterUnitElementReturnNode.setKind("filterUnitElement");
                    	    // Create a CST Leaf
                    		if(BARGen != null) {
                    			Leaf BARGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf("BAR", (BARGen!=null?BARGen.getText():null), BARGen.getCharPositionInLine(), BARGen.getLine());
                    			filterUnitElementReturnNode.getChildren().add(BARGenLeaf);
                    		}
                    	    // Create a CST Node
                    		if(list_filterElementGen != null) {
                    	        for(Iterator it = list_filterElementGen.iterator(); it.hasNext(); )  { 
                    	            Gra2MoLParser.filterElement_return r = (Gra2MoLParser.filterElement_return) it.next(); 
                    	            if(r != null && r.returnNode != null) {
                    	            	r.returnNode.setKind("filterElement");
                    	            	filterUnitElementReturnNode.getChildren().add(r.returnNode);
                    	            } 
                    	        }
                    	    }
                    	    // Create a CST Node
                    		if(list_filterOperationGen != null) {
                    	        for(Iterator it = list_filterOperationGen.iterator(); it.hasNext(); )  { 
                    	            Gra2MoLParser.filterOperation_return r = (Gra2MoLParser.filterOperation_return) it.next(); 
                    	            if(r != null && r.returnNode != null) {
                    	            	r.returnNode.setKind("filterOperation");
                    	            	filterUnitElementReturnNode.getChildren().add(r.returnNode);
                    	            } 
                    	        }
                    	    }
                    		// Returns the Node with CST Leaves/Nodes
                    		retval.returnNode = filterUnitElementReturnNode;
                    	

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
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "filterOperation"
    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:971:1: filterOperation returns [Node returnNode] : (TK_0= '[' TK_1= 'first' TK_2= ']' | TK_0= '[' NUMBERGen= NUMBER TK_1= ']' | TK_0= '[' TK_1= 'last' TK_2= ']' | DOTGen= DOT | TK_0= '[' TK_1= 'unique' TK_2= ']' );
    public final Gra2MoLParser.filterOperation_return filterOperation() throws RecognitionException {
        Gra2MoLParser.filterOperation_return retval = new Gra2MoLParser.filterOperation_return();
        retval.start = input.LT(1);

        Token TK_0=null;
        Token TK_1=null;
        Token TK_2=null;
        Token NUMBERGen=null;
        Token DOTGen=null;

        try {
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:972:1: (TK_0= '[' TK_1= 'first' TK_2= ']' | TK_0= '[' NUMBERGen= NUMBER TK_1= ']' | TK_0= '[' TK_1= 'last' TK_2= ']' | DOTGen= DOT | TK_0= '[' TK_1= 'unique' TK_2= ']' )
            int alt33=5;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==44) ) {
                switch ( input.LA(2) ) {
                case 56:
                    {
                    alt33=1;
                    }
                    break;
                case NUMBER:
                    {
                    alt33=2;
                    }
                    break;
                case 57:
                    {
                    alt33=3;
                    }
                    break;
                case 45:
                    {
                    alt33=5;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 33, 1, input);

                    throw nvae;
                }

            }
            else if ( (LA33_0==DOT) ) {
                alt33=4;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:972:4: TK_0= '[' TK_1= 'first' TK_2= ']'
                    {
                    TK_0=(Token)match(input,44,FOLLOW_44_in_filterOperation1000); 
                    TK_1=(Token)match(input,56,FOLLOW_56_in_filterOperation1005); 
                    TK_2=(Token)match(input,46,FOLLOW_46_in_filterOperation1010); 

                    		// Create return CST Node
                    		Node filterOperationReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                    		filterOperationReturnNode.setKind("filterOperation");
                    	    // Create a Token CST Leaf	
                    	    if(TK_0 != null) {
                    			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_0!=null?TK_0.getText():null), TK_0.getCharPositionInLine(), TK_0.getLine());
                    	 		filterOperationReturnNode.getChildren().add(TK_0Leaf);
                    	 	}
                    	    // Create a Token CST Leaf	
                    	    if(TK_1 != null) {
                    			Leaf TK_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_1!=null?TK_1.getText():null), TK_1.getCharPositionInLine(), TK_1.getLine());
                    	 		filterOperationReturnNode.getChildren().add(TK_1Leaf);
                    	 	}
                    	    // Create a Token CST Leaf	
                    	    if(TK_2 != null) {
                    			Leaf TK_2Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_2!=null?TK_2.getText():null), TK_2.getCharPositionInLine(), TK_2.getLine());
                    	 		filterOperationReturnNode.getChildren().add(TK_2Leaf);
                    	 	}
                    		// Returns the Node with CST Leaves/Nodes
                    		retval.returnNode = filterOperationReturnNode;
                    	

                    }
                    break;
                case 2 :
                    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:995:5: TK_0= '[' NUMBERGen= NUMBER TK_1= ']'
                    {
                    TK_0=(Token)match(input,44,FOLLOW_44_in_filterOperation1023); 
                    NUMBERGen=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_filterOperation1028); 
                    TK_1=(Token)match(input,46,FOLLOW_46_in_filterOperation1033); 

                    		// Create return CST Node
                    		Node filterOperationReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                    		filterOperationReturnNode.setKind("filterOperation");
                    	    // Create a Token CST Leaf	
                    	    if(TK_0 != null) {
                    			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_0!=null?TK_0.getText():null), TK_0.getCharPositionInLine(), TK_0.getLine());
                    	 		filterOperationReturnNode.getChildren().add(TK_0Leaf);
                    	 	}
                    	    // Create a CST Leaf
                    		if(NUMBERGen != null) {
                    			Leaf NUMBERGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf("NUMBER", (NUMBERGen!=null?NUMBERGen.getText():null), NUMBERGen.getCharPositionInLine(), NUMBERGen.getLine());
                    			filterOperationReturnNode.getChildren().add(NUMBERGenLeaf);
                    		}
                    	    // Create a Token CST Leaf	
                    	    if(TK_1 != null) {
                    			Leaf TK_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_1!=null?TK_1.getText():null), TK_1.getCharPositionInLine(), TK_1.getLine());
                    	 		filterOperationReturnNode.getChildren().add(TK_1Leaf);
                    	 	}
                    		// Returns the Node with CST Leaves/Nodes
                    		retval.returnNode = filterOperationReturnNode;
                    	

                    }
                    break;
                case 3 :
                    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:1018:5: TK_0= '[' TK_1= 'last' TK_2= ']'
                    {
                    TK_0=(Token)match(input,44,FOLLOW_44_in_filterOperation1045); 
                    TK_1=(Token)match(input,57,FOLLOW_57_in_filterOperation1050); 
                    TK_2=(Token)match(input,46,FOLLOW_46_in_filterOperation1055); 

                    		// Create return CST Node
                    		Node filterOperationReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                    		filterOperationReturnNode.setKind("filterOperation");
                    	    // Create a Token CST Leaf	
                    	    if(TK_0 != null) {
                    			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_0!=null?TK_0.getText():null), TK_0.getCharPositionInLine(), TK_0.getLine());
                    	 		filterOperationReturnNode.getChildren().add(TK_0Leaf);
                    	 	}
                    	    // Create a Token CST Leaf	
                    	    if(TK_1 != null) {
                    			Leaf TK_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_1!=null?TK_1.getText():null), TK_1.getCharPositionInLine(), TK_1.getLine());
                    	 		filterOperationReturnNode.getChildren().add(TK_1Leaf);
                    	 	}
                    	    // Create a Token CST Leaf	
                    	    if(TK_2 != null) {
                    			Leaf TK_2Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_2!=null?TK_2.getText():null), TK_2.getCharPositionInLine(), TK_2.getLine());
                    	 		filterOperationReturnNode.getChildren().add(TK_2Leaf);
                    	 	}
                    		// Returns the Node with CST Leaves/Nodes
                    		retval.returnNode = filterOperationReturnNode;
                    	

                    }
                    break;
                case 4 :
                    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:1041:5: DOTGen= DOT
                    {
                    DOTGen=(Token)match(input,DOT,FOLLOW_DOT_in_filterOperation1067); 

                    		// Create return CST Node
                    		Node filterOperationReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                    		filterOperationReturnNode.setKind("filterOperation");
                    	    // Create a CST Leaf
                    		if(DOTGen != null) {
                    			Leaf DOTGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf("DOT", (DOTGen!=null?DOTGen.getText():null), DOTGen.getCharPositionInLine(), DOTGen.getLine());
                    			filterOperationReturnNode.getChildren().add(DOTGenLeaf);
                    		}
                    		// Returns the Node with CST Leaves/Nodes
                    		retval.returnNode = filterOperationReturnNode;
                    	

                    }
                    break;
                case 5 :
                    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:1054:5: TK_0= '[' TK_1= 'unique' TK_2= ']'
                    {
                    TK_0=(Token)match(input,44,FOLLOW_44_in_filterOperation1079); 
                    TK_1=(Token)match(input,45,FOLLOW_45_in_filterOperation1084); 
                    TK_2=(Token)match(input,46,FOLLOW_46_in_filterOperation1089); 

                    		// Create return CST Node
                    		Node filterOperationReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                    		filterOperationReturnNode.setKind("filterOperation");
                    	    // Create a Token CST Leaf	
                    	    if(TK_0 != null) {
                    			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_0!=null?TK_0.getText():null), TK_0.getCharPositionInLine(), TK_0.getLine());
                    	 		filterOperationReturnNode.getChildren().add(TK_0Leaf);
                    	 	}
                    	    // Create a Token CST Leaf	
                    	    if(TK_1 != null) {
                    			Leaf TK_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_1!=null?TK_1.getText():null), TK_1.getCharPositionInLine(), TK_1.getLine());
                    	 		filterOperationReturnNode.getChildren().add(TK_1Leaf);
                    	 	}
                    	    // Create a Token CST Leaf	
                    	    if(TK_2 != null) {
                    			Leaf TK_2Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_2!=null?TK_2.getText():null), TK_2.getCharPositionInLine(), TK_2.getLine());
                    	 		filterOperationReturnNode.getChildren().add(TK_2Leaf);
                    	 	}
                    		// Returns the Node with CST Leaves/Nodes
                    		retval.returnNode = filterOperationReturnNode;
                    	

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
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "filterExpression"
    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:1079:1: filterExpression returns [Node returnNode] : filterExpressionAltGen+= filterExpressionAlt (ANDGen_List+= AND filterExpressionAltGen_1+= filterExpressionAlt )* ;
    public final Gra2MoLParser.filterExpression_return filterExpression() throws RecognitionException {
        Gra2MoLParser.filterExpression_return retval = new Gra2MoLParser.filterExpression_return();
        retval.start = input.LT(1);

        Token ANDGen_List=null;
        List list_ANDGen_List=null;
        List list_filterExpressionAltGen=null;
        List list_filterExpressionAltGen_1=null;
        RuleReturnScope filterExpressionAltGen = null;
        RuleReturnScope filterExpressionAltGen_1 = null;
        try {
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:1080:1: (filterExpressionAltGen+= filterExpressionAlt (ANDGen_List+= AND filterExpressionAltGen_1+= filterExpressionAlt )* )
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:1080:4: filterExpressionAltGen+= filterExpressionAlt (ANDGen_List+= AND filterExpressionAltGen_1+= filterExpressionAlt )*
            {
            pushFollow(FOLLOW_filterExpressionAlt_in_filterExpression1111);
            filterExpressionAltGen=filterExpressionAlt();

            state._fsp--;

            if (list_filterExpressionAltGen==null) list_filterExpressionAltGen=new ArrayList();
            list_filterExpressionAltGen.add(filterExpressionAltGen);

            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:1080:48: (ANDGen_List+= AND filterExpressionAltGen_1+= filterExpressionAlt )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==AND) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:1080:50: ANDGen_List+= AND filterExpressionAltGen_1+= filterExpressionAlt
            	    {
            	    ANDGen_List=(Token)match(input,AND,FOLLOW_AND_in_filterExpression1117); 
            	    if (list_ANDGen_List==null) list_ANDGen_List=new ArrayList();
            	    list_ANDGen_List.add(ANDGen_List);

            	    pushFollow(FOLLOW_filterExpressionAlt_in_filterExpression1122);
            	    filterExpressionAltGen_1=filterExpressionAlt();

            	    state._fsp--;

            	    if (list_filterExpressionAltGen_1==null) list_filterExpressionAltGen_1=new ArrayList();
            	    list_filterExpressionAltGen_1.add(filterExpressionAltGen_1);


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);


            		// Create return CST Node
            		Node filterExpressionReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
            		filterExpressionReturnNode.setKind("filterExpression");
            	    // Create a CST Node
            		if(list_filterExpressionAltGen != null) {
            	        for(Iterator it = list_filterExpressionAltGen.iterator(); it.hasNext(); )  { 
            	            Gra2MoLParser.filterExpressionAlt_return r = (Gra2MoLParser.filterExpressionAlt_return) it.next(); 
            	            if(r != null && r.returnNode != null) {
            	            	r.returnNode.setKind("filterExpressionAlt");
            	            	filterExpressionReturnNode.getChildren().add(r.returnNode);
            	            } 
            	        }
            	    }

            		// Create a special CST Node for terminal ANDGen_List aggregation
            		if(list_ANDGen_List != null) {
            	    for(int pos = 0; pos < list_ANDGen_List.size(); pos++ )  { 
            		// Terminal extractor
            	    if(list_ANDGen_List != null) {
            		    Token t = (Token) list_ANDGen_List.get(pos); 
            		    Leaf ANDGen_ListLeaf = CSTFactoryImpl.eINSTANCE.createLeaf("AND", t.getText(), t.getCharPositionInLine(), t.getLine());
            			filterExpressionReturnNode.getChildren().add(ANDGen_ListLeaf);
            		}
            		// No Terminal extractor
            	    if(list_filterExpressionAltGen_1 != null) {		
            	    	Gra2MoLParser.filterExpressionAlt_return r = (Gra2MoLParser.filterExpressionAlt_return) list_filterExpressionAltGen_1.get(pos); 
            	    	if(r != null && r.returnNode != null) {
            	        	r.returnNode.setKind("filterExpressionAlt");
            	    		filterExpressionReturnNode.getChildren().add(r.returnNode);
            	    	} 
            		}
            		}
            		}

            		// Returns the Node with CST Leaves/Nodes
            		retval.returnNode = filterExpressionReturnNode;
            	

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
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "filterExpressionAlt"
    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:1121:1: filterExpressionAlt returns [Node returnNode] : filterExpressionNotGen+= filterExpressionNot (ORGen_List+= OR filterExpressionNotGen_1+= filterExpressionNot )* ;
    public final Gra2MoLParser.filterExpressionAlt_return filterExpressionAlt() throws RecognitionException {
        Gra2MoLParser.filterExpressionAlt_return retval = new Gra2MoLParser.filterExpressionAlt_return();
        retval.start = input.LT(1);

        Token ORGen_List=null;
        List list_ORGen_List=null;
        List list_filterExpressionNotGen=null;
        List list_filterExpressionNotGen_1=null;
        RuleReturnScope filterExpressionNotGen = null;
        RuleReturnScope filterExpressionNotGen_1 = null;
        try {
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:1122:1: (filterExpressionNotGen+= filterExpressionNot (ORGen_List+= OR filterExpressionNotGen_1+= filterExpressionNot )* )
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:1122:4: filterExpressionNotGen+= filterExpressionNot (ORGen_List+= OR filterExpressionNotGen_1+= filterExpressionNot )*
            {
            pushFollow(FOLLOW_filterExpressionNot_in_filterExpressionAlt1147);
            filterExpressionNotGen=filterExpressionNot();

            state._fsp--;

            if (list_filterExpressionNotGen==null) list_filterExpressionNotGen=new ArrayList();
            list_filterExpressionNotGen.add(filterExpressionNotGen);

            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:1122:48: (ORGen_List+= OR filterExpressionNotGen_1+= filterExpressionNot )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==OR) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:1122:50: ORGen_List+= OR filterExpressionNotGen_1+= filterExpressionNot
            	    {
            	    ORGen_List=(Token)match(input,OR,FOLLOW_OR_in_filterExpressionAlt1153); 
            	    if (list_ORGen_List==null) list_ORGen_List=new ArrayList();
            	    list_ORGen_List.add(ORGen_List);

            	    pushFollow(FOLLOW_filterExpressionNot_in_filterExpressionAlt1158);
            	    filterExpressionNotGen_1=filterExpressionNot();

            	    state._fsp--;

            	    if (list_filterExpressionNotGen_1==null) list_filterExpressionNotGen_1=new ArrayList();
            	    list_filterExpressionNotGen_1.add(filterExpressionNotGen_1);


            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);


            		// Create return CST Node
            		Node filterExpressionAltReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
            		filterExpressionAltReturnNode.setKind("filterExpressionAlt");
            	    // Create a CST Node
            		if(list_filterExpressionNotGen != null) {
            	        for(Iterator it = list_filterExpressionNotGen.iterator(); it.hasNext(); )  { 
            	            Gra2MoLParser.filterExpressionNot_return r = (Gra2MoLParser.filterExpressionNot_return) it.next(); 
            	            if(r != null && r.returnNode != null) {
            	            	r.returnNode.setKind("filterExpressionNot");
            	            	filterExpressionAltReturnNode.getChildren().add(r.returnNode);
            	            } 
            	        }
            	    }

            		// Create a special CST Node for terminal ORGen_List aggregation
            		if(list_ORGen_List != null) {
            	    for(int pos = 0; pos < list_ORGen_List.size(); pos++ )  { 
            		// Terminal extractor
            	    if(list_ORGen_List != null) {
            		    Token t = (Token) list_ORGen_List.get(pos); 
            		    Leaf ORGen_ListLeaf = CSTFactoryImpl.eINSTANCE.createLeaf("OR", t.getText(), t.getCharPositionInLine(), t.getLine());
            			filterExpressionAltReturnNode.getChildren().add(ORGen_ListLeaf);
            		}
            		// No Terminal extractor
            	    if(list_filterExpressionNotGen_1 != null) {		
            	    	Gra2MoLParser.filterExpressionNot_return r = (Gra2MoLParser.filterExpressionNot_return) list_filterExpressionNotGen_1.get(pos); 
            	    	if(r != null && r.returnNode != null) {
            	        	r.returnNode.setKind("filterExpressionNot");
            	    		filterExpressionAltReturnNode.getChildren().add(r.returnNode);
            	    	} 
            		}
            		}
            		}

            		// Returns the Node with CST Leaves/Nodes
            		retval.returnNode = filterExpressionAltReturnNode;
            	

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

    public static class filterExpressionNot_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "filterExpressionNot"
    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:1163:1: filterExpressionNot returns [Node returnNode] : (NOTGen= NOT )? filterExpressionAtomGen+= filterExpressionAtom ;
    public final Gra2MoLParser.filterExpressionNot_return filterExpressionNot() throws RecognitionException {
        Gra2MoLParser.filterExpressionNot_return retval = new Gra2MoLParser.filterExpressionNot_return();
        retval.start = input.LT(1);

        Token NOTGen=null;
        List list_filterExpressionAtomGen=null;
        RuleReturnScope filterExpressionAtomGen = null;
        try {
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:1164:1: ( (NOTGen= NOT )? filterExpressionAtomGen+= filterExpressionAtom )
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:1164:3: (NOTGen= NOT )? filterExpressionAtomGen+= filterExpressionAtom
            {
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:1164:3: (NOTGen= NOT )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==NOT) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:1164:5: NOTGen= NOT
                    {
                    NOTGen=(Token)match(input,NOT,FOLLOW_NOT_in_filterExpressionNot1185); 

                    }
                    break;

            }

            pushFollow(FOLLOW_filterExpressionAtom_in_filterExpressionNot1192);
            filterExpressionAtomGen=filterExpressionAtom();

            state._fsp--;

            if (list_filterExpressionAtomGen==null) list_filterExpressionAtomGen=new ArrayList();
            list_filterExpressionAtomGen.add(filterExpressionAtomGen);


            		// Create return CST Node
            		Node filterExpressionNotReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
            		filterExpressionNotReturnNode.setKind("filterExpressionNot");
            	    // Create a CST Leaf
            		if(NOTGen != null) {
            			Leaf NOTGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf("NOT", (NOTGen!=null?NOTGen.getText():null), NOTGen.getCharPositionInLine(), NOTGen.getLine());
            			filterExpressionNotReturnNode.getChildren().add(NOTGenLeaf);
            		}
            	    // Create a CST Node
            		if(list_filterExpressionAtomGen != null) {
            	        for(Iterator it = list_filterExpressionAtomGen.iterator(); it.hasNext(); )  { 
            	            Gra2MoLParser.filterExpressionAtom_return r = (Gra2MoLParser.filterExpressionAtom_return) it.next(); 
            	            if(r != null && r.returnNode != null) {
            	            	r.returnNode.setKind("filterExpressionAtom");
            	            	filterExpressionNotReturnNode.getChildren().add(r.returnNode);
            	            } 
            	        }
            	    }
            		// Returns the Node with CST Leaves/Nodes
            		retval.returnNode = filterExpressionNotReturnNode;
            	

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
    // $ANTLR end "filterExpressionNot"

    public static class filterExpressionAtom_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "filterExpressionAtom"
    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:1189:1: filterExpressionAtom returns [Node returnNode] : ( (TK_0= 'all' )? expressionElementGen+= expressionElement DOTGen= DOT filterExpressionOperatorGen+= filterExpressionOperator (TK_1= '(' paramGen+= param (TK_2= ',' paramGen_1+= param )* TK_3= ')' )? | TK_0= '(' filterExpressionGen+= filterExpression TK_1= ')' );
    public final Gra2MoLParser.filterExpressionAtom_return filterExpressionAtom() throws RecognitionException {
        Gra2MoLParser.filterExpressionAtom_return retval = new Gra2MoLParser.filterExpressionAtom_return();
        retval.start = input.LT(1);

        Token TK_0=null;
        Token DOTGen=null;
        Token TK_1=null;
        Token TK_2=null;
        Token TK_3=null;
        List list_expressionElementGen=null;
        List list_filterExpressionOperatorGen=null;
        List list_paramGen=null;
        List list_paramGen_1=null;
        List list_filterExpressionGen=null;
        RuleReturnScope expressionElementGen = null;
        RuleReturnScope filterExpressionOperatorGen = null;
        RuleReturnScope paramGen = null;
        RuleReturnScope paramGen_1 = null;
        RuleReturnScope filterExpressionGen = null;
        try {
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:1190:1: ( (TK_0= 'all' )? expressionElementGen+= expressionElement DOTGen= DOT filterExpressionOperatorGen+= filterExpressionOperator (TK_1= '(' paramGen+= param (TK_2= ',' paramGen_1+= param )* TK_3= ')' )? | TK_0= '(' filterExpressionGen+= filterExpression TK_1= ')' )
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==ID||LA40_0==AT||LA40_0==58) ) {
                alt40=1;
            }
            else if ( (LA40_0==35) ) {
                alt40=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }
            switch (alt40) {
                case 1 :
                    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:1190:3: (TK_0= 'all' )? expressionElementGen+= expressionElement DOTGen= DOT filterExpressionOperatorGen+= filterExpressionOperator (TK_1= '(' paramGen+= param (TK_2= ',' paramGen_1+= param )* TK_3= ')' )?
                    {
                    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:1190:3: (TK_0= 'all' )?
                    int alt37=2;
                    int LA37_0 = input.LA(1);

                    if ( (LA37_0==58) ) {
                        alt37=1;
                    }
                    switch (alt37) {
                        case 1 :
                            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:1190:5: TK_0= 'all'
                            {
                            TK_0=(Token)match(input,58,FOLLOW_58_in_filterExpressionAtom1217); 

                            }
                            break;

                    }

                    pushFollow(FOLLOW_expressionElement_in_filterExpressionAtom1224);
                    expressionElementGen=expressionElement();

                    state._fsp--;

                    if (list_expressionElementGen==null) list_expressionElementGen=new ArrayList();
                    list_expressionElementGen.add(expressionElementGen);

                    DOTGen=(Token)match(input,DOT,FOLLOW_DOT_in_filterExpressionAtom1229); 
                    pushFollow(FOLLOW_filterExpressionOperator_in_filterExpressionAtom1234);
                    filterExpressionOperatorGen=filterExpressionOperator();

                    state._fsp--;

                    if (list_filterExpressionOperatorGen==null) list_filterExpressionOperatorGen=new ArrayList();
                    list_filterExpressionOperatorGen.add(filterExpressionOperatorGen);

                    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:1190:126: (TK_1= '(' paramGen+= param (TK_2= ',' paramGen_1+= param )* TK_3= ')' )?
                    int alt39=2;
                    int LA39_0 = input.LA(1);

                    if ( (LA39_0==35) ) {
                        alt39=1;
                    }
                    switch (alt39) {
                        case 1 :
                            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:1190:128: TK_1= '(' paramGen+= param (TK_2= ',' paramGen_1+= param )* TK_3= ')'
                            {
                            TK_1=(Token)match(input,35,FOLLOW_35_in_filterExpressionAtom1240); 
                            pushFollow(FOLLOW_param_in_filterExpressionAtom1245);
                            paramGen=param();

                            state._fsp--;

                            if (list_paramGen==null) list_paramGen=new ArrayList();
                            list_paramGen.add(paramGen);

                            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:1190:154: (TK_2= ',' paramGen_1+= param )*
                            loop38:
                            do {
                                int alt38=2;
                                int LA38_0 = input.LA(1);

                                if ( (LA38_0==30) ) {
                                    alt38=1;
                                }


                                switch (alt38) {
                            	case 1 :
                            	    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:1190:156: TK_2= ',' paramGen_1+= param
                            	    {
                            	    TK_2=(Token)match(input,30,FOLLOW_30_in_filterExpressionAtom1251); 
                            	    pushFollow(FOLLOW_param_in_filterExpressionAtom1256);
                            	    paramGen_1=param();

                            	    state._fsp--;

                            	    if (list_paramGen_1==null) list_paramGen_1=new ArrayList();
                            	    list_paramGen_1.add(paramGen_1);


                            	    }
                            	    break;

                            	default :
                            	    break loop38;
                                }
                            } while (true);

                            TK_3=(Token)match(input,36,FOLLOW_36_in_filterExpressionAtom1263); 

                            }
                            break;

                    }


                    		// Create return CST Node
                    		Node filterExpressionAtomReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                    		filterExpressionAtomReturnNode.setKind("filterExpressionAtom");
                    	    // Create a Token CST Leaf	
                    	    if(TK_0 != null) {
                    			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_0!=null?TK_0.getText():null), TK_0.getCharPositionInLine(), TK_0.getLine());
                    	 		filterExpressionAtomReturnNode.getChildren().add(TK_0Leaf);
                    	 	}
                    	    // Create a CST Node
                    		if(list_expressionElementGen != null) {
                    	        for(Iterator it = list_expressionElementGen.iterator(); it.hasNext(); )  { 
                    	            Gra2MoLParser.expressionElement_return r = (Gra2MoLParser.expressionElement_return) it.next(); 
                    	            if(r != null && r.returnNode != null) {
                    	            	r.returnNode.setKind("expressionElement");
                    	            	filterExpressionAtomReturnNode.getChildren().add(r.returnNode);
                    	            } 
                    	        }
                    	    }
                    	    // Create a CST Leaf
                    		if(DOTGen != null) {
                    			Leaf DOTGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf("DOT", (DOTGen!=null?DOTGen.getText():null), DOTGen.getCharPositionInLine(), DOTGen.getLine());
                    			filterExpressionAtomReturnNode.getChildren().add(DOTGenLeaf);
                    		}
                    	    // Create a CST Node
                    		if(list_filterExpressionOperatorGen != null) {
                    	        for(Iterator it = list_filterExpressionOperatorGen.iterator(); it.hasNext(); )  { 
                    	            Gra2MoLParser.filterExpressionOperator_return r = (Gra2MoLParser.filterExpressionOperator_return) it.next(); 
                    	            if(r != null && r.returnNode != null) {
                    	            	r.returnNode.setKind("filterExpressionOperator");
                    	            	filterExpressionAtomReturnNode.getChildren().add(r.returnNode);
                    	            } 
                    	        }
                    	    }
                    	    // Create a Token CST Leaf	
                    	    if(TK_1 != null) {
                    			Leaf TK_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_1!=null?TK_1.getText():null), TK_1.getCharPositionInLine(), TK_1.getLine());
                    	 		filterExpressionAtomReturnNode.getChildren().add(TK_1Leaf);
                    	 	}
                    	    // Create a CST Node
                    		if(list_paramGen != null) {
                    	        for(Iterator it = list_paramGen.iterator(); it.hasNext(); )  { 
                    	            Gra2MoLParser.param_return r = (Gra2MoLParser.param_return) it.next(); 
                    	            if(r != null && r.returnNode != null) {
                    	            	r.returnNode.setKind("param");
                    	            	filterExpressionAtomReturnNode.getChildren().add(r.returnNode);
                    	            } 
                    	        }
                    	    }

                    		// Create a special CST Node for terminal paramGen_1 aggregation
                    		if(list_paramGen_1 != null) {
                    	    for(int pos = 0; pos < list_paramGen_1.size(); pos++ )  { 
                    	    // Create a Token CST Leaf	
                    	    if(TK_2 != null) {
                    			Leaf TK_2Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_2!=null?TK_2.getText():null), TK_2.getCharPositionInLine(), TK_2.getLine());
                    	 		filterExpressionAtomReturnNode.getChildren().add(TK_2Leaf);
                    	 	}
                    		// No Terminal extractor
                    	    if(list_paramGen_1 != null) {		
                    	    	Gra2MoLParser.param_return r = (Gra2MoLParser.param_return) list_paramGen_1.get(pos); 
                    	    	if(r != null && r.returnNode != null) {
                    	        	r.returnNode.setKind("param");
                    	    		filterExpressionAtomReturnNode.getChildren().add(r.returnNode);
                    	    	} 
                    		}
                    		}
                    		}

                    	    // Create a Token CST Leaf	
                    	    if(TK_3 != null) {
                    			Leaf TK_3Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_3!=null?TK_3.getText():null), TK_3.getCharPositionInLine(), TK_3.getLine());
                    	 		filterExpressionAtomReturnNode.getChildren().add(TK_3Leaf);
                    	 	}
                    		// Returns the Node with CST Leaves/Nodes
                    		retval.returnNode = filterExpressionAtomReturnNode;
                    	

                    }
                    break;
                case 2 :
                    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:1268:6: TK_0= '(' filterExpressionGen+= filterExpression TK_1= ')'
                    {
                    TK_0=(Token)match(input,35,FOLLOW_35_in_filterExpressionAtom1278); 
                    pushFollow(FOLLOW_filterExpression_in_filterExpressionAtom1283);
                    filterExpressionGen=filterExpression();

                    state._fsp--;

                    if (list_filterExpressionGen==null) list_filterExpressionGen=new ArrayList();
                    list_filterExpressionGen.add(filterExpressionGen);

                    TK_1=(Token)match(input,36,FOLLOW_36_in_filterExpressionAtom1288); 

                    		// Create return CST Node
                    		Node filterExpressionAtomReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                    		filterExpressionAtomReturnNode.setKind("filterExpressionAtom");
                    	    // Create a Token CST Leaf	
                    	    if(TK_0 != null) {
                    			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_0!=null?TK_0.getText():null), TK_0.getCharPositionInLine(), TK_0.getLine());
                    	 		filterExpressionAtomReturnNode.getChildren().add(TK_0Leaf);
                    	 	}
                    	    // Create a CST Node
                    		if(list_filterExpressionGen != null) {
                    	        for(Iterator it = list_filterExpressionGen.iterator(); it.hasNext(); )  { 
                    	            Gra2MoLParser.filterExpression_return r = (Gra2MoLParser.filterExpression_return) it.next(); 
                    	            if(r != null && r.returnNode != null) {
                    	            	r.returnNode.setKind("filterExpression");
                    	            	filterExpressionAtomReturnNode.getChildren().add(r.returnNode);
                    	            } 
                    	        }
                    	    }
                    	    // Create a Token CST Leaf	
                    	    if(TK_1 != null) {
                    			Leaf TK_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_1!=null?TK_1.getText():null), TK_1.getCharPositionInLine(), TK_1.getLine());
                    	 		filterExpressionAtomReturnNode.getChildren().add(TK_1Leaf);
                    	 	}
                    		// Returns the Node with CST Leaves/Nodes
                    		retval.returnNode = filterExpressionAtomReturnNode;
                    	

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

    public static class filterExpressionOperator_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "filterExpressionOperator"
    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:1298:1: filterExpressionOperator returns [Node returnNode] : (TK_0= 'eq' | TK_0= 'exists' | TK_0= 'check' | TK_0= 'hasResults' | TK_0= 'startsWith' | TK_0= 'endsWith' );
    public final Gra2MoLParser.filterExpressionOperator_return filterExpressionOperator() throws RecognitionException {
        Gra2MoLParser.filterExpressionOperator_return retval = new Gra2MoLParser.filterExpressionOperator_return();
        retval.start = input.LT(1);

        Token TK_0=null;

        try {
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:1299:1: (TK_0= 'eq' | TK_0= 'exists' | TK_0= 'check' | TK_0= 'hasResults' | TK_0= 'startsWith' | TK_0= 'endsWith' )
            int alt41=6;
            switch ( input.LA(1) ) {
            case 59:
                {
                alt41=1;
                }
                break;
            case 60:
                {
                alt41=2;
                }
                break;
            case 61:
                {
                alt41=3;
                }
                break;
            case 62:
                {
                alt41=4;
                }
                break;
            case 63:
                {
                alt41=5;
                }
                break;
            case 64:
                {
                alt41=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }

            switch (alt41) {
                case 1 :
                    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:1299:4: TK_0= 'eq'
                    {
                    TK_0=(Token)match(input,59,FOLLOW_59_in_filterExpressionOperator1310); 

                    		// Create return CST Node
                    		Node filterExpressionOperatorReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                    		filterExpressionOperatorReturnNode.setKind("filterExpressionOperator");
                    	    // Create a Token CST Leaf	
                    	    if(TK_0 != null) {
                    			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_0!=null?TK_0.getText():null), TK_0.getCharPositionInLine(), TK_0.getLine());
                    	 		filterExpressionOperatorReturnNode.getChildren().add(TK_0Leaf);
                    	 	}
                    		// Returns the Node with CST Leaves/Nodes
                    		retval.returnNode = filterExpressionOperatorReturnNode;
                    	

                    }
                    break;
                case 2 :
                    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:1312:6: TK_0= 'exists'
                    {
                    TK_0=(Token)match(input,60,FOLLOW_60_in_filterExpressionOperator1323); 

                    		// Create return CST Node
                    		Node filterExpressionOperatorReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                    		filterExpressionOperatorReturnNode.setKind("filterExpressionOperator");
                    	    // Create a Token CST Leaf	
                    	    if(TK_0 != null) {
                    			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_0!=null?TK_0.getText():null), TK_0.getCharPositionInLine(), TK_0.getLine());
                    	 		filterExpressionOperatorReturnNode.getChildren().add(TK_0Leaf);
                    	 	}
                    		// Returns the Node with CST Leaves/Nodes
                    		retval.returnNode = filterExpressionOperatorReturnNode;
                    	

                    }
                    break;
                case 3 :
                    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:1325:6: TK_0= 'check'
                    {
                    TK_0=(Token)match(input,61,FOLLOW_61_in_filterExpressionOperator1336); 

                    		// Create return CST Node
                    		Node filterExpressionOperatorReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                    		filterExpressionOperatorReturnNode.setKind("filterExpressionOperator");
                    	    // Create a Token CST Leaf	
                    	    if(TK_0 != null) {
                    			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_0!=null?TK_0.getText():null), TK_0.getCharPositionInLine(), TK_0.getLine());
                    	 		filterExpressionOperatorReturnNode.getChildren().add(TK_0Leaf);
                    	 	}
                    		// Returns the Node with CST Leaves/Nodes
                    		retval.returnNode = filterExpressionOperatorReturnNode;
                    	

                    }
                    break;
                case 4 :
                    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:1338:6: TK_0= 'hasResults'
                    {
                    TK_0=(Token)match(input,62,FOLLOW_62_in_filterExpressionOperator1349); 

                    		// Create return CST Node
                    		Node filterExpressionOperatorReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                    		filterExpressionOperatorReturnNode.setKind("filterExpressionOperator");
                    	    // Create a Token CST Leaf	
                    	    if(TK_0 != null) {
                    			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_0!=null?TK_0.getText():null), TK_0.getCharPositionInLine(), TK_0.getLine());
                    	 		filterExpressionOperatorReturnNode.getChildren().add(TK_0Leaf);
                    	 	}
                    		// Returns the Node with CST Leaves/Nodes
                    		retval.returnNode = filterExpressionOperatorReturnNode;
                    	

                    }
                    break;
                case 5 :
                    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:1351:5: TK_0= 'startsWith'
                    {
                    TK_0=(Token)match(input,63,FOLLOW_63_in_filterExpressionOperator1361); 

                    		// Create return CST Node
                    		Node filterExpressionOperatorReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                    		filterExpressionOperatorReturnNode.setKind("filterExpressionOperator");
                    	    // Create a Token CST Leaf	
                    	    if(TK_0 != null) {
                    			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_0!=null?TK_0.getText():null), TK_0.getCharPositionInLine(), TK_0.getLine());
                    	 		filterExpressionOperatorReturnNode.getChildren().add(TK_0Leaf);
                    	 	}
                    		// Returns the Node with CST Leaves/Nodes
                    		retval.returnNode = filterExpressionOperatorReturnNode;
                    	

                    }
                    break;
                case 6 :
                    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:1364:5: TK_0= 'endsWith'
                    {
                    TK_0=(Token)match(input,64,FOLLOW_64_in_filterExpressionOperator1374); 

                    		// Create return CST Node
                    		Node filterExpressionOperatorReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                    		filterExpressionOperatorReturnNode.setKind("filterExpressionOperator");
                    	    // Create a Token CST Leaf	
                    	    if(TK_0 != null) {
                    			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_0!=null?TK_0.getText():null), TK_0.getCharPositionInLine(), TK_0.getLine());
                    	 		filterExpressionOperatorReturnNode.getChildren().add(TK_0Leaf);
                    	 	}
                    		// Returns the Node with CST Leaves/Nodes
                    		retval.returnNode = filterExpressionOperatorReturnNode;
                    	

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
    // $ANTLR end "filterExpressionOperator"

    public static class expressionElement_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "expressionElement"
    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:1379:1: expressionElement returns [Node returnNode] : (ATGen= AT TK_0= '[' NUMBERGen= NUMBER TK_1= ']' | IDGen= ID (TK_0= '[' (NUMBERGen= NUMBER | TK_1= 'last' ) TK_2= ']' )? );
    public final Gra2MoLParser.expressionElement_return expressionElement() throws RecognitionException {
        Gra2MoLParser.expressionElement_return retval = new Gra2MoLParser.expressionElement_return();
        retval.start = input.LT(1);

        Token ATGen=null;
        Token TK_0=null;
        Token NUMBERGen=null;
        Token TK_1=null;
        Token IDGen=null;
        Token TK_2=null;

        try {
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:1380:1: (ATGen= AT TK_0= '[' NUMBERGen= NUMBER TK_1= ']' | IDGen= ID (TK_0= '[' (NUMBERGen= NUMBER | TK_1= 'last' ) TK_2= ']' )? )
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==AT) ) {
                alt44=1;
            }
            else if ( (LA44_0==ID) ) {
                alt44=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }
            switch (alt44) {
                case 1 :
                    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:1380:5: ATGen= AT TK_0= '[' NUMBERGen= NUMBER TK_1= ']'
                    {
                    ATGen=(Token)match(input,AT,FOLLOW_AT_in_expressionElement1398); 
                    TK_0=(Token)match(input,44,FOLLOW_44_in_expressionElement1403); 
                    NUMBERGen=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_expressionElement1408); 
                    TK_1=(Token)match(input,46,FOLLOW_46_in_expressionElement1413); 

                    		// Create return CST Node
                    		Node expressionElementReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                    		expressionElementReturnNode.setKind("expressionElement");
                    	    // Create a CST Leaf
                    		if(ATGen != null) {
                    			Leaf ATGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf("AT", (ATGen!=null?ATGen.getText():null), ATGen.getCharPositionInLine(), ATGen.getLine());
                    			expressionElementReturnNode.getChildren().add(ATGenLeaf);
                    		}
                    	    // Create a Token CST Leaf	
                    	    if(TK_0 != null) {
                    			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_0!=null?TK_0.getText():null), TK_0.getCharPositionInLine(), TK_0.getLine());
                    	 		expressionElementReturnNode.getChildren().add(TK_0Leaf);
                    	 	}
                    	    // Create a CST Leaf
                    		if(NUMBERGen != null) {
                    			Leaf NUMBERGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf("NUMBER", (NUMBERGen!=null?NUMBERGen.getText():null), NUMBERGen.getCharPositionInLine(), NUMBERGen.getLine());
                    			expressionElementReturnNode.getChildren().add(NUMBERGenLeaf);
                    		}
                    	    // Create a Token CST Leaf	
                    	    if(TK_1 != null) {
                    			Leaf TK_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_1!=null?TK_1.getText():null), TK_1.getCharPositionInLine(), TK_1.getLine());
                    	 		expressionElementReturnNode.getChildren().add(TK_1Leaf);
                    	 	}
                    		// Returns the Node with CST Leaves/Nodes
                    		retval.returnNode = expressionElementReturnNode;
                    	

                    }
                    break;
                case 2 :
                    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:1408:5: IDGen= ID (TK_0= '[' (NUMBERGen= NUMBER | TK_1= 'last' ) TK_2= ']' )?
                    {
                    IDGen=(Token)match(input,ID,FOLLOW_ID_in_expressionElement1426); 
                    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:1408:14: (TK_0= '[' (NUMBERGen= NUMBER | TK_1= 'last' ) TK_2= ']' )?
                    int alt43=2;
                    int LA43_0 = input.LA(1);

                    if ( (LA43_0==44) ) {
                        alt43=1;
                    }
                    switch (alt43) {
                        case 1 :
                            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:1408:16: TK_0= '[' (NUMBERGen= NUMBER | TK_1= 'last' ) TK_2= ']'
                            {
                            TK_0=(Token)match(input,44,FOLLOW_44_in_expressionElement1432); 
                            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:1408:25: (NUMBERGen= NUMBER | TK_1= 'last' )
                            int alt42=2;
                            int LA42_0 = input.LA(1);

                            if ( (LA42_0==NUMBER) ) {
                                alt42=1;
                            }
                            else if ( (LA42_0==57) ) {
                                alt42=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 42, 0, input);

                                throw nvae;
                            }
                            switch (alt42) {
                                case 1 :
                                    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:1408:27: NUMBERGen= NUMBER
                                    {
                                    NUMBERGen=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_expressionElement1438); 

                                    }
                                    break;
                                case 2 :
                                    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:1408:47: TK_1= 'last'
                                    {
                                    TK_1=(Token)match(input,57,FOLLOW_57_in_expressionElement1445); 

                                    }
                                    break;

                            }

                            TK_2=(Token)match(input,46,FOLLOW_46_in_expressionElement1451); 

                            }
                            break;

                    }


                    		// Create return CST Node
                    		Node expressionElementReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                    		expressionElementReturnNode.setKind("expressionElement");
                    	    // Create a CST Leaf
                    		if(IDGen != null) {
                    			Leaf IDGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf("ID", (IDGen!=null?IDGen.getText():null), IDGen.getCharPositionInLine(), IDGen.getLine());
                    			expressionElementReturnNode.getChildren().add(IDGenLeaf);
                    		}
                    	    // Create a Token CST Leaf	
                    	    if(TK_0 != null) {
                    			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_0!=null?TK_0.getText():null), TK_0.getCharPositionInLine(), TK_0.getLine());
                    	 		expressionElementReturnNode.getChildren().add(TK_0Leaf);
                    	 	}
                    	    // Create a CST Leaf
                    		if(NUMBERGen != null) {
                    			Leaf NUMBERGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf("NUMBER", (NUMBERGen!=null?NUMBERGen.getText():null), NUMBERGen.getCharPositionInLine(), NUMBERGen.getLine());
                    			expressionElementReturnNode.getChildren().add(NUMBERGenLeaf);
                    		}
                    	    // Create a Token CST Leaf	
                    	    if(TK_1 != null) {
                    			Leaf TK_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_1!=null?TK_1.getText():null), TK_1.getCharPositionInLine(), TK_1.getLine());
                    	 		expressionElementReturnNode.getChildren().add(TK_1Leaf);
                    	 	}
                    	    // Create a Token CST Leaf	
                    	    if(TK_2 != null) {
                    			Leaf TK_2Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_2!=null?TK_2.getText():null), TK_2.getCharPositionInLine(), TK_2.getLine());
                    	 		expressionElementReturnNode.getChildren().add(TK_2Leaf);
                    	 	}
                    		// Returns the Node with CST Leaves/Nodes
                    		retval.returnNode = expressionElementReturnNode;
                    	

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
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "filterElement"
    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:1443:1: filterElement returns [Node returnNode] : (ALGen= AL idGen+= id | idGen+= id );
    public final Gra2MoLParser.filterElement_return filterElement() throws RecognitionException {
        Gra2MoLParser.filterElement_return retval = new Gra2MoLParser.filterElement_return();
        retval.start = input.LT(1);

        Token ALGen=null;
        List list_idGen=null;
        RuleReturnScope idGen = null;
        try {
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:1444:1: (ALGen= AL idGen+= id | idGen+= id )
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==AL) ) {
                alt45=1;
            }
            else if ( (LA45_0==ID||LA45_0==IDESC) ) {
                alt45=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }
            switch (alt45) {
                case 1 :
                    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:1444:4: ALGen= AL idGen+= id
                    {
                    ALGen=(Token)match(input,AL,FOLLOW_AL_in_filterElement1476); 
                    pushFollow(FOLLOW_id_in_filterElement1481);
                    idGen=id();

                    state._fsp--;

                    if (list_idGen==null) list_idGen=new ArrayList();
                    list_idGen.add(idGen);


                    		// Create return CST Node
                    		Node filterElementReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                    		filterElementReturnNode.setKind("filterElement");
                    	    // Create a CST Leaf
                    		if(ALGen != null) {
                    			Leaf ALGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf("AL", (ALGen!=null?ALGen.getText():null), ALGen.getCharPositionInLine(), ALGen.getLine());
                    			filterElementReturnNode.getChildren().add(ALGenLeaf);
                    		}
                    	    // Create a CST Node
                    		if(list_idGen != null) {
                    	        for(Iterator it = list_idGen.iterator(); it.hasNext(); )  { 
                    	            Gra2MoLParser.id_return r = (Gra2MoLParser.id_return) it.next(); 
                    	            if(r != null && r.returnNode != null) {
                    	            	r.returnNode.setKind("id");
                    	            	filterElementReturnNode.getChildren().add(r.returnNode);
                    	            } 
                    	        }
                    	    }
                    		// Returns the Node with CST Leaves/Nodes
                    		retval.returnNode = filterElementReturnNode;
                    	

                    }
                    break;
                case 2 :
                    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:1467:6: idGen+= id
                    {
                    pushFollow(FOLLOW_id_in_filterElement1495);
                    idGen=id();

                    state._fsp--;

                    if (list_idGen==null) list_idGen=new ArrayList();
                    list_idGen.add(idGen);


                    		// Create return CST Node
                    		Node filterElementReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                    		filterElementReturnNode.setKind("filterElement");
                    	    // Create a CST Node
                    		if(list_idGen != null) {
                    	        for(Iterator it = list_idGen.iterator(); it.hasNext(); )  { 
                    	            Gra2MoLParser.id_return r = (Gra2MoLParser.id_return) it.next(); 
                    	            if(r != null && r.returnNode != null) {
                    	            	r.returnNode.setKind("id");
                    	            	filterElementReturnNode.getChildren().add(r.returnNode);
                    	            } 
                    	        }
                    	    }
                    		// Returns the Node with CST Leaves/Nodes
                    		retval.returnNode = filterElementReturnNode;
                    	

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
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "initList"
    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:1487:1: initList returns [Node returnNode] : (TK_0= 'mapping' | TK_1= 'mappings' | TK_2= 'do' ) (initGen+= init )* ;
    public final Gra2MoLParser.initList_return initList() throws RecognitionException {
        Gra2MoLParser.initList_return retval = new Gra2MoLParser.initList_return();
        retval.start = input.LT(1);

        Token TK_0=null;
        Token TK_1=null;
        Token TK_2=null;
        List list_initGen=null;
        RuleReturnScope initGen = null;
        try {
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:1488:1: ( (TK_0= 'mapping' | TK_1= 'mappings' | TK_2= 'do' ) (initGen+= init )* )
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:1488:3: (TK_0= 'mapping' | TK_1= 'mappings' | TK_2= 'do' ) (initGen+= init )*
            {
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:1488:3: (TK_0= 'mapping' | TK_1= 'mappings' | TK_2= 'do' )
            int alt46=3;
            switch ( input.LA(1) ) {
            case 65:
                {
                alt46=1;
                }
                break;
            case 66:
                {
                alt46=2;
                }
                break;
            case 67:
                {
                alt46=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }

            switch (alt46) {
                case 1 :
                    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:1488:5: TK_0= 'mapping'
                    {
                    TK_0=(Token)match(input,65,FOLLOW_65_in_initList1521); 

                    }
                    break;
                case 2 :
                    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:1488:23: TK_1= 'mappings'
                    {
                    TK_1=(Token)match(input,66,FOLLOW_66_in_initList1528); 

                    }
                    break;
                case 3 :
                    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:1488:42: TK_2= 'do'
                    {
                    TK_2=(Token)match(input,67,FOLLOW_67_in_initList1535); 

                    }
                    break;

            }

            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:1488:61: (initGen+= init )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==ID||LA47_0==IDESC||LA47_0==69||LA47_0==72) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:1488:61: initGen+= init
            	    {
            	    pushFollow(FOLLOW_init_in_initList1541);
            	    initGen=init();

            	    state._fsp--;

            	    if (list_initGen==null) list_initGen=new ArrayList();
            	    list_initGen.add(initGen);


            	    }
            	    break;

            	default :
            	    break loop47;
                }
            } while (true);


            		// Create return CST Node
            		Node initListReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
            		initListReturnNode.setKind("initList");
            	    // Create a Token CST Leaf	
            	    if(TK_0 != null) {
            			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_0!=null?TK_0.getText():null), TK_0.getCharPositionInLine(), TK_0.getLine());
            	 		initListReturnNode.getChildren().add(TK_0Leaf);
            	 	}
            	    // Create a Token CST Leaf	
            	    if(TK_1 != null) {
            			Leaf TK_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_1!=null?TK_1.getText():null), TK_1.getCharPositionInLine(), TK_1.getLine());
            	 		initListReturnNode.getChildren().add(TK_1Leaf);
            	 	}
            	    // Create a Token CST Leaf	
            	    if(TK_2 != null) {
            			Leaf TK_2Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_2!=null?TK_2.getText():null), TK_2.getCharPositionInLine(), TK_2.getLine());
            	 		initListReturnNode.getChildren().add(TK_2Leaf);
            	 	}
            	    // Create a CST Node
            		if(list_initGen != null) {
            	        for(Iterator it = list_initGen.iterator(); it.hasNext(); )  { 
            	            Gra2MoLParser.init_return r = (Gra2MoLParser.init_return) it.next(); 
            	            if(r != null && r.returnNode != null) {
            	            	r.returnNode.setKind("init");
            	            	initListReturnNode.getChildren().add(r.returnNode);
            	            } 
            	        }
            	    }
            		// Returns the Node with CST Leaves/Nodes
            		retval.returnNode = initListReturnNode;
            	

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
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "init"
    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:1523:1: init returns [Node returnNode] : (initNameGen+= initName TK_0= '=' initElementValueGen+= initElementValue TK_1= ';' | TK_0= 'if' TK_1= '(' filterExpressionGen+= filterExpression TK_2= ')' TK_3= 'then' (initGen+= init )* (elsePartGen+= elsePart )? TK_4= 'end_if' | TK_0= 'skip' IDGen= ID TK_1= ';' );
    public final Gra2MoLParser.init_return init() throws RecognitionException {
        Gra2MoLParser.init_return retval = new Gra2MoLParser.init_return();
        retval.start = input.LT(1);

        Token TK_0=null;
        Token TK_1=null;
        Token TK_2=null;
        Token TK_3=null;
        Token TK_4=null;
        Token IDGen=null;
        List list_initNameGen=null;
        List list_initElementValueGen=null;
        List list_filterExpressionGen=null;
        List list_initGen=null;
        List list_elsePartGen=null;
        RuleReturnScope initNameGen = null;
        RuleReturnScope initElementValueGen = null;
        RuleReturnScope filterExpressionGen = null;
        RuleReturnScope initGen = null;
        RuleReturnScope elsePartGen = null;
        try {
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:1524:1: (initNameGen+= initName TK_0= '=' initElementValueGen+= initElementValue TK_1= ';' | TK_0= 'if' TK_1= '(' filterExpressionGen+= filterExpression TK_2= ')' TK_3= 'then' (initGen+= init )* (elsePartGen+= elsePart )? TK_4= 'end_if' | TK_0= 'skip' IDGen= ID TK_1= ';' )
            int alt50=3;
            switch ( input.LA(1) ) {
            case ID:
            case IDESC:
                {
                alt50=1;
                }
                break;
            case 69:
                {
                alt50=2;
                }
                break;
            case 72:
                {
                alt50=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }

            switch (alt50) {
                case 1 :
                    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:1524:4: initNameGen+= initName TK_0= '=' initElementValueGen+= initElementValue TK_1= ';'
                    {
                    pushFollow(FOLLOW_initName_in_init1565);
                    initNameGen=initName();

                    state._fsp--;

                    if (list_initNameGen==null) list_initNameGen=new ArrayList();
                    list_initNameGen.add(initNameGen);

                    TK_0=(Token)match(input,68,FOLLOW_68_in_init1570); 
                    pushFollow(FOLLOW_initElementValue_in_init1575);
                    initElementValueGen=initElementValue();

                    state._fsp--;

                    if (list_initElementValueGen==null) list_initElementValueGen=new ArrayList();
                    list_initElementValueGen.add(initElementValueGen);

                    TK_1=(Token)match(input,27,FOLLOW_27_in_init1580); 

                    		// Create return CST Node
                    		Node initReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                    		initReturnNode.setKind("init");
                    	    // Create a CST Node
                    		if(list_initNameGen != null) {
                    	        for(Iterator it = list_initNameGen.iterator(); it.hasNext(); )  { 
                    	            Gra2MoLParser.initName_return r = (Gra2MoLParser.initName_return) it.next(); 
                    	            if(r != null && r.returnNode != null) {
                    	            	r.returnNode.setKind("initName");
                    	            	initReturnNode.getChildren().add(r.returnNode);
                    	            } 
                    	        }
                    	    }
                    	    // Create a Token CST Leaf	
                    	    if(TK_0 != null) {
                    			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_0!=null?TK_0.getText():null), TK_0.getCharPositionInLine(), TK_0.getLine());
                    	 		initReturnNode.getChildren().add(TK_0Leaf);
                    	 	}
                    	    // Create a CST Node
                    		if(list_initElementValueGen != null) {
                    	        for(Iterator it = list_initElementValueGen.iterator(); it.hasNext(); )  { 
                    	            Gra2MoLParser.initElementValue_return r = (Gra2MoLParser.initElementValue_return) it.next(); 
                    	            if(r != null && r.returnNode != null) {
                    	            	r.returnNode.setKind("initElementValue");
                    	            	initReturnNode.getChildren().add(r.returnNode);
                    	            } 
                    	        }
                    	    }
                    	    // Create a Token CST Leaf	
                    	    if(TK_1 != null) {
                    			Leaf TK_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_1!=null?TK_1.getText():null), TK_1.getCharPositionInLine(), TK_1.getLine());
                    	 		initReturnNode.getChildren().add(TK_1Leaf);
                    	 	}
                    		// Returns the Node with CST Leaves/Nodes
                    		retval.returnNode = initReturnNode;
                    	

                    }
                    break;
                case 2 :
                    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:1562:5: TK_0= 'if' TK_1= '(' filterExpressionGen+= filterExpression TK_2= ')' TK_3= 'then' (initGen+= init )* (elsePartGen+= elsePart )? TK_4= 'end_if'
                    {
                    TK_0=(Token)match(input,69,FOLLOW_69_in_init1592); 
                    TK_1=(Token)match(input,35,FOLLOW_35_in_init1597); 
                    pushFollow(FOLLOW_filterExpression_in_init1602);
                    filterExpressionGen=filterExpression();

                    state._fsp--;

                    if (list_filterExpressionGen==null) list_filterExpressionGen=new ArrayList();
                    list_filterExpressionGen.add(filterExpressionGen);

                    TK_2=(Token)match(input,36,FOLLOW_36_in_init1607); 
                    TK_3=(Token)match(input,70,FOLLOW_70_in_init1612); 
                    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:1562:95: (initGen+= init )*
                    loop48:
                    do {
                        int alt48=2;
                        int LA48_0 = input.LA(1);

                        if ( (LA48_0==ID||LA48_0==IDESC||LA48_0==69||LA48_0==72) ) {
                            alt48=1;
                        }


                        switch (alt48) {
                    	case 1 :
                    	    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:1562:95: initGen+= init
                    	    {
                    	    pushFollow(FOLLOW_init_in_init1617);
                    	    initGen=init();

                    	    state._fsp--;

                    	    if (list_initGen==null) list_initGen=new ArrayList();
                    	    list_initGen.add(initGen);


                    	    }
                    	    break;

                    	default :
                    	    break loop48;
                        }
                    } while (true);

                    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:1562:103: (elsePartGen+= elsePart )?
                    int alt49=2;
                    int LA49_0 = input.LA(1);

                    if ( (LA49_0==73) ) {
                        alt49=1;
                    }
                    switch (alt49) {
                        case 1 :
                            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:1562:105: elsePartGen+= elsePart
                            {
                            pushFollow(FOLLOW_elsePart_in_init1624);
                            elsePartGen=elsePart();

                            state._fsp--;

                            if (list_elsePartGen==null) list_elsePartGen=new ArrayList();
                            list_elsePartGen.add(elsePartGen);


                            }
                            break;

                    }

                    TK_4=(Token)match(input,71,FOLLOW_71_in_init1631); 

                    		// Create return CST Node
                    		Node initReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                    		initReturnNode.setKind("init");
                    	    // Create a Token CST Leaf	
                    	    if(TK_0 != null) {
                    			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_0!=null?TK_0.getText():null), TK_0.getCharPositionInLine(), TK_0.getLine());
                    	 		initReturnNode.getChildren().add(TK_0Leaf);
                    	 	}
                    	    // Create a Token CST Leaf	
                    	    if(TK_1 != null) {
                    			Leaf TK_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_1!=null?TK_1.getText():null), TK_1.getCharPositionInLine(), TK_1.getLine());
                    	 		initReturnNode.getChildren().add(TK_1Leaf);
                    	 	}
                    	    // Create a CST Node
                    		if(list_filterExpressionGen != null) {
                    	        for(Iterator it = list_filterExpressionGen.iterator(); it.hasNext(); )  { 
                    	            Gra2MoLParser.filterExpression_return r = (Gra2MoLParser.filterExpression_return) it.next(); 
                    	            if(r != null && r.returnNode != null) {
                    	            	r.returnNode.setKind("filterExpression");
                    	            	initReturnNode.getChildren().add(r.returnNode);
                    	            } 
                    	        }
                    	    }
                    	    // Create a Token CST Leaf	
                    	    if(TK_2 != null) {
                    			Leaf TK_2Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_2!=null?TK_2.getText():null), TK_2.getCharPositionInLine(), TK_2.getLine());
                    	 		initReturnNode.getChildren().add(TK_2Leaf);
                    	 	}
                    	    // Create a Token CST Leaf	
                    	    if(TK_3 != null) {
                    			Leaf TK_3Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_3!=null?TK_3.getText():null), TK_3.getCharPositionInLine(), TK_3.getLine());
                    	 		initReturnNode.getChildren().add(TK_3Leaf);
                    	 	}
                    	    // Create a CST Node
                    		if(list_initGen != null) {
                    	        for(Iterator it = list_initGen.iterator(); it.hasNext(); )  { 
                    	            Gra2MoLParser.init_return r = (Gra2MoLParser.init_return) it.next(); 
                    	            if(r != null && r.returnNode != null) {
                    	            	r.returnNode.setKind("init");
                    	            	initReturnNode.getChildren().add(r.returnNode);
                    	            } 
                    	        }
                    	    }
                    	    // Create a CST Node
                    		if(list_elsePartGen != null) {
                    	        for(Iterator it = list_elsePartGen.iterator(); it.hasNext(); )  { 
                    	            Gra2MoLParser.elsePart_return r = (Gra2MoLParser.elsePart_return) it.next(); 
                    	            if(r != null && r.returnNode != null) {
                    	            	r.returnNode.setKind("elsePart");
                    	            	initReturnNode.getChildren().add(r.returnNode);
                    	            } 
                    	        }
                    	    }
                    	    // Create a Token CST Leaf	
                    	    if(TK_4 != null) {
                    			Leaf TK_4Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_4!=null?TK_4.getText():null), TK_4.getCharPositionInLine(), TK_4.getLine());
                    	 		initReturnNode.getChildren().add(TK_4Leaf);
                    	 	}
                    		// Returns the Node with CST Leaves/Nodes
                    		retval.returnNode = initReturnNode;
                    	

                    }
                    break;
                case 3 :
                    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:1625:6: TK_0= 'skip' IDGen= ID TK_1= ';'
                    {
                    TK_0=(Token)match(input,72,FOLLOW_72_in_init1644); 
                    IDGen=(Token)match(input,ID,FOLLOW_ID_in_init1649); 
                    TK_1=(Token)match(input,27,FOLLOW_27_in_init1654); 

                    		// Create return CST Node
                    		Node initReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                    		initReturnNode.setKind("init");
                    	    // Create a Token CST Leaf	
                    	    if(TK_0 != null) {
                    			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_0!=null?TK_0.getText():null), TK_0.getCharPositionInLine(), TK_0.getLine());
                    	 		initReturnNode.getChildren().add(TK_0Leaf);
                    	 	}
                    	    // Create a CST Leaf
                    		if(IDGen != null) {
                    			Leaf IDGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf("ID", (IDGen!=null?IDGen.getText():null), IDGen.getCharPositionInLine(), IDGen.getLine());
                    			initReturnNode.getChildren().add(IDGenLeaf);
                    		}
                    	    // Create a Token CST Leaf	
                    	    if(TK_1 != null) {
                    			Leaf TK_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_1!=null?TK_1.getText():null), TK_1.getCharPositionInLine(), TK_1.getLine());
                    	 		initReturnNode.getChildren().add(TK_1Leaf);
                    	 	}
                    		// Returns the Node with CST Leaves/Nodes
                    		retval.returnNode = initReturnNode;
                    	

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

    public static class elsePart_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "elsePart"
    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:1650:1: elsePart returns [Node returnNode] : TK_0= 'else' (initGen+= init )* ;
    public final Gra2MoLParser.elsePart_return elsePart() throws RecognitionException {
        Gra2MoLParser.elsePart_return retval = new Gra2MoLParser.elsePart_return();
        retval.start = input.LT(1);

        Token TK_0=null;
        List list_initGen=null;
        RuleReturnScope initGen = null;
        try {
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:1651:1: (TK_0= 'else' (initGen+= init )* )
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:1651:6: TK_0= 'else' (initGen+= init )*
            {
            TK_0=(Token)match(input,73,FOLLOW_73_in_elsePart1678); 
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:1651:26: (initGen+= init )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==ID||LA51_0==IDESC||LA51_0==69||LA51_0==72) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:1651:26: initGen+= init
            	    {
            	    pushFollow(FOLLOW_init_in_elsePart1683);
            	    initGen=init();

            	    state._fsp--;

            	    if (list_initGen==null) list_initGen=new ArrayList();
            	    list_initGen.add(initGen);


            	    }
            	    break;

            	default :
            	    break loop51;
                }
            } while (true);


            		// Create return CST Node
            		Node elsePartReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
            		elsePartReturnNode.setKind("elsePart");
            	    // Create a Token CST Leaf	
            	    if(TK_0 != null) {
            			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_0!=null?TK_0.getText():null), TK_0.getCharPositionInLine(), TK_0.getLine());
            	 		elsePartReturnNode.getChildren().add(TK_0Leaf);
            	 	}
            	    // Create a CST Node
            		if(list_initGen != null) {
            	        for(Iterator it = list_initGen.iterator(); it.hasNext(); )  { 
            	            Gra2MoLParser.init_return r = (Gra2MoLParser.init_return) it.next(); 
            	            if(r != null && r.returnNode != null) {
            	            	r.returnNode.setKind("init");
            	            	elsePartReturnNode.getChildren().add(r.returnNode);
            	            } 
            	        }
            	    }
            		// Returns the Node with CST Leaves/Nodes
            		retval.returnNode = elsePartReturnNode;
            	

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
    // $ANTLR end "elsePart"

    public static class initName_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "initName"
    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:1676:1: initName returns [Node returnNode] : v+= id (DOTGen_List+= DOT IDGen_List+= ID )* ;
    public final Gra2MoLParser.initName_return initName() throws RecognitionException {
        Gra2MoLParser.initName_return retval = new Gra2MoLParser.initName_return();
        retval.start = input.LT(1);

        Token DOTGen_List=null;
        Token IDGen_List=null;
        List list_DOTGen_List=null;
        List list_IDGen_List=null;
        List list_v=null;
        RuleReturnScope v = null;
        try {
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:1677:1: (v+= id (DOTGen_List+= DOT IDGen_List+= ID )* )
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:1677:3: v+= id (DOTGen_List+= DOT IDGen_List+= ID )*
            {
            pushFollow(FOLLOW_id_in_initName1705);
            v=id();

            state._fsp--;

            if (list_v==null) list_v=new ArrayList();
            list_v.add(v);

            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:1677:9: (DOTGen_List+= DOT IDGen_List+= ID )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==DOT) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:1677:11: DOTGen_List+= DOT IDGen_List+= ID
            	    {
            	    DOTGen_List=(Token)match(input,DOT,FOLLOW_DOT_in_initName1711); 
            	    if (list_DOTGen_List==null) list_DOTGen_List=new ArrayList();
            	    list_DOTGen_List.add(DOTGen_List);

            	    IDGen_List=(Token)match(input,ID,FOLLOW_ID_in_initName1716); 
            	    if (list_IDGen_List==null) list_IDGen_List=new ArrayList();
            	    list_IDGen_List.add(IDGen_List);


            	    }
            	    break;

            	default :
            	    break loop52;
                }
            } while (true);


            		// Create return CST Node
            		Node initNameReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
            		initNameReturnNode.setKind("initName");
            	    // Create a CST Node
            		if(list_v != null) {
            	        for(Iterator it = list_v.iterator(); it.hasNext(); )  { 
            	            Gra2MoLParser.id_return r = (Gra2MoLParser.id_return) it.next(); 
            	            if(r != null && r.returnNode != null) {
            	            	r.returnNode.setKind("v");
            	            	initNameReturnNode.getChildren().add(r.returnNode);
            	            } 
            	        }
            	    }

            		// Create a special CST Node for terminal DOTGen_List aggregation
            		if(list_DOTGen_List != null) {
            	    for(int pos = 0; pos < list_DOTGen_List.size(); pos++ )  { 
            		// Terminal extractor
            	    if(list_DOTGen_List != null) {
            		    Token t = (Token) list_DOTGen_List.get(pos); 
            		    Leaf DOTGen_ListLeaf = CSTFactoryImpl.eINSTANCE.createLeaf("DOT", t.getText(), t.getCharPositionInLine(), t.getLine());
            			initNameReturnNode.getChildren().add(DOTGen_ListLeaf);
            		}
            		// Terminal extractor
            	    if(list_IDGen_List != null) {
            		    Token t = (Token) list_IDGen_List.get(pos); 
            		    Leaf IDGen_ListLeaf = CSTFactoryImpl.eINSTANCE.createLeaf("ID", t.getText(), t.getCharPositionInLine(), t.getLine());
            			initNameReturnNode.getChildren().add(IDGen_ListLeaf);
            		}
            		}
            		}

            		// Returns the Node with CST Leaves/Nodes
            		retval.returnNode = initNameReturnNode;
            	

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
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "initElementValue"
    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:1716:1: initElementValue returns [Node returnNode] : (IDGen= ID | DQVALUEGen= DQVALUE | NUMBERGen= NUMBER | IDGen= ID DOTGen= DOT IDGen_1= ID (TK_0= '*' | TK_1= '[' paramGen+= param TK_2= ']' )? | paramGen+= param PLUSGen= PLUS paramGen_1+= param (PLUSGen_1_List+= PLUS paramGen_2+= param )* | TK_0= 'new' normalNameGen+= normalName | TK_0= 'map' IDGen= ID TK_1= '(' paramGen+= param TK_2= ')' | TK_0= 'extract' IDGen= ID | TK_0= 'extractID' IDGen= ID | TK_0= 'execute' IDGen= ID IDGen_1= ID | TK_0= 'removeQuotes' IDGen= ID DOTGen= DOT IDGen_1= ID (TK_1= '[' paramGen+= param TK_2= ']' )? | TK_0= 'count' IDGen= ID | TK_0= 'convertHexToString' IDGen= ID DOTGen= DOT IDGen_1= ID | TK_0= 'ext' normalNameGen+= normalName (TK_1= '(' paramGen+= param (TK_2= ',' paramGen_1+= param )? TK_3= ')' )? );
    public final Gra2MoLParser.initElementValue_return initElementValue() throws RecognitionException {
        Gra2MoLParser.initElementValue_return retval = new Gra2MoLParser.initElementValue_return();
        retval.start = input.LT(1);

        Token IDGen=null;
        Token DQVALUEGen=null;
        Token NUMBERGen=null;
        Token DOTGen=null;
        Token IDGen_1=null;
        Token TK_0=null;
        Token TK_1=null;
        Token TK_2=null;
        Token PLUSGen=null;
        Token TK_3=null;
        Token PLUSGen_1_List=null;
        List list_PLUSGen_1_List=null;
        List list_paramGen=null;
        List list_paramGen_1=null;
        List list_paramGen_2=null;
        List list_normalNameGen=null;
        RuleReturnScope paramGen = null;
        RuleReturnScope paramGen_1 = null;
        RuleReturnScope paramGen_2 = null;
        RuleReturnScope normalNameGen = null;
        try {
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:1717:1: (IDGen= ID | DQVALUEGen= DQVALUE | NUMBERGen= NUMBER | IDGen= ID DOTGen= DOT IDGen_1= ID (TK_0= '*' | TK_1= '[' paramGen+= param TK_2= ']' )? | paramGen+= param PLUSGen= PLUS paramGen_1+= param (PLUSGen_1_List+= PLUS paramGen_2+= param )* | TK_0= 'new' normalNameGen+= normalName | TK_0= 'map' IDGen= ID TK_1= '(' paramGen+= param TK_2= ')' | TK_0= 'extract' IDGen= ID | TK_0= 'extractID' IDGen= ID | TK_0= 'execute' IDGen= ID IDGen_1= ID | TK_0= 'removeQuotes' IDGen= ID DOTGen= DOT IDGen_1= ID (TK_1= '[' paramGen+= param TK_2= ']' )? | TK_0= 'count' IDGen= ID | TK_0= 'convertHexToString' IDGen= ID DOTGen= DOT IDGen_1= ID | TK_0= 'ext' normalNameGen+= normalName (TK_1= '(' paramGen+= param (TK_2= ',' paramGen_1+= param )? TK_3= ')' )? )
            int alt58=14;
            alt58 = dfa58.predict(input);
            switch (alt58) {
                case 1 :
                    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:1717:4: IDGen= ID
                    {
                    IDGen=(Token)match(input,ID,FOLLOW_ID_in_initElementValue1741); 

                    		// Create return CST Node
                    		Node initElementValueReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                    		initElementValueReturnNode.setKind("initElementValue");
                    	    // Create a CST Leaf
                    		if(IDGen != null) {
                    			Leaf IDGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf("ID", (IDGen!=null?IDGen.getText():null), IDGen.getCharPositionInLine(), IDGen.getLine());
                    			initElementValueReturnNode.getChildren().add(IDGenLeaf);
                    		}
                    		// Returns the Node with CST Leaves/Nodes
                    		retval.returnNode = initElementValueReturnNode;
                    	

                    }
                    break;
                case 2 :
                    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:1730:5: DQVALUEGen= DQVALUE
                    {
                    DQVALUEGen=(Token)match(input,DQVALUE,FOLLOW_DQVALUE_in_initElementValue1754); 

                    		// Create return CST Node
                    		Node initElementValueReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                    		initElementValueReturnNode.setKind("initElementValue");
                    	    // Create a CST Leaf
                    		if(DQVALUEGen != null) {
                    			Leaf DQVALUEGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf("DQVALUE", (DQVALUEGen!=null?DQVALUEGen.getText():null), DQVALUEGen.getCharPositionInLine(), DQVALUEGen.getLine());
                    			initElementValueReturnNode.getChildren().add(DQVALUEGenLeaf);
                    		}
                    		// Returns the Node with CST Leaves/Nodes
                    		retval.returnNode = initElementValueReturnNode;
                    	

                    }
                    break;
                case 3 :
                    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:1743:5: NUMBERGen= NUMBER
                    {
                    NUMBERGen=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_initElementValue1767); 

                    		// Create return CST Node
                    		Node initElementValueReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                    		initElementValueReturnNode.setKind("initElementValue");
                    	    // Create a CST Leaf
                    		if(NUMBERGen != null) {
                    			Leaf NUMBERGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf("NUMBER", (NUMBERGen!=null?NUMBERGen.getText():null), NUMBERGen.getCharPositionInLine(), NUMBERGen.getLine());
                    			initElementValueReturnNode.getChildren().add(NUMBERGenLeaf);
                    		}
                    		// Returns the Node with CST Leaves/Nodes
                    		retval.returnNode = initElementValueReturnNode;
                    	

                    }
                    break;
                case 4 :
                    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:1756:5: IDGen= ID DOTGen= DOT IDGen_1= ID (TK_0= '*' | TK_1= '[' paramGen+= param TK_2= ']' )?
                    {
                    IDGen=(Token)match(input,ID,FOLLOW_ID_in_initElementValue1780); 
                    DOTGen=(Token)match(input,DOT,FOLLOW_DOT_in_initElementValue1785); 
                    IDGen_1=(Token)match(input,ID,FOLLOW_ID_in_initElementValue1790); 
                    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:1756:38: (TK_0= '*' | TK_1= '[' paramGen+= param TK_2= ']' )?
                    int alt53=3;
                    int LA53_0 = input.LA(1);

                    if ( (LA53_0==74) ) {
                        alt53=1;
                    }
                    else if ( (LA53_0==44) ) {
                        alt53=2;
                    }
                    switch (alt53) {
                        case 1 :
                            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:1756:40: TK_0= '*'
                            {
                            TK_0=(Token)match(input,74,FOLLOW_74_in_initElementValue1796); 

                            }
                            break;
                        case 2 :
                            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:1756:52: TK_1= '[' paramGen+= param TK_2= ']'
                            {
                            TK_1=(Token)match(input,44,FOLLOW_44_in_initElementValue1803); 
                            pushFollow(FOLLOW_param_in_initElementValue1808);
                            paramGen=param();

                            state._fsp--;

                            if (list_paramGen==null) list_paramGen=new ArrayList();
                            list_paramGen.add(paramGen);

                            TK_2=(Token)match(input,46,FOLLOW_46_in_initElementValue1813); 

                            }
                            break;

                    }


                    		// Create return CST Node
                    		Node initElementValueReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                    		initElementValueReturnNode.setKind("initElementValue");
                    	    // Create a CST Leaf
                    		if(IDGen != null) {
                    			Leaf IDGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf("ID", (IDGen!=null?IDGen.getText():null), IDGen.getCharPositionInLine(), IDGen.getLine());
                    			initElementValueReturnNode.getChildren().add(IDGenLeaf);
                    		}
                    	    // Create a CST Leaf
                    		if(DOTGen != null) {
                    			Leaf DOTGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf("DOT", (DOTGen!=null?DOTGen.getText():null), DOTGen.getCharPositionInLine(), DOTGen.getLine());
                    			initElementValueReturnNode.getChildren().add(DOTGenLeaf);
                    		}
                    	    // Create a CST Leaf
                    		if(IDGen_1 != null) {
                    			Leaf IDGen_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("ID", (IDGen_1!=null?IDGen_1.getText():null), IDGen_1.getCharPositionInLine(), IDGen_1.getLine());
                    			initElementValueReturnNode.getChildren().add(IDGen_1Leaf);
                    		}
                    	    // Create a Token CST Leaf	
                    	    if(TK_0 != null) {
                    			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_0!=null?TK_0.getText():null), TK_0.getCharPositionInLine(), TK_0.getLine());
                    	 		initElementValueReturnNode.getChildren().add(TK_0Leaf);
                    	 	}
                    	    // Create a Token CST Leaf	
                    	    if(TK_1 != null) {
                    			Leaf TK_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_1!=null?TK_1.getText():null), TK_1.getCharPositionInLine(), TK_1.getLine());
                    	 		initElementValueReturnNode.getChildren().add(TK_1Leaf);
                    	 	}
                    	    // Create a CST Node
                    		if(list_paramGen != null) {
                    	        for(Iterator it = list_paramGen.iterator(); it.hasNext(); )  { 
                    	            Gra2MoLParser.param_return r = (Gra2MoLParser.param_return) it.next(); 
                    	            if(r != null && r.returnNode != null) {
                    	            	r.returnNode.setKind("param");
                    	            	initElementValueReturnNode.getChildren().add(r.returnNode);
                    	            } 
                    	        }
                    	    }
                    	    // Create a Token CST Leaf	
                    	    if(TK_2 != null) {
                    			Leaf TK_2Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_2!=null?TK_2.getText():null), TK_2.getCharPositionInLine(), TK_2.getLine());
                    	 		initElementValueReturnNode.getChildren().add(TK_2Leaf);
                    	 	}
                    		// Returns the Node with CST Leaves/Nodes
                    		retval.returnNode = initElementValueReturnNode;
                    	

                    }
                    break;
                case 5 :
                    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:1804:5: paramGen+= param PLUSGen= PLUS paramGen_1+= param (PLUSGen_1_List+= PLUS paramGen_2+= param )*
                    {
                    pushFollow(FOLLOW_param_in_initElementValue1827);
                    paramGen=param();

                    state._fsp--;

                    if (list_paramGen==null) list_paramGen=new ArrayList();
                    list_paramGen.add(paramGen);

                    PLUSGen=(Token)match(input,PLUS,FOLLOW_PLUS_in_initElementValue1832); 
                    pushFollow(FOLLOW_param_in_initElementValue1837);
                    paramGen_1=param();

                    state._fsp--;

                    if (list_paramGen_1==null) list_paramGen_1=new ArrayList();
                    list_paramGen_1.add(paramGen_1);

                    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:1804:54: (PLUSGen_1_List+= PLUS paramGen_2+= param )*
                    loop54:
                    do {
                        int alt54=2;
                        int LA54_0 = input.LA(1);

                        if ( (LA54_0==PLUS) ) {
                            alt54=1;
                        }


                        switch (alt54) {
                    	case 1 :
                    	    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:1804:56: PLUSGen_1_List+= PLUS paramGen_2+= param
                    	    {
                    	    PLUSGen_1_List=(Token)match(input,PLUS,FOLLOW_PLUS_in_initElementValue1843); 
                    	    if (list_PLUSGen_1_List==null) list_PLUSGen_1_List=new ArrayList();
                    	    list_PLUSGen_1_List.add(PLUSGen_1_List);

                    	    pushFollow(FOLLOW_param_in_initElementValue1848);
                    	    paramGen_2=param();

                    	    state._fsp--;

                    	    if (list_paramGen_2==null) list_paramGen_2=new ArrayList();
                    	    list_paramGen_2.add(paramGen_2);


                    	    }
                    	    break;

                    	default :
                    	    break loop54;
                        }
                    } while (true);


                    		// Create return CST Node
                    		Node initElementValueReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                    		initElementValueReturnNode.setKind("initElementValue");
                    	    // Create a CST Node
                    		if(list_paramGen != null) {
                    	        for(Iterator it = list_paramGen.iterator(); it.hasNext(); )  { 
                    	            Gra2MoLParser.param_return r = (Gra2MoLParser.param_return) it.next(); 
                    	            if(r != null && r.returnNode != null) {
                    	            	r.returnNode.setKind("param");
                    	            	initElementValueReturnNode.getChildren().add(r.returnNode);
                    	            } 
                    	        }
                    	    }
                    	    // Create a CST Leaf
                    		if(PLUSGen != null) {
                    			Leaf PLUSGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf("PLUS", (PLUSGen!=null?PLUSGen.getText():null), PLUSGen.getCharPositionInLine(), PLUSGen.getLine());
                    			initElementValueReturnNode.getChildren().add(PLUSGenLeaf);
                    		}
                    	    // Create a CST Node
                    		if(list_paramGen_1 != null) {
                    	        for(Iterator it = list_paramGen_1.iterator(); it.hasNext(); )  { 
                    	            Gra2MoLParser.param_return r = (Gra2MoLParser.param_return) it.next(); 
                    	            if(r != null && r.returnNode != null) {
                    	            	r.returnNode.setKind("param");
                    	            	initElementValueReturnNode.getChildren().add(r.returnNode);
                    	            } 
                    	        }
                    	    }

                    		// Create a special CST Node for terminal PLUSGen_1_List aggregation
                    		if(list_PLUSGen_1_List != null) {
                    	    for(int pos = 0; pos < list_PLUSGen_1_List.size(); pos++ )  { 
                    		// Terminal extractor
                    	    if(list_PLUSGen_1_List != null) {
                    		    Token t = (Token) list_PLUSGen_1_List.get(pos); 
                    		    Leaf PLUSGen_1_ListLeaf = CSTFactoryImpl.eINSTANCE.createLeaf("PLUS", t.getText(), t.getCharPositionInLine(), t.getLine());
                    			initElementValueReturnNode.getChildren().add(PLUSGen_1_ListLeaf);
                    		}
                    		// No Terminal extractor
                    	    if(list_paramGen_2 != null) {		
                    	    	Gra2MoLParser.param_return r = (Gra2MoLParser.param_return) list_paramGen_2.get(pos); 
                    	    	if(r != null && r.returnNode != null) {
                    	        	r.returnNode.setKind("param");
                    	    		initElementValueReturnNode.getChildren().add(r.returnNode);
                    	    	} 
                    		}
                    		}
                    		}

                    		// Returns the Node with CST Leaves/Nodes
                    		retval.returnNode = initElementValueReturnNode;
                    	

                    }
                    break;
                case 6 :
                    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:1858:5: TK_0= 'new' normalNameGen+= normalName
                    {
                    TK_0=(Token)match(input,75,FOLLOW_75_in_initElementValue1863); 
                    pushFollow(FOLLOW_normalName_in_initElementValue1868);
                    normalNameGen=normalName();

                    state._fsp--;

                    if (list_normalNameGen==null) list_normalNameGen=new ArrayList();
                    list_normalNameGen.add(normalNameGen);


                    		// Create return CST Node
                    		Node initElementValueReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                    		initElementValueReturnNode.setKind("initElementValue");
                    	    // Create a Token CST Leaf	
                    	    if(TK_0 != null) {
                    			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_0!=null?TK_0.getText():null), TK_0.getCharPositionInLine(), TK_0.getLine());
                    	 		initElementValueReturnNode.getChildren().add(TK_0Leaf);
                    	 	}
                    	    // Create a CST Node
                    		if(list_normalNameGen != null) {
                    	        for(Iterator it = list_normalNameGen.iterator(); it.hasNext(); )  { 
                    	            Gra2MoLParser.normalName_return r = (Gra2MoLParser.normalName_return) it.next(); 
                    	            if(r != null && r.returnNode != null) {
                    	            	r.returnNode.setKind("normalName");
                    	            	initElementValueReturnNode.getChildren().add(r.returnNode);
                    	            } 
                    	        }
                    	    }
                    		// Returns the Node with CST Leaves/Nodes
                    		retval.returnNode = initElementValueReturnNode;
                    	

                    }
                    break;
                case 7 :
                    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:1881:5: TK_0= 'map' IDGen= ID TK_1= '(' paramGen+= param TK_2= ')'
                    {
                    TK_0=(Token)match(input,76,FOLLOW_76_in_initElementValue1880); 
                    IDGen=(Token)match(input,ID,FOLLOW_ID_in_initElementValue1885); 
                    TK_1=(Token)match(input,35,FOLLOW_35_in_initElementValue1890); 
                    pushFollow(FOLLOW_param_in_initElementValue1895);
                    paramGen=param();

                    state._fsp--;

                    if (list_paramGen==null) list_paramGen=new ArrayList();
                    list_paramGen.add(paramGen);

                    TK_2=(Token)match(input,36,FOLLOW_36_in_initElementValue1901); 

                    		// Create return CST Node
                    		Node initElementValueReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                    		initElementValueReturnNode.setKind("initElementValue");
                    	    // Create a Token CST Leaf	
                    	    if(TK_0 != null) {
                    			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_0!=null?TK_0.getText():null), TK_0.getCharPositionInLine(), TK_0.getLine());
                    	 		initElementValueReturnNode.getChildren().add(TK_0Leaf);
                    	 	}
                    	    // Create a CST Leaf
                    		if(IDGen != null) {
                    			Leaf IDGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf("ID", (IDGen!=null?IDGen.getText():null), IDGen.getCharPositionInLine(), IDGen.getLine());
                    			initElementValueReturnNode.getChildren().add(IDGenLeaf);
                    		}
                    	    // Create a Token CST Leaf	
                    	    if(TK_1 != null) {
                    			Leaf TK_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_1!=null?TK_1.getText():null), TK_1.getCharPositionInLine(), TK_1.getLine());
                    	 		initElementValueReturnNode.getChildren().add(TK_1Leaf);
                    	 	}
                    	    // Create a CST Node
                    		if(list_paramGen != null) {
                    	        for(Iterator it = list_paramGen.iterator(); it.hasNext(); )  { 
                    	            Gra2MoLParser.param_return r = (Gra2MoLParser.param_return) it.next(); 
                    	            if(r != null && r.returnNode != null) {
                    	            	r.returnNode.setKind("param");
                    	            	initElementValueReturnNode.getChildren().add(r.returnNode);
                    	            } 
                    	        }
                    	    }
                    	    // Create a Token CST Leaf	
                    	    if(TK_2 != null) {
                    			Leaf TK_2Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_2!=null?TK_2.getText():null), TK_2.getCharPositionInLine(), TK_2.getLine());
                    	 		initElementValueReturnNode.getChildren().add(TK_2Leaf);
                    	 	}
                    		// Returns the Node with CST Leaves/Nodes
                    		retval.returnNode = initElementValueReturnNode;
                    	

                    }
                    break;
                case 8 :
                    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:1919:5: TK_0= 'extract' IDGen= ID
                    {
                    TK_0=(Token)match(input,77,FOLLOW_77_in_initElementValue1913); 
                    IDGen=(Token)match(input,ID,FOLLOW_ID_in_initElementValue1918); 

                    		// Create return CST Node
                    		Node initElementValueReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                    		initElementValueReturnNode.setKind("initElementValue");
                    	    // Create a Token CST Leaf	
                    	    if(TK_0 != null) {
                    			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_0!=null?TK_0.getText():null), TK_0.getCharPositionInLine(), TK_0.getLine());
                    	 		initElementValueReturnNode.getChildren().add(TK_0Leaf);
                    	 	}
                    	    // Create a CST Leaf
                    		if(IDGen != null) {
                    			Leaf IDGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf("ID", (IDGen!=null?IDGen.getText():null), IDGen.getCharPositionInLine(), IDGen.getLine());
                    			initElementValueReturnNode.getChildren().add(IDGenLeaf);
                    		}
                    		// Returns the Node with CST Leaves/Nodes
                    		retval.returnNode = initElementValueReturnNode;
                    	

                    }
                    break;
                case 9 :
                    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:1937:5: TK_0= 'extractID' IDGen= ID
                    {
                    TK_0=(Token)match(input,78,FOLLOW_78_in_initElementValue1931); 
                    IDGen=(Token)match(input,ID,FOLLOW_ID_in_initElementValue1936); 

                    		// Create return CST Node
                    		Node initElementValueReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                    		initElementValueReturnNode.setKind("initElementValue");
                    	    // Create a Token CST Leaf	
                    	    if(TK_0 != null) {
                    			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_0!=null?TK_0.getText():null), TK_0.getCharPositionInLine(), TK_0.getLine());
                    	 		initElementValueReturnNode.getChildren().add(TK_0Leaf);
                    	 	}
                    	    // Create a CST Leaf
                    		if(IDGen != null) {
                    			Leaf IDGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf("ID", (IDGen!=null?IDGen.getText():null), IDGen.getCharPositionInLine(), IDGen.getLine());
                    			initElementValueReturnNode.getChildren().add(IDGenLeaf);
                    		}
                    		// Returns the Node with CST Leaves/Nodes
                    		retval.returnNode = initElementValueReturnNode;
                    	

                    }
                    break;
                case 10 :
                    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:1955:5: TK_0= 'execute' IDGen= ID IDGen_1= ID
                    {
                    TK_0=(Token)match(input,79,FOLLOW_79_in_initElementValue1951); 
                    IDGen=(Token)match(input,ID,FOLLOW_ID_in_initElementValue1956); 
                    IDGen_1=(Token)match(input,ID,FOLLOW_ID_in_initElementValue1961); 

                    		// Create return CST Node
                    		Node initElementValueReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                    		initElementValueReturnNode.setKind("initElementValue");
                    	    // Create a Token CST Leaf	
                    	    if(TK_0 != null) {
                    			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_0!=null?TK_0.getText():null), TK_0.getCharPositionInLine(), TK_0.getLine());
                    	 		initElementValueReturnNode.getChildren().add(TK_0Leaf);
                    	 	}
                    	    // Create a CST Leaf
                    		if(IDGen != null) {
                    			Leaf IDGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf("ID", (IDGen!=null?IDGen.getText():null), IDGen.getCharPositionInLine(), IDGen.getLine());
                    			initElementValueReturnNode.getChildren().add(IDGenLeaf);
                    		}
                    	    // Create a CST Leaf
                    		if(IDGen_1 != null) {
                    			Leaf IDGen_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("ID", (IDGen_1!=null?IDGen_1.getText():null), IDGen_1.getCharPositionInLine(), IDGen_1.getLine());
                    			initElementValueReturnNode.getChildren().add(IDGen_1Leaf);
                    		}
                    		// Returns the Node with CST Leaves/Nodes
                    		retval.returnNode = initElementValueReturnNode;
                    	

                    }
                    break;
                case 11 :
                    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:1978:5: TK_0= 'removeQuotes' IDGen= ID DOTGen= DOT IDGen_1= ID (TK_1= '[' paramGen+= param TK_2= ']' )?
                    {
                    TK_0=(Token)match(input,80,FOLLOW_80_in_initElementValue1974); 
                    IDGen=(Token)match(input,ID,FOLLOW_ID_in_initElementValue1979); 
                    DOTGen=(Token)match(input,DOT,FOLLOW_DOT_in_initElementValue1984); 
                    IDGen_1=(Token)match(input,ID,FOLLOW_ID_in_initElementValue1989); 
                    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:1978:59: (TK_1= '[' paramGen+= param TK_2= ']' )?
                    int alt55=2;
                    int LA55_0 = input.LA(1);

                    if ( (LA55_0==44) ) {
                        alt55=1;
                    }
                    switch (alt55) {
                        case 1 :
                            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:1978:61: TK_1= '[' paramGen+= param TK_2= ']'
                            {
                            TK_1=(Token)match(input,44,FOLLOW_44_in_initElementValue1995); 
                            pushFollow(FOLLOW_param_in_initElementValue2000);
                            paramGen=param();

                            state._fsp--;

                            if (list_paramGen==null) list_paramGen=new ArrayList();
                            list_paramGen.add(paramGen);

                            TK_2=(Token)match(input,46,FOLLOW_46_in_initElementValue2005); 

                            }
                            break;

                    }


                    		// Create return CST Node
                    		Node initElementValueReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                    		initElementValueReturnNode.setKind("initElementValue");
                    	    // Create a Token CST Leaf	
                    	    if(TK_0 != null) {
                    			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_0!=null?TK_0.getText():null), TK_0.getCharPositionInLine(), TK_0.getLine());
                    	 		initElementValueReturnNode.getChildren().add(TK_0Leaf);
                    	 	}
                    	    // Create a CST Leaf
                    		if(IDGen != null) {
                    			Leaf IDGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf("ID", (IDGen!=null?IDGen.getText():null), IDGen.getCharPositionInLine(), IDGen.getLine());
                    			initElementValueReturnNode.getChildren().add(IDGenLeaf);
                    		}
                    	    // Create a CST Leaf
                    		if(DOTGen != null) {
                    			Leaf DOTGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf("DOT", (DOTGen!=null?DOTGen.getText():null), DOTGen.getCharPositionInLine(), DOTGen.getLine());
                    			initElementValueReturnNode.getChildren().add(DOTGenLeaf);
                    		}
                    	    // Create a CST Leaf
                    		if(IDGen_1 != null) {
                    			Leaf IDGen_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("ID", (IDGen_1!=null?IDGen_1.getText():null), IDGen_1.getCharPositionInLine(), IDGen_1.getLine());
                    			initElementValueReturnNode.getChildren().add(IDGen_1Leaf);
                    		}
                    	    // Create a Token CST Leaf	
                    	    if(TK_1 != null) {
                    			Leaf TK_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_1!=null?TK_1.getText():null), TK_1.getCharPositionInLine(), TK_1.getLine());
                    	 		initElementValueReturnNode.getChildren().add(TK_1Leaf);
                    	 	}
                    	    // Create a CST Node
                    		if(list_paramGen != null) {
                    	        for(Iterator it = list_paramGen.iterator(); it.hasNext(); )  { 
                    	            Gra2MoLParser.param_return r = (Gra2MoLParser.param_return) it.next(); 
                    	            if(r != null && r.returnNode != null) {
                    	            	r.returnNode.setKind("param");
                    	            	initElementValueReturnNode.getChildren().add(r.returnNode);
                    	            } 
                    	        }
                    	    }
                    	    // Create a Token CST Leaf	
                    	    if(TK_2 != null) {
                    			Leaf TK_2Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_2!=null?TK_2.getText():null), TK_2.getCharPositionInLine(), TK_2.getLine());
                    	 		initElementValueReturnNode.getChildren().add(TK_2Leaf);
                    	 	}
                    		// Returns the Node with CST Leaves/Nodes
                    		retval.returnNode = initElementValueReturnNode;
                    	

                    }
                    break;
                case 12 :
                    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:2026:5: TK_0= 'count' IDGen= ID
                    {
                    TK_0=(Token)match(input,81,FOLLOW_81_in_initElementValue2020); 
                    IDGen=(Token)match(input,ID,FOLLOW_ID_in_initElementValue2025); 

                    		// Create return CST Node
                    		Node initElementValueReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                    		initElementValueReturnNode.setKind("initElementValue");
                    	    // Create a Token CST Leaf	
                    	    if(TK_0 != null) {
                    			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_0!=null?TK_0.getText():null), TK_0.getCharPositionInLine(), TK_0.getLine());
                    	 		initElementValueReturnNode.getChildren().add(TK_0Leaf);
                    	 	}
                    	    // Create a CST Leaf
                    		if(IDGen != null) {
                    			Leaf IDGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf("ID", (IDGen!=null?IDGen.getText():null), IDGen.getCharPositionInLine(), IDGen.getLine());
                    			initElementValueReturnNode.getChildren().add(IDGenLeaf);
                    		}
                    		// Returns the Node with CST Leaves/Nodes
                    		retval.returnNode = initElementValueReturnNode;
                    	

                    }
                    break;
                case 13 :
                    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:2044:5: TK_0= 'convertHexToString' IDGen= ID DOTGen= DOT IDGen_1= ID
                    {
                    TK_0=(Token)match(input,82,FOLLOW_82_in_initElementValue2038); 
                    IDGen=(Token)match(input,ID,FOLLOW_ID_in_initElementValue2043); 
                    DOTGen=(Token)match(input,DOT,FOLLOW_DOT_in_initElementValue2048); 
                    IDGen_1=(Token)match(input,ID,FOLLOW_ID_in_initElementValue2053); 

                    		// Create return CST Node
                    		Node initElementValueReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                    		initElementValueReturnNode.setKind("initElementValue");
                    	    // Create a Token CST Leaf	
                    	    if(TK_0 != null) {
                    			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_0!=null?TK_0.getText():null), TK_0.getCharPositionInLine(), TK_0.getLine());
                    	 		initElementValueReturnNode.getChildren().add(TK_0Leaf);
                    	 	}
                    	    // Create a CST Leaf
                    		if(IDGen != null) {
                    			Leaf IDGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf("ID", (IDGen!=null?IDGen.getText():null), IDGen.getCharPositionInLine(), IDGen.getLine());
                    			initElementValueReturnNode.getChildren().add(IDGenLeaf);
                    		}
                    	    // Create a CST Leaf
                    		if(DOTGen != null) {
                    			Leaf DOTGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf("DOT", (DOTGen!=null?DOTGen.getText():null), DOTGen.getCharPositionInLine(), DOTGen.getLine());
                    			initElementValueReturnNode.getChildren().add(DOTGenLeaf);
                    		}
                    	    // Create a CST Leaf
                    		if(IDGen_1 != null) {
                    			Leaf IDGen_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("ID", (IDGen_1!=null?IDGen_1.getText():null), IDGen_1.getCharPositionInLine(), IDGen_1.getLine());
                    			initElementValueReturnNode.getChildren().add(IDGen_1Leaf);
                    		}
                    		// Returns the Node with CST Leaves/Nodes
                    		retval.returnNode = initElementValueReturnNode;
                    	

                    }
                    break;
                case 14 :
                    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:2072:5: TK_0= 'ext' normalNameGen+= normalName (TK_1= '(' paramGen+= param (TK_2= ',' paramGen_1+= param )? TK_3= ')' )?
                    {
                    TK_0=(Token)match(input,83,FOLLOW_83_in_initElementValue2068); 
                    pushFollow(FOLLOW_normalName_in_initElementValue2073);
                    normalNameGen=normalName();

                    state._fsp--;

                    if (list_normalNameGen==null) list_normalNameGen=new ArrayList();
                    list_normalNameGen.add(normalNameGen);

                    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:2072:43: (TK_1= '(' paramGen+= param (TK_2= ',' paramGen_1+= param )? TK_3= ')' )?
                    int alt57=2;
                    int LA57_0 = input.LA(1);

                    if ( (LA57_0==35) ) {
                        alt57=1;
                    }
                    switch (alt57) {
                        case 1 :
                            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:2072:45: TK_1= '(' paramGen+= param (TK_2= ',' paramGen_1+= param )? TK_3= ')'
                            {
                            TK_1=(Token)match(input,35,FOLLOW_35_in_initElementValue2079); 
                            pushFollow(FOLLOW_param_in_initElementValue2084);
                            paramGen=param();

                            state._fsp--;

                            if (list_paramGen==null) list_paramGen=new ArrayList();
                            list_paramGen.add(paramGen);

                            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:2072:71: (TK_2= ',' paramGen_1+= param )?
                            int alt56=2;
                            int LA56_0 = input.LA(1);

                            if ( (LA56_0==30) ) {
                                alt56=1;
                            }
                            switch (alt56) {
                                case 1 :
                                    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:2072:73: TK_2= ',' paramGen_1+= param
                                    {
                                    TK_2=(Token)match(input,30,FOLLOW_30_in_initElementValue2090); 
                                    pushFollow(FOLLOW_param_in_initElementValue2095);
                                    paramGen_1=param();

                                    state._fsp--;

                                    if (list_paramGen_1==null) list_paramGen_1=new ArrayList();
                                    list_paramGen_1.add(paramGen_1);


                                    }
                                    break;

                            }

                            TK_3=(Token)match(input,36,FOLLOW_36_in_initElementValue2102); 

                            }
                            break;

                    }


                    		// Create return CST Node
                    		Node initElementValueReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                    		initElementValueReturnNode.setKind("initElementValue");
                    	    // Create a Token CST Leaf	
                    	    if(TK_0 != null) {
                    			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_0!=null?TK_0.getText():null), TK_0.getCharPositionInLine(), TK_0.getLine());
                    	 		initElementValueReturnNode.getChildren().add(TK_0Leaf);
                    	 	}
                    	    // Create a CST Node
                    		if(list_normalNameGen != null) {
                    	        for(Iterator it = list_normalNameGen.iterator(); it.hasNext(); )  { 
                    	            Gra2MoLParser.normalName_return r = (Gra2MoLParser.normalName_return) it.next(); 
                    	            if(r != null && r.returnNode != null) {
                    	            	r.returnNode.setKind("normalName");
                    	            	initElementValueReturnNode.getChildren().add(r.returnNode);
                    	            } 
                    	        }
                    	    }
                    	    // Create a Token CST Leaf	
                    	    if(TK_1 != null) {
                    			Leaf TK_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_1!=null?TK_1.getText():null), TK_1.getCharPositionInLine(), TK_1.getLine());
                    	 		initElementValueReturnNode.getChildren().add(TK_1Leaf);
                    	 	}
                    	    // Create a CST Node
                    		if(list_paramGen != null) {
                    	        for(Iterator it = list_paramGen.iterator(); it.hasNext(); )  { 
                    	            Gra2MoLParser.param_return r = (Gra2MoLParser.param_return) it.next(); 
                    	            if(r != null && r.returnNode != null) {
                    	            	r.returnNode.setKind("param");
                    	            	initElementValueReturnNode.getChildren().add(r.returnNode);
                    	            } 
                    	        }
                    	    }
                    	    // Create a Token CST Leaf	
                    	    if(TK_2 != null) {
                    			Leaf TK_2Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_2!=null?TK_2.getText():null), TK_2.getCharPositionInLine(), TK_2.getLine());
                    	 		initElementValueReturnNode.getChildren().add(TK_2Leaf);
                    	 	}
                    	    // Create a CST Node
                    		if(list_paramGen_1 != null) {
                    	        for(Iterator it = list_paramGen_1.iterator(); it.hasNext(); )  { 
                    	            Gra2MoLParser.param_return r = (Gra2MoLParser.param_return) it.next(); 
                    	            if(r != null && r.returnNode != null) {
                    	            	r.returnNode.setKind("param");
                    	            	initElementValueReturnNode.getChildren().add(r.returnNode);
                    	            } 
                    	        }
                    	    }
                    	    // Create a Token CST Leaf	
                    	    if(TK_3 != null) {
                    			Leaf TK_3Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_3!=null?TK_3.getText():null), TK_3.getCharPositionInLine(), TK_3.getLine());
                    	 		initElementValueReturnNode.getChildren().add(TK_3Leaf);
                    	 	}
                    		// Returns the Node with CST Leaves/Nodes
                    		retval.returnNode = initElementValueReturnNode;
                    	

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
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "param"
    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:2132:1: param returns [Node returnNode] : (id1= ID (TK_0= '[' pExt1+= paramExtension TK_1= ']' )? DOTGen= DOT id2= ID (TK_2= '[' pExt2+= paramExtension TK_3= ']' )? | IDGen= ID | DQVALUEGen= DQVALUE | NUMBERGen= NUMBER );
    public final Gra2MoLParser.param_return param() throws RecognitionException {
        Gra2MoLParser.param_return retval = new Gra2MoLParser.param_return();
        retval.start = input.LT(1);

        Token id1=null;
        Token TK_0=null;
        Token TK_1=null;
        Token DOTGen=null;
        Token id2=null;
        Token TK_2=null;
        Token TK_3=null;
        Token IDGen=null;
        Token DQVALUEGen=null;
        Token NUMBERGen=null;
        List list_pExt1=null;
        List list_pExt2=null;
        RuleReturnScope pExt1 = null;
        RuleReturnScope pExt2 = null;
        try {
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:2133:1: (id1= ID (TK_0= '[' pExt1+= paramExtension TK_1= ']' )? DOTGen= DOT id2= ID (TK_2= '[' pExt2+= paramExtension TK_3= ']' )? | IDGen= ID | DQVALUEGen= DQVALUE | NUMBERGen= NUMBER )
            int alt61=4;
            switch ( input.LA(1) ) {
            case ID:
                {
                int LA61_1 = input.LA(2);

                if ( (LA61_1==DOT||LA61_1==44) ) {
                    alt61=1;
                }
                else if ( (LA61_1==PLUS||LA61_1==27||LA61_1==30||LA61_1==36||LA61_1==46) ) {
                    alt61=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 61, 1, input);

                    throw nvae;
                }
                }
                break;
            case DQVALUE:
                {
                alt61=3;
                }
                break;
            case NUMBER:
                {
                alt61=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 61, 0, input);

                throw nvae;
            }

            switch (alt61) {
                case 1 :
                    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:2133:3: id1= ID (TK_0= '[' pExt1+= paramExtension TK_1= ']' )? DOTGen= DOT id2= ID (TK_2= '[' pExt2+= paramExtension TK_3= ']' )?
                    {
                    id1=(Token)match(input,ID,FOLLOW_ID_in_param2129); 
                    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:2133:10: (TK_0= '[' pExt1+= paramExtension TK_1= ']' )?
                    int alt59=2;
                    int LA59_0 = input.LA(1);

                    if ( (LA59_0==44) ) {
                        alt59=1;
                    }
                    switch (alt59) {
                        case 1 :
                            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:2133:12: TK_0= '[' pExt1+= paramExtension TK_1= ']'
                            {
                            TK_0=(Token)match(input,44,FOLLOW_44_in_param2135); 
                            pushFollow(FOLLOW_paramExtension_in_param2139);
                            pExt1=paramExtension();

                            state._fsp--;

                            if (list_pExt1==null) list_pExt1=new ArrayList();
                            list_pExt1.add(pExt1);

                            TK_1=(Token)match(input,46,FOLLOW_46_in_param2144); 

                            }
                            break;

                    }

                    DOTGen=(Token)match(input,DOT,FOLLOW_DOT_in_param2151); 
                    id2=(Token)match(input,ID,FOLLOW_ID_in_param2155); 
                    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:2133:74: (TK_2= '[' pExt2+= paramExtension TK_3= ']' )?
                    int alt60=2;
                    int LA60_0 = input.LA(1);

                    if ( (LA60_0==44) ) {
                        alt60=1;
                    }
                    switch (alt60) {
                        case 1 :
                            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:2133:76: TK_2= '[' pExt2+= paramExtension TK_3= ']'
                            {
                            TK_2=(Token)match(input,44,FOLLOW_44_in_param2161); 
                            pushFollow(FOLLOW_paramExtension_in_param2165);
                            pExt2=paramExtension();

                            state._fsp--;

                            if (list_pExt2==null) list_pExt2=new ArrayList();
                            list_pExt2.add(pExt2);

                            TK_3=(Token)match(input,46,FOLLOW_46_in_param2170); 

                            }
                            break;

                    }


                    		// Create return CST Node
                    		Node paramReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                    		paramReturnNode.setKind("param");
                    	    // Create a CST Leaf
                    		if(id1 != null) {
                    			Leaf id1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("id1", (id1!=null?id1.getText():null), id1.getCharPositionInLine(), id1.getLine());
                    			paramReturnNode.getChildren().add(id1Leaf);
                    		}
                    	    // Create a Token CST Leaf	
                    	    if(TK_0 != null) {
                    			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_0!=null?TK_0.getText():null), TK_0.getCharPositionInLine(), TK_0.getLine());
                    	 		paramReturnNode.getChildren().add(TK_0Leaf);
                    	 	}
                    	    // Create a CST Node
                    		if(list_pExt1 != null) {
                    	        for(Iterator it = list_pExt1.iterator(); it.hasNext(); )  { 
                    	            Gra2MoLParser.paramExtension_return r = (Gra2MoLParser.paramExtension_return) it.next(); 
                    	            if(r != null && r.returnNode != null) {
                    	            	r.returnNode.setKind("pExt1");
                    	            	paramReturnNode.getChildren().add(r.returnNode);
                    	            } 
                    	        }
                    	    }
                    	    // Create a Token CST Leaf	
                    	    if(TK_1 != null) {
                    			Leaf TK_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_1!=null?TK_1.getText():null), TK_1.getCharPositionInLine(), TK_1.getLine());
                    	 		paramReturnNode.getChildren().add(TK_1Leaf);
                    	 	}
                    	    // Create a CST Leaf
                    		if(DOTGen != null) {
                    			Leaf DOTGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf("DOT", (DOTGen!=null?DOTGen.getText():null), DOTGen.getCharPositionInLine(), DOTGen.getLine());
                    			paramReturnNode.getChildren().add(DOTGenLeaf);
                    		}
                    	    // Create a CST Leaf
                    		if(id2 != null) {
                    			Leaf id2Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("id2", (id2!=null?id2.getText():null), id2.getCharPositionInLine(), id2.getLine());
                    			paramReturnNode.getChildren().add(id2Leaf);
                    		}
                    	    // Create a Token CST Leaf	
                    	    if(TK_2 != null) {
                    			Leaf TK_2Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_2!=null?TK_2.getText():null), TK_2.getCharPositionInLine(), TK_2.getLine());
                    	 		paramReturnNode.getChildren().add(TK_2Leaf);
                    	 	}
                    	    // Create a CST Node
                    		if(list_pExt2 != null) {
                    	        for(Iterator it = list_pExt2.iterator(); it.hasNext(); )  { 
                    	            Gra2MoLParser.paramExtension_return r = (Gra2MoLParser.paramExtension_return) it.next(); 
                    	            if(r != null && r.returnNode != null) {
                    	            	r.returnNode.setKind("pExt2");
                    	            	paramReturnNode.getChildren().add(r.returnNode);
                    	            } 
                    	        }
                    	    }
                    	    // Create a Token CST Leaf	
                    	    if(TK_3 != null) {
                    			Leaf TK_3Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_3!=null?TK_3.getText():null), TK_3.getCharPositionInLine(), TK_3.getLine());
                    	 		paramReturnNode.getChildren().add(TK_3Leaf);
                    	 	}
                    		// Returns the Node with CST Leaves/Nodes
                    		retval.returnNode = paramReturnNode;
                    	

                    }
                    break;
                case 2 :
                    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:2196:5: IDGen= ID
                    {
                    IDGen=(Token)match(input,ID,FOLLOW_ID_in_param2185); 

                    		// Create return CST Node
                    		Node paramReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                    		paramReturnNode.setKind("param");
                    	    // Create a CST Leaf
                    		if(IDGen != null) {
                    			Leaf IDGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf("ID", (IDGen!=null?IDGen.getText():null), IDGen.getCharPositionInLine(), IDGen.getLine());
                    			paramReturnNode.getChildren().add(IDGenLeaf);
                    		}
                    		// Returns the Node with CST Leaves/Nodes
                    		retval.returnNode = paramReturnNode;
                    	

                    }
                    break;
                case 3 :
                    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:2209:5: DQVALUEGen= DQVALUE
                    {
                    DQVALUEGen=(Token)match(input,DQVALUE,FOLLOW_DQVALUE_in_param2198); 

                    		// Create return CST Node
                    		Node paramReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                    		paramReturnNode.setKind("param");
                    	    // Create a CST Leaf
                    		if(DQVALUEGen != null) {
                    			Leaf DQVALUEGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf("DQVALUE", (DQVALUEGen!=null?DQVALUEGen.getText():null), DQVALUEGen.getCharPositionInLine(), DQVALUEGen.getLine());
                    			paramReturnNode.getChildren().add(DQVALUEGenLeaf);
                    		}
                    		// Returns the Node with CST Leaves/Nodes
                    		retval.returnNode = paramReturnNode;
                    	

                    }
                    break;
                case 4 :
                    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:2222:6: NUMBERGen= NUMBER
                    {
                    NUMBERGen=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_param2212); 

                    		// Create return CST Node
                    		Node paramReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                    		paramReturnNode.setKind("param");
                    	    // Create a CST Leaf
                    		if(NUMBERGen != null) {
                    			Leaf NUMBERGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf("NUMBER", (NUMBERGen!=null?NUMBERGen.getText():null), NUMBERGen.getCharPositionInLine(), NUMBERGen.getLine());
                    			paramReturnNode.getChildren().add(NUMBERGenLeaf);
                    		}
                    		// Returns the Node with CST Leaves/Nodes
                    		retval.returnNode = paramReturnNode;
                    	

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

    public static class paramExtension_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "paramExtension"
    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:2237:1: paramExtension returns [Node returnNode] : (TK_0= 'last' | NUMBERGen= NUMBER | ext1= ID );
    public final Gra2MoLParser.paramExtension_return paramExtension() throws RecognitionException {
        Gra2MoLParser.paramExtension_return retval = new Gra2MoLParser.paramExtension_return();
        retval.start = input.LT(1);

        Token TK_0=null;
        Token NUMBERGen=null;
        Token ext1=null;

        try {
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:2238:1: (TK_0= 'last' | NUMBERGen= NUMBER | ext1= ID )
            int alt62=3;
            switch ( input.LA(1) ) {
            case 57:
                {
                alt62=1;
                }
                break;
            case NUMBER:
                {
                alt62=2;
                }
                break;
            case ID:
                {
                alt62=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 62, 0, input);

                throw nvae;
            }

            switch (alt62) {
                case 1 :
                    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:2238:4: TK_0= 'last'
                    {
                    TK_0=(Token)match(input,57,FOLLOW_57_in_paramExtension2236); 

                    		// Create return CST Node
                    		Node paramExtensionReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                    		paramExtensionReturnNode.setKind("paramExtension");
                    	    // Create a Token CST Leaf	
                    	    if(TK_0 != null) {
                    			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_0!=null?TK_0.getText():null), TK_0.getCharPositionInLine(), TK_0.getLine());
                    	 		paramExtensionReturnNode.getChildren().add(TK_0Leaf);
                    	 	}
                    		// Returns the Node with CST Leaves/Nodes
                    		retval.returnNode = paramExtensionReturnNode;
                    	

                    }
                    break;
                case 2 :
                    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:2251:5: NUMBERGen= NUMBER
                    {
                    NUMBERGen=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_paramExtension2248); 

                    		// Create return CST Node
                    		Node paramExtensionReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                    		paramExtensionReturnNode.setKind("paramExtension");
                    	    // Create a CST Leaf
                    		if(NUMBERGen != null) {
                    			Leaf NUMBERGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf("NUMBER", (NUMBERGen!=null?NUMBERGen.getText():null), NUMBERGen.getCharPositionInLine(), NUMBERGen.getLine());
                    			paramExtensionReturnNode.getChildren().add(NUMBERGenLeaf);
                    		}
                    		// Returns the Node with CST Leaves/Nodes
                    		retval.returnNode = paramExtensionReturnNode;
                    	

                    }
                    break;
                case 3 :
                    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:2264:4: ext1= ID
                    {
                    ext1=(Token)match(input,ID,FOLLOW_ID_in_paramExtension2260); 

                    		// Create return CST Node
                    		Node paramExtensionReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                    		paramExtensionReturnNode.setKind("paramExtension");
                    	    // Create a CST Leaf
                    		if(ext1 != null) {
                    			Leaf ext1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("ext1", (ext1!=null?ext1.getText():null), ext1.getCharPositionInLine(), ext1.getLine());
                    			paramExtensionReturnNode.getChildren().add(ext1Leaf);
                    		}
                    		// Returns the Node with CST Leaves/Nodes
                    		retval.returnNode = paramExtensionReturnNode;
                    	

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
    // $ANTLR end "paramExtension"

    public static class id_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "id"
    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:2279:1: id returns [Node returnNode] : (IDESCGen= IDESC | IDGen= ID );
    public final Gra2MoLParser.id_return id() throws RecognitionException {
        Gra2MoLParser.id_return retval = new Gra2MoLParser.id_return();
        retval.start = input.LT(1);

        Token IDESCGen=null;
        Token IDGen=null;

        try {
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:2280:1: (IDESCGen= IDESC | IDGen= ID )
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==IDESC) ) {
                alt63=1;
            }
            else if ( (LA63_0==ID) ) {
                alt63=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 63, 0, input);

                throw nvae;
            }
            switch (alt63) {
                case 1 :
                    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:2280:4: IDESCGen= IDESC
                    {
                    IDESCGen=(Token)match(input,IDESC,FOLLOW_IDESC_in_id2282); 

                    		// Create return CST Node
                    		Node idReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                    		idReturnNode.setKind("id");
                    	    // Create a CST Leaf
                    		if(IDESCGen != null) {
                    			Leaf IDESCGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf("IDESC", (IDESCGen!=null?IDESCGen.getText():null), IDESCGen.getCharPositionInLine(), IDESCGen.getLine());
                    			idReturnNode.getChildren().add(IDESCGenLeaf);
                    		}
                    		// Returns the Node with CST Leaves/Nodes
                    		retval.returnNode = idReturnNode;
                    	

                    }
                    break;
                case 2 :
                    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g:2293:5: IDGen= ID
                    {
                    IDGen=(Token)match(input,ID,FOLLOW_ID_in_id2295); 

                    		// Create return CST Node
                    		Node idReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                    		idReturnNode.setKind("id");
                    	    // Create a CST Leaf
                    		if(IDGen != null) {
                    			Leaf IDGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf("ID", (IDGen!=null?IDGen.getText():null), IDGen.getCharPositionInLine(), IDGen.getLine());
                    			idReturnNode.getChildren().add(IDGenLeaf);
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
    // $ANTLR end "id"

    // Delegated rules


    protected DFA58 dfa58 = new DFA58(this);
    static final String DFA58_eotS =
        "\30\uffff";
    static final String DFA58_eofS =
        "\30\uffff";
    static final String DFA58_minS =
        "\1\4\1\7\2\22\11\uffff\1\5\4\uffff\1\22\1\uffff\1\4\1\56\1\7\1\22";
    static final String DFA58_maxS =
        "\1\123\1\54\2\33\11\uffff\1\5\4\uffff\1\112\1\uffff\1\71\2\56\1"+
        "\33";
    static final String DFA58_acceptS =
        "\4\uffff\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\uffff\1\5"+
        "\1\1\1\2\1\3\1\uffff\1\4\4\uffff";
    static final String DFA58_specialS =
        "\30\uffff}>";
    static final String[] DFA58_transitionS = {
            "\1\2\1\1\3\uffff\1\3\101\uffff\1\4\1\5\1\6\1\7\1\10\1\11\1\12"+
            "\1\13\1\14",
            "\1\15\12\uffff\1\16\10\uffff\1\17\20\uffff\1\16",
            "\1\16\10\uffff\1\20",
            "\1\16\10\uffff\1\21",
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
            "\1\16\10\uffff\1\23\20\uffff\1\24\35\uffff\1\23",
            "",
            "\1\23\1\26\3\uffff\1\25\57\uffff\1\16",
            "\1\27",
            "\1\23\44\uffff\1\23\1\uffff\1\27",
            "\1\16\10\uffff\1\23"
    };

    static final short[] DFA58_eot = DFA.unpackEncodedString(DFA58_eotS);
    static final short[] DFA58_eof = DFA.unpackEncodedString(DFA58_eofS);
    static final char[] DFA58_min = DFA.unpackEncodedStringToUnsignedChars(DFA58_minS);
    static final char[] DFA58_max = DFA.unpackEncodedStringToUnsignedChars(DFA58_maxS);
    static final short[] DFA58_accept = DFA.unpackEncodedString(DFA58_acceptS);
    static final short[] DFA58_special = DFA.unpackEncodedString(DFA58_specialS);
    static final short[][] DFA58_transition;

    static {
        int numStates = DFA58_transitionS.length;
        DFA58_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA58_transition[i] = DFA.unpackEncodedString(DFA58_transitionS[i]);
        }
    }

    class DFA58 extends DFA {

        public DFA58(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 58;
            this.eot = DFA58_eot;
            this.eof = DFA58_eof;
            this.min = DFA58_min;
            this.max = DFA58_max;
            this.accept = DFA58_accept;
            this.special = DFA58_special;
            this.transition = DFA58_transition;
        }
        public String getDescription() {
            return "1716:1: initElementValue returns [Node returnNode] : (IDGen= ID | DQVALUEGen= DQVALUE | NUMBERGen= NUMBER | IDGen= ID DOTGen= DOT IDGen_1= ID (TK_0= '*' | TK_1= '[' paramGen+= param TK_2= ']' )? | paramGen+= param PLUSGen= PLUS paramGen_1+= param (PLUSGen_1_List+= PLUS paramGen_2+= param )* | TK_0= 'new' normalNameGen+= normalName | TK_0= 'map' IDGen= ID TK_1= '(' paramGen+= param TK_2= ')' | TK_0= 'extract' IDGen= ID | TK_0= 'extractID' IDGen= ID | TK_0= 'execute' IDGen= ID IDGen_1= ID | TK_0= 'removeQuotes' IDGen= ID DOTGen= DOT IDGen_1= ID (TK_1= '[' paramGen+= param TK_2= ']' )? | TK_0= 'count' IDGen= ID | TK_0= 'convertHexToString' IDGen= ID DOTGen= DOT IDGen_1= ID | TK_0= 'ext' normalNameGen+= normalName (TK_1= '(' paramGen+= param (TK_2= ',' paramGen_1+= param )? TK_3= ')' )? );";
        }
    }
 

    public static final BitSet FOLLOW_25_in_transformation49 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_transformation54 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_DQVALUE_in_transformation58 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_transformation63 = new BitSet(new long[]{0x0000078030000002L});
    public static final BitSet FOLLOW_28_in_transformation74 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_transformation79 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_DQVALUE_in_transformation83 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_transformation88 = new BitSet(new long[]{0x0000078020000002L});
    public static final BitSet FOLLOW_hash_in_transformation96 = new BitSet(new long[]{0x0000078020000002L});
    public static final BitSet FOLLOW_rule_in_transformation101 = new BitSet(new long[]{0x0000078000000002L});
    public static final BitSet FOLLOW_29_in_hash127 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_hash132 = new BitSet(new long[]{0x0000002600000010L});
    public static final BitSet FOLLOW_hashValue_in_hash137 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_30_in_hash143 = new BitSet(new long[]{0x0000002600000010L});
    public static final BitSet FOLLOW_hashValue_in_hash148 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_31_in_hash155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_hashValuePart_in_hashValue178 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_hashValue183 = new BitSet(new long[]{0x0000002400000010L});
    public static final BitSet FOLLOW_hashValuePart_in_hashValue188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_hashValue200 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_hashValue205 = new BitSet(new long[]{0x0000002400000010L});
    public static final BitSet FOLLOW_hashValuePart_in_hashValue210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DQVALUE_in_hashValuePart232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_hashValuePart244 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_hashValuePart249 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_hashValuePart254 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_hashValuePart259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_hashValuePart271 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_hashValuePart276 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_normalName_in_hashValuePart281 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_hashValuePart286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule310 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_ruleName_in_rule315 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_fromElement_in_rule320 = new BitSet(new long[]{0x000E000000000000L});
    public static final BitSet FOLLOW_contextElement_in_rule325 = new BitSet(new long[]{0x000E000000000000L});
    public static final BitSet FOLLOW_toElement_in_rule331 = new BitSet(new long[]{0x000E000000000000L});
    public static final BitSet FOLLOW_queryList_in_rule337 = new BitSet(new long[]{0x0000000000000000L,0x000000000000000EL});
    public static final BitSet FOLLOW_initList_in_rule342 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_rule347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleType369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleType381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleType393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleType405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QUOTE_in_ruleName428 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_ruleName435 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_QUOTE_in_ruleName441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_fromElement466 = new BitSet(new long[]{0x0000000000080020L});
    public static final BitSet FOLLOW_id_in_fromElement471 = new BitSet(new long[]{0x0000900000001C22L});
    public static final BitSet FOLLOW_44_in_fromElement477 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_fromElement482 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_fromElement487 = new BitSet(new long[]{0x0000800000001C22L});
    public static final BitSet FOLLOW_47_in_fromElement495 = new BitSet(new long[]{0x0400000800018020L});
    public static final BitSet FOLLOW_filterExpression_in_fromElement500 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_fromElement505 = new BitSet(new long[]{0x0000000000001C22L});
    public static final BitSet FOLLOW_filterUnit_in_fromElement513 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_ID_in_fromElement521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_contextElement547 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_contextElement552 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_30_in_contextElement558 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_contextElement563 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_50_in_toElement588 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_normalName_in_toElement593 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_ID_in_toElement598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_normalName623 = new BitSet(new long[]{0x0000000000000182L});
    public static final BitSet FOLLOW_DOT_in_normalName630 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_DDOTS_in_normalName637 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_normalName643 = new BitSet(new long[]{0x0000000000000182L});
    public static final BitSet FOLLOW_51_in_queryList667 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_query_in_queryList672 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_ID_in_query695 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_query700 = new BitSet(new long[]{0x0000800800001C00L});
    public static final BitSet FOLLOW_47_in_query707 = new BitSet(new long[]{0x0090000000000000L});
    public static final BitSet FOLLOW_queryControl_in_query712 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_query717 = new BitSet(new long[]{0x0000000800001C00L});
    public static final BitSet FOLLOW_35_in_query726 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_query731 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_query736 = new BitSet(new long[]{0x0000000000001C00L});
    public static final BitSet FOLLOW_filterUnit_in_query743 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_query748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_queryControl773 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_queryControl778 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_queryControl783 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_queryControl788 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_queryControl793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_queryControl805 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_queryControl811 = new BitSet(new long[]{0x0000100000000080L});
    public static final BitSet FOLLOW_44_in_queryControl817 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_NUMBER_in_queryControl822 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_queryControl827 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_DOT_in_queryControl834 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_queryControl841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_filterUnitElement_in_filterUnit865 = new BitSet(new long[]{0x0000800000001C02L});
    public static final BitSet FOLLOW_47_in_filterUnit871 = new BitSet(new long[]{0x0400000800018020L});
    public static final BitSet FOLLOW_filterExpression_in_filterUnit876 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_filterUnit881 = new BitSet(new long[]{0x0000000000001C02L});
    public static final BitSet FOLLOW_filterUnit_in_filterUnit889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRIPLEBAR_in_filterUnitElement914 = new BitSet(new long[]{0x00000000000A0020L});
    public static final BitSet FOLLOW_filterElement_in_filterUnitElement919 = new BitSet(new long[]{0x0000100000000082L});
    public static final BitSet FOLLOW_filterOperation_in_filterUnitElement925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOUBLEBAR_in_filterUnitElement939 = new BitSet(new long[]{0x00000000000A0020L});
    public static final BitSet FOLLOW_filterElement_in_filterUnitElement944 = new BitSet(new long[]{0x0000100000000082L});
    public static final BitSet FOLLOW_filterOperation_in_filterUnitElement950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BAR_in_filterUnitElement964 = new BitSet(new long[]{0x00000000000A0020L});
    public static final BitSet FOLLOW_filterElement_in_filterUnitElement969 = new BitSet(new long[]{0x0000100000000082L});
    public static final BitSet FOLLOW_filterOperation_in_filterUnitElement975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_filterOperation1000 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_filterOperation1005 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_filterOperation1010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_filterOperation1023 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_NUMBER_in_filterOperation1028 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_filterOperation1033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_filterOperation1045 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_filterOperation1050 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_filterOperation1055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOT_in_filterOperation1067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_filterOperation1079 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_filterOperation1084 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_filterOperation1089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_filterExpressionAlt_in_filterExpression1111 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_AND_in_filterExpression1117 = new BitSet(new long[]{0x0400000800018020L});
    public static final BitSet FOLLOW_filterExpressionAlt_in_filterExpression1122 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_filterExpressionNot_in_filterExpressionAlt1147 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_OR_in_filterExpressionAlt1153 = new BitSet(new long[]{0x0400000800018020L});
    public static final BitSet FOLLOW_filterExpressionNot_in_filterExpressionAlt1158 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_NOT_in_filterExpressionNot1185 = new BitSet(new long[]{0x0400000800018020L});
    public static final BitSet FOLLOW_filterExpressionAtom_in_filterExpressionNot1192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_filterExpressionAtom1217 = new BitSet(new long[]{0x0400000000010020L});
    public static final BitSet FOLLOW_expressionElement_in_filterExpressionAtom1224 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_DOT_in_filterExpressionAtom1229 = new BitSet(new long[]{0xF800000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_filterExpressionOperator_in_filterExpressionAtom1234 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_35_in_filterExpressionAtom1240 = new BitSet(new long[]{0x0000000000000230L});
    public static final BitSet FOLLOW_param_in_filterExpressionAtom1245 = new BitSet(new long[]{0x0000001040000000L});
    public static final BitSet FOLLOW_30_in_filterExpressionAtom1251 = new BitSet(new long[]{0x0000000000000230L});
    public static final BitSet FOLLOW_param_in_filterExpressionAtom1256 = new BitSet(new long[]{0x0000001040000000L});
    public static final BitSet FOLLOW_36_in_filterExpressionAtom1263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_filterExpressionAtom1278 = new BitSet(new long[]{0x0400000800018020L});
    public static final BitSet FOLLOW_filterExpression_in_filterExpressionAtom1283 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_filterExpressionAtom1288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_filterExpressionOperator1310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_filterExpressionOperator1323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_filterExpressionOperator1336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_filterExpressionOperator1349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_filterExpressionOperator1361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_filterExpressionOperator1374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AT_in_expressionElement1398 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_expressionElement1403 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_NUMBER_in_expressionElement1408 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_expressionElement1413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_expressionElement1426 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_44_in_expressionElement1432 = new BitSet(new long[]{0x0200000000000200L});
    public static final BitSet FOLLOW_NUMBER_in_expressionElement1438 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_57_in_expressionElement1445 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_expressionElement1451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AL_in_filterElement1476 = new BitSet(new long[]{0x0000000000080020L});
    public static final BitSet FOLLOW_id_in_filterElement1481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_filterElement1495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_initList1521 = new BitSet(new long[]{0x0000000000080022L,0x0000000000000120L});
    public static final BitSet FOLLOW_66_in_initList1528 = new BitSet(new long[]{0x0000000000080022L,0x0000000000000120L});
    public static final BitSet FOLLOW_67_in_initList1535 = new BitSet(new long[]{0x0000000000080022L,0x0000000000000120L});
    public static final BitSet FOLLOW_init_in_initList1541 = new BitSet(new long[]{0x0000000000080022L,0x0000000000000120L});
    public static final BitSet FOLLOW_initName_in_init1565 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_init1570 = new BitSet(new long[]{0x0000000000000230L,0x00000000000FF800L});
    public static final BitSet FOLLOW_initElementValue_in_init1575 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_init1580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_init1592 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_init1597 = new BitSet(new long[]{0x0400000800018020L});
    public static final BitSet FOLLOW_filterExpression_in_init1602 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_init1607 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_init1612 = new BitSet(new long[]{0x0000000000080020L,0x00000000000003A0L});
    public static final BitSet FOLLOW_init_in_init1617 = new BitSet(new long[]{0x0000000000080020L,0x00000000000003A0L});
    public static final BitSet FOLLOW_elsePart_in_init1624 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_init1631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_init1644 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_init1649 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_init1654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_elsePart1678 = new BitSet(new long[]{0x0000000000080022L,0x0000000000000120L});
    public static final BitSet FOLLOW_init_in_elsePart1683 = new BitSet(new long[]{0x0000000000080022L,0x0000000000000120L});
    public static final BitSet FOLLOW_id_in_initName1705 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_DOT_in_initName1711 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_initName1716 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_ID_in_initElementValue1741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DQVALUE_in_initElementValue1754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_initElementValue1767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_initElementValue1780 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_DOT_in_initElementValue1785 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_initElementValue1790 = new BitSet(new long[]{0x0000100000000002L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_initElementValue1796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_initElementValue1803 = new BitSet(new long[]{0x0000000000000230L});
    public static final BitSet FOLLOW_param_in_initElementValue1808 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_initElementValue1813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_param_in_initElementValue1827 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_PLUS_in_initElementValue1832 = new BitSet(new long[]{0x0000000000000230L});
    public static final BitSet FOLLOW_param_in_initElementValue1837 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_PLUS_in_initElementValue1843 = new BitSet(new long[]{0x0000000000000230L});
    public static final BitSet FOLLOW_param_in_initElementValue1848 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_75_in_initElementValue1863 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_normalName_in_initElementValue1868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_initElementValue1880 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_initElementValue1885 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_initElementValue1890 = new BitSet(new long[]{0x0000000000000230L});
    public static final BitSet FOLLOW_param_in_initElementValue1895 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_initElementValue1901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_initElementValue1913 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_initElementValue1918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_initElementValue1931 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_initElementValue1936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_initElementValue1951 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_initElementValue1956 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_initElementValue1961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_initElementValue1974 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_initElementValue1979 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_DOT_in_initElementValue1984 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_initElementValue1989 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_44_in_initElementValue1995 = new BitSet(new long[]{0x0000000000000230L});
    public static final BitSet FOLLOW_param_in_initElementValue2000 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_initElementValue2005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_initElementValue2020 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_initElementValue2025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_initElementValue2038 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_initElementValue2043 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_DOT_in_initElementValue2048 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_initElementValue2053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_initElementValue2068 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_normalName_in_initElementValue2073 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_35_in_initElementValue2079 = new BitSet(new long[]{0x0000000000000230L});
    public static final BitSet FOLLOW_param_in_initElementValue2084 = new BitSet(new long[]{0x0000001040000000L});
    public static final BitSet FOLLOW_30_in_initElementValue2090 = new BitSet(new long[]{0x0000000000000230L});
    public static final BitSet FOLLOW_param_in_initElementValue2095 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_initElementValue2102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_param2129 = new BitSet(new long[]{0x0000100000000080L});
    public static final BitSet FOLLOW_44_in_param2135 = new BitSet(new long[]{0x0200000000000220L});
    public static final BitSet FOLLOW_paramExtension_in_param2139 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_param2144 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_DOT_in_param2151 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_param2155 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_44_in_param2161 = new BitSet(new long[]{0x0200000000000220L});
    public static final BitSet FOLLOW_paramExtension_in_param2165 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_param2170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_param2185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DQVALUE_in_param2198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_param2212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_paramExtension2236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_paramExtension2248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_paramExtension2260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDESC_in_id2282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_id2295 = new BitSet(new long[]{0x0000000000000002L});

}
