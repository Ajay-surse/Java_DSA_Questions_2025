public class findMissingNumber {
    public static int findMissing(int arr[]){
        int flag=0;
        // use Linear search
        for(int i=1; i<=arr.length; i++){
            flag =0;
            for(int j=0; j<arr.length; j++){
                if(arr[j]==i){
                    flag=1;
                }
            }
            if(flag==0){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[]= {1,2,3,5,6};
        int missingNumber = findMissing(arr);
        System.out.println("Missing Number" + missingNumber);

        
    }
    
}
