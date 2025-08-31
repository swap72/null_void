package ConsoleBanking;

import java.util.Random;
import java.util.Scanner;

class BankAccount {

    private static final String SBI = "SBI000483";
    private static final String IDB = "IDB000745";
    private static final String HDF = "HDF000221";
    private static final String BOI = "BOI000792";
    private static final String CAN = "CAN000532";

    private String name;
    private int depositAmount;
    private int pin;
    private int accountNumber;
    private String IFSC;
    private long UPInumber;

    public BankAccount() {
        this.UPInumber = generateUniqueUPInumber();
    }

    private long generateUniqueUPInumber() {
        Random rand = new Random();
        return 1_000_000L + rand.nextInt(9_000_000); 
    }

    public String getName() { return name; }
    public int getDepositAmount() { return depositAmount; }
    public long getUPInumber() { return UPInumber; }
    public int getAccountNumber() { return this.accountNumber; }

    public void setPin(int pin) { this.pin = pin; }
    public boolean pinVerify(int enteredPin) { return this.pin == enteredPin; }

    public void setName(String name) { this.name = name; }
    public void setDepositAmount(int depositAmount) { this.depositAmount = depositAmount; }
    public void setAccountNumber(int accNum) { this.accountNumber = accNum; }
    public void setIFSC(String IFSC) { this.IFSC = IFSC; }

    void AccNumAndIFSC_Generator(Scanner input) {
        System.out.println("""
                           Choose a Bank from the List below :
                           Dial 1 for SBI
                           Dial 2 for IDBI
                           Dial 3 for HDFC
                           Dial 4 for Bank of India
                           Dial 5 for Canara Bank
                           """);

        int val = input.nextInt();
        Random rnd = new Random();
        int UAnum = 10000 + rnd.nextInt(90000);

        switch (val) {
            case 1 -> IFSC = SBI;
            case 2 -> IFSC = IDB;
            case 3 -> IFSC = HDF;
            case 4 -> IFSC = BOI;
            case 5 -> IFSC = CAN;
            default -> throw new IllegalArgumentException("Invalid bank choice!");
        }
        accountNumber = UAnum;
    }

    public void info() {
        System.out.println("Account Holder: " + this.name);
        System.out.println("Account Balance: " + this.depositAmount);
        System.out.println("UPI Number: " + this.UPInumber);
        System.out.println("Account Number: " + this.accountNumber);
        System.out.println("IFSC Code: " + this.IFSC);
        System.out.println("\n\n");
    }
}
