//Examples of reference variables

import java.util.Date;

public class ReferenceVariables {
    public static void main(String[] args){
        Date now = new Date();
        System.out.println(now);
        String message = "Hello World!";
        System.out.println(message);
        System.out.println(message.replace("Hello", "How ya doin,"));
    }
}
