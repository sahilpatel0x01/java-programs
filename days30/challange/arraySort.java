package days30.challange;

import java.util.Arrays;

public class arraySort {
    public void sort (int []arr){
        // Arrays.sort(arr);
        while(arr.length<2){
            System.out.println("cant find the second largest..sorry.....");
            break;
        }
        int largestNum;
        int secondNum=0;
       for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]>arr[i+1]){
                largestNum= arr[i];
                secondNum = arr [i+1];
            }else{
                secondNum= arr[i];
                largestNum = arr [i+1];
            }
            secondNum = secondNum+0;

            // System.out.println(secondNum);
       }
        // int secondLargest = arr [arr.length-2];
        System.out.println(Arrays.toString(arr));
        System.out.println(secondNum);
        //ai review said it needs edge cases like duplicates and very short array issues
        //duplicate edge case fixing 


    }
}
