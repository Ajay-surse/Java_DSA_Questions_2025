package Day08;

import java.util.Scanner;

//Sum of first N numbers
public class Recursion5 {
    // print 1 to 5 using recursion 
    public static void Recursion5(int n){
        if(n<=0){
            return;
        }
        Recursion5(n-1);
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        System.out.print("Enter The Number ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Recursion5(n);
    }
}
