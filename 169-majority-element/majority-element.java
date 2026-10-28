class Solution {
    public int majorityElement(int[] nums) {

        int n = nums.length;
         n = n/2;
         int ans = 0;

        HashMap<Integer,Integer> freq = new HashMap<>();

        for(int i = 0;i< nums.length;i++){
            freq.put(nums[i], freq.getOrDefault(nums[i],0)+1);
        }

        for(Map.Entry<Integer,Integer> entry : freq.entrySet()){
             int key = entry.getKey();
             int val = entry.getValue();
              if(val > n){
                ans = key;
                break;
              }

        }

return ans;
        
    }
}