class Solution {
    public int minDeletion(int[] nums) {
        
        List<Integer> list = new ArrayList<>();
        for (int num : nums) {
            if (list.size() % 2 == 0) {
                list.add(num);
            } else if (list.get(list.size() - 1) != num) {
                list.add(num);
            }
        }
        if (list.size() % 2 != 0) {
            list.remove(list.size() - 1);
        }
        return nums.length - list.size();
    
    }
}