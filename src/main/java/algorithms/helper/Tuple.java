package algorithms.helper;

import java.util.Objects;

public class Tuple {
    private String word;

    public Tuple(String word) {
        this.word = word;
    }

    public String getWord() {
        return word;
    }

    public int getWordLength(){
        return word.length();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Tuple)) return false;
        Tuple tuple = (Tuple) o;
        return Objects.equals(getWord(), tuple.getWord());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getWord());
    }
}
