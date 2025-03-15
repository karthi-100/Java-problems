import java.util.Arrays;

public class Leetcode283 {
    static void moveZeroes(int[] nums) {
        int index=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[index]=nums[i];
                index++;
            }
        }
        for(int i=index;i<nums.length;i++){
            nums[i]=0;
        }

    }
    public static void main(String[] args) {
        int nums[]=new int[]{1,0,2,0,3,4,5,0};
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }
}
