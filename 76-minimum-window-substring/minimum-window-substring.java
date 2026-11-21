class Solution {
    public String minWindow(String s, String t) {

        int left = 0 , bestStart = 0, bestLen =Integer.MAX_VALUE;
        int missing = t.length();
        int need[] = new int[128];

        for(int i = 0;i<t.length();i++){
            char ch = t.charAt(i);
            need[ch]++;
        }

        for(int right = 0; right < s.length(); right++){
            //include right
            char ch = s.charAt(right);
            if(need[ch] > 0) missing--;
            need[ch]--;

            while(missing == 0){

                if(bestLen > right - left + 1){
                    bestLen = right - left + 1;
                    bestStart = left;
                }

                char leftChar = s.charAt(left);
                need[leftChar]++;
                if(need[leftChar] > 0) missing++;

                left++;
            }
        }

        return bestLen == Integer.MAX_VALUE ? "" : s.substring(bestStart,bestLen + bestStart);
        
    }
}