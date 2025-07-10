public class Leetcode2520 {
    static int countDigits(int num) {
        int temp = num;
        int digit = -1;
        int count = 0;

        while(temp>0){
            digit = temp%10;
            if(num%digit==0) count++;
            temp = temp/10;
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(countDigits(1248));
    }
}
