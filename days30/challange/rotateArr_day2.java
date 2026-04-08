package days30.challange;

import java.util.Arrays;

public class rotateArr_day2 {
  public void printer(){
   System.out.println("ok test rotated");
    }
    public void rightSideRotator(int [] arr){
        int lastNum = arr[arr.length-1];
        for (int i = arr.length-1; i > 0; i--) {
            arr[i]=arr[i-1];

        }
        arr[0]= lastNum;
    System.out.println(Arrays.toString(arr));
    }
    


//not worked on this
    public void leftSideRotator(int []arr,int indexOfRot){
        int temp = arr[indexOfRot];
        for(int i =0; i <arr.length-1;i++){
            int firstRot = arr [i+1];
            int secondRot =arr [i];x    
            
            for(int j=0; j<arr.length;j++){
            arr[j+1] = arr[j];
            }
        }
        arr [0] = temp;
        System.out.println(Arrays.toString(arr));
    }

    
}
