package edu.designpatterns.state;

import static edu.designpatterns.state.GarageDoor.OPENING;

public class StoppedState extends DoorState {
    @Override
    void click(GarageDoor garageDoor) {
        if(garageDoor.getStateString().equals(OPENING)) {
            garageDoor.setState(new ClosingState());
        } else {
            garageDoor.setState(new OpeningState());
        }
        //old code
        garageDoor.setStateString(garageDoor.resumeState);

    }

    @Override
    void sensor(GarageDoor garageDoor) {

    }

    @Override
    void getCurrentState() {

    }
}
