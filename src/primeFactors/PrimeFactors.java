package primeFactors;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {

    public List<Integer> generate (int number) {
        List<Integer> factorsList = new ArrayList<Integer>();
        int half = 2;
        while (number > 1) {
            while (number % half == 0) {
                factorsList.add(half);
                number /= half;
            }
            half++;
        }
        return factorsList;
    }
}
