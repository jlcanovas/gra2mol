// $ANTLR 3.2 Sep 23, 2009 12:02:23 /Users/jlcanovas/Desktop/eclipse-3.5-64b/workspace/Grammar2Model.examples.Maude2Model/files/src/scripts/Island.g 2010-01-31 19:51:09

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.debug.*;
import java.io.IOException;
public class IslandParser extends DebugParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ID", "COLON", "STRING", "DQUOTE", "WS", "'eq'", "'.'", "'['", "']'", "'name'", "'('", "')'", "'='", "'packages'", "'subPackages'", "'metamodel'", "'superPackage'", "'classes'", "'@MPNs@'", "'MPNs'"
    };
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int DQUOTE=7;
    public static final int ID=4;
    public static final int EOF=-1;
    public static final int T__9=9;
    public static final int COLON=5;
    public static final int T__19=19;
    public static final int WS=8;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int T__10=10;
    public static final int STRING=6;

    // delegates
    // delegators

    public static final String[] ruleNames = new String[] {
        "invalidRule", "atDataTypeSort", "opMetamodel", "atAttributeSort", 
        "opatMPNsat", "opPackages", "eqPart", "atERRORatSort", "atEnumerationInstanceSort", 
        "opSuperPackage", "atEnumerationSort", "listOrdSort", "label", "atReferenceSort", 
        "mainRule", "oclVoidSort", "atPackageSort", "boolSort", "stringSort", 
        "atMetamodelSort", "atClassifierSort", "opName", "atClassSort", 
        "atBasicTypeSort", "opMPNs", "listSort", "opSubPackages", "opClasses", 
        "natSort", "intSort"
    };
     
        public int ruleLevel = 0;
        public int getRuleLevel() { return ruleLevel; }
        public void incRuleLevel() { ruleLevel++; }
        public void decRuleLevel() { ruleLevel--; }
        public IslandParser(TokenStream input) {
            this(input, DebugEventSocketProxy.DEFAULT_DEBUGGER_PORT, new RecognizerSharedState());
        }
        public IslandParser(TokenStream input, int port, RecognizerSharedState state) {
            super(input, state);
            DebugEventSocketProxy proxy =
                new DebugEventSocketProxy(this, port, null);
            setDebugListener(proxy);
            try {
                proxy.handshake();
            }
            catch (IOException ioe) {
                reportError(ioe);
            }
        }
    public IslandParser(TokenStream input, DebugEventListener dbg) {
        super(input, dbg, new RecognizerSharedState());

    }
    protected boolean evalPredicate(boolean result, String predicate) {
        dbg.semanticPredicate(result, predicate);
        return result;
    }


    public String[] getTokenNames() { return IslandParser.tokenNames; }
    public String getGrammarFileName() { return "/Users/jlcanovas/Desktop/eclipse-3.5-64b/workspace/Grammar2Model.examples.Maude2Model/files/src/scripts/Island.g"; }



    // $ANTLR start "mainRule"
    // /Users/jlcanovas/Desktop/eclipse-3.5-64b/workspace/Grammar2Model.examples.Maude2Model/files/src/scripts/Island.g:3:1: mainRule : 'eq' ( label )? eqPart '.' ;
    public final void mainRule() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "mainRule");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(3, 1);

        try {
            // /Users/jlcanovas/Desktop/eclipse-3.5-64b/workspace/Grammar2Model.examples.Maude2Model/files/src/scripts/Island.g:3:9: ( 'eq' ( label )? eqPart '.' )
            dbg.enterAlt(1);

            // /Users/jlcanovas/Desktop/eclipse-3.5-64b/workspace/Grammar2Model.examples.Maude2Model/files/src/scripts/Island.g:4:2: 'eq' ( label )? eqPart '.'
            {
            dbg.location(4,2);
            match(input,9,FOLLOW_9_in_mainRule10); 
            dbg.location(4,7);
            // /Users/jlcanovas/Desktop/eclipse-3.5-64b/workspace/Grammar2Model.examples.Maude2Model/files/src/scripts/Island.g:4:7: ( label )?
            int alt1=2;
            try { dbg.enterSubRule(1);
            try { dbg.enterDecision(1);

            int LA1_0 = input.LA(1);

            if ( (LA1_0==11) ) {
                alt1=1;
            }
            } finally {dbg.exitDecision(1);}

            switch (alt1) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/jlcanovas/Desktop/eclipse-3.5-64b/workspace/Grammar2Model.examples.Maude2Model/files/src/scripts/Island.g:4:8: label
                    {
                    dbg.location(4,8);
                    pushFollow(FOLLOW_label_in_mainRule13);
                    label();

                    state._fsp--;


                    }
                    break;

            }
            } finally {dbg.exitSubRule(1);}

            dbg.location(4,16);
            pushFollow(FOLLOW_eqPart_in_mainRule17);
            eqPart();

            state._fsp--;

            dbg.location(4,23);
            match(input,10,FOLLOW_10_in_mainRule19); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(5, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "mainRule");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "mainRule"


    // $ANTLR start "label"
    // /Users/jlcanovas/Desktop/eclipse-3.5-64b/workspace/Grammar2Model.examples.Maude2Model/files/src/scripts/Island.g:7:1: label : '[' ID ']' COLON ;
    public final void label() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "label");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(7, 1);

        try {
            // /Users/jlcanovas/Desktop/eclipse-3.5-64b/workspace/Grammar2Model.examples.Maude2Model/files/src/scripts/Island.g:7:6: ( '[' ID ']' COLON )
            dbg.enterAlt(1);

            // /Users/jlcanovas/Desktop/eclipse-3.5-64b/workspace/Grammar2Model.examples.Maude2Model/files/src/scripts/Island.g:8:2: '[' ID ']' COLON
            {
            dbg.location(8,2);
            match(input,11,FOLLOW_11_in_label29); 
            dbg.location(8,6);
            match(input,ID,FOLLOW_ID_in_label31); 
            dbg.location(8,9);
            match(input,12,FOLLOW_12_in_label33); 
            dbg.location(8,13);
            match(input,COLON,FOLLOW_COLON_in_label35); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(9, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "label");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "label"


    // $ANTLR start "eqPart"
    // /Users/jlcanovas/Desktop/eclipse-3.5-64b/workspace/Grammar2Model.examples.Maude2Model/files/src/scripts/Island.g:11:1: eqPart : ( opName | opPackages | opSubPackages | opMetamodel | opSuperPackage | opClasses | opatMPNsat | opMPNs );
    public final void eqPart() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "eqPart");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(11, 1);

        try {
            // /Users/jlcanovas/Desktop/eclipse-3.5-64b/workspace/Grammar2Model.examples.Maude2Model/files/src/scripts/Island.g:11:7: ( opName | opPackages | opSubPackages | opMetamodel | opSuperPackage | opClasses | opatMPNsat | opMPNs )
            int alt2=8;
            try { dbg.enterDecision(2);

            switch ( input.LA(1) ) {
            case 13:
                {
                alt2=1;
                }
                break;
            case 17:
                {
                alt2=2;
                }
                break;
            case 18:
                {
                alt2=3;
                }
                break;
            case 19:
                {
                alt2=4;
                }
                break;
            case 20:
                {
                alt2=5;
                }
                break;
            case 21:
                {
                alt2=6;
                }
                break;
            case 22:
                {
                alt2=7;
                }
                break;
            case 23:
                {
                alt2=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }

            } finally {dbg.exitDecision(2);}

            switch (alt2) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/jlcanovas/Desktop/eclipse-3.5-64b/workspace/Grammar2Model.examples.Maude2Model/files/src/scripts/Island.g:12:4: opName
                    {
                    dbg.location(12,4);
                    pushFollow(FOLLOW_opName_in_eqPart47);
                    opName();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/jlcanovas/Desktop/eclipse-3.5-64b/workspace/Grammar2Model.examples.Maude2Model/files/src/scripts/Island.g:13:4: opPackages
                    {
                    dbg.location(13,4);
                    pushFollow(FOLLOW_opPackages_in_eqPart52);
                    opPackages();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/jlcanovas/Desktop/eclipse-3.5-64b/workspace/Grammar2Model.examples.Maude2Model/files/src/scripts/Island.g:14:4: opSubPackages
                    {
                    dbg.location(14,4);
                    pushFollow(FOLLOW_opSubPackages_in_eqPart57);
                    opSubPackages();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /Users/jlcanovas/Desktop/eclipse-3.5-64b/workspace/Grammar2Model.examples.Maude2Model/files/src/scripts/Island.g:15:4: opMetamodel
                    {
                    dbg.location(15,4);
                    pushFollow(FOLLOW_opMetamodel_in_eqPart62);
                    opMetamodel();

                    state._fsp--;


                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // /Users/jlcanovas/Desktop/eclipse-3.5-64b/workspace/Grammar2Model.examples.Maude2Model/files/src/scripts/Island.g:16:4: opSuperPackage
                    {
                    dbg.location(16,4);
                    pushFollow(FOLLOW_opSuperPackage_in_eqPart67);
                    opSuperPackage();

                    state._fsp--;


                    }
                    break;
                case 6 :
                    dbg.enterAlt(6);

                    // /Users/jlcanovas/Desktop/eclipse-3.5-64b/workspace/Grammar2Model.examples.Maude2Model/files/src/scripts/Island.g:17:4: opClasses
                    {
                    dbg.location(17,4);
                    pushFollow(FOLLOW_opClasses_in_eqPart72);
                    opClasses();

                    state._fsp--;


                    }
                    break;
                case 7 :
                    dbg.enterAlt(7);

                    // /Users/jlcanovas/Desktop/eclipse-3.5-64b/workspace/Grammar2Model.examples.Maude2Model/files/src/scripts/Island.g:18:4: opatMPNsat
                    {
                    dbg.location(18,4);
                    pushFollow(FOLLOW_opatMPNsat_in_eqPart77);
                    opatMPNsat();

                    state._fsp--;


                    }
                    break;
                case 8 :
                    dbg.enterAlt(8);

                    // /Users/jlcanovas/Desktop/eclipse-3.5-64b/workspace/Grammar2Model.examples.Maude2Model/files/src/scripts/Island.g:19:4: opMPNs
                    {
                    dbg.location(19,4);
                    pushFollow(FOLLOW_opMPNs_in_eqPart82);
                    opMPNs();

                    state._fsp--;


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(20, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "eqPart");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "eqPart"


    // $ANTLR start "atPackageSort"
    // /Users/jlcanovas/Desktop/eclipse-3.5-64b/workspace/Grammar2Model.examples.Maude2Model/files/src/scripts/Island.g:23:1: atPackageSort : ID ;
    public final void atPackageSort() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "atPackageSort");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(23, 1);

        try {
            // /Users/jlcanovas/Desktop/eclipse-3.5-64b/workspace/Grammar2Model.examples.Maude2Model/files/src/scripts/Island.g:23:14: ( ID )
            dbg.enterAlt(1);

            // /Users/jlcanovas/Desktop/eclipse-3.5-64b/workspace/Grammar2Model.examples.Maude2Model/files/src/scripts/Island.g:24:2: ID
            {
            dbg.location(24,2);
            match(input,ID,FOLLOW_ID_in_atPackageSort93); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(25, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "atPackageSort");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "atPackageSort"


    // $ANTLR start "atBasicTypeSort"
    // /Users/jlcanovas/Desktop/eclipse-3.5-64b/workspace/Grammar2Model.examples.Maude2Model/files/src/scripts/Island.g:27:1: atBasicTypeSort : ID ;
    public final void atBasicTypeSort() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "atBasicTypeSort");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(27, 1);

        try {
            // /Users/jlcanovas/Desktop/eclipse-3.5-64b/workspace/Grammar2Model.examples.Maude2Model/files/src/scripts/Island.g:27:16: ( ID )
            dbg.enterAlt(1);

            // /Users/jlcanovas/Desktop/eclipse-3.5-64b/workspace/Grammar2Model.examples.Maude2Model/files/src/scripts/Island.g:28:2: ID
            {
            dbg.location(28,2);
            match(input,ID,FOLLOW_ID_in_atBasicTypeSort103); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(29, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "atBasicTypeSort");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "atBasicTypeSort"


    // $ANTLR start "atClassifierSort"
    // /Users/jlcanovas/Desktop/eclipse-3.5-64b/workspace/Grammar2Model.examples.Maude2Model/files/src/scripts/Island.g:31:1: atClassifierSort : ID ;
    public final void atClassifierSort() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "atClassifierSort");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(31, 1);

        try {
            // /Users/jlcanovas/Desktop/eclipse-3.5-64b/workspace/Grammar2Model.examples.Maude2Model/files/src/scripts/Island.g:31:17: ( ID )
            dbg.enterAlt(1);

            // /Users/jlcanovas/Desktop/eclipse-3.5-64b/workspace/Grammar2Model.examples.Maude2Model/files/src/scripts/Island.g:32:2: ID
            {
            dbg.location(32,2);
            match(input,ID,FOLLOW_ID_in_atClassifierSort113); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(33, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "atClassifierSort");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "atClassifierSort"


    // $ANTLR start "atDataTypeSort"
    // /Users/jlcanovas/Desktop/eclipse-3.5-64b/workspace/Grammar2Model.examples.Maude2Model/files/src/scripts/Island.g:35:1: atDataTypeSort : ID ;
    public final void atDataTypeSort() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "atDataTypeSort");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(35, 1);

        try {
            // /Users/jlcanovas/Desktop/eclipse-3.5-64b/workspace/Grammar2Model.examples.Maude2Model/files/src/scripts/Island.g:35:15: ( ID )
            dbg.enterAlt(1);

            // /Users/jlcanovas/Desktop/eclipse-3.5-64b/workspace/Grammar2Model.examples.Maude2Model/files/src/scripts/Island.g:36:2: ID
            {
            dbg.location(36,2);
            match(input,ID,FOLLOW_ID_in_atDataTypeSort123); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(37, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "atDataTypeSort");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "atDataTypeSort"


    // $ANTLR start "atClassSort"
    // /Users/jlcanovas/Desktop/eclipse-3.5-64b/workspace/Grammar2Model.examples.Maude2Model/files/src/scripts/Island.g:39:1: atClassSort : ID ;
    public final void atClassSort() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "atClassSort");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(39, 1);

        try {
            // /Users/jlcanovas/Desktop/eclipse-3.5-64b/workspace/Grammar2Model.examples.Maude2Model/files/src/scripts/Island.g:39:12: ( ID )
            dbg.enterAlt(1);

            // /Users/jlcanovas/Desktop/eclipse-3.5-64b/workspace/Grammar2Model.examples.Maude2Model/files/src/scripts/Island.g:40:2: ID
            {
            dbg.location(40,2);
            match(input,ID,FOLLOW_ID_in_atClassSort133); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(41, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "atClassSort");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "atClassSort"


    // $ANTLR start "atMetamodelSort"
    // /Users/jlcanovas/Desktop/eclipse-3.5-64b/workspace/Grammar2Model.examples.Maude2Model/files/src/scripts/Island.g:43:1: atMetamodelSort : ID ;
    public final void atMetamodelSort() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "atMetamodelSort");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(43, 1);

        try {
            // /Users/jlcanovas/Desktop/eclipse-3.5-64b/workspace/Grammar2Model.examples.Maude2Model/files/src/scripts/Island.g:43:16: ( ID )
            dbg.enterAlt(1);

            // /Users/jlcanovas/Desktop/eclipse-3.5-64b/workspace/Grammar2Model.examples.Maude2Model/files/src/scripts/Island.g:44:2: ID
            {
            dbg.location(44,2);
            match(input,ID,FOLLOW_ID_in_atMetamodelSort143); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(45, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "atMetamodelSort");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "atMetamodelSort"


    // $ANTLR start "atERRORatSort"
    // /Users/jlcanovas/Desktop/eclipse-3.5-64b/workspace/Grammar2Model.examples.Maude2Model/files/src/scripts/Island.g:47:1: atERRORatSort : ID ;
    public final void atERRORatSort() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "atERRORatSort");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(47, 1);

        try {
            // /Users/jlcanovas/Desktop/eclipse-3.5-64b/workspace/Grammar2Model.examples.Maude2Model/files/src/scripts/Island.g:47:14: ( ID )
            dbg.enterAlt(1);

            // /Users/jlcanovas/Desktop/eclipse-3.5-64b/workspace/Grammar2Model.examples.Maude2Model/files/src/scripts/Island.g:48:2: ID
            {
            dbg.location(48,2);
            match(input,ID,FOLLOW_ID_in_atERRORatSort153); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(49, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "atERRORatSort");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "atERRORatSort"


    // $ANTLR start "atAttributeSort"
    // /Users/jlcanovas/Desktop/eclipse-3.5-64b/workspace/Grammar2Model.examples.Maude2Model/files/src/scripts/Island.g:51:1: atAttributeSort : ID ;
    public final void atAttributeSort() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "atAttributeSort");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(51, 1);

        try {
            // /Users/jlcanovas/Desktop/eclipse-3.5-64b/workspace/Grammar2Model.examples.Maude2Model/files/src/scripts/Island.g:51:16: ( ID )
            dbg.enterAlt(1);

            // /Users/jlcanovas/Desktop/eclipse-3.5-64b/workspace/Grammar2Model.examples.Maude2Model/files/src/scripts/Island.g:52:2: ID
            {
            dbg.location(52,2);
            match(input,ID,FOLLOW_ID_in_atAttributeSort163); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(53, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "atAttributeSort");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "atAttributeSort"


    // $ANTLR start "atReferenceSort"
    // /Users/jlcanovas/Desktop/eclipse-3.5-64b/workspace/Grammar2Model.examples.Maude2Model/files/src/scripts/Island.g:55:1: atReferenceSort : ID ;
    public final void atReferenceSort() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "atReferenceSort");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(55, 1);

        try {
            // /Users/jlcanovas/Desktop/eclipse-3.5-64b/workspace/Grammar2Model.examples.Maude2Model/files/src/scripts/Island.g:55:16: ( ID )
            dbg.enterAlt(1);

            // /Users/jlcanovas/Desktop/eclipse-3.5-64b/workspace/Grammar2Model.examples.Maude2Model/files/src/scripts/Island.g:56:2: ID
            {
            dbg.location(56,2);
            match(input,ID,FOLLOW_ID_in_atReferenceSort173); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(57, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "atReferenceSort");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "atReferenceSort"


    // $ANTLR start "intSort"
    // /Users/jlcanovas/Desktop/eclipse-3.5-64b/workspace/Grammar2Model.examples.Maude2Model/files/src/scripts/Island.g:59:1: intSort : ID ;
    public final void intSort() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "intSort");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(59, 1);

        try {
            // /Users/jlcanovas/Desktop/eclipse-3.5-64b/workspace/Grammar2Model.examples.Maude2Model/files/src/scripts/Island.g:59:8: ( ID )
            dbg.enterAlt(1);

            // /Users/jlcanovas/Desktop/eclipse-3.5-64b/workspace/Grammar2Model.examples.Maude2Model/files/src/scripts/Island.g:60:2: ID
            {
            dbg.location(60,2);
            match(input,ID,FOLLOW_ID_in_intSort183); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(61, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "intSort");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "intSort"


    // $ANTLR start "natSort"
    // /Users/jlcanovas/Desktop/eclipse-3.5-64b/workspace/Grammar2Model.examples.Maude2Model/files/src/scripts/Island.g:63:1: natSort : ID ;
    public final void natSort() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "natSort");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(63, 1);

        try {
            // /Users/jlcanovas/Desktop/eclipse-3.5-64b/workspace/Grammar2Model.examples.Maude2Model/files/src/scripts/Island.g:63:8: ( ID )
            dbg.enterAlt(1);

            // /Users/jlcanovas/Desktop/eclipse-3.5-64b/workspace/Grammar2Model.examples.Maude2Model/files/src/scripts/Island.g:64:2: ID
            {
            dbg.location(64,2);
            match(input,ID,FOLLOW_ID_in_natSort193); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(65, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "natSort");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "natSort"


    // $ANTLR start "boolSort"
    // /Users/jlcanovas/Desktop/eclipse-3.5-64b/workspace/Grammar2Model.examples.Maude2Model/files/src/scripts/Island.g:67:1: boolSort : ID ;
    public final void boolSort() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "boolSort");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(67, 1);

        try {
            // /Users/jlcanovas/Desktop/eclipse-3.5-64b/workspace/Grammar2Model.examples.Maude2Model/files/src/scripts/Island.g:67:9: ( ID )
            dbg.enterAlt(1);

            // /Users/jlcanovas/Desktop/eclipse-3.5-64b/workspace/Grammar2Model.examples.Maude2Model/files/src/scripts/Island.g:68:2: ID
            {
            dbg.location(68,2);
            match(input,ID,FOLLOW_ID_in_boolSort203); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(69, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "boolSort");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "boolSort"


    // $ANTLR start "stringSort"
    // /Users/jlcanovas/Desktop/eclipse-3.5-64b/workspace/Grammar2Model.examples.Maude2Model/files/src/scripts/Island.g:71:1: stringSort : STRING ;
    public final void stringSort() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "stringSort");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(71, 1);

        try {
            // /Users/jlcanovas/Desktop/eclipse-3.5-64b/workspace/Grammar2Model.examples.Maude2Model/files/src/scripts/Island.g:71:11: ( STRING )
            dbg.enterAlt(1);

            // /Users/jlcanovas/Desktop/eclipse-3.5-64b/workspace/Grammar2Model.examples.Maude2Model/files/src/scripts/Island.g:72:2: STRING
            {
            dbg.location(72,2);
            match(input,STRING,FOLLOW_STRING_in_stringSort213); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(73, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "stringSort");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "stringSort"


    // $ANTLR start "listSort"
    // /Users/jlcanovas/Desktop/eclipse-3.5-64b/workspace/Grammar2Model.examples.Maude2Model/files/src/scripts/Island.g:75:1: listSort : ID ;
    public final void listSort() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "listSort");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(75, 1);

        try {
            // /Users/jlcanovas/Desktop/eclipse-3.5-64b/workspace/Grammar2Model.examples.Maude2Model/files/src/scripts/Island.g:75:9: ( ID )
            dbg.enterAlt(1);

            // /Users/jlcanovas/Desktop/eclipse-3.5-64b/workspace/Grammar2Model.examples.Maude2Model/files/src/scripts/Island.g:76:2: ID
            {
            dbg.location(76,2);
            match(input,ID,FOLLOW_ID_in_listSort223); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(77, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "listSort");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "listSort"


    // $ANTLR start "atEnumerationSort"
    // /Users/jlcanovas/Desktop/eclipse-3.5-64b/workspace/Grammar2Model.examples.Maude2Model/files/src/scripts/Island.g:79:1: atEnumerationSort : ID ;
    public final void atEnumerationSort() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "atEnumerationSort");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(79, 1);

        try {
            // /Users/jlcanovas/Desktop/eclipse-3.5-64b/workspace/Grammar2Model.examples.Maude2Model/files/src/scripts/Island.g:79:18: ( ID )
            dbg.enterAlt(1);

            // /Users/jlcanovas/Desktop/eclipse-3.5-64b/workspace/Grammar2Model.examples.Maude2Model/files/src/scripts/Island.g:80:2: ID
            {
            dbg.location(80,2);
            match(input,ID,FOLLOW_ID_in_atEnumerationSort233); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(81, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "atEnumerationSort");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "atEnumerationSort"


    // $ANTLR start "atEnumerationInstanceSort"
    // /Users/jlcanovas/Desktop/eclipse-3.5-64b/workspace/Grammar2Model.examples.Maude2Model/files/src/scripts/Island.g:83:1: atEnumerationInstanceSort : ID ;
    public final void atEnumerationInstanceSort() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "atEnumerationInstanceSort");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(83, 1);

        try {
            // /Users/jlcanovas/Desktop/eclipse-3.5-64b/workspace/Grammar2Model.examples.Maude2Model/files/src/scripts/Island.g:83:26: ( ID )
            dbg.enterAlt(1);

            // /Users/jlcanovas/Desktop/eclipse-3.5-64b/workspace/Grammar2Model.examples.Maude2Model/files/src/scripts/Island.g:84:2: ID
            {
            dbg.location(84,2);
            match(input,ID,FOLLOW_ID_in_atEnumerationInstanceSort243); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(85, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "atEnumerationInstanceSort");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "atEnumerationInstanceSort"


    // $ANTLR start "listOrdSort"
    // /Users/jlcanovas/Desktop/eclipse-3.5-64b/workspace/Grammar2Model.examples.Maude2Model/files/src/scripts/Island.g:87:1: listOrdSort : ID ;
    public final void listOrdSort() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "listOrdSort");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(87, 1);

        try {
            // /Users/jlcanovas/Desktop/eclipse-3.5-64b/workspace/Grammar2Model.examples.Maude2Model/files/src/scripts/Island.g:87:12: ( ID )
            dbg.enterAlt(1);

            // /Users/jlcanovas/Desktop/eclipse-3.5-64b/workspace/Grammar2Model.examples.Maude2Model/files/src/scripts/Island.g:88:2: ID
            {
            dbg.location(88,2);
            match(input,ID,FOLLOW_ID_in_listOrdSort253); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(89, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "listOrdSort");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "listOrdSort"


    // $ANTLR start "oclVoidSort"
    // /Users/jlcanovas/Desktop/eclipse-3.5-64b/workspace/Grammar2Model.examples.Maude2Model/files/src/scripts/Island.g:91:1: oclVoidSort : ID ;
    public final void oclVoidSort() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "oclVoidSort");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(91, 1);

        try {
            // /Users/jlcanovas/Desktop/eclipse-3.5-64b/workspace/Grammar2Model.examples.Maude2Model/files/src/scripts/Island.g:91:12: ( ID )
            dbg.enterAlt(1);

            // /Users/jlcanovas/Desktop/eclipse-3.5-64b/workspace/Grammar2Model.examples.Maude2Model/files/src/scripts/Island.g:92:2: ID
            {
            dbg.location(92,2);
            match(input,ID,FOLLOW_ID_in_oclVoidSort263); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(93, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "oclVoidSort");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "oclVoidSort"


    // $ANTLR start "opName"
    // /Users/jlcanovas/Desktop/eclipse-3.5-64b/workspace/Grammar2Model.examples.Maude2Model/files/src/scripts/Island.g:96:1: opName : 'name' '(' atMetamodelSort ')' '=' stringSort ;
    public final void opName() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "opName");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(96, 1);

        try {
            // /Users/jlcanovas/Desktop/eclipse-3.5-64b/workspace/Grammar2Model.examples.Maude2Model/files/src/scripts/Island.g:96:7: ( 'name' '(' atMetamodelSort ')' '=' stringSort )
            dbg.enterAlt(1);

            // /Users/jlcanovas/Desktop/eclipse-3.5-64b/workspace/Grammar2Model.examples.Maude2Model/files/src/scripts/Island.g:97:2: 'name' '(' atMetamodelSort ')' '=' stringSort
            {
            dbg.location(97,2);
            match(input,13,FOLLOW_13_in_opName274); 
            dbg.location(97,9);
            match(input,14,FOLLOW_14_in_opName276); 
            dbg.location(97,13);
            pushFollow(FOLLOW_atMetamodelSort_in_opName278);
            atMetamodelSort();

            state._fsp--;

            dbg.location(97,29);
            match(input,15,FOLLOW_15_in_opName280); 
            dbg.location(97,33);
            match(input,16,FOLLOW_16_in_opName282); 
            dbg.location(97,37);
            pushFollow(FOLLOW_stringSort_in_opName284);
            stringSort();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(98, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "opName");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "opName"


    // $ANTLR start "opPackages"
    // /Users/jlcanovas/Desktop/eclipse-3.5-64b/workspace/Grammar2Model.examples.Maude2Model/files/src/scripts/Island.g:100:1: opPackages : 'packages' '(' atMetamodelSort ')' '=' atPackageSort ;
    public final void opPackages() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "opPackages");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(100, 1);

        try {
            // /Users/jlcanovas/Desktop/eclipse-3.5-64b/workspace/Grammar2Model.examples.Maude2Model/files/src/scripts/Island.g:100:11: ( 'packages' '(' atMetamodelSort ')' '=' atPackageSort )
            dbg.enterAlt(1);

            // /Users/jlcanovas/Desktop/eclipse-3.5-64b/workspace/Grammar2Model.examples.Maude2Model/files/src/scripts/Island.g:101:2: 'packages' '(' atMetamodelSort ')' '=' atPackageSort
            {
            dbg.location(101,2);
            match(input,17,FOLLOW_17_in_opPackages294); 
            dbg.location(101,13);
            match(input,14,FOLLOW_14_in_opPackages296); 
            dbg.location(101,17);
            pushFollow(FOLLOW_atMetamodelSort_in_opPackages298);
            atMetamodelSort();

            state._fsp--;

            dbg.location(101,33);
            match(input,15,FOLLOW_15_in_opPackages300); 
            dbg.location(101,37);
            match(input,16,FOLLOW_16_in_opPackages302); 
            dbg.location(101,41);
            pushFollow(FOLLOW_atPackageSort_in_opPackages304);
            atPackageSort();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(102, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "opPackages");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "opPackages"


    // $ANTLR start "opSubPackages"
    // /Users/jlcanovas/Desktop/eclipse-3.5-64b/workspace/Grammar2Model.examples.Maude2Model/files/src/scripts/Island.g:104:1: opSubPackages : 'subPackages' '(' atPackageSort ')' '=' listOrdSort ;
    public final void opSubPackages() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "opSubPackages");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(104, 1);

        try {
            // /Users/jlcanovas/Desktop/eclipse-3.5-64b/workspace/Grammar2Model.examples.Maude2Model/files/src/scripts/Island.g:104:14: ( 'subPackages' '(' atPackageSort ')' '=' listOrdSort )
            dbg.enterAlt(1);

            // /Users/jlcanovas/Desktop/eclipse-3.5-64b/workspace/Grammar2Model.examples.Maude2Model/files/src/scripts/Island.g:105:2: 'subPackages' '(' atPackageSort ')' '=' listOrdSort
            {
            dbg.location(105,2);
            match(input,18,FOLLOW_18_in_opSubPackages314); 
            dbg.location(105,16);
            match(input,14,FOLLOW_14_in_opSubPackages316); 
            dbg.location(105,20);
            pushFollow(FOLLOW_atPackageSort_in_opSubPackages318);
            atPackageSort();

            state._fsp--;

            dbg.location(105,34);
            match(input,15,FOLLOW_15_in_opSubPackages320); 
            dbg.location(105,38);
            match(input,16,FOLLOW_16_in_opSubPackages322); 
            dbg.location(105,42);
            pushFollow(FOLLOW_listOrdSort_in_opSubPackages324);
            listOrdSort();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(106, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "opSubPackages");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "opSubPackages"


    // $ANTLR start "opMetamodel"
    // /Users/jlcanovas/Desktop/eclipse-3.5-64b/workspace/Grammar2Model.examples.Maude2Model/files/src/scripts/Island.g:108:1: opMetamodel : 'metamodel' '(' atPackageSort ')' '=' atMetamodelSort ;
    public final void opMetamodel() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "opMetamodel");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(108, 1);

        try {
            // /Users/jlcanovas/Desktop/eclipse-3.5-64b/workspace/Grammar2Model.examples.Maude2Model/files/src/scripts/Island.g:108:12: ( 'metamodel' '(' atPackageSort ')' '=' atMetamodelSort )
            dbg.enterAlt(1);

            // /Users/jlcanovas/Desktop/eclipse-3.5-64b/workspace/Grammar2Model.examples.Maude2Model/files/src/scripts/Island.g:109:2: 'metamodel' '(' atPackageSort ')' '=' atMetamodelSort
            {
            dbg.location(109,2);
            match(input,19,FOLLOW_19_in_opMetamodel334); 
            dbg.location(109,14);
            match(input,14,FOLLOW_14_in_opMetamodel336); 
            dbg.location(109,18);
            pushFollow(FOLLOW_atPackageSort_in_opMetamodel338);
            atPackageSort();

            state._fsp--;

            dbg.location(109,32);
            match(input,15,FOLLOW_15_in_opMetamodel340); 
            dbg.location(109,36);
            match(input,16,FOLLOW_16_in_opMetamodel342); 
            dbg.location(109,40);
            pushFollow(FOLLOW_atMetamodelSort_in_opMetamodel344);
            atMetamodelSort();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(110, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "opMetamodel");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "opMetamodel"


    // $ANTLR start "opSuperPackage"
    // /Users/jlcanovas/Desktop/eclipse-3.5-64b/workspace/Grammar2Model.examples.Maude2Model/files/src/scripts/Island.g:112:1: opSuperPackage : 'superPackage' '(' atPackageSort ')' '=' oclVoidSort ;
    public final void opSuperPackage() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "opSuperPackage");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(112, 1);

        try {
            // /Users/jlcanovas/Desktop/eclipse-3.5-64b/workspace/Grammar2Model.examples.Maude2Model/files/src/scripts/Island.g:112:15: ( 'superPackage' '(' atPackageSort ')' '=' oclVoidSort )
            dbg.enterAlt(1);

            // /Users/jlcanovas/Desktop/eclipse-3.5-64b/workspace/Grammar2Model.examples.Maude2Model/files/src/scripts/Island.g:113:2: 'superPackage' '(' atPackageSort ')' '=' oclVoidSort
            {
            dbg.location(113,2);
            match(input,20,FOLLOW_20_in_opSuperPackage354); 
            dbg.location(113,17);
            match(input,14,FOLLOW_14_in_opSuperPackage356); 
            dbg.location(113,21);
            pushFollow(FOLLOW_atPackageSort_in_opSuperPackage358);
            atPackageSort();

            state._fsp--;

            dbg.location(113,35);
            match(input,15,FOLLOW_15_in_opSuperPackage360); 
            dbg.location(113,39);
            match(input,16,FOLLOW_16_in_opSuperPackage362); 
            dbg.location(113,43);
            pushFollow(FOLLOW_oclVoidSort_in_opSuperPackage364);
            oclVoidSort();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(114, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "opSuperPackage");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "opSuperPackage"


    // $ANTLR start "opClasses"
    // /Users/jlcanovas/Desktop/eclipse-3.5-64b/workspace/Grammar2Model.examples.Maude2Model/files/src/scripts/Island.g:116:1: opClasses : 'classes' '(' atPackageSort ')' '=' listOrdSort ;
    public final void opClasses() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "opClasses");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(116, 1);

        try {
            // /Users/jlcanovas/Desktop/eclipse-3.5-64b/workspace/Grammar2Model.examples.Maude2Model/files/src/scripts/Island.g:116:10: ( 'classes' '(' atPackageSort ')' '=' listOrdSort )
            dbg.enterAlt(1);

            // /Users/jlcanovas/Desktop/eclipse-3.5-64b/workspace/Grammar2Model.examples.Maude2Model/files/src/scripts/Island.g:117:2: 'classes' '(' atPackageSort ')' '=' listOrdSort
            {
            dbg.location(117,2);
            match(input,21,FOLLOW_21_in_opClasses374); 
            dbg.location(117,12);
            match(input,14,FOLLOW_14_in_opClasses376); 
            dbg.location(117,16);
            pushFollow(FOLLOW_atPackageSort_in_opClasses378);
            atPackageSort();

            state._fsp--;

            dbg.location(117,30);
            match(input,15,FOLLOW_15_in_opClasses380); 
            dbg.location(117,34);
            match(input,16,FOLLOW_16_in_opClasses382); 
            dbg.location(117,38);
            pushFollow(FOLLOW_listOrdSort_in_opClasses384);
            listOrdSort();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(118, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "opClasses");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "opClasses"


    // $ANTLR start "opatMPNsat"
    // /Users/jlcanovas/Desktop/eclipse-3.5-64b/workspace/Grammar2Model.examples.Maude2Model/files/src/scripts/Island.g:120:1: opatMPNsat : '@MPNs@' '(' ')' '=' atMetamodelSort ;
    public final void opatMPNsat() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "opatMPNsat");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(120, 1);

        try {
            // /Users/jlcanovas/Desktop/eclipse-3.5-64b/workspace/Grammar2Model.examples.Maude2Model/files/src/scripts/Island.g:120:11: ( '@MPNs@' '(' ')' '=' atMetamodelSort )
            dbg.enterAlt(1);

            // /Users/jlcanovas/Desktop/eclipse-3.5-64b/workspace/Grammar2Model.examples.Maude2Model/files/src/scripts/Island.g:121:2: '@MPNs@' '(' ')' '=' atMetamodelSort
            {
            dbg.location(121,2);
            match(input,22,FOLLOW_22_in_opatMPNsat394); 
            dbg.location(121,11);
            match(input,14,FOLLOW_14_in_opatMPNsat396); 
            dbg.location(121,16);
            match(input,15,FOLLOW_15_in_opatMPNsat399); 
            dbg.location(121,20);
            match(input,16,FOLLOW_16_in_opatMPNsat401); 
            dbg.location(121,24);
            pushFollow(FOLLOW_atMetamodelSort_in_opatMPNsat403);
            atMetamodelSort();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(122, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "opatMPNsat");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "opatMPNsat"


    // $ANTLR start "opMPNs"
    // /Users/jlcanovas/Desktop/eclipse-3.5-64b/workspace/Grammar2Model.examples.Maude2Model/files/src/scripts/Island.g:124:1: opMPNs : 'MPNs' '(' ')' '=' atPackageSort ;
    public final void opMPNs() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "opMPNs");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(124, 1);

        try {
            // /Users/jlcanovas/Desktop/eclipse-3.5-64b/workspace/Grammar2Model.examples.Maude2Model/files/src/scripts/Island.g:124:7: ( 'MPNs' '(' ')' '=' atPackageSort )
            dbg.enterAlt(1);

            // /Users/jlcanovas/Desktop/eclipse-3.5-64b/workspace/Grammar2Model.examples.Maude2Model/files/src/scripts/Island.g:125:2: 'MPNs' '(' ')' '=' atPackageSort
            {
            dbg.location(125,2);
            match(input,23,FOLLOW_23_in_opMPNs413); 
            dbg.location(125,9);
            match(input,14,FOLLOW_14_in_opMPNs415); 
            dbg.location(125,14);
            match(input,15,FOLLOW_15_in_opMPNs418); 
            dbg.location(125,18);
            match(input,16,FOLLOW_16_in_opMPNs420); 
            dbg.location(125,22);
            pushFollow(FOLLOW_atPackageSort_in_opMPNs422);
            atPackageSort();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(126, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "opMPNs");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "opMPNs"

    // Delegated rules


 

    public static final BitSet FOLLOW_9_in_mainRule10 = new BitSet(new long[]{0x0000000000FE2800L});
    public static final BitSet FOLLOW_label_in_mainRule13 = new BitSet(new long[]{0x0000000000FE2800L});
    public static final BitSet FOLLOW_eqPart_in_mainRule17 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_mainRule19 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_label29 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_label31 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_label33 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_COLON_in_label35 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_opName_in_eqPart47 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_opPackages_in_eqPart52 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_opSubPackages_in_eqPart57 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_opMetamodel_in_eqPart62 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_opSuperPackage_in_eqPart67 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_opClasses_in_eqPart72 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_opatMPNsat_in_eqPart77 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_opMPNs_in_eqPart82 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_atPackageSort93 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_atBasicTypeSort103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_atClassifierSort113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_atDataTypeSort123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_atClassSort133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_atMetamodelSort143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_atERRORatSort153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_atAttributeSort163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_atReferenceSort173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_intSort183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_natSort193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_boolSort203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_stringSort213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_listSort223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_atEnumerationSort233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_atEnumerationInstanceSort243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_listOrdSort253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_oclVoidSort263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_opName274 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_opName276 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_atMetamodelSort_in_opName278 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_opName280 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_opName282 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_stringSort_in_opName284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_opPackages294 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_opPackages296 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_atMetamodelSort_in_opPackages298 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_opPackages300 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_opPackages302 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_atPackageSort_in_opPackages304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_opSubPackages314 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_opSubPackages316 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_atPackageSort_in_opSubPackages318 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_opSubPackages320 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_opSubPackages322 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_listOrdSort_in_opSubPackages324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_opMetamodel334 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_opMetamodel336 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_atPackageSort_in_opMetamodel338 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_opMetamodel340 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_opMetamodel342 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_atMetamodelSort_in_opMetamodel344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_opSuperPackage354 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_opSuperPackage356 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_atPackageSort_in_opSuperPackage358 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_opSuperPackage360 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_opSuperPackage362 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_oclVoidSort_in_opSuperPackage364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_opClasses374 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_opClasses376 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_atPackageSort_in_opClasses378 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_opClasses380 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_opClasses382 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_listOrdSort_in_opClasses384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_opatMPNsat394 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_opatMPNsat396 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_opatMPNsat399 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_opatMPNsat401 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_atMetamodelSort_in_opatMPNsat403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_opMPNs413 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_opMPNs415 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_opMPNs418 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_opMPNs420 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_atPackageSort_in_opMPNs422 = new BitSet(new long[]{0x0000000000000002L});

}