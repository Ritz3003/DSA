class Solution {
    
    public boolean checkInclusion(String s1, String s2) {

       int left = 0;

       int missing = s1.length();

       int need[] = new int[128];

       for(int i = 0;i<s1.length();i++){
        char ch = s1.charAt(i);
        need[ch]++;
       }

       //System.out.println(Arrays.toString(need));

       for(int right = 0;right<s2.length();right++){
            
            char ch = s2.charAt(right);
            if(need[ch] > 0) missing--;
            need[ch]--;

           // System.out.println(Arrays.toString(need));

            

            while(left < s2.length() && missing ==0){
                //System.out.println(" windowSize "+ windowSize + left + right);
                int windowSize = right - left +1;
                if(windowSize == s1.length())
                return true;
               // else{
                    char leftChar = s2.charAt(left);
                    need[leftChar]++;
                    if(need[leftChar] > 0) {
                       
                        missing++;
                    }
                    left++;
                //}
            }


       }

       return false;
        
    }
}