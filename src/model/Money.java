package model;

public class Money {
    private long loan;
    double interest_rate;
    int loan_month;

    public long getLoan() {
        return loan;
    }

    public void setLoan(long loan) {
        this.loan = loan;
    }

    public double getInterest_rate() {
        return interest_rate;
    }

    public void setInterest_rate(double interest_rate) {
        this.interest_rate = interest_rate;
    }

    public int getLoan_month() {
        return loan_month;
    }

    public void setLoan_month(int loan_month) {
        this.loan_month = loan_month;
    }

    public Money() {}

    public Money(long loan, double interest_rate, int loan_month) {
        this.loan = loan;
        this.interest_rate = interest_rate;
        this.loan_month = loan_month;
    }

    public void output(){
        long[] moneyPayPerMonth = new long[this.loan_month];
        long principal = this.loan/this.loan_month;
        long loanTemp = this.loan;
        for(int i = 0; i < this.loan_month; i++){
            int n = i + 1;
            moneyPayPerMonth[i] = principal + (long)((double)loanTemp * this.interest_rate);
            System.out.println("Thang thu " + n + ": " +  principal + " + " + "(" + loanTemp + " x "
                    + this.interest_rate + ") " + "= " + moneyPayPerMonth[i]);
            loanTemp-=principal;
        }
    }
}
