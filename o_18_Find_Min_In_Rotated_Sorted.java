public class o_18_Find_Min_In_Rotated_Sorted {
    public int findMin(int[] nums) {
        int mid,start = 0, end = nums.length-1, ans = Integer.MAX_VALUE;
        while(start <= end){
            mid = (end+start)/2;
            if(nums[mid]>=nums[start]){
                for( int i = mid; i>=0;i--){
                    ans = Math.min(ans,nums[i] );
                }
                start = mid+1;
                System.out.println(mid + " " + ans);
            }
            else{
                System.out.println(mid + " " + ans);

                for(int i = mid;i<= nums.length; i++){
                    if(ans > nums[i]){
                    ans = Math.min(ans,nums[i] );
                    }
                }
                end = mid-1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {3,4,5,1,2};
        o_18_Find_Min_In_Rotated_Sorted findmin = new o_18_Find_Min_In_Rotated_Sorted();
        System.out.println(findmin.findMin(nums));
    }
}