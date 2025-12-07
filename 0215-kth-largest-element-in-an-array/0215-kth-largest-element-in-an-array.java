class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for(int num:nums){
            minHeap.add(num);

            // If heap size > k, remove the smallest
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }
                return minHeap.peek();

    }
}