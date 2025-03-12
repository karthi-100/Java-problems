//pascal triangle

import java.util.ArrayList;
import java.util.List;
class Leetcode118 {
    static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pascalTriangle=new ArrayList();

        //itereating numRow times
        for(int i=0;i<numRows;i++){
            //creating a row for the pascalTriangle
            List<Integer> row=new ArrayList();
            
            for(int j=0;j<=i;j++){
                if(j==0||j==i) row.add(1);
                else{
                    row.add(pascalTriangle.get(i-1).get(j)+pascalTriangle.get(i-1).get(j-1));
                }
            }
            pascalTriangle.add(row);
        }
        return pascalTriangle;
    }

    public static void main(String[] args) {
        System.out.println(generate(3));
    }
}