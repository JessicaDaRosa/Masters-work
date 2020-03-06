package logic;

import java.util.ArrayList;

public class Node {
    private String name;
    ArrayList<Node> parents;
    ArrayList<Node> sons;

    public Node(String name) {
        this.name = name;
        this.parents = new ArrayList<Node>;
        this.sons = new ArrayList<Node>;
    }

    public Node (String name, ArrayList<Node> parents, ArrayList<Node> sons){
        this.name = name;
        this.parents = parents;
        this.sons = sons;
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

    public void addParent(Node p){
        this.parents.add(p);
    }

    public void addParents(ArrayList<Node> p){
        this.parents.addAll(p);
    }
}
