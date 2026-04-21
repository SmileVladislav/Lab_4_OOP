public class Text {
    private Sentence[] sentences;

    public Text(String s) {
        String[] split = s.split("(?<=[.!?])\\s*");
        sentences = new Sentence[split.length];
        for (int i = 0; i < split.length; i++) {
            sentences[i] = new Sentence(split[i]);
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Sentence s : sentences) sb.append(s.toString()).append(" ");
        return sb.toString().trim();
    }
}
