package logic;

import java.util.ArrayList;
import java.util.Objects;

public class Interpretation {

    private ArrayList<Node> tree;
    private Node root;

    public Interpretation() {
        tree = new ArrayList<>();

    }

    public Interpretation(ArrayList<Node> tree, Node root) {
        this.tree = tree;
        this.root = root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }

    public Node getRoot() {
        return root;
    }

    public ArrayList<Node> getTree() {
        return tree;
    }

    public void setTree(ArrayList<Node> tree) {
        this.tree = tree;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Interpretation)) return false;
        Interpretation that = (Interpretation) o;
        return getTree().equals(that.getTree()) &&
                getRoot().equals(that.getRoot());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTree(), getRoot());
    }
}
