package JavaCore;

import java.util.Scanner;
public class bai18 {
    public static void main(String[] args){
         try (Scanner scn = new Scanner(System.in)) {
            String s = scn.nextLine();
            char[] num = new char[]{'0','1','2','3','4','5','6','7','8','9'};
            int temp = 0;
            for(int i = 0; i < s.length(); i++){
                for(int k = 0; k < num.length; k++ ){
                if(s.charAt(i) == num[k]){
                    temp = 1;
                }
            }
            }
            if(temp == 1) System.out.println("Có");
            else System.out.println("Không");
        }  
    }
}