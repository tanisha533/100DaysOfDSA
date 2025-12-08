class Solution {
    public int[] topKFrequent(int[] nums, int k) {
         HashMap<Integer, Integer> freqMap = new HashMap<>();
        for (int n : nums) {
            freqMap.put(n, freqMap.getOrDefault(n, 0) + 1);
        }

        // Max Heap sorting by frequency value descending
        PriorityQueue<Map.Entry<Integer, Integer>> maxHeap =
      new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());

        maxHeap.addAll(freqMap.entrySet());

        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = maxHeap.poll().getKey();
        }

        return result;
        
    }
}