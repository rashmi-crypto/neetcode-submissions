class Solution {
    public int[] sortArray(int[] nums) {
        mergeSort(nums,0,nums.length-1);
        return nums;
    }
    public static void mergeSort(int[] nums,int lb,int ub)
    {
        if(lb<ub)
        {
            int m=lb+(ub-lb)/2;
            mergeSort(nums,lb,m);
            mergeSort(nums,m+1,ub);
            merge(nums,lb,m,ub);
        }
    }
    public static void merge(int[] nums,int lb,int m,int ub)
    {
        int n1=m-lb+1;
        int n2=ub-m;
        int L[]=new int[n1];
        int R[]=new int[n2];
        for (int i = 0; i < n1; ++i)
            L[i] = nums[lb + i];
        for (int j = 0; j < n2; ++j)
            R[j] = nums[m + 1 + j];
        int i=0;
        int j=0;
        int k=lb;
        while(i<n1 && j<n2)
        {
            if(L[i]<R[j])
            {
                nums[k]=L[i];
                i++;
            }
            else
            {
                nums[k]=R[j];
                j++;
            }
            k++;
        }
        while(i<n1)
        {
            nums[k]=L[i];
            i++;
            k++;
        }
        while(j<n2)
        {
            nums[k]=R[j];
            j++;
            k++;
        }
    }
}