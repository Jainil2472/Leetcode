public class o_16_search_in_rotated_sorted_array {
    public int search(int[] nums, int target) {
        int mid,first = 0,last=nums.length -1;
        while(first<=last){
            mid = (first+last)/2;
            if(nums[mid] == target){
                return mid;
            }
            if(nums[mid]>=nums[first]){
                if(target >= nums[first] && target <= nums[mid]){
                    last=mid-1;
                }else{
                    first = mid+1;
                }
            }else{
                if(target >= nums[mid] && target <= nums[last]){
                    first = mid+1;
                }else{
                    last=mid-1;
                   
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
        int target = 0;
        o_16_search_in_rotated_sorted_array sI = new o_16_search_in_rotated_sorted_array();
        System.out.println(sI.search(nums, target));
    }
    
}
