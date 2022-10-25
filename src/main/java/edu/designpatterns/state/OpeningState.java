package edu.designpatterns.state;

import static edu.designpatterns.state.GarageDoor.CLOSING;
import static edu.designpatterns.state.GarageDoor.STOPPED;

public class OpeningState extends DoorState {
    @Override
    void click(GarageDoor garageDoor) {
        //old code
        garageDoor.resumeState = CLOSING;
        garageDoor.setCurrentState(STOPPED);
    }

    @Override
    void sensor(GarageDoor garageDoor) {

    }

    @Override
    void getCurrentState() {

    }
}
