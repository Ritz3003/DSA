class Solution {
    public boolean checkInclusion(String s1, String s2) {

        int[]  freq = new int[26];
        int left = 0;

        // fill fre array
        for(int i = 0;i<s1.length();i++){
            freq[s1.charAt(i)-97]++;
        }

        for(int r = 0;r<s2.length();r++){
            freq[s2.charAt(r)-'a']--;

            while(freq[s2.charAt(r)-'a']<0){
                freq[s2.charAt(left)-'a']++;
                left++;
            }

            if(r-left+1 == s1.length()){
                return true;
            }
        }

        return false;
    }
}