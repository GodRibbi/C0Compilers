package C0Compiler;

public class Order {
    public int line;
    public Fct fct;
    public int fst;
    public int sed;

    public Order(int line, Fct fct, int fst, int sed) {
        this.line = line;
        this.fct = fct;
        this.fst = fst;
        this.sed = sed;
    }

    public int getLine() {
        return line;
    }

    public Fct getFct() {
        return fct;
    }

    public int getFst() {
        return fst;
    }

    public int getSed() {
        return sed;
    }

    public void setLine(int line) {
        this.line = line;
    }

    public void setFct(Fct fct) {
        this.fct = fct;
    }

    public void setFst(int fst) {
        this.fst = fst;
    }

    public void setSed(int sed) {
        this.sed = sed;
    }

    @Override
    public String toString() {
        return  line + ":" +
                "\t" + fct +
                "\t" + fst +
                "\t" + sed +
                '\n';
    }
}

