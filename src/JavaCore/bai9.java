package JavaCore;

import java.util.Scanner;
public class bai9 {
    public static void main(String[] args) {
        try (Scanner scn = new Scanner(System.in)) {
            int a = scn.nextInt();
            int b = 1, c = 1, temp;
            while(a>0){
                temp = b;
                b = b + c;
                c = temp;
                a--;
            }
            System.out.println(c);
        }
        
    }
}
