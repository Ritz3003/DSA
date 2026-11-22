class Solution {
    public int longestSubarray(int[] nums) {

        int cz = 0;
        int left =0;
        int ans = 0;

        int[] freq = new int[2];

        for(int right = 0; right<nums.length;right++){
            int rt = nums[right];
            freq[rt]++;
            if(rt == 0) cz++;

            while(cz > 1){
                int leftVal = nums[left];
                
                if(leftVal== 0){
                    
                    cz--;
                }
                freq[leftVal]--;
                left++;
            }

            System.out.println(cz + " " + (right - left +1 ));

                    

            ans = Math.max(ans, right - left + 1);

            // if(cz == 1){
            //     ans -= 1;
            // }


            System.out.println("ans  " + ans);
            


        }

        return ans -1 ;
        
    }
}