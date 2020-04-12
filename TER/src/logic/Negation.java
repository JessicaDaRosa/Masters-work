package logic;

import java.util.ArrayList;

public class Negation extends Formula {

    private Formula f;

    public Negation(Formula parent, Formula f) {
        super(parent);
        this.f = f;
    }

    public Negation(Formula parent, Interpretation i, ArrayList<Node> marks, Formula f) {
        super(parent, i, marks);
        this.f = f;
        this.f.setI(i);
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
        if(this.f !=null)this.f.setI(i);
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
        if(this.getI() != null && f.getI() == null)
        {
            this.f.setI(this.getI());
        }
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
        if (this.getF() instanceof Atom) return "¬" + f.toString();
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

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public Formula toNegation() {
        //si mon enfant est aussi une negation on va s'anuller
        if(this.getF() instanceof Negation)
        {
            Formula newson = ((Negation)this.getF()).getF();
            //d'abord on va chercher le parent
            //si le parent est QopF
            if(this.getF() != null && this.getF() instanceof QopF)
            {

                ((QopF)this.getParent()).setF(((Negation) this.getF()).getF());
                ((Negation)this.getF()).getF().setParent(this.getParent());

            }
            return newson;
        }
    }
}
