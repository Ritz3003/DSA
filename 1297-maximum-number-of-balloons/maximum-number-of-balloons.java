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

/**

### Concept: Company ki speed slowest worker par depend karti hai

- `balloon` banane ke liye `b, a, l, l, o, o, n` chahiye.
- Har character ka count nikaalenge ki available kitne hain.
- `l` aur `o` ko 2 baar chahiye, isliye unke count ko `2` se divide karenge.
- Har character kitne balloons bana sakta hai, woh calculate karenge.
- Jo character sabse kam balloons banane dega, wahi answer hoga.
- Isliye sabhi counts mein se minimum nikaalenge: `min(counts)`.

Yaad rakhna: Company ki speed slowest worker decide karta hai; waise hi maximum balloons sabse limited character decide karta hai.


 */