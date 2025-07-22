package Day07;
import java.util.ArrayList;
import java.util.Scanner;

public class printAllDivisiors {

    // print all divisors
    // 36-> 1,2 3,4,6, 9, 12 ,18,36 
    public static void printAllDivisiors(int n){
        for(int i=1; i<=n; i++){
            if(n%i==0){
                System.out.println("The Number of ALL Divisiors are " + i);
            }
        }
    }

    public static ArrayList<Integer> findDivisors(int n){

        ArrayList<Integer> divisors = new ArrayList<>();
        int sqrtN = (int) Math.sqrt(n);
        for(int i=1; i<=sqrtN; i++){
            if(n%i == 0){
                divisors.add(i);

                if(i!=n/i){
                     divisors.add(n/i);
                 }
            }
        }
        return divisors;
    }

    /*Optimal Approach  */

    public static void main(String[] args) {
        System.out.println("Enter the Number"); 
        Scanner sc = new Scanner(System.in);  
        int n = sc.nextInt();
       // printAllDivisiors(n);
        ArrayList<Integer> al = findDivisors(n);
        al.sort(null);
        for(Integer l:al){
            System.out.print(l + " ");
        }
    }
    
}
