import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leetcode2032 {
    public static List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        int[] arr=new int[101];
        int[] arr2=new int[101];
        int[] arr3 = new int[101];
        List<Integer> ls = new ArrayList();
        Arrays.fill(arr,0);
        for(int data :nums1) arr[data]=1;
        for(int data :nums2) arr2[data]=1;
        for(int data:nums3) arr3[data]=1;

        for(int i=1;i<arr.length;i++){
            if(arr[i]+arr2[i]+arr3[i]>=2) ls.add(i);
        }

        return ls;
    }
    public static void main(String[] args) {
        System.out.println(twoOutOfThree(new int[]{1,2,3,3},new int[]{3,3,4},new int[]{2,3,6,7,8}));
    }
}
