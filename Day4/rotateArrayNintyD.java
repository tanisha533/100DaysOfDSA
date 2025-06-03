public class rotateArrayNintyD {
    public static void rotateNintyD(int matrix[][], int r1, int c1){
        int transpose[][]= new int[c1][r1];
        for(int i=0; i<c1; i++){  //column isiliye kyuki transpose wale 2d array par traverse kar rhe hai usme row columns me change hogi after transpose
            for(int j=0; j<r1; j++){
              transpose[i][j]=matrix[j][i];
            }
        }
//         for(int i=0; i<; i++){
// reversearr()            
            }
        }
    
