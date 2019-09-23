package vn.sunasterisk;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Student student = new Student("Nam",
                "Ha Noi", true);
        System.out.println(student.getName() +
                " co dia chi " + student.getAddress() +
                " Hoc o " + Student.School_Name +
                " Co Quoc Tich la " + Student.country());

        student.calScore(3);
    }
}
