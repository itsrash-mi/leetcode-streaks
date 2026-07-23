class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> h=new HashMap<>();
        int ans=0;
        int temp=0;
        for(int x:nums)
        {
            int count=h.getOrDefault(x,0);
            count++;
            h.put(x,count);
            if(h.get(x)>temp)
            {
                ans=x;
                temp=h.get(x);
            }
        }
        return ans;
    }
}