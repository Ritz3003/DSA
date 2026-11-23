class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {


int left = 0, right = nums.length-1;
List<List<Integer>> list = new ArrayList<>();
Arrays.sort(nums);
        for(int a = 0;a<nums.length;a++){
            if(a>0 && nums[a] == nums[a-1]) continue;
            for(int b = a+1;b<nums.length;b++){
                 if(b>a+1 && nums[b] == nums[b-1]) continue;
                 left = b+1;
                 right = nums.length-1;
                while(left <right){
                    long sum = (long)nums[a] + nums[b] + nums[left]+nums[right];
                    if(sum ==  target){
                        list.add(Arrays.asList(nums[a],nums[b],nums[left],nums[right]));
                        left++;
                        right--;
                        while(left < right && nums[left] == nums[left-1]) left++;
                          while(left < right && nums[right] == nums[right+1]) right--;

                    }else if(sum > target){
                     right--;}
                    else{ 
                     left++;
                    }
                }


            }

        }

        return list;
        
    }
}