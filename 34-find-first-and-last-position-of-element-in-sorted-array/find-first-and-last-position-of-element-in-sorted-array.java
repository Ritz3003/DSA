class Solution {

    public static int startPos(int[] nums, int target){

        int low = 0 , high = nums.length - 1;
        int result = -1;

        while ( low <= high){

            int mid = (low + high) / 2;

            if(nums[mid] < target){
                low = mid + 1;
            }else if(nums[mid] > target){
                high = mid - 1;
            }
            else {
                result = mid;
                high = mid - 1;
            }
        }

        return result;

    }

    public static int lastPos(int[] nums, int target){

        int low = 0 , high = nums.length - 1;
        int result = -1;

        while ( low <= high){

            int mid = (low + high) / 2;

            if(nums[mid] > target){
                
                high = mid - 1;
            }else if (nums[mid] < target){
                low = mid + 1;
            }
            
            else{
                result = mid;
                low = mid + 1;
            }
        }

        return result;

    }
    public int[] searchRange(int[] nums, int target) {

        int fristTarget = startPos(nums,target);
        int lastTarget = lastPos(nums,target);

        return new int[] {fristTarget,lastTarget};
        
    }
}