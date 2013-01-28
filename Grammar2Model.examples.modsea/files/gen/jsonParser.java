// $ANTLR 3.2 Sep 23, 2009 12:02:23 files/gen/json.g 2012-02-21 18:30:18

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
public class jsonParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ID", "DQVALUE", "DOUBLEQUOTE", "WS", "COMMENT", "LINE_COMMENT", "'['", "','", "']'", "'{'", "'}'", "':'"
    };
    public static final int WS=7;
    public static final int T__15=15;
    public static final int LINE_COMMENT=9;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int T__10=10;
    public static final int DQVALUE=5;
    public static final int COMMENT=8;
    public static final int ID=4;
    public static final int DOUBLEQUOTE=6;
    public static final int EOF=-1;

    // delegates
    // delegators


        public jsonParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public jsonParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected StringTemplateGroup templateLib =
      new StringTemplateGroup("jsonParserTemplates", AngleBracketTemplateLexer.class);

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

    public String[] getTokenNames() { return jsonParser.tokenNames; }
    public String getGrammarFileName() { return "files/gen/json.g"; }


    public static class mainRule_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "mainRule"
    // files/gen/json.g:29:1: mainRule returns [Node returnNode] : (complexElementGen+= complexElement | singleElementGen+= singleElement );
    public final jsonParser.mainRule_return mainRule() throws RecognitionException {
        jsonParser.mainRule_return retval = new jsonParser.mainRule_return();
        retval.start = input.LT(1);

        List list_complexElementGen=null;
        List list_singleElementGen=null;
        RuleReturnScope complexElementGen = null;
        RuleReturnScope singleElementGen = null;
        try {
            // files/gen/json.g:30:1: (complexElementGen+= complexElement | singleElementGen+= singleElement )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==10) ) {
                alt1=1;
            }
            else if ( (LA1_0==13) ) {
                alt1=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // files/gen/json.g:31:2: complexElementGen+= complexElement
                    {
                    pushFollow(FOLLOW_complexElement_in_mainRule59);
                    complexElementGen=complexElement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if (list_complexElementGen==null) list_complexElementGen=new ArrayList();
                    list_complexElementGen.add(complexElementGen);

                    if ( state.backtracking==0 ) {

                      		// Create return CST Node
                      		Node mainRuleReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                      		mainRuleReturnNode.setKind("mainRule");
                      	    // Create a CST Node
                      		if(list_complexElementGen != null) {
                      	        for(Iterator it = list_complexElementGen.iterator(); it.hasNext(); )  { 
                      	            jsonParser.complexElement_return r = (jsonParser.complexElement_return) it.next(); 
                      	            if(r != null && r.returnNode != null) {
                      	            	r.returnNode.setKind("complexElement");
                      	            	mainRuleReturnNode.getChildren().add(r.returnNode);
                      	            } 
                      	        }
                      	    }
                      		// Returns the Node with CST Leaves/Nodes
                      		retval.returnNode = mainRuleReturnNode;
                      	
                    }

                    }
                    break;
                case 2 :
                    // files/gen/json.g:48:6: singleElementGen+= singleElement
                    {
                    pushFollow(FOLLOW_singleElement_in_mainRule69);
                    singleElementGen=singleElement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if (list_singleElementGen==null) list_singleElementGen=new ArrayList();
                    list_singleElementGen.add(singleElementGen);

                    if ( state.backtracking==0 ) {

                      		// Create return CST Node
                      		Node mainRuleReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                      		mainRuleReturnNode.setKind("mainRule");
                      	    // Create a CST Node
                      		if(list_singleElementGen != null) {
                      	        for(Iterator it = list_singleElementGen.iterator(); it.hasNext(); )  { 
                      	            jsonParser.singleElement_return r = (jsonParser.singleElement_return) it.next(); 
                      	            if(r != null && r.returnNode != null) {
                      	            	r.returnNode.setKind("singleElement");
                      	            	mainRuleReturnNode.getChildren().add(r.returnNode);
                      	            } 
                      	        }
                      	    }
                      		// Returns the Node with CST Leaves/Nodes
                      		retval.returnNode = mainRuleReturnNode;
                      	
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
    // $ANTLR end "mainRule"

    public static class complexElement_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "complexElement"
    // files/gen/json.g:67:1: complexElement returns [Node returnNode] : TK_0= '[' singleElementGen+= singleElement (TK_1= ',' singleElementGen_1+= singleElement )* TK_2= ']' ;
    public final jsonParser.complexElement_return complexElement() throws RecognitionException {
        jsonParser.complexElement_return retval = new jsonParser.complexElement_return();
        retval.start = input.LT(1);

        Token TK_0=null;
        Token TK_1=null;
        Token TK_2=null;
        List list_singleElementGen=null;
        List list_singleElementGen_1=null;
        RuleReturnScope singleElementGen = null;
        RuleReturnScope singleElementGen_1 = null;
        try {
            // files/gen/json.g:68:1: (TK_0= '[' singleElementGen+= singleElement (TK_1= ',' singleElementGen_1+= singleElement )* TK_2= ']' )
            // files/gen/json.g:69:2: TK_0= '[' singleElementGen+= singleElement (TK_1= ',' singleElementGen_1+= singleElement )* TK_2= ']'
            {
            TK_0=(Token)match(input,10,FOLLOW_10_in_complexElement89); if (state.failed) return retval;
            pushFollow(FOLLOW_singleElement_in_complexElement93);
            singleElementGen=singleElement();

            state._fsp--;
            if (state.failed) return retval;
            if (list_singleElementGen==null) list_singleElementGen=new ArrayList();
            list_singleElementGen.add(singleElementGen);

            // files/gen/json.g:69:43: (TK_1= ',' singleElementGen_1+= singleElement )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==11) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // files/gen/json.g:69:44: TK_1= ',' singleElementGen_1+= singleElement
            	    {
            	    TK_1=(Token)match(input,11,FOLLOW_11_in_complexElement98); if (state.failed) return retval;
            	    pushFollow(FOLLOW_singleElement_in_complexElement102);
            	    singleElementGen_1=singleElement();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if (list_singleElementGen_1==null) list_singleElementGen_1=new ArrayList();
            	    list_singleElementGen_1.add(singleElementGen_1);


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            TK_2=(Token)match(input,12,FOLLOW_12_in_complexElement108); if (state.failed) return retval;
            if ( state.backtracking==0 ) {

              		// Create return CST Node
              		Node complexElementReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
              		complexElementReturnNode.setKind("complexElement");
              	    // Create a Token CST Leaf	
              	    if(TK_0 != null) {
              			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
              	 		TK_0Leaf.setKind("TOKEN");
              	 		TK_0Leaf.setValue((TK_0!=null?TK_0.getText():null));
              			TK_0Leaf.setPos(TK_0.getCharPositionInLine());
              			TK_0Leaf.setLine(TK_0.getLine());
              	 		complexElementReturnNode.getChildren().add(TK_0Leaf);
              	 	}
              	    // Create a CST Node
              		if(list_singleElementGen != null) {
              	        for(Iterator it = list_singleElementGen.iterator(); it.hasNext(); )  { 
              	            jsonParser.singleElement_return r = (jsonParser.singleElement_return) it.next(); 
              	            if(r != null && r.returnNode != null) {
              	            	r.returnNode.setKind("singleElement");
              	            	complexElementReturnNode.getChildren().add(r.returnNode);
              	            } 
              	        }
              	    }

              		// Create a special CST Node for terminal singleElementGen_1 aggregation
              		if(list_singleElementGen_1 != null) {
              	    for(int pos = 0; pos < list_singleElementGen_1.size(); pos++ )  { 
              	    // Create a Token CST Leaf	
              	    if(TK_1 != null) {
              			Leaf TK_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
              	 		TK_1Leaf.setKind("TOKEN");
              	 		TK_1Leaf.setValue((TK_1!=null?TK_1.getText():null));
              			TK_1Leaf.setPos(TK_1.getCharPositionInLine());
              			TK_1Leaf.setLine(TK_1.getLine());
              	 		complexElementReturnNode.getChildren().add(TK_1Leaf);
              	 	}
              		// No Terminal extractor
              	    if(list_singleElementGen_1 != null) {		
              	    	jsonParser.singleElement_return r = (jsonParser.singleElement_return) list_singleElementGen_1.get(pos); 
              	    	if(r != null && r.returnNode != null) {
              	        	r.returnNode.setKind("singleElement");
              	    		complexElementReturnNode.getChildren().add(r.returnNode);
              	    	} 
              		}
              		}
              		}

              	    // Create a Token CST Leaf	
              	    if(TK_2 != null) {
              			Leaf TK_2Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
              	 		TK_2Leaf.setKind("TOKEN");
              	 		TK_2Leaf.setValue((TK_2!=null?TK_2.getText():null));
              			TK_2Leaf.setPos(TK_2.getCharPositionInLine());
              			TK_2Leaf.setLine(TK_2.getLine());
              	 		complexElementReturnNode.getChildren().add(TK_2Leaf);
              	 	}
              		// Returns the Node with CST Leaves/Nodes
              		retval.returnNode = complexElementReturnNode;
              	
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
    // $ANTLR end "complexElement"

    public static class singleElement_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "singleElement"
    // files/gen/json.g:130:1: singleElement returns [Node returnNode] : TK_0= '{' pairValueGen+= pairValue (TK_1= ',' pairValueGen_1+= pairValue )* TK_2= '}' ;
    public final jsonParser.singleElement_return singleElement() throws RecognitionException {
        jsonParser.singleElement_return retval = new jsonParser.singleElement_return();
        retval.start = input.LT(1);

        Token TK_0=null;
        Token TK_1=null;
        Token TK_2=null;
        List list_pairValueGen=null;
        List list_pairValueGen_1=null;
        RuleReturnScope pairValueGen = null;
        RuleReturnScope pairValueGen_1 = null;
        try {
            // files/gen/json.g:131:1: (TK_0= '{' pairValueGen+= pairValue (TK_1= ',' pairValueGen_1+= pairValue )* TK_2= '}' )
            // files/gen/json.g:132:2: TK_0= '{' pairValueGen+= pairValue (TK_1= ',' pairValueGen_1+= pairValue )* TK_2= '}'
            {
            TK_0=(Token)match(input,13,FOLLOW_13_in_singleElement128); if (state.failed) return retval;
            pushFollow(FOLLOW_pairValue_in_singleElement132);
            pairValueGen=pairValue();

            state._fsp--;
            if (state.failed) return retval;
            if (list_pairValueGen==null) list_pairValueGen=new ArrayList();
            list_pairValueGen.add(pairValueGen);

            // files/gen/json.g:132:35: (TK_1= ',' pairValueGen_1+= pairValue )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==11) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // files/gen/json.g:132:36: TK_1= ',' pairValueGen_1+= pairValue
            	    {
            	    TK_1=(Token)match(input,11,FOLLOW_11_in_singleElement137); if (state.failed) return retval;
            	    pushFollow(FOLLOW_pairValue_in_singleElement141);
            	    pairValueGen_1=pairValue();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if (list_pairValueGen_1==null) list_pairValueGen_1=new ArrayList();
            	    list_pairValueGen_1.add(pairValueGen_1);


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            TK_2=(Token)match(input,14,FOLLOW_14_in_singleElement147); if (state.failed) return retval;
            if ( state.backtracking==0 ) {

              		// Create return CST Node
              		Node singleElementReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
              		singleElementReturnNode.setKind("singleElement");
              	    // Create a Token CST Leaf	
              	    if(TK_0 != null) {
              			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
              	 		TK_0Leaf.setKind("TOKEN");
              	 		TK_0Leaf.setValue((TK_0!=null?TK_0.getText():null));
              			TK_0Leaf.setPos(TK_0.getCharPositionInLine());
              			TK_0Leaf.setLine(TK_0.getLine());
              	 		singleElementReturnNode.getChildren().add(TK_0Leaf);
              	 	}
              	    // Create a CST Node
              		if(list_pairValueGen != null) {
              	        for(Iterator it = list_pairValueGen.iterator(); it.hasNext(); )  { 
              	            jsonParser.pairValue_return r = (jsonParser.pairValue_return) it.next(); 
              	            if(r != null && r.returnNode != null) {
              	            	r.returnNode.setKind("pairValue");
              	            	singleElementReturnNode.getChildren().add(r.returnNode);
              	            } 
              	        }
              	    }

              		// Create a special CST Node for terminal pairValueGen_1 aggregation
              		if(list_pairValueGen_1 != null) {
              	    for(int pos = 0; pos < list_pairValueGen_1.size(); pos++ )  { 
              	    // Create a Token CST Leaf	
              	    if(TK_1 != null) {
              			Leaf TK_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
              	 		TK_1Leaf.setKind("TOKEN");
              	 		TK_1Leaf.setValue((TK_1!=null?TK_1.getText():null));
              			TK_1Leaf.setPos(TK_1.getCharPositionInLine());
              			TK_1Leaf.setLine(TK_1.getLine());
              	 		singleElementReturnNode.getChildren().add(TK_1Leaf);
              	 	}
              		// No Terminal extractor
              	    if(list_pairValueGen_1 != null) {		
              	    	jsonParser.pairValue_return r = (jsonParser.pairValue_return) list_pairValueGen_1.get(pos); 
              	    	if(r != null && r.returnNode != null) {
              	        	r.returnNode.setKind("pairValue");
              	    		singleElementReturnNode.getChildren().add(r.returnNode);
              	    	} 
              		}
              		}
              		}

              	    // Create a Token CST Leaf	
              	    if(TK_2 != null) {
              			Leaf TK_2Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
              	 		TK_2Leaf.setKind("TOKEN");
              	 		TK_2Leaf.setValue((TK_2!=null?TK_2.getText():null));
              			TK_2Leaf.setPos(TK_2.getCharPositionInLine());
              			TK_2Leaf.setLine(TK_2.getLine());
              	 		singleElementReturnNode.getChildren().add(TK_2Leaf);
              	 	}
              		// Returns the Node with CST Leaves/Nodes
              		retval.returnNode = singleElementReturnNode;
              	
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
    // $ANTLR end "singleElement"

    public static class pairValue_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "pairValue"
    // files/gen/json.g:193:1: pairValue returns [Node returnNode] : lhsGen+= lhs TK_0= ':' rhsGen+= rhs ;
    public final jsonParser.pairValue_return pairValue() throws RecognitionException {
        jsonParser.pairValue_return retval = new jsonParser.pairValue_return();
        retval.start = input.LT(1);

        Token TK_0=null;
        List list_lhsGen=null;
        List list_rhsGen=null;
        RuleReturnScope lhsGen = null;
        RuleReturnScope rhsGen = null;
        try {
            // files/gen/json.g:194:1: (lhsGen+= lhs TK_0= ':' rhsGen+= rhs )
            // files/gen/json.g:195:2: lhsGen+= lhs TK_0= ':' rhsGen+= rhs
            {
            pushFollow(FOLLOW_lhs_in_pairValue167);
            lhsGen=lhs();

            state._fsp--;
            if (state.failed) return retval;
            if (list_lhsGen==null) list_lhsGen=new ArrayList();
            list_lhsGen.add(lhsGen);

            TK_0=(Token)match(input,15,FOLLOW_15_in_pairValue171); if (state.failed) return retval;
            pushFollow(FOLLOW_rhs_in_pairValue175);
            rhsGen=rhs();

            state._fsp--;
            if (state.failed) return retval;
            if (list_rhsGen==null) list_rhsGen=new ArrayList();
            list_rhsGen.add(rhsGen);

            if ( state.backtracking==0 ) {

              		// Create return CST Node
              		Node pairValueReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
              		pairValueReturnNode.setKind("pairValue");
              	    // Create a CST Node
              		if(list_lhsGen != null) {
              	        for(Iterator it = list_lhsGen.iterator(); it.hasNext(); )  { 
              	            jsonParser.lhs_return r = (jsonParser.lhs_return) it.next(); 
              	            if(r != null && r.returnNode != null) {
              	            	r.returnNode.setKind("lhs");
              	            	pairValueReturnNode.getChildren().add(r.returnNode);
              	            } 
              	        }
              	    }
              	    // Create a Token CST Leaf	
              	    if(TK_0 != null) {
              			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
              	 		TK_0Leaf.setKind("TOKEN");
              	 		TK_0Leaf.setValue((TK_0!=null?TK_0.getText():null));
              			TK_0Leaf.setPos(TK_0.getCharPositionInLine());
              			TK_0Leaf.setLine(TK_0.getLine());
              	 		pairValueReturnNode.getChildren().add(TK_0Leaf);
              	 	}
              	    // Create a CST Node
              		if(list_rhsGen != null) {
              	        for(Iterator it = list_rhsGen.iterator(); it.hasNext(); )  { 
              	            jsonParser.rhs_return r = (jsonParser.rhs_return) it.next(); 
              	            if(r != null && r.returnNode != null) {
              	            	r.returnNode.setKind("rhs");
              	            	pairValueReturnNode.getChildren().add(r.returnNode);
              	            } 
              	        }
              	    }
              		// Returns the Node with CST Leaves/Nodes
              		retval.returnNode = pairValueReturnNode;
              	
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
    // $ANTLR end "pairValue"

    public static class lhs_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "lhs"
    // files/gen/json.g:233:1: lhs returns [Node returnNode] : (valueGen+= value | complexElementGen+= complexElement | singleElementGen+= singleElement );
    public final jsonParser.lhs_return lhs() throws RecognitionException {
        jsonParser.lhs_return retval = new jsonParser.lhs_return();
        retval.start = input.LT(1);

        List list_valueGen=null;
        List list_complexElementGen=null;
        List list_singleElementGen=null;
        RuleReturnScope valueGen = null;
        RuleReturnScope complexElementGen = null;
        RuleReturnScope singleElementGen = null;
        try {
            // files/gen/json.g:234:1: (valueGen+= value | complexElementGen+= complexElement | singleElementGen+= singleElement )
            int alt4=3;
            switch ( input.LA(1) ) {
            case ID:
            case DQVALUE:
                {
                alt4=1;
                }
                break;
            case 10:
                {
                alt4=2;
                }
                break;
            case 13:
                {
                alt4=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // files/gen/json.g:235:2: valueGen+= value
                    {
                    pushFollow(FOLLOW_value_in_lhs195);
                    valueGen=value();

                    state._fsp--;
                    if (state.failed) return retval;
                    if (list_valueGen==null) list_valueGen=new ArrayList();
                    list_valueGen.add(valueGen);

                    if ( state.backtracking==0 ) {

                      		// Create return CST Node
                      		Node lhsReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                      		lhsReturnNode.setKind("lhs");
                      	    // Create a CST Node
                      		if(list_valueGen != null) {
                      	        for(Iterator it = list_valueGen.iterator(); it.hasNext(); )  { 
                      	            jsonParser.value_return r = (jsonParser.value_return) it.next(); 
                      	            if(r != null && r.returnNode != null) {
                      	            	r.returnNode.setKind("value");
                      	            	lhsReturnNode.getChildren().add(r.returnNode);
                      	            } 
                      	        }
                      	    }
                      		// Returns the Node with CST Leaves/Nodes
                      		retval.returnNode = lhsReturnNode;
                      	
                    }

                    }
                    break;
                case 2 :
                    // files/gen/json.g:252:6: complexElementGen+= complexElement
                    {
                    pushFollow(FOLLOW_complexElement_in_lhs205);
                    complexElementGen=complexElement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if (list_complexElementGen==null) list_complexElementGen=new ArrayList();
                    list_complexElementGen.add(complexElementGen);

                    if ( state.backtracking==0 ) {

                      		// Create return CST Node
                      		Node lhsReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                      		lhsReturnNode.setKind("lhs");
                      	    // Create a CST Node
                      		if(list_complexElementGen != null) {
                      	        for(Iterator it = list_complexElementGen.iterator(); it.hasNext(); )  { 
                      	            jsonParser.complexElement_return r = (jsonParser.complexElement_return) it.next(); 
                      	            if(r != null && r.returnNode != null) {
                      	            	r.returnNode.setKind("complexElement");
                      	            	lhsReturnNode.getChildren().add(r.returnNode);
                      	            } 
                      	        }
                      	    }
                      		// Returns the Node with CST Leaves/Nodes
                      		retval.returnNode = lhsReturnNode;
                      	
                    }

                    }
                    break;
                case 3 :
                    // files/gen/json.g:269:6: singleElementGen+= singleElement
                    {
                    pushFollow(FOLLOW_singleElement_in_lhs215);
                    singleElementGen=singleElement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if (list_singleElementGen==null) list_singleElementGen=new ArrayList();
                    list_singleElementGen.add(singleElementGen);

                    if ( state.backtracking==0 ) {

                      		// Create return CST Node
                      		Node lhsReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                      		lhsReturnNode.setKind("lhs");
                      	    // Create a CST Node
                      		if(list_singleElementGen != null) {
                      	        for(Iterator it = list_singleElementGen.iterator(); it.hasNext(); )  { 
                      	            jsonParser.singleElement_return r = (jsonParser.singleElement_return) it.next(); 
                      	            if(r != null && r.returnNode != null) {
                      	            	r.returnNode.setKind("singleElement");
                      	            	lhsReturnNode.getChildren().add(r.returnNode);
                      	            } 
                      	        }
                      	    }
                      		// Returns the Node with CST Leaves/Nodes
                      		retval.returnNode = lhsReturnNode;
                      	
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
    // $ANTLR end "lhs"

    public static class rhs_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "rhs"
    // files/gen/json.g:288:1: rhs returns [Node returnNode] : (valueGen+= value | complexElementGen+= complexElement | singleElementGen+= singleElement );
    public final jsonParser.rhs_return rhs() throws RecognitionException {
        jsonParser.rhs_return retval = new jsonParser.rhs_return();
        retval.start = input.LT(1);

        List list_valueGen=null;
        List list_complexElementGen=null;
        List list_singleElementGen=null;
        RuleReturnScope valueGen = null;
        RuleReturnScope complexElementGen = null;
        RuleReturnScope singleElementGen = null;
        try {
            // files/gen/json.g:289:1: (valueGen+= value | complexElementGen+= complexElement | singleElementGen+= singleElement )
            int alt5=3;
            switch ( input.LA(1) ) {
            case ID:
            case DQVALUE:
                {
                alt5=1;
                }
                break;
            case 10:
                {
                alt5=2;
                }
                break;
            case 13:
                {
                alt5=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // files/gen/json.g:290:2: valueGen+= value
                    {
                    pushFollow(FOLLOW_value_in_rhs235);
                    valueGen=value();

                    state._fsp--;
                    if (state.failed) return retval;
                    if (list_valueGen==null) list_valueGen=new ArrayList();
                    list_valueGen.add(valueGen);

                    if ( state.backtracking==0 ) {

                      		// Create return CST Node
                      		Node rhsReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                      		rhsReturnNode.setKind("rhs");
                      	    // Create a CST Node
                      		if(list_valueGen != null) {
                      	        for(Iterator it = list_valueGen.iterator(); it.hasNext(); )  { 
                      	            jsonParser.value_return r = (jsonParser.value_return) it.next(); 
                      	            if(r != null && r.returnNode != null) {
                      	            	r.returnNode.setKind("value");
                      	            	rhsReturnNode.getChildren().add(r.returnNode);
                      	            } 
                      	        }
                      	    }
                      		// Returns the Node with CST Leaves/Nodes
                      		retval.returnNode = rhsReturnNode;
                      	
                    }

                    }
                    break;
                case 2 :
                    // files/gen/json.g:307:6: complexElementGen+= complexElement
                    {
                    pushFollow(FOLLOW_complexElement_in_rhs245);
                    complexElementGen=complexElement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if (list_complexElementGen==null) list_complexElementGen=new ArrayList();
                    list_complexElementGen.add(complexElementGen);

                    if ( state.backtracking==0 ) {

                      		// Create return CST Node
                      		Node rhsReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                      		rhsReturnNode.setKind("rhs");
                      	    // Create a CST Node
                      		if(list_complexElementGen != null) {
                      	        for(Iterator it = list_complexElementGen.iterator(); it.hasNext(); )  { 
                      	            jsonParser.complexElement_return r = (jsonParser.complexElement_return) it.next(); 
                      	            if(r != null && r.returnNode != null) {
                      	            	r.returnNode.setKind("complexElement");
                      	            	rhsReturnNode.getChildren().add(r.returnNode);
                      	            } 
                      	        }
                      	    }
                      		// Returns the Node with CST Leaves/Nodes
                      		retval.returnNode = rhsReturnNode;
                      	
                    }

                    }
                    break;
                case 3 :
                    // files/gen/json.g:324:6: singleElementGen+= singleElement
                    {
                    pushFollow(FOLLOW_singleElement_in_rhs255);
                    singleElementGen=singleElement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if (list_singleElementGen==null) list_singleElementGen=new ArrayList();
                    list_singleElementGen.add(singleElementGen);

                    if ( state.backtracking==0 ) {

                      		// Create return CST Node
                      		Node rhsReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                      		rhsReturnNode.setKind("rhs");
                      	    // Create a CST Node
                      		if(list_singleElementGen != null) {
                      	        for(Iterator it = list_singleElementGen.iterator(); it.hasNext(); )  { 
                      	            jsonParser.singleElement_return r = (jsonParser.singleElement_return) it.next(); 
                      	            if(r != null && r.returnNode != null) {
                      	            	r.returnNode.setKind("singleElement");
                      	            	rhsReturnNode.getChildren().add(r.returnNode);
                      	            } 
                      	        }
                      	    }
                      		// Returns the Node with CST Leaves/Nodes
                      		retval.returnNode = rhsReturnNode;
                      	
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
    // $ANTLR end "rhs"

    public static class value_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "value"
    // files/gen/json.g:343:1: value returns [Node returnNode] : (IDGen= ID | DQVALUEGen= DQVALUE );
    public final jsonParser.value_return value() throws RecognitionException {
        jsonParser.value_return retval = new jsonParser.value_return();
        retval.start = input.LT(1);

        Token IDGen=null;
        Token DQVALUEGen=null;

        try {
            // files/gen/json.g:344:1: (IDGen= ID | DQVALUEGen= DQVALUE )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==ID) ) {
                alt6=1;
            }
            else if ( (LA6_0==DQVALUE) ) {
                alt6=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // files/gen/json.g:345:2: IDGen= ID
                    {
                    IDGen=(Token)match(input,ID,FOLLOW_ID_in_value275); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {

                      		// Create return CST Node
                      		Node valueReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                      		valueReturnNode.setKind("value");
                      	    // Create a CST Leaf
                      		if(IDGen != null) {
                      			Leaf IDGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      			IDGenLeaf.setKind("ID");
                      			IDGenLeaf.setValue((IDGen!=null?IDGen.getText():null));
                      			IDGenLeaf.setPos(IDGen.getCharPositionInLine());
                      			IDGenLeaf.setLine(IDGen.getLine());
                      			valueReturnNode.getChildren().add(IDGenLeaf);
                      		}
                      		// Returns the Node with CST Leaves/Nodes
                      		retval.returnNode = valueReturnNode;
                      	
                    }

                    }
                    break;
                case 2 :
                    // files/gen/json.g:361:6: DQVALUEGen= DQVALUE
                    {
                    DQVALUEGen=(Token)match(input,DQVALUE,FOLLOW_DQVALUE_in_value285); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {

                      		// Create return CST Node
                      		Node valueReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                      		valueReturnNode.setKind("value");
                      	    // Create a CST Leaf
                      		if(DQVALUEGen != null) {
                      			Leaf DQVALUEGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      			DQVALUEGenLeaf.setKind("DQVALUE");
                      			DQVALUEGenLeaf.setValue((DQVALUEGen!=null?DQVALUEGen.getText():null));
                      			DQVALUEGenLeaf.setPos(DQVALUEGen.getCharPositionInLine());
                      			DQVALUEGenLeaf.setLine(DQVALUEGen.getLine());
                      			valueReturnNode.getChildren().add(DQVALUEGenLeaf);
                      		}
                      		// Returns the Node with CST Leaves/Nodes
                      		retval.returnNode = valueReturnNode;
                      	
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
    // $ANTLR end "value"

    // Delegated rules


 

    public static final BitSet FOLLOW_complexElement_in_mainRule59 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_singleElement_in_mainRule69 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_10_in_complexElement89 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_singleElement_in_complexElement93 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_11_in_complexElement98 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_singleElement_in_complexElement102 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_12_in_complexElement108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_singleElement128 = new BitSet(new long[]{0x0000000000002430L});
    public static final BitSet FOLLOW_pairValue_in_singleElement132 = new BitSet(new long[]{0x0000000000004800L});
    public static final BitSet FOLLOW_11_in_singleElement137 = new BitSet(new long[]{0x0000000000002430L});
    public static final BitSet FOLLOW_pairValue_in_singleElement141 = new BitSet(new long[]{0x0000000000004800L});
    public static final BitSet FOLLOW_14_in_singleElement147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lhs_in_pairValue167 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_pairValue171 = new BitSet(new long[]{0x0000000000002430L});
    public static final BitSet FOLLOW_rhs_in_pairValue175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_lhs195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_complexElement_in_lhs205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_singleElement_in_lhs215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_rhs235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_complexElement_in_rhs245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_singleElement_in_rhs255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_value275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DQVALUE_in_value285 = new BitSet(new long[]{0x0000000000000002L});

}