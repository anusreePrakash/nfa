import tupleEntities.*;

import java.util.HashMap;

public class Nfa {
    private final States states;
    private final Alphabets alphabets;
    private final HashMap<State, HashMap<Alphabet, States>> transitions;
    private final State startingState;
    private final States finalState;

    public Nfa(States states, Alphabets alphabets, HashMap<State, HashMap<Alphabet, States>> transitions, State startingState, States finalStates) {

        this.states = states;
        this.alphabets = alphabets;
        this.transitions = transitions;
        this.startingState = startingState;
        this.finalState = finalStates;
    }

    public static Nfa factory(States existingStates, Alphabets alphabets, HashMap<State, HashMap<Alphabet, States>> delta, State initialState, States finalState) throws Exception {
        if (alphabets.isEmpty() || existingStates.isEmpty()) {
            throw new Exception("Invalid nfa");
        }
        return new Nfa(existingStates, alphabets, delta, initialState, finalState);
    }

    public boolean isLanguageExist(String string) {
        String[] stringArray = string.split("");
        States currentStates = new States();
        for (String each : stringArray) {
            if (!(alphabets.containsAlphabet(each))) {
                return false;
            }

            transitions.get(startingState)

        }
        return true;
    }

}
