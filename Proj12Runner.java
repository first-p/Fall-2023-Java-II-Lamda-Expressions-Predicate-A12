/***************************************************
 File: Proj12runner.java
 Author: Fred Butoma
 Purpose: Proj12Runner.java is a class that uses
        the Predicate function interface to determine
        if a string is a palindrome
 ***************************************************/
import java.util.function.Predicate;

public class Proj12Runner {

    public Proj12Runner() {
        // Print the certification statement
        System.out.println("I certify that this program is my own work\n" +
                "and is not the work of others. I agree not\n" +
                "to share my solution with others.\n" +
                "Fred Butoma");
    }

    public boolean[] run(String x, String y, String z) {
        // Lambda expression using Predicate functional interface
        Predicate<String> isPalindrome = str -> str.equalsIgnoreCase(new StringBuilder(str).reverse().toString());

        // Check each string and store the results in a boolean array
        boolean[] results = new boolean[3];
        results[0] = isPalindrome.test(x);
        results[1] = isPalindrome.test(y);
        results[2] = isPalindrome.test(z);

        return results;

    }
}

