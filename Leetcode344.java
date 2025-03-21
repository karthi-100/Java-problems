public class Leetcode344 {
    static void reverseString(char[] s) {
        char temp=' ';
        for(int i=0;i<s.length/2;i++){
            temp=s[i];
            s[i]=s[s.length-1-i];
            s[s.length-1-i]=temp;
        }
    }
    public static void main(String[] args) {
        char[] charArray={'a','b','c'};
        reverseString(charArray);
        for(char ch : charArray){
            System.out.println(ch);
        }
        
    }
}
