class Solution {
    public boolean checkPossibility(int[] nums) {
        int cnt=0;
        for(int i=1;i<nums.length && cnt<=1;i++){
            if(nums[i-1]>nums[i]){
                if(i-2<0 || nums[i-2]<=nums[i])
                    nums[i-1]=nums[i];
                else
                    nums[i]=nums[i-1];
                cnt++;
            }
        }
        return cnt<=1;
    }
}