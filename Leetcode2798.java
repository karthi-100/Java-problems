public class Leetcode2798 {
    static int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int count = 0 ;
        for(int i : hours){
            if(i>=target)count++;
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(numberOfEmployeesWhoMetTarget(new int[]{0,1,2,3,4,5}, 3));
    }
}
