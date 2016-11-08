package tupleEntities;

import java.util.HashMap;

public class Delta {
    private HashMap<State, HashMap<Alphabet, States>> transitions;

    public Delta() {
        this.transitions = new HashMap<State, HashMap<Alphabet, States>>();
    }

    public void addTransitions(State currentState, Alphabet alphabet, State nextState) {
        transitions.putIfAbsent(currentState,new HashMap<>());
        transitions.get(currentState).putIfAbsent(alphabet,new States());
        transitions.get(currentState).get(alphabet).addState(nextState);


//
//        if(this.transitions.containsKey(currentState)){
//            if(transitions.get(currentState).containsKey(alphabet)) {
//                transitions.get(currentState).get(alphabet).addState(nextState);
//                return;
//            }
//            States nextStates = new States();
//            nextStates.addState(nextState);
//            transitions.get(currentState).put(alphabet,nextStates);
//            return;
//        }
//        else{
//            HashMap<Alphabet, States> path = new HashMap<>();
//            States nextStates = new States();
//            nextStates.addState(nextState);
//            path.put(alphabet,nextStates);
//            transitions.put(currentState,path);
//
//        }

    }

    @Override
    public String toString() {
        return "Delta{" +
                "transitions=" + transitions +
                '}';
    }

    public HashMap<State, HashMap<Alphabet, States>> getTransitions() {
        return transitions;
    }
}
