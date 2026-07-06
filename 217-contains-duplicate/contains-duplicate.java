class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> h = new HashMap<>();
        for(int x:nums)
        {
            int count=h.getOrDefault(x,0);
            count++;
            h.put(x,count);
        }
        for(int x:h.keySet())
        {
            if(h.get(x)>1)
            {
                return true;
            }
        }
        return false;
    }
}