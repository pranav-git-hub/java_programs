/*
     Author  -   Harsh Ponia
    Date    -   29/08/2021
    Problem/task    -  
    
             * 
            * *
           * * *
          * * * *
         * * * * *
        * * * * * *

*/

package Basics;

import java.util.Scanner;

public class  Pyramid {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int n =  scan.nextInt();
        scan.close();
        for (int i =0;i<n;i++)
        {
            for (int j =i;j<n;j++)
            {
                System.out.print(" ");
                
            }

            for(int k =0;k<=i;k++)
            {
                System.out.print("* ");
            }
             System.out.println();
        }
    }
    
}
