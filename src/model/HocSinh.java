package model;
import java.util.Scanner;

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

    public void nhapThongTin(){
        Scanner scn = new Scanner(System.in);
        System.out.println("Nhap Ho va Ten: "); hoTen = scn.nextLine();
        ngayThangNamSinh = new ThoiGian();
        System.out.println("Nhap Ngay sinh: "); ngayThangNamSinh.ngaySinh = scn.nextInt();
        System.out.println("Nhap Thang sinh: "); ngayThangNamSinh.thangSinh = scn.nextInt();
        System.out.println("Nhap Nam sinh: "); ngayThangNamSinh.namSinh = scn.nextInt();
        System.out.println("Nhap Gioi tinh (0: Nam, 1: Nu): ");
        if(scn.nextInt() == 0) gioiTinh = false;
        else gioiTinh = true;
        System.out.println("Nhap diem: "); diem = scn.nextInt();
    }

    public void inThongTin(){
        System.out.println("Ho va ten: " + hoTen);
        System.out.println("Ngay sinh: " + ngayThangNamSinh.convert());
        System.out.print("Gioi Tinh: ");
        if (gioiTinh) System.out.println("Nu");
        else  System.out.println("Nam");
        System.out.println("Diem: " + diem);
    }

}
