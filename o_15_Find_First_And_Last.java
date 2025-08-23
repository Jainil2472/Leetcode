import java.util.Arrays;

public class o_15_Find_First_And_Last {
    public int[] searchRange(int[] nums, int target) {
        int[] out = {-1,-1};
         int mid, start = 0, end = nums.length-1;
        while(start <= end){
            mid = (start+end)/2;
            if(nums[mid] == target){
                int i=mid, j=mid;
                while (nums[i] == target || nums[j] == target) {
                    System.out.println(i + " " + j);
                    
                    
                    if(nums[i] == target){
                        out[0]=i;
                        i--;
                    }
                    if(nums[j] == target){
                        out[1]=j;
                        j++;
                    }
                    
                    
                   
                }
                return out;
            }
            if(target<nums[mid]){
                end = mid-1;
            }else{
                start = mid+1;
            }
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
