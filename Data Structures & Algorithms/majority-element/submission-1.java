class Solution {
    public int majorityElement(int[] nums) {
        int maj=nums.length/2;
        //HashMap<Integer,Integer> map=new HashMap<>();
        Arrays.sort(nums);
        return nums[maj];
    }
}