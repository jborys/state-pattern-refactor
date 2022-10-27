package edu.designpatterns.state;

import static edu.designpatterns.state.GarageDoor.*;

class OpeningState extends DoorState {
    @Override
    void click(GarageDoor garageDoor) {
        garageDoor.setState(new StoppedState());
        //old code
        garageDoor.resumeState = CLOSING;
    }

    @Override
    void sensor(GarageDoor garageDoor) {
        garageDoor.setState(new OpenState());
    }

    @Override
    String getCurrentState() {
        return OPENING;
    }
}
