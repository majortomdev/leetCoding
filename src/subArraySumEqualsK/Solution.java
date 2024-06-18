package subArraySumEqualsK;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {

        int [] myArr = {-2,1,3,1,0,1,-1,2};
        int [] myArr1 = {-2,1,3,3,1,0,1,-1,2};
        Solution sol = new Solution();
        System.out.println(sol.countSubArrayT(myArr, 3));
    }

    public int countSubArrayT(int[] arr, int t){
        int currentSum=0;
        int count = 0;
        Map<Integer, Integer> prefixSums = new HashMap();
        prefixSums.put(0,1);
        for(int i=0; i<arr.length; i++){
            currentSum+=arr[i];
            int diff = currentSum-t;
            if(prefixSums.containsKey(diff)) {
                count += prefixSums.get(currentSum - t);
                System.out.println(i);
            }
            prefixSums.put(currentSum, prefixSums.getOrDefault(currentSum, 0) +1);
        }
        System.out.println("-----------------");
    return count;
    }
}
