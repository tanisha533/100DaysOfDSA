class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int sum_cost=0, sum_gas=0;
        for(int i=0; i<gas.length; i++){
              sum_cost+=cost[i];
              sum_gas+=gas[i];
        }
        if(sum_cost>sum_gas) return -1;
        int si=0, remain_gas=0;
        for(int i=0; i<gas.length; i++){
           
            remain_gas+=gas[i]-cost[i];
            
            if(remain_gas<0){
                si=i+1;
                remain_gas=0;
            }
        }
        return si;
    }
}