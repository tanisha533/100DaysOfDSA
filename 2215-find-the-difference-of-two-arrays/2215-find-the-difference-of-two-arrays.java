class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
         Set<Integer> set1 = new HashSet<>();
         Set<Integer> set2 = new HashSet<>();
        
        for (int n : nums1) set1.add(n);
       for (int n : nums2) set2.add(n);
    
    // Find elements unique to nums1 (not in set2)
    List<Integer> list1 = new ArrayList<>();
    for (int n : set1) {
        if (!set2.contains(n)) list1.add(n);
    }
    
    // Find elements unique to nums2 (not in set1)
    List<Integer> list2 = new ArrayList<>();
    for (int n : set2) {
        if (!set1.contains(n)) list2.add(n);
    }
    
    return Arrays.asList(list1, list2);
}}