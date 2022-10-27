package edu.designpatterns.state;

import static edu.designpatterns.state.GarageDoor.OPENING;
import static edu.designpatterns.state.GarageDoor.STOPPED;

class StoppedState extends DoorState {
    @Override
    void click(GarageDoor garageDoor) {
        if(garageDoor.resumeState.equals(OPENING)) {
            garageDoor.setState(new OpeningState());
        } else {
            garageDoor.setState(new ClosingState());
        }
    }

    @Override
    void sensor(GarageDoor garageDoor) {

    }

    @Override
    String getCurrentState() {
        return STOPPED;
    }
}
