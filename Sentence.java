public class Sentence {
    private Object[] elements;

    public Sentence(String s) {
        String[] parts = s.split("(?=[,.!?;])|\\s+");
        elements = new Object[parts.length];
        for (int i = 0; i < parts.length; i++) {
            if (parts[i].matches("[,.!?;]")) elements[i] = new Punctuation(parts[i].charAt(0));
            else elements[i] = new Word(parts[i]);
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Object el : elements) {
            if (el != null) sb.append(el.toString()).append(" ");
        }
        return sb.toString().trim().replace(" ,", ",");
    }
}
