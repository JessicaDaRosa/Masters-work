package logic;

public abstract class Formula {

    private Quantificator q;
    private Operation op;



    public String toString();
    public void toTree();
}
