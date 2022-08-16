import java.util.Scanner;

public class bai6 {
    public static void main(String[] args){
        try (Scanner scn = new Scanner(System.in)) {
            int n = scn.nextInt();
            int i = 0; int sum = 0;
            while(i<=n){
                sum+=i;
                i+=2;
            }
            System.out.println(sum);
        }
    }
}
