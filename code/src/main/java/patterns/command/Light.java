package patterns.command;

public class Light {
	private LightState state = LightState.OFF;
	private int switchCount = 0;
	private final int BREAK_THRESHOLD = 5;

	public Light() {

	}

	public void turnOff() {
		turn(LightState.OFF);
	}

	public void turnOn() {
		turn(LightState.ON);
	}

	private void turn(LightState newState) {
		if (this.state == LightState.BROKEN) {
			return;
		}

		this.state = newState;

		switchCount++;
		if (switchCount > BREAK_THRESHOLD) {
			this.state = LightState.BROKEN;
		}

		System.out.println("light is " + this.state.toString());
	}

}
