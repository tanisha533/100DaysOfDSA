class Solution {
    public long maxMatrixSum(int[][] nums) {
        int n=nums.length, count=0; 
        long sum=0; 
        long sn=Long.MAX_VALUE;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
             long absVal = Math.abs((long) nums[i][j]);
              sum+=absVal;
              if(nums[i][j]<0) count++;
              sn=Math.min(Math.abs(nums[i][j]),sn);

        }
        }
return (count % 2 == 0) ? sum : sum - 2 * sn; 

    }
}