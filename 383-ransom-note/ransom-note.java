class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {

        int[] freq = new int[26];
        boolean isPossible = false;

        for(int i = 0 ;i < magazine.length();i++){
            char c = magazine.charAt(i);
            freq[c-'a']++;
        }

         for(int i = 0 ;i < ransomNote.length();i++){
            char c = ransomNote.charAt(i);
            if(freq[c-'a'] <= 0){
                return false;
            }else{
                freq[c-'a']--;
            }
        }
        
        return true;
    }
}