public class additionofMatrix {
    
     public static void add_matrix(int a[][], int r1, int r2, int c1, int c2,int b[][]){
        if(r1!=r2 || c1!=c2){
            System.out.println("Wrong dimensions");
        }
        int sum[][]= new int[r1][c1];
        for(int i=0; i<sum.length; i++){
            for(int j=0; j<c1; j++){
               sum[i][j]=a[i][j]+b[i][j];
            }
        }
        for(int i=0; i<sum.length; i++){
            for(int j=0; j<c1; j++){
               System.out.print(sum[i][j]+" ");
            }System.out.println();
        }
     }
     public static void main(String[] args) {
        int a[][]={{1,2,3},{2,3,4}};
        int b[][]={{3,4,5},{4,5,6}};
        int r1=2, c1=3, r2=2, c2=3;
        add_matrix(a, r1, r2, c1, c2, b);
        
     }

}
