package primeFactors;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactorsTest {
    private PrimeFactors primeFactors;

    private List<Integer> list(int... numbers) {
        List<Integer> factorsList = new ArrayList<Integer>();
        for (int number : numbers ) {
            factorsList.add(number);
        }
        return factorsList;
    }
    @Before
    public void setUp() {
        primeFactors = new PrimeFactors();
    }

    @Test
    public void checkifListReturns1() {
        assertEquals(list(), primeFactors.generate(1));
    }

    @Test
    public void checkIfListReturns2() {
        assertEquals(list(2), primeFactors.generate(2));
    }

    @Test
    public void checkIfListReturns3() {
        assertEquals(list(3), primeFactors.generate(3));
    }

    @Test
    public void checkIfListReturns2And2AsPrimesOf4() {
        assertEquals(list(2, 2), primeFactors.generate(4));
    }

    @Test
    public void checkIfListReturns5() {
        assertEquals(list(5), primeFactors.generate(5));
    }

    @Test
    public void checkIfListReturns2And3AsPrimesOf6() {
        assertEquals(list(2, 3), primeFactors.generate(6));
    }

    @Test
    public void checkIfListReturns7() {
        assertEquals(list(7), primeFactors.generate(7));
    }

    @Test
    public void checkIfListReturns2And2And2AsPrimesOf8() {
        assertEquals(list(2, 2, 2), primeFactors.generate(8));
    }

    @Test
    public void checkIfListReturns3And3AsPrimesOf9() {
        assertEquals(list(3, 3), primeFactors.generate(9));
    }

    @Test
    public void checkIfListReturns5And5AsPrimesOf10() {
        assertEquals(list(2, 5), primeFactors.generate(10));
    }
}