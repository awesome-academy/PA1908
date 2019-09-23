package vn.sunasterisk.canbo;

public class CongNhan extends CanBo {
    private float bacLuong;

    public CongNhan() {
    }

    public CongNhan(float bacLuong) {
        this.bacLuong = bacLuong;
    }

    public CongNhan(String hoTen,
                    int namSinh,
                    String gioiTinh,
                    String diaChi,
                    float bacLuong) {
        super(hoTen, namSinh, gioiTinh, diaChi);
        this.bacLuong = bacLuong;
    }

    public float getBacLuong() {
        return bacLuong;
    }

    public void setBacLuong(float bacLuong) {
        this.bacLuong = bacLuong;
    }

    @Override
    public double tinhLuong() {
        return LUONG_CO_BAN * bacLuong;
    }

    @Override
    public void inThongTin() {
        super.inThongTin();
        System.out.println("Cong nhan nay co bac luong luong: " + bacLuong);
    }
}
