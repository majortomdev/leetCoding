package moveZeroesToRight;

class Solution {
    public void moveZeroes(int[] nums) {//beats 80% for runtime
        int countZeroes = 0;
        //int [] newNums= new int[nums.length];
        int ll = nums.length-1;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==0){
                countZeroes++;
            }else{
                nums[i-countZeroes]=nums[i];
            }
        }

        // for(int j = countZeroes; j>0; j--){
        //     nums[ll]= 0;
        //     ll--;
        // }
//better memory opt than commented out
        while(countZeroes>0){
            nums[ll]=0;
            ll--;
            countZeroes--;
        }

    }
}