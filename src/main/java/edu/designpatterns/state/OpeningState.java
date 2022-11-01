package edu.designpatterns.state;

public class OpeningState extends DoorState {
    @Override
    void click(GarageDoor garageDoor) {
        garageDoor.setState(new StoppedOpeningState());
    }

    @Override
    void sensor(GarageDoor garageDoor) {
        garageDoor.setState(new OpenState());
        //old code

    }

    @Override
    String getMessageString() {
        return "Opening";
    }
}
