package vn.sunasterisk.canbo;

public class NhanVien extends CanBo {

    private String congViec;

    public NhanVien() {
    }

    public NhanVien(String congViec) {
        this.congViec = congViec;
    }

    public NhanVien(String hoTen,
                    int namSinh,
                    String gioiTinh,
                    String diaChi,
                    String congViec) {
        super(hoTen, namSinh, gioiTinh, diaChi);
        this.congViec = congViec;
    }

    public String getCongViec() {
        return congViec;
    }

    public void setCongViec(String congViec) {
        this.congViec = congViec;
    }

    @Override
    public double tinhLuong() {
        return LUONG_CO_BAN * 4;
    }

    @Override
    public void inThongTin() {
        super.inThongTin();
        System.out.println("Nhan Vien nay co Cong Viec la: " + congViec);
    }
}
