class Solution {
    public int[] twoSum(int[] numbers, int target) {
        Arrays.sort(numbers);
        int[] ans=new int[2];
        int l=0;
        int r=numbers.length-1;
        while(l<r)
        {
            if(numbers[l]+numbers[r]>target)
            r--;
            else if(numbers[l]+numbers[r]<target)
            l++;
            else 
            {
                ans[0]=l+1;
                ans[1]=r+1;
                return ans;
            }
        }
        ans[0]=-1;
        ans[1]=-1;
        return ans;
    }
}
