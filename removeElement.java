package LeedCodeProblem;

public class removeElement {
    public static int remove(int[] nums, int val) {
        int count=0;
        for(int i =0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[count]=nums[i];
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] nums = {0,1,2,2,3,0,4,2};
        int val = 2;
        int ans =remove(nums, val);
        System.out.println("Total element which are not match the targeted value: "+ans);
        

        for(int i=0;i<ans;i++){
            System.out.print(nums[i]+" ");
        }

    }
}
