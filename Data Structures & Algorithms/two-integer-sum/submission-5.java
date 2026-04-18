class Solution {
    public int[] twoSum(int[] numbers, int target) {
     int i = 0;
     int j = numbers.length - 1;
     int result = 0;
    
    while(i<j) { 
      result = numbers[i] + numbers[j];
        if(result == target){
            int[] see = {i  , j };
             return see;
             }
     
            if (numbers[i] + numbers[j] < target) {
                i++;
                 
            } else {
                j--;
                 
            }
         
     }
    int[] empty = { };
     return empty;
 }
}