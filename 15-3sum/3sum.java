class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> list = new ArrayList<>();

        Arrays.sort(nums);
        int n = nums.length;

        for(int anchor = 0; anchor < n-2;anchor++){
           if(nums[anchor] > 0) break; // early exit

           if(anchor > 0 && nums[anchor-1] == nums[anchor]) continue;

           int left = anchor + 1, right = n -1;

           while(left < right){
             int sum = nums[left] + nums[right] + nums[anchor];

             if(sum == 0){
                list.add(Arrays.asList(nums[anchor],nums[left],nums[right]));
                left++ ; right--;
             

             while(left < right && nums[left] == nums[left-1]) left++;
             while(left < right && nums[right] == nums[right+1]) right--;
             }else if(sum > 0) right--;
             else left++;


           }


        }

        return list;
        
    }
}