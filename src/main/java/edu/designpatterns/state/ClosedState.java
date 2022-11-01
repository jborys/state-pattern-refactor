package edu.designpatterns.state;

class ClosedState extends DoorState {
    @Override
    void click(GarageDoor garageDoor) {
        garageDoor.setState(new ClosedState());
        //old code
        garageDoor.setStateString("Opening");
    }

    @Override
    void sensor(GarageDoor garageDoor) {

    }

    @Override
    String getMessageString() {
        return "Closed";
    }
}
