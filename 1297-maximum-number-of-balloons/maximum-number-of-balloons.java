class Solution {
    public int maxNumberOfBalloons(String text) {
         Map<Character,Integer> have = new HashMap<>();
      

         
       have.put('b',0);
       have.put('a',0);
       have.put('l',0);
       have.put('o',0);
       have.put('n',0);

         for(int i =0;i<text.length();i++){


           if(have.containsKey(text.charAt(i)))
            have.put(text.charAt(i) , have.getOrDefault(text.charAt(i),0)+1);
         }


          int res = Integer.MAX_VALUE;
       for(Map.Entry<Character, Integer> entry : have.entrySet()){
        char key = entry.getKey();
        int value = entry.getValue();

          if(key == 'l' || key == 'o'){
            value = value/2;
          }

          res = Math.min(res,value);


       }
            

    return res;



        
    }
}