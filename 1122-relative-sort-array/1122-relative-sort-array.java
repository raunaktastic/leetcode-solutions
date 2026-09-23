class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {

        int[] freq = new int[1001];

        // Count frequency of arr1 elements
        for(int i = 0; i < arr1.length; i++) {
            freq[arr1[i]]++;
        }

        int index = 0;

        // Put arr2 elements first
        for(int i = 0; i < arr2.length; i++) {

            while(freq[arr2[i]] > 0) {
                arr1[index] = arr2[i];
                index++;
                freq[arr2[i]]--;
            }
        }

        // Put remaining elements in ascending order
        for(int i = 0; i < freq.length; i++) {

            while(freq[i] > 0) {
                arr1[index] = i;
                index++;
                freq[i]--;
            }
        }

        return arr1;
    }
}