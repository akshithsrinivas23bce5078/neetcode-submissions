class Solution {
    public int findMin(int[] nums) {
        int mn = nums[0];
        for(int i = 0; i < nums.length; i++){
            if(nums[i] < mn){
                mn = nums[i];
            }
        }
        return mn;
    }
}
