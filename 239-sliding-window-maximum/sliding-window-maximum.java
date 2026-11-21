class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {

        int n = nums.length;
        Deque<Integer> dq = new ArrayDeque<>();
        int res[] = new int[n-k+1];
        int x = 0;

        for(int i = 0;i<n;i++){

            while(!dq.isEmpty() && dq.getFirst() <= i-k){
                dq.removeFirst();
            }

            while(!dq.isEmpty() && nums[i]>nums[dq.getLast()]){
                dq.removeLast();
            }
            dq.addLast(i);
        

           if(i>=k-1){
                res[x++]=nums[dq.getFirst()];
            }
        }
        return res;
    }
}