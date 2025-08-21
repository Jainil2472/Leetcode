import java.util.Arrays;

public class o_12_Rotate_img {

    public void rotate(int[][] matrix) {
        int k = 0;
        int[] arr = new int[matrix.length*matrix.length];
        for(int i = 0; i<matrix.length;i++){    
            for(int j=0; j<matrix.length;j++){
                arr[k]=matrix[i][j];
                // System.out.println(matrix[i][j]);
                k++;
            }
        }
        int index = matrix.length-1;
        // System.out.println(Arrays.toString(arr));
        k = 0;
        for(int i = 0; i<matrix.length;i++){
            for(int j=0; j<matrix.length;j++){
                matrix[j][index] = arr[k];
                k++;
            }
            index--;
        }
        System.out.println(Arrays.deepToString(matrix));
    }

    public static void main(String[] args) {
        int[][] matrix = {{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};
        o_12_Rotate_img rot = new o_12_Rotate_img();
        rot.rotate(matrix);

    }
}