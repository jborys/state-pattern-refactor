package edu.designpatterns.state;

public class GarageDoor {
	public static final String OPENING = "Opening";
	public static final String CLOSING = "Closing";
	public static final String STOPPED = "Stopped";
	public static final String CLOSED = "Closed";
	public static final String OPEN = "Open";

	DoorState state = new ClosedState();

	public void setState(DoorState state) {
		this.state = state;
	}

	public void click() {
		state.click(this);
	}

	public String getStateString() {
		return state.getCurrentState();
	}

	public void sensor() {
		state.sensor(this);
	}
}
