package edu.designpatterns.state;

class OpenState extends DoorState {
    @Override
    void click(GarageDoor garageDoor) {
        garageDoor.setState(new ClosingState());

        //old code

    }

    @Override
    void sensor(GarageDoor garageDoor) {

    }

    @Override
    String getMessageString() {
        return "Open";
    }
}
