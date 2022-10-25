package edu.designpatterns.state;

public class GarageDoor {
	public static final String OPENING = "Opening";
	public static final String CLOSING = "Closing";
	public static final String STOPPED = "Stopped";
	public static final String CLOSED = "Closed";
	public static final String OPEN = "Open";
	private String currentState = CLOSED;
	String resumeState;
	
	DoorState state = new ClosedState();

	public void setState(DoorState state) {
		this.state = state;
	}

	public void click() {
		if (CLOSED.equals(currentState)) {
			state = new ClosedState();
			state.click(this);
		} else if (OPENING.equals(currentState)) {
			state = new OpeningState();
			state.click(this);
		} else if (CLOSING.equals(currentState)) {
			state = new ClosingState();
			state.click(this);
		} else if (STOPPED.equals(currentState)) {
			state = new StoppedState();
			state.click(this);
		} else {
			state = new OpenState();
			state.click(this);
		}
	}

	void setCurrentState(String string) {
		currentState = string;
	}

	public String getCurrentState() {
		return currentState;
	}

	public void sensor() {
		if (OPENING.equals(currentState)) {
			setCurrentState(OPEN);
		} else {
			setCurrentState(CLOSED);
		}
	}
}
