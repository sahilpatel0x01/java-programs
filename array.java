import java.util.Arrays;
class array {
    public static void main(String[] args) {
        System.out.println("start");
       //learining array 
    //    array();
       double []anotherArr = new double[100];
    //    arrayFiller(anotherArr);

    System.out.println(Arrays.toString(sortArr(arrayFiller(anotherArr))) );
   
    }

    public static double[] arrayFiller(double []anotherArr){
        double[] randomNums = new double[anotherArr.length];

            for(int i=0; i!= anotherArr.length;i++){
                double funRandom = Math.random();
                anotherArr[i]= (int)(funRandom*1000);
                //saving all random int gen in one arr;
                randomNums[i]= funRandom;
               
                

            } 
             saveArr(randomNums);
        return anotherArr;
    }
    // private static void array(){
    //     System.out.println("array start");
    //     int[] arr = {1,11,111,2,22,222,3,33,333};
    //      System.out.println("inputed arr "+ Arrays.toString(arr));
    //     int sum =0;
    //     for(int numbers: arr){
    //         System.out.println(numbers);
    //         sum+=numbers;
    //     }
    //     System.out.println(sum);
    //     //  sortArr(arr);
    //     System.out.println("main function arr "+Arrays.toString(sortArr(arr)));



    // }
    public static double[] sortArr(double arr[]){
        double temp;
        
        // int [] sortedArr= new int[arr.length];
        int a=0;
        while(a<arr.length){
        for(int i=0; i<arr.length-1;i++){
            temp =arr[i];
           try{
            if (arr[i]> arr[i+1]) {
                arr[i]= arr[i+1];
                arr[i+1]= temp; 
                
            }
        }catch(Exception e){
            System.out.println(e);

        }
        }
        a++;
        // System.out.println("in while loop arr "+ Arrays.toString(arr));
    }

        
        //  System.out.println("while loop ending arr  "+ Arrays.toString(arr));
        return arr;

    }
static void saveArr(double []arr){
    
    System.out.println( "this is saved arr of random num gen "+ (Arrays.toString(arr)));

    
}

}
