import java.util.Scanner;
import java.util.regex.*;

public class bai10 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("Nhập mã số sinh viên: ");
        String[] a = new String[5];
        for(int i = 0; i < 5; i++) {
            a[i] = scn.nextLine();
        }
        Pattern p = Pattern.compile("B170[0-9]{4}");
        for(int i = 0; i < 5; i++) {
            Matcher m = p.matcher(a[i]);
            boolean check = m.matches();
            if(check) System.out.println("mã số thứ " + i + "vừa nhập đã đúng định dạng");
            else System.out.println("mã số thứ " + i + "vừa nhập không đúng định dạng");
        }

    }
}