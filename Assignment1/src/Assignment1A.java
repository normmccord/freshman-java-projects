/*
Class: CSE 1321L
Section: J03
Term: Fall 22
Instructor: Chandana Avadhani
Name: Norman McCord
Assignment#: Assignment1A
*/

/*
Convert user input of an image size in pixels, and the desired resolution,
and give the corresponding size of the image in inches
*/

import java.util.*;
public class Assignment1A {
    public static void main(String[] args){
        //Initializing the variables
        int heightInPixels;
        int widthInPixels;
        int resolution;
        float heightInInches;
        float widthInInches;

        System.out.println("[Print Resolution]");//Title of the program

        Scanner scan = new Scanner (System.in);//Get user input for each variable
        System.out.println("Enter the width (in pixels): ");
        widthInPixels = scan.nextInt();

        System.out.println("Enter the height (in pixels): ");
        heightInPixels = scan.nextInt();

        System.out.println("Enter the resolution (PPI): ");
        resolution = scan.nextInt();

        //Calculate image size in inches with the provided pixels sizes and resolution
        widthInInches = (float) widthInPixels / resolution;
        heightInInches = (float) heightInPixels / resolution;
        //Had to 'cast' float in order to give the decimals for the output inches.

        //Don't forget the double quotes after the new sizes to indicate inches
        System.out.println("At " + resolution + ", the image is " + widthInInches + "\"" + " wide by " + heightInInches + "\"" + "high.");

    }
}
