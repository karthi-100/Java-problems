import java.util.HashMap;
import java.util.Map;

public class Leetcode387 {
    static int firstUniqChar(String s) {
        Map<Character,Integer> map = new HashMap<Character,Integer>();

        char[] arr = s.toCharArray();
        for(int i=0;i<s.length();i++){
            map.put(arr[i],map.getOrDefault(arr[i], 0)+1);
        }
        System.out.println(map);
        //finding first char
        for(int i=0;i<arr.length;i++){
            if(map.get(arr[i])==1) return i; 
        }
        return -1;
    }
    public static void main(String[] args) {
        System.out.println(firstUniqChar("avadaen"));
    }
}
