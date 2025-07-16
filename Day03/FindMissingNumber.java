package Day03;

public class FindMissingNumber {

    // Leetcode link : https://leetcode.com/problems/missing-number/description/



    // better 

    public static int usingHash(int arr[], int n){
        int hash[]= new int[n+1];  // hash array suppose n is 5 it will 6 size of hash array in that value store from 0 to 5 index 

        //storing the frequencies 
        for(int i=0; i<n-1; i++)  {
            //hash[arr[i]] = 1 ;
            hash[arr[i]]++; 
        }
        
        // checking the frequencies from 1 to N
        for(int i=1; i<=n; i++){
            if(hash[i] == 0){
                return i;   
            }
        }

        return -1;
    }
    
    // optimal 
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
      //  int ans = findMissing(nums,n);
        int usinghash = usingHash(nums,n);
        System.out.print("nums : " + usinghash);
        
    }
    
}





