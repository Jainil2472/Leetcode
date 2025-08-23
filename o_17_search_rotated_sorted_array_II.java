public class o_17_search_rotated_sorted_array_II {
    public boolean search(int[] nums, int target) {
       int mid,first = 0,last = nums.length-1;
       while(first <= last){
        mid = (last+first)/2;
        if(target == nums[mid]){
            return true;
        }
        if(nums[first] == nums[mid] && nums[last] == nums[mid]){
            last--;
            first ++;
            continue;
        }

        if(nums[first]<=nums[mid]){
            if(nums[first]<=target && nums[mid]>= target){
                last = mid-1;
            }else{
                first = mid+1;
            }
        }else{
            if(nums[last] >= target && nums[mid] <= target){
                first = mid+1;
            }else {
                last = mid -1;
            }
        }
        
       } 
       return false;
    }

    public static void main(String[] args) {
        int[] nums = {1,0,1,1,1};
        int target = 0;
        o_17_search_rotated_sorted_array_II srch = new o_17_search_rotated_sorted_array_II();
        System.out.println(srch.search(nums, target));
    }
}
