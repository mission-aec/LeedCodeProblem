
class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
           int[] array = new int[2]; 
    
        for (int i = 0; i < nums.length;i++){
         for (int j=i+1; j<nums.length;j++){
            if(nums[i]+nums[j]==target){
              array[0]=i;
              array[1]=j;
            }
         }
        }
       return array;

}
public static void main(String[] args) {
    int[] nums= {2,7,11,15};
    int target = 9;
    int[] ans =  twoSum(nums, target); 
   for(int i=0; i<ans.length;i++){
        System.out.print(ans[i]+" ");
    }
    
}
}