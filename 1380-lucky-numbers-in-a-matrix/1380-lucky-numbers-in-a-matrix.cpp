class Solution {
public:
    vector<int> luckyNumbers(vector<vector<int>>& matrix) {

        int m = matrix.size();
        int n = matrix[0].size();

        int rowminmax = INT_MIN;
        int colmaxmin = INT_MAX;

        for(int i = 0; i < m; i++) {

            int min_row = INT_MAX;

            for(int j = 0; j < n; j++) {
                min_row = min(min_row, matrix[i][j]);
            }

            rowminmax = max(min_row, rowminmax);
        }

        for(int i = 0; i < n; i++) {

            int max_col = INT_MIN;

            for(int j = 0; j < m; j++) {
                max_col = max(max_col, matrix[j][i]);
            }

            colmaxmin = min(max_col, colmaxmin);
        }

        if(rowminmax == colmaxmin) {
            return {rowminmax};
        }

        return {};
    }
};