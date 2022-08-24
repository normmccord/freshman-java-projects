//Examples of primitive variables used in Java
public class PrimitiveVariables {
    public static void main(String[] args){
        byte age = 30; //a byte's range is -128 to 127
        short totalStudents = 32000; //A 'short' can store numbers between -32K and 32K
        int widthInInches = 180; //An 'int' can store numbers a little over 2 billion
        long viewsCount = 3_123_456_789L; //'long' needs an L/l at the end because
        // Java thinks the number is an Int by default, and this value is too long for an Int.
        float price = 10.99F; //float needs an F/f at the end because Java thinks this is a
        //double by default.  A double would be too long for this use.
        double measureOfPI = 3.1415926535; //Doubles can store more digits than floats
        char letter = 'A'; //'Char' only stores one character
        boolean isEligible = false; //'Boolean' can only be 'true' or 'false'
    }
}
