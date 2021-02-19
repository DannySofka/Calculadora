import com.co.sofka.app.BasicCalculator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BasicCalculatorTest {

    private final BasicCalculator basicCalculator = new BasicCalculator();

    @Test
    @DisplayName("Testing sum: 1+1=2")
    void sum() {
        // Arrange
        Long number1 = 1L;
        Long number2 = 1L;
        Long expectedValue = 2L;

        // Act
        Long result = basicCalculator.sum(number1, number2);

        // Assert
        assertEquals(expectedValue, result);
    }

    @Test
    @DisplayName("Testing restar: 1-1=0")
    void restar() {
        Long number1 = 1L;
        Long number2 = 1L;
        Long expectedValue = 0L;

        // Act
        Long result = basicCalculator.restar(number1, number2);

        // Assert
        assertEquals(expectedValue, result);

    }

    @Test
    @DisplayName("Testing multiplicar: 1*1=1")
    void multiplicar() {
        Long number1 = 1L;
        Long number2 = 1L;
        Long expectedValue = 1L;

        // Act
        Long result = basicCalculator.multiplicar(number1, number2);

        // Assert
        assertEquals(expectedValue, result);

    }

    @Test
    @DisplayName("Testing dividir: 1/1=1")
    void dividir() {
        Long number1 = 1L;
        Long number2 = 1L;
        Long expectedValue = 1L;

        // Act
        Long result = basicCalculator.dividir(number1, number2);

        // Assert
        assertEquals(expectedValue, result);

    }
    @DisplayName("Testing several sums")
    @ParameterizedTest(name = "{0} + {1} = {2}")
    @CsvSource({
            "0,    1,   1",
            "1,    2,   3",
            "49,  51, 100",
            "1,  100, 101"
    })
    public void severalSums(Long first, Long second, Long expectedResult) {
        assertEquals(expectedResult, basicCalculator.sum(first, second),
                () -> first + " + " + second + " should equal " + expectedResult);
    }

    @DisplayName("Testing several Restas")
    @ParameterizedTest(name = "{0} - {1} = {2}")
    @CsvSource({
            "2,    1,   1",
            "5,    2,   3",
            "55,  51, 4",
            "110,  100, 10"
    })
    public void severalRestas(Long first, Long second, Long expectedResult) {
        assertEquals(expectedResult, basicCalculator.restar(first, second),
                () -> first + " + " + second + " should equal " + expectedResult);
    }

    @DisplayName("Testing several Multiplicaciones")
    @ParameterizedTest(name = "{0} * {1} = {2}")
    @CsvSource({
            "2,    1,   2",
            "5,    2,   10",
            "8,  9, 72",
            "11,  7, 77"
    })
    public void severalMultiplicaciones(Long first, Long second, Long expectedResult) {
        assertEquals(expectedResult, basicCalculator.multiplicar(first, second),
                () -> first + " + " + second + " should equal " + expectedResult);
    }
    @DisplayName("Testing several Divisiones")
    @ParameterizedTest(name = "{0} / {1} = {2}")
    @CsvSource({
            "2,    1,   2",
            "10,    2,   5",
            "9,  9, 1",
            "20,  2, 10"
    })
    public void severalDivisiones(Long first, Long second, Long expectedResult) {
        assertEquals(expectedResult, basicCalculator.dividir(first, second),
                () -> first + " + " + second + " should equal " + expectedResult);
    }
}
