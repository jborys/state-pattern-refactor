package edu.designpatterns.state;

class ClosingState extends DoorState {
    @Override
    void click(GarageDoor garageDoor) {
        garageDoor.setState(new ClosingState());
        //old code
        garageDoor.resumeState = "Opening";
        garageDoor.setStateString("Stopped");
    }

    @Override
    void sensor(GarageDoor garageDoor) {
        //old code
        garageDoor.setStateString("Closed");

    }

    @Override
    String getMessageString() {
        return "Closing";
    }
}
