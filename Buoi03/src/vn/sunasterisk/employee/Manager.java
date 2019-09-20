package vn.sunasterisk.employee;

import java.util.Date;

public class Manager extends Employee {

    public void meeting(Date date, String location) {
        System.out.println("Ho vao luc " + date + " tai " + location);
    }

    public void meeting() {
        System.out.println("hop");
    }

    public void meeting(String location) {
        System.out.println("hop o " + location);
    }
}
