public class o_14_subArray_Sum_Equals_to_k {

     public int subarraySum(int[] nums, int k) {
        int count = 0;
        int sum=0;
        for(int i =0;i<nums.length;i++){
            sum = 0;
            for(int j = i; j<nums.length;j++){
                sum += nums[j];
                if(sum == k){
                    count++;
                }
            }
        } 
        return count;
     }
     public static void main(String[] args) {
        int[] nums = {1,1,1};
        o_14_subArray_Sum_Equals_to_k subarr = new o_14_subArray_Sum_Equals_to_k();
        System.out.println(subarr.subarraySum(nums, 2));
     }
}