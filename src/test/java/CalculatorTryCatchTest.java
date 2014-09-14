import org.junit.Assert;
import org.junit.Test;

public class CalculatorTryCatchTest {

	@Test
	public void should_give_error_on_adding_negative_number_try_catch() {
		try {
			new Calculator("calculator").add(1, -1);
			Assert.fail("Should have encountered an exception");
		} catch (IllegalArgumentException e) {
			Assert.assertEquals(
					"Adding a negative number makes no sense! Use subtract instead.",
					e.getMessage());
		} catch (Throwable t) {
			Assert.fail("Encountered some other exception");
		}
	}
}
