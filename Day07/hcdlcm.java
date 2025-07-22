package Day07;

import java.util.Scanner;

public class hcdlcm {

    /*
      n1=20   n2=40
     */

     // bruteforceApproach

     public static int min(int number1,int number2){
        if(number1<number2){
            return number1;
        }else{
          return number2;
        }
     }

     public static int findLcmandHcf(int number1, int number2){
        for(int i=min(number1,number2); i>=1; i--){
          if((number1%i==0 && number2%i==0)){
              return i;
          }
        }
        return 1;

     }

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int Number1 = sc.nextInt();
      sc.nextLine();
      int Number2 = sc.nextInt();
      int Result = findLcmandHcf(Number1, Number2);
      System.out.println("Result : " + Result);
        
    }
  }
