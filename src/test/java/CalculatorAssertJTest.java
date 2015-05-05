import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class CalculatorAssertJTest {

    @Test
    public void should_throw_exception_when_adding_negative_numbers() {
        Calculator calc = new Calculator("AssertJ");

        assertThatThrownBy(() -> calc.add(1, -2))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("Adding a negative number makes no sense! Use subtract instead.");
    }
}
