class Solution {
    public int lengthOfLastWord(String s) {
        int count=0;
        s=s.trim();
        char[] w=s.toCharArray();
        int j=w.length-1;
        for(int i=j;i>=0;i--)
        {
            if(w[i]==' ')
            {break;}
            count++;
        }
        return count;
    }
}