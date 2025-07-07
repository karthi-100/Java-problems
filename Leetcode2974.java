import java.util.Arrays;

public class Leetcode2974 {
    static int[] numberGame(int[] nums) {
        Arrays.sort(nums);
        //swapping adjecent numbers
        int temp =0;
        for(int i=0;i<nums.length;i=i+2){
            if(i+1>=nums.length) break;
            temp = nums[i];
            nums[i] = nums[i+1];
            nums[i+1] = temp;
        }
        return nums;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(numberGame(new int[]{4,5,3,2})));
    }
}
