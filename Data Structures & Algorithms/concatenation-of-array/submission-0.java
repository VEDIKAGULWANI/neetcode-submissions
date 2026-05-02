class Solution {
    public int[] getConcatenation(int[] nums) {
    int[] ans = new int[nums.length * 2];
    int i = 0;
    for(i = 0; i<nums.length;i++){
        ans[i] = nums[i];
    }
    for(int n = nums.length; i<ans.length;i++){
        ans[n] = nums[i];
    }
 
    return ans;
    }
}