class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count=0;
        int freq=0;
        for(int x:nums)
        {
            if(x==1)
            {
                count++;
                freq=(freq>count) ? freq : count;
            }
            else 
            { 
                count=0; 
            }
        }
        return freq;
    }
}