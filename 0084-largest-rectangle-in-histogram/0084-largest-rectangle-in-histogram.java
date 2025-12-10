class Solution {
    public int largestRectangleArea(int[] heights) {
         Stack<Integer> stack = new Stack<>();
        int maxArea = 0;
        int n = heights.length;
        
        for (int i = 0; i < n; i++) {
            // While current bar is shorter than stack top
            // Pop and calculate area
            while (!stack.isEmpty() && heights[i] < heights[stack.peek()]) {
                int poppedIdx = stack.pop();
                int height = heights[poppedIdx];
                
                // Calculate width
                int width;
                if (stack.isEmpty()) {
                    // Can extend all the way to left
                    width = i;
                } else {
      // Left boundary is the element below in stack
                    width = i - stack.peek() - 1;
                }
                
                int area = height * width;
                maxArea = Math.max(maxArea, area);
            }
            
            stack.push(i);}
         // Process remaining bars in stack
        while (!stack.isEmpty()) {
            int poppedIdx = stack.pop();
            int height = heights[poppedIdx];
            
            int width;
            if (stack.isEmpty()) {
                width = n;  // Can extend to entire array
            } else {
                width = n - stack.peek() - 1;
            }
            
            int area = height * width;
            maxArea = Math.max(maxArea, area);
        }

        return maxArea;
    
}}