package logic;

import java.util.ArrayList;
import java.util.Objects;

public class Atom extends Formula {
    private String name;

    public void Atom(String n){
        this.name = n;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public Formula reWrite(Formula f) {
        return null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Atom)) return false;
        Atom atom = (Atom) o;
        return name.equals(atom.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    public Atom(String name) {
        this.name = name;
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
    public boolean hasParent() {
        return super.hasParent();
    }

    @Override
    public Formula reWrite() {
        return this;
    }
}
