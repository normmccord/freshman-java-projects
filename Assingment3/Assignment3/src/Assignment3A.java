/*
Class: CSE 1321L
Section: J03
Term: Fall 22
Instructor: Chandana Avadhani
Name: Norman McCord
Assignment#: Assignment3A
*/
import java.util.Scanner;
public class Assignment3A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("[Epic Quest Simulator]");
        System.out.println("Hello stranger! Do you have time to hear my tale?\n1) Yes\n2) No");
        String choice1 = sc.next();
        if (choice1.equals("1")) {
            System.out.println("Thank you! I have come from the land of Pax Bisonica. Our country has been taken over by a cruel tyrant!\n1) That's awful!\n2) What can I do?");
            String choice2 = sc.next();
            if (choice2.equals("1")){
                System.out.println("Alas, it is truly terrible...\nPlease, you must journey to Pax Bisonica and free our country!\n1) Yes\n2) No");
            }else {
                System.out.println("Please, you must journey to Pax Bisonica and free our country!");
            }
            String choice3 = sc.next();
            if (choice3.equals("1")){
                System.out.println("Hooray!");
            }else {
                System.out.println("Then all is lost...");
            }
        }else {
            System.out.println("Ah, then goodbye...");
        }
    }
}
