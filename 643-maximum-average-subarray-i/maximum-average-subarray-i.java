class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int left = 0;
        double  sum = 0;
        double avg = 0;
        double bavg = -1 * Double.MAX_VALUE;

        for(int right = 0;right< nums.length;right++){
            sum += nums[right];

            if(right-left+1 == k){
                avg = sum/k;
               // System.out.println("avg " + avg + " sum "+ sum);
                bavg = (double)Math.max(bavg,avg);
                //System.out.println("bavg "  + bavg);
                sum -= nums[left];
                left++;

            }


        }

        return bavg;
        
    }
}