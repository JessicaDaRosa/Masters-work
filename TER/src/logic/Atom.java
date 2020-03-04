package logic;

import java.util.Objects;

public class Atom {
    private String name;

    public void Atom(String n){
        this.name = n;
    }

    @Override
    public String toString() {
        return name;
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
}
