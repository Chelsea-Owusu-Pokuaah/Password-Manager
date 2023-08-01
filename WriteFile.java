import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteFile {
    public static void writeFile(String website, String email, String password) {
        try (PrintWriter writer = new PrintWriter(new FileWriter("passwordDb.txt", true))) {
            writer.print(website + "," + email + "," + password+"\n");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
