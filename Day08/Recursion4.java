package Day08;

import java.util.Scanner;

public class Recursion4 {

    public static void printReverse(int i, int n){
        if(n<=i) return;
        System.out.print(n + " ");
        printReverse(i, n-1);
    }
    public static void main(String[] args) {
        System.out.println("Enter the Number : ");
        Scanner sc= new Scanner(System.in);
        int number = sc.nextInt();   //5 
        int i=0;
        printReverse(i, number);  // (0,5)
    }
    
}
