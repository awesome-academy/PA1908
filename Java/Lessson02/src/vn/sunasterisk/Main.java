package vn.sunasterisk;

public class Main {

    public static void main(String[] args) {
        // write your code here
//        int i = 25;
//        Student student01 = new Student();
//        String str01 = "Hello Tien Dep Zai!";
//        String str02 = new String("PA1908");
//
//        System.out.println(i);
//        System.out.println(student01);
//        System.out.println(str01);
//        System.out.println(str02);

//        char a = 81;
//        char b = 'h';
//        System.out.println(a);
//        System.out.println(b);

//        int c = 200;
//        double d = 19.9876;
//        System.out.println(c);
//        System.out.println(d);
//
//        Integer e = new Integer(10);
//        Double f = new Double(11.23);
//        Long l = new Long(10989);
//        Float k = new Float(18.123);
//
//        System.out.println(e);
//        System.out.println(f);
//        System.out.println(l);
//        System.out.println(k);
//
//        Student student = new Student();
//        student.sleep();

//        String[] names
//                = {"Mau Anh", "Nam", "Chien", "Ban",
//                "Hiep", "Dung", "Tien", "Cong", "Tien"};
//        System.out.println("tổng số tên là: " + names.length);
//        System.out.println("Bao gom: ");
//        for (int i = 0; i < names.length; i++) {
//            System.out.println(names[i]);
//        }

        //String[] namesPA1908 = new String[9];
//        for (int i = 0; i < namesPA1908.length; i++) {
//            namesPA1908[i] = "name" + (i + 1);
//            System.out.println(namesPA1908[i]);
//        }
//        namesPA1908[0] = "Tien";
//        namesPA1908[5] = "Dung Phong Do";
//        for (int i = 0; i < namesPA1908.length; i++) {
//            System.out.println(namesPA1908[i]);
//        }

//        ArrayList<String> songNames = new ArrayList<>();
//        songNames.add("Sóng Gió");
//        songNames.add("Duyen Phan");
//        songNames.add("Hong Nhan");
//        songNames.add("Bach Phan");
//        songNames.add("Bac");
//
//        songNames.remove(0);
//        songNames.remove("Hong Nhan");
//        //songNames.clear();
//
//        for(int i = 0; i < songNames.size(); i++){
//            System.out.println(songNames.get(i));
//        }

//        int i = 0;
//        while (i < 100) {
//            if (i == 30) {
//                i++;
//                continue;
//            }
//            System.out.printf(" " + i);
//            i++;
//        }

//        do {
//            System.out.printf(" " + i);
//            i++;
//        } while (i < 50);


        int k = 2;
        switch (k) {
            case 1:
            case 2:
                System.out.printf("Mot hoac Hai");
                break;
            case 3:
                System.out.printf("Ba");
                break;
            case 4:
                System.out.printf("Bon");
                break;
            case 5:
                System.out.printf("Nam");
                break;
            case 6:
                System.out.printf("Sau");
                break;
            case 7:
                System.out.printf("Bay");
                break;
            default:
                System.out.printf("Khong co so nay!");
                break;
        }
    }
}
