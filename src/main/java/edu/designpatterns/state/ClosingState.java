package edu.designpatterns.state;

import static edu.designpatterns.state.GarageDoor.*;

public class ClosingState extends DoorState {
    @Override
    void click(GarageDoor garageDoor) {
        garageDoor.setState(new StoppedState());
        //old code
        garageDoor.resumeState = OPENING;
        garageDoor.setStateString(STOPPED);
    }

    @Override
    void sensor(GarageDoor garageDoor) {
        garageDoor.setState(new ClosedState());
        //old code
        garageDoor.setStateString(CLOSED);
    }

    @Override
    void getCurrentState() {

    }
}
