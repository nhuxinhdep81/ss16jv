package ex8;

import java.util.ArrayList;

public class ex8 {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();

//        strings.add("banana");
//        strings.add("apple");
//        strings.add("pear");
//        strings.add("kiwi");
//        strings.add("grape");

        strings.add("hello");
        strings.add("world");
        strings.add("java");
        strings.add("code");


        for (int i = 0; i < strings.size() - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < strings.size(); j++) {
                if (strings.get(j).length() < strings.get(minIndex).length()) {
                    minIndex = j;
                    String temp = strings.get(i);
                    strings.set(i, strings.get(minIndex));
                    strings.set(minIndex, temp);
                }
                else if (strings.get(j).length() == strings.get(minIndex).length() &&
                        strings.get(j).compareTo(strings.get(minIndex)) < 0) {
                    minIndex = j;
                    String temp = strings.get(i);
                    strings.set(i, strings.get(minIndex));
                    strings.set(minIndex, temp);
                }
            }

        }
        System.out.println("\nDAnh sach sau khi sap xep:");
        System.out.println(strings);
    }
}
