package model;

public class SinhVien {

    String maSV;
    String tenSV;
    String tenLop;
    int gioiTinh;

    public SinhVien() {
    }

    public SinhVien(String maSV, String tenSV, String tenLop, int gioiTinh) {
        this.maSV = maSV;
        this.tenSV = tenSV;
        this.tenLop = tenLop;
        this.gioiTinh = gioiTinh;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getTenSV() {
        return tenSV;
    }

    public void setTenSV(String tenSV) {
        this.tenSV = tenSV;
    }

    public String getTenLop() {
        return tenLop;
    }

    public void setTenLop(String tenLop) {
        this.tenLop = tenLop;
    }

    public int getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(int gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    @Override
    public String toString() {
        return "SinhVien{" + "maSV=" + maSV + ", tenSV=" + tenSV + ", tenLop=" + tenLop + ", gioiTinh=" + gioiTinh + '}';
    }

}
