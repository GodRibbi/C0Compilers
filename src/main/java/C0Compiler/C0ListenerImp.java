package C0Compiler;

import C0Compiler.antlr.C0BaseListener;
import C0Compiler.antlr.C0Parser;




import java.util.*;

public class C0ListenerImp extends C0BaseListener {
    // 存储变量的值
    private Map<String, Variable> variable;
    private Map<String, Integer> function;
    private List<Order> orderList;
    private Stack<Integer> whileindex;
    private Stack<Integer> ifindex;
    private Stack<Integer> elseindex;
    private Stack<Integer> funindex;
    private int funerror=0;
    private int layer=0;
    private boolean fstvar;
    private int maincalpos;
    private int line=1;
    private int returnsize;
    public C0ListenerImp() {
        orderList = new ArrayList<>();
        variable=new HashMap<>();
        function=new HashMap<>();
        whileindex=new Stack<>();
        ifindex=new Stack<>();
        elseindex=new Stack<>();
        funindex=new Stack<>();
        fstvar=true;
    }
    public void printOrder(){
        for (Order order : orderList) {
            String out=order.getFct()+"\t"+order.getFst()+"\t"+order.getSed();
            System.out.println(out);
        }
    }
    @Override public void enterProgram(C0Parser.ProgramContext ctx) {
        if(ctx.var().size()==0){
            layer++;
            fstvar=false;
            orderList.add(new Order(line++,Fct.INT,0,1));
            orderList.add(new Order(line++,Fct.CAL,0,0));
            maincalpos=orderList.size();
            returnsize=1;
        }
    }
    @Override public void enterVar(C0Parser.VarContext ctx) {
        if (fstvar){
            orderList.add(new Order(line++,Fct.INT,0,ctx.ID().size()+1));
            returnsize=ctx.ID().size()+1;
            for (int i=0;i<ctx.ID().size();i++){
                variable.put(ctx.ID(i).getText(),new Variable(0,i));
            }
            orderList.add(new Order(line++,Fct.CAL,0,0));
            maincalpos=orderList.size();
            layer++;
            fstvar=false;
        }
        else{
            orderList.add(new Order(line++,Fct.INT,0,ctx.ID().size()));
            for (int i=0;i<ctx.ID().size();i++){
                variable.put(ctx.ID(i).getText(),new Variable(layer,i));
            }
        }
    }
    @Override public void enterFunvoid(C0Parser.FunvoidContext ctx) {
        if(funerror>0) {
            int index=funindex.pop();
            orderList.get(index-1).setSed(orderList.size()+1);
            funerror--;
        }
        function.put(ctx.ID().getText(),orderList.size());
        layer++;
    }
    @Override public void exitFunvoid(C0Parser.FunvoidContext ctx) {
        orderList.add(new Order(line++,Fct.RET,0,0));
    }
    @Override public void enterFunint(C0Parser.FunintContext ctx) {
        if(funerror>0) {
            int index=funindex.pop();
            orderList.get(index-1).setSed(orderList.size()+1);
            funerror--;
        }
        function.put(ctx.ID().getText(),orderList.size());
        layer++;
    }
    @Override public void exitFunint(C0Parser.FunintContext ctx) {
        orderList.add(new Order(line++,Fct.RET,0,0));
    }
    @Override public void enterMain(C0Parser.MainContext ctx) {
        orderList.get(maincalpos-1).setSed(orderList.size()+1);
        layer=1;
    }
    @Override public void exitMain(C0Parser.MainContext ctx) {
        orderList.add(new Order(line++,Fct.RET,0,0));
    }
    @Override public void exitIfsys(C0Parser.IfsysContext ctx) {
        if(!ctx.elsesyss().isEmpty()){
            int index=ifindex.pop();
            orderList.get(index-1).setSed(orderList.size()+1);
        }
    }
    @Override public void exitIfsysadd(C0Parser.IfsysaddContext ctx) {
        orderList.add(new Order(line++,Fct.JPC,0,0));
        ifindex.push(orderList.size());
    }

