public class RatInMazeRecursionpath {
    public static void main(String[] args) {
        int rows=3;
        int cols=3;
        printpath(1,1,rows,cols,"");
    }
    public static void printpath(int sr, int sc, int er, int ec, String s){
        if(sr>er || sc>ec) return ;
        if(sr==er && sc==ec) 
        {
          System.out.println(s);
          return;
        }
        //go right
        printpath(sr+1, sc, er, ec, s+"R");
        //go down
        printpath(sr, sc+1, er, ec, s+"D");
    }
}
