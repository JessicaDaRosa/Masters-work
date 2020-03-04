package logic;

import java.util.Objects;

public class Every implements Quantificator{
    private final String name;

    public Every() {
        this.name = "E";
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Every)) return false;
        Every every = (Every) o;
        return name.equals(every.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
