class Solution {
    public int[] sortedSquares(int[] nums) {
        Arrays.sort(nums);
        int []square=new int[nums.length];
        for(int i=0; i<nums.length;i++){
            square[i]=nums[i] * nums[i];

        }
                    Arrays.sort(square);
             return square;
    }
}