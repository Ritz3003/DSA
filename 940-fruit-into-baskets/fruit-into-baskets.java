class Solution {
    public int totalFruit(int[] fruits) {

        // single row of fruit left to right ==> array
        // array of integers --> trees are represented by array of fruits
        // as much possible maximum
        //contiguous 

        int left = 0 , ans = 0;
       HashMap<Integer,Integer> map = new HashMap<>();

       for(int right = 0;right<fruits.length;right++){
        map.put(fruits[right],map.getOrDefault(fruits[right],0)+1);

        while(map.size() > 2){
            int leftFruit = fruits[left];
            map.put(leftFruit,map.getOrDefault(leftFruit,0)-1);

            if(map.get(leftFruit) <= 0){
                map.remove(leftFruit);
            }
            left++;


            
        }

        ans = Math.max(ans,right-left+1);

        


     
        
    }

    return ans;
    }
}

