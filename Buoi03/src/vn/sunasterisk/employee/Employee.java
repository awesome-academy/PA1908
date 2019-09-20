package vn.sunasterisk.employee;

public class Employee {
    /**
     * khai báo các thuộc tính của các data class
     * thường là private - mức độ truy cập của nó
     * chỉ ở trong class mà thôi.
     */
    private int id;
    private String name;
    private int age;
    private boolean gender;

    public Employee() {
    }

    public Employee(int id, String name, int age, boolean gender) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public void printInformation() {
        System.out.println("Ma nhan vien la : " + id);
        System.out.println("Ten nhan vien la : " + name);
        System.out.println("Tuoi nhan vien la : " + age);
        if (gender == true) {
            System.out.println("Gioi tinh la Nam");
        } else {
            System.out.println("Gioi tinh la Nu");
        }
    }
}
