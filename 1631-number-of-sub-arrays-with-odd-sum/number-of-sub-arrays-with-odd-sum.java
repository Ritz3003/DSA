class Solution {
    public int numOfSubarrays(int[] arr) {
      final  int MOD = 1_000_000_007;
        int[] parity = new int[2];
        long ans = 0;
        parity[0] = 1;
        int pSum = 0;

        for(int i = 0;i<arr.length;i++){
            pSum += arr[i];

            if(pSum % 2 == 0){
                ans+=parity[1]; 
                parity[0]++;
            }else{
                ans+=parity[0];
                parity[1]++;
            }
        }

        return (int) (ans%MOD);

        
    }
}