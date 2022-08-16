package OopAssignment;

import java.util.Scanner;

public class bai1 {
    public static void factorial_with_loop(int n){
        int i = 1, factorial = 1;
        while(i <= n){
            factorial*=i;
            i++;
        }
        System.out.println(factorial);
    }

    public static int factorial_without_loop(int n){

        if(n <= 1){
            return 1;
        }else return n*factorial_without_loop(n-1);
    }

    public static void main(String[] args){
        try(Scanner scn = new Scanner(System.in)){
            int n = scn.nextInt();
            factorial_with_loop(n);
            System.out.println(factorial_without_loop(n));
        }
    }
}
