package state_pattern.gate_state;

import state_pattern.GateContext;

public class CloseGateState implements IGateState {
    private GateContext gate;

    public CloseGateState(GateContext newGate) {
        gate = newGate;
    }

    public void payFail() {
        System.out.println("付款失败，无法进入地铁");
    }

    public void payOK() {
        System.out.println("付款成功，进入地铁");
        this.gate.changeGateState(new OpenGateState(gate));
    }

    public void timeOut() {

    }
}
