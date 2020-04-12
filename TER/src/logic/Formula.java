package logic;

import java.util.ArrayList;

public abstract class  Formula {

    private Formula parent;
    private Interpretation i;
    private ArrayList<Node> marks;

    public Formula(Interpretation i){
        this.parent = null;
        this.i = null;
        this.marks = new ArrayList<>();
    }

    public Formula(Formula parent) {
        this.parent = parent;
    }

    public Formula(Formula parent, Interpretation i, ArrayList<Node> marks) {
        this.parent = parent;
        this.i = i;
        this.marks = marks;
    }

    public Formula(Formula parent, Interpretation i) {
        this.parent = parent;
        this.i = i;
        mark(i);
    }

    public Formula() {
        this.parent = null;
        this.i = null;
        this.marks = new ArrayList<>();
    }

    public Interpretation getI() {
        return i;
    }

    public ArrayList<Node> getMarks() {
        return marks;
    }

    public void setI(Interpretation i) {
        this.i = i;
        mark(i);
    }

    public void setMarks(ArrayList<Node> marks) {
        this.marks = marks;
    }

    public Formula getParent() {
        return parent;
    }

    public void setParent(Formula parent) {
        this.parent = parent;
    }

    public void mark(Node e){
        marks.add(e);
    }

    //thecnically this does SAT de la formule par apport a l'interpretation
    private void mark(Interpretation i)
    {   Node temp;
        String meString = this.toString();
        //Going through all the nodes in the graph
        for (int j = 0; j<i.getTree().size(); j++)
        {
            temp = i.getTree().get(j);
            if(temp.isMarkedBy(meString)) this.mark(temp);

        }

    }

    public boolean isMarkedBy(Node e){
        if(marks.indexOf(e) == -1) return false;
        return true;
    }

    public boolean hasParent(){
        if (this.parent != null) return false;
        return true;
    }

    public abstract String toString();

    // formule de reecriture pour le model checking
    public abstract Formula reWrite();

    // formule de reecriture en forme normal de negation
    public abstract Formula toNegation();

    public boolean isInNegationForm(){
         ArrayList<Formula> toCheck= new ArrayList<>();
         toCheck.add(this);
         int previous = 42;
         int checked = 0;
         //collecte de tout les "neuds" de la for,ule dans une liste
         while(previous != toCheck.size())
         {
             previous = toCheck.size();
             if(toCheck.get(checked) instanceof Negation)
             {
                 toCheck.add(((Negation)toCheck.get(checked)).getF());
             }
             if(toCheck.get(checked) instanceof QF1opF2)
             {
                toCheck.add(((QF1opF2)toCheck.get(checked)).getF1());
                toCheck.add(((QF1opF2)toCheck.get(checked)).getF2());

             }
             if(toCheck.get(checked) instanceof QopF)
             {
                toCheck.add(((QopF)toCheck.get(checked)).getF());
             }
             checked++;

         }

        for (Formula formula : toCheck) {
            if (formula instanceof Negation) {
                Negation negation = (Negation) formula;
                if(!(negation.getF() instanceof Atom))
                    return false;
            }
        }
        return true;
    }


}
