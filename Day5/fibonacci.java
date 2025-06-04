public class fibonacci {
    public static int series(int n){
        if(n==0 || n==1) return 1;
        int ans=series(n-1)+series(n-2);
        return ans;

    }
    public static void main(String[] args) {
        System.out.println(series(5));
    }
}
