package OopAssignment;

import model.DanhSachHocSinh;
import model.HocSinh;
import model.ThoiGian;

import org.joda.time.LocalDate;
import java.util.Scanner;

public class bai3 {

    public static void display(){
        System.out.println("Menu");
        System.out.println("1. Chức năng về thời gian");
        System.out.println("2. Chức năng về học sinh");
        System.out.println("3. Thoat");
        System.out.print("Nhap lua chon: ");
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        switch (n) {
            case 1:
                ThoiGian time = new ThoiGian();
                display1(time);
                break;
            case 2:
                System.out.println("Nhập số lượng học sinh: "); int numstu = scn.nextInt();
                HocSinh[] hocSinhs = new HocSinh[numstu];
                for(int i = 0; i < hocSinhs.length; i++){
                    hocSinhs[i] = new HocSinh();
                }
                DanhSachHocSinh danhSachHocSinh = new DanhSachHocSinh();
                display2(danhSachHocSinh, hocSinhs);
                break;
            case 3:
                break;
            default:
                display();
        }
    }

    public static void display1(ThoiGian time){
        Scanner scn = new Scanner(System.in);
        System.out.println("Nhập ngày, tháng, năm sinh");
        time.setNgaySinh(scn.nextInt());
        time.setThangSinh(scn.nextInt());
        time.setNamSinh(scn.nextInt());
//        System.out.println("1. Tính số năm đã sống");
//        System.out.println("2. Tính số tháng đã sống");
//        System.out.println("3. Tính số ngày đã sống");
//        System.out.print("Nhap lua chon: ");
//        int n = scn.nextInt();
//        switch (n) {
//            case 1:
//                System.out.println("Số năm đã sống: " + time.tinhTuoi(LocalDate.now()));
//                break;
//            case 2:
//                System.out.println("Số tháng đã sống: " + time.tinhThang(LocalDate.now()));
//                break;
//            case 3:
//                System.out.println("Số ngày đã sống: " + time.tinhNgay(LocalDate.now()));
//                break;
//            default:
//                break;
//        }
        System.out.println("Số năm đã sống: " + time.tinhTuoi(LocalDate.now()));
        System.out.println("Số tháng đã sống: " + time.tinhThang(LocalDate.now()));
        System.out.println("Số ngày đã sống: " + time.tinhNgay(LocalDate.now()));
    }

    public static void display2(DanhSachHocSinh danhSachHocSinh, HocSinh[] hocSinhs){
        Scanner scn = new Scanner(System.in);
        System.out.println("Nhập danh sách học sinh.");
        danhSachHocSinh.nhapDanhSachHocSinh(hocSinhs);
//        System.out.println("1. In danh sách học sinh.");
//        System.out.println("2. Sắp xếp danh sách học sinh.");
//        System.out.println("3. Nhập tên và liệt kê những học sinh có tên như vậy.");
//        System.out.println("4. Nhập điểm chuẩn và liệt kê + đếm những học sinh có có điểm >= điểm chuẩn.");
//        System.out.print("Nhập lựa chọn: ");
//        int n = scn.nextInt();
//        switch (n) {
//            case 1:
//                danhSachHocSinh.inDanhSachHocSinh(hocSinhs);
//                break;
//            case 2:
//                danhSachHocSinh.sapXepDanhSachHocSinh(hocSinhs);
//                break;
//            case 3:
//                System.out.println("Nhập tên cần tìm: "); String s = scn.nextLine();
//                danhSachHocSinh.timTenHocSinh(hocSinhs, s);
//                break;
//            case 4:
//                System.out.println("Nhập điểm chuẩn: "); float diemchuan = scn.nextFloat();
//                danhSachHocSinh.timDiemHocSinh(hocSinhs, diemchuan);
//                break;
//            default:
//                break;
//        }
        danhSachHocSinh.inDanhSachHocSinh(hocSinhs);
        danhSachHocSinh.sapXepDanhSachHocSinh(hocSinhs);
        System.out.print("Nhập tên cần tìm: "); String s = scn.nextLine();
        System.out.println("Những học sinh có tên vừa nhập: ");
        danhSachHocSinh.timTenHocSinh(hocSinhs, s);
        System.out.print("Nhập điểm chuẩn: "); float diemchuan = scn.nextFloat();
        System.out.println("Những học sinh có điểm lớn hơn hoặc bằng điểm chuẩn:");
        danhSachHocSinh.timDiemHocSinh(hocSinhs, diemchuan);
    }
    public static void main(String[] args){
        display();
        int choice = 1;
        Scanner scanner = new Scanner(System.in);
        while(choice != 0) {
            System.out.println("Bạn có muốn chạy lại chương trình");
            System.out.println("1. Có");
            System.out.println("2. Không");
            System.out.print("Nhập lựa chọn: ");
            choice = scanner.nextInt();
            if (choice == 1) {
                display();
            }else break;
        }
    }
}
