import java.util.ArrayList;
import java.util.List;

public class o_13_spiral_matrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length,n=matrix[0].length;
        List<Integer> lst = new ArrayList<>();
        int top=0, bottom = m-1, left = 0,right = n-1;
        while(left<=right && top<=bottom){
            for(int i = left; i<=right; i++){
                lst.add(matrix[top][i]);
            }
            top++;
            for(int i = top; i<=bottom; i++){
                lst.add(matrix[i][right]);
            }
            right--;
            if(top<=bottom){

                for(int i = right; i>=left; i--){
                    lst.add(matrix[bottom][i]);
                }
            bottom--;
            }
            if(left<=right){

                for(int i = bottom; i>=top; i--){
                    lst.add(matrix[i][left]);
                }
            left++;
            }
        }
        return lst;
    }

    public static void main(String[] args) {
        int[][] matrix= {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        o_13_spiral_matrix sm = new o_13_spiral_matrix();
        System.err.println(sm.spiralOrder(matrix));
    }
}
