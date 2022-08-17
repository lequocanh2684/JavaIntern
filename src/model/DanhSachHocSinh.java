package model;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class DanhSachHocSinh {
    public void nhapDanhSachHocSinh(HocSinh[] hocSinhs){
        for(HocSinh hocSinh: hocSinhs) {
            hocSinh.nhapThongTin();
        }
    }

    public void inDanhSachHocSinh(HocSinh[] hocSinhs){
        for(HocSinh hocSinh: hocSinhs){
            hocSinh.inThongTin();
        }
    }

    public void sapXepDanhSachHocSinh(HocSinh[] hocSinhs){
        Arrays.sort(hocSinhs, new sortbyDiem());
        System.out.println("Danh sach hoc sinh sau khi duoc sap xep theo diem tu lon den be");
        for (HocSinh hocSinh:
             hocSinhs) {
            hocSinh.inThongTin();
        }
    }

    public void timTenHocSinh(HocSinh[] hocSinhs, String ten){
        for(HocSinh hocSinh: hocSinhs){
            if(hocSinh.hoTen.contains(ten)) System.out.println(hocSinh.hoTen);
        }
    }

    public void timDiemHocSinh(HocSinh[] hocSinhs, float diemChuan){
        int count = 0;
        for(HocSinh hocSinh: hocSinhs){
            if(hocSinh.diem >= diemChuan){
                System.out.println(hocSinh.hoTen);
                count++;
            }
        }
        System.out.println("Số học sinh có điểm lớn hơn hoặc bằng điểm chuẩn: " + count + " học sinh.");
    }

}

class sortbyDiem implements Comparator<HocSinh> {
    public int compare(HocSinh a, HocSinh b){
        return (int)(b.diem - a.diem);
    }
}
