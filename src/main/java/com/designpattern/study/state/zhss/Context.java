package com.designpattern.study.state.zhss;

public class Context {

    private State state;

    public Context(State state) {
        this.state = state;
        this.state.execute();
    }

    public void execute(int stateType) {
        if(stateType == 1) {
            this.state = new ApprovingState();
        } else if(stateType == 2) {
            this.state = new ApprovedState();
        } else if(stateType == 3) {
            this.state = new FinishedState();
        }
        this.state.execute();
    }
}
