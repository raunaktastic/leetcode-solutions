class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int n=image[0].length;

        for(int i=0; i<n; i++){
                int start=0;
                int end=image[0].length-1;
        while(start<=end){
            int temp=image[i][start];
            image[i][start]=1-image[i][end];
            image[i][end]=1-temp;
            start++;
            end--;
        }
        }
        
        return image;
    }
}