package days30.challange;

public class duplicates {
  void duplicates(int[]arr){
    // boolean duplicate =false;
    for (int i = 0; i < arr.length; i++) {
        boolean duplicate =false;
        for (int j = i+1; j < arr.length; j++) {
            if(arr [i] == arr[j]){
                duplicate = true;
                break;
            }
        }
    if(duplicate == true){
        System.out.println(arr[i]);
    }
    }
    
   }
}

