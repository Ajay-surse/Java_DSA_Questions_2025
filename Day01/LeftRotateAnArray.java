public class LeftRotateAnArray {

    public static void LeftRotateAnArray(int args[]){
        int temp = args[0];
        int n= args.length;
        for(int i=1; i<n; i++){
            args[i-1]=args[i];
        }
        args[n-1]=temp; 
        for(int i=0; i<n; i++){
            System.out.print(args[i]+ " ");
        }
    }

    public static void main(String[] args) {
        int arr[]= {1,2,3,4,5,5};
        LeftRotateAnArray(arr);
    }
}
