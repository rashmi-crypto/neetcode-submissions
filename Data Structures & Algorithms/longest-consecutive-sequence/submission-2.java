class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        if(nums.length==0)
        return 0;
        for(int n:nums)
        {
            set.add(n);
        }
        int max=0;
        for(int n:set)
        {
            if(!set.contains(n-1)) {
                int currentNum = n;
                int c = 1;
                while(set.contains(currentNum + 1)) {
                    currentNum++;
                    c++;
                }
                max = Math.max(max, c);
            }
        }
        return max;
    }
}