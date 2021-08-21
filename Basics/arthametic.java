package Basics;

import java.util.Scanner;

public class arthametic {

        static void operation(int a,int b) {
            System.out.println("addition is : " +(a+b));
            System.out.println("subtraction is : " + (a-b));
            System.out.println("mltiplication is : " + (a*b));
            System.out.println("Divison is : " +(a/b));
            System.out.println("modulus is : " +(a%b));

        }

    public static void main(String[] args) {
        
        int a,b;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two Number : ");
        a = scan.nextInt();
        b = scan.nextInt();
        scan.close();
        arthametic.operation(a,b);

    }
    
}
