class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        
        Map<Integer,Integer> mp = new HashMap<Integer,Integer>();
        int count = 0, pOdd = 0;
        mp.put(0,1);

        for(int i = 0;i<nums.length;i++){
            pOdd += (nums[i]%2==0)?0:1;
           

            if(mp.containsKey(pOdd-k)){
                count += mp.get(pOdd-k);
               
            }
            mp.put(pOdd,mp.getOrDefault(pOdd,0)+1);
        }
        return count;
    }
}