package ConsoleBanking;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		ArrayList<BankAccount> accounts = new ArrayList<>();
		accounts = Storage.loadAccounts();
		
		System.out.println("Welcome To The JBank\n");
		while (true) {
			int option;
			System.out.println("Enter Option 1 to Create Bank Account");
			System.out.println("Enter Option 2 for Fund Transfer");
			System.out.println("Enter Option 3 for PIN Change");
			System.out.println("Enter Option 4 for Account Information");
			System.out.println("Enter Option 5 to Withdraw Money");
			System.out.println("Enter Option 6 to Exit");
			option = input.nextInt();
			switch (option) {
			case 1: {
				BankAccount account = new BankAccount();
				account.AccNumAndIFSC_Generator(input);
				System.out.println("Enter your name: ");
				String name = input.next();
				account.setName(name);
				System.out.println("Enter your Deposit Ammount: ");
				int depositAmmount = input.nextInt();
				account.setDepositAmount(depositAmmount);
				System.out.println("Enter your PIN: ");
				int pin = input.nextInt();
				account.setPin(pin);
				if (accounts.add(account)) {
					System.out.println("Account Created Successfully!\n\n");
				}
			}
				break;
			case 2: { // Fund Transfer
				if (accounts.isEmpty()) {
					System.out.println("Create an Account First\n");
					break;
				}

				System.out.println("Enter Amount To Send: ");
				int amountToSend = input.nextInt();

				System.out.println("Enter Sender's UPI Number: ");
				int supi = input.nextInt();

				System.out.println("Enter Receiver's UPI Number: ");
				int rupi = input.nextInt();

				if (supi == rupi) {
					System.out.println("Cannot transfer within the same account");
					break;
				}

				BankAccount sender = null;
				BankAccount receiver = null;

				for (BankAccount acnt : accounts) {
					if (acnt.getUPInumber() == supi)
						sender = acnt;
					if (acnt.getUPInumber() == rupi)
						receiver = acnt;
				}

				if (sender == null) {
					System.out.println("Invalid Sender's UPI Number");
					break;
				}

				if (receiver == null) {
					System.out.println("Receiver's UPI Number Not Found");
					break;
				}

				if (sender.getDepositAmount() < amountToSend) {
					System.out.println("Insufficient balance in sender's account");
					break;
				}

				System.out.println("Enter your PIN: ");
				int pin = input.nextInt();

				if (sender.pinVerify(pin)) {
					sender.setDepositAmount(sender.getDepositAmount() - amountToSend);
					receiver.setDepositAmount(receiver.getDepositAmount() + amountToSend);
					System.out.println("Transaction Successful!");
					System.out.println("Updated Balance: " + sender.getDepositAmount());
				} else {
					System.out.println("Invalid PIN");
				}
			}
				break;

			case 3: {
				if (accounts.isEmpty()) {
					System.out.println("Create an Account First\n");
					break;
				}
				System.out.println("Enter Account Number: ");
				int acNum = input.nextInt();
				System.out.println("Enter Old PIN: ");
				int oldPin = input.nextInt();

				for (BankAccount acnt : accounts) {
					if (acnt.getAccountNumber() == acNum && acnt.pinVerify(oldPin)) {
						System.out.println("Enter New PIN: ");
						int newPin = input.nextInt();
						acnt.setPin(newPin);
						System.out.println("PIN Updated Successfully");
					} else {
						System.out.println("Invalid Credentials");
					}
				}
			}
				break;
			case 4: {
				
				if (accounts.isEmpty()) {
					System.out.println("Create an Account First\n");
					break;
				}
				
				if (accounts.size() == 1) {
					accounts.get(0).info();
				}
				 else {
					System.out.println("Total Accounts: " + accounts.size());
					for (BankAccount acnt : accounts) {
						acnt.info();
					}
				}
				System.out.println("Account Information");
			}
				break;
			case 5: { // Withdraw Money
				if (accounts.isEmpty()) {
					System.out.println("Create an Account First\n");
					break;
				}

				System.out.println("Enter a Number between 11 to 25 (inclusive range)");
				int captcha = input.nextInt();
				if (captcha < 11 || captcha > 25) {
					System.out.println("Captcha Verification Failed!\nExit Initiated...");
					break;
				}

				System.out.println("Enter Account Number: ");
				int acNum = input.nextInt();
				System.out.println("Enter Amount: ");
				int withdrawAmount = input.nextInt();
				System.out.println("Enter PIN: ");
				int pin = input.nextInt();

				for (BankAccount acnt : accounts) {
					if (acnt.getAccountNumber() == acNum) {
						if (!acnt.pinVerify(pin)) {
							System.out.println("Invalid PIN");
							break;
						}

						if (acnt.getDepositAmount() < withdrawAmount) {
							System.out.println("Insufficient Balance");
							break;
						}

						acnt.setDepositAmount(acnt.getDepositAmount() - withdrawAmount);
						try {
							System.out.println("Withdrawing " + withdrawAmount + "...");
							Thread.sleep(3000);
							System.out.println("Withdraw Successful");
						} catch (InterruptedException e) {
							// ignored
						}
						System.out.println("Current Balance: " + acnt.getDepositAmount());
					}
				}
			}
				break;

			case 6: { // Exit
				Storage.saveAccounts(accounts);
				System.out.println("Exiting...");
				return;
			}
			default: {
				System.out.println("Invalid Option");
			}

			}
		}
	}
}
