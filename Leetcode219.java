import java.util.HashSet;

public class Leetcode219 {
    static boolean containsNearbyDuplicate(int[] nums, int k) {
        HashSet<Integer> window=new HashSet();
        for(int i=0;i<nums.length;i++){
            if(window.contains(nums[i])) return true;

            window.add(nums[i]);

            if (window.size()>k)window.remove(nums[i-k]);
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(containsNearbyDuplicate(new int[]{1,1,3,4,5,3}, 01));
    }
}
