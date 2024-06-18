package threeSum;

import java.util.*;



class Solution {

    public static void main(String[]args){
        Solution sol = new Solution();
        int [] test = {-1,0,1,2,-1,-4};
        System.out.println(sol.threeSum(test));
    }

    public List<List<Integer>> threeSum(int[] nums) {
        Set<Set<Integer>> mySet = new HashSet<>();

        for(int i=0; i<nums.length-2; i++){
            for(int j=i+1; j<nums.length-1; j++){
                for(int k=i+2; k<nums.length; k++){
                    if(nums[i]+nums[j]+nums[k]==0){
                        Set<Integer> zeroSet = new HashSet<>();
                        zeroSet.add(nums[i]);
                        zeroSet.add(nums[j]);
                        zeroSet.add(nums[k]);
                        mySet.add(zeroSet);
                    }
                }
            }
        }
        List<List<Integer>> resulting = new ArrayList<List<Integer>> (mySet.size());
        int i=0;
        for(Set<Integer> set : mySet){
//            resulting.set(i)= set;
//            i++;
        }
        return resulting;
    }
}
