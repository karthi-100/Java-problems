public class Leetcode1945 {
    static String transform(String numStr){
        int res=0;
        for(char c: numStr.toCharArray()){
            res+=(c-49+1);
        }
        return Integer.toString(res);
    }
    static int getLucky(String s, int k) {
        //convert the String into numbers
        String numberStr="";
        for(char c : s.toCharArray()){
            numberStr+=(c-'a'+1);
        }
        int i=0;
        while(i<k){
            numberStr=transform(numberStr);
            i++;
        }
        return Integer.parseInt(numberStr);
    }
    public static void main(String[] args) {
        System.out.println(getLucky("abcede", 2));
    }
}
