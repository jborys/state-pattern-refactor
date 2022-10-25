package edu.designpatterns.state;

import static edu.designpatterns.state.GarageDoor.OPENING;

public class ClosedState extends DoorState {
    @Override
    void click(GarageDoor garageDoor) {
        //old code
        garageDoor.setCurrentState(OPENING);

    }

    @Override
    void sensor(GarageDoor garageDoor) {

    }

    @Override
    void getCurrentState() {

    }
}
