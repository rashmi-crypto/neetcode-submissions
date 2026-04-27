class Solution {
    public void sortColors(int[] nums) {
        int one=0;
        int zero=0;
        int two=0;
        for(int n:nums)
        {
            if(n==0)
            zero++;
            else if(n==1)
            one++;
            else
            two++;
        }
        int i=0;
        while(i<zero)
        {
            nums[i]=0;
            i++;
        }
        while(i<(one+zero))
        {
            nums[i]=1;
            i++;
        }
        while(i<nums.length)
        {
            nums[i]=2;
            i++;
        }
    }
}