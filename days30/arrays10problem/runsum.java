package days30.arrays10problem;

import java.util.Arrays;

public class runsum{

    public int[] solution (int [] arr,int from, int to){
        //1 2 3 4 
        // 1 3 6 10
        int [] prefix = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int sum;
            int nextOf_i = i-1;
            //to tackle the out of bond -1 which will only appear once for all type of arrays
            // implemented if cond check 
            if(nextOf_i==-1){
                prefix [i] = arr[i];
                continue;
            }
             sum = arr [i]+ prefix[nextOf_i];
            prefix[i] = sum;
            
        }
        //now we can use it to take out sum of a subarray by using this runsum method
        System.out.println(sumOfSubArray(prefix,from,to));
        GetOriginalArray(arr);
        return prefix;
    }
    public static int sumOfSubArray(int [] arr, int from, int to){
        
        if(Math.max(from, to)==to){
        }else{
            int temp = to;
            to =from;
            from =temp;
        }
        int finalSum = arr [to]- arr [from-1];
        return finalSum;
    }

    public static void GetOriginalArray(int []arr){
        System.out.print("Original Array before prefix: "+Arrays.toString(arr)+"\n after prefix new Array is  : ");
    }
}