package java.thithuchanh;

public class Bank {
    private double balance;
    private double rate;


    public Bank(double balance, double rate){
        this.balance = balance;
        this.rate = rate;
    }

    public double calculatelnterest(){
        return this.balance * (this.rate/1200);
    }

}
