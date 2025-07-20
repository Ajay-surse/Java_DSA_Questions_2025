package Day07;

import java.util.Scanner;

public class BasiMath {
    public static void reverse(int n){
        int lastDigit =0;
        //1234 if(n!=0) condition true
        /*
              STEP1 
         *    1234 !=0 
         *    1234%10 = 4
         *    4
         *    1234/10 = 123
         *    STEP2
         *    123 !=0
         *    123%10 = 3
         *    43
         *    123/10 = 12
         *    STEP3
         *    12 != 0 
         *    12 %10 = 2
         *    432 
         *    12/10 = 1
         *    STEP 4
         *    1 !=0 
         *    1%10 = 1
         *    4321 
         *    1/10 = 0
         *    WHILE(0!=0) condition false
         *
         * 
         */
        while(n!=0){
            lastDigit=n%10;
            System.out.print(lastDigit + " ");
            n=n/10;
        }
        
    }
    public static void main(String[] args) {
        System.out.println("Enter the value");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        reverse(n);   
        //System.out.print(reverse);

    }
    
}
