import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class PasswordManager1 {

    public static void main(String[] args) {

        System.out.println("Welcome to My little password manager.Kindly enter the website you want to visit");
        try (Scanner scan = new Scanner(System.in)) {
            String website = scan.nextLine();
            String[] arr;
            HashMap<String, String[]> deet = ReadFile.ReadFiles();
            if (deet.keySet().contains(website)) {
                arr = deet.get(website);
                System.out.println("Email: " + arr[0]);
                System.out.println("Password: " + "*".repeat(arr[1].length()));
            } else {
                System.out.println("Oops, deetails not found. Kindly add to database");
                System.out.println("Please enter your email");
                String email = scan.nextLine();
                System.out.println("Please enter your password");
                String password = scan.nextLine();
                WriteFile.writeFile(website, email, password);
                System.out.println("Email: " + email);
                System.out.println("Password: " + "*".repeat(password.length()));
            }

        }
    }
}