class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m=mat.length;
        int n=mat[0].length;
        int [][]result=new int[r][c];
        if(m*n==r*c){
            for(int i=0; i<m; i++){
                for(int j=0; j<n; j++){
                                int index=i*n+j;
                             int newrow=index/c;
                          int newcol=index%c;
                          result[newrow][newcol]=mat[i][j];
                }
                }

        }else{
                    return mat;
            }
        return result;
    }
}