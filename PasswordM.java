/*
 * This class is the email class which will be used to store emails
 */

import java.util.Scanner;

public class PasswordM{


    public static void main(String[] args){
        String[] websiteArr = new String[10];
        String[] passwordArr = new String[10];
        String[] emailArr = new String[10];
        //String[] usernameArr= new String[10];

        String password;
        
        String email;
        boolean isAdded = false;
        int indexWeb = 0;


        System.out.println("Welcome to My little password manager.Kindly enter the website you want to visit");
        Scanner scan = new Scanner(System.in);
        String website = scan.nextLine();

        for(int i =0; i< websiteArr.length;i++){
            if(!(websiteArr[i]==null)){
                if(websiteArr[i].equalsIgnoreCase(website)){
                    isAdded=true;
                    indexWeb = i;
                }
            }
            
        }
        if(isAdded){
            password = passwordArr[indexWeb];
            email = emailArr[indexWeb];

            System.out.println("Email: "+email);
       
      
            System.out.println("Password: "+"*".repeat(password.length())); 
        }

        System.out.println("Please enter your email");
        email= scan.nextLine();
        System.out.println("Please enter your password");
        password = scan.nextLine();

        for(int k =0; k<websiteArr.length; k++){
            if(websiteArr[k]==null){
                websiteArr[k]= website;
                passwordArr[k]=password;
                emailArr[k]=email;
            }
        }

        System.out.println("Email: "+email);
       
      
        System.out.println("Password: "+"*".repeat(password.length()));
       




        scan.close();

    }

}