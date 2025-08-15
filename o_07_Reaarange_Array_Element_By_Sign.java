import java.util.*;
public class o_07_Reaarange_Array_Element_By_Sign{
     public int[] rearrangeArray(int[] nums) {
        int[] pos = new int[nums.length/2];
        int[] neg = new int[nums.length/2];
        int j=0,k=0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i]>0){
                pos[j]=nums[i];
                j++;
            }else{
                neg[k]=nums[i];
                k++;
            }
        }
        j=0;
        k=0;
        for(int i = 0;i<nums.length; i++){
            nums[i]=pos[j];
            i++;
            j++;
            nums[i] = neg[k];
            k++;
        }
        return nums;
    }
    public static void main(String[] args){
        int[] nums = {3,1,-2,-5,2,-4};
        o_07_Reaarange_Array_Element_By_Sign Rearr =new o_07_Reaarange_Array_Element_By_Sign();
        System.out.println(Arrays.toString(Rearr.rearrangeArray(nums)));
    }
}