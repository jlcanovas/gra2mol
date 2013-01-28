import java.io.*;
import org.antlr.runtime.*;
import org.antlr.runtime.debug.DebugEventSocketProxy;


public class __Test__ {

    public static void main(String args[]) throws Exception {
        IslandLexer lex = new IslandLexer(new ANTLRFileStream("/Users/jlcanovas/Desktop/eclipse-3.5-64b/workspace/Grammar2Model.examples.Maude2Model/files/src/scripts/output/__Test___input.txt", "UTF8"));
        CommonTokenStream tokens = new CommonTokenStream(lex);

        IslandParser g = new IslandParser(tokens, 49100, null);
        try {
            g.mainRule();
        } catch (RecognitionException e) {
            e.printStackTrace();
        }
    }
}