class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int res=(n*(n+1))/2;
        for(int i:nums)
            res-=i;
        return res;
    }
}