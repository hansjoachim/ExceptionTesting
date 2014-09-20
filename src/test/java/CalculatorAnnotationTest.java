import org.junit.Assert;
import org.junit.Test;

public class CalculatorAnnotationTest {

	@Test
	public void can_create_calculator() {
		Calculator calculator = new Calculator("My Calculator");
		Assert.assertNotNull(calculator);
	}

	@Test
	public void should_add_two_numbers() {
		Calculator calculator = new Calculator("Calculator");
		Assert.assertEquals(2, calculator.add(1, 1));
	}

	@Test
	public void should_subtract_two_numbers() {
		Calculator calculator = new Calculator("Calculator");
		Assert.assertEquals(1, calculator.subtract(2, 1));
	}

	@Test(expected = IllegalArgumentException.class)
	public void should_give_error_on_adding_negative_number_annotation() {
		Calculator calculator = new Calculator("calculator");
		calculator.add(1, -1);
	}

}
