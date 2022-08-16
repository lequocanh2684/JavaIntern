package model;

public class HocSinh {
    String hoTen;
    float diem;
    ThoiGian ngayThangNamSinh;
    boolean gioiTinh;

    public HocSinh(){}

    public HocSinh(String hoTen, float diem, ThoiGian ngayThangNamSinh, boolean gioiTinh){
        this.hoTen = hoTen;
        this.diem = diem;
        this.ngayThangNamSinh = ngayThangNamSinh;
        this.gioiTinh = gioiTinh;
    }

    public void setHoTen(String hoTen){
        this.hoTen = hoTen;
    }

    public String getHoTen(){
        return hoTen;
    }

    public void setDiem(float diem){
        this.diem = diem;
    }

    public float getDiem() {
        return diem;
    }

    public void setNgayThangNamSinh(ThoiGian ngayThangNamSinh) {
        this.ngayThangNamSinh = ngayThangNamSinh;
    }

    public ThoiGian getNgayThangNamSinh() {
        return ngayThangNamSinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public boolean isGioiTinh() {
        return gioiTinh;
    }



}
