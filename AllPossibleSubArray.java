public class AllPossibleSubArray {
    static int findTotalSubArray(int[] arr,int k){
        int res=0;
        int i=0,j=0;
        int sum=0;
        while(j<arr.length){
            sum+=arr[j];
            while(sum>k && i<=j){
                sum-=arr[i];
                i++;
                
            }
            if(sum==k)
            { res++;
            }
            j++;
    }
        return res;
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        int k=3;
        System.out.println(findTotalSubArray(arr,k));
    }
    
}
