package Day03;

public class FindMissingNumber {

    // Leetcode link : https://leetcode.com/problems/missing-number/description/

    public static int findMissing(int nums[],int n){
        int xor1=0,xor2=0;
        for(int i=0; i<n-1; i++){
            xor2=xor2^nums[i];
            xor1=xor1^(i+1);
        }
        xor1=xor1^n;
        return(xor1^xor2);

    }
    public static void main(String[] args) {
        int n=5;
        int nums[]= {1,2,4,5};
        int ans = findMissing(nums,n);
        System.out.print("nums : " + ans);
        
    }
    
}





// import java.util.*;

// public class tUf {
//     public static int missingNumber(int []a, int N) {

//         //1,2,4,5

//         // Outer loop that runs from 1 to N:
//         for (int i = 1; i <= N; i++) {

//             // flag variable to check
//             //if an element exists
//             int flag = 0;

//             //Search the element using linear search:
//             for (int j = 0; j < N - 1; j++) {   // 0 to 4
//                 if (a[j] == i) {

//                     // i is present in the array:
//                     flag = 1;
//                     break;
//                 }
//             }

//             // check if the element is missing
//             //i.e flag == 0:

//             if (flag == 0) return i;
//         }

//         // The following line will never execute.
//         // It is just to avoid warnings.
//         return -1;
//     }

//     public static void main(String args[]) {
//         int N = 5;
//         int a[] = {1, 2, 4, 5};

//         int ans = missingNumber(a, N);
//         System.out.println("The missing number is: " + ans);
//     }

// }