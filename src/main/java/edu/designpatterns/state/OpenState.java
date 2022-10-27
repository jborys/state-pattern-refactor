package edu.designpatterns.state;

import static edu.designpatterns.state.GarageDoor.OPEN;

class OpenState extends DoorState {
    @Override
    void click(GarageDoor garageDoor) {
        garageDoor.setState(new ClosingState());
    }

    @Override
    void sensor(GarageDoor garageDoor) {

    }

    @Override
    String getCurrentState() {
        return OPEN;
    }
}
