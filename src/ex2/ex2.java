package ex2;

import java.util.ArrayList;
import java.util.Iterator;

public class ex2 {
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
        numbers.add(9);
        numbers.add(10);

        System.out.println("Danh sách trước khi xóa:");
        System.out.println(numbers);

        for (int i = 0; i < numbers.size(); i++) {
            if(numbers.get(i)%3==0){
                numbers.remove(i);
            }
        }

        System.out.println("Danh sách sau khi xóa các số chia hết cho 3:");
        System.out.println(numbers);
    }
}
