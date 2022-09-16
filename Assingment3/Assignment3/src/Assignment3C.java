/*
Class: CSE 1321L
Section: J03
Term: Fall 22
Instructor: Chandana Avadhani
Name: Norman McCord
Assignment#: Assignment3C
*/
import java.util.Scanner;
public class Assignment3C2 {
    public static void main(String[] args){
        System.out.println("[App Checklist]");
        Scanner sc = new Scanner(System.in);
        System.out.print("What mobile device do you have? ");
        String mobileDevice = sc.nextLine();
        switch (mobileDevice) {
//for Android
            case "Android", "android" -> {
                System.out.print("What version do you have? ");
                float androidVersion = sc.nextFloat();
//for Android 11 or higher
                if (androidVersion >= 11) {
                    System.out.println("Congratulations, you can run the app!");
                    break;
//for Android lower than 11
                } else if (androidVersion < 11) {
                    System.out.print("Does your device support Augmented Reality? ");
                    String augRealSupt = sc.next();
                    if (augRealSupt.equals("y") || augRealSupt.equals("Y") || augRealSupt.equals("yes") || augRealSupt.equals("Yes")) {
                        System.out.println("Congratulations, you can run the app!");
                        break;
                    } else if (augRealSupt.equals("n") || augRealSupt.equals("N") || augRealSupt.equals("No") || augRealSupt.equals("no")) {
                        System.out.println("I'm sorry, our app does not support your device.");
                        break;
                    }
                }
            }
//for Apple
            case "apple", "Apple" -> {
                System.out.print("What version do you have? ");
                float iOS = sc.nextFloat();
//for iOS above 12
                if (iOS >= 12) {
                    System.out.println("Congratulations, you can run the app!");
                    break;
//for iOS under 12
                } else if (iOS < 12) {
                    System.out.print("Does your device support Bluetooth connections? ");
                    String blueToothSupt = sc.next();
                    if (blueToothSupt.equals("y") || blueToothSupt.equals("Y") || blueToothSupt.equals("yes") || blueToothSupt.equals("Yes")) {
                        System.out.println("Congratulations, you can run the app!");
                        break;
                    } else if (blueToothSupt.equals("n") || blueToothSupt.equals("N") || blueToothSupt.equals("no") || blueToothSupt.equals("No")) {
                        System.out.println("I'm sorry, our app does not support your device.");
                        break;
                    }
                }
            }default -> System.out.println("I'm sorry, our app does not support your device.");
        }
    }
}
