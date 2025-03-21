package ex1;

import java.util.ArrayList;
import java.util.Iterator;

public class ex1 {
    public static void main(String[] args) {
        ArrayList<String> studentList = new ArrayList<>();

        studentList.add("Nguyễn Văn A");
        studentList.add("Trần Thị B");
        studentList.add("Lê Văn C");
        studentList.add("Phạm Thị D");
        studentList.add("Hoàng Văn E");

        System.out.println("Duyệt bằng vòng lặp for:");
        for (int i = 0; i < studentList.size(); i++) {
            System.out.println(studentList.get(i));
        }

        System.out.println("\nDuyệt bằng vòng lặp foreach:");
        for (String student : studentList) {
            System.out.println(student);
        }

        System.out.println("\nDuyệt bằng Iterator:");
        Iterator<String> iterator = studentList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
