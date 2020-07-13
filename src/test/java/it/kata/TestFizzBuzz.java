package it.kata;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestFizzBuzz {

    FizzBuzz fizzBuzz;
    private ArrayList<DivisorAndWord> numbersAndWords;

    @BeforeEach
    void setUp() {
        numbersAndWords = new ArrayList<>();

        numbersAndWords.add(new DivisorAndWord(3, "fizz"));
        numbersAndWords.add(new DivisorAndWord(5, "buzz"));

        fizzBuzz = new FizzBuzz(numbersAndWords);
    }

    @ParameterizedTest
    @ValueSource(ints = {1,2})
    void testNonDivisors(Integer number) {
        assertEquals(number.toString(), fizzBuzz.convert(number));
    }

    @Test
    void testSingleMatch() {
        DivisorAndWord divisorAndWord = numbersAndWords.get(0);
        assertEquals(divisorAndWord.getWord(), fizzBuzz.convert(divisorAndWord.getDivisor()));
    }

    @Test
    void testThreeAndFiveDivisors() {
        assertEquals("fizzbuzz", fizzBuzz.convert(15));
    }
}
