package edu.designpatterns.state;

import static edu.designpatterns.state.GarageDoor.STOPPED;

abstract class StoppedState extends DoorState {

    @Override
    void sensor(GarageDoor garageDoor) {

    }

    @Override
    String getCurrentState() {
        return STOPPED;
    }
}
