class Solution {
    public int findMiddleIndex(int[] nums) {

        int presum = 0;
        int total =0;

        for(int i : nums){
            total += i;
        }

        for(int i = 0;i<nums.length;i++){
           int rSum = total - presum - nums[i];
            if(rSum == presum)
            return i;
            else
            presum += nums[i];
        }

        return -1;
        
    }
}