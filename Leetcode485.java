public class Leetcode485 {
    static int findMaxConsecutiveOnes(int[] nums) {
        int maxConsecutives=0;
        int tempCount=0;
        for(int data: nums){
            if(data==1)tempCount++;
            else tempCount=0;
            if(maxConsecutives<tempCount) maxConsecutives=tempCount;
        }
        return maxConsecutives;
    }
  public static void main(String[] args) {
    System.out.println(findMaxConsecutiveOnes(new int[]{1,1,0,1,1,1,0,1}));
  }   
}
