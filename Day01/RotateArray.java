public class RotateArray {

    public static void reverse(int arr[], int left, int right){
        while(left<=right){
            int temp = arr[left];
            arr[left]= arr[right];
            arr[right]= temp;
            left++;
            right--;
        }
    }

    public static void printarray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
       
    }
    public static void rotate(int k, int arr[]){
        k = k%arr.length;
        int n =arr.length;
        reverse(arr, 0, n-1);
        printarray(arr);
        System.err.println();
        reverse(arr, 0, k-1);
        printarray(arr);
        System.out.println();
        reverse(arr,k, n-1);
        printarray(arr);

    }
    public static void main(String[] args) {

        int arr[]= {1,2,3,4,5,6,7};
        rotate(3, arr);
        
    }
    
}
