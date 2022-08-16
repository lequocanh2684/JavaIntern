package JavaCore;

import java.util.Scanner;
public class bai14 {
    
    
    public static int partition(int[] a, int first, int last){
        int c = a[first];
        int i = first+1, j = last;
        while(i<=j){
            while(a[i]>=c && i<=j){
                i++;
            }
            while(a[j]<c && i<=j){
                j--;
            }
            if(i<j){
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
        int temp = a[first];
        a[first] = a[j];
        a[j] = temp;
        return j;
    }

    public static void quicksort(int[] a, int first, int last){
        if(first < last){
                int j = partition(a, first, last);
                quicksort(a, first, j);
                quicksort(a, j+1, last);
        }
    }
    
    public static void main(String[] args){
        try (Scanner scn = new Scanner(System.in)) {
            int n = scn.nextInt();
            int[] a = new int[n];
            for(int i = 0; i < n; i++){
                a[i] = scn.nextInt();
            }
            quicksort(a, 0, n-1);
            for(int i = 0; i<n; i++){
                System.out.println(a[i]);
            }
        }
    }
}
