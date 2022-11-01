package edu.designpatterns.state;

public class OpeningState extends DoorState {
    @Override
    void click(GarageDoor garageDoor) {
        garageDoor.setState(new OpeningState());
        //old code
        garageDoor.resumeState = "Closing";
        garageDoor.setStateString("Stopped");
    }

    @Override
    void sensor(GarageDoor garageDoor) {
        //old code
        garageDoor.setStateString("Open");

    }

    @Override
    String getMessageString() {
        return "Opening";
    }
}
