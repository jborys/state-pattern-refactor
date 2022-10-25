package edu.designpatterns.state;

import static edu.designpatterns.state.GarageDoor.OPENING;
import static edu.designpatterns.state.GarageDoor.STOPPED;

public class ClosingState extends DoorState {
    @Override
    void click(GarageDoor garageDoor) {
        //old code
        garageDoor.resumeState = OPENING;
        garageDoor.setCurrentState(STOPPED);
    }

    @Override
    void sensor(GarageDoor garageDoor) {

    }

    @Override
    void getCurrentState() {

    }
}
