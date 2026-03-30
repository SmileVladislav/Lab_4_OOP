import java.util.Arrays;

public class Word {
    private final Letter[] letters;

    public Word(String wordStr) {
        this.letters = new Letter[wordStr.length()];
        for (int i = 0; i < wordStr.length(); i++) {
            this.letters[i] = new Letter(wordStr.charAt(i));
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Letter l : letters) sb.append(l.toString());
        return sb.toString();
    }
}
