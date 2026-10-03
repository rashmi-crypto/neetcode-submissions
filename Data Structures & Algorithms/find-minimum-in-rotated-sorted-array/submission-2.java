class Solution {
    public int findMin(int[] nums) {
        int lb=0;
        int ub=nums.length-1;
        //int ans=nums[0];
        while(lb<ub)
        {
            int mid=(lb+ub)/2;
            //ans=Math.min(ans,nums[mid]);
            if(nums[mid]<nums[ub])
            ub=mid;
            else
            lb=mid+1;
        }
        return nums[lb];
    }
}
