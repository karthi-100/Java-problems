import java.util.HashMap;
import java.util.Map;

public class Leetcode169 {
    static int majorityElement(int[] nums) {
        HashMap<Integer,Integer> values=new HashMap();

        for(int data :nums) values.put(data,values.getOrDefault(data,0)+1);

        for(Map.Entry<Integer,Integer> entry:values.entrySet()){
            if(entry.getValue()>nums.length/2) return entry.getKey();
        }
        return -1;
    }
    public static void main(String[] args) {
        System.out.println(majorityElement(new int[]{1,1,1,2,2,1,1,1}));
    }
}