    @Override public void enterElsesyss(C0Parser.ElsesyssContext ctx) {
        orderList.add(new Order(line++,Fct.JMP,0,0));
        elseindex.push(orderList.size());
        int index=ifindex.pop();
        orderList.get(index-1).setSed(orderList.size()+1);
    }

    @Override public void exitElsesyss(C0Parser.ElsesyssContext ctx) {
        int index=elseindex.pop();
        orderList.get(index-1).setSed(orderList.size()+1);
    }

    @Override public void enterWhilesys(C0Parser.WhilesysContext ctx) {
        if(ctx.op.getType() == C0Parser.ID){
            orderList.add(new Order(line++,Fct.LOD,
                    variable.get(ctx.op.getText()).getLayer(),
                    variable.get(ctx.op.getText()).getPos()));
        }
        else if(ctx.op.getType() == C0Parser.INT){
            orderList.add(new Order(line++,Fct.LIT,layer,Integer.parseInt(ctx.op.getText())));
        }
        orderList.add(new Order(line++,Fct.JPC,0,0));
        whileindex.push(orderList.size());
    }

    @Override public void exitWhilesys(C0Parser.WhilesysContext ctx) {
        int index=whileindex.pop();
        orderList.get(index-1).setSed(orderList.size()+2);
        orderList.add(new Order(line++,Fct.JMP,0,index-1));
    }

    @Override public void exitValue(C0Parser.ValueContext ctx) {
        orderList.add(new Order(line++,Fct.STO,
                variable.get(ctx.ID().getText()).getLayer(),
                variable.get(ctx.ID().getText()).getPos()));
    }

    @Override public void exitReturnsys(C0Parser.ReturnsysContext ctx) {
        orderList.add(new Order(line++,Fct.STO,0,returnsize-1));
    }

    @Override public void exitRead(C0Parser.ReadContext ctx) {
        orderList.add(new Order(line++,Fct.RED,0,0));
        orderList.add(new Order(line++,Fct.STO,
                variable.get(ctx.ID().getText()).getLayer(),
                variable.get(ctx.ID().getText()).getPos()));
    }

    @Override public void exitWrite(C0Parser.WriteContext ctx) {
        orderList.add(new Order(line++,Fct.WRT,0,0));
    }

    @Override public void exitExpadd(C0Parser.ExpaddContext ctx) {
        if (ctx.AddSub().getText().equals("+")){
            orderList.add(new Order(line++,Fct.ADD,0,0));
        }
        else if(ctx.AddSub().getText().equals("-")){
            orderList.add(new Order(line++,Fct.SUB,0,0));
        }
    }

    @Override public void exitTermadd(C0Parser.TermaddContext ctx) {
        if (ctx.Mul().getText().equals("*")){
            orderList.add(new Order(line++,Fct.MUL,0,0));
        }
        else if(ctx.Mul().getText().equals("/")){
            orderList.add(new Order(line++,Fct.DIV,0,0));
        }
    }

    @Override public void enterIdfun(C0Parser.IdfunContext ctx) {
        orderList.add(new Order(line++,Fct.LOD,
                variable.get(ctx.getText()).getLayer(),
                variable.get(ctx.getText()).getPos()));
    }
  
    @Override public void enterIntfun(C0Parser.IntfunContext ctx) {
        orderList.add(new Order(line++,Fct.LIT,layer,Integer.parseInt(ctx.getText())));
    }
   
    @Override public void enterPerFun(C0Parser.PerFunContext ctx) {
        if(function.containsKey(ctx.ID().getText())){
            orderList.add(new Order(line++,Fct.CAL,0,function.get(ctx.ID().getText())+1));
        }
        else{
            orderList.add(new Order(line++,Fct.CAL,0,0));
            funindex.push(orderList.size());
            funerror++;
        }
    }
  
    @Override public void exitPerFun(C0Parser.PerFunContext ctx) {
        orderList.add(new Order(line++,Fct.LOD,0,returnsize-1));
    }

   
}