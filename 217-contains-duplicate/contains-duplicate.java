class Solution {
    public boolean containsDuplicate(int[] nums) {

        Set<Integer> set = new HashSet<>();
        boolean containsDuplicate = false;

        for(int i = 0;i < nums.length;i++){

            if(set.contains(nums[i])){
                containsDuplicate = true;
                break;
            }else{
                set.add(nums[i]);
            }



        }

        return containsDuplicate;
        
    }
}