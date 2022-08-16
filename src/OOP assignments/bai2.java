import java.util.Scanner;
public class bai2 {

    private long loan; 
    
    public bai2(long loan, double interest_rate, int loan_month) {
        this.loan = loan;
        this.interest_rate = interest_rate;
        this.loan_month = loan_month;
    }

    public long getLoan() {
        return loan;
    }

    public void setLoan(long loan) {
        this.loan = loan;
    }

    double interest_rate; 
    public double getInterest_rate() {
        return interest_rate;
    }

    public void setInterest_rate(double interest_rate) {
        this.interest_rate = interest_rate;
    }

    int loan_month;


    public int getLoan_month() {
        return loan_month;
    }

    public void setLoan_month(int loan_month) {
        this.loan_month = loan_month;
    }

    public bai2() {}

    public static void input(bai2 _money){
        try(Scanner scn = new Scanner(System.in)){
        System.out.print("Nhap so tien vay: "); _money.loan = scn.nextLong();
        System.out.print("Nhap lai suat tinh theo thang: "); _money.interest_rate = (double)scn.nextInt()/100;
        System.out.print("Nhap so thang cho vay: "); _money.loan_month = scn.nextInt();
        }
    }

    public static void output(bai2 _money){
        long[] moneyPayPerMonth = new long[_money.loan_month];
        long principal = _money.loan/_money.loan_month;
        long loantemp = _money.loan;
        for(int i = 0; i < _money.loan_month; i++){
            int n = i + 1;
            moneyPayPerMonth[i] = principal + (long)((double)loantemp *_money.interest_rate);
            System.out.println("Thang thu " + n + ": " +  principal + " + " + "(" + loantemp + " x "
            + _money.interest_rate + ") " + "= " + moneyPayPerMonth[i]);
            loantemp-=principal;
        }
    }

    public static void main (String[] args){
        
        try (
        Scanner scn = new Scanner(System.in)) {
            System.out.println("Menu");           
            System.out.println("1. Nhap so tien vay, lai suat tinh theo %/thang, so thang cho vay");
            System.out.println("2. In ra danh sach so tien phai tra hang thang");
            System.out.println("3. Thoat");                    
            System.out.println("Nhap lua chon: ");
            int n = scn.nextInt();
            bai2 money = new bai2();
            switch(n){
                case 1: input(money);
                case 2: output(money);
                case 3: break;
                default: System.out.println("Nhap lua chon: "); n = scn.nextInt();
            }
        }
    }
}

class Money {

}