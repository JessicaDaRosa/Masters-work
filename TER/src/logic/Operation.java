package logic;

import b.f.T;

import java.util.ArrayList;

public abstract class Operation {
    private final String name;

    protected Operation(String name) {
        this.name = name;
    }

    public String toString()
    {
        return this.name;
    };

    public abstract Boolean result(Boolean a, Boolean b);
    public abstract Boolean result(ArrayList<T> a , ArrayList<T> b);
}
