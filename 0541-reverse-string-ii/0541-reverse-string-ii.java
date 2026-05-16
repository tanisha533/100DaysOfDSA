class Solution {
    public String reverseStr(String s, int k) {
        int fst=0;
        int sc=0;
        char[] arr=s.toCharArray();
        for(int i=0; i<s.length(); i+=2*k){
          fst=i;
          sc=Math.min(i + k - 1, arr.length - 1);

          while(fst < sc){
            swap(fst,sc,arr);
            fst++; sc--;
          }
        }
        
        return new String(arr);
    }
    static void swap(int i, int j, char[] arr){
            char temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
}