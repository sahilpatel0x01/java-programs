package days30.challange;

class MainClassForAllArrays{
    public static void main(String []args){
       int [] testArr = {5,4,66,44,56,54,7,66, 66,5,4,66,58,56,57,7,7,7};
                        //  9,8,7,6,5,4,3,2,1
       // lenghth 9 
       //indexMax = 8
        // System.out.println(Arrays.toString(reverseArray(testArr)));
       rotateArr_day2 rotator = new rotateArr_day2();
    //    rotator.rightSideRotator(testArr);
       arraySort sorter = new arraySort();
       sorter.sort(testArr);
        
       //duplicates topic 
       duplicates dup = new duplicates();
    //    dup.duplicates(testArr);
    Frequency freq = new Frequency();
    freq.dupCounter(testArr);





















    }
    public static int [] reverseArray(int [] arr){
        for (int i =0; i< arr.length/2; i++){
            int temp = arr[i];
            arr[i]= arr[arr.length-1-i];
            arr[arr.length-1-i] = temp;
        }
        return arr;
    }
}