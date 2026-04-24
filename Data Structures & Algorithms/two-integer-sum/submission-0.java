class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int[] ans=new int[2];
        for(int i=0;i<nums.length;i++)
        {
            int compl=target-nums[i];
            if(map.containsKey(compl))
            {
                ans[1]=i;
                ans[0]=map.get(compl);
            }
            map.put(nums[i],i);
        }
        return ans;
    }
}
