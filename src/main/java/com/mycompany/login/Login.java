/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.login;



import java.util.Scanner;

/**
 *
 * @author RC_Student_lab
 */
public class Login {
    
    public static void main(String[] args){
        String username;
        int password;
        System.out.print(" Please Enter your username>>");
        Scanner inputthis = new Scanner(System.in);
        username = inputthis.nextLine();
        System.out.println("Now Enter your password>>");
        password = inputthis.nextInt();
        if(username == "Mashoto" && password == 4225)
        {
            System.out.print("Congratulations Access Granted!!!");
            
        }
        else
            System.out.print("Sorry But Access Denied!!!!");
        
    }
            
            
}
