import java.util.Arrays;

import days30.*;
import days30.arrays10problem.runsum;
public class TenProblemRunner {
    public static void main(String[] args) {
        int []arr = {1,2,3,4};
        runsum Run = new runsum();
        System.out.println(Arrays.toString(Run.solution(arr, 2,1)));
    }
}
