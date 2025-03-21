package ex9;

import java.util.ArrayList;
import java.util.Scanner;

public class ex9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("Nhap vao so luong so:");
        int numbersOfArray = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numbersOfArray; i++) {
            numbers.add(scanner.nextInt());
        }

        ArrayList<Integer> evenNumbers = new ArrayList<>();
        ArrayList<Integer> oddNumbers = new ArrayList<>();
        ArrayList<Integer> primeNumbers = new ArrayList<>();

        for (int num : numbers) {
            if (isPrime(num)) {
                primeNumbers.add(num);
            } else if (num % 2 == 0) {
                evenNumbers.add(num);
            } else {
                oddNumbers.add(num);
            }
        }
        System.out.println("\nSo nguyen to: " + primeNumbers);
        System.out.println("So chan: " + evenNumbers);
        System.out.println("So le: " + oddNumbers);

    }

    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
