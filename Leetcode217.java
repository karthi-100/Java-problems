import java.util.HashMap;
import java.util.Map;

public class Leetcode217 {
     static boolean containsDuplicate(int[] nums) {
     Map<Integer,Integer> numsTable =  new HashMap();   
     for(int value : nums){
        if(numsTable.containsKey(value)) return true;
        numsTable.put(value,1);
     }
     return false;
    }
    public static void main(String[] args) {
        System.out.println(containsDuplicate(new int[]{1,2,3,4,3,2,1}));
    }
}
