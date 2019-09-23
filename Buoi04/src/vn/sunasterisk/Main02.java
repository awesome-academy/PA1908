package vn.sunasterisk;

public class Main02 {
    public static void main(String[] args) {
        /*Thread thread01 = new Thread(new Runnable() {
            @Override
            public void run() {
                //doSomething
                for (int i = 1 ; i <= 1000; i++){
                    System.out.println("Thread01 "+i);
                }
            }
        });

        Thread thread02 = new Thread(new Runnable() {
            @Override
            public void run() {
                //doSomething
                for (int i = 1 ; i <= 1000; i++){
                    System.out.println("Thread02 "+i);
                }
            }
        });

        thread01.start();
        thread02.start();*/

        new MyThread().start();
        new Thread(new YourThread()).start();
    }
}
