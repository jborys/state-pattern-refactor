package edu.designpatterns.state;

import static edu.designpatterns.state.GarageDoorConstants.*;

public class GarageDoor {

	private String stateString = CLOSED;
	private String resumeState;
	

	public void click() {
		if (stateString.equals(CLOSED)) {
			setStateString(GarageDoorConstants.OPENING);
		} else if (stateString.equals(OPENING)) {
			resumeState = CLOSING;
			setStateString(STOPPED);
		} else if (stateString.equals(CLOSING)) {
			resumeState = GarageDoorConstants.OPENING;
			setStateString(STOPPED);
		} else if (stateString.equals(STOPPED)) {
			setStateString(resumeState);
		} else {
			setStateString(CLOSING);
		}
	}

	void setStateString(String string) {
		stateString = string;
	}

	public String getMessageString() {
		return stateString;
	}

	public void sensor() {
		if (stateString.equals(OPENING)) {
			setStateString(OPEN);
		} else {
			setStateString(CLOSED);
		}
	}
}
