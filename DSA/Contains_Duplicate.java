public class Contains_Duplicate {
    public static void main(String args[]) {
        int[] nums = {1,2,3,1};
        boolean bol = false;
        for (int i = 0; i < nums.length; i++) {
            for(int j = i;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    bol =true;
                }
            }
        }
        System.out.print(bol);
    }
}
