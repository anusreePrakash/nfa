package tupleEntities;

import java.util.HashSet;

public class States {

    private final HashSet<State> states;

    public States() {
        this.states = new HashSet<State>();
    }

    public HashSet<State> getStates() {
        return states;
    }
    public void addState(State state){
        this.states.add(state);
    }

    @Override
    public String toString() {
        return "States{" +
                "states=" + states +
                '}';
    }

    public boolean isEmpty() {
        return states.isEmpty();
    }
}
