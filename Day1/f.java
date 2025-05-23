public class f{
    // public static int sumrange(int l, int r, int arr[]){
    //     int sum=0;
    //     for(int i=l-1; i<r; i++){
    //         sum+=arr[i];
    //     }return sum;
    // }- brute force approach in n number of queries like l and r give changing


    //coming to optimised way for n number of queries-
    public static int[] makePrefixSum(int arr[]) {
        int n = arr.length;
        int[] prefixSum = new int[n];
        prefixSum[0] = arr[0];
        for (int i = 1; i < n; i++) {
            prefixSum[i] = prefixSum[i - 1] + arr[i];
        }
        return prefixSum;
    }

    // Step 2: Query function using the precomputed prefix sum array
    public static int prefixRangeSum(int l, int r, int[] prefixSum) {
        if (l == 0) return prefixSum[r];         // handle range starting at 0
        return prefixSum[r] - prefixSum[l - 1];  // inclusive range sum [l, r]
    }
    public static void main(String[] args) {
        int arr[]={1,5,6,7,8,4};
        int[] prefixSum = makePrefixSum(arr);
        int l = 2;
        int r = 4;
        System.out.println(prefixRangeSum(l, r, prefixSum)); 
    }
}