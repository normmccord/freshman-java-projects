/*
Class: CSE 1321L
Section: J03
Term: Fall 22
Instructor: Chandana Avadhani
Name: Norman McCord
Lab#: 2A
 */

/*
Enter a name: Tiffany
Enter another name: Bubba
Enter a verb: eat
Enter an adverb: wickedly
Once upon a time, there was a person named Tiffany who had a child named
Bubba. This child would eat wickedly while singing to strangers.
*/

import java.util.Scanner;
public class Lab2A {
    public static void main(String[] args){
        String name1;
        String name2;
        String verb;
        String adverb;

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a name: ");
        name1 = scan.nextLine();

        System.out.print("enter another name: ");
        name2 = scan.nextLine();

        System.out.print("Enter a verb: ");
        verb = scan.nextLine();

        System.out.print("Enter an adverb: ");
        adverb = scan.nextLine();

        System.out.println("Once upon a time, there was a person named " + name1 +
                " who had a child named " + name2 + ". This child would " + verb +
                " " + adverb + " while singing to others.");

    }
}
