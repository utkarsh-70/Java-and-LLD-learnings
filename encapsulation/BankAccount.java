package encapsulation;
import java.util.*;
public class BankAccount {
    private String accountHolderName;
    private int accountNumber;
    private double balance;
    public BankAccount(String name,int accountNumber,double balance){
        this.accountHolderName=name;
        this.accountNumber=accountNumber;
        this.balance=balance;
    }
    public String getAccountHolderName(){
        return this.accountHolderName;
    }
    public void setAccountHolderName(String name){
        this.accountHolderName=name;
    }
    public double getBalance(){
        return this.balance;
    }
    public void deposit(double amt){
        if(amt>0){
            this.balance+=amt;
        System.out.println("Deposit successful. New Balance: "+this.balance);
        }else{
            System.out.println("Deposit amount must be positive.");
        }
    }
    public void withdraw(double amt){
        if(this.balance>=amt){
            this.balance-=amt;

        System.out.println("Withdrawal successful. New Balance: "+this.balance);
        }else {
    System.out.println("Insufficient funds or invalid amount.");
}
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter name: ");
        String name=sc.nextLine();
        System.out.print("Enter account number: ");
        int accountNo=sc.nextInt();
        System.out.print("Enter starting balance: ");
        double balance=sc.nextDouble();
        BankAccount ut=new BankAccount(name, accountNo, balance);
        System.out.println("Account Holder: "+ut.getAccountHolderName());
        System.out.println("Balance: "+ut.getBalance());
        System.out.print("Enter deposit amount: ");
        double de=sc.nextDouble();
        ut.deposit(de);
        System.out.print("Enter withdraw amount: ");
        double wi=sc.nextDouble();
        ut.withdraw(wi);

    }
}
