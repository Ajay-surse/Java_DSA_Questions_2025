package Day03;

public class MaximumConsecutiveNums {

    //LeetCode: https://leetcode.com/problems/max-consecutive-ones/

    //{1, 1, 0, 1, 1, 1}
    public static int maxconsecutive(int arr[]){
        int maximum = 0;
        int counter = 0;  //  1->2    0->1    1->3
        for(int i=0; i<arr.length; i++){
            if(arr[i] == 1){
                counter++;
            }else{
                counter=0;
            }
            maximum = Math.max(maximum, counter);
        }
        return maximum;

    }

    // TIME COMPLEXITY  O(1) + O(1) + O(N) + O(1) + O(1) + O(1) + O(1) = 0(2) + O(N) + O(4) = O(6 N) = O(N)
    // SPACE COMPLEXITY O(1) 


    public static void main(String[] args) {
        int arr[] = {1,1,0,1,1,1};
        int maximum = maxconsecutive(arr); 
        System.out.println("Maximum : " + maximum);       
    }

}
