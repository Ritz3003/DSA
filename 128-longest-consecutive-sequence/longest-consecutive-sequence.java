class Solution {
    public int longestConsecutive(int[] nums) {

        HashMap<Integer,Integer> mp = new HashMap<>();
        int ans = 0;

        for(int i = 0;i < nums.length;i++){

            if(mp.containsKey(nums[i])){
                continue;
            }
            int left = 0, right = 0;
            if(mp.containsKey(nums[i] - 1))
            left = mp.get(nums[i]-1);
             if(mp.containsKey(nums[i] + 1))
             right =  mp.get(nums[i]+ 1);
            int res = left + right + 1;
            mp.put(nums[i], res);
            mp.put(nums[i] - left , mp.get(nums[i]));
             mp.put(nums[i] + right , mp.get(nums[i]));
            ans = Math.max(res,ans);

            
        }
        return ans;
        
    }
}