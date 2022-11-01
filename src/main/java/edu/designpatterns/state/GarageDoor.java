package edu.designpatterns.state;

public class GarageDoor {
	private String stateString = "Closed";
	String resumeState;

	DoorState state = new ClosedState();

	public void click() {
		if ("Closed".equals(stateString)) {
			state = new ClosedState();
		} else if ("Opening".equals(stateString)) {
			state = new OpeningState();
		} else if ("Closing".equals(stateString)) {
			state = new ClosingState();
		} else if ("Stopped".equals(stateString)) {
			state = new StoppedState();
		} else {
			state = new OpenState();
		}
		state.click(this);
	}

	void setStateString(String string) {
		stateString = string;
	}

	public String getMessageString() {
		return stateString;
	}

	public void sensor() {
		if ("Opening".equals(stateString)) {
			state = new OpeningState();
		} else {
			state = new ClosingState();
		}
		state.sensor(this);
	}

	public void setState(DoorState state) {
		this.state = state;
	}
}
