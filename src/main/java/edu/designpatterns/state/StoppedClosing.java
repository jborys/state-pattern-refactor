package edu.designpatterns.state;

class StoppedClosing extends StoppedState{
    @Override
    void click(GarageDoor garageDoor) {
            garageDoor.setState(new OpeningState());
    }
}
