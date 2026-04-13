package leetcode_submissions;
public class zeroes {
    public int [] fixer(int []arr){
int insertPos = 0;
for (int i = 0; i < arr.length; i++) {
        if(arr[i]!=0){
            arr[insertPos]= arr[i];
            insertPos++;
        }

}
for (int i = insertPos; i < arr.length; i++) {
    arr[i]=0;
}
System.out.println(insertPos);
        return arr;
    }
}
