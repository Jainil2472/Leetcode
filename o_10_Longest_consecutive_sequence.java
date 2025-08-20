import java.util.Arrays;

public class o_10_Longest_consecutive_sequence {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        int maxx=1;
        int count = 1;
        Arrays.sort(nums);
        // System.out.println(Arrays.toString(nums));
        for(int i =0;i<nums.length-1;i++){
            
            if(nums[i+1] == (nums[i]+1)){
                // System.out.println("add");
                count++;
            }else if(nums[i] == nums[i+1]){
                // System.out.println("same");
                // System.out.println();
                // continue;
            }else{
                // System.out.println("diff");
                count = 1;
                // System.out.println(maxx);
                // continue;
            }
            maxx = Math.max(maxx,count);
        }
        return maxx;
    
    }
    public static void main(String[] args) {
        int[] nums = {3,7,2,5,8,4,6,1,10,11};
        o_10_Longest_consecutive_sequence LCS = new o_10_Longest_consecutive_sequence();
        System.out.println(LCS.longestConsecutive(nums));
    }
}
