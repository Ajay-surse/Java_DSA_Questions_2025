package Day09;

import java.util.Scanner;

public class Recursion1 {

    // sum of first N numbers 

    //paremetrized way
    public static void printFirstNNumber(int i, int sum){
        if(i<1){
            System.out.print(sum + " ");
            return;
        }
        printFirstNNumber(i-1, sum+i); 

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        printFirstNNumber(n,0);
    }
    
}
