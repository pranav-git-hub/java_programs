/*
    Author  -   Harsh Ponia
    Date    -   29/08/2021
    Problem/task    -   Write a Java program to get a number from the user and print whether it is positive or negative
    Test Data
    Input number: 35
    Expected Output :
    Number is positive
    You can tak static or user input data

*/


package flow_control_statement;

import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class positive_negative {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n  = scan.nextInt();
        scan.close();

        if (n>0)
        {
            System.out.println(" Number is Positive ");
        }
        else if(n<0)
        {
            System.out.println(" Number is negative ");
        }
        else 
        {
            System.out.println(" Number is Zero  ");
        }
    }
    
}
