class Solution {
    public int maxArea(int[] height) {
        int maxw=0;
        int left=0, right=height.length-1;
        while(left<right){
            int width=right-left;
            int ht=Math.min(height[left],height[right]);
            maxw=Math.max(ht*width,maxw);
           if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxw;
    }
}