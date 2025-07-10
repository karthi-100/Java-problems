public class Leetcode2114 {
    static int mostWordsFound(String[] sentences) {
        int max =-1;

        for(String str : sentences){
            String senArray[] = str.split(" ");
            max = Math.max(max, senArray.length);

        }

        return max;
    }
    public static void main(String[] args) {

        System.out.println(mostWordsFound(new String[]{"alice and bob love leetcode","i think so too","this is great thanks very much"}));
    }
}