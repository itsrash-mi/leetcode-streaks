class Solution {
    public int[] concatWithReverse(int[] nums) {
        int m=nums.length;
        int[] nums2=new int[nums.length];
        for(int i=0;i<m;i++)
        {
            nums2[i]=nums[i];
        }
        int n=nums2.length;
        int a=0;
        int b=nums2.length-1;
        while(a<b)
        {
            nums2[a]=nums2[a]^nums2[b];
            nums2[b]=nums2[a]^nums2[b];
            nums2[a]=nums2[a]^nums2[b];
            a++;
            b--;
        }
        int[] nums3=new int[m+n];
        int i=0;
        for(int x=0;x<m;x++)
        {
            nums3[i]=nums[x];
            i++;
        }
        for(int x=0;x<n;x++)
        {
            nums3[i]=nums2[x];
            i++;
        }
        return nums3;
    }
}