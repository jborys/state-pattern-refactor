package edu.designpatterns.state;

public class OpeningState extends DoorState {
    @Override
    void click(GarageDoor garageDoor) {
        //old code
        garageDoor.resumeState = "Closing";
        garageDoor.setStateString("Stopped");
    }

    @Override
    void sensor(GarageDoor garageDoor) {

    }

    @Override
    String getMessageString() {
        return null;
    }
}
