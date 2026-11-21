class Solution {
    public int lengthOfLongestSubstring(String s) {
       int left = 0 , ans = 0;
       HashMap<Character,Integer> map = new HashMap<>();

       for(int right = 0;right<s.length();right++){
        char c = s.charAt(right);
          // include right 
          map.put(c, map.getOrDefault(c,0)+1);

          while(map.get(c)>1){
            
            char leftChar = s.charAt(left);
            map.put(leftChar,map.getOrDefault(leftChar,0)-1);

            if(map.get(leftChar) <= 0){
                map.remove(leftChar);
            }
            left++;

          }
             
          ans  = Math.max(ans, right - left +1);


       }

       return ans;

        
    }
}