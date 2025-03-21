package ex10;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static ArrayList<Student> students = new ArrayList<>();

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n****** QUAN LY SINH VIEN *******");
            System.out.println("1. Nhap danh sach sinh vien");
            System.out.println("2. in danh sach sinh vien(Sau khi phan loai GPA)");
            System.out.println("3. tim kiem sinh vien theo ten");
            System.out.println("5. Thoat");
            System.out.print("Chon chuc nang: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    inputStudents();
                    break;
                case 2:
                    printStudents();
                    break;
                case 3:
                    searchStudentByName();
                    break;
                case 4:
                    System.out.println("THoat chuong trinh");
                    return;
                default:
                    System.out.println("Lua chon khong hop lej, vui long chon lai");
            }
        }
    }
    private static void inputStudents() {
        System.out.print("Nhap so luong sinh vien can them: ");
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            System.out.print("Ma sinh vien: ");
            String id = scanner.nextLine();
            System.out.print("Ten sinh vien: ");
            String name = scanner.nextLine();
            System.out.print("GPA: ");
            double gpa = Double.parseDouble(scanner.nextLine());

            students.add(new Student(id, name, gpa));
        }
    }

    private static void printStudents() {
        if (students.isEmpty()) {
            System.out.println("Danh sach sv trong");
            return;
        }
        for (Student s : students) {
            System.out.println(s);
        }
    }

    private static void searchStudentByName() {
        System.out.print("Nhap ten sv can tim: ");
        String nameSearch = scanner.nextLine();
        boolean found = false;

        for (Student s : students) {
            if (s.getName().toLowerCase().contains(nameSearch.toLowerCase())) {
                System.out.println(s);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Khong tim thay ten sinh vien co ten : " + nameSearch);
        }
    }
}