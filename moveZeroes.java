class Solution {
    public void moveZeroes(int[] nums) {
        
        int j=0;
        for (int i=0;i<nums.length;i++) {
            if (nums[i]==0) {
                j++;
            }
        }
        if (j>0) {
            Arrays.sort(nums);
            for (int k=0;k<nums.length;k++) {
                if (k>=nums.length-j) {
                    nums[k]=0;
                } else {
                    nums[k]=nums[k+j];
                }
            }
        }
    }
}
