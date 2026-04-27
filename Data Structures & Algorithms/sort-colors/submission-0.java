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
        int i=0,j,k;
        while(i<zero)
        {
            nums[i]=0;
            i++;
        }
        j=i;
        while(j<(one+zero))
        {
            nums[j]=1;
            j++;
        }
        k=j;
        while(k<nums.length)
        {
            nums[k]=2;
            k++;
        }
    }
}