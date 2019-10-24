

public class Car {
	int speed;
	String bodyColor;

	void stepOnGas() {
		speed = speed + 5;
	}

	void putOnBrake() {
		speed = speed - 5;

	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public String getBodyColor() {
		return bodyColor;
	}

	public void setBodyColor(String bodyColor) {
		this.bodyColor = bodyColor;
	}

}
