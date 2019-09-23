package vn.sunasterisk.quanly;

import vn.sunasterisk.canbo.CanBo;
import vn.sunasterisk.canbo.CongNhan;
import vn.sunasterisk.canbo.KySu;
import vn.sunasterisk.canbo.NhanVien;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuanLyCanBo {
    private List<CanBo> danhSachCanBo;

    public QuanLyCanBo() {
        danhSachCanBo = new ArrayList<>();
    }

    public void quanLyCanBo() {
        System.out.println("====  Xin Chào Bạn ^^ ====");
        System.out.println("Neu them mot Cong Nhan chon 1");
        System.out.println("Neu them mot Ky Su chon 2");
        System.out.println("Neu them mot Nhan Vien chon 3");
        System.out.println("Tim Kiem Nhan Vien chon 4");
        System.out.println("Hien Thi danh sach ten nhan vien chon 5");
        System.out.println("Thoat chuong trinh chon 6");
        Scanner s = new Scanner(System.in);
        int number = s.nextInt();
        switch (number) {
            case 1:
                nhapCongNhan();
                break;
            case 2:
                nhapKySu();
                break;
            case 3:
                nhapNhanVien();
                break;
            case 4:
                timKiemNhanVien();
                break;
            case 5:
                hienThiDanhSachNhanVien();
                break;
            case 6:
                System.exit(0);
                break;
            default:
                break;
        }
    }

    private void hienThiDanhSachNhanVien() {
        System.out.println("==== Danh sach nhan vien ==== ");
        for (CanBo canBo:danhSachCanBo) {
            canBo.inThongTin();
        }
    }

    private void timKiemNhanVien() {
        System.out.println("=== Tim Kiem Nhan Vien ===");
        System.out.println("Xin nhap vao Ho va Ten:");
        Scanner s = new Scanner(System.in);
        String hoTen = s.nextLine();
        for(int i = 0; i< danhSachCanBo.size(); i++){
            if(danhSachCanBo.get(i).getHoTen().equals(hoTen)){
                danhSachCanBo.get(i).inThongTin();
            }
        }
    }

    private void nhapNhanVien() {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Nhap ho ten:");
        String hoten = s1.nextLine();

        Scanner s2 = new Scanner(System.in);
        System.out.println("Nhap nam sinh:");
        int namSinh = s2.nextInt();

        Scanner s3 = new Scanner(System.in);
        System.out.println("Nhap gioi tinh: ");
        String gioiTinh = s3.nextLine();

        Scanner s4 = new Scanner(System.in);
        System.out.println("Nhap dia chi: ");
        String diaChi = s4.nextLine();

        Scanner s5 = new Scanner(System.in);
        System.out.println("Nhap cong viec: ");
        String congViec = s5.nextLine();

        NhanVien nhanVien = new NhanVien(hoten, namSinh,
                gioiTinh, diaChi, congViec);
        danhSachCanBo.add(nhanVien);
    }

    private void nhapKySu() {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Nhap ho ten:");
        String hoten = s1.nextLine();

        Scanner s2 = new Scanner(System.in);
        System.out.println("Nhap nam sinh:");
        int namSinh = s2.nextInt();

        Scanner s3 = new Scanner(System.in);
        System.out.println("Nhap gioi tinh: ");
        String gioiTinh = s3.nextLine();

        Scanner s4 = new Scanner(System.in);
        System.out.println("Nhap dia chi: ");
        String diaChi = s4.nextLine();

        Scanner s5 = new Scanner(System.in);
        System.out.println("Nhap nganh dao tao: ");
        String nganhDaoTao = s5.nextLine();

        KySu kySu = new KySu(hoten, namSinh,
                gioiTinh, diaChi, nganhDaoTao);
        danhSachCanBo.add(kySu);
    }

    private void nhapCongNhan() {

        Scanner s1 = new Scanner(System.in);
        System.out.println("Nhap ho ten:");
        String hoten = s1.nextLine();

        Scanner s2 = new Scanner(System.in);
        System.out.println("Nhap nam sinh:");
        int namSinh = s2.nextInt();

        Scanner s3 = new Scanner(System.in);
        System.out.println("Nhap gioi tinh: ");
        String gioiTinh = s3.nextLine();

        Scanner s4 = new Scanner(System.in);
        System.out.println("Nhap dia chi: ");
        String diaChi = s4.nextLine();

        Scanner s5 = new Scanner(System.in);
        System.out.println("Nhap bac luong: ");
        float bacLuong = s5.nextFloat();

        CongNhan congNhan =
                new CongNhan(hoten, namSinh,
                        gioiTinh, diaChi, bacLuong);
        danhSachCanBo.add(congNhan);
    }
}
