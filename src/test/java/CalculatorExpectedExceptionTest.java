import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class CalculatorExpectedExceptionTest {

	@Rule
	public ExpectedException expected = ExpectedException.none();

	@Test
	public void should_give_error_on_adding_negative_number_expected_exception() {
		Calculator calculator = new Calculator("Calculator");
		// Possibly various other setup...

		expected.expect(IllegalArgumentException.class);
		expected.expectMessage("Adding a negative number makes no sense! Use subtract instead.");
		calculator.add(1, -1);
	}

}
