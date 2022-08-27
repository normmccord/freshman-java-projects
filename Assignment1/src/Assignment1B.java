/*
Class: CSE 1321L
Section: J03
Term: Fall 22
Instructor: Chandana Avadhani
Name: Norman McCord
Assignment#: Assignment1B
*/

/*
Give weighted average grades and a final grade from data collected from the user/student.
*/

import java.util.Scanner;
public class Assignment1B {
    public static void main(String[] args){
        //Initialize all the variables.
        float avgLabGrade;
        float avgAssignmentGrade;
        float midtermExamGrade;
        float finalExamGrade;
        float weightedLabAvg;
        float weightedAssignmentAvg;
        float weightedMidtermAvg;
        float weightedFinalExamAvg;
        float finalGrade;

        //Gather user/student input for the average grades and test scores.
        System.out.println("[CSE1321L Final Grade Calculator]");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your average lab grade: ");
        avgLabGrade = scan.nextFloat();
        System.out.println("Enter your average assignment grade: ");
        avgAssignmentGrade = scan.nextFloat();
        System.out.println("Enter your midterm exam grade: ");
        midtermExamGrade = scan.nextFloat();
        System.out.println("Enter your final exam grade: ");
        finalExamGrade = scan.nextFloat();

        //Calculate final weighted scores and final grade.
        weightedLabAvg = avgLabGrade * 0.1f;
        weightedAssignmentAvg = avgAssignmentGrade * 0.4f;
        weightedMidtermAvg = midtermExamGrade * 0.2f;
        weightedFinalExamAvg = finalExamGrade * 0.3f;
        finalGrade = weightedLabAvg + weightedAssignmentAvg + weightedMidtermAvg + weightedFinalExamAvg;

        //Provide user/student with all the weighted grades and the final grade.
        System.out.println("Your weighted lab average is " + weightedLabAvg + ".");
        System.out.println("Your weighted assignment average is " + weightedAssignmentAvg + ".");
        System.out.println("Your weighted midterm exam average is " + weightedMidtermAvg + ".");
        System.out.println("Your weighted final exam average is " + weightedFinalExamAvg + ".");
        System.out.println("Adding numbers...");//So suspenseful...
        System.out.println("Your final grade in CSE 1321L is " + finalGrade);

    }
}
