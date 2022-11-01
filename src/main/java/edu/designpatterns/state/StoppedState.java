package edu.designpatterns.state;

class StoppedState extends DoorState {
    @Override
    void click(GarageDoor garageDoor) {
        if (garageDoor.resumeState.equals("Opening"))   {
            garageDoor.setState(new OpenState());
        } else {
            garageDoor.setState(new ClosedState());
        }
        //old code
        garageDoor.setStateString(garageDoor.resumeState);
    }

    @Override
    void sensor(GarageDoor garageDoor) {

    }

    @Override
    String getMessageString() {
        return null;
    }
}
