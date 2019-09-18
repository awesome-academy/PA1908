package vn.sunasterisk;

public class Main {

    public static void main(String[] args) {
        // write your code here
//        for (int i = 100; i <= 1000; i++) {
//            if (i % 2 == 0) {
//                System.out.println(i);
//            }
//        }

        // Số nguyên tố là số chỉ chia hết cho 1 và chính nó.
//        for (int i = 2; i <= 100; i++) {
//            int count = 0;
//            for (int j = 2; j <= i/2; j++) {
//                if (i % j == 0) {
//                    count++;
//                }
//            }
//            if (count == 0) {
//                System.out.println(i);
//            }
//        }

        for (int i = 100; i > 1; i--) {
            if (i % 3 == 0 || i % 7 == 0) {
                System.out.println(i);
            }
        }
    }
}
