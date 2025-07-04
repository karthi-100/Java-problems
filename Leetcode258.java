public class Leetcode258 {
    static int addDigits(int num){
        int temp = 0;
        if(num<10) return num;
        while(num>0){
            temp = temp+num%10;
            num = num/10;
            if(num==0 && temp>=10){
                num = temp;
                temp = 0;
            }
        }
        return temp;
    }
    public static void main(String[] args) {
        System.out.println(addDigits(9));
    }
}
