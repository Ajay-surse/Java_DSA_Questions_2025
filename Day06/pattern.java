package Day06;

import java.util.Scanner;

class pattern {
    /*
         *
         * *
         * * *
         * * * *
         * * *
         * *
         * 
         // n = 3; 
         for i to n 2*n-1; 
         starts will print row = i;
         formula to break start     4-> 3 star
                                    5-> 2 
                                    6-> 1    2*n-i =>(2*4-5) = 3 -> 1 to 3 
                                                (2*4-6) = 2 -> 1 to 2 
                                                (2*4-7) = 1 -> 1 to 1
     */

    public static void patter1(int n){
        for(int i=1; i<=2*n-1; i++){
            int starts = i;
            if(i>n) starts = 2*n-i;
            for(int j=1; j<=starts; j++){
                System.out.print("*");
            }
            System.out.println();;
        }
        
    }
    public static void main(String[] args){
        System.out.println(" Enter n number");
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        patter1(n);
    }
    
}
