package Day08;

import java.util.Scanner;

public class Recursuin6 {

    //n = 3  print 3,2,1 dont use f(i-1,n)
    public static void printntwoone(int i,int n){
        if(i>n)return;
        printntwoone(i+1,n);
        System.out.println(i+ " ");
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        printntwoone(1,n);

    }
    
}
