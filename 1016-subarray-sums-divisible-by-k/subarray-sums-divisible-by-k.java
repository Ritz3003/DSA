class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int pSum = 0; 
        int[] cnt = new int[k];
        cnt[0] = 1;
        int ans = 0;

        for(int i = 0 ;i<nums.length;i++){
            pSum += nums[i];
            int idx = ((pSum %k) + k ) % k;
            ans += cnt[idx];
            cnt[idx]++;


        }

        return ans;


        
    }
}