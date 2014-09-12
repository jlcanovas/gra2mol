// $ANTLR 3.0.1 /home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/DDL.ge3 2009-09-29 10:50:24

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
public class DDLParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ID", "TYPE", "NUMBER", "ISNULL", "STRING", "WS", "'CREATE TABLE'", "'('", "','", "')'", "';'", "'ALTER TABLE'", "'ADD'", "'ENABLE'", "'CONSTRAINT'", "'COMMENT ON'", "'TABLE'", "'COLUMN'", "'.'", "'IS'", "'CREATE SEQUENCE'", "'INCREMENT'", "'BY'", "'START'", "'WITH'", "'MAXVALUE'", "'NOMAXVALUE'", "'MINVALUE'", "'NOMINVALUE'", "'CYCLE'", "'NOCYCLE'", "'CACHE'", "'NOCACHE'", "'ORDER'", "'NOORDER'", "'PRIMARY KEY'", "'UNIQUE'", "'FOREIGN KEY'", "'REFERENCES'"
    };
    public static final int WS=9;
    public static final int NUMBER=6;
    public static final int ISNULL=7;
    public static final int ID=4;
    public static final int EOF=-1;
    public static final int STRING=8;
    public static final int TYPE=5;

        public DDLParser(TokenStream input) {
            super(input);
        }
        
    protected StringTemplateGroup templateLib =
      new StringTemplateGroup("DDLParserTemplates", AngleBracketTemplateLexer.class);

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
    public String getGrammarFileName() { return "/home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/DDL.ge3"; }


    public static class data_definition_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start data_definition
    // /home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/DDL.ge3:19:1: data_definition returns [Node returnNode] : (create_tableGen+= create_table | alter_tableGen+= alter_table | create_sequenceGen+= create_sequence | commentGen+= comment )+ ;
    public final data_definition_return data_definition() throws RecognitionException {
        data_definition_return retval = new data_definition_return();
        retval.start = input.LT(1);

        List list_create_tableGen=null;
        List list_alter_tableGen=null;
        List list_create_sequenceGen=null;
        List list_commentGen=null;
        RuleReturnScope create_tableGen = null;
        RuleReturnScope alter_tableGen = null;
        RuleReturnScope create_sequenceGen = null;
        RuleReturnScope commentGen = null;
        try {
            // /home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/DDL.ge3:20:1: ( (create_tableGen+= create_table | alter_tableGen+= alter_table | create_sequenceGen+= create_sequence | commentGen+= comment )+ )
            // /home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/DDL.ge3:21:2: (create_tableGen+= create_table | alter_tableGen+= alter_table | create_sequenceGen+= create_sequence | commentGen+= comment )+
            {
            // /home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/DDL.ge3:21:2: (create_tableGen+= create_table | alter_tableGen+= alter_table | create_sequenceGen+= create_sequence | commentGen+= comment )+
            int cnt1=0;
            loop1:
            do {
                int alt1=5;
                switch ( input.LA(1) ) {
                case 10:
                    {
                    alt1=1;
                    }
                    break;
                case 15:
                    {
                    alt1=2;
                    }
                    break;
                case 24:
                    {
                    alt1=3;
                    }
                    break;
                case 19:
                    {
                    alt1=4;
                    }
                    break;

                }

                switch (alt1) {
            	case 1 :
            	    // /home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/DDL.ge3:21:3: create_tableGen+= create_table
            	    {
            	    pushFollow(FOLLOW_create_table_in_data_definition43);
            	    create_tableGen=create_table();
            	    _fsp--;

            	    if (list_create_tableGen==null) list_create_tableGen=new ArrayList();
            	    list_create_tableGen.add(create_tableGen);


            	    }
            	    break;
            	case 2 :
            	    // /home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/DDL.ge3:21:35: alter_tableGen+= alter_table
            	    {
            	    pushFollow(FOLLOW_alter_table_in_data_definition49);
            	    alter_tableGen=alter_table();
            	    _fsp--;

            	    if (list_alter_tableGen==null) list_alter_tableGen=new ArrayList();
            	    list_alter_tableGen.add(alter_tableGen);


            	    }
            	    break;
            	case 3 :
            	    // /home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/DDL.ge3:21:65: create_sequenceGen+= create_sequence
            	    {
            	    pushFollow(FOLLOW_create_sequence_in_data_definition55);
            	    create_sequenceGen=create_sequence();
            	    _fsp--;

            	    if (list_create_sequenceGen==null) list_create_sequenceGen=new ArrayList();
            	    list_create_sequenceGen.add(create_sequenceGen);


            	    }
            	    break;
            	case 4 :
            	    // /home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/DDL.ge3:21:103: commentGen+= comment
            	    {
            	    pushFollow(FOLLOW_comment_in_data_definition61);
            	    commentGen=comment();
            	    _fsp--;

            	    if (list_commentGen==null) list_commentGen=new ArrayList();
            	    list_commentGen.add(commentGen);


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);

            
            		// Create return CST Node
            		Node data_definitionReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
            		data_definitionReturnNode.setKind("data_definition");
            	
            		// Create a special CST Node for terminal create_tableGen aggregation
            		if(list_create_tableGen != null) {
            	    for(int pos = 0; pos < list_create_tableGen.size(); pos++ )  { 
            		// No Terminal extractor
            	    if(list_create_tableGen != null) {		
            	    	DDLParser.create_table_return r = (DDLParser.create_table_return) list_create_tableGen.get(pos); 
            	    	if(r != null && r.returnNode != null) {
            	        	r.returnNode.setKind("create_table");
            	    		data_definitionReturnNode.getChildren().add(r.returnNode);
            	    	} 
            		}
            		}
            		}
            	
            	
            		// Create a special CST Node for terminal alter_tableGen aggregation
            		if(list_alter_tableGen != null) {
            	    for(int pos = 0; pos < list_alter_tableGen.size(); pos++ )  { 
            		// No Terminal extractor
            	    if(list_alter_tableGen != null) {		
            	    	DDLParser.alter_table_return r = (DDLParser.alter_table_return) list_alter_tableGen.get(pos); 
            	    	if(r != null && r.returnNode != null) {
            	        	r.returnNode.setKind("alter_table");
            	    		data_definitionReturnNode.getChildren().add(r.returnNode);
            	    	} 
            		}
            		}
            		}
            	
            	
            		// Create a special CST Node for terminal create_sequenceGen aggregation
            		if(list_create_sequenceGen != null) {
            	    for(int pos = 0; pos < list_create_sequenceGen.size(); pos++ )  { 
            		// No Terminal extractor
            	    if(list_create_sequenceGen != null) {		
            	    	DDLParser.create_sequence_return r = (DDLParser.create_sequence_return) list_create_sequenceGen.get(pos); 
            	    	if(r != null && r.returnNode != null) {
            	        	r.returnNode.setKind("create_sequence");
            	    		data_definitionReturnNode.getChildren().add(r.returnNode);
            	    	} 
            		}
            		}
            		}
            	
            	
            		// Create a special CST Node for terminal commentGen aggregation
            		if(list_commentGen != null) {
            	    for(int pos = 0; pos < list_commentGen.size(); pos++ )  { 
            		// No Terminal extractor
            	    if(list_commentGen != null) {		
            	    	DDLParser.comment_return r = (DDLParser.comment_return) list_commentGen.get(pos); 
            	    	if(r != null && r.returnNode != null) {
            	        	r.returnNode.setKind("comment");
            	    		data_definitionReturnNode.getChildren().add(r.returnNode);
            	    	} 
            		}
            		}
            		}
            	
            		// Returns the Node with CST Leaves/Nodes
            		retval.returnNode = data_definitionReturnNode;
            	

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

    public static class create_table_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start create_table
    // /home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/DDL.ge3:91:1: create_table returns [Node returnNode] : TK_0= 'CREATE TABLE' IDGen= ID TK_1= '(' columnGen+= column (TK_2= ',' columnGen_1+= column )* (TK_3= ',' constraintGen+= constraint )* TK_4= ')' TK_5= ';' ;
    public final create_table_return create_table() throws RecognitionException {
        create_table_return retval = new create_table_return();
        retval.start = input.LT(1);

        Token TK_0=null;
        Token IDGen=null;
        Token TK_1=null;
        Token TK_2=null;
        Token TK_3=null;
        Token TK_4=null;
        Token TK_5=null;
        List list_columnGen=null;
        List list_columnGen_1=null;
        List list_constraintGen=null;
        RuleReturnScope columnGen = null;
        RuleReturnScope columnGen_1 = null;
        RuleReturnScope constraintGen = null;
        try {
            // /home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/DDL.ge3:92:1: (TK_0= 'CREATE TABLE' IDGen= ID TK_1= '(' columnGen+= column (TK_2= ',' columnGen_1+= column )* (TK_3= ',' constraintGen+= constraint )* TK_4= ')' TK_5= ';' )
            // /home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/DDL.ge3:93:2: TK_0= 'CREATE TABLE' IDGen= ID TK_1= '(' columnGen+= column (TK_2= ',' columnGen_1+= column )* (TK_3= ',' constraintGen+= constraint )* TK_4= ')' TK_5= ';'
            {
            TK_0=(Token)input.LT(1);
            match(input,10,FOLLOW_10_in_create_table84); 
            IDGen=(Token)input.LT(1);
            match(input,ID,FOLLOW_ID_in_create_table88); 
            TK_1=(Token)input.LT(1);
            match(input,11,FOLLOW_11_in_create_table93); 
            pushFollow(FOLLOW_column_in_create_table99);
            columnGen=column();
            _fsp--;

            if (list_columnGen==null) list_columnGen=new ArrayList();
            list_columnGen.add(columnGen);

            // /home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/DDL.ge3:95:21: (TK_2= ',' columnGen_1+= column )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==12) ) {
                    int LA2_1 = input.LA(2);

                    if ( (LA2_1==ID) ) {
                        alt2=1;
                    }


                }


                switch (alt2) {
            	case 1 :
            	    // /home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/DDL.ge3:95:22: TK_2= ',' columnGen_1+= column
            	    {
            	    TK_2=(Token)input.LT(1);
            	    match(input,12,FOLLOW_12_in_create_table104); 
            	    pushFollow(FOLLOW_column_in_create_table108);
            	    columnGen_1=column();
            	    _fsp--;

            	    if (list_columnGen_1==null) list_columnGen_1=new ArrayList();
            	    list_columnGen_1.add(columnGen_1);


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // /home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/DDL.ge3:96:3: (TK_3= ',' constraintGen+= constraint )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==12) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // /home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/DDL.ge3:96:4: TK_3= ',' constraintGen+= constraint
            	    {
            	    TK_3=(Token)input.LT(1);
            	    match(input,12,FOLLOW_12_in_create_table117); 
            	    pushFollow(FOLLOW_constraint_in_create_table121);
            	    constraintGen=constraint();
            	    _fsp--;

            	    if (list_constraintGen==null) list_constraintGen=new ArrayList();
            	    list_constraintGen.add(constraintGen);


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            TK_4=(Token)input.LT(1);
            match(input,13,FOLLOW_13_in_create_table128); 
            TK_5=(Token)input.LT(1);
            match(input,14,FOLLOW_14_in_create_table132); 
            
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
            	    // Create a CST Leaf
            		if(IDGen != null) {
            			Leaf IDGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf();
            			IDGenLeaf.setKind("ID");
            			IDGenLeaf.setValue(IDGen.getText());
            			IDGenLeaf.setPos(IDGen.getCharPositionInLine());
            			IDGenLeaf.setLine(IDGen.getLine());
            			create_tableReturnNode.getChildren().add(IDGenLeaf);
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
            	    // Create a CST Node
            		if(list_columnGen != null) {
            	        for(Iterator it = list_columnGen.iterator(); it.hasNext(); )  { 
            	            DDLParser.column_return r = (DDLParser.column_return) it.next(); 
            	            if(r != null && r.returnNode != null) {
            	            	r.returnNode.setKind("column");
            	            	create_tableReturnNode.getChildren().add(r.returnNode);
            	            } 
            	        }
            	    }
            	
            		// Create a special CST Node for terminal columnGen_1 aggregation
            		if(list_columnGen_1 != null) {
            	    for(int pos = 0; pos < list_columnGen_1.size(); pos++ )  { 
            	    // Create a Token CST Leaf	
            	    if(TK_2 != null) {
            			Leaf TK_2Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
            	 		TK_2Leaf.setKind("TOKEN");
            	 		TK_2Leaf.setValue(TK_2.getText());
            			TK_2Leaf.setPos(TK_2.getCharPositionInLine());
            			TK_2Leaf.setLine(TK_2.getLine());
            	 		create_tableReturnNode.getChildren().add(TK_2Leaf);
            	 	}
            		// No Terminal extractor
            	    if(list_columnGen_1 != null) {		
            	    	DDLParser.column_return r = (DDLParser.column_return) list_columnGen_1.get(pos); 
            	    	if(r != null && r.returnNode != null) {
            	        	r.returnNode.setKind("column");
            	    		create_tableReturnNode.getChildren().add(r.returnNode);
            	    	} 
            		}
            		}
            		}
            	
            	
            		// Create a special CST Node for terminal constraintGen aggregation
            		if(list_constraintGen != null) {
            	    for(int pos = 0; pos < list_constraintGen.size(); pos++ )  { 
            	    // Create a Token CST Leaf	
            	    if(TK_3 != null) {
            			Leaf TK_3Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
            	 		TK_3Leaf.setKind("TOKEN");
            	 		TK_3Leaf.setValue(TK_3.getText());
            			TK_3Leaf.setPos(TK_3.getCharPositionInLine());
            			TK_3Leaf.setLine(TK_3.getLine());
            	 		create_tableReturnNode.getChildren().add(TK_3Leaf);
            	 	}
            		// No Terminal extractor
            	    if(list_constraintGen != null) {		
            	    	DDLParser.constraint_return r = (DDLParser.constraint_return) list_constraintGen.get(pos); 
            	    	if(r != null && r.returnNode != null) {
            	        	r.returnNode.setKind("constraint");
            	    		create_tableReturnNode.getChildren().add(r.returnNode);
            	    	} 
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
            		// Returns the Node with CST Leaves/Nodes
            		retval.returnNode = create_tableReturnNode;
            	

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

    public static class column_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start column
    // /home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/DDL.ge3:210:1: column returns [Node returnNode] : IDGen= ID TYPEGen= TYPE (TK_0= '(' NUMBERGen= NUMBER TK_1= ')' )? (ISNULLGen= ISNULL )? ;
    public final column_return column() throws RecognitionException {
        column_return retval = new column_return();
        retval.start = input.LT(1);

        Token IDGen=null;
        Token TYPEGen=null;
        Token TK_0=null;
        Token NUMBERGen=null;
        Token TK_1=null;
        Token ISNULLGen=null;

        try {
            // /home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/DDL.ge3:211:1: (IDGen= ID TYPEGen= TYPE (TK_0= '(' NUMBERGen= NUMBER TK_1= ')' )? (ISNULLGen= ISNULL )? )
            // /home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/DDL.ge3:212:2: IDGen= ID TYPEGen= TYPE (TK_0= '(' NUMBERGen= NUMBER TK_1= ')' )? (ISNULLGen= ISNULL )?
            {
            IDGen=(Token)input.LT(1);
            match(input,ID,FOLLOW_ID_in_column153); 
            TYPEGen=(Token)input.LT(1);
            match(input,TYPE,FOLLOW_TYPE_in_column157); 
            // /home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/DDL.ge3:212:24: (TK_0= '(' NUMBERGen= NUMBER TK_1= ')' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==11) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/DDL.ge3:212:25: TK_0= '(' NUMBERGen= NUMBER TK_1= ')'
                    {
                    TK_0=(Token)input.LT(1);
                    match(input,11,FOLLOW_11_in_column162); 
                    NUMBERGen=(Token)input.LT(1);
                    match(input,NUMBER,FOLLOW_NUMBER_in_column166); 
                    TK_1=(Token)input.LT(1);
                    match(input,13,FOLLOW_13_in_column170); 

                    }
                    break;

            }

            // /home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/DDL.ge3:212:71: (ISNULLGen= ISNULL )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==ISNULL) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/DDL.ge3:212:71: ISNULLGen= ISNULL
                    {
                    ISNULLGen=(Token)input.LT(1);
                    match(input,ISNULL,FOLLOW_ISNULL_in_column176); 

                    }
                    break;

            }

            
            		// Create return CST Node
            		Node columnReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
            		columnReturnNode.setKind("column");
            	    // Create a CST Leaf
            		if(IDGen != null) {
            			Leaf IDGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf();
            			IDGenLeaf.setKind("ID");
            			IDGenLeaf.setValue(IDGen.getText());
            			IDGenLeaf.setPos(IDGen.getCharPositionInLine());
            			IDGenLeaf.setLine(IDGen.getLine());
            			columnReturnNode.getChildren().add(IDGenLeaf);
            		}
            	    // Create a CST Leaf
            		if(TYPEGen != null) {
            			Leaf TYPEGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf();
            			TYPEGenLeaf.setKind("TYPE");
            			TYPEGenLeaf.setValue(TYPEGen.getText());
            			TYPEGenLeaf.setPos(TYPEGen.getCharPositionInLine());
            			TYPEGenLeaf.setLine(TYPEGen.getLine());
            			columnReturnNode.getChildren().add(TYPEGenLeaf);
            		}
            	    // Create a Token CST Leaf	
            	    if(TK_0 != null) {
            			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
            	 		TK_0Leaf.setKind("TOKEN");
            	 		TK_0Leaf.setValue(TK_0.getText());
            			TK_0Leaf.setPos(TK_0.getCharPositionInLine());
            			TK_0Leaf.setLine(TK_0.getLine());
            	 		columnReturnNode.getChildren().add(TK_0Leaf);
            	 	}
            	    // Create a CST Leaf
            		if(NUMBERGen != null) {
            			Leaf NUMBERGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf();
            			NUMBERGenLeaf.setKind("NUMBER");
            			NUMBERGenLeaf.setValue(NUMBERGen.getText());
            			NUMBERGenLeaf.setPos(NUMBERGen.getCharPositionInLine());
            			NUMBERGenLeaf.setLine(NUMBERGen.getLine());
            			columnReturnNode.getChildren().add(NUMBERGenLeaf);
            		}
            	    // Create a Token CST Leaf	
            	    if(TK_1 != null) {
            			Leaf TK_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
            	 		TK_1Leaf.setKind("TOKEN");
            	 		TK_1Leaf.setValue(TK_1.getText());
            			TK_1Leaf.setPos(TK_1.getCharPositionInLine());
            			TK_1Leaf.setLine(TK_1.getLine());
            	 		columnReturnNode.getChildren().add(TK_1Leaf);
            	 	}
            	    // Create a CST Leaf
            		if(ISNULLGen != null) {
            			Leaf ISNULLGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf();
            			ISNULLGenLeaf.setKind("ISNULL");
            			ISNULLGenLeaf.setValue(ISNULLGen.getText());
            			ISNULLGenLeaf.setPos(ISNULLGen.getCharPositionInLine());
            			ISNULLGenLeaf.setLine(ISNULLGen.getLine());
            			columnReturnNode.getChildren().add(ISNULLGenLeaf);
            		}
            		// Returns the Node with CST Leaves/Nodes
            		retval.returnNode = columnReturnNode;
            	

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
    // $ANTLR end column

    public static class alter_table_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start alter_table
    // /home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/DDL.ge3:276:1: alter_table returns [Node returnNode] : TK_0= 'ALTER TABLE' tabnameGen+= tabname ( (add= 'ADD' constraintGen+= constraint ) | (enable= 'ENABLE' TK_1= 'CONSTRAINT' ) IDGen= ID ) TK_2= ';' ;
    public final alter_table_return alter_table() throws RecognitionException {
        alter_table_return retval = new alter_table_return();
        retval.start = input.LT(1);

        Token TK_0=null;
        Token add=null;
        Token enable=null;
        Token TK_1=null;
        Token IDGen=null;
        Token TK_2=null;
        List list_tabnameGen=null;
        List list_constraintGen=null;
        RuleReturnScope tabnameGen = null;
        RuleReturnScope constraintGen = null;
        try {
            // /home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/DDL.ge3:277:1: (TK_0= 'ALTER TABLE' tabnameGen+= tabname ( (add= 'ADD' constraintGen+= constraint ) | (enable= 'ENABLE' TK_1= 'CONSTRAINT' ) IDGen= ID ) TK_2= ';' )
            // /home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/DDL.ge3:278:2: TK_0= 'ALTER TABLE' tabnameGen+= tabname ( (add= 'ADD' constraintGen+= constraint ) | (enable= 'ENABLE' TK_1= 'CONSTRAINT' ) IDGen= ID ) TK_2= ';'
            {
            TK_0=(Token)input.LT(1);
            match(input,15,FOLLOW_15_in_alter_table198); 
            pushFollow(FOLLOW_tabname_in_alter_table202);
            tabnameGen=tabname();
            _fsp--;

            if (list_tabnameGen==null) list_tabnameGen=new ArrayList();
            list_tabnameGen.add(tabnameGen);

            // /home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/DDL.ge3:279:3: ( (add= 'ADD' constraintGen+= constraint ) | (enable= 'ENABLE' TK_1= 'CONSTRAINT' ) IDGen= ID )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==16) ) {
                alt6=1;
            }
            else if ( (LA6_0==17) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("279:3: ( (add= 'ADD' constraintGen+= constraint ) | (enable= 'ENABLE' TK_1= 'CONSTRAINT' ) IDGen= ID )", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/DDL.ge3:279:4: (add= 'ADD' constraintGen+= constraint )
                    {
                    // /home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/DDL.ge3:279:4: (add= 'ADD' constraintGen+= constraint )
                    // /home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/DDL.ge3:279:5: add= 'ADD' constraintGen+= constraint
                    {
                    add=(Token)input.LT(1);
                    match(input,16,FOLLOW_16_in_alter_table210); 
                    pushFollow(FOLLOW_constraint_in_alter_table214);
                    constraintGen=constraint();
                    _fsp--;

                    if (list_constraintGen==null) list_constraintGen=new ArrayList();
                    list_constraintGen.add(constraintGen);


                    }


                    }
                    break;
                case 2 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/DDL.ge3:279:44: (enable= 'ENABLE' TK_1= 'CONSTRAINT' ) IDGen= ID
                    {
                    // /home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/DDL.ge3:279:44: (enable= 'ENABLE' TK_1= 'CONSTRAINT' )
                    // /home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/DDL.ge3:279:45: enable= 'ENABLE' TK_1= 'CONSTRAINT'
                    {
                    enable=(Token)input.LT(1);
                    match(input,17,FOLLOW_17_in_alter_table222); 
                    TK_1=(Token)input.LT(1);
                    match(input,18,FOLLOW_18_in_alter_table226); 

                    }

                    IDGen=(Token)input.LT(1);
                    match(input,ID,FOLLOW_ID_in_alter_table231); 

                    }
                    break;

            }

            TK_2=(Token)input.LT(1);
            match(input,14,FOLLOW_14_in_alter_table237); 
            
            		// Create return CST Node
            		Node alter_tableReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
            		alter_tableReturnNode.setKind("alter_table");
            	    // Create a Token CST Leaf	
            	    if(TK_0 != null) {
            			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
            	 		TK_0Leaf.setKind("TOKEN");
            	 		TK_0Leaf.setValue(TK_0.getText());
            			TK_0Leaf.setPos(TK_0.getCharPositionInLine());
            			TK_0Leaf.setLine(TK_0.getLine());
            	 		alter_tableReturnNode.getChildren().add(TK_0Leaf);
            	 	}
            	    // Create a CST Node
            		if(list_tabnameGen != null) {
            	        for(Iterator it = list_tabnameGen.iterator(); it.hasNext(); )  { 
            	            DDLParser.tabname_return r = (DDLParser.tabname_return) it.next(); 
            	            if(r != null && r.returnNode != null) {
            	            	r.returnNode.setKind("tabname");
            	            	alter_tableReturnNode.getChildren().add(r.returnNode);
            	            } 
            	        }
            	    }
            	    // Create a CST Leaf
            		if(add != null) {
            			Leaf addLeaf = CSTFactoryImpl.eINSTANCE.createLeaf();
            			addLeaf.setKind("add");
            			addLeaf.setValue(add.getText());
            			addLeaf.setPos(add.getCharPositionInLine());
            			addLeaf.setLine(add.getLine());
            			alter_tableReturnNode.getChildren().add(addLeaf);
            		}
            	    // Create a CST Node
            		if(list_constraintGen != null) {
            	        for(Iterator it = list_constraintGen.iterator(); it.hasNext(); )  { 
            	            DDLParser.constraint_return r = (DDLParser.constraint_return) it.next(); 
            	            if(r != null && r.returnNode != null) {
            	            	r.returnNode.setKind("constraint");
            	            	alter_tableReturnNode.getChildren().add(r.returnNode);
            	            } 
            	        }
            	    }
            	    // Create a CST Leaf
            		if(enable != null) {
            			Leaf enableLeaf = CSTFactoryImpl.eINSTANCE.createLeaf();
            			enableLeaf.setKind("enable");
            			enableLeaf.setValue(enable.getText());
            			enableLeaf.setPos(enable.getCharPositionInLine());
            			enableLeaf.setLine(enable.getLine());
            			alter_tableReturnNode.getChildren().add(enableLeaf);
            		}
            	    // Create a Token CST Leaf	
            	    if(TK_1 != null) {
            			Leaf TK_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
            	 		TK_1Leaf.setKind("TOKEN");
            	 		TK_1Leaf.setValue(TK_1.getText());
            			TK_1Leaf.setPos(TK_1.getCharPositionInLine());
            			TK_1Leaf.setLine(TK_1.getLine());
            	 		alter_tableReturnNode.getChildren().add(TK_1Leaf);
            	 	}
            	    // Create a CST Leaf
            		if(IDGen != null) {
            			Leaf IDGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf();
            			IDGenLeaf.setKind("ID");
            			IDGenLeaf.setValue(IDGen.getText());
            			IDGenLeaf.setPos(IDGen.getCharPositionInLine());
            			IDGenLeaf.setLine(IDGen.getLine());
            			alter_tableReturnNode.getChildren().add(IDGenLeaf);
            		}
            	    // Create a Token CST Leaf	
            	    if(TK_2 != null) {
            			Leaf TK_2Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
            	 		TK_2Leaf.setKind("TOKEN");
            	 		TK_2Leaf.setValue(TK_2.getText());
            			TK_2Leaf.setPos(TK_2.getCharPositionInLine());
            			TK_2Leaf.setLine(TK_2.getLine());
            	 		alter_tableReturnNode.getChildren().add(TK_2Leaf);
            	 	}
            		// Returns the Node with CST Leaves/Nodes
            		retval.returnNode = alter_tableReturnNode;
            	

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
    // $ANTLR end alter_table

    public static class comment_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start comment
    // /home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/DDL.ge3:364:1: comment returns [Node returnNode] : TK_0= 'COMMENT ON' ( (TK_1= 'TABLE' tabnameGen+= tabname ) | (TK_2= 'COLUMN' IDGen= ID TK_3= '.' colnameGen+= colname ) ) TK_4= 'IS' STRINGGen= STRING TK_5= ';' ;
    public final comment_return comment() throws RecognitionException {
        comment_return retval = new comment_return();
        retval.start = input.LT(1);

        Token TK_0=null;
        Token TK_1=null;
        Token TK_2=null;
        Token IDGen=null;
        Token TK_3=null;
        Token TK_4=null;
        Token STRINGGen=null;
        Token TK_5=null;
        List list_tabnameGen=null;
        List list_colnameGen=null;
        RuleReturnScope tabnameGen = null;
        RuleReturnScope colnameGen = null;
        try {
            // /home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/DDL.ge3:365:1: (TK_0= 'COMMENT ON' ( (TK_1= 'TABLE' tabnameGen+= tabname ) | (TK_2= 'COLUMN' IDGen= ID TK_3= '.' colnameGen+= colname ) ) TK_4= 'IS' STRINGGen= STRING TK_5= ';' )
            // /home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/DDL.ge3:366:2: TK_0= 'COMMENT ON' ( (TK_1= 'TABLE' tabnameGen+= tabname ) | (TK_2= 'COLUMN' IDGen= ID TK_3= '.' colnameGen+= colname ) ) TK_4= 'IS' STRINGGen= STRING TK_5= ';'
            {
            TK_0=(Token)input.LT(1);
            match(input,19,FOLLOW_19_in_comment258); 
            // /home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/DDL.ge3:366:20: ( (TK_1= 'TABLE' tabnameGen+= tabname ) | (TK_2= 'COLUMN' IDGen= ID TK_3= '.' colnameGen+= colname ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==20) ) {
                alt7=1;
            }
            else if ( (LA7_0==21) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("366:20: ( (TK_1= 'TABLE' tabnameGen+= tabname ) | (TK_2= 'COLUMN' IDGen= ID TK_3= '.' colnameGen+= colname ) )", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/DDL.ge3:366:21: (TK_1= 'TABLE' tabnameGen+= tabname )
                    {
                    // /home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/DDL.ge3:366:21: (TK_1= 'TABLE' tabnameGen+= tabname )
                    // /home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/DDL.ge3:366:22: TK_1= 'TABLE' tabnameGen+= tabname
                    {
                    TK_1=(Token)input.LT(1);
                    match(input,20,FOLLOW_20_in_comment264); 
                    pushFollow(FOLLOW_tabname_in_comment268);
                    tabnameGen=tabname();
                    _fsp--;

                    if (list_tabnameGen==null) list_tabnameGen=new ArrayList();
                    list_tabnameGen.add(tabnameGen);


                    }


                    }
                    break;
                case 2 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/DDL.ge3:366:58: (TK_2= 'COLUMN' IDGen= ID TK_3= '.' colnameGen+= colname )
                    {
                    // /home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/DDL.ge3:366:58: (TK_2= 'COLUMN' IDGen= ID TK_3= '.' colnameGen+= colname )
                    // /home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/DDL.ge3:366:59: TK_2= 'COLUMN' IDGen= ID TK_3= '.' colnameGen+= colname
                    {
                    TK_2=(Token)input.LT(1);
                    match(input,21,FOLLOW_21_in_comment276); 
                    IDGen=(Token)input.LT(1);
                    match(input,ID,FOLLOW_ID_in_comment280); 
                    TK_3=(Token)input.LT(1);
                    match(input,22,FOLLOW_22_in_comment284); 
                    pushFollow(FOLLOW_colname_in_comment288);
                    colnameGen=colname();
                    _fsp--;

                    if (list_colnameGen==null) list_colnameGen=new ArrayList();
                    list_colnameGen.add(colnameGen);


                    }


                    }
                    break;

            }

            TK_4=(Token)input.LT(1);
            match(input,23,FOLLOW_23_in_comment294); 
            STRINGGen=(Token)input.LT(1);
            match(input,STRING,FOLLOW_STRING_in_comment298); 
            TK_5=(Token)input.LT(1);
            match(input,14,FOLLOW_14_in_comment302); 
            
            		// Create return CST Node
            		Node commentReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
            		commentReturnNode.setKind("comment");
            	    // Create a Token CST Leaf	
            	    if(TK_0 != null) {
            			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
            	 		TK_0Leaf.setKind("TOKEN");
            	 		TK_0Leaf.setValue(TK_0.getText());
            			TK_0Leaf.setPos(TK_0.getCharPositionInLine());
            			TK_0Leaf.setLine(TK_0.getLine());
            	 		commentReturnNode.getChildren().add(TK_0Leaf);
            	 	}
            	    // Create a Token CST Leaf	
            	    if(TK_1 != null) {
            			Leaf TK_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
            	 		TK_1Leaf.setKind("TOKEN");
            	 		TK_1Leaf.setValue(TK_1.getText());
            			TK_1Leaf.setPos(TK_1.getCharPositionInLine());
            			TK_1Leaf.setLine(TK_1.getLine());
            	 		commentReturnNode.getChildren().add(TK_1Leaf);
            	 	}
            	    // Create a CST Node
            		if(list_tabnameGen != null) {
            	        for(Iterator it = list_tabnameGen.iterator(); it.hasNext(); )  { 
            	            DDLParser.tabname_return r = (DDLParser.tabname_return) it.next(); 
            	            if(r != null && r.returnNode != null) {
            	            	r.returnNode.setKind("tabname");
            	            	commentReturnNode.getChildren().add(r.returnNode);
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
            	 		commentReturnNode.getChildren().add(TK_2Leaf);
            	 	}
            	    // Create a CST Leaf
            		if(IDGen != null) {
            			Leaf IDGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf();
            			IDGenLeaf.setKind("ID");
            			IDGenLeaf.setValue(IDGen.getText());
            			IDGenLeaf.setPos(IDGen.getCharPositionInLine());
            			IDGenLeaf.setLine(IDGen.getLine());
            			commentReturnNode.getChildren().add(IDGenLeaf);
            		}
            	    // Create a Token CST Leaf	
            	    if(TK_3 != null) {
            			Leaf TK_3Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
            	 		TK_3Leaf.setKind("TOKEN");
            	 		TK_3Leaf.setValue(TK_3.getText());
            			TK_3Leaf.setPos(TK_3.getCharPositionInLine());
            			TK_3Leaf.setLine(TK_3.getLine());
            	 		commentReturnNode.getChildren().add(TK_3Leaf);
            	 	}
            	    // Create a CST Node
            		if(list_colnameGen != null) {
            	        for(Iterator it = list_colnameGen.iterator(); it.hasNext(); )  { 
            	            DDLParser.colname_return r = (DDLParser.colname_return) it.next(); 
            	            if(r != null && r.returnNode != null) {
            	            	r.returnNode.setKind("colname");
            	            	commentReturnNode.getChildren().add(r.returnNode);
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
            	 		commentReturnNode.getChildren().add(TK_4Leaf);
            	 	}
            	    // Create a CST Leaf
            		if(STRINGGen != null) {
            			Leaf STRINGGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf();
            			STRINGGenLeaf.setKind("STRING");
            			STRINGGenLeaf.setValue(STRINGGen.getText());
            			STRINGGenLeaf.setPos(STRINGGen.getCharPositionInLine());
            			STRINGGenLeaf.setLine(STRINGGen.getLine());
            			commentReturnNode.getChildren().add(STRINGGenLeaf);
            		}
            	    // Create a Token CST Leaf	
            	    if(TK_5 != null) {
            			Leaf TK_5Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
            	 		TK_5Leaf.setKind("TOKEN");
            	 		TK_5Leaf.setValue(TK_5.getText());
            			TK_5Leaf.setPos(TK_5.getCharPositionInLine());
            			TK_5Leaf.setLine(TK_5.getLine());
            	 		commentReturnNode.getChildren().add(TK_5Leaf);
            	 	}
            		// Returns the Node with CST Leaves/Nodes
            		retval.returnNode = commentReturnNode;
            	

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
    // $ANTLR end comment

    public static class create_sequence_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start create_sequence
    // /home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/DDL.ge3:468:1: create_sequence returns [Node returnNode] : TK_0= 'CREATE SEQUENCE' IDGen= ID (sequence_optionsGen+= sequence_options )* TK_1= ';' ;
    public final create_sequence_return create_sequence() throws RecognitionException {
        create_sequence_return retval = new create_sequence_return();
        retval.start = input.LT(1);

        Token TK_0=null;
        Token IDGen=null;
        Token TK_1=null;
        List list_sequence_optionsGen=null;
        RuleReturnScope sequence_optionsGen = null;
        try {
            // /home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/DDL.ge3:469:1: (TK_0= 'CREATE SEQUENCE' IDGen= ID (sequence_optionsGen+= sequence_options )* TK_1= ';' )
            // /home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/DDL.ge3:470:2: TK_0= 'CREATE SEQUENCE' IDGen= ID (sequence_optionsGen+= sequence_options )* TK_1= ';'
            {
            TK_0=(Token)input.LT(1);
            match(input,24,FOLLOW_24_in_create_sequence323); 
            IDGen=(Token)input.LT(1);
            match(input,ID,FOLLOW_ID_in_create_sequence327); 
            // /home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/DDL.ge3:470:53: (sequence_optionsGen+= sequence_options )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==25||LA8_0==27||(LA8_0>=29 && LA8_0<=38)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // /home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/DDL.ge3:470:53: sequence_optionsGen+= sequence_options
            	    {
            	    pushFollow(FOLLOW_sequence_options_in_create_sequence331);
            	    sequence_optionsGen=sequence_options();
            	    _fsp--;

            	    if (list_sequence_optionsGen==null) list_sequence_optionsGen=new ArrayList();
            	    list_sequence_optionsGen.add(sequence_optionsGen);


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            TK_1=(Token)input.LT(1);
            match(input,14,FOLLOW_14_in_create_sequence336); 
            
            		// Create return CST Node
            		Node create_sequenceReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
            		create_sequenceReturnNode.setKind("create_sequence");
            	    // Create a Token CST Leaf	
            	    if(TK_0 != null) {
            			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
            	 		TK_0Leaf.setKind("TOKEN");
            	 		TK_0Leaf.setValue(TK_0.getText());
            			TK_0Leaf.setPos(TK_0.getCharPositionInLine());
            			TK_0Leaf.setLine(TK_0.getLine());
            	 		create_sequenceReturnNode.getChildren().add(TK_0Leaf);
            	 	}
            	    // Create a CST Leaf
            		if(IDGen != null) {
            			Leaf IDGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf();
            			IDGenLeaf.setKind("ID");
            			IDGenLeaf.setValue(IDGen.getText());
            			IDGenLeaf.setPos(IDGen.getCharPositionInLine());
            			IDGenLeaf.setLine(IDGen.getLine());
            			create_sequenceReturnNode.getChildren().add(IDGenLeaf);
            		}
            	    // Create a CST Node
            		if(list_sequence_optionsGen != null) {
            	        for(Iterator it = list_sequence_optionsGen.iterator(); it.hasNext(); )  { 
            	            DDLParser.sequence_options_return r = (DDLParser.sequence_options_return) it.next(); 
            	            if(r != null && r.returnNode != null) {
            	            	r.returnNode.setKind("sequence_options");
            	            	create_sequenceReturnNode.getChildren().add(r.returnNode);
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
            	 		create_sequenceReturnNode.getChildren().add(TK_1Leaf);
            	 	}
            		// Returns the Node with CST Leaves/Nodes
            		retval.returnNode = create_sequenceReturnNode;
            	

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
    // $ANTLR end create_sequence

    public static class sequence_options_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start sequence_options
    // /home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/DDL.ge3:517:1: sequence_options returns [Node returnNode] : (increment= 'INCREMENT' TK_0= 'BY' NUMBERGen= NUMBER | start= 'START' TK_0= 'WITH' NUMBERGen= NUMBER | maxvalue= 'MAXVALUE' NUMBERGen= NUMBER | nomaxvalue= 'NOMAXVALUE' | minvalue= 'MINVALUE' NUMBERGen= NUMBER | nominvalue= 'NOMINVALUE' | cycle= 'CYCLE' | nocycle= 'NOCYCLE' | cache= 'CACHE' NUMBERGen= NUMBER | nocache= 'NOCACHE' | order= 'ORDER' | noorder= 'NOORDER' );
    public final sequence_options_return sequence_options() throws RecognitionException {
        sequence_options_return retval = new sequence_options_return();
        retval.start = input.LT(1);

        Token increment=null;
        Token TK_0=null;
        Token NUMBERGen=null;
        Token start=null;
        Token maxvalue=null;
        Token nomaxvalue=null;
        Token minvalue=null;
        Token nominvalue=null;
        Token cycle=null;
        Token nocycle=null;
        Token cache=null;
        Token nocache=null;
        Token order=null;
        Token noorder=null;

        try {
            // /home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/DDL.ge3:518:1: (increment= 'INCREMENT' TK_0= 'BY' NUMBERGen= NUMBER | start= 'START' TK_0= 'WITH' NUMBERGen= NUMBER | maxvalue= 'MAXVALUE' NUMBERGen= NUMBER | nomaxvalue= 'NOMAXVALUE' | minvalue= 'MINVALUE' NUMBERGen= NUMBER | nominvalue= 'NOMINVALUE' | cycle= 'CYCLE' | nocycle= 'NOCYCLE' | cache= 'CACHE' NUMBERGen= NUMBER | nocache= 'NOCACHE' | order= 'ORDER' | noorder= 'NOORDER' )
            int alt9=12;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt9=1;
                }
                break;
            case 27:
                {
                alt9=2;
                }
                break;
            case 29:
                {
                alt9=3;
                }
                break;
            case 30:
                {
                alt9=4;
                }
                break;
            case 31:
                {
                alt9=5;
                }
                break;
            case 32:
                {
                alt9=6;
                }
                break;
            case 33:
                {
                alt9=7;
                }
                break;
            case 34:
                {
                alt9=8;
                }
                break;
            case 35:
                {
                alt9=9;
                }
                break;
            case 36:
                {
                alt9=10;
                }
                break;
            case 37:
                {
                alt9=11;
                }
                break;
            case 38:
                {
                alt9=12;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("517:1: sequence_options returns [Node returnNode] : (increment= 'INCREMENT' TK_0= 'BY' NUMBERGen= NUMBER | start= 'START' TK_0= 'WITH' NUMBERGen= NUMBER | maxvalue= 'MAXVALUE' NUMBERGen= NUMBER | nomaxvalue= 'NOMAXVALUE' | minvalue= 'MINVALUE' NUMBERGen= NUMBER | nominvalue= 'NOMINVALUE' | cycle= 'CYCLE' | nocycle= 'NOCYCLE' | cache= 'CACHE' NUMBERGen= NUMBER | nocache= 'NOCACHE' | order= 'ORDER' | noorder= 'NOORDER' );", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/DDL.ge3:519:2: increment= 'INCREMENT' TK_0= 'BY' NUMBERGen= NUMBER
                    {
                    increment=(Token)input.LT(1);
                    match(input,25,FOLLOW_25_in_sequence_options357); 
                    TK_0=(Token)input.LT(1);
                    match(input,26,FOLLOW_26_in_sequence_options361); 
                    NUMBERGen=(Token)input.LT(1);
                    match(input,NUMBER,FOLLOW_NUMBER_in_sequence_options365); 
                    
                    		// Create return CST Node
                    		Node sequence_optionsReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                    		sequence_optionsReturnNode.setKind("sequence_options");
                    	    // Create a CST Leaf
                    		if(increment != null) {
                    			Leaf incrementLeaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                    			incrementLeaf.setKind("increment");
                    			incrementLeaf.setValue(increment.getText());
                    			incrementLeaf.setPos(increment.getCharPositionInLine());
                    			incrementLeaf.setLine(increment.getLine());
                    			sequence_optionsReturnNode.getChildren().add(incrementLeaf);
                    		}
                    	    // Create a Token CST Leaf	
                    	    if(TK_0 != null) {
                    			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                    	 		TK_0Leaf.setKind("TOKEN");
                    	 		TK_0Leaf.setValue(TK_0.getText());
                    			TK_0Leaf.setPos(TK_0.getCharPositionInLine());
                    			TK_0Leaf.setLine(TK_0.getLine());
                    	 		sequence_optionsReturnNode.getChildren().add(TK_0Leaf);
                    	 	}
                    	    // Create a CST Leaf
                    		if(NUMBERGen != null) {
                    			Leaf NUMBERGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                    			NUMBERGenLeaf.setKind("NUMBER");
                    			NUMBERGenLeaf.setValue(NUMBERGen.getText());
                    			NUMBERGenLeaf.setPos(NUMBERGen.getCharPositionInLine());
                    			NUMBERGenLeaf.setLine(NUMBERGen.getLine());
                    			sequence_optionsReturnNode.getChildren().add(NUMBERGenLeaf);
                    		}
                    		// Returns the Node with CST Leaves/Nodes
                    		retval.returnNode = sequence_optionsReturnNode;
                    	

                    }
                    break;
                case 2 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/DDL.ge3:553:6: start= 'START' TK_0= 'WITH' NUMBERGen= NUMBER
                    {
                    start=(Token)input.LT(1);
                    match(input,27,FOLLOW_27_in_sequence_options375); 
                    TK_0=(Token)input.LT(1);
                    match(input,28,FOLLOW_28_in_sequence_options379); 
                    NUMBERGen=(Token)input.LT(1);
                    match(input,NUMBER,FOLLOW_NUMBER_in_sequence_options383); 
                    
                    		// Create return CST Node
                    		Node sequence_optionsReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                    		sequence_optionsReturnNode.setKind("sequence_options");
                    	    // Create a CST Leaf
                    		if(start != null) {
                    			Leaf startLeaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                    			startLeaf.setKind("start");
                    			startLeaf.setValue(start.getText());
                    			startLeaf.setPos(start.getCharPositionInLine());
                    			startLeaf.setLine(start.getLine());
                    			sequence_optionsReturnNode.getChildren().add(startLeaf);
                    		}
                    	    // Create a Token CST Leaf	
                    	    if(TK_0 != null) {
                    			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                    	 		TK_0Leaf.setKind("TOKEN");
                    	 		TK_0Leaf.setValue(TK_0.getText());
                    			TK_0Leaf.setPos(TK_0.getCharPositionInLine());
                    			TK_0Leaf.setLine(TK_0.getLine());
                    	 		sequence_optionsReturnNode.getChildren().add(TK_0Leaf);
                    	 	}
                    	    // Create a CST Leaf
                    		if(NUMBERGen != null) {
                    			Leaf NUMBERGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                    			NUMBERGenLeaf.setKind("NUMBER");
                    			NUMBERGenLeaf.setValue(NUMBERGen.getText());
                    			NUMBERGenLeaf.setPos(NUMBERGen.getCharPositionInLine());
                    			NUMBERGenLeaf.setLine(NUMBERGen.getLine());
                    			sequence_optionsReturnNode.getChildren().add(NUMBERGenLeaf);
                    		}
                    		// Returns the Node with CST Leaves/Nodes
                    		retval.returnNode = sequence_optionsReturnNode;
                    	

                    }
                    break;
                case 3 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/DDL.ge3:588:2: maxvalue= 'MAXVALUE' NUMBERGen= NUMBER
                    {
                    maxvalue=(Token)input.LT(1);
                    match(input,29,FOLLOW_29_in_sequence_options394); 
                    NUMBERGen=(Token)input.LT(1);
                    match(input,NUMBER,FOLLOW_NUMBER_in_sequence_options398); 
                    
                    		// Create return CST Node
                    		Node sequence_optionsReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                    		sequence_optionsReturnNode.setKind("sequence_options");
                    	    // Create a CST Leaf
                    		if(maxvalue != null) {
                    			Leaf maxvalueLeaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                    			maxvalueLeaf.setKind("maxvalue");
                    			maxvalueLeaf.setValue(maxvalue.getText());
                    			maxvalueLeaf.setPos(maxvalue.getCharPositionInLine());
                    			maxvalueLeaf.setLine(maxvalue.getLine());
                    			sequence_optionsReturnNode.getChildren().add(maxvalueLeaf);
                    		}
                    	    // Create a CST Leaf
                    		if(NUMBERGen != null) {
                    			Leaf NUMBERGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                    			NUMBERGenLeaf.setKind("NUMBER");
                    			NUMBERGenLeaf.setValue(NUMBERGen.getText());
                    			NUMBERGenLeaf.setPos(NUMBERGen.getCharPositionInLine());
                    			NUMBERGenLeaf.setLine(NUMBERGen.getLine());
                    			sequence_optionsReturnNode.getChildren().add(NUMBERGenLeaf);
                    		}
                    		// Returns the Node with CST Leaves/Nodes
                    		retval.returnNode = sequence_optionsReturnNode;
                    	

                    }
                    break;
                case 4 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/DDL.ge3:613:6: nomaxvalue= 'NOMAXVALUE'
                    {
                    nomaxvalue=(Token)input.LT(1);
                    match(input,30,FOLLOW_30_in_sequence_options408); 
                    
                    		// Create return CST Node
                    		Node sequence_optionsReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                    		sequence_optionsReturnNode.setKind("sequence_options");
                    	    // Create a CST Leaf
                    		if(nomaxvalue != null) {
                    			Leaf nomaxvalueLeaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                    			nomaxvalueLeaf.setKind("nomaxvalue");
                    			nomaxvalueLeaf.setValue(nomaxvalue.getText());
                    			nomaxvalueLeaf.setPos(nomaxvalue.getCharPositionInLine());
                    			nomaxvalueLeaf.setLine(nomaxvalue.getLine());
                    			sequence_optionsReturnNode.getChildren().add(nomaxvalueLeaf);
                    		}
                    		// Returns the Node with CST Leaves/Nodes
                    		retval.returnNode = sequence_optionsReturnNode;
                    	

                    }
                    break;
                case 5 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/DDL.ge3:630:2: minvalue= 'MINVALUE' NUMBERGen= NUMBER
                    {
                    minvalue=(Token)input.LT(1);
                    match(input,31,FOLLOW_31_in_sequence_options419); 
                    NUMBERGen=(Token)input.LT(1);
                    match(input,NUMBER,FOLLOW_NUMBER_in_sequence_options423); 
                    
                    		// Create return CST Node
                    		Node sequence_optionsReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                    		sequence_optionsReturnNode.setKind("sequence_options");
                    	    // Create a CST Leaf
                    		if(minvalue != null) {
                    			Leaf minvalueLeaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                    			minvalueLeaf.setKind("minvalue");
                    			minvalueLeaf.setValue(minvalue.getText());
                    			minvalueLeaf.setPos(minvalue.getCharPositionInLine());
                    			minvalueLeaf.setLine(minvalue.getLine());
                    			sequence_optionsReturnNode.getChildren().add(minvalueLeaf);
                    		}
                    	    // Create a CST Leaf
                    		if(NUMBERGen != null) {
                    			Leaf NUMBERGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                    			NUMBERGenLeaf.setKind("NUMBER");
                    			NUMBERGenLeaf.setValue(NUMBERGen.getText());
                    			NUMBERGenLeaf.setPos(NUMBERGen.getCharPositionInLine());
                    			NUMBERGenLeaf.setLine(NUMBERGen.getLine());
                    			sequence_optionsReturnNode.getChildren().add(NUMBERGenLeaf);
                    		}
                    		// Returns the Node with CST Leaves/Nodes
                    		retval.returnNode = sequence_optionsReturnNode;
                    	

                    }
                    break;
                case 6 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/DDL.ge3:655:6: nominvalue= 'NOMINVALUE'
                    {
                    nominvalue=(Token)input.LT(1);
                    match(input,32,FOLLOW_32_in_sequence_options433); 
                    
                    		// Create return CST Node
                    		Node sequence_optionsReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                    		sequence_optionsReturnNode.setKind("sequence_options");
                    	    // Create a CST Leaf
                    		if(nominvalue != null) {
                    			Leaf nominvalueLeaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                    			nominvalueLeaf.setKind("nominvalue");
                    			nominvalueLeaf.setValue(nominvalue.getText());
                    			nominvalueLeaf.setPos(nominvalue.getCharPositionInLine());
                    			nominvalueLeaf.setLine(nominvalue.getLine());
                    			sequence_optionsReturnNode.getChildren().add(nominvalueLeaf);
                    		}
                    		// Returns the Node with CST Leaves/Nodes
                    		retval.returnNode = sequence_optionsReturnNode;
                    	

                    }
                    break;
                case 7 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/DDL.ge3:672:2: cycle= 'CYCLE'
                    {
                    cycle=(Token)input.LT(1);
                    match(input,33,FOLLOW_33_in_sequence_options444); 
                    
                    		// Create return CST Node
                    		Node sequence_optionsReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                    		sequence_optionsReturnNode.setKind("sequence_options");
                    	    // Create a CST Leaf
                    		if(cycle != null) {
                    			Leaf cycleLeaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                    			cycleLeaf.setKind("cycle");
                    			cycleLeaf.setValue(cycle.getText());
                    			cycleLeaf.setPos(cycle.getCharPositionInLine());
                    			cycleLeaf.setLine(cycle.getLine());
                    			sequence_optionsReturnNode.getChildren().add(cycleLeaf);
                    		}
                    		// Returns the Node with CST Leaves/Nodes
                    		retval.returnNode = sequence_optionsReturnNode;
                    	

                    }
                    break;
                case 8 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/DDL.ge3:688:6: nocycle= 'NOCYCLE'
                    {
                    nocycle=(Token)input.LT(1);
                    match(input,34,FOLLOW_34_in_sequence_options454); 
                    
                    		// Create return CST Node
                    		Node sequence_optionsReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                    		sequence_optionsReturnNode.setKind("sequence_options");
                    	    // Create a CST Leaf
                    		if(nocycle != null) {
                    			Leaf nocycleLeaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                    			nocycleLeaf.setKind("nocycle");
                    			nocycleLeaf.setValue(nocycle.getText());
                    			nocycleLeaf.setPos(nocycle.getCharPositionInLine());
                    			nocycleLeaf.setLine(nocycle.getLine());
                    			sequence_optionsReturnNode.getChildren().add(nocycleLeaf);
                    		}
                    		// Returns the Node with CST Leaves/Nodes
                    		retval.returnNode = sequence_optionsReturnNode;
                    	

                    }
                    break;
                case 9 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/DDL.ge3:705:2: cache= 'CACHE' NUMBERGen= NUMBER
                    {
                    cache=(Token)input.LT(1);
                    match(input,35,FOLLOW_35_in_sequence_options465); 
                    NUMBERGen=(Token)input.LT(1);
                    match(input,NUMBER,FOLLOW_NUMBER_in_sequence_options469); 
                    
                    		// Create return CST Node
                    		Node sequence_optionsReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                    		sequence_optionsReturnNode.setKind("sequence_options");
                    	    // Create a CST Leaf
                    		if(cache != null) {
                    			Leaf cacheLeaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                    			cacheLeaf.setKind("cache");
                    			cacheLeaf.setValue(cache.getText());
                    			cacheLeaf.setPos(cache.getCharPositionInLine());
                    			cacheLeaf.setLine(cache.getLine());
                    			sequence_optionsReturnNode.getChildren().add(cacheLeaf);
                    		}
                    	    // Create a CST Leaf
                    		if(NUMBERGen != null) {
                    			Leaf NUMBERGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                    			NUMBERGenLeaf.setKind("NUMBER");
                    			NUMBERGenLeaf.setValue(NUMBERGen.getText());
                    			NUMBERGenLeaf.setPos(NUMBERGen.getCharPositionInLine());
                    			NUMBERGenLeaf.setLine(NUMBERGen.getLine());
                    			sequence_optionsReturnNode.getChildren().add(NUMBERGenLeaf);
                    		}
                    		// Returns the Node with CST Leaves/Nodes
                    		retval.returnNode = sequence_optionsReturnNode;
                    	

                    }
                    break;
                case 10 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/DDL.ge3:730:6: nocache= 'NOCACHE'
                    {
                    nocache=(Token)input.LT(1);
                    match(input,36,FOLLOW_36_in_sequence_options479); 
                    
                    		// Create return CST Node
                    		Node sequence_optionsReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                    		sequence_optionsReturnNode.setKind("sequence_options");
                    	    // Create a CST Leaf
                    		if(nocache != null) {
                    			Leaf nocacheLeaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                    			nocacheLeaf.setKind("nocache");
                    			nocacheLeaf.setValue(nocache.getText());
                    			nocacheLeaf.setPos(nocache.getCharPositionInLine());
                    			nocacheLeaf.setLine(nocache.getLine());
                    			sequence_optionsReturnNode.getChildren().add(nocacheLeaf);
                    		}
                    		// Returns the Node with CST Leaves/Nodes
                    		retval.returnNode = sequence_optionsReturnNode;
                    	

                    }
                    break;
                case 11 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/DDL.ge3:747:2: order= 'ORDER'
                    {
                    order=(Token)input.LT(1);
                    match(input,37,FOLLOW_37_in_sequence_options490); 
                    
                    		// Create return CST Node
                    		Node sequence_optionsReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                    		sequence_optionsReturnNode.setKind("sequence_options");
                    	    // Create a CST Leaf
                    		if(order != null) {
                    			Leaf orderLeaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                    			orderLeaf.setKind("order");
                    			orderLeaf.setValue(order.getText());
                    			orderLeaf.setPos(order.getCharPositionInLine());
                    			orderLeaf.setLine(order.getLine());
                    			sequence_optionsReturnNode.getChildren().add(orderLeaf);
                    		}
                    		// Returns the Node with CST Leaves/Nodes
                    		retval.returnNode = sequence_optionsReturnNode;
                    	

                    }
                    break;
                case 12 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/DDL.ge3:763:6: noorder= 'NOORDER'
                    {
                    noorder=(Token)input.LT(1);
                    match(input,38,FOLLOW_38_in_sequence_options500); 
                    
                    		// Create return CST Node
                    		Node sequence_optionsReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                    		sequence_optionsReturnNode.setKind("sequence_options");
                    	    // Create a CST Leaf
                    		if(noorder != null) {
                    			Leaf noorderLeaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                    			noorderLeaf.setKind("noorder");
                    			noorderLeaf.setValue(noorder.getText());
                    			noorderLeaf.setPos(noorder.getCharPositionInLine());
                    			noorderLeaf.setLine(noorder.getLine());
                    			sequence_optionsReturnNode.getChildren().add(noorderLeaf);
                    		}
                    		// Returns the Node with CST Leaves/Nodes
                    		retval.returnNode = sequence_optionsReturnNode;
                    	

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
    // $ANTLR end sequence_options

    public static class constraint_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start constraint
    // /home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/DDL.ge3:782:1: constraint returns [Node returnNode] : TK_0= 'CONSTRAINT' IDGen= ID (primary_keyGen+= primary_key | unique_keyGen+= unique_key | foreign_keyGen+= foreign_key ) ;
    public final constraint_return constraint() throws RecognitionException {
        constraint_return retval = new constraint_return();
        retval.start = input.LT(1);

        Token TK_0=null;
        Token IDGen=null;
        List list_primary_keyGen=null;
        List list_unique_keyGen=null;
        List list_foreign_keyGen=null;
        RuleReturnScope primary_keyGen = null;
        RuleReturnScope unique_keyGen = null;
        RuleReturnScope foreign_keyGen = null;
        try {
            // /home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/DDL.ge3:783:1: (TK_0= 'CONSTRAINT' IDGen= ID (primary_keyGen+= primary_key | unique_keyGen+= unique_key | foreign_keyGen+= foreign_key ) )
            // /home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/DDL.ge3:784:2: TK_0= 'CONSTRAINT' IDGen= ID (primary_keyGen+= primary_key | unique_keyGen+= unique_key | foreign_keyGen+= foreign_key )
            {
            TK_0=(Token)input.LT(1);
            match(input,18,FOLLOW_18_in_constraint521); 
            IDGen=(Token)input.LT(1);
            match(input,ID,FOLLOW_ID_in_constraint525); 
            // /home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/DDL.ge3:784:29: (primary_keyGen+= primary_key | unique_keyGen+= unique_key | foreign_keyGen+= foreign_key )
            int alt10=3;
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
            default:
                NoViableAltException nvae =
                    new NoViableAltException("784:29: (primary_keyGen+= primary_key | unique_keyGen+= unique_key | foreign_keyGen+= foreign_key )", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/DDL.ge3:784:30: primary_keyGen+= primary_key
                    {
                    pushFollow(FOLLOW_primary_key_in_constraint530);
                    primary_keyGen=primary_key();
                    _fsp--;

                    if (list_primary_keyGen==null) list_primary_keyGen=new ArrayList();
                    list_primary_keyGen.add(primary_keyGen);


                    }
                    break;
                case 2 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/DDL.ge3:784:60: unique_keyGen+= unique_key
                    {
                    pushFollow(FOLLOW_unique_key_in_constraint536);
                    unique_keyGen=unique_key();
                    _fsp--;

                    if (list_unique_keyGen==null) list_unique_keyGen=new ArrayList();
                    list_unique_keyGen.add(unique_keyGen);


                    }
                    break;
                case 3 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/DDL.ge3:784:88: foreign_keyGen+= foreign_key
                    {
                    pushFollow(FOLLOW_foreign_key_in_constraint542);
                    foreign_keyGen=foreign_key();
                    _fsp--;

                    if (list_foreign_keyGen==null) list_foreign_keyGen=new ArrayList();
                    list_foreign_keyGen.add(foreign_keyGen);


                    }
                    break;

            }

            
            		// Create return CST Node
            		Node constraintReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
            		constraintReturnNode.setKind("constraint");
            	    // Create a Token CST Leaf	
            	    if(TK_0 != null) {
            			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
            	 		TK_0Leaf.setKind("TOKEN");
            	 		TK_0Leaf.setValue(TK_0.getText());
            			TK_0Leaf.setPos(TK_0.getCharPositionInLine());
            			TK_0Leaf.setLine(TK_0.getLine());
            	 		constraintReturnNode.getChildren().add(TK_0Leaf);
            	 	}
            	    // Create a CST Leaf
            		if(IDGen != null) {
            			Leaf IDGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf();
            			IDGenLeaf.setKind("ID");
            			IDGenLeaf.setValue(IDGen.getText());
            			IDGenLeaf.setPos(IDGen.getCharPositionInLine());
            			IDGenLeaf.setLine(IDGen.getLine());
            			constraintReturnNode.getChildren().add(IDGenLeaf);
            		}
            	    // Create a CST Node
            		if(list_primary_keyGen != null) {
            	        for(Iterator it = list_primary_keyGen.iterator(); it.hasNext(); )  { 
            	            DDLParser.primary_key_return r = (DDLParser.primary_key_return) it.next(); 
            	            if(r != null && r.returnNode != null) {
            	            	r.returnNode.setKind("primary_key");
            	            	constraintReturnNode.getChildren().add(r.returnNode);
            	            } 
            	        }
            	    }
            	    // Create a CST Node
            		if(list_unique_keyGen != null) {
            	        for(Iterator it = list_unique_keyGen.iterator(); it.hasNext(); )  { 
            	            DDLParser.unique_key_return r = (DDLParser.unique_key_return) it.next(); 
            	            if(r != null && r.returnNode != null) {
            	            	r.returnNode.setKind("unique_key");
            	            	constraintReturnNode.getChildren().add(r.returnNode);
            	            } 
            	        }
            	    }
            	    // Create a CST Node
            		if(list_foreign_keyGen != null) {
            	        for(Iterator it = list_foreign_keyGen.iterator(); it.hasNext(); )  { 
            	            DDLParser.foreign_key_return r = (DDLParser.foreign_key_return) it.next(); 
            	            if(r != null && r.returnNode != null) {
            	            	r.returnNode.setKind("foreign_key");
            	            	constraintReturnNode.getChildren().add(r.returnNode);
            	            } 
            	        }
            	    }
            		// Returns the Node with CST Leaves/Nodes
            		retval.returnNode = constraintReturnNode;
            	

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
    // $ANTLR end constraint

    public static class primary_key_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start primary_key
    // /home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/DDL.ge3:842:1: primary_key returns [Node returnNode] : TK_0= 'PRIMARY KEY' TK_1= '(' colnameGen+= colname (TK_2= ',' colnameGen_1+= colname )* TK_3= ')' ;
    public final primary_key_return primary_key() throws RecognitionException {
        primary_key_return retval = new primary_key_return();
        retval.start = input.LT(1);

        Token TK_0=null;
        Token TK_1=null;
        Token TK_2=null;
        Token TK_3=null;
        List list_colnameGen=null;
        List list_colnameGen_1=null;
        RuleReturnScope colnameGen = null;
        RuleReturnScope colnameGen_1 = null;
        try {
            // /home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/DDL.ge3:843:1: (TK_0= 'PRIMARY KEY' TK_1= '(' colnameGen+= colname (TK_2= ',' colnameGen_1+= colname )* TK_3= ')' )
            // /home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/DDL.ge3:844:2: TK_0= 'PRIMARY KEY' TK_1= '(' colnameGen+= colname (TK_2= ',' colnameGen_1+= colname )* TK_3= ')'
            {
            TK_0=(Token)input.LT(1);
            match(input,39,FOLLOW_39_in_primary_key564); 
            TK_1=(Token)input.LT(1);
            match(input,11,FOLLOW_11_in_primary_key568); 
            pushFollow(FOLLOW_colname_in_primary_key572);
            colnameGen=colname();
            _fsp--;

            if (list_colnameGen==null) list_colnameGen=new ArrayList();
            list_colnameGen.add(colnameGen);

            // /home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/DDL.ge3:844:50: (TK_2= ',' colnameGen_1+= colname )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==12) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // /home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/DDL.ge3:844:51: TK_2= ',' colnameGen_1+= colname
            	    {
            	    TK_2=(Token)input.LT(1);
            	    match(input,12,FOLLOW_12_in_primary_key577); 
            	    pushFollow(FOLLOW_colname_in_primary_key581);
            	    colnameGen_1=colname();
            	    _fsp--;

            	    if (list_colnameGen_1==null) list_colnameGen_1=new ArrayList();
            	    list_colnameGen_1.add(colnameGen_1);


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            TK_3=(Token)input.LT(1);
            match(input,13,FOLLOW_13_in_primary_key587); 
            
            		// Create return CST Node
            		Node primary_keyReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
            		primary_keyReturnNode.setKind("primary_key");
            	    // Create a Token CST Leaf	
            	    if(TK_0 != null) {
            			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
            	 		TK_0Leaf.setKind("TOKEN");
            	 		TK_0Leaf.setValue(TK_0.getText());
            			TK_0Leaf.setPos(TK_0.getCharPositionInLine());
            			TK_0Leaf.setLine(TK_0.getLine());
            	 		primary_keyReturnNode.getChildren().add(TK_0Leaf);
            	 	}
            	    // Create a Token CST Leaf	
            	    if(TK_1 != null) {
            			Leaf TK_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
            	 		TK_1Leaf.setKind("TOKEN");
            	 		TK_1Leaf.setValue(TK_1.getText());
            			TK_1Leaf.setPos(TK_1.getCharPositionInLine());
            			TK_1Leaf.setLine(TK_1.getLine());
            	 		primary_keyReturnNode.getChildren().add(TK_1Leaf);
            	 	}
            	    // Create a CST Node
            		if(list_colnameGen != null) {
            	        for(Iterator it = list_colnameGen.iterator(); it.hasNext(); )  { 
            	            DDLParser.colname_return r = (DDLParser.colname_return) it.next(); 
            	            if(r != null && r.returnNode != null) {
            	            	r.returnNode.setKind("colname");
            	            	primary_keyReturnNode.getChildren().add(r.returnNode);
            	            } 
            	        }
            	    }
            	
            		// Create a special CST Node for terminal colnameGen_1 aggregation
            		if(list_colnameGen_1 != null) {
            	    for(int pos = 0; pos < list_colnameGen_1.size(); pos++ )  { 
            	    // Create a Token CST Leaf	
            	    if(TK_2 != null) {
            			Leaf TK_2Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
            	 		TK_2Leaf.setKind("TOKEN");
            	 		TK_2Leaf.setValue(TK_2.getText());
            			TK_2Leaf.setPos(TK_2.getCharPositionInLine());
            			TK_2Leaf.setLine(TK_2.getLine());
            	 		primary_keyReturnNode.getChildren().add(TK_2Leaf);
            	 	}
            		// No Terminal extractor
            	    if(list_colnameGen_1 != null) {		
            	    	DDLParser.colname_return r = (DDLParser.colname_return) list_colnameGen_1.get(pos); 
            	    	if(r != null && r.returnNode != null) {
            	        	r.returnNode.setKind("colname");
            	    		primary_keyReturnNode.getChildren().add(r.returnNode);
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
            	 		primary_keyReturnNode.getChildren().add(TK_3Leaf);
            	 	}
            		// Returns the Node with CST Leaves/Nodes
            		retval.returnNode = primary_keyReturnNode;
            	

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
    // $ANTLR end primary_key

    public static class unique_key_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start unique_key
    // /home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/DDL.ge3:915:1: unique_key returns [Node returnNode] : TK_0= 'UNIQUE' TK_1= '(' colnameGen+= colname (TK_2= ',' colnameGen_1+= colname )* TK_3= ')' ;
    public final unique_key_return unique_key() throws RecognitionException {
        unique_key_return retval = new unique_key_return();
        retval.start = input.LT(1);

        Token TK_0=null;
        Token TK_1=null;
        Token TK_2=null;
        Token TK_3=null;
        List list_colnameGen=null;
        List list_colnameGen_1=null;
        RuleReturnScope colnameGen = null;
        RuleReturnScope colnameGen_1 = null;
        try {
            // /home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/DDL.ge3:916:1: (TK_0= 'UNIQUE' TK_1= '(' colnameGen+= colname (TK_2= ',' colnameGen_1+= colname )* TK_3= ')' )
            // /home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/DDL.ge3:917:2: TK_0= 'UNIQUE' TK_1= '(' colnameGen+= colname (TK_2= ',' colnameGen_1+= colname )* TK_3= ')'
            {
            TK_0=(Token)input.LT(1);
            match(input,40,FOLLOW_40_in_unique_key608); 
            TK_1=(Token)input.LT(1);
            match(input,11,FOLLOW_11_in_unique_key612); 
            pushFollow(FOLLOW_colname_in_unique_key616);
            colnameGen=colname();
            _fsp--;

            if (list_colnameGen==null) list_colnameGen=new ArrayList();
            list_colnameGen.add(colnameGen);

            // /home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/DDL.ge3:917:45: (TK_2= ',' colnameGen_1+= colname )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==12) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // /home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/DDL.ge3:917:46: TK_2= ',' colnameGen_1+= colname
            	    {
            	    TK_2=(Token)input.LT(1);
            	    match(input,12,FOLLOW_12_in_unique_key621); 
            	    pushFollow(FOLLOW_colname_in_unique_key625);
            	    colnameGen_1=colname();
            	    _fsp--;

            	    if (list_colnameGen_1==null) list_colnameGen_1=new ArrayList();
            	    list_colnameGen_1.add(colnameGen_1);


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            TK_3=(Token)input.LT(1);
            match(input,13,FOLLOW_13_in_unique_key631); 
            
            		// Create return CST Node
            		Node unique_keyReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
            		unique_keyReturnNode.setKind("unique_key");
            	    // Create a Token CST Leaf	
            	    if(TK_0 != null) {
            			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
            	 		TK_0Leaf.setKind("TOKEN");
            	 		TK_0Leaf.setValue(TK_0.getText());
            			TK_0Leaf.setPos(TK_0.getCharPositionInLine());
            			TK_0Leaf.setLine(TK_0.getLine());
            	 		unique_keyReturnNode.getChildren().add(TK_0Leaf);
            	 	}
            	    // Create a Token CST Leaf	
            	    if(TK_1 != null) {
            			Leaf TK_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
            	 		TK_1Leaf.setKind("TOKEN");
            	 		TK_1Leaf.setValue(TK_1.getText());
            			TK_1Leaf.setPos(TK_1.getCharPositionInLine());
            			TK_1Leaf.setLine(TK_1.getLine());
            	 		unique_keyReturnNode.getChildren().add(TK_1Leaf);
            	 	}
            	    // Create a CST Node
            		if(list_colnameGen != null) {
            	        for(Iterator it = list_colnameGen.iterator(); it.hasNext(); )  { 
            	            DDLParser.colname_return r = (DDLParser.colname_return) it.next(); 
            	            if(r != null && r.returnNode != null) {
            	            	r.returnNode.setKind("colname");
            	            	unique_keyReturnNode.getChildren().add(r.returnNode);
            	            } 
            	        }
            	    }
            	
            		// Create a special CST Node for terminal colnameGen_1 aggregation
            		if(list_colnameGen_1 != null) {
            	    for(int pos = 0; pos < list_colnameGen_1.size(); pos++ )  { 
            	    // Create a Token CST Leaf	
            	    if(TK_2 != null) {
            			Leaf TK_2Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
            	 		TK_2Leaf.setKind("TOKEN");
            	 		TK_2Leaf.setValue(TK_2.getText());
            			TK_2Leaf.setPos(TK_2.getCharPositionInLine());
            			TK_2Leaf.setLine(TK_2.getLine());
            	 		unique_keyReturnNode.getChildren().add(TK_2Leaf);
            	 	}
            		// No Terminal extractor
            	    if(list_colnameGen_1 != null) {		
            	    	DDLParser.colname_return r = (DDLParser.colname_return) list_colnameGen_1.get(pos); 
            	    	if(r != null && r.returnNode != null) {
            	        	r.returnNode.setKind("colname");
            	    		unique_keyReturnNode.getChildren().add(r.returnNode);
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
            	 		unique_keyReturnNode.getChildren().add(TK_3Leaf);
            	 	}
            		// Returns the Node with CST Leaves/Nodes
            		retval.returnNode = unique_keyReturnNode;
            	

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
    // $ANTLR end unique_key

    public static class foreign_key_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start foreign_key
    // /home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/DDL.ge3:988:1: foreign_key returns [Node returnNode] : TK_0= 'FOREIGN KEY' TK_1= '(' colnameGen+= colname TK_2= ')' TK_3= 'REFERENCES' tabnameGen+= tabname TK_4= '(' colnameGen_1+= colname TK_5= ')' ;
    public final foreign_key_return foreign_key() throws RecognitionException {
        foreign_key_return retval = new foreign_key_return();
        retval.start = input.LT(1);

        Token TK_0=null;
        Token TK_1=null;
        Token TK_2=null;
        Token TK_3=null;
        Token TK_4=null;
        Token TK_5=null;
        List list_colnameGen=null;
        List list_tabnameGen=null;
        List list_colnameGen_1=null;
        RuleReturnScope colnameGen = null;
        RuleReturnScope tabnameGen = null;
        RuleReturnScope colnameGen_1 = null;
        try {
            // /home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/DDL.ge3:989:1: (TK_0= 'FOREIGN KEY' TK_1= '(' colnameGen+= colname TK_2= ')' TK_3= 'REFERENCES' tabnameGen+= tabname TK_4= '(' colnameGen_1+= colname TK_5= ')' )
            // /home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/DDL.ge3:990:2: TK_0= 'FOREIGN KEY' TK_1= '(' colnameGen+= colname TK_2= ')' TK_3= 'REFERENCES' tabnameGen+= tabname TK_4= '(' colnameGen_1+= colname TK_5= ')'
            {
            TK_0=(Token)input.LT(1);
            match(input,41,FOLLOW_41_in_foreign_key652); 
            TK_1=(Token)input.LT(1);
            match(input,11,FOLLOW_11_in_foreign_key656); 
            pushFollow(FOLLOW_colname_in_foreign_key660);
            colnameGen=colname();
            _fsp--;

            if (list_colnameGen==null) list_colnameGen=new ArrayList();
            list_colnameGen.add(colnameGen);

            TK_2=(Token)input.LT(1);
            match(input,13,FOLLOW_13_in_foreign_key664); 
            TK_3=(Token)input.LT(1);
            match(input,42,FOLLOW_42_in_foreign_key669); 
            pushFollow(FOLLOW_tabname_in_foreign_key673);
            tabnameGen=tabname();
            _fsp--;

            if (list_tabnameGen==null) list_tabnameGen=new ArrayList();
            list_tabnameGen.add(tabnameGen);

            TK_4=(Token)input.LT(1);
            match(input,11,FOLLOW_11_in_foreign_key677); 
            pushFollow(FOLLOW_colname_in_foreign_key681);
            colnameGen_1=colname();
            _fsp--;

            if (list_colnameGen_1==null) list_colnameGen_1=new ArrayList();
            list_colnameGen_1.add(colnameGen_1);

            TK_5=(Token)input.LT(1);
            match(input,13,FOLLOW_13_in_foreign_key685); 
            
            		// Create return CST Node
            		Node foreign_keyReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
            		foreign_keyReturnNode.setKind("foreign_key");
            	    // Create a Token CST Leaf	
            	    if(TK_0 != null) {
            			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
            	 		TK_0Leaf.setKind("TOKEN");
            	 		TK_0Leaf.setValue(TK_0.getText());
            			TK_0Leaf.setPos(TK_0.getCharPositionInLine());
            			TK_0Leaf.setLine(TK_0.getLine());
            	 		foreign_keyReturnNode.getChildren().add(TK_0Leaf);
            	 	}
            	    // Create a Token CST Leaf	
            	    if(TK_1 != null) {
            			Leaf TK_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
            	 		TK_1Leaf.setKind("TOKEN");
            	 		TK_1Leaf.setValue(TK_1.getText());
            			TK_1Leaf.setPos(TK_1.getCharPositionInLine());
            			TK_1Leaf.setLine(TK_1.getLine());
            	 		foreign_keyReturnNode.getChildren().add(TK_1Leaf);
            	 	}
            	    // Create a CST Node
            		if(list_colnameGen != null) {
            	        for(Iterator it = list_colnameGen.iterator(); it.hasNext(); )  { 
            	            DDLParser.colname_return r = (DDLParser.colname_return) it.next(); 
            	            if(r != null && r.returnNode != null) {
            	            	r.returnNode.setKind("colname");
            	            	foreign_keyReturnNode.getChildren().add(r.returnNode);
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
            	 		foreign_keyReturnNode.getChildren().add(TK_2Leaf);
            	 	}
            	    // Create a Token CST Leaf	
            	    if(TK_3 != null) {
            			Leaf TK_3Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
            	 		TK_3Leaf.setKind("TOKEN");
            	 		TK_3Leaf.setValue(TK_3.getText());
            			TK_3Leaf.setPos(TK_3.getCharPositionInLine());
            			TK_3Leaf.setLine(TK_3.getLine());
            	 		foreign_keyReturnNode.getChildren().add(TK_3Leaf);
            	 	}
            	    // Create a CST Node
            		if(list_tabnameGen != null) {
            	        for(Iterator it = list_tabnameGen.iterator(); it.hasNext(); )  { 
            	            DDLParser.tabname_return r = (DDLParser.tabname_return) it.next(); 
            	            if(r != null && r.returnNode != null) {
            	            	r.returnNode.setKind("tabname");
            	            	foreign_keyReturnNode.getChildren().add(r.returnNode);
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
            	 		foreign_keyReturnNode.getChildren().add(TK_4Leaf);
            	 	}
            	    // Create a CST Node
            		if(list_colnameGen_1 != null) {
            	        for(Iterator it = list_colnameGen_1.iterator(); it.hasNext(); )  { 
            	            DDLParser.colname_return r = (DDLParser.colname_return) it.next(); 
            	            if(r != null && r.returnNode != null) {
            	            	r.returnNode.setKind("colname");
            	            	foreign_keyReturnNode.getChildren().add(r.returnNode);
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
            	 		foreign_keyReturnNode.getChildren().add(TK_5Leaf);
            	 	}
            		// Returns the Node with CST Leaves/Nodes
            		retval.returnNode = foreign_keyReturnNode;
            	

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
    // $ANTLR end foreign_key

    public static class colname_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start colname
    // /home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/DDL.ge3:1085:1: colname returns [Node returnNode] : IDGen= ID ;
    public final colname_return colname() throws RecognitionException {
        colname_return retval = new colname_return();
        retval.start = input.LT(1);

        Token IDGen=null;

        try {
            // /home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/DDL.ge3:1086:1: (IDGen= ID )
            // /home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/DDL.ge3:1087:2: IDGen= ID
            {
            IDGen=(Token)input.LT(1);
            match(input,ID,FOLLOW_ID_in_colname706); 
            
            		// Create return CST Node
            		Node colnameReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
            		colnameReturnNode.setKind("colname");
            	    // Create a CST Leaf
            		if(IDGen != null) {
            			Leaf IDGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf();
            			IDGenLeaf.setKind("ID");
            			IDGenLeaf.setValue(IDGen.getText());
            			IDGenLeaf.setPos(IDGen.getCharPositionInLine());
            			IDGenLeaf.setLine(IDGen.getLine());
            			colnameReturnNode.getChildren().add(IDGenLeaf);
            		}
            		// Returns the Node with CST Leaves/Nodes
            		retval.returnNode = colnameReturnNode;
            	

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
    // $ANTLR end colname

    public static class tabname_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start tabname
    // /home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/DDL.ge3:1106:1: tabname returns [Node returnNode] : (IDGen= ID TK_0= '.' )? basename= ID ;
    public final tabname_return tabname() throws RecognitionException {
        tabname_return retval = new tabname_return();
        retval.start = input.LT(1);

        Token IDGen=null;
        Token TK_0=null;
        Token basename=null;

        try {
            // /home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/DDL.ge3:1107:1: ( (IDGen= ID TK_0= '.' )? basename= ID )
            // /home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/DDL.ge3:1108:2: (IDGen= ID TK_0= '.' )? basename= ID
            {
            // /home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/DDL.ge3:1108:2: (IDGen= ID TK_0= '.' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==ID) ) {
                int LA13_1 = input.LA(2);

                if ( (LA13_1==22) ) {
                    alt13=1;
                }
            }
            switch (alt13) {
                case 1 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/DDL.ge3:1108:3: IDGen= ID TK_0= '.'
                    {
                    IDGen=(Token)input.LT(1);
                    match(input,ID,FOLLOW_ID_in_tabname728); 
                    TK_0=(Token)input.LT(1);
                    match(input,22,FOLLOW_22_in_tabname732); 

                    }
                    break;

            }

            basename=(Token)input.LT(1);
            match(input,ID,FOLLOW_ID_in_tabname738); 
            
            		// Create return CST Node
            		Node tabnameReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
            		tabnameReturnNode.setKind("tabname");
            	    // Create a CST Leaf
            		if(IDGen != null) {
            			Leaf IDGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf();
            			IDGenLeaf.setKind("ID");
            			IDGenLeaf.setValue(IDGen.getText());
            			IDGenLeaf.setPos(IDGen.getCharPositionInLine());
            			IDGenLeaf.setLine(IDGen.getLine());
            			tabnameReturnNode.getChildren().add(IDGenLeaf);
            		}
            	    // Create a Token CST Leaf	
            	    if(TK_0 != null) {
            			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
            	 		TK_0Leaf.setKind("TOKEN");
            	 		TK_0Leaf.setValue(TK_0.getText());
            			TK_0Leaf.setPos(TK_0.getCharPositionInLine());
            			TK_0Leaf.setLine(TK_0.getLine());
            	 		tabnameReturnNode.getChildren().add(TK_0Leaf);
            	 	}
            	    // Create a CST Leaf
            		if(basename != null) {
            			Leaf basenameLeaf = CSTFactoryImpl.eINSTANCE.createLeaf();
            			basenameLeaf.setKind("basename");
            			basenameLeaf.setValue(basename.getText());
            			basenameLeaf.setPos(basename.getCharPositionInLine());
            			basenameLeaf.setLine(basename.getLine());
            			tabnameReturnNode.getChildren().add(basenameLeaf);
            		}
            		// Returns the Node with CST Leaves/Nodes
            		retval.returnNode = tabnameReturnNode;
            	

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
    // $ANTLR end tabname


 

    public static final BitSet FOLLOW_create_table_in_data_definition43 = new BitSet(new long[]{0x0000000001088402L});
    public static final BitSet FOLLOW_alter_table_in_data_definition49 = new BitSet(new long[]{0x0000000001088402L});
    public static final BitSet FOLLOW_create_sequence_in_data_definition55 = new BitSet(new long[]{0x0000000001088402L});
    public static final BitSet FOLLOW_comment_in_data_definition61 = new BitSet(new long[]{0x0000000001088402L});
    public static final BitSet FOLLOW_10_in_create_table84 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_create_table88 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_create_table93 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_column_in_create_table99 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_12_in_create_table104 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_column_in_create_table108 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_12_in_create_table117 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_constraint_in_create_table121 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_13_in_create_table128 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_create_table132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_column153 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_TYPE_in_column157 = new BitSet(new long[]{0x0000000000000882L});
    public static final BitSet FOLLOW_11_in_column162 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_NUMBER_in_column166 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_column170 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_ISNULL_in_column176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_alter_table198 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_tabname_in_alter_table202 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_16_in_alter_table210 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_constraint_in_alter_table214 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_17_in_alter_table222 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_alter_table226 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_alter_table231 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_alter_table237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_comment258 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_20_in_comment264 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_tabname_in_comment268 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_21_in_comment276 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_comment280 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_comment284 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_colname_in_comment288 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_comment294 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_STRING_in_comment298 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_comment302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_create_sequence323 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_create_sequence327 = new BitSet(new long[]{0x0000007FEA004000L});
    public static final BitSet FOLLOW_sequence_options_in_create_sequence331 = new BitSet(new long[]{0x0000007FEA004000L});
    public static final BitSet FOLLOW_14_in_create_sequence336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_sequence_options357 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_sequence_options361 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_NUMBER_in_sequence_options365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_sequence_options375 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_sequence_options379 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_NUMBER_in_sequence_options383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_sequence_options394 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_NUMBER_in_sequence_options398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_sequence_options408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_sequence_options419 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_NUMBER_in_sequence_options423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_sequence_options433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_sequence_options444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_sequence_options454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_sequence_options465 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_NUMBER_in_sequence_options469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_sequence_options479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_sequence_options490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_sequence_options500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_constraint521 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_constraint525 = new BitSet(new long[]{0x0000038000000000L});
    public static final BitSet FOLLOW_primary_key_in_constraint530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unique_key_in_constraint536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_foreign_key_in_constraint542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_primary_key564 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_primary_key568 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_colname_in_primary_key572 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_12_in_primary_key577 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_colname_in_primary_key581 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_13_in_primary_key587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_unique_key608 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_unique_key612 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_colname_in_unique_key616 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_12_in_unique_key621 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_colname_in_unique_key625 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_13_in_unique_key631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_foreign_key652 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_foreign_key656 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_colname_in_foreign_key660 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_foreign_key664 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_foreign_key669 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_tabname_in_foreign_key673 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_foreign_key677 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_colname_in_foreign_key681 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_foreign_key685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_colname706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_tabname728 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_tabname732 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_tabname738 = new BitSet(new long[]{0x0000000000000002L});

}