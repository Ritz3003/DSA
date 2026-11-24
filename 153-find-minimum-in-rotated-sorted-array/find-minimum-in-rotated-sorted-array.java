class Solution {
    public int findPeak(int[] nums){
        int low = 0, high = nums.length - 1;
        int peak = -1;

        while(low <= high){
            int mid = (low + high) / 2;

            if( nums[mid] >= nums[0]){
                peak = mid;
                low = mid+1;
            }else{
                //peak = mid;
                high = mid - 1;
            }
        }
        return peak;
    }
    public int findMin(int[] nums) {

       

        int res = findPeak(nums);

         System.out.println("res " + res);


       if(res == -1){
    return nums[0];
  }

        return res == nums.length-1?nums[0] : nums[res+1];
        
    }
}