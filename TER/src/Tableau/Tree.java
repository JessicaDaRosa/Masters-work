package Tableau;
import logic.*;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Objects;

public class Tree {
    ArrayList<Node> tree;
    Node root;

    public void setTree(ArrayList<Node> tree) {
        this.tree = tree;
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

    @Override
    public String toString() {
        String ret = root.toString();
        for(int i = 1; i < tree.size();i++)
        {
            ret = ret + tree.get(i).toString();
        }
        return ret;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Tree)) return false;
        Tree tree = (Tree) o;
        return Objects.equals(getRoot(), tree.getRoot());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getRoot());
    }

    private void create()
    {
        ArrayList<Node> a_traiter = new ArrayList<>();
        ArrayList<Node> traite = new ArrayList<>();
        a_traiter.add(this.root);
        while(a_traiter.size( ) > 0)
        {

        }
    }

    private ArrayList<Node> traiter(Node n)
    {
        int i = hasConjunctionFormula(n);
        ArrayList<Node> ret = new ArrayList<>() ;
        if(!(i==-1))
        {
            if(n.getTo_develop().get(i) instanceof Negation)
            {
                Negation f1 = (Negation)n.getTo_develop().get(i);
                //todo: continue here!!!
            }
        }
        i = hasDisjuntionFormula(n);
        if(!(i==-1))
        {
            //todo: implementer le tabelau de Disjunction
        }
        i = hasSuccessorFormula(n);
        if(!(i==-1))
        {
            //todo:implementer le tableau de successor
        }
        return ret;
    }

    private int hasConjunctionFormula(Node n)
    {
        ArrayList<Formula> contestants = new ArrayList<>();
        for(Formula f : n.getTo_develop())
        {
            if(isConjonctive(f))
                contestants.add(f);
        }
        if(!(contestants.size() == 0))
        {
            return n.getTo_develop().indexOf(contestants.get(0));
        }
        return -1;
    }
    private int hasDisjuntionFormula(Node n)
    {
        ArrayList<Formula> contestants = new ArrayList<>();
        for(Formula f : n.getTo_develop())
        {
            if(isDisjonctive(f))
                contestants.add(f);
        }
        if(!(contestants.size() == 0))
        {
            return n.getTo_develop().indexOf(contestants.get(0));
        }
        return -1;
    }
    private int hasSuccessorFormula(Node n)
    {
        ArrayList<Formula> contestants = new ArrayList<>();
        for(Formula f : n.getTo_develop())
        {
            if(isSuccessor(f))
                contestants.add(f);
        }
        if(!(contestants.size() == 0))
        {
            return n.getTo_develop().indexOf(contestants.get(0));
        }
        return -1;
    }
    private boolean isConjonctive(Formula f)
    {
        if(f instanceof Negation)
        {
            if(((Negation)f).getF() instanceof Negation)
            {
                return true;
            }
            if(((Negation)f).getF() instanceof QF1opF2)
                return true;
        }
        if(f instanceof QopF)
        {
            QopF f_ = (QopF)f;
            if(f_.getQ() instanceof Every && f_.getOp() instanceof Square)
                return true;
            if(f_.getQ() instanceof ForAll && f_.getOp() instanceof Square)
                return true;
        }
        return false;
    }
    private boolean isDisjonctive(Formula f)
    {
        if(f instanceof QF1opF2)
        {
            QF1opF2 f_ = (QF1opF2)f;
            if(f_.getQ() == null && f_.getOp() instanceof Disjunction)
                return true;
            if(f_.getOp() instanceof Until)
                return true;
        }
        if(f instanceof QopF)
        {
            QopF f_ = (QopF)f;
            if(f_.getOp() instanceof Diamond)
            {
                if(f_.getQ() instanceof Every || f_.getQ() instanceof  ForAll)
                    return true;
            }
        }
        return false;
    }
    private boolean isSuccessor(Formula f)
    {
        if(f instanceof QopF)
        {
            QopF f_ = (QopF)f;
            if(f_.getQ() instanceof Every && f_.getOp() instanceof Ring)
                return true;
        }
        if(f instanceof Negation)
            return isSuccessor(((Negation)f).getF());
        return false;
    }
}
