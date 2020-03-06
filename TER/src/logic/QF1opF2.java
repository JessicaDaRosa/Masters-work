package logic;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof QF1opF2)) return false;
        QF1opF2 qf1opF2 = (QF1opF2) o;
        return Objects.equals(q, qf1opF2.q) &&
                Objects.equals(op, qf1opF2.op) &&
                Objects.equals(f1, qf1opF2.f1) &&
                Objects.equals(f2, qf1opF2.f2);
    }

    @Override
    public int hashCode() {
        return Objects.hash(q, op, f1, f2);
    }


}
