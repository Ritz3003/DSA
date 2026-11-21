class Solution {
    public int balancedString(String s) {

        int left = 0, ans = s.length();
        int[] freq = new int[26];
        int n = s.length();

        for(int i = 0; i<s.length();i++){
            char ch = s.charAt(i);
           
                freq[ch - 'A']++;
           
        }

        for(int right = 0;right<s.length();right++){

            char ch = s.charAt(right);
            freq[ch-'A']--;

            while(left<s.length() && freq['Q'-'A'] <= n/4 && freq['W' -'A'] <= n/4 &&
                   freq['E' - 'A'] <= n/4 && freq['R' - 'A'] <=n/4
            ){

            ans = Math.min(ans, right - left + 1);
           char leftChar = s.charAt(left);
            freq[leftChar-'A']++;
            left++;

            }

        }

        return ans;
        
    }
}