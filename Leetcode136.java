public class Leetcode136 {
        static int singleNumber(int[] nums) {
            //brute force solution for the program
            // for(int i=0;i<nums.length;i++){
            //     boolean flag=false;
            //     for(int j=0;j<nums.length;j++){
            //         if(nums[i]==nums[j] && i!=j) flag=true;
            //     }
            //     if(!flag) return nums[i];
            // }
            // return -1;
    
            //actual solution using xor operator
            int temp=0;
            for (int i=0;i<nums.length;i++){
                temp^=nums[i];
            }
            return temp;
        }
        public static void main(String[] args) {
            System.out.println(singleNumber(new int[]{1,2,1,2,5}));
        }
    
}
