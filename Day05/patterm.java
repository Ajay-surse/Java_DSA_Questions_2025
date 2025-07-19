package Day05;

import java.util.Scanner;

//outer loop focused on the Rows and Inner Loop Focused on The Columns 
class pattern{

    public static void pattern1(int n){
         for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    public static void pattern2(int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();;
        }
    }

    public static void patter3(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }
    public static void pattern5(int n){
        /*
            * 
         * *  *
        * * * * *

        */
        for(int i=0; i<n; i++){
            for(int j=0; j<n-i-1; j++){
                System.out.print(" ");
            }
            for(int k=0; k<2*i+1; k++){
                System.out.print("*");
            }
            for(int l=0; l<n-i-1; l++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void pattern6(int n){
        /*
         * * * * *
           * * *
             * 
         */

         for(int i=0; i<n; i++){  // Rows
            for(int j=0; j<i; j++){
                System.out.print(" ");
            }
            for(int k=0; k<2*n-(2*i+1); k++){
                System.out.print("*");
            }
            for(int l=0; l<i; l++){
                System.out.print(" ");
            }
            System.out.println();
         }
    }

    /*
      
            * 
         * *  *
        * * * * *
        * * * * *
          * * *
            *
     */

     public static void pattern7(int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<n-i-1; j++){
                System.out.print(" ");
            }
            for(int k=0; k<2*i+1; k++){
                System.out.print("*");
            }
            for(int l=0; l<n-i-1; l++){
                System.out.print(" ");
            }
            System.out.println();
        }
        for(int i=0; i<n; i++){ 
            for(int j=0; j<i; j++){
                System.out.print(" ");
            }
            for(int k=0; k<2*n-(2*i+1); k++){
                System.out.print("*");
            }
            for(int l=0; l<i; l++){
                System.out.print("");
            }
            System.out.println("");
        }
     }

    
    public static void main(String[] args) {
        System.out.print("Enter the Number : ");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        pattern1(n);
        System.out.println("");
        pattern2(n);
        System.out.println("");
        patter3(n);
        System.out.println("");
        pattern5(n);
        System.out.println("");
        pattern6(n);
        System.out.println("");
        pattern7(n);  // n=3 
    }
}
