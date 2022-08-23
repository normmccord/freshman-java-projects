//This program converts an input in Fahrenheit to Celsius.

import java.util.*;
public class heatConversion {
    private static Scanner input = new Scanner(System.in); //Defines an object to read from standard input

    public static void main(String[] args) {
        double fahrenheit; //assigns a variable named fahrenheit with a data type of double
        double celsius;

        System.out.println("Enter Fahrenheit temperature: ");
        fahrenheit = input.nextDouble(); //reads user input as a double floating point value

        celsius = (fahrenheit = 32) * 5 / 9; //Order of operations is important

        System.out.println(Double.toString(fahrenheit) + "° Fahrenheit is " + celsius + "° Celsius.");
        //keyboard shortcut for degree symbol on Mac is shift-option-8
    }
}
