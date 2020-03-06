package logic;

import b.f.T;

import java.util.ArrayList;

public class Negation extends Operator {

    protected Negation() {
        super("¬");
    }

    @Override
    public Boolean result(Boolean a, Boolean b) {
        return null;
        //TODO have a result here. do not forget that one of the inputs must be null or void
    }

    @Override
    public Boolean result(ArrayList<T> a, ArrayList<T> b) {
        return null;
        //TODO have a result here. one is the universe the other the value to negate
    }
}
