package edu.designpatterns.state;

class ClosingState extends DoorState {
    @Override
    void click(GarageDoor garageDoor) {
        //old code
        garageDoor.resumeState = "Opening";
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
