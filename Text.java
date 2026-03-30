import java.util.Arrays;

public class Text {
    private final Sentence[] sentences;

    public Text(String s) {
        String cleaned = s.replaceAll("[\\s\\t]+", " ").trim();
        String[] splitSentences = cleaned.split("(?<=[.!?])\\s*");
        this.sentences = new Sentence[splitSentences.length];
        for (int i = 0; i < splitSentences.length; i++) {
            this.sentences[i] = new Sentence(splitSentences[i]);
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < sentences.length; i++) {
            sb.append(sentences[i].toString());
            if (i < sentences.length - 1) sb.append(" ");
        }
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Text text = (Text) o;
        return Arrays.equals(sentences, text.sentences);
    }
}
