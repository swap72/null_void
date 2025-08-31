package ConsoleBanking;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;

public class Storage {
    private static final String FILE_NAME = "accounts.json";
    private static final Gson gson = new Gson();

    // Save accounts list to JSON file
    public static void saveAccounts(ArrayList<BankAccount> accounts) {
        try (FileWriter writer = new FileWriter(FILE_NAME)) {
            gson.toJson(accounts, writer);
            System.out.println("✅ Accounts saved to " + FILE_NAME);
        } catch (IOException e) {
            System.out.println("❌ Error saving accounts: " + e.getMessage());
        }
    }

    // Load accounts list from JSON file
    public static ArrayList<BankAccount> loadAccounts() {
        try (FileReader reader = new FileReader(FILE_NAME)) {
            Type type = new TypeToken<ArrayList<BankAccount>>(){}.getType();
            return gson.fromJson(reader, type);
        } catch (IOException e) {
            System.out.println("⚠️ No previous data found, starting fresh.");
            return new ArrayList<>();
        }
    }
}
