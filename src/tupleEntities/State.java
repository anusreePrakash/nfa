package tupleEntities;

public class State {
    private final String state;

    public String getState() {
        return state;
    }

    public State(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "State{" +
                "state='" + state + '\'' +
                '}';
    }
}
