package ru.yandex.javacourse;

import java.util.ArrayDeque;
import java.util.Deque;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReversePolishNotationCalculatorTest {

    private final ReversePolishNotationCalculator rpn = new ReversePolishNotationCalculator();

    @Test
    public void shouldCalculateAddition() {
        int value = rpn.calculatePolishNotation("2 3 +");
        assertEquals(5, value);
    }

    @Test
    public void shouldCalculateSubtraction() {
        int value = rpn.calculatePolishNotation("  6  8  -  ");
        assertEquals(-2, value);
    }

    @Test
    public void shouldCalculateMultiplication() {
        int value = rpn.calculatePolishNotation("-4   -5 *");
        assertEquals(20, value);
    }

    @Test
    public void shouldCalculateAdditionAndSubtraction() {
        int value = rpn.calculatePolishNotation("4 9 5 + -");
        assertEquals(-10, value);
    }

    @Test
    public void shouldCalculateSubtractionAndMultiplication() {
        int value = rpn.calculatePolishNotation("8 5 9 - *");
        assertEquals(-32, value);
    }
}

