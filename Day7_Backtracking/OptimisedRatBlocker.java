//before space complexity due to isVisited is reaching to O(n*2) so we need optimised wayy

public class OptimisedRatBlocker {
    public static void main(String[] args) {
        int rows=3;
        int cols=3;
        int maze[][]={{1,0,1},
                      {0,1,1},
                      {1,1,0}};

     
        printUnblockerPath(0,0,rows-1,cols-1,"",maze);
    }

    public static void printUnblockerPath(int sr, int sc, int er, int ec,String s,int [][]maze){
        if(sr<0 || sc<0) return;  
        if(sr>er || sc>ec) return;

        if(sr==er && sc==ec) 
        {
            System.out.println(s);  
            return;
        }

        if(maze[sr][sc]==0) return;  //blocked

        // Agar cell pehle hi visit ho chuka hai (loop avoid karne ke liye)
        if(maze[sr][sc]==-1) return;  //this cell is already visited


        // Current cell ko visit mark kar diya
        maze[sr][sc]=-1;  //check


        
        printUnblockerPath(sr+1, sc, er, ec, s+"R",maze);

     
        printUnblockerPath(sr, sc+1, er, ec, s+"D",maze);


        printUnblockerPath(sr, sc-1, er, ec, s+"L",maze);

        
        printUnblockerPath(sr-1, sc, er, ec, s+"U",maze);

        // Backtracking step: taaki doosre paths ke liye same cell dobara use ho sake
       maze[sr][sc]=1;
    }
}
