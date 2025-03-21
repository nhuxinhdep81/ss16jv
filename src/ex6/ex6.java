package ex6;

import java.util.ArrayList;

public class ex6 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(4);
        numbers.add(5);
        System.out.println("danh sach dau vao: " + numbers);
        System.out.println("Danh sach dau ra: " + removeElement(numbers));

    }

    public static ArrayList<Integer> removeElement(ArrayList<Integer> list) {
        // taso 1 array list de luu cac phan tu da ton tai
        ArrayList<Integer> uniqueList = new ArrayList<>();
        for (Integer num : list) {
            if (!uniqueList.contains(num)) {
                uniqueList.add(num);
            }
        }
        return uniqueList;
    }
}

