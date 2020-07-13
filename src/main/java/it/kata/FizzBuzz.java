package it.kata;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

    private List<DivisorAndWord> numbersAndWords;

    public FizzBuzz(List<DivisorAndWord> numbersAndWords) {
        this.numbersAndWords = numbersAndWords;
    }

    public String convert(Integer number) {
        String output = "";

        for (DivisorAndWord dw : numbersAndWords) {
            output += dw.getWordOrEmpty(number);
        }

        if (output.isEmpty()) {
            output += number.toString();
        }

        return output;
    }

}

class DivisorAndWord {
    private final int divisor;
    private final String word;

    public DivisorAndWord(int divisor, String word) {
        this.divisor = divisor;
        this.word = word;
    }

    public int getDivisor() {
        return divisor;
    }

    public String getWord() {
        return word;
    }

    private boolean isDivisible(Integer number) {
        return number % divisor == 0;
    }

    public String getWordOrEmpty(Integer number) {
        if (isDivisible(number))
            return word;
        else
            return "";
    }
}