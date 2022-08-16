import java.util.Scanner;
import java.lang.Math;

public class bai4 {
    public static void main(String[] args){
        try (Scanner scn = new Scanner(System.in)) {
            System.out.print("Nhập vào lần lượt 3 số thực: ");
            double a, b, c;
            a = scn.nextDouble(); b = scn.nextDouble(); c = scn.nextDouble();
            if((a+b)>c && (a+c)>b && (b+c)>a) {
                if (Math.pow(a, 2.0) + Math.pow(b, 2.0) == Math.pow(c, 2.0) ||
                        Math.pow(b, 2.0) + Math.pow(c, 2.0) == Math.pow(a, 2.0) ||
                        Math.pow(a, 2.0) + Math.pow(c, 2.0) == Math.pow(b, 2.0) )
                    System.out.println("3 số vừa nhập là 3 cạnh của một tam giác vuông");
                else System.out.println("3 số vừa nhập không là 3 cạnh của một tam giác vuông");
            }
        }
    }
}
