class Solution {
    public void moveZeroes(int[] nums) {
        int target=0;
        int j =0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=target){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }
    
    }
}