package Day03;

public class MaximumConsecutiveNums {

    //LeetCode: https://leetcode.com/problems/max-consecutive-ones/

    public static int maxconsecutive(int arr[]){
        int maximum = 0;
        int counter = 0;
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

    public static void main(String[] args) {
        int arr[] = {1,1,0,1,1,1,1};
        int maximum = maxconsecutive(arr); 
        System.out.println("Maximum : " + maximum);       
    }

}
