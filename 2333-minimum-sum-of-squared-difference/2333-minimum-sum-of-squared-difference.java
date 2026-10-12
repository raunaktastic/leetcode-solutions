
class Solution {
    public long minSumSquareDiff(int[] nums1, int[] nums2, int k1, int k2) {
        int n = nums1.length;
        int[] diff = new int[n];
        int max = 0;

        for (int i = 0; i < n; i++) {
            diff[i] = Math.abs(nums1[i] - nums2[i]);
            max = Math.max(max, diff[i]);
        }

        long k = (long) k1 + k2;
        int[] freq = new int[max + 1];

        for (int i = 0; i < n; i++) {
            freq[diff[i]]++;
        }

        while (k > 0 && max > 0) {
            if (freq[max] == 0) {
                max--;
                continue;
            }

            int count = (int) Math.min(k, freq[max]);

            freq[max] -= count;
            freq[max - 1] += count;
            k -= count;

            if (freq[max] == 0) {
                max--;
            }
        }

        long sum = 0;

        for (int i = 1; i <= max; i++) {
            sum += (long) i * i * freq[i];
        }

        return sum;
    }
}
