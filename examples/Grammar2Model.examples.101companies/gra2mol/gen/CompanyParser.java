// $ANTLR 3.2 Sep 23, 2009 12:02:23 gra2mol/gen/Company.g 2012-03-07 11:09:38

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
/**
  * 101 Companies grammar modified to consider mentors (Gra2MoL example)
  * Contributor: Javier Canovas (javier.canovas@inria.fr)
  */
public class CompanyParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "STRING", "FLOAT", "WS", "'company'", "'{'", "'}'", "'department'", "'manager'", "'employee'", "'address'", "'salary'", "'mentor'"
    };
    public static final int WS=6;
    public static final int T__15=15;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int T__10=10;
    public static final int FLOAT=5;
    public static final int EOF=-1;
    public static final int T__9=9;
    public static final int T__8=8;
    public static final int T__7=7;
    public static final int STRING=4;

    // delegates
    // delegators


        public CompanyParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public CompanyParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected StringTemplateGroup templateLib =
      new StringTemplateGroup("CompanyParserTemplates", AngleBracketTemplateLexer.class);

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

    public String[] getTokenNames() { return CompanyParser.tokenNames; }
    public String getGrammarFileName() { return "gra2mol/gen/Company.g"; }


    public static class company_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "company"
    // gra2mol/gen/Company.g:23:1: company returns [Node returnNode] : TK_0= 'company' STRINGGen= STRING TK_1= '{' (departmentGen+= department )* TK_2= '}' EOFGen= EOF ;
    public final CompanyParser.company_return company() throws RecognitionException {
        CompanyParser.company_return retval = new CompanyParser.company_return();
        retval.start = input.LT(1);

        Token TK_0=null;
        Token STRINGGen=null;
        Token TK_1=null;
        Token TK_2=null;
        Token EOFGen=null;
        List list_departmentGen=null;
        RuleReturnScope departmentGen = null;
        try {
            // gra2mol/gen/Company.g:24:1: (TK_0= 'company' STRINGGen= STRING TK_1= '{' (departmentGen+= department )* TK_2= '}' EOFGen= EOF )
            // gra2mol/gen/Company.g:25:3: TK_0= 'company' STRINGGen= STRING TK_1= '{' (departmentGen+= department )* TK_2= '}' EOFGen= EOF
            {
            TK_0=(Token)match(input,7,FOLLOW_7_in_company52); 
            STRINGGen=(Token)match(input,STRING,FOLLOW_STRING_in_company56); 
            TK_1=(Token)match(input,8,FOLLOW_8_in_company60); 
            // gra2mol/gen/Company.g:25:57: (departmentGen+= department )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==10) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // gra2mol/gen/Company.g:25:57: departmentGen+= department
            	    {
            	    pushFollow(FOLLOW_department_in_company64);
            	    departmentGen=department();

            	    state._fsp--;

            	    if (list_departmentGen==null) list_departmentGen=new ArrayList();
            	    list_departmentGen.add(departmentGen);


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            TK_2=(Token)match(input,9,FOLLOW_9_in_company69); 
            EOFGen=(Token)match(input,EOF,FOLLOW_EOF_in_company73); 

            		// Create return CST Node
            		Node companyReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
            		companyReturnNode.setKind("company");
            	    // Create a Token CST Leaf	
            	    if(TK_0 != null) {
            			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
            	 		TK_0Leaf.setKind("TOKEN");
            	 		TK_0Leaf.setValue((TK_0!=null?TK_0.getText():null));
            			TK_0Leaf.setPos(TK_0.getCharPositionInLine());
            			TK_0Leaf.setLine(TK_0.getLine());
            	 		companyReturnNode.getChildren().add(TK_0Leaf);
            	 	}
            	    // Create a CST Leaf
            		if(STRINGGen != null) {
            			Leaf STRINGGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf();
            			STRINGGenLeaf.setKind("STRING");
            			STRINGGenLeaf.setValue((STRINGGen!=null?STRINGGen.getText():null));
            			STRINGGenLeaf.setPos(STRINGGen.getCharPositionInLine());
            			STRINGGenLeaf.setLine(STRINGGen.getLine());
            			companyReturnNode.getChildren().add(STRINGGenLeaf);
            		}
            	    // Create a Token CST Leaf	
            	    if(TK_1 != null) {
            			Leaf TK_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
            	 		TK_1Leaf.setKind("TOKEN");
            	 		TK_1Leaf.setValue((TK_1!=null?TK_1.getText():null));
            			TK_1Leaf.setPos(TK_1.getCharPositionInLine());
            			TK_1Leaf.setLine(TK_1.getLine());
            	 		companyReturnNode.getChildren().add(TK_1Leaf);
            	 	}
            	    // Create a CST Node
            		if(list_departmentGen != null) {
            	        for(Iterator it = list_departmentGen.iterator(); it.hasNext(); )  { 
            	            CompanyParser.department_return r = (CompanyParser.department_return) it.next(); 
            	            if(r != null && r.returnNode != null) {
            	            	r.returnNode.setKind("department");
            	            	companyReturnNode.getChildren().add(r.returnNode);
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
            	 		companyReturnNode.getChildren().add(TK_2Leaf);
            	 	}
            	    // Create a CST Leaf
            		if(EOFGen != null) {
            			Leaf EOFGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf();
            			EOFGenLeaf.setKind("EOF");
            			EOFGenLeaf.setValue((EOFGen!=null?EOFGen.getText():null));
            			EOFGenLeaf.setPos(EOFGen.getCharPositionInLine());
            			EOFGenLeaf.setLine(EOFGen.getLine());
            			companyReturnNode.getChildren().add(EOFGenLeaf);
            		}
            		// Returns the Node with CST Leaves/Nodes
            		retval.returnNode = companyReturnNode;
            	

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
    // $ANTLR end "company"

    public static class department_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "department"
    // gra2mol/gen/Company.g:89:1: department returns [Node returnNode] : TK_0= 'department' STRINGGen= STRING TK_1= '{' department_managerGen+= department_manager department_employeesGen+= department_employees (departmentGen+= department )* TK_2= '}' ;
    public final CompanyParser.department_return department() throws RecognitionException {
        CompanyParser.department_return retval = new CompanyParser.department_return();
        retval.start = input.LT(1);

        Token TK_0=null;
        Token STRINGGen=null;
        Token TK_1=null;
        Token TK_2=null;
        List list_department_managerGen=null;
        List list_department_employeesGen=null;
        List list_departmentGen=null;
        RuleReturnScope department_managerGen = null;
        RuleReturnScope department_employeesGen = null;
        RuleReturnScope departmentGen = null;
        try {
            // gra2mol/gen/Company.g:90:1: (TK_0= 'department' STRINGGen= STRING TK_1= '{' department_managerGen+= department_manager department_employeesGen+= department_employees (departmentGen+= department )* TK_2= '}' )
            // gra2mol/gen/Company.g:91:3: TK_0= 'department' STRINGGen= STRING TK_1= '{' department_managerGen+= department_manager department_employeesGen+= department_employees (departmentGen+= department )* TK_2= '}'
            {
            TK_0=(Token)match(input,10,FOLLOW_10_in_department96); 
            STRINGGen=(Token)match(input,STRING,FOLLOW_STRING_in_department100); 
            TK_1=(Token)match(input,8,FOLLOW_8_in_department104); 
            pushFollow(FOLLOW_department_manager_in_department113);
            department_managerGen=department_manager();

            state._fsp--;

            if (list_department_managerGen==null) list_department_managerGen=new ArrayList();
            list_department_managerGen.add(department_managerGen);

            pushFollow(FOLLOW_department_employees_in_department121);
            department_employeesGen=department_employees();

            state._fsp--;

            if (list_department_employeesGen==null) list_department_employeesGen=new ArrayList();
            list_department_employeesGen.add(department_employeesGen);

            // gra2mol/gen/Company.g:94:18: (departmentGen+= department )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==10) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // gra2mol/gen/Company.g:94:18: departmentGen+= department
            	    {
            	    pushFollow(FOLLOW_department_in_department129);
            	    departmentGen=department();

            	    state._fsp--;

            	    if (list_departmentGen==null) list_departmentGen=new ArrayList();
            	    list_departmentGen.add(departmentGen);


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            TK_2=(Token)match(input,9,FOLLOW_9_in_department136); 

            		// Create return CST Node
            		Node departmentReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
            		departmentReturnNode.setKind("department");
            	    // Create a Token CST Leaf	
            	    if(TK_0 != null) {
            			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
            	 		TK_0Leaf.setKind("TOKEN");
            	 		TK_0Leaf.setValue((TK_0!=null?TK_0.getText():null));
            			TK_0Leaf.setPos(TK_0.getCharPositionInLine());
            			TK_0Leaf.setLine(TK_0.getLine());
            	 		departmentReturnNode.getChildren().add(TK_0Leaf);
            	 	}
            	    // Create a CST Leaf
            		if(STRINGGen != null) {
            			Leaf STRINGGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf();
            			STRINGGenLeaf.setKind("STRING");
            			STRINGGenLeaf.setValue((STRINGGen!=null?STRINGGen.getText():null));
            			STRINGGenLeaf.setPos(STRINGGen.getCharPositionInLine());
            			STRINGGenLeaf.setLine(STRINGGen.getLine());
            			departmentReturnNode.getChildren().add(STRINGGenLeaf);
            		}
            	    // Create a Token CST Leaf	
            	    if(TK_1 != null) {
            			Leaf TK_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
            	 		TK_1Leaf.setKind("TOKEN");
            	 		TK_1Leaf.setValue((TK_1!=null?TK_1.getText():null));
            			TK_1Leaf.setPos(TK_1.getCharPositionInLine());
            			TK_1Leaf.setLine(TK_1.getLine());
            	 		departmentReturnNode.getChildren().add(TK_1Leaf);
            	 	}
            	    // Create a CST Node
            		if(list_department_managerGen != null) {
            	        for(Iterator it = list_department_managerGen.iterator(); it.hasNext(); )  { 
            	            CompanyParser.department_manager_return r = (CompanyParser.department_manager_return) it.next(); 
            	            if(r != null && r.returnNode != null) {
            	            	r.returnNode.setKind("department_manager");
            	            	departmentReturnNode.getChildren().add(r.returnNode);
            	            } 
            	        }
            	    }
            	    // Create a CST Node
            		if(list_department_employeesGen != null) {
            	        for(Iterator it = list_department_employeesGen.iterator(); it.hasNext(); )  { 
            	            CompanyParser.department_employees_return r = (CompanyParser.department_employees_return) it.next(); 
            	            if(r != null && r.returnNode != null) {
            	            	r.returnNode.setKind("department_employees");
            	            	departmentReturnNode.getChildren().add(r.returnNode);
            	            } 
            	        }
            	    }
            	    // Create a CST Node
            		if(list_departmentGen != null) {
            	        for(Iterator it = list_departmentGen.iterator(); it.hasNext(); )  { 
            	            CompanyParser.department_return r = (CompanyParser.department_return) it.next(); 
            	            if(r != null && r.returnNode != null) {
            	            	r.returnNode.setKind("department");
            	            	departmentReturnNode.getChildren().add(r.returnNode);
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
            	 		departmentReturnNode.getChildren().add(TK_2Leaf);
            	 	}
            		// Returns the Node with CST Leaves/Nodes
            		retval.returnNode = departmentReturnNode;
            	

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
    // $ANTLR end "department"

    public static class department_manager_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "department_manager"
    // gra2mol/gen/Company.g:170:1: department_manager returns [Node returnNode] : TK_0= 'manager' employeeGen+= employee ;
    public final CompanyParser.department_manager_return department_manager() throws RecognitionException {
        CompanyParser.department_manager_return retval = new CompanyParser.department_manager_return();
        retval.start = input.LT(1);

        Token TK_0=null;
        List list_employeeGen=null;
        RuleReturnScope employeeGen = null;
        try {
            // gra2mol/gen/Company.g:171:1: (TK_0= 'manager' employeeGen+= employee )
            // gra2mol/gen/Company.g:172:3: TK_0= 'manager' employeeGen+= employee
            {
            TK_0=(Token)match(input,11,FOLLOW_11_in_department_manager157); 
            pushFollow(FOLLOW_employee_in_department_manager161);
            employeeGen=employee();

            state._fsp--;

            if (list_employeeGen==null) list_employeeGen=new ArrayList();
            list_employeeGen.add(employeeGen);


            		// Create return CST Node
            		Node department_managerReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
            		department_managerReturnNode.setKind("department_manager");
            	    // Create a Token CST Leaf	
            	    if(TK_0 != null) {
            			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
            	 		TK_0Leaf.setKind("TOKEN");
            	 		TK_0Leaf.setValue((TK_0!=null?TK_0.getText():null));
            			TK_0Leaf.setPos(TK_0.getCharPositionInLine());
            			TK_0Leaf.setLine(TK_0.getLine());
            	 		department_managerReturnNode.getChildren().add(TK_0Leaf);
            	 	}
            	    // Create a CST Node
            		if(list_employeeGen != null) {
            	        for(Iterator it = list_employeeGen.iterator(); it.hasNext(); )  { 
            	            CompanyParser.employee_return r = (CompanyParser.employee_return) it.next(); 
            	            if(r != null && r.returnNode != null) {
            	            	r.returnNode.setKind("employee");
            	            	department_managerReturnNode.getChildren().add(r.returnNode);
            	            } 
            	        }
            	    }
            		// Returns the Node with CST Leaves/Nodes
            		retval.returnNode = department_managerReturnNode;
            	

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
    // $ANTLR end "department_manager"

    public static class department_employees_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "department_employees"
    // gra2mol/gen/Company.g:200:1: department_employees returns [Node returnNode] : (TK_0= 'employee' employeeGen+= employee )* ;
    public final CompanyParser.department_employees_return department_employees() throws RecognitionException {
        CompanyParser.department_employees_return retval = new CompanyParser.department_employees_return();
        retval.start = input.LT(1);

        Token TK_0=null;
        List list_employeeGen=null;
        RuleReturnScope employeeGen = null;
        try {
            // gra2mol/gen/Company.g:201:1: ( (TK_0= 'employee' employeeGen+= employee )* )
            // gra2mol/gen/Company.g:202:3: (TK_0= 'employee' employeeGen+= employee )*
            {
            // gra2mol/gen/Company.g:202:3: (TK_0= 'employee' employeeGen+= employee )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==12) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // gra2mol/gen/Company.g:202:4: TK_0= 'employee' employeeGen+= employee
            	    {
            	    TK_0=(Token)match(input,12,FOLLOW_12_in_department_employees183); 
            	    pushFollow(FOLLOW_employee_in_department_employees187);
            	    employeeGen=employee();

            	    state._fsp--;

            	    if (list_employeeGen==null) list_employeeGen=new ArrayList();
            	    list_employeeGen.add(employeeGen);


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            		// Create return CST Node
            		Node department_employeesReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
            		department_employeesReturnNode.setKind("department_employees");

            		// Create a special CST Node for terminal employeeGen aggregation
            		if(list_employeeGen != null) {
            	    for(int pos = 0; pos < list_employeeGen.size(); pos++ )  { 
            	    // Create a Token CST Leaf	
            	    if(TK_0 != null) {
            			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
            	 		TK_0Leaf.setKind("TOKEN");
            	 		TK_0Leaf.setValue((TK_0!=null?TK_0.getText():null));
            			TK_0Leaf.setPos(TK_0.getCharPositionInLine());
            			TK_0Leaf.setLine(TK_0.getLine());
            	 		department_employeesReturnNode.getChildren().add(TK_0Leaf);
            	 	}
            		// No Terminal extractor
            	    if(list_employeeGen != null) {		
            	    	CompanyParser.employee_return r = (CompanyParser.employee_return) list_employeeGen.get(pos); 
            	    	if(r != null && r.returnNode != null) {
            	        	r.returnNode.setKind("employee");
            	    		department_employeesReturnNode.getChildren().add(r.returnNode);
            	    	} 
            		}
            		}
            		}

            		// Returns the Node with CST Leaves/Nodes
            		retval.returnNode = department_employeesReturnNode;
            	

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
    // $ANTLR end "department_employees"

    public static class employee_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "employee"
    // gra2mol/gen/Company.g:235:1: employee returns [Node returnNode] : STRINGGen= STRING TK_0= '{' TK_1= 'address' STRINGGen_1= STRING TK_2= 'salary' FLOATGen= FLOAT (TK_3= 'mentor' STRINGGen_2= STRING )? TK_4= '}' ;
    public final CompanyParser.employee_return employee() throws RecognitionException {
        CompanyParser.employee_return retval = new CompanyParser.employee_return();
        retval.start = input.LT(1);

        Token STRINGGen=null;
        Token TK_0=null;
        Token TK_1=null;
        Token STRINGGen_1=null;
        Token TK_2=null;
        Token FLOATGen=null;
        Token TK_3=null;
        Token STRINGGen_2=null;
        Token TK_4=null;

        try {
            // gra2mol/gen/Company.g:236:1: (STRINGGen= STRING TK_0= '{' TK_1= 'address' STRINGGen_1= STRING TK_2= 'salary' FLOATGen= FLOAT (TK_3= 'mentor' STRINGGen_2= STRING )? TK_4= '}' )
            // gra2mol/gen/Company.g:237:3: STRINGGen= STRING TK_0= '{' TK_1= 'address' STRINGGen_1= STRING TK_2= 'salary' FLOATGen= FLOAT (TK_3= 'mentor' STRINGGen_2= STRING )? TK_4= '}'
            {
            STRINGGen=(Token)match(input,STRING,FOLLOW_STRING_in_employee211); 
            TK_0=(Token)match(input,8,FOLLOW_8_in_employee215); 
            TK_1=(Token)match(input,13,FOLLOW_13_in_employee223); 
            STRINGGen_1=(Token)match(input,STRING,FOLLOW_STRING_in_employee227); 
            TK_2=(Token)match(input,14,FOLLOW_14_in_employee235); 
            FLOATGen=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_employee239); 
            // gra2mol/gen/Company.g:240:5: (TK_3= 'mentor' STRINGGen_2= STRING )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // gra2mol/gen/Company.g:240:6: TK_3= 'mentor' STRINGGen_2= STRING
                    {
                    TK_3=(Token)match(input,15,FOLLOW_15_in_employee248); 
                    STRINGGen_2=(Token)match(input,STRING,FOLLOW_STRING_in_employee252); 

                    }
                    break;

            }

            TK_4=(Token)match(input,9,FOLLOW_9_in_employee260); 

            		// Create return CST Node
            		Node employeeReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
            		employeeReturnNode.setKind("employee");
            	    // Create a CST Leaf
            		if(STRINGGen != null) {
            			Leaf STRINGGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf();
            			STRINGGenLeaf.setKind("STRING");
            			STRINGGenLeaf.setValue((STRINGGen!=null?STRINGGen.getText():null));
            			STRINGGenLeaf.setPos(STRINGGen.getCharPositionInLine());
            			STRINGGenLeaf.setLine(STRINGGen.getLine());
            			employeeReturnNode.getChildren().add(STRINGGenLeaf);
            		}
            	    // Create a Token CST Leaf	
            	    if(TK_0 != null) {
            			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
            	 		TK_0Leaf.setKind("TOKEN");
            	 		TK_0Leaf.setValue((TK_0!=null?TK_0.getText():null));
            			TK_0Leaf.setPos(TK_0.getCharPositionInLine());
            			TK_0Leaf.setLine(TK_0.getLine());
            	 		employeeReturnNode.getChildren().add(TK_0Leaf);
            	 	}
            	    // Create a Token CST Leaf	
            	    if(TK_1 != null) {
            			Leaf TK_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
            	 		TK_1Leaf.setKind("TOKEN");
            	 		TK_1Leaf.setValue((TK_1!=null?TK_1.getText():null));
            			TK_1Leaf.setPos(TK_1.getCharPositionInLine());
            			TK_1Leaf.setLine(TK_1.getLine());
            	 		employeeReturnNode.getChildren().add(TK_1Leaf);
            	 	}
            	    // Create a CST Leaf
            		if(STRINGGen_1 != null) {
            			Leaf STRINGGen_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
            			STRINGGen_1Leaf.setKind("STRING");
            			STRINGGen_1Leaf.setValue((STRINGGen_1!=null?STRINGGen_1.getText():null));
            			STRINGGen_1Leaf.setPos(STRINGGen_1.getCharPositionInLine());
            			STRINGGen_1Leaf.setLine(STRINGGen_1.getLine());
            			employeeReturnNode.getChildren().add(STRINGGen_1Leaf);
            		}
            	    // Create a Token CST Leaf	
            	    if(TK_2 != null) {
            			Leaf TK_2Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
            	 		TK_2Leaf.setKind("TOKEN");
            	 		TK_2Leaf.setValue((TK_2!=null?TK_2.getText():null));
            			TK_2Leaf.setPos(TK_2.getCharPositionInLine());
            			TK_2Leaf.setLine(TK_2.getLine());
            	 		employeeReturnNode.getChildren().add(TK_2Leaf);
            	 	}
            	    // Create a CST Leaf
            		if(FLOATGen != null) {
            			Leaf FLOATGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf();
            			FLOATGenLeaf.setKind("FLOAT");
            			FLOATGenLeaf.setValue((FLOATGen!=null?FLOATGen.getText():null));
            			FLOATGenLeaf.setPos(FLOATGen.getCharPositionInLine());
            			FLOATGenLeaf.setLine(FLOATGen.getLine());
            			employeeReturnNode.getChildren().add(FLOATGenLeaf);
            		}
            	    // Create a Token CST Leaf	
            	    if(TK_3 != null) {
            			Leaf TK_3Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
            	 		TK_3Leaf.setKind("TOKEN");
            	 		TK_3Leaf.setValue((TK_3!=null?TK_3.getText():null));
            			TK_3Leaf.setPos(TK_3.getCharPositionInLine());
            			TK_3Leaf.setLine(TK_3.getLine());
            	 		employeeReturnNode.getChildren().add(TK_3Leaf);
            	 	}
            	    // Create a CST Leaf
            		if(STRINGGen_2 != null) {
            			Leaf STRINGGen_2Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
            			STRINGGen_2Leaf.setKind("STRING");
            			STRINGGen_2Leaf.setValue((STRINGGen_2!=null?STRINGGen_2.getText():null));
            			STRINGGen_2Leaf.setPos(STRINGGen_2.getCharPositionInLine());
            			STRINGGen_2Leaf.setLine(STRINGGen_2.getLine());
            			employeeReturnNode.getChildren().add(STRINGGen_2Leaf);
            		}
            	    // Create a Token CST Leaf	
            	    if(TK_4 != null) {
            			Leaf TK_4Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
            	 		TK_4Leaf.setKind("TOKEN");
            	 		TK_4Leaf.setValue((TK_4!=null?TK_4.getText():null));
            			TK_4Leaf.setPos(TK_4.getCharPositionInLine());
            			TK_4Leaf.setLine(TK_4.getLine());
            	 		employeeReturnNode.getChildren().add(TK_4Leaf);
            	 	}
            		// Returns the Node with CST Leaves/Nodes
            		retval.returnNode = employeeReturnNode;
            	

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
    // $ANTLR end "employee"

    // Delegated rules


 

    public static final BitSet FOLLOW_7_in_company52 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_STRING_in_company56 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_company60 = new BitSet(new long[]{0x0000000000000600L});
    public static final BitSet FOLLOW_department_in_company64 = new BitSet(new long[]{0x0000000000000600L});
    public static final BitSet FOLLOW_9_in_company69 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_company73 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_10_in_department96 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_STRING_in_department100 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_department104 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_department_manager_in_department113 = new BitSet(new long[]{0x0000000000001600L});
    public static final BitSet FOLLOW_department_employees_in_department121 = new BitSet(new long[]{0x0000000000000600L});
    public static final BitSet FOLLOW_department_in_department129 = new BitSet(new long[]{0x0000000000000600L});
    public static final BitSet FOLLOW_9_in_department136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_department_manager157 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_employee_in_department_manager161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_department_employees183 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_employee_in_department_employees187 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_STRING_in_employee211 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_employee215 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_employee223 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_STRING_in_employee227 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_employee235 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_FLOAT_in_employee239 = new BitSet(new long[]{0x0000000000008200L});
    public static final BitSet FOLLOW_15_in_employee248 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_STRING_in_employee252 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_employee260 = new BitSet(new long[]{0x0000000000000002L});

}