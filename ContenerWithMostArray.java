
public class ContenerWithMostArray {
    public static int maxWater(int[] height){
        int water=0;
        int l=0,r=height.length-1;
        while (l<r) {
            int w=r-l;
            int h = Math.min(height[l], height[r]);
            int area= h*w;
            water=Math.max(water, area);
            int x= height[l]<height[r] ? l++:r--;
        }
        return water;
    }
    public static void main(String[] args) {
        int[] array={1,8,6,2,5,4,8,3,7};
        //int[] array={1,1};
        System.out.println("Maximum water is:"+maxWater(array));
    }
}