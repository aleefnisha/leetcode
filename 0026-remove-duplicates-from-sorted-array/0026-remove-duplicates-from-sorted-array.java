class Solution {
    public int removeDuplicates(int[] nums) {
         if (nums.length == 0) return 0;

        int k = 1; // Index for placing next unique element
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
        
    }
}