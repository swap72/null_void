//package Practice;
//
//import java.util.Scanner;
//
//class Practice1{
//    public static void main(String[] args) {
//        
//        Scanner input=new Scanner(System.in);
//        
//        System.out.println("Welcome to J Bank\n");
//        System.out.println("Enter 1 to Create a Bank Account\nEnter 2 to log into your bank accout\nEnter 3 to reset password\nEnter 4 for Balance Enquiry\nEnter 5 to recover username");
//        
//        int option =input.nextInt();
//        if(option <1||option>5){
//            System.out.println("Enter a Valid Option!");
//        }
//        
//        switch(option){
//            case 1:{
//                Account a1=new Account();
//            }
//            case 2:{
//                
//            }
//        }
//    }
//}
//
//
//class Account {
//    private Integer balance;
//    private String name;
//    private String username;
//    private String password;
//
//    Account() {
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter your name: ");
//        this.name = input.nextLine();
//        
//        System.out.print("Set a username: ");
//        this.username = input.nextLine();
//        
//        System.out.print("Set a password: ");
//        this.password = input.nextLine();
//        
//        System.out.print("Enter initial deposit amount: ");
//        this.balance = input.nextInt();
//
//        AccInfo();
//    }
//
//    void AccInfo() {
//        System.out.println("\nYour Bank Account is Created Successfully!\n");
//        System.out.println("Find your account Summary Below:\n");
//        System.out.println("Account Holder : " + this.name);
//        System.out.println("Account Balance: " + this.balance);
//        System.out.println("Username       : " + this.username);
//    }
//}
//
//
//
//
//
//
////public class Practice{
////    public static void main(String[] args) {
////        int n=50; int count=0;
////        for (int i = 2; i <=n/2; i++) {
////            if(n%i==0){
////                count++;
////            }
////        }
////        System.out.println(count+2);
////    }
////}
//
///*
//Optimized Approach :
//
//This program finds the factor of a number 
//
//Observe : after half of that number we don't get any facotors except the number itself
//so we can avoid the iteration of 1 and the number itself 
//becase 1 and number itself will always will be the factor of that number
//hence we can start the loop from 2 to n/2
//*/
//
