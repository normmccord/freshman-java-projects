/*
Class: CSE 1321L
Section: J03
Term: Fall 22
Instructor: Chandana Avadhani
Name: Norman McCord
Lab#: 2C
*/

/*
Sample Run:
Enter a width:
Enter a Height:
The area is 32
The perimeter is 24

area = wl
perimeter = 2(l+w)
*/

import java.util.Scanner;

public class Lab2C {
    public static void main(String[] args){
        int width;
        int height;
        int area;
        int perimeter;

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a width: ");
        width = scan.nextInt(); //Lots of 'next' options; remember to choose Int
                                //or the program will try to do math on a string.

        System.out.print("Enter a height: ");
        height = scan.nextInt();

        area = width * height;
        perimeter = 2*(width + height);

        System.out.println("The area is " + area);
        System.out.println("The perimeter is " + perimeter);
    }
}
