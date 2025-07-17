package Day04;

import java.util.ArrayList;

class MoveZeroToEndOfArray{


    public static void movezerotoEnd(int arr[]){
        ArrayList<Integer> al = new ArrayList<>();
        for(int i=0; i<arr.length; i++){  // put non zero value into al[] = {1,2,3,2,4,5,1};
            if(arr[i]!=0){
                al.add(arr[i]);
            }
        }
        // STEP2
        // push al[]= into arr[]
        int nonzero = al.size();
        for(int i=0; i<al.size(); i++){
            arr[i]=al.get(i);
        }

        // step 3 push the element form non zero to n 

        for(int i=nonzero; i<arr.length; i++){
            arr[i]= 0;
        }

        // print 

        for(int i=0; i<arr.length; i++){
            System.out.print(" "+ arr[i]);
        }


    }
    public static void main(String[] args) {
        
        int arr[] = {1,0,2,3,2,0,0,4,5,1};   // 1,2,3,4,5,1,0,0,0 // All non zero put into front of the array and remaing zero put in ito last 
            // al[] = {1,2,3,2,4,5}
        movezerotoEnd(arr);

        
    }
}