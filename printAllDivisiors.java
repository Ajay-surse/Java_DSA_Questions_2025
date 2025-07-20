import java.util.Scanner;

public class printAllDivisiors {

    // print all divisors
    // 36-> 1,2 3,4, 6, 9, 12 ,18,36 
    public static void printAllDivisiors(int n){
        for(int i=1; i<=n; i++){
            if(n%i==0){
                System.out.println("The Number of ALL Divisiors are " + i);
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter the Number"); 
        Scanner sc = new Scanner(System.in);  
        int n = sc.nextInt();
        printAllDivisiors(n);
    }
    
}
