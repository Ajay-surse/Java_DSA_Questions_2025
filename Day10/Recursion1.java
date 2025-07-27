package Day10;

import java.util.Scanner;

import Day07.printAllDivisiors;

public class Recursion1 {

    // Factorial of N number
    // 3 -> 3*2*1 = 3
    // using parameterized ways 
    public static int  printFactorialUsingParameterziedWay(int n, int mult){
        if(n<1){
            System.out.println("Factorial Of Number is "+ mult);
            return 0;
        }
        return n+printFactorialUsingParameterziedWay(n-1,mult*n);
    }
    // using functional Ways 

    public static int printFactorialUsingFunctionalWays(int n){
        if(n==1){
            return 1;
        }
        return n*printFactorialUsingFunctionalWays(n-1);
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        //printFactorialUsingParameterziedWay(number,1);
        int result = printFactorialUsingFunctionalWays(number);
        System.out.println("Result : " + result);

    }
    
}
