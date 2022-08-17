package model;


import java.time.Month;
import java.time.Period;
import java.time.Year;

import org.joda.time.Days;
import org.joda.time.LocalDate;
import org.joda.time.Months;
import org.joda.time.Years;

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
        //return (now.getYear() - namSinh - 1) + (((now.getMonthValue() > thangSinh) || (now.getMonthValue() == thangSinh) && (now.getDayOfMonth() >= ngaySinh)) ? 1:0);
        LocalDate birthday = new LocalDate( namSinh, thangSinh, ngaySinh);
        int periodYearLive = Years.yearsBetween(birthday, now).getYears();
        System.out.println(now);
        return periodYearLive;
    }

    public int tinhThang(LocalDate now){
        LocalDate birthday = new LocalDate( namSinh, thangSinh, ngaySinh);
        int periodMonthLive = Months.monthsBetween(birthday, now).getMonths();
        return periodMonthLive;
    }

    public int tinhNgay(LocalDate now){
        LocalDate birthday = new LocalDate( namSinh, thangSinh, ngaySinh);
        int periodDayLive = Days.daysBetween(birthday, now).getDays();
        return periodDayLive;
    }

    public LocalDate convert(){
        return new LocalDate(namSinh,thangSinh,ngaySinh);
    }
}
