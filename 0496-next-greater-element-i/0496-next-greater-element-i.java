class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
       int[] next = new int[nums2.length];
        Stack<Integer> s= new Stack<>();

        for(int i=nums2.length-1; i>=0; i--){
            while(!s.isEmpty() && s.peek() <= nums2[i]) {
                s.pop();
            }
            if(s.isEmpty()){
                next[i]=-1;
            }
            else{
                next[i]=s.peek();
            }
            s.push(nums2[i]);
        }
         Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums2.length; i++) {
            map.put(nums2[i], i);
        }

        // Final result nums1 ke order mein
        int[] result = new int[nums1.length];
        for(int i = 0; i < nums1.length; i++) {
            int idx = map.get(nums1[i]); // nums2 ka index
            result[i] = next[idx];
        }

        return result;
    }
}