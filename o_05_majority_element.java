public class o_05_majority_element {
    public static void main(String[] args) {
        int[] nums = {1,-8,-2,1,4,5,6,4};
        o_05_majority_element me = new o_05_majority_element();
        System.out.println(me.majority(nums));
        

    }
    public int majority(int[] nums){
        int max = Integer.MIN_VALUE;
        int sum = 0;

        for(int i = 0; i<nums.length; i++){
            sum += nums[i];
            max=Math.max(sum,max);
            if(sum<0){

                sum = 0;

            }else{

                max=Math.max(max, sum);

            }
        }


        return max;
    } 
}
