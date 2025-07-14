import java.util.Arrays;

class Array1{

    public static int findlargetElement(int arr[],int max){
       // max=arr[0];
        for(int i=1; i<arr.length; i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        return max;
    }   

    public static int bruteForce(int arr[]){
        return arr[arr.length-1];
    }
    public static void main(String[] args) {
        int arr[]={3,2,1,5,2};
        int largest =findlargetElement(arr, arr[0]);
        System.out.println("Largets element is " + largest);
      //  System.out.println("before sort Larget element " + arr);
       // Arrays.sort(arr);
        //System.out.println("After sort Larget element " + bruteForce(arr));
        
    }

}