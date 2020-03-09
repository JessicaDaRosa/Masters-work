package logic;

import java.util.ArrayList;

public class Node {
    private String name;
    private ArrayList<Node> parents;
    private ArrayList<Node> sons;
    private ArrayList<Formula> marks;



    public Node(String name) {
        this.name = name;
        this.parents = new ArrayList<>();
        this.sons = new ArrayList<>();
        this.marks = new ArrayList<>();
    }

    public Node(String name, ArrayList<Node> parents, ArrayList<Node> sons) {
        this.name = name;
        this.parents = parents;
        this.sons = sons;
        this.marks = new ArrayList<>();
    }

    public Node(String name, ArrayList<Node> parents, ArrayList<Node> sons, ArrayList<Formula> marks) {
        this.name = name;
        this.parents = parents;
        this.sons = sons;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Node> getParents() {
        return parents;
    }

    public ArrayList<Node> getSons() {
        return sons;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setParents(ArrayList<Node> parents) {
        this.parents = parents;
    }

    public void setSons(ArrayList<Node> sons) {
        this.sons = sons;
    }

    public void addParent(Node p) {
        this.parents.add(p);
    }

    public void addParents(ArrayList<Node> p) {
        this.parents.addAll(p);
    }

    public void addSon(Node s) {
        this.sons.add(s);
    }

    public void addSons(ArrayList<Node> s) {
        this.sons.addAll(s);
    }

    public void setMarks(ArrayList<Formula> marks) {
        this.marks = marks;
    }

    public boolean hasMark(Formula f) {
        if (marks.indexOf(f) == -1) return false;
        return true;
    }

    public void mark(Formula f) {
        if (marks.indexOf(f) == -1) marks.add(f);
    }

    public void clearMarks() {
        marks.clear();
    }

    public void removeMark(Formula f) {
        marks.remove(f);
    }

    public Node() {
        super();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
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
    public String toString() {
        return super.toString();
    }
}
