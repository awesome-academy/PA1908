package vn.sunasterisk;

public class Student {
    private String name;
    private int age;
    private String id;
    private int grade;
    private boolean gender;

    private Car car;

    // biến thuộc class nhưng không thuộc method hay block nào.
    int height = 170;

    public void eat() {
        System.out.println("eat rice!");
        System.out.println("eat bread!");
    }

    public void sleep() {
        // biến khai báo trong phương thức - medthod hoặc khai báo trong block {}
        // thì được gọi là
        // biến cục bộ - local variable
        int hourSleep = 8;
        System.out.println("sleep " + hourSleep + "h!");
    }

    @Override
    public String toString() {
        return "This is student";
    }

    public int getNumberOfCars(){
        int numberCar = 2;
        System.out.println(numberCar);
        return numberCar;
    }
}
