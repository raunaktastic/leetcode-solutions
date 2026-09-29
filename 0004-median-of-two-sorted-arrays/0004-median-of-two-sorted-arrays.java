class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int []median= new int [nums1.length + nums2.length];
        for(int i=0; i<nums1.length; i++){
         median[i]=nums1[i];
        }
         for(int i=0; i<nums2.length; i++){
        median[nums1.length + i]=nums2[i];
        }
        Arrays.sort(median);
        int n=median.length;
        if(n %2==0){
            int firstmiddle=median[n/2-1];
            int secondmiddle=median[n/2];
            double med= firstmiddle + secondmiddle;
            return med=med/2;

        }else{
              double med=median[n/2];
              return med;
        }
    }
}