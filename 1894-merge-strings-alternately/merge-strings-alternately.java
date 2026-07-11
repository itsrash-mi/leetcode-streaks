class Solution {
    public String mergeAlternately(String word1, String word2) {
        char[] a=word1.toCharArray();
        char[] b=word2.toCharArray();
        String ans="";
        int n=(a.length<b.length)?a.length:b.length;
        int i;
        for(i=0;i<=n-1;i++)
        {
            ans=ans+a[i]+b[i];
        }
        i=n;
        while(i<=a.length-1)
        {
            ans=ans+a[i];
            i++;
        }
        i=n;
        while(i<=b.length-1)
        {
            ans=ans+b[i];
            i++;
        }
        return ans;
    }
}