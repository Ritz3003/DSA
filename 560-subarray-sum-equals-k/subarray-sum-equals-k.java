class Solution {
    public int subarraySum(int[] nums, int k) {

        HashMap<Integer,Integer> mp = new HashMap<>();
        int pSum = 0 , count = 0;
        mp.put(0,1);

        for(int i = 0;i<nums.length;i++){
            pSum += nums[i];

            if(mp.containsKey(pSum-k)){
                count += mp.get(pSum-k);
            }
                mp.put(pSum, mp.getOrDefault(pSum,0) + 1);
            
        }

        return count;
        
    }
}