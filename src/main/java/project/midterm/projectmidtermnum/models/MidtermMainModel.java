package project.midterm.projectmidtermnum.models;

import java.util.ArrayList;

public class MidtermMainModel {

    private final ArrayList<Integer> numArray = new ArrayList<>();

    public boolean addNumber(String num) {
        try {
            int numParsed = Integer.parseInt(num);

            numArray.add(numParsed);
            return true;
        } catch (NumberFormatException ex) {
            return false;
        }
    }

    public int getSum() {
        int sum = 0;
        for (Integer num : numArray) {
            sum += num;
        }
        return sum;
    }

    public int getEntries() {
        return numArray.size();
    }
}
