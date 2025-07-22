package Day08;

import java.util.Scanner;

public class Recursion3 {


    // print 1 to n Linearly through recursion  if no =4 then output is 1,2,3,4 
    public static void printlinearly(int i, int number){
        if(i>number) return;
        System.out.print(i + " ");
        printlinearly(i+1, number);
        
    }
    public static void main(String[] args) {
        System.out.println("Enter the Number : ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int i=1;
        printlinearly(i,number);
        
    }
    
}
