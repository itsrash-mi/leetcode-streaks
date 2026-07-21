class Solution {
    public int countDigits(int num) {
        int copy=num;
        int count=0;
        while(num>0)
        {
            int r=num%10;
            if(copy%r==0)
            {count++;}
            num=num/10;
        }
        return count;
    }
}