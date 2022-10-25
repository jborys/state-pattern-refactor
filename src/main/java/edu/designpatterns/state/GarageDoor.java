package edu.designpatterns.state;

public class GarageDoor {
	public static final String OPENING = "Opening";
	public static final String CLOSING = "Closing";
	public static final String STOPPED = "Stopped";
	public static final String CLOSED = "Closed";
	public static final String OPEN = "Open";
	private String currentState = CLOSED;
	private String resumeState;
	
	DoorState state;

	public void click() {
		if (CLOSED.equals(currentState)) {
			setCurrentState(OPENING);
		} else if (OPENING.equals(currentState)) {
			resumeState = CLOSING;
			setCurrentState(STOPPED);
		} else if (CLOSING.equals(currentState)) {
			resumeState = OPENING;
			setCurrentState(STOPPED);
		} else if (STOPPED.equals(currentState)) {
			setCurrentState(resumeState);
		} else {
			setCurrentState(CLOSING);
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
