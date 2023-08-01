import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class ReadFile {
    /*
     * This class reads the lines of the file storing the details and stores them in
     * a Hashmap
     */
    public static HashMap<String, String[]> ReadFiles() {
        HashMap<String, String[]> details = new HashMap<>();
        try {
            String line;
            BufferedReader reader = new BufferedReader(new FileReader("passwordDb.txt"));
            while ((line = reader.readLine()) != null) {
                String[] arr = line.split(",");
                String[] arr2 = { arr[1].trim(), arr[2].trim() };
                details.put(arr[0].trim(), arr2);

            }

            reader.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return details;
    }
}
