import java.util.Arrays;

public class o_09_next_permutation {
     public void nextPermutation(int[] nums) {
        int pivit = -1;
        for(int j = nums.length -1 ; j>0; j--){
           
            if(nums[j] > nums[j-1]){
                pivit = j-1;
            for(int i = nums.length-1; i>pivit ; i-- ){
            if(nums[pivit] < nums[i]){
                int temp = nums[pivit];
                nums[pivit] = nums[i];
                nums[i]=temp;
                break;
            }
        }
                break;
            } 
        }
        
        int j= nums.length-1;
        if(pivit == -1){
            for(int i = 0; i<j ;i++){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j]=temp;
            j--; 
        }
        }else{

            for(int i = pivit+1; i<j ;i++){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j]=temp;
                j--; 
            }
        }
        System.out.print(Arrays.toString(nums));
    }

    public static void main(String[] args) {
        int[] nums = {1,2,9,8,7,6,5,4,3};
        o_09_next_permutation np = new o_09_next_permutation();
        
        np.nextPermutation(nums);
    }
    
}
