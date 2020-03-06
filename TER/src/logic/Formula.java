package logic;

import java.util.ArrayList;

public abstract class  Formula {

    private Formula parent;
    private ArrayList<String> edges; //TODO

    public Formula(Formula parent) {
        this.parent = parent;
    }

    public Formula getParent() {
        return parent;
    }

    public void setParent(Formula parent) {
        this.parent = parent;
    }

    public void mark(){

    }

    public abstract String toString();

    public abstract Formula reWrite();

}
