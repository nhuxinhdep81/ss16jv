public class GenericDemo {

    public static void main(String[] args) {
        System.out.println("Demo claass generic");

        ClassGeneric<String,String> object = new ClassGeneric<>("SV001", "Le DIen tien");
        System.out.println("Thong tin sinh vien: " + object.toString());

        ClassGeneric<Integer, String> objBook = new ClassGeneric<>(1, "Toan dai cuong");
        System.out.println("Thong tin sach: " + objBook.toString());

        System.out.println("Demo method Generic");
        String[] arrString = {"Le Dien Tien", "Le Dien Manh"};
        Integer[] arrInt = {1, 2, 3};

        MethodGeneric.printArray(arrString);
        MethodGeneric.printArray(arrInt);

    }
}
