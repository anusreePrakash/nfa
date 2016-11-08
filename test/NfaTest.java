import org.junit.Test;
import tupleEntities.*;

import java.util.HashMap;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class NfaTest {
    @Test
    public void should_return_false_for_invalid_languages() throws Exception {
        State q1 = new State("q1");
        State q2 = new State("q2");

        Alphabet alphabet1 = new Alphabet("1");
        Alphabet epsilon = new Alphabet("e");
        Alphabet alphabet2 = new Alphabet("0");

        Alphabets alphabets = new Alphabets();
        alphabets.addAlphabet(alphabet1);
        alphabets.addAlphabet(alphabet2);
        alphabets.addAlphabet(epsilon);

        States existingStates = new States();
        existingStates.addState(q1);
        existingStates.addState(q2);

        State initalState = q1;
        States finalState = new States();
        finalState.addState(q2);

        Delta delta = new Delta();

        delta.addTransitions(q1,alphabet1,q2);
        delta.addTransitions(q1,epsilon,q2);
        delta.addTransitions(q1,epsilon,q1);

        HashMap<State, HashMap<Alphabet, States>> transition = delta.getTransitions();

        Nfa nfa = Nfa.factory(existingStates, alphabets, transition, initalState, finalState);
        boolean isLanguageExists = nfa.isLanguageExist("0911");

        assertFalse(isLanguageExists);

    }
   @Test
    public void should_return_true_for_valid_languages() throws Exception {
        State q1 = new State("q1");
        State q2 = new State("q2");

        Alphabet alphabet1 = new Alphabet("1");
        Alphabet epsilon = new Alphabet("e");
        Alphabet alphabet2 = new Alphabet("0");

        Alphabets alphabets = new Alphabets();
        alphabets.addAlphabet(alphabet1);
        alphabets.addAlphabet(alphabet2);
        alphabets.addAlphabet(epsilon);

        States existingStates = new States();
        existingStates.addState(q1);
        existingStates.addState(q2);

        State initalState = q1;
        States finalState = new States();
        finalState.addState(q2);

        Delta delta = new Delta();

        delta.addTransitions(q1,alphabet1,q2);
        delta.addTransitions(q1,epsilon,q2);
        delta.addTransitions(q1,alphabet2,q1);

       HashMap<State, HashMap<Alphabet, States>> transition = delta.getTransitions();


       Nfa nfa = Nfa.factory(existingStates, alphabets, transition, initalState, finalState);
        boolean isLanguageExists = nfa.isLanguageExist("0011");

        assertTrue(isLanguageExists);
    }
}
