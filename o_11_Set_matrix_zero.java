import java.util.Arrays;

public class o_11_Set_matrix_zero {
    public void setZeroes(int[][] matrix) {

        int[] col = new int[matrix.length];
        Arrays.fill(col,0);
        int[] row = new int[matrix[0].length];
        Arrays.fill(row,0);
        for(int i = 0; i<matrix.length;i++){
            for(int j =0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    row[j]=1;
                    col[i]=1;
                }
            }
        }
        for(int i = 0; i<matrix.length;i++){
            for(int j =0;j<matrix[0].length;j++){
                if(col[i] == 1 || row[j]==1){
                    matrix[i][j] = 0;
                }
            }
        }
        // System.out.println(Arrays.toString(row));
        // System.out.println(Arrays.toString(col));
        System.out.println(Arrays.deepToString(matrix));

    }
    public static void main(String[] args) {
        int[][] matrix = {{1,1,1,1},{1,0,1,1},{1,1,1,1}};
        o_11_Set_matrix_zero set = new o_11_Set_matrix_zero();
        set.setZeroes(matrix);
    }
}
