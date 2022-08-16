package JavaCore;

import java.util.Scanner;

public class bai2 {

    public static void check(int x){
        String[] first = new String[]{"Không","Một", "Hai", "Ba", "Bốn", "Năm", "Sáu", "Bảy", "Tám", "Chín"};
        String[] second = new String[]{"Âm","Mười", "Chục", "Trăm", "Nghìn", "Triệu", "Tỷ"};
        if(x>=0 && x<=9){
            System.out.print(first[x]);
        } else if (x>9 && x<20) {
            if(x%10 == 0) System.out.print(second[1]);
            else System.out.print(second[1] + " " + first[x%10]);
        } else if (x>=20 && x<100) {
            if (x % 10 == 0) System.out.print(first[x / 10] + " " + second[2]);
            else System.out.print(first[x / 10] + " " + first[x % 10]);
        } else if(x>=100 && x<1000) {
            if (x % 100 == 0) System.out.print(first[x / 100] + " " + second[3]);
            else {
                System.out.print(first[x / 100] + " " + second[3] + " ");
                check(x % 100);
            }
        }
    }

    public static void main(String[] args){
        try (Scanner scn = new Scanner(System.in)) {
            System.out.print("Nhập một số nguyên: ");
            int x = scn.nextInt();
            check(x);
        }

    }
}
