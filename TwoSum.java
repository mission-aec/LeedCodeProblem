package ProblemSolving;

class TwoSum{
    public static int[] twoSum(int[] nums, int target) {
        int[] array = {};
        array[0]=nums[0];
        for (int i = 0; i< nums.length;i++){
            if((array[0]+nums[i])==target){
             array[1]=nums[i];
            } else{

            }
        }
        return array;
    }
    public static void main(String[] args) {
        int[] array={2,7,11,15};
        
        twoSum(array, 9);
    }

}