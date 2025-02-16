
import java.util.Scanner;



class BankAccount{
    String Holdername;
    long AccountNum;
    int  balance;

    BankAccount(String name, long accnum,int initialbalance){
        this.Holdername=name;
        this.AccountNum=accnum;
        this.balance=initialbalance;
    }


     void displayDetails(){
          System.out.println("Enter Details of Bank Account:");
          System.out.println("Holder Name: " + Holdername);
          System.out.println("Account Number: " + AccountNum);
          System.out.println("Balance: " + balance);
    }
     void deposit(int amount){
         if (amount > 0) {
            balance += amount;
            System.out.println("₹" + amount + " deposited successfully");
        } else {
            System.out.println("Invalid deposit amount");
        }
     }

     void withdrawal(int amount){
        if(amount>0 && amount<=balance){
            balance-=amount;
                  System.out.println("₹" + amount + " withdrawn successfully.");
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }

        }
    
}




public class Main1{
    public static void main(String args[]){
        Scanner scr = new Scanner(System.in);

        System.out.println("Enter your name:");
        String name = scr.nextLine();

        System.out.println("Enter your account number:");
        long accNum = scr.nextLong();

        System.out.println("Enter initial balance:");
        int balance = scr.nextInt();


        BankAccount acc =new BankAccount(name, accNum, balance);
        acc.displayDetails();

        System.out.println("\nEnter deposit amount:");
        int depositAmount = scr.nextInt();
        acc.deposit(depositAmount);
        acc.displayDetails();

        System.out.println("\nEnter withdrawl amount:");
        int withdrawalAmount = scr.nextInt();
        acc.withdrawal(withdrawalAmount);
        acc.displayDetails();

        


    }
}