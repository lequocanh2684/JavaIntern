import java.util.Scanner;
import java.util.regex.*;

public class bai20 {
    public static void main(String[] args){
        try (Scanner scn = new Scanner(System.in)) {
            System.out.print("Nhập mã số sinh viên: ");
            String a = scn.nextLine();
            Pattern p = Pattern.compile("^[A-Z][^\\s]{1,18}[0-9]$");
            Matcher m = p.matcher(a);
            boolean check = m.matches();
            if(check) System.out.println("Duyệt");
            else System.out.println("Không duyệt");
        }
    }
}