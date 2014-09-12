// $ANTLR 3.0.1 /home/jlcanovas/workspace/Grammar2Model.examples.ABNF2MModel/files/gen/ABNF.ge3 2009-05-13 11:37:14

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
public class ABNFParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "DOUBLEARROW", "ARROW", "ID", "ABSTRACT", "WS", "';'", "'['", "'<'", "':'", "'>'", "'*'", "'+'", "'?'", "']'"
    };
    public static final int WS=8;
    public static final int ARROW=5;
    public static final int ABSTRACT=7;
    public static final int ID=6;
    public static final int EOF=-1;
    public static final int DOUBLEARROW=4;

        public ABNFParser(TokenStream input) {
            super(input);
            ruleMemo = new HashMap[19+1];
         }
        
    protected StringTemplateGroup templateLib =
      new StringTemplateGroup("ABNFParserTemplates", AngleBracketTemplateLexer.class);

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
    public String getGrammarFileName() { return "/home/jlcanovas/workspace/Grammar2Model.examples.ABNF2MModel/files/gen/ABNF.ge3"; }


    public static class abnf_definition_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start abnf_definition
    // /home/jlcanovas/workspace/Grammar2Model.examples.ABNF2MModel/files/gen/ABNF.ge3:18:1: abnf_definition returns [Node returnNode] : (ruleGen+= rule )* ;
    public final abnf_definition_return abnf_definition() throws RecognitionException {
        abnf_definition_return retval = new abnf_definition_return();
        retval.start = input.LT(1);

        List list_ruleGen=null;
        RuleReturnScope ruleGen = null;
        try {
            // /home/jlcanovas/workspace/Grammar2Model.examples.ABNF2MModel/files/gen/ABNF.ge3:19:1: ( (ruleGen+= rule )* )
            // /home/jlcanovas/workspace/Grammar2Model.examples.ABNF2MModel/files/gen/ABNF.ge3:19:3: (ruleGen+= rule )*
            {
            // /home/jlcanovas/workspace/Grammar2Model.examples.ABNF2MModel/files/gen/ABNF.ge3:19:10: (ruleGen+= rule )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==ID) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /home/jlcanovas/workspace/Grammar2Model.examples.ABNF2MModel/files/gen/ABNF.ge3:0:0: ruleGen+= rule
            	    {
            	    pushFollow(FOLLOW_rule_in_abnf_definition46);
            	    ruleGen=rule();
            	    _fsp--;
            	    if (failed) return retval;
            	    if (list_ruleGen==null) list_ruleGen=new ArrayList();
            	    list_ruleGen.add(ruleGen);


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            if ( backtracking==0 ) {
              
              		// Create return CST Node
              		Node abnf_definitionReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
              		abnf_definitionReturnNode.setKind("abnf_definition");
              	    // Create a CST Node
              		if(list_ruleGen != null) {
              	        for(Iterator it = list_ruleGen.iterator(); it.hasNext(); )  { 
              	            ABNFParser.rule_return r = (ABNFParser.rule_return) it.next(); 
              	            if(r != null && r.returnNode != null) {
              	            	r.returnNode.setKind("rule");
              	            	abnf_definitionReturnNode.getChildren().add(r.returnNode);
              	            } 
              	        }
              	    }
              		// Returns the Node with CST Leaves/Nodes
              		retval.returnNode = abnf_definitionReturnNode;
              	
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
    // $ANTLR end abnf_definition

    public static class rule_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start rule
    // /home/jlcanovas/workspace/Grammar2Model.examples.ABNF2MModel/files/gen/ABNF.ge3:39:1: rule returns [Node returnNode] : (hierarchy_ruleGen+= hierarchy_rule | specification_ruleGen+= specification_rule );
    public final rule_return rule() throws RecognitionException {
        rule_return retval = new rule_return();
        retval.start = input.LT(1);

        List list_hierarchy_ruleGen=null;
        List list_specification_ruleGen=null;
        RuleReturnScope hierarchy_ruleGen = null;
        RuleReturnScope specification_ruleGen = null;
        try {
            // /home/jlcanovas/workspace/Grammar2Model.examples.ABNF2MModel/files/gen/ABNF.ge3:40:1: (hierarchy_ruleGen+= hierarchy_rule | specification_ruleGen+= specification_rule )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==ID) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==DOUBLEARROW) ) {
                    alt2=1;
                }
                else if ( (LA2_1==ARROW) ) {
                    alt2=2;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("39:1: rule returns [Node returnNode] : (hierarchy_ruleGen+= hierarchy_rule | specification_ruleGen+= specification_rule );", 2, 1, input);

                    throw nvae;
                }
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("39:1: rule returns [Node returnNode] : (hierarchy_ruleGen+= hierarchy_rule | specification_ruleGen+= specification_rule );", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.ABNF2MModel/files/gen/ABNF.ge3:40:3: hierarchy_ruleGen+= hierarchy_rule
                    {
                    pushFollow(FOLLOW_hierarchy_rule_in_rule69);
                    hierarchy_ruleGen=hierarchy_rule();
                    _fsp--;
                    if (failed) return retval;
                    if (list_hierarchy_ruleGen==null) list_hierarchy_ruleGen=new ArrayList();
                    list_hierarchy_ruleGen.add(hierarchy_ruleGen);

                    if ( backtracking==0 ) {
                      
                      		// Create return CST Node
                      		Node ruleReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                      		ruleReturnNode.setKind("rule");
                      	    // Create a CST Node
                      		if(list_hierarchy_ruleGen != null) {
                      	        for(Iterator it = list_hierarchy_ruleGen.iterator(); it.hasNext(); )  { 
                      	            ABNFParser.hierarchy_rule_return r = (ABNFParser.hierarchy_rule_return) it.next(); 
                      	            if(r != null && r.returnNode != null) {
                      	            	r.returnNode.setKind("hierarchy_rule");
                      	            	ruleReturnNode.getChildren().add(r.returnNode);
                      	            } 
                      	        }
                      	    }
                      		// Returns the Node with CST Leaves/Nodes
                      		retval.returnNode = ruleReturnNode;
                      	
                    }

                    }
                    break;
                case 2 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.ABNF2MModel/files/gen/ABNF.ge3:58:4: specification_ruleGen+= specification_rule
                    {
                    pushFollow(FOLLOW_specification_rule_in_rule80);
                    specification_ruleGen=specification_rule();
                    _fsp--;
                    if (failed) return retval;
                    if (list_specification_ruleGen==null) list_specification_ruleGen=new ArrayList();
                    list_specification_ruleGen.add(specification_ruleGen);

                    if ( backtracking==0 ) {
                      
                      		// Create return CST Node
                      		Node ruleReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                      		ruleReturnNode.setKind("rule");
                      	    // Create a CST Node
                      		if(list_specification_ruleGen != null) {
                      	        for(Iterator it = list_specification_ruleGen.iterator(); it.hasNext(); )  { 
                      	            ABNFParser.specification_rule_return r = (ABNFParser.specification_rule_return) it.next(); 
                      	            if(r != null && r.returnNode != null) {
                      	            	r.returnNode.setKind("specification_rule");
                      	            	ruleReturnNode.getChildren().add(r.returnNode);
                      	            } 
                      	        }
                      	    }
                      		// Returns the Node with CST Leaves/Nodes
                      		retval.returnNode = ruleReturnNode;
                      	
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
    // $ANTLR end rule

    public static class hierarchy_rule_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start hierarchy_rule
    // /home/jlcanovas/workspace/Grammar2Model.examples.ABNF2MModel/files/gen/ABNF.ge3:78:1: hierarchy_rule returns [Node returnNode] : classIdGen+= classId (DOUBLEARROWGen= DOUBLEARROW subclassIdGen+= subclassId )+ TK_0= ';' ;
    public final hierarchy_rule_return hierarchy_rule() throws RecognitionException {
        hierarchy_rule_return retval = new hierarchy_rule_return();
        retval.start = input.LT(1);

        Token DOUBLEARROWGen=null;
        Token TK_0=null;
        List list_classIdGen=null;
        List list_subclassIdGen=null;
        RuleReturnScope classIdGen = null;
        RuleReturnScope subclassIdGen = null;
        try {
            // /home/jlcanovas/workspace/Grammar2Model.examples.ABNF2MModel/files/gen/ABNF.ge3:79:1: (classIdGen+= classId (DOUBLEARROWGen= DOUBLEARROW subclassIdGen+= subclassId )+ TK_0= ';' )
            // /home/jlcanovas/workspace/Grammar2Model.examples.ABNF2MModel/files/gen/ABNF.ge3:79:4: classIdGen+= classId (DOUBLEARROWGen= DOUBLEARROW subclassIdGen+= subclassId )+ TK_0= ';'
            {
            pushFollow(FOLLOW_classId_in_hierarchy_rule102);
            classIdGen=classId();
            _fsp--;
            if (failed) return retval;
            if (list_classIdGen==null) list_classIdGen=new ArrayList();
            list_classIdGen.add(classIdGen);

            // /home/jlcanovas/workspace/Grammar2Model.examples.ABNF2MModel/files/gen/ABNF.ge3:79:24: (DOUBLEARROWGen= DOUBLEARROW subclassIdGen+= subclassId )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==DOUBLEARROW) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // /home/jlcanovas/workspace/Grammar2Model.examples.ABNF2MModel/files/gen/ABNF.ge3:79:25: DOUBLEARROWGen= DOUBLEARROW subclassIdGen+= subclassId
            	    {
            	    DOUBLEARROWGen=(Token)input.LT(1);
            	    match(input,DOUBLEARROW,FOLLOW_DOUBLEARROW_in_hierarchy_rule107); if (failed) return retval;
            	    pushFollow(FOLLOW_subclassId_in_hierarchy_rule111);
            	    subclassIdGen=subclassId();
            	    _fsp--;
            	    if (failed) return retval;
            	    if (list_subclassIdGen==null) list_subclassIdGen=new ArrayList();
            	    list_subclassIdGen.add(subclassIdGen);


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
            	    if (backtracking>0) {failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);

            TK_0=(Token)input.LT(1);
            match(input,9,FOLLOW_9_in_hierarchy_rule117); if (failed) return retval;
            if ( backtracking==0 ) {
              
              		// Create return CST Node
              		Node hierarchy_ruleReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
              		hierarchy_ruleReturnNode.setKind("hierarchy_rule");
              	    // Create a CST Node
              		if(list_classIdGen != null) {
              	        for(Iterator it = list_classIdGen.iterator(); it.hasNext(); )  { 
              	            ABNFParser.classId_return r = (ABNFParser.classId_return) it.next(); 
              	            if(r != null && r.returnNode != null) {
              	            	r.returnNode.setKind("classId");
              	            	hierarchy_ruleReturnNode.getChildren().add(r.returnNode);
              	            } 
              	        }
              	    }
              	
              		// Create a special CST Node for terminal subclassIdGen aggregation
              		if(list_subclassIdGen != null) {
              	    for(int pos = 0; pos < list_subclassIdGen.size(); pos++ )  { 
              	    // Create a CST Leaf
              		if(DOUBLEARROWGen != null) {
              			Leaf DOUBLEARROWGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf();
              			DOUBLEARROWGenLeaf.setKind("DOUBLEARROW");
              			DOUBLEARROWGenLeaf.setValue(DOUBLEARROWGen.getText());
              			DOUBLEARROWGenLeaf.setPos(DOUBLEARROWGen.getCharPositionInLine());
              			DOUBLEARROWGenLeaf.setLine(DOUBLEARROWGen.getLine());
              			hierarchy_ruleReturnNode.getChildren().add(DOUBLEARROWGenLeaf);
              		}
              		// No Terminal extractor
              	    if(list_subclassIdGen != null) {		
              	    	ABNFParser.subclassId_return r = (ABNFParser.subclassId_return) list_subclassIdGen.get(pos); 
              	    	if(r != null && r.returnNode != null) {
              	        	r.returnNode.setKind("subclassId");
              	    		hierarchy_ruleReturnNode.getChildren().add(r.returnNode);
              	    	} 
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
              	 		hierarchy_ruleReturnNode.getChildren().add(TK_0Leaf);
              	 	}
              		// Returns the Node with CST Leaves/Nodes
              		retval.returnNode = hierarchy_ruleReturnNode;
              	
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
    // $ANTLR end hierarchy_rule

    public static class specification_rule_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start specification_rule
    // /home/jlcanovas/workspace/Grammar2Model.examples.ABNF2MModel/files/gen/ABNF.ge3:132:1: specification_rule returns [Node returnNode] : classIdGen+= classId ARROWGen= ARROW (attributeGen+= attribute )* TK_0= ';' ;
    public final specification_rule_return specification_rule() throws RecognitionException {
        specification_rule_return retval = new specification_rule_return();
        retval.start = input.LT(1);

        Token ARROWGen=null;
        Token TK_0=null;
        List list_classIdGen=null;
        List list_attributeGen=null;
        RuleReturnScope classIdGen = null;
        RuleReturnScope attributeGen = null;
        try {
            // /home/jlcanovas/workspace/Grammar2Model.examples.ABNF2MModel/files/gen/ABNF.ge3:133:1: (classIdGen+= classId ARROWGen= ARROW (attributeGen+= attribute )* TK_0= ';' )
            // /home/jlcanovas/workspace/Grammar2Model.examples.ABNF2MModel/files/gen/ABNF.ge3:133:4: classIdGen+= classId ARROWGen= ARROW (attributeGen+= attribute )* TK_0= ';'
            {
            pushFollow(FOLLOW_classId_in_specification_rule139);
            classIdGen=classId();
            _fsp--;
            if (failed) return retval;
            if (list_classIdGen==null) list_classIdGen=new ArrayList();
            list_classIdGen.add(classIdGen);

            ARROWGen=(Token)input.LT(1);
            match(input,ARROW,FOLLOW_ARROW_in_specification_rule143); if (failed) return retval;
            // /home/jlcanovas/workspace/Grammar2Model.examples.ABNF2MModel/files/gen/ABNF.ge3:133:51: (attributeGen+= attribute )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==ID||(LA4_0>=10 && LA4_0<=11)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // /home/jlcanovas/workspace/Grammar2Model.examples.ABNF2MModel/files/gen/ABNF.ge3:0:0: attributeGen+= attribute
            	    {
            	    pushFollow(FOLLOW_attribute_in_specification_rule147);
            	    attributeGen=attribute();
            	    _fsp--;
            	    if (failed) return retval;
            	    if (list_attributeGen==null) list_attributeGen=new ArrayList();
            	    list_attributeGen.add(attributeGen);


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            TK_0=(Token)input.LT(1);
            match(input,9,FOLLOW_9_in_specification_rule152); if (failed) return retval;
            if ( backtracking==0 ) {
              
              		// Create return CST Node
              		Node specification_ruleReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
              		specification_ruleReturnNode.setKind("specification_rule");
              	    // Create a CST Node
              		if(list_classIdGen != null) {
              	        for(Iterator it = list_classIdGen.iterator(); it.hasNext(); )  { 
              	            ABNFParser.classId_return r = (ABNFParser.classId_return) it.next(); 
              	            if(r != null && r.returnNode != null) {
              	            	r.returnNode.setKind("classId");
              	            	specification_ruleReturnNode.getChildren().add(r.returnNode);
              	            } 
              	        }
              	    }
              	    // Create a CST Leaf
              		if(ARROWGen != null) {
              			Leaf ARROWGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf();
              			ARROWGenLeaf.setKind("ARROW");
              			ARROWGenLeaf.setValue(ARROWGen.getText());
              			ARROWGenLeaf.setPos(ARROWGen.getCharPositionInLine());
              			ARROWGenLeaf.setLine(ARROWGen.getLine());
              			specification_ruleReturnNode.getChildren().add(ARROWGenLeaf);
              		}
              	    // Create a CST Node
              		if(list_attributeGen != null) {
              	        for(Iterator it = list_attributeGen.iterator(); it.hasNext(); )  { 
              	            ABNFParser.attribute_return r = (ABNFParser.attribute_return) it.next(); 
              	            if(r != null && r.returnNode != null) {
              	            	r.returnNode.setKind("attribute");
              	            	specification_ruleReturnNode.getChildren().add(r.returnNode);
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
              	 		specification_ruleReturnNode.getChildren().add(TK_0Leaf);
              	 	}
              		// Returns the Node with CST Leaves/Nodes
              		retval.returnNode = specification_ruleReturnNode;
              	
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
    // $ANTLR end specification_rule

    public static class classId_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start classId
    // /home/jlcanovas/workspace/Grammar2Model.examples.ABNF2MModel/files/gen/ABNF.ge3:181:1: classId returns [Node returnNode] : IDGen= ID ;
    public final classId_return classId() throws RecognitionException {
        classId_return retval = new classId_return();
        retval.start = input.LT(1);

        Token IDGen=null;

        try {
            // /home/jlcanovas/workspace/Grammar2Model.examples.ABNF2MModel/files/gen/ABNF.ge3:182:1: (IDGen= ID )
            // /home/jlcanovas/workspace/Grammar2Model.examples.ABNF2MModel/files/gen/ABNF.ge3:182:3: IDGen= ID
            {
            IDGen=(Token)input.LT(1);
            match(input,ID,FOLLOW_ID_in_classId174); if (failed) return retval;
            if ( backtracking==0 ) {
              
              		// Create return CST Node
              		Node classIdReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
              		classIdReturnNode.setKind("classId");
              	    // Create a CST Leaf
              		if(IDGen != null) {
              			Leaf IDGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf();
              			IDGenLeaf.setKind("ID");
              			IDGenLeaf.setValue(IDGen.getText());
              			IDGenLeaf.setPos(IDGen.getCharPositionInLine());
              			IDGenLeaf.setLine(IDGen.getLine());
              			classIdReturnNode.getChildren().add(IDGenLeaf);
              		}
              		// Returns the Node with CST Leaves/Nodes
              		retval.returnNode = classIdReturnNode;
              	
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
    // $ANTLR end classId

    public static class subclassId_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start subclassId
    // /home/jlcanovas/workspace/Grammar2Model.examples.ABNF2MModel/files/gen/ABNF.ge3:201:1: subclassId returns [Node returnNode] : (IDGen= ID | ABSTRACTGen= ABSTRACT IDGen= ID );
    public final subclassId_return subclassId() throws RecognitionException {
        subclassId_return retval = new subclassId_return();
        retval.start = input.LT(1);

        Token IDGen=null;
        Token ABSTRACTGen=null;

        try {
            // /home/jlcanovas/workspace/Grammar2Model.examples.ABNF2MModel/files/gen/ABNF.ge3:202:1: (IDGen= ID | ABSTRACTGen= ABSTRACT IDGen= ID )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==ID) ) {
                alt5=1;
            }
            else if ( (LA5_0==ABSTRACT) ) {
                alt5=2;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("201:1: subclassId returns [Node returnNode] : (IDGen= ID | ABSTRACTGen= ABSTRACT IDGen= ID );", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.ABNF2MModel/files/gen/ABNF.ge3:202:4: IDGen= ID
                    {
                    IDGen=(Token)input.LT(1);
                    match(input,ID,FOLLOW_ID_in_subclassId197); if (failed) return retval;
                    if ( backtracking==0 ) {
                      
                      		// Create return CST Node
                      		Node subclassIdReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                      		subclassIdReturnNode.setKind("subclassId");
                      	    // Create a CST Leaf
                      		if(IDGen != null) {
                      			Leaf IDGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      			IDGenLeaf.setKind("ID");
                      			IDGenLeaf.setValue(IDGen.getText());
                      			IDGenLeaf.setPos(IDGen.getCharPositionInLine());
                      			IDGenLeaf.setLine(IDGen.getLine());
                      			subclassIdReturnNode.getChildren().add(IDGenLeaf);
                      		}
                      		// Returns the Node with CST Leaves/Nodes
                      		retval.returnNode = subclassIdReturnNode;
                      	
                    }

                    }
                    break;
                case 2 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.ABNF2MModel/files/gen/ABNF.ge3:219:5: ABSTRACTGen= ABSTRACT IDGen= ID
                    {
                    ABSTRACTGen=(Token)input.LT(1);
                    match(input,ABSTRACT,FOLLOW_ABSTRACT_in_subclassId209); if (failed) return retval;
                    IDGen=(Token)input.LT(1);
                    match(input,ID,FOLLOW_ID_in_subclassId213); if (failed) return retval;
                    if ( backtracking==0 ) {
                      
                      		// Create return CST Node
                      		Node subclassIdReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                      		subclassIdReturnNode.setKind("subclassId");
                      	    // Create a CST Leaf
                      		if(ABSTRACTGen != null) {
                      			Leaf ABSTRACTGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      			ABSTRACTGenLeaf.setKind("ABSTRACT");
                      			ABSTRACTGenLeaf.setValue(ABSTRACTGen.getText());
                      			ABSTRACTGenLeaf.setPos(ABSTRACTGen.getCharPositionInLine());
                      			ABSTRACTGenLeaf.setLine(ABSTRACTGen.getLine());
                      			subclassIdReturnNode.getChildren().add(ABSTRACTGenLeaf);
                      		}
                      	    // Create a CST Leaf
                      		if(IDGen != null) {
                      			Leaf IDGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      			IDGenLeaf.setKind("ID");
                      			IDGenLeaf.setValue(IDGen.getText());
                      			IDGenLeaf.setPos(IDGen.getCharPositionInLine());
                      			IDGenLeaf.setLine(IDGen.getLine());
                      			subclassIdReturnNode.getChildren().add(IDGenLeaf);
                      		}
                      		// Returns the Node with CST Leaves/Nodes
                      		retval.returnNode = subclassIdReturnNode;
                      	
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
    // $ANTLR end subclassId

    public static class attribute_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start attribute
    // /home/jlcanovas/workspace/Grammar2Model.examples.ABNF2MModel/files/gen/ABNF.ge3:247:1: attribute returns [Node returnNode] : (OPTA= '[' )? (SEM= '<' )? NAME= ID TK_0= ':' TYPE= ID (TK_1= '>' )? (MULTA= '*' | MULTB= '+' | OPTB= '?' )? (TK_2= ']' )? ;
    public final attribute_return attribute() throws RecognitionException {
        attribute_return retval = new attribute_return();
        retval.start = input.LT(1);

        Token OPTA=null;
        Token SEM=null;
        Token NAME=null;
        Token TK_0=null;
        Token TYPE=null;
        Token TK_1=null;
        Token MULTA=null;
        Token MULTB=null;
        Token OPTB=null;
        Token TK_2=null;

        try {
            // /home/jlcanovas/workspace/Grammar2Model.examples.ABNF2MModel/files/gen/ABNF.ge3:248:1: ( (OPTA= '[' )? (SEM= '<' )? NAME= ID TK_0= ':' TYPE= ID (TK_1= '>' )? (MULTA= '*' | MULTB= '+' | OPTB= '?' )? (TK_2= ']' )? )
            // /home/jlcanovas/workspace/Grammar2Model.examples.ABNF2MModel/files/gen/ABNF.ge3:248:3: (OPTA= '[' )? (SEM= '<' )? NAME= ID TK_0= ':' TYPE= ID (TK_1= '>' )? (MULTA= '*' | MULTB= '+' | OPTB= '?' )? (TK_2= ']' )?
            {
            // /home/jlcanovas/workspace/Grammar2Model.examples.ABNF2MModel/files/gen/ABNF.ge3:248:3: (OPTA= '[' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==10) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.ABNF2MModel/files/gen/ABNF.ge3:248:4: OPTA= '['
                    {
                    OPTA=(Token)input.LT(1);
                    match(input,10,FOLLOW_10_in_attribute235); if (failed) return retval;

                    }
                    break;

            }

            // /home/jlcanovas/workspace/Grammar2Model.examples.ABNF2MModel/files/gen/ABNF.ge3:248:15: (SEM= '<' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==11) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.ABNF2MModel/files/gen/ABNF.ge3:248:16: SEM= '<'
                    {
                    SEM=(Token)input.LT(1);
                    match(input,11,FOLLOW_11_in_attribute242); if (failed) return retval;

                    }
                    break;

            }

            NAME=(Token)input.LT(1);
            match(input,ID,FOLLOW_ID_in_attribute248); if (failed) return retval;
            TK_0=(Token)input.LT(1);
            match(input,12,FOLLOW_12_in_attribute252); if (failed) return retval;
            TYPE=(Token)input.LT(1);
            match(input,ID,FOLLOW_ID_in_attribute256); if (failed) return retval;
            // /home/jlcanovas/workspace/Grammar2Model.examples.ABNF2MModel/files/gen/ABNF.ge3:248:51: (TK_1= '>' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==13) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.ABNF2MModel/files/gen/ABNF.ge3:248:52: TK_1= '>'
                    {
                    TK_1=(Token)input.LT(1);
                    match(input,13,FOLLOW_13_in_attribute261); if (failed) return retval;

                    }
                    break;

            }

            // /home/jlcanovas/workspace/Grammar2Model.examples.ABNF2MModel/files/gen/ABNF.ge3:248:63: (MULTA= '*' | MULTB= '+' | OPTB= '?' )?
            int alt9=4;
            switch ( input.LA(1) ) {
                case 14:
                    {
                    alt9=1;
                    }
                    break;
                case 15:
                    {
                    alt9=2;
                    }
                    break;
                case 16:
                    {
                    alt9=3;
                    }
                    break;
            }

            switch (alt9) {
                case 1 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.ABNF2MModel/files/gen/ABNF.ge3:248:64: MULTA= '*'
                    {
                    MULTA=(Token)input.LT(1);
                    match(input,14,FOLLOW_14_in_attribute268); if (failed) return retval;

                    }
                    break;
                case 2 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.ABNF2MModel/files/gen/ABNF.ge3:248:76: MULTB= '+'
                    {
                    MULTB=(Token)input.LT(1);
                    match(input,15,FOLLOW_15_in_attribute274); if (failed) return retval;

                    }
                    break;
                case 3 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.ABNF2MModel/files/gen/ABNF.ge3:248:88: OPTB= '?'
                    {
                    OPTB=(Token)input.LT(1);
                    match(input,16,FOLLOW_16_in_attribute280); if (failed) return retval;

                    }
                    break;

            }

            // /home/jlcanovas/workspace/Grammar2Model.examples.ABNF2MModel/files/gen/ABNF.ge3:248:99: (TK_2= ']' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==17) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.ABNF2MModel/files/gen/ABNF.ge3:248:100: TK_2= ']'
                    {
                    TK_2=(Token)input.LT(1);
                    match(input,17,FOLLOW_17_in_attribute287); if (failed) return retval;

                    }
                    break;

            }

            if ( backtracking==0 ) {
              
              		// Create return CST Node
              		Node attributeReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
              		attributeReturnNode.setKind("attribute");
              	    // Create a CST Leaf
              		if(OPTA != null) {
              			Leaf OPTALeaf = CSTFactoryImpl.eINSTANCE.createLeaf();
              			OPTALeaf.setKind("OPTA");
              			OPTALeaf.setValue(OPTA.getText());
              			OPTALeaf.setPos(OPTA.getCharPositionInLine());
              			OPTALeaf.setLine(OPTA.getLine());
              			attributeReturnNode.getChildren().add(OPTALeaf);
              		}
              	    // Create a CST Leaf
              		if(SEM != null) {
              			Leaf SEMLeaf = CSTFactoryImpl.eINSTANCE.createLeaf();
              			SEMLeaf.setKind("SEM");
              			SEMLeaf.setValue(SEM.getText());
              			SEMLeaf.setPos(SEM.getCharPositionInLine());
              			SEMLeaf.setLine(SEM.getLine());
              			attributeReturnNode.getChildren().add(SEMLeaf);
              		}
              	    // Create a CST Leaf
              		if(NAME != null) {
              			Leaf NAMELeaf = CSTFactoryImpl.eINSTANCE.createLeaf();
              			NAMELeaf.setKind("NAME");
              			NAMELeaf.setValue(NAME.getText());
              			NAMELeaf.setPos(NAME.getCharPositionInLine());
              			NAMELeaf.setLine(NAME.getLine());
              			attributeReturnNode.getChildren().add(NAMELeaf);
              		}
              	    // Create a Token CST Leaf	
              	    if(TK_0 != null) {
              			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
              	 		TK_0Leaf.setKind("TOKEN");
              	 		TK_0Leaf.setValue(TK_0.getText());
              			TK_0Leaf.setPos(TK_0.getCharPositionInLine());
              			TK_0Leaf.setLine(TK_0.getLine());
              	 		attributeReturnNode.getChildren().add(TK_0Leaf);
              	 	}
              	    // Create a CST Leaf
              		if(TYPE != null) {
              			Leaf TYPELeaf = CSTFactoryImpl.eINSTANCE.createLeaf();
              			TYPELeaf.setKind("TYPE");
              			TYPELeaf.setValue(TYPE.getText());
              			TYPELeaf.setPos(TYPE.getCharPositionInLine());
              			TYPELeaf.setLine(TYPE.getLine());
              			attributeReturnNode.getChildren().add(TYPELeaf);
              		}
              	    // Create a Token CST Leaf	
              	    if(TK_1 != null) {
              			Leaf TK_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
              	 		TK_1Leaf.setKind("TOKEN");
              	 		TK_1Leaf.setValue(TK_1.getText());
              			TK_1Leaf.setPos(TK_1.getCharPositionInLine());
              			TK_1Leaf.setLine(TK_1.getLine());
              	 		attributeReturnNode.getChildren().add(TK_1Leaf);
              	 	}
              	    // Create a CST Leaf
              		if(MULTA != null) {
              			Leaf MULTALeaf = CSTFactoryImpl.eINSTANCE.createLeaf();
              			MULTALeaf.setKind("MULTA");
              			MULTALeaf.setValue(MULTA.getText());
              			MULTALeaf.setPos(MULTA.getCharPositionInLine());
              			MULTALeaf.setLine(MULTA.getLine());
              			attributeReturnNode.getChildren().add(MULTALeaf);
              		}
              	    // Create a CST Leaf
              		if(MULTB != null) {
              			Leaf MULTBLeaf = CSTFactoryImpl.eINSTANCE.createLeaf();
              			MULTBLeaf.setKind("MULTB");
              			MULTBLeaf.setValue(MULTB.getText());
              			MULTBLeaf.setPos(MULTB.getCharPositionInLine());
              			MULTBLeaf.setLine(MULTB.getLine());
              			attributeReturnNode.getChildren().add(MULTBLeaf);
              		}
              	    // Create a CST Leaf
              		if(OPTB != null) {
              			Leaf OPTBLeaf = CSTFactoryImpl.eINSTANCE.createLeaf();
              			OPTBLeaf.setKind("OPTB");
              			OPTBLeaf.setValue(OPTB.getText());
              			OPTBLeaf.setPos(OPTB.getCharPositionInLine());
              			OPTBLeaf.setLine(OPTB.getLine());
              			attributeReturnNode.getChildren().add(OPTBLeaf);
              		}
              	    // Create a Token CST Leaf	
              	    if(TK_2 != null) {
              			Leaf TK_2Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
              	 		TK_2Leaf.setKind("TOKEN");
              	 		TK_2Leaf.setValue(TK_2.getText());
              			TK_2Leaf.setPos(TK_2.getCharPositionInLine());
              			TK_2Leaf.setLine(TK_2.getLine());
              	 		attributeReturnNode.getChildren().add(TK_2Leaf);
              	 	}
              		// Returns the Node with CST Leaves/Nodes
              		retval.returnNode = attributeReturnNode;
              	
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
    // $ANTLR end attribute


 

    public static final BitSet FOLLOW_rule_in_abnf_definition46 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_hierarchy_rule_in_rule69 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_specification_rule_in_rule80 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classId_in_hierarchy_rule102 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_DOUBLEARROW_in_hierarchy_rule107 = new BitSet(new long[]{0x00000000000000C0L});
    public static final BitSet FOLLOW_subclassId_in_hierarchy_rule111 = new BitSet(new long[]{0x0000000000000210L});
    public static final BitSet FOLLOW_9_in_hierarchy_rule117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classId_in_specification_rule139 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ARROW_in_specification_rule143 = new BitSet(new long[]{0x0000000000000E40L});
    public static final BitSet FOLLOW_attribute_in_specification_rule147 = new BitSet(new long[]{0x0000000000000E40L});
    public static final BitSet FOLLOW_9_in_specification_rule152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_classId174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_subclassId197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ABSTRACT_in_subclassId209 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ID_in_subclassId213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_10_in_attribute235 = new BitSet(new long[]{0x0000000000000840L});
    public static final BitSet FOLLOW_11_in_attribute242 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ID_in_attribute248 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_attribute252 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ID_in_attribute256 = new BitSet(new long[]{0x000000000003E002L});
    public static final BitSet FOLLOW_13_in_attribute261 = new BitSet(new long[]{0x000000000003C002L});
    public static final BitSet FOLLOW_14_in_attribute268 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_15_in_attribute274 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_16_in_attribute280 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_17_in_attribute287 = new BitSet(new long[]{0x0000000000000002L});

}