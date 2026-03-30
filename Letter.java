import java.util.Objects;

public class Letter {
    private final char symbol;

    public Letter(char symbol) {
        this.symbol = symbol;
    }

    @Override
    public String toString() {
        return String.valueOf(symbol);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Letter letter = (Letter) o;
        return symbol == letter.symbol;
    }

    @Override
    public int hashCode() {
        return Objects.hash(symbol);
    }
}
