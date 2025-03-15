import java.util.ArrayList;
import java.util.List;

public class Leetcode228 {
        static List<String> summaryRanges(int[] nums) {
        List<String> rangeArray=new ArrayList();
        List<Integer> tempSet=new ArrayList();

        for(int data :nums){
            if(tempSet.isEmpty() || tempSet.get(tempSet.size()-1)+1==data){
                tempSet.add(data);
            }
            else{
                rangeArray.add(tempSet.size()>1?(tempSet.get(0)+"->"+tempSet.get(tempSet.size()-1)).toString():tempSet.get(tempSet.size()-1).toString());
                tempSet.clear();
                tempSet.add(data);
            }
        }
        if(!tempSet.isEmpty()){
            rangeArray.add(tempSet.size()>1?(tempSet.get(0)+"->"+tempSet.get(tempSet.size()-1)).toString():tempSet.get(tempSet.size()-1).toString());
        }

        return rangeArray;
    }
    public static void main(String[] args) {
     System.out.println(summaryRanges(new int[]{0,1,2,4,5,7}));  
    }
}
