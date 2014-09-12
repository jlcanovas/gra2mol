// $ANTLR 3.2 Sep 23, 2009 12:02:23 files/gen/test.g 2012-05-23 14:51:12

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
public class testParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ID", "'HOLA'", "' '", "';'"
    };
    public static final int ID=4;
    public static final int EOF=-1;
    public static final int T__7=7;
    public static final int T__6=6;
    public static final int T__5=5;

    // delegates
    // delegators


        public testParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public testParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected StringTemplateGroup templateLib =
      new StringTemplateGroup("testParserTemplates", AngleBracketTemplateLexer.class);

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

    public String[] getTokenNames() { return testParser.tokenNames; }
    public String getGrammarFileName() { return "files/gen/test.g"; }


    public static class mainRule_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "mainRule"
    // files/gen/test.g:19:1: mainRule returns [Node returnNode] : TK_0= 'HOLA' TK_1= ' ' TK_2= ' ' IDGen= ID TK_3= ';' ;
    public final testParser.mainRule_return mainRule() throws RecognitionException {
        testParser.mainRule_return retval = new testParser.mainRule_return();
        retval.start = input.LT(1);

        Token TK_0=null;
        Token TK_1=null;
        Token TK_2=null;
        Token IDGen=null;
        Token TK_3=null;

        try {
            // files/gen/test.g:20:1: (TK_0= 'HOLA' TK_1= ' ' TK_2= ' ' IDGen= ID TK_3= ';' )
            // files/gen/test.g:21:2: TK_0= 'HOLA' TK_1= ' ' TK_2= ' ' IDGen= ID TK_3= ';'
            {
            TK_0=(Token)match(input,5,FOLLOW_5_in_mainRule43); 
            TK_1=(Token)match(input,6,FOLLOW_6_in_mainRule47); 
            TK_2=(Token)match(input,6,FOLLOW_6_in_mainRule51); 
            IDGen=(Token)match(input,ID,FOLLOW_ID_in_mainRule55); 
            TK_3=(Token)match(input,7,FOLLOW_7_in_mainRule59); 

            		// Create return CST Node
            		Node mainRuleReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
            		mainRuleReturnNode.setKind("mainRule");
            	    // Create a Token CST Leaf	
            	    if(TK_0 != null) {
            			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
            	 		TK_0Leaf.setKind("TOKEN");
            	 		TK_0Leaf.setValue((TK_0!=null?TK_0.getText():null));
            			TK_0Leaf.setPos(TK_0.getCharPositionInLine());
            			TK_0Leaf.setLine(TK_0.getLine());
            	 		mainRuleReturnNode.getChildren().add(TK_0Leaf);
            	 	}
            	    // Create a Token CST Leaf	
            	    if(TK_1 != null) {
            			Leaf TK_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
            	 		TK_1Leaf.setKind("TOKEN");
            	 		TK_1Leaf.setValue((TK_1!=null?TK_1.getText():null));
            			TK_1Leaf.setPos(TK_1.getCharPositionInLine());
            			TK_1Leaf.setLine(TK_1.getLine());
            	 		mainRuleReturnNode.getChildren().add(TK_1Leaf);
            	 	}
            	    // Create a Token CST Leaf	
            	    if(TK_2 != null) {
            			Leaf TK_2Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
            	 		TK_2Leaf.setKind("TOKEN");
            	 		TK_2Leaf.setValue((TK_2!=null?TK_2.getText():null));
            			TK_2Leaf.setPos(TK_2.getCharPositionInLine());
            			TK_2Leaf.setLine(TK_2.getLine());
            	 		mainRuleReturnNode.getChildren().add(TK_2Leaf);
            	 	}
            	    // Create a CST Leaf
            		if(IDGen != null) {
            			Leaf IDGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf();
            			IDGenLeaf.setKind("ID");
            			IDGenLeaf.setValue((IDGen!=null?IDGen.getText():null));
            			IDGenLeaf.setPos(IDGen.getCharPositionInLine());
            			IDGenLeaf.setLine(IDGen.getLine());
            			mainRuleReturnNode.getChildren().add(IDGenLeaf);
            		}
            	    // Create a Token CST Leaf	
            	    if(TK_3 != null) {
            			Leaf TK_3Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
            	 		TK_3Leaf.setKind("TOKEN");
            	 		TK_3Leaf.setValue((TK_3!=null?TK_3.getText():null));
            			TK_3Leaf.setPos(TK_3.getCharPositionInLine());
            			TK_3Leaf.setLine(TK_3.getLine());
            	 		mainRuleReturnNode.getChildren().add(TK_3Leaf);
            	 	}
            		// Returns the Node with CST Leaves/Nodes
            		retval.returnNode = mainRuleReturnNode;
            	

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

    // Delegated rules


 

    public static final BitSet FOLLOW_5_in_mainRule43 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_6_in_mainRule47 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_6_in_mainRule51 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_mainRule55 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_7_in_mainRule59 = new BitSet(new long[]{0x0000000000000002L});

}