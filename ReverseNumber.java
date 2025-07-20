import java.util.Scanner;

public class ReverseNumber {

    public static int reverseNumber(int n){
        int ReverseNumber = 0;
        int lastDigit = 0; 
        while (n!=0) {
            lastDigit=n%10;
            ReverseNumber = (ReverseNumber*10) + lastDigit;
            n= n/10; 
        }
        return ReverseNumber;
    }
    public static void main(String[] args) {
        System.out.println("Enter the Number");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int reverse= reverseNumber(number);
        System.out.println("Revese number of "+ number + " is "+ reverse);
        
    }
    
}
