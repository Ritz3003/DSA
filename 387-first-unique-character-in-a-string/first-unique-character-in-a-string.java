class Solution {
    public int firstUniqChar(String s) {

        int[] freq = new int[26];
        int uniqueIdx = -1;

        for(int i = 0; i<s.length();i++){

         char c = s.charAt(i);
         freq[c-'a']++;

        }

        for(int i = 0 ; i<s.length(); i++){
            char c = s.charAt(i);
            
            if(freq[c-'a'] == 1){

                uniqueIdx = i;
                break;

            }
        }

        return uniqueIdx;
        
    }
}