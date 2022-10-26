package edu.designpatterns.state;

import static edu.designpatterns.state.GarageDoor.CLOSING;

public class OpenState extends DoorState {
    @Override
    void click(GarageDoor garageDoor) {
        garageDoor.setState(new ClosingState());
        //old code
        garageDoor.setStateString(CLOSING);

    }

    @Override
    void sensor(GarageDoor garageDoor) {

    }

    @Override
    void getCurrentState() {
    }
}
