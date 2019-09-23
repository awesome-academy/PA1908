package vn.sunasterisk.canbo;

public abstract class CanBo {
    protected String hoTen;
    protected int namSinh;
    protected String gioiTinh;
    protected String diaChi;

    public CanBo() {
    }

    public CanBo(String hoTen,
                 int namSinh,
                 String gioiTinh,
                 String diaChi) {
        this.hoTen = hoTen;
        this.namSinh = namSinh;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    //vi du luong co ban la 2M
    public static final double LUONG_CO_BAN = 2000000d;

    public abstract double tinhLuong();

    public void inThongTin() {
        System.out.println("----------------------");
        System.out.println("Nhan Vien " + hoTen +
                " sinh nam: " + namSinh +
                ". Dia chi: " + diaChi +
                ". Gioi tinh: " + gioiTinh +
                ". Luong la " + tinhLuong() + " dong!");
    }
}
