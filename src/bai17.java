import java.util.Scanner;
public class bai17 {
    public static void main(String[] args){
         try (Scanner scn = new Scanner(System.in)) {
            String s = scn.nextLine();
            char c = scn.next().charAt(0);
            int[] pos = new int[s.length()];
            int k = 0;
            for(int i = 0; i < s.length(); i++){
                if(c == s.charAt(i)){
                    pos[k] = i;
                    k++;
                }
            }
            for(int i = 0; i < pos.length; i++){
                if(pos[i] != 0 || pos[i] == 0 && i==0) System.out.println(pos[i]);
            }
        }  
    }
}