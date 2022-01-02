
import java.util.Date;

public class T11_8{
    public static void main(String[] args) {
        Account George=new Account(1122,1000,"George");
        Account.setAnnualInterestRate(150);
        System.out.println("Name:"+George.getName());
        System.out.println("Annual interest:"+George.getAnnual());
        George.deposit(30);
        George.deposit(40);
        George.deposit(50);
        George.withdraw(5);
        George.withdraw(4);
        George.withdraw(2);
        System.out.println("Balance:"+George.getBalance());
        System.out.println("Date\t\t\t\t"+"Type\t\t"+"Amount\t\t"+"Balance");
        for(int i=0;i<George.data.count;i++){
            System.out.println(George.data.string[i][0]);
        }
    }
}
class Account {
    private int id;
    private String name;
    private double balance;
    private static double annualInterestRate;//ÄêÀûÂÊ
    Data data=new Data();
    private java.util.Date dateCreated;
    {
        dateCreated = new java.util.Date();
    }
    public Account() { }
    public Account(int newId, double newBalance,String name) {
        id = newId;
        balance = newBalance;
        this.name=name;
    }
    public int getId() { return this.id; }
    public double getBalance() { return balance; }
    public static double getAnnualInterestRate() { return annualInterestRate; }
    public void setId(int newId) { id = newId; }
    public void setBalance(double newBalance) {
        if(newBalance>0)
            balance = newBalance;
    }
    public static void setAnnualInterestRate(double newAnnualInterestRate) {
        annualInterestRate = newAnnualInterestRate;
    }
    public String getName(){
        return name;
    }
    public double getMonthlyInterest() { return balance * (annualInterestRate / 1200); }
    public double getYearlyInterest() { return balance * (annualInterestRate / 100); }
    public java.util.Date getDateCreated() { return dateCreated; }
    public void withdraw(double amount) {
        this.setBalance(balance-amount);
        String s;
        if(amount<10){
            s=dateCreated+"\t"+"W"+"\t\t"+amount+"\t\t"+balance;
        }
        else{
            s=dateCreated+"\t"+"W"+"\t\t"+amount+"\t\t"+balance;
        }
        data.string[data.count++][0]=s;
    }
    public void deposit(double amount) {
        if(amount<0) return;
        this.setBalance(balance+amount);
        String s=dateCreated+"\t"+"D"+"\t\t"+amount+"\t\t"+balance;
        data.string[data.count++][0]=s;
    }
    public double getAnnual(){
        return annualInterestRate/100;
    }
}
class Data{
    Date date=new Date();
    String type="";
    double amount=0;
    double balance=0;
    int count=0;
    String[][] string=new String[1000][1];
    Data(){

    }
    Data(Date date,String type,double amount,double balance){
        this.date=date;
        this.type=type;
        this.amount=amount;
        this.balance=balance;
    }
}
