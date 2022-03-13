package state_pattern.gate_state;

public interface IGateState {
    void payFail();
    void payOK();
    void timeOut();
}
