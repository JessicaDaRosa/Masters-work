package logic;

import java.util.Objects;

public class ForAll implements Quantificator {
    private final String name;

    public ForAll() {
        this.name = "A";
    }

    public String toString(){
        return name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ForAll)) return false;
        ForAll forAll = (ForAll) o;
        return name.equals(forAll.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
