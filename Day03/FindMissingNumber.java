package Day03;

public class FindMissingNumber {

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
