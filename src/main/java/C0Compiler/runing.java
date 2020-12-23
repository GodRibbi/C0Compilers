package C0Compiler;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CodePointCharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import C0Compiler.antlr.*;

import java.io.File;
import java.io.FileInputStream;

public class runing {

    public static void run(String expr) throws Exception{

        //对每一个输入的字符串，构造一个 ANTLRStringStream 流 in
        CodePointCharStream in = CharStreams.fromString(expr);
        //用 in 构造词法分析器 lexer，词法分析的作用是产生记号
        C0Lexer lexer = new C0Lexer(in);

        //用词法分析器 lexer 构造一个记号流 tokens
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        //再使用 tokens 构造语法分析器 parser,至此已经完成词法分析和语法分析的准备工作
        C0Parser parser = new C0Parser(tokens);
        ParseTree tree = parser.prog(); // 针对init规则，开始语法分析

        ParseTreeWalker walker = new ParseTreeWalker();
        C0ListenerImp tl=new C0ListenerImp();
        System.out.println();
        walker.walk(tl, tree);
        
        tl.printOrder();
        System.out.println(tree.toStringTree(parser)); // 用LISP风格打印生成的树
//        testListener listener = new testListenerImp();
//        tree.
    }

    public static void main(String[] args) throws Exception{
        File file=new File("data\\code.txt");
        Long fileLengthLong = file.length();
        byte[] fileContent = new byte[fileLengthLong.intValue()];
        try {
            FileInputStream inputStream = new FileInputStream(file);
            inputStream.read(fileContent);
            inputStream.close();
        } catch (Exception e) {
            // TODO: handle exception
        }
        String string = new String(fileContent);
        System.out.println(string);
        run(string);

    }
}
