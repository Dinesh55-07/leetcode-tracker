// Last updated: 14/06/2026, 21:22:25
class Solution {
    boolean maxpossible(int[] nums,int max){
        int n=nums.length;
        long[] arr=new long[n];
        for(int i=0;i<n;i++){
            arr[i]=nums[i];
        }

        for(int i=0;i<n-1;i++){
            if(arr[i]>max) return false;
            long buffer =max-arr[i];
            arr[i]+=buffer;
            arr[i+1]-=buffer;
        }
        if(arr[n-1]>max) return false;

        return true;
    }
    public int minimizeArrayValue(int[] nums) {
        int l=0,r=(int)1e9,ans=Integer.MAX_VALUE;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(maxpossible(nums,mid)){
                ans=mid;
                r=mid-1;
            }else{
                l=mid+1;
            }
        }
        return ans;
    }
}



// asked in facebook
/*      3  7  1  6   let ans=5
        5  5  5  2
        ok ok ok less than or eqaul to 5
        3 can increase to 5 buffer is 2 hence 7 can decrease by 2 now i is on 7 (updated 5) on 5 buffer is 0 hence 1 cannot decrease now i on 1 buffer is 4(5-1) hence 1 can increase to 5 and 6 can decrease to 2 now i on 6(updated 2)last element no need to increase or decrease but we need to check if its smaller than or equal to ans
        we apply binary search for ans */