



package flow_control_statement;

import java.util.Scanner;


public class switch_case {
    
    public static void main(String[] args) {
        
        Scanner scan =  new Scanner(System.in);
        System.err.println("Enter a number: ");
        int n = scan .nextInt();
        scan.close();
        switch (n) {
            case 1:
                System.out.println("Monday ");
                break;
            case 2: 
                System.out.println("Tuesday ");
                break;
            case 3:
                System.out.println("Wednesday ");  
                break;
            case 4: 
                System.err.println("Thursday ");
                break;
            case 5:
                System.err.println("Friday ");
                break;
            case 6:
                System.err.println("Saturday ");
                break;
            case 7:
                System.err.println("Sunday ");
                break;
            default:
                System.err.println("Wrong input ");
                break;
        }
    }

}
