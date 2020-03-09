package logic;

import java.util.ArrayList;
import java.util.Objects;

public class QF1opF2 extends Formula {

    private Quantificator q;
    private Operator op;
    private Formula f1;
    private Formula f2;

    public QF1opF2(Quantificator q, Operator op, Formula f1, Formula f2, Formula parent) {
        super(parent);
        this.q = q;
        this.op = op;
        this.f1 = f1;
        this.f2 = f2;
    }

    public void setQ(Quantificator q) {
        this.q = q;
    }

    public void setOp(Operator op) {
        this.op = op;
    }

    public void setF1(Formula f1) {
        this.f1 = f1;
    }

    public void setF2(Formula f2) {
        this.f2 = f2;
    }

    public Operator getOp() {
        return op;
    }

    public Quantificator getQ() {
        return q;
    }

    public Formula getF1() {
        return f1;
    }

    public Formula getF2() {
        return f2;
    }

    @Override
    public String toString() {
        return q.toString()+"("+f1.toString()+op.toString()+f2.toString()+")";
    }

    @Override
    public Formula reWrite() {
        return null;
        //Todo
    }

    public QF1opF2() {
        super();
    }

    public QF1opF2(Formula parent) {
        super(parent);
    }

    public QF1opF2(Formula parent, Interpretation i, ArrayList<Node> marks) {
        super(parent, i, marks);
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof QF1opF2)) return false;
        QF1opF2 qf1opF2 = (QF1opF2) o;
        return getQ().equals(qf1opF2.getQ()) &&
                getOp().equals(qf1opF2.getOp()) &&
                getF1().equals(qf1opF2.getF1()) &&
                getF2().equals(qf1opF2.getF2());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getQ(), getOp(), getF1(), getF2());
    }

    @Override
    public boolean hasParent() {
        return super.hasParent();
    }
}
