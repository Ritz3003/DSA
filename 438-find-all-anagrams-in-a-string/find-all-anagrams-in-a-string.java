class Solution {
    public List<Integer> findAnagrams(String s, String p) {
     List<Integer> list = new ArrayList<>();
     int left = 0;
     int missing = p.length();
     int need[] = new int[128];


     for(int i = 0; i<p.length();i++){
        char ch = p.charAt(i);
        need[ch]++;
     }
      
      for(int right = 0; right <s.length(); right++ ){
       char ch = s.charAt(right);
        System.out.println(ch);
       if(need[ch] > 0) {
        missing--;
         System.out.println("missing " + missing);
        }
       need[ch]--;
      // System.out.println(missing);

       while(missing == 0){
           System.out.println("in while loop " + left +" "  + right);
        if(right-left+1 == p.length()){
           
            list.add(left);
           
        }
       
            char leftChar = s.charAt(left);
            need[leftChar]++;
            if(need[leftChar] > 0){
                missing++;
            }
            left++;
       


       }


      }

      return list;
        
    }
}