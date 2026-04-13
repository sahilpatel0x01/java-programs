package days30.arrays10problem;

public class MaxMinOneScan {
    public void MaxMinOneScan(int [] arr){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>=max){
                max =arr[i];
            }
            if(arr[i]<=min) {
                min = arr[i];
            }

        }
        System.out.println("max: "+ max+"\n min: " +min);
    }

    public void WithoutIntegerClass(int []arr){
        int max, min;
        min =arr[0];
        max =arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<=min){
                min = arr[i];

            }
             if (arr[i]>=max){
                max = arr[i];
            } 

         }
           System.out.println("max: "+ max+"\n min: " +min);
    }
}
