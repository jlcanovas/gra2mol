// $ANTLR 3.2 Sep 23, 2009 12:02:23 api2mol.g 2010-04-14 09:48:13

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
public class api2molParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "COLON", "LCURLY", "RCURLY", "ID", "DOT", "LPAREN", "COMMA", "RPAREN", "SEMI", "SLASH", "COMMENT", "LINE_COMMENT", "WS", "'@new'", "'@multiple'"
    };
    public static final int COLON=4;
    public static final int RPAREN=11;
    public static final int WS=16;
    public static final int SLASH=13;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int LINE_COMMENT=15;
    public static final int COMMA=10;
    public static final int RCURLY=6;
    public static final int LCURLY=5;
    public static final int COMMENT=14;
    public static final int DOT=8;
    public static final int ID=7;
    public static final int EOF=-1;
    public static final int SEMI=12;
    public static final int LPAREN=9;

    // delegates
    // delegators


        public api2molParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public api2molParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected StringTemplateGroup templateLib =
      new StringTemplateGroup("api2molParserTemplates", AngleBracketTemplateLexer.class);

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

    public String[] getTokenNames() { return api2molParser.tokenNames; }
    public String getGrammarFileName() { return "api2mol.g"; }


    public static class mainRule_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "mainRule"
    // api2mol.g:18:1: mainRule returns [Node returnNode] : (mappingGen+= mapping )* ;
    public final api2molParser.mainRule_return mainRule() throws RecognitionException {
        api2molParser.mainRule_return retval = new api2molParser.mainRule_return();
        retval.start = input.LT(1);

        List list_mappingGen=null;
        RuleReturnScope mappingGen = null;
        try {
            // api2mol.g:19:1: ( (mappingGen+= mapping )* )
            // api2mol.g:19:4: (mappingGen+= mapping )*
            {
            // api2mol.g:19:14: (mappingGen+= mapping )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==ID) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // api2mol.g:19:14: mappingGen+= mapping
            	    {
            	    pushFollow(FOLLOW_mapping_in_mainRule45);
            	    mappingGen=mapping();

            	    state._fsp--;

            	    if (list_mappingGen==null) list_mappingGen=new ArrayList();
            	    list_mappingGen.add(mappingGen);


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            		// Create return CST Node
            		Node mainRuleReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
            		mainRuleReturnNode.setKind("mainRule");
            	    // Create a CST Node
            		if(list_mappingGen != null) {
            	        for(Iterator it = list_mappingGen.iterator(); it.hasNext(); )  { 
            	            api2molParser.mapping_return r = (api2molParser.mapping_return) it.next(); 
            	            if(r != null && r.returnNode != null) {
            	            	r.returnNode.setKind("mapping");
            	            	mainRuleReturnNode.getChildren().add(r.returnNode);
            	            } 
            	        }
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

    public static class mapping_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "mapping"
    // api2mol.g:39:1: mapping returns [Node returnNode] : metaclassNameGen+= metaclassName COLONGen= COLON instanceNameGen+= instanceName LCURLYGen= LCURLY (sectionGen+= section )* RCURLYGen= RCURLY ;
    public final api2molParser.mapping_return mapping() throws RecognitionException {
        api2molParser.mapping_return retval = new api2molParser.mapping_return();
        retval.start = input.LT(1);

        Token COLONGen=null;
        Token LCURLYGen=null;
        Token RCURLYGen=null;
        List list_metaclassNameGen=null;
        List list_instanceNameGen=null;
        List list_sectionGen=null;
        RuleReturnScope metaclassNameGen = null;
        RuleReturnScope instanceNameGen = null;
        RuleReturnScope sectionGen = null;
        try {
            // api2mol.g:40:1: (metaclassNameGen+= metaclassName COLONGen= COLON instanceNameGen+= instanceName LCURLYGen= LCURLY (sectionGen+= section )* RCURLYGen= RCURLY )
            // api2mol.g:40:4: metaclassNameGen+= metaclassName COLONGen= COLON instanceNameGen+= instanceName LCURLYGen= LCURLY (sectionGen+= section )* RCURLYGen= RCURLY
            {
            pushFollow(FOLLOW_metaclassName_in_mapping68);
            metaclassNameGen=metaclassName();

            state._fsp--;

            if (list_metaclassNameGen==null) list_metaclassNameGen=new ArrayList();
            list_metaclassNameGen.add(metaclassNameGen);

            COLONGen=(Token)match(input,COLON,FOLLOW_COLON_in_mapping73); 
            pushFollow(FOLLOW_instanceName_in_mapping78);
            instanceNameGen=instanceName();

            state._fsp--;

            if (list_instanceNameGen==null) list_instanceNameGen=new ArrayList();
            list_instanceNameGen.add(instanceNameGen);

            LCURLYGen=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_mapping83); 
            // api2mol.g:40:112: (sectionGen+= section )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==ID||(LA2_0>=17 && LA2_0<=18)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // api2mol.g:40:112: sectionGen+= section
            	    {
            	    pushFollow(FOLLOW_section_in_mapping88);
            	    sectionGen=section();

            	    state._fsp--;

            	    if (list_sectionGen==null) list_sectionGen=new ArrayList();
            	    list_sectionGen.add(sectionGen);


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            RCURLYGen=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_mapping94); 

            		// Create return CST Node
            		Node mappingReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
            		mappingReturnNode.setKind("mapping");
            	    // Create a CST Node
            		if(list_metaclassNameGen != null) {
            	        for(Iterator it = list_metaclassNameGen.iterator(); it.hasNext(); )  { 
            	            api2molParser.metaclassName_return r = (api2molParser.metaclassName_return) it.next(); 
            	            if(r != null && r.returnNode != null) {
            	            	r.returnNode.setKind("metaclassName");
            	            	mappingReturnNode.getChildren().add(r.returnNode);
            	            } 
            	        }
            	    }
            	    // Create a CST Leaf
            		if(COLONGen != null) {
            			Leaf COLONGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf("COLON", (COLONGen!=null?COLONGen.getText():null), COLONGen.getCharPositionInLine(), COLONGen.getLine());
            			mappingReturnNode.getChildren().add(COLONGenLeaf);
            		}
            	    // Create a CST Node
            		if(list_instanceNameGen != null) {
            	        for(Iterator it = list_instanceNameGen.iterator(); it.hasNext(); )  { 
            	            api2molParser.instanceName_return r = (api2molParser.instanceName_return) it.next(); 
            	            if(r != null && r.returnNode != null) {
            	            	r.returnNode.setKind("instanceName");
            	            	mappingReturnNode.getChildren().add(r.returnNode);
            	            } 
            	        }
            	    }
            	    // Create a CST Leaf
            		if(LCURLYGen != null) {
            			Leaf LCURLYGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf("LCURLY", (LCURLYGen!=null?LCURLYGen.getText():null), LCURLYGen.getCharPositionInLine(), LCURLYGen.getLine());
            			mappingReturnNode.getChildren().add(LCURLYGenLeaf);
            		}
            	    // Create a CST Node
            		if(list_sectionGen != null) {
            	        for(Iterator it = list_sectionGen.iterator(); it.hasNext(); )  { 
            	            api2molParser.section_return r = (api2molParser.section_return) it.next(); 
            	            if(r != null && r.returnNode != null) {
            	            	r.returnNode.setKind("section");
            	            	mappingReturnNode.getChildren().add(r.returnNode);
            	            } 
            	        }
            	    }
            	    // Create a CST Leaf
            		if(RCURLYGen != null) {
            			Leaf RCURLYGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf("RCURLY", (RCURLYGen!=null?RCURLYGen.getText():null), RCURLYGen.getCharPositionInLine(), RCURLYGen.getLine());
            			mappingReturnNode.getChildren().add(RCURLYGenLeaf);
            		}
            		// Returns the Node with CST Leaves/Nodes
            		retval.returnNode = mappingReturnNode;
            	

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
    // $ANTLR end "mapping"

    public static class metaclassName_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "metaclassName"
    // api2mol.g:95:1: metaclassName returns [Node returnNode] : IDGen= ID ;
    public final api2molParser.metaclassName_return metaclassName() throws RecognitionException {
        api2molParser.metaclassName_return retval = new api2molParser.metaclassName_return();
        retval.start = input.LT(1);

        Token IDGen=null;

        try {
            // api2mol.g:96:1: (IDGen= ID )
            // api2mol.g:96:4: IDGen= ID
            {
            IDGen=(Token)match(input,ID,FOLLOW_ID_in_metaclassName116); 

            		// Create return CST Node
            		Node metaclassNameReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
            		metaclassNameReturnNode.setKind("metaclassName");
            	    // Create a CST Leaf
            		if(IDGen != null) {
            			Leaf IDGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf("ID", (IDGen!=null?IDGen.getText():null), IDGen.getCharPositionInLine(), IDGen.getLine());
            			metaclassNameReturnNode.getChildren().add(IDGenLeaf);
            		}
            		// Returns the Node with CST Leaves/Nodes
            		retval.returnNode = metaclassNameReturnNode;
            	

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
    // $ANTLR end "metaclassName"

    public static class instanceName_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "instanceName"
    // api2mol.g:111:1: instanceName returns [Node returnNode] : IDGen= ID (DOTGen_List+= DOT IDGen_1_List+= ID )* ;
    public final api2molParser.instanceName_return instanceName() throws RecognitionException {
        api2molParser.instanceName_return retval = new api2molParser.instanceName_return();
        retval.start = input.LT(1);

        Token IDGen=null;
        Token DOTGen_List=null;
        Token IDGen_1_List=null;
        List list_DOTGen_List=null;
        List list_IDGen_1_List=null;

        try {
            // api2mol.g:112:1: (IDGen= ID (DOTGen_List+= DOT IDGen_1_List+= ID )* )
            // api2mol.g:112:4: IDGen= ID (DOTGen_List+= DOT IDGen_1_List+= ID )*
            {
            IDGen=(Token)match(input,ID,FOLLOW_ID_in_instanceName139); 
            // api2mol.g:112:13: (DOTGen_List+= DOT IDGen_1_List+= ID )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==DOT) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // api2mol.g:112:15: DOTGen_List+= DOT IDGen_1_List+= ID
            	    {
            	    DOTGen_List=(Token)match(input,DOT,FOLLOW_DOT_in_instanceName145); 
            	    if (list_DOTGen_List==null) list_DOTGen_List=new ArrayList();
            	    list_DOTGen_List.add(DOTGen_List);

            	    IDGen_1_List=(Token)match(input,ID,FOLLOW_ID_in_instanceName150); 
            	    if (list_IDGen_1_List==null) list_IDGen_1_List=new ArrayList();
            	    list_IDGen_1_List.add(IDGen_1_List);


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            		// Create return CST Node
            		Node instanceNameReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
            		instanceNameReturnNode.setKind("instanceName");
            	    // Create a CST Leaf
            		if(IDGen != null) {
            			Leaf IDGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf("ID", (IDGen!=null?IDGen.getText():null), IDGen.getCharPositionInLine(), IDGen.getLine());
            			instanceNameReturnNode.getChildren().add(IDGenLeaf);
            		}

            		// Create a special CST Node for terminal DOTGen_List aggregation
            		if(list_DOTGen_List != null) {
            	    for(int pos = 0; pos < list_DOTGen_List.size(); pos++ )  { 
            		// Terminal extractor
            	    if(list_DOTGen_List != null) {
            		    Token t = (Token) list_DOTGen_List.get(pos); 
            		    Leaf DOTGen_ListLeaf = CSTFactoryImpl.eINSTANCE.createLeaf("DOT", t.getText(), t.getCharPositionInLine(), t.getLine());
            			instanceNameReturnNode.getChildren().add(DOTGen_ListLeaf);
            		}
            		// Terminal extractor
            	    if(list_IDGen_1_List != null) {
            		    Token t = (Token) list_IDGen_1_List.get(pos); 
            		    Leaf IDGen_1_ListLeaf = CSTFactoryImpl.eINSTANCE.createLeaf("ID", t.getText(), t.getCharPositionInLine(), t.getLine());
            			instanceNameReturnNode.getChildren().add(IDGen_1_ListLeaf);
            		}
            		}
            		}

            		// Returns the Node with CST Leaves/Nodes
            		retval.returnNode = instanceNameReturnNode;
            	

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
    // $ANTLR end "instanceName"

    public static class section_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "section"
    // api2mol.g:146:1: section returns [Node returnNode] : (newSectionGen+= newSection | multipleSectionGen+= multipleSection | propertySectionGen+= propertySection );
    public final api2molParser.section_return section() throws RecognitionException {
        api2molParser.section_return retval = new api2molParser.section_return();
        retval.start = input.LT(1);

        List list_newSectionGen=null;
        List list_multipleSectionGen=null;
        List list_propertySectionGen=null;
        RuleReturnScope newSectionGen = null;
        RuleReturnScope multipleSectionGen = null;
        RuleReturnScope propertySectionGen = null;
        try {
            // api2mol.g:147:1: (newSectionGen+= newSection | multipleSectionGen+= multipleSection | propertySectionGen+= propertySection )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt4=1;
                }
                break;
            case 18:
                {
                alt4=2;
                }
                break;
            case ID:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // api2mol.g:147:4: newSectionGen+= newSection
                    {
                    pushFollow(FOLLOW_newSection_in_section174);
                    newSectionGen=newSection();

                    state._fsp--;

                    if (list_newSectionGen==null) list_newSectionGen=new ArrayList();
                    list_newSectionGen.add(newSectionGen);


                    		// Create return CST Node
                    		Node sectionReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                    		sectionReturnNode.setKind("section");
                    	    // Create a CST Node
                    		if(list_newSectionGen != null) {
                    	        for(Iterator it = list_newSectionGen.iterator(); it.hasNext(); )  { 
                    	            api2molParser.newSection_return r = (api2molParser.newSection_return) it.next(); 
                    	            if(r != null && r.returnNode != null) {
                    	            	r.returnNode.setKind("newSection");
                    	            	sectionReturnNode.getChildren().add(r.returnNode);
                    	            } 
                    	        }
                    	    }
                    		// Returns the Node with CST Leaves/Nodes
                    		retval.returnNode = sectionReturnNode;
                    	

                    }
                    break;
                case 2 :
                    // api2mol.g:165:5: multipleSectionGen+= multipleSection
                    {
                    pushFollow(FOLLOW_multipleSection_in_section186);
                    multipleSectionGen=multipleSection();

                    state._fsp--;

                    if (list_multipleSectionGen==null) list_multipleSectionGen=new ArrayList();
                    list_multipleSectionGen.add(multipleSectionGen);


                    		// Create return CST Node
                    		Node sectionReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                    		sectionReturnNode.setKind("section");
                    	    // Create a CST Node
                    		if(list_multipleSectionGen != null) {
                    	        for(Iterator it = list_multipleSectionGen.iterator(); it.hasNext(); )  { 
                    	            api2molParser.multipleSection_return r = (api2molParser.multipleSection_return) it.next(); 
                    	            if(r != null && r.returnNode != null) {
                    	            	r.returnNode.setKind("multipleSection");
                    	            	sectionReturnNode.getChildren().add(r.returnNode);
                    	            } 
                    	        }
                    	    }
                    		// Returns the Node with CST Leaves/Nodes
                    		retval.returnNode = sectionReturnNode;
                    	

                    }
                    break;
                case 3 :
                    // api2mol.g:183:5: propertySectionGen+= propertySection
                    {
                    pushFollow(FOLLOW_propertySection_in_section198);
                    propertySectionGen=propertySection();

                    state._fsp--;

                    if (list_propertySectionGen==null) list_propertySectionGen=new ArrayList();
                    list_propertySectionGen.add(propertySectionGen);


                    		// Create return CST Node
                    		Node sectionReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                    		sectionReturnNode.setKind("section");
                    	    // Create a CST Node
                    		if(list_propertySectionGen != null) {
                    	        for(Iterator it = list_propertySectionGen.iterator(); it.hasNext(); )  { 
                    	            api2molParser.propertySection_return r = (api2molParser.propertySection_return) it.next(); 
                    	            if(r != null && r.returnNode != null) {
                    	            	r.returnNode.setKind("propertySection");
                    	            	sectionReturnNode.getChildren().add(r.returnNode);
                    	            } 
                    	        }
                    	    }
                    		// Returns the Node with CST Leaves/Nodes
                    		retval.returnNode = sectionReturnNode;
                    	

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
    // $ANTLR end "section"

    public static class newSection_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "newSection"
    // api2mol.g:203:1: newSection returns [Node returnNode] : TK_0= '@new' (constructorCallGen+= constructorCall )* ;
    public final api2molParser.newSection_return newSection() throws RecognitionException {
        api2molParser.newSection_return retval = new api2molParser.newSection_return();
        retval.start = input.LT(1);

        Token TK_0=null;
        List list_constructorCallGen=null;
        RuleReturnScope constructorCallGen = null;
        try {
            // api2mol.g:204:1: (TK_0= '@new' (constructorCallGen+= constructorCall )* )
            // api2mol.g:204:4: TK_0= '@new' (constructorCallGen+= constructorCall )*
            {
            TK_0=(Token)match(input,17,FOLLOW_17_in_newSection220); 
            // api2mol.g:204:35: (constructorCallGen+= constructorCall )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==ID) ) {
                    int LA5_4 = input.LA(2);

                    if ( (LA5_4==LPAREN) ) {
                        alt5=1;
                    }


                }


                switch (alt5) {
            	case 1 :
            	    // api2mol.g:204:35: constructorCallGen+= constructorCall
            	    {
            	    pushFollow(FOLLOW_constructorCall_in_newSection225);
            	    constructorCallGen=constructorCall();

            	    state._fsp--;

            	    if (list_constructorCallGen==null) list_constructorCallGen=new ArrayList();
            	    list_constructorCallGen.add(constructorCallGen);


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            		// Create return CST Node
            		Node newSectionReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
            		newSectionReturnNode.setKind("newSection");
            	    // Create a Token CST Leaf	
            	    if(TK_0 != null) {
            			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_0!=null?TK_0.getText():null), TK_0.getCharPositionInLine(), TK_0.getLine());
            	 		newSectionReturnNode.getChildren().add(TK_0Leaf);
            	 	}
            	    // Create a CST Node
            		if(list_constructorCallGen != null) {
            	        for(Iterator it = list_constructorCallGen.iterator(); it.hasNext(); )  { 
            	            api2molParser.constructorCall_return r = (api2molParser.constructorCall_return) it.next(); 
            	            if(r != null && r.returnNode != null) {
            	            	r.returnNode.setKind("constructorCall");
            	            	newSectionReturnNode.getChildren().add(r.returnNode);
            	            } 
            	        }
            	    }
            		// Returns the Node with CST Leaves/Nodes
            		retval.returnNode = newSectionReturnNode;
            	

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
    // $ANTLR end "newSection"

    public static class multipleSection_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "multipleSection"
    // api2mol.g:229:1: multipleSection returns [Node returnNode] : TK_0= '@multiple' (statementGen+= statement )* ;
    public final api2molParser.multipleSection_return multipleSection() throws RecognitionException {
        api2molParser.multipleSection_return retval = new api2molParser.multipleSection_return();
        retval.start = input.LT(1);

        Token TK_0=null;
        List list_statementGen=null;
        RuleReturnScope statementGen = null;
        try {
            // api2mol.g:230:1: (TK_0= '@multiple' (statementGen+= statement )* )
            // api2mol.g:230:4: TK_0= '@multiple' (statementGen+= statement )*
            {
            TK_0=(Token)match(input,18,FOLLOW_18_in_multipleSection250); 
            // api2mol.g:230:34: (statementGen+= statement )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==ID) ) {
                    int LA6_4 = input.LA(2);

                    if ( (LA6_4==ID||LA6_4==LPAREN||LA6_4==SEMI) ) {
                        alt6=1;
                    }


                }


                switch (alt6) {
            	case 1 :
            	    // api2mol.g:230:34: statementGen+= statement
            	    {
            	    pushFollow(FOLLOW_statement_in_multipleSection255);
            	    statementGen=statement();

            	    state._fsp--;

            	    if (list_statementGen==null) list_statementGen=new ArrayList();
            	    list_statementGen.add(statementGen);


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            		// Create return CST Node
            		Node multipleSectionReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
            		multipleSectionReturnNode.setKind("multipleSection");
            	    // Create a Token CST Leaf	
            	    if(TK_0 != null) {
            			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_0!=null?TK_0.getText():null), TK_0.getCharPositionInLine(), TK_0.getLine());
            	 		multipleSectionReturnNode.getChildren().add(TK_0Leaf);
            	 	}
            	    // Create a CST Node
            		if(list_statementGen != null) {
            	        for(Iterator it = list_statementGen.iterator(); it.hasNext(); )  { 
            	            api2molParser.statement_return r = (api2molParser.statement_return) it.next(); 
            	            if(r != null && r.returnNode != null) {
            	            	r.returnNode.setKind("statement");
            	            	multipleSectionReturnNode.getChildren().add(r.returnNode);
            	            } 
            	        }
            	    }
            		// Returns the Node with CST Leaves/Nodes
            		retval.returnNode = multipleSectionReturnNode;
            	

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
    // $ANTLR end "multipleSection"

    public static class propertySection_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "propertySection"
    // api2mol.g:255:1: propertySection returns [Node returnNode] : IDGen= ID COLONGen= COLON (statementGen+= statement )* ;
    public final api2molParser.propertySection_return propertySection() throws RecognitionException {
        api2molParser.propertySection_return retval = new api2molParser.propertySection_return();
        retval.start = input.LT(1);

        Token IDGen=null;
        Token COLONGen=null;
        List list_statementGen=null;
        RuleReturnScope statementGen = null;
        try {
            // api2mol.g:256:1: (IDGen= ID COLONGen= COLON (statementGen+= statement )* )
            // api2mol.g:256:4: IDGen= ID COLONGen= COLON (statementGen+= statement )*
            {
            IDGen=(Token)match(input,ID,FOLLOW_ID_in_propertySection278); 
            COLONGen=(Token)match(input,COLON,FOLLOW_COLON_in_propertySection283); 
            // api2mol.g:256:42: (statementGen+= statement )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==ID) ) {
                    int LA7_4 = input.LA(2);

                    if ( (LA7_4==ID||LA7_4==LPAREN||LA7_4==SEMI) ) {
                        alt7=1;
                    }


                }


                switch (alt7) {
            	case 1 :
            	    // api2mol.g:256:42: statementGen+= statement
            	    {
            	    pushFollow(FOLLOW_statement_in_propertySection288);
            	    statementGen=statement();

            	    state._fsp--;

            	    if (list_statementGen==null) list_statementGen=new ArrayList();
            	    list_statementGen.add(statementGen);


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            		// Create return CST Node
            		Node propertySectionReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
            		propertySectionReturnNode.setKind("propertySection");
            	    // Create a CST Leaf
            		if(IDGen != null) {
            			Leaf IDGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf("ID", (IDGen!=null?IDGen.getText():null), IDGen.getCharPositionInLine(), IDGen.getLine());
            			propertySectionReturnNode.getChildren().add(IDGenLeaf);
            		}
            	    // Create a CST Leaf
            		if(COLONGen != null) {
            			Leaf COLONGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf("COLON", (COLONGen!=null?COLONGen.getText():null), COLONGen.getCharPositionInLine(), COLONGen.getLine());
            			propertySectionReturnNode.getChildren().add(COLONGenLeaf);
            		}
            	    // Create a CST Node
            		if(list_statementGen != null) {
            	        for(Iterator it = list_statementGen.iterator(); it.hasNext(); )  { 
            	            api2molParser.statement_return r = (api2molParser.statement_return) it.next(); 
            	            if(r != null && r.returnNode != null) {
            	            	r.returnNode.setKind("statement");
            	            	propertySectionReturnNode.getChildren().add(r.returnNode);
            	            } 
            	        }
            	    }
            		// Returns the Node with CST Leaves/Nodes
            		retval.returnNode = propertySectionReturnNode;
            	

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
    // $ANTLR end "propertySection"

    public static class statement_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "statement"
    // api2mol.g:286:1: statement returns [Node returnNode] : IDGen= ID (LPARENGen= LPAREN variableGen+= variable (COMMAGen_List+= COMMA variableGen_1+= variable )* RPARENGen= RPAREN )? (methodCallGen+= methodCall )? SEMIGen= SEMI ;
    public final api2molParser.statement_return statement() throws RecognitionException {
        api2molParser.statement_return retval = new api2molParser.statement_return();
        retval.start = input.LT(1);

        Token IDGen=null;
        Token LPARENGen=null;
        Token RPARENGen=null;
        Token SEMIGen=null;
        Token COMMAGen_List=null;
        List list_COMMAGen_List=null;
        List list_variableGen=null;
        List list_variableGen_1=null;
        List list_methodCallGen=null;
        RuleReturnScope variableGen = null;
        RuleReturnScope variableGen_1 = null;
        RuleReturnScope methodCallGen = null;
        try {
            // api2mol.g:287:1: (IDGen= ID (LPARENGen= LPAREN variableGen+= variable (COMMAGen_List+= COMMA variableGen_1+= variable )* RPARENGen= RPAREN )? (methodCallGen+= methodCall )? SEMIGen= SEMI )
            // api2mol.g:287:4: IDGen= ID (LPARENGen= LPAREN variableGen+= variable (COMMAGen_List+= COMMA variableGen_1+= variable )* RPARENGen= RPAREN )? (methodCallGen+= methodCall )? SEMIGen= SEMI
            {
            IDGen=(Token)match(input,ID,FOLLOW_ID_in_statement311); 
            // api2mol.g:287:13: (LPARENGen= LPAREN variableGen+= variable (COMMAGen_List+= COMMA variableGen_1+= variable )* RPARENGen= RPAREN )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==LPAREN) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // api2mol.g:287:15: LPARENGen= LPAREN variableGen+= variable (COMMAGen_List+= COMMA variableGen_1+= variable )* RPARENGen= RPAREN
                    {
                    LPARENGen=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_statement317); 
                    pushFollow(FOLLOW_variable_in_statement322);
                    variableGen=variable();

                    state._fsp--;

                    if (list_variableGen==null) list_variableGen=new ArrayList();
                    list_variableGen.add(variableGen);

                    // api2mol.g:287:55: (COMMAGen_List+= COMMA variableGen_1+= variable )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==COMMA) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // api2mol.g:287:57: COMMAGen_List+= COMMA variableGen_1+= variable
                    	    {
                    	    COMMAGen_List=(Token)match(input,COMMA,FOLLOW_COMMA_in_statement328); 
                    	    if (list_COMMAGen_List==null) list_COMMAGen_List=new ArrayList();
                    	    list_COMMAGen_List.add(COMMAGen_List);

                    	    pushFollow(FOLLOW_variable_in_statement333);
                    	    variableGen_1=variable();

                    	    state._fsp--;

                    	    if (list_variableGen_1==null) list_variableGen_1=new ArrayList();
                    	    list_variableGen_1.add(variableGen_1);


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    RPARENGen=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_statement340); 

                    }
                    break;

            }

            // api2mol.g:287:125: (methodCallGen+= methodCall )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==ID) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // api2mol.g:287:127: methodCallGen+= methodCall
                    {
                    pushFollow(FOLLOW_methodCall_in_statement348);
                    methodCallGen=methodCall();

                    state._fsp--;

                    if (list_methodCallGen==null) list_methodCallGen=new ArrayList();
                    list_methodCallGen.add(methodCallGen);


                    }
                    break;

            }

            SEMIGen=(Token)match(input,SEMI,FOLLOW_SEMI_in_statement355); 

            		// Create return CST Node
            		Node statementReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
            		statementReturnNode.setKind("statement");
            	    // Create a CST Leaf
            		if(IDGen != null) {
            			Leaf IDGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf("ID", (IDGen!=null?IDGen.getText():null), IDGen.getCharPositionInLine(), IDGen.getLine());
            			statementReturnNode.getChildren().add(IDGenLeaf);
            		}
            	    // Create a CST Leaf
            		if(LPARENGen != null) {
            			Leaf LPARENGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf("LPAREN", (LPARENGen!=null?LPARENGen.getText():null), LPARENGen.getCharPositionInLine(), LPARENGen.getLine());
            			statementReturnNode.getChildren().add(LPARENGenLeaf);
            		}
            	    // Create a CST Node
            		if(list_variableGen != null) {
            	        for(Iterator it = list_variableGen.iterator(); it.hasNext(); )  { 
            	            api2molParser.variable_return r = (api2molParser.variable_return) it.next(); 
            	            if(r != null && r.returnNode != null) {
            	            	r.returnNode.setKind("variable");
            	            	statementReturnNode.getChildren().add(r.returnNode);
            	            } 
            	        }
            	    }

            		// Create a special CST Node for terminal COMMAGen_List aggregation
            		if(list_COMMAGen_List != null) {
            	    for(int pos = 0; pos < list_COMMAGen_List.size(); pos++ )  { 
            		// Terminal extractor
            	    if(list_COMMAGen_List != null) {
            		    Token t = (Token) list_COMMAGen_List.get(pos); 
            		    Leaf COMMAGen_ListLeaf = CSTFactoryImpl.eINSTANCE.createLeaf("COMMA", t.getText(), t.getCharPositionInLine(), t.getLine());
            			statementReturnNode.getChildren().add(COMMAGen_ListLeaf);
            		}
            		// No Terminal extractor
            	    if(list_variableGen_1 != null) {		
            	    	api2molParser.variable_return r = (api2molParser.variable_return) list_variableGen_1.get(pos); 
            	    	if(r != null && r.returnNode != null) {
            	        	r.returnNode.setKind("variable");
            	    		statementReturnNode.getChildren().add(r.returnNode);
            	    	} 
            		}
            		}
            		}

            	    // Create a CST Leaf
            		if(RPARENGen != null) {
            			Leaf RPARENGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf("RPAREN", (RPARENGen!=null?RPARENGen.getText():null), RPARENGen.getCharPositionInLine(), RPARENGen.getLine());
            			statementReturnNode.getChildren().add(RPARENGenLeaf);
            		}
            	    // Create a CST Node
            		if(list_methodCallGen != null) {
            	        for(Iterator it = list_methodCallGen.iterator(); it.hasNext(); )  { 
            	            api2molParser.methodCall_return r = (api2molParser.methodCall_return) it.next(); 
            	            if(r != null && r.returnNode != null) {
            	            	r.returnNode.setKind("methodCall");
            	            	statementReturnNode.getChildren().add(r.returnNode);
            	            } 
            	        }
            	    }
            	    // Create a CST Leaf
            		if(SEMIGen != null) {
            			Leaf SEMIGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf("SEMI", (SEMIGen!=null?SEMIGen.getText():null), SEMIGen.getCharPositionInLine(), SEMIGen.getLine());
            			statementReturnNode.getChildren().add(SEMIGenLeaf);
            		}
            		// Returns the Node with CST Leaves/Nodes
            		retval.returnNode = statementReturnNode;
            	

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

    public static class constructorCall_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "constructorCall"
    // api2mol.g:358:1: constructorCall returns [Node returnNode] : IDGen= ID LPARENGen= LPAREN (paramGen+= param (COMMAGen_List+= COMMA paramGen_1+= param )* )? RPARENGen= RPAREN SEMIGen= SEMI ;
    public final api2molParser.constructorCall_return constructorCall() throws RecognitionException {
        api2molParser.constructorCall_return retval = new api2molParser.constructorCall_return();
        retval.start = input.LT(1);

        Token IDGen=null;
        Token LPARENGen=null;
        Token RPARENGen=null;
        Token SEMIGen=null;
        Token COMMAGen_List=null;
        List list_COMMAGen_List=null;
        List list_paramGen=null;
        List list_paramGen_1=null;
        RuleReturnScope paramGen = null;
        RuleReturnScope paramGen_1 = null;
        try {
            // api2mol.g:359:1: (IDGen= ID LPARENGen= LPAREN (paramGen+= param (COMMAGen_List+= COMMA paramGen_1+= param )* )? RPARENGen= RPAREN SEMIGen= SEMI )
            // api2mol.g:359:4: IDGen= ID LPARENGen= LPAREN (paramGen+= param (COMMAGen_List+= COMMA paramGen_1+= param )* )? RPARENGen= RPAREN SEMIGen= SEMI
            {
            IDGen=(Token)match(input,ID,FOLLOW_ID_in_constructorCall377); 
            LPARENGen=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_constructorCall382); 
            // api2mol.g:359:31: (paramGen+= param (COMMAGen_List+= COMMA paramGen_1+= param )* )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==ID) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // api2mol.g:359:33: paramGen+= param (COMMAGen_List+= COMMA paramGen_1+= param )*
                    {
                    pushFollow(FOLLOW_param_in_constructorCall388);
                    paramGen=param();

                    state._fsp--;

                    if (list_paramGen==null) list_paramGen=new ArrayList();
                    list_paramGen.add(paramGen);

                    // api2mol.g:359:49: (COMMAGen_List+= COMMA paramGen_1+= param )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==COMMA) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // api2mol.g:359:51: COMMAGen_List+= COMMA paramGen_1+= param
                    	    {
                    	    COMMAGen_List=(Token)match(input,COMMA,FOLLOW_COMMA_in_constructorCall394); 
                    	    if (list_COMMAGen_List==null) list_COMMAGen_List=new ArrayList();
                    	    list_COMMAGen_List.add(COMMAGen_List);

                    	    pushFollow(FOLLOW_param_in_constructorCall399);
                    	    paramGen_1=param();

                    	    state._fsp--;

                    	    if (list_paramGen_1==null) list_paramGen_1=new ArrayList();
                    	    list_paramGen_1.add(paramGen_1);


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);


                    }
                    break;

            }

            RPARENGen=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_constructorCall408); 
            SEMIGen=(Token)match(input,SEMI,FOLLOW_SEMI_in_constructorCall413); 

            		// Create return CST Node
            		Node constructorCallReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
            		constructorCallReturnNode.setKind("constructorCall");
            	    // Create a CST Leaf
            		if(IDGen != null) {
            			Leaf IDGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf("ID", (IDGen!=null?IDGen.getText():null), IDGen.getCharPositionInLine(), IDGen.getLine());
            			constructorCallReturnNode.getChildren().add(IDGenLeaf);
            		}
            	    // Create a CST Leaf
            		if(LPARENGen != null) {
            			Leaf LPARENGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf("LPAREN", (LPARENGen!=null?LPARENGen.getText():null), LPARENGen.getCharPositionInLine(), LPARENGen.getLine());
            			constructorCallReturnNode.getChildren().add(LPARENGenLeaf);
            		}
            	    // Create a CST Node
            		if(list_paramGen != null) {
            	        for(Iterator it = list_paramGen.iterator(); it.hasNext(); )  { 
            	            api2molParser.param_return r = (api2molParser.param_return) it.next(); 
            	            if(r != null && r.returnNode != null) {
            	            	r.returnNode.setKind("param");
            	            	constructorCallReturnNode.getChildren().add(r.returnNode);
            	            } 
            	        }
            	    }

            		// Create a special CST Node for terminal COMMAGen_List aggregation
            		if(list_COMMAGen_List != null) {
            	    for(int pos = 0; pos < list_COMMAGen_List.size(); pos++ )  { 
            		// Terminal extractor
            	    if(list_COMMAGen_List != null) {
            		    Token t = (Token) list_COMMAGen_List.get(pos); 
            		    Leaf COMMAGen_ListLeaf = CSTFactoryImpl.eINSTANCE.createLeaf("COMMA", t.getText(), t.getCharPositionInLine(), t.getLine());
            			constructorCallReturnNode.getChildren().add(COMMAGen_ListLeaf);
            		}
            		// No Terminal extractor
            	    if(list_paramGen_1 != null) {		
            	    	api2molParser.param_return r = (api2molParser.param_return) list_paramGen_1.get(pos); 
            	    	if(r != null && r.returnNode != null) {
            	        	r.returnNode.setKind("param");
            	    		constructorCallReturnNode.getChildren().add(r.returnNode);
            	    	} 
            		}
            		}
            		}

            	    // Create a CST Leaf
            		if(RPARENGen != null) {
            			Leaf RPARENGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf("RPAREN", (RPARENGen!=null?RPARENGen.getText():null), RPARENGen.getCharPositionInLine(), RPARENGen.getLine());
            			constructorCallReturnNode.getChildren().add(RPARENGenLeaf);
            		}
            	    // Create a CST Leaf
            		if(SEMIGen != null) {
            			Leaf SEMIGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf("SEMI", (SEMIGen!=null?SEMIGen.getText():null), SEMIGen.getCharPositionInLine(), SEMIGen.getLine());
            			constructorCallReturnNode.getChildren().add(SEMIGenLeaf);
            		}
            		// Returns the Node with CST Leaves/Nodes
            		retval.returnNode = constructorCallReturnNode;
            	

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
    // $ANTLR end "constructorCall"

    public static class methodCall_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "methodCall"
    // api2mol.g:420:1: methodCall returns [Node returnNode] : IDGen= ID (LPARENGen= LPAREN (paramGen+= param (COMMAGen_List+= COMMA paramGen_1+= param )* )? RPARENGen= RPAREN )? ;
    public final api2molParser.methodCall_return methodCall() throws RecognitionException {
        api2molParser.methodCall_return retval = new api2molParser.methodCall_return();
        retval.start = input.LT(1);

        Token IDGen=null;
        Token LPARENGen=null;
        Token RPARENGen=null;
        Token COMMAGen_List=null;
        List list_COMMAGen_List=null;
        List list_paramGen=null;
        List list_paramGen_1=null;
        RuleReturnScope paramGen = null;
        RuleReturnScope paramGen_1 = null;
        try {
            // api2mol.g:421:1: (IDGen= ID (LPARENGen= LPAREN (paramGen+= param (COMMAGen_List+= COMMA paramGen_1+= param )* )? RPARENGen= RPAREN )? )
            // api2mol.g:421:4: IDGen= ID (LPARENGen= LPAREN (paramGen+= param (COMMAGen_List+= COMMA paramGen_1+= param )* )? RPARENGen= RPAREN )?
            {
            IDGen=(Token)match(input,ID,FOLLOW_ID_in_methodCall435); 
            // api2mol.g:421:13: (LPARENGen= LPAREN (paramGen+= param (COMMAGen_List+= COMMA paramGen_1+= param )* )? RPARENGen= RPAREN )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==LPAREN) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // api2mol.g:421:15: LPARENGen= LPAREN (paramGen+= param (COMMAGen_List+= COMMA paramGen_1+= param )* )? RPARENGen= RPAREN
                    {
                    LPARENGen=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_methodCall441); 
                    // api2mol.g:421:32: (paramGen+= param (COMMAGen_List+= COMMA paramGen_1+= param )* )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==ID) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // api2mol.g:421:34: paramGen+= param (COMMAGen_List+= COMMA paramGen_1+= param )*
                            {
                            pushFollow(FOLLOW_param_in_methodCall447);
                            paramGen=param();

                            state._fsp--;

                            if (list_paramGen==null) list_paramGen=new ArrayList();
                            list_paramGen.add(paramGen);

                            // api2mol.g:421:50: (COMMAGen_List+= COMMA paramGen_1+= param )*
                            loop13:
                            do {
                                int alt13=2;
                                int LA13_0 = input.LA(1);

                                if ( (LA13_0==COMMA) ) {
                                    alt13=1;
                                }


                                switch (alt13) {
                            	case 1 :
                            	    // api2mol.g:421:52: COMMAGen_List+= COMMA paramGen_1+= param
                            	    {
                            	    COMMAGen_List=(Token)match(input,COMMA,FOLLOW_COMMA_in_methodCall453); 
                            	    if (list_COMMAGen_List==null) list_COMMAGen_List=new ArrayList();
                            	    list_COMMAGen_List.add(COMMAGen_List);

                            	    pushFollow(FOLLOW_param_in_methodCall458);
                            	    paramGen_1=param();

                            	    state._fsp--;

                            	    if (list_paramGen_1==null) list_paramGen_1=new ArrayList();
                            	    list_paramGen_1.add(paramGen_1);


                            	    }
                            	    break;

                            	default :
                            	    break loop13;
                                }
                            } while (true);


                            }
                            break;

                    }

                    RPARENGen=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_methodCall467); 

                    }
                    break;

            }


            		// Create return CST Node
            		Node methodCallReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
            		methodCallReturnNode.setKind("methodCall");
            	    // Create a CST Leaf
            		if(IDGen != null) {
            			Leaf IDGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf("ID", (IDGen!=null?IDGen.getText():null), IDGen.getCharPositionInLine(), IDGen.getLine());
            			methodCallReturnNode.getChildren().add(IDGenLeaf);
            		}
            	    // Create a CST Leaf
            		if(LPARENGen != null) {
            			Leaf LPARENGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf("LPAREN", (LPARENGen!=null?LPARENGen.getText():null), LPARENGen.getCharPositionInLine(), LPARENGen.getLine());
            			methodCallReturnNode.getChildren().add(LPARENGenLeaf);
            		}
            	    // Create a CST Node
            		if(list_paramGen != null) {
            	        for(Iterator it = list_paramGen.iterator(); it.hasNext(); )  { 
            	            api2molParser.param_return r = (api2molParser.param_return) it.next(); 
            	            if(r != null && r.returnNode != null) {
            	            	r.returnNode.setKind("param");
            	            	methodCallReturnNode.getChildren().add(r.returnNode);
            	            } 
            	        }
            	    }

            		// Create a special CST Node for terminal COMMAGen_List aggregation
            		if(list_COMMAGen_List != null) {
            	    for(int pos = 0; pos < list_COMMAGen_List.size(); pos++ )  { 
            		// Terminal extractor
            	    if(list_COMMAGen_List != null) {
            		    Token t = (Token) list_COMMAGen_List.get(pos); 
            		    Leaf COMMAGen_ListLeaf = CSTFactoryImpl.eINSTANCE.createLeaf("COMMA", t.getText(), t.getCharPositionInLine(), t.getLine());
            			methodCallReturnNode.getChildren().add(COMMAGen_ListLeaf);
            		}
            		// No Terminal extractor
            	    if(list_paramGen_1 != null) {		
            	    	api2molParser.param_return r = (api2molParser.param_return) list_paramGen_1.get(pos); 
            	    	if(r != null && r.returnNode != null) {
            	        	r.returnNode.setKind("param");
            	    		methodCallReturnNode.getChildren().add(r.returnNode);
            	    	} 
            		}
            		}
            		}

            	    // Create a CST Leaf
            		if(RPARENGen != null) {
            			Leaf RPARENGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf("RPAREN", (RPARENGen!=null?RPARENGen.getText():null), RPARENGen.getCharPositionInLine(), RPARENGen.getLine());
            			methodCallReturnNode.getChildren().add(RPARENGenLeaf);
            		}
            		// Returns the Node with CST Leaves/Nodes
            		retval.returnNode = methodCallReturnNode;
            	

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
    // $ANTLR end "methodCall"

    public static class variable_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "variable"
    // api2mol.g:477:1: variable returns [Node returnNode] : IDGen= ID ;
    public final api2molParser.variable_return variable() throws RecognitionException {
        api2molParser.variable_return retval = new api2molParser.variable_return();
        retval.start = input.LT(1);

        Token IDGen=null;

        try {
            // api2mol.g:478:1: (IDGen= ID )
            // api2mol.g:478:4: IDGen= ID
            {
            IDGen=(Token)match(input,ID,FOLLOW_ID_in_variable491); 

            		// Create return CST Node
            		Node variableReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
            		variableReturnNode.setKind("variable");
            	    // Create a CST Leaf
            		if(IDGen != null) {
            			Leaf IDGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf("ID", (IDGen!=null?IDGen.getText():null), IDGen.getCharPositionInLine(), IDGen.getLine());
            			variableReturnNode.getChildren().add(IDGenLeaf);
            		}
            		// Returns the Node with CST Leaves/Nodes
            		retval.returnNode = variableReturnNode;
            	

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
    // $ANTLR end "variable"

    public static class param_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "param"
    // api2mol.g:494:1: param returns [Node returnNode] : IDGen= ID ;
    public final api2molParser.param_return param() throws RecognitionException {
        api2molParser.param_return retval = new api2molParser.param_return();
        retval.start = input.LT(1);

        Token IDGen=null;

        try {
            // api2mol.g:495:1: (IDGen= ID )
            // api2mol.g:495:4: IDGen= ID
            {
            IDGen=(Token)match(input,ID,FOLLOW_ID_in_param514); 

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

    // Delegated rules


 

    public static final BitSet FOLLOW_mapping_in_mainRule45 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_metaclassName_in_mapping68 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_COLON_in_mapping73 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_instanceName_in_mapping78 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_LCURLY_in_mapping83 = new BitSet(new long[]{0x00000000000600C0L});
    public static final BitSet FOLLOW_section_in_mapping88 = new BitSet(new long[]{0x00000000000600C0L});
    public static final BitSet FOLLOW_RCURLY_in_mapping94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_metaclassName116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_instanceName139 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_DOT_in_instanceName145 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ID_in_instanceName150 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_newSection_in_section174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_multipleSection_in_section186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_propertySection_in_section198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_newSection220 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_constructorCall_in_newSection225 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_18_in_multipleSection250 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_statement_in_multipleSection255 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_ID_in_propertySection278 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_COLON_in_propertySection283 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_statement_in_propertySection288 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_ID_in_statement311 = new BitSet(new long[]{0x0000000000001280L});
    public static final BitSet FOLLOW_LPAREN_in_statement317 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_variable_in_statement322 = new BitSet(new long[]{0x0000000000000C00L});
    public static final BitSet FOLLOW_COMMA_in_statement328 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_variable_in_statement333 = new BitSet(new long[]{0x0000000000000C00L});
    public static final BitSet FOLLOW_RPAREN_in_statement340 = new BitSet(new long[]{0x0000000000001080L});
    public static final BitSet FOLLOW_methodCall_in_statement348 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_SEMI_in_statement355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_constructorCall377 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_LPAREN_in_constructorCall382 = new BitSet(new long[]{0x0000000000000880L});
    public static final BitSet FOLLOW_param_in_constructorCall388 = new BitSet(new long[]{0x0000000000000C00L});
    public static final BitSet FOLLOW_COMMA_in_constructorCall394 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_param_in_constructorCall399 = new BitSet(new long[]{0x0000000000000C00L});
    public static final BitSet FOLLOW_RPAREN_in_constructorCall408 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_SEMI_in_constructorCall413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_methodCall435 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_LPAREN_in_methodCall441 = new BitSet(new long[]{0x0000000000000880L});
    public static final BitSet FOLLOW_param_in_methodCall447 = new BitSet(new long[]{0x0000000000000C00L});
    public static final BitSet FOLLOW_COMMA_in_methodCall453 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_param_in_methodCall458 = new BitSet(new long[]{0x0000000000000C00L});
    public static final BitSet FOLLOW_RPAREN_in_methodCall467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_variable491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_param514 = new BitSet(new long[]{0x0000000000000002L});

}