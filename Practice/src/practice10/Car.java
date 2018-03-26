package practice10;

public class Car {

	int serialNo;
	String color;
	int gasoline;

	public int run() {
		this.gasoline--;
		int rand = new java.util.Random().nextInt(15) + 1;
		if (this.gasoline < 0) {
			return -1;
		} else {
			return rand;
		}
	}
}
