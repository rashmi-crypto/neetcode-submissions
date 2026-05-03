class Solution {
    public int removeDuplicates(int[] nums) {
        /*TreeSet<Integer> set=new TreeSet<>();
        for(int n:nums)
        {
            set.add(n);
        }
        int i=0;
        for(int n:set)
        {
            nums[i++]=n;
        }
        //Arrays.sort(nums);
        return set.size();*/
        int l=1;
        for(int r=1;r<nums.length;r++)
        {
            if(nums[r]!=nums[r-1])
            nums[l++]=nums[r];
        }
        return l;
    }
}