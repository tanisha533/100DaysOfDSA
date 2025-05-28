//T.C. O(2*n*m)
//spae complexity is a problem and need optimisation- which is o(m)*o(n)
public class setmatrixZero {
        public static void setZeroes(int[][] matrix, int n, int m) {
            int col[]= new int [m];
            int row[]=new int[n];
            for(int i=0; i<n; i++){
                    for(int j=0;j<m; j++){
                        if(matrix[i][j]==0){
                            row[i]=1;
                            col[j]=1;
                        }
                }
            }
            for(int i=0; i<matrix.length; i++){
                for(int j=0; j<matrix[i].length; j++){
                    if (row[i] == 1 || col[j] == 1) {
                        matrix[i][j] = 0;
                }}
            }

            for(int i=0; i<matrix.length; i++){
                for(int j=0; j<matrix[i].length; j++){
                   System.out.print(matrix[i][j]+" ");
                }System.out.println();
            }
        }
        public static void main(String[] args) {
            int matrix[][]={{1,1,1},{1,0,1},{1,1,1}};
            setZeroes(matrix,3,3);

        }
    }

