import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Erik Aultman
 */

/**
 * Accepts a range from the user to find all prime number in range, inclusively.
 * Ranges can be in ascending or descending order and will be printed to the
 * screen one number per line in a vertical list.
 */
public final class PrimeNumberGeneratorMain {
    /**
     * Starts at the given starting position (pos) in the given string (str) and
     * returns the substring of numbers starting at (pos) in the string (str)
     * and ending either at the end of the string (str) or the first non numeric
     * character.
     * 
     * @param String
     *            str - the string containing the numbers int pos - the starting
     *            position in the string (str) to start checking
     * 
     * @return the substring containing the set of numbers starting at position
     *         (pos) and ending either at the end of the string (str) or at the
     *         first non numeric character. *Note: can return an empty string
     */
    private static String nextNum(String str, int pos) {
        int i = pos; //The position to start checking characters
        int strLen = str.length(); //The length of the string to know when to stop checking
        /*
         * loop through the string until the end of the string or the first non
         * numeric character is found
         */
        while (i < strLen && Character.isDigit(str.charAt(i))) {
            i++;
        }
        /*
         * return the resulting substring
         */
        return str.substring(pos, i);
    }

    /**
     * Prints all of the values in the list to the screen in a vertical list
     * 
     * @param list
     *            The list of integers to print to the screen
     */
    static void printValues(List<Integer> list) {
        int i = list.size(); //number of entries in list
        int j = 0; //counter for printing list
        /*
         * loop through list and print all of the entries to the screen, 1 entry
         * per line
         */
        while (j < i) {
            System.out.println(list.get(j));
            j++;
        }
    }

    public static void main(String[] args) {
        //input stream for user defined ranges
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        //interface for generating prime numbers in given range
        PrimeNumberGenerator primeNumber = new PrimeNumberGeneratorClass();
        //list to record prime numbers
        List<Integer> primes = new ArrayList<Integer>();
        System.out
                .println("Enter the range of numbers to be checked seperated by \"-\"");
        String ranges = ""; //user input string to obtain ranges
        /**
         * read console line in
         */
        try {
            ranges = in.readLine();
        } catch (IOException e) {
            System.err.println("Error reading input.");
            e.printStackTrace();
        }
        /*
         * Get first range value
         */
        String startStr = nextNum(ranges, 0);
        /*
         * Get second range value
         */
        String endStr = nextNum(ranges, startStr.length() + 1);
        /*
         * Uses ranges to get a list of prime numbers
         */
        primes = primeNumber.generate(Integer.parseInt(startStr),
                Integer.parseInt(endStr));
        /*
         * Print the prime numbers to console as a vertical list
         */
        printValues(primes);
    }

}