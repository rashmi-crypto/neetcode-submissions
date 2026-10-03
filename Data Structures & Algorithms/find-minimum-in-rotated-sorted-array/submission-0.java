class Solution {
    public int findMin(int[] nums) {
        int lb=0;
        int ub=nums.length-1;
        int ans=nums[0];
        while(lb<=ub)
        {
            if(nums[lb]<nums[ub])
            ans=Math.min(ans,nums[lb]);
            int mid=(lb+ub)/2;
            ans=Math.min(ans,nums[mid]);
            if(nums[lb]<=nums[mid])
            lb=mid+1;
            else
            ub=mid-1;
        }
        return ans;
    }
}
