public class Leetcode268 {
    static int missingNumber(int[] nums) {
        int length=nums.length;
        int sum=length*(length+1)/2;
        int totalSum=0;
        for(int value : nums) totalSum+=value;
        return sum-totalSum;
    }

    public static void main(String[] args) {
        System.out.println(missingNumber(new int[]{0,1,3}));
    }
}