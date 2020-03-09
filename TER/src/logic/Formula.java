package logic;

import java.util.ArrayList;

public abstract class  Formula {

    private Formula parent;
    private Interpretation i; //TODO marquer la formule a partir de l'ajout de l'interpretation
    private ArrayList<Node> marks;

    public Formula(){

    }

    public Formula(Formula parent) {
        this.parent = parent;
    }

    public Formula(Formula parent, Interpretation i, ArrayList<Node> marks) {
        this.parent = parent;
        this.i = i;
        this.marks = marks;
    }

    public Interpretation getI() {
        return i;
    }

    public ArrayList<Node> getMarks() {
        return marks;
    }

    public void setI(Interpretation i) {
        this.i = i;
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

    public boolean isMarkedBy(Node e){
        if(marks.indexOf(e) == -1) return false;
        return true;
    }

    public boolean hasParent(){
        if (this.parent != null) return false;
        return true;
    }

    public abstract String toString();

    public abstract Formula reWrite();

}
