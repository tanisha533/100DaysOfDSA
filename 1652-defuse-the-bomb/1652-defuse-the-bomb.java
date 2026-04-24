class Solution {
    public int[] decrypt(int[] code, int k) {
        int arr[]=new int[code.length];
        for(int i=0; i<code.length; i++){
        int sum=0;
        
        if(k>0){
            for(int j=1; j<=k; j++){
            int idx=(i+j)%code.length;
            sum+=code[idx];
            }
        arr[i]=sum;
    }
        else if(k<0){
          for(int j=1; j<=-k; j++){
             int idx=(i-j+code.length)%code.length;
             sum+=code[idx];
            }
        arr[i]=sum;  
        }
        else{
            arr[i]=0;
        }}
     return arr;
    }
}