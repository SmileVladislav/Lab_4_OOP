import java.util.Arrays;

public class Word implements SentenceElement {
    private final Letter[] letters;

    public Word(String s) {
        this.letters = new Letter[s.length()];
        for (int i = 0; i < s.length(); i++) {
            this.letters[i] = new Letter(s.charAt(i));
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Letter l : letters) {
            sb.append(l.toString());
        }
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Word word = (Word) o;
        return Arrays.equals(letters, word.letters);
    }
}
