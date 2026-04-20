class Solution {
    public int[] findErrorNums(int[] nums) {
        
        Set<Integer> set=new HashSet<>();
        int d=-1; int sum=0;
        for(int i:nums){
            sum+=i;
            if(set.contains(i)){
                d=i;
            }
            set.add(i);
        }
        int n= nums.length;
        int real_sum=n*(n+1)/2;
        //sum = real_sum + d - b
        int b = d + (real_sum - sum);

         return new int[]{d,b};

    }
}