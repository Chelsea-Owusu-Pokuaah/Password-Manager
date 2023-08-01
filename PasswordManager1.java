import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PasswordManager1 {

    public static void main(String[] args){

    try{
        for(int i =0; i<4;i++){
            try (PrintWriter writer = new PrintWriter(new FileWriter("passwordDb.txt"))) {
                writer.write("Amen");
                System.out.println("I work");
            }
        }
        BufferedReader reader = new BufferedReader( new FileReader("passwordDb.txt"));

        while(reader.readLine()!=null){
            System.out.println(reader.readLine());
        }
        
        
    }
    catch(IOException e){
        System.out.println(e);
    }
   
   

}}