import java.util.Scanner;
import java.util.regex.*;

public class bai5 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("Nhập mã số sinh viên: ");
        String a = scn.nextLine();
        Pattern p = Pattern.compile("B[0-9]{7}");
        Matcher m = p.matcher(a);
        boolean check = m.matches();
        if(check) System.out.println("mã số vừa nhập đã đúng định dạng");
        else System.out.println("mã số vừa nhập không đúng định dạng");
    }
}
