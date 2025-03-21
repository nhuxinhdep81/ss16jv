package ex7;

import java.util.ArrayList;

public class ex7 {
    public static void main(String[] args) {
        // Tạo danh sách ArrayList lưu các số nguyên
        ArrayList<Integer> numbers = new ArrayList<>();

        // Thêm các phần tử vào danh sách (có trùng lặp)
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(2);
        numbers.add(5);
        numbers.add(6);
        numbers.add(3);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        numbers.add(10);
        numbers.add(1);
        numbers.add(11);
        numbers.add(12);
        numbers.add(13);
        numbers.add(14);
        numbers.add(3);
        numbers.add(5);
        numbers.add(7);

        ArrayList<Integer> uniqueNumbers = new ArrayList<>();

        ArrayList<Integer> checkedNumbers = new ArrayList<>();
        System.out.println("Cac phan tu trung llap");
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
            if (count == 1) {
                uniqueNumbers.add(currentNumber);
            } else {
                System.out.println(currentNumber + " xuat hien " + count + " lan");
            }

            checkedNumbers.add(currentNumber);
        }

        System.out.println("\nCac chi so xuat hien mot lan:");
        System.out.println(uniqueNumbers);
    }
}
