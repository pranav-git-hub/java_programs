/*
     Author  -   Harsh Ponia
    Date    -   29/08/2021
    Problem/task    -   ake three numbers from the user and print the greatest number
    test Data
    Input the 1st number: 25
    Input the 2nd number: 78
    Input the 3rd number: 87
    Expected Output :
    The greatest: 87
*/


package flow_control_statement;

import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class Greatest {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.err.println("Enter three numbers : ");
        int a = scan.nextInt(),b = scan.nextInt(),c = scan.nextInt();
        if (a>b)
        {
            if(a>c)
            {
                System.out.println("Greatest is : " +a);
            }
            else
            {
                System.out.println("Greatest is : " +c);
            }
        }
        else if (b>c)
        {
            System.out.println("Greatest is : " +b);
        }
        else 
        {
            System.out.println("Greatest is : " +c);
        }

    }
}
