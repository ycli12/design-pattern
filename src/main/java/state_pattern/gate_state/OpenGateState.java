package state_pattern.gate_state;

import state_pattern.GateContext;

public class OpenGateState implements IGateState {
    private GateContext gate;

    public OpenGateState(GateContext newGate) {
        gate = newGate;
    }

    public void payFail() {
        System.out.println("门开启着");
    }

    public void payOK() {
        System.out.println("门开启着");
    }

    public void timeOut() {
        System.out.println("时间到了，关门");
        gate.changeGateState(new CloseGateState(gate));
    }
}
