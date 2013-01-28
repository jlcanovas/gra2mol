/*******************************************************************************
 * Copyright (c) 2008, 2011
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Javier Canovas (jlcanovas@um.es) 
 *******************************************************************************/


// $ANTLR 3.2 Sep 23, 2009 12:02:23 /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3 2010-12-06 18:38:22
 
	package gts.modernization.parser.gra2mol;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class Gra2MoLLexer extends Lexer {
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__64=64;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__65=65;
    public static final int T__62=62;
    public static final int T__27=27;
    public static final int T__63=63;
    public static final int T__26=26;
    public static final int IDESC=21;
    public static final int T__25=25;
    public static final int NOT=17;
    public static final int AND=15;
    public static final int ID=7;
    public static final int T__61=61;
    public static final int EOF=-1;
    public static final int DOUBLEQUOTE=22;
    public static final int T__60=60;
    public static final int AT=18;
    public static final int T__55=55;
    public static final int ML_COMMENT=4;
    public static final int T__56=56;
    public static final int QUOTE=8;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__59=59;
    public static final int DOUBLEBAR=13;
    public static final int PLUS=20;
    public static final int DOT=9;
    public static final int AL=19;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int NUMBER=11;
    public static final int OL_COMMENT=5;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__71=71;
    public static final int WS=24;
    public static final int T__34=34;
    public static final int T__72=72;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__70=70;
    public static final int TRIPLEBAR=12;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int DDOTS=10;
    public static final int OR=16;
    public static final int DQVALUE=6;
    public static final int T__76=76;
    public static final int OPERATION=23;
    public static final int T__75=75;
    public static final int T__74=74;
    public static final int T__73=73;
    public static final int BAR=14;
    public static final int T__77=77;

    // delegates
    // delegators

    public Gra2MoLLexer() {;} 
    public Gra2MoLLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public Gra2MoLLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "/Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3"; }

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:7:7: ( 'grammar' )
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:7:9: 'grammar'
            {
            match("grammar"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:8:7: ( ':' )
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:8:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:9:7: ( ';' )
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:9:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:10:7: ( 'metamodel' )
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:10:9: 'metamodel'
            {
            match("metamodel"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:11:7: ( 'hash' )
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:11:9: 'hash'
            {
            match("hash"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:12:7: ( ',' )
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:12:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:13:7: ( 'end_hash' )
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:13:9: 'end_hash'
            {
            match("end_hash"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:14:7: ( '->' )
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:14:9: '->'
            {
            match("->"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:15:7: ( 'default' )
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:15:9: 'default'
            {
            match("default"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:16:7: ( 'G' )
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:16:9: 'G'
            {
            match('G'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:17:7: ( '(' )
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:17:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:18:7: ( ')' )
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:18:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:19:7: ( 'MM' )
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:19:9: 'MM'
            {
            match("MM"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:20:7: ( 'end_rule' )
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:20:9: 'end_rule'
            {
            match("end_rule"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:21:7: ( 'mixin_rule' )
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:21:9: 'mixin_rule'
            {
            match("mixin_rule"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:22:7: ( 'rule' )
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:22:9: 'rule'
            {
            match("rule"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:23:7: ( 'skip_rule' )
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:23:9: 'skip_rule'
            {
            match("skip_rule"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:24:7: ( 'copy_rule' )
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:24:9: 'copy_rule'
            {
            match("copy_rule"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:25:7: ( 'from' )
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:25:9: 'from'
            {
            match("from"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:26:7: ( '[' )
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:26:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:27:7: ( 'unique' )
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:27:9: 'unique'
            {
            match("unique"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:28:7: ( ']' )
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:28:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:29:7: ( '{' )
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:29:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:30:7: ( '}' )
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:30:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:31:7: ( 'context' )
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:31:9: 'context'
            {
            match("context"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:32:7: ( 'mixin' )
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:32:9: 'mixin'
            {
            match("mixin"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:33:7: ( 'to' )
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:33:9: 'to'
            {
            match("to"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:34:7: ( 'queries' )
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:34:9: 'queries'
            {
            match("queries"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:35:7: ( 'for' )
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:35:9: 'for'
            {
            match("for"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:36:7: ( 'each' )
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:36:9: 'each'
            {
            match("each"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:37:7: ( 'in' )
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:37:9: 'in'
            {
            match("in"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:38:7: ( 'greater' )
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:38:9: 'greater'
            {
            match("greater"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:39:7: ( 'ext' )
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:39:9: 'ext'
            {
            match("ext"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:40:7: ( 'first' )
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:40:9: 'first'
            {
            match("first"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:41:7: ( 'last' )
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:41:9: 'last'
            {
            match("last"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:42:7: ( 'all' )
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:42:9: 'all'
            {
            match("all"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:43:7: ( 'mappings' )
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:43:9: 'mappings'
            {
            match("mappings"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:44:7: ( 'do' )
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:44:9: 'do'
            {
            match("do"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:45:7: ( '=' )
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:45:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:46:7: ( 'if' )
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:46:9: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:47:7: ( 'then' )
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:47:9: 'then'
            {
            match("then"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:48:7: ( 'else' )
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:48:9: 'else'
            {
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:49:7: ( 'end_if' )
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:49:9: 'end_if'
            {
            match("end_if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:50:7: ( 'skip' )
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:50:9: 'skip'
            {
            match("skip"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:51:7: ( '*' )
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:51:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__69"

    // $ANTLR start "T__70"
    public final void mT__70() throws RecognitionException {
        try {
            int _type = T__70;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:52:7: ( 'new' )
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:52:9: 'new'
            {
            match("new"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__70"

    // $ANTLR start "T__71"
    public final void mT__71() throws RecognitionException {
        try {
            int _type = T__71;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:53:7: ( 'map' )
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:53:9: 'map'
            {
            match("map"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__71"

    // $ANTLR start "T__72"
    public final void mT__72() throws RecognitionException {
        try {
            int _type = T__72;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:54:7: ( 'extract' )
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:54:9: 'extract'
            {
            match("extract"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__72"

    // $ANTLR start "T__73"
    public final void mT__73() throws RecognitionException {
        try {
            int _type = T__73;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:55:7: ( 'extractID' )
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:55:9: 'extractID'
            {
            match("extractID"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__73"

    // $ANTLR start "T__74"
    public final void mT__74() throws RecognitionException {
        try {
            int _type = T__74;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:56:7: ( 'execute' )
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:56:9: 'execute'
            {
            match("execute"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__74"

    // $ANTLR start "T__75"
    public final void mT__75() throws RecognitionException {
        try {
            int _type = T__75;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:57:7: ( 'removeQuotes' )
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:57:9: 'removeQuotes'
            {
            match("removeQuotes"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__75"

    // $ANTLR start "T__76"
    public final void mT__76() throws RecognitionException {
        try {
            int _type = T__76;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:58:7: ( 'count' )
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:58:9: 'count'
            {
            match("count"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__76"

    // $ANTLR start "T__77"
    public final void mT__77() throws RecognitionException {
        try {
            int _type = T__77;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:59:7: ( 'convertHexToString' )
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:59:9: 'convertHexToString'
            {
            match("convertHexToString"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__77"

    // $ANTLR start "AND"
    public final void mAND() throws RecognitionException {
        try {
            int _type = AND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:655:4: ( '\\u0026\\u0026' )
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:655:6: '\\u0026\\u0026'
            {
            match("\u0026\u0026"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AND"

    // $ANTLR start "OR"
    public final void mOR() throws RecognitionException {
        try {
            int _type = OR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:656:3: ( '\\u007C\\u007C' )
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:656:5: '\\u007C\\u007C'
            {
            match("\u007C\u007C"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OR"

    // $ANTLR start "AT"
    public final void mAT() throws RecognitionException {
        try {
            int _type = AT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:657:3: ( '\\u0040' )
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:657:5: '\\u0040'
            {
            match('@'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AT"

    // $ANTLR start "AL"
    public final void mAL() throws RecognitionException {
        try {
            int _type = AL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:658:3: ( '\\u0023' )
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:658:5: '\\u0023'
            {
            match('#'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AL"

    // $ANTLR start "DOT"
    public final void mDOT() throws RecognitionException {
        try {
            int _type = DOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:659:4: ( '\\u002E' )
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:659:6: '\\u002E'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DOT"

    // $ANTLR start "PLUS"
    public final void mPLUS() throws RecognitionException {
        try {
            int _type = PLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:660:5: ( '\\u002B' )
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:660:7: '\\u002B'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PLUS"

    // $ANTLR start "NOT"
    public final void mNOT() throws RecognitionException {
        try {
            int _type = NOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:661:4: ( '\\u0021' )
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:661:6: '\\u0021'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NOT"

    // $ANTLR start "DDOTS"
    public final void mDDOTS() throws RecognitionException {
        try {
            int _type = DDOTS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:662:6: ( '\\u003A\\u003A' )
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:662:8: '\\u003A\\u003A'
            {
            match("\u003A\u003A"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DDOTS"

    // $ANTLR start "QUOTE"
    public final void mQUOTE() throws RecognitionException {
        try {
            int _type = QUOTE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:663:6: ( '\\u0027' )
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:663:8: '\\u0027'
            {
            match('\''); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "QUOTE"

    // $ANTLR start "DOUBLEQUOTE"
    public final void mDOUBLEQUOTE() throws RecognitionException {
        try {
            int _type = DOUBLEQUOTE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:664:12: ( '\\u0022' )
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:664:14: '\\u0022'
            {
            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DOUBLEQUOTE"

    // $ANTLR start "BAR"
    public final void mBAR() throws RecognitionException {
        try {
            int _type = BAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:665:4: ( '\\u002F' )
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:665:6: '\\u002F'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BAR"

    // $ANTLR start "DOUBLEBAR"
    public final void mDOUBLEBAR() throws RecognitionException {
        try {
            int _type = DOUBLEBAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:666:10: ( '\\u002F\\u002F' )
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:666:12: '\\u002F\\u002F'
            {
            match("\u002F\u002F"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DOUBLEBAR"

    // $ANTLR start "TRIPLEBAR"
    public final void mTRIPLEBAR() throws RecognitionException {
        try {
            int _type = TRIPLEBAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:667:10: ( '\\u002F\\u002F\\u002F' )
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:667:12: '\\u002F\\u002F\\u002F'
            {
            match("\u002F\u002F\u002F"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TRIPLEBAR"

    // $ANTLR start "DQVALUE"
    public final void mDQVALUE() throws RecognitionException {
        try {
            int _type = DQVALUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:668:8: ( DOUBLEQUOTE ( options {greedy=false; } : . )* DOUBLEQUOTE )
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:669:2: DOUBLEQUOTE ( options {greedy=false; } : . )* DOUBLEQUOTE
            {
            mDOUBLEQUOTE(); 
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:669:14: ( options {greedy=false; } : . )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0=='\"') ) {
                    alt1=2;
                }
                else if ( ((LA1_0>='\u0000' && LA1_0<='!')||(LA1_0>='#' && LA1_0<='\uFFFF')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:669:41: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            mDOUBLEQUOTE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DQVALUE"

    // $ANTLR start "OPERATION"
    public final void mOPERATION() throws RecognitionException {
        try {
            int _type = OPERATION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:671:10: ( ( '+' | '-' | '*' | '\\u002F' ) )
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:672:2: ( '+' | '-' | '*' | '\\u002F' )
            {
            if ( (input.LA(1)>='*' && input.LA(1)<='+')||input.LA(1)=='-'||input.LA(1)=='/' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OPERATION"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:674:3: ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '$' | '#' )* )
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:675:2: ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '$' | '#' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:675:24: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '$' | '#' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='#' && LA2_0<='$')||(LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:
            	    {
            	    if ( (input.LA(1)>='#' && input.LA(1)<='$')||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ID"

    // $ANTLR start "IDESC"
    public final void mIDESC() throws RecognitionException {
        try {
            int _type = IDESC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:677:6: ( '_' ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '$' | '#' )* )
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:678:2: '_' ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '$' | '#' )*
            {
            match('_'); 
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:678:28: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '$' | '#' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='#' && LA3_0<='$')||(LA3_0>='0' && LA3_0<='9')||(LA3_0>='A' && LA3_0<='Z')||LA3_0=='_'||(LA3_0>='a' && LA3_0<='z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:
            	    {
            	    if ( (input.LA(1)>='#' && input.LA(1)<='$')||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IDESC"

    // $ANTLR start "NUMBER"
    public final void mNUMBER() throws RecognitionException {
        try {
            int _type = NUMBER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:680:7: ( ( '+' | '-' )? ( '0' .. '9' )+ )
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:681:2: ( '+' | '-' )? ( '0' .. '9' )+
            {
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:681:2: ( '+' | '-' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='+'||LA4_0=='-') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:
                    {
                    if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }

            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:681:15: ( '0' .. '9' )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:681:16: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NUMBER"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:683:3: ( ( '\\t' | ' ' | '\\r' | '\\n' | '\\u000C' )+ )
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:684:2: ( '\\t' | ' ' | '\\r' | '\\n' | '\\u000C' )+
            {
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:684:2: ( '\\t' | ' ' | '\\r' | '\\n' | '\\u000C' )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='\t' && LA6_0<='\n')||(LA6_0>='\f' && LA6_0<='\r')||LA6_0==' ') ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||(input.LA(1)>='\f' && input.LA(1)<='\r')||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);

             _channel = HIDDEN; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "ML_COMMENT"
    public final void mML_COMMENT() throws RecognitionException {
        try {
            int _type = ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:686:11: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:687:2: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:687:7: ( options {greedy=false; } : . )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='*') ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1=='/') ) {
                        alt7=2;
                    }
                    else if ( ((LA7_1>='\u0000' && LA7_1<='.')||(LA7_1>='0' && LA7_1<='\uFFFF')) ) {
                        alt7=1;
                    }


                }
                else if ( ((LA7_0>='\u0000' && LA7_0<=')')||(LA7_0>='+' && LA7_0<='\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:687:34: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            match("*/"); 

             _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ML_COMMENT"

    // $ANTLR start "OL_COMMENT"
    public final void mOL_COMMENT() throws RecognitionException {
        try {
            int _type = OL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:690:11: ( '--' ( options {greedy=false; } : . )* ( '\\n' )+ )
            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:690:13: '--' ( options {greedy=false; } : . )* ( '\\n' )+
            {
            match("--"); 

            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:690:18: ( options {greedy=false; } : . )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0=='\n') ) {
                    alt8=2;
                }
                else if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:690:46: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:690:51: ( '\\n' )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0=='\n') ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:690:51: '\\n'
            	    {
            	    match('\n'); 

            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
            } while (true);

             _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OL_COMMENT"

    public void mTokens() throws RecognitionException {
        // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:1:8: ( T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | AND | OR | AT | AL | DOT | PLUS | NOT | DDOTS | QUOTE | DOUBLEQUOTE | BAR | DOUBLEBAR | TRIPLEBAR | DQVALUE | OPERATION | ID | IDESC | NUMBER | WS | ML_COMMENT | OL_COMMENT )
        int alt10=74;
        alt10 = dfa10.predict(input);
        switch (alt10) {
            case 1 :
                // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:1:10: T__25
                {
                mT__25(); 

                }
                break;
            case 2 :
                // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:1:16: T__26
                {
                mT__26(); 

                }
                break;
            case 3 :
                // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:1:22: T__27
                {
                mT__27(); 

                }
                break;
            case 4 :
                // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:1:28: T__28
                {
                mT__28(); 

                }
                break;
            case 5 :
                // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:1:34: T__29
                {
                mT__29(); 

                }
                break;
            case 6 :
                // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:1:40: T__30
                {
                mT__30(); 

                }
                break;
            case 7 :
                // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:1:46: T__31
                {
                mT__31(); 

                }
                break;
            case 8 :
                // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:1:52: T__32
                {
                mT__32(); 

                }
                break;
            case 9 :
                // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:1:58: T__33
                {
                mT__33(); 

                }
                break;
            case 10 :
                // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:1:64: T__34
                {
                mT__34(); 

                }
                break;
            case 11 :
                // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:1:70: T__35
                {
                mT__35(); 

                }
                break;
            case 12 :
                // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:1:76: T__36
                {
                mT__36(); 

                }
                break;
            case 13 :
                // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:1:82: T__37
                {
                mT__37(); 

                }
                break;
            case 14 :
                // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:1:88: T__38
                {
                mT__38(); 

                }
                break;
            case 15 :
                // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:1:94: T__39
                {
                mT__39(); 

                }
                break;
            case 16 :
                // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:1:100: T__40
                {
                mT__40(); 

                }
                break;
            case 17 :
                // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:1:106: T__41
                {
                mT__41(); 

                }
                break;
            case 18 :
                // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:1:112: T__42
                {
                mT__42(); 

                }
                break;
            case 19 :
                // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:1:118: T__43
                {
                mT__43(); 

                }
                break;
            case 20 :
                // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:1:124: T__44
                {
                mT__44(); 

                }
                break;
            case 21 :
                // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:1:130: T__45
                {
                mT__45(); 

                }
                break;
            case 22 :
                // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:1:136: T__46
                {
                mT__46(); 

                }
                break;
            case 23 :
                // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:1:142: T__47
                {
                mT__47(); 

                }
                break;
            case 24 :
                // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:1:148: T__48
                {
                mT__48(); 

                }
                break;
            case 25 :
                // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:1:154: T__49
                {
                mT__49(); 

                }
                break;
            case 26 :
                // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:1:160: T__50
                {
                mT__50(); 

                }
                break;
            case 27 :
                // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:1:166: T__51
                {
                mT__51(); 

                }
                break;
            case 28 :
                // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:1:172: T__52
                {
                mT__52(); 

                }
                break;
            case 29 :
                // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:1:178: T__53
                {
                mT__53(); 

                }
                break;
            case 30 :
                // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:1:184: T__54
                {
                mT__54(); 

                }
                break;
            case 31 :
                // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:1:190: T__55
                {
                mT__55(); 

                }
                break;
            case 32 :
                // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:1:196: T__56
                {
                mT__56(); 

                }
                break;
            case 33 :
                // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:1:202: T__57
                {
                mT__57(); 

                }
                break;
            case 34 :
                // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:1:208: T__58
                {
                mT__58(); 

                }
                break;
            case 35 :
                // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:1:214: T__59
                {
                mT__59(); 

                }
                break;
            case 36 :
                // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:1:220: T__60
                {
                mT__60(); 

                }
                break;
            case 37 :
                // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:1:226: T__61
                {
                mT__61(); 

                }
                break;
            case 38 :
                // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:1:232: T__62
                {
                mT__62(); 

                }
                break;
            case 39 :
                // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:1:238: T__63
                {
                mT__63(); 

                }
                break;
            case 40 :
                // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:1:244: T__64
                {
                mT__64(); 

                }
                break;
            case 41 :
                // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:1:250: T__65
                {
                mT__65(); 

                }
                break;
            case 42 :
                // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:1:256: T__66
                {
                mT__66(); 

                }
                break;
            case 43 :
                // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:1:262: T__67
                {
                mT__67(); 

                }
                break;
            case 44 :
                // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:1:268: T__68
                {
                mT__68(); 

                }
                break;
            case 45 :
                // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:1:274: T__69
                {
                mT__69(); 

                }
                break;
            case 46 :
                // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:1:280: T__70
                {
                mT__70(); 

                }
                break;
            case 47 :
                // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:1:286: T__71
                {
                mT__71(); 

                }
                break;
            case 48 :
                // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:1:292: T__72
                {
                mT__72(); 

                }
                break;
            case 49 :
                // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:1:298: T__73
                {
                mT__73(); 

                }
                break;
            case 50 :
                // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:1:304: T__74
                {
                mT__74(); 

                }
                break;
            case 51 :
                // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:1:310: T__75
                {
                mT__75(); 

                }
                break;
            case 52 :
                // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:1:316: T__76
                {
                mT__76(); 

                }
                break;
            case 53 :
                // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:1:322: T__77
                {
                mT__77(); 

                }
                break;
            case 54 :
                // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:1:328: AND
                {
                mAND(); 

                }
                break;
            case 55 :
                // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:1:332: OR
                {
                mOR(); 

                }
                break;
            case 56 :
                // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:1:335: AT
                {
                mAT(); 

                }
                break;
            case 57 :
                // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:1:338: AL
                {
                mAL(); 

                }
                break;
            case 58 :
                // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:1:341: DOT
                {
                mDOT(); 

                }
                break;
            case 59 :
                // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:1:345: PLUS
                {
                mPLUS(); 

                }
                break;
            case 60 :
                // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:1:350: NOT
                {
                mNOT(); 

                }
                break;
            case 61 :
                // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:1:354: DDOTS
                {
                mDDOTS(); 

                }
                break;
            case 62 :
                // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:1:360: QUOTE
                {
                mQUOTE(); 

                }
                break;
            case 63 :
                // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:1:366: DOUBLEQUOTE
                {
                mDOUBLEQUOTE(); 

                }
                break;
            case 64 :
                // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:1:378: BAR
                {
                mBAR(); 

                }
                break;
            case 65 :
                // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:1:382: DOUBLEBAR
                {
                mDOUBLEBAR(); 

                }
                break;
            case 66 :
                // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:1:392: TRIPLEBAR
                {
                mTRIPLEBAR(); 

                }
                break;
            case 67 :
                // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:1:402: DQVALUE
                {
                mDQVALUE(); 

                }
                break;
            case 68 :
                // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:1:410: OPERATION
                {
                mOPERATION(); 

                }
                break;
            case 69 :
                // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:1:420: ID
                {
                mID(); 

                }
                break;
            case 70 :
                // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:1:423: IDESC
                {
                mIDESC(); 

                }
                break;
            case 71 :
                // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:1:429: NUMBER
                {
                mNUMBER(); 

                }
                break;
            case 72 :
                // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:1:436: WS
                {
                mWS(); 

                }
                break;
            case 73 :
                // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:1:439: ML_COMMENT
                {
                mML_COMMENT(); 

                }
                break;
            case 74 :
                // /Users/jlcanovas/Desktop/eclipse-helios/workspace/Grammar2Model/src/Gra2MoL.g3:1:450: OL_COMMENT
                {
                mOL_COMMENT(); 

                }
                break;

        }

    }


    protected DFA10 dfa10 = new DFA10(this);
    static final String DFA10_eotS =
        "\1\uffff\1\51\1\57\1\uffff\2\51\1\uffff\1\51\1\72\1\51\1\75\2\uffff"+
        "\5\51\1\uffff\1\51\3\uffff\5\51\2\uffff\1\51\5\uffff\1\120\2\uffff"+
        "\1\121\1\125\4\uffff\1\51\2\uffff\10\51\3\uffff\1\51\1\142\1\uffff"+
        "\1\143\10\51\1\156\2\51\1\161\1\162\2\51\1\uffff\1\51\3\uffff\1"+
        "\167\2\uffff\4\51\1\175\3\51\1\u0082\3\51\2\uffff\7\51\1\u008e\2"+
        "\51\1\uffff\2\51\2\uffff\1\51\1\u0094\1\u0095\2\uffff\5\51\1\uffff"+
        "\1\u009b\1\51\1\u009f\1\51\1\uffff\1\51\1\u00a2\1\51\1\u00a4\1\51"+
        "\1\u00a7\4\51\1\u00ac\1\uffff\2\51\1\u00af\1\51\1\u00b1\2\uffff"+
        "\3\51\1\u00b6\1\51\1\uffff\3\51\1\uffff\2\51\1\uffff\1\51\1\uffff"+
        "\2\51\1\uffff\3\51\1\u00c3\1\uffff\1\u00c4\1\51\1\uffff\1\51\1\uffff"+
        "\4\51\1\uffff\3\51\1\u00ce\10\51\2\uffff\1\u00d7\1\51\1\u00d9\1"+
        "\u00da\5\51\1\uffff\1\u00e1\1\u00e2\1\u00e3\3\51\1\u00e7\1\51\1"+
        "\uffff\1\u00e9\2\uffff\2\51\1\u00ec\1\u00ed\1\u00ee\1\51\3\uffff"+
        "\3\51\1\uffff\1\51\1\uffff\1\u00f4\1\51\3\uffff\1\u00f6\1\51\1\u00f8"+
        "\1\u00f9\1\51\1\uffff\1\u00fb\1\uffff\1\51\2\uffff\1\51\1\uffff"+
        "\2\51\1\u0100\1\51\1\uffff\5\51\1\u0107\1\uffff";
    static final String DFA10_eofS =
        "\u0108\uffff";
    static final String DFA10_minS =
        "\1\11\1\162\1\72\1\uffff\2\141\1\uffff\1\141\1\55\1\145\1\43\2\uffff"+
        "\1\115\1\145\1\153\1\157\1\151\1\uffff\1\156\3\uffff\1\150\1\165"+
        "\1\146\1\141\1\154\2\uffff\1\145\5\uffff\1\60\2\uffff\1\0\1\52\4"+
        "\uffff\1\141\2\uffff\1\164\1\170\1\160\1\163\1\144\1\143\1\145\1"+
        "\163\3\uffff\1\146\1\43\1\uffff\1\43\1\154\1\155\1\151\1\156\1\157"+
        "\2\162\1\151\1\43\2\145\2\43\1\163\1\154\1\uffff\1\167\3\uffff\1"+
        "\57\2\uffff\1\155\2\141\1\151\1\43\1\150\1\137\1\150\1\43\1\143"+
        "\1\145\1\141\2\uffff\1\145\1\157\1\160\1\171\1\164\1\156\1\155\1"+
        "\43\1\163\1\161\1\uffff\1\156\1\162\2\uffff\1\164\2\43\2\uffff\1"+
        "\155\1\164\1\155\1\156\1\151\1\uffff\1\43\1\150\1\43\1\141\1\uffff"+
        "\1\165\1\43\1\165\1\43\1\166\1\43\1\137\2\145\1\164\1\43\1\uffff"+
        "\1\164\1\165\1\43\1\151\1\43\2\uffff\1\141\1\145\1\157\1\43\1\156"+
        "\1\uffff\1\141\1\165\1\146\1\uffff\1\143\1\164\1\uffff\1\154\1\uffff"+
        "\1\145\1\162\1\uffff\1\162\1\170\1\162\1\43\1\uffff\1\43\1\145\1"+
        "\uffff\1\145\1\uffff\2\162\1\144\1\162\1\uffff\1\147\1\163\1\154"+
        "\1\43\1\164\1\145\1\164\1\121\2\165\2\164\2\uffff\1\43\1\163\2\43"+
        "\1\145\1\165\1\163\1\150\1\145\1\uffff\3\43\1\165\2\154\1\43\1\110"+
        "\1\uffff\1\43\2\uffff\2\154\3\43\1\104\3\uffff\1\157\2\145\1\uffff"+
        "\1\145\1\uffff\1\43\1\145\3\uffff\1\43\1\164\2\43\1\170\1\uffff"+
        "\1\43\1\uffff\1\145\2\uffff\1\124\1\uffff\1\163\1\157\1\43\1\123"+
        "\1\uffff\1\164\1\162\1\151\1\156\1\147\1\43\1\uffff";
    static final String DFA10_maxS =
        "\1\175\1\162\1\72\1\uffff\1\151\1\141\1\uffff\1\170\1\76\1\157\1"+
        "\172\2\uffff\1\115\1\165\1\153\1\157\1\162\1\uffff\1\156\3\uffff"+
        "\1\157\1\165\1\156\1\141\1\154\2\uffff\1\145\5\uffff\1\71\2\uffff"+
        "\1\uffff\1\57\4\uffff\1\145\2\uffff\1\164\1\170\1\160\1\163\1\144"+
        "\1\143\1\164\1\163\3\uffff\1\146\1\172\1\uffff\1\172\1\154\1\155"+
        "\1\151\1\165\1\157\2\162\1\151\1\172\2\145\2\172\1\163\1\154\1\uffff"+
        "\1\167\3\uffff\1\57\2\uffff\1\155\2\141\1\151\1\172\1\150\1\137"+
        "\1\150\1\172\1\143\1\145\1\141\2\uffff\1\145\1\157\1\160\1\171\1"+
        "\166\1\156\1\155\1\172\1\163\1\161\1\uffff\1\156\1\162\2\uffff\1"+
        "\164\2\172\2\uffff\1\155\1\164\1\155\1\156\1\151\1\uffff\1\172\1"+
        "\162\1\172\1\141\1\uffff\1\165\1\172\1\165\1\172\1\166\1\172\1\137"+
        "\2\145\1\164\1\172\1\uffff\1\164\1\165\1\172\1\151\1\172\2\uffff"+
        "\1\141\1\145\1\157\1\172\1\156\1\uffff\1\141\1\165\1\146\1\uffff"+
        "\1\143\1\164\1\uffff\1\154\1\uffff\1\145\1\162\1\uffff\1\162\1\170"+
        "\1\162\1\172\1\uffff\1\172\1\145\1\uffff\1\145\1\uffff\2\162\1\144"+
        "\1\162\1\uffff\1\147\1\163\1\154\1\172\1\164\1\145\1\164\1\121\2"+
        "\165\2\164\2\uffff\1\172\1\163\2\172\1\145\1\165\1\163\1\150\1\145"+
        "\1\uffff\3\172\1\165\2\154\1\172\1\110\1\uffff\1\172\2\uffff\2\154"+
        "\3\172\1\104\3\uffff\1\157\2\145\1\uffff\1\145\1\uffff\1\172\1\145"+
        "\3\uffff\1\172\1\164\2\172\1\170\1\uffff\1\172\1\uffff\1\145\2\uffff"+
        "\1\124\1\uffff\1\163\1\157\1\172\1\123\1\uffff\1\164\1\162\1\151"+
        "\1\156\1\147\1\172\1\uffff";
    static final String DFA10_acceptS =
        "\3\uffff\1\3\2\uffff\1\6\4\uffff\1\13\1\14\5\uffff\1\24\1\uffff"+
        "\1\26\1\27\1\30\5\uffff\1\47\1\55\1\uffff\1\66\1\67\1\70\1\71\1"+
        "\72\1\uffff\1\74\1\76\2\uffff\1\105\1\106\1\107\1\110\1\uffff\1"+
        "\75\1\2\10\uffff\1\10\1\112\1\104\2\uffff\1\12\20\uffff\1\55\1\uffff"+
        "\1\73\1\77\1\103\1\uffff\1\111\1\100\14\uffff\1\46\1\15\12\uffff"+
        "\1\33\2\uffff\1\37\1\50\3\uffff\1\102\1\101\5\uffff\1\57\4\uffff"+
        "\1\41\13\uffff\1\35\5\uffff\1\44\1\56\5\uffff\1\5\3\uffff\1\36\2"+
        "\uffff\1\52\1\uffff\1\20\2\uffff\1\54\4\uffff\1\23\2\uffff\1\51"+
        "\1\uffff\1\43\4\uffff\1\32\14\uffff\1\64\1\42\11\uffff\1\53\10\uffff"+
        "\1\25\1\uffff\1\1\1\40\6\uffff\1\60\1\62\1\11\3\uffff\1\31\1\uffff"+
        "\1\34\2\uffff\1\45\1\7\1\16\5\uffff\1\4\1\uffff\1\61\1\uffff\1\21"+
        "\1\22\1\uffff\1\17\4\uffff\1\63\6\uffff\1\65";
    static final String DFA10_specialS =
        "\47\uffff\1\0\u00e0\uffff}>";
    static final String[] DFA10_transitionS = {
            "\2\54\1\uffff\2\54\22\uffff\1\54\1\45\1\47\1\42\2\uffff\1\37"+
            "\1\46\1\13\1\14\1\35\1\44\1\6\1\10\1\43\1\50\12\53\1\2\1\3\1"+
            "\uffff\1\34\2\uffff\1\41\6\51\1\12\5\51\1\15\15\51\1\22\1\uffff"+
            "\1\24\1\uffff\1\52\1\uffff\1\33\1\51\1\20\1\11\1\7\1\21\1\1"+
            "\1\5\1\31\2\51\1\32\1\4\1\36\2\51\1\30\1\16\1\17\1\27\1\23\5"+
            "\51\1\25\1\40\1\26",
            "\1\55",
            "\1\56",
            "",
            "\1\62\3\uffff\1\60\3\uffff\1\61",
            "\1\63",
            "",
            "\1\65\12\uffff\1\67\1\uffff\1\64\11\uffff\1\66",
            "\1\71\2\uffff\12\53\4\uffff\1\70",
            "\1\73\11\uffff\1\74",
            "\2\51\13\uffff\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32"+
            "\51",
            "",
            "",
            "\1\76",
            "\1\100\17\uffff\1\77",
            "\1\101",
            "\1\102",
            "\1\105\5\uffff\1\104\2\uffff\1\103",
            "",
            "\1\106",
            "",
            "",
            "",
            "\1\110\6\uffff\1\107",
            "\1\111",
            "\1\113\7\uffff\1\112",
            "\1\114",
            "\1\115",
            "",
            "",
            "\1\117",
            "",
            "",
            "",
            "",
            "",
            "\12\53",
            "",
            "",
            "\0\122",
            "\1\124\4\uffff\1\123",
            "",
            "",
            "",
            "",
            "\1\126\3\uffff\1\127",
            "",
            "",
            "\1\130",
            "\1\131",
            "\1\132",
            "\1\133",
            "\1\134",
            "\1\135",
            "\1\137\16\uffff\1\136",
            "\1\140",
            "",
            "",
            "",
            "\1\141",
            "\2\51\13\uffff\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32"+
            "\51",
            "",
            "\2\51\13\uffff\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32"+
            "\51",
            "\1\144",
            "\1\145",
            "\1\146",
            "\1\150\1\uffff\1\147\4\uffff\1\151",
            "\1\152",
            "\1\153",
            "\1\154",
            "\1\155",
            "\2\51\13\uffff\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32"+
            "\51",
            "\1\157",
            "\1\160",
            "\2\51\13\uffff\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32"+
            "\51",
            "\2\51\13\uffff\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32"+
            "\51",
            "\1\163",
            "\1\164",
            "",
            "\1\165",
            "",
            "",
            "",
            "\1\166",
            "",
            "",
            "\1\170",
            "\1\171",
            "\1\172",
            "\1\173",
            "\2\51\13\uffff\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\17"+
            "\51\1\174\12\51",
            "\1\176",
            "\1\177",
            "\1\u0080",
            "\2\51\13\uffff\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\21"+
            "\51\1\u0081\10\51",
            "\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "",
            "",
            "\1\u0086",
            "\1\u0087",
            "\1\u0088",
            "\1\u0089",
            "\1\u008a\1\uffff\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "\2\51\13\uffff\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32"+
            "\51",
            "\1\u008f",
            "\1\u0090",
            "",
            "\1\u0091",
            "\1\u0092",
            "",
            "",
            "\1\u0093",
            "\2\51\13\uffff\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32"+
            "\51",
            "\2\51\13\uffff\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32"+
            "\51",
            "",
            "",
            "\1\u0096",
            "\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "\1\u009a",
            "",
            "\2\51\13\uffff\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32"+
            "\51",
            "\1\u009c\1\u009e\10\uffff\1\u009d",
            "\2\51\13\uffff\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32"+
            "\51",
            "\1\u00a0",
            "",
            "\1\u00a1",
            "\2\51\13\uffff\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32"+
            "\51",
            "\1\u00a3",
            "\2\51\13\uffff\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32"+
            "\51",
            "\1\u00a5",
            "\2\51\13\uffff\12\51\7\uffff\32\51\4\uffff\1\u00a6\1\uffff"+
            "\32\51",
            "\1\u00a8",
            "\1\u00a9",
            "\1\u00aa",
            "\1\u00ab",
            "\2\51\13\uffff\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32"+
            "\51",
            "",
            "\1\u00ad",
            "\1\u00ae",
            "\2\51\13\uffff\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32"+
            "\51",
            "\1\u00b0",
            "\2\51\13\uffff\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32"+
            "\51",
            "",
            "",
            "\1\u00b2",
            "\1\u00b3",
            "\1\u00b4",
            "\2\51\13\uffff\12\51\7\uffff\32\51\4\uffff\1\u00b5\1\uffff"+
            "\32\51",
            "\1\u00b7",
            "",
            "\1\u00b8",
            "\1\u00b9",
            "\1\u00ba",
            "",
            "\1\u00bb",
            "\1\u00bc",
            "",
            "\1\u00bd",
            "",
            "\1\u00be",
            "\1\u00bf",
            "",
            "\1\u00c0",
            "\1\u00c1",
            "\1\u00c2",
            "\2\51\13\uffff\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32"+
            "\51",
            "",
            "\2\51\13\uffff\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32"+
            "\51",
            "\1\u00c5",
            "",
            "\1\u00c6",
            "",
            "\1\u00c7",
            "\1\u00c8",
            "\1\u00c9",
            "\1\u00ca",
            "",
            "\1\u00cb",
            "\1\u00cc",
            "\1\u00cd",
            "\2\51\13\uffff\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32"+
            "\51",
            "\1\u00cf",
            "\1\u00d0",
            "\1\u00d1",
            "\1\u00d2",
            "\1\u00d3",
            "\1\u00d4",
            "\1\u00d5",
            "\1\u00d6",
            "",
            "",
            "\2\51\13\uffff\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32"+
            "\51",
            "\1\u00d8",
            "\2\51\13\uffff\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32"+
            "\51",
            "\2\51\13\uffff\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32"+
            "\51",
            "\1\u00db",
            "\1\u00dc",
            "\1\u00dd",
            "\1\u00de",
            "\1\u00df",
            "",
            "\2\51\13\uffff\12\51\7\uffff\10\51\1\u00e0\21\51\4\uffff\1"+
            "\51\1\uffff\32\51",
            "\2\51\13\uffff\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32"+
            "\51",
            "\2\51\13\uffff\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32"+
            "\51",
            "\1\u00e4",
            "\1\u00e5",
            "\1\u00e6",
            "\2\51\13\uffff\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32"+
            "\51",
            "\1\u00e8",
            "",
            "\2\51\13\uffff\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32"+
            "\51",
            "",
            "",
            "\1\u00ea",
            "\1\u00eb",
            "\2\51\13\uffff\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32"+
            "\51",
            "\2\51\13\uffff\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32"+
            "\51",
            "\2\51\13\uffff\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32"+
            "\51",
            "\1\u00ef",
            "",
            "",
            "",
            "\1\u00f0",
            "\1\u00f1",
            "\1\u00f2",
            "",
            "\1\u00f3",
            "",
            "\2\51\13\uffff\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32"+
            "\51",
            "\1\u00f5",
            "",
            "",
            "",
            "\2\51\13\uffff\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32"+
            "\51",
            "\1\u00f7",
            "\2\51\13\uffff\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32"+
            "\51",
            "\2\51\13\uffff\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32"+
            "\51",
            "\1\u00fa",
            "",
            "\2\51\13\uffff\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32"+
            "\51",
            "",
            "\1\u00fc",
            "",
            "",
            "\1\u00fd",
            "",
            "\1\u00fe",
            "\1\u00ff",
            "\2\51\13\uffff\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32"+
            "\51",
            "\1\u0101",
            "",
            "\1\u0102",
            "\1\u0103",
            "\1\u0104",
            "\1\u0105",
            "\1\u0106",
            "\2\51\13\uffff\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32"+
            "\51",
            ""
    };

    static final short[] DFA10_eot = DFA.unpackEncodedString(DFA10_eotS);
    static final short[] DFA10_eof = DFA.unpackEncodedString(DFA10_eofS);
    static final char[] DFA10_min = DFA.unpackEncodedStringToUnsignedChars(DFA10_minS);
    static final char[] DFA10_max = DFA.unpackEncodedStringToUnsignedChars(DFA10_maxS);
    static final short[] DFA10_accept = DFA.unpackEncodedString(DFA10_acceptS);
    static final short[] DFA10_special = DFA.unpackEncodedString(DFA10_specialS);
    static final short[][] DFA10_transition;

    static {
        int numStates = DFA10_transitionS.length;
        DFA10_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA10_transition[i] = DFA.unpackEncodedString(DFA10_transitionS[i]);
        }
    }

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = DFA10_eot;
            this.eof = DFA10_eof;
            this.min = DFA10_min;
            this.max = DFA10_max;
            this.accept = DFA10_accept;
            this.special = DFA10_special;
            this.transition = DFA10_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | AND | OR | AT | AL | DOT | PLUS | NOT | DDOTS | QUOTE | DOUBLEQUOTE | BAR | DOUBLEBAR | TRIPLEBAR | DQVALUE | OPERATION | ID | IDESC | NUMBER | WS | ML_COMMENT | OL_COMMENT );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA10_39 = input.LA(1);

                        s = -1;
                        if ( ((LA10_39>='\u0000' && LA10_39<='\uFFFF')) ) {s = 82;}

                        else s = 81;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 10, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}