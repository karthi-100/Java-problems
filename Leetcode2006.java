public class Leetcode2006 {
    public static int countKDifference(int[] nums, int k) {
        int count = 0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(Math.abs(nums[i]-nums[j])==k) count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(countKDifference(new int[]{1,2,2,3,3,5}, 2));   
    }
}
