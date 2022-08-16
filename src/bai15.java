import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class bai15 {
    public static void main(String[] args){
        try (Scanner scn = new Scanner(System.in)) {
            System.out.print("Nhập mã số sinh viên: ");
            String[] a = new String[5];
            for(int i = 0; i < 5; i++) {
                a[i] = scn.nextLine();
            }
            Pattern p = Pattern.compile("00[2-5]L[0-9]{4}");
            int temp = 0;
            for(int i = 0; i < 5; i++) {
                Matcher m = p.matcher(a[i]);
                boolean check = m.matches();
                if(!check) temp = 1;
            }
            if(temp == 0) System.out.println("Đúng rồi");
            else System.out.println("Sai rồi");
        }

    }
}