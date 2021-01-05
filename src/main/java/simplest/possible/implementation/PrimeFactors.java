package simplest.possible.implementation;

import java.util.List;
import java.util.ArrayList;

public class PrimeFactors {
    public List<Integer> factorsList = new ArrayList<Integer>();

    public List<Integer> of(int number) {

        if (number == 2) {
            factorsList.add(2);
        }
        return factorsList;
    }
}
