package edu.designpatterns.state;

class StoppedOpeningState extends StoppedState {
    @Override
    void click(GarageDoor garageDoor) {
            garageDoor.setState(new ClosingState());
    }
}
