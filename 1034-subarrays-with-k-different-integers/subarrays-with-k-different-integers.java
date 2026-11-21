class Solution {
    public int atMost(int[] nums, int k){
         int left=0, count =0;

        Map<Integer,Integer> map = new HashMap<>();

        for(int right = 0;right < nums.length;right++){
            int r =  nums[right];
            map.put(r,map.getOrDefault(r,0)+1);
            while(map.size() > k){
                int l = nums[left];
                map.put(l,map.get(l) -1);
                if(map.get(l) == 0) map.remove(l);
                left++;
            }
            count += right -left +1;
        }

        return count;
    }
    public int subarraysWithKDistinct(int[] nums, int k) {

        return atMost(nums,k) - atMost(nums,k-1);

       
        
    }
}