import java.util.*;

 class o_02_Two_sum {

     public int[] twoSum(int[] nums, int target) {


        
        for(int i = 0; i < nums.length; i++){
            int newTarget = target - nums[i];
            for(int j = i+1; j<nums.length; j++){
                if( nums[j] == newTarget)
                {
                    int[] ans = {i,j};
                    return ans;
                }
            }
        }
        return new int[0];

    }

    public static void main(String[] args){
        

        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        
        System.out.println("enter the size of array");
        int size = sc.nextInt();
        int[] input = new int[size];

        for(int i = 0; i < size ; i++){
            input[i] = sc.nextInt();
        }
        o_02_Two_sum ts = new o_02_Two_sum();
        int[] output = ts.twoSum(input,target);
        System.out.println(Arrays.toString(output));

    }
}