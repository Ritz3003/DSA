class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0, ans = Integer.MAX_VALUE;

        int sum = 0;

        for(int right = 0;right<nums.length;right++){
           
           //1. include right
           sum += nums[right];

           while(sum >= target){//2. for shortest/min case check while valid

           //3. record before shrinking
           ans = Math.min(ans, right - left +1);
           sum -= nums[left];
           //4. remove left
           left++;

           } 



        }

        return ans==Integer.MAX_VALUE? 0 : ans;
        
    }
}