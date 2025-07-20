import java.util.Scanner;

public class CountDigit {
  // 123
    public static int countDigit(int number){
        int lastDigit = 0;
        int count = 0;
        // using extraction we can solve the problem 
        while (number!=0) {
            lastDigit = number%10;
            count ++;
            number = number/10;
        }   
        return count;
    }

    public static void main(String[] args) {
        // count the Number of DIgit 
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int count = countDigit(number);
        System.out.println("The number is " +number +"and the count is "+ count);
    }
    
}
