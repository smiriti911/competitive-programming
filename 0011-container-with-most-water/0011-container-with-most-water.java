class Solution {
    public int maxArea(int[] height) {
      int n = height.length, l = 0, r = n-1, maxArea = 0;
        while(l < r) {
            maxArea = Math.max(maxArea, Math.min(height[l], height[r]) * (r-l));
            if(height[l] < height[r])
                l++;
            else
                r--;
        }
        return maxArea;
    }
}