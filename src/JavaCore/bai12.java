package JavaCore;

import java.util.Scanner;
public class bai12 {
    public static void input(int[] a, int _i, int n){
        try (Scanner sc = new Scanner(System.in)) {
            int x = 0;
            if(_i<n) x = sc.nextInt();
            if(x>0){
                a[_i] = x;
                input(a, _i + 1,n);
            }else if(x<0) input(a, _i,n);
        }
    }

    public static void find_max(int[] a){
        int max = a[0];
        for(int i = 1; i < a.length; i++){
            if(max < a[i]) max = a[i];
        }
        System.out.println(max);
    }

    public static void main(String[] args){
        try (Scanner scn = new Scanner(System.in)) {
            int n = scn.nextInt();
            int[] a = new int[n];
            int i = 0;
            input(a,i,n);
            find_max(a);
        }
    }
}
