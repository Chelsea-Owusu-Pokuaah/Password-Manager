import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PasswordManager1 {

    public static void main(String[] args){

    try{
        try (PrintWriter writer = new PrintWriter(new FileWriter("passwordDb.txt"))) {
            for(int i =0; i<4;i++){
                writer.println("Amen");
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