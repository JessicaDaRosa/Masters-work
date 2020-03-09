package logic;

import java.util.ArrayList;
import java.util.Objects;

public class QopF extends Formula {

    private Quantificator q;
    private Operator op;
    private Formula f;

    public Formula getF() {
        return f;
    }

    public Operator getOp() {
        return op;
    }

    public Quantificator getQ() {
        return q;
    }

    public void setF(Formula f) {
        this.f = f;
    }

    public void setOp(Operator op) {
        this.op = op;
    }

    public void setQ(Quantificator q) {
        this.q = q;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof QopF)) return false;
        QopF qopF = (QopF) o;
        return Objects.equals(getQ(), qopF.getQ()) &&
                Objects.equals(getOp(), qopF.getOp()) &&
                Objects.equals(getF(), qopF.getF());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getQ(), getOp(), getF());
    }

    //TODO test the output when q an op are null/void
    @Override
    public String toString() {
        return q.toString() + op.toString() + "("+f.toString()+")";
    }

    public QopF(Quantificator q, Operator op, Formula f) {
        this.q = q;
        this.op = op;
        this.f = f;
    }

    @Override
    public Interpretation getI() {
        return super.getI();
    }

    @Override
    public ArrayList<Node> getMarks() {
        return super.getMarks();
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

    @Override
    public boolean isMarkedBy(Node e) {
        return super.isMarkedBy(e);
    }

    @Override
    public Formula reWrite() {
        //TODO
        return null;
    }

    public QopF(Formula parent, Interpretation i, ArrayList<Node> marks) {
        super(parent, i, marks);
    }

    public QopF() {
        super();
    }

    public QopF(Formula parent) {
        super(parent);
    }

    @Override
    public boolean hasParent() {
        return super.hasParent();
    }
}
