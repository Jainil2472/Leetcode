public class o_03_Single_Number {

    public int singleNumber(int[] nums){
        boolean match = false;
    if(nums.length==1){
        return nums[0];
    }else{

    
        for(int i = 0; i<nums.length; i++){
            for(int j = 0; j<nums.length; j++){
                if(j == i ){
                    continue;
                }
                if(nums[i]==nums[j]){
                    match = true;
                }
                

            }

            if(match == true){
                match =false;
                continue;
            }else{
                return nums[i];
            }
        }
    }
    return -1;
    }

    



    // second way to do this 

    public int secondway(int[] nums){
        int sum=0;
        for(int i =0;i<nums.length;i++){
            sum ^= nums[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        o_03_Single_Number SN = new o_03_Single_Number();
        int[] nums = {1,6,7,9,1,7,9};
        System.out.println(SN.singleNumber(nums));
        System.out.println(SN.secondway(nums));
    }
    
}
