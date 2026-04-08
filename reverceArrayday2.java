import java.util.Arrays;

class reverseArrayday2{
    public static void main(String []args){
       int [] testArr = {1,2,3,4,5,6,7,8,9};
                        //  9,8,7,6,5,4,3,2,1
       // lenghth 9 
       //indexMax = 8

        // reverceArray(testArr);
        System.out.println(Arrays.toString(reverceArray(testArr)));
        
    }
    public static int [] reverceArray(int [] arr){
        for (int i =0; i< arr.length/2; i++){
            int temp = arr[i];
            arr[i]= arr[arr.length-1-i];
            arr[arr.length-1-i] = temp;


        }
        return arr;
    }
}