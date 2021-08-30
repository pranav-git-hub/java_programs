/*
    Author  -   Harsh Ponia
    Date    -   29/08/2021
    Problem/ Task   -   Write a Java program to solve quadratic equations (use if, else if and else).
    Test Data
    Input a: 1
    Input b: 5
    Input c: 1

*/


package flow_control_statement;

import java.util.Scanner;

public class Roots_Quadratic {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the coefficient of x: ");
        Double a =scan.nextDouble();
        System.out.println("Enter the coefficient of y: ");
        Double b =scan.nextDouble();
        System.out.println("Enter the constant c : ");
        Double c =scan.nextDouble();
        double r = b*b-4.0*a*c;
        if(r>0.0)
        {
            double r1 = (-b+ Math.pow(r, 0.5))/(2.0*a);
            double r2 = (-b - Math.pow(r, 0.5))/(2.0*a);
            System.out.println("Root 1 : "+r1 + "\nRoot 2 : "+r2);

        }
        else if (r == 0.0)
        {
            double r1 = -b/(2.0*a);
            System.out.println("Roots : "+r1);
        }
        else 
        {
            System.out.println("The equation has no real roots.");
        }

    }
}
