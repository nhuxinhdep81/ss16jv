package ex4;

import java.util.ArrayList;

public class ex4 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        System.out.println("DADDnh sach so :");
        System.out.println(numbers);

        int sum = 0;
        for (int i = 0; i < numbers.size(); i++) {
            sum += numbers.get(i);
        }
        System.out.println("Tong cac phan tu: " + sum);
    }
}
