public class Calculator {

	private final String name;

	public Calculator(String name) {
		if (name.charAt(0) != (name.toUpperCase().charAt(0))) {
			throw new IllegalArgumentException(
					"Names must start with a capital letter!");
		}
		this.name = name;
	}

	public int add(int a, int b) {
		if (a < 0 || b < 0) {
			throw new IllegalArgumentException(
					"Adding a negative number makes no sense! Use subtract instead.");
		}

		return a + b;
	}

	public int subtract(int intialValue, int part) {
		return intialValue - part;
	}

	public String getName() {
		return name;
	}
}
