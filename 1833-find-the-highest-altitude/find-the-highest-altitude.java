class Solution {
    public int largestAltitude(int[] gain) {
        int dp[]=new int[gain.length+1];
        int ans=0;
        for(int i=1; i<dp.length; i++) 
        {
            dp[i]= gain[i-1]+ dp[i-1];
            ans= Math.max(ans, dp[i]);
        }
        return ans;
    }
}