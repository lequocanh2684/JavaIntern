import java.util.Scanner;

public class bai1 {
    public static void main(String[] args){
        try (Scanner scn = new Scanner(System.in)) {
            System.out.print("Nhập một số nguyên: ");
            int x = scn.nextInt();
                if(x>=0){
                    System.out.println("Đây là số nguyên dương");
                }else System.out.println("Đây là số nguyên âm");
        }
        }
    }
