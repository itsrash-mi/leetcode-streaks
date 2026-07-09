class Solution {
    public int maxFreqSum(String s) {
        char[] a=s.toCharArray();
        HashMap<Character,Integer> h =new HashMap<>();
        int count=0;
        int mv=0;
        int mc=0;
        for(char x:a)
        {
            if (!h.containsKey(x)) 
            {
                h.put(x, 1);
            } else 
            {
                h.put(x, h.get(x) + 1);
            }
            count=h.get(x);
            if (x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u') 
            {
                mv = (count>mv)?count:mv;
            }
            else{
                mc = (count>mc)?count:mc;
            }
        }
        return mv+mc;
    }
}