class Solution {
    void printArray(int[] arr){
        for(int i = 0 ;i<arr.length;i++){
            System.out.println( i + " = " + arr[i]);
        }
    }
    public int characterReplacement(String s, int k) {
        
        int maxFreq = 0;
        int left = 0;
        int freq[] = new int[26];
        int ans = -1;
        for(int i = 0;i<s.length();i++){
            char ch = s.charAt(i);
            freq[ch-65]++;
            maxFreq =  Math.max(freq[ch-65], maxFreq);
           

            if(i-left+1 - maxFreq > k){
                freq[s.charAt(left) - 65]--;
                left++;
               
                
            }

            ans = Math.max(ans,i - left + 1);


        }
        return ans;
    }
}