/**
 *
 * @author swapnil
 */
package BankAccount;

import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        ArrayList<BankAccount> accounts=new ArrayList<BankAccount>();
        System.out.println("Welcome To The JBank");
      while(true){
          int option;
          System.out.println("Enter Option 1 to Create Bank Account");
          System.out.println("Enter Option 2 for Fund Transfer");
          System.out.println("Enter Option 3 for PIN Change");
          System.out.println("Enter Option 4 for Account Information");
          System.out.println("Enter Option 5 to Exit");
          option=input.nextInt();
          switch (option){
              case 1:{
                  BankAccount account =new BankAccount();
                  System.out.println("Enter your name: ");
                  String name= input.next();
                  account.setName(name);
                  System.out.println("Enter your Deposit Ammount: ");
                  int depositAmmount= input.nextInt();
                  account.setDepositAmmount(depositAmmount);
                  System.out.println("Enter your PIN: ");
                  int pin=input.nextInt();
                  account.setPin(pin);
                  if(accounts.add(account)){
                      System.out.println("Account Created Successfully!\n\n");
                  }
              }
              break;
              case 2:{
                  System.out.println("Fund Transfer");
              }
              break;
              case 3:{
                  System.out.println("Under Development..");
              }
              break;
              case 4:{
                  System.out.println("Account Information");
                  accounts.get(0).info();
              }
              break;
              case 5:{
                  return;
              }
              default:{
                  System.out.println("Invalid Option");
              }
          }
      }
    }
}

class BankAccount{
    private String name;
    private int depositAmmount;
    private int pin;
    public BankAccount(){
    }
    public String getName(){
        return name;
    }
    public int getDepositAmmount(){
        return depositAmmount;
    }
    public void setPin(int pin){
        this.pin=pin;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setDepositAmmount(int depositAmmount){
        this.depositAmmount=depositAmmount;
    }
    public void info(){
        System.out.println("Account Holder: "+this.name);
        System.out.println("Account Balance: "+this.depositAmmount);
    }
}



