class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int n=image.length;
        int m=image[0].length;
        boolean visit[][]=new boolean[n][m];
         int k=image[sr][sc];
         dfs(image,sr,sc,color,visit,k);
           
        return image;
    }
     public void dfs(int[][] image, int sr, int sc, int color,boolean visit[][],int k) {
        int n=image.length;
        int m=image[0].length;
        if(sr<0 || sc<0 || sc>=m || sr>=n) return;

        if(image[sr][sc]!=k || visit[sr][sc]) return;

        visit[sr][sc]=true;
        if(image[sr][sc]!=color){
              image[sr][sc]=color;  }

        dfs(image,sr+1,sc,color,visit,k);
        dfs(image,sr-1,sc,color,visit,k);
        dfs(image,sr,sc+1,color,visit,k);
        dfs(image,sr,sc-1,color,visit,k);
}}