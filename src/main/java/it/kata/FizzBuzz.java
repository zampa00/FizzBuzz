package it.kata;

public class FizzBuzz {

    public String convert(Integer number) {
        String output = "";
        if (number % 3 == 0) {
            output += "fizz";
        }
        if (number % 5 == 0) {
            output += "buzz";
        }

        if (output.isEmpty()) {
            output += number.toString();
        }

        return output;

    }

}
