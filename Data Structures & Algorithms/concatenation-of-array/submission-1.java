class Solution {
    public int[] getConcatenation(int[] nums) {
    int[] ans = new int[nums.length * 2];
    int i = 0;
    for(i = 0; i<nums.length;i++){
        ans[i] = nums[i];
    }
    i = 0;
    for(int n = nums.length; n<ans.length;n++){
        ans[n] = nums[i];
        i++;
    }
 
    return ans;
    }
}