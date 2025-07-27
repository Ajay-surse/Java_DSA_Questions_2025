package Day09;

import java.util.Scanner;

public class Recursion1 {
     // 5 -> 5+4+3+2+1 = 15
    // sum of first N numbers 

    //using Parameterisd way
    public static void printFirstNNumber(int i, int sum){
        if(i<1){
            System.out.print(sum + " ");
            return;
        }
        printFirstNNumber(i-1, sum+i); 

    }

    // using functional way 
    public static int printUsingFunctionalWay(int n){
        if(n==0){
            return 0; 
        }
        return n + printUsingFunctionalWay(n-1);  // incomplete function once it is completed it will return 

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        //printFirstNNumber(n,0);
        int result = printUsingFunctionalWay(n);
        System.out.println("Result : " + result);
    }
    
}
