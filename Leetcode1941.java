import java.util.Collection;
import java.util.HashMap;

public class Leetcode1941 {
     static boolean areOccurrencesEqual(String s) {
        HashMap<Character,Integer> valueTable=new HashMap<Character,Integer>();
        for(char c:s.toCharArray()){
            valueTable.put(c,valueTable.getOrDefault(c,0)+1);
        }
        if(valueTable.isEmpty())return true;
        Collection<Integer> valueArray=valueTable.values();
        int firstValue=valueArray.iterator().next();
        for(Integer value:valueArray){
            if(firstValue!=value) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(areOccurrencesEqual("abcabc"));
    }
}
