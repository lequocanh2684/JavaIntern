package OopAssignment;

import model.Money;

import java.util.Scanner;


public class bai2 {
    public static void input(Money money, Scanner scn){
        System.out.print("Nhap so tien vay: "); money.setLoan(scn.nextInt());
        System.out.print("Nhap lai suat tinh theo thang: "); money.setInterest_rate((double)scn.nextInt()/100);
        System.out.print("Nhap so thang cho vay: "); money.setLoan_month(scn.nextInt());
    }

    public static void display() {
        System.out.println("Menu");
        System.out.println("1. Nhap so tien vay, lai suat tinh theo %/thang, so thang cho vay");
        System.out.println("2. In ra danh sach so tien phai tra hang thang");
        System.out.println("3. Thoat");
        System.out.print("Nhap lua chon: ");
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        Money _money = new Money();
        switch (n) {
            case 1:
                input(_money, scn);
            case 2:
                _money.output();
            case 3:
                break;
            default:
                display();
        }
    }

    public static void main (String[] args){
        display();
        int choice = 1;
        Scanner scanner = new Scanner(System.in);
        while(choice != 0) {
            System.out.println("Bạn có muốn tính lãi xuất khác không");
            System.out.println("1. Có");
            System.out.println("2. Không");
            System.out.print("Nhập lựa chọn");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    display();
                default: break;
            }
        }
    }

}