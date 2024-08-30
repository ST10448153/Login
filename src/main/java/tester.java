
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author RC_Student_lab
 */
public class tester {
      public static void main(String[] args){
        String username;
        int password;
        System.out.println("Please Enter your name>>");
        Scanner inputthis = new Scanner(System.in);
        username = inputthis.nextLine();
        System.out.println("Enter your password>>");
        password = inputthis.nextInt();
        if(username.equals("Mashoto") && password == 4225){
            System.out.print("Congratulations Access Granted!!!");
        } else{
            System.out.print("Sorry But Access Denied!!!!");
        }    
      }
}
