package edu.designpatterns.state;

class StoppedOpening extends StoppedState    {
    @Override
    void click(GarageDoor garageDoor) {
            garageDoor.setState(new ClosingState());
    }
}
