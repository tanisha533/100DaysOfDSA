class Solution {
    public int findCircleNum(int[][] isConnected) {
        List<List<Integer>> graph = new ArrayList<>();
        for(int i=0; i<isConnected.length; i++){
            graph.add(new ArrayList<>()); 
}        
     for (int i = 0; i<isConnected.length; i++) {
    for (int j = 0; j<isConnected[i].length; j++) {
        if (isConnected[i][j] == 1) {
            graph.get(i).add(j);
        }
    }}
    boolean visit[]=new boolean[graph.size()];
    int provinces=0;
    for(int i=0; i<graph.size(); i++){
        if(!visit[i]){
            provinces++;
            dfs(graph,i,visit);
        }
    }
    return provinces;
}
    public void dfs( List<List<Integer>> graph, int curr,boolean visit[]){
    visit[curr]=true;
    for(int neighbor : graph.get(curr)){
        if(!visit[neighbor]){
          dfs(graph,neighbor,visit);}
    }
     }
}