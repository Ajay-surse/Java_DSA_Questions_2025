package Day07;
import java.util.Scanner;

public class CountDigit {
  // 123
    public static int countDigit(int number){
        //  
        // NOTE : if the number of iteration is based on division then tine complexity is logarithmic 
        int lastDigit = 0;
        int count = 0;
        // using extraction we can solve the problem 
        while (number!=0) {  
            lastDigit = number%10;  // 4 3 
            count ++;    // 1   
            number = number/10;  // 123
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



/*
 * 1234 %10 = 4
 * 1234/10 = 123   log101234  = 122.789  + 1 = 123.768 = > 123 
 * 
 * 
 * 
 * 
 * 
 * 
 */