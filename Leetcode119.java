import java.util.ArrayList;
import java.util.List;

public class Leetcode119 {
     public static List<Integer> getRow(int rowIndex) {
        List<Integer> l=new ArrayList();
		for(int i=0;i<=rowIndex;i++){
		    List<Integer> rows=new ArrayList();
		    for(int j=0;j<=i;j++){
		        if(j==0||j==i){
		            rows.add(1);
		        }
		        else{
		            rows.add(l.get(j)+l.get(j-1));
		        }
		    }
		    l=rows;
		}
        return l;
    }
    public static void main(String[] args) {
        System.out.println(getRow(4));
    }
}
