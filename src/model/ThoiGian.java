package model;
import java.time.LocalDate;


public class ThoiGian {
    int ngaySinh, thangSinh, namSinh;

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public int getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(int ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public int getThangSinh() {
        return thangSinh;
    }

    public void setThangSinh(int thangSinh) {
        this.thangSinh = thangSinh;
    }

    public ThoiGian(){}

    public ThoiGian(int ngaySinh, int thangSinh, int namSinh){
        this.ngaySinh = ngaySinh;
        this.thangSinh = thangSinh;
        this.namSinh = namSinh;
    }

    public int tinhTuoi(LocalDate now){
        return (now.getYear() - namSinh - 1) + (((now.getMonthValue() > thangSinh) || (now.getMonthValue() == thangSinh) && (now.getDayOfMonth() >= ngaySinh)) ? 1:0);
    }

    public int tinhThang(LocalDate now){
        int thangTemp = (tinhTuoi(now) - 1)*12;
        int soThangDaSong = thangTemp + (12 - thangTemp) + now.getMonthValue();
        return soThangDaSong;
    }

    public int tinhNgay(LocalDate now){
        return 0;
    }
}
