import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sentence {
    private final SentenceElement[] elements;

    public Sentence(String s) {
        List<SentenceElement> list = new ArrayList<>();
        String[] parts = s.split("(?=[,.!?;])|\\s+");

        for (String part : parts) {
            if (part.matches("[,.!?;]")) {
                list.add(new Punctuation(part.charAt(0)));
            } else if (!part.isBlank()) {
                list.add(new Word(part));
            }
        }
        this.elements = list.toArray(new SentenceElement[0]);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < elements.length; i++) {
            sb.append(elements[i].toString());
            if (i < elements.length - 1 && !(elements[i+1] instanceof Punctuation)) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sentence sentence = (Sentence) o;
        return Arrays.equals(elements, sentence.elements);
    }
}
