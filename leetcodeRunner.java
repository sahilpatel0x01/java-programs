import leetcode_submissions.*;
public class LeetCodeRunner {
    public static void main(String[] args) {
        
        // int[] arr = {1,2,3,5,6,7};
         int[] arr = {0,1,2,0,4,0,5,6,0,0,0,0};
        // Twosum leet  = new Twosum();
        // System.out.println(Arrays.toString(leet.twoSum(arr, 9)));
        zeroes zero = new zeroes();
        int [] copy= new int [arr.length];
        copy = zero.fixer(arr);
        for(int element: copy){
            System.out.print(element+", ");
        }
        
        

    }
}
