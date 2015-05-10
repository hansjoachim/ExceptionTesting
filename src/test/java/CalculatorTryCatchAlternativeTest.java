import org.junit.Assert;
import org.junit.Test;

public class CalculatorTryCatchAlternativeTest {

    @Test
    public void should_give_error_on_adding_negative_number_try_catch() {
        Calculator calculator = new Calculator("Calculator");
        boolean expected = false;
        try {
            calculator.add(1, -1);
        } catch (IllegalArgumentException e) {
            expected = e.getMessage().contains("Adding a negative number makes no sense! Use subtract instead.");
        }
        Assert.assertTrue(expected);
    }
}
