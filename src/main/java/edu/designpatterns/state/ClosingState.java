package edu.designpatterns.state;

import static edu.designpatterns.state.GarageDoor.CLOSING;

class ClosingState extends DoorState {
    @Override
    void click(GarageDoor garageDoor) {
        garageDoor.setState(new StoppedClosing());
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
