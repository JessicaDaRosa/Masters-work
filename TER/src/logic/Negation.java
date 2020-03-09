package logic;

import b.f.T;

import java.util.ArrayList;

public class Negation extends Formula {

    private Formula f;

    public Negation(Formula parent, Formula f) {
        super(parent);
        this.f = f;
    }

    protected Negation() {
        super();
    }

    public Negation(Formula parent) {
        super(parent);
    }

    public Negation(Formula parent, Interpretation i, ArrayList<Node> marks) {
        super(parent, i, marks);
    }

    @Override
    public Interpretation getI() {
        return super.getI();
    }

    @Override
    public void setI(Interpretation i) {
        super.setI(i);
    }

    @Override
    public void setMarks(ArrayList<Node> marks) {
        super.setMarks(marks);
    }

    @Override
    public Formula getParent() {
        return super.getParent();
    }

    @Override
    public void setParent(Formula parent) {
        super.setParent(parent);
    }

    @Override
    public void mark(Node e) {
        super.mark(e);
    }

    public void setF(Formula f) {
        this.f = f;
    }

    public Formula getF() {
        return f;
    }

    @Override
    public ArrayList<Node> getMarks() {
        return super.getMarks();
    }

    @Override
    public String toString() {
        return "¬(" + f.toString() + ")";
    }


    @Override
    public boolean isMarkedBy(Node e) {
        return super.isMarkedBy(e);
    }

    @Override
    public Formula reWrite() {

        return this;
    }

    @Override
    public boolean hasParent() {
        return super.hasParent();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
