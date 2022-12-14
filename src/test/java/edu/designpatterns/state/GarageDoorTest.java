package edu.designpatterns.state;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class GarageDoorTest {
	private final GarageDoor garageDoor = new GarageDoor();
	
	@Test
	public void initialConditionsDoorShouldBeClosed() {
		assertDoorMessage("Closed"); // Closed
	}

	@Test
	public void clickShouldStartDoorOpening() {
		garageDoor.click(); // Opening
		
		assertDoorMessage("Opening");
	}

	@Test
	public void sensorShouldIndicateGarageDoorIsOpen() {
		openDoor();	// Open
		
		assertDoorMessage("Open");
	}

	@Test
	public void clickOnOpenDoorShouldStartDoorClosing() {
		openDoor();	// Open
		garageDoor.click();	// Closing
		
		assertDoorMessage("Closing");
	}

	@Test
	public void sensorShouldIndicateDoorIsClosed() {
		openDoor();				// Open
		garageDoor.click(); 	// Closing
		garageDoor.sensor();	// Closed
		
		assertDoorMessage("Closed");
	}

	@Test
	public void clickWhileOpeningShouldStopDoor() {
		garageDoor.click(); // Opening
		garageDoor.click(); // Stopped - Opening
		
		assertDoorMessage("Stopped");
	}
	
	@Test
	public void clickWhenStoppedShouldCloseDoor() {
		garageDoor.click(); // Opening
		garageDoor.click(); // Stopped
		garageDoor.click(); // Closing
		
		assertDoorMessage("Closing");
	}

	@Test
	public void clickWhenOpeningShouldStopDoor() {
		openDoor();			// Open
		garageDoor.click();	// Closing
		garageDoor.click();	// Stopped - Closing
		
		assertDoorMessage("Stopped");
	}
	
	@Test
	public void clickWhenStoppedClosingShouldOpenDoor() {
		openDoor();			// Open
		garageDoor.click();	// Closing
		garageDoor.click();	// Stopped - Closing
		garageDoor.click();	// Opening
		
		assertDoorMessage("Opening");
	}
	
	// Helper methods

	private void openDoor() {
		garageDoor.click();
		garageDoor.sensor();
	}
	
	private void assertDoorMessage(String expected) {
		assertThat(garageDoor.getMessageString()).isEqualTo(expected);
	}

}
