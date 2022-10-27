package edu.designpatterns.state;

import static edu.designpatterns.state.GarageDoor.CLOSED;
import static edu.designpatterns.state.GarageDoor.OPENING;

public class ClosedState extends DoorState {
    @Override
    void click(GarageDoor garageDoor) {
        garageDoor.setState(new OpeningState());
        //old code
//        garageDoor.setStateString(OPENING);

    }

    @Override
    void sensor(GarageDoor garageDoor) {

    }

    @Override
    String getCurrentState() {
        return CLOSED;
    }
}
