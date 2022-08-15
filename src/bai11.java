import java.util.Scanner;
public class bai11 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = scn.nextInt();
        }
        int temp = 0;
        for(int i = 0; i < n; i++){
            temp+=a[i];
        }
        System.out.println(temp/n);
    }
}
