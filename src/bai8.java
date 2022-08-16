import java.util.Scanner;
public class bai8 {
    public static void main(String[] args){
        try (Scanner scn = new Scanner(System.in)) {
            int n = scn.nextInt();
            int check = 0;
            if(n == 2) System.out.println("2");
            else if (n>2) {
                System.out.println("2,3");
                if(n>3) {
                    for (int i = 4; i <=n; i++) {
                        for (int k = 3; k <= i-1 ; k+=2){
                            if(i % k == 0 || i % 2 == 0) check++;
                        }
                        if(check == 0) System.out.println(i);
                        else check = 0;
                    }
                }
            }
        }
    }
}
