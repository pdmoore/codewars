import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SquareDigitTest {

    @Test
    public void singleDigit() {
        assertEquals(16, new SquareDigit().squareDigits(4));
    }

    @Test
    public void test_MultipleDigits() {
        assertEquals(811181, new SquareDigit().squareDigits(9119));
    }

}