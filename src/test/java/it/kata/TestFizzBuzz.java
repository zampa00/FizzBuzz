package it.kata;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestFizzBuzz {

    FizzBuzz fizzBuzz;

    @BeforeEach
    void setUp() {
        fizzBuzz = new FizzBuzz();
    }

    @ParameterizedTest
    @ValueSource(ints = {1,2})
    void testNonDivisors(Integer number) {
        assertEquals(number.toString(), fizzBuzz.convert(number));
    }

    @ParameterizedTest
    @ValueSource(ints = {3,6,18})
    void testThreeDivisors(int number) {
        assertEquals("fizz", fizzBuzz.convert(number));
    }

    @ParameterizedTest
    @ValueSource(ints = {5,10,20})
    void testFiveDivisors(int number) {
        assertEquals("buzz", fizzBuzz.convert(number));
    }

    @ParameterizedTest
    @ValueSource(ints = {15,30})
    void testThreeAndFiveDivisors(int number) {
        assertEquals("fizzbuzz", fizzBuzz.convert(number));
    }
}
