package Day08;

import java.util.Scanner;

public class Recursion1 {

    // print name n times using recursion 
    public static void printnumtime(int i,int n){  //1,5
        if(i>n){
            return;
        }
        System.out.println("Ajay"); 
        printnumtime(i+1,n); //(2,5)

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();   
        printnumtime(1,n);  //(1,5)
    }
    
}
