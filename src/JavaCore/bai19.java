package JavaCore;

import java.util.Scanner;
public class bai19 {
    public static void main(String[] args){
         try (Scanner scn = new Scanner(System.in)) {
            String s = scn.nextLine();
            char c = 'a';
            int count = 0;
            for(int i = 0; i < s.length(); i++){
                if(c == s.charAt(i)){
                    count++;
                }
            }
            System.out.println(count);
        }  
    }
}