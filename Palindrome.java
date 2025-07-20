import java.util.Scanner;

public class Palindrome {

    // 1331 -> 1331 -> palindrome 
    // 111 -> 111 -> palindrome 
    // 123 -> 321 -> not a palindrome 
    public static boolean checkPalindrome(int n){
        int original = n;
        int lastDigit = 0;
        int revese = 0;
        while (n!=0) {
            lastDigit = n%10;
            revese = (revese*10) + lastDigit;
            n = n/10;
        }
        if(original != revese){
            return false;
        }else{
            return true;
        }

    }
    public static void main(String[] args) {
        System.out.println("Enter the Number");
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        boolean status = checkPalindrome(n);
        System.out.println("The Give numbe is " + n + " "+status);
        
    }
    
}
