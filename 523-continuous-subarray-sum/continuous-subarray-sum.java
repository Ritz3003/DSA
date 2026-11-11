class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
       Map<Long,Integer> mp = new HashMap<>();
       mp.put(0L,-1);
       long prefixSum = 0;
      

       for(int i = 0;i<nums.length;i++){

           
           prefixSum += nums[i];
           if(mp.containsKey(prefixSum % k )){
             //check length
             if(i  - mp.get(prefixSum%k) >= 2){
                return true;
             }
           }else
           mp.put(prefixSum%k,i);

           // System.out.println(mp);
       }

      // System.out.println(mp);

       return false; 
    }
}