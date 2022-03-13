package state_pattern;

import state_pattern.gate_state.CloseGateState;
import state_pattern.gate_state.IGateState;

public class GateContext {
    private IGateState state;

    public GateContext() {
        // 状态模式将状态的变更交由多出来的中间层
        // 本来只需要自己切换状态，现在全部交给各种状态类
        this.state = new CloseGateState(this);
    }

    public void payFail() {
        this.state.payFail();
    }

    public void payOK() {
        this.state.payOK();
    }

    public void timeOut() {
        this.state.timeOut();
    }

    public void changeGateState(IGateState newGateState) {
        state = newGateState;
    }
}
