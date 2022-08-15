import java.util.Scanner;
public class bai7 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        for (int i = 1; i <= 20; i++) {
            System.out.println(x * i);
        }
    }
}
