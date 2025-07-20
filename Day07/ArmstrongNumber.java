package Day07;

import java.util.Scanner;

public class ArmstrongNumber {

    // n = 371   -> 3*3*3 + 7*7*7 + 1*1*1 
    //          -> 27+ 343 + 1
    //          ->   370+1
    //          -> 371 number is armstrong number 

    // if n= 35 -> 3*3*3 + 5*5*5
    //          -> 27+ 125
    //          -> 152 
    public static void checkGivenNumberArmstong(int n){
        int lastDigit = 0;
        int sumofNumber = 0;
        int original = n;
        while (n!=0){
            lastDigit = n%10;
            sumofNumber = sumofNumber + (lastDigit*lastDigit*lastDigit);
            n = n/10; 
        }
        if(original == sumofNumber){
            System.out.println("Give number "+ original +" is Armstrong Number " + sumofNumber );
        }else{
             System.out.println("Give number not  "+ original +" a Armstrong Number " + sumofNumber );

        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        checkGivenNumberArmstong(number);
        
    }
    
}
