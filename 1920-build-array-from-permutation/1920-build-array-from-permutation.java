class Solution {
    public static int[] buildArray(int[] nums) {
        int n = nums.length;
        int [] ans = new int[n];
        for(int i=0;i<n;i++){
            ans[i]=nums[nums[i]];
        }

        return ans;
    }
    public static void mains(String args[]){
        int[] nums={0,2,1,5,3,4};
        int [] result = buildArray(nums);
        System.out.println(Arrays.toString(nums));
    }
}