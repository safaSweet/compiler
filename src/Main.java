

import AST.*;
import AST.Functions.Function;
//import generat.generate;
import lexarAndParser.lexerDart;
import lexarAndParser.parserD;
import org.antlr.v4.runtime.CharStream;

import static org.antlr.v4.runtime.CharStreams.fromFileName;

import org.antlr.v4.runtime.CommonTokenStream;

import java.io.IOException;

import VISITOR.MyVisitor;
import org.antlr.v4.runtime.tree.ParseTree;
import symbolTable.Semantic;
import symbolTable.SymbolTable;

public class Main {


    public static void main(String[] args) throws IOException {
        try{
text_editor_controller t=new text_editor_controller();

        String file = "tests/exampleDesign.txt";

        CharStream c = fromFileName(file);
        lexerDart lexer = new lexerDart(c);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        parserD parser = new parserD(tokens);
        ParseTree ast = parser.main();
        MyVisitor Examplevisitor = new MyVisitor();

        main l = (main)  Examplevisitor.visit(ast);


            SymbolTable symbolTable = SymbolTable.getInstance();
//        System.out.println("\n\n\n"+"******* GENERATION CODE *******"+"\n");


                l.toString();



        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}