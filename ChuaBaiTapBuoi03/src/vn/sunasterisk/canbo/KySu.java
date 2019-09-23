package vn.sunasterisk.canbo;

public class KySu extends CanBo {
    private String nganhDaoTao;

    public KySu() {
    }

    public KySu(String nganhDaoTao) {
        this.nganhDaoTao = nganhDaoTao;
    }

    public KySu(String hoTen,
                int namSinh,
                String gioiTinh,
                String diaChi,
                String nganhDaoTao) {
        super(hoTen, namSinh, gioiTinh, diaChi);
        this.nganhDaoTao = nganhDaoTao;
    }

    public String getNganhDaoTao() {
        return nganhDaoTao;
    }

    public void setNganhDaoTao(String nganhDaoTao) {
        this.nganhDaoTao = nganhDaoTao;
    }

    @Override
    public double tinhLuong() {
        return LUONG_CO_BAN * 5;
    }

    @Override
    public void inThongTin() {
        super.inThongTin();
        System.out.println("nganh dao tao ");
        System.out.println("Day la Ky Su co nganh dao tao la " + nganhDaoTao);
    }
}
