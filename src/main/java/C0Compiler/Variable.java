package C0Compiler;

public class Variable {
    int layer;
    int pos;

    public void setLayer(int layer) {
        this.layer = layer;
    }

    public void setPos(int pos) {
        this.pos = pos;
    }

    public int getLayer() {
        return layer;
    }

    public Variable(int layer, int pos) {
        this.layer = layer;
        this.pos = pos;
    }

    public int getPos() {
        return pos;
    }
}
