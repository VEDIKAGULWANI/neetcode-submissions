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
        for (int k = 0; k < numbers.length; k++) {
            if (numbers[i] + numbers[j] < target) {
                i++;
                break;
            } else {
                j--;
                break;
            }
        }
     }
    int[] empty = { };
     return empty;
 }
}