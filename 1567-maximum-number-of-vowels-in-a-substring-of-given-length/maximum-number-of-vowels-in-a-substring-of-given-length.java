class Solution {
    public static boolean checkVowel(char c){
        if(c == 'a' || c == 'e' || c =='i' || c =='o' || c =='u'){
            return true;
        }
        return false;
    }
    public int maxVowels(String s, int k) {
        // substring 
        // maximum
        //given length fixed size sliding window

        int left = 0, count = 0, best = 0;

        for(int right = 0;right<s.length();right++){
            char c = s.charAt(right);
            count += checkVowel(c)? 1 : 0;

            if(right - left + 1 == k){
                best = Math.max(best,count);
                char leftChar = s.charAt(left);
                count -= checkVowel(leftChar) ? 1 : 0;
                left++;
            }
        }
return best;
        
    }
}