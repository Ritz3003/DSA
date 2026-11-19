class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {

          int left = 0;
        int  sum = 0;
        int avg = 0;
        int cnt = 0, max =0;
      //  int bavg =  Integer.MIN_VALUE;

         for(int right = 0;right< arr.length;right++){
            sum += arr[right];

            if(right-left+1 == k){
                avg = sum / k;

                if(avg >= threshold){
                    cnt++;
                }

                sum -= arr[left];
                left++;


            }
         }

        return cnt;
        
    }
}


/*

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

*/ 