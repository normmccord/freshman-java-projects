import java.util.Scanner;
public class Lab3B {
    public static void main(String[] args){
        float course1Hours;
        float course2Hours;
        float course3Hours;
        float course4Hours;
        float course1Grade;
        float course2Grade;
        float course3Grade;
        float course4Grade;
        float course1QualityPoints;
        float course2QualityPoints;
        float course3QualityPoints;
        float course4QualityPoints;
        float totalHours;

        Scanner sc = new Scanner(System.in);
        System.out.print("Course 1 hours: ");
        course1Hours = sc.nextFloat();

        System.out.print("Grade for Course 1: ");
        course1Grade = sc.nextFloat();

        System.out.print("Course 2 hours: ");
        course2Hours = sc.nextFloat();

        System.out.print("Grade for Course 2: ");
        course2Grade = sc.nextFloat();

        System.out.print("Course 3 hours: ");
        course3Hours = sc.nextFloat();

        System.out.print("Grade for Course 3: ");
        course3Grade = sc.nextFloat();

        System.out.print("Course 4 hours: ");
        course4Hours = sc.nextFloat();

        System.out.print("Grade for Course 4: ");
        course4Grade = sc.nextFloat();

        totalHours = course1Hours + course2Hours + course3Hours + course4Hours;
        course1QualityPoints = course1Hours * course1Grade;
        course2QualityPoints = course2Hours * course2Grade;
        course3QualityPoints = course3Hours * course3Grade;
        course4QualityPoints = course4Hours * course4Grade;
        float totalQualPoints = course1QualityPoints + course2QualityPoints + course3QualityPoints + course4QualityPoints;

        System.out.println("Total hours is: " + totalHours);
        System.out.println("Total quality points is: " + totalQualPoints);
        System.out.println("Your GPA for this semester is " + (totalQualPoints / totalHours));
    }
}
