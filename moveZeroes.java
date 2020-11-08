class Solution {
    public void moveZeroes(int[] nums) {
        int j=0;
        for (int i=0; i<nums.length; i++) {
            if (j==nums.length-1 && nums[j]==0) break;
            while (j<nums.length && nums[j]==0) {
                j++;
            }
            if (j>i && j<nums.length) {
                nums[i]=nums[j];
                nums[j]=0;
            }
            j++;
        }
    }
}
