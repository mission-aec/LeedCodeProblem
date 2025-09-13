package LeedCodeProblem;
//problem 55 
public class JumpGame {
        public static boolean canJump(int[] nums) {
        int max=0;
        for(int i=0; i<nums.length;i++){

            if(i>max){
                return false;
            }else{
                max=Math.max(max, i+nums[i]);

            }
        }
        return true;
    }
public static void main(String[] args) {
    int[] nums={3,2,1,0,4};
    System.out.println(canJump(nums));
}
}
