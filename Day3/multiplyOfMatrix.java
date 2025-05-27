public class multiplyOfMatrix {
    
    public static void multiply_matrix(int a[][], int r1, int r2, int c1, int c2,int b[][]){
        if(c1!=r2){
            System.out.println("Wrong dimensions");
        }
        int mul[][]= new int[r1][c2];
        for(int i=0; i<r1; i++){
            for(int j=0; j<c2; j++){
                for(int k=0; k<c1; k++){
                    mul[i][j]+=a[i][k]*b[k][j];
                }
            }
        }
        for(int i=0; i<r1; i++){
            for(int j=0; j<c2; j++){
               System.out.print(mul[i][j]+" ");
            }System.out.println();
        }
    }
    public static void main(String[] args) {
        int a[][]={{1,2,3},{2,3,4}};
        int b[][]={{3,4},{5,6},{1,2}};
        int r1=2, c1=3, r2=3, c2=2;
        multiply_matrix(a, r1, r2, c1, c2, b);
    }
}
