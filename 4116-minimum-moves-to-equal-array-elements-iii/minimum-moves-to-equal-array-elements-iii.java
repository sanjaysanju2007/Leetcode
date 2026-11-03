class Solution {
    public int minMoves(int[] nums) {
        int max=nums[0];
        for(int e:nums){
            if(e>max) max=e;
        }
        int totalmoves=0;
        for(int e: nums){
            totalmoves+=(max-e);
        }
        return totalmoves;
    }
}