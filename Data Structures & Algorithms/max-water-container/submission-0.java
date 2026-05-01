class Solution {
    public int maxArea(int[] heights) {
        int maxWater=0;
        int l=0;
        int r=heights.length-1;
        while(l<r)
        {
            int area=(r-l)*Math.min(heights[l],heights[r]);
            maxWater=Math.max(maxWater,area);
            if(heights[l]<=heights[r])
            l++;
            else
            r--;
        }
        return maxWater;
    }
}
