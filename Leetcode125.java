public class Leetcode125 {
    static boolean isPalindrome(String s) {
        int i=0,j=s.length()-1;

        while(i<=j){
            if(!( (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') || 
                   (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') || 
                   (s.charAt(i) >= '0' && s.charAt(i) <= '9'))){
                i++;
            }
            else if(!( (s.charAt(j) >= 'a' && s.charAt(j) <= 'z') || 
                   (s.charAt(j) >= 'A' && s.charAt(j) <= 'Z') || 
                   (s.charAt(j) >= '0' && s.charAt(j) <= '9'))){
                j--;
            }
            else if(Character.toLowerCase(s.charAt(i))!=Character.toLowerCase(s.charAt(j))) {
                return false;
            }
            else{
                i++;
                j--;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(isPalindrome("HELLO OLLEH"));
    }
}
