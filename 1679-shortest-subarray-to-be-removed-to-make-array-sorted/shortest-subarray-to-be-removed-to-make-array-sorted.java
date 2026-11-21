class Solution {
    public int findLengthOfShortestSubarray(int[] arr) {

        /**
         [ kept prefix ][ window = deleted ][ kept suffix ]
           0 .. left-1     left .. right      right+1 .. n-1
         */

        int n = arr.length;
        int L = 0; //for prefix sort 

        while(L+1 < n && arr[L] <= arr[L+1]) L++;

        if(L == n-1) return 0;

        int R = n - 1;

        while(R > 0 && arr[R-1] <= arr[R] ) R--;
            
        
  System.out.println("R " + R + " L " + L);
        // sliding window 

        int left = 0, ans = Integer.MAX_VALUE;

        for(int right = R-1;right < n;right++){
            while(left <= L+1 &&
                  ( left  == 0 || right == n-1 ||
                   arr[left-1] <= arr[right + 1])){

                    ans = Math.min(right-left+1,ans);
                    left++;

                   }
            
        }

        return ans;
        
    }
}