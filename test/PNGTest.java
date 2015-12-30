import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

/**
 * 
 * @author Erik Aultman
 * 
 */

public class PNGTest {
    private static List<Integer> createFromArgs(Integer... args) {
        List<Integer> result = new ArrayList<Integer>();
        for (int i = 0; i < args.length; i++) {
            result.add(args[i]);
        }
        return result;
    }

    /*
     * Test for smallest prime number
     */
    @Test
    public void minIsPrimeTest() {
        PrimeNumberGenerator primeNumber = new PrimeNumberGeneratorClass();
        assertEquals(true, primeNumber.isPrime(2));
    }

    /*
     * Test for largest Integer prime number
     */
    @Test
    public void maxIsPrimeTestTrue() {
        PrimeNumberGenerator primeNumber = new PrimeNumberGeneratorClass();
        assertEquals(true, primeNumber.isPrime(Integer.MAX_VALUE));
    }

    /*
     * Test for requested special case prime number
     */
    @Test
    public void specialCaseOneIsPrimeTestTrue() {
        PrimeNumberGenerator primeNumber = new PrimeNumberGeneratorClass();
        assertEquals(true, primeNumber.isPrime(7901));
    }

    /*
     * Test for requested special case prime number
     */
    @Test
    public void specialCaseTwoIsPrimeTestTrue() {
        PrimeNumberGenerator primeNumber = new PrimeNumberGeneratorClass();
        assertEquals(true, primeNumber.isPrime(7907));
    }

    /*
     * Test for requested special case prime number
     */
    @Test
    public void specialCaseThreeIsPrimeTestTrue() {
        PrimeNumberGenerator primeNumber = new PrimeNumberGeneratorClass();
        assertEquals(true, primeNumber.isPrime(7919));
    }

    /*
     * Test for composite number
     */
    @Test
    public void IsPrimeTestFalse() {
        PrimeNumberGenerator primeNumber = new PrimeNumberGeneratorClass();
        assertEquals(false, primeNumber.isPrime(879));
    }

    /*
     * Test for requested special case prime number generator
     */
    @Test
    public void generateRequestedCaseTest() {
        PrimeNumberGenerator primeNumber = new PrimeNumberGeneratorClass();
        List<Integer> primes = new ArrayList<Integer>();
        List<Integer> primeResults = createFromArgs(7901, 7907, 7919);
        int startingValue = 7900;
        int endingValue = 7920;
        primes = primeNumber.generate(startingValue, endingValue);
        assertEquals(primeResults, primes);
    }

    /*
     * Test for requested special case prime number generator reverse order
     */
    @Test
    public void generateReversedRequestedCaseTest() {
        PrimeNumberGenerator primeNumber = new PrimeNumberGeneratorClass();
        List<Integer> primes = new ArrayList<Integer>();
        List<Integer> primeResults = createFromArgs(7919, 7907, 7901);
        int startingValue = 7920;
        int endingValue = 7900;
        primes = primeNumber.generate(startingValue, endingValue);
        assertEquals(primeResults, primes);
    }

    /*
     * Test for minimum prime number generator
     */
    @Test
    public void generateMinCaseTest() {
        PrimeNumberGenerator primeNumber = new PrimeNumberGeneratorClass();
        List<Integer> primes = new ArrayList<Integer>();
        List<Integer> primeResults = createFromArgs(2, 3);
        int startingValue = 2;
        int endingValue = 3;
        primes = primeNumber.generate(startingValue, endingValue);
        assertEquals(primeResults, primes);
    }

    /*
     * Test for minimum prime number generator reverse order
     */
    @Test
    public void generateReverseMinCaseTest() {
        PrimeNumberGenerator primeNumber = new PrimeNumberGeneratorClass();
        List<Integer> primes = new ArrayList<Integer>();
        List<Integer> primeResults = createFromArgs(3, 2);
        int startingValue = 3;
        int endingValue = 2;
        primes = primeNumber.generate(startingValue, endingValue);
        assertEquals(primeResults, primes);
    }

    /*
     * Test for maximum prime number generator
     */
    @Test
    public void generateMaxCaseTest() {
        PrimeNumberGenerator primeNumber = new PrimeNumberGeneratorClass();
        List<Integer> primes = new ArrayList<Integer>();
        List<Integer> primeResults = createFromArgs(Integer.MAX_VALUE);
        int startingValue = Integer.MAX_VALUE - 1;
        int endingValue = Integer.MAX_VALUE;
        primes = primeNumber.generate(startingValue, endingValue);
        assertEquals(primeResults, primes);
    }

    /*
     * Test for maximum prime number generator reverse order
     */
    @Test
    public void generateReverseMaxCaseTest() {
        PrimeNumberGenerator primeNumber = new PrimeNumberGeneratorClass();
        List<Integer> primes = new ArrayList<Integer>();
        List<Integer> primeResults = createFromArgs(Integer.MAX_VALUE);
        int startingValue = Integer.MAX_VALUE;
        int endingValue = Integer.MAX_VALUE - 1;
        primes = primeNumber.generate(startingValue, endingValue);
        assertEquals(primeResults, primes);
    }

    /*
     * Test for inclusive range prime number generator
     */
    @Test
    public void generateInclusiveRangeTest() {
        PrimeNumberGenerator primeNumber = new PrimeNumberGeneratorClass();
        List<Integer> primes = new ArrayList<Integer>();
        List<Integer> primeResults = createFromArgs(11, 13, 17, 19);
        int startingValue = 11;
        int endingValue = 19;
        primes = primeNumber.generate(startingValue, endingValue);
        assertEquals(primeResults, primes);
    }

    /*
     * Test for special case number 1 prime number generator
     */
    @Test
    public void generateNumberOneTest() {
        PrimeNumberGenerator primeNumber = new PrimeNumberGeneratorClass();
        List<Integer> primes = new ArrayList<Integer>();
        List<Integer> primeResults = createFromArgs(2, 3);
        int startingValue = 1;
        int endingValue = 3;
        primes = primeNumber.generate(startingValue, endingValue);
        assertEquals(primeResults, primes);
    }

    /*
     * Test for large range prime number generator
     */
    @Test
    public void generateLargeRangeTest() {
        PrimeNumberGenerator primeNumber = new PrimeNumberGeneratorClass();
        List<Integer> primes = new ArrayList<Integer>();
        List<Integer> primeResults = createFromArgs(2, 3, 5, 7, 11, 13, 17, 19,
                23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89,
                97, 101);
        int startingValue = 1;
        int endingValue = 101;
        primes = primeNumber.generate(startingValue, endingValue);
        assertEquals(primeResults, primes);
    }

}
