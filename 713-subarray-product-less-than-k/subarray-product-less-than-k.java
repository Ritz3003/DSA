class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {

        int left = 0; int count = 0;int prod = 1;

        if(k <=  1){
            return 0;
        }

        for(int right = 0; right<nums.length;right++){

            prod *= nums[right];

            while(left < nums.length && prod >= k){
              int l = nums[left];
               prod /= l;
               left++;
               }

            count += right - left + 1;
            
        }

        return count ;
        
    }
}