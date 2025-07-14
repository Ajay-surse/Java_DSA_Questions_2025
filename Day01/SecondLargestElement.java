import java.util.Arrays;

class SecondLargestElement {

    public static int optimalApproach(int arr[], int max){
        int largest = arr.length-1;
        int secondlargest = 0;
        for (int i=largest-1; i>=0; i--){
            if(arr[i]!=largest){
                secondlargest = arr[i];
                break;
            }
        }
        return secondlargest;
    }

    public static int bruteforrceApproach(int arr[]){
        return arr[arr.length-2];
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,5,5,7};
        //   System.out.println("Before sort " + arr);
        //  Arrays.sort(arr);
        //  System.out.println("After sort " + bruteforrceApproach(arr));
        int SecondLargestElement = optimalApproach(arr, arr[0]);
        System.out.println("second largest element is " + SecondLargestElement);

    }
}
