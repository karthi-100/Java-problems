import java.util.HashSet;
import java.util.Set;

public class Leetcode1832 {
     static boolean checkIfPangram(String sentence) {
        Set<Character> set = new HashSet<Character>();
        for(char ch : sentence.toCharArray()){
            set.add(ch);
        }
        if(set.size()==26) return true;
        return false;
    }
    public static void main(String[] args) {
        System.out.println(checkIfPangram("thequickbrownfoxjumpsoverthelazydog"));
    }
}
