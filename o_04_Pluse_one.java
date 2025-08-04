public class o_04_Pluse_one {
     public int[] plusOne(int[] digits) {
         for(int i = digits.length -1; i>=0;i--){
            if(digits[i]==9){
                digits[i]=0;
            }else{
                digits[i]++;
                return digits;
            }
        }
        int[] newarr = new int[digits.length + 1];
        newarr[0] = 1;
        return newarr;

    }
    public static void main(String[] args) {
        
        o_04_Pluse_one po = new o_04_Pluse_one();
        int[] nums = {9,8,7,6,5,4,3,2,1,0};
        po.plusOne(nums);
        
    }
}