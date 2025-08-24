
public class o_19_single_element_in_sorted_array {
    public int singleNonDuplicate(int[] nums) {
        int start = 0, end = nums.length - 1;

        while (start < end) {
            int mid = (start + end) / 2;
            if (mid % 2 == 1) mid--;

            if (nums[mid] == nums[mid + 1]) {
                start = mid + 2; 
            } else {
                end = mid; 
            }
        }

        return nums[start];
    }

    public static void main(String[] args) {
        int[] nums = {1,1,2,3,3,4,4,8,8};
        o_19_single_element_in_sorted_array sol = new o_19_single_element_in_sorted_array();
        System.out.println(sol.singleNonDuplicate(nums)); 
    }
}
