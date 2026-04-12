package leetcode_submissions;
public class Twosum {
    public int[] twoSum(int[] nums, int target) {
        int[] sumArr = new int[2]; //
        for(int i= 0; i<nums.length;i++){
            for(int j= i+1; j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                   
                   sumArr[0]=i;
                   sumArr[1]=j;
                //    return new int[]{i,j};
                   break;
                    
            
                }
            }
        }
        if (sumArr[0]==0 && sumArr[1]==0){
            System.out.println("there is no solution for this");
        }
        return sumArr;
        
    }
}
