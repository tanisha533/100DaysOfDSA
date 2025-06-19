// Rat in a Maze Problem with Blockers
// Hum ek maze (3x3 grid) ke andar rat ko (0,0) se (end) (2,2) tak pahuchana chahte hain
// Lekin kuch jagah blocked hai jahan 0 diya gaya hai (wahaan se nahi ja sakte)
// 1 ka matlab path hai, wahan se rat ja sakta hai
// Humein saare possible raste print karne hain jo (0,0) se (2,2) tak pahuch sakte hain
// Rat 4 directions me move kar sakta hai: Right (R), Down (D), Left (L), Up (U)
//Here space complexity due to isVisited is reaching to O(n*2) so we need optimised wayy
public class RatMazeBlocker {
    public static void main(String[] args) {
        int rows=3;
        int cols=3;

        // Maze define kiya: 1 means path allowed, 0 means blocked
        int maze[][]={{1,0,1},
                      {0,1,1},
                      {1,1,0}};

        // Ek visited array banaya jo track karega ki koi cell pehle visit hua ya nahi
        boolean [][] isVisited=new boolean [rows][cols];

        // Function call kiya to find all possible paths from (0,0) to (2,2)
        printUnblockerPath(0,0,rows-1,cols-1,"",maze,isVisited);
    }

    // Ye recursive function hai jo possible path find karta hai
    public static void printUnblockerPath(int sr, int sc, int er, int ec,String s,int [][]maze, boolean isVisited[][]){
        // Agar start row ya col grid ke bahar chali gayi ho toh return
        if(sr<0 || sc<0) return;  

        // Agar start row ya col grid ke end se badh gayi toh return
        if(sr>er || sc>ec) return;

        // Agar destination mil gaya toh path print karo
        if(sr==er && sc==ec) 
        {
            System.out.println(s);  // Valid path mil gaya, print karo
            return;
        }

        // Agar maze cell blocked hai (0), toh return
        if(maze[sr][sc]==0) return; 

        // Agar cell pehle hi visit ho chuka hai (loop avoid karne ke liye)
        if(isVisited[sr][sc]==true) return;

        // Current cell ko visit mark kar diya
        isVisited[sr][sc]=true;


        // Right move (row + 1)
        printUnblockerPath(sr+1, sc, er, ec, s+"R",maze,isVisited);

        // Down move (col + 1)
        printUnblockerPath(sr, sc+1, er, ec, s+"D",maze,isVisited);

        // Left move (col - 1)
        printUnblockerPath(sr, sc-1, er, ec, s+"L",maze,isVisited);

        // Up move (row - 1)
        printUnblockerPath(sr-1, sc, er, ec, s+"U",maze, isVisited);

        // Backtracking step: taaki doosre paths ke liye same cell dobara use ho sake
        isVisited[sr][sc]=false;
    }
}
