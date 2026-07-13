class Solution {
    public boolean isPowerOfTwo(int n) {
        double ans;
        ans=n;
        while (ans>1)
        {
            ans=ans/2;
        }  
        if(ans==1)
        {
            return true;
        }
        return false;
    }
}