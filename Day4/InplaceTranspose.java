//works only on sqaure matrix
public class InplaceTranspose {
    public static void transposeOfMatrix(int matrix[][], int r1, int c1){
        for(int i=0; i<c1; i++){  //column isiliye kyuki transpose wale 2d array par traverse kar rhe hai usme row columns me change hogi after transpose
            for(int j=i; j<r1; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    for(int i=0; i<c1; i++){
        for(int j=0; j<r1; j++){
           System.out.print(matrix[i][j]+" ");
        }System.out.println();
    }

 }

    
    public static void main(String[] args) {
        int a[][]={{1,2,3},{2,3,4},{2,7,8}};
        int r1=3; int c1= 3;
        transposeOfMatrix(a, r1, c1); 
    }

}
