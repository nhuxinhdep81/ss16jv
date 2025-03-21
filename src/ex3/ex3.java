package ex3;

import java.util.ArrayList;
import java.util.Collections;

public class ex3 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);

        int maxNumber = Collections.max(numbers);
        int minNumber = Collections.min(numbers);

        System.out.println("phan tu lon nhat: " + maxNumber);
        System.out.println("phan tu nho nhat: " + minNumber);
    }
}
