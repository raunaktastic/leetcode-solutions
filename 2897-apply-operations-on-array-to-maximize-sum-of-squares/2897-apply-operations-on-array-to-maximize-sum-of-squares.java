class Solution {
    public int maxSum(List<Integer> nums, int k) {
        int mod = 1000000007;
        int[] bits = new int[30];

        for (int num : nums) {
            for (int i = 0; i < 30; i++) {
                if ((num & (1 << i)) != 0) {
                    bits[i]++;
                }
            }
        }

        long ans = 0;

        for (int i = 0; i < k; i++) {
            int num = 0;

            for (int j = 29; j >= 0; j--) {
                if (bits[j] > 0) {
                    num |= (1 << j);
                    bits[j]--;
                }
            }

            ans = (ans + (long) num * num) % mod;
        }

        return (int) ans;
    }
}