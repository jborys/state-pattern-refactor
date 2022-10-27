package edu.designpatterns.state;

import static edu.designpatterns.state.GarageDoor.OPENING;

class OpeningState extends DoorState {
    @Override
    void click(GarageDoor garageDoor) {
        garageDoor.setState(new StoppedOpening());
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
