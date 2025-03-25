import java.util.Arrays;
import java.util.HashSet;

public class Leetcode349 {
    static int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> h1=new HashSet();
        for(int data:nums1) h1.add(data);//adding nums1 data 

        // HashSet<Integer> h2=new HashSet();
        // for(int data:nums2) h2.add(data);//adding nums2 data 

        HashSet<Integer> result=new HashSet();
        for(int data : nums2){
            if(h1.contains(data))result.add(data);
        }
        int[] res=new int[result.size()];
        int index=0;
        for(int data :result){
            res[index]=data;
            index++;
        }
        return res;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(intersection(new int[]{1,2,3,4,5,6}, new int[]{3,3,4,5})));
    }
}
