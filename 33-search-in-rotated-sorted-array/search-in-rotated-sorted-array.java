//find peak() idx
// then decide if(target > nums[0])  meaning first part 0 .... peak else second part 
// if arr[1,2,3,4,5] sorted then always second part 
// depending upon the low and high apply bs 
// 2 pass binary search
class Solution {
    public int search(int[] nums, int target) {

        int low = 0, high = nums.length -1;
       

        while(low <= high){

            System.out.println("low " + low + " high " + high);

            int guess = (low + high )/2;

            if(nums[guess] == target) return guess;

            // guess part 1

            if(nums[guess] >= nums[0]){

                if(nums[guess] < target){
                    // koi point nai hai left me jaane ka
                    // right me jaao
                    low = guess + 1;
                }else{
                    // nums[guess] bda target say
                    // 4,5,6,7,0,1,2
                    // let say target 5 hai ur guess 7 hua h 
                    // hum decide nai kr skte kis side move kre kyuki 7 se km done 
                    // side hai 
                    // toh ab hum target ka pta krenge ki wo kis part me hai agar part 1 
                    // me hua toh guess ko left me jaane bolenge nai toh right 
                    if(target>=nums[0]) high = guess - 1;
                    else low = guess + 1;


                }

            }
            // guess part 2
            else{
                System.out.println("I m in part 2");
               // [4,5,6,7,0,1,2,3] // target 1 , guess 2
                if(target < nums[guess]){
                    // 2 ke right me sab bade hai target nai milega so move left
                    high = guess - 1;

                }else{
                    System.out.println("I m in part 2 else");
                    // target 2 guess 1
                    // hume nai pta ki kidhar gauranteed move kre guess ke dono side bade values hai 
                    // tab hume target kis part me hai ye pta krna hoga agar part 2 hua toh
                    //guess+1 se n -1 
                    //else guess - 1 se 0
                    if(target <= nums[nums.length-1]){ // part 2

                    System.out.println("I m in part 2 else if");

                    low = guess + 1;

                    }else{

                    high = guess - 1;
                    System.out.println("I m in part 2 else else");
                    }


                }

            }



        }

        return -1;
        
    }
}