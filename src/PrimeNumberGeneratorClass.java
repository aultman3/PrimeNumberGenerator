import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Erik Aultman
 * 
 */

final class PrimeNumberGeneratorClass implements PrimeNumberGenerator {
    @Override
    public List<Integer> generate(int startingValue, int endingValue) {
        //List to store prime numbers that might be found in the indicated range
        List<Integer> primeNumbers = new ArrayList<Integer>();
        //logic element to reverse the for loop if the ranges are given in descending order
        boolean reverse = false;
        //value to increment in the list to the next value to check
        int increment = 1;
        /*
         * if ranges are given in descending order set reverse logic element to
         * change the limit from max to min in for loop and change the increment
         * to decrement by 1 instead of increment by 1
         */
        if (startingValue > endingValue) {
            reverse = true;
            increment = -1;
        }
        /*
         * loop through number is range either up 1 if ranges given in ascending
         * order or down 1 if ranges given in descending order and the loop
         * limit will be changed from a max limit i<maxLimit to i>minLimit
         * respectively. If number is prime add it to the list.
         */
        for (int i = startingValue; (!reverse && i < endingValue)
                || (reverse && i > endingValue); i += increment) {
            /*
             * if number is prime add to list
             */
            if (this.isPrime(i)) {
                primeNumbers.add(i);
            }

        }
        /*
         * Check for endingValue separate to avoid Integer max overflow
         */
        if (this.isPrime(endingValue)) {
            primeNumbers.add(endingValue);
        }

        /*
         * return the list of prime numbers
         */
        return primeNumbers;
    }

    @Override
    public boolean isPrime(int value) {
        boolean result = false; //return value;
        /*
         * if value is less than 2 this is a special case and is returned false
         */
        if (value < 2) {
            return false;
        }
        /*
         * if value is 2 then this is a special case and is returned true
         */
        if (value == 2) {
            return true;
        }
        /*
         * if value is even return (result)
         */
        if (value % 2 == 1) {
            /*
             * Iterate through all odd numbers starting at 3 and ending at the
             * square root of value because beyond the number after that point
             * will be redundant
             */
            for (int i = 3; i <= (Math.sqrt(value)); i += 2) {
                /*
                 * if value is divisible by the number then return false
                 */
                if (value % i == 0) {
                    return false;
                }
            }
            /*
             * if no divisor is found return true
             */
            result = true;

        }
        return result;
    }
}
