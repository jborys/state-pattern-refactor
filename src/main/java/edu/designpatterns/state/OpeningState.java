package edu.designpatterns.state;

import static edu.designpatterns.state.GarageDoor.*;

public class OpeningState extends DoorState {
    @Override
    void click(GarageDoor garageDoor) {
        garageDoor.setState(new StoppedState());
        //old code
        garageDoor.resumeState = CLOSING;
        garageDoor.setStateString(STOPPED);
    }

    @Override
    void sensor(GarageDoor garageDoor) {
        garageDoor.setState(new OpenState());
        //old code
        garageDoor.setStateString(OPEN);
    }

    @Override
    void getCurrentState() {

    }
}
