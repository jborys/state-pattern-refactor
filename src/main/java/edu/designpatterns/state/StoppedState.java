package edu.designpatterns.state;

abstract class StoppedState extends DoorState {
    @Override
    abstract void click(GarageDoor garageDoor);

    @Override
    void sensor(GarageDoor garageDoor) {

    }

    @Override
    String getMessageString() {
        return "Stopped";
    }
}
