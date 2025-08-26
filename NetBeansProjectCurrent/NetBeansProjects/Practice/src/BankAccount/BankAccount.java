package BankAccount;

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
