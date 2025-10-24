class Solution {
    public int[] topKFrequent(int[] nums, int k) {
           HashMap<Integer, Integer> freqMap = new HashMap<>();
        for (int n : nums) {
            freqMap.put(n, freqMap.getOrDefault(n, 0) + 1);
        }

        // Step 2: Create buckets (index = frequency)
        List<Integer>[] buckets = new List[nums.length + 1];
        for (int key : freqMap.keySet()) {
            int freq = freqMap.get(key);
            if (buckets[freq] == null) {
                buckets[freq] = new ArrayList<>();
            }
            buckets[freq].add(key);
        }

        // Step 3: Collect top K elements
        List<Integer> resultList = new ArrayList<>();
        for (int i = buckets.length - 1; i >= 0 && resultList.size() < k; i--) {
            if (buckets[i] != null) {
                resultList.addAll(buckets[i]);
            }
        }

        // Step 4: Convert to int[]
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = resultList.get(i);
        }

        return result;
    }
}