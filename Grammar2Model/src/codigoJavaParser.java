// $ANTLR 3.2 Sep 23, 2009 12:02:23 codigoJava.g 2012-05-14 12:46:26

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
public class codigoJavaParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ID", "COMILLA_DOBLE", "WS"
    };
    public static final int WS=6;
    public static final int COMILLA_DOBLE=5;
    public static final int ID=4;
    public static final int EOF=-1;

    // delegates
    // delegators


        public codigoJavaParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public codigoJavaParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected StringTemplateGroup templateLib =
      new StringTemplateGroup("codigoJavaParserTemplates", AngleBracketTemplateLexer.class);

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

    public String[] getTokenNames() { return codigoJavaParser.tokenNames; }
    public String getGrammarFileName() { return "codigoJava.g"; }


    public static class aplicacion_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "aplicacion"
    // codigoJava.g:19:1: aplicacion returns [Node returnNode] : (codigoGen+= codigo | codigo_entre_comillasGen+= codigo_entre_comillas )* ;
    public final codigoJavaParser.aplicacion_return aplicacion() throws RecognitionException {
        codigoJavaParser.aplicacion_return retval = new codigoJavaParser.aplicacion_return();
        retval.start = input.LT(1);

        List list_codigoGen=null;
        List list_codigo_entre_comillasGen=null;
        RuleReturnScope codigoGen = null;
        RuleReturnScope codigo_entre_comillasGen = null;
        try {
            // codigoJava.g:20:1: ( (codigoGen+= codigo | codigo_entre_comillasGen+= codigo_entre_comillas )* )
            // codigoJava.g:20:3: (codigoGen+= codigo | codigo_entre_comillasGen+= codigo_entre_comillas )*
            {
            // codigoJava.g:20:3: (codigoGen+= codigo | codigo_entre_comillasGen+= codigo_entre_comillas )*
            loop1:
            do {
                int alt1=3;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==ID) ) {
                    alt1=1;
                }
                else if ( (LA1_0==COMILLA_DOBLE) ) {
                    alt1=2;
                }


                switch (alt1) {
            	case 1 :
            	    // codigoJava.g:20:5: codigoGen+= codigo
            	    {
            	    pushFollow(FOLLOW_codigo_in_aplicacion43);
            	    codigoGen=codigo();

            	    state._fsp--;

            	    if (list_codigoGen==null) list_codigoGen=new ArrayList();
            	    list_codigoGen.add(codigoGen);


            	    }
            	    break;
            	case 2 :
            	    // codigoJava.g:20:26: codigo_entre_comillasGen+= codigo_entre_comillas
            	    {
            	    pushFollow(FOLLOW_codigo_entre_comillas_in_aplicacion50);
            	    codigo_entre_comillasGen=codigo_entre_comillas();

            	    state._fsp--;

            	    if (list_codigo_entre_comillasGen==null) list_codigo_entre_comillasGen=new ArrayList();
            	    list_codigo_entre_comillasGen.add(codigo_entre_comillasGen);


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            		// Create return CST Node
            		Node aplicacionReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
            		aplicacionReturnNode.setKind("aplicacion");

            		// Create a special CST Node for terminal codigoGen aggregation
            		if(list_codigoGen != null) {
            	    for(int pos = 0; pos < list_codigoGen.size(); pos++ )  { 
            		// No Terminal extractor
            	    if(list_codigoGen != null) {		
            	    	codigoJavaParser.codigo_return r = (codigoJavaParser.codigo_return) list_codigoGen.get(pos); 
            	    	if(r != null && r.returnNode != null) {
            	        	r.returnNode.setKind("codigo");
            	    		aplicacionReturnNode.getChildren().add(r.returnNode);
            	    	} 
            		}
            		}
            		}


            		// Create a special CST Node for terminal codigo_entre_comillasGen aggregation
            		if(list_codigo_entre_comillasGen != null) {
            	    for(int pos = 0; pos < list_codigo_entre_comillasGen.size(); pos++ )  { 
            		// No Terminal extractor
            	    if(list_codigo_entre_comillasGen != null) {		
            	    	codigoJavaParser.codigo_entre_comillas_return r = (codigoJavaParser.codigo_entre_comillas_return) list_codigo_entre_comillasGen.get(pos); 
            	    	if(r != null && r.returnNode != null) {
            	        	r.returnNode.setKind("codigo_entre_comillas");
            	    		aplicacionReturnNode.getChildren().add(r.returnNode);
            	    	} 
            		}
            		}
            		}

            		// Returns the Node with CST Leaves/Nodes
            		retval.returnNode = aplicacionReturnNode;
            	

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
    // $ANTLR end "aplicacion"

    public static class codigo_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "codigo"
    // codigoJava.g:60:1: codigo returns [Node returnNode] : IDGen= ID ;
    public final codigoJavaParser.codigo_return codigo() throws RecognitionException {
        codigoJavaParser.codigo_return retval = new codigoJavaParser.codigo_return();
        retval.start = input.LT(1);

        Token IDGen=null;

        try {
            // codigoJava.g:61:1: (IDGen= ID )
            // codigoJava.g:61:4: IDGen= ID
            {
            IDGen=(Token)match(input,ID,FOLLOW_ID_in_codigo74); 

            		// Create return CST Node
            		Node codigoReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
            		codigoReturnNode.setKind("codigo");
            	    // Create a CST Leaf
            		if(IDGen != null) {
            			Leaf IDGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf("ID", (IDGen!=null?IDGen.getText():null), IDGen.getCharPositionInLine(), IDGen.getLine());
            			codigoReturnNode.getChildren().add(IDGenLeaf);
            		}
            		// Returns the Node with CST Leaves/Nodes
            		retval.returnNode = codigoReturnNode;
            	

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
    // $ANTLR end "codigo"

    public static class codigo_entre_comillas_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "codigo_entre_comillas"
    // codigoJava.g:76:1: codigo_entre_comillas returns [Node returnNode] : COMILLA_DOBLEGen= COMILLA_DOBLE entrecomilladoGen+= entrecomillado COMILLA_DOBLEGen_1= COMILLA_DOBLE ;
    public final codigoJavaParser.codigo_entre_comillas_return codigo_entre_comillas() throws RecognitionException {
        codigoJavaParser.codigo_entre_comillas_return retval = new codigoJavaParser.codigo_entre_comillas_return();
        retval.start = input.LT(1);

        Token COMILLA_DOBLEGen=null;
        Token COMILLA_DOBLEGen_1=null;
        List list_entrecomilladoGen=null;
        RuleReturnScope entrecomilladoGen = null;
        try {
            // codigoJava.g:77:1: (COMILLA_DOBLEGen= COMILLA_DOBLE entrecomilladoGen+= entrecomillado COMILLA_DOBLEGen_1= COMILLA_DOBLE )
            // codigoJava.g:77:4: COMILLA_DOBLEGen= COMILLA_DOBLE entrecomilladoGen+= entrecomillado COMILLA_DOBLEGen_1= COMILLA_DOBLE
            {
            COMILLA_DOBLEGen=(Token)match(input,COMILLA_DOBLE,FOLLOW_COMILLA_DOBLE_in_codigo_entre_comillas97); 
            pushFollow(FOLLOW_entrecomillado_in_codigo_entre_comillas102);
            entrecomilladoGen=entrecomillado();

            state._fsp--;

            if (list_entrecomilladoGen==null) list_entrecomilladoGen=new ArrayList();
            list_entrecomilladoGen.add(entrecomilladoGen);

            COMILLA_DOBLEGen_1=(Token)match(input,COMILLA_DOBLE,FOLLOW_COMILLA_DOBLE_in_codigo_entre_comillas107); 

            		// Create return CST Node
            		Node codigo_entre_comillasReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
            		codigo_entre_comillasReturnNode.setKind("codigo_entre_comillas");
            	    // Create a CST Leaf
            		if(COMILLA_DOBLEGen != null) {
            			Leaf COMILLA_DOBLEGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf("COMILLA_DOBLE", (COMILLA_DOBLEGen!=null?COMILLA_DOBLEGen.getText():null), COMILLA_DOBLEGen.getCharPositionInLine(), COMILLA_DOBLEGen.getLine());
            			codigo_entre_comillasReturnNode.getChildren().add(COMILLA_DOBLEGenLeaf);
            		}
            	    // Create a CST Node
            		if(list_entrecomilladoGen != null) {
            	        for(Iterator it = list_entrecomilladoGen.iterator(); it.hasNext(); )  { 
            	            codigoJavaParser.entrecomillado_return r = (codigoJavaParser.entrecomillado_return) it.next(); 
            	            if(r != null && r.returnNode != null) {
            	            	r.returnNode.setKind("entrecomillado");
            	            	codigo_entre_comillasReturnNode.getChildren().add(r.returnNode);
            	            } 
            	        }
            	    }
            	    // Create a CST Leaf
            		if(COMILLA_DOBLEGen_1 != null) {
            			Leaf COMILLA_DOBLEGen_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("COMILLA_DOBLE", (COMILLA_DOBLEGen_1!=null?COMILLA_DOBLEGen_1.getText():null), COMILLA_DOBLEGen_1.getCharPositionInLine(), COMILLA_DOBLEGen_1.getLine());
            			codigo_entre_comillasReturnNode.getChildren().add(COMILLA_DOBLEGen_1Leaf);
            		}
            		// Returns the Node with CST Leaves/Nodes
            		retval.returnNode = codigo_entre_comillasReturnNode;
            	

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
    // $ANTLR end "codigo_entre_comillas"

    public static class entrecomillado_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "entrecomillado"
    // codigoJava.g:107:1: entrecomillado returns [Node returnNode] : IDGen= ID ;
    public final codigoJavaParser.entrecomillado_return entrecomillado() throws RecognitionException {
        codigoJavaParser.entrecomillado_return retval = new codigoJavaParser.entrecomillado_return();
        retval.start = input.LT(1);

        Token IDGen=null;

        try {
            // codigoJava.g:108:1: (IDGen= ID )
            // codigoJava.g:108:4: IDGen= ID
            {
            IDGen=(Token)match(input,ID,FOLLOW_ID_in_entrecomillado130); 

            		// Create return CST Node
            		Node entrecomilladoReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
            		entrecomilladoReturnNode.setKind("entrecomillado");
            	    // Create a CST Leaf
            		if(IDGen != null) {
            			Leaf IDGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf("ID", (IDGen!=null?IDGen.getText():null), IDGen.getCharPositionInLine(), IDGen.getLine());
            			entrecomilladoReturnNode.getChildren().add(IDGenLeaf);
            		}
            		// Returns the Node with CST Leaves/Nodes
            		retval.returnNode = entrecomilladoReturnNode;
            	

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
    // $ANTLR end "entrecomillado"

    // Delegated rules


 

    public static final BitSet FOLLOW_codigo_in_aplicacion43 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_codigo_entre_comillas_in_aplicacion50 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_ID_in_codigo74 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMILLA_DOBLE_in_codigo_entre_comillas97 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_entrecomillado_in_codigo_entre_comillas102 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_COMILLA_DOBLE_in_codigo_entre_comillas107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_entrecomillado130 = new BitSet(new long[]{0x0000000000000002L});

}