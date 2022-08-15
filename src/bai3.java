import java.util.Scanner;

public class bai3 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("Nhập vào lần lượt 3 số thực: ");
        float a, b, c;
        a = scn.nextFloat(); b = scn.nextFloat(); c = scn.nextFloat();
        if((a+b)>c && (a+c)>b && (b+c)>a) System.out.println("3 số vừa nhập là 3 cạnh của một tam giác");
        else System.out.println("3 số vừa nhập không là 3 cạnh của một tam giác");
    }
}
