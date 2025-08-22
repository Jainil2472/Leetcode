import java.util.Arrays;

public class o_15_Find_First_And_Last {
    public int[] searchRange(int[] nums, int target) {
        int[] out = {-1,-1};
        int count = 0, last = -1;
        for(int i = 0; i<nums.length; i++){
            if(nums[i]==target){
                count++;
                last = i;
            }
        }
        if(last == -1){
            out[0] = -1;
        }else{
            out[0] = last-count+1;
            out[1] = last;
        }

        return out;
    }

    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,8,8,8,8,8,8,8,10};
        int tar = 8;
        o_15_Find_First_And_Last firstLast = new o_15_Find_First_And_Last();
        System.out.println(Arrays.toString(firstLast.searchRange(nums, tar)));
    }
}
