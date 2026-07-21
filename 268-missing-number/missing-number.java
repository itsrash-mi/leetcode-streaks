class Solution {
    public int missingNumber(int[] nums) {
        int ans=nums.length;
        for(int i=0;i<=nums.length-1;i++)
        {
            ans=ans^i^nums[i];
        }
        return ans;
    }
}