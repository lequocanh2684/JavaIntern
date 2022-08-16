package JavaCore;

import java.util.Scanner;
public class bai16 {
    public static void main(String[] args){
         try (Scanner scn = new Scanner(System.in)) {
            String s = scn.nextLine();
            char c = scn.next().charAt(0);
            int temp = 0;
            for(int i = 0; i < s.length(); i++){
                if(c == s.charAt(i)) temp = 1;
            }
            if(temp == 1) System.out.println("Có");
            else System.out.println("Không");
        }  
    }
}
