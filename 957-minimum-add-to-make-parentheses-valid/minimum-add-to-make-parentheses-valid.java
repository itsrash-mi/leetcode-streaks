class Solution {
    public int minAddToMakeValid(String s) {
        int count=0;
        int ans=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='(')
            {
                count++;
            }
            else if(s.charAt(i)==')')
            {
                if(count==0)
                {
                    ans++;
                }
                else
                {
                    count--;
                }
            }
        }
        ans=ans+count;
        return ans;
    }
}