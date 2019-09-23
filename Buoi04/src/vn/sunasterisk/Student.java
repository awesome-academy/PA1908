package vn.sunasterisk;

public class Student {
    public static final String School_Name = "THPT Trung Van";

    private String name;
    private String address;
    private boolean gender;

    public final String BAT_BUOC = "Dep Trai hoac Xinh Gai";

    public Student(String name, String address, boolean gender) {
        this.name = name;
        this.address = address;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public static String country() {
        return "Viet Nam";
    }

    public final boolean calScore(int score) {
        if(score >= 4){
            System.out.println("qua mon");
            return true;
        } else {
            System.out.println("Tạch!");
            return false;
        }

        /*if (score >= 4) {
            return true;
        }
        return false;*/

        //return score >= 4 ? true : false;
    }

    public class SomeThing{
        //inner class - class nam trong class khac.
    }
}
