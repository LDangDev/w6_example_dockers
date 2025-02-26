import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @org.junit.jupiter.api.Nested
    class AddTests {
        @org.junit.jupiter.api.Test
        void withPositiveNumbers_returnsSum() {
            assertEquals(3, Calculator.add(1, 2));
        }

        @org.junit.jupiter.api.Test
        void withNegativeNumbers_returnsSum() {
            assertEquals(-3, Calculator.add(-1, -2));
        }

        @org.junit.jupiter.api.Test
        void withZero_returnsSum() {
            assertEquals(2, Calculator.add(2, 0));
        }
    }

    @org.junit.jupiter.api.Nested
    class SubtractTests {
        @org.junit.jupiter.api.Test
        void withPositiveNumbers_returnsDifference() {
            assertEquals(1, Calculator.subtract(3, 2));
        }

        @org.junit.jupiter.api.Test
        void withNegativeNumbers_returnsDifference() {
            assertEquals(1, Calculator.subtract(-1, -2));
        }

        @org.junit.jupiter.api.Test
        void withZero_returnsDifference() {
            assertEquals(2, Calculator.subtract(2, 0));
        }
    }

    @org.junit.jupiter.api.Nested
    class MultiplyTests {
        @org.junit.jupiter.api.Test
        void withPositiveNumbers_returnsProduct() {
            assertEquals(6, Calculator.multiply(2, 3));
        }

        @org.junit.jupiter.api.Test
        void withNegativeNumbers_returnsProduct() {
            assertEquals(6, Calculator.multiply(-2, -3));
        }

        @org.junit.jupiter.api.Test
        void withZero_returnsProduct() {
            assertEquals(0, Calculator.multiply(2, 0));
        }
    }

    @org.junit.jupiter.api.Nested
    class DivideTests {
        @org.junit.jupiter.api.Test
        void withPositiveNumbers_returnsQuotient() {
            assertEquals(2, Calculator.divide(4, 2));
        }

        @org.junit.jupiter.api.Test
        void withNegativeNumbers_returnsQuotient() {
            assertEquals(2, Calculator.divide(-4, -2));
        }

        @org.junit.jupiter.api.Test
        void withZero_throwsArithmeticException() {
            assertThrows(ArithmeticException.class, () -> Calculator.divide(4, 0));
        }
    }
}