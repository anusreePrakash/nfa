package tupleEntities;

import java.util.HashSet;

public class Alphabets {
    private final HashSet<Alphabet> alphabets;

    public Alphabets() {
        this.alphabets = new HashSet<Alphabet>();
    }


    public void addAlphabet(Alphabet alphabet) {
        alphabets.add(alphabet);
    }

    public boolean isEmpty() {
        return alphabets.isEmpty();
    }

    public boolean containsAlphabet(String character) {
        Alphabet alphabet1 = new Alphabet(character);
        return alphabets.contains(alphabet1);
    }

    @Override
    public String toString() {
        return "Alphabets{" +
                "alphabets=" + alphabets +
                '}';
    }
}