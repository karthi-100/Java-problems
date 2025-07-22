
import java.util.List;
import java.util.ArrayList;
public class Flameo {

    static void FindDuplicate(String name2,List<Character> arr){
       for(int i =0 ;i< name2.length();i++){
        if(arr.contains(name2.charAt(i))){
            // System.out.println(name2.charAt(i));
            // arr.removeFirst(name2.charAt(i));
        }
       }
        System.out.println(arr);
    }
    public static void main(String[] args) {
        String name1 = "java";
        String name2 = "pythonj";

        char[] charArray = name1.toCharArray();

        List<Character> arr = new ArrayList<Character>();

        for(char ch : charArray){
            arr.add(ch);
        }

        //find duplicates
        FindDuplicate(name2, arr);
    }
}
