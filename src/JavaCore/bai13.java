package JavaCore;

import java.util.Scanner;

public class bai13{

    public static void find_min(int[] a){
        int min = a[0];
        for(int i = 1; i < a.length; i++){
            if(min > a[i]) min = a[i];
        }
        System.out.println(min);
    }

    public static void main(String[] args){
        try (Scanner scn = new Scanner(System.in)) {
            int n = scn.nextInt();
            int[] a = new int[n];
            for(int i = 0; i < n; i++){
                a[i] = scn.nextInt();
            }
            find_min(a);
        }
    }
}