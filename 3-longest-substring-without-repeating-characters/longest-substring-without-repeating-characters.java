class Solution {
    public int lengthOfLongestSubstring(String s) {

       HashSet<Character> set = new HashSet<>();
       int max = 0, cnt = 0;
       int left = 0;

       for(int i = 0 ;i <s.length();i++){

        char c = s.charAt(i);

               while(set.contains(c)){
                set.remove(s.charAt(left));
                left++;
                cnt--;
               }
               set.add(s.charAt(i));
               cnt++;
               max = Math.max(cnt,max);

       }

       return max;
        
    }
}