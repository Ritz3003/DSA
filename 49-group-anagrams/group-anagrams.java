class Solution {
    public boolean isAnagram(String s1, String s2){
        if(s1.length() != s2.length()){
            return false;
        }
        s1 = s1.toLowerCase();
    s2 = s2.toLowerCase();
        int[] freq = new int[26];

        for(int i = 0;i<s1.length();i++){
            char c = s1.charAt(i);
         freq[c-'a']++;
            char c_ = s2.charAt(i);
           // freq[c - 'a']++;
            freq[c_ - 'a']--;
        }
        for(int i = 0;i<26;i++){
            if(freq[i] > 0) return false;
        }
        return true;
    }
    public List<List<String>> groupAnagrams(String[] strs) {

        List<List<String>> ans = new ArrayList<>();

        for(int i = 0 ;i<strs.length;i++){
           // System.out.println(Arrays.toString(strs));
            if(strs[i]=="X"){
                continue;
            }
            List<String> l1 = new ArrayList<>();
            l1.add(strs[i]);
           for(int j = i+1;j<strs.length;j++){

            if(isAnagram(strs[i] , strs[j])&& strs[j] != "X"){
                l1.add(strs[j]);
                strs[j] = "X";
            }


           }
           strs[i] = "X";
         
           ans.add(l1);
           //System.out.println("L1  "  +  l1 + " ans " + ans);


        }


        //ans.sort((a, b) -> Integer.compare(a.size(), b.size()));
        return ans;

        
    }
}