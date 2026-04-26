class Solution {
    public int majorityElement(int[] nums) {
        int maj=nums.length/2;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int n:nums)
        {
            map.put(n,map.getOrDefault(n,0)+1);
        }
        for(int n:nums)
        {
            if(map.get(n)>maj)
            return n;
        }
        return 0;
    }
}