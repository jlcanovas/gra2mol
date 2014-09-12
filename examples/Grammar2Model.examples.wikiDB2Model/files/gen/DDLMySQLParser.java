// $ANTLR 3.0.1 /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3 2009-04-27 10:39:00

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
public class DDLMySQLParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ID", "DQVALUE", "OQUOTE", "QVALUE", "NUMBER", "DOUBLEQUOTE", "DECNUMBER", "HEXNUMBER", "DOT", "SLASH", "QUOTE", "IDNUMBER", "WS", "ML_COMMENT", "OL_COMMENT", "'SET'", "','", "';'", "'='", "'GLOBAL'", "'SESSION'", "'@'", "'USE'", "'CREATE'", "'DATABASE'", "'SCHEMA'", "'IF'", "'NOT'", "'EXISTS'", "'DEFAULT'", "'CHARACTER'", "'COLLATE'", "'TEMPORARY'", "'TABLE'", "'('", "')'", "'UNIQUE'", "'PRIMARY'", "'FULLTEXT'", "'INDEX'", "'KEY'", "'NULL'", "'ON'", "'UPDATE'", "'DELETE'", "'AUTO_INCREMENT'", "'COMMENT'", "'COLUMN_FORMAT'", "'FIXED'", "'DYNAMIC'", "'STORAGE'", "'DISK'", "'ASC'", "'DESC'", "'USING'", "'BTREE'", "'HASH'", "'RTREE'", "'KEY_BLOCK_SIZE'", "'WITH'", "'PARSER'", "'BIT'", "'TINYINT'", "'UNSIGNED'", "'ZEROFILL'", "'SMALLINT'", "'MEDIUMINT'", "'INT'", "'INTEGER'", "'BIGINT'", "'REAL'", "'DOUBLE'", "'FLOAT'", "'DECIMAL'", "'NUMERIC'", "'DATE'", "'TIME'", "'TIMESTAMP'", "'DATETIME'", "'YEAR'", "'CHAR'", "'VARCHAR'", "'BINARYTYPE'", "'VARBINARY'", "'TINYBLOB'", "'BLOB'", "'MEDIUMBLOB'", "'LONGBLOB'", "'TINYTEXT'", "'BYNARY'", "'TEXTVAR'", "'MEDIUMTEXT'", "'LONGTEXT'", "'ENUM'", "'ENGINE'", "'AVG_ROW_LENGTH'", "'CHARSET'", "'CHECKSUM'", "'CONNECTION'", "'DELAY_KEY_WRITE'", "'INDEX DIRECTORY'", "'INSERT_METHOD'", "'NO'", "'FIRST'", "'LAST'", "'MAX_ROWS'", "'MIN_ROWS'", "'PACK_KEYS'", "'ROW_FORMAT'", "'COMPRESSED'", "'REDUNDANT'", "'COMPACT'", "'TABLESPACE'", "'UNION'", "'REFERENCES'", "'MATCH'", "'FULL'", "'PARTIAL'", "'SIMPLE'", "'RESTRICT'", "'CASCADE'", "'ACTION'", "'DROP'", "'INSERT'", "'LOW_PRIORITY'", "'DELAYED'", "'HIGH_PRIORITY'", "'IGNORE'", "'INTO'", "'VALUES'"
    };
    public static final int ML_COMMENT=17;
    public static final int QUOTE=14;
    public static final int WS=16;
    public static final int SLASH=13;
    public static final int OQUOTE=6;
    public static final int NUMBER=8;
    public static final int QVALUE=7;
    public static final int DECNUMBER=10;
    public static final int OL_COMMENT=18;
    public static final int DQVALUE=5;
    public static final int IDNUMBER=15;
    public static final int DOT=12;
    public static final int ID=4;
    public static final int DOUBLEQUOTE=9;
    public static final int EOF=-1;
    public static final int HEXNUMBER=11;

        public DDLMySQLParser(TokenStream input) {
            super(input);
            ruleMemo = new HashMap[251+1];
         }
        
    protected StringTemplateGroup templateLib =
      new StringTemplateGroup("DDLMySQLParserTemplates", AngleBracketTemplateLexer.class);

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
    public String getGrammarFileName() { return "/home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3"; }


    public static class data_definition_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start data_definition
    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:18:1: data_definition returns [Node returnNode] : (data_definition_statementsGen+= data_definition_statements | data_manipulation_statementsGen+= data_manipulation_statements | administration_statementsGen+= administration_statements | utility_statementsGen+= utility_statements )* ;
    public final data_definition_return data_definition() throws RecognitionException {
        data_definition_return retval = new data_definition_return();
        retval.start = input.LT(1);

        List list_data_definition_statementsGen=null;
        List list_data_manipulation_statementsGen=null;
        List list_administration_statementsGen=null;
        List list_utility_statementsGen=null;
        RuleReturnScope data_definition_statementsGen = null;
        RuleReturnScope data_manipulation_statementsGen = null;
        RuleReturnScope administration_statementsGen = null;
        RuleReturnScope utility_statementsGen = null;
        try {
            // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:19:1: ( (data_definition_statementsGen+= data_definition_statements | data_manipulation_statementsGen+= data_manipulation_statements | administration_statementsGen+= administration_statements | utility_statementsGen+= utility_statements )* )
            // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:19:4: (data_definition_statementsGen+= data_definition_statements | data_manipulation_statementsGen+= data_manipulation_statements | administration_statementsGen+= administration_statements | utility_statementsGen+= utility_statements )*
            {
            // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:19:4: (data_definition_statementsGen+= data_definition_statements | data_manipulation_statementsGen+= data_manipulation_statements | administration_statementsGen+= administration_statements | utility_statementsGen+= utility_statements )*
            loop1:
            do {
                int alt1=5;
                switch ( input.LA(1) ) {
                case 27:
                case 126:
                    {
                    alt1=1;
                    }
                    break;
                case 127:
                    {
                    alt1=2;
                    }
                    break;
                case 19:
                    {
                    alt1=3;
                    }
                    break;
                case 26:
                    {
                    alt1=4;
                    }
                    break;

                }

                switch (alt1) {
            	case 1 :
            	    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:19:5: data_definition_statementsGen+= data_definition_statements
            	    {
            	    pushFollow(FOLLOW_data_definition_statements_in_data_definition48);
            	    data_definition_statementsGen=data_definition_statements();
            	    _fsp--;
            	    if (failed) return retval;
            	    if (list_data_definition_statementsGen==null) list_data_definition_statementsGen=new ArrayList();
            	    list_data_definition_statementsGen.add(data_definition_statementsGen);


            	    }
            	    break;
            	case 2 :
            	    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:19:65: data_manipulation_statementsGen+= data_manipulation_statements
            	    {
            	    pushFollow(FOLLOW_data_manipulation_statements_in_data_definition54);
            	    data_manipulation_statementsGen=data_manipulation_statements();
            	    _fsp--;
            	    if (failed) return retval;
            	    if (list_data_manipulation_statementsGen==null) list_data_manipulation_statementsGen=new ArrayList();
            	    list_data_manipulation_statementsGen.add(data_manipulation_statementsGen);


            	    }
            	    break;
            	case 3 :
            	    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:19:129: administration_statementsGen+= administration_statements
            	    {
            	    pushFollow(FOLLOW_administration_statements_in_data_definition60);
            	    administration_statementsGen=administration_statements();
            	    _fsp--;
            	    if (failed) return retval;
            	    if (list_administration_statementsGen==null) list_administration_statementsGen=new ArrayList();
            	    list_administration_statementsGen.add(administration_statementsGen);


            	    }
            	    break;
            	case 4 :
            	    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:19:187: utility_statementsGen+= utility_statements
            	    {
            	    pushFollow(FOLLOW_utility_statements_in_data_definition66);
            	    utility_statementsGen=utility_statements();
            	    _fsp--;
            	    if (failed) return retval;
            	    if (list_utility_statementsGen==null) list_utility_statementsGen=new ArrayList();
            	    list_utility_statementsGen.add(utility_statementsGen);


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            if ( backtracking==0 ) {
              
              		// Create return CST Node
              		Node data_definitionReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
              		data_definitionReturnNode.setKind("data_definition");
              	
              		// Create a special CST Node for terminal data_definition_statementsGen aggregation
              		if(list_data_definition_statementsGen != null) {
              	    for(int pos = 0; pos < list_data_definition_statementsGen.size(); pos++ )  { 
              		// No Terminal extractor
              	    if(list_data_definition_statementsGen != null) {		
              	    	DDLMySQLParser.data_definition_statements_return r = (DDLMySQLParser.data_definition_statements_return) list_data_definition_statementsGen.get(pos); 
              	    	if(r != null && r.returnNode != null) {
              	        	r.returnNode.setKind("data_definition_statements");
              	    		data_definitionReturnNode.getChildren().add(r.returnNode);
              	    	} 
              		}
              		}
              		}
              	
              	
              		// Create a special CST Node for terminal data_manipulation_statementsGen aggregation
              		if(list_data_manipulation_statementsGen != null) {
              	    for(int pos = 0; pos < list_data_manipulation_statementsGen.size(); pos++ )  { 
              		// No Terminal extractor
              	    if(list_data_manipulation_statementsGen != null) {		
              	    	DDLMySQLParser.data_manipulation_statements_return r = (DDLMySQLParser.data_manipulation_statements_return) list_data_manipulation_statementsGen.get(pos); 
              	    	if(r != null && r.returnNode != null) {
              	        	r.returnNode.setKind("data_manipulation_statements");
              	    		data_definitionReturnNode.getChildren().add(r.returnNode);
              	    	} 
              		}
              		}
              		}
              	
              	
              		// Create a special CST Node for terminal administration_statementsGen aggregation
              		if(list_administration_statementsGen != null) {
              	    for(int pos = 0; pos < list_administration_statementsGen.size(); pos++ )  { 
              		// No Terminal extractor
              	    if(list_administration_statementsGen != null) {		
              	    	DDLMySQLParser.administration_statements_return r = (DDLMySQLParser.administration_statements_return) list_administration_statementsGen.get(pos); 
              	    	if(r != null && r.returnNode != null) {
              	        	r.returnNode.setKind("administration_statements");
              	    		data_definitionReturnNode.getChildren().add(r.returnNode);
              	    	} 
              		}
              		}
              		}
              	
              	
              		// Create a special CST Node for terminal utility_statementsGen aggregation
              		if(list_utility_statementsGen != null) {
              	    for(int pos = 0; pos < list_utility_statementsGen.size(); pos++ )  { 
              		// No Terminal extractor
              	    if(list_utility_statementsGen != null) {		
              	    	DDLMySQLParser.utility_statements_return r = (DDLMySQLParser.utility_statements_return) list_utility_statementsGen.get(pos); 
              	    	if(r != null && r.returnNode != null) {
              	        	r.returnNode.setKind("utility_statements");
              	    		data_definitionReturnNode.getChildren().add(r.returnNode);
              	    	} 
              		}
              		}
              		}
              	
              		// Returns the Node with CST Leaves/Nodes
              		retval.returnNode = data_definitionReturnNode;
              	
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
    // $ANTLR end data_definition

    public static class administration_statements_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start administration_statements
    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:89:1: administration_statements returns [Node returnNode] : set_definitionGen+= set_definition ;
    public final administration_statements_return administration_statements() throws RecognitionException {
        administration_statements_return retval = new administration_statements_return();
        retval.start = input.LT(1);

        List list_set_definitionGen=null;
        RuleReturnScope set_definitionGen = null;
        try {
            // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:90:1: (set_definitionGen+= set_definition )
            // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:90:3: set_definitionGen+= set_definition
            {
            pushFollow(FOLLOW_set_definition_in_administration_statements89);
            set_definitionGen=set_definition();
            _fsp--;
            if (failed) return retval;
            if (list_set_definitionGen==null) list_set_definitionGen=new ArrayList();
            list_set_definitionGen.add(set_definitionGen);

            if ( backtracking==0 ) {
              
              		// Create return CST Node
              		Node administration_statementsReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
              		administration_statementsReturnNode.setKind("administration_statements");
              	    // Create a CST Node
              		if(list_set_definitionGen != null) {
              	        for(Iterator it = list_set_definitionGen.iterator(); it.hasNext(); )  { 
              	            DDLMySQLParser.set_definition_return r = (DDLMySQLParser.set_definition_return) it.next(); 
              	            if(r != null && r.returnNode != null) {
              	            	r.returnNode.setKind("set_definition");
              	            	administration_statementsReturnNode.getChildren().add(r.returnNode);
              	            } 
              	        }
              	    }
              		// Returns the Node with CST Leaves/Nodes
              		retval.returnNode = administration_statementsReturnNode;
              	
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
    // $ANTLR end administration_statements

    public static class set_definition_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start set_definition
    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:110:1: set_definition returns [Node returnNode] : TK_0= 'SET' variable_assignmentGen+= variable_assignment (TK_1= ',' variable_assignmentGen_1+= variable_assignment )* TK_2= ';' ;
    public final set_definition_return set_definition() throws RecognitionException {
        set_definition_return retval = new set_definition_return();
        retval.start = input.LT(1);

        Token TK_0=null;
        Token TK_1=null;
        Token TK_2=null;
        List list_variable_assignmentGen=null;
        List list_variable_assignmentGen_1=null;
        RuleReturnScope variable_assignmentGen = null;
        RuleReturnScope variable_assignmentGen_1 = null;
        try {
            // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:111:1: (TK_0= 'SET' variable_assignmentGen+= variable_assignment (TK_1= ',' variable_assignmentGen_1+= variable_assignment )* TK_2= ';' )
            // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:111:3: TK_0= 'SET' variable_assignmentGen+= variable_assignment (TK_1= ',' variable_assignmentGen_1+= variable_assignment )* TK_2= ';'
            {
            TK_0=(Token)input.LT(1);
            match(input,19,FOLLOW_19_in_set_definition110); if (failed) return retval;
            pushFollow(FOLLOW_variable_assignment_in_set_definition114);
            variable_assignmentGen=variable_assignment();
            _fsp--;
            if (failed) return retval;
            if (list_variable_assignmentGen==null) list_variable_assignmentGen=new ArrayList();
            list_variable_assignmentGen.add(variable_assignmentGen);

            // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:111:58: (TK_1= ',' variable_assignmentGen_1+= variable_assignment )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==20) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:111:59: TK_1= ',' variable_assignmentGen_1+= variable_assignment
            	    {
            	    TK_1=(Token)input.LT(1);
            	    match(input,20,FOLLOW_20_in_set_definition119); if (failed) return retval;
            	    pushFollow(FOLLOW_variable_assignment_in_set_definition123);
            	    variable_assignmentGen_1=variable_assignment();
            	    _fsp--;
            	    if (failed) return retval;
            	    if (list_variable_assignmentGen_1==null) list_variable_assignmentGen_1=new ArrayList();
            	    list_variable_assignmentGen_1.add(variable_assignmentGen_1);


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            TK_2=(Token)input.LT(1);
            match(input,21,FOLLOW_21_in_set_definition129); if (failed) return retval;
            if ( backtracking==0 ) {
              
              		// Create return CST Node
              		Node set_definitionReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
              		set_definitionReturnNode.setKind("set_definition");
              	    // Create a Token CST Leaf	
              	    if(TK_0 != null) {
              			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
              	 		TK_0Leaf.setKind("TOKEN");
              	 		TK_0Leaf.setValue(TK_0.getText());
              			TK_0Leaf.setPos(TK_0.getCharPositionInLine());
              			TK_0Leaf.setLine(TK_0.getLine());
              	 		set_definitionReturnNode.getChildren().add(TK_0Leaf);
              	 	}
              	    // Create a CST Node
              		if(list_variable_assignmentGen != null) {
              	        for(Iterator it = list_variable_assignmentGen.iterator(); it.hasNext(); )  { 
              	            DDLMySQLParser.variable_assignment_return r = (DDLMySQLParser.variable_assignment_return) it.next(); 
              	            if(r != null && r.returnNode != null) {
              	            	r.returnNode.setKind("variable_assignment");
              	            	set_definitionReturnNode.getChildren().add(r.returnNode);
              	            } 
              	        }
              	    }
              	
              		// Create a special CST Node for terminal variable_assignmentGen_1 aggregation
              		if(list_variable_assignmentGen_1 != null) {
              	    for(int pos = 0; pos < list_variable_assignmentGen_1.size(); pos++ )  { 
              	    // Create a Token CST Leaf	
              	    if(TK_1 != null) {
              			Leaf TK_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
              	 		TK_1Leaf.setKind("TOKEN");
              	 		TK_1Leaf.setValue(TK_1.getText());
              			TK_1Leaf.setPos(TK_1.getCharPositionInLine());
              			TK_1Leaf.setLine(TK_1.getLine());
              	 		set_definitionReturnNode.getChildren().add(TK_1Leaf);
              	 	}
              		// No Terminal extractor
              	    if(list_variable_assignmentGen_1 != null) {		
              	    	DDLMySQLParser.variable_assignment_return r = (DDLMySQLParser.variable_assignment_return) list_variable_assignmentGen_1.get(pos); 
              	    	if(r != null && r.returnNode != null) {
              	        	r.returnNode.setKind("variable_assignment");
              	    		set_definitionReturnNode.getChildren().add(r.returnNode);
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
              	 		set_definitionReturnNode.getChildren().add(TK_2Leaf);
              	 	}
              		// Returns the Node with CST Leaves/Nodes
              		retval.returnNode = set_definitionReturnNode;
              	
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
    // $ANTLR end set_definition

    public static class variable_assignment_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start variable_assignment
    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:173:1: variable_assignment returns [Node returnNode] : (IDGen= ID TK_0= '=' DQVALUEGen= DQVALUE | (TK_0= 'GLOBAL' | TK_1= 'SESSION' ) IDGen= ID TK_2= '=' DQVALUEGen= DQVALUE | TK_0= '@' TK_1= '@' IDGen= ID TK_2= '=' (DQVALUEGen= DQVALUE | TK_3= '@' TK_4= '@' IDGen_1= ID ) );
    public final variable_assignment_return variable_assignment() throws RecognitionException {
        variable_assignment_return retval = new variable_assignment_return();
        retval.start = input.LT(1);

        Token IDGen=null;
        Token TK_0=null;
        Token DQVALUEGen=null;
        Token TK_1=null;
        Token TK_2=null;
        Token TK_3=null;
        Token TK_4=null;
        Token IDGen_1=null;

        try {
            // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:174:1: (IDGen= ID TK_0= '=' DQVALUEGen= DQVALUE | (TK_0= 'GLOBAL' | TK_1= 'SESSION' ) IDGen= ID TK_2= '=' DQVALUEGen= DQVALUE | TK_0= '@' TK_1= '@' IDGen= ID TK_2= '=' (DQVALUEGen= DQVALUE | TK_3= '@' TK_4= '@' IDGen_1= ID ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case ID:
                {
                alt5=1;
                }
                break;
            case 23:
            case 24:
                {
                alt5=2;
                }
                break;
            case 25:
                {
                alt5=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("173:1: variable_assignment returns [Node returnNode] : (IDGen= ID TK_0= '=' DQVALUEGen= DQVALUE | (TK_0= 'GLOBAL' | TK_1= 'SESSION' ) IDGen= ID TK_2= '=' DQVALUEGen= DQVALUE | TK_0= '@' TK_1= '@' IDGen= ID TK_2= '=' (DQVALUEGen= DQVALUE | TK_3= '@' TK_4= '@' IDGen_1= ID ) );", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:174:3: IDGen= ID TK_0= '=' DQVALUEGen= DQVALUE
                    {
                    IDGen=(Token)input.LT(1);
                    match(input,ID,FOLLOW_ID_in_variable_assignment151); if (failed) return retval;
                    TK_0=(Token)input.LT(1);
                    match(input,22,FOLLOW_22_in_variable_assignment155); if (failed) return retval;
                    DQVALUEGen=(Token)input.LT(1);
                    match(input,DQVALUE,FOLLOW_DQVALUE_in_variable_assignment159); if (failed) return retval;
                    if ( backtracking==0 ) {
                      
                      		// Create return CST Node
                      		Node variable_assignmentReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                      		variable_assignmentReturnNode.setKind("variable_assignment");
                      	    // Create a CST Leaf
                      		if(IDGen != null) {
                      			Leaf IDGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      			IDGenLeaf.setKind("ID");
                      			IDGenLeaf.setValue(IDGen.getText());
                      			IDGenLeaf.setPos(IDGen.getCharPositionInLine());
                      			IDGenLeaf.setLine(IDGen.getLine());
                      			variable_assignmentReturnNode.getChildren().add(IDGenLeaf);
                      		}
                      	    // Create a Token CST Leaf	
                      	    if(TK_0 != null) {
                      			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      	 		TK_0Leaf.setKind("TOKEN");
                      	 		TK_0Leaf.setValue(TK_0.getText());
                      			TK_0Leaf.setPos(TK_0.getCharPositionInLine());
                      			TK_0Leaf.setLine(TK_0.getLine());
                      	 		variable_assignmentReturnNode.getChildren().add(TK_0Leaf);
                      	 	}
                      	    // Create a CST Leaf
                      		if(DQVALUEGen != null) {
                      			Leaf DQVALUEGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      			DQVALUEGenLeaf.setKind("DQVALUE");
                      			DQVALUEGenLeaf.setValue(DQVALUEGen.getText());
                      			DQVALUEGenLeaf.setPos(DQVALUEGen.getCharPositionInLine());
                      			DQVALUEGenLeaf.setLine(DQVALUEGen.getLine());
                      			variable_assignmentReturnNode.getChildren().add(DQVALUEGenLeaf);
                      		}
                      		// Returns the Node with CST Leaves/Nodes
                      		retval.returnNode = variable_assignmentReturnNode;
                      	
                    }

                    }
                    break;
                case 2 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:209:8: (TK_0= 'GLOBAL' | TK_1= 'SESSION' ) IDGen= ID TK_2= '=' DQVALUEGen= DQVALUE
                    {
                    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:209:8: (TK_0= 'GLOBAL' | TK_1= 'SESSION' )
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0==23) ) {
                        alt3=1;
                    }
                    else if ( (LA3_0==24) ) {
                        alt3=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("209:8: (TK_0= 'GLOBAL' | TK_1= 'SESSION' )", 3, 0, input);

                        throw nvae;
                    }
                    switch (alt3) {
                        case 1 :
                            // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:209:9: TK_0= 'GLOBAL'
                            {
                            TK_0=(Token)input.LT(1);
                            match(input,23,FOLLOW_23_in_variable_assignment175); if (failed) return retval;

                            }
                            break;
                        case 2 :
                            // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:209:25: TK_1= 'SESSION'
                            {
                            TK_1=(Token)input.LT(1);
                            match(input,24,FOLLOW_24_in_variable_assignment181); if (failed) return retval;

                            }
                            break;

                    }

                    IDGen=(Token)input.LT(1);
                    match(input,ID,FOLLOW_ID_in_variable_assignment186); if (failed) return retval;
                    TK_2=(Token)input.LT(1);
                    match(input,22,FOLLOW_22_in_variable_assignment190); if (failed) return retval;
                    DQVALUEGen=(Token)input.LT(1);
                    match(input,DQVALUE,FOLLOW_DQVALUE_in_variable_assignment194); if (failed) return retval;
                    if ( backtracking==0 ) {
                      
                      		// Create return CST Node
                      		Node variable_assignmentReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                      		variable_assignmentReturnNode.setKind("variable_assignment");
                      	    // Create a Token CST Leaf	
                      	    if(TK_0 != null) {
                      			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      	 		TK_0Leaf.setKind("TOKEN");
                      	 		TK_0Leaf.setValue(TK_0.getText());
                      			TK_0Leaf.setPos(TK_0.getCharPositionInLine());
                      			TK_0Leaf.setLine(TK_0.getLine());
                      	 		variable_assignmentReturnNode.getChildren().add(TK_0Leaf);
                      	 	}
                      	    // Create a Token CST Leaf	
                      	    if(TK_1 != null) {
                      			Leaf TK_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      	 		TK_1Leaf.setKind("TOKEN");
                      	 		TK_1Leaf.setValue(TK_1.getText());
                      			TK_1Leaf.setPos(TK_1.getCharPositionInLine());
                      			TK_1Leaf.setLine(TK_1.getLine());
                      	 		variable_assignmentReturnNode.getChildren().add(TK_1Leaf);
                      	 	}
                      	    // Create a CST Leaf
                      		if(IDGen != null) {
                      			Leaf IDGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      			IDGenLeaf.setKind("ID");
                      			IDGenLeaf.setValue(IDGen.getText());
                      			IDGenLeaf.setPos(IDGen.getCharPositionInLine());
                      			IDGenLeaf.setLine(IDGen.getLine());
                      			variable_assignmentReturnNode.getChildren().add(IDGenLeaf);
                      		}
                      	    // Create a Token CST Leaf	
                      	    if(TK_2 != null) {
                      			Leaf TK_2Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      	 		TK_2Leaf.setKind("TOKEN");
                      	 		TK_2Leaf.setValue(TK_2.getText());
                      			TK_2Leaf.setPos(TK_2.getCharPositionInLine());
                      			TK_2Leaf.setLine(TK_2.getLine());
                      	 		variable_assignmentReturnNode.getChildren().add(TK_2Leaf);
                      	 	}
                      	    // Create a CST Leaf
                      		if(DQVALUEGen != null) {
                      			Leaf DQVALUEGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      			DQVALUEGenLeaf.setKind("DQVALUE");
                      			DQVALUEGenLeaf.setValue(DQVALUEGen.getText());
                      			DQVALUEGenLeaf.setPos(DQVALUEGen.getCharPositionInLine());
                      			DQVALUEGenLeaf.setLine(DQVALUEGen.getLine());
                      			variable_assignmentReturnNode.getChildren().add(DQVALUEGenLeaf);
                      		}
                      		// Returns the Node with CST Leaves/Nodes
                      		retval.returnNode = variable_assignmentReturnNode;
                      	
                    }

                    }
                    break;
                case 3 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:262:8: TK_0= '@' TK_1= '@' IDGen= ID TK_2= '=' (DQVALUEGen= DQVALUE | TK_3= '@' TK_4= '@' IDGen_1= ID )
                    {
                    TK_0=(Token)input.LT(1);
                    match(input,25,FOLLOW_25_in_variable_assignment209); if (failed) return retval;
                    TK_1=(Token)input.LT(1);
                    match(input,25,FOLLOW_25_in_variable_assignment213); if (failed) return retval;
                    IDGen=(Token)input.LT(1);
                    match(input,ID,FOLLOW_ID_in_variable_assignment217); if (failed) return retval;
                    TK_2=(Token)input.LT(1);
                    match(input,22,FOLLOW_22_in_variable_assignment221); if (failed) return retval;
                    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:262:44: (DQVALUEGen= DQVALUE | TK_3= '@' TK_4= '@' IDGen_1= ID )
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==DQVALUE) ) {
                        alt4=1;
                    }
                    else if ( (LA4_0==25) ) {
                        alt4=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("262:44: (DQVALUEGen= DQVALUE | TK_3= '@' TK_4= '@' IDGen_1= ID )", 4, 0, input);

                        throw nvae;
                    }
                    switch (alt4) {
                        case 1 :
                            // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:262:45: DQVALUEGen= DQVALUE
                            {
                            DQVALUEGen=(Token)input.LT(1);
                            match(input,DQVALUE,FOLLOW_DQVALUE_in_variable_assignment226); if (failed) return retval;

                            }
                            break;
                        case 2 :
                            // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:262:66: TK_3= '@' TK_4= '@' IDGen_1= ID
                            {
                            TK_3=(Token)input.LT(1);
                            match(input,25,FOLLOW_25_in_variable_assignment232); if (failed) return retval;
                            TK_4=(Token)input.LT(1);
                            match(input,25,FOLLOW_25_in_variable_assignment236); if (failed) return retval;
                            IDGen_1=(Token)input.LT(1);
                            match(input,ID,FOLLOW_ID_in_variable_assignment240); if (failed) return retval;

                            }
                            break;

                    }

                    if ( backtracking==0 ) {
                      
                      		// Create return CST Node
                      		Node variable_assignmentReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                      		variable_assignmentReturnNode.setKind("variable_assignment");
                      	    // Create a Token CST Leaf	
                      	    if(TK_0 != null) {
                      			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      	 		TK_0Leaf.setKind("TOKEN");
                      	 		TK_0Leaf.setValue(TK_0.getText());
                      			TK_0Leaf.setPos(TK_0.getCharPositionInLine());
                      			TK_0Leaf.setLine(TK_0.getLine());
                      	 		variable_assignmentReturnNode.getChildren().add(TK_0Leaf);
                      	 	}
                      	    // Create a Token CST Leaf	
                      	    if(TK_1 != null) {
                      			Leaf TK_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      	 		TK_1Leaf.setKind("TOKEN");
                      	 		TK_1Leaf.setValue(TK_1.getText());
                      			TK_1Leaf.setPos(TK_1.getCharPositionInLine());
                      			TK_1Leaf.setLine(TK_1.getLine());
                      	 		variable_assignmentReturnNode.getChildren().add(TK_1Leaf);
                      	 	}
                      	    // Create a CST Leaf
                      		if(IDGen != null) {
                      			Leaf IDGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      			IDGenLeaf.setKind("ID");
                      			IDGenLeaf.setValue(IDGen.getText());
                      			IDGenLeaf.setPos(IDGen.getCharPositionInLine());
                      			IDGenLeaf.setLine(IDGen.getLine());
                      			variable_assignmentReturnNode.getChildren().add(IDGenLeaf);
                      		}
                      	    // Create a Token CST Leaf	
                      	    if(TK_2 != null) {
                      			Leaf TK_2Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      	 		TK_2Leaf.setKind("TOKEN");
                      	 		TK_2Leaf.setValue(TK_2.getText());
                      			TK_2Leaf.setPos(TK_2.getCharPositionInLine());
                      			TK_2Leaf.setLine(TK_2.getLine());
                      	 		variable_assignmentReturnNode.getChildren().add(TK_2Leaf);
                      	 	}
                      	    // Create a CST Leaf
                      		if(DQVALUEGen != null) {
                      			Leaf DQVALUEGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      			DQVALUEGenLeaf.setKind("DQVALUE");
                      			DQVALUEGenLeaf.setValue(DQVALUEGen.getText());
                      			DQVALUEGenLeaf.setPos(DQVALUEGen.getCharPositionInLine());
                      			DQVALUEGenLeaf.setLine(DQVALUEGen.getLine());
                      			variable_assignmentReturnNode.getChildren().add(DQVALUEGenLeaf);
                      		}
                      	    // Create a Token CST Leaf	
                      	    if(TK_3 != null) {
                      			Leaf TK_3Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      	 		TK_3Leaf.setKind("TOKEN");
                      	 		TK_3Leaf.setValue(TK_3.getText());
                      			TK_3Leaf.setPos(TK_3.getCharPositionInLine());
                      			TK_3Leaf.setLine(TK_3.getLine());
                      	 		variable_assignmentReturnNode.getChildren().add(TK_3Leaf);
                      	 	}
                      	    // Create a Token CST Leaf	
                      	    if(TK_4 != null) {
                      			Leaf TK_4Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      	 		TK_4Leaf.setKind("TOKEN");
                      	 		TK_4Leaf.setValue(TK_4.getText());
                      			TK_4Leaf.setPos(TK_4.getCharPositionInLine());
                      			TK_4Leaf.setLine(TK_4.getLine());
                      	 		variable_assignmentReturnNode.getChildren().add(TK_4Leaf);
                      	 	}
                      	    // Create a CST Leaf
                      		if(IDGen_1 != null) {
                      			Leaf IDGen_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      			IDGen_1Leaf.setKind("ID");
                      			IDGen_1Leaf.setValue(IDGen_1.getText());
                      			IDGen_1Leaf.setPos(IDGen_1.getCharPositionInLine());
                      			IDGen_1Leaf.setLine(IDGen_1.getLine());
                      			variable_assignmentReturnNode.getChildren().add(IDGen_1Leaf);
                      		}
                      		// Returns the Node with CST Leaves/Nodes
                      		retval.returnNode = variable_assignmentReturnNode;
                      	
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
    // $ANTLR end variable_assignment

    public static class utility_statements_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start utility_statements
    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:344:1: utility_statements returns [Node returnNode] : use_statementGen+= use_statement ;
    public final utility_statements_return utility_statements() throws RecognitionException {
        utility_statements_return retval = new utility_statements_return();
        retval.start = input.LT(1);

        List list_use_statementGen=null;
        RuleReturnScope use_statementGen = null;
        try {
            // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:345:1: (use_statementGen+= use_statement )
            // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:345:4: use_statementGen+= use_statement
            {
            pushFollow(FOLLOW_use_statement_in_utility_statements270);
            use_statementGen=use_statement();
            _fsp--;
            if (failed) return retval;
            if (list_use_statementGen==null) list_use_statementGen=new ArrayList();
            list_use_statementGen.add(use_statementGen);

            if ( backtracking==0 ) {
              
              		// Create return CST Node
              		Node utility_statementsReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
              		utility_statementsReturnNode.setKind("utility_statements");
              	    // Create a CST Node
              		if(list_use_statementGen != null) {
              	        for(Iterator it = list_use_statementGen.iterator(); it.hasNext(); )  { 
              	            DDLMySQLParser.use_statement_return r = (DDLMySQLParser.use_statement_return) it.next(); 
              	            if(r != null && r.returnNode != null) {
              	            	r.returnNode.setKind("use_statement");
              	            	utility_statementsReturnNode.getChildren().add(r.returnNode);
              	            } 
              	        }
              	    }
              		// Returns the Node with CST Leaves/Nodes
              		retval.returnNode = utility_statementsReturnNode;
              	
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
    // $ANTLR end utility_statements

    public static class use_statement_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start use_statement
    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:365:1: use_statement returns [Node returnNode] : TK_0= 'USE' IDGen= ID TK_1= ';' ;
    public final use_statement_return use_statement() throws RecognitionException {
        use_statement_return retval = new use_statement_return();
        retval.start = input.LT(1);

        Token TK_0=null;
        Token IDGen=null;
        Token TK_1=null;

        try {
            // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:366:1: (TK_0= 'USE' IDGen= ID TK_1= ';' )
            // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:366:4: TK_0= 'USE' IDGen= ID TK_1= ';'
            {
            TK_0=(Token)input.LT(1);
            match(input,26,FOLLOW_26_in_use_statement292); if (failed) return retval;
            IDGen=(Token)input.LT(1);
            match(input,ID,FOLLOW_ID_in_use_statement296); if (failed) return retval;
            TK_1=(Token)input.LT(1);
            match(input,21,FOLLOW_21_in_use_statement300); if (failed) return retval;
            if ( backtracking==0 ) {
              
              		// Create return CST Node
              		Node use_statementReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
              		use_statementReturnNode.setKind("use_statement");
              	    // Create a Token CST Leaf	
              	    if(TK_0 != null) {
              			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
              	 		TK_0Leaf.setKind("TOKEN");
              	 		TK_0Leaf.setValue(TK_0.getText());
              			TK_0Leaf.setPos(TK_0.getCharPositionInLine());
              			TK_0Leaf.setLine(TK_0.getLine());
              	 		use_statementReturnNode.getChildren().add(TK_0Leaf);
              	 	}
              	    // Create a CST Leaf
              		if(IDGen != null) {
              			Leaf IDGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf();
              			IDGenLeaf.setKind("ID");
              			IDGenLeaf.setValue(IDGen.getText());
              			IDGenLeaf.setPos(IDGen.getCharPositionInLine());
              			IDGenLeaf.setLine(IDGen.getLine());
              			use_statementReturnNode.getChildren().add(IDGenLeaf);
              		}
              	    // Create a Token CST Leaf	
              	    if(TK_1 != null) {
              			Leaf TK_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
              	 		TK_1Leaf.setKind("TOKEN");
              	 		TK_1Leaf.setValue(TK_1.getText());
              			TK_1Leaf.setPos(TK_1.getCharPositionInLine());
              			TK_1Leaf.setLine(TK_1.getLine());
              	 		use_statementReturnNode.getChildren().add(TK_1Leaf);
              	 	}
              		// Returns the Node with CST Leaves/Nodes
              		retval.returnNode = use_statementReturnNode;
              	
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
    // $ANTLR end use_statement

    public static class data_definition_statements_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start data_definition_statements
    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:403:1: data_definition_statements returns [Node returnNode] : (create_databaseGen+= create_database | create_tableGen+= create_table | drop_tableGen+= drop_table );
    public final data_definition_statements_return data_definition_statements() throws RecognitionException {
        data_definition_statements_return retval = new data_definition_statements_return();
        retval.start = input.LT(1);

        List list_create_databaseGen=null;
        List list_create_tableGen=null;
        List list_drop_tableGen=null;
        RuleReturnScope create_databaseGen = null;
        RuleReturnScope create_tableGen = null;
        RuleReturnScope drop_tableGen = null;
        try {
            // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:404:1: (create_databaseGen+= create_database | create_tableGen+= create_table | drop_tableGen+= drop_table )
            int alt6=3;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==27) ) {
                int LA6_1 = input.LA(2);

                if ( ((LA6_1>=28 && LA6_1<=29)) ) {
                    alt6=1;
                }
                else if ( ((LA6_1>=36 && LA6_1<=37)) ) {
                    alt6=2;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("403:1: data_definition_statements returns [Node returnNode] : (create_databaseGen+= create_database | create_tableGen+= create_table | drop_tableGen+= drop_table );", 6, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA6_0==126) ) {
                alt6=3;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("403:1: data_definition_statements returns [Node returnNode] : (create_databaseGen+= create_database | create_tableGen+= create_table | drop_tableGen+= drop_table );", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:404:4: create_databaseGen+= create_database
                    {
                    pushFollow(FOLLOW_create_database_in_data_definition_statements323);
                    create_databaseGen=create_database();
                    _fsp--;
                    if (failed) return retval;
                    if (list_create_databaseGen==null) list_create_databaseGen=new ArrayList();
                    list_create_databaseGen.add(create_databaseGen);

                    if ( backtracking==0 ) {
                      
                      		// Create return CST Node
                      		Node data_definition_statementsReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                      		data_definition_statementsReturnNode.setKind("data_definition_statements");
                      	    // Create a CST Node
                      		if(list_create_databaseGen != null) {
                      	        for(Iterator it = list_create_databaseGen.iterator(); it.hasNext(); )  { 
                      	            DDLMySQLParser.create_database_return r = (DDLMySQLParser.create_database_return) it.next(); 
                      	            if(r != null && r.returnNode != null) {
                      	            	r.returnNode.setKind("create_database");
                      	            	data_definition_statementsReturnNode.getChildren().add(r.returnNode);
                      	            } 
                      	        }
                      	    }
                      		// Returns the Node with CST Leaves/Nodes
                      		retval.returnNode = data_definition_statementsReturnNode;
                      	
                    }

                    }
                    break;
                case 2 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:422:5: create_tableGen+= create_table
                    {
                    pushFollow(FOLLOW_create_table_in_data_definition_statements335);
                    create_tableGen=create_table();
                    _fsp--;
                    if (failed) return retval;
                    if (list_create_tableGen==null) list_create_tableGen=new ArrayList();
                    list_create_tableGen.add(create_tableGen);

                    if ( backtracking==0 ) {
                      
                      		// Create return CST Node
                      		Node data_definition_statementsReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                      		data_definition_statementsReturnNode.setKind("data_definition_statements");
                      	    // Create a CST Node
                      		if(list_create_tableGen != null) {
                      	        for(Iterator it = list_create_tableGen.iterator(); it.hasNext(); )  { 
                      	            DDLMySQLParser.create_table_return r = (DDLMySQLParser.create_table_return) it.next(); 
                      	            if(r != null && r.returnNode != null) {
                      	            	r.returnNode.setKind("create_table");
                      	            	data_definition_statementsReturnNode.getChildren().add(r.returnNode);
                      	            } 
                      	        }
                      	    }
                      		// Returns the Node with CST Leaves/Nodes
                      		retval.returnNode = data_definition_statementsReturnNode;
                      	
                    }

                    }
                    break;
                case 3 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:440:4: drop_tableGen+= drop_table
                    {
                    pushFollow(FOLLOW_drop_table_in_data_definition_statements346);
                    drop_tableGen=drop_table();
                    _fsp--;
                    if (failed) return retval;
                    if (list_drop_tableGen==null) list_drop_tableGen=new ArrayList();
                    list_drop_tableGen.add(drop_tableGen);

                    if ( backtracking==0 ) {
                      
                      		// Create return CST Node
                      		Node data_definition_statementsReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                      		data_definition_statementsReturnNode.setKind("data_definition_statements");
                      	    // Create a CST Node
                      		if(list_drop_tableGen != null) {
                      	        for(Iterator it = list_drop_tableGen.iterator(); it.hasNext(); )  { 
                      	            DDLMySQLParser.drop_table_return r = (DDLMySQLParser.drop_table_return) it.next(); 
                      	            if(r != null && r.returnNode != null) {
                      	            	r.returnNode.setKind("drop_table");
                      	            	data_definition_statementsReturnNode.getChildren().add(r.returnNode);
                      	            } 
                      	        }
                      	    }
                      		// Returns the Node with CST Leaves/Nodes
                      		retval.returnNode = data_definition_statementsReturnNode;
                      	
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
    // $ANTLR end data_definition_statements

    public static class create_database_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start create_database
    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:460:1: create_database returns [Node returnNode] : TK_0= 'CREATE' (TK_1= 'DATABASE' | TK_2= 'SCHEMA' ) (TK_3= 'IF' TK_4= 'NOT' TK_5= 'EXISTS' )? IDGen= ID (create_specificationGen+= create_specification )? TK_6= ';' ;
    public final create_database_return create_database() throws RecognitionException {
        create_database_return retval = new create_database_return();
        retval.start = input.LT(1);

        Token TK_0=null;
        Token TK_1=null;
        Token TK_2=null;
        Token TK_3=null;
        Token TK_4=null;
        Token TK_5=null;
        Token IDGen=null;
        Token TK_6=null;
        List list_create_specificationGen=null;
        RuleReturnScope create_specificationGen = null;
        try {
            // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:461:1: (TK_0= 'CREATE' (TK_1= 'DATABASE' | TK_2= 'SCHEMA' ) (TK_3= 'IF' TK_4= 'NOT' TK_5= 'EXISTS' )? IDGen= ID (create_specificationGen+= create_specification )? TK_6= ';' )
            // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:461:3: TK_0= 'CREATE' (TK_1= 'DATABASE' | TK_2= 'SCHEMA' ) (TK_3= 'IF' TK_4= 'NOT' TK_5= 'EXISTS' )? IDGen= ID (create_specificationGen+= create_specification )? TK_6= ';'
            {
            TK_0=(Token)input.LT(1);
            match(input,27,FOLLOW_27_in_create_database368); if (failed) return retval;
            // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:461:17: (TK_1= 'DATABASE' | TK_2= 'SCHEMA' )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==28) ) {
                alt7=1;
            }
            else if ( (LA7_0==29) ) {
                alt7=2;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("461:17: (TK_1= 'DATABASE' | TK_2= 'SCHEMA' )", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:461:18: TK_1= 'DATABASE'
                    {
                    TK_1=(Token)input.LT(1);
                    match(input,28,FOLLOW_28_in_create_database373); if (failed) return retval;

                    }
                    break;
                case 2 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:461:36: TK_2= 'SCHEMA'
                    {
                    TK_2=(Token)input.LT(1);
                    match(input,29,FOLLOW_29_in_create_database379); if (failed) return retval;

                    }
                    break;

            }

            // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:461:51: (TK_3= 'IF' TK_4= 'NOT' TK_5= 'EXISTS' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==30) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:461:52: TK_3= 'IF' TK_4= 'NOT' TK_5= 'EXISTS'
                    {
                    TK_3=(Token)input.LT(1);
                    match(input,30,FOLLOW_30_in_create_database385); if (failed) return retval;
                    TK_4=(Token)input.LT(1);
                    match(input,31,FOLLOW_31_in_create_database389); if (failed) return retval;
                    TK_5=(Token)input.LT(1);
                    match(input,32,FOLLOW_32_in_create_database393); if (failed) return retval;

                    }
                    break;

            }

            IDGen=(Token)input.LT(1);
            match(input,ID,FOLLOW_ID_in_create_database399); if (failed) return retval;
            // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:461:98: (create_specificationGen+= create_specification )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=33 && LA9_0<=35)) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:461:99: create_specificationGen+= create_specification
                    {
                    pushFollow(FOLLOW_create_specification_in_create_database404);
                    create_specificationGen=create_specification();
                    _fsp--;
                    if (failed) return retval;
                    if (list_create_specificationGen==null) list_create_specificationGen=new ArrayList();
                    list_create_specificationGen.add(create_specificationGen);


                    }
                    break;

            }

            TK_6=(Token)input.LT(1);
            match(input,21,FOLLOW_21_in_create_database410); if (failed) return retval;
            if ( backtracking==0 ) {
              
              		// Create return CST Node
              		Node create_databaseReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
              		create_databaseReturnNode.setKind("create_database");
              	    // Create a Token CST Leaf	
              	    if(TK_0 != null) {
              			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
              	 		TK_0Leaf.setKind("TOKEN");
              	 		TK_0Leaf.setValue(TK_0.getText());
              			TK_0Leaf.setPos(TK_0.getCharPositionInLine());
              			TK_0Leaf.setLine(TK_0.getLine());
              	 		create_databaseReturnNode.getChildren().add(TK_0Leaf);
              	 	}
              	    // Create a Token CST Leaf	
              	    if(TK_1 != null) {
              			Leaf TK_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
              	 		TK_1Leaf.setKind("TOKEN");
              	 		TK_1Leaf.setValue(TK_1.getText());
              			TK_1Leaf.setPos(TK_1.getCharPositionInLine());
              			TK_1Leaf.setLine(TK_1.getLine());
              	 		create_databaseReturnNode.getChildren().add(TK_1Leaf);
              	 	}
              	    // Create a Token CST Leaf	
              	    if(TK_2 != null) {
              			Leaf TK_2Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
              	 		TK_2Leaf.setKind("TOKEN");
              	 		TK_2Leaf.setValue(TK_2.getText());
              			TK_2Leaf.setPos(TK_2.getCharPositionInLine());
              			TK_2Leaf.setLine(TK_2.getLine());
              	 		create_databaseReturnNode.getChildren().add(TK_2Leaf);
              	 	}
              	    // Create a Token CST Leaf	
              	    if(TK_3 != null) {
              			Leaf TK_3Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
              	 		TK_3Leaf.setKind("TOKEN");
              	 		TK_3Leaf.setValue(TK_3.getText());
              			TK_3Leaf.setPos(TK_3.getCharPositionInLine());
              			TK_3Leaf.setLine(TK_3.getLine());
              	 		create_databaseReturnNode.getChildren().add(TK_3Leaf);
              	 	}
              	    // Create a Token CST Leaf	
              	    if(TK_4 != null) {
              			Leaf TK_4Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
              	 		TK_4Leaf.setKind("TOKEN");
              	 		TK_4Leaf.setValue(TK_4.getText());
              			TK_4Leaf.setPos(TK_4.getCharPositionInLine());
              			TK_4Leaf.setLine(TK_4.getLine());
              	 		create_databaseReturnNode.getChildren().add(TK_4Leaf);
              	 	}
              	    // Create a Token CST Leaf	
              	    if(TK_5 != null) {
              			Leaf TK_5Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
              	 		TK_5Leaf.setKind("TOKEN");
              	 		TK_5Leaf.setValue(TK_5.getText());
              			TK_5Leaf.setPos(TK_5.getCharPositionInLine());
              			TK_5Leaf.setLine(TK_5.getLine());
              	 		create_databaseReturnNode.getChildren().add(TK_5Leaf);
              	 	}
              	    // Create a CST Leaf
              		if(IDGen != null) {
              			Leaf IDGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf();
              			IDGenLeaf.setKind("ID");
              			IDGenLeaf.setValue(IDGen.getText());
              			IDGenLeaf.setPos(IDGen.getCharPositionInLine());
              			IDGenLeaf.setLine(IDGen.getLine());
              			create_databaseReturnNode.getChildren().add(IDGenLeaf);
              		}
              	    // Create a CST Node
              		if(list_create_specificationGen != null) {
              	        for(Iterator it = list_create_specificationGen.iterator(); it.hasNext(); )  { 
              	            DDLMySQLParser.create_specification_return r = (DDLMySQLParser.create_specification_return) it.next(); 
              	            if(r != null && r.returnNode != null) {
              	            	r.returnNode.setKind("create_specification");
              	            	create_databaseReturnNode.getChildren().add(r.returnNode);
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
              	 		create_databaseReturnNode.getChildren().add(TK_6Leaf);
              	 	}
              		// Returns the Node with CST Leaves/Nodes
              		retval.returnNode = create_databaseReturnNode;
              	
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
    // $ANTLR end create_database

    public static class create_specification_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start create_specification
    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:553:1: create_specification returns [Node returnNode] : ( (TK_0= 'DEFAULT' )? TK_1= 'CHARACTER' TK_2= 'SET' (TK_3= '=' )? IDGen= ID | (TK_0= 'DEFAULT' )? TK_1= 'COLLATE' (TK_2= '=' )? IDGen= ID );
    public final create_specification_return create_specification() throws RecognitionException {
        create_specification_return retval = new create_specification_return();
        retval.start = input.LT(1);

        Token TK_0=null;
        Token TK_1=null;
        Token TK_2=null;
        Token TK_3=null;
        Token IDGen=null;

        try {
            // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:554:1: ( (TK_0= 'DEFAULT' )? TK_1= 'CHARACTER' TK_2= 'SET' (TK_3= '=' )? IDGen= ID | (TK_0= 'DEFAULT' )? TK_1= 'COLLATE' (TK_2= '=' )? IDGen= ID )
            int alt14=2;
            switch ( input.LA(1) ) {
            case 33:
                {
                int LA14_1 = input.LA(2);

                if ( (LA14_1==35) ) {
                    alt14=2;
                }
                else if ( (LA14_1==34) ) {
                    alt14=1;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("553:1: create_specification returns [Node returnNode] : ( (TK_0= 'DEFAULT' )? TK_1= 'CHARACTER' TK_2= 'SET' (TK_3= '=' )? IDGen= ID | (TK_0= 'DEFAULT' )? TK_1= 'COLLATE' (TK_2= '=' )? IDGen= ID );", 14, 1, input);

                    throw nvae;
                }
                }
                break;
            case 34:
                {
                alt14=1;
                }
                break;
            case 35:
                {
                alt14=2;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("553:1: create_specification returns [Node returnNode] : ( (TK_0= 'DEFAULT' )? TK_1= 'CHARACTER' TK_2= 'SET' (TK_3= '=' )? IDGen= ID | (TK_0= 'DEFAULT' )? TK_1= 'COLLATE' (TK_2= '=' )? IDGen= ID );", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:554:3: (TK_0= 'DEFAULT' )? TK_1= 'CHARACTER' TK_2= 'SET' (TK_3= '=' )? IDGen= ID
                    {
                    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:554:3: (TK_0= 'DEFAULT' )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==33) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:554:4: TK_0= 'DEFAULT'
                            {
                            TK_0=(Token)input.LT(1);
                            match(input,33,FOLLOW_33_in_create_specification432); if (failed) return retval;

                            }
                            break;

                    }

                    TK_1=(Token)input.LT(1);
                    match(input,34,FOLLOW_34_in_create_specification438); if (failed) return retval;
                    TK_2=(Token)input.LT(1);
                    match(input,19,FOLLOW_19_in_create_specification442); if (failed) return retval;
                    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:554:49: (TK_3= '=' )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==22) ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:554:50: TK_3= '='
                            {
                            TK_3=(Token)input.LT(1);
                            match(input,22,FOLLOW_22_in_create_specification447); if (failed) return retval;

                            }
                            break;

                    }

                    IDGen=(Token)input.LT(1);
                    match(input,ID,FOLLOW_ID_in_create_specification453); if (failed) return retval;
                    if ( backtracking==0 ) {
                      
                      		// Create return CST Node
                      		Node create_specificationReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                      		create_specificationReturnNode.setKind("create_specification");
                      	    // Create a Token CST Leaf	
                      	    if(TK_0 != null) {
                      			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      	 		TK_0Leaf.setKind("TOKEN");
                      	 		TK_0Leaf.setValue(TK_0.getText());
                      			TK_0Leaf.setPos(TK_0.getCharPositionInLine());
                      			TK_0Leaf.setLine(TK_0.getLine());
                      	 		create_specificationReturnNode.getChildren().add(TK_0Leaf);
                      	 	}
                      	    // Create a Token CST Leaf	
                      	    if(TK_1 != null) {
                      			Leaf TK_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      	 		TK_1Leaf.setKind("TOKEN");
                      	 		TK_1Leaf.setValue(TK_1.getText());
                      			TK_1Leaf.setPos(TK_1.getCharPositionInLine());
                      			TK_1Leaf.setLine(TK_1.getLine());
                      	 		create_specificationReturnNode.getChildren().add(TK_1Leaf);
                      	 	}
                      	    // Create a Token CST Leaf	
                      	    if(TK_2 != null) {
                      			Leaf TK_2Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      	 		TK_2Leaf.setKind("TOKEN");
                      	 		TK_2Leaf.setValue(TK_2.getText());
                      			TK_2Leaf.setPos(TK_2.getCharPositionInLine());
                      			TK_2Leaf.setLine(TK_2.getLine());
                      	 		create_specificationReturnNode.getChildren().add(TK_2Leaf);
                      	 	}
                      	    // Create a Token CST Leaf	
                      	    if(TK_3 != null) {
                      			Leaf TK_3Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      	 		TK_3Leaf.setKind("TOKEN");
                      	 		TK_3Leaf.setValue(TK_3.getText());
                      			TK_3Leaf.setPos(TK_3.getCharPositionInLine());
                      			TK_3Leaf.setLine(TK_3.getLine());
                      	 		create_specificationReturnNode.getChildren().add(TK_3Leaf);
                      	 	}
                      	    // Create a CST Leaf
                      		if(IDGen != null) {
                      			Leaf IDGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      			IDGenLeaf.setKind("ID");
                      			IDGenLeaf.setValue(IDGen.getText());
                      			IDGenLeaf.setPos(IDGen.getCharPositionInLine());
                      			IDGenLeaf.setLine(IDGen.getLine());
                      			create_specificationReturnNode.getChildren().add(IDGenLeaf);
                      		}
                      		// Returns the Node with CST Leaves/Nodes
                      		retval.returnNode = create_specificationReturnNode;
                      	
                    }

                    }
                    break;
                case 2 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:607:6: (TK_0= 'DEFAULT' )? TK_1= 'COLLATE' (TK_2= '=' )? IDGen= ID
                    {
                    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:607:6: (TK_0= 'DEFAULT' )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==33) ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:607:7: TK_0= 'DEFAULT'
                            {
                            TK_0=(Token)input.LT(1);
                            match(input,33,FOLLOW_33_in_create_specification467); if (failed) return retval;

                            }
                            break;

                    }

                    TK_1=(Token)input.LT(1);
                    match(input,35,FOLLOW_35_in_create_specification473); if (failed) return retval;
                    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:607:39: (TK_2= '=' )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==22) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:607:40: TK_2= '='
                            {
                            TK_2=(Token)input.LT(1);
                            match(input,22,FOLLOW_22_in_create_specification478); if (failed) return retval;

                            }
                            break;

                    }

                    IDGen=(Token)input.LT(1);
                    match(input,ID,FOLLOW_ID_in_create_specification484); if (failed) return retval;
                    if ( backtracking==0 ) {
                      
                      		// Create return CST Node
                      		Node create_specificationReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                      		create_specificationReturnNode.setKind("create_specification");
                      	    // Create a Token CST Leaf	
                      	    if(TK_0 != null) {
                      			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      	 		TK_0Leaf.setKind("TOKEN");
                      	 		TK_0Leaf.setValue(TK_0.getText());
                      			TK_0Leaf.setPos(TK_0.getCharPositionInLine());
                      			TK_0Leaf.setLine(TK_0.getLine());
                      	 		create_specificationReturnNode.getChildren().add(TK_0Leaf);
                      	 	}
                      	    // Create a Token CST Leaf	
                      	    if(TK_1 != null) {
                      			Leaf TK_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      	 		TK_1Leaf.setKind("TOKEN");
                      	 		TK_1Leaf.setValue(TK_1.getText());
                      			TK_1Leaf.setPos(TK_1.getCharPositionInLine());
                      			TK_1Leaf.setLine(TK_1.getLine());
                      	 		create_specificationReturnNode.getChildren().add(TK_1Leaf);
                      	 	}
                      	    // Create a Token CST Leaf	
                      	    if(TK_2 != null) {
                      			Leaf TK_2Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      	 		TK_2Leaf.setKind("TOKEN");
                      	 		TK_2Leaf.setValue(TK_2.getText());
                      			TK_2Leaf.setPos(TK_2.getCharPositionInLine());
                      			TK_2Leaf.setLine(TK_2.getLine());
                      	 		create_specificationReturnNode.getChildren().add(TK_2Leaf);
                      	 	}
                      	    // Create a CST Leaf
                      		if(IDGen != null) {
                      			Leaf IDGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      			IDGenLeaf.setKind("ID");
                      			IDGenLeaf.setValue(IDGen.getText());
                      			IDGenLeaf.setPos(IDGen.getCharPositionInLine());
                      			IDGenLeaf.setLine(IDGen.getLine());
                      			create_specificationReturnNode.getChildren().add(IDGenLeaf);
                      		}
                      		// Returns the Node with CST Leaves/Nodes
                      		retval.returnNode = create_specificationReturnNode;
                      	
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
    // $ANTLR end create_specification

    public static class create_table_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start create_table
    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:653:1: create_table returns [Node returnNode] : TK_0= 'CREATE' (TK_1= 'TEMPORARY' )? TK_2= 'TABLE' (TK_3= 'IF' TK_4= 'NOT' TK_5= 'EXISTS' )? OQUOTEGen= OQUOTE IDGen= ID OQUOTEGen_1= OQUOTE TK_6= '(' create_definitionGen+= create_definition (TK_7= ',' create_definitionGen_1+= create_definition )* TK_8= ')' (table_optionsGen+= table_options )* TK_9= ';' ;
    public final create_table_return create_table() throws RecognitionException {
        create_table_return retval = new create_table_return();
        retval.start = input.LT(1);

        Token TK_0=null;
        Token TK_1=null;
        Token TK_2=null;
        Token TK_3=null;
        Token TK_4=null;
        Token TK_5=null;
        Token OQUOTEGen=null;
        Token IDGen=null;
        Token OQUOTEGen_1=null;
        Token TK_6=null;
        Token TK_7=null;
        Token TK_8=null;
        Token TK_9=null;
        List list_create_definitionGen=null;
        List list_create_definitionGen_1=null;
        List list_table_optionsGen=null;
        RuleReturnScope create_definitionGen = null;
        RuleReturnScope create_definitionGen_1 = null;
        RuleReturnScope table_optionsGen = null;
        try {
            // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:654:1: (TK_0= 'CREATE' (TK_1= 'TEMPORARY' )? TK_2= 'TABLE' (TK_3= 'IF' TK_4= 'NOT' TK_5= 'EXISTS' )? OQUOTEGen= OQUOTE IDGen= ID OQUOTEGen_1= OQUOTE TK_6= '(' create_definitionGen+= create_definition (TK_7= ',' create_definitionGen_1+= create_definition )* TK_8= ')' (table_optionsGen+= table_options )* TK_9= ';' )
            // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:654:3: TK_0= 'CREATE' (TK_1= 'TEMPORARY' )? TK_2= 'TABLE' (TK_3= 'IF' TK_4= 'NOT' TK_5= 'EXISTS' )? OQUOTEGen= OQUOTE IDGen= ID OQUOTEGen_1= OQUOTE TK_6= '(' create_definitionGen+= create_definition (TK_7= ',' create_definitionGen_1+= create_definition )* TK_8= ')' (table_optionsGen+= table_options )* TK_9= ';'
            {
            TK_0=(Token)input.LT(1);
            match(input,27,FOLLOW_27_in_create_table507); if (failed) return retval;
            // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:654:17: (TK_1= 'TEMPORARY' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==36) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:654:18: TK_1= 'TEMPORARY'
                    {
                    TK_1=(Token)input.LT(1);
                    match(input,36,FOLLOW_36_in_create_table512); if (failed) return retval;

                    }
                    break;

            }

            TK_2=(Token)input.LT(1);
            match(input,37,FOLLOW_37_in_create_table518); if (failed) return retval;
            // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:654:50: (TK_3= 'IF' TK_4= 'NOT' TK_5= 'EXISTS' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==30) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:654:51: TK_3= 'IF' TK_4= 'NOT' TK_5= 'EXISTS'
                    {
                    TK_3=(Token)input.LT(1);
                    match(input,30,FOLLOW_30_in_create_table523); if (failed) return retval;
                    TK_4=(Token)input.LT(1);
                    match(input,31,FOLLOW_31_in_create_table527); if (failed) return retval;
                    TK_5=(Token)input.LT(1);
                    match(input,32,FOLLOW_32_in_create_table531); if (failed) return retval;

                    }
                    break;

            }

            OQUOTEGen=(Token)input.LT(1);
            match(input,OQUOTE,FOLLOW_OQUOTE_in_create_table537); if (failed) return retval;
            IDGen=(Token)input.LT(1);
            match(input,ID,FOLLOW_ID_in_create_table541); if (failed) return retval;
            OQUOTEGen_1=(Token)input.LT(1);
            match(input,OQUOTE,FOLLOW_OQUOTE_in_create_table545); if (failed) return retval;
            TK_6=(Token)input.LT(1);
            match(input,38,FOLLOW_38_in_create_table551); if (failed) return retval;
            pushFollow(FOLLOW_create_definition_in_create_table559);
            create_definitionGen=create_definition();
            _fsp--;
            if (failed) return retval;
            if (list_create_definitionGen==null) list_create_definitionGen=new ArrayList();
            list_create_definitionGen.add(create_definitionGen);

            // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:656:44: (TK_7= ',' create_definitionGen_1+= create_definition )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==20) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:656:45: TK_7= ',' create_definitionGen_1+= create_definition
            	    {
            	    TK_7=(Token)input.LT(1);
            	    match(input,20,FOLLOW_20_in_create_table564); if (failed) return retval;
            	    pushFollow(FOLLOW_create_definition_in_create_table568);
            	    create_definitionGen_1=create_definition();
            	    _fsp--;
            	    if (failed) return retval;
            	    if (list_create_definitionGen_1==null) list_create_definitionGen_1=new ArrayList();
            	    list_create_definitionGen_1.add(create_definitionGen_1);


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            TK_8=(Token)input.LT(1);
            match(input,39,FOLLOW_39_in_create_table577); if (failed) return retval;
            // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:657:12: (table_optionsGen+= table_options )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=33 && LA18_0<=35)||(LA18_0>=49 && LA18_0<=50)||LA18_0==62||(LA18_0>=98 && LA18_0<=105)||(LA18_0>=109 && LA18_0<=112)||(LA18_0>=116 && LA18_0<=117)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:657:13: table_optionsGen+= table_options
            	    {
            	    pushFollow(FOLLOW_table_options_in_create_table582);
            	    table_optionsGen=table_options();
            	    _fsp--;
            	    if (failed) return retval;
            	    if (list_table_optionsGen==null) list_table_optionsGen=new ArrayList();
            	    list_table_optionsGen.add(table_optionsGen);


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            TK_9=(Token)input.LT(1);
            match(input,21,FOLLOW_21_in_create_table588); if (failed) return retval;
            if ( backtracking==0 ) {
              
              		// Create return CST Node
              		Node create_tableReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
              		create_tableReturnNode.setKind("create_table");
              	    // Create a Token CST Leaf	
              	    if(TK_0 != null) {
              			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
              	 		TK_0Leaf.setKind("TOKEN");
              	 		TK_0Leaf.setValue(TK_0.getText());
              			TK_0Leaf.setPos(TK_0.getCharPositionInLine());
              			TK_0Leaf.setLine(TK_0.getLine());
              	 		create_tableReturnNode.getChildren().add(TK_0Leaf);
              	 	}
              	    // Create a Token CST Leaf	
              	    if(TK_1 != null) {
              			Leaf TK_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
              	 		TK_1Leaf.setKind("TOKEN");
              	 		TK_1Leaf.setValue(TK_1.getText());
              			TK_1Leaf.setPos(TK_1.getCharPositionInLine());
              			TK_1Leaf.setLine(TK_1.getLine());
              	 		create_tableReturnNode.getChildren().add(TK_1Leaf);
              	 	}
              	    // Create a Token CST Leaf	
              	    if(TK_2 != null) {
              			Leaf TK_2Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
              	 		TK_2Leaf.setKind("TOKEN");
              	 		TK_2Leaf.setValue(TK_2.getText());
              			TK_2Leaf.setPos(TK_2.getCharPositionInLine());
              			TK_2Leaf.setLine(TK_2.getLine());
              	 		create_tableReturnNode.getChildren().add(TK_2Leaf);
              	 	}
              	    // Create a Token CST Leaf	
              	    if(TK_3 != null) {
              			Leaf TK_3Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
              	 		TK_3Leaf.setKind("TOKEN");
              	 		TK_3Leaf.setValue(TK_3.getText());
              			TK_3Leaf.setPos(TK_3.getCharPositionInLine());
              			TK_3Leaf.setLine(TK_3.getLine());
              	 		create_tableReturnNode.getChildren().add(TK_3Leaf);
              	 	}
              	    // Create a Token CST Leaf	
              	    if(TK_4 != null) {
              			Leaf TK_4Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
              	 		TK_4Leaf.setKind("TOKEN");
              	 		TK_4Leaf.setValue(TK_4.getText());
              			TK_4Leaf.setPos(TK_4.getCharPositionInLine());
              			TK_4Leaf.setLine(TK_4.getLine());
              	 		create_tableReturnNode.getChildren().add(TK_4Leaf);
              	 	}
              	    // Create a Token CST Leaf	
              	    if(TK_5 != null) {
              			Leaf TK_5Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
              	 		TK_5Leaf.setKind("TOKEN");
              	 		TK_5Leaf.setValue(TK_5.getText());
              			TK_5Leaf.setPos(TK_5.getCharPositionInLine());
              			TK_5Leaf.setLine(TK_5.getLine());
              	 		create_tableReturnNode.getChildren().add(TK_5Leaf);
              	 	}
              	    // Create a CST Leaf
              		if(OQUOTEGen != null) {
              			Leaf OQUOTEGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf();
              			OQUOTEGenLeaf.setKind("OQUOTE");
              			OQUOTEGenLeaf.setValue(OQUOTEGen.getText());
              			OQUOTEGenLeaf.setPos(OQUOTEGen.getCharPositionInLine());
              			OQUOTEGenLeaf.setLine(OQUOTEGen.getLine());
              			create_tableReturnNode.getChildren().add(OQUOTEGenLeaf);
              		}
              	    // Create a CST Leaf
              		if(IDGen != null) {
              			Leaf IDGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf();
              			IDGenLeaf.setKind("ID");
              			IDGenLeaf.setValue(IDGen.getText());
              			IDGenLeaf.setPos(IDGen.getCharPositionInLine());
              			IDGenLeaf.setLine(IDGen.getLine());
              			create_tableReturnNode.getChildren().add(IDGenLeaf);
              		}
              	    // Create a CST Leaf
              		if(OQUOTEGen_1 != null) {
              			Leaf OQUOTEGen_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
              			OQUOTEGen_1Leaf.setKind("OQUOTE");
              			OQUOTEGen_1Leaf.setValue(OQUOTEGen_1.getText());
              			OQUOTEGen_1Leaf.setPos(OQUOTEGen_1.getCharPositionInLine());
              			OQUOTEGen_1Leaf.setLine(OQUOTEGen_1.getLine());
              			create_tableReturnNode.getChildren().add(OQUOTEGen_1Leaf);
              		}
              	    // Create a Token CST Leaf	
              	    if(TK_6 != null) {
              			Leaf TK_6Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
              	 		TK_6Leaf.setKind("TOKEN");
              	 		TK_6Leaf.setValue(TK_6.getText());
              			TK_6Leaf.setPos(TK_6.getCharPositionInLine());
              			TK_6Leaf.setLine(TK_6.getLine());
              	 		create_tableReturnNode.getChildren().add(TK_6Leaf);
              	 	}
              	    // Create a CST Node
              		if(list_create_definitionGen != null) {
              	        for(Iterator it = list_create_definitionGen.iterator(); it.hasNext(); )  { 
              	            DDLMySQLParser.create_definition_return r = (DDLMySQLParser.create_definition_return) it.next(); 
              	            if(r != null && r.returnNode != null) {
              	            	r.returnNode.setKind("create_definition");
              	            	create_tableReturnNode.getChildren().add(r.returnNode);
              	            } 
              	        }
              	    }
              	
              		// Create a special CST Node for terminal create_definitionGen_1 aggregation
              		if(list_create_definitionGen_1 != null) {
              	    for(int pos = 0; pos < list_create_definitionGen_1.size(); pos++ )  { 
              	    // Create a Token CST Leaf	
              	    if(TK_7 != null) {
              			Leaf TK_7Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
              	 		TK_7Leaf.setKind("TOKEN");
              	 		TK_7Leaf.setValue(TK_7.getText());
              			TK_7Leaf.setPos(TK_7.getCharPositionInLine());
              			TK_7Leaf.setLine(TK_7.getLine());
              	 		create_tableReturnNode.getChildren().add(TK_7Leaf);
              	 	}
              		// No Terminal extractor
              	    if(list_create_definitionGen_1 != null) {		
              	    	DDLMySQLParser.create_definition_return r = (DDLMySQLParser.create_definition_return) list_create_definitionGen_1.get(pos); 
              	    	if(r != null && r.returnNode != null) {
              	        	r.returnNode.setKind("create_definition");
              	    		create_tableReturnNode.getChildren().add(r.returnNode);
              	    	} 
              		}
              		}
              		}
              	
              	    // Create a Token CST Leaf	
              	    if(TK_8 != null) {
              			Leaf TK_8Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
              	 		TK_8Leaf.setKind("TOKEN");
              	 		TK_8Leaf.setValue(TK_8.getText());
              			TK_8Leaf.setPos(TK_8.getCharPositionInLine());
              			TK_8Leaf.setLine(TK_8.getLine());
              	 		create_tableReturnNode.getChildren().add(TK_8Leaf);
              	 	}
              	    // Create a CST Node
              		if(list_table_optionsGen != null) {
              	        for(Iterator it = list_table_optionsGen.iterator(); it.hasNext(); )  { 
              	            DDLMySQLParser.table_options_return r = (DDLMySQLParser.table_options_return) it.next(); 
              	            if(r != null && r.returnNode != null) {
              	            	r.returnNode.setKind("table_options");
              	            	create_tableReturnNode.getChildren().add(r.returnNode);
              	            } 
              	        }
              	    }
              	    // Create a Token CST Leaf	
              	    if(TK_9 != null) {
              			Leaf TK_9Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
              	 		TK_9Leaf.setKind("TOKEN");
              	 		TK_9Leaf.setValue(TK_9.getText());
              			TK_9Leaf.setPos(TK_9.getCharPositionInLine());
              			TK_9Leaf.setLine(TK_9.getLine());
              	 		create_tableReturnNode.getChildren().add(TK_9Leaf);
              	 	}
              		// Returns the Node with CST Leaves/Nodes
              		retval.returnNode = create_tableReturnNode;
              	
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
    // $ANTLR end create_table

    public static class create_definition_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start create_definition
    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:819:1: create_definition returns [Node returnNode] : (col_nameGen+= col_name column_definitionGen+= column_definition | (TK_0= 'UNIQUE' | TK_1= 'PRIMARY' | TK_2= 'FULLTEXT' )? (TK_3= 'INDEX' | TK_4= 'KEY' ) (OQUOTEGen= OQUOTE IDGen= ID OQUOTEGen_1= OQUOTE )? (index_typeGen+= index_type )? (TK_5= '(' index_col_nameGen+= index_col_name (TK_6= ',' index_col_nameGen_1+= index_col_name )* TK_7= ')' )? (index_optionGen+= index_option )? );
    public final create_definition_return create_definition() throws RecognitionException {
        create_definition_return retval = new create_definition_return();
        retval.start = input.LT(1);

        Token TK_0=null;
        Token TK_1=null;
        Token TK_2=null;
        Token TK_3=null;
        Token TK_4=null;
        Token OQUOTEGen=null;
        Token IDGen=null;
        Token OQUOTEGen_1=null;
        Token TK_5=null;
        Token TK_6=null;
        Token TK_7=null;
        List list_col_nameGen=null;
        List list_column_definitionGen=null;
        List list_index_typeGen=null;
        List list_index_col_nameGen=null;
        List list_index_col_nameGen_1=null;
        List list_index_optionGen=null;
        RuleReturnScope col_nameGen = null;
        RuleReturnScope column_definitionGen = null;
        RuleReturnScope index_typeGen = null;
        RuleReturnScope index_col_nameGen = null;
        RuleReturnScope index_col_nameGen_1 = null;
        RuleReturnScope index_optionGen = null;
        try {
            // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:820:1: (col_nameGen+= col_name column_definitionGen+= column_definition | (TK_0= 'UNIQUE' | TK_1= 'PRIMARY' | TK_2= 'FULLTEXT' )? (TK_3= 'INDEX' | TK_4= 'KEY' ) (OQUOTEGen= OQUOTE IDGen= ID OQUOTEGen_1= OQUOTE )? (index_typeGen+= index_type )? (TK_5= '(' index_col_nameGen+= index_col_name (TK_6= ',' index_col_nameGen_1+= index_col_name )* TK_7= ')' )? (index_optionGen+= index_option )? )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==OQUOTE) ) {
                alt26=1;
            }
            else if ( ((LA26_0>=40 && LA26_0<=44)) ) {
                alt26=2;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("819:1: create_definition returns [Node returnNode] : (col_nameGen+= col_name column_definitionGen+= column_definition | (TK_0= 'UNIQUE' | TK_1= 'PRIMARY' | TK_2= 'FULLTEXT' )? (TK_3= 'INDEX' | TK_4= 'KEY' ) (OQUOTEGen= OQUOTE IDGen= ID OQUOTEGen_1= OQUOTE )? (index_typeGen+= index_type )? (TK_5= '(' index_col_nameGen+= index_col_name (TK_6= ',' index_col_nameGen_1+= index_col_name )* TK_7= ')' )? (index_optionGen+= index_option )? );", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:820:4: col_nameGen+= col_name column_definitionGen+= column_definition
                    {
                    pushFollow(FOLLOW_col_name_in_create_definition610);
                    col_nameGen=col_name();
                    _fsp--;
                    if (failed) return retval;
                    if (list_col_nameGen==null) list_col_nameGen=new ArrayList();
                    list_col_nameGen.add(col_nameGen);

                    pushFollow(FOLLOW_column_definition_in_create_definition614);
                    column_definitionGen=column_definition();
                    _fsp--;
                    if (failed) return retval;
                    if (list_column_definitionGen==null) list_column_definitionGen=new ArrayList();
                    list_column_definitionGen.add(column_definitionGen);

                    if ( backtracking==0 ) {
                      
                      		// Create return CST Node
                      		Node create_definitionReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                      		create_definitionReturnNode.setKind("create_definition");
                      	    // Create a CST Node
                      		if(list_col_nameGen != null) {
                      	        for(Iterator it = list_col_nameGen.iterator(); it.hasNext(); )  { 
                      	            DDLMySQLParser.col_name_return r = (DDLMySQLParser.col_name_return) it.next(); 
                      	            if(r != null && r.returnNode != null) {
                      	            	r.returnNode.setKind("col_name");
                      	            	create_definitionReturnNode.getChildren().add(r.returnNode);
                      	            } 
                      	        }
                      	    }
                      	    // Create a CST Node
                      		if(list_column_definitionGen != null) {
                      	        for(Iterator it = list_column_definitionGen.iterator(); it.hasNext(); )  { 
                      	            DDLMySQLParser.column_definition_return r = (DDLMySQLParser.column_definition_return) it.next(); 
                      	            if(r != null && r.returnNode != null) {
                      	            	r.returnNode.setKind("column_definition");
                      	            	create_definitionReturnNode.getChildren().add(r.returnNode);
                      	            } 
                      	        }
                      	    }
                      		// Returns the Node with CST Leaves/Nodes
                      		retval.returnNode = create_definitionReturnNode;
                      	
                    }

                    }
                    break;
                case 2 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:848:5: (TK_0= 'UNIQUE' | TK_1= 'PRIMARY' | TK_2= 'FULLTEXT' )? (TK_3= 'INDEX' | TK_4= 'KEY' ) (OQUOTEGen= OQUOTE IDGen= ID OQUOTEGen_1= OQUOTE )? (index_typeGen+= index_type )? (TK_5= '(' index_col_nameGen+= index_col_name (TK_6= ',' index_col_nameGen_1+= index_col_name )* TK_7= ')' )? (index_optionGen+= index_option )?
                    {
                    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:848:5: (TK_0= 'UNIQUE' | TK_1= 'PRIMARY' | TK_2= 'FULLTEXT' )?
                    int alt19=4;
                    switch ( input.LA(1) ) {
                        case 40:
                            {
                            alt19=1;
                            }
                            break;
                        case 41:
                            {
                            alt19=2;
                            }
                            break;
                        case 42:
                            {
                            alt19=3;
                            }
                            break;
                    }

                    switch (alt19) {
                        case 1 :
                            // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:848:6: TK_0= 'UNIQUE'
                            {
                            TK_0=(Token)input.LT(1);
                            match(input,40,FOLLOW_40_in_create_definition627); if (failed) return retval;

                            }
                            break;
                        case 2 :
                            // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:848:22: TK_1= 'PRIMARY'
                            {
                            TK_1=(Token)input.LT(1);
                            match(input,41,FOLLOW_41_in_create_definition633); if (failed) return retval;

                            }
                            break;
                        case 3 :
                            // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:848:39: TK_2= 'FULLTEXT'
                            {
                            TK_2=(Token)input.LT(1);
                            match(input,42,FOLLOW_42_in_create_definition639); if (failed) return retval;

                            }
                            break;

                    }

                    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:848:57: (TK_3= 'INDEX' | TK_4= 'KEY' )
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==43) ) {
                        alt20=1;
                    }
                    else if ( (LA20_0==44) ) {
                        alt20=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("848:57: (TK_3= 'INDEX' | TK_4= 'KEY' )", 20, 0, input);

                        throw nvae;
                    }
                    switch (alt20) {
                        case 1 :
                            // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:848:58: TK_3= 'INDEX'
                            {
                            TK_3=(Token)input.LT(1);
                            match(input,43,FOLLOW_43_in_create_definition646); if (failed) return retval;

                            }
                            break;
                        case 2 :
                            // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:848:73: TK_4= 'KEY'
                            {
                            TK_4=(Token)input.LT(1);
                            match(input,44,FOLLOW_44_in_create_definition652); if (failed) return retval;

                            }
                            break;

                    }

                    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:848:85: (OQUOTEGen= OQUOTE IDGen= ID OQUOTEGen_1= OQUOTE )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==OQUOTE) ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:848:86: OQUOTEGen= OQUOTE IDGen= ID OQUOTEGen_1= OQUOTE
                            {
                            OQUOTEGen=(Token)input.LT(1);
                            match(input,OQUOTE,FOLLOW_OQUOTE_in_create_definition658); if (failed) return retval;
                            IDGen=(Token)input.LT(1);
                            match(input,ID,FOLLOW_ID_in_create_definition662); if (failed) return retval;
                            OQUOTEGen_1=(Token)input.LT(1);
                            match(input,OQUOTE,FOLLOW_OQUOTE_in_create_definition666); if (failed) return retval;

                            }
                            break;

                    }

                    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:848:133: (index_typeGen+= index_type )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==58) ) {
                        switch ( input.LA(2) ) {
                            case 59:
                                {
                                int LA22_3 = input.LA(3);

                                if ( (synpred30()) ) {
                                    alt22=1;
                                }
                                }
                                break;
                            case 60:
                                {
                                int LA22_4 = input.LA(3);

                                if ( (synpred30()) ) {
                                    alt22=1;
                                }
                                }
                                break;
                            case 61:
                                {
                                int LA22_5 = input.LA(3);

                                if ( (synpred30()) ) {
                                    alt22=1;
                                }
                                }
                                break;
                        }

                    }
                    switch (alt22) {
                        case 1 :
                            // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:848:134: index_typeGen+= index_type
                            {
                            pushFollow(FOLLOW_index_type_in_create_definition673);
                            index_typeGen=index_type();
                            _fsp--;
                            if (failed) return retval;
                            if (list_index_typeGen==null) list_index_typeGen=new ArrayList();
                            list_index_typeGen.add(index_typeGen);


                            }
                            break;

                    }

                    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:849:3: (TK_5= '(' index_col_nameGen+= index_col_name (TK_6= ',' index_col_nameGen_1+= index_col_name )* TK_7= ')' )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==38) ) {
                        alt24=1;
                    }
                    switch (alt24) {
                        case 1 :
                            // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:849:4: TK_5= '(' index_col_nameGen+= index_col_name (TK_6= ',' index_col_nameGen_1+= index_col_name )* TK_7= ')'
                            {
                            TK_5=(Token)input.LT(1);
                            match(input,38,FOLLOW_38_in_create_definition683); if (failed) return retval;
                            pushFollow(FOLLOW_index_col_name_in_create_definition687);
                            index_col_nameGen=index_col_name();
                            _fsp--;
                            if (failed) return retval;
                            if (list_index_col_nameGen==null) list_index_col_nameGen=new ArrayList();
                            list_index_col_nameGen.add(index_col_nameGen);

                            // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:849:47: (TK_6= ',' index_col_nameGen_1+= index_col_name )*
                            loop23:
                            do {
                                int alt23=2;
                                int LA23_0 = input.LA(1);

                                if ( (LA23_0==20) ) {
                                    alt23=1;
                                }


                                switch (alt23) {
                            	case 1 :
                            	    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:849:48: TK_6= ',' index_col_nameGen_1+= index_col_name
                            	    {
                            	    TK_6=(Token)input.LT(1);
                            	    match(input,20,FOLLOW_20_in_create_definition692); if (failed) return retval;
                            	    pushFollow(FOLLOW_index_col_name_in_create_definition696);
                            	    index_col_nameGen_1=index_col_name();
                            	    _fsp--;
                            	    if (failed) return retval;
                            	    if (list_index_col_nameGen_1==null) list_index_col_nameGen_1=new ArrayList();
                            	    list_index_col_nameGen_1.add(index_col_nameGen_1);


                            	    }
                            	    break;

                            	default :
                            	    break loop23;
                                }
                            } while (true);

                            TK_7=(Token)input.LT(1);
                            match(input,39,FOLLOW_39_in_create_definition702); if (failed) return retval;

                            }
                            break;

                    }

                    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:849:106: (index_optionGen+= index_option )?
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==58||(LA25_0>=62 && LA25_0<=63)) ) {
                        alt25=1;
                    }
                    switch (alt25) {
                        case 1 :
                            // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:849:107: index_optionGen+= index_option
                            {
                            pushFollow(FOLLOW_index_option_in_create_definition709);
                            index_optionGen=index_option();
                            _fsp--;
                            if (failed) return retval;
                            if (list_index_optionGen==null) list_index_optionGen=new ArrayList();
                            list_index_optionGen.add(index_optionGen);


                            }
                            break;

                    }

                    if ( backtracking==0 ) {
                      
                      		// Create return CST Node
                      		Node create_definitionReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                      		create_definitionReturnNode.setKind("create_definition");
                      	    // Create a Token CST Leaf	
                      	    if(TK_0 != null) {
                      			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      	 		TK_0Leaf.setKind("TOKEN");
                      	 		TK_0Leaf.setValue(TK_0.getText());
                      			TK_0Leaf.setPos(TK_0.getCharPositionInLine());
                      			TK_0Leaf.setLine(TK_0.getLine());
                      	 		create_definitionReturnNode.getChildren().add(TK_0Leaf);
                      	 	}
                      	    // Create a Token CST Leaf	
                      	    if(TK_1 != null) {
                      			Leaf TK_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      	 		TK_1Leaf.setKind("TOKEN");
                      	 		TK_1Leaf.setValue(TK_1.getText());
                      			TK_1Leaf.setPos(TK_1.getCharPositionInLine());
                      			TK_1Leaf.setLine(TK_1.getLine());
                      	 		create_definitionReturnNode.getChildren().add(TK_1Leaf);
                      	 	}
                      	    // Create a Token CST Leaf	
                      	    if(TK_2 != null) {
                      			Leaf TK_2Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      	 		TK_2Leaf.setKind("TOKEN");
                      	 		TK_2Leaf.setValue(TK_2.getText());
                      			TK_2Leaf.setPos(TK_2.getCharPositionInLine());
                      			TK_2Leaf.setLine(TK_2.getLine());
                      	 		create_definitionReturnNode.getChildren().add(TK_2Leaf);
                      	 	}
                      	    // Create a Token CST Leaf	
                      	    if(TK_3 != null) {
                      			Leaf TK_3Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      	 		TK_3Leaf.setKind("TOKEN");
                      	 		TK_3Leaf.setValue(TK_3.getText());
                      			TK_3Leaf.setPos(TK_3.getCharPositionInLine());
                      			TK_3Leaf.setLine(TK_3.getLine());
                      	 		create_definitionReturnNode.getChildren().add(TK_3Leaf);
                      	 	}
                      	    // Create a Token CST Leaf	
                      	    if(TK_4 != null) {
                      			Leaf TK_4Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      	 		TK_4Leaf.setKind("TOKEN");
                      	 		TK_4Leaf.setValue(TK_4.getText());
                      			TK_4Leaf.setPos(TK_4.getCharPositionInLine());
                      			TK_4Leaf.setLine(TK_4.getLine());
                      	 		create_definitionReturnNode.getChildren().add(TK_4Leaf);
                      	 	}
                      	    // Create a CST Leaf
                      		if(OQUOTEGen != null) {
                      			Leaf OQUOTEGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      			OQUOTEGenLeaf.setKind("OQUOTE");
                      			OQUOTEGenLeaf.setValue(OQUOTEGen.getText());
                      			OQUOTEGenLeaf.setPos(OQUOTEGen.getCharPositionInLine());
                      			OQUOTEGenLeaf.setLine(OQUOTEGen.getLine());
                      			create_definitionReturnNode.getChildren().add(OQUOTEGenLeaf);
                      		}
                      	    // Create a CST Leaf
                      		if(IDGen != null) {
                      			Leaf IDGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      			IDGenLeaf.setKind("ID");
                      			IDGenLeaf.setValue(IDGen.getText());
                      			IDGenLeaf.setPos(IDGen.getCharPositionInLine());
                      			IDGenLeaf.setLine(IDGen.getLine());
                      			create_definitionReturnNode.getChildren().add(IDGenLeaf);
                      		}
                      	    // Create a CST Leaf
                      		if(OQUOTEGen_1 != null) {
                      			Leaf OQUOTEGen_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      			OQUOTEGen_1Leaf.setKind("OQUOTE");
                      			OQUOTEGen_1Leaf.setValue(OQUOTEGen_1.getText());
                      			OQUOTEGen_1Leaf.setPos(OQUOTEGen_1.getCharPositionInLine());
                      			OQUOTEGen_1Leaf.setLine(OQUOTEGen_1.getLine());
                      			create_definitionReturnNode.getChildren().add(OQUOTEGen_1Leaf);
                      		}
                      	    // Create a CST Node
                      		if(list_index_typeGen != null) {
                      	        for(Iterator it = list_index_typeGen.iterator(); it.hasNext(); )  { 
                      	            DDLMySQLParser.index_type_return r = (DDLMySQLParser.index_type_return) it.next(); 
                      	            if(r != null && r.returnNode != null) {
                      	            	r.returnNode.setKind("index_type");
                      	            	create_definitionReturnNode.getChildren().add(r.returnNode);
                      	            } 
                      	        }
                      	    }
                      	    // Create a Token CST Leaf	
                      	    if(TK_5 != null) {
                      			Leaf TK_5Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      	 		TK_5Leaf.setKind("TOKEN");
                      	 		TK_5Leaf.setValue(TK_5.getText());
                      			TK_5Leaf.setPos(TK_5.getCharPositionInLine());
                      			TK_5Leaf.setLine(TK_5.getLine());
                      	 		create_definitionReturnNode.getChildren().add(TK_5Leaf);
                      	 	}
                      	    // Create a CST Node
                      		if(list_index_col_nameGen != null) {
                      	        for(Iterator it = list_index_col_nameGen.iterator(); it.hasNext(); )  { 
                      	            DDLMySQLParser.index_col_name_return r = (DDLMySQLParser.index_col_name_return) it.next(); 
                      	            if(r != null && r.returnNode != null) {
                      	            	r.returnNode.setKind("index_col_name");
                      	            	create_definitionReturnNode.getChildren().add(r.returnNode);
                      	            } 
                      	        }
                      	    }
                      	
                      		// Create a special CST Node for terminal index_col_nameGen_1 aggregation
                      		if(list_index_col_nameGen_1 != null) {
                      	    for(int pos = 0; pos < list_index_col_nameGen_1.size(); pos++ )  { 
                      	    // Create a Token CST Leaf	
                      	    if(TK_6 != null) {
                      			Leaf TK_6Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      	 		TK_6Leaf.setKind("TOKEN");
                      	 		TK_6Leaf.setValue(TK_6.getText());
                      			TK_6Leaf.setPos(TK_6.getCharPositionInLine());
                      			TK_6Leaf.setLine(TK_6.getLine());
                      	 		create_definitionReturnNode.getChildren().add(TK_6Leaf);
                      	 	}
                      		// No Terminal extractor
                      	    if(list_index_col_nameGen_1 != null) {		
                      	    	DDLMySQLParser.index_col_name_return r = (DDLMySQLParser.index_col_name_return) list_index_col_nameGen_1.get(pos); 
                      	    	if(r != null && r.returnNode != null) {
                      	        	r.returnNode.setKind("index_col_name");
                      	    		create_definitionReturnNode.getChildren().add(r.returnNode);
                      	    	} 
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
                      	 		create_definitionReturnNode.getChildren().add(TK_7Leaf);
                      	 	}
                      	    // Create a CST Node
                      		if(list_index_optionGen != null) {
                      	        for(Iterator it = list_index_optionGen.iterator(); it.hasNext(); )  { 
                      	            DDLMySQLParser.index_option_return r = (DDLMySQLParser.index_option_return) it.next(); 
                      	            if(r != null && r.returnNode != null) {
                      	            	r.returnNode.setKind("index_option");
                      	            	create_definitionReturnNode.getChildren().add(r.returnNode);
                      	            } 
                      	        }
                      	    }
                      		// Returns the Node with CST Leaves/Nodes
                      		retval.returnNode = create_definitionReturnNode;
                      	
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
    // $ANTLR end create_definition

    public static class column_definition_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start column_definition
    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:1003:1: column_definition returns [Node returnNode] : data_typeGen+= data_type (TK_0= 'NOT' )? (TK_1= 'NULL' )? (TK_2= 'DEFAULT' (IDGen= ID | QVALUEGen= QVALUE | TK_3= 'NULL' ) )? (TK_4= 'ON' (TK_5= 'UPDATE' | TK_6= 'DELETE' ) IDGen_1= ID )? (TK_7= 'AUTO_INCREMENT' )? ( (TK_8= 'UNIQUE' | TK_9= 'PRIMARY' ) TK_10= 'KEY' )? (TK_11= 'COMMENT' IDGen_2= ID )? (TK_12= 'COLUMN_FORMAT' (TK_13= 'FIXED' | TK_14= 'DYNAMIC' | TK_15= 'DEFAULT' ) )? (TK_16= 'STORAGE' (TK_17= 'DISK' | TK_18= 'DEFAULT' ) )? (reference_definitionGen+= reference_definition )? ;
    public final column_definition_return column_definition() throws RecognitionException {
        column_definition_return retval = new column_definition_return();
        retval.start = input.LT(1);

        Token TK_0=null;
        Token TK_1=null;
        Token TK_2=null;
        Token IDGen=null;
        Token QVALUEGen=null;
        Token TK_3=null;
        Token TK_4=null;
        Token TK_5=null;
        Token TK_6=null;
        Token IDGen_1=null;
        Token TK_7=null;
        Token TK_8=null;
        Token TK_9=null;
        Token TK_10=null;
        Token TK_11=null;
        Token IDGen_2=null;
        Token TK_12=null;
        Token TK_13=null;
        Token TK_14=null;
        Token TK_15=null;
        Token TK_16=null;
        Token TK_17=null;
        Token TK_18=null;
        List list_data_typeGen=null;
        List list_reference_definitionGen=null;
        RuleReturnScope data_typeGen = null;
        RuleReturnScope reference_definitionGen = null;
        try {
            // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:1004:1: (data_typeGen+= data_type (TK_0= 'NOT' )? (TK_1= 'NULL' )? (TK_2= 'DEFAULT' (IDGen= ID | QVALUEGen= QVALUE | TK_3= 'NULL' ) )? (TK_4= 'ON' (TK_5= 'UPDATE' | TK_6= 'DELETE' ) IDGen_1= ID )? (TK_7= 'AUTO_INCREMENT' )? ( (TK_8= 'UNIQUE' | TK_9= 'PRIMARY' ) TK_10= 'KEY' )? (TK_11= 'COMMENT' IDGen_2= ID )? (TK_12= 'COLUMN_FORMAT' (TK_13= 'FIXED' | TK_14= 'DYNAMIC' | TK_15= 'DEFAULT' ) )? (TK_16= 'STORAGE' (TK_17= 'DISK' | TK_18= 'DEFAULT' ) )? (reference_definitionGen+= reference_definition )? )
            // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:1004:4: data_typeGen+= data_type (TK_0= 'NOT' )? (TK_1= 'NULL' )? (TK_2= 'DEFAULT' (IDGen= ID | QVALUEGen= QVALUE | TK_3= 'NULL' ) )? (TK_4= 'ON' (TK_5= 'UPDATE' | TK_6= 'DELETE' ) IDGen_1= ID )? (TK_7= 'AUTO_INCREMENT' )? ( (TK_8= 'UNIQUE' | TK_9= 'PRIMARY' ) TK_10= 'KEY' )? (TK_11= 'COMMENT' IDGen_2= ID )? (TK_12= 'COLUMN_FORMAT' (TK_13= 'FIXED' | TK_14= 'DYNAMIC' | TK_15= 'DEFAULT' ) )? (TK_16= 'STORAGE' (TK_17= 'DISK' | TK_18= 'DEFAULT' ) )? (reference_definitionGen+= reference_definition )?
            {
            pushFollow(FOLLOW_data_type_in_column_definition735);
            data_typeGen=data_type();
            _fsp--;
            if (failed) return retval;
            if (list_data_typeGen==null) list_data_typeGen=new ArrayList();
            list_data_typeGen.add(data_typeGen);

            // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:1004:28: (TK_0= 'NOT' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==31) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:1004:29: TK_0= 'NOT'
                    {
                    TK_0=(Token)input.LT(1);
                    match(input,31,FOLLOW_31_in_column_definition740); if (failed) return retval;

                    }
                    break;

            }

            // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:1004:42: (TK_1= 'NULL' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==45) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:1004:43: TK_1= 'NULL'
                    {
                    TK_1=(Token)input.LT(1);
                    match(input,45,FOLLOW_45_in_column_definition747); if (failed) return retval;

                    }
                    break;

            }

            // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:1004:57: (TK_2= 'DEFAULT' (IDGen= ID | QVALUEGen= QVALUE | TK_3= 'NULL' ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==33) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:1004:58: TK_2= 'DEFAULT' (IDGen= ID | QVALUEGen= QVALUE | TK_3= 'NULL' )
                    {
                    TK_2=(Token)input.LT(1);
                    match(input,33,FOLLOW_33_in_column_definition754); if (failed) return retval;
                    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:1004:73: (IDGen= ID | QVALUEGen= QVALUE | TK_3= 'NULL' )
                    int alt29=3;
                    switch ( input.LA(1) ) {
                    case ID:
                        {
                        alt29=1;
                        }
                        break;
                    case QVALUE:
                        {
                        alt29=2;
                        }
                        break;
                    case 45:
                        {
                        alt29=3;
                        }
                        break;
                    default:
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("1004:73: (IDGen= ID | QVALUEGen= QVALUE | TK_3= 'NULL' )", 29, 0, input);

                        throw nvae;
                    }

                    switch (alt29) {
                        case 1 :
                            // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:1004:74: IDGen= ID
                            {
                            IDGen=(Token)input.LT(1);
                            match(input,ID,FOLLOW_ID_in_column_definition759); if (failed) return retval;

                            }
                            break;
                        case 2 :
                            // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:1004:85: QVALUEGen= QVALUE
                            {
                            QVALUEGen=(Token)input.LT(1);
                            match(input,QVALUE,FOLLOW_QVALUE_in_column_definition765); if (failed) return retval;

                            }
                            break;
                        case 3 :
                            // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:1004:104: TK_3= 'NULL'
                            {
                            TK_3=(Token)input.LT(1);
                            match(input,45,FOLLOW_45_in_column_definition771); if (failed) return retval;

                            }
                            break;

                    }


                    }
                    break;

            }

            // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:1004:119: (TK_4= 'ON' (TK_5= 'UPDATE' | TK_6= 'DELETE' ) IDGen_1= ID )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==46) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:1004:120: TK_4= 'ON' (TK_5= 'UPDATE' | TK_6= 'DELETE' ) IDGen_1= ID
                    {
                    TK_4=(Token)input.LT(1);
                    match(input,46,FOLLOW_46_in_column_definition779); if (failed) return retval;
                    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:1004:130: (TK_5= 'UPDATE' | TK_6= 'DELETE' )
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( (LA31_0==47) ) {
                        alt31=1;
                    }
                    else if ( (LA31_0==48) ) {
                        alt31=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("1004:130: (TK_5= 'UPDATE' | TK_6= 'DELETE' )", 31, 0, input);

                        throw nvae;
                    }
                    switch (alt31) {
                        case 1 :
                            // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:1004:131: TK_5= 'UPDATE'
                            {
                            TK_5=(Token)input.LT(1);
                            match(input,47,FOLLOW_47_in_column_definition784); if (failed) return retval;

                            }
                            break;
                        case 2 :
                            // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:1004:147: TK_6= 'DELETE'
                            {
                            TK_6=(Token)input.LT(1);
                            match(input,48,FOLLOW_48_in_column_definition790); if (failed) return retval;

                            }
                            break;

                    }

                    IDGen_1=(Token)input.LT(1);
                    match(input,ID,FOLLOW_ID_in_column_definition795); if (failed) return retval;

                    }
                    break;

            }

            // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:1005:8: (TK_7= 'AUTO_INCREMENT' )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==49) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:1005:9: TK_7= 'AUTO_INCREMENT'
                    {
                    TK_7=(Token)input.LT(1);
                    match(input,49,FOLLOW_49_in_column_definition809); if (failed) return retval;

                    }
                    break;

            }

            // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:1005:33: ( (TK_8= 'UNIQUE' | TK_9= 'PRIMARY' ) TK_10= 'KEY' )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( ((LA35_0>=40 && LA35_0<=41)) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:1005:34: (TK_8= 'UNIQUE' | TK_9= 'PRIMARY' ) TK_10= 'KEY'
                    {
                    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:1005:34: (TK_8= 'UNIQUE' | TK_9= 'PRIMARY' )
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( (LA34_0==40) ) {
                        alt34=1;
                    }
                    else if ( (LA34_0==41) ) {
                        alt34=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("1005:34: (TK_8= 'UNIQUE' | TK_9= 'PRIMARY' )", 34, 0, input);

                        throw nvae;
                    }
                    switch (alt34) {
                        case 1 :
                            // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:1005:35: TK_8= 'UNIQUE'
                            {
                            TK_8=(Token)input.LT(1);
                            match(input,40,FOLLOW_40_in_column_definition817); if (failed) return retval;

                            }
                            break;
                        case 2 :
                            // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:1005:51: TK_9= 'PRIMARY'
                            {
                            TK_9=(Token)input.LT(1);
                            match(input,41,FOLLOW_41_in_column_definition823); if (failed) return retval;

                            }
                            break;

                    }

                    TK_10=(Token)input.LT(1);
                    match(input,44,FOLLOW_44_in_column_definition828); if (failed) return retval;

                    }
                    break;

            }

            // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:1006:8: (TK_11= 'COMMENT' IDGen_2= ID )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==50) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:1006:9: TK_11= 'COMMENT' IDGen_2= ID
                    {
                    TK_11=(Token)input.LT(1);
                    match(input,50,FOLLOW_50_in_column_definition842); if (failed) return retval;
                    IDGen_2=(Token)input.LT(1);
                    match(input,ID,FOLLOW_ID_in_column_definition846); if (failed) return retval;

                    }
                    break;

            }

            // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:1007:8: (TK_12= 'COLUMN_FORMAT' (TK_13= 'FIXED' | TK_14= 'DYNAMIC' | TK_15= 'DEFAULT' ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==51) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:1007:9: TK_12= 'COLUMN_FORMAT' (TK_13= 'FIXED' | TK_14= 'DYNAMIC' | TK_15= 'DEFAULT' )
                    {
                    TK_12=(Token)input.LT(1);
                    match(input,51,FOLLOW_51_in_column_definition860); if (failed) return retval;
                    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:1007:31: (TK_13= 'FIXED' | TK_14= 'DYNAMIC' | TK_15= 'DEFAULT' )
                    int alt37=3;
                    switch ( input.LA(1) ) {
                    case 52:
                        {
                        alt37=1;
                        }
                        break;
                    case 53:
                        {
                        alt37=2;
                        }
                        break;
                    case 33:
                        {
                        alt37=3;
                        }
                        break;
                    default:
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("1007:31: (TK_13= 'FIXED' | TK_14= 'DYNAMIC' | TK_15= 'DEFAULT' )", 37, 0, input);

                        throw nvae;
                    }

                    switch (alt37) {
                        case 1 :
                            // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:1007:32: TK_13= 'FIXED'
                            {
                            TK_13=(Token)input.LT(1);
                            match(input,52,FOLLOW_52_in_column_definition865); if (failed) return retval;

                            }
                            break;
                        case 2 :
                            // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:1007:48: TK_14= 'DYNAMIC'
                            {
                            TK_14=(Token)input.LT(1);
                            match(input,53,FOLLOW_53_in_column_definition871); if (failed) return retval;

                            }
                            break;
                        case 3 :
                            // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:1007:66: TK_15= 'DEFAULT'
                            {
                            TK_15=(Token)input.LT(1);
                            match(input,33,FOLLOW_33_in_column_definition877); if (failed) return retval;

                            }
                            break;

                    }


                    }
                    break;

            }

            // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:1008:8: (TK_16= 'STORAGE' (TK_17= 'DISK' | TK_18= 'DEFAULT' ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==54) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:1008:9: TK_16= 'STORAGE' (TK_17= 'DISK' | TK_18= 'DEFAULT' )
                    {
                    TK_16=(Token)input.LT(1);
                    match(input,54,FOLLOW_54_in_column_definition892); if (failed) return retval;
                    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:1008:25: (TK_17= 'DISK' | TK_18= 'DEFAULT' )
                    int alt39=2;
                    int LA39_0 = input.LA(1);

                    if ( (LA39_0==55) ) {
                        alt39=1;
                    }
                    else if ( (LA39_0==33) ) {
                        alt39=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("1008:25: (TK_17= 'DISK' | TK_18= 'DEFAULT' )", 39, 0, input);

                        throw nvae;
                    }
                    switch (alt39) {
                        case 1 :
                            // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:1008:26: TK_17= 'DISK'
                            {
                            TK_17=(Token)input.LT(1);
                            match(input,55,FOLLOW_55_in_column_definition897); if (failed) return retval;

                            }
                            break;
                        case 2 :
                            // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:1008:39: TK_18= 'DEFAULT'
                            {
                            TK_18=(Token)input.LT(1);
                            match(input,33,FOLLOW_33_in_column_definition901); if (failed) return retval;

                            }
                            break;

                    }


                    }
                    break;

            }

            // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:1009:8: (reference_definitionGen+= reference_definition )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==118) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:1009:9: reference_definitionGen+= reference_definition
                    {
                    pushFollow(FOLLOW_reference_definition_in_column_definition917);
                    reference_definitionGen=reference_definition();
                    _fsp--;
                    if (failed) return retval;
                    if (list_reference_definitionGen==null) list_reference_definitionGen=new ArrayList();
                    list_reference_definitionGen.add(reference_definitionGen);


                    }
                    break;

            }

            if ( backtracking==0 ) {
              
              		// Create return CST Node
              		Node column_definitionReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
              		column_definitionReturnNode.setKind("column_definition");
              	    // Create a CST Node
              		if(list_data_typeGen != null) {
              	        for(Iterator it = list_data_typeGen.iterator(); it.hasNext(); )  { 
              	            DDLMySQLParser.data_type_return r = (DDLMySQLParser.data_type_return) it.next(); 
              	            if(r != null && r.returnNode != null) {
              	            	r.returnNode.setKind("data_type");
              	            	column_definitionReturnNode.getChildren().add(r.returnNode);
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
              	 		column_definitionReturnNode.getChildren().add(TK_0Leaf);
              	 	}
              	    // Create a Token CST Leaf	
              	    if(TK_1 != null) {
              			Leaf TK_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
              	 		TK_1Leaf.setKind("TOKEN");
              	 		TK_1Leaf.setValue(TK_1.getText());
              			TK_1Leaf.setPos(TK_1.getCharPositionInLine());
              			TK_1Leaf.setLine(TK_1.getLine());
              	 		column_definitionReturnNode.getChildren().add(TK_1Leaf);
              	 	}
              	    // Create a Token CST Leaf	
              	    if(TK_2 != null) {
              			Leaf TK_2Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
              	 		TK_2Leaf.setKind("TOKEN");
              	 		TK_2Leaf.setValue(TK_2.getText());
              			TK_2Leaf.setPos(TK_2.getCharPositionInLine());
              			TK_2Leaf.setLine(TK_2.getLine());
              	 		column_definitionReturnNode.getChildren().add(TK_2Leaf);
              	 	}
              	    // Create a CST Leaf
              		if(IDGen != null) {
              			Leaf IDGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf();
              			IDGenLeaf.setKind("ID");
              			IDGenLeaf.setValue(IDGen.getText());
              			IDGenLeaf.setPos(IDGen.getCharPositionInLine());
              			IDGenLeaf.setLine(IDGen.getLine());
              			column_definitionReturnNode.getChildren().add(IDGenLeaf);
              		}
              	    // Create a CST Leaf
              		if(QVALUEGen != null) {
              			Leaf QVALUEGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf();
              			QVALUEGenLeaf.setKind("QVALUE");
              			QVALUEGenLeaf.setValue(QVALUEGen.getText());
              			QVALUEGenLeaf.setPos(QVALUEGen.getCharPositionInLine());
              			QVALUEGenLeaf.setLine(QVALUEGen.getLine());
              			column_definitionReturnNode.getChildren().add(QVALUEGenLeaf);
              		}
              	    // Create a Token CST Leaf	
              	    if(TK_3 != null) {
              			Leaf TK_3Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
              	 		TK_3Leaf.setKind("TOKEN");
              	 		TK_3Leaf.setValue(TK_3.getText());
              			TK_3Leaf.setPos(TK_3.getCharPositionInLine());
              			TK_3Leaf.setLine(TK_3.getLine());
              	 		column_definitionReturnNode.getChildren().add(TK_3Leaf);
              	 	}
              	    // Create a Token CST Leaf	
              	    if(TK_4 != null) {
              			Leaf TK_4Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
              	 		TK_4Leaf.setKind("TOKEN");
              	 		TK_4Leaf.setValue(TK_4.getText());
              			TK_4Leaf.setPos(TK_4.getCharPositionInLine());
              			TK_4Leaf.setLine(TK_4.getLine());
              	 		column_definitionReturnNode.getChildren().add(TK_4Leaf);
              	 	}
              	    // Create a Token CST Leaf	
              	    if(TK_5 != null) {
              			Leaf TK_5Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
              	 		TK_5Leaf.setKind("TOKEN");
              	 		TK_5Leaf.setValue(TK_5.getText());
              			TK_5Leaf.setPos(TK_5.getCharPositionInLine());
              			TK_5Leaf.setLine(TK_5.getLine());
              	 		column_definitionReturnNode.getChildren().add(TK_5Leaf);
              	 	}
              	    // Create a Token CST Leaf	
              	    if(TK_6 != null) {
              			Leaf TK_6Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
              	 		TK_6Leaf.setKind("TOKEN");
              	 		TK_6Leaf.setValue(TK_6.getText());
              			TK_6Leaf.setPos(TK_6.getCharPositionInLine());
              			TK_6Leaf.setLine(TK_6.getLine());
              	 		column_definitionReturnNode.getChildren().add(TK_6Leaf);
              	 	}
              	    // Create a CST Leaf
              		if(IDGen_1 != null) {
              			Leaf IDGen_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
              			IDGen_1Leaf.setKind("ID");
              			IDGen_1Leaf.setValue(IDGen_1.getText());
              			IDGen_1Leaf.setPos(IDGen_1.getCharPositionInLine());
              			IDGen_1Leaf.setLine(IDGen_1.getLine());
              			column_definitionReturnNode.getChildren().add(IDGen_1Leaf);
              		}
              	    // Create a Token CST Leaf	
              	    if(TK_7 != null) {
              			Leaf TK_7Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
              	 		TK_7Leaf.setKind("TOKEN");
              	 		TK_7Leaf.setValue(TK_7.getText());
              			TK_7Leaf.setPos(TK_7.getCharPositionInLine());
              			TK_7Leaf.setLine(TK_7.getLine());
              	 		column_definitionReturnNode.getChildren().add(TK_7Leaf);
              	 	}
              	    // Create a Token CST Leaf	
              	    if(TK_8 != null) {
              			Leaf TK_8Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
              	 		TK_8Leaf.setKind("TOKEN");
              	 		TK_8Leaf.setValue(TK_8.getText());
              			TK_8Leaf.setPos(TK_8.getCharPositionInLine());
              			TK_8Leaf.setLine(TK_8.getLine());
              	 		column_definitionReturnNode.getChildren().add(TK_8Leaf);
              	 	}
              	    // Create a Token CST Leaf	
              	    if(TK_9 != null) {
              			Leaf TK_9Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
              	 		TK_9Leaf.setKind("TOKEN");
              	 		TK_9Leaf.setValue(TK_9.getText());
              			TK_9Leaf.setPos(TK_9.getCharPositionInLine());
              			TK_9Leaf.setLine(TK_9.getLine());
              	 		column_definitionReturnNode.getChildren().add(TK_9Leaf);
              	 	}
              	    // Create a Token CST Leaf	
              	    if(TK_10 != null) {
              			Leaf TK_10Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
              	 		TK_10Leaf.setKind("TOKEN");
              	 		TK_10Leaf.setValue(TK_10.getText());
              			TK_10Leaf.setPos(TK_10.getCharPositionInLine());
              			TK_10Leaf.setLine(TK_10.getLine());
              	 		column_definitionReturnNode.getChildren().add(TK_10Leaf);
              	 	}
              	    // Create a Token CST Leaf	
              	    if(TK_11 != null) {
              			Leaf TK_11Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
              	 		TK_11Leaf.setKind("TOKEN");
              	 		TK_11Leaf.setValue(TK_11.getText());
              			TK_11Leaf.setPos(TK_11.getCharPositionInLine());
              			TK_11Leaf.setLine(TK_11.getLine());
              	 		column_definitionReturnNode.getChildren().add(TK_11Leaf);
              	 	}
              	    // Create a CST Leaf
              		if(IDGen_2 != null) {
              			Leaf IDGen_2Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
              			IDGen_2Leaf.setKind("ID");
              			IDGen_2Leaf.setValue(IDGen_2.getText());
              			IDGen_2Leaf.setPos(IDGen_2.getCharPositionInLine());
              			IDGen_2Leaf.setLine(IDGen_2.getLine());
              			column_definitionReturnNode.getChildren().add(IDGen_2Leaf);
              		}
              	    // Create a Token CST Leaf	
              	    if(TK_12 != null) {
              			Leaf TK_12Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
              	 		TK_12Leaf.setKind("TOKEN");
              	 		TK_12Leaf.setValue(TK_12.getText());
              			TK_12Leaf.setPos(TK_12.getCharPositionInLine());
              			TK_12Leaf.setLine(TK_12.getLine());
              	 		column_definitionReturnNode.getChildren().add(TK_12Leaf);
              	 	}
              	    // Create a Token CST Leaf	
              	    if(TK_13 != null) {
              			Leaf TK_13Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
              	 		TK_13Leaf.setKind("TOKEN");
              	 		TK_13Leaf.setValue(TK_13.getText());
              			TK_13Leaf.setPos(TK_13.getCharPositionInLine());
              			TK_13Leaf.setLine(TK_13.getLine());
              	 		column_definitionReturnNode.getChildren().add(TK_13Leaf);
              	 	}
              	    // Create a Token CST Leaf	
              	    if(TK_14 != null) {
              			Leaf TK_14Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
              	 		TK_14Leaf.setKind("TOKEN");
              	 		TK_14Leaf.setValue(TK_14.getText());
              			TK_14Leaf.setPos(TK_14.getCharPositionInLine());
              			TK_14Leaf.setLine(TK_14.getLine());
              	 		column_definitionReturnNode.getChildren().add(TK_14Leaf);
              	 	}
              	    // Create a Token CST Leaf	
              	    if(TK_15 != null) {
              			Leaf TK_15Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
              	 		TK_15Leaf.setKind("TOKEN");
              	 		TK_15Leaf.setValue(TK_15.getText());
              			TK_15Leaf.setPos(TK_15.getCharPositionInLine());
              			TK_15Leaf.setLine(TK_15.getLine());
              	 		column_definitionReturnNode.getChildren().add(TK_15Leaf);
              	 	}
              	    // Create a Token CST Leaf	
              	    if(TK_16 != null) {
              			Leaf TK_16Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
              	 		TK_16Leaf.setKind("TOKEN");
              	 		TK_16Leaf.setValue(TK_16.getText());
              			TK_16Leaf.setPos(TK_16.getCharPositionInLine());
              			TK_16Leaf.setLine(TK_16.getLine());
              	 		column_definitionReturnNode.getChildren().add(TK_16Leaf);
              	 	}
              	    // Create a Token CST Leaf	
              	    if(TK_17 != null) {
              			Leaf TK_17Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
              	 		TK_17Leaf.setKind("TOKEN");
              	 		TK_17Leaf.setValue(TK_17.getText());
              			TK_17Leaf.setPos(TK_17.getCharPositionInLine());
              			TK_17Leaf.setLine(TK_17.getLine());
              	 		column_definitionReturnNode.getChildren().add(TK_17Leaf);
              	 	}
              	    // Create a Token CST Leaf	
              	    if(TK_18 != null) {
              			Leaf TK_18Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
              	 		TK_18Leaf.setKind("TOKEN");
              	 		TK_18Leaf.setValue(TK_18.getText());
              			TK_18Leaf.setPos(TK_18.getCharPositionInLine());
              			TK_18Leaf.setLine(TK_18.getLine());
              	 		column_definitionReturnNode.getChildren().add(TK_18Leaf);
              	 	}
              	    // Create a CST Node
              		if(list_reference_definitionGen != null) {
              	        for(Iterator it = list_reference_definitionGen.iterator(); it.hasNext(); )  { 
              	            DDLMySQLParser.reference_definition_return r = (DDLMySQLParser.reference_definition_return) it.next(); 
              	            if(r != null && r.returnNode != null) {
              	            	r.returnNode.setKind("reference_definition");
              	            	column_definitionReturnNode.getChildren().add(r.returnNode);
              	            } 
              	        }
              	    }
              		// Returns the Node with CST Leaves/Nodes
              		retval.returnNode = column_definitionReturnNode;
              	
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
    // $ANTLR end column_definition

    public static class index_col_name_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start index_col_name
    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:1246:1: index_col_name returns [Node returnNode] : col_nameGen+= col_name (TK_0= '(' NUMBERGen= NUMBER TK_1= ')' )? (TK_2= 'ASC' | TK_3= 'DESC' )? ;
    public final index_col_name_return index_col_name() throws RecognitionException {
        index_col_name_return retval = new index_col_name_return();
        retval.start = input.LT(1);

        Token TK_0=null;
        Token NUMBERGen=null;
        Token TK_1=null;
        Token TK_2=null;
        Token TK_3=null;
        List list_col_nameGen=null;
        RuleReturnScope col_nameGen = null;
        try {
            // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:1247:1: (col_nameGen+= col_name (TK_0= '(' NUMBERGen= NUMBER TK_1= ')' )? (TK_2= 'ASC' | TK_3= 'DESC' )? )
            // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:1247:3: col_nameGen+= col_name (TK_0= '(' NUMBERGen= NUMBER TK_1= ')' )? (TK_2= 'ASC' | TK_3= 'DESC' )?
            {
            pushFollow(FOLLOW_col_name_in_index_col_name941);
            col_nameGen=col_name();
            _fsp--;
            if (failed) return retval;
            if (list_col_nameGen==null) list_col_nameGen=new ArrayList();
            list_col_nameGen.add(col_nameGen);

            // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:1247:25: (TK_0= '(' NUMBERGen= NUMBER TK_1= ')' )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==38) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:1247:26: TK_0= '(' NUMBERGen= NUMBER TK_1= ')'
                    {
                    TK_0=(Token)input.LT(1);
                    match(input,38,FOLLOW_38_in_index_col_name946); if (failed) return retval;
                    NUMBERGen=(Token)input.LT(1);
                    match(input,NUMBER,FOLLOW_NUMBER_in_index_col_name950); if (failed) return retval;
                    TK_1=(Token)input.LT(1);
                    match(input,39,FOLLOW_39_in_index_col_name954); if (failed) return retval;

                    }
                    break;

            }

            // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:1247:63: (TK_2= 'ASC' | TK_3= 'DESC' )?
            int alt43=3;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==56) ) {
                alt43=1;
            }
            else if ( (LA43_0==57) ) {
                alt43=2;
            }
            switch (alt43) {
                case 1 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:1247:64: TK_2= 'ASC'
                    {
                    TK_2=(Token)input.LT(1);
                    match(input,56,FOLLOW_56_in_index_col_name961); if (failed) return retval;

                    }
                    break;
                case 2 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:1247:77: TK_3= 'DESC'
                    {
                    TK_3=(Token)input.LT(1);
                    match(input,57,FOLLOW_57_in_index_col_name967); if (failed) return retval;

                    }
                    break;

            }

            if ( backtracking==0 ) {
              
              		// Create return CST Node
              		Node index_col_nameReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
              		index_col_nameReturnNode.setKind("index_col_name");
              	    // Create a CST Node
              		if(list_col_nameGen != null) {
              	        for(Iterator it = list_col_nameGen.iterator(); it.hasNext(); )  { 
              	            DDLMySQLParser.col_name_return r = (DDLMySQLParser.col_name_return) it.next(); 
              	            if(r != null && r.returnNode != null) {
              	            	r.returnNode.setKind("col_name");
              	            	index_col_nameReturnNode.getChildren().add(r.returnNode);
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
              	 		index_col_nameReturnNode.getChildren().add(TK_0Leaf);
              	 	}
              	    // Create a CST Leaf
              		if(NUMBERGen != null) {
              			Leaf NUMBERGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf();
              			NUMBERGenLeaf.setKind("NUMBER");
              			NUMBERGenLeaf.setValue(NUMBERGen.getText());
              			NUMBERGenLeaf.setPos(NUMBERGen.getCharPositionInLine());
              			NUMBERGenLeaf.setLine(NUMBERGen.getLine());
              			index_col_nameReturnNode.getChildren().add(NUMBERGenLeaf);
              		}
              	    // Create a Token CST Leaf	
              	    if(TK_1 != null) {
              			Leaf TK_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
              	 		TK_1Leaf.setKind("TOKEN");
              	 		TK_1Leaf.setValue(TK_1.getText());
              			TK_1Leaf.setPos(TK_1.getCharPositionInLine());
              			TK_1Leaf.setLine(TK_1.getLine());
              	 		index_col_nameReturnNode.getChildren().add(TK_1Leaf);
              	 	}
              	    // Create a Token CST Leaf	
              	    if(TK_2 != null) {
              			Leaf TK_2Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
              	 		TK_2Leaf.setKind("TOKEN");
              	 		TK_2Leaf.setValue(TK_2.getText());
              			TK_2Leaf.setPos(TK_2.getCharPositionInLine());
              			TK_2Leaf.setLine(TK_2.getLine());
              	 		index_col_nameReturnNode.getChildren().add(TK_2Leaf);
              	 	}
              	    // Create a Token CST Leaf	
              	    if(TK_3 != null) {
              			Leaf TK_3Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
              	 		TK_3Leaf.setKind("TOKEN");
              	 		TK_3Leaf.setValue(TK_3.getText());
              			TK_3Leaf.setPos(TK_3.getCharPositionInLine());
              			TK_3Leaf.setLine(TK_3.getLine());
              	 		index_col_nameReturnNode.getChildren().add(TK_3Leaf);
              	 	}
              		// Returns the Node with CST Leaves/Nodes
              		retval.returnNode = index_col_nameReturnNode;
              	
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
    // $ANTLR end index_col_name

    public static class index_type_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start index_type
    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:1312:1: index_type returns [Node returnNode] : TK_0= 'USING' (TK_1= 'BTREE' | TK_2= 'HASH' | TK_3= 'RTREE' ) ;
    public final index_type_return index_type() throws RecognitionException {
        index_type_return retval = new index_type_return();
        retval.start = input.LT(1);

        Token TK_0=null;
        Token TK_1=null;
        Token TK_2=null;
        Token TK_3=null;

        try {
            // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:1313:1: (TK_0= 'USING' (TK_1= 'BTREE' | TK_2= 'HASH' | TK_3= 'RTREE' ) )
            // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:1313:3: TK_0= 'USING' (TK_1= 'BTREE' | TK_2= 'HASH' | TK_3= 'RTREE' )
            {
            TK_0=(Token)input.LT(1);
            match(input,58,FOLLOW_58_in_index_type990); if (failed) return retval;
            // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:1313:16: (TK_1= 'BTREE' | TK_2= 'HASH' | TK_3= 'RTREE' )
            int alt44=3;
            switch ( input.LA(1) ) {
            case 59:
                {
                alt44=1;
                }
                break;
            case 60:
                {
                alt44=2;
                }
                break;
            case 61:
                {
                alt44=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("1313:16: (TK_1= 'BTREE' | TK_2= 'HASH' | TK_3= 'RTREE' )", 44, 0, input);

                throw nvae;
            }

            switch (alt44) {
                case 1 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:1313:17: TK_1= 'BTREE'
                    {
                    TK_1=(Token)input.LT(1);
                    match(input,59,FOLLOW_59_in_index_type995); if (failed) return retval;

                    }
                    break;
                case 2 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:1313:32: TK_2= 'HASH'
                    {
                    TK_2=(Token)input.LT(1);
                    match(input,60,FOLLOW_60_in_index_type1001); if (failed) return retval;

                    }
                    break;
                case 3 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:1313:46: TK_3= 'RTREE'
                    {
                    TK_3=(Token)input.LT(1);
                    match(input,61,FOLLOW_61_in_index_type1007); if (failed) return retval;

                    }
                    break;

            }

            if ( backtracking==0 ) {
              
              		// Create return CST Node
              		Node index_typeReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
              		index_typeReturnNode.setKind("index_type");
              	    // Create a Token CST Leaf	
              	    if(TK_0 != null) {
              			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
              	 		TK_0Leaf.setKind("TOKEN");
              	 		TK_0Leaf.setValue(TK_0.getText());
              			TK_0Leaf.setPos(TK_0.getCharPositionInLine());
              			TK_0Leaf.setLine(TK_0.getLine());
              	 		index_typeReturnNode.getChildren().add(TK_0Leaf);
              	 	}
              	    // Create a Token CST Leaf	
              	    if(TK_1 != null) {
              			Leaf TK_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
              	 		TK_1Leaf.setKind("TOKEN");
              	 		TK_1Leaf.setValue(TK_1.getText());
              			TK_1Leaf.setPos(TK_1.getCharPositionInLine());
              			TK_1Leaf.setLine(TK_1.getLine());
              	 		index_typeReturnNode.getChildren().add(TK_1Leaf);
              	 	}
              	    // Create a Token CST Leaf	
              	    if(TK_2 != null) {
              			Leaf TK_2Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
              	 		TK_2Leaf.setKind("TOKEN");
              	 		TK_2Leaf.setValue(TK_2.getText());
              			TK_2Leaf.setPos(TK_2.getCharPositionInLine());
              			TK_2Leaf.setLine(TK_2.getLine());
              	 		index_typeReturnNode.getChildren().add(TK_2Leaf);
              	 	}
              	    // Create a Token CST Leaf	
              	    if(TK_3 != null) {
              			Leaf TK_3Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
              	 		TK_3Leaf.setKind("TOKEN");
              	 		TK_3Leaf.setValue(TK_3.getText());
              			TK_3Leaf.setPos(TK_3.getCharPositionInLine());
              			TK_3Leaf.setLine(TK_3.getLine());
              	 		index_typeReturnNode.getChildren().add(TK_3Leaf);
              	 	}
              		// Returns the Node with CST Leaves/Nodes
              		retval.returnNode = index_typeReturnNode;
              	
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
    // $ANTLR end index_type

    public static class index_option_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start index_option
    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:1359:1: index_option returns [Node returnNode] : (TK_0= 'KEY_BLOCK_SIZE' (TK_1= '=' )? NUMBERGen= NUMBER | index_typeGen+= index_type | TK_0= 'WITH' TK_1= 'PARSER' OQUOTEGen= OQUOTE IDGen= ID OQUOTEGen_1= OQUOTE );
    public final index_option_return index_option() throws RecognitionException {
        index_option_return retval = new index_option_return();
        retval.start = input.LT(1);

        Token TK_0=null;
        Token TK_1=null;
        Token NUMBERGen=null;
        Token OQUOTEGen=null;
        Token IDGen=null;
        Token OQUOTEGen_1=null;
        List list_index_typeGen=null;
        RuleReturnScope index_typeGen = null;
        try {
            // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:1360:1: (TK_0= 'KEY_BLOCK_SIZE' (TK_1= '=' )? NUMBERGen= NUMBER | index_typeGen+= index_type | TK_0= 'WITH' TK_1= 'PARSER' OQUOTEGen= OQUOTE IDGen= ID OQUOTEGen_1= OQUOTE )
            int alt46=3;
            switch ( input.LA(1) ) {
            case 62:
                {
                alt46=1;
                }
                break;
            case 58:
                {
                alt46=2;
                }
                break;
            case 63:
                {
                alt46=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("1359:1: index_option returns [Node returnNode] : (TK_0= 'KEY_BLOCK_SIZE' (TK_1= '=' )? NUMBERGen= NUMBER | index_typeGen+= index_type | TK_0= 'WITH' TK_1= 'PARSER' OQUOTEGen= OQUOTE IDGen= ID OQUOTEGen_1= OQUOTE );", 46, 0, input);

                throw nvae;
            }

            switch (alt46) {
                case 1 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:1360:3: TK_0= 'KEY_BLOCK_SIZE' (TK_1= '=' )? NUMBERGen= NUMBER
                    {
                    TK_0=(Token)input.LT(1);
                    match(input,62,FOLLOW_62_in_index_option1030); if (failed) return retval;
                    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:1360:25: (TK_1= '=' )?
                    int alt45=2;
                    int LA45_0 = input.LA(1);

                    if ( (LA45_0==22) ) {
                        alt45=1;
                    }
                    switch (alt45) {
                        case 1 :
                            // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:1360:26: TK_1= '='
                            {
                            TK_1=(Token)input.LT(1);
                            match(input,22,FOLLOW_22_in_index_option1035); if (failed) return retval;

                            }
                            break;

                    }

                    NUMBERGen=(Token)input.LT(1);
                    match(input,NUMBER,FOLLOW_NUMBER_in_index_option1041); if (failed) return retval;
                    if ( backtracking==0 ) {
                      
                      		// Create return CST Node
                      		Node index_optionReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                      		index_optionReturnNode.setKind("index_option");
                      	    // Create a Token CST Leaf	
                      	    if(TK_0 != null) {
                      			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      	 		TK_0Leaf.setKind("TOKEN");
                      	 		TK_0Leaf.setValue(TK_0.getText());
                      			TK_0Leaf.setPos(TK_0.getCharPositionInLine());
                      			TK_0Leaf.setLine(TK_0.getLine());
                      	 		index_optionReturnNode.getChildren().add(TK_0Leaf);
                      	 	}
                      	    // Create a Token CST Leaf	
                      	    if(TK_1 != null) {
                      			Leaf TK_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      	 		TK_1Leaf.setKind("TOKEN");
                      	 		TK_1Leaf.setValue(TK_1.getText());
                      			TK_1Leaf.setPos(TK_1.getCharPositionInLine());
                      			TK_1Leaf.setLine(TK_1.getLine());
                      	 		index_optionReturnNode.getChildren().add(TK_1Leaf);
                      	 	}
                      	    // Create a CST Leaf
                      		if(NUMBERGen != null) {
                      			Leaf NUMBERGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      			NUMBERGenLeaf.setKind("NUMBER");
                      			NUMBERGenLeaf.setValue(NUMBERGen.getText());
                      			NUMBERGenLeaf.setPos(NUMBERGen.getCharPositionInLine());
                      			NUMBERGenLeaf.setLine(NUMBERGen.getLine());
                      			index_optionReturnNode.getChildren().add(NUMBERGenLeaf);
                      		}
                      		// Returns the Node with CST Leaves/Nodes
                      		retval.returnNode = index_optionReturnNode;
                      	
                    }

                    }
                    break;
                case 2 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:1395:7: index_typeGen+= index_type
                    {
                    pushFollow(FOLLOW_index_type_in_index_option1055);
                    index_typeGen=index_type();
                    _fsp--;
                    if (failed) return retval;
                    if (list_index_typeGen==null) list_index_typeGen=new ArrayList();
                    list_index_typeGen.add(index_typeGen);

                    if ( backtracking==0 ) {
                      
                      		// Create return CST Node
                      		Node index_optionReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                      		index_optionReturnNode.setKind("index_option");
                      	    // Create a CST Node
                      		if(list_index_typeGen != null) {
                      	        for(Iterator it = list_index_typeGen.iterator(); it.hasNext(); )  { 
                      	            DDLMySQLParser.index_type_return r = (DDLMySQLParser.index_type_return) it.next(); 
                      	            if(r != null && r.returnNode != null) {
                      	            	r.returnNode.setKind("index_type");
                      	            	index_optionReturnNode.getChildren().add(r.returnNode);
                      	            } 
                      	        }
                      	    }
                      		// Returns the Node with CST Leaves/Nodes
                      		retval.returnNode = index_optionReturnNode;
                      	
                    }

                    }
                    break;
                case 3 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:1413:7: TK_0= 'WITH' TK_1= 'PARSER' OQUOTEGen= OQUOTE IDGen= ID OQUOTEGen_1= OQUOTE
                    {
                    TK_0=(Token)input.LT(1);
                    match(input,63,FOLLOW_63_in_index_option1069); if (failed) return retval;
                    TK_1=(Token)input.LT(1);
                    match(input,64,FOLLOW_64_in_index_option1073); if (failed) return retval;
                    OQUOTEGen=(Token)input.LT(1);
                    match(input,OQUOTE,FOLLOW_OQUOTE_in_index_option1077); if (failed) return retval;
                    IDGen=(Token)input.LT(1);
                    match(input,ID,FOLLOW_ID_in_index_option1081); if (failed) return retval;
                    OQUOTEGen_1=(Token)input.LT(1);
                    match(input,OQUOTE,FOLLOW_OQUOTE_in_index_option1085); if (failed) return retval;
                    if ( backtracking==0 ) {
                      
                      		// Create return CST Node
                      		Node index_optionReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                      		index_optionReturnNode.setKind("index_option");
                      	    // Create a Token CST Leaf	
                      	    if(TK_0 != null) {
                      			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      	 		TK_0Leaf.setKind("TOKEN");
                      	 		TK_0Leaf.setValue(TK_0.getText());
                      			TK_0Leaf.setPos(TK_0.getCharPositionInLine());
                      			TK_0Leaf.setLine(TK_0.getLine());
                      	 		index_optionReturnNode.getChildren().add(TK_0Leaf);
                      	 	}
                      	    // Create a Token CST Leaf	
                      	    if(TK_1 != null) {
                      			Leaf TK_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      	 		TK_1Leaf.setKind("TOKEN");
                      	 		TK_1Leaf.setValue(TK_1.getText());
                      			TK_1Leaf.setPos(TK_1.getCharPositionInLine());
                      			TK_1Leaf.setLine(TK_1.getLine());
                      	 		index_optionReturnNode.getChildren().add(TK_1Leaf);
                      	 	}
                      	    // Create a CST Leaf
                      		if(OQUOTEGen != null) {
                      			Leaf OQUOTEGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      			OQUOTEGenLeaf.setKind("OQUOTE");
                      			OQUOTEGenLeaf.setValue(OQUOTEGen.getText());
                      			OQUOTEGenLeaf.setPos(OQUOTEGen.getCharPositionInLine());
                      			OQUOTEGenLeaf.setLine(OQUOTEGen.getLine());
                      			index_optionReturnNode.getChildren().add(OQUOTEGenLeaf);
                      		}
                      	    // Create a CST Leaf
                      		if(IDGen != null) {
                      			Leaf IDGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      			IDGenLeaf.setKind("ID");
                      			IDGenLeaf.setValue(IDGen.getText());
                      			IDGenLeaf.setPos(IDGen.getCharPositionInLine());
                      			IDGenLeaf.setLine(IDGen.getLine());
                      			index_optionReturnNode.getChildren().add(IDGenLeaf);
                      		}
                      	    // Create a CST Leaf
                      		if(OQUOTEGen_1 != null) {
                      			Leaf OQUOTEGen_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      			OQUOTEGen_1Leaf.setKind("OQUOTE");
                      			OQUOTEGen_1Leaf.setValue(OQUOTEGen_1.getText());
                      			OQUOTEGen_1Leaf.setPos(OQUOTEGen_1.getCharPositionInLine());
                      			OQUOTEGen_1Leaf.setLine(OQUOTEGen_1.getLine());
                      			index_optionReturnNode.getChildren().add(OQUOTEGen_1Leaf);
                      		}
                      		// Returns the Node with CST Leaves/Nodes
                      		retval.returnNode = index_optionReturnNode;
                      	
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
    // $ANTLR end index_option

    public static class data_type_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start data_type
    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:1468:1: data_type returns [Node returnNode] : (TK_0= 'BIT' (TK_1= '(' NUMBERGen= NUMBER TK_2= ')' )? | TK_0= 'TINYINT' (TK_1= '(' NUMBERGen= NUMBER TK_2= ')' )? (TK_3= 'UNSIGNED' )? (TK_4= 'ZEROFILL' )? | TK_0= 'SMALLINT' (TK_1= '(' NUMBERGen= NUMBER TK_2= ')' )? (TK_3= 'UNSIGNED' )? (TK_4= 'ZEROFILL' )? | TK_0= 'MEDIUMINT' (TK_1= '(' NUMBERGen= NUMBER TK_2= ')' )? (TK_3= 'UNSIGNED' )? (TK_4= 'ZEROFILL' )? | TK_0= 'INT' (TK_1= '(' NUMBERGen= NUMBER TK_2= ')' )? (TK_3= 'UNSIGNED' )? (TK_4= 'ZEROFILL' )? | TK_0= 'INTEGER' (TK_1= '(' NUMBERGen= NUMBER TK_2= ')' )? (TK_3= 'UNSIGNED' )? (TK_4= 'ZEROFILL' )? | TK_0= 'BIGINT' (TK_1= '(' NUMBERGen= NUMBER TK_2= ')' )? (TK_3= 'UNSIGNED' )? (TK_4= 'ZEROFILL' )? | TK_0= 'REAL' (TK_1= '(' NUMBERGen= NUMBER TK_2= ')' )? (TK_3= 'UNSIGNED' )? (TK_4= 'ZEROFILL' )? | TK_0= 'DOUBLE' (TK_1= '(' NUMBERGen= NUMBER TK_2= ')' )? (TK_3= 'UNSIGNED' )? (TK_4= 'ZEROFILL' )? | TK_0= 'FLOAT' (TK_1= '(' NUMBERGen= NUMBER TK_2= ')' )? (TK_3= 'UNSIGNED' )? (TK_4= 'ZEROFILL' )? | TK_0= 'DECIMAL' (TK_1= '(' NUMBERGen= NUMBER (TK_2= ',' NUMBERGen_1= NUMBER )? TK_3= ')' )? (TK_4= 'UNSIGNED' )? (TK_5= 'ZEROFILL' )? | TK_0= 'NUMERIC' (TK_1= '(' NUMBERGen= NUMBER (TK_2= ',' NUMBERGen_1= NUMBER )? TK_3= ')' )? (TK_4= 'UNSIGNED' )? (TK_5= 'ZEROFILL' )? | TK_0= 'DATE' | TK_0= 'TIME' | TK_0= 'TIMESTAMP' | TK_0= 'DATETIME' | TK_0= 'YEAR' | TK_0= 'CHAR' (TK_1= '(' NUMBERGen= NUMBER TK_2= ')' )? (TK_3= 'CHARACTER' TK_4= 'SET' IDGen= ID )? (TK_5= 'COLLATE' IDGen_1= ID )? | TK_0= 'VARCHAR' TK_1= '(' NUMBERGen= NUMBER TK_2= ')' (TK_3= 'CHARACTER' TK_4= 'SET' IDGen= ID )? (TK_5= 'COLLATE' IDGen_1= ID )? | TK_0= 'BINARYTYPE' TK_1= '(' NUMBERGen= NUMBER TK_2= ')' | TK_0= 'VARBINARY' TK_1= '(' NUMBERGen= NUMBER TK_2= ')' | TK_0= 'TINYBLOB' | TK_0= 'BLOB' | TK_0= 'MEDIUMBLOB' | TK_0= 'LONGBLOB' | TK_0= 'TINYTEXT' (TK_1= 'BYNARY' )? (TK_2= 'CHARACTER' TK_3= 'SET' IDGen= ID )? (TK_4= 'COLLATE' IDGen_1= ID )? | TK_0= 'TEXTVAR' (TK_1= 'BYNARY' )? (TK_2= 'CHARACTER' TK_3= 'SET' IDGen= ID )? (TK_4= 'COLLATE' IDGen_1= ID )? | TK_0= 'MEDIUMTEXT' (TK_1= 'BYNARY' )? (TK_2= 'CHARACTER' TK_3= 'SET' IDGen= ID )? (TK_4= 'COLLATE' IDGen_1= ID )? | TK_0= 'LONGTEXT' (TK_1= 'BYNARY' )? (TK_2= 'CHARACTER' TK_3= 'SET' IDGen= ID )? (TK_4= 'COLLATE' IDGen_1= ID )? | TK_0= 'ENUM' TK_1= '(' QVALUEGen= QVALUE (TK_2= ',' QVALUEGen_1_List+= QVALUE )* TK_3= ')' (TK_4= 'CHARACTER' TK_5= 'SET' IDGen= ID )? (TK_6= 'COLLATE' IDGen_1= ID )? | TK_0= 'SET' TK_1= '(' QVALUEGen= QVALUE (TK_2= ',' QVALUEGen_1_List+= QVALUE )* TK_3= ')' (TK_4= 'CHARACTER' TK_5= 'SET' IDGen= ID )? (TK_6= 'COLLATE' IDGen_1= ID )? );
    public final data_type_return data_type() throws RecognitionException {
        data_type_return retval = new data_type_return();
        retval.start = input.LT(1);

        Token TK_0=null;
        Token TK_1=null;
        Token NUMBERGen=null;
        Token TK_2=null;
        Token TK_3=null;
        Token TK_4=null;
        Token NUMBERGen_1=null;
        Token TK_5=null;
        Token IDGen=null;
        Token IDGen_1=null;
        Token QVALUEGen=null;
        Token TK_6=null;
        Token QVALUEGen_1_List=null;
        List list_QVALUEGen_1_List=null;

        try {
            // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:1469:1: (TK_0= 'BIT' (TK_1= '(' NUMBERGen= NUMBER TK_2= ')' )? | TK_0= 'TINYINT' (TK_1= '(' NUMBERGen= NUMBER TK_2= ')' )? (TK_3= 'UNSIGNED' )? (TK_4= 'ZEROFILL' )? | TK_0= 'SMALLINT' (TK_1= '(' NUMBERGen= NUMBER TK_2= ')' )? (TK_3= 'UNSIGNED' )? (TK_4= 'ZEROFILL' )? | TK_0= 'MEDIUMINT' (TK_1= '(' NUMBERGen= NUMBER TK_2= ')' )? (TK_3= 'UNSIGNED' )? (TK_4= 'ZEROFILL' )? | TK_0= 'INT' (TK_1= '(' NUMBERGen= NUMBER TK_2= ')' )? (TK_3= 'UNSIGNED' )? (TK_4= 'ZEROFILL' )? | TK_0= 'INTEGER' (TK_1= '(' NUMBERGen= NUMBER TK_2= ')' )? (TK_3= 'UNSIGNED' )? (TK_4= 'ZEROFILL' )? | TK_0= 'BIGINT' (TK_1= '(' NUMBERGen= NUMBER TK_2= ')' )? (TK_3= 'UNSIGNED' )? (TK_4= 'ZEROFILL' )? | TK_0= 'REAL' (TK_1= '(' NUMBERGen= NUMBER TK_2= ')' )? (TK_3= 'UNSIGNED' )? (TK_4= 'ZEROFILL' )? | TK_0= 'DOUBLE' (TK_1= '(' NUMBERGen= NUMBER TK_2= ')' )? (TK_3= 'UNSIGNED' )? (TK_4= 'ZEROFILL' )? | TK_0= 'FLOAT' (TK_1= '(' NUMBERGen= NUMBER TK_2= ')' )? (TK_3= 'UNSIGNED' )? (TK_4= 'ZEROFILL' )? | TK_0= 'DECIMAL' (TK_1= '(' NUMBERGen= NUMBER (TK_2= ',' NUMBERGen_1= NUMBER )? TK_3= ')' )? (TK_4= 'UNSIGNED' )? (TK_5= 'ZEROFILL' )? | TK_0= 'NUMERIC' (TK_1= '(' NUMBERGen= NUMBER (TK_2= ',' NUMBERGen_1= NUMBER )? TK_3= ')' )? (TK_4= 'UNSIGNED' )? (TK_5= 'ZEROFILL' )? | TK_0= 'DATE' | TK_0= 'TIME' | TK_0= 'TIMESTAMP' | TK_0= 'DATETIME' | TK_0= 'YEAR' | TK_0= 'CHAR' (TK_1= '(' NUMBERGen= NUMBER TK_2= ')' )? (TK_3= 'CHARACTER' TK_4= 'SET' IDGen= ID )? (TK_5= 'COLLATE' IDGen_1= ID )? | TK_0= 'VARCHAR' TK_1= '(' NUMBERGen= NUMBER TK_2= ')' (TK_3= 'CHARACTER' TK_4= 'SET' IDGen= ID )? (TK_5= 'COLLATE' IDGen_1= ID )? | TK_0= 'BINARYTYPE' TK_1= '(' NUMBERGen= NUMBER TK_2= ')' | TK_0= 'VARBINARY' TK_1= '(' NUMBERGen= NUMBER TK_2= ')' | TK_0= 'TINYBLOB' | TK_0= 'BLOB' | TK_0= 'MEDIUMBLOB' | TK_0= 'LONGBLOB' | TK_0= 'TINYTEXT' (TK_1= 'BYNARY' )? (TK_2= 'CHARACTER' TK_3= 'SET' IDGen= ID )? (TK_4= 'COLLATE' IDGen_1= ID )? | TK_0= 'TEXTVAR' (TK_1= 'BYNARY' )? (TK_2= 'CHARACTER' TK_3= 'SET' IDGen= ID )? (TK_4= 'COLLATE' IDGen_1= ID )? | TK_0= 'MEDIUMTEXT' (TK_1= 'BYNARY' )? (TK_2= 'CHARACTER' TK_3= 'SET' IDGen= ID )? (TK_4= 'COLLATE' IDGen_1= ID )? | TK_0= 'LONGTEXT' (TK_1= 'BYNARY' )? (TK_2= 'CHARACTER' TK_3= 'SET' IDGen= ID )? (TK_4= 'COLLATE' IDGen_1= ID )? | TK_0= 'ENUM' TK_1= '(' QVALUEGen= QVALUE (TK_2= ',' QVALUEGen_1_List+= QVALUE )* TK_3= ')' (TK_4= 'CHARACTER' TK_5= 'SET' IDGen= ID )? (TK_6= 'COLLATE' IDGen_1= ID )? | TK_0= 'SET' TK_1= '(' QVALUEGen= QVALUE (TK_2= ',' QVALUEGen_1_List+= QVALUE )* TK_3= ')' (TK_4= 'CHARACTER' TK_5= 'SET' IDGen= ID )? (TK_6= 'COLLATE' IDGen_1= ID )? )
            int alt106=31;
            switch ( input.LA(1) ) {
            case 65:
                {
                alt106=1;
                }
                break;
            case 66:
                {
                alt106=2;
                }
                break;
            case 69:
                {
                alt106=3;
                }
                break;
            case 70:
                {
                alt106=4;
                }
                break;
            case 71:
                {
                alt106=5;
                }
                break;
            case 72:
                {
                alt106=6;
                }
                break;
            case 73:
                {
                alt106=7;
                }
                break;
            case 74:
                {
                alt106=8;
                }
                break;
            case 75:
                {
                alt106=9;
                }
                break;
            case 76:
                {
                alt106=10;
                }
                break;
            case 77:
                {
                alt106=11;
                }
                break;
            case 78:
                {
                alt106=12;
                }
                break;
            case 79:
                {
                alt106=13;
                }
                break;
            case 80:
                {
                alt106=14;
                }
                break;
            case 81:
                {
                alt106=15;
                }
                break;
            case 82:
                {
                alt106=16;
                }
                break;
            case 83:
                {
                alt106=17;
                }
                break;
            case 84:
                {
                alt106=18;
                }
                break;
            case 85:
                {
                alt106=19;
                }
                break;
            case 86:
                {
                alt106=20;
                }
                break;
            case 87:
                {
                alt106=21;
                }
                break;
            case 88:
                {
                alt106=22;
                }
                break;
            case 89:
                {
                alt106=23;
                }
                break;
            case 90:
                {
                alt106=24;
                }
                break;
            case 91:
                {
                alt106=25;
                }
                break;
            case 92:
                {
                alt106=26;
                }
                break;
            case 94:
                {
                alt106=27;
                }
                break;
            case 95:
                {
                alt106=28;
                }
                break;
            case 96:
                {
                alt106=29;
                }
                break;
            case 97:
                {
                alt106=30;
                }
                break;
            case 19:
                {
                alt106=31;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("1468:1: data_type returns [Node returnNode] : (TK_0= 'BIT' (TK_1= '(' NUMBERGen= NUMBER TK_2= ')' )? | TK_0= 'TINYINT' (TK_1= '(' NUMBERGen= NUMBER TK_2= ')' )? (TK_3= 'UNSIGNED' )? (TK_4= 'ZEROFILL' )? | TK_0= 'SMALLINT' (TK_1= '(' NUMBERGen= NUMBER TK_2= ')' )? (TK_3= 'UNSIGNED' )? (TK_4= 'ZEROFILL' )? | TK_0= 'MEDIUMINT' (TK_1= '(' NUMBERGen= NUMBER TK_2= ')' )? (TK_3= 'UNSIGNED' )? (TK_4= 'ZEROFILL' )? | TK_0= 'INT' (TK_1= '(' NUMBERGen= NUMBER TK_2= ')' )? (TK_3= 'UNSIGNED' )? (TK_4= 'ZEROFILL' )? | TK_0= 'INTEGER' (TK_1= '(' NUMBERGen= NUMBER TK_2= ')' )? (TK_3= 'UNSIGNED' )? (TK_4= 'ZEROFILL' )? | TK_0= 'BIGINT' (TK_1= '(' NUMBERGen= NUMBER TK_2= ')' )? (TK_3= 'UNSIGNED' )? (TK_4= 'ZEROFILL' )? | TK_0= 'REAL' (TK_1= '(' NUMBERGen= NUMBER TK_2= ')' )? (TK_3= 'UNSIGNED' )? (TK_4= 'ZEROFILL' )? | TK_0= 'DOUBLE' (TK_1= '(' NUMBERGen= NUMBER TK_2= ')' )? (TK_3= 'UNSIGNED' )? (TK_4= 'ZEROFILL' )? | TK_0= 'FLOAT' (TK_1= '(' NUMBERGen= NUMBER TK_2= ')' )? (TK_3= 'UNSIGNED' )? (TK_4= 'ZEROFILL' )? | TK_0= 'DECIMAL' (TK_1= '(' NUMBERGen= NUMBER (TK_2= ',' NUMBERGen_1= NUMBER )? TK_3= ')' )? (TK_4= 'UNSIGNED' )? (TK_5= 'ZEROFILL' )? | TK_0= 'NUMERIC' (TK_1= '(' NUMBERGen= NUMBER (TK_2= ',' NUMBERGen_1= NUMBER )? TK_3= ')' )? (TK_4= 'UNSIGNED' )? (TK_5= 'ZEROFILL' )? | TK_0= 'DATE' | TK_0= 'TIME' | TK_0= 'TIMESTAMP' | TK_0= 'DATETIME' | TK_0= 'YEAR' | TK_0= 'CHAR' (TK_1= '(' NUMBERGen= NUMBER TK_2= ')' )? (TK_3= 'CHARACTER' TK_4= 'SET' IDGen= ID )? (TK_5= 'COLLATE' IDGen_1= ID )? | TK_0= 'VARCHAR' TK_1= '(' NUMBERGen= NUMBER TK_2= ')' (TK_3= 'CHARACTER' TK_4= 'SET' IDGen= ID )? (TK_5= 'COLLATE' IDGen_1= ID )? | TK_0= 'BINARYTYPE' TK_1= '(' NUMBERGen= NUMBER TK_2= ')' | TK_0= 'VARBINARY' TK_1= '(' NUMBERGen= NUMBER TK_2= ')' | TK_0= 'TINYBLOB' | TK_0= 'BLOB' | TK_0= 'MEDIUMBLOB' | TK_0= 'LONGBLOB' | TK_0= 'TINYTEXT' (TK_1= 'BYNARY' )? (TK_2= 'CHARACTER' TK_3= 'SET' IDGen= ID )? (TK_4= 'COLLATE' IDGen_1= ID )? | TK_0= 'TEXTVAR' (TK_1= 'BYNARY' )? (TK_2= 'CHARACTER' TK_3= 'SET' IDGen= ID )? (TK_4= 'COLLATE' IDGen_1= ID )? | TK_0= 'MEDIUMTEXT' (TK_1= 'BYNARY' )? (TK_2= 'CHARACTER' TK_3= 'SET' IDGen= ID )? (TK_4= 'COLLATE' IDGen_1= ID )? | TK_0= 'LONGTEXT' (TK_1= 'BYNARY' )? (TK_2= 'CHARACTER' TK_3= 'SET' IDGen= ID )? (TK_4= 'COLLATE' IDGen_1= ID )? | TK_0= 'ENUM' TK_1= '(' QVALUEGen= QVALUE (TK_2= ',' QVALUEGen_1_List+= QVALUE )* TK_3= ')' (TK_4= 'CHARACTER' TK_5= 'SET' IDGen= ID )? (TK_6= 'COLLATE' IDGen_1= ID )? | TK_0= 'SET' TK_1= '(' QVALUEGen= QVALUE (TK_2= ',' QVALUEGen_1_List+= QVALUE )* TK_3= ')' (TK_4= 'CHARACTER' TK_5= 'SET' IDGen= ID )? (TK_6= 'COLLATE' IDGen_1= ID )? );", 106, 0, input);

                throw nvae;
            }

            switch (alt106) {
                case 1 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:1469:3: TK_0= 'BIT' (TK_1= '(' NUMBERGen= NUMBER TK_2= ')' )?
                    {
                    TK_0=(Token)input.LT(1);
                    match(input,65,FOLLOW_65_in_data_type1106); if (failed) return retval;
                    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:1469:14: (TK_1= '(' NUMBERGen= NUMBER TK_2= ')' )?
                    int alt47=2;
                    int LA47_0 = input.LA(1);

                    if ( (LA47_0==38) ) {
                        alt47=1;
                    }
                    switch (alt47) {
                        case 1 :
                            // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:1469:15: TK_1= '(' NUMBERGen= NUMBER TK_2= ')'
                            {
                            TK_1=(Token)input.LT(1);
                            match(input,38,FOLLOW_38_in_data_type1111); if (failed) return retval;
                            NUMBERGen=(Token)input.LT(1);
                            match(input,NUMBER,FOLLOW_NUMBER_in_data_type1115); if (failed) return retval;
                            TK_2=(Token)input.LT(1);
                            match(input,39,FOLLOW_39_in_data_type1119); if (failed) return retval;

                            }
                            break;

                    }

                    if ( backtracking==0 ) {
                      
                      		// Create return CST Node
                      		Node data_typeReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                      		data_typeReturnNode.setKind("data_type");
                      	    // Create a Token CST Leaf	
                      	    if(TK_0 != null) {
                      			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      	 		TK_0Leaf.setKind("TOKEN");
                      	 		TK_0Leaf.setValue(TK_0.getText());
                      			TK_0Leaf.setPos(TK_0.getCharPositionInLine());
                      			TK_0Leaf.setLine(TK_0.getLine());
                      	 		data_typeReturnNode.getChildren().add(TK_0Leaf);
                      	 	}
                      	    // Create a Token CST Leaf	
                      	    if(TK_1 != null) {
                      			Leaf TK_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      	 		TK_1Leaf.setKind("TOKEN");
                      	 		TK_1Leaf.setValue(TK_1.getText());
                      			TK_1Leaf.setPos(TK_1.getCharPositionInLine());
                      			TK_1Leaf.setLine(TK_1.getLine());
                      	 		data_typeReturnNode.getChildren().add(TK_1Leaf);
                      	 	}
                      	    // Create a CST Leaf
                      		if(NUMBERGen != null) {
                      			Leaf NUMBERGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      			NUMBERGenLeaf.setKind("NUMBER");
                      			NUMBERGenLeaf.setValue(NUMBERGen.getText());
                      			NUMBERGenLeaf.setPos(NUMBERGen.getCharPositionInLine());
                      			NUMBERGenLeaf.setLine(NUMBERGen.getLine());
                      			data_typeReturnNode.getChildren().add(NUMBERGenLeaf);
                      		}
                      	    // Create a Token CST Leaf	
                      	    if(TK_2 != null) {
                      			Leaf TK_2Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      	 		TK_2Leaf.setKind("TOKEN");
                      	 		TK_2Leaf.setValue(TK_2.getText());
                      			TK_2Leaf.setPos(TK_2.getCharPositionInLine());
                      			TK_2Leaf.setLine(TK_2.getLine());
                      	 		data_typeReturnNode.getChildren().add(TK_2Leaf);
                      	 	}
                      		// Returns the Node with CST Leaves/Nodes
                      		retval.returnNode = data_typeReturnNode;
                      	
                    }

                    }
                    break;
                case 2 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:1513:7: TK_0= 'TINYINT' (TK_1= '(' NUMBERGen= NUMBER TK_2= ')' )? (TK_3= 'UNSIGNED' )? (TK_4= 'ZEROFILL' )?
                    {
                    TK_0=(Token)input.LT(1);
                    match(input,66,FOLLOW_66_in_data_type1135); if (failed) return retval;
                    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:1513:22: (TK_1= '(' NUMBERGen= NUMBER TK_2= ')' )?
                    int alt48=2;
                    int LA48_0 = input.LA(1);

                    if ( (LA48_0==38) ) {
                        alt48=1;
                    }
                    switch (alt48) {
                        case 1 :
                            // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:1513:23: TK_1= '(' NUMBERGen= NUMBER TK_2= ')'
                            {
                            TK_1=(Token)input.LT(1);
                            match(input,38,FOLLOW_38_in_data_type1140); if (failed) return retval;
                            NUMBERGen=(Token)input.LT(1);
                            match(input,NUMBER,FOLLOW_NUMBER_in_data_type1144); if (failed) return retval;
                            TK_2=(Token)input.LT(1);
                            match(input,39,FOLLOW_39_in_data_type1148); if (failed) return retval;

                            }
                            break;

                    }

                    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:1513:60: (TK_3= 'UNSIGNED' )?
                    int alt49=2;
                    int LA49_0 = input.LA(1);

                    if ( (LA49_0==67) ) {
                        alt49=1;
                    }
                    switch (alt49) {
                        case 1 :
                            // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:1513:61: TK_3= 'UNSIGNED'
                            {
                            TK_3=(Token)input.LT(1);
                            match(input,67,FOLLOW_67_in_data_type1155); if (failed) return retval;

                            }
                            break;

                    }

                    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:1513:79: (TK_4= 'ZEROFILL' )?
                    int alt50=2;
                    int LA50_0 = input.LA(1);

                    if ( (LA50_0==68) ) {
                        alt50=1;
                    }
                    switch (alt50) {
                        case 1 :
                            // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:1513:80: TK_4= 'ZEROFILL'
                            {
                            TK_4=(Token)input.LT(1);
                            match(input,68,FOLLOW_68_in_data_type1162); if (failed) return retval;

                            }
                            break;

                    }

                    if ( backtracking==0 ) {
                      
                      		// Create return CST Node
                      		Node data_typeReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                      		data_typeReturnNode.setKind("data_type");
                      	    // Create a Token CST Leaf	
                      	    if(TK_0 != null) {
                      			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      	 		TK_0Leaf.setKind("TOKEN");
                      	 		TK_0Leaf.setValue(TK_0.getText());
                      			TK_0Leaf.setPos(TK_0.getCharPositionInLine());
                      			TK_0Leaf.setLine(TK_0.getLine());
                      	 		data_typeReturnNode.getChildren().add(TK_0Leaf);
                      	 	}
                      	    // Create a Token CST Leaf	
                      	    if(TK_1 != null) {
                      			Leaf TK_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      	 		TK_1Leaf.setKind("TOKEN");
                      	 		TK_1Leaf.setValue(TK_1.getText());
                      			TK_1Leaf.setPos(TK_1.getCharPositionInLine());
                      			TK_1Leaf.setLine(TK_1.getLine());
                      	 		data_typeReturnNode.getChildren().add(TK_1Leaf);
                      	 	}
                      	    // Create a CST Leaf
                      		if(NUMBERGen != null) {
                      			Leaf NUMBERGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      			NUMBERGenLeaf.setKind("NUMBER");
                      			NUMBERGenLeaf.setValue(NUMBERGen.getText());
                      			NUMBERGenLeaf.setPos(NUMBERGen.getCharPositionInLine());
                      			NUMBERGenLeaf.setLine(NUMBERGen.getLine());
                      			data_typeReturnNode.getChildren().add(NUMBERGenLeaf);
                      		}
                      	    // Create a Token CST Leaf	
                      	    if(TK_2 != null) {
                      			Leaf TK_2Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      	 		TK_2Leaf.setKind("TOKEN");
                      	 		TK_2Leaf.setValue(TK_2.getText());
                      			TK_2Leaf.setPos(TK_2.getCharPositionInLine());
                      			TK_2Leaf.setLine(TK_2.getLine());
                      	 		data_typeReturnNode.getChildren().add(TK_2Leaf);
                      	 	}
                      	    // Create a Token CST Leaf	
                      	    if(TK_3 != null) {
                      			Leaf TK_3Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      	 		TK_3Leaf.setKind("TOKEN");
                      	 		TK_3Leaf.setValue(TK_3.getText());
                      			TK_3Leaf.setPos(TK_3.getCharPositionInLine());
                      			TK_3Leaf.setLine(TK_3.getLine());
                      	 		data_typeReturnNode.getChildren().add(TK_3Leaf);
                      	 	}
                      	    // Create a Token CST Leaf	
                      	    if(TK_4 != null) {
                      			Leaf TK_4Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      	 		TK_4Leaf.setKind("TOKEN");
                      	 		TK_4Leaf.setValue(TK_4.getText());
                      			TK_4Leaf.setPos(TK_4.getCharPositionInLine());
                      			TK_4Leaf.setLine(TK_4.getLine());
                      	 		data_typeReturnNode.getChildren().add(TK_4Leaf);
                      	 	}
                      		// Returns the Node with CST Leaves/Nodes
                      		retval.returnNode = data_typeReturnNode;
                      	
                    }

                    }
                    break;
                case 3 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:1575:7: TK_0= 'SMALLINT' (TK_1= '(' NUMBERGen= NUMBER TK_2= ')' )? (TK_3= 'UNSIGNED' )? (TK_4= 'ZEROFILL' )?
                    {
                    TK_0=(Token)input.LT(1);
                    match(input,69,FOLLOW_69_in_data_type1178); if (failed) return retval;
                    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:1575:23: (TK_1= '(' NUMBERGen= NUMBER TK_2= ')' )?
                    int alt51=2;
                    int LA51_0 = input.LA(1);

                    if ( (LA51_0==38) ) {
                        alt51=1;
                    }
                    switch (alt51) {
                        case 1 :
                            // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:1575:24: TK_1= '(' NUMBERGen= NUMBER TK_2= ')'
                            {
                            TK_1=(Token)input.LT(1);
                            match(input,38,FOLLOW_38_in_data_type1183); if (failed) return retval;
                            NUMBERGen=(Token)input.LT(1);
                            match(input,NUMBER,FOLLOW_NUMBER_in_data_type1187); if (failed) return retval;
                            TK_2=(Token)input.LT(1);
                            match(input,39,FOLLOW_39_in_data_type1191); if (failed) return retval;

                            }
                            break;

                    }

                    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:1575:61: (TK_3= 'UNSIGNED' )?
                    int alt52=2;
                    int LA52_0 = input.LA(1);

                    if ( (LA52_0==67) ) {
                        alt52=1;
                    }
                    switch (alt52) {
                        case 1 :
                            // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:1575:62: TK_3= 'UNSIGNED'
                            {
                            TK_3=(Token)input.LT(1);
                            match(input,67,FOLLOW_67_in_data_type1198); if (failed) return retval;

                            }
                            break;

                    }

                    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:1575:80: (TK_4= 'ZEROFILL' )?
                    int alt53=2;
                    int LA53_0 = input.LA(1);

                    if ( (LA53_0==68) ) {
                        alt53=1;
                    }
                    switch (alt53) {
                        case 1 :
                            // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:1575:81: TK_4= 'ZEROFILL'
                            {
                            TK_4=(Token)input.LT(1);
                            match(input,68,FOLLOW_68_in_data_type1205); if (failed) return retval;

                            }
                            break;

                    }

                    if ( backtracking==0 ) {
                      
                      		// Create return CST Node
                      		Node data_typeReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                      		data_typeReturnNode.setKind("data_type");
                      	    // Create a Token CST Leaf	
                      	    if(TK_0 != null) {
                      			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      	 		TK_0Leaf.setKind("TOKEN");
                      	 		TK_0Leaf.setValue(TK_0.getText());
                      			TK_0Leaf.setPos(TK_0.getCharPositionInLine());
                      			TK_0Leaf.setLine(TK_0.getLine());
                      	 		data_typeReturnNode.getChildren().add(TK_0Leaf);
                      	 	}
                      	    // Create a Token CST Leaf	
                      	    if(TK_1 != null) {
                      			Leaf TK_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      	 		TK_1Leaf.setKind("TOKEN");
                      	 		TK_1Leaf.setValue(TK_1.getText());
                      			TK_1Leaf.setPos(TK_1.getCharPositionInLine());
                      			TK_1Leaf.setLine(TK_1.getLine());
                      	 		data_typeReturnNode.getChildren().add(TK_1Leaf);
                      	 	}
                      	    // Create a CST Leaf
                      		if(NUMBERGen != null) {
                      			Leaf NUMBERGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      			NUMBERGenLeaf.setKind("NUMBER");
                      			NUMBERGenLeaf.setValue(NUMBERGen.getText());
                      			NUMBERGenLeaf.setPos(NUMBERGen.getCharPositionInLine());
                      			NUMBERGenLeaf.setLine(NUMBERGen.getLine());
                      			data_typeReturnNode.getChildren().add(NUMBERGenLeaf);
                      		}
                      	    // Create a Token CST Leaf	
                      	    if(TK_2 != null) {
                      			Leaf TK_2Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      	 		TK_2Leaf.setKind("TOKEN");
                      	 		TK_2Leaf.setValue(TK_2.getText());
                      			TK_2Leaf.setPos(TK_2.getCharPositionInLine());
                      			TK_2Leaf.setLine(TK_2.getLine());
                      	 		data_typeReturnNode.getChildren().add(TK_2Leaf);
                      	 	}
                      	    // Create a Token CST Leaf	
                      	    if(TK_3 != null) {
                      			Leaf TK_3Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      	 		TK_3Leaf.setKind("TOKEN");
                      	 		TK_3Leaf.setValue(TK_3.getText());
                      			TK_3Leaf.setPos(TK_3.getCharPositionInLine());
                      			TK_3Leaf.setLine(TK_3.getLine());
                      	 		data_typeReturnNode.getChildren().add(TK_3Leaf);
                      	 	}
                      	    // Create a Token CST Leaf	
                      	    if(TK_4 != null) {
                      			Leaf TK_4Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      	 		TK_4Leaf.setKind("TOKEN");
                      	 		TK_4Leaf.setValue(TK_4.getText());
                      			TK_4Leaf.setPos(TK_4.getCharPositionInLine());
                      			TK_4Leaf.setLine(TK_4.getLine());
                      	 		data_typeReturnNode.getChildren().add(TK_4Leaf);
                      	 	}
                      		// Returns the Node with CST Leaves/Nodes
                      		retval.returnNode = data_typeReturnNode;
                      	
                    }

                    }
                    break;
                case 4 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:1637:7: TK_0= 'MEDIUMINT' (TK_1= '(' NUMBERGen= NUMBER TK_2= ')' )? (TK_3= 'UNSIGNED' )? (TK_4= 'ZEROFILL' )?
                    {
                    TK_0=(Token)input.LT(1);
                    match(input,70,FOLLOW_70_in_data_type1221); if (failed) return retval;
                    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:1637:24: (TK_1= '(' NUMBERGen= NUMBER TK_2= ')' )?
                    int alt54=2;
                    int LA54_0 = input.LA(1);

                    if ( (LA54_0==38) ) {
                        alt54=1;
                    }
                    switch (alt54) {
                        case 1 :
                            // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:1637:25: TK_1= '(' NUMBERGen= NUMBER TK_2= ')'
                            {
                            TK_1=(Token)input.LT(1);
                            match(input,38,FOLLOW_38_in_data_type1226); if (failed) return retval;
                            NUMBERGen=(Token)input.LT(1);
                            match(input,NUMBER,FOLLOW_NUMBER_in_data_type1230); if (failed) return retval;
                            TK_2=(Token)input.LT(1);
                            match(input,39,FOLLOW_39_in_data_type1234); if (failed) return retval;

                            }
                            break;

                    }

                    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:1637:62: (TK_3= 'UNSIGNED' )?
                    int alt55=2;
                    int LA55_0 = input.LA(1);

                    if ( (LA55_0==67) ) {
                        alt55=1;
                    }
                    switch (alt55) {
                        case 1 :
                            // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:1637:63: TK_3= 'UNSIGNED'
                            {
                            TK_3=(Token)input.LT(1);
                            match(input,67,FOLLOW_67_in_data_type1241); if (failed) return retval;

                            }
                            break;

                    }

                    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:1637:81: (TK_4= 'ZEROFILL' )?
                    int alt56=2;
                    int LA56_0 = input.LA(1);

                    if ( (LA56_0==68) ) {
                        alt56=1;
                    }
                    switch (alt56) {
                        case 1 :
                            // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:1637:82: TK_4= 'ZEROFILL'
                            {
                            TK_4=(Token)input.LT(1);
                            match(input,68,FOLLOW_68_in_data_type1248); if (failed) return retval;

                            }
                            break;

                    }

                    if ( backtracking==0 ) {
                      
                      		// Create return CST Node
                      		Node data_typeReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                      		data_typeReturnNode.setKind("data_type");
                      	    // Create a Token CST Leaf	
                      	    if(TK_0 != null) {
                      			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      	 		TK_0Leaf.setKind("TOKEN");
                      	 		TK_0Leaf.setValue(TK_0.getText());
                      			TK_0Leaf.setPos(TK_0.getCharPositionInLine());
                      			TK_0Leaf.setLine(TK_0.getLine());
                      	 		data_typeReturnNode.getChildren().add(TK_0Leaf);
                      	 	}
                      	    // Create a Token CST Leaf	
                      	    if(TK_1 != null) {
                      			Leaf TK_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      	 		TK_1Leaf.setKind("TOKEN");
                      	 		TK_1Leaf.setValue(TK_1.getText());
                      			TK_1Leaf.setPos(TK_1.getCharPositionInLine());
                      			TK_1Leaf.setLine(TK_1.getLine());
                      	 		data_typeReturnNode.getChildren().add(TK_1Leaf);
                      	 	}
                      	    // Create a CST Leaf
                      		if(NUMBERGen != null) {
                      			Leaf NUMBERGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      			NUMBERGenLeaf.setKind("NUMBER");
                      			NUMBERGenLeaf.setValue(NUMBERGen.getText());
                      			NUMBERGenLeaf.setPos(NUMBERGen.getCharPositionInLine());
                      			NUMBERGenLeaf.setLine(NUMBERGen.getLine());
                      			data_typeReturnNode.getChildren().add(NUMBERGenLeaf);
                      		}
                      	    // Create a Token CST Leaf	
                      	    if(TK_2 != null) {
                      			Leaf TK_2Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      	 		TK_2Leaf.setKind("TOKEN");
                      	 		TK_2Leaf.setValue(TK_2.getText());
                      			TK_2Leaf.setPos(TK_2.getCharPositionInLine());
                      			TK_2Leaf.setLine(TK_2.getLine());
                      	 		data_typeReturnNode.getChildren().add(TK_2Leaf);
                      	 	}
                      	    // Create a Token CST Leaf	
                      	    if(TK_3 != null) {
                      			Leaf TK_3Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      	 		TK_3Leaf.setKind("TOKEN");
                      	 		TK_3Leaf.setValue(TK_3.getText());
                      			TK_3Leaf.setPos(TK_3.getCharPositionInLine());
                      			TK_3Leaf.setLine(TK_3.getLine());
                      	 		data_typeReturnNode.getChildren().add(TK_3Leaf);
                      	 	}
                      	    // Create a Token CST Leaf	
                      	    if(TK_4 != null) {
                      			Leaf TK_4Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      	 		TK_4Leaf.setKind("TOKEN");
                      	 		TK_4Leaf.setValue(TK_4.getText());
                      			TK_4Leaf.setPos(TK_4.getCharPositionInLine());
                      			TK_4Leaf.setLine(TK_4.getLine());
                      	 		data_typeReturnNode.getChildren().add(TK_4Leaf);
                      	 	}
                      		// Returns the Node with CST Leaves/Nodes
                      		retval.returnNode = data_typeReturnNode;
                      	
                    }

                    }
                    break;
                case 5 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:1699:7: TK_0= 'INT' (TK_1= '(' NUMBERGen= NUMBER TK_2= ')' )? (TK_3= 'UNSIGNED' )? (TK_4= 'ZEROFILL' )?
                    {
                    TK_0=(Token)input.LT(1);
                    match(input,71,FOLLOW_71_in_data_type1264); if (failed) return retval;
                    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:1699:18: (TK_1= '(' NUMBERGen= NUMBER TK_2= ')' )?
                    int alt57=2;
                    int LA57_0 = input.LA(1);

                    if ( (LA57_0==38) ) {
                        alt57=1;
                    }
                    switch (alt57) {
                        case 1 :
                            // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:1699:19: TK_1= '(' NUMBERGen= NUMBER TK_2= ')'
                            {
                            TK_1=(Token)input.LT(1);
                            match(input,38,FOLLOW_38_in_data_type1269); if (failed) return retval;
                            NUMBERGen=(Token)input.LT(1);
                            match(input,NUMBER,FOLLOW_NUMBER_in_data_type1273); if (failed) return retval;
                            TK_2=(Token)input.LT(1);
                            match(input,39,FOLLOW_39_in_data_type1277); if (failed) return retval;

                            }
                            break;

                    }

                    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:1699:56: (TK_3= 'UNSIGNED' )?
                    int alt58=2;
                    int LA58_0 = input.LA(1);

                    if ( (LA58_0==67) ) {
                        alt58=1;
                    }
                    switch (alt58) {
                        case 1 :
                            // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:1699:57: TK_3= 'UNSIGNED'
                            {
                            TK_3=(Token)input.LT(1);
                            match(input,67,FOLLOW_67_in_data_type1284); if (failed) return retval;

                            }
                            break;

                    }

                    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:1699:75: (TK_4= 'ZEROFILL' )?
                    int alt59=2;
                    int LA59_0 = input.LA(1);

                    if ( (LA59_0==68) ) {
                        alt59=1;
                    }
                    switch (alt59) {
                        case 1 :
                            // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:1699:76: TK_4= 'ZEROFILL'
                            {
                            TK_4=(Token)input.LT(1);
                            match(input,68,FOLLOW_68_in_data_type1291); if (failed) return retval;

                            }
                            break;

                    }

                    if ( backtracking==0 ) {
                      
                      		// Create return CST Node
                      		Node data_typeReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                      		data_typeReturnNode.setKind("data_type");
                      	    // Create a Token CST Leaf	
                      	    if(TK_0 != null) {
                      			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      	 		TK_0Leaf.setKind("TOKEN");
                      	 		TK_0Leaf.setValue(TK_0.getText());
                      			TK_0Leaf.setPos(TK_0.getCharPositionInLine());
                      			TK_0Leaf.setLine(TK_0.getLine());
                      	 		data_typeReturnNode.getChildren().add(TK_0Leaf);
                      	 	}
                      	    // Create a Token CST Leaf	
                      	    if(TK_1 != null) {
                      			Leaf TK_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      	 		TK_1Leaf.setKind("TOKEN");
                      	 		TK_1Leaf.setValue(TK_1.getText());
                      			TK_1Leaf.setPos(TK_1.getCharPositionInLine());
                      			TK_1Leaf.setLine(TK_1.getLine());
                      	 		data_typeReturnNode.getChildren().add(TK_1Leaf);
                      	 	}
                      	    // Create a CST Leaf
                      		if(NUMBERGen != null) {
                      			Leaf NUMBERGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      			NUMBERGenLeaf.setKind("NUMBER");
                      			NUMBERGenLeaf.setValue(NUMBERGen.getText());
                      			NUMBERGenLeaf.setPos(NUMBERGen.getCharPositionInLine());
                      			NUMBERGenLeaf.setLine(NUMBERGen.getLine());
                      			data_typeReturnNode.getChildren().add(NUMBERGenLeaf);
                      		}
                      	    // Create a Token CST Leaf	
                      	    if(TK_2 != null) {
                      			Leaf TK_2Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      	 		TK_2Leaf.setKind("TOKEN");
                      	 		TK_2Leaf.setValue(TK_2.getText());
                      			TK_2Leaf.setPos(TK_2.getCharPositionInLine());
                      			TK_2Leaf.setLine(TK_2.getLine());
                      	 		data_typeReturnNode.getChildren().add(TK_2Leaf);
                      	 	}
                      	    // Create a Token CST Leaf	
                      	    if(TK_3 != null) {
                      			Leaf TK_3Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      	 		TK_3Leaf.setKind("TOKEN");
                      	 		TK_3Leaf.setValue(TK_3.getText());
                      			TK_3Leaf.setPos(TK_3.getCharPositionInLine());
                      			TK_3Leaf.setLine(TK_3.getLine());
                      	 		data_typeReturnNode.getChildren().add(TK_3Leaf);
                      	 	}
                      	    // Create a Token CST Leaf	
                      	    if(TK_4 != null) {
                      			Leaf TK_4Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      	 		TK_4Leaf.setKind("TOKEN");
                      	 		TK_4Leaf.setValue(TK_4.getText());
                      			TK_4Leaf.setPos(TK_4.getCharPositionInLine());
                      			TK_4Leaf.setLine(TK_4.getLine());
                      	 		data_typeReturnNode.getChildren().add(TK_4Leaf);
                      	 	}
                      		// Returns the Node with CST Leaves/Nodes
                      		retval.returnNode = data_typeReturnNode;
                      	
                    }

                    }
                    break;
                case 6 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:1761:7: TK_0= 'INTEGER' (TK_1= '(' NUMBERGen= NUMBER TK_2= ')' )? (TK_3= 'UNSIGNED' )? (TK_4= 'ZEROFILL' )?
                    {
                    TK_0=(Token)input.LT(1);
                    match(input,72,FOLLOW_72_in_data_type1307); if (failed) return retval;
                    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:1761:22: (TK_1= '(' NUMBERGen= NUMBER TK_2= ')' )?
                    int alt60=2;
                    int LA60_0 = input.LA(1);

                    if ( (LA60_0==38) ) {
                        alt60=1;
                    }
                    switch (alt60) {
                        case 1 :
                            // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:1761:23: TK_1= '(' NUMBERGen= NUMBER TK_2= ')'
                            {
                            TK_1=(Token)input.LT(1);
                            match(input,38,FOLLOW_38_in_data_type1312); if (failed) return retval;
                            NUMBERGen=(Token)input.LT(1);
                            match(input,NUMBER,FOLLOW_NUMBER_in_data_type1316); if (failed) return retval;
                            TK_2=(Token)input.LT(1);
                            match(input,39,FOLLOW_39_in_data_type1320); if (failed) return retval;

                            }
                            break;

                    }

                    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:1761:60: (TK_3= 'UNSIGNED' )?
                    int alt61=2;
                    int LA61_0 = input.LA(1);

                    if ( (LA61_0==67) ) {
                        alt61=1;
                    }
                    switch (alt61) {
                        case 1 :
                            // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:1761:61: TK_3= 'UNSIGNED'
                            {
                            TK_3=(Token)input.LT(1);
                            match(input,67,FOLLOW_67_in_data_type1327); if (failed) return retval;

                            }
                            break;

                    }

                    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:1761:79: (TK_4= 'ZEROFILL' )?
                    int alt62=2;
                    int LA62_0 = input.LA(1);

                    if ( (LA62_0==68) ) {
                        alt62=1;
                    }
                    switch (alt62) {
                        case 1 :
                            // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:1761:80: TK_4= 'ZEROFILL'
                            {
                            TK_4=(Token)input.LT(1);
                            match(input,68,FOLLOW_68_in_data_type1334); if (failed) return retval;

                            }
                            break;

                    }

                    if ( backtracking==0 ) {
                      
                      		// Create return CST Node
                      		Node data_typeReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                      		data_typeReturnNode.setKind("data_type");
                      	    // Create a Token CST Leaf	
                      	    if(TK_0 != null) {
                      			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      	 		TK_0Leaf.setKind("TOKEN");
                      	 		TK_0Leaf.setValue(TK_0.getText());
                      			TK_0Leaf.setPos(TK_0.getCharPositionInLine());
                      			TK_0Leaf.setLine(TK_0.getLine());
                      	 		data_typeReturnNode.getChildren().add(TK_0Leaf);
                      	 	}
                      	    // Create a Token CST Leaf	
                      	    if(TK_1 != null) {
                      			Leaf TK_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      	 		TK_1Leaf.setKind("TOKEN");
                      	 		TK_1Leaf.setValue(TK_1.getText());
                      			TK_1Leaf.setPos(TK_1.getCharPositionInLine());
                      			TK_1Leaf.setLine(TK_1.getLine());
                      	 		data_typeReturnNode.getChildren().add(TK_1Leaf);
                      	 	}
                      	    // Create a CST Leaf
                      		if(NUMBERGen != null) {
                      			Leaf NUMBERGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      			NUMBERGenLeaf.setKind("NUMBER");
                      			NUMBERGenLeaf.setValue(NUMBERGen.getText());
                      			NUMBERGenLeaf.setPos(NUMBERGen.getCharPositionInLine());
                      			NUMBERGenLeaf.setLine(NUMBERGen.getLine());
                      			data_typeReturnNode.getChildren().add(NUMBERGenLeaf);
                      		}
                      	    // Create a Token CST Leaf	
                      	    if(TK_2 != null) {
                      			Leaf TK_2Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      	 		TK_2Leaf.setKind("TOKEN");
                      	 		TK_2Leaf.setValue(TK_2.getText());
                      			TK_2Leaf.setPos(TK_2.getCharPositionInLine());
                      			TK_2Leaf.setLine(TK_2.getLine());
                      	 		data_typeReturnNode.getChildren().add(TK_2Leaf);
                      	 	}
                      	    // Create a Token CST Leaf	
                      	    if(TK_3 != null) {
                      			Leaf TK_3Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      	 		TK_3Leaf.setKind("TOKEN");
                      	 		TK_3Leaf.setValue(TK_3.getText());
                      			TK_3Leaf.setPos(TK_3.getCharPositionInLine());
                      			TK_3Leaf.setLine(TK_3.getLine());
                      	 		data_typeReturnNode.getChildren().add(TK_3Leaf);
                      	 	}
                      	    // Create a Token CST Leaf	
                      	    if(TK_4 != null) {
                      			Leaf TK_4Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      	 		TK_4Leaf.setKind("TOKEN");
                      	 		TK_4Leaf.setValue(TK_4.getText());
                      			TK_4Leaf.setPos(TK_4.getCharPositionInLine());
                      			TK_4Leaf.setLine(TK_4.getLine());
                      	 		data_typeReturnNode.getChildren().add(TK_4Leaf);
                      	 	}
                      		// Returns the Node with CST Leaves/Nodes
                      		retval.returnNode = data_typeReturnNode;
                      	
                    }

                    }
                    break;
                case 7 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:1823:7: TK_0= 'BIGINT' (TK_1= '(' NUMBERGen= NUMBER TK_2= ')' )? (TK_3= 'UNSIGNED' )? (TK_4= 'ZEROFILL' )?
                    {
                    TK_0=(Token)input.LT(1);
                    match(input,73,FOLLOW_73_in_data_type1350); if (failed) return retval;
                    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:1823:21: (TK_1= '(' NUMBERGen= NUMBER TK_2= ')' )?
                    int alt63=2;
                    int LA63_0 = input.LA(1);

                    if ( (LA63_0==38) ) {
                        alt63=1;
                    }
                    switch (alt63) {
                        case 1 :
                            // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:1823:22: TK_1= '(' NUMBERGen= NUMBER TK_2= ')'
                            {
                            TK_1=(Token)input.LT(1);
                            match(input,38,FOLLOW_38_in_data_type1355); if (failed) return retval;
                            NUMBERGen=(Token)input.LT(1);
                            match(input,NUMBER,FOLLOW_NUMBER_in_data_type1359); if (failed) return retval;
                            TK_2=(Token)input.LT(1);
                            match(input,39,FOLLOW_39_in_data_type1363); if (failed) return retval;

                            }
                            break;

                    }

                    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:1823:59: (TK_3= 'UNSIGNED' )?
                    int alt64=2;
                    int LA64_0 = input.LA(1);

                    if ( (LA64_0==67) ) {
                        alt64=1;
                    }
                    switch (alt64) {
                        case 1 :
                            // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:1823:60: TK_3= 'UNSIGNED'
                            {
                            TK_3=(Token)input.LT(1);
                            match(input,67,FOLLOW_67_in_data_type1370); if (failed) return retval;

                            }
                            break;

                    }

                    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:1823:78: (TK_4= 'ZEROFILL' )?
                    int alt65=2;
                    int LA65_0 = input.LA(1);

                    if ( (LA65_0==68) ) {
                        alt65=1;
                    }
                    switch (alt65) {
                        case 1 :
                            // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:1823:79: TK_4= 'ZEROFILL'
                            {
                            TK_4=(Token)input.LT(1);
                            match(input,68,FOLLOW_68_in_data_type1377); if (failed) return retval;

                            }
                            break;

                    }

                    if ( backtracking==0 ) {
                      
                      		// Create return CST Node
                      		Node data_typeReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                      		data_typeReturnNode.setKind("data_type");
                      	    // Create a Token CST Leaf	
                      	    if(TK_0 != null) {
                      			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      	 		TK_0Leaf.setKind("TOKEN");
                      	 		TK_0Leaf.setValue(TK_0.getText());
                      			TK_0Leaf.setPos(TK_0.getCharPositionInLine());
                      			TK_0Leaf.setLine(TK_0.getLine());
                      	 		data_typeReturnNode.getChildren().add(TK_0Leaf);
                      	 	}
                      	    // Create a Token CST Leaf	
                      	    if(TK_1 != null) {
                      			Leaf TK_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      	 		TK_1Leaf.setKind("TOKEN");
                      	 		TK_1Leaf.setValue(TK_1.getText());
                      			TK_1Leaf.setPos(TK_1.getCharPositionInLine());
                      			TK_1Leaf.setLine(TK_1.getLine());
                      	 		data_typeReturnNode.getChildren().add(TK_1Leaf);
                      	 	}
                      	    // Create a CST Leaf
                      		if(NUMBERGen != null) {
                      			Leaf NUMBERGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      			NUMBERGenLeaf.setKind("NUMBER");
                      			NUMBERGenLeaf.setValue(NUMBERGen.getText());
                      			NUMBERGenLeaf.setPos(NUMBERGen.getCharPositionInLine());
                      			NUMBERGenLeaf.setLine(NUMBERGen.getLine());
                      			data_typeReturnNode.getChildren().add(NUMBERGenLeaf);
                      		}
                      	    // Create a Token CST Leaf	
                      	    if(TK_2 != null) {
                      			Leaf TK_2Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      	 		TK_2Leaf.setKind("TOKEN");
                      	 		TK_2Leaf.setValue(TK_2.getText());
                      			TK_2Leaf.setPos(TK_2.getCharPositionInLine());
                      			TK_2Leaf.setLine(TK_2.getLine());
                      	 		data_typeReturnNode.getChildren().add(TK_2Leaf);
                      	 	}
                      	    // Create a Token CST Leaf	
                      	    if(TK_3 != null) {
                      			Leaf TK_3Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      	 		TK_3Leaf.setKind("TOKEN");
                      	 		TK_3Leaf.setValue(TK_3.getText());
                      			TK_3Leaf.setPos(TK_3.getCharPositionInLine());
                      			TK_3Leaf.setLine(TK_3.getLine());
                      	 		data_typeReturnNode.getChildren().add(TK_3Leaf);
                      	 	}
                      	    // Create a Token CST Leaf	
                      	    if(TK_4 != null) {
                      			Leaf TK_4Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      	 		TK_4Leaf.setKind("TOKEN");
                      	 		TK_4Leaf.setValue(TK_4.getText());
                      			TK_4Leaf.setPos(TK_4.getCharPositionInLine());
                      			TK_4Leaf.setLine(TK_4.getLine());
                      	 		data_typeReturnNode.getChildren().add(TK_4Leaf);
                      	 	}
                      		// Returns the Node with CST Leaves/Nodes
                      		retval.returnNode = data_typeReturnNode;
                      	
                    }

                    }
                    break;
                case 8 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:1885:7: TK_0= 'REAL' (TK_1= '(' NUMBERGen= NUMBER TK_2= ')' )? (TK_3= 'UNSIGNED' )? (TK_4= 'ZEROFILL' )?
                    {
                    TK_0=(Token)input.LT(1);
                    match(input,74,FOLLOW_74_in_data_type1393); if (failed) return retval;
                    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:1885:19: (TK_1= '(' NUMBERGen= NUMBER TK_2= ')' )?
                    int alt66=2;
                    int LA66_0 = input.LA(1);

                    if ( (LA66_0==38) ) {
                        alt66=1;
                    }
                    switch (alt66) {
                        case 1 :
                            // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:1885:20: TK_1= '(' NUMBERGen= NUMBER TK_2= ')'
                            {
                            TK_1=(Token)input.LT(1);
                            match(input,38,FOLLOW_38_in_data_type1398); if (failed) return retval;
                            NUMBERGen=(Token)input.LT(1);
                            match(input,NUMBER,FOLLOW_NUMBER_in_data_type1402); if (failed) return retval;
                            TK_2=(Token)input.LT(1);
                            match(input,39,FOLLOW_39_in_data_type1406); if (failed) return retval;

                            }
                            break;

                    }

                    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:1885:57: (TK_3= 'UNSIGNED' )?
                    int alt67=2;
                    int LA67_0 = input.LA(1);

                    if ( (LA67_0==67) ) {
                        alt67=1;
                    }
                    switch (alt67) {
                        case 1 :
                            // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:1885:58: TK_3= 'UNSIGNED'
                            {
                            TK_3=(Token)input.LT(1);
                            match(input,67,FOLLOW_67_in_data_type1413); if (failed) return retval;

                            }
                            break;

                    }

                    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:1885:76: (TK_4= 'ZEROFILL' )?
                    int alt68=2;
                    int LA68_0 = input.LA(1);

                    if ( (LA68_0==68) ) {
                        alt68=1;
                    }
                    switch (alt68) {
                        case 1 :
                            // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:1885:77: TK_4= 'ZEROFILL'
                            {
                            TK_4=(Token)input.LT(1);
                            match(input,68,FOLLOW_68_in_data_type1420); if (failed) return retval;

                            }
                            break;

                    }

                    if ( backtracking==0 ) {
                      
                      		// Create return CST Node
                      		Node data_typeReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                      		data_typeReturnNode.setKind("data_type");
                      	    // Create a Token CST Leaf	
                      	    if(TK_0 != null) {
                      			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      	 		TK_0Leaf.setKind("TOKEN");
                      	 		TK_0Leaf.setValue(TK_0.getText());
                      			TK_0Leaf.setPos(TK_0.getCharPositionInLine());
                      			TK_0Leaf.setLine(TK_0.getLine());
                      	 		data_typeReturnNode.getChildren().add(TK_0Leaf);
                      	 	}
                      	    // Create a Token CST Leaf	
                      	    if(TK_1 != null) {
                      			Leaf TK_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      	 		TK_1Leaf.setKind("TOKEN");
                      	 		TK_1Leaf.setValue(TK_1.getText());
                      			TK_1Leaf.setPos(TK_1.getCharPositionInLine());
                      			TK_1Leaf.setLine(TK_1.getLine());
                      	 		data_typeReturnNode.getChildren().add(TK_1Leaf);
                      	 	}
                      	    // Create a CST Leaf
                      		if(NUMBERGen != null) {
                      			Leaf NUMBERGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      			NUMBERGenLeaf.setKind("NUMBER");
                      			NUMBERGenLeaf.setValue(NUMBERGen.getText());
                      			NUMBERGenLeaf.setPos(NUMBERGen.getCharPositionInLine());
                      			NUMBERGenLeaf.setLine(NUMBERGen.getLine());
                      			data_typeReturnNode.getChildren().add(NUMBERGenLeaf);
                      		}
                      	    // Create a Token CST Leaf	
                      	    if(TK_2 != null) {
                      			Leaf TK_2Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      	 		TK_2Leaf.setKind("TOKEN");
                      	 		TK_2Leaf.setValue(TK_2.getText());
                      			TK_2Leaf.setPos(TK_2.getCharPositionInLine());
                      			TK_2Leaf.setLine(TK_2.getLine());
                      	 		data_typeReturnNode.getChildren().add(TK_2Leaf);
                      	 	}
                      	    // Create a Token CST Leaf	
                      	    if(TK_3 != null) {
                      			Leaf TK_3Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      	 		TK_3Leaf.setKind("TOKEN");
                      	 		TK_3Leaf.setValue(TK_3.getText());
                      			TK_3Leaf.setPos(TK_3.getCharPositionInLine());
                      			TK_3Leaf.setLine(TK_3.getLine());
                      	 		data_typeReturnNode.getChildren().add(TK_3Leaf);
                      	 	}
                      	    // Create a Token CST Leaf	
                      	    if(TK_4 != null) {
                      			Leaf TK_4Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      	 		TK_4Leaf.setKind("TOKEN");
                      	 		TK_4Leaf.setValue(TK_4.getText());
                      			TK_4Leaf.setPos(TK_4.getCharPositionInLine());
                      			TK_4Leaf.setLine(TK_4.getLine());
                      	 		data_typeReturnNode.getChildren().add(TK_4Leaf);
                      	 	}
                      		// Returns the Node with CST Leaves/Nodes
                      		retval.returnNode = data_typeReturnNode;
                      	
                    }

                    }
                    break;
                case 9 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:1947:6: TK_0= 'DOUBLE' (TK_1= '(' NUMBERGen= NUMBER TK_2= ')' )? (TK_3= 'UNSIGNED' )? (TK_4= 'ZEROFILL' )?
                    {
                    TK_0=(Token)input.LT(1);
                    match(input,75,FOLLOW_75_in_data_type1435); if (failed) return retval;
                    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:1947:20: (TK_1= '(' NUMBERGen= NUMBER TK_2= ')' )?
                    int alt69=2;
                    int LA69_0 = input.LA(1);

                    if ( (LA69_0==38) ) {
                        alt69=1;
                    }
                    switch (alt69) {
                        case 1 :
                            // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:1947:21: TK_1= '(' NUMBERGen= NUMBER TK_2= ')'
                            {
                            TK_1=(Token)input.LT(1);
                            match(input,38,FOLLOW_38_in_data_type1440); if (failed) return retval;
                            NUMBERGen=(Token)input.LT(1);
                            match(input,NUMBER,FOLLOW_NUMBER_in_data_type1444); if (failed) return retval;
                            TK_2=(Token)input.LT(1);
                            match(input,39,FOLLOW_39_in_data_type1448); if (failed) return retval;

                            }
                            break;

                    }

                    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:1947:58: (TK_3= 'UNSIGNED' )?
                    int alt70=2;
                    int LA70_0 = input.LA(1);

                    if ( (LA70_0==67) ) {
                        alt70=1;
                    }
                    switch (alt70) {
                        case 1 :
                            // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:1947:59: TK_3= 'UNSIGNED'
                            {
                            TK_3=(Token)input.LT(1);
                            match(input,67,FOLLOW_67_in_data_type1455); if (failed) return retval;

                            }
                            break;

                    }

                    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:1947:77: (TK_4= 'ZEROFILL' )?
                    int alt71=2;
                    int LA71_0 = input.LA(1);

                    if ( (LA71_0==68) ) {
                        alt71=1;
                    }
                    switch (alt71) {
                        case 1 :
                            // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:1947:78: TK_4= 'ZEROFILL'
                            {
                            TK_4=(Token)input.LT(1);
                            match(input,68,FOLLOW_68_in_data_type1462); if (failed) return retval;

                            }
                            break;

                    }

                    if ( backtracking==0 ) {
                      
                      		// Create return CST Node
                      		Node data_typeReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                      		data_typeReturnNode.setKind("data_type");
                      	    // Create a Token CST Leaf	
                      	    if(TK_0 != null) {
                      			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      	 		TK_0Leaf.setKind("TOKEN");
                      	 		TK_0Leaf.setValue(TK_0.getText());
                      			TK_0Leaf.setPos(TK_0.getCharPositionInLine());
                      			TK_0Leaf.setLine(TK_0.getLine());
                      	 		data_typeReturnNode.getChildren().add(TK_0Leaf);
                      	 	}
                      	    // Create a Token CST Leaf	
                      	    if(TK_1 != null) {
                      			Leaf TK_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      	 		TK_1Leaf.setKind("TOKEN");
                      	 		TK_1Leaf.setValue(TK_1.getText());
                      			TK_1Leaf.setPos(TK_1.getCharPositionInLine());
                      			TK_1Leaf.setLine(TK_1.getLine());
                      	 		data_typeReturnNode.getChildren().add(TK_1Leaf);
                      	 	}
                      	    // Create a CST Leaf
                      		if(NUMBERGen != null) {
                      			Leaf NUMBERGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      			NUMBERGenLeaf.setKind("NUMBER");
                      			NUMBERGenLeaf.setValue(NUMBERGen.getText());
                      			NUMBERGenLeaf.setPos(NUMBERGen.getCharPositionInLine());
                      			NUMBERGenLeaf.setLine(NUMBERGen.getLine());
                      			data_typeReturnNode.getChildren().add(NUMBERGenLeaf);
                      		}
                      	    // Create a Token CST Leaf	
                      	    if(TK_2 != null) {
                      			Leaf TK_2Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      	 		TK_2Leaf.setKind("TOKEN");
                      	 		TK_2Leaf.setValue(TK_2.getText());
                      			TK_2Leaf.setPos(TK_2.getCharPositionInLine());
                      			TK_2Leaf.setLine(TK_2.getLine());
                      	 		data_typeReturnNode.getChildren().add(TK_2Leaf);
                      	 	}
                      	    // Create a Token CST Leaf	
                      	    if(TK_3 != null) {
                      			Leaf TK_3Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      	 		TK_3Leaf.setKind("TOKEN");
                      	 		TK_3Leaf.setValue(TK_3.getText());
                      			TK_3Leaf.setPos(TK_3.getCharPositionInLine());
                      			TK_3Leaf.setLine(TK_3.getLine());
                      	 		data_typeReturnNode.getChildren().add(TK_3Leaf);
                      	 	}
                      	    // Create a Token CST Leaf	
                      	    if(TK_4 != null) {
                      			Leaf TK_4Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      	 		TK_4Leaf.setKind("TOKEN");
                      	 		TK_4Leaf.setValue(TK_4.getText());
                      			TK_4Leaf.setPos(TK_4.getCharPositionInLine());
                      			TK_4Leaf.setLine(TK_4.getLine());
                      	 		data_typeReturnNode.getChildren().add(TK_4Leaf);
                      	 	}
                      		// Returns the Node with CST Leaves/Nodes
                      		retval.returnNode = data_typeReturnNode;
                      	
                    }

                    }
                    break;
                case 10 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:2009:6: TK_0= 'FLOAT' (TK_1= '(' NUMBERGen= NUMBER TK_2= ')' )? (TK_3= 'UNSIGNED' )? (TK_4= 'ZEROFILL' )?
                    {
                    TK_0=(Token)input.LT(1);
                    match(input,76,FOLLOW_76_in_data_type1477); if (failed) return retval;
                    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:2009:19: (TK_1= '(' NUMBERGen= NUMBER TK_2= ')' )?
                    int alt72=2;
                    int LA72_0 = input.LA(1);

                    if ( (LA72_0==38) ) {
                        alt72=1;
                    }
                    switch (alt72) {
                        case 1 :
                            // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:2009:20: TK_1= '(' NUMBERGen= NUMBER TK_2= ')'
                            {
                            TK_1=(Token)input.LT(1);
                            match(input,38,FOLLOW_38_in_data_type1482); if (failed) return retval;
                            NUMBERGen=(Token)input.LT(1);
                            match(input,NUMBER,FOLLOW_NUMBER_in_data_type1486); if (failed) return retval;
                            TK_2=(Token)input.LT(1);
                            match(input,39,FOLLOW_39_in_data_type1490); if (failed) return retval;

                            }
                            break;

                    }

                    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:2009:57: (TK_3= 'UNSIGNED' )?
                    int alt73=2;
                    int LA73_0 = input.LA(1);

                    if ( (LA73_0==67) ) {
                        alt73=1;
                    }
                    switch (alt73) {
                        case 1 :
                            // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:2009:58: TK_3= 'UNSIGNED'
                            {
                            TK_3=(Token)input.LT(1);
                            match(input,67,FOLLOW_67_in_data_type1497); if (failed) return retval;

                            }
                            break;

                    }

                    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:2009:76: (TK_4= 'ZEROFILL' )?
                    int alt74=2;
                    int LA74_0 = input.LA(1);

                    if ( (LA74_0==68) ) {
                        alt74=1;
                    }
                    switch (alt74) {
                        case 1 :
                            // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:2009:77: TK_4= 'ZEROFILL'
                            {
                            TK_4=(Token)input.LT(1);
                            match(input,68,FOLLOW_68_in_data_type1504); if (failed) return retval;

                            }
                            break;

                    }

                    if ( backtracking==0 ) {
                      
                      		// Create return CST Node
                      		Node data_typeReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                      		data_typeReturnNode.setKind("data_type");
                      	    // Create a Token CST Leaf	
                      	    if(TK_0 != null) {
                      			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      	 		TK_0Leaf.setKind("TOKEN");
                      	 		TK_0Leaf.setValue(TK_0.getText());
                      			TK_0Leaf.setPos(TK_0.getCharPositionInLine());
                      			TK_0Leaf.setLine(TK_0.getLine());
                      	 		data_typeReturnNode.getChildren().add(TK_0Leaf);
                      	 	}
                      	    // Create a Token CST Leaf	
                      	    if(TK_1 != null) {
                      			Leaf TK_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      	 		TK_1Leaf.setKind("TOKEN");
                      	 		TK_1Leaf.setValue(TK_1.getText());
                      			TK_1Leaf.setPos(TK_1.getCharPositionInLine());
                      			TK_1Leaf.setLine(TK_1.getLine());
                      	 		data_typeReturnNode.getChildren().add(TK_1Leaf);
                      	 	}
                      	    // Create a CST Leaf
                      		if(NUMBERGen != null) {
                      			Leaf NUMBERGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      			NUMBERGenLeaf.setKind("NUMBER");
                      			NUMBERGenLeaf.setValue(NUMBERGen.getText());
                      			NUMBERGenLeaf.setPos(NUMBERGen.getCharPositionInLine());
                      			NUMBERGenLeaf.setLine(NUMBERGen.getLine());
                      			data_typeReturnNode.getChildren().add(NUMBERGenLeaf);
                      		}
                      	    // Create a Token CST Leaf	
                      	    if(TK_2 != null) {
                      			Leaf TK_2Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      	 		TK_2Leaf.setKind("TOKEN");
                      	 		TK_2Leaf.setValue(TK_2.getText());
                      			TK_2Leaf.setPos(TK_2.getCharPositionInLine());
                      			TK_2Leaf.setLine(TK_2.getLine());
                      	 		data_typeReturnNode.getChildren().add(TK_2Leaf);
                      	 	}
                      	    // Create a Token CST Leaf	
                      	    if(TK_3 != null) {
                      			Leaf TK_3Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      	 		TK_3Leaf.setKind("TOKEN");
                      	 		TK_3Leaf.setValue(TK_3.getText());
                      			TK_3Leaf.setPos(TK_3.getCharPositionInLine());
                      			TK_3Leaf.setLine(TK_3.getLine());
                      	 		data_typeReturnNode.getChildren().add(TK_3Leaf);
                      	 	}
                      	    // Create a Token CST Leaf	
                      	    if(TK_4 != null) {
                      			Leaf TK_4Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      	 		TK_4Leaf.setKind("TOKEN");
                      	 		TK_4Leaf.setValue(TK_4.getText());
                      			TK_4Leaf.setPos(TK_4.getCharPositionInLine());
                      			TK_4Leaf.setLine(TK_4.getLine());
                      	 		data_typeReturnNode.getChildren().add(TK_4Leaf);
                      	 	}
                      		// Returns the Node with CST Leaves/Nodes
                      		retval.returnNode = data_typeReturnNode;
                      	
                    }

                    }
                    break;
                case 11 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:2071:7: TK_0= 'DECIMAL' (TK_1= '(' NUMBERGen= NUMBER (TK_2= ',' NUMBERGen_1= NUMBER )? TK_3= ')' )? (TK_4= 'UNSIGNED' )? (TK_5= 'ZEROFILL' )?
                    {
                    TK_0=(Token)input.LT(1);
                    match(input,77,FOLLOW_77_in_data_type1520); if (failed) return retval;
                    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:2071:22: (TK_1= '(' NUMBERGen= NUMBER (TK_2= ',' NUMBERGen_1= NUMBER )? TK_3= ')' )?
                    int alt76=2;
                    int LA76_0 = input.LA(1);

                    if ( (LA76_0==38) ) {
                        alt76=1;
                    }
                    switch (alt76) {
                        case 1 :
                            // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:2071:23: TK_1= '(' NUMBERGen= NUMBER (TK_2= ',' NUMBERGen_1= NUMBER )? TK_3= ')'
                            {
                            TK_1=(Token)input.LT(1);
                            match(input,38,FOLLOW_38_in_data_type1525); if (failed) return retval;
                            NUMBERGen=(Token)input.LT(1);
                            match(input,NUMBER,FOLLOW_NUMBER_in_data_type1529); if (failed) return retval;
                            // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:2071:49: (TK_2= ',' NUMBERGen_1= NUMBER )?
                            int alt75=2;
                            int LA75_0 = input.LA(1);

                            if ( (LA75_0==20) ) {
                                alt75=1;
                            }
                            switch (alt75) {
                                case 1 :
                                    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:2071:50: TK_2= ',' NUMBERGen_1= NUMBER
                                    {
                                    TK_2=(Token)input.LT(1);
                                    match(input,20,FOLLOW_20_in_data_type1534); if (failed) return retval;
                                    NUMBERGen_1=(Token)input.LT(1);
                                    match(input,NUMBER,FOLLOW_NUMBER_in_data_type1538); if (failed) return retval;

                                    }
                                    break;

                            }

                            TK_3=(Token)input.LT(1);
                            match(input,39,FOLLOW_39_in_data_type1544); if (failed) return retval;

                            }
                            break;

                    }

                    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:2071:91: (TK_4= 'UNSIGNED' )?
                    int alt77=2;
                    int LA77_0 = input.LA(1);

                    if ( (LA77_0==67) ) {
                        alt77=1;
                    }
                    switch (alt77) {
                        case 1 :
                            // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:2071:92: TK_4= 'UNSIGNED'
                            {
                            TK_4=(Token)input.LT(1);
                            match(input,67,FOLLOW_67_in_data_type1551); if (failed) return retval;

                            }
                            break;

                    }

                    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:2071:110: (TK_5= 'ZEROFILL' )?
                    int alt78=2;
                    int LA78_0 = input.LA(1);

                    if ( (LA78_0==68) ) {
                        alt78=1;
                    }
                    switch (alt78) {
                        case 1 :
                            // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:2071:111: TK_5= 'ZEROFILL'
                            {
                            TK_5=(Token)input.LT(1);
                            match(input,68,FOLLOW_68_in_data_type1558); if (failed) return retval;

                            }
                            break;

                    }

                    if ( backtracking==0 ) {
                      
                      		// Create return CST Node
                      		Node data_typeReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                      		data_typeReturnNode.setKind("data_type");
                      	    // Create a Token CST Leaf	
                      	    if(TK_0 != null) {
                      			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      	 		TK_0Leaf.setKind("TOKEN");
                      	 		TK_0Leaf.setValue(TK_0.getText());
                      			TK_0Leaf.setPos(TK_0.getCharPositionInLine());
                      			TK_0Leaf.setLine(TK_0.getLine());
                      	 		data_typeReturnNode.getChildren().add(TK_0Leaf);
                      	 	}
                      	    // Create a Token CST Leaf	
                      	    if(TK_1 != null) {
                      			Leaf TK_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      	 		TK_1Leaf.setKind("TOKEN");
                      	 		TK_1Leaf.setValue(TK_1.getText());
                      			TK_1Leaf.setPos(TK_1.getCharPositionInLine());
                      			TK_1Leaf.setLine(TK_1.getLine());
                      	 		data_typeReturnNode.getChildren().add(TK_1Leaf);
                      	 	}
                      	    // Create a CST Leaf
                      		if(NUMBERGen != null) {
                      			Leaf NUMBERGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      			NUMBERGenLeaf.setKind("NUMBER");
                      			NUMBERGenLeaf.setValue(NUMBERGen.getText());
                      			NUMBERGenLeaf.setPos(NUMBERGen.getCharPositionInLine());
                      			NUMBERGenLeaf.setLine(NUMBERGen.getLine());
                      			data_typeReturnNode.getChildren().add(NUMBERGenLeaf);
                      		}
                      	    // Create a Token CST Leaf	
                      	    if(TK_2 != null) {
                      			Leaf TK_2Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      	 		TK_2Leaf.setKind("TOKEN");
                      	 		TK_2Leaf.setValue(TK_2.getText());
                      			TK_2Leaf.setPos(TK_2.getCharPositionInLine());
                      			TK_2Leaf.setLine(TK_2.getLine());
                      	 		data_typeReturnNode.getChildren().add(TK_2Leaf);
                      	 	}
                      	    // Create a CST Leaf
                      		if(NUMBERGen_1 != null) {
                      			Leaf NUMBERGen_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      			NUMBERGen_1Leaf.setKind("NUMBER");
                      			NUMBERGen_1Leaf.setValue(NUMBERGen_1.getText());
                      			NUMBERGen_1Leaf.setPos(NUMBERGen_1.getCharPositionInLine());
                      			NUMBERGen_1Leaf.setLine(NUMBERGen_1.getLine());
                      			data_typeReturnNode.getChildren().add(NUMBERGen_1Leaf);
                      		}
                      	    // Create a Token CST Leaf	
                      	    if(TK_3 != null) {
                      			Leaf TK_3Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      	 		TK_3Leaf.setKind("TOKEN");
                      	 		TK_3Leaf.setValue(TK_3.getText());
                      			TK_3Leaf.setPos(TK_3.getCharPositionInLine());
                      			TK_3Leaf.setLine(TK_3.getLine());
                      	 		data_typeReturnNode.getChildren().add(TK_3Leaf);
                      	 	}
                      	    // Create a Token CST Leaf	
                      	    if(TK_4 != null) {
                      			Leaf TK_4Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      	 		TK_4Leaf.setKind("TOKEN");
                      	 		TK_4Leaf.setValue(TK_4.getText());
                      			TK_4Leaf.setPos(TK_4.getCharPositionInLine());
                      			TK_4Leaf.setLine(TK_4.getLine());
                      	 		data_typeReturnNode.getChildren().add(TK_4Leaf);
                      	 	}
                      	    // Create a Token CST Leaf	
                      	    if(TK_5 != null) {
                      			Leaf TK_5Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      	 		TK_5Leaf.setKind("TOKEN");
                      	 		TK_5Leaf.setValue(TK_5.getText());
                      			TK_5Leaf.setPos(TK_5.getCharPositionInLine());
                      			TK_5Leaf.setLine(TK_5.getLine());
                      	 		data_typeReturnNode.getChildren().add(TK_5Leaf);
                      	 	}
                      		// Returns the Node with CST Leaves/Nodes
                      		retval.returnNode = data_typeReturnNode;
                      	
                    }

                    }
                    break;
                case 12 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:2151:7: TK_0= 'NUMERIC' (TK_1= '(' NUMBERGen= NUMBER (TK_2= ',' NUMBERGen_1= NUMBER )? TK_3= ')' )? (TK_4= 'UNSIGNED' )? (TK_5= 'ZEROFILL' )?
                    {
                    TK_0=(Token)input.LT(1);
                    match(input,78,FOLLOW_78_in_data_type1574); if (failed) return retval;
                    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:2151:22: (TK_1= '(' NUMBERGen= NUMBER (TK_2= ',' NUMBERGen_1= NUMBER )? TK_3= ')' )?
                    int alt80=2;
                    int LA80_0 = input.LA(1);

                    if ( (LA80_0==38) ) {
                        alt80=1;
                    }
                    switch (alt80) {
                        case 1 :
                            // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:2151:23: TK_1= '(' NUMBERGen= NUMBER (TK_2= ',' NUMBERGen_1= NUMBER )? TK_3= ')'
                            {
                            TK_1=(Token)input.LT(1);
                            match(input,38,FOLLOW_38_in_data_type1579); if (failed) return retval;
                            NUMBERGen=(Token)input.LT(1);
                            match(input,NUMBER,FOLLOW_NUMBER_in_data_type1583); if (failed) return retval;
                            // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:2151:49: (TK_2= ',' NUMBERGen_1= NUMBER )?
                            int alt79=2;
                            int LA79_0 = input.LA(1);

                            if ( (LA79_0==20) ) {
                                alt79=1;
                            }
                            switch (alt79) {
                                case 1 :
                                    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:2151:50: TK_2= ',' NUMBERGen_1= NUMBER
                                    {
                                    TK_2=(Token)input.LT(1);
                                    match(input,20,FOLLOW_20_in_data_type1588); if (failed) return retval;
                                    NUMBERGen_1=(Token)input.LT(1);
                                    match(input,NUMBER,FOLLOW_NUMBER_in_data_type1592); if (failed) return retval;

                                    }
                                    break;

                            }

                            TK_3=(Token)input.LT(1);
                            match(input,39,FOLLOW_39_in_data_type1597); if (failed) return retval;

                            }
                            break;

                    }

                    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:2151:90: (TK_4= 'UNSIGNED' )?
                    int alt81=2;
                    int LA81_0 = input.LA(1);

                    if ( (LA81_0==67) ) {
                        alt81=1;
                    }
                    switch (alt81) {
                        case 1 :
                            // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:2151:91: TK_4= 'UNSIGNED'
                            {
                            TK_4=(Token)input.LT(1);
                            match(input,67,FOLLOW_67_in_data_type1604); if (failed) return retval;

                            }
                            break;

                    }

                    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:2151:109: (TK_5= 'ZEROFILL' )?
                    int alt82=2;
                    int LA82_0 = input.LA(1);

                    if ( (LA82_0==68) ) {
                        alt82=1;
                    }
                    switch (alt82) {
                        case 1 :
                            // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:2151:110: TK_5= 'ZEROFILL'
                            {
                            TK_5=(Token)input.LT(1);
                            match(input,68,FOLLOW_68_in_data_type1611); if (failed) return retval;

                            }
                            break;

                    }

                    if ( backtracking==0 ) {
                      
                      		// Create return CST Node
                      		Node data_typeReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                      		data_typeReturnNode.setKind("data_type");
                      	    // Create a Token CST Leaf	
                      	    if(TK_0 != null) {
                      			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      	 		TK_0Leaf.setKind("TOKEN");
                      	 		TK_0Leaf.setValue(TK_0.getText());
                      			TK_0Leaf.setPos(TK_0.getCharPositionInLine());
                      			TK_0Leaf.setLine(TK_0.getLine());
                      	 		data_typeReturnNode.getChildren().add(TK_0Leaf);
                      	 	}
                      	    // Create a Token CST Leaf	
                      	    if(TK_1 != null) {
                      			Leaf TK_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      	 		TK_1Leaf.setKind("TOKEN");
                      	 		TK_1Leaf.setValue(TK_1.getText());
                      			TK_1Leaf.setPos(TK_1.getCharPositionInLine());
                      			TK_1Leaf.setLine(TK_1.getLine());
                      	 		data_typeReturnNode.getChildren().add(TK_1Leaf);
                      	 	}
                      	    // Create a CST Leaf
                      		if(NUMBERGen != null) {
                      			Leaf NUMBERGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      			NUMBERGenLeaf.setKind("NUMBER");
                      			NUMBERGenLeaf.setValue(NUMBERGen.getText());
                      			NUMBERGenLeaf.setPos(NUMBERGen.getCharPositionInLine());
                      			NUMBERGenLeaf.setLine(NUMBERGen.getLine());
                      			data_typeReturnNode.getChildren().add(NUMBERGenLeaf);
                      		}
                      	    // Create a Token CST Leaf	
                      	    if(TK_2 != null) {
                      			Leaf TK_2Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      	 		TK_2Leaf.setKind("TOKEN");
                      	 		TK_2Leaf.setValue(TK_2.getText());
                      			TK_2Leaf.setPos(TK_2.getCharPositionInLine());
                      			TK_2Leaf.setLine(TK_2.getLine());
                      	 		data_typeReturnNode.getChildren().add(TK_2Leaf);
                      	 	}
                      	    // Create a CST Leaf
                      		if(NUMBERGen_1 != null) {
                      			Leaf NUMBERGen_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      			NUMBERGen_1Leaf.setKind("NUMBER");
                      			NUMBERGen_1Leaf.setValue(NUMBERGen_1.getText());
                      			NUMBERGen_1Leaf.setPos(NUMBERGen_1.getCharPositionInLine());
                      			NUMBERGen_1Leaf.setLine(NUMBERGen_1.getLine());
                      			data_typeReturnNode.getChildren().add(NUMBERGen_1Leaf);
                      		}
                      	    // Create a Token CST Leaf	
                      	    if(TK_3 != null) {
                      			Leaf TK_3Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      	 		TK_3Leaf.setKind("TOKEN");
                      	 		TK_3Leaf.setValue(TK_3.getText());
                      			TK_3Leaf.setPos(TK_3.getCharPositionInLine());
                      			TK_3Leaf.setLine(TK_3.getLine());
                      	 		data_typeReturnNode.getChildren().add(TK_3Leaf);
                      	 	}
                      	    // Create a Token CST Leaf	
                      	    if(TK_4 != null) {
                      			Leaf TK_4Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      	 		TK_4Leaf.setKind("TOKEN");
                      	 		TK_4Leaf.setValue(TK_4.getText());
                      			TK_4Leaf.setPos(TK_4.getCharPositionInLine());
                      			TK_4Leaf.setLine(TK_4.getLine());
                      	 		data_typeReturnNode.getChildren().add(TK_4Leaf);
                      	 	}
                      	    // Create a Token CST Leaf	
                      	    if(TK_5 != null) {
                      			Leaf TK_5Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      	 		TK_5Leaf.setKind("TOKEN");
                      	 		TK_5Leaf.setValue(TK_5.getText());
                      			TK_5Leaf.setPos(TK_5.getCharPositionInLine());
                      			TK_5Leaf.setLine(TK_5.getLine());
                      	 		data_typeReturnNode.getChildren().add(TK_5Leaf);
                      	 	}
                      		// Returns the Node with CST Leaves/Nodes
                      		retval.returnNode = data_typeReturnNode;
                      	
                    }

                    }
                    break;
                case 13 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:2231:7: TK_0= 'DATE'
                    {
                    TK_0=(Token)input.LT(1);
                    match(input,79,FOLLOW_79_in_data_type1627); if (failed) return retval;
                    if ( backtracking==0 ) {
                      
                      		// Create return CST Node
                      		Node data_typeReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                      		data_typeReturnNode.setKind("data_type");
                      	    // Create a Token CST Leaf	
                      	    if(TK_0 != null) {
                      			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      	 		TK_0Leaf.setKind("TOKEN");
                      	 		TK_0Leaf.setValue(TK_0.getText());
                      			TK_0Leaf.setPos(TK_0.getCharPositionInLine());
                      			TK_0Leaf.setLine(TK_0.getLine());
                      	 		data_typeReturnNode.getChildren().add(TK_0Leaf);
                      	 	}
                      		// Returns the Node with CST Leaves/Nodes
                      		retval.returnNode = data_typeReturnNode;
                      	
                    }

                    }
                    break;
                case 14 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:2248:7: TK_0= 'TIME'
                    {
                    TK_0=(Token)input.LT(1);
                    match(input,80,FOLLOW_80_in_data_type1641); if (failed) return retval;
                    if ( backtracking==0 ) {
                      
                      		// Create return CST Node
                      		Node data_typeReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                      		data_typeReturnNode.setKind("data_type");
                      	    // Create a Token CST Leaf	
                      	    if(TK_0 != null) {
                      			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      	 		TK_0Leaf.setKind("TOKEN");
                      	 		TK_0Leaf.setValue(TK_0.getText());
                      			TK_0Leaf.setPos(TK_0.getCharPositionInLine());
                      			TK_0Leaf.setLine(TK_0.getLine());
                      	 		data_typeReturnNode.getChildren().add(TK_0Leaf);
                      	 	}
                      		// Returns the Node with CST Leaves/Nodes
                      		retval.returnNode = data_typeReturnNode;
                      	
                    }

                    }
                    break;
                case 15 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:2265:7: TK_0= 'TIMESTAMP'
                    {
                    TK_0=(Token)input.LT(1);
                    match(input,81,FOLLOW_81_in_data_type1655); if (failed) return retval;
                    if ( backtracking==0 ) {
                      
                      		// Create return CST Node
                      		Node data_typeReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                      		data_typeReturnNode.setKind("data_type");
                      	    // Create a Token CST Leaf	
                      	    if(TK_0 != null) {
                      			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      	 		TK_0Leaf.setKind("TOKEN");
                      	 		TK_0Leaf.setValue(TK_0.getText());
                      			TK_0Leaf.setPos(TK_0.getCharPositionInLine());
                      			TK_0Leaf.setLine(TK_0.getLine());
                      	 		data_typeReturnNode.getChildren().add(TK_0Leaf);
                      	 	}
                      		// Returns the Node with CST Leaves/Nodes
                      		retval.returnNode = data_typeReturnNode;
                      	
                    }

                    }
                    break;
                case 16 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:2282:6: TK_0= 'DATETIME'
                    {
                    TK_0=(Token)input.LT(1);
                    match(input,82,FOLLOW_82_in_data_type1668); if (failed) return retval;
                    if ( backtracking==0 ) {
                      
                      		// Create return CST Node
                      		Node data_typeReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                      		data_typeReturnNode.setKind("data_type");
                      	    // Create a Token CST Leaf	
                      	    if(TK_0 != null) {
                      			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      	 		TK_0Leaf.setKind("TOKEN");
                      	 		TK_0Leaf.setValue(TK_0.getText());
                      			TK_0Leaf.setPos(TK_0.getCharPositionInLine());
                      			TK_0Leaf.setLine(TK_0.getLine());
                      	 		data_typeReturnNode.getChildren().add(TK_0Leaf);
                      	 	}
                      		// Returns the Node with CST Leaves/Nodes
                      		retval.returnNode = data_typeReturnNode;
                      	
                    }

                    }
                    break;
                case 17 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:2299:7: TK_0= 'YEAR'
                    {
                    TK_0=(Token)input.LT(1);
                    match(input,83,FOLLOW_83_in_data_type1682); if (failed) return retval;
                    if ( backtracking==0 ) {
                      
                      		// Create return CST Node
                      		Node data_typeReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                      		data_typeReturnNode.setKind("data_type");
                      	    // Create a Token CST Leaf	
                      	    if(TK_0 != null) {
                      			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      	 		TK_0Leaf.setKind("TOKEN");
                      	 		TK_0Leaf.setValue(TK_0.getText());
                      			TK_0Leaf.setPos(TK_0.getCharPositionInLine());
                      			TK_0Leaf.setLine(TK_0.getLine());
                      	 		data_typeReturnNode.getChildren().add(TK_0Leaf);
                      	 	}
                      		// Returns the Node with CST Leaves/Nodes
                      		retval.returnNode = data_typeReturnNode;
                      	
                    }

                    }
                    break;
                case 18 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:2316:7: TK_0= 'CHAR' (TK_1= '(' NUMBERGen= NUMBER TK_2= ')' )? (TK_3= 'CHARACTER' TK_4= 'SET' IDGen= ID )? (TK_5= 'COLLATE' IDGen_1= ID )?
                    {
                    TK_0=(Token)input.LT(1);
                    match(input,84,FOLLOW_84_in_data_type1696); if (failed) return retval;
                    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:2316:19: (TK_1= '(' NUMBERGen= NUMBER TK_2= ')' )?
                    int alt83=2;
                    int LA83_0 = input.LA(1);

                    if ( (LA83_0==38) ) {
                        alt83=1;
                    }
                    switch (alt83) {
                        case 1 :
                            // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:2316:20: TK_1= '(' NUMBERGen= NUMBER TK_2= ')'
                            {
                            TK_1=(Token)input.LT(1);
                            match(input,38,FOLLOW_38_in_data_type1701); if (failed) return retval;
                            NUMBERGen=(Token)input.LT(1);
                            match(input,NUMBER,FOLLOW_NUMBER_in_data_type1705); if (failed) return retval;
                            TK_2=(Token)input.LT(1);
                            match(input,39,FOLLOW_39_in_data_type1709); if (failed) return retval;

                            }
                            break;

                    }

                    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:2316:57: (TK_3= 'CHARACTER' TK_4= 'SET' IDGen= ID )?
                    int alt84=2;
                    int LA84_0 = input.LA(1);

                    if ( (LA84_0==34) ) {
                        alt84=1;
                    }
                    switch (alt84) {
                        case 1 :
                            // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:2316:58: TK_3= 'CHARACTER' TK_4= 'SET' IDGen= ID
                            {
                            TK_3=(Token)input.LT(1);
                            match(input,34,FOLLOW_34_in_data_type1716); if (failed) return retval;
                            TK_4=(Token)input.LT(1);
                            match(input,19,FOLLOW_19_in_data_type1720); if (failed) return retval;
                            IDGen=(Token)input.LT(1);
                            match(input,ID,FOLLOW_ID_in_data_type1724); if (failed) return retval;

                            }
                            break;

                    }

                    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:2316:97: (TK_5= 'COLLATE' IDGen_1= ID )?
                    int alt85=2;
                    int LA85_0 = input.LA(1);

                    if ( (LA85_0==35) ) {
                        alt85=1;
                    }
                    switch (alt85) {
                        case 1 :
                            // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:2316:98: TK_5= 'COLLATE' IDGen_1= ID
                            {
                            TK_5=(Token)input.LT(1);
                            match(input,35,FOLLOW_35_in_data_type1731); if (failed) return retval;
                            IDGen_1=(Token)input.LT(1);
                            match(input,ID,FOLLOW_ID_in_data_type1735); if (failed) return retval;

                            }
                            break;

                    }

                    if ( backtracking==0 ) {
                      
                      		// Create return CST Node
                      		Node data_typeReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                      		data_typeReturnNode.setKind("data_type");
                      	    // Create a Token CST Leaf	
                      	    if(TK_0 != null) {
                      			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      	 		TK_0Leaf.setKind("TOKEN");
                      	 		TK_0Leaf.setValue(TK_0.getText());
                      			TK_0Leaf.setPos(TK_0.getCharPositionInLine());
                      			TK_0Leaf.setLine(TK_0.getLine());
                      	 		data_typeReturnNode.getChildren().add(TK_0Leaf);
                      	 	}
                      	    // Create a Token CST Leaf	
                      	    if(TK_1 != null) {
                      			Leaf TK_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      	 		TK_1Leaf.setKind("TOKEN");
                      	 		TK_1Leaf.setValue(TK_1.getText());
                      			TK_1Leaf.setPos(TK_1.getCharPositionInLine());
                      			TK_1Leaf.setLine(TK_1.getLine());
                      	 		data_typeReturnNode.getChildren().add(TK_1Leaf);
                      	 	}
                      	    // Create a CST Leaf
                      		if(NUMBERGen != null) {
                      			Leaf NUMBERGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      			NUMBERGenLeaf.setKind("NUMBER");
                      			NUMBERGenLeaf.setValue(NUMBERGen.getText());
                      			NUMBERGenLeaf.setPos(NUMBERGen.getCharPositionInLine());
                      			NUMBERGenLeaf.setLine(NUMBERGen.getLine());
                      			data_typeReturnNode.getChildren().add(NUMBERGenLeaf);
                      		}
                      	    // Create a Token CST Leaf	
                      	    if(TK_2 != null) {
                      			Leaf TK_2Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      	 		TK_2Leaf.setKind("TOKEN");
                      	 		TK_2Leaf.setValue(TK_2.getText());
                      			TK_2Leaf.setPos(TK_2.getCharPositionInLine());
                      			TK_2Leaf.setLine(TK_2.getLine());
                      	 		data_typeReturnNode.getChildren().add(TK_2Leaf);
                      	 	}
                      	    // Create a Token CST Leaf	
                      	    if(TK_3 != null) {
                      			Leaf TK_3Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      	 		TK_3Leaf.setKind("TOKEN");
                      	 		TK_3Leaf.setValue(TK_3.getText());
                      			TK_3Leaf.setPos(TK_3.getCharPositionInLine());
                      			TK_3Leaf.setLine(TK_3.getLine());
                      	 		data_typeReturnNode.getChildren().add(TK_3Leaf);
                      	 	}
                      	    // Create a Token CST Leaf	
                      	    if(TK_4 != null) {
                      			Leaf TK_4Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      	 		TK_4Leaf.setKind("TOKEN");
                      	 		TK_4Leaf.setValue(TK_4.getText());
                      			TK_4Leaf.setPos(TK_4.getCharPositionInLine());
                      			TK_4Leaf.setLine(TK_4.getLine());
                      	 		data_typeReturnNode.getChildren().add(TK_4Leaf);
                      	 	}
                      	    // Create a CST Leaf
                      		if(IDGen != null) {
                      			Leaf IDGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      			IDGenLeaf.setKind("ID");
                      			IDGenLeaf.setValue(IDGen.getText());
                      			IDGenLeaf.setPos(IDGen.getCharPositionInLine());
                      			IDGenLeaf.setLine(IDGen.getLine());
                      			data_typeReturnNode.getChildren().add(IDGenLeaf);
                      		}
                      	    // Create a Token CST Leaf	
                      	    if(TK_5 != null) {
                      			Leaf TK_5Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      	 		TK_5Leaf.setKind("TOKEN");
                      	 		TK_5Leaf.setValue(TK_5.getText());
                      			TK_5Leaf.setPos(TK_5.getCharPositionInLine());
                      			TK_5Leaf.setLine(TK_5.getLine());
                      	 		data_typeReturnNode.getChildren().add(TK_5Leaf);
                      	 	}
                      	    // Create a CST Leaf
                      		if(IDGen_1 != null) {
                      			Leaf IDGen_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      			IDGen_1Leaf.setKind("ID");
                      			IDGen_1Leaf.setValue(IDGen_1.getText());
                      			IDGen_1Leaf.setPos(IDGen_1.getCharPositionInLine());
                      			IDGen_1Leaf.setLine(IDGen_1.getLine());
                      			data_typeReturnNode.getChildren().add(IDGen_1Leaf);
                      		}
                      		// Returns the Node with CST Leaves/Nodes
                      		retval.returnNode = data_typeReturnNode;
                      	
                    }

                    }
                    break;
                case 19 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:2405:7: TK_0= 'VARCHAR' TK_1= '(' NUMBERGen= NUMBER TK_2= ')' (TK_3= 'CHARACTER' TK_4= 'SET' IDGen= ID )? (TK_5= 'COLLATE' IDGen_1= ID )?
                    {
                    TK_0=(Token)input.LT(1);
                    match(input,85,FOLLOW_85_in_data_type1751); if (failed) return retval;
                    TK_1=(Token)input.LT(1);
                    match(input,38,FOLLOW_38_in_data_type1755); if (failed) return retval;
                    NUMBERGen=(Token)input.LT(1);
                    match(input,NUMBER,FOLLOW_NUMBER_in_data_type1759); if (failed) return retval;
                    TK_2=(Token)input.LT(1);
                    match(input,39,FOLLOW_39_in_data_type1763); if (failed) return retval;
                    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:2405:57: (TK_3= 'CHARACTER' TK_4= 'SET' IDGen= ID )?
                    int alt86=2;
                    int LA86_0 = input.LA(1);

                    if ( (LA86_0==34) ) {
                        alt86=1;
                    }
                    switch (alt86) {
                        case 1 :
                            // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:2405:58: TK_3= 'CHARACTER' TK_4= 'SET' IDGen= ID
                            {
                            TK_3=(Token)input.LT(1);
                            match(input,34,FOLLOW_34_in_data_type1768); if (failed) return retval;
                            TK_4=(Token)input.LT(1);
                            match(input,19,FOLLOW_19_in_data_type1772); if (failed) return retval;
                            IDGen=(Token)input.LT(1);
                            match(input,ID,FOLLOW_ID_in_data_type1776); if (failed) return retval;

                            }
                            break;

                    }

                    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:2405:97: (TK_5= 'COLLATE' IDGen_1= ID )?
                    int alt87=2;
                    int LA87_0 = input.LA(1);

                    if ( (LA87_0==35) ) {
                        alt87=1;
                    }
                    switch (alt87) {
                        case 1 :
                            // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:2405:98: TK_5= 'COLLATE' IDGen_1= ID
                            {
                            TK_5=(Token)input.LT(1);
                            match(input,35,FOLLOW_35_in_data_type1783); if (failed) return retval;
                            IDGen_1=(Token)input.LT(1);
                            match(input,ID,FOLLOW_ID_in_data_type1787); if (failed) return retval;

                            }
                            break;

                    }

                    if ( backtracking==0 ) {
                      
                      		// Create return CST Node
                      		Node data_typeReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                      		data_typeReturnNode.setKind("data_type");
                      	    // Create a Token CST Leaf	
                      	    if(TK_0 != null) {
                      			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      	 		TK_0Leaf.setKind("TOKEN");
                      	 		TK_0Leaf.setValue(TK_0.getText());
                      			TK_0Leaf.setPos(TK_0.getCharPositionInLine());
                      			TK_0Leaf.setLine(TK_0.getLine());
                      	 		data_typeReturnNode.getChildren().add(TK_0Leaf);
                      	 	}
                      	    // Create a Token CST Leaf	
                      	    if(TK_1 != null) {
                      			Leaf TK_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      	 		TK_1Leaf.setKind("TOKEN");
                      	 		TK_1Leaf.setValue(TK_1.getText());
                      			TK_1Leaf.setPos(TK_1.getCharPositionInLine());
                      			TK_1Leaf.setLine(TK_1.getLine());
                      	 		data_typeReturnNode.getChildren().add(TK_1Leaf);
                      	 	}
                      	    // Create a CST Leaf
                      		if(NUMBERGen != null) {
                      			Leaf NUMBERGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      			NUMBERGenLeaf.setKind("NUMBER");
                      			NUMBERGenLeaf.setValue(NUMBERGen.getText());
                      			NUMBERGenLeaf.setPos(NUMBERGen.getCharPositionInLine());
                      			NUMBERGenLeaf.setLine(NUMBERGen.getLine());
                      			data_typeReturnNode.getChildren().add(NUMBERGenLeaf);
                      		}
                      	    // Create a Token CST Leaf	
                      	    if(TK_2 != null) {
                      			Leaf TK_2Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      	 		TK_2Leaf.setKind("TOKEN");
                      	 		TK_2Leaf.setValue(TK_2.getText());
                      			TK_2Leaf.setPos(TK_2.getCharPositionInLine());
                      			TK_2Leaf.setLine(TK_2.getLine());
                      	 		data_typeReturnNode.getChildren().add(TK_2Leaf);
                      	 	}
                      	    // Create a Token CST Leaf	
                      	    if(TK_3 != null) {
                      			Leaf TK_3Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      	 		TK_3Leaf.setKind("TOKEN");
                      	 		TK_3Leaf.setValue(TK_3.getText());
                      			TK_3Leaf.setPos(TK_3.getCharPositionInLine());
                      			TK_3Leaf.setLine(TK_3.getLine());
                      	 		data_typeReturnNode.getChildren().add(TK_3Leaf);
                      	 	}
                      	    // Create a Token CST Leaf	
                      	    if(TK_4 != null) {
                      			Leaf TK_4Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      	 		TK_4Leaf.setKind("TOKEN");
                      	 		TK_4Leaf.setValue(TK_4.getText());
                      			TK_4Leaf.setPos(TK_4.getCharPositionInLine());
                      			TK_4Leaf.setLine(TK_4.getLine());
                      	 		data_typeReturnNode.getChildren().add(TK_4Leaf);
                      	 	}
                      	    // Create a CST Leaf
                      		if(IDGen != null) {
                      			Leaf IDGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      			IDGenLeaf.setKind("ID");
                      			IDGenLeaf.setValue(IDGen.getText());
                      			IDGenLeaf.setPos(IDGen.getCharPositionInLine());
                      			IDGenLeaf.setLine(IDGen.getLine());
                      			data_typeReturnNode.getChildren().add(IDGenLeaf);
                      		}
                      	    // Create a Token CST Leaf	
                      	    if(TK_5 != null) {
                      			Leaf TK_5Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      	 		TK_5Leaf.setKind("TOKEN");
                      	 		TK_5Leaf.setValue(TK_5.getText());
                      			TK_5Leaf.setPos(TK_5.getCharPositionInLine());
                      			TK_5Leaf.setLine(TK_5.getLine());
                      	 		data_typeReturnNode.getChildren().add(TK_5Leaf);
                      	 	}
                      	    // Create a CST Leaf
                      		if(IDGen_1 != null) {
                      			Leaf IDGen_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      			IDGen_1Leaf.setKind("ID");
                      			IDGen_1Leaf.setValue(IDGen_1.getText());
                      			IDGen_1Leaf.setPos(IDGen_1.getCharPositionInLine());
                      			IDGen_1Leaf.setLine(IDGen_1.getLine());
                      			data_typeReturnNode.getChildren().add(IDGen_1Leaf);
                      		}
                      		// Returns the Node with CST Leaves/Nodes
                      		retval.returnNode = data_typeReturnNode;
                      	
                    }

                    }
                    break;
                case 20 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:2494:7: TK_0= 'BINARYTYPE' TK_1= '(' NUMBERGen= NUMBER TK_2= ')'
                    {
                    TK_0=(Token)input.LT(1);
                    match(input,86,FOLLOW_86_in_data_type1803); if (failed) return retval;
                    TK_1=(Token)input.LT(1);
                    match(input,38,FOLLOW_38_in_data_type1807); if (failed) return retval;
                    NUMBERGen=(Token)input.LT(1);
                    match(input,NUMBER,FOLLOW_NUMBER_in_data_type1811); if (failed) return retval;
                    TK_2=(Token)input.LT(1);
                    match(input,39,FOLLOW_39_in_data_type1815); if (failed) return retval;
                    if ( backtracking==0 ) {
                      
                      		// Create return CST Node
                      		Node data_typeReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                      		data_typeReturnNode.setKind("data_type");
                      	    // Create a Token CST Leaf	
                      	    if(TK_0 != null) {
                      			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      	 		TK_0Leaf.setKind("TOKEN");
                      	 		TK_0Leaf.setValue(TK_0.getText());
                      			TK_0Leaf.setPos(TK_0.getCharPositionInLine());
                      			TK_0Leaf.setLine(TK_0.getLine());
                      	 		data_typeReturnNode.getChildren().add(TK_0Leaf);
                      	 	}
                      	    // Create a Token CST Leaf	
                      	    if(TK_1 != null) {
                      			Leaf TK_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      	 		TK_1Leaf.setKind("TOKEN");
                      	 		TK_1Leaf.setValue(TK_1.getText());
                      			TK_1Leaf.setPos(TK_1.getCharPositionInLine());
                      			TK_1Leaf.setLine(TK_1.getLine());
                      	 		data_typeReturnNode.getChildren().add(TK_1Leaf);
                      	 	}
                      	    // Create a CST Leaf
                      		if(NUMBERGen != null) {
                      			Leaf NUMBERGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      			NUMBERGenLeaf.setKind("NUMBER");
                      			NUMBERGenLeaf.setValue(NUMBERGen.getText());
                      			NUMBERGenLeaf.setPos(NUMBERGen.getCharPositionInLine());
                      			NUMBERGenLeaf.setLine(NUMBERGen.getLine());
                      			data_typeReturnNode.getChildren().add(NUMBERGenLeaf);
                      		}
                      	    // Create a Token CST Leaf	
                      	    if(TK_2 != null) {
                      			Leaf TK_2Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      	 		TK_2Leaf.setKind("TOKEN");
                      	 		TK_2Leaf.setValue(TK_2.getText());
                      			TK_2Leaf.setPos(TK_2.getCharPositionInLine());
                      			TK_2Leaf.setLine(TK_2.getLine());
                      	 		data_typeReturnNode.getChildren().add(TK_2Leaf);
                      	 	}
                      		// Returns the Node with CST Leaves/Nodes
                      		retval.returnNode = data_typeReturnNode;
                      	
                    }

                    }
                    break;
                case 21 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:2538:7: TK_0= 'VARBINARY' TK_1= '(' NUMBERGen= NUMBER TK_2= ')'
                    {
                    TK_0=(Token)input.LT(1);
                    match(input,87,FOLLOW_87_in_data_type1829); if (failed) return retval;
                    TK_1=(Token)input.LT(1);
                    match(input,38,FOLLOW_38_in_data_type1833); if (failed) return retval;
                    NUMBERGen=(Token)input.LT(1);
                    match(input,NUMBER,FOLLOW_NUMBER_in_data_type1837); if (failed) return retval;
                    TK_2=(Token)input.LT(1);
                    match(input,39,FOLLOW_39_in_data_type1841); if (failed) return retval;
                    if ( backtracking==0 ) {
                      
                      		// Create return CST Node
                      		Node data_typeReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                      		data_typeReturnNode.setKind("data_type");
                      	    // Create a Token CST Leaf	
                      	    if(TK_0 != null) {
                      			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      	 		TK_0Leaf.setKind("TOKEN");
                      	 		TK_0Leaf.setValue(TK_0.getText());
                      			TK_0Leaf.setPos(TK_0.getCharPositionInLine());
                      			TK_0Leaf.setLine(TK_0.getLine());
                      	 		data_typeReturnNode.getChildren().add(TK_0Leaf);
                      	 	}
                      	    // Create a Token CST Leaf	
                      	    if(TK_1 != null) {
                      			Leaf TK_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      	 		TK_1Leaf.setKind("TOKEN");
                      	 		TK_1Leaf.setValue(TK_1.getText());
                      			TK_1Leaf.setPos(TK_1.getCharPositionInLine());
                      			TK_1Leaf.setLine(TK_1.getLine());
                      	 		data_typeReturnNode.getChildren().add(TK_1Leaf);
                      	 	}
                      	    // Create a CST Leaf
                      		if(NUMBERGen != null) {
                      			Leaf NUMBERGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      			NUMBERGenLeaf.setKind("NUMBER");
                      			NUMBERGenLeaf.setValue(NUMBERGen.getText());
                      			NUMBERGenLeaf.setPos(NUMBERGen.getCharPositionInLine());
                      			NUMBERGenLeaf.setLine(NUMBERGen.getLine());
                      			data_typeReturnNode.getChildren().add(NUMBERGenLeaf);
                      		}
                      	    // Create a Token CST Leaf	
                      	    if(TK_2 != null) {
                      			Leaf TK_2Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      	 		TK_2Leaf.setKind("TOKEN");
                      	 		TK_2Leaf.setValue(TK_2.getText());
                      			TK_2Leaf.setPos(TK_2.getCharPositionInLine());
                      			TK_2Leaf.setLine(TK_2.getLine());
                      	 		data_typeReturnNode.getChildren().add(TK_2Leaf);
                      	 	}
                      		// Returns the Node with CST Leaves/Nodes
                      		retval.returnNode = data_typeReturnNode;
                      	
                    }

                    }
                    break;
                case 22 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:2582:7: TK_0= 'TINYBLOB'
                    {
                    TK_0=(Token)input.LT(1);
                    match(input,88,FOLLOW_88_in_data_type1855); if (failed) return retval;
                    if ( backtracking==0 ) {
                      
                      		// Create return CST Node
                      		Node data_typeReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                      		data_typeReturnNode.setKind("data_type");
                      	    // Create a Token CST Leaf	
                      	    if(TK_0 != null) {
                      			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      	 		TK_0Leaf.setKind("TOKEN");
                      	 		TK_0Leaf.setValue(TK_0.getText());
                      			TK_0Leaf.setPos(TK_0.getCharPositionInLine());
                      			TK_0Leaf.setLine(TK_0.getLine());
                      	 		data_typeReturnNode.getChildren().add(TK_0Leaf);
                      	 	}
                      		// Returns the Node with CST Leaves/Nodes
                      		retval.returnNode = data_typeReturnNode;
                      	
                    }

                    }
                    break;
                case 23 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:2599:7: TK_0= 'BLOB'
                    {
                    TK_0=(Token)input.LT(1);
                    match(input,89,FOLLOW_89_in_data_type1869); if (failed) return retval;
                    if ( backtracking==0 ) {
                      
                      		// Create return CST Node
                      		Node data_typeReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                      		data_typeReturnNode.setKind("data_type");
                      	    // Create a Token CST Leaf	
                      	    if(TK_0 != null) {
                      			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      	 		TK_0Leaf.setKind("TOKEN");
                      	 		TK_0Leaf.setValue(TK_0.getText());
                      			TK_0Leaf.setPos(TK_0.getCharPositionInLine());
                      			TK_0Leaf.setLine(TK_0.getLine());
                      	 		data_typeReturnNode.getChildren().add(TK_0Leaf);
                      	 	}
                      		// Returns the Node with CST Leaves/Nodes
                      		retval.returnNode = data_typeReturnNode;
                      	
                    }

                    }
                    break;
                case 24 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:2616:7: TK_0= 'MEDIUMBLOB'
                    {
                    TK_0=(Token)input.LT(1);
                    match(input,90,FOLLOW_90_in_data_type1883); if (failed) return retval;
                    if ( backtracking==0 ) {
                      
                      		// Create return CST Node
                      		Node data_typeReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                      		data_typeReturnNode.setKind("data_type");
                      	    // Create a Token CST Leaf	
                      	    if(TK_0 != null) {
                      			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      	 		TK_0Leaf.setKind("TOKEN");
                      	 		TK_0Leaf.setValue(TK_0.getText());
                      			TK_0Leaf.setPos(TK_0.getCharPositionInLine());
                      			TK_0Leaf.setLine(TK_0.getLine());
                      	 		data_typeReturnNode.getChildren().add(TK_0Leaf);
                      	 	}
                      		// Returns the Node with CST Leaves/Nodes
                      		retval.returnNode = data_typeReturnNode;
                      	
                    }

                    }
                    break;
                case 25 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:2633:7: TK_0= 'LONGBLOB'
                    {
                    TK_0=(Token)input.LT(1);
                    match(input,91,FOLLOW_91_in_data_type1897); if (failed) return retval;
                    if ( backtracking==0 ) {
                      
                      		// Create return CST Node
                      		Node data_typeReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                      		data_typeReturnNode.setKind("data_type");
                      	    // Create a Token CST Leaf	
                      	    if(TK_0 != null) {
                      			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      	 		TK_0Leaf.setKind("TOKEN");
                      	 		TK_0Leaf.setValue(TK_0.getText());
                      			TK_0Leaf.setPos(TK_0.getCharPositionInLine());
                      			TK_0Leaf.setLine(TK_0.getLine());
                      	 		data_typeReturnNode.getChildren().add(TK_0Leaf);
                      	 	}
                      		// Returns the Node with CST Leaves/Nodes
                      		retval.returnNode = data_typeReturnNode;
                      	
                    }

                    }
                    break;
                case 26 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:2650:7: TK_0= 'TINYTEXT' (TK_1= 'BYNARY' )? (TK_2= 'CHARACTER' TK_3= 'SET' IDGen= ID )? (TK_4= 'COLLATE' IDGen_1= ID )?
                    {
                    TK_0=(Token)input.LT(1);
                    match(input,92,FOLLOW_92_in_data_type1911); if (failed) return retval;
                    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:2650:23: (TK_1= 'BYNARY' )?
                    int alt88=2;
                    int LA88_0 = input.LA(1);

                    if ( (LA88_0==93) ) {
                        alt88=1;
                    }
                    switch (alt88) {
                        case 1 :
                            // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:2650:24: TK_1= 'BYNARY'
                            {
                            TK_1=(Token)input.LT(1);
                            match(input,93,FOLLOW_93_in_data_type1916); if (failed) return retval;

                            }
                            break;

                    }

                    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:2650:40: (TK_2= 'CHARACTER' TK_3= 'SET' IDGen= ID )?
                    int alt89=2;
                    int LA89_0 = input.LA(1);

                    if ( (LA89_0==34) ) {
                        alt89=1;
                    }
                    switch (alt89) {
                        case 1 :
                            // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:2650:41: TK_2= 'CHARACTER' TK_3= 'SET' IDGen= ID
                            {
                            TK_2=(Token)input.LT(1);
                            match(input,34,FOLLOW_34_in_data_type1923); if (failed) return retval;
                            TK_3=(Token)input.LT(1);
                            match(input,19,FOLLOW_19_in_data_type1927); if (failed) return retval;
                            IDGen=(Token)input.LT(1);
                            match(input,ID,FOLLOW_ID_in_data_type1931); if (failed) return retval;

                            }
                            break;

                    }

                    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:2650:80: (TK_4= 'COLLATE' IDGen_1= ID )?
                    int alt90=2;
                    int LA90_0 = input.LA(1);

                    if ( (LA90_0==35) ) {
                        alt90=1;
                    }
                    switch (alt90) {
                        case 1 :
                            // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:2650:81: TK_4= 'COLLATE' IDGen_1= ID
                            {
                            TK_4=(Token)input.LT(1);
                            match(input,35,FOLLOW_35_in_data_type1938); if (failed) return retval;
                            IDGen_1=(Token)input.LT(1);
                            match(input,ID,FOLLOW_ID_in_data_type1942); if (failed) return retval;

                            }
                            break;

                    }

                    if ( backtracking==0 ) {
                      
                      		// Create return CST Node
                      		Node data_typeReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                      		data_typeReturnNode.setKind("data_type");
                      	    // Create a Token CST Leaf	
                      	    if(TK_0 != null) {
                      			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      	 		TK_0Leaf.setKind("TOKEN");
                      	 		TK_0Leaf.setValue(TK_0.getText());
                      			TK_0Leaf.setPos(TK_0.getCharPositionInLine());
                      			TK_0Leaf.setLine(TK_0.getLine());
                      	 		data_typeReturnNode.getChildren().add(TK_0Leaf);
                      	 	}
                      	    // Create a Token CST Leaf	
                      	    if(TK_1 != null) {
                      			Leaf TK_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      	 		TK_1Leaf.setKind("TOKEN");
                      	 		TK_1Leaf.setValue(TK_1.getText());
                      			TK_1Leaf.setPos(TK_1.getCharPositionInLine());
                      			TK_1Leaf.setLine(TK_1.getLine());
                      	 		data_typeReturnNode.getChildren().add(TK_1Leaf);
                      	 	}
                      	    // Create a Token CST Leaf	
                      	    if(TK_2 != null) {
                      			Leaf TK_2Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      	 		TK_2Leaf.setKind("TOKEN");
                      	 		TK_2Leaf.setValue(TK_2.getText());
                      			TK_2Leaf.setPos(TK_2.getCharPositionInLine());
                      			TK_2Leaf.setLine(TK_2.getLine());
                      	 		data_typeReturnNode.getChildren().add(TK_2Leaf);
                      	 	}
                      	    // Create a Token CST Leaf	
                      	    if(TK_3 != null) {
                      			Leaf TK_3Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      	 		TK_3Leaf.setKind("TOKEN");
                      	 		TK_3Leaf.setValue(TK_3.getText());
                      			TK_3Leaf.setPos(TK_3.getCharPositionInLine());
                      			TK_3Leaf.setLine(TK_3.getLine());
                      	 		data_typeReturnNode.getChildren().add(TK_3Leaf);
                      	 	}
                      	    // Create a CST Leaf
                      		if(IDGen != null) {
                      			Leaf IDGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      			IDGenLeaf.setKind("ID");
                      			IDGenLeaf.setValue(IDGen.getText());
                      			IDGenLeaf.setPos(IDGen.getCharPositionInLine());
                      			IDGenLeaf.setLine(IDGen.getLine());
                      			data_typeReturnNode.getChildren().add(IDGenLeaf);
                      		}
                      	    // Create a Token CST Leaf	
                      	    if(TK_4 != null) {
                      			Leaf TK_4Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      	 		TK_4Leaf.setKind("TOKEN");
                      	 		TK_4Leaf.setValue(TK_4.getText());
                      			TK_4Leaf.setPos(TK_4.getCharPositionInLine());
                      			TK_4Leaf.setLine(TK_4.getLine());
                      	 		data_typeReturnNode.getChildren().add(TK_4Leaf);
                      	 	}
                      	    // Create a CST Leaf
                      		if(IDGen_1 != null) {
                      			Leaf IDGen_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      			IDGen_1Leaf.setKind("ID");
                      			IDGen_1Leaf.setValue(IDGen_1.getText());
                      			IDGen_1Leaf.setPos(IDGen_1.getCharPositionInLine());
                      			IDGen_1Leaf.setLine(IDGen_1.getLine());
                      			data_typeReturnNode.getChildren().add(IDGen_1Leaf);
                      		}
                      		// Returns the Node with CST Leaves/Nodes
                      		retval.returnNode = data_typeReturnNode;
                      	
                    }

                    }
                    break;
                case 27 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:2721:8: TK_0= 'TEXTVAR' (TK_1= 'BYNARY' )? (TK_2= 'CHARACTER' TK_3= 'SET' IDGen= ID )? (TK_4= 'COLLATE' IDGen_1= ID )?
                    {
                    TK_0=(Token)input.LT(1);
                    match(input,94,FOLLOW_94_in_data_type1959); if (failed) return retval;
                    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:2721:23: (TK_1= 'BYNARY' )?
                    int alt91=2;
                    int LA91_0 = input.LA(1);

                    if ( (LA91_0==93) ) {
                        alt91=1;
                    }
                    switch (alt91) {
                        case 1 :
                            // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:2721:24: TK_1= 'BYNARY'
                            {
                            TK_1=(Token)input.LT(1);
                            match(input,93,FOLLOW_93_in_data_type1964); if (failed) return retval;

                            }
                            break;

                    }

                    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:2721:40: (TK_2= 'CHARACTER' TK_3= 'SET' IDGen= ID )?
                    int alt92=2;
                    int LA92_0 = input.LA(1);

                    if ( (LA92_0==34) ) {
                        alt92=1;
                    }
                    switch (alt92) {
                        case 1 :
                            // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:2721:41: TK_2= 'CHARACTER' TK_3= 'SET' IDGen= ID
                            {
                            TK_2=(Token)input.LT(1);
                            match(input,34,FOLLOW_34_in_data_type1971); if (failed) return retval;
                            TK_3=(Token)input.LT(1);
                            match(input,19,FOLLOW_19_in_data_type1975); if (failed) return retval;
                            IDGen=(Token)input.LT(1);
                            match(input,ID,FOLLOW_ID_in_data_type1979); if (failed) return retval;

                            }
                            break;

                    }

                    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:2721:80: (TK_4= 'COLLATE' IDGen_1= ID )?
                    int alt93=2;
                    int LA93_0 = input.LA(1);

                    if ( (LA93_0==35) ) {
                        alt93=1;
                    }
                    switch (alt93) {
                        case 1 :
                            // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:2721:81: TK_4= 'COLLATE' IDGen_1= ID
                            {
                            TK_4=(Token)input.LT(1);
                            match(input,35,FOLLOW_35_in_data_type1986); if (failed) return retval;
                            IDGen_1=(Token)input.LT(1);
                            match(input,ID,FOLLOW_ID_in_data_type1990); if (failed) return retval;

                            }
                            break;

                    }

                    if ( backtracking==0 ) {
                      
                      		// Create return CST Node
                      		Node data_typeReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                      		data_typeReturnNode.setKind("data_type");
                      	    // Create a Token CST Leaf	
                      	    if(TK_0 != null) {
                      			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      	 		TK_0Leaf.setKind("TOKEN");
                      	 		TK_0Leaf.setValue(TK_0.getText());
                      			TK_0Leaf.setPos(TK_0.getCharPositionInLine());
                      			TK_0Leaf.setLine(TK_0.getLine());
                      	 		data_typeReturnNode.getChildren().add(TK_0Leaf);
                      	 	}
                      	    // Create a Token CST Leaf	
                      	    if(TK_1 != null) {
                      			Leaf TK_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      	 		TK_1Leaf.setKind("TOKEN");
                      	 		TK_1Leaf.setValue(TK_1.getText());
                      			TK_1Leaf.setPos(TK_1.getCharPositionInLine());
                      			TK_1Leaf.setLine(TK_1.getLine());
                      	 		data_typeReturnNode.getChildren().add(TK_1Leaf);
                      	 	}
                      	    // Create a Token CST Leaf	
                      	    if(TK_2 != null) {
                      			Leaf TK_2Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      	 		TK_2Leaf.setKind("TOKEN");
                      	 		TK_2Leaf.setValue(TK_2.getText());
                      			TK_2Leaf.setPos(TK_2.getCharPositionInLine());
                      			TK_2Leaf.setLine(TK_2.getLine());
                      	 		data_typeReturnNode.getChildren().add(TK_2Leaf);
                      	 	}
                      	    // Create a Token CST Leaf	
                      	    if(TK_3 != null) {
                      			Leaf TK_3Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      	 		TK_3Leaf.setKind("TOKEN");
                      	 		TK_3Leaf.setValue(TK_3.getText());
                      			TK_3Leaf.setPos(TK_3.getCharPositionInLine());
                      			TK_3Leaf.setLine(TK_3.getLine());
                      	 		data_typeReturnNode.getChildren().add(TK_3Leaf);
                      	 	}
                      	    // Create a CST Leaf
                      		if(IDGen != null) {
                      			Leaf IDGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      			IDGenLeaf.setKind("ID");
                      			IDGenLeaf.setValue(IDGen.getText());
                      			IDGenLeaf.setPos(IDGen.getCharPositionInLine());
                      			IDGenLeaf.setLine(IDGen.getLine());
                      			data_typeReturnNode.getChildren().add(IDGenLeaf);
                      		}
                      	    // Create a Token CST Leaf	
                      	    if(TK_4 != null) {
                      			Leaf TK_4Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      	 		TK_4Leaf.setKind("TOKEN");
                      	 		TK_4Leaf.setValue(TK_4.getText());
                      			TK_4Leaf.setPos(TK_4.getCharPositionInLine());
                      			TK_4Leaf.setLine(TK_4.getLine());
                      	 		data_typeReturnNode.getChildren().add(TK_4Leaf);
                      	 	}
                      	    // Create a CST Leaf
                      		if(IDGen_1 != null) {
                      			Leaf IDGen_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      			IDGen_1Leaf.setKind("ID");
                      			IDGen_1Leaf.setValue(IDGen_1.getText());
                      			IDGen_1Leaf.setPos(IDGen_1.getCharPositionInLine());
                      			IDGen_1Leaf.setLine(IDGen_1.getLine());
                      			data_typeReturnNode.getChildren().add(IDGen_1Leaf);
                      		}
                      		// Returns the Node with CST Leaves/Nodes
                      		retval.returnNode = data_typeReturnNode;
                      	
                    }

                    }
                    break;
                case 28 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:2792:7: TK_0= 'MEDIUMTEXT' (TK_1= 'BYNARY' )? (TK_2= 'CHARACTER' TK_3= 'SET' IDGen= ID )? (TK_4= 'COLLATE' IDGen_1= ID )?
                    {
                    TK_0=(Token)input.LT(1);
                    match(input,95,FOLLOW_95_in_data_type2006); if (failed) return retval;
                    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:2792:25: (TK_1= 'BYNARY' )?
                    int alt94=2;
                    int LA94_0 = input.LA(1);

                    if ( (LA94_0==93) ) {
                        alt94=1;
                    }
                    switch (alt94) {
                        case 1 :
                            // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:2792:26: TK_1= 'BYNARY'
                            {
                            TK_1=(Token)input.LT(1);
                            match(input,93,FOLLOW_93_in_data_type2011); if (failed) return retval;

                            }
                            break;

                    }

                    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:2792:42: (TK_2= 'CHARACTER' TK_3= 'SET' IDGen= ID )?
                    int alt95=2;
                    int LA95_0 = input.LA(1);

                    if ( (LA95_0==34) ) {
                        alt95=1;
                    }
                    switch (alt95) {
                        case 1 :
                            // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:2792:43: TK_2= 'CHARACTER' TK_3= 'SET' IDGen= ID
                            {
                            TK_2=(Token)input.LT(1);
                            match(input,34,FOLLOW_34_in_data_type2018); if (failed) return retval;
                            TK_3=(Token)input.LT(1);
                            match(input,19,FOLLOW_19_in_data_type2022); if (failed) return retval;
                            IDGen=(Token)input.LT(1);
                            match(input,ID,FOLLOW_ID_in_data_type2026); if (failed) return retval;

                            }
                            break;

                    }

                    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:2792:82: (TK_4= 'COLLATE' IDGen_1= ID )?
                    int alt96=2;
                    int LA96_0 = input.LA(1);

                    if ( (LA96_0==35) ) {
                        alt96=1;
                    }
                    switch (alt96) {
                        case 1 :
                            // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:2792:83: TK_4= 'COLLATE' IDGen_1= ID
                            {
                            TK_4=(Token)input.LT(1);
                            match(input,35,FOLLOW_35_in_data_type2033); if (failed) return retval;
                            IDGen_1=(Token)input.LT(1);
                            match(input,ID,FOLLOW_ID_in_data_type2037); if (failed) return retval;

                            }
                            break;

                    }

                    if ( backtracking==0 ) {
                      
                      		// Create return CST Node
                      		Node data_typeReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                      		data_typeReturnNode.setKind("data_type");
                      	    // Create a Token CST Leaf	
                      	    if(TK_0 != null) {
                      			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      	 		TK_0Leaf.setKind("TOKEN");
                      	 		TK_0Leaf.setValue(TK_0.getText());
                      			TK_0Leaf.setPos(TK_0.getCharPositionInLine());
                      			TK_0Leaf.setLine(TK_0.getLine());
                      	 		data_typeReturnNode.getChildren().add(TK_0Leaf);
                      	 	}
                      	    // Create a Token CST Leaf	
                      	    if(TK_1 != null) {
                      			Leaf TK_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      	 		TK_1Leaf.setKind("TOKEN");
                      	 		TK_1Leaf.setValue(TK_1.getText());
                      			TK_1Leaf.setPos(TK_1.getCharPositionInLine());
                      			TK_1Leaf.setLine(TK_1.getLine());
                      	 		data_typeReturnNode.getChildren().add(TK_1Leaf);
                      	 	}
                      	    // Create a Token CST Leaf	
                      	    if(TK_2 != null) {
                      			Leaf TK_2Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      	 		TK_2Leaf.setKind("TOKEN");
                      	 		TK_2Leaf.setValue(TK_2.getText());
                      			TK_2Leaf.setPos(TK_2.getCharPositionInLine());
                      			TK_2Leaf.setLine(TK_2.getLine());
                      	 		data_typeReturnNode.getChildren().add(TK_2Leaf);
                      	 	}
                      	    // Create a Token CST Leaf	
                      	    if(TK_3 != null) {
                      			Leaf TK_3Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      	 		TK_3Leaf.setKind("TOKEN");
                      	 		TK_3Leaf.setValue(TK_3.getText());
                      			TK_3Leaf.setPos(TK_3.getCharPositionInLine());
                      			TK_3Leaf.setLine(TK_3.getLine());
                      	 		data_typeReturnNode.getChildren().add(TK_3Leaf);
                      	 	}
                      	    // Create a CST Leaf
                      		if(IDGen != null) {
                      			Leaf IDGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      			IDGenLeaf.setKind("ID");
                      			IDGenLeaf.setValue(IDGen.getText());
                      			IDGenLeaf.setPos(IDGen.getCharPositionInLine());
                      			IDGenLeaf.setLine(IDGen.getLine());
                      			data_typeReturnNode.getChildren().add(IDGenLeaf);
                      		}
                      	    // Create a Token CST Leaf	
                      	    if(TK_4 != null) {
                      			Leaf TK_4Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      	 		TK_4Leaf.setKind("TOKEN");
                      	 		TK_4Leaf.setValue(TK_4.getText());
                      			TK_4Leaf.setPos(TK_4.getCharPositionInLine());
                      			TK_4Leaf.setLine(TK_4.getLine());
                      	 		data_typeReturnNode.getChildren().add(TK_4Leaf);
                      	 	}
                      	    // Create a CST Leaf
                      		if(IDGen_1 != null) {
                      			Leaf IDGen_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      			IDGen_1Leaf.setKind("ID");
                      			IDGen_1Leaf.setValue(IDGen_1.getText());
                      			IDGen_1Leaf.setPos(IDGen_1.getCharPositionInLine());
                      			IDGen_1Leaf.setLine(IDGen_1.getLine());
                      			data_typeReturnNode.getChildren().add(IDGen_1Leaf);
                      		}
                      		// Returns the Node with CST Leaves/Nodes
                      		retval.returnNode = data_typeReturnNode;
                      	
                    }

                    }
                    break;
                case 29 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:2863:7: TK_0= 'LONGTEXT' (TK_1= 'BYNARY' )? (TK_2= 'CHARACTER' TK_3= 'SET' IDGen= ID )? (TK_4= 'COLLATE' IDGen_1= ID )?
                    {
                    TK_0=(Token)input.LT(1);
                    match(input,96,FOLLOW_96_in_data_type2053); if (failed) return retval;
                    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:2863:23: (TK_1= 'BYNARY' )?
                    int alt97=2;
                    int LA97_0 = input.LA(1);

                    if ( (LA97_0==93) ) {
                        alt97=1;
                    }
                    switch (alt97) {
                        case 1 :
                            // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:2863:24: TK_1= 'BYNARY'
                            {
                            TK_1=(Token)input.LT(1);
                            match(input,93,FOLLOW_93_in_data_type2058); if (failed) return retval;

                            }
                            break;

                    }

                    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:2863:40: (TK_2= 'CHARACTER' TK_3= 'SET' IDGen= ID )?
                    int alt98=2;
                    int LA98_0 = input.LA(1);

                    if ( (LA98_0==34) ) {
                        alt98=1;
                    }
                    switch (alt98) {
                        case 1 :
                            // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:2863:41: TK_2= 'CHARACTER' TK_3= 'SET' IDGen= ID
                            {
                            TK_2=(Token)input.LT(1);
                            match(input,34,FOLLOW_34_in_data_type2065); if (failed) return retval;
                            TK_3=(Token)input.LT(1);
                            match(input,19,FOLLOW_19_in_data_type2069); if (failed) return retval;
                            IDGen=(Token)input.LT(1);
                            match(input,ID,FOLLOW_ID_in_data_type2073); if (failed) return retval;

                            }
                            break;

                    }

                    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:2863:80: (TK_4= 'COLLATE' IDGen_1= ID )?
                    int alt99=2;
                    int LA99_0 = input.LA(1);

                    if ( (LA99_0==35) ) {
                        alt99=1;
                    }
                    switch (alt99) {
                        case 1 :
                            // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:2863:81: TK_4= 'COLLATE' IDGen_1= ID
                            {
                            TK_4=(Token)input.LT(1);
                            match(input,35,FOLLOW_35_in_data_type2080); if (failed) return retval;
                            IDGen_1=(Token)input.LT(1);
                            match(input,ID,FOLLOW_ID_in_data_type2084); if (failed) return retval;

                            }
                            break;

                    }

                    if ( backtracking==0 ) {
                      
                      		// Create return CST Node
                      		Node data_typeReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                      		data_typeReturnNode.setKind("data_type");
                      	    // Create a Token CST Leaf	
                      	    if(TK_0 != null) {
                      			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      	 		TK_0Leaf.setKind("TOKEN");
                      	 		TK_0Leaf.setValue(TK_0.getText());
                      			TK_0Leaf.setPos(TK_0.getCharPositionInLine());
                      			TK_0Leaf.setLine(TK_0.getLine());
                      	 		data_typeReturnNode.getChildren().add(TK_0Leaf);
                      	 	}
                      	    // Create a Token CST Leaf	
                      	    if(TK_1 != null) {
                      			Leaf TK_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      	 		TK_1Leaf.setKind("TOKEN");
                      	 		TK_1Leaf.setValue(TK_1.getText());
                      			TK_1Leaf.setPos(TK_1.getCharPositionInLine());
                      			TK_1Leaf.setLine(TK_1.getLine());
                      	 		data_typeReturnNode.getChildren().add(TK_1Leaf);
                      	 	}
                      	    // Create a Token CST Leaf	
                      	    if(TK_2 != null) {
                      			Leaf TK_2Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      	 		TK_2Leaf.setKind("TOKEN");
                      	 		TK_2Leaf.setValue(TK_2.getText());
                      			TK_2Leaf.setPos(TK_2.getCharPositionInLine());
                      			TK_2Leaf.setLine(TK_2.getLine());
                      	 		data_typeReturnNode.getChildren().add(TK_2Leaf);
                      	 	}
                      	    // Create a Token CST Leaf	
                      	    if(TK_3 != null) {
                      			Leaf TK_3Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      	 		TK_3Leaf.setKind("TOKEN");
                      	 		TK_3Leaf.setValue(TK_3.getText());
                      			TK_3Leaf.setPos(TK_3.getCharPositionInLine());
                      			TK_3Leaf.setLine(TK_3.getLine());
                      	 		data_typeReturnNode.getChildren().add(TK_3Leaf);
                      	 	}
                      	    // Create a CST Leaf
                      		if(IDGen != null) {
                      			Leaf IDGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      			IDGenLeaf.setKind("ID");
                      			IDGenLeaf.setValue(IDGen.getText());
                      			IDGenLeaf.setPos(IDGen.getCharPositionInLine());
                      			IDGenLeaf.setLine(IDGen.getLine());
                      			data_typeReturnNode.getChildren().add(IDGenLeaf);
                      		}
                      	    // Create a Token CST Leaf	
                      	    if(TK_4 != null) {
                      			Leaf TK_4Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      	 		TK_4Leaf.setKind("TOKEN");
                      	 		TK_4Leaf.setValue(TK_4.getText());
                      			TK_4Leaf.setPos(TK_4.getCharPositionInLine());
                      			TK_4Leaf.setLine(TK_4.getLine());
                      	 		data_typeReturnNode.getChildren().add(TK_4Leaf);
                      	 	}
                      	    // Create a CST Leaf
                      		if(IDGen_1 != null) {
                      			Leaf IDGen_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      			IDGen_1Leaf.setKind("ID");
                      			IDGen_1Leaf.setValue(IDGen_1.getText());
                      			IDGen_1Leaf.setPos(IDGen_1.getCharPositionInLine());
                      			IDGen_1Leaf.setLine(IDGen_1.getLine());
                      			data_typeReturnNode.getChildren().add(IDGen_1Leaf);
                      		}
                      		// Returns the Node with CST Leaves/Nodes
                      		retval.returnNode = data_typeReturnNode;
                      	
                    }

                    }
                    break;
                case 30 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:2934:7: TK_0= 'ENUM' TK_1= '(' QVALUEGen= QVALUE (TK_2= ',' QVALUEGen_1_List+= QVALUE )* TK_3= ')' (TK_4= 'CHARACTER' TK_5= 'SET' IDGen= ID )? (TK_6= 'COLLATE' IDGen_1= ID )?
                    {
                    TK_0=(Token)input.LT(1);
                    match(input,97,FOLLOW_97_in_data_type2100); if (failed) return retval;
                    TK_1=(Token)input.LT(1);
                    match(input,38,FOLLOW_38_in_data_type2104); if (failed) return retval;
                    QVALUEGen=(Token)input.LT(1);
                    match(input,QVALUE,FOLLOW_QVALUE_in_data_type2108); if (failed) return retval;
                    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:2934:45: (TK_2= ',' QVALUEGen_1_List+= QVALUE )*
                    loop100:
                    do {
                        int alt100=2;
                        int LA100_0 = input.LA(1);

                        if ( (LA100_0==20) ) {
                            alt100=1;
                        }


                        switch (alt100) {
                    	case 1 :
                    	    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:2934:46: TK_2= ',' QVALUEGen_1_List+= QVALUE
                    	    {
                    	    TK_2=(Token)input.LT(1);
                    	    match(input,20,FOLLOW_20_in_data_type2113); if (failed) return retval;
                    	    QVALUEGen_1_List=(Token)input.LT(1);
                    	    match(input,QVALUE,FOLLOW_QVALUE_in_data_type2117); if (failed) return retval;
                    	    if (list_QVALUEGen_1_List==null) list_QVALUEGen_1_List=new ArrayList();
                    	    list_QVALUEGen_1_List.add(QVALUEGen_1_List);


                    	    }
                    	    break;

                    	default :
                    	    break loop100;
                        }
                    } while (true);

                    TK_3=(Token)input.LT(1);
                    match(input,39,FOLLOW_39_in_data_type2123); if (failed) return retval;
                    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:2934:91: (TK_4= 'CHARACTER' TK_5= 'SET' IDGen= ID )?
                    int alt101=2;
                    int LA101_0 = input.LA(1);

                    if ( (LA101_0==34) ) {
                        alt101=1;
                    }
                    switch (alt101) {
                        case 1 :
                            // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:2934:92: TK_4= 'CHARACTER' TK_5= 'SET' IDGen= ID
                            {
                            TK_4=(Token)input.LT(1);
                            match(input,34,FOLLOW_34_in_data_type2128); if (failed) return retval;
                            TK_5=(Token)input.LT(1);
                            match(input,19,FOLLOW_19_in_data_type2132); if (failed) return retval;
                            IDGen=(Token)input.LT(1);
                            match(input,ID,FOLLOW_ID_in_data_type2136); if (failed) return retval;

                            }
                            break;

                    }

                    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:2934:131: (TK_6= 'COLLATE' IDGen_1= ID )?
                    int alt102=2;
                    int LA102_0 = input.LA(1);

                    if ( (LA102_0==35) ) {
                        alt102=1;
                    }
                    switch (alt102) {
                        case 1 :
                            // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:2934:132: TK_6= 'COLLATE' IDGen_1= ID
                            {
                            TK_6=(Token)input.LT(1);
                            match(input,35,FOLLOW_35_in_data_type2143); if (failed) return retval;
                            IDGen_1=(Token)input.LT(1);
                            match(input,ID,FOLLOW_ID_in_data_type2147); if (failed) return retval;

                            }
                            break;

                    }

                    if ( backtracking==0 ) {
                      
                      		// Create return CST Node
                      		Node data_typeReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                      		data_typeReturnNode.setKind("data_type");
                      	    // Create a Token CST Leaf	
                      	    if(TK_0 != null) {
                      			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      	 		TK_0Leaf.setKind("TOKEN");
                      	 		TK_0Leaf.setValue(TK_0.getText());
                      			TK_0Leaf.setPos(TK_0.getCharPositionInLine());
                      			TK_0Leaf.setLine(TK_0.getLine());
                      	 		data_typeReturnNode.getChildren().add(TK_0Leaf);
                      	 	}
                      	    // Create a Token CST Leaf	
                      	    if(TK_1 != null) {
                      			Leaf TK_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      	 		TK_1Leaf.setKind("TOKEN");
                      	 		TK_1Leaf.setValue(TK_1.getText());
                      			TK_1Leaf.setPos(TK_1.getCharPositionInLine());
                      			TK_1Leaf.setLine(TK_1.getLine());
                      	 		data_typeReturnNode.getChildren().add(TK_1Leaf);
                      	 	}
                      	    // Create a CST Leaf
                      		if(QVALUEGen != null) {
                      			Leaf QVALUEGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      			QVALUEGenLeaf.setKind("QVALUE");
                      			QVALUEGenLeaf.setValue(QVALUEGen.getText());
                      			QVALUEGenLeaf.setPos(QVALUEGen.getCharPositionInLine());
                      			QVALUEGenLeaf.setLine(QVALUEGen.getLine());
                      			data_typeReturnNode.getChildren().add(QVALUEGenLeaf);
                      		}
                      	
                      		// Create a special CST Node for terminal QVALUEGen_1_List aggregation
                      		if(list_QVALUEGen_1_List != null) {
                      	    for(int pos = 0; pos < list_QVALUEGen_1_List.size(); pos++ )  { 
                      	    // Create a Token CST Leaf	
                      	    if(TK_2 != null) {
                      			Leaf TK_2Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      	 		TK_2Leaf.setKind("TOKEN");
                      	 		TK_2Leaf.setValue(TK_2.getText());
                      			TK_2Leaf.setPos(TK_2.getCharPositionInLine());
                      			TK_2Leaf.setLine(TK_2.getLine());
                      	 		data_typeReturnNode.getChildren().add(TK_2Leaf);
                      	 	}
                      		// Terminal extractor
                      	    if(list_QVALUEGen_1_List != null) {
                      		    Token t = (Token) list_QVALUEGen_1_List.get(pos); 
                      		    Leaf QVALUEGen_1_ListLeaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      			QVALUEGen_1_ListLeaf.setKind("QVALUE");
                      			QVALUEGen_1_ListLeaf.setValue(t.getText());
                      			QVALUEGen_1_ListLeaf.setPos(t.getCharPositionInLine());
                      			QVALUEGen_1_ListLeaf.setLine(t.getLine());
                      			data_typeReturnNode.getChildren().add(QVALUEGen_1_ListLeaf);
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
                      	 		data_typeReturnNode.getChildren().add(TK_3Leaf);
                      	 	}
                      	    // Create a Token CST Leaf	
                      	    if(TK_4 != null) {
                      			Leaf TK_4Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      	 		TK_4Leaf.setKind("TOKEN");
                      	 		TK_4Leaf.setValue(TK_4.getText());
                      			TK_4Leaf.setPos(TK_4.getCharPositionInLine());
                      			TK_4Leaf.setLine(TK_4.getLine());
                      	 		data_typeReturnNode.getChildren().add(TK_4Leaf);
                      	 	}
                      	    // Create a Token CST Leaf	
                      	    if(TK_5 != null) {
                      			Leaf TK_5Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      	 		TK_5Leaf.setKind("TOKEN");
                      	 		TK_5Leaf.setValue(TK_5.getText());
                      			TK_5Leaf.setPos(TK_5.getCharPositionInLine());
                      			TK_5Leaf.setLine(TK_5.getLine());
                      	 		data_typeReturnNode.getChildren().add(TK_5Leaf);
                      	 	}
                      	    // Create a CST Leaf
                      		if(IDGen != null) {
                      			Leaf IDGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      			IDGenLeaf.setKind("ID");
                      			IDGenLeaf.setValue(IDGen.getText());
                      			IDGenLeaf.setPos(IDGen.getCharPositionInLine());
                      			IDGenLeaf.setLine(IDGen.getLine());
                      			data_typeReturnNode.getChildren().add(IDGenLeaf);
                      		}
                      	    // Create a Token CST Leaf	
                      	    if(TK_6 != null) {
                      			Leaf TK_6Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      	 		TK_6Leaf.setKind("TOKEN");
                      	 		TK_6Leaf.setValue(TK_6.getText());
                      			TK_6Leaf.setPos(TK_6.getCharPositionInLine());
                      			TK_6Leaf.setLine(TK_6.getLine());
                      	 		data_typeReturnNode.getChildren().add(TK_6Leaf);
                      	 	}
                      	    // Create a CST Leaf
                      		if(IDGen_1 != null) {
                      			Leaf IDGen_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      			IDGen_1Leaf.setKind("ID");
                      			IDGen_1Leaf.setValue(IDGen_1.getText());
                      			IDGen_1Leaf.setPos(IDGen_1.getCharPositionInLine());
                      			IDGen_1Leaf.setLine(IDGen_1.getLine());
                      			data_typeReturnNode.getChildren().add(IDGen_1Leaf);
                      		}
                      		// Returns the Node with CST Leaves/Nodes
                      		retval.returnNode = data_typeReturnNode;
                      	
                    }

                    }
                    break;
                case 31 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:3049:7: TK_0= 'SET' TK_1= '(' QVALUEGen= QVALUE (TK_2= ',' QVALUEGen_1_List+= QVALUE )* TK_3= ')' (TK_4= 'CHARACTER' TK_5= 'SET' IDGen= ID )? (TK_6= 'COLLATE' IDGen_1= ID )?
                    {
                    TK_0=(Token)input.LT(1);
                    match(input,19,FOLLOW_19_in_data_type2163); if (failed) return retval;
                    TK_1=(Token)input.LT(1);
                    match(input,38,FOLLOW_38_in_data_type2167); if (failed) return retval;
                    QVALUEGen=(Token)input.LT(1);
                    match(input,QVALUE,FOLLOW_QVALUE_in_data_type2171); if (failed) return retval;
                    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:3049:44: (TK_2= ',' QVALUEGen_1_List+= QVALUE )*
                    loop103:
                    do {
                        int alt103=2;
                        int LA103_0 = input.LA(1);

                        if ( (LA103_0==20) ) {
                            alt103=1;
                        }


                        switch (alt103) {
                    	case 1 :
                    	    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:3049:45: TK_2= ',' QVALUEGen_1_List+= QVALUE
                    	    {
                    	    TK_2=(Token)input.LT(1);
                    	    match(input,20,FOLLOW_20_in_data_type2176); if (failed) return retval;
                    	    QVALUEGen_1_List=(Token)input.LT(1);
                    	    match(input,QVALUE,FOLLOW_QVALUE_in_data_type2180); if (failed) return retval;
                    	    if (list_QVALUEGen_1_List==null) list_QVALUEGen_1_List=new ArrayList();
                    	    list_QVALUEGen_1_List.add(QVALUEGen_1_List);


                    	    }
                    	    break;

                    	default :
                    	    break loop103;
                        }
                    } while (true);

                    TK_3=(Token)input.LT(1);
                    match(input,39,FOLLOW_39_in_data_type2186); if (failed) return retval;
                    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:3049:91: (TK_4= 'CHARACTER' TK_5= 'SET' IDGen= ID )?
                    int alt104=2;
                    int LA104_0 = input.LA(1);

                    if ( (LA104_0==34) ) {
                        alt104=1;
                    }
                    switch (alt104) {
                        case 1 :
                            // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:3049:92: TK_4= 'CHARACTER' TK_5= 'SET' IDGen= ID
                            {
                            TK_4=(Token)input.LT(1);
                            match(input,34,FOLLOW_34_in_data_type2192); if (failed) return retval;
                            TK_5=(Token)input.LT(1);
                            match(input,19,FOLLOW_19_in_data_type2196); if (failed) return retval;
                            IDGen=(Token)input.LT(1);
                            match(input,ID,FOLLOW_ID_in_data_type2200); if (failed) return retval;

                            }
                            break;

                    }

                    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:3049:131: (TK_6= 'COLLATE' IDGen_1= ID )?
                    int alt105=2;
                    int LA105_0 = input.LA(1);

                    if ( (LA105_0==35) ) {
                        alt105=1;
                    }
                    switch (alt105) {
                        case 1 :
                            // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:3049:132: TK_6= 'COLLATE' IDGen_1= ID
                            {
                            TK_6=(Token)input.LT(1);
                            match(input,35,FOLLOW_35_in_data_type2207); if (failed) return retval;
                            IDGen_1=(Token)input.LT(1);
                            match(input,ID,FOLLOW_ID_in_data_type2211); if (failed) return retval;

                            }
                            break;

                    }

                    if ( backtracking==0 ) {
                      
                      		// Create return CST Node
                      		Node data_typeReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                      		data_typeReturnNode.setKind("data_type");
                      	    // Create a Token CST Leaf	
                      	    if(TK_0 != null) {
                      			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      	 		TK_0Leaf.setKind("TOKEN");
                      	 		TK_0Leaf.setValue(TK_0.getText());
                      			TK_0Leaf.setPos(TK_0.getCharPositionInLine());
                      			TK_0Leaf.setLine(TK_0.getLine());
                      	 		data_typeReturnNode.getChildren().add(TK_0Leaf);
                      	 	}
                      	    // Create a Token CST Leaf	
                      	    if(TK_1 != null) {
                      			Leaf TK_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      	 		TK_1Leaf.setKind("TOKEN");
                      	 		TK_1Leaf.setValue(TK_1.getText());
                      			TK_1Leaf.setPos(TK_1.getCharPositionInLine());
                      			TK_1Leaf.setLine(TK_1.getLine());
                      	 		data_typeReturnNode.getChildren().add(TK_1Leaf);
                      	 	}
                      	    // Create a CST Leaf
                      		if(QVALUEGen != null) {
                      			Leaf QVALUEGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      			QVALUEGenLeaf.setKind("QVALUE");
                      			QVALUEGenLeaf.setValue(QVALUEGen.getText());
                      			QVALUEGenLeaf.setPos(QVALUEGen.getCharPositionInLine());
                      			QVALUEGenLeaf.setLine(QVALUEGen.getLine());
                      			data_typeReturnNode.getChildren().add(QVALUEGenLeaf);
                      		}
                      	
                      		// Create a special CST Node for terminal QVALUEGen_1_List aggregation
                      		if(list_QVALUEGen_1_List != null) {
                      	    for(int pos = 0; pos < list_QVALUEGen_1_List.size(); pos++ )  { 
                      	    // Create a Token CST Leaf	
                      	    if(TK_2 != null) {
                      			Leaf TK_2Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      	 		TK_2Leaf.setKind("TOKEN");
                      	 		TK_2Leaf.setValue(TK_2.getText());
                      			TK_2Leaf.setPos(TK_2.getCharPositionInLine());
                      			TK_2Leaf.setLine(TK_2.getLine());
                      	 		data_typeReturnNode.getChildren().add(TK_2Leaf);
                      	 	}
                      		// Terminal extractor
                      	    if(list_QVALUEGen_1_List != null) {
                      		    Token t = (Token) list_QVALUEGen_1_List.get(pos); 
                      		    Leaf QVALUEGen_1_ListLeaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      			QVALUEGen_1_ListLeaf.setKind("QVALUE");
                      			QVALUEGen_1_ListLeaf.setValue(t.getText());
                      			QVALUEGen_1_ListLeaf.setPos(t.getCharPositionInLine());
                      			QVALUEGen_1_ListLeaf.setLine(t.getLine());
                      			data_typeReturnNode.getChildren().add(QVALUEGen_1_ListLeaf);
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
                      	 		data_typeReturnNode.getChildren().add(TK_3Leaf);
                      	 	}
                      	    // Create a Token CST Leaf	
                      	    if(TK_4 != null) {
                      			Leaf TK_4Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      	 		TK_4Leaf.setKind("TOKEN");
                      	 		TK_4Leaf.setValue(TK_4.getText());
                      			TK_4Leaf.setPos(TK_4.getCharPositionInLine());
                      			TK_4Leaf.setLine(TK_4.getLine());
                      	 		data_typeReturnNode.getChildren().add(TK_4Leaf);
                      	 	}
                      	    // Create a Token CST Leaf	
                      	    if(TK_5 != null) {
                      			Leaf TK_5Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      	 		TK_5Leaf.setKind("TOKEN");
                      	 		TK_5Leaf.setValue(TK_5.getText());
                      			TK_5Leaf.setPos(TK_5.getCharPositionInLine());
                      			TK_5Leaf.setLine(TK_5.getLine());
                      	 		data_typeReturnNode.getChildren().add(TK_5Leaf);
                      	 	}
                      	    // Create a CST Leaf
                      		if(IDGen != null) {
                      			Leaf IDGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      			IDGenLeaf.setKind("ID");
                      			IDGenLeaf.setValue(IDGen.getText());
                      			IDGenLeaf.setPos(IDGen.getCharPositionInLine());
                      			IDGenLeaf.setLine(IDGen.getLine());
                      			data_typeReturnNode.getChildren().add(IDGenLeaf);
                      		}
                      	    // Create a Token CST Leaf	
                      	    if(TK_6 != null) {
                      			Leaf TK_6Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      	 		TK_6Leaf.setKind("TOKEN");
                      	 		TK_6Leaf.setValue(TK_6.getText());
                      			TK_6Leaf.setPos(TK_6.getCharPositionInLine());
                      			TK_6Leaf.setLine(TK_6.getLine());
                      	 		data_typeReturnNode.getChildren().add(TK_6Leaf);
                      	 	}
                      	    // Create a CST Leaf
                      		if(IDGen_1 != null) {
                      			Leaf IDGen_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      			IDGen_1Leaf.setKind("ID");
                      			IDGen_1Leaf.setValue(IDGen_1.getText());
                      			IDGen_1Leaf.setPos(IDGen_1.getCharPositionInLine());
                      			IDGen_1Leaf.setLine(IDGen_1.getLine());
                      			data_typeReturnNode.getChildren().add(IDGen_1Leaf);
                      		}
                      		// Returns the Node with CST Leaves/Nodes
                      		retval.returnNode = data_typeReturnNode;
                      	
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
    // $ANTLR end data_type

    public static class table_options_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start table_options
    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:3166:1: table_options returns [Node returnNode] : (TK_0= 'ENGINE' (TK_1= '=' )? IDGen= ID | TK_0= 'AUTO_INCREMENT' (TK_1= '=' )? NUMBERGen= NUMBER | TK_0= 'AVG_ROW_LENGTH' (TK_1= '=' )? NUMBERGen= NUMBER | (TK_0= 'DEFAULT' )? TK_1= 'CHARACTER' TK_2= 'SET' (TK_3= '=' )? IDGen= ID | (TK_0= 'DEFAULT' )? TK_1= 'CHARSET' (TK_2= '=' )? IDGen= ID | TK_0= 'CHECKSUM' (TK_1= '=' )? NUMBERGen= NUMBER | (TK_0= 'DEFAULT' )? TK_1= 'COLLATE' (TK_2= '=' )? IDGen= ID | TK_0= 'COMMENT' (TK_1= '=' )? DOUBLEQUOTEGen= DOUBLEQUOTE DQVALUEGen= DQVALUE DOUBLEQUOTEGen_1= DOUBLEQUOTE | TK_0= 'CONNECTION' (TK_1= '=' )? DOUBLEQUOTEGen= DOUBLEQUOTE DQVALUEGen= DQVALUE DOUBLEQUOTEGen_1= DOUBLEQUOTE | TK_0= 'DELAY_KEY_WRITE' (TK_1= '=' )? NUMBERGen= NUMBER | TK_0= 'INDEX DIRECTORY' (TK_1= '=' )? DOUBLEQUOTEGen= DOUBLEQUOTE DQVALUEGen= DQVALUE DOUBLEQUOTEGen_1= DOUBLEQUOTE | TK_0= 'INSERT_METHOD' (TK_1= '=' )? (TK_2= 'NO' | TK_3= 'FIRST' | TK_4= 'LAST' ) | TK_0= 'KEY_BLOCK_SIZE' (TK_1= '=' )? NUMBERGen= NUMBER | TK_0= 'MAX_ROWS' (TK_1= '=' )? NUMBERGen= NUMBER | TK_0= 'MIN_ROWS' (TK_1= '=' )? NUMBERGen= NUMBER | TK_0= 'PACK_KEYS' (TK_1= '=' )? (NUMBERGen= NUMBER | TK_2= 'DEFAULT' ) | TK_0= 'ROW_FORMAT' (TK_1= '=' )? (TK_2= 'DEFAULT' | TK_3= 'DYNAMIC' | TK_4= 'FIXED' | TK_5= 'COMPRESSED' | TK_6= 'REDUNDANT' | TK_7= 'COMPACT' ) | TK_0= 'TABLESPACE' IDGen= ID (TK_1= 'STORAGE' (TK_2= 'DISK' | TK_3= 'DEFAULT' ) )? | TK_0= 'UNION' (TK_1= '=' )? IDGen= ID (TK_2= ',' IDGen_1_List+= ID )* );
    public final table_options_return table_options() throws RecognitionException {
        table_options_return retval = new table_options_return();
        retval.start = input.LT(1);

        Token TK_0=null;
        Token TK_1=null;
        Token IDGen=null;
        Token NUMBERGen=null;
        Token TK_2=null;
        Token TK_3=null;
        Token DOUBLEQUOTEGen=null;
        Token DQVALUEGen=null;
        Token DOUBLEQUOTEGen_1=null;
        Token TK_4=null;
        Token TK_5=null;
        Token TK_6=null;
        Token TK_7=null;
        Token IDGen_1_List=null;
        List list_IDGen_1_List=null;

        try {
            // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:3167:1: (TK_0= 'ENGINE' (TK_1= '=' )? IDGen= ID | TK_0= 'AUTO_INCREMENT' (TK_1= '=' )? NUMBERGen= NUMBER | TK_0= 'AVG_ROW_LENGTH' (TK_1= '=' )? NUMBERGen= NUMBER | (TK_0= 'DEFAULT' )? TK_1= 'CHARACTER' TK_2= 'SET' (TK_3= '=' )? IDGen= ID | (TK_0= 'DEFAULT' )? TK_1= 'CHARSET' (TK_2= '=' )? IDGen= ID | TK_0= 'CHECKSUM' (TK_1= '=' )? NUMBERGen= NUMBER | (TK_0= 'DEFAULT' )? TK_1= 'COLLATE' (TK_2= '=' )? IDGen= ID | TK_0= 'COMMENT' (TK_1= '=' )? DOUBLEQUOTEGen= DOUBLEQUOTE DQVALUEGen= DQVALUE DOUBLEQUOTEGen_1= DOUBLEQUOTE | TK_0= 'CONNECTION' (TK_1= '=' )? DOUBLEQUOTEGen= DOUBLEQUOTE DQVALUEGen= DQVALUE DOUBLEQUOTEGen_1= DOUBLEQUOTE | TK_0= 'DELAY_KEY_WRITE' (TK_1= '=' )? NUMBERGen= NUMBER | TK_0= 'INDEX DIRECTORY' (TK_1= '=' )? DOUBLEQUOTEGen= DOUBLEQUOTE DQVALUEGen= DQVALUE DOUBLEQUOTEGen_1= DOUBLEQUOTE | TK_0= 'INSERT_METHOD' (TK_1= '=' )? (TK_2= 'NO' | TK_3= 'FIRST' | TK_4= 'LAST' ) | TK_0= 'KEY_BLOCK_SIZE' (TK_1= '=' )? NUMBERGen= NUMBER | TK_0= 'MAX_ROWS' (TK_1= '=' )? NUMBERGen= NUMBER | TK_0= 'MIN_ROWS' (TK_1= '=' )? NUMBERGen= NUMBER | TK_0= 'PACK_KEYS' (TK_1= '=' )? (NUMBERGen= NUMBER | TK_2= 'DEFAULT' ) | TK_0= 'ROW_FORMAT' (TK_1= '=' )? (TK_2= 'DEFAULT' | TK_3= 'DYNAMIC' | TK_4= 'FIXED' | TK_5= 'COMPRESSED' | TK_6= 'REDUNDANT' | TK_7= 'COMPACT' ) | TK_0= 'TABLESPACE' IDGen= ID (TK_1= 'STORAGE' (TK_2= 'DISK' | TK_3= 'DEFAULT' ) )? | TK_0= 'UNION' (TK_1= '=' )? IDGen= ID (TK_2= ',' IDGen_1_List+= ID )* )
            int alt134=19;
            switch ( input.LA(1) ) {
            case 98:
                {
                alt134=1;
                }
                break;
            case 49:
                {
                alt134=2;
                }
                break;
            case 99:
                {
                alt134=3;
                }
                break;
            case 33:
                {
                switch ( input.LA(2) ) {
                case 100:
                    {
                    alt134=5;
                    }
                    break;
                case 34:
                    {
                    alt134=4;
                    }
                    break;
                case 35:
                    {
                    alt134=7;
                    }
                    break;
                default:
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("3166:1: table_options returns [Node returnNode] : (TK_0= 'ENGINE' (TK_1= '=' )? IDGen= ID | TK_0= 'AUTO_INCREMENT' (TK_1= '=' )? NUMBERGen= NUMBER | TK_0= 'AVG_ROW_LENGTH' (TK_1= '=' )? NUMBERGen= NUMBER | (TK_0= 'DEFAULT' )? TK_1= 'CHARACTER' TK_2= 'SET' (TK_3= '=' )? IDGen= ID | (TK_0= 'DEFAULT' )? TK_1= 'CHARSET' (TK_2= '=' )? IDGen= ID | TK_0= 'CHECKSUM' (TK_1= '=' )? NUMBERGen= NUMBER | (TK_0= 'DEFAULT' )? TK_1= 'COLLATE' (TK_2= '=' )? IDGen= ID | TK_0= 'COMMENT' (TK_1= '=' )? DOUBLEQUOTEGen= DOUBLEQUOTE DQVALUEGen= DQVALUE DOUBLEQUOTEGen_1= DOUBLEQUOTE | TK_0= 'CONNECTION' (TK_1= '=' )? DOUBLEQUOTEGen= DOUBLEQUOTE DQVALUEGen= DQVALUE DOUBLEQUOTEGen_1= DOUBLEQUOTE | TK_0= 'DELAY_KEY_WRITE' (TK_1= '=' )? NUMBERGen= NUMBER | TK_0= 'INDEX DIRECTORY' (TK_1= '=' )? DOUBLEQUOTEGen= DOUBLEQUOTE DQVALUEGen= DQVALUE DOUBLEQUOTEGen_1= DOUBLEQUOTE | TK_0= 'INSERT_METHOD' (TK_1= '=' )? (TK_2= 'NO' | TK_3= 'FIRST' | TK_4= 'LAST' ) | TK_0= 'KEY_BLOCK_SIZE' (TK_1= '=' )? NUMBERGen= NUMBER | TK_0= 'MAX_ROWS' (TK_1= '=' )? NUMBERGen= NUMBER | TK_0= 'MIN_ROWS' (TK_1= '=' )? NUMBERGen= NUMBER | TK_0= 'PACK_KEYS' (TK_1= '=' )? (NUMBERGen= NUMBER | TK_2= 'DEFAULT' ) | TK_0= 'ROW_FORMAT' (TK_1= '=' )? (TK_2= 'DEFAULT' | TK_3= 'DYNAMIC' | TK_4= 'FIXED' | TK_5= 'COMPRESSED' | TK_6= 'REDUNDANT' | TK_7= 'COMPACT' ) | TK_0= 'TABLESPACE' IDGen= ID (TK_1= 'STORAGE' (TK_2= 'DISK' | TK_3= 'DEFAULT' ) )? | TK_0= 'UNION' (TK_1= '=' )? IDGen= ID (TK_2= ',' IDGen_1_List+= ID )* );", 134, 4, input);

                    throw nvae;
                }

                }
                break;
            case 34:
                {
                alt134=4;
                }
                break;
            case 100:
                {
                alt134=5;
                }
                break;
            case 101:
                {
                alt134=6;
                }
                break;
            case 35:
                {
                alt134=7;
                }
                break;
            case 50:
                {
                alt134=8;
                }
                break;
            case 102:
                {
                alt134=9;
                }
                break;
            case 103:
                {
                alt134=10;
                }
                break;
            case 104:
                {
                alt134=11;
                }
                break;
            case 105:
                {
                alt134=12;
                }
                break;
            case 62:
                {
                alt134=13;
                }
                break;
            case 109:
                {
                alt134=14;
                }
                break;
            case 110:
                {
                alt134=15;
                }
                break;
            case 111:
                {
                alt134=16;
                }
                break;
            case 112:
                {
                alt134=17;
                }
                break;
            case 116:
                {
                alt134=18;
                }
                break;
            case 117:
                {
                alt134=19;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("3166:1: table_options returns [Node returnNode] : (TK_0= 'ENGINE' (TK_1= '=' )? IDGen= ID | TK_0= 'AUTO_INCREMENT' (TK_1= '=' )? NUMBERGen= NUMBER | TK_0= 'AVG_ROW_LENGTH' (TK_1= '=' )? NUMBERGen= NUMBER | (TK_0= 'DEFAULT' )? TK_1= 'CHARACTER' TK_2= 'SET' (TK_3= '=' )? IDGen= ID | (TK_0= 'DEFAULT' )? TK_1= 'CHARSET' (TK_2= '=' )? IDGen= ID | TK_0= 'CHECKSUM' (TK_1= '=' )? NUMBERGen= NUMBER | (TK_0= 'DEFAULT' )? TK_1= 'COLLATE' (TK_2= '=' )? IDGen= ID | TK_0= 'COMMENT' (TK_1= '=' )? DOUBLEQUOTEGen= DOUBLEQUOTE DQVALUEGen= DQVALUE DOUBLEQUOTEGen_1= DOUBLEQUOTE | TK_0= 'CONNECTION' (TK_1= '=' )? DOUBLEQUOTEGen= DOUBLEQUOTE DQVALUEGen= DQVALUE DOUBLEQUOTEGen_1= DOUBLEQUOTE | TK_0= 'DELAY_KEY_WRITE' (TK_1= '=' )? NUMBERGen= NUMBER | TK_0= 'INDEX DIRECTORY' (TK_1= '=' )? DOUBLEQUOTEGen= DOUBLEQUOTE DQVALUEGen= DQVALUE DOUBLEQUOTEGen_1= DOUBLEQUOTE | TK_0= 'INSERT_METHOD' (TK_1= '=' )? (TK_2= 'NO' | TK_3= 'FIRST' | TK_4= 'LAST' ) | TK_0= 'KEY_BLOCK_SIZE' (TK_1= '=' )? NUMBERGen= NUMBER | TK_0= 'MAX_ROWS' (TK_1= '=' )? NUMBERGen= NUMBER | TK_0= 'MIN_ROWS' (TK_1= '=' )? NUMBERGen= NUMBER | TK_0= 'PACK_KEYS' (TK_1= '=' )? (NUMBERGen= NUMBER | TK_2= 'DEFAULT' ) | TK_0= 'ROW_FORMAT' (TK_1= '=' )? (TK_2= 'DEFAULT' | TK_3= 'DYNAMIC' | TK_4= 'FIXED' | TK_5= 'COMPRESSED' | TK_6= 'REDUNDANT' | TK_7= 'COMPACT' ) | TK_0= 'TABLESPACE' IDGen= ID (TK_1= 'STORAGE' (TK_2= 'DISK' | TK_3= 'DEFAULT' ) )? | TK_0= 'UNION' (TK_1= '=' )? IDGen= ID (TK_2= ',' IDGen_1_List+= ID )* );", 134, 0, input);

                throw nvae;
            }

            switch (alt134) {
                case 1 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:3167:3: TK_0= 'ENGINE' (TK_1= '=' )? IDGen= ID
                    {
                    TK_0=(Token)input.LT(1);
                    match(input,98,FOLLOW_98_in_table_options2233); if (failed) return retval;
                    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:3167:17: (TK_1= '=' )?
                    int alt107=2;
                    int LA107_0 = input.LA(1);

                    if ( (LA107_0==22) ) {
                        alt107=1;
                    }
                    switch (alt107) {
                        case 1 :
                            // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:3167:18: TK_1= '='
                            {
                            TK_1=(Token)input.LT(1);
                            match(input,22,FOLLOW_22_in_table_options2238); if (failed) return retval;

                            }
                            break;

                    }

                    IDGen=(Token)input.LT(1);
                    match(input,ID,FOLLOW_ID_in_table_options2244); if (failed) return retval;
                    if ( backtracking==0 ) {
                      
                      		// Create return CST Node
                      		Node table_optionsReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                      		table_optionsReturnNode.setKind("table_options");
                      	    // Create a Token CST Leaf	
                      	    if(TK_0 != null) {
                      			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      	 		TK_0Leaf.setKind("TOKEN");
                      	 		TK_0Leaf.setValue(TK_0.getText());
                      			TK_0Leaf.setPos(TK_0.getCharPositionInLine());
                      			TK_0Leaf.setLine(TK_0.getLine());
                      	 		table_optionsReturnNode.getChildren().add(TK_0Leaf);
                      	 	}
                      	    // Create a Token CST Leaf	
                      	    if(TK_1 != null) {
                      			Leaf TK_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      	 		TK_1Leaf.setKind("TOKEN");
                      	 		TK_1Leaf.setValue(TK_1.getText());
                      			TK_1Leaf.setPos(TK_1.getCharPositionInLine());
                      			TK_1Leaf.setLine(TK_1.getLine());
                      	 		table_optionsReturnNode.getChildren().add(TK_1Leaf);
                      	 	}
                      	    // Create a CST Leaf
                      		if(IDGen != null) {
                      			Leaf IDGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      			IDGenLeaf.setKind("ID");
                      			IDGenLeaf.setValue(IDGen.getText());
                      			IDGenLeaf.setPos(IDGen.getCharPositionInLine());
                      			IDGenLeaf.setLine(IDGen.getLine());
                      			table_optionsReturnNode.getChildren().add(IDGenLeaf);
                      		}
                      		// Returns the Node with CST Leaves/Nodes
                      		retval.returnNode = table_optionsReturnNode;
                      	
                    }

                    }
                    break;
                case 2 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:3202:7: TK_0= 'AUTO_INCREMENT' (TK_1= '=' )? NUMBERGen= NUMBER
                    {
                    TK_0=(Token)input.LT(1);
                    match(input,49,FOLLOW_49_in_table_options2258); if (failed) return retval;
                    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:3202:29: (TK_1= '=' )?
                    int alt108=2;
                    int LA108_0 = input.LA(1);

                    if ( (LA108_0==22) ) {
                        alt108=1;
                    }
                    switch (alt108) {
                        case 1 :
                            // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:3202:30: TK_1= '='
                            {
                            TK_1=(Token)input.LT(1);
                            match(input,22,FOLLOW_22_in_table_options2263); if (failed) return retval;

                            }
                            break;

                    }

                    NUMBERGen=(Token)input.LT(1);
                    match(input,NUMBER,FOLLOW_NUMBER_in_table_options2269); if (failed) return retval;
                    if ( backtracking==0 ) {
                      
                      		// Create return CST Node
                      		Node table_optionsReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                      		table_optionsReturnNode.setKind("table_options");
                      	    // Create a Token CST Leaf	
                      	    if(TK_0 != null) {
                      			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      	 		TK_0Leaf.setKind("TOKEN");
                      	 		TK_0Leaf.setValue(TK_0.getText());
                      			TK_0Leaf.setPos(TK_0.getCharPositionInLine());
                      			TK_0Leaf.setLine(TK_0.getLine());
                      	 		table_optionsReturnNode.getChildren().add(TK_0Leaf);
                      	 	}
                      	    // Create a Token CST Leaf	
                      	    if(TK_1 != null) {
                      			Leaf TK_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      	 		TK_1Leaf.setKind("TOKEN");
                      	 		TK_1Leaf.setValue(TK_1.getText());
                      			TK_1Leaf.setPos(TK_1.getCharPositionInLine());
                      			TK_1Leaf.setLine(TK_1.getLine());
                      	 		table_optionsReturnNode.getChildren().add(TK_1Leaf);
                      	 	}
                      	    // Create a CST Leaf
                      		if(NUMBERGen != null) {
                      			Leaf NUMBERGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      			NUMBERGenLeaf.setKind("NUMBER");
                      			NUMBERGenLeaf.setValue(NUMBERGen.getText());
                      			NUMBERGenLeaf.setPos(NUMBERGen.getCharPositionInLine());
                      			NUMBERGenLeaf.setLine(NUMBERGen.getLine());
                      			table_optionsReturnNode.getChildren().add(NUMBERGenLeaf);
                      		}
                      		// Returns the Node with CST Leaves/Nodes
                      		retval.returnNode = table_optionsReturnNode;
                      	
                    }

                    }
                    break;
                case 3 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:3237:7: TK_0= 'AVG_ROW_LENGTH' (TK_1= '=' )? NUMBERGen= NUMBER
                    {
                    TK_0=(Token)input.LT(1);
                    match(input,99,FOLLOW_99_in_table_options2283); if (failed) return retval;
                    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:3237:29: (TK_1= '=' )?
                    int alt109=2;
                    int LA109_0 = input.LA(1);

                    if ( (LA109_0==22) ) {
                        alt109=1;
                    }
                    switch (alt109) {
                        case 1 :
                            // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:3237:30: TK_1= '='
                            {
                            TK_1=(Token)input.LT(1);
                            match(input,22,FOLLOW_22_in_table_options2288); if (failed) return retval;

                            }
                            break;

                    }

                    NUMBERGen=(Token)input.LT(1);
                    match(input,NUMBER,FOLLOW_NUMBER_in_table_options2294); if (failed) return retval;
                    if ( backtracking==0 ) {
                      
                      		// Create return CST Node
                      		Node table_optionsReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                      		table_optionsReturnNode.setKind("table_options");
                      	    // Create a Token CST Leaf	
                      	    if(TK_0 != null) {
                      			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      	 		TK_0Leaf.setKind("TOKEN");
                      	 		TK_0Leaf.setValue(TK_0.getText());
                      			TK_0Leaf.setPos(TK_0.getCharPositionInLine());
                      			TK_0Leaf.setLine(TK_0.getLine());
                      	 		table_optionsReturnNode.getChildren().add(TK_0Leaf);
                      	 	}
                      	    // Create a Token CST Leaf	
                      	    if(TK_1 != null) {
                      			Leaf TK_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      	 		TK_1Leaf.setKind("TOKEN");
                      	 		TK_1Leaf.setValue(TK_1.getText());
                      			TK_1Leaf.setPos(TK_1.getCharPositionInLine());
                      			TK_1Leaf.setLine(TK_1.getLine());
                      	 		table_optionsReturnNode.getChildren().add(TK_1Leaf);
                      	 	}
                      	    // Create a CST Leaf
                      		if(NUMBERGen != null) {
                      			Leaf NUMBERGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      			NUMBERGenLeaf.setKind("NUMBER");
                      			NUMBERGenLeaf.setValue(NUMBERGen.getText());
                      			NUMBERGenLeaf.setPos(NUMBERGen.getCharPositionInLine());
                      			NUMBERGenLeaf.setLine(NUMBERGen.getLine());
                      			table_optionsReturnNode.getChildren().add(NUMBERGenLeaf);
                      		}
                      		// Returns the Node with CST Leaves/Nodes
                      		retval.returnNode = table_optionsReturnNode;
                      	
                    }

                    }
                    break;
                case 4 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:3272:7: (TK_0= 'DEFAULT' )? TK_1= 'CHARACTER' TK_2= 'SET' (TK_3= '=' )? IDGen= ID
                    {
                    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:3272:7: (TK_0= 'DEFAULT' )?
                    int alt110=2;
                    int LA110_0 = input.LA(1);

                    if ( (LA110_0==33) ) {
                        alt110=1;
                    }
                    switch (alt110) {
                        case 1 :
                            // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:3272:8: TK_0= 'DEFAULT'
                            {
                            TK_0=(Token)input.LT(1);
                            match(input,33,FOLLOW_33_in_table_options2309); if (failed) return retval;

                            }
                            break;

                    }

                    TK_1=(Token)input.LT(1);
                    match(input,34,FOLLOW_34_in_table_options2315); if (failed) return retval;
                    TK_2=(Token)input.LT(1);
                    match(input,19,FOLLOW_19_in_table_options2319); if (failed) return retval;
                    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:3272:53: (TK_3= '=' )?
                    int alt111=2;
                    int LA111_0 = input.LA(1);

                    if ( (LA111_0==22) ) {
                        alt111=1;
                    }
                    switch (alt111) {
                        case 1 :
                            // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:3272:54: TK_3= '='
                            {
                            TK_3=(Token)input.LT(1);
                            match(input,22,FOLLOW_22_in_table_options2324); if (failed) return retval;

                            }
                            break;

                    }

                    IDGen=(Token)input.LT(1);
                    match(input,ID,FOLLOW_ID_in_table_options2330); if (failed) return retval;
                    if ( backtracking==0 ) {
                      
                      		// Create return CST Node
                      		Node table_optionsReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                      		table_optionsReturnNode.setKind("table_options");
                      	    // Create a Token CST Leaf	
                      	    if(TK_0 != null) {
                      			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      	 		TK_0Leaf.setKind("TOKEN");
                      	 		TK_0Leaf.setValue(TK_0.getText());
                      			TK_0Leaf.setPos(TK_0.getCharPositionInLine());
                      			TK_0Leaf.setLine(TK_0.getLine());
                      	 		table_optionsReturnNode.getChildren().add(TK_0Leaf);
                      	 	}
                      	    // Create a Token CST Leaf	
                      	    if(TK_1 != null) {
                      			Leaf TK_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      	 		TK_1Leaf.setKind("TOKEN");
                      	 		TK_1Leaf.setValue(TK_1.getText());
                      			TK_1Leaf.setPos(TK_1.getCharPositionInLine());
                      			TK_1Leaf.setLine(TK_1.getLine());
                      	 		table_optionsReturnNode.getChildren().add(TK_1Leaf);
                      	 	}
                      	    // Create a Token CST Leaf	
                      	    if(TK_2 != null) {
                      			Leaf TK_2Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      	 		TK_2Leaf.setKind("TOKEN");
                      	 		TK_2Leaf.setValue(TK_2.getText());
                      			TK_2Leaf.setPos(TK_2.getCharPositionInLine());
                      			TK_2Leaf.setLine(TK_2.getLine());
                      	 		table_optionsReturnNode.getChildren().add(TK_2Leaf);
                      	 	}
                      	    // Create a Token CST Leaf	
                      	    if(TK_3 != null) {
                      			Leaf TK_3Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      	 		TK_3Leaf.setKind("TOKEN");
                      	 		TK_3Leaf.setValue(TK_3.getText());
                      			TK_3Leaf.setPos(TK_3.getCharPositionInLine());
                      			TK_3Leaf.setLine(TK_3.getLine());
                      	 		table_optionsReturnNode.getChildren().add(TK_3Leaf);
                      	 	}
                      	    // Create a CST Leaf
                      		if(IDGen != null) {
                      			Leaf IDGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      			IDGenLeaf.setKind("ID");
                      			IDGenLeaf.setValue(IDGen.getText());
                      			IDGenLeaf.setPos(IDGen.getCharPositionInLine());
                      			IDGenLeaf.setLine(IDGen.getLine());
                      			table_optionsReturnNode.getChildren().add(IDGenLeaf);
                      		}
                      		// Returns the Node with CST Leaves/Nodes
                      		retval.returnNode = table_optionsReturnNode;
                      	
                    }

                    }
                    break;
                case 5 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:3325:7: (TK_0= 'DEFAULT' )? TK_1= 'CHARSET' (TK_2= '=' )? IDGen= ID
                    {
                    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:3325:7: (TK_0= 'DEFAULT' )?
                    int alt112=2;
                    int LA112_0 = input.LA(1);

                    if ( (LA112_0==33) ) {
                        alt112=1;
                    }
                    switch (alt112) {
                        case 1 :
                            // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:3325:8: TK_0= 'DEFAULT'
                            {
                            TK_0=(Token)input.LT(1);
                            match(input,33,FOLLOW_33_in_table_options2345); if (failed) return retval;

                            }
                            break;

                    }

                    TK_1=(Token)input.LT(1);
                    match(input,100,FOLLOW_100_in_table_options2351); if (failed) return retval;
                    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:3325:40: (TK_2= '=' )?
                    int alt113=2;
                    int LA113_0 = input.LA(1);

                    if ( (LA113_0==22) ) {
                        alt113=1;
                    }
                    switch (alt113) {
                        case 1 :
                            // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:3325:41: TK_2= '='
                            {
                            TK_2=(Token)input.LT(1);
                            match(input,22,FOLLOW_22_in_table_options2356); if (failed) return retval;

                            }
                            break;

                    }

                    IDGen=(Token)input.LT(1);
                    match(input,ID,FOLLOW_ID_in_table_options2362); if (failed) return retval;
                    if ( backtracking==0 ) {
                      
                      		// Create return CST Node
                      		Node table_optionsReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                      		table_optionsReturnNode.setKind("table_options");
                      	    // Create a Token CST Leaf	
                      	    if(TK_0 != null) {
                      			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      	 		TK_0Leaf.setKind("TOKEN");
                      	 		TK_0Leaf.setValue(TK_0.getText());
                      			TK_0Leaf.setPos(TK_0.getCharPositionInLine());
                      			TK_0Leaf.setLine(TK_0.getLine());
                      	 		table_optionsReturnNode.getChildren().add(TK_0Leaf);
                      	 	}
                      	    // Create a Token CST Leaf	
                      	    if(TK_1 != null) {
                      			Leaf TK_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      	 		TK_1Leaf.setKind("TOKEN");
                      	 		TK_1Leaf.setValue(TK_1.getText());
                      			TK_1Leaf.setPos(TK_1.getCharPositionInLine());
                      			TK_1Leaf.setLine(TK_1.getLine());
                      	 		table_optionsReturnNode.getChildren().add(TK_1Leaf);
                      	 	}
                      	    // Create a Token CST Leaf	
                      	    if(TK_2 != null) {
                      			Leaf TK_2Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      	 		TK_2Leaf.setKind("TOKEN");
                      	 		TK_2Leaf.setValue(TK_2.getText());
                      			TK_2Leaf.setPos(TK_2.getCharPositionInLine());
                      			TK_2Leaf.setLine(TK_2.getLine());
                      	 		table_optionsReturnNode.getChildren().add(TK_2Leaf);
                      	 	}
                      	    // Create a CST Leaf
                      		if(IDGen != null) {
                      			Leaf IDGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      			IDGenLeaf.setKind("ID");
                      			IDGenLeaf.setValue(IDGen.getText());
                      			IDGenLeaf.setPos(IDGen.getCharPositionInLine());
                      			IDGenLeaf.setLine(IDGen.getLine());
                      			table_optionsReturnNode.getChildren().add(IDGenLeaf);
                      		}
                      		// Returns the Node with CST Leaves/Nodes
                      		retval.returnNode = table_optionsReturnNode;
                      	
                    }

                    }
                    break;
                case 6 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:3369:7: TK_0= 'CHECKSUM' (TK_1= '=' )? NUMBERGen= NUMBER
                    {
                    TK_0=(Token)input.LT(1);
                    match(input,101,FOLLOW_101_in_table_options2376); if (failed) return retval;
                    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:3369:23: (TK_1= '=' )?
                    int alt114=2;
                    int LA114_0 = input.LA(1);

                    if ( (LA114_0==22) ) {
                        alt114=1;
                    }
                    switch (alt114) {
                        case 1 :
                            // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:3369:24: TK_1= '='
                            {
                            TK_1=(Token)input.LT(1);
                            match(input,22,FOLLOW_22_in_table_options2381); if (failed) return retval;

                            }
                            break;

                    }

                    NUMBERGen=(Token)input.LT(1);
                    match(input,NUMBER,FOLLOW_NUMBER_in_table_options2387); if (failed) return retval;
                    if ( backtracking==0 ) {
                      
                      		// Create return CST Node
                      		Node table_optionsReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                      		table_optionsReturnNode.setKind("table_options");
                      	    // Create a Token CST Leaf	
                      	    if(TK_0 != null) {
                      			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      	 		TK_0Leaf.setKind("TOKEN");
                      	 		TK_0Leaf.setValue(TK_0.getText());
                      			TK_0Leaf.setPos(TK_0.getCharPositionInLine());
                      			TK_0Leaf.setLine(TK_0.getLine());
                      	 		table_optionsReturnNode.getChildren().add(TK_0Leaf);
                      	 	}
                      	    // Create a Token CST Leaf	
                      	    if(TK_1 != null) {
                      			Leaf TK_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      	 		TK_1Leaf.setKind("TOKEN");
                      	 		TK_1Leaf.setValue(TK_1.getText());
                      			TK_1Leaf.setPos(TK_1.getCharPositionInLine());
                      			TK_1Leaf.setLine(TK_1.getLine());
                      	 		table_optionsReturnNode.getChildren().add(TK_1Leaf);
                      	 	}
                      	    // Create a CST Leaf
                      		if(NUMBERGen != null) {
                      			Leaf NUMBERGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      			NUMBERGenLeaf.setKind("NUMBER");
                      			NUMBERGenLeaf.setValue(NUMBERGen.getText());
                      			NUMBERGenLeaf.setPos(NUMBERGen.getCharPositionInLine());
                      			NUMBERGenLeaf.setLine(NUMBERGen.getLine());
                      			table_optionsReturnNode.getChildren().add(NUMBERGenLeaf);
                      		}
                      		// Returns the Node with CST Leaves/Nodes
                      		retval.returnNode = table_optionsReturnNode;
                      	
                    }

                    }
                    break;
                case 7 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:3404:7: (TK_0= 'DEFAULT' )? TK_1= 'COLLATE' (TK_2= '=' )? IDGen= ID
                    {
                    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:3404:7: (TK_0= 'DEFAULT' )?
                    int alt115=2;
                    int LA115_0 = input.LA(1);

                    if ( (LA115_0==33) ) {
                        alt115=1;
                    }
                    switch (alt115) {
                        case 1 :
                            // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:3404:8: TK_0= 'DEFAULT'
                            {
                            TK_0=(Token)input.LT(1);
                            match(input,33,FOLLOW_33_in_table_options2402); if (failed) return retval;

                            }
                            break;

                    }

                    TK_1=(Token)input.LT(1);
                    match(input,35,FOLLOW_35_in_table_options2408); if (failed) return retval;
                    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:3404:40: (TK_2= '=' )?
                    int alt116=2;
                    int LA116_0 = input.LA(1);

                    if ( (LA116_0==22) ) {
                        alt116=1;
                    }
                    switch (alt116) {
                        case 1 :
                            // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:3404:41: TK_2= '='
                            {
                            TK_2=(Token)input.LT(1);
                            match(input,22,FOLLOW_22_in_table_options2413); if (failed) return retval;

                            }
                            break;

                    }

                    IDGen=(Token)input.LT(1);
                    match(input,ID,FOLLOW_ID_in_table_options2419); if (failed) return retval;
                    if ( backtracking==0 ) {
                      
                      		// Create return CST Node
                      		Node table_optionsReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                      		table_optionsReturnNode.setKind("table_options");
                      	    // Create a Token CST Leaf	
                      	    if(TK_0 != null) {
                      			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      	 		TK_0Leaf.setKind("TOKEN");
                      	 		TK_0Leaf.setValue(TK_0.getText());
                      			TK_0Leaf.setPos(TK_0.getCharPositionInLine());
                      			TK_0Leaf.setLine(TK_0.getLine());
                      	 		table_optionsReturnNode.getChildren().add(TK_0Leaf);
                      	 	}
                      	    // Create a Token CST Leaf	
                      	    if(TK_1 != null) {
                      			Leaf TK_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      	 		TK_1Leaf.setKind("TOKEN");
                      	 		TK_1Leaf.setValue(TK_1.getText());
                      			TK_1Leaf.setPos(TK_1.getCharPositionInLine());
                      			TK_1Leaf.setLine(TK_1.getLine());
                      	 		table_optionsReturnNode.getChildren().add(TK_1Leaf);
                      	 	}
                      	    // Create a Token CST Leaf	
                      	    if(TK_2 != null) {
                      			Leaf TK_2Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      	 		TK_2Leaf.setKind("TOKEN");
                      	 		TK_2Leaf.setValue(TK_2.getText());
                      			TK_2Leaf.setPos(TK_2.getCharPositionInLine());
                      			TK_2Leaf.setLine(TK_2.getLine());
                      	 		table_optionsReturnNode.getChildren().add(TK_2Leaf);
                      	 	}
                      	    // Create a CST Leaf
                      		if(IDGen != null) {
                      			Leaf IDGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      			IDGenLeaf.setKind("ID");
                      			IDGenLeaf.setValue(IDGen.getText());
                      			IDGenLeaf.setPos(IDGen.getCharPositionInLine());
                      			IDGenLeaf.setLine(IDGen.getLine());
                      			table_optionsReturnNode.getChildren().add(IDGenLeaf);
                      		}
                      		// Returns the Node with CST Leaves/Nodes
                      		retval.returnNode = table_optionsReturnNode;
                      	
                    }

                    }
                    break;
                case 8 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:3448:6: TK_0= 'COMMENT' (TK_1= '=' )? DOUBLEQUOTEGen= DOUBLEQUOTE DQVALUEGen= DQVALUE DOUBLEQUOTEGen_1= DOUBLEQUOTE
                    {
                    TK_0=(Token)input.LT(1);
                    match(input,50,FOLLOW_50_in_table_options2432); if (failed) return retval;
                    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:3448:21: (TK_1= '=' )?
                    int alt117=2;
                    int LA117_0 = input.LA(1);

                    if ( (LA117_0==22) ) {
                        alt117=1;
                    }
                    switch (alt117) {
                        case 1 :
                            // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:3448:22: TK_1= '='
                            {
                            TK_1=(Token)input.LT(1);
                            match(input,22,FOLLOW_22_in_table_options2437); if (failed) return retval;

                            }
                            break;

                    }

                    DOUBLEQUOTEGen=(Token)input.LT(1);
                    match(input,DOUBLEQUOTE,FOLLOW_DOUBLEQUOTE_in_table_options2443); if (failed) return retval;
                    DQVALUEGen=(Token)input.LT(1);
                    match(input,DQVALUE,FOLLOW_DQVALUE_in_table_options2447); if (failed) return retval;
                    DOUBLEQUOTEGen_1=(Token)input.LT(1);
                    match(input,DOUBLEQUOTE,FOLLOW_DOUBLEQUOTE_in_table_options2451); if (failed) return retval;
                    if ( backtracking==0 ) {
                      
                      		// Create return CST Node
                      		Node table_optionsReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                      		table_optionsReturnNode.setKind("table_options");
                      	    // Create a Token CST Leaf	
                      	    if(TK_0 != null) {
                      			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      	 		TK_0Leaf.setKind("TOKEN");
                      	 		TK_0Leaf.setValue(TK_0.getText());
                      			TK_0Leaf.setPos(TK_0.getCharPositionInLine());
                      			TK_0Leaf.setLine(TK_0.getLine());
                      	 		table_optionsReturnNode.getChildren().add(TK_0Leaf);
                      	 	}
                      	    // Create a Token CST Leaf	
                      	    if(TK_1 != null) {
                      			Leaf TK_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      	 		TK_1Leaf.setKind("TOKEN");
                      	 		TK_1Leaf.setValue(TK_1.getText());
                      			TK_1Leaf.setPos(TK_1.getCharPositionInLine());
                      			TK_1Leaf.setLine(TK_1.getLine());
                      	 		table_optionsReturnNode.getChildren().add(TK_1Leaf);
                      	 	}
                      	    // Create a CST Leaf
                      		if(DOUBLEQUOTEGen != null) {
                      			Leaf DOUBLEQUOTEGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      			DOUBLEQUOTEGenLeaf.setKind("DOUBLEQUOTE");
                      			DOUBLEQUOTEGenLeaf.setValue(DOUBLEQUOTEGen.getText());
                      			DOUBLEQUOTEGenLeaf.setPos(DOUBLEQUOTEGen.getCharPositionInLine());
                      			DOUBLEQUOTEGenLeaf.setLine(DOUBLEQUOTEGen.getLine());
                      			table_optionsReturnNode.getChildren().add(DOUBLEQUOTEGenLeaf);
                      		}
                      	    // Create a CST Leaf
                      		if(DQVALUEGen != null) {
                      			Leaf DQVALUEGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      			DQVALUEGenLeaf.setKind("DQVALUE");
                      			DQVALUEGenLeaf.setValue(DQVALUEGen.getText());
                      			DQVALUEGenLeaf.setPos(DQVALUEGen.getCharPositionInLine());
                      			DQVALUEGenLeaf.setLine(DQVALUEGen.getLine());
                      			table_optionsReturnNode.getChildren().add(DQVALUEGenLeaf);
                      		}
                      	    // Create a CST Leaf
                      		if(DOUBLEQUOTEGen_1 != null) {
                      			Leaf DOUBLEQUOTEGen_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      			DOUBLEQUOTEGen_1Leaf.setKind("DOUBLEQUOTE");
                      			DOUBLEQUOTEGen_1Leaf.setValue(DOUBLEQUOTEGen_1.getText());
                      			DOUBLEQUOTEGen_1Leaf.setPos(DOUBLEQUOTEGen_1.getCharPositionInLine());
                      			DOUBLEQUOTEGen_1Leaf.setLine(DOUBLEQUOTEGen_1.getLine());
                      			table_optionsReturnNode.getChildren().add(DOUBLEQUOTEGen_1Leaf);
                      		}
                      		// Returns the Node with CST Leaves/Nodes
                      		retval.returnNode = table_optionsReturnNode;
                      	
                    }

                    }
                    break;
                case 9 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:3501:7: TK_0= 'CONNECTION' (TK_1= '=' )? DOUBLEQUOTEGen= DOUBLEQUOTE DQVALUEGen= DQVALUE DOUBLEQUOTEGen_1= DOUBLEQUOTE
                    {
                    TK_0=(Token)input.LT(1);
                    match(input,102,FOLLOW_102_in_table_options2465); if (failed) return retval;
                    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:3501:25: (TK_1= '=' )?
                    int alt118=2;
                    int LA118_0 = input.LA(1);

                    if ( (LA118_0==22) ) {
                        alt118=1;
                    }
                    switch (alt118) {
                        case 1 :
                            // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:3501:26: TK_1= '='
                            {
                            TK_1=(Token)input.LT(1);
                            match(input,22,FOLLOW_22_in_table_options2470); if (failed) return retval;

                            }
                            break;

                    }

                    DOUBLEQUOTEGen=(Token)input.LT(1);
                    match(input,DOUBLEQUOTE,FOLLOW_DOUBLEQUOTE_in_table_options2476); if (failed) return retval;
                    DQVALUEGen=(Token)input.LT(1);
                    match(input,DQVALUE,FOLLOW_DQVALUE_in_table_options2480); if (failed) return retval;
                    DOUBLEQUOTEGen_1=(Token)input.LT(1);
                    match(input,DOUBLEQUOTE,FOLLOW_DOUBLEQUOTE_in_table_options2484); if (failed) return retval;
                    if ( backtracking==0 ) {
                      
                      		// Create return CST Node
                      		Node table_optionsReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                      		table_optionsReturnNode.setKind("table_options");
                      	    // Create a Token CST Leaf	
                      	    if(TK_0 != null) {
                      			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      	 		TK_0Leaf.setKind("TOKEN");
                      	 		TK_0Leaf.setValue(TK_0.getText());
                      			TK_0Leaf.setPos(TK_0.getCharPositionInLine());
                      			TK_0Leaf.setLine(TK_0.getLine());
                      	 		table_optionsReturnNode.getChildren().add(TK_0Leaf);
                      	 	}
                      	    // Create a Token CST Leaf	
                      	    if(TK_1 != null) {
                      			Leaf TK_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      	 		TK_1Leaf.setKind("TOKEN");
                      	 		TK_1Leaf.setValue(TK_1.getText());
                      			TK_1Leaf.setPos(TK_1.getCharPositionInLine());
                      			TK_1Leaf.setLine(TK_1.getLine());
                      	 		table_optionsReturnNode.getChildren().add(TK_1Leaf);
                      	 	}
                      	    // Create a CST Leaf
                      		if(DOUBLEQUOTEGen != null) {
                      			Leaf DOUBLEQUOTEGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      			DOUBLEQUOTEGenLeaf.setKind("DOUBLEQUOTE");
                      			DOUBLEQUOTEGenLeaf.setValue(DOUBLEQUOTEGen.getText());
                      			DOUBLEQUOTEGenLeaf.setPos(DOUBLEQUOTEGen.getCharPositionInLine());
                      			DOUBLEQUOTEGenLeaf.setLine(DOUBLEQUOTEGen.getLine());
                      			table_optionsReturnNode.getChildren().add(DOUBLEQUOTEGenLeaf);
                      		}
                      	    // Create a CST Leaf
                      		if(DQVALUEGen != null) {
                      			Leaf DQVALUEGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      			DQVALUEGenLeaf.setKind("DQVALUE");
                      			DQVALUEGenLeaf.setValue(DQVALUEGen.getText());
                      			DQVALUEGenLeaf.setPos(DQVALUEGen.getCharPositionInLine());
                      			DQVALUEGenLeaf.setLine(DQVALUEGen.getLine());
                      			table_optionsReturnNode.getChildren().add(DQVALUEGenLeaf);
                      		}
                      	    // Create a CST Leaf
                      		if(DOUBLEQUOTEGen_1 != null) {
                      			Leaf DOUBLEQUOTEGen_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      			DOUBLEQUOTEGen_1Leaf.setKind("DOUBLEQUOTE");
                      			DOUBLEQUOTEGen_1Leaf.setValue(DOUBLEQUOTEGen_1.getText());
                      			DOUBLEQUOTEGen_1Leaf.setPos(DOUBLEQUOTEGen_1.getCharPositionInLine());
                      			DOUBLEQUOTEGen_1Leaf.setLine(DOUBLEQUOTEGen_1.getLine());
                      			table_optionsReturnNode.getChildren().add(DOUBLEQUOTEGen_1Leaf);
                      		}
                      		// Returns the Node with CST Leaves/Nodes
                      		retval.returnNode = table_optionsReturnNode;
                      	
                    }

                    }
                    break;
                case 10 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:3555:7: TK_0= 'DELAY_KEY_WRITE' (TK_1= '=' )? NUMBERGen= NUMBER
                    {
                    TK_0=(Token)input.LT(1);
                    match(input,103,FOLLOW_103_in_table_options2502); if (failed) return retval;
                    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:3555:30: (TK_1= '=' )?
                    int alt119=2;
                    int LA119_0 = input.LA(1);

                    if ( (LA119_0==22) ) {
                        alt119=1;
                    }
                    switch (alt119) {
                        case 1 :
                            // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:3555:31: TK_1= '='
                            {
                            TK_1=(Token)input.LT(1);
                            match(input,22,FOLLOW_22_in_table_options2507); if (failed) return retval;

                            }
                            break;

                    }

                    NUMBERGen=(Token)input.LT(1);
                    match(input,NUMBER,FOLLOW_NUMBER_in_table_options2514); if (failed) return retval;
                    if ( backtracking==0 ) {
                      
                      		// Create return CST Node
                      		Node table_optionsReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                      		table_optionsReturnNode.setKind("table_options");
                      	    // Create a Token CST Leaf	
                      	    if(TK_0 != null) {
                      			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      	 		TK_0Leaf.setKind("TOKEN");
                      	 		TK_0Leaf.setValue(TK_0.getText());
                      			TK_0Leaf.setPos(TK_0.getCharPositionInLine());
                      			TK_0Leaf.setLine(TK_0.getLine());
                      	 		table_optionsReturnNode.getChildren().add(TK_0Leaf);
                      	 	}
                      	    // Create a Token CST Leaf	
                      	    if(TK_1 != null) {
                      			Leaf TK_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      	 		TK_1Leaf.setKind("TOKEN");
                      	 		TK_1Leaf.setValue(TK_1.getText());
                      			TK_1Leaf.setPos(TK_1.getCharPositionInLine());
                      			TK_1Leaf.setLine(TK_1.getLine());
                      	 		table_optionsReturnNode.getChildren().add(TK_1Leaf);
                      	 	}
                      	    // Create a CST Leaf
                      		if(NUMBERGen != null) {
                      			Leaf NUMBERGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      			NUMBERGenLeaf.setKind("NUMBER");
                      			NUMBERGenLeaf.setValue(NUMBERGen.getText());
                      			NUMBERGenLeaf.setPos(NUMBERGen.getCharPositionInLine());
                      			NUMBERGenLeaf.setLine(NUMBERGen.getLine());
                      			table_optionsReturnNode.getChildren().add(NUMBERGenLeaf);
                      		}
                      		// Returns the Node with CST Leaves/Nodes
                      		retval.returnNode = table_optionsReturnNode;
                      	
                    }

                    }
                    break;
                case 11 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:3590:6: TK_0= 'INDEX DIRECTORY' (TK_1= '=' )? DOUBLEQUOTEGen= DOUBLEQUOTE DQVALUEGen= DQVALUE DOUBLEQUOTEGen_1= DOUBLEQUOTE
                    {
                    TK_0=(Token)input.LT(1);
                    match(input,104,FOLLOW_104_in_table_options2527); if (failed) return retval;
                    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:3590:29: (TK_1= '=' )?
                    int alt120=2;
                    int LA120_0 = input.LA(1);

                    if ( (LA120_0==22) ) {
                        alt120=1;
                    }
                    switch (alt120) {
                        case 1 :
                            // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:3590:30: TK_1= '='
                            {
                            TK_1=(Token)input.LT(1);
                            match(input,22,FOLLOW_22_in_table_options2532); if (failed) return retval;

                            }
                            break;

                    }

                    DOUBLEQUOTEGen=(Token)input.LT(1);
                    match(input,DOUBLEQUOTE,FOLLOW_DOUBLEQUOTE_in_table_options2538); if (failed) return retval;
                    DQVALUEGen=(Token)input.LT(1);
                    match(input,DQVALUE,FOLLOW_DQVALUE_in_table_options2542); if (failed) return retval;
                    DOUBLEQUOTEGen_1=(Token)input.LT(1);
                    match(input,DOUBLEQUOTE,FOLLOW_DOUBLEQUOTE_in_table_options2546); if (failed) return retval;
                    if ( backtracking==0 ) {
                      
                      		// Create return CST Node
                      		Node table_optionsReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                      		table_optionsReturnNode.setKind("table_options");
                      	    // Create a Token CST Leaf	
                      	    if(TK_0 != null) {
                      			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      	 		TK_0Leaf.setKind("TOKEN");
                      	 		TK_0Leaf.setValue(TK_0.getText());
                      			TK_0Leaf.setPos(TK_0.getCharPositionInLine());
                      			TK_0Leaf.setLine(TK_0.getLine());
                      	 		table_optionsReturnNode.getChildren().add(TK_0Leaf);
                      	 	}
                      	    // Create a Token CST Leaf	
                      	    if(TK_1 != null) {
                      			Leaf TK_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      	 		TK_1Leaf.setKind("TOKEN");
                      	 		TK_1Leaf.setValue(TK_1.getText());
                      			TK_1Leaf.setPos(TK_1.getCharPositionInLine());
                      			TK_1Leaf.setLine(TK_1.getLine());
                      	 		table_optionsReturnNode.getChildren().add(TK_1Leaf);
                      	 	}
                      	    // Create a CST Leaf
                      		if(DOUBLEQUOTEGen != null) {
                      			Leaf DOUBLEQUOTEGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      			DOUBLEQUOTEGenLeaf.setKind("DOUBLEQUOTE");
                      			DOUBLEQUOTEGenLeaf.setValue(DOUBLEQUOTEGen.getText());
                      			DOUBLEQUOTEGenLeaf.setPos(DOUBLEQUOTEGen.getCharPositionInLine());
                      			DOUBLEQUOTEGenLeaf.setLine(DOUBLEQUOTEGen.getLine());
                      			table_optionsReturnNode.getChildren().add(DOUBLEQUOTEGenLeaf);
                      		}
                      	    // Create a CST Leaf
                      		if(DQVALUEGen != null) {
                      			Leaf DQVALUEGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      			DQVALUEGenLeaf.setKind("DQVALUE");
                      			DQVALUEGenLeaf.setValue(DQVALUEGen.getText());
                      			DQVALUEGenLeaf.setPos(DQVALUEGen.getCharPositionInLine());
                      			DQVALUEGenLeaf.setLine(DQVALUEGen.getLine());
                      			table_optionsReturnNode.getChildren().add(DQVALUEGenLeaf);
                      		}
                      	    // Create a CST Leaf
                      		if(DOUBLEQUOTEGen_1 != null) {
                      			Leaf DOUBLEQUOTEGen_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      			DOUBLEQUOTEGen_1Leaf.setKind("DOUBLEQUOTE");
                      			DOUBLEQUOTEGen_1Leaf.setValue(DOUBLEQUOTEGen_1.getText());
                      			DOUBLEQUOTEGen_1Leaf.setPos(DOUBLEQUOTEGen_1.getCharPositionInLine());
                      			DOUBLEQUOTEGen_1Leaf.setLine(DOUBLEQUOTEGen_1.getLine());
                      			table_optionsReturnNode.getChildren().add(DOUBLEQUOTEGen_1Leaf);
                      		}
                      		// Returns the Node with CST Leaves/Nodes
                      		retval.returnNode = table_optionsReturnNode;
                      	
                    }

                    }
                    break;
                case 12 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:3643:7: TK_0= 'INSERT_METHOD' (TK_1= '=' )? (TK_2= 'NO' | TK_3= 'FIRST' | TK_4= 'LAST' )
                    {
                    TK_0=(Token)input.LT(1);
                    match(input,105,FOLLOW_105_in_table_options2560); if (failed) return retval;
                    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:3643:28: (TK_1= '=' )?
                    int alt121=2;
                    int LA121_0 = input.LA(1);

                    if ( (LA121_0==22) ) {
                        alt121=1;
                    }
                    switch (alt121) {
                        case 1 :
                            // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:3643:29: TK_1= '='
                            {
                            TK_1=(Token)input.LT(1);
                            match(input,22,FOLLOW_22_in_table_options2565); if (failed) return retval;

                            }
                            break;

                    }

                    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:3643:40: (TK_2= 'NO' | TK_3= 'FIRST' | TK_4= 'LAST' )
                    int alt122=3;
                    switch ( input.LA(1) ) {
                    case 106:
                        {
                        alt122=1;
                        }
                        break;
                    case 107:
                        {
                        alt122=2;
                        }
                        break;
                    case 108:
                        {
                        alt122=3;
                        }
                        break;
                    default:
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("3643:40: (TK_2= 'NO' | TK_3= 'FIRST' | TK_4= 'LAST' )", 122, 0, input);

                        throw nvae;
                    }

                    switch (alt122) {
                        case 1 :
                            // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:3643:41: TK_2= 'NO'
                            {
                            TK_2=(Token)input.LT(1);
                            match(input,106,FOLLOW_106_in_table_options2572); if (failed) return retval;

                            }
                            break;
                        case 2 :
                            // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:3643:53: TK_3= 'FIRST'
                            {
                            TK_3=(Token)input.LT(1);
                            match(input,107,FOLLOW_107_in_table_options2578); if (failed) return retval;

                            }
                            break;
                        case 3 :
                            // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:3643:68: TK_4= 'LAST'
                            {
                            TK_4=(Token)input.LT(1);
                            match(input,108,FOLLOW_108_in_table_options2584); if (failed) return retval;

                            }
                            break;

                    }

                    if ( backtracking==0 ) {
                      
                      		// Create return CST Node
                      		Node table_optionsReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                      		table_optionsReturnNode.setKind("table_options");
                      	    // Create a Token CST Leaf	
                      	    if(TK_0 != null) {
                      			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      	 		TK_0Leaf.setKind("TOKEN");
                      	 		TK_0Leaf.setValue(TK_0.getText());
                      			TK_0Leaf.setPos(TK_0.getCharPositionInLine());
                      			TK_0Leaf.setLine(TK_0.getLine());
                      	 		table_optionsReturnNode.getChildren().add(TK_0Leaf);
                      	 	}
                      	    // Create a Token CST Leaf	
                      	    if(TK_1 != null) {
                      			Leaf TK_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      	 		TK_1Leaf.setKind("TOKEN");
                      	 		TK_1Leaf.setValue(TK_1.getText());
                      			TK_1Leaf.setPos(TK_1.getCharPositionInLine());
                      			TK_1Leaf.setLine(TK_1.getLine());
                      	 		table_optionsReturnNode.getChildren().add(TK_1Leaf);
                      	 	}
                      	    // Create a Token CST Leaf	
                      	    if(TK_2 != null) {
                      			Leaf TK_2Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      	 		TK_2Leaf.setKind("TOKEN");
                      	 		TK_2Leaf.setValue(TK_2.getText());
                      			TK_2Leaf.setPos(TK_2.getCharPositionInLine());
                      			TK_2Leaf.setLine(TK_2.getLine());
                      	 		table_optionsReturnNode.getChildren().add(TK_2Leaf);
                      	 	}
                      	    // Create a Token CST Leaf	
                      	    if(TK_3 != null) {
                      			Leaf TK_3Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      	 		TK_3Leaf.setKind("TOKEN");
                      	 		TK_3Leaf.setValue(TK_3.getText());
                      			TK_3Leaf.setPos(TK_3.getCharPositionInLine());
                      			TK_3Leaf.setLine(TK_3.getLine());
                      	 		table_optionsReturnNode.getChildren().add(TK_3Leaf);
                      	 	}
                      	    // Create a Token CST Leaf	
                      	    if(TK_4 != null) {
                      			Leaf TK_4Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      	 		TK_4Leaf.setKind("TOKEN");
                      	 		TK_4Leaf.setValue(TK_4.getText());
                      			TK_4Leaf.setPos(TK_4.getCharPositionInLine());
                      			TK_4Leaf.setLine(TK_4.getLine());
                      	 		table_optionsReturnNode.getChildren().add(TK_4Leaf);
                      	 	}
                      		// Returns the Node with CST Leaves/Nodes
                      		retval.returnNode = table_optionsReturnNode;
                      	
                    }

                    }
                    break;
                case 13 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:3696:7: TK_0= 'KEY_BLOCK_SIZE' (TK_1= '=' )? NUMBERGen= NUMBER
                    {
                    TK_0=(Token)input.LT(1);
                    match(input,62,FOLLOW_62_in_table_options2599); if (failed) return retval;
                    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:3696:29: (TK_1= '=' )?
                    int alt123=2;
                    int LA123_0 = input.LA(1);

                    if ( (LA123_0==22) ) {
                        alt123=1;
                    }
                    switch (alt123) {
                        case 1 :
                            // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:3696:30: TK_1= '='
                            {
                            TK_1=(Token)input.LT(1);
                            match(input,22,FOLLOW_22_in_table_options2604); if (failed) return retval;

                            }
                            break;

                    }

                    NUMBERGen=(Token)input.LT(1);
                    match(input,NUMBER,FOLLOW_NUMBER_in_table_options2610); if (failed) return retval;
                    if ( backtracking==0 ) {
                      
                      		// Create return CST Node
                      		Node table_optionsReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                      		table_optionsReturnNode.setKind("table_options");
                      	    // Create a Token CST Leaf	
                      	    if(TK_0 != null) {
                      			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      	 		TK_0Leaf.setKind("TOKEN");
                      	 		TK_0Leaf.setValue(TK_0.getText());
                      			TK_0Leaf.setPos(TK_0.getCharPositionInLine());
                      			TK_0Leaf.setLine(TK_0.getLine());
                      	 		table_optionsReturnNode.getChildren().add(TK_0Leaf);
                      	 	}
                      	    // Create a Token CST Leaf	
                      	    if(TK_1 != null) {
                      			Leaf TK_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      	 		TK_1Leaf.setKind("TOKEN");
                      	 		TK_1Leaf.setValue(TK_1.getText());
                      			TK_1Leaf.setPos(TK_1.getCharPositionInLine());
                      			TK_1Leaf.setLine(TK_1.getLine());
                      	 		table_optionsReturnNode.getChildren().add(TK_1Leaf);
                      	 	}
                      	    // Create a CST Leaf
                      		if(NUMBERGen != null) {
                      			Leaf NUMBERGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      			NUMBERGenLeaf.setKind("NUMBER");
                      			NUMBERGenLeaf.setValue(NUMBERGen.getText());
                      			NUMBERGenLeaf.setPos(NUMBERGen.getCharPositionInLine());
                      			NUMBERGenLeaf.setLine(NUMBERGen.getLine());
                      			table_optionsReturnNode.getChildren().add(NUMBERGenLeaf);
                      		}
                      		// Returns the Node with CST Leaves/Nodes
                      		retval.returnNode = table_optionsReturnNode;
                      	
                    }

                    }
                    break;
                case 14 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:3731:7: TK_0= 'MAX_ROWS' (TK_1= '=' )? NUMBERGen= NUMBER
                    {
                    TK_0=(Token)input.LT(1);
                    match(input,109,FOLLOW_109_in_table_options2624); if (failed) return retval;
                    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:3731:23: (TK_1= '=' )?
                    int alt124=2;
                    int LA124_0 = input.LA(1);

                    if ( (LA124_0==22) ) {
                        alt124=1;
                    }
                    switch (alt124) {
                        case 1 :
                            // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:3731:24: TK_1= '='
                            {
                            TK_1=(Token)input.LT(1);
                            match(input,22,FOLLOW_22_in_table_options2629); if (failed) return retval;

                            }
                            break;

                    }

                    NUMBERGen=(Token)input.LT(1);
                    match(input,NUMBER,FOLLOW_NUMBER_in_table_options2635); if (failed) return retval;
                    if ( backtracking==0 ) {
                      
                      		// Create return CST Node
                      		Node table_optionsReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                      		table_optionsReturnNode.setKind("table_options");
                      	    // Create a Token CST Leaf	
                      	    if(TK_0 != null) {
                      			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      	 		TK_0Leaf.setKind("TOKEN");
                      	 		TK_0Leaf.setValue(TK_0.getText());
                      			TK_0Leaf.setPos(TK_0.getCharPositionInLine());
                      			TK_0Leaf.setLine(TK_0.getLine());
                      	 		table_optionsReturnNode.getChildren().add(TK_0Leaf);
                      	 	}
                      	    // Create a Token CST Leaf	
                      	    if(TK_1 != null) {
                      			Leaf TK_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      	 		TK_1Leaf.setKind("TOKEN");
                      	 		TK_1Leaf.setValue(TK_1.getText());
                      			TK_1Leaf.setPos(TK_1.getCharPositionInLine());
                      			TK_1Leaf.setLine(TK_1.getLine());
                      	 		table_optionsReturnNode.getChildren().add(TK_1Leaf);
                      	 	}
                      	    // Create a CST Leaf
                      		if(NUMBERGen != null) {
                      			Leaf NUMBERGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      			NUMBERGenLeaf.setKind("NUMBER");
                      			NUMBERGenLeaf.setValue(NUMBERGen.getText());
                      			NUMBERGenLeaf.setPos(NUMBERGen.getCharPositionInLine());
                      			NUMBERGenLeaf.setLine(NUMBERGen.getLine());
                      			table_optionsReturnNode.getChildren().add(NUMBERGenLeaf);
                      		}
                      		// Returns the Node with CST Leaves/Nodes
                      		retval.returnNode = table_optionsReturnNode;
                      	
                    }

                    }
                    break;
                case 15 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:3766:7: TK_0= 'MIN_ROWS' (TK_1= '=' )? NUMBERGen= NUMBER
                    {
                    TK_0=(Token)input.LT(1);
                    match(input,110,FOLLOW_110_in_table_options2649); if (failed) return retval;
                    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:3766:23: (TK_1= '=' )?
                    int alt125=2;
                    int LA125_0 = input.LA(1);

                    if ( (LA125_0==22) ) {
                        alt125=1;
                    }
                    switch (alt125) {
                        case 1 :
                            // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:3766:24: TK_1= '='
                            {
                            TK_1=(Token)input.LT(1);
                            match(input,22,FOLLOW_22_in_table_options2654); if (failed) return retval;

                            }
                            break;

                    }

                    NUMBERGen=(Token)input.LT(1);
                    match(input,NUMBER,FOLLOW_NUMBER_in_table_options2660); if (failed) return retval;
                    if ( backtracking==0 ) {
                      
                      		// Create return CST Node
                      		Node table_optionsReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                      		table_optionsReturnNode.setKind("table_options");
                      	    // Create a Token CST Leaf	
                      	    if(TK_0 != null) {
                      			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      	 		TK_0Leaf.setKind("TOKEN");
                      	 		TK_0Leaf.setValue(TK_0.getText());
                      			TK_0Leaf.setPos(TK_0.getCharPositionInLine());
                      			TK_0Leaf.setLine(TK_0.getLine());
                      	 		table_optionsReturnNode.getChildren().add(TK_0Leaf);
                      	 	}
                      	    // Create a Token CST Leaf	
                      	    if(TK_1 != null) {
                      			Leaf TK_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      	 		TK_1Leaf.setKind("TOKEN");
                      	 		TK_1Leaf.setValue(TK_1.getText());
                      			TK_1Leaf.setPos(TK_1.getCharPositionInLine());
                      			TK_1Leaf.setLine(TK_1.getLine());
                      	 		table_optionsReturnNode.getChildren().add(TK_1Leaf);
                      	 	}
                      	    // Create a CST Leaf
                      		if(NUMBERGen != null) {
                      			Leaf NUMBERGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      			NUMBERGenLeaf.setKind("NUMBER");
                      			NUMBERGenLeaf.setValue(NUMBERGen.getText());
                      			NUMBERGenLeaf.setPos(NUMBERGen.getCharPositionInLine());
                      			NUMBERGenLeaf.setLine(NUMBERGen.getLine());
                      			table_optionsReturnNode.getChildren().add(NUMBERGenLeaf);
                      		}
                      		// Returns the Node with CST Leaves/Nodes
                      		retval.returnNode = table_optionsReturnNode;
                      	
                    }

                    }
                    break;
                case 16 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:3801:7: TK_0= 'PACK_KEYS' (TK_1= '=' )? (NUMBERGen= NUMBER | TK_2= 'DEFAULT' )
                    {
                    TK_0=(Token)input.LT(1);
                    match(input,111,FOLLOW_111_in_table_options2674); if (failed) return retval;
                    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:3801:24: (TK_1= '=' )?
                    int alt126=2;
                    int LA126_0 = input.LA(1);

                    if ( (LA126_0==22) ) {
                        alt126=1;
                    }
                    switch (alt126) {
                        case 1 :
                            // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:3801:25: TK_1= '='
                            {
                            TK_1=(Token)input.LT(1);
                            match(input,22,FOLLOW_22_in_table_options2679); if (failed) return retval;

                            }
                            break;

                    }

                    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:3801:36: (NUMBERGen= NUMBER | TK_2= 'DEFAULT' )
                    int alt127=2;
                    int LA127_0 = input.LA(1);

                    if ( (LA127_0==NUMBER) ) {
                        alt127=1;
                    }
                    else if ( (LA127_0==33) ) {
                        alt127=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("3801:36: (NUMBERGen= NUMBER | TK_2= 'DEFAULT' )", 127, 0, input);

                        throw nvae;
                    }
                    switch (alt127) {
                        case 1 :
                            // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:3801:37: NUMBERGen= NUMBER
                            {
                            NUMBERGen=(Token)input.LT(1);
                            match(input,NUMBER,FOLLOW_NUMBER_in_table_options2686); if (failed) return retval;

                            }
                            break;
                        case 2 :
                            // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:3801:56: TK_2= 'DEFAULT'
                            {
                            TK_2=(Token)input.LT(1);
                            match(input,33,FOLLOW_33_in_table_options2692); if (failed) return retval;

                            }
                            break;

                    }

                    if ( backtracking==0 ) {
                      
                      		// Create return CST Node
                      		Node table_optionsReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                      		table_optionsReturnNode.setKind("table_options");
                      	    // Create a Token CST Leaf	
                      	    if(TK_0 != null) {
                      			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      	 		TK_0Leaf.setKind("TOKEN");
                      	 		TK_0Leaf.setValue(TK_0.getText());
                      			TK_0Leaf.setPos(TK_0.getCharPositionInLine());
                      			TK_0Leaf.setLine(TK_0.getLine());
                      	 		table_optionsReturnNode.getChildren().add(TK_0Leaf);
                      	 	}
                      	    // Create a Token CST Leaf	
                      	    if(TK_1 != null) {
                      			Leaf TK_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      	 		TK_1Leaf.setKind("TOKEN");
                      	 		TK_1Leaf.setValue(TK_1.getText());
                      			TK_1Leaf.setPos(TK_1.getCharPositionInLine());
                      			TK_1Leaf.setLine(TK_1.getLine());
                      	 		table_optionsReturnNode.getChildren().add(TK_1Leaf);
                      	 	}
                      	    // Create a CST Leaf
                      		if(NUMBERGen != null) {
                      			Leaf NUMBERGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      			NUMBERGenLeaf.setKind("NUMBER");
                      			NUMBERGenLeaf.setValue(NUMBERGen.getText());
                      			NUMBERGenLeaf.setPos(NUMBERGen.getCharPositionInLine());
                      			NUMBERGenLeaf.setLine(NUMBERGen.getLine());
                      			table_optionsReturnNode.getChildren().add(NUMBERGenLeaf);
                      		}
                      	    // Create a Token CST Leaf	
                      	    if(TK_2 != null) {
                      			Leaf TK_2Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      	 		TK_2Leaf.setKind("TOKEN");
                      	 		TK_2Leaf.setValue(TK_2.getText());
                      			TK_2Leaf.setPos(TK_2.getCharPositionInLine());
                      			TK_2Leaf.setLine(TK_2.getLine());
                      	 		table_optionsReturnNode.getChildren().add(TK_2Leaf);
                      	 	}
                      		// Returns the Node with CST Leaves/Nodes
                      		retval.returnNode = table_optionsReturnNode;
                      	
                    }

                    }
                    break;
                case 17 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:3846:7: TK_0= 'ROW_FORMAT' (TK_1= '=' )? (TK_2= 'DEFAULT' | TK_3= 'DYNAMIC' | TK_4= 'FIXED' | TK_5= 'COMPRESSED' | TK_6= 'REDUNDANT' | TK_7= 'COMPACT' )
                    {
                    TK_0=(Token)input.LT(1);
                    match(input,112,FOLLOW_112_in_table_options2711); if (failed) return retval;
                    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:3846:25: (TK_1= '=' )?
                    int alt128=2;
                    int LA128_0 = input.LA(1);

                    if ( (LA128_0==22) ) {
                        alt128=1;
                    }
                    switch (alt128) {
                        case 1 :
                            // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:3846:26: TK_1= '='
                            {
                            TK_1=(Token)input.LT(1);
                            match(input,22,FOLLOW_22_in_table_options2716); if (failed) return retval;

                            }
                            break;

                    }

                    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:3846:37: (TK_2= 'DEFAULT' | TK_3= 'DYNAMIC' | TK_4= 'FIXED' | TK_5= 'COMPRESSED' | TK_6= 'REDUNDANT' | TK_7= 'COMPACT' )
                    int alt129=6;
                    switch ( input.LA(1) ) {
                    case 33:
                        {
                        alt129=1;
                        }
                        break;
                    case 53:
                        {
                        alt129=2;
                        }
                        break;
                    case 52:
                        {
                        alt129=3;
                        }
                        break;
                    case 113:
                        {
                        alt129=4;
                        }
                        break;
                    case 114:
                        {
                        alt129=5;
                        }
                        break;
                    case 115:
                        {
                        alt129=6;
                        }
                        break;
                    default:
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("3846:37: (TK_2= 'DEFAULT' | TK_3= 'DYNAMIC' | TK_4= 'FIXED' | TK_5= 'COMPRESSED' | TK_6= 'REDUNDANT' | TK_7= 'COMPACT' )", 129, 0, input);

                        throw nvae;
                    }

                    switch (alt129) {
                        case 1 :
                            // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:3846:38: TK_2= 'DEFAULT'
                            {
                            TK_2=(Token)input.LT(1);
                            match(input,33,FOLLOW_33_in_table_options2723); if (failed) return retval;

                            }
                            break;
                        case 2 :
                            // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:3846:53: TK_3= 'DYNAMIC'
                            {
                            TK_3=(Token)input.LT(1);
                            match(input,53,FOLLOW_53_in_table_options2727); if (failed) return retval;

                            }
                            break;
                        case 3 :
                            // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:3846:68: TK_4= 'FIXED'
                            {
                            TK_4=(Token)input.LT(1);
                            match(input,52,FOLLOW_52_in_table_options2731); if (failed) return retval;

                            }
                            break;
                        case 4 :
                            // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:3846:81: TK_5= 'COMPRESSED'
                            {
                            TK_5=(Token)input.LT(1);
                            match(input,113,FOLLOW_113_in_table_options2735); if (failed) return retval;

                            }
                            break;
                        case 5 :
                            // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:3846:99: TK_6= 'REDUNDANT'
                            {
                            TK_6=(Token)input.LT(1);
                            match(input,114,FOLLOW_114_in_table_options2739); if (failed) return retval;

                            }
                            break;
                        case 6 :
                            // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:3846:116: TK_7= 'COMPACT'
                            {
                            TK_7=(Token)input.LT(1);
                            match(input,115,FOLLOW_115_in_table_options2743); if (failed) return retval;

                            }
                            break;

                    }

                    if ( backtracking==0 ) {
                      
                      		// Create return CST Node
                      		Node table_optionsReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                      		table_optionsReturnNode.setKind("table_options");
                      	    // Create a Token CST Leaf	
                      	    if(TK_0 != null) {
                      			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      	 		TK_0Leaf.setKind("TOKEN");
                      	 		TK_0Leaf.setValue(TK_0.getText());
                      			TK_0Leaf.setPos(TK_0.getCharPositionInLine());
                      			TK_0Leaf.setLine(TK_0.getLine());
                      	 		table_optionsReturnNode.getChildren().add(TK_0Leaf);
                      	 	}
                      	    // Create a Token CST Leaf	
                      	    if(TK_1 != null) {
                      			Leaf TK_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      	 		TK_1Leaf.setKind("TOKEN");
                      	 		TK_1Leaf.setValue(TK_1.getText());
                      			TK_1Leaf.setPos(TK_1.getCharPositionInLine());
                      			TK_1Leaf.setLine(TK_1.getLine());
                      	 		table_optionsReturnNode.getChildren().add(TK_1Leaf);
                      	 	}
                      	    // Create a Token CST Leaf	
                      	    if(TK_2 != null) {
                      			Leaf TK_2Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      	 		TK_2Leaf.setKind("TOKEN");
                      	 		TK_2Leaf.setValue(TK_2.getText());
                      			TK_2Leaf.setPos(TK_2.getCharPositionInLine());
                      			TK_2Leaf.setLine(TK_2.getLine());
                      	 		table_optionsReturnNode.getChildren().add(TK_2Leaf);
                      	 	}
                      	    // Create a Token CST Leaf	
                      	    if(TK_3 != null) {
                      			Leaf TK_3Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      	 		TK_3Leaf.setKind("TOKEN");
                      	 		TK_3Leaf.setValue(TK_3.getText());
                      			TK_3Leaf.setPos(TK_3.getCharPositionInLine());
                      			TK_3Leaf.setLine(TK_3.getLine());
                      	 		table_optionsReturnNode.getChildren().add(TK_3Leaf);
                      	 	}
                      	    // Create a Token CST Leaf	
                      	    if(TK_4 != null) {
                      			Leaf TK_4Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      	 		TK_4Leaf.setKind("TOKEN");
                      	 		TK_4Leaf.setValue(TK_4.getText());
                      			TK_4Leaf.setPos(TK_4.getCharPositionInLine());
                      			TK_4Leaf.setLine(TK_4.getLine());
                      	 		table_optionsReturnNode.getChildren().add(TK_4Leaf);
                      	 	}
                      	    // Create a Token CST Leaf	
                      	    if(TK_5 != null) {
                      			Leaf TK_5Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      	 		TK_5Leaf.setKind("TOKEN");
                      	 		TK_5Leaf.setValue(TK_5.getText());
                      			TK_5Leaf.setPos(TK_5.getCharPositionInLine());
                      			TK_5Leaf.setLine(TK_5.getLine());
                      	 		table_optionsReturnNode.getChildren().add(TK_5Leaf);
                      	 	}
                      	    // Create a Token CST Leaf	
                      	    if(TK_6 != null) {
                      			Leaf TK_6Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      	 		TK_6Leaf.setKind("TOKEN");
                      	 		TK_6Leaf.setValue(TK_6.getText());
                      			TK_6Leaf.setPos(TK_6.getCharPositionInLine());
                      			TK_6Leaf.setLine(TK_6.getLine());
                      	 		table_optionsReturnNode.getChildren().add(TK_6Leaf);
                      	 	}
                      	    // Create a Token CST Leaf	
                      	    if(TK_7 != null) {
                      			Leaf TK_7Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      	 		TK_7Leaf.setKind("TOKEN");
                      	 		TK_7Leaf.setValue(TK_7.getText());
                      			TK_7Leaf.setPos(TK_7.getCharPositionInLine());
                      			TK_7Leaf.setLine(TK_7.getLine());
                      	 		table_optionsReturnNode.getChildren().add(TK_7Leaf);
                      	 	}
                      		// Returns the Node with CST Leaves/Nodes
                      		retval.returnNode = table_optionsReturnNode;
                      	
                    }

                    }
                    break;
                case 18 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:3926:7: TK_0= 'TABLESPACE' IDGen= ID (TK_1= 'STORAGE' (TK_2= 'DISK' | TK_3= 'DEFAULT' ) )?
                    {
                    TK_0=(Token)input.LT(1);
                    match(input,116,FOLLOW_116_in_table_options2758); if (failed) return retval;
                    IDGen=(Token)input.LT(1);
                    match(input,ID,FOLLOW_ID_in_table_options2762); if (failed) return retval;
                    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:3926:34: (TK_1= 'STORAGE' (TK_2= 'DISK' | TK_3= 'DEFAULT' ) )?
                    int alt131=2;
                    int LA131_0 = input.LA(1);

                    if ( (LA131_0==54) ) {
                        alt131=1;
                    }
                    switch (alt131) {
                        case 1 :
                            // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:3926:35: TK_1= 'STORAGE' (TK_2= 'DISK' | TK_3= 'DEFAULT' )
                            {
                            TK_1=(Token)input.LT(1);
                            match(input,54,FOLLOW_54_in_table_options2767); if (failed) return retval;
                            // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:3926:50: (TK_2= 'DISK' | TK_3= 'DEFAULT' )
                            int alt130=2;
                            int LA130_0 = input.LA(1);

                            if ( (LA130_0==55) ) {
                                alt130=1;
                            }
                            else if ( (LA130_0==33) ) {
                                alt130=2;
                            }
                            else {
                                if (backtracking>0) {failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("3926:50: (TK_2= 'DISK' | TK_3= 'DEFAULT' )", 130, 0, input);

                                throw nvae;
                            }
                            switch (alt130) {
                                case 1 :
                                    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:3926:51: TK_2= 'DISK'
                                    {
                                    TK_2=(Token)input.LT(1);
                                    match(input,55,FOLLOW_55_in_table_options2772); if (failed) return retval;

                                    }
                                    break;
                                case 2 :
                                    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:3926:63: TK_3= 'DEFAULT'
                                    {
                                    TK_3=(Token)input.LT(1);
                                    match(input,33,FOLLOW_33_in_table_options2776); if (failed) return retval;

                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    if ( backtracking==0 ) {
                      
                      		// Create return CST Node
                      		Node table_optionsReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                      		table_optionsReturnNode.setKind("table_options");
                      	    // Create a Token CST Leaf	
                      	    if(TK_0 != null) {
                      			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      	 		TK_0Leaf.setKind("TOKEN");
                      	 		TK_0Leaf.setValue(TK_0.getText());
                      			TK_0Leaf.setPos(TK_0.getCharPositionInLine());
                      			TK_0Leaf.setLine(TK_0.getLine());
                      	 		table_optionsReturnNode.getChildren().add(TK_0Leaf);
                      	 	}
                      	    // Create a CST Leaf
                      		if(IDGen != null) {
                      			Leaf IDGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      			IDGenLeaf.setKind("ID");
                      			IDGenLeaf.setValue(IDGen.getText());
                      			IDGenLeaf.setPos(IDGen.getCharPositionInLine());
                      			IDGenLeaf.setLine(IDGen.getLine());
                      			table_optionsReturnNode.getChildren().add(IDGenLeaf);
                      		}
                      	    // Create a Token CST Leaf	
                      	    if(TK_1 != null) {
                      			Leaf TK_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      	 		TK_1Leaf.setKind("TOKEN");
                      	 		TK_1Leaf.setValue(TK_1.getText());
                      			TK_1Leaf.setPos(TK_1.getCharPositionInLine());
                      			TK_1Leaf.setLine(TK_1.getLine());
                      	 		table_optionsReturnNode.getChildren().add(TK_1Leaf);
                      	 	}
                      	    // Create a Token CST Leaf	
                      	    if(TK_2 != null) {
                      			Leaf TK_2Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      	 		TK_2Leaf.setKind("TOKEN");
                      	 		TK_2Leaf.setValue(TK_2.getText());
                      			TK_2Leaf.setPos(TK_2.getCharPositionInLine());
                      			TK_2Leaf.setLine(TK_2.getLine());
                      	 		table_optionsReturnNode.getChildren().add(TK_2Leaf);
                      	 	}
                      	    // Create a Token CST Leaf	
                      	    if(TK_3 != null) {
                      			Leaf TK_3Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      	 		TK_3Leaf.setKind("TOKEN");
                      	 		TK_3Leaf.setValue(TK_3.getText());
                      			TK_3Leaf.setPos(TK_3.getCharPositionInLine());
                      			TK_3Leaf.setLine(TK_3.getLine());
                      	 		table_optionsReturnNode.getChildren().add(TK_3Leaf);
                      	 	}
                      		// Returns the Node with CST Leaves/Nodes
                      		retval.returnNode = table_optionsReturnNode;
                      	
                    }

                    }
                    break;
                case 19 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:3979:7: TK_0= 'UNION' (TK_1= '=' )? IDGen= ID (TK_2= ',' IDGen_1_List+= ID )*
                    {
                    TK_0=(Token)input.LT(1);
                    match(input,117,FOLLOW_117_in_table_options2794); if (failed) return retval;
                    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:3979:20: (TK_1= '=' )?
                    int alt132=2;
                    int LA132_0 = input.LA(1);

                    if ( (LA132_0==22) ) {
                        alt132=1;
                    }
                    switch (alt132) {
                        case 1 :
                            // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:3979:21: TK_1= '='
                            {
                            TK_1=(Token)input.LT(1);
                            match(input,22,FOLLOW_22_in_table_options2799); if (failed) return retval;

                            }
                            break;

                    }

                    IDGen=(Token)input.LT(1);
                    match(input,ID,FOLLOW_ID_in_table_options2805); if (failed) return retval;
                    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:3979:41: (TK_2= ',' IDGen_1_List+= ID )*
                    loop133:
                    do {
                        int alt133=2;
                        int LA133_0 = input.LA(1);

                        if ( (LA133_0==20) ) {
                            alt133=1;
                        }


                        switch (alt133) {
                    	case 1 :
                    	    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:3979:42: TK_2= ',' IDGen_1_List+= ID
                    	    {
                    	    TK_2=(Token)input.LT(1);
                    	    match(input,20,FOLLOW_20_in_table_options2810); if (failed) return retval;
                    	    IDGen_1_List=(Token)input.LT(1);
                    	    match(input,ID,FOLLOW_ID_in_table_options2814); if (failed) return retval;
                    	    if (list_IDGen_1_List==null) list_IDGen_1_List=new ArrayList();
                    	    list_IDGen_1_List.add(IDGen_1_List);


                    	    }
                    	    break;

                    	default :
                    	    break loop133;
                        }
                    } while (true);

                    if ( backtracking==0 ) {
                      
                      		// Create return CST Node
                      		Node table_optionsReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                      		table_optionsReturnNode.setKind("table_options");
                      	    // Create a Token CST Leaf	
                      	    if(TK_0 != null) {
                      			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      	 		TK_0Leaf.setKind("TOKEN");
                      	 		TK_0Leaf.setValue(TK_0.getText());
                      			TK_0Leaf.setPos(TK_0.getCharPositionInLine());
                      			TK_0Leaf.setLine(TK_0.getLine());
                      	 		table_optionsReturnNode.getChildren().add(TK_0Leaf);
                      	 	}
                      	    // Create a Token CST Leaf	
                      	    if(TK_1 != null) {
                      			Leaf TK_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      	 		TK_1Leaf.setKind("TOKEN");
                      	 		TK_1Leaf.setValue(TK_1.getText());
                      			TK_1Leaf.setPos(TK_1.getCharPositionInLine());
                      			TK_1Leaf.setLine(TK_1.getLine());
                      	 		table_optionsReturnNode.getChildren().add(TK_1Leaf);
                      	 	}
                      	    // Create a CST Leaf
                      		if(IDGen != null) {
                      			Leaf IDGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      			IDGenLeaf.setKind("ID");
                      			IDGenLeaf.setValue(IDGen.getText());
                      			IDGenLeaf.setPos(IDGen.getCharPositionInLine());
                      			IDGenLeaf.setLine(IDGen.getLine());
                      			table_optionsReturnNode.getChildren().add(IDGenLeaf);
                      		}
                      	
                      		// Create a special CST Node for terminal IDGen_1_List aggregation
                      		if(list_IDGen_1_List != null) {
                      	    for(int pos = 0; pos < list_IDGen_1_List.size(); pos++ )  { 
                      	    // Create a Token CST Leaf	
                      	    if(TK_2 != null) {
                      			Leaf TK_2Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      	 		TK_2Leaf.setKind("TOKEN");
                      	 		TK_2Leaf.setValue(TK_2.getText());
                      			TK_2Leaf.setPos(TK_2.getCharPositionInLine());
                      			TK_2Leaf.setLine(TK_2.getLine());
                      	 		table_optionsReturnNode.getChildren().add(TK_2Leaf);
                      	 	}
                      		// Terminal extractor
                      	    if(list_IDGen_1_List != null) {
                      		    Token t = (Token) list_IDGen_1_List.get(pos); 
                      		    Leaf IDGen_1_ListLeaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      			IDGen_1_ListLeaf.setKind("ID");
                      			IDGen_1_ListLeaf.setValue(t.getText());
                      			IDGen_1_ListLeaf.setPos(t.getCharPositionInLine());
                      			IDGen_1_ListLeaf.setLine(t.getLine());
                      			table_optionsReturnNode.getChildren().add(IDGen_1_ListLeaf);
                      		}
                      		}
                      		}
                      	
                      		// Returns the Node with CST Leaves/Nodes
                      		retval.returnNode = table_optionsReturnNode;
                      	
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
    // $ANTLR end table_options

    public static class reference_definition_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start reference_definition
    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:4043:1: reference_definition returns [Node returnNode] : TK_0= 'REFERENCES' OQUOTEGen= OQUOTE IDGen= ID OQUOTEGen_1= OQUOTE TK_1= '(' index_col_nameGen+= index_col_name (TK_2= ',' index_col_nameGen_1+= index_col_name )* TK_3= ')' (TK_4= 'MATCH' TK_5= 'FULL' | TK_6= 'MATCH' TK_7= 'PARTIAL' | TK_8= 'MATCH' TK_9= 'SIMPLE' )? (TK_10= 'ON' TK_11= 'DELETE' reference_optionGen+= reference_option )? (TK_12= 'ON' TK_13= 'UPDATE' reference_optionGen_1+= reference_option )? ;
    public final reference_definition_return reference_definition() throws RecognitionException {
        reference_definition_return retval = new reference_definition_return();
        retval.start = input.LT(1);

        Token TK_0=null;
        Token OQUOTEGen=null;
        Token IDGen=null;
        Token OQUOTEGen_1=null;
        Token TK_1=null;
        Token TK_2=null;
        Token TK_3=null;
        Token TK_4=null;
        Token TK_5=null;
        Token TK_6=null;
        Token TK_7=null;
        Token TK_8=null;
        Token TK_9=null;
        Token TK_10=null;
        Token TK_11=null;
        Token TK_12=null;
        Token TK_13=null;
        List list_index_col_nameGen=null;
        List list_index_col_nameGen_1=null;
        List list_reference_optionGen=null;
        List list_reference_optionGen_1=null;
        RuleReturnScope index_col_nameGen = null;
        RuleReturnScope index_col_nameGen_1 = null;
        RuleReturnScope reference_optionGen = null;
        RuleReturnScope reference_optionGen_1 = null;
        try {
            // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:4044:1: (TK_0= 'REFERENCES' OQUOTEGen= OQUOTE IDGen= ID OQUOTEGen_1= OQUOTE TK_1= '(' index_col_nameGen+= index_col_name (TK_2= ',' index_col_nameGen_1+= index_col_name )* TK_3= ')' (TK_4= 'MATCH' TK_5= 'FULL' | TK_6= 'MATCH' TK_7= 'PARTIAL' | TK_8= 'MATCH' TK_9= 'SIMPLE' )? (TK_10= 'ON' TK_11= 'DELETE' reference_optionGen+= reference_option )? (TK_12= 'ON' TK_13= 'UPDATE' reference_optionGen_1+= reference_option )? )
            // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:4044:3: TK_0= 'REFERENCES' OQUOTEGen= OQUOTE IDGen= ID OQUOTEGen_1= OQUOTE TK_1= '(' index_col_nameGen+= index_col_name (TK_2= ',' index_col_nameGen_1+= index_col_name )* TK_3= ')' (TK_4= 'MATCH' TK_5= 'FULL' | TK_6= 'MATCH' TK_7= 'PARTIAL' | TK_8= 'MATCH' TK_9= 'SIMPLE' )? (TK_10= 'ON' TK_11= 'DELETE' reference_optionGen+= reference_option )? (TK_12= 'ON' TK_13= 'UPDATE' reference_optionGen_1+= reference_option )?
            {
            TK_0=(Token)input.LT(1);
            match(input,118,FOLLOW_118_in_reference_definition2838); if (failed) return retval;
            OQUOTEGen=(Token)input.LT(1);
            match(input,OQUOTE,FOLLOW_OQUOTE_in_reference_definition2842); if (failed) return retval;
            IDGen=(Token)input.LT(1);
            match(input,ID,FOLLOW_ID_in_reference_definition2846); if (failed) return retval;
            OQUOTEGen_1=(Token)input.LT(1);
            match(input,OQUOTE,FOLLOW_OQUOTE_in_reference_definition2850); if (failed) return retval;
            TK_1=(Token)input.LT(1);
            match(input,38,FOLLOW_38_in_reference_definition2854); if (failed) return retval;
            pushFollow(FOLLOW_index_col_name_in_reference_definition2858);
            index_col_nameGen=index_col_name();
            _fsp--;
            if (failed) return retval;
            if (list_index_col_nameGen==null) list_index_col_nameGen=new ArrayList();
            list_index_col_nameGen.add(index_col_nameGen);

            // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:4044:109: (TK_2= ',' index_col_nameGen_1+= index_col_name )*
            loop135:
            do {
                int alt135=2;
                int LA135_0 = input.LA(1);

                if ( (LA135_0==20) ) {
                    alt135=1;
                }


                switch (alt135) {
            	case 1 :
            	    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:4044:110: TK_2= ',' index_col_nameGen_1+= index_col_name
            	    {
            	    TK_2=(Token)input.LT(1);
            	    match(input,20,FOLLOW_20_in_reference_definition2863); if (failed) return retval;
            	    pushFollow(FOLLOW_index_col_name_in_reference_definition2867);
            	    index_col_nameGen_1=index_col_name();
            	    _fsp--;
            	    if (failed) return retval;
            	    if (list_index_col_nameGen_1==null) list_index_col_nameGen_1=new ArrayList();
            	    list_index_col_nameGen_1.add(index_col_nameGen_1);


            	    }
            	    break;

            	default :
            	    break loop135;
                }
            } while (true);

            TK_3=(Token)input.LT(1);
            match(input,39,FOLLOW_39_in_reference_definition2873); if (failed) return retval;
            // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:4045:8: (TK_4= 'MATCH' TK_5= 'FULL' | TK_6= 'MATCH' TK_7= 'PARTIAL' | TK_8= 'MATCH' TK_9= 'SIMPLE' )?
            int alt136=4;
            int LA136_0 = input.LA(1);

            if ( (LA136_0==119) ) {
                switch ( input.LA(2) ) {
                    case 120:
                        {
                        alt136=1;
                        }
                        break;
                    case 122:
                        {
                        alt136=3;
                        }
                        break;
                    case 121:
                        {
                        alt136=2;
                        }
                        break;
                }

            }
            switch (alt136) {
                case 1 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:4045:9: TK_4= 'MATCH' TK_5= 'FULL'
                    {
                    TK_4=(Token)input.LT(1);
                    match(input,119,FOLLOW_119_in_reference_definition2885); if (failed) return retval;
                    TK_5=(Token)input.LT(1);
                    match(input,120,FOLLOW_120_in_reference_definition2889); if (failed) return retval;

                    }
                    break;
                case 2 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:4045:36: TK_6= 'MATCH' TK_7= 'PARTIAL'
                    {
                    TK_6=(Token)input.LT(1);
                    match(input,119,FOLLOW_119_in_reference_definition2895); if (failed) return retval;
                    TK_7=(Token)input.LT(1);
                    match(input,121,FOLLOW_121_in_reference_definition2899); if (failed) return retval;

                    }
                    break;
                case 3 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:4045:66: TK_8= 'MATCH' TK_9= 'SIMPLE'
                    {
                    TK_8=(Token)input.LT(1);
                    match(input,119,FOLLOW_119_in_reference_definition2905); if (failed) return retval;
                    TK_9=(Token)input.LT(1);
                    match(input,122,FOLLOW_122_in_reference_definition2909); if (failed) return retval;

                    }
                    break;

            }

            // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:4046:8: (TK_10= 'ON' TK_11= 'DELETE' reference_optionGen+= reference_option )?
            int alt137=2;
            int LA137_0 = input.LA(1);

            if ( (LA137_0==46) ) {
                int LA137_1 = input.LA(2);

                if ( (LA137_1==48) ) {
                    alt137=1;
                }
            }
            switch (alt137) {
                case 1 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:4046:9: TK_10= 'ON' TK_11= 'DELETE' reference_optionGen+= reference_option
                    {
                    TK_10=(Token)input.LT(1);
                    match(input,46,FOLLOW_46_in_reference_definition2923); if (failed) return retval;
                    TK_11=(Token)input.LT(1);
                    match(input,48,FOLLOW_48_in_reference_definition2927); if (failed) return retval;
                    pushFollow(FOLLOW_reference_option_in_reference_definition2931);
                    reference_optionGen=reference_option();
                    _fsp--;
                    if (failed) return retval;
                    if (list_reference_optionGen==null) list_reference_optionGen=new ArrayList();
                    list_reference_optionGen.add(reference_optionGen);


                    }
                    break;

            }

            // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:4047:8: (TK_12= 'ON' TK_13= 'UPDATE' reference_optionGen_1+= reference_option )?
            int alt138=2;
            int LA138_0 = input.LA(1);

            if ( (LA138_0==46) ) {
                alt138=1;
            }
            switch (alt138) {
                case 1 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:4047:9: TK_12= 'ON' TK_13= 'UPDATE' reference_optionGen_1+= reference_option
                    {
                    TK_12=(Token)input.LT(1);
                    match(input,46,FOLLOW_46_in_reference_definition2945); if (failed) return retval;
                    TK_13=(Token)input.LT(1);
                    match(input,47,FOLLOW_47_in_reference_definition2949); if (failed) return retval;
                    pushFollow(FOLLOW_reference_option_in_reference_definition2953);
                    reference_optionGen_1=reference_option();
                    _fsp--;
                    if (failed) return retval;
                    if (list_reference_optionGen_1==null) list_reference_optionGen_1=new ArrayList();
                    list_reference_optionGen_1.add(reference_optionGen_1);


                    }
                    break;

            }

            if ( backtracking==0 ) {
              
              		// Create return CST Node
              		Node reference_definitionReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
              		reference_definitionReturnNode.setKind("reference_definition");
              	    // Create a Token CST Leaf	
              	    if(TK_0 != null) {
              			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
              	 		TK_0Leaf.setKind("TOKEN");
              	 		TK_0Leaf.setValue(TK_0.getText());
              			TK_0Leaf.setPos(TK_0.getCharPositionInLine());
              			TK_0Leaf.setLine(TK_0.getLine());
              	 		reference_definitionReturnNode.getChildren().add(TK_0Leaf);
              	 	}
              	    // Create a CST Leaf
              		if(OQUOTEGen != null) {
              			Leaf OQUOTEGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf();
              			OQUOTEGenLeaf.setKind("OQUOTE");
              			OQUOTEGenLeaf.setValue(OQUOTEGen.getText());
              			OQUOTEGenLeaf.setPos(OQUOTEGen.getCharPositionInLine());
              			OQUOTEGenLeaf.setLine(OQUOTEGen.getLine());
              			reference_definitionReturnNode.getChildren().add(OQUOTEGenLeaf);
              		}
              	    // Create a CST Leaf
              		if(IDGen != null) {
              			Leaf IDGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf();
              			IDGenLeaf.setKind("ID");
              			IDGenLeaf.setValue(IDGen.getText());
              			IDGenLeaf.setPos(IDGen.getCharPositionInLine());
              			IDGenLeaf.setLine(IDGen.getLine());
              			reference_definitionReturnNode.getChildren().add(IDGenLeaf);
              		}
              	    // Create a CST Leaf
              		if(OQUOTEGen_1 != null) {
              			Leaf OQUOTEGen_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
              			OQUOTEGen_1Leaf.setKind("OQUOTE");
              			OQUOTEGen_1Leaf.setValue(OQUOTEGen_1.getText());
              			OQUOTEGen_1Leaf.setPos(OQUOTEGen_1.getCharPositionInLine());
              			OQUOTEGen_1Leaf.setLine(OQUOTEGen_1.getLine());
              			reference_definitionReturnNode.getChildren().add(OQUOTEGen_1Leaf);
              		}
              	    // Create a Token CST Leaf	
              	    if(TK_1 != null) {
              			Leaf TK_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
              	 		TK_1Leaf.setKind("TOKEN");
              	 		TK_1Leaf.setValue(TK_1.getText());
              			TK_1Leaf.setPos(TK_1.getCharPositionInLine());
              			TK_1Leaf.setLine(TK_1.getLine());
              	 		reference_definitionReturnNode.getChildren().add(TK_1Leaf);
              	 	}
              	    // Create a CST Node
              		if(list_index_col_nameGen != null) {
              	        for(Iterator it = list_index_col_nameGen.iterator(); it.hasNext(); )  { 
              	            DDLMySQLParser.index_col_name_return r = (DDLMySQLParser.index_col_name_return) it.next(); 
              	            if(r != null && r.returnNode != null) {
              	            	r.returnNode.setKind("index_col_name");
              	            	reference_definitionReturnNode.getChildren().add(r.returnNode);
              	            } 
              	        }
              	    }
              	
              		// Create a special CST Node for terminal index_col_nameGen_1 aggregation
              		if(list_index_col_nameGen_1 != null) {
              	    for(int pos = 0; pos < list_index_col_nameGen_1.size(); pos++ )  { 
              	    // Create a Token CST Leaf	
              	    if(TK_2 != null) {
              			Leaf TK_2Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
              	 		TK_2Leaf.setKind("TOKEN");
              	 		TK_2Leaf.setValue(TK_2.getText());
              			TK_2Leaf.setPos(TK_2.getCharPositionInLine());
              			TK_2Leaf.setLine(TK_2.getLine());
              	 		reference_definitionReturnNode.getChildren().add(TK_2Leaf);
              	 	}
              		// No Terminal extractor
              	    if(list_index_col_nameGen_1 != null) {		
              	    	DDLMySQLParser.index_col_name_return r = (DDLMySQLParser.index_col_name_return) list_index_col_nameGen_1.get(pos); 
              	    	if(r != null && r.returnNode != null) {
              	        	r.returnNode.setKind("index_col_name");
              	    		reference_definitionReturnNode.getChildren().add(r.returnNode);
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
              	 		reference_definitionReturnNode.getChildren().add(TK_3Leaf);
              	 	}
              	    // Create a Token CST Leaf	
              	    if(TK_4 != null) {
              			Leaf TK_4Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
              	 		TK_4Leaf.setKind("TOKEN");
              	 		TK_4Leaf.setValue(TK_4.getText());
              			TK_4Leaf.setPos(TK_4.getCharPositionInLine());
              			TK_4Leaf.setLine(TK_4.getLine());
              	 		reference_definitionReturnNode.getChildren().add(TK_4Leaf);
              	 	}
              	    // Create a Token CST Leaf	
              	    if(TK_5 != null) {
              			Leaf TK_5Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
              	 		TK_5Leaf.setKind("TOKEN");
              	 		TK_5Leaf.setValue(TK_5.getText());
              			TK_5Leaf.setPos(TK_5.getCharPositionInLine());
              			TK_5Leaf.setLine(TK_5.getLine());
              	 		reference_definitionReturnNode.getChildren().add(TK_5Leaf);
              	 	}
              	    // Create a Token CST Leaf	
              	    if(TK_6 != null) {
              			Leaf TK_6Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
              	 		TK_6Leaf.setKind("TOKEN");
              	 		TK_6Leaf.setValue(TK_6.getText());
              			TK_6Leaf.setPos(TK_6.getCharPositionInLine());
              			TK_6Leaf.setLine(TK_6.getLine());
              	 		reference_definitionReturnNode.getChildren().add(TK_6Leaf);
              	 	}
              	    // Create a Token CST Leaf	
              	    if(TK_7 != null) {
              			Leaf TK_7Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
              	 		TK_7Leaf.setKind("TOKEN");
              	 		TK_7Leaf.setValue(TK_7.getText());
              			TK_7Leaf.setPos(TK_7.getCharPositionInLine());
              			TK_7Leaf.setLine(TK_7.getLine());
              	 		reference_definitionReturnNode.getChildren().add(TK_7Leaf);
              	 	}
              	    // Create a Token CST Leaf	
              	    if(TK_8 != null) {
              			Leaf TK_8Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
              	 		TK_8Leaf.setKind("TOKEN");
              	 		TK_8Leaf.setValue(TK_8.getText());
              			TK_8Leaf.setPos(TK_8.getCharPositionInLine());
              			TK_8Leaf.setLine(TK_8.getLine());
              	 		reference_definitionReturnNode.getChildren().add(TK_8Leaf);
              	 	}
              	    // Create a Token CST Leaf	
              	    if(TK_9 != null) {
              			Leaf TK_9Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
              	 		TK_9Leaf.setKind("TOKEN");
              	 		TK_9Leaf.setValue(TK_9.getText());
              			TK_9Leaf.setPos(TK_9.getCharPositionInLine());
              			TK_9Leaf.setLine(TK_9.getLine());
              	 		reference_definitionReturnNode.getChildren().add(TK_9Leaf);
              	 	}
              	    // Create a Token CST Leaf	
              	    if(TK_10 != null) {
              			Leaf TK_10Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
              	 		TK_10Leaf.setKind("TOKEN");
              	 		TK_10Leaf.setValue(TK_10.getText());
              			TK_10Leaf.setPos(TK_10.getCharPositionInLine());
              			TK_10Leaf.setLine(TK_10.getLine());
              	 		reference_definitionReturnNode.getChildren().add(TK_10Leaf);
              	 	}
              	    // Create a Token CST Leaf	
              	    if(TK_11 != null) {
              			Leaf TK_11Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
              	 		TK_11Leaf.setKind("TOKEN");
              	 		TK_11Leaf.setValue(TK_11.getText());
              			TK_11Leaf.setPos(TK_11.getCharPositionInLine());
              			TK_11Leaf.setLine(TK_11.getLine());
              	 		reference_definitionReturnNode.getChildren().add(TK_11Leaf);
              	 	}
              	    // Create a CST Node
              		if(list_reference_optionGen != null) {
              	        for(Iterator it = list_reference_optionGen.iterator(); it.hasNext(); )  { 
              	            DDLMySQLParser.reference_option_return r = (DDLMySQLParser.reference_option_return) it.next(); 
              	            if(r != null && r.returnNode != null) {
              	            	r.returnNode.setKind("reference_option");
              	            	reference_definitionReturnNode.getChildren().add(r.returnNode);
              	            } 
              	        }
              	    }
              	    // Create a Token CST Leaf	
              	    if(TK_12 != null) {
              			Leaf TK_12Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
              	 		TK_12Leaf.setKind("TOKEN");
              	 		TK_12Leaf.setValue(TK_12.getText());
              			TK_12Leaf.setPos(TK_12.getCharPositionInLine());
              			TK_12Leaf.setLine(TK_12.getLine());
              	 		reference_definitionReturnNode.getChildren().add(TK_12Leaf);
              	 	}
              	    // Create a Token CST Leaf	
              	    if(TK_13 != null) {
              			Leaf TK_13Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
              	 		TK_13Leaf.setKind("TOKEN");
              	 		TK_13Leaf.setValue(TK_13.getText());
              			TK_13Leaf.setPos(TK_13.getCharPositionInLine());
              			TK_13Leaf.setLine(TK_13.getLine());
              	 		reference_definitionReturnNode.getChildren().add(TK_13Leaf);
              	 	}
              	    // Create a CST Node
              		if(list_reference_optionGen_1 != null) {
              	        for(Iterator it = list_reference_optionGen_1.iterator(); it.hasNext(); )  { 
              	            DDLMySQLParser.reference_option_return r = (DDLMySQLParser.reference_option_return) it.next(); 
              	            if(r != null && r.returnNode != null) {
              	            	r.returnNode.setKind("reference_option");
              	            	reference_definitionReturnNode.getChildren().add(r.returnNode);
              	            } 
              	        }
              	    }
              		// Returns the Node with CST Leaves/Nodes
              		retval.returnNode = reference_definitionReturnNode;
              	
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
    // $ANTLR end reference_definition

    public static class reference_option_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start reference_option
    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:4254:1: reference_option returns [Node returnNode] : (TK_0= 'RESTRICT' | TK_0= 'CASCADE' | TK_0= 'SET' TK_1= 'NULL' | TK_0= 'NO' TK_1= 'ACTION' );
    public final reference_option_return reference_option() throws RecognitionException {
        reference_option_return retval = new reference_option_return();
        retval.start = input.LT(1);

        Token TK_0=null;
        Token TK_1=null;

        try {
            // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:4255:1: (TK_0= 'RESTRICT' | TK_0= 'CASCADE' | TK_0= 'SET' TK_1= 'NULL' | TK_0= 'NO' TK_1= 'ACTION' )
            int alt139=4;
            switch ( input.LA(1) ) {
            case 123:
                {
                alt139=1;
                }
                break;
            case 124:
                {
                alt139=2;
                }
                break;
            case 19:
                {
                alt139=3;
                }
                break;
            case 106:
                {
                alt139=4;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("4254:1: reference_option returns [Node returnNode] : (TK_0= 'RESTRICT' | TK_0= 'CASCADE' | TK_0= 'SET' TK_1= 'NULL' | TK_0= 'NO' TK_1= 'ACTION' );", 139, 0, input);

                throw nvae;
            }

            switch (alt139) {
                case 1 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:4255:3: TK_0= 'RESTRICT'
                    {
                    TK_0=(Token)input.LT(1);
                    match(input,123,FOLLOW_123_in_reference_option2978); if (failed) return retval;
                    if ( backtracking==0 ) {
                      
                      		// Create return CST Node
                      		Node reference_optionReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                      		reference_optionReturnNode.setKind("reference_option");
                      	    // Create a Token CST Leaf	
                      	    if(TK_0 != null) {
                      			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      	 		TK_0Leaf.setKind("TOKEN");
                      	 		TK_0Leaf.setValue(TK_0.getText());
                      			TK_0Leaf.setPos(TK_0.getCharPositionInLine());
                      			TK_0Leaf.setLine(TK_0.getLine());
                      	 		reference_optionReturnNode.getChildren().add(TK_0Leaf);
                      	 	}
                      		// Returns the Node with CST Leaves/Nodes
                      		retval.returnNode = reference_optionReturnNode;
                      	
                    }

                    }
                    break;
                case 2 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:4272:5: TK_0= 'CASCADE'
                    {
                    TK_0=(Token)input.LT(1);
                    match(input,124,FOLLOW_124_in_reference_option2991); if (failed) return retval;
                    if ( backtracking==0 ) {
                      
                      		// Create return CST Node
                      		Node reference_optionReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                      		reference_optionReturnNode.setKind("reference_option");
                      	    // Create a Token CST Leaf	
                      	    if(TK_0 != null) {
                      			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      	 		TK_0Leaf.setKind("TOKEN");
                      	 		TK_0Leaf.setValue(TK_0.getText());
                      			TK_0Leaf.setPos(TK_0.getCharPositionInLine());
                      			TK_0Leaf.setLine(TK_0.getLine());
                      	 		reference_optionReturnNode.getChildren().add(TK_0Leaf);
                      	 	}
                      		// Returns the Node with CST Leaves/Nodes
                      		retval.returnNode = reference_optionReturnNode;
                      	
                    }

                    }
                    break;
                case 3 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:4289:5: TK_0= 'SET' TK_1= 'NULL'
                    {
                    TK_0=(Token)input.LT(1);
                    match(input,19,FOLLOW_19_in_reference_option3004); if (failed) return retval;
                    TK_1=(Token)input.LT(1);
                    match(input,45,FOLLOW_45_in_reference_option3008); if (failed) return retval;
                    if ( backtracking==0 ) {
                      
                      		// Create return CST Node
                      		Node reference_optionReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                      		reference_optionReturnNode.setKind("reference_option");
                      	    // Create a Token CST Leaf	
                      	    if(TK_0 != null) {
                      			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      	 		TK_0Leaf.setKind("TOKEN");
                      	 		TK_0Leaf.setValue(TK_0.getText());
                      			TK_0Leaf.setPos(TK_0.getCharPositionInLine());
                      			TK_0Leaf.setLine(TK_0.getLine());
                      	 		reference_optionReturnNode.getChildren().add(TK_0Leaf);
                      	 	}
                      	    // Create a Token CST Leaf	
                      	    if(TK_1 != null) {
                      			Leaf TK_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      	 		TK_1Leaf.setKind("TOKEN");
                      	 		TK_1Leaf.setValue(TK_1.getText());
                      			TK_1Leaf.setPos(TK_1.getCharPositionInLine());
                      			TK_1Leaf.setLine(TK_1.getLine());
                      	 		reference_optionReturnNode.getChildren().add(TK_1Leaf);
                      	 	}
                      		// Returns the Node with CST Leaves/Nodes
                      		retval.returnNode = reference_optionReturnNode;
                      	
                    }

                    }
                    break;
                case 4 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:4315:5: TK_0= 'NO' TK_1= 'ACTION'
                    {
                    TK_0=(Token)input.LT(1);
                    match(input,106,FOLLOW_106_in_reference_option3020); if (failed) return retval;
                    TK_1=(Token)input.LT(1);
                    match(input,125,FOLLOW_125_in_reference_option3024); if (failed) return retval;
                    if ( backtracking==0 ) {
                      
                      		// Create return CST Node
                      		Node reference_optionReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                      		reference_optionReturnNode.setKind("reference_option");
                      	    // Create a Token CST Leaf	
                      	    if(TK_0 != null) {
                      			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      	 		TK_0Leaf.setKind("TOKEN");
                      	 		TK_0Leaf.setValue(TK_0.getText());
                      			TK_0Leaf.setPos(TK_0.getCharPositionInLine());
                      			TK_0Leaf.setLine(TK_0.getLine());
                      	 		reference_optionReturnNode.getChildren().add(TK_0Leaf);
                      	 	}
                      	    // Create a Token CST Leaf	
                      	    if(TK_1 != null) {
                      			Leaf TK_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      	 		TK_1Leaf.setKind("TOKEN");
                      	 		TK_1Leaf.setValue(TK_1.getText());
                      			TK_1Leaf.setPos(TK_1.getCharPositionInLine());
                      			TK_1Leaf.setLine(TK_1.getLine());
                      	 		reference_optionReturnNode.getChildren().add(TK_1Leaf);
                      	 	}
                      		// Returns the Node with CST Leaves/Nodes
                      		retval.returnNode = reference_optionReturnNode;
                      	
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
    // $ANTLR end reference_option

    public static class drop_table_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start drop_table
    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:4343:1: drop_table returns [Node returnNode] : TK_0= 'DROP' (TK_1= 'TEMPORARY' )? TK_2= 'TABLE' (TK_3= 'IF' TK_4= 'EXISTS' )? OQUOTEGen= OQUOTE IDGen= ID OQUOTEGen_1= OQUOTE (TK_5= ',' OQUOTEGen_2_List+= OQUOTE IDGen_1_List+= ID OQUOTEGen_3_List+= OQUOTE )* (TK_6= 'RESTRICT' | TK_7= 'CASCADE' )? TK_8= ';' ;
    public final drop_table_return drop_table() throws RecognitionException {
        drop_table_return retval = new drop_table_return();
        retval.start = input.LT(1);

        Token TK_0=null;
        Token TK_1=null;
        Token TK_2=null;
        Token TK_3=null;
        Token TK_4=null;
        Token OQUOTEGen=null;
        Token IDGen=null;
        Token OQUOTEGen_1=null;
        Token TK_5=null;
        Token TK_6=null;
        Token TK_7=null;
        Token TK_8=null;
        Token OQUOTEGen_2_List=null;
        Token IDGen_1_List=null;
        Token OQUOTEGen_3_List=null;
        List list_OQUOTEGen_2_List=null;
        List list_IDGen_1_List=null;
        List list_OQUOTEGen_3_List=null;

        try {
            // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:4344:1: (TK_0= 'DROP' (TK_1= 'TEMPORARY' )? TK_2= 'TABLE' (TK_3= 'IF' TK_4= 'EXISTS' )? OQUOTEGen= OQUOTE IDGen= ID OQUOTEGen_1= OQUOTE (TK_5= ',' OQUOTEGen_2_List+= OQUOTE IDGen_1_List+= ID OQUOTEGen_3_List+= OQUOTE )* (TK_6= 'RESTRICT' | TK_7= 'CASCADE' )? TK_8= ';' )
            // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:4344:4: TK_0= 'DROP' (TK_1= 'TEMPORARY' )? TK_2= 'TABLE' (TK_3= 'IF' TK_4= 'EXISTS' )? OQUOTEGen= OQUOTE IDGen= ID OQUOTEGen_1= OQUOTE (TK_5= ',' OQUOTEGen_2_List+= OQUOTE IDGen_1_List+= ID OQUOTEGen_3_List+= OQUOTE )* (TK_6= 'RESTRICT' | TK_7= 'CASCADE' )? TK_8= ';'
            {
            TK_0=(Token)input.LT(1);
            match(input,126,FOLLOW_126_in_drop_table3046); if (failed) return retval;
            // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:4344:16: (TK_1= 'TEMPORARY' )?
            int alt140=2;
            int LA140_0 = input.LA(1);

            if ( (LA140_0==36) ) {
                alt140=1;
            }
            switch (alt140) {
                case 1 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:4344:17: TK_1= 'TEMPORARY'
                    {
                    TK_1=(Token)input.LT(1);
                    match(input,36,FOLLOW_36_in_drop_table3051); if (failed) return retval;

                    }
                    break;

            }

            TK_2=(Token)input.LT(1);
            match(input,37,FOLLOW_37_in_drop_table3057); if (failed) return retval;
            // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:4344:49: (TK_3= 'IF' TK_4= 'EXISTS' )?
            int alt141=2;
            int LA141_0 = input.LA(1);

            if ( (LA141_0==30) ) {
                alt141=1;
            }
            switch (alt141) {
                case 1 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:4344:50: TK_3= 'IF' TK_4= 'EXISTS'
                    {
                    TK_3=(Token)input.LT(1);
                    match(input,30,FOLLOW_30_in_drop_table3062); if (failed) return retval;
                    TK_4=(Token)input.LT(1);
                    match(input,32,FOLLOW_32_in_drop_table3066); if (failed) return retval;

                    }
                    break;

            }

            OQUOTEGen=(Token)input.LT(1);
            match(input,OQUOTE,FOLLOW_OQUOTE_in_drop_table3072); if (failed) return retval;
            IDGen=(Token)input.LT(1);
            match(input,ID,FOLLOW_ID_in_drop_table3076); if (failed) return retval;
            OQUOTEGen_1=(Token)input.LT(1);
            match(input,OQUOTE,FOLLOW_OQUOTE_in_drop_table3080); if (failed) return retval;
            // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:4344:121: (TK_5= ',' OQUOTEGen_2_List+= OQUOTE IDGen_1_List+= ID OQUOTEGen_3_List+= OQUOTE )*
            loop142:
            do {
                int alt142=2;
                int LA142_0 = input.LA(1);

                if ( (LA142_0==20) ) {
                    alt142=1;
                }


                switch (alt142) {
            	case 1 :
            	    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:4344:122: TK_5= ',' OQUOTEGen_2_List+= OQUOTE IDGen_1_List+= ID OQUOTEGen_3_List+= OQUOTE
            	    {
            	    TK_5=(Token)input.LT(1);
            	    match(input,20,FOLLOW_20_in_drop_table3085); if (failed) return retval;
            	    OQUOTEGen_2_List=(Token)input.LT(1);
            	    match(input,OQUOTE,FOLLOW_OQUOTE_in_drop_table3089); if (failed) return retval;
            	    if (list_OQUOTEGen_2_List==null) list_OQUOTEGen_2_List=new ArrayList();
            	    list_OQUOTEGen_2_List.add(OQUOTEGen_2_List);

            	    IDGen_1_List=(Token)input.LT(1);
            	    match(input,ID,FOLLOW_ID_in_drop_table3093); if (failed) return retval;
            	    if (list_IDGen_1_List==null) list_IDGen_1_List=new ArrayList();
            	    list_IDGen_1_List.add(IDGen_1_List);

            	    OQUOTEGen_3_List=(Token)input.LT(1);
            	    match(input,OQUOTE,FOLLOW_OQUOTE_in_drop_table3097); if (failed) return retval;
            	    if (list_OQUOTEGen_3_List==null) list_OQUOTEGen_3_List=new ArrayList();
            	    list_OQUOTEGen_3_List.add(OQUOTEGen_3_List);


            	    }
            	    break;

            	default :
            	    break loop142;
                }
            } while (true);

            // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:4345:6: (TK_6= 'RESTRICT' | TK_7= 'CASCADE' )?
            int alt143=3;
            int LA143_0 = input.LA(1);

            if ( (LA143_0==123) ) {
                alt143=1;
            }
            else if ( (LA143_0==124) ) {
                alt143=2;
            }
            switch (alt143) {
                case 1 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:4345:7: TK_6= 'RESTRICT'
                    {
                    TK_6=(Token)input.LT(1);
                    match(input,123,FOLLOW_123_in_drop_table3109); if (failed) return retval;

                    }
                    break;
                case 2 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:4345:25: TK_7= 'CASCADE'
                    {
                    TK_7=(Token)input.LT(1);
                    match(input,124,FOLLOW_124_in_drop_table3115); if (failed) return retval;

                    }
                    break;

            }

            TK_8=(Token)input.LT(1);
            match(input,21,FOLLOW_21_in_drop_table3121); if (failed) return retval;
            if ( backtracking==0 ) {
              
              		// Create return CST Node
              		Node drop_tableReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
              		drop_tableReturnNode.setKind("drop_table");
              	    // Create a Token CST Leaf	
              	    if(TK_0 != null) {
              			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
              	 		TK_0Leaf.setKind("TOKEN");
              	 		TK_0Leaf.setValue(TK_0.getText());
              			TK_0Leaf.setPos(TK_0.getCharPositionInLine());
              			TK_0Leaf.setLine(TK_0.getLine());
              	 		drop_tableReturnNode.getChildren().add(TK_0Leaf);
              	 	}
              	    // Create a Token CST Leaf	
              	    if(TK_1 != null) {
              			Leaf TK_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
              	 		TK_1Leaf.setKind("TOKEN");
              	 		TK_1Leaf.setValue(TK_1.getText());
              			TK_1Leaf.setPos(TK_1.getCharPositionInLine());
              			TK_1Leaf.setLine(TK_1.getLine());
              	 		drop_tableReturnNode.getChildren().add(TK_1Leaf);
              	 	}
              	    // Create a Token CST Leaf	
              	    if(TK_2 != null) {
              			Leaf TK_2Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
              	 		TK_2Leaf.setKind("TOKEN");
              	 		TK_2Leaf.setValue(TK_2.getText());
              			TK_2Leaf.setPos(TK_2.getCharPositionInLine());
              			TK_2Leaf.setLine(TK_2.getLine());
              	 		drop_tableReturnNode.getChildren().add(TK_2Leaf);
              	 	}
              	    // Create a Token CST Leaf	
              	    if(TK_3 != null) {
              			Leaf TK_3Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
              	 		TK_3Leaf.setKind("TOKEN");
              	 		TK_3Leaf.setValue(TK_3.getText());
              			TK_3Leaf.setPos(TK_3.getCharPositionInLine());
              			TK_3Leaf.setLine(TK_3.getLine());
              	 		drop_tableReturnNode.getChildren().add(TK_3Leaf);
              	 	}
              	    // Create a Token CST Leaf	
              	    if(TK_4 != null) {
              			Leaf TK_4Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
              	 		TK_4Leaf.setKind("TOKEN");
              	 		TK_4Leaf.setValue(TK_4.getText());
              			TK_4Leaf.setPos(TK_4.getCharPositionInLine());
              			TK_4Leaf.setLine(TK_4.getLine());
              	 		drop_tableReturnNode.getChildren().add(TK_4Leaf);
              	 	}
              	    // Create a CST Leaf
              		if(OQUOTEGen != null) {
              			Leaf OQUOTEGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf();
              			OQUOTEGenLeaf.setKind("OQUOTE");
              			OQUOTEGenLeaf.setValue(OQUOTEGen.getText());
              			OQUOTEGenLeaf.setPos(OQUOTEGen.getCharPositionInLine());
              			OQUOTEGenLeaf.setLine(OQUOTEGen.getLine());
              			drop_tableReturnNode.getChildren().add(OQUOTEGenLeaf);
              		}
              	    // Create a CST Leaf
              		if(IDGen != null) {
              			Leaf IDGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf();
              			IDGenLeaf.setKind("ID");
              			IDGenLeaf.setValue(IDGen.getText());
              			IDGenLeaf.setPos(IDGen.getCharPositionInLine());
              			IDGenLeaf.setLine(IDGen.getLine());
              			drop_tableReturnNode.getChildren().add(IDGenLeaf);
              		}
              	    // Create a CST Leaf
              		if(OQUOTEGen_1 != null) {
              			Leaf OQUOTEGen_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
              			OQUOTEGen_1Leaf.setKind("OQUOTE");
              			OQUOTEGen_1Leaf.setValue(OQUOTEGen_1.getText());
              			OQUOTEGen_1Leaf.setPos(OQUOTEGen_1.getCharPositionInLine());
              			OQUOTEGen_1Leaf.setLine(OQUOTEGen_1.getLine());
              			drop_tableReturnNode.getChildren().add(OQUOTEGen_1Leaf);
              		}
              	
              		// Create a special CST Node for terminal OQUOTEGen_2_List aggregation
              		if(list_OQUOTEGen_2_List != null) {
              	    for(int pos = 0; pos < list_OQUOTEGen_2_List.size(); pos++ )  { 
              	    // Create a Token CST Leaf	
              	    if(TK_5 != null) {
              			Leaf TK_5Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
              	 		TK_5Leaf.setKind("TOKEN");
              	 		TK_5Leaf.setValue(TK_5.getText());
              			TK_5Leaf.setPos(TK_5.getCharPositionInLine());
              			TK_5Leaf.setLine(TK_5.getLine());
              	 		drop_tableReturnNode.getChildren().add(TK_5Leaf);
              	 	}
              		// Terminal extractor
              	    if(list_OQUOTEGen_2_List != null) {
              		    Token t = (Token) list_OQUOTEGen_2_List.get(pos); 
              		    Leaf OQUOTEGen_2_ListLeaf = CSTFactoryImpl.eINSTANCE.createLeaf();
              			OQUOTEGen_2_ListLeaf.setKind("OQUOTE");
              			OQUOTEGen_2_ListLeaf.setValue(t.getText());
              			OQUOTEGen_2_ListLeaf.setPos(t.getCharPositionInLine());
              			OQUOTEGen_2_ListLeaf.setLine(t.getLine());
              			drop_tableReturnNode.getChildren().add(OQUOTEGen_2_ListLeaf);
              		}
              		// Terminal extractor
              	    if(list_IDGen_1_List != null) {
              		    Token t = (Token) list_IDGen_1_List.get(pos); 
              		    Leaf IDGen_1_ListLeaf = CSTFactoryImpl.eINSTANCE.createLeaf();
              			IDGen_1_ListLeaf.setKind("ID");
              			IDGen_1_ListLeaf.setValue(t.getText());
              			IDGen_1_ListLeaf.setPos(t.getCharPositionInLine());
              			IDGen_1_ListLeaf.setLine(t.getLine());
              			drop_tableReturnNode.getChildren().add(IDGen_1_ListLeaf);
              		}
              		// Terminal extractor
              	    if(list_OQUOTEGen_3_List != null) {
              		    Token t = (Token) list_OQUOTEGen_3_List.get(pos); 
              		    Leaf OQUOTEGen_3_ListLeaf = CSTFactoryImpl.eINSTANCE.createLeaf();
              			OQUOTEGen_3_ListLeaf.setKind("OQUOTE");
              			OQUOTEGen_3_ListLeaf.setValue(t.getText());
              			OQUOTEGen_3_ListLeaf.setPos(t.getCharPositionInLine());
              			OQUOTEGen_3_ListLeaf.setLine(t.getLine());
              			drop_tableReturnNode.getChildren().add(OQUOTEGen_3_ListLeaf);
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
              	 		drop_tableReturnNode.getChildren().add(TK_6Leaf);
              	 	}
              	    // Create a Token CST Leaf	
              	    if(TK_7 != null) {
              			Leaf TK_7Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
              	 		TK_7Leaf.setKind("TOKEN");
              	 		TK_7Leaf.setValue(TK_7.getText());
              			TK_7Leaf.setPos(TK_7.getCharPositionInLine());
              			TK_7Leaf.setLine(TK_7.getLine());
              	 		drop_tableReturnNode.getChildren().add(TK_7Leaf);
              	 	}
              	    // Create a Token CST Leaf	
              	    if(TK_8 != null) {
              			Leaf TK_8Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
              	 		TK_8Leaf.setKind("TOKEN");
              	 		TK_8Leaf.setValue(TK_8.getText());
              			TK_8Leaf.setPos(TK_8.getCharPositionInLine());
              			TK_8Leaf.setLine(TK_8.getLine());
              	 		drop_tableReturnNode.getChildren().add(TK_8Leaf);
              	 	}
              		// Returns the Node with CST Leaves/Nodes
              		retval.returnNode = drop_tableReturnNode;
              	
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
    // $ANTLR end drop_table

    public static class data_manipulation_statements_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start data_manipulation_statements
    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:4500:1: data_manipulation_statements returns [Node returnNode] : insert_statementGen+= insert_statement ;
    public final data_manipulation_statements_return data_manipulation_statements() throws RecognitionException {
        data_manipulation_statements_return retval = new data_manipulation_statements_return();
        retval.start = input.LT(1);

        List list_insert_statementGen=null;
        RuleReturnScope insert_statementGen = null;
        try {
            // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:4501:1: (insert_statementGen+= insert_statement )
            // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:4501:3: insert_statementGen+= insert_statement
            {
            pushFollow(FOLLOW_insert_statement_in_data_manipulation_statements3143);
            insert_statementGen=insert_statement();
            _fsp--;
            if (failed) return retval;
            if (list_insert_statementGen==null) list_insert_statementGen=new ArrayList();
            list_insert_statementGen.add(insert_statementGen);

            if ( backtracking==0 ) {
              
              		// Create return CST Node
              		Node data_manipulation_statementsReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
              		data_manipulation_statementsReturnNode.setKind("data_manipulation_statements");
              	    // Create a CST Node
              		if(list_insert_statementGen != null) {
              	        for(Iterator it = list_insert_statementGen.iterator(); it.hasNext(); )  { 
              	            DDLMySQLParser.insert_statement_return r = (DDLMySQLParser.insert_statement_return) it.next(); 
              	            if(r != null && r.returnNode != null) {
              	            	r.returnNode.setKind("insert_statement");
              	            	data_manipulation_statementsReturnNode.getChildren().add(r.returnNode);
              	            } 
              	        }
              	    }
              		// Returns the Node with CST Leaves/Nodes
              		retval.returnNode = data_manipulation_statementsReturnNode;
              	
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
    // $ANTLR end data_manipulation_statements

    public static class insert_statement_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start insert_statement
    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:4521:1: insert_statement returns [Node returnNode] : TK_0= 'INSERT' (TK_1= 'LOW_PRIORITY' | TK_2= 'DELAYED' | TK_3= 'HIGH_PRIORITY' )? (TK_4= 'IGNORE' )? (TK_5= 'INTO' )? OQUOTEGen= OQUOTE IDGen= ID OQUOTEGen_1= OQUOTE (TK_6= '(' col_nameGen+= col_name (TK_7= ',' col_nameGen_1+= col_name )* TK_8= ')' )? (TK_9= 'VALUES' ) insert_valueGen+= insert_value (TK_10= ',' insert_valueGen_1+= insert_value )* TK_11= ';' ;
    public final insert_statement_return insert_statement() throws RecognitionException {
        insert_statement_return retval = new insert_statement_return();
        retval.start = input.LT(1);

        Token TK_0=null;
        Token TK_1=null;
        Token TK_2=null;
        Token TK_3=null;
        Token TK_4=null;
        Token TK_5=null;
        Token OQUOTEGen=null;
        Token IDGen=null;
        Token OQUOTEGen_1=null;
        Token TK_6=null;
        Token TK_7=null;
        Token TK_8=null;
        Token TK_9=null;
        Token TK_10=null;
        Token TK_11=null;
        List list_col_nameGen=null;
        List list_col_nameGen_1=null;
        List list_insert_valueGen=null;
        List list_insert_valueGen_1=null;
        RuleReturnScope col_nameGen = null;
        RuleReturnScope col_nameGen_1 = null;
        RuleReturnScope insert_valueGen = null;
        RuleReturnScope insert_valueGen_1 = null;
        try {
            // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:4522:1: (TK_0= 'INSERT' (TK_1= 'LOW_PRIORITY' | TK_2= 'DELAYED' | TK_3= 'HIGH_PRIORITY' )? (TK_4= 'IGNORE' )? (TK_5= 'INTO' )? OQUOTEGen= OQUOTE IDGen= ID OQUOTEGen_1= OQUOTE (TK_6= '(' col_nameGen+= col_name (TK_7= ',' col_nameGen_1+= col_name )* TK_8= ')' )? (TK_9= 'VALUES' ) insert_valueGen+= insert_value (TK_10= ',' insert_valueGen_1+= insert_value )* TK_11= ';' )
            // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:4522:4: TK_0= 'INSERT' (TK_1= 'LOW_PRIORITY' | TK_2= 'DELAYED' | TK_3= 'HIGH_PRIORITY' )? (TK_4= 'IGNORE' )? (TK_5= 'INTO' )? OQUOTEGen= OQUOTE IDGen= ID OQUOTEGen_1= OQUOTE (TK_6= '(' col_nameGen+= col_name (TK_7= ',' col_nameGen_1+= col_name )* TK_8= ')' )? (TK_9= 'VALUES' ) insert_valueGen+= insert_value (TK_10= ',' insert_valueGen_1+= insert_value )* TK_11= ';'
            {
            TK_0=(Token)input.LT(1);
            match(input,127,FOLLOW_127_in_insert_statement3165); if (failed) return retval;
            // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:4522:18: (TK_1= 'LOW_PRIORITY' | TK_2= 'DELAYED' | TK_3= 'HIGH_PRIORITY' )?
            int alt144=4;
            switch ( input.LA(1) ) {
                case 128:
                    {
                    alt144=1;
                    }
                    break;
                case 129:
                    {
                    alt144=2;
                    }
                    break;
                case 130:
                    {
                    alt144=3;
                    }
                    break;
            }

            switch (alt144) {
                case 1 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:4522:19: TK_1= 'LOW_PRIORITY'
                    {
                    TK_1=(Token)input.LT(1);
                    match(input,128,FOLLOW_128_in_insert_statement3170); if (failed) return retval;

                    }
                    break;
                case 2 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:4522:41: TK_2= 'DELAYED'
                    {
                    TK_2=(Token)input.LT(1);
                    match(input,129,FOLLOW_129_in_insert_statement3176); if (failed) return retval;

                    }
                    break;
                case 3 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:4522:58: TK_3= 'HIGH_PRIORITY'
                    {
                    TK_3=(Token)input.LT(1);
                    match(input,130,FOLLOW_130_in_insert_statement3182); if (failed) return retval;

                    }
                    break;

            }

            // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:4522:81: (TK_4= 'IGNORE' )?
            int alt145=2;
            int LA145_0 = input.LA(1);

            if ( (LA145_0==131) ) {
                alt145=1;
            }
            switch (alt145) {
                case 1 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:4522:82: TK_4= 'IGNORE'
                    {
                    TK_4=(Token)input.LT(1);
                    match(input,131,FOLLOW_131_in_insert_statement3189); if (failed) return retval;

                    }
                    break;

            }

            // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:4523:6: (TK_5= 'INTO' )?
            int alt146=2;
            int LA146_0 = input.LA(1);

            if ( (LA146_0==132) ) {
                alt146=1;
            }
            switch (alt146) {
                case 1 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:4523:7: TK_5= 'INTO'
                    {
                    TK_5=(Token)input.LT(1);
                    match(input,132,FOLLOW_132_in_insert_statement3201); if (failed) return retval;

                    }
                    break;

            }

            OQUOTEGen=(Token)input.LT(1);
            match(input,OQUOTE,FOLLOW_OQUOTE_in_insert_statement3207); if (failed) return retval;
            IDGen=(Token)input.LT(1);
            match(input,ID,FOLLOW_ID_in_insert_statement3211); if (failed) return retval;
            OQUOTEGen_1=(Token)input.LT(1);
            match(input,OQUOTE,FOLLOW_OQUOTE_in_insert_statement3215); if (failed) return retval;
            // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:4523:66: (TK_6= '(' col_nameGen+= col_name (TK_7= ',' col_nameGen_1+= col_name )* TK_8= ')' )?
            int alt148=2;
            int LA148_0 = input.LA(1);

            if ( (LA148_0==38) ) {
                alt148=1;
            }
            switch (alt148) {
                case 1 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:4523:67: TK_6= '(' col_nameGen+= col_name (TK_7= ',' col_nameGen_1+= col_name )* TK_8= ')'
                    {
                    TK_6=(Token)input.LT(1);
                    match(input,38,FOLLOW_38_in_insert_statement3220); if (failed) return retval;
                    pushFollow(FOLLOW_col_name_in_insert_statement3224);
                    col_nameGen=col_name();
                    _fsp--;
                    if (failed) return retval;
                    if (list_col_nameGen==null) list_col_nameGen=new ArrayList();
                    list_col_nameGen.add(col_nameGen);

                    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:4523:98: (TK_7= ',' col_nameGen_1+= col_name )*
                    loop147:
                    do {
                        int alt147=2;
                        int LA147_0 = input.LA(1);

                        if ( (LA147_0==20) ) {
                            alt147=1;
                        }


                        switch (alt147) {
                    	case 1 :
                    	    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:4523:99: TK_7= ',' col_nameGen_1+= col_name
                    	    {
                    	    TK_7=(Token)input.LT(1);
                    	    match(input,20,FOLLOW_20_in_insert_statement3229); if (failed) return retval;
                    	    pushFollow(FOLLOW_col_name_in_insert_statement3233);
                    	    col_nameGen_1=col_name();
                    	    _fsp--;
                    	    if (failed) return retval;
                    	    if (list_col_nameGen_1==null) list_col_nameGen_1=new ArrayList();
                    	    list_col_nameGen_1.add(col_nameGen_1);


                    	    }
                    	    break;

                    	default :
                    	    break loop147;
                        }
                    } while (true);

                    TK_8=(Token)input.LT(1);
                    match(input,39,FOLLOW_39_in_insert_statement3239); if (failed) return retval;

                    }
                    break;

            }

            // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:4524:6: (TK_9= 'VALUES' )
            // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:4524:7: TK_9= 'VALUES'
            {
            TK_9=(Token)input.LT(1);
            match(input,133,FOLLOW_133_in_insert_statement3251); if (failed) return retval;

            }

            pushFollow(FOLLOW_insert_value_in_insert_statement3256);
            insert_valueGen=insert_value();
            _fsp--;
            if (failed) return retval;
            if (list_insert_valueGen==null) list_insert_valueGen=new ArrayList();
            list_insert_valueGen.add(insert_valueGen);

            // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:4524:52: (TK_10= ',' insert_valueGen_1+= insert_value )*
            loop149:
            do {
                int alt149=2;
                int LA149_0 = input.LA(1);

                if ( (LA149_0==20) ) {
                    alt149=1;
                }


                switch (alt149) {
            	case 1 :
            	    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:4524:53: TK_10= ',' insert_valueGen_1+= insert_value
            	    {
            	    TK_10=(Token)input.LT(1);
            	    match(input,20,FOLLOW_20_in_insert_statement3261); if (failed) return retval;
            	    pushFollow(FOLLOW_insert_value_in_insert_statement3265);
            	    insert_valueGen_1=insert_value();
            	    _fsp--;
            	    if (failed) return retval;
            	    if (list_insert_valueGen_1==null) list_insert_valueGen_1=new ArrayList();
            	    list_insert_valueGen_1.add(insert_valueGen_1);


            	    }
            	    break;

            	default :
            	    break loop149;
                }
            } while (true);

            TK_11=(Token)input.LT(1);
            match(input,21,FOLLOW_21_in_insert_statement3271); if (failed) return retval;
            if ( backtracking==0 ) {
              
              		// Create return CST Node
              		Node insert_statementReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
              		insert_statementReturnNode.setKind("insert_statement");
              	    // Create a Token CST Leaf	
              	    if(TK_0 != null) {
              			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
              	 		TK_0Leaf.setKind("TOKEN");
              	 		TK_0Leaf.setValue(TK_0.getText());
              			TK_0Leaf.setPos(TK_0.getCharPositionInLine());
              			TK_0Leaf.setLine(TK_0.getLine());
              	 		insert_statementReturnNode.getChildren().add(TK_0Leaf);
              	 	}
              	    // Create a Token CST Leaf	
              	    if(TK_1 != null) {
              			Leaf TK_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
              	 		TK_1Leaf.setKind("TOKEN");
              	 		TK_1Leaf.setValue(TK_1.getText());
              			TK_1Leaf.setPos(TK_1.getCharPositionInLine());
              			TK_1Leaf.setLine(TK_1.getLine());
              	 		insert_statementReturnNode.getChildren().add(TK_1Leaf);
              	 	}
              	    // Create a Token CST Leaf	
              	    if(TK_2 != null) {
              			Leaf TK_2Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
              	 		TK_2Leaf.setKind("TOKEN");
              	 		TK_2Leaf.setValue(TK_2.getText());
              			TK_2Leaf.setPos(TK_2.getCharPositionInLine());
              			TK_2Leaf.setLine(TK_2.getLine());
              	 		insert_statementReturnNode.getChildren().add(TK_2Leaf);
              	 	}
              	    // Create a Token CST Leaf	
              	    if(TK_3 != null) {
              			Leaf TK_3Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
              	 		TK_3Leaf.setKind("TOKEN");
              	 		TK_3Leaf.setValue(TK_3.getText());
              			TK_3Leaf.setPos(TK_3.getCharPositionInLine());
              			TK_3Leaf.setLine(TK_3.getLine());
              	 		insert_statementReturnNode.getChildren().add(TK_3Leaf);
              	 	}
              	    // Create a Token CST Leaf	
              	    if(TK_4 != null) {
              			Leaf TK_4Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
              	 		TK_4Leaf.setKind("TOKEN");
              	 		TK_4Leaf.setValue(TK_4.getText());
              			TK_4Leaf.setPos(TK_4.getCharPositionInLine());
              			TK_4Leaf.setLine(TK_4.getLine());
              	 		insert_statementReturnNode.getChildren().add(TK_4Leaf);
              	 	}
              	    // Create a Token CST Leaf	
              	    if(TK_5 != null) {
              			Leaf TK_5Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
              	 		TK_5Leaf.setKind("TOKEN");
              	 		TK_5Leaf.setValue(TK_5.getText());
              			TK_5Leaf.setPos(TK_5.getCharPositionInLine());
              			TK_5Leaf.setLine(TK_5.getLine());
              	 		insert_statementReturnNode.getChildren().add(TK_5Leaf);
              	 	}
              	    // Create a CST Leaf
              		if(OQUOTEGen != null) {
              			Leaf OQUOTEGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf();
              			OQUOTEGenLeaf.setKind("OQUOTE");
              			OQUOTEGenLeaf.setValue(OQUOTEGen.getText());
              			OQUOTEGenLeaf.setPos(OQUOTEGen.getCharPositionInLine());
              			OQUOTEGenLeaf.setLine(OQUOTEGen.getLine());
              			insert_statementReturnNode.getChildren().add(OQUOTEGenLeaf);
              		}
              	    // Create a CST Leaf
              		if(IDGen != null) {
              			Leaf IDGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf();
              			IDGenLeaf.setKind("ID");
              			IDGenLeaf.setValue(IDGen.getText());
              			IDGenLeaf.setPos(IDGen.getCharPositionInLine());
              			IDGenLeaf.setLine(IDGen.getLine());
              			insert_statementReturnNode.getChildren().add(IDGenLeaf);
              		}
              	    // Create a CST Leaf
              		if(OQUOTEGen_1 != null) {
              			Leaf OQUOTEGen_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
              			OQUOTEGen_1Leaf.setKind("OQUOTE");
              			OQUOTEGen_1Leaf.setValue(OQUOTEGen_1.getText());
              			OQUOTEGen_1Leaf.setPos(OQUOTEGen_1.getCharPositionInLine());
              			OQUOTEGen_1Leaf.setLine(OQUOTEGen_1.getLine());
              			insert_statementReturnNode.getChildren().add(OQUOTEGen_1Leaf);
              		}
              	    // Create a Token CST Leaf	
              	    if(TK_6 != null) {
              			Leaf TK_6Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
              	 		TK_6Leaf.setKind("TOKEN");
              	 		TK_6Leaf.setValue(TK_6.getText());
              			TK_6Leaf.setPos(TK_6.getCharPositionInLine());
              			TK_6Leaf.setLine(TK_6.getLine());
              	 		insert_statementReturnNode.getChildren().add(TK_6Leaf);
              	 	}
              	    // Create a CST Node
              		if(list_col_nameGen != null) {
              	        for(Iterator it = list_col_nameGen.iterator(); it.hasNext(); )  { 
              	            DDLMySQLParser.col_name_return r = (DDLMySQLParser.col_name_return) it.next(); 
              	            if(r != null && r.returnNode != null) {
              	            	r.returnNode.setKind("col_name");
              	            	insert_statementReturnNode.getChildren().add(r.returnNode);
              	            } 
              	        }
              	    }
              	
              		// Create a special CST Node for terminal col_nameGen_1 aggregation
              		if(list_col_nameGen_1 != null) {
              	    for(int pos = 0; pos < list_col_nameGen_1.size(); pos++ )  { 
              	    // Create a Token CST Leaf	
              	    if(TK_7 != null) {
              			Leaf TK_7Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
              	 		TK_7Leaf.setKind("TOKEN");
              	 		TK_7Leaf.setValue(TK_7.getText());
              			TK_7Leaf.setPos(TK_7.getCharPositionInLine());
              			TK_7Leaf.setLine(TK_7.getLine());
              	 		insert_statementReturnNode.getChildren().add(TK_7Leaf);
              	 	}
              		// No Terminal extractor
              	    if(list_col_nameGen_1 != null) {		
              	    	DDLMySQLParser.col_name_return r = (DDLMySQLParser.col_name_return) list_col_nameGen_1.get(pos); 
              	    	if(r != null && r.returnNode != null) {
              	        	r.returnNode.setKind("col_name");
              	    		insert_statementReturnNode.getChildren().add(r.returnNode);
              	    	} 
              		}
              		}
              		}
              	
              	    // Create a Token CST Leaf	
              	    if(TK_8 != null) {
              			Leaf TK_8Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
              	 		TK_8Leaf.setKind("TOKEN");
              	 		TK_8Leaf.setValue(TK_8.getText());
              			TK_8Leaf.setPos(TK_8.getCharPositionInLine());
              			TK_8Leaf.setLine(TK_8.getLine());
              	 		insert_statementReturnNode.getChildren().add(TK_8Leaf);
              	 	}
              	    // Create a Token CST Leaf	
              	    if(TK_9 != null) {
              			Leaf TK_9Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
              	 		TK_9Leaf.setKind("TOKEN");
              	 		TK_9Leaf.setValue(TK_9.getText());
              			TK_9Leaf.setPos(TK_9.getCharPositionInLine());
              			TK_9Leaf.setLine(TK_9.getLine());
              	 		insert_statementReturnNode.getChildren().add(TK_9Leaf);
              	 	}
              	    // Create a CST Node
              		if(list_insert_valueGen != null) {
              	        for(Iterator it = list_insert_valueGen.iterator(); it.hasNext(); )  { 
              	            DDLMySQLParser.insert_value_return r = (DDLMySQLParser.insert_value_return) it.next(); 
              	            if(r != null && r.returnNode != null) {
              	            	r.returnNode.setKind("insert_value");
              	            	insert_statementReturnNode.getChildren().add(r.returnNode);
              	            } 
              	        }
              	    }
              	
              		// Create a special CST Node for terminal insert_valueGen_1 aggregation
              		if(list_insert_valueGen_1 != null) {
              	    for(int pos = 0; pos < list_insert_valueGen_1.size(); pos++ )  { 
              	    // Create a Token CST Leaf	
              	    if(TK_10 != null) {
              			Leaf TK_10Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
              	 		TK_10Leaf.setKind("TOKEN");
              	 		TK_10Leaf.setValue(TK_10.getText());
              			TK_10Leaf.setPos(TK_10.getCharPositionInLine());
              			TK_10Leaf.setLine(TK_10.getLine());
              	 		insert_statementReturnNode.getChildren().add(TK_10Leaf);
              	 	}
              		// No Terminal extractor
              	    if(list_insert_valueGen_1 != null) {		
              	    	DDLMySQLParser.insert_value_return r = (DDLMySQLParser.insert_value_return) list_insert_valueGen_1.get(pos); 
              	    	if(r != null && r.returnNode != null) {
              	        	r.returnNode.setKind("insert_value");
              	    		insert_statementReturnNode.getChildren().add(r.returnNode);
              	    	} 
              		}
              		}
              		}
              	
              	    // Create a Token CST Leaf	
              	    if(TK_11 != null) {
              			Leaf TK_11Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
              	 		TK_11Leaf.setKind("TOKEN");
              	 		TK_11Leaf.setValue(TK_11.getText());
              			TK_11Leaf.setPos(TK_11.getCharPositionInLine());
              			TK_11Leaf.setLine(TK_11.getLine());
              	 		insert_statementReturnNode.getChildren().add(TK_11Leaf);
              	 	}
              		// Returns the Node with CST Leaves/Nodes
              		retval.returnNode = insert_statementReturnNode;
              	
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
    // $ANTLR end insert_statement

    public static class col_name_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start col_name
    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:4719:1: col_name returns [Node returnNode] : OQUOTEGen= OQUOTE IDGen= ID OQUOTEGen_1= OQUOTE ;
    public final col_name_return col_name() throws RecognitionException {
        col_name_return retval = new col_name_return();
        retval.start = input.LT(1);

        Token OQUOTEGen=null;
        Token IDGen=null;
        Token OQUOTEGen_1=null;

        try {
            // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:4720:1: (OQUOTEGen= OQUOTE IDGen= ID OQUOTEGen_1= OQUOTE )
            // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:4720:5: OQUOTEGen= OQUOTE IDGen= ID OQUOTEGen_1= OQUOTE
            {
            OQUOTEGen=(Token)input.LT(1);
            match(input,OQUOTE,FOLLOW_OQUOTE_in_col_name3298); if (failed) return retval;
            IDGen=(Token)input.LT(1);
            match(input,ID,FOLLOW_ID_in_col_name3302); if (failed) return retval;
            OQUOTEGen_1=(Token)input.LT(1);
            match(input,OQUOTE,FOLLOW_OQUOTE_in_col_name3306); if (failed) return retval;
            if ( backtracking==0 ) {
              
              		// Create return CST Node
              		Node col_nameReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
              		col_nameReturnNode.setKind("col_name");
              	    // Create a CST Leaf
              		if(OQUOTEGen != null) {
              			Leaf OQUOTEGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf();
              			OQUOTEGenLeaf.setKind("OQUOTE");
              			OQUOTEGenLeaf.setValue(OQUOTEGen.getText());
              			OQUOTEGenLeaf.setPos(OQUOTEGen.getCharPositionInLine());
              			OQUOTEGenLeaf.setLine(OQUOTEGen.getLine());
              			col_nameReturnNode.getChildren().add(OQUOTEGenLeaf);
              		}
              	    // Create a CST Leaf
              		if(IDGen != null) {
              			Leaf IDGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf();
              			IDGenLeaf.setKind("ID");
              			IDGenLeaf.setValue(IDGen.getText());
              			IDGenLeaf.setPos(IDGen.getCharPositionInLine());
              			IDGenLeaf.setLine(IDGen.getLine());
              			col_nameReturnNode.getChildren().add(IDGenLeaf);
              		}
              	    // Create a CST Leaf
              		if(OQUOTEGen_1 != null) {
              			Leaf OQUOTEGen_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
              			OQUOTEGen_1Leaf.setKind("OQUOTE");
              			OQUOTEGen_1Leaf.setValue(OQUOTEGen_1.getText());
              			OQUOTEGen_1Leaf.setPos(OQUOTEGen_1.getCharPositionInLine());
              			OQUOTEGen_1Leaf.setLine(OQUOTEGen_1.getLine());
              			col_nameReturnNode.getChildren().add(OQUOTEGen_1Leaf);
              		}
              		// Returns the Node with CST Leaves/Nodes
              		retval.returnNode = col_nameReturnNode;
              	
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
    // $ANTLR end col_name

    public static class insert_value_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start insert_value
    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:4757:1: insert_value returns [Node returnNode] : TK_0= '(' insert_dataGen+= insert_data (TK_1= ',' insert_dataGen_1+= insert_data )* TK_2= ')' ;
    public final insert_value_return insert_value() throws RecognitionException {
        insert_value_return retval = new insert_value_return();
        retval.start = input.LT(1);

        Token TK_0=null;
        Token TK_1=null;
        Token TK_2=null;
        List list_insert_dataGen=null;
        List list_insert_dataGen_1=null;
        RuleReturnScope insert_dataGen = null;
        RuleReturnScope insert_dataGen_1 = null;
        try {
            // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:4758:1: (TK_0= '(' insert_dataGen+= insert_data (TK_1= ',' insert_dataGen_1+= insert_data )* TK_2= ')' )
            // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:4758:3: TK_0= '(' insert_dataGen+= insert_data (TK_1= ',' insert_dataGen_1+= insert_data )* TK_2= ')'
            {
            TK_0=(Token)input.LT(1);
            match(input,38,FOLLOW_38_in_insert_value3327); if (failed) return retval;
            pushFollow(FOLLOW_insert_data_in_insert_value3331);
            insert_dataGen=insert_data();
            _fsp--;
            if (failed) return retval;
            if (list_insert_dataGen==null) list_insert_dataGen=new ArrayList();
            list_insert_dataGen.add(insert_dataGen);

            // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:4758:40: (TK_1= ',' insert_dataGen_1+= insert_data )*
            loop150:
            do {
                int alt150=2;
                int LA150_0 = input.LA(1);

                if ( (LA150_0==20) ) {
                    alt150=1;
                }


                switch (alt150) {
            	case 1 :
            	    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:4758:41: TK_1= ',' insert_dataGen_1+= insert_data
            	    {
            	    TK_1=(Token)input.LT(1);
            	    match(input,20,FOLLOW_20_in_insert_value3336); if (failed) return retval;
            	    pushFollow(FOLLOW_insert_data_in_insert_value3340);
            	    insert_dataGen_1=insert_data();
            	    _fsp--;
            	    if (failed) return retval;
            	    if (list_insert_dataGen_1==null) list_insert_dataGen_1=new ArrayList();
            	    list_insert_dataGen_1.add(insert_dataGen_1);


            	    }
            	    break;

            	default :
            	    break loop150;
                }
            } while (true);

            TK_2=(Token)input.LT(1);
            match(input,39,FOLLOW_39_in_insert_value3346); if (failed) return retval;
            if ( backtracking==0 ) {
              
              		// Create return CST Node
              		Node insert_valueReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
              		insert_valueReturnNode.setKind("insert_value");
              	    // Create a Token CST Leaf	
              	    if(TK_0 != null) {
              			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
              	 		TK_0Leaf.setKind("TOKEN");
              	 		TK_0Leaf.setValue(TK_0.getText());
              			TK_0Leaf.setPos(TK_0.getCharPositionInLine());
              			TK_0Leaf.setLine(TK_0.getLine());
              	 		insert_valueReturnNode.getChildren().add(TK_0Leaf);
              	 	}
              	    // Create a CST Node
              		if(list_insert_dataGen != null) {
              	        for(Iterator it = list_insert_dataGen.iterator(); it.hasNext(); )  { 
              	            DDLMySQLParser.insert_data_return r = (DDLMySQLParser.insert_data_return) it.next(); 
              	            if(r != null && r.returnNode != null) {
              	            	r.returnNode.setKind("insert_data");
              	            	insert_valueReturnNode.getChildren().add(r.returnNode);
              	            } 
              	        }
              	    }
              	
              		// Create a special CST Node for terminal insert_dataGen_1 aggregation
              		if(list_insert_dataGen_1 != null) {
              	    for(int pos = 0; pos < list_insert_dataGen_1.size(); pos++ )  { 
              	    // Create a Token CST Leaf	
              	    if(TK_1 != null) {
              			Leaf TK_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
              	 		TK_1Leaf.setKind("TOKEN");
              	 		TK_1Leaf.setValue(TK_1.getText());
              			TK_1Leaf.setPos(TK_1.getCharPositionInLine());
              			TK_1Leaf.setLine(TK_1.getLine());
              	 		insert_valueReturnNode.getChildren().add(TK_1Leaf);
              	 	}
              		// No Terminal extractor
              	    if(list_insert_dataGen_1 != null) {		
              	    	DDLMySQLParser.insert_data_return r = (DDLMySQLParser.insert_data_return) list_insert_dataGen_1.get(pos); 
              	    	if(r != null && r.returnNode != null) {
              	        	r.returnNode.setKind("insert_data");
              	    		insert_valueReturnNode.getChildren().add(r.returnNode);
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
              	 		insert_valueReturnNode.getChildren().add(TK_2Leaf);
              	 	}
              		// Returns the Node with CST Leaves/Nodes
              		retval.returnNode = insert_valueReturnNode;
              	
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
    // $ANTLR end insert_value

    public static class insert_data_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start insert_data
    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:4820:1: insert_data returns [Node returnNode] : ( (QVALUEGen= QVALUE )* | NUMBERGen= NUMBER | DECNUMBERGen= DECNUMBER | HEXNUMBERGen= HEXNUMBER | TK_0= 'DEFAULT' | TK_0= 'NULL' );
    public final insert_data_return insert_data() throws RecognitionException {
        insert_data_return retval = new insert_data_return();
        retval.start = input.LT(1);

        Token QVALUEGen=null;
        Token NUMBERGen=null;
        Token DECNUMBERGen=null;
        Token HEXNUMBERGen=null;
        Token TK_0=null;

        try {
            // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:4821:1: ( (QVALUEGen= QVALUE )* | NUMBERGen= NUMBER | DECNUMBERGen= DECNUMBER | HEXNUMBERGen= HEXNUMBER | TK_0= 'DEFAULT' | TK_0= 'NULL' )
            int alt152=6;
            switch ( input.LA(1) ) {
            case EOF:
            case QVALUE:
            case 20:
            case 39:
                {
                alt152=1;
                }
                break;
            case NUMBER:
                {
                alt152=2;
                }
                break;
            case DECNUMBER:
                {
                alt152=3;
                }
                break;
            case HEXNUMBER:
                {
                alt152=4;
                }
                break;
            case 33:
                {
                alt152=5;
                }
                break;
            case 45:
                {
                alt152=6;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("4820:1: insert_data returns [Node returnNode] : ( (QVALUEGen= QVALUE )* | NUMBERGen= NUMBER | DECNUMBERGen= DECNUMBER | HEXNUMBERGen= HEXNUMBER | TK_0= 'DEFAULT' | TK_0= 'NULL' );", 152, 0, input);

                throw nvae;
            }

            switch (alt152) {
                case 1 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:4821:3: (QVALUEGen= QVALUE )*
                    {
                    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:4821:12: (QVALUEGen= QVALUE )*
                    loop151:
                    do {
                        int alt151=2;
                        int LA151_0 = input.LA(1);

                        if ( (LA151_0==QVALUE) ) {
                            alt151=1;
                        }


                        switch (alt151) {
                    	case 1 :
                    	    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:0:0: QVALUEGen= QVALUE
                    	    {
                    	    QVALUEGen=(Token)input.LT(1);
                    	    match(input,QVALUE,FOLLOW_QVALUE_in_insert_data3367); if (failed) return retval;

                    	    }
                    	    break;

                    	default :
                    	    break loop151;
                        }
                    } while (true);

                    if ( backtracking==0 ) {
                      
                      		// Create return CST Node
                      		Node insert_dataReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                      		insert_dataReturnNode.setKind("insert_data");
                      	    // Create a CST Leaf
                      		if(QVALUEGen != null) {
                      			Leaf QVALUEGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      			QVALUEGenLeaf.setKind("QVALUE");
                      			QVALUEGenLeaf.setValue(QVALUEGen.getText());
                      			QVALUEGenLeaf.setPos(QVALUEGen.getCharPositionInLine());
                      			QVALUEGenLeaf.setLine(QVALUEGen.getLine());
                      			insert_dataReturnNode.getChildren().add(QVALUEGenLeaf);
                      		}
                      		// Returns the Node with CST Leaves/Nodes
                      		retval.returnNode = insert_dataReturnNode;
                      	
                    }

                    }
                    break;
                case 2 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:4838:5: NUMBERGen= NUMBER
                    {
                    NUMBERGen=(Token)input.LT(1);
                    match(input,NUMBER,FOLLOW_NUMBER_in_insert_data3380); if (failed) return retval;
                    if ( backtracking==0 ) {
                      
                      		// Create return CST Node
                      		Node insert_dataReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                      		insert_dataReturnNode.setKind("insert_data");
                      	    // Create a CST Leaf
                      		if(NUMBERGen != null) {
                      			Leaf NUMBERGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      			NUMBERGenLeaf.setKind("NUMBER");
                      			NUMBERGenLeaf.setValue(NUMBERGen.getText());
                      			NUMBERGenLeaf.setPos(NUMBERGen.getCharPositionInLine());
                      			NUMBERGenLeaf.setLine(NUMBERGen.getLine());
                      			insert_dataReturnNode.getChildren().add(NUMBERGenLeaf);
                      		}
                      		// Returns the Node with CST Leaves/Nodes
                      		retval.returnNode = insert_dataReturnNode;
                      	
                    }

                    }
                    break;
                case 3 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:4855:4: DECNUMBERGen= DECNUMBER
                    {
                    DECNUMBERGen=(Token)input.LT(1);
                    match(input,DECNUMBER,FOLLOW_DECNUMBER_in_insert_data3391); if (failed) return retval;
                    if ( backtracking==0 ) {
                      
                      		// Create return CST Node
                      		Node insert_dataReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                      		insert_dataReturnNode.setKind("insert_data");
                      	    // Create a CST Leaf
                      		if(DECNUMBERGen != null) {
                      			Leaf DECNUMBERGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      			DECNUMBERGenLeaf.setKind("DECNUMBER");
                      			DECNUMBERGenLeaf.setValue(DECNUMBERGen.getText());
                      			DECNUMBERGenLeaf.setPos(DECNUMBERGen.getCharPositionInLine());
                      			DECNUMBERGenLeaf.setLine(DECNUMBERGen.getLine());
                      			insert_dataReturnNode.getChildren().add(DECNUMBERGenLeaf);
                      		}
                      		// Returns the Node with CST Leaves/Nodes
                      		retval.returnNode = insert_dataReturnNode;
                      	
                    }

                    }
                    break;
                case 4 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:4872:5: HEXNUMBERGen= HEXNUMBER
                    {
                    HEXNUMBERGen=(Token)input.LT(1);
                    match(input,HEXNUMBER,FOLLOW_HEXNUMBER_in_insert_data3403); if (failed) return retval;
                    if ( backtracking==0 ) {
                      
                      		// Create return CST Node
                      		Node insert_dataReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                      		insert_dataReturnNode.setKind("insert_data");
                      	    // Create a CST Leaf
                      		if(HEXNUMBERGen != null) {
                      			Leaf HEXNUMBERGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      			HEXNUMBERGenLeaf.setKind("HEXNUMBER");
                      			HEXNUMBERGenLeaf.setValue(HEXNUMBERGen.getText());
                      			HEXNUMBERGenLeaf.setPos(HEXNUMBERGen.getCharPositionInLine());
                      			HEXNUMBERGenLeaf.setLine(HEXNUMBERGen.getLine());
                      			insert_dataReturnNode.getChildren().add(HEXNUMBERGenLeaf);
                      		}
                      		// Returns the Node with CST Leaves/Nodes
                      		retval.returnNode = insert_dataReturnNode;
                      	
                    }

                    }
                    break;
                case 5 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:4889:5: TK_0= 'DEFAULT'
                    {
                    TK_0=(Token)input.LT(1);
                    match(input,33,FOLLOW_33_in_insert_data3415); if (failed) return retval;
                    if ( backtracking==0 ) {
                      
                      		// Create return CST Node
                      		Node insert_dataReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                      		insert_dataReturnNode.setKind("insert_data");
                      	    // Create a Token CST Leaf	
                      	    if(TK_0 != null) {
                      			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      	 		TK_0Leaf.setKind("TOKEN");
                      	 		TK_0Leaf.setValue(TK_0.getText());
                      			TK_0Leaf.setPos(TK_0.getCharPositionInLine());
                      			TK_0Leaf.setLine(TK_0.getLine());
                      	 		insert_dataReturnNode.getChildren().add(TK_0Leaf);
                      	 	}
                      		// Returns the Node with CST Leaves/Nodes
                      		retval.returnNode = insert_dataReturnNode;
                      	
                    }

                    }
                    break;
                case 6 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:4906:5: TK_0= 'NULL'
                    {
                    TK_0=(Token)input.LT(1);
                    match(input,45,FOLLOW_45_in_insert_data3427); if (failed) return retval;
                    if ( backtracking==0 ) {
                      
                      		// Create return CST Node
                      		Node insert_dataReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                      		insert_dataReturnNode.setKind("insert_data");
                      	    // Create a Token CST Leaf	
                      	    if(TK_0 != null) {
                      			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      	 		TK_0Leaf.setKind("TOKEN");
                      	 		TK_0Leaf.setValue(TK_0.getText());
                      			TK_0Leaf.setPos(TK_0.getCharPositionInLine());
                      			TK_0Leaf.setLine(TK_0.getLine());
                      	 		insert_dataReturnNode.getChildren().add(TK_0Leaf);
                      	 	}
                      		// Returns the Node with CST Leaves/Nodes
                      		retval.returnNode = insert_dataReturnNode;
                      	
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
    // $ANTLR end insert_data

    // $ANTLR start synpred30
    public final void synpred30_fragment() throws RecognitionException {   
        // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:848:134: ( index_type )
        // /home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3:848:134: index_type
        {
        pushFollow(FOLLOW_index_type_in_synpred30673);
        index_type();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred30

    public final boolean synpred30() {
        backtracking++;
        int start = input.mark();
        try {
            synpred30_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_data_definition_statements_in_data_definition48 = new BitSet(new long[]{0x000000000C080002L,0xC000000000000000L});
    public static final BitSet FOLLOW_data_manipulation_statements_in_data_definition54 = new BitSet(new long[]{0x000000000C080002L,0xC000000000000000L});
    public static final BitSet FOLLOW_administration_statements_in_data_definition60 = new BitSet(new long[]{0x000000000C080002L,0xC000000000000000L});
    public static final BitSet FOLLOW_utility_statements_in_data_definition66 = new BitSet(new long[]{0x000000000C080002L,0xC000000000000000L});
    public static final BitSet FOLLOW_set_definition_in_administration_statements89 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_set_definition110 = new BitSet(new long[]{0x0000000003800010L});
    public static final BitSet FOLLOW_variable_assignment_in_set_definition114 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_20_in_set_definition119 = new BitSet(new long[]{0x0000000003800010L});
    public static final BitSet FOLLOW_variable_assignment_in_set_definition123 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_21_in_set_definition129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_variable_assignment151 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_variable_assignment155 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_DQVALUE_in_variable_assignment159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_variable_assignment175 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_24_in_variable_assignment181 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_variable_assignment186 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_variable_assignment190 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_DQVALUE_in_variable_assignment194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_variable_assignment209 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_variable_assignment213 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_variable_assignment217 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_variable_assignment221 = new BitSet(new long[]{0x0000000002000020L});
    public static final BitSet FOLLOW_DQVALUE_in_variable_assignment226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_variable_assignment232 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_variable_assignment236 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_variable_assignment240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_use_statement_in_utility_statements270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_use_statement292 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_use_statement296 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_use_statement300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_create_database_in_data_definition_statements323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_create_table_in_data_definition_statements335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_drop_table_in_data_definition_statements346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_create_database368 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_28_in_create_database373 = new BitSet(new long[]{0x0000000040000010L});
    public static final BitSet FOLLOW_29_in_create_database379 = new BitSet(new long[]{0x0000000040000010L});
    public static final BitSet FOLLOW_30_in_create_database385 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_create_database389 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_create_database393 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_create_database399 = new BitSet(new long[]{0x0000000E00200000L});
    public static final BitSet FOLLOW_create_specification_in_create_database404 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_create_database410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_create_specification432 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_create_specification438 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_create_specification442 = new BitSet(new long[]{0x0000000000400010L});
    public static final BitSet FOLLOW_22_in_create_specification447 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_create_specification453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_create_specification467 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_create_specification473 = new BitSet(new long[]{0x0000000000400010L});
    public static final BitSet FOLLOW_22_in_create_specification478 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_create_specification484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_create_table507 = new BitSet(new long[]{0x0000003000000000L});
    public static final BitSet FOLLOW_36_in_create_table512 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_create_table518 = new BitSet(new long[]{0x0000000040000040L});
    public static final BitSet FOLLOW_30_in_create_table523 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_create_table527 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_create_table531 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_OQUOTE_in_create_table537 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_create_table541 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_OQUOTE_in_create_table545 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_create_table551 = new BitSet(new long[]{0x00001F0000000040L});
    public static final BitSet FOLLOW_create_definition_in_create_table559 = new BitSet(new long[]{0x0000008000100000L});
    public static final BitSet FOLLOW_20_in_create_table564 = new BitSet(new long[]{0x00001F0000000040L});
    public static final BitSet FOLLOW_create_definition_in_create_table568 = new BitSet(new long[]{0x0000008000100000L});
    public static final BitSet FOLLOW_39_in_create_table577 = new BitSet(new long[]{0x4006000E00200000L,0x0031E3FC00000000L});
    public static final BitSet FOLLOW_table_options_in_create_table582 = new BitSet(new long[]{0x4006000E00200000L,0x0031E3FC00000000L});
    public static final BitSet FOLLOW_21_in_create_table588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_col_name_in_create_definition610 = new BitSet(new long[]{0x0000000000080000L,0x00000003DFFFFFE6L});
    public static final BitSet FOLLOW_column_definition_in_create_definition614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_create_definition627 = new BitSet(new long[]{0x0000180000000000L});
    public static final BitSet FOLLOW_41_in_create_definition633 = new BitSet(new long[]{0x0000180000000000L});
    public static final BitSet FOLLOW_42_in_create_definition639 = new BitSet(new long[]{0x0000180000000000L});
    public static final BitSet FOLLOW_43_in_create_definition646 = new BitSet(new long[]{0xC400004000000042L});
    public static final BitSet FOLLOW_44_in_create_definition652 = new BitSet(new long[]{0xC400004000000042L});
    public static final BitSet FOLLOW_OQUOTE_in_create_definition658 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_create_definition662 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_OQUOTE_in_create_definition666 = new BitSet(new long[]{0xC400004000000002L});
    public static final BitSet FOLLOW_index_type_in_create_definition673 = new BitSet(new long[]{0xC400004000000002L});
    public static final BitSet FOLLOW_38_in_create_definition683 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_index_col_name_in_create_definition687 = new BitSet(new long[]{0x0000008000100000L});
    public static final BitSet FOLLOW_20_in_create_definition692 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_index_col_name_in_create_definition696 = new BitSet(new long[]{0x0000008000100000L});
    public static final BitSet FOLLOW_39_in_create_definition702 = new BitSet(new long[]{0xC400000000000002L});
    public static final BitSet FOLLOW_index_option_in_create_definition709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_data_type_in_column_definition735 = new BitSet(new long[]{0x004E630280000002L,0x0040000000000000L});
    public static final BitSet FOLLOW_31_in_column_definition740 = new BitSet(new long[]{0x004E630200000002L,0x0040000000000000L});
    public static final BitSet FOLLOW_45_in_column_definition747 = new BitSet(new long[]{0x004E430200000002L,0x0040000000000000L});
    public static final BitSet FOLLOW_33_in_column_definition754 = new BitSet(new long[]{0x0000200000000090L});
    public static final BitSet FOLLOW_ID_in_column_definition759 = new BitSet(new long[]{0x004E430000000002L,0x0040000000000000L});
    public static final BitSet FOLLOW_QVALUE_in_column_definition765 = new BitSet(new long[]{0x004E430000000002L,0x0040000000000000L});
    public static final BitSet FOLLOW_45_in_column_definition771 = new BitSet(new long[]{0x004E430000000002L,0x0040000000000000L});
    public static final BitSet FOLLOW_46_in_column_definition779 = new BitSet(new long[]{0x0001800000000000L});
    public static final BitSet FOLLOW_47_in_column_definition784 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_48_in_column_definition790 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_column_definition795 = new BitSet(new long[]{0x004E030000000002L,0x0040000000000000L});
    public static final BitSet FOLLOW_49_in_column_definition809 = new BitSet(new long[]{0x004C030000000002L,0x0040000000000000L});
    public static final BitSet FOLLOW_40_in_column_definition817 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_41_in_column_definition823 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_column_definition828 = new BitSet(new long[]{0x004C000000000002L,0x0040000000000000L});
    public static final BitSet FOLLOW_50_in_column_definition842 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_column_definition846 = new BitSet(new long[]{0x0048000000000002L,0x0040000000000000L});
    public static final BitSet FOLLOW_51_in_column_definition860 = new BitSet(new long[]{0x0030000200000000L});
    public static final BitSet FOLLOW_52_in_column_definition865 = new BitSet(new long[]{0x0040000000000002L,0x0040000000000000L});
    public static final BitSet FOLLOW_53_in_column_definition871 = new BitSet(new long[]{0x0040000000000002L,0x0040000000000000L});
    public static final BitSet FOLLOW_33_in_column_definition877 = new BitSet(new long[]{0x0040000000000002L,0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_column_definition892 = new BitSet(new long[]{0x0080000200000000L});
    public static final BitSet FOLLOW_55_in_column_definition897 = new BitSet(new long[]{0x0000000000000002L,0x0040000000000000L});
    public static final BitSet FOLLOW_33_in_column_definition901 = new BitSet(new long[]{0x0000000000000002L,0x0040000000000000L});
    public static final BitSet FOLLOW_reference_definition_in_column_definition917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_col_name_in_index_col_name941 = new BitSet(new long[]{0x0300004000000002L});
    public static final BitSet FOLLOW_38_in_index_col_name946 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_NUMBER_in_index_col_name950 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_index_col_name954 = new BitSet(new long[]{0x0300000000000002L});
    public static final BitSet FOLLOW_56_in_index_col_name961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_index_col_name967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_index_type990 = new BitSet(new long[]{0x3800000000000000L});
    public static final BitSet FOLLOW_59_in_index_type995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_index_type1001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_index_type1007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_index_option1030 = new BitSet(new long[]{0x0000000000400100L});
    public static final BitSet FOLLOW_22_in_index_option1035 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_NUMBER_in_index_option1041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_index_type_in_index_option1055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_index_option1069 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_index_option1073 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_OQUOTE_in_index_option1077 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_index_option1081 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_OQUOTE_in_index_option1085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_data_type1106 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_38_in_data_type1111 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_NUMBER_in_data_type1115 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_data_type1119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_data_type1135 = new BitSet(new long[]{0x0000004000000002L,0x0000000000000018L});
    public static final BitSet FOLLOW_38_in_data_type1140 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_NUMBER_in_data_type1144 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_data_type1148 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000018L});
    public static final BitSet FOLLOW_67_in_data_type1155 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_data_type1162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_data_type1178 = new BitSet(new long[]{0x0000004000000002L,0x0000000000000018L});
    public static final BitSet FOLLOW_38_in_data_type1183 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_NUMBER_in_data_type1187 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_data_type1191 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000018L});
    public static final BitSet FOLLOW_67_in_data_type1198 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_data_type1205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_data_type1221 = new BitSet(new long[]{0x0000004000000002L,0x0000000000000018L});
    public static final BitSet FOLLOW_38_in_data_type1226 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_NUMBER_in_data_type1230 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_data_type1234 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000018L});
    public static final BitSet FOLLOW_67_in_data_type1241 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_data_type1248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_data_type1264 = new BitSet(new long[]{0x0000004000000002L,0x0000000000000018L});
    public static final BitSet FOLLOW_38_in_data_type1269 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_NUMBER_in_data_type1273 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_data_type1277 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000018L});
    public static final BitSet FOLLOW_67_in_data_type1284 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_data_type1291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_data_type1307 = new BitSet(new long[]{0x0000004000000002L,0x0000000000000018L});
    public static final BitSet FOLLOW_38_in_data_type1312 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_NUMBER_in_data_type1316 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_data_type1320 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000018L});
    public static final BitSet FOLLOW_67_in_data_type1327 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_data_type1334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_data_type1350 = new BitSet(new long[]{0x0000004000000002L,0x0000000000000018L});
    public static final BitSet FOLLOW_38_in_data_type1355 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_NUMBER_in_data_type1359 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_data_type1363 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000018L});
    public static final BitSet FOLLOW_67_in_data_type1370 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_data_type1377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_data_type1393 = new BitSet(new long[]{0x0000004000000002L,0x0000000000000018L});
    public static final BitSet FOLLOW_38_in_data_type1398 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_NUMBER_in_data_type1402 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_data_type1406 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000018L});
    public static final BitSet FOLLOW_67_in_data_type1413 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_data_type1420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_data_type1435 = new BitSet(new long[]{0x0000004000000002L,0x0000000000000018L});
    public static final BitSet FOLLOW_38_in_data_type1440 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_NUMBER_in_data_type1444 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_data_type1448 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000018L});
    public static final BitSet FOLLOW_67_in_data_type1455 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_data_type1462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_data_type1477 = new BitSet(new long[]{0x0000004000000002L,0x0000000000000018L});
    public static final BitSet FOLLOW_38_in_data_type1482 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_NUMBER_in_data_type1486 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_data_type1490 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000018L});
    public static final BitSet FOLLOW_67_in_data_type1497 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_data_type1504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_data_type1520 = new BitSet(new long[]{0x0000004000000002L,0x0000000000000018L});
    public static final BitSet FOLLOW_38_in_data_type1525 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_NUMBER_in_data_type1529 = new BitSet(new long[]{0x0000008000100000L});
    public static final BitSet FOLLOW_20_in_data_type1534 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_NUMBER_in_data_type1538 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_data_type1544 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000018L});
    public static final BitSet FOLLOW_67_in_data_type1551 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_data_type1558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_data_type1574 = new BitSet(new long[]{0x0000004000000002L,0x0000000000000018L});
    public static final BitSet FOLLOW_38_in_data_type1579 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_NUMBER_in_data_type1583 = new BitSet(new long[]{0x0000008000100000L});
    public static final BitSet FOLLOW_20_in_data_type1588 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_NUMBER_in_data_type1592 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_data_type1597 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000018L});
    public static final BitSet FOLLOW_67_in_data_type1604 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_data_type1611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_data_type1627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_data_type1641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_data_type1655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_data_type1668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_data_type1682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_data_type1696 = new BitSet(new long[]{0x0000004C00000002L});
    public static final BitSet FOLLOW_38_in_data_type1701 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_NUMBER_in_data_type1705 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_data_type1709 = new BitSet(new long[]{0x0000000C00000002L});
    public static final BitSet FOLLOW_34_in_data_type1716 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_data_type1720 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_data_type1724 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_35_in_data_type1731 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_data_type1735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_data_type1751 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_data_type1755 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_NUMBER_in_data_type1759 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_data_type1763 = new BitSet(new long[]{0x0000000C00000002L});
    public static final BitSet FOLLOW_34_in_data_type1768 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_data_type1772 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_data_type1776 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_35_in_data_type1783 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_data_type1787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_data_type1803 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_data_type1807 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_NUMBER_in_data_type1811 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_data_type1815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_data_type1829 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_data_type1833 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_NUMBER_in_data_type1837 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_data_type1841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_data_type1855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_data_type1869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_data_type1883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_91_in_data_type1897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_data_type1911 = new BitSet(new long[]{0x0000000C00000002L,0x0000000020000000L});
    public static final BitSet FOLLOW_93_in_data_type1916 = new BitSet(new long[]{0x0000000C00000002L});
    public static final BitSet FOLLOW_34_in_data_type1923 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_data_type1927 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_data_type1931 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_35_in_data_type1938 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_data_type1942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_94_in_data_type1959 = new BitSet(new long[]{0x0000000C00000002L,0x0000000020000000L});
    public static final BitSet FOLLOW_93_in_data_type1964 = new BitSet(new long[]{0x0000000C00000002L});
    public static final BitSet FOLLOW_34_in_data_type1971 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_data_type1975 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_data_type1979 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_35_in_data_type1986 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_data_type1990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_95_in_data_type2006 = new BitSet(new long[]{0x0000000C00000002L,0x0000000020000000L});
    public static final BitSet FOLLOW_93_in_data_type2011 = new BitSet(new long[]{0x0000000C00000002L});
    public static final BitSet FOLLOW_34_in_data_type2018 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_data_type2022 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_data_type2026 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_35_in_data_type2033 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_data_type2037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_96_in_data_type2053 = new BitSet(new long[]{0x0000000C00000002L,0x0000000020000000L});
    public static final BitSet FOLLOW_93_in_data_type2058 = new BitSet(new long[]{0x0000000C00000002L});
    public static final BitSet FOLLOW_34_in_data_type2065 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_data_type2069 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_data_type2073 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_35_in_data_type2080 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_data_type2084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_97_in_data_type2100 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_data_type2104 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_QVALUE_in_data_type2108 = new BitSet(new long[]{0x0000008000100000L});
    public static final BitSet FOLLOW_20_in_data_type2113 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_QVALUE_in_data_type2117 = new BitSet(new long[]{0x0000008000100000L});
    public static final BitSet FOLLOW_39_in_data_type2123 = new BitSet(new long[]{0x0000000C00000002L});
    public static final BitSet FOLLOW_34_in_data_type2128 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_data_type2132 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_data_type2136 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_35_in_data_type2143 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_data_type2147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_data_type2163 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_data_type2167 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_QVALUE_in_data_type2171 = new BitSet(new long[]{0x0000008000100000L});
    public static final BitSet FOLLOW_20_in_data_type2176 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_QVALUE_in_data_type2180 = new BitSet(new long[]{0x0000008000100000L});
    public static final BitSet FOLLOW_39_in_data_type2186 = new BitSet(new long[]{0x0000000C00000002L});
    public static final BitSet FOLLOW_34_in_data_type2192 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_data_type2196 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_data_type2200 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_35_in_data_type2207 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_data_type2211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_98_in_table_options2233 = new BitSet(new long[]{0x0000000000400010L});
    public static final BitSet FOLLOW_22_in_table_options2238 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_table_options2244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_table_options2258 = new BitSet(new long[]{0x0000000000400100L});
    public static final BitSet FOLLOW_22_in_table_options2263 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_NUMBER_in_table_options2269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_99_in_table_options2283 = new BitSet(new long[]{0x0000000000400100L});
    public static final BitSet FOLLOW_22_in_table_options2288 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_NUMBER_in_table_options2294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_table_options2309 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_table_options2315 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_table_options2319 = new BitSet(new long[]{0x0000000000400010L});
    public static final BitSet FOLLOW_22_in_table_options2324 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_table_options2330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_table_options2345 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_100_in_table_options2351 = new BitSet(new long[]{0x0000000000400010L});
    public static final BitSet FOLLOW_22_in_table_options2356 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_table_options2362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_101_in_table_options2376 = new BitSet(new long[]{0x0000000000400100L});
    public static final BitSet FOLLOW_22_in_table_options2381 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_NUMBER_in_table_options2387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_table_options2402 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_table_options2408 = new BitSet(new long[]{0x0000000000400010L});
    public static final BitSet FOLLOW_22_in_table_options2413 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_table_options2419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_table_options2432 = new BitSet(new long[]{0x0000000000400200L});
    public static final BitSet FOLLOW_22_in_table_options2437 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_DOUBLEQUOTE_in_table_options2443 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_DQVALUE_in_table_options2447 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_DOUBLEQUOTE_in_table_options2451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_102_in_table_options2465 = new BitSet(new long[]{0x0000000000400200L});
    public static final BitSet FOLLOW_22_in_table_options2470 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_DOUBLEQUOTE_in_table_options2476 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_DQVALUE_in_table_options2480 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_DOUBLEQUOTE_in_table_options2484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_103_in_table_options2502 = new BitSet(new long[]{0x0000000000400100L});
    public static final BitSet FOLLOW_22_in_table_options2507 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_NUMBER_in_table_options2514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_104_in_table_options2527 = new BitSet(new long[]{0x0000000000400200L});
    public static final BitSet FOLLOW_22_in_table_options2532 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_DOUBLEQUOTE_in_table_options2538 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_DQVALUE_in_table_options2542 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_DOUBLEQUOTE_in_table_options2546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_105_in_table_options2560 = new BitSet(new long[]{0x0000000000400000L,0x00001C0000000000L});
    public static final BitSet FOLLOW_22_in_table_options2565 = new BitSet(new long[]{0x0000000000000000L,0x00001C0000000000L});
    public static final BitSet FOLLOW_106_in_table_options2572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_107_in_table_options2578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_108_in_table_options2584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_table_options2599 = new BitSet(new long[]{0x0000000000400100L});
    public static final BitSet FOLLOW_22_in_table_options2604 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_NUMBER_in_table_options2610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_109_in_table_options2624 = new BitSet(new long[]{0x0000000000400100L});
    public static final BitSet FOLLOW_22_in_table_options2629 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_NUMBER_in_table_options2635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_110_in_table_options2649 = new BitSet(new long[]{0x0000000000400100L});
    public static final BitSet FOLLOW_22_in_table_options2654 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_NUMBER_in_table_options2660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_111_in_table_options2674 = new BitSet(new long[]{0x0000000200400100L});
    public static final BitSet FOLLOW_22_in_table_options2679 = new BitSet(new long[]{0x0000000200000100L});
    public static final BitSet FOLLOW_NUMBER_in_table_options2686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_table_options2692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_112_in_table_options2711 = new BitSet(new long[]{0x0030000200400000L,0x000E000000000000L});
    public static final BitSet FOLLOW_22_in_table_options2716 = new BitSet(new long[]{0x0030000200000000L,0x000E000000000000L});
    public static final BitSet FOLLOW_33_in_table_options2723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_table_options2727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_table_options2731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_113_in_table_options2735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_114_in_table_options2739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_115_in_table_options2743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_116_in_table_options2758 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_table_options2762 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_54_in_table_options2767 = new BitSet(new long[]{0x0080000200000000L});
    public static final BitSet FOLLOW_55_in_table_options2772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_table_options2776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_117_in_table_options2794 = new BitSet(new long[]{0x0000000000400010L});
    public static final BitSet FOLLOW_22_in_table_options2799 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_table_options2805 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_20_in_table_options2810 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_table_options2814 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_118_in_reference_definition2838 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_OQUOTE_in_reference_definition2842 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_reference_definition2846 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_OQUOTE_in_reference_definition2850 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_reference_definition2854 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_index_col_name_in_reference_definition2858 = new BitSet(new long[]{0x0000008000100000L});
    public static final BitSet FOLLOW_20_in_reference_definition2863 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_index_col_name_in_reference_definition2867 = new BitSet(new long[]{0x0000008000100000L});
    public static final BitSet FOLLOW_39_in_reference_definition2873 = new BitSet(new long[]{0x0000400000000002L,0x0080000000000000L});
    public static final BitSet FOLLOW_119_in_reference_definition2885 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_120_in_reference_definition2889 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_119_in_reference_definition2895 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_121_in_reference_definition2899 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_119_in_reference_definition2905 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_122_in_reference_definition2909 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_46_in_reference_definition2923 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_reference_definition2927 = new BitSet(new long[]{0x0000000000080000L,0x1800040000000000L});
    public static final BitSet FOLLOW_reference_option_in_reference_definition2931 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_46_in_reference_definition2945 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_reference_definition2949 = new BitSet(new long[]{0x0000000000080000L,0x1800040000000000L});
    public static final BitSet FOLLOW_reference_option_in_reference_definition2953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_123_in_reference_option2978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_124_in_reference_option2991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_reference_option3004 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_reference_option3008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_106_in_reference_option3020 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_125_in_reference_option3024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_126_in_drop_table3046 = new BitSet(new long[]{0x0000003000000000L});
    public static final BitSet FOLLOW_36_in_drop_table3051 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_drop_table3057 = new BitSet(new long[]{0x0000000040000040L});
    public static final BitSet FOLLOW_30_in_drop_table3062 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_drop_table3066 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_OQUOTE_in_drop_table3072 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_drop_table3076 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_OQUOTE_in_drop_table3080 = new BitSet(new long[]{0x0000000000300000L,0x1800000000000000L});
    public static final BitSet FOLLOW_20_in_drop_table3085 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_OQUOTE_in_drop_table3089 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_drop_table3093 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_OQUOTE_in_drop_table3097 = new BitSet(new long[]{0x0000000000300000L,0x1800000000000000L});
    public static final BitSet FOLLOW_123_in_drop_table3109 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_124_in_drop_table3115 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_drop_table3121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_insert_statement_in_data_manipulation_statements3143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_127_in_insert_statement3165 = new BitSet(new long[]{0x0000000000000040L,0x0000000000000000L,0x000000000000001FL});
    public static final BitSet FOLLOW_128_in_insert_statement3170 = new BitSet(new long[]{0x0000000000000040L,0x0000000000000000L,0x0000000000000018L});
    public static final BitSet FOLLOW_129_in_insert_statement3176 = new BitSet(new long[]{0x0000000000000040L,0x0000000000000000L,0x0000000000000018L});
    public static final BitSet FOLLOW_130_in_insert_statement3182 = new BitSet(new long[]{0x0000000000000040L,0x0000000000000000L,0x0000000000000018L});
    public static final BitSet FOLLOW_131_in_insert_statement3189 = new BitSet(new long[]{0x0000000000000040L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_132_in_insert_statement3201 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_OQUOTE_in_insert_statement3207 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_insert_statement3211 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_OQUOTE_in_insert_statement3215 = new BitSet(new long[]{0x0000004000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_38_in_insert_statement3220 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_col_name_in_insert_statement3224 = new BitSet(new long[]{0x0000008000100000L});
    public static final BitSet FOLLOW_20_in_insert_statement3229 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_col_name_in_insert_statement3233 = new BitSet(new long[]{0x0000008000100000L});
    public static final BitSet FOLLOW_39_in_insert_statement3239 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_133_in_insert_statement3251 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_insert_value_in_insert_statement3256 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_20_in_insert_statement3261 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_insert_value_in_insert_statement3265 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_21_in_insert_statement3271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OQUOTE_in_col_name3298 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_col_name3302 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_OQUOTE_in_col_name3306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_insert_value3327 = new BitSet(new long[]{0x0000208200100D80L});
    public static final BitSet FOLLOW_insert_data_in_insert_value3331 = new BitSet(new long[]{0x0000008000100000L});
    public static final BitSet FOLLOW_20_in_insert_value3336 = new BitSet(new long[]{0x0000208200100D80L});
    public static final BitSet FOLLOW_insert_data_in_insert_value3340 = new BitSet(new long[]{0x0000008000100000L});
    public static final BitSet FOLLOW_39_in_insert_value3346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QVALUE_in_insert_data3367 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_NUMBER_in_insert_data3380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DECNUMBER_in_insert_data3391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HEXNUMBER_in_insert_data3403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_insert_data3415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_insert_data3427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_index_type_in_synpred30673 = new BitSet(new long[]{0x0000000000000002L});

}