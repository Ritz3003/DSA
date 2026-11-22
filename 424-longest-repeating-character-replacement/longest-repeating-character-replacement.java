class Solution {
    public int characterReplacement(String s, int k) {
        int left = 0, ans = 0, maxFreq = 0;
        int freq[] = new int[128];

        for(int right = 0; right < s.length(); right++){
            char ch = s.charAt(right);
            freq[ch]++;
            maxFreq = Math.max(freq[ch],maxFreq);

            if((right - left + 1) - maxFreq > k){
                char leftChar = s.charAt(left);
                freq[leftChar]--;
                left++;
            }

            ans  = Math.max(right - left + 1, ans);

        }
        
        return ans;
    }
}