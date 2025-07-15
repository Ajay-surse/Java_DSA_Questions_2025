package Day03;

public class FindNumbertAppearsonceandothertwi {

    // optimal Appraoach 

    public static int findappearnce(int arr[]){
        int xor = 0;
        for(int i=0; i<arr.length; i++){
            xor=xor^arr[i];
        }
        return xor;

    }

    public static void main(String[] args) {
        int arr[]= {1,1,2,3,3,4,4};
        int result = findappearnce(arr);
        System.out.println(result);
    }
    
}
