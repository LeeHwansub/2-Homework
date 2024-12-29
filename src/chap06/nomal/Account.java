package chap06.nomal;

public class Account {

    private String accountNumber;
    private int balance;

    public Account(String accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0;
    }

    public void a (int plus){
        this.balance += plus;
    }
    public int getBalance(){
        return this.balance;
    }
    public String getAccountNumber(){
        return this.accountNumber;
    }
}
