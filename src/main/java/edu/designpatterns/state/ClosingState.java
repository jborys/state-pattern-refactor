package edu.designpatterns.state;

class ClosingState extends DoorState {
    @Override
    void click(GarageDoor garageDoor) {
        garageDoor.setState(new StoppedClosingState());
    }

    @Override
    void sensor(GarageDoor garageDoor) {
        garageDoor.setState(new ClosedState());
        //old code

    }

    @Override
    String getMessageString() {
        return "Closing";
    }
}
