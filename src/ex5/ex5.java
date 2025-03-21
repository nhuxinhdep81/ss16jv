package ex5;

import java.util.ArrayList;

public class ex5 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(2);
        numbers.add(4);
        numbers.add(1);
        numbers.add(5);

        ArrayList<Integer> checkedNumbers = new ArrayList<>();
        System.out.println("\nSo lan xuat hien:");
        for (int i = 0; i < numbers.size(); i++) {
            int count = 0;
            int currentNumber = numbers.get(i);
            if (checkedNumbers.contains(currentNumber)) {
                continue;
            }
            for (int j = 0; j < numbers.size(); j++) {
                if (numbers.get(j) == currentNumber) {
                    count++;
                }
            }
            checkedNumbers.add(currentNumber);
            System.out.println(currentNumber + " - " + count + " lan");
        }
    }
}

