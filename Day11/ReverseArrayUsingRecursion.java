package Day11;

import java.util.Scanner;


public class ReverseArrayUsingRecursion {

    public static int reverseUsingArraySinglePointer(int arr[],int i,int n){
        if(i>=n/2) return 0;
        Swap(i, n-i-1, arr);
        reverseUsingArraySinglePointer(arr, i+1, n-i-1);
        return 0;
    }
    

    public static void Swap(int arr1, int arr2 ,int arr[]){
        int temp = arr[arr1];
        arr[arr1]= arr[arr2];
        arr[arr2]= temp;
    }

    public static void main(String[] args) {
    int n;
    System.out.println("Enter the Size of an Array");
    Scanner sc = new Scanner(System.in);
    n = sc.nextInt();
    int arr[] = new int[n];
    for(int i = 0; i<n; i++){
        arr[i]=sc.nextInt();    
    }
    reverseUsingArraySinglePointer(arr,0, n);
       for(int j=0; j<n; j++){
        System.out.print(arr[j] + " ");
       }
    }
}
