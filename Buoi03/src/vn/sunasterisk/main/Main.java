package vn.sunasterisk.main;

import vn.sunasterisk.employee.Employee;
import vn.sunasterisk.employee.Security;

public class Main {

    public static void main(String[] args) {
        // write your code here
        /**
         * Lập trình hướng đối tượng là các giải quyết một bài toán lập
         * trình theo đối tượng, có nghĩa là phân tích bài toàn thành nhiều
         * đối tượng, các đối tượng thì có các thuộc tính và các phương
         * thức, các đối tượng tương tác với nhau thông qua các phương
         * thức, và từ đó hình thành nên các chức năng của bài toán.
         */

        /*Employee employee = new Employee();
        employee.setId(1);
        employee.setName("Nguyen Van Dung");
        employee.setAge(29);
        employee.setGender(true);*/


        //Employee employee =
        //       new Employee(1, "Nguyen Van Dung", 29, true);

        //employee.printInformation();
        /*System.out.println("*Thong Tin Nhan Vien*");
        System.out.println("Nhan vien " + employee.getAge());
        System.out.println("Co ma la " + employee.getId());
        System.out.println("Co tuoi la " + employee.getAge());*/

        Security security = new Security();
        //Security security1 = (Security) new Employee();
        security.setId(2);
        security.setName("Obama");
        security.setAge(40);
        security.setGender(false);
        security.setHeight(1.7f);
        security.setWeight(80f);

        security.printInformation();
        security.trongXe();
        security.smokeThuocLao();
    }
}
