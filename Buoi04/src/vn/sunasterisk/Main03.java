package vn.sunasterisk;

public class Main03 {
    public static void main(String[] args) {
        String name = "Hiep";
        String name2 = "Hiep";
        String name3 = new String("Hiep");
        String name4 = new String("Hiep");

        System.out.println(name == name2);
        System.out.println(name == name3);
        System.out.println(name.equals(name3));
        System.out.println(name3 == name4);
        System.out.println(name3.equals(name4));
    }
}
