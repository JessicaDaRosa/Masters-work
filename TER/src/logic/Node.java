package logic;

import java.util.ArrayList;

public class Node {
    private String name;
    private ArrayList<Node> parents;
    private ArrayList<Node> sons;
    private ArrayList<String> marks;



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

    public Node(String name, ArrayList<Node> parents, ArrayList<Node> sons, ArrayList<String> marks) {
        this.name = name;
        this.parents = parents;
        this.sons = sons;
        this.marks = marks;
    }

    public ArrayList<String> getMarks() {
        return marks;
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

    public void setMarks(ArrayList<String> marks) {
        this.marks = marks;
    }

    public boolean hasMark(Formula f) {
        if (marks.indexOf(f) == -1) return false;
        return true;
    }

    public void mark(String f) {
        if (marks.indexOf(f) != -1) marks = new ArrayList<>();
        marks.add(f);
    }

    public void clearMarks() {
        marks.clear();
    }

    public void removeMark(Formula f) {
        marks.remove(f);
    }

    public Node() {
        super();
        marks = new ArrayList<>();
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
    //I'm using the formula in its string form because the formula comparing method uses the parent o the formula to test
    //ans in this case I'm only interested in it's written form
    public boolean isMarkedBy(String formula){
        for (int i = 0; i < this.marks.size() ; i++)
        {
            if (this.marks.get(i).toString().equals(formula))return true;
        }
        return false;
    }
}
