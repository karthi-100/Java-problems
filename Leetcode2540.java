public class Leetcode2540 {
    static int getCommon(int[] nums1, int[] nums2) {
        int i=0,j=0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]==nums2[j]) return nums1[i];
            else if(nums1[i]<nums2[j]) i++;
            else if(nums1[i]>nums2[j]) j++; 
        }
        return -1;
    }
    public static void main(String[] args) {
        System.out.println(getCommon(new int[]{1,2,3,4,5}, new int[]{3,4,5,6,7}));
    }
}
