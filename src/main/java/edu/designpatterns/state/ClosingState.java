package edu.designpatterns.state;

import static edu.designpatterns.state.GarageDoor.*;

class ClosingState extends DoorState {
    @Override
    void click(GarageDoor garageDoor) {
        garageDoor.setState(new StoppedState());
        //old code
        garageDoor.resumeState = OPENING;
    }

    @Override
    void sensor(GarageDoor garageDoor) {
        garageDoor.setState(new ClosedState());
    }

    @Override
    String getCurrentState() {
        return CLOSING;
    }
}
