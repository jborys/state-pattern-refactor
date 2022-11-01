package edu.designpatterns.state;

class StoppedClosingState extends StoppedState {
    @Override
    void click(GarageDoor garageDoor) {
            garageDoor.setState(new OpeningState());
    }
}
