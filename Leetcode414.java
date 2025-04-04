public class Leetcode414 {
    public static int thirdMax(int[] nums) {
        Integer max=null,secMax=null,thirdMax=null;

        for(Integer data : nums){
            if(data.equals(max)||data.equals(secMax)||data.equals(thirdMax)) continue;
            if(max==null||data>max){
                thirdMax=secMax;
                secMax=max;
                max=data;
            }
            else if(secMax==null||data>secMax){
                thirdMax=secMax;
                secMax=data;
            }
            else if(thirdMax==null||data>thirdMax ){
                thirdMax=data;
            }
        }
        return thirdMax!=null?thirdMax:max;
    }
    public static void main(String[] args) {
        System.out.println(thirdMax(new int[]{1,2,2,3,3,4}));
    }
}
