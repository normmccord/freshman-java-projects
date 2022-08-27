/*
Class: CSE 1321L
Section: J03
Term: Fall 22
Instructor: Chandana Avadhani
Name: Norman McCord
Assignment#: Assignment1C
*/
/*
A program to generate the next few letters that come after a letter given by the user, in
alphabetical order.
 */

import java.util.Scanner;
public class Assignment1C {
    public static void main(String[] args){
        char letter1;
        char letter2;
        char letter3;
        char letter4;

        Scanner scan = new Scanner(System.in);
        System.out.println("[And the next letter is]");
        System.out.println("Please enter a letter: ");
        letter1 = scan.next().charAt(0);
        letter2 = (char) (letter1+1);
        letter3 = (char) (letter2+1);
        letter4 = (char) (letter3+1);

        System.out.println("The next letters after " + letter1 + " are " + letter2 + ", " + letter3 + ", and " + letter4 + "!");
    }
}
