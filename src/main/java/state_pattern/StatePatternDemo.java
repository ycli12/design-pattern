package state_pattern;

import state_pattern.gate_state.CloseGateState;

public class StatePatternDemo {
    public static void main(String[] args) {
        GateContext gate = new GateContext();
        gate.payOK();
        gate.timeOut();
    }
}
