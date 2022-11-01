package edu.designpatterns.state;

class OpenState extends DoorState {
    @Override
    void click(GarageDoor garageDoor) {
        garageDoor.setState(new OpenState());

        //old code
        garageDoor.setStateString("Closing");
    }

    @Override
    void sensor(GarageDoor garageDoor) {

    }

    @Override
    String getMessageString() {
        return "Open";
    }
}
