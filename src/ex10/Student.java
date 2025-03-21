package ex10;
class Student {
    private String id;
    private String name;
    private double gpa;

    public Student(String id, String name, double gpa) {
        this.id = id;
        this.name = name;
        this.gpa = gpa;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getGpa() {
        return gpa;
    }

    public String getClassification() {
        if (gpa >= 8.5) return "Xuat sac";
        else if (gpa >= 7.0) return "Gioi";
        else if (gpa >= 5.5) return "Kha";
        else return "Trung Binh/Yeu";
    }
    @Override
    public String toString() {
        return "ID: " + id + ", Họ và Tên: " + name + ", GPA: " + gpa + " (" + getClassification() + ")";
    }
}



