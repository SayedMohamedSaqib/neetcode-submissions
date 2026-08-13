class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        int rowStart = 0; int rowEnd = matrix.length - 1;
        int colStart = 0; int colEnd = matrix[0].length - 1;
        while(rowStart <= rowEnd && colStart <= colEnd){

            // Top
            for(int i = colStart; i <= colEnd; i++){
                ans.add(matrix[rowStart][i]);
            }

            // Right
            for(int j = rowStart + 1; j <= rowEnd; j++){
                ans.add(matrix[j][colEnd]);
            }

            // Bottom
            for(int j = colEnd - 1; j >= colStart; j--){
                if(rowStart == rowEnd) {
                    break;
                }
                ans.add(matrix[rowEnd][j]);
            }

            // Left
            for(int i = rowEnd - 1; i >= rowStart + 1; i--){
                if(colStart == colEnd){
                    break;
                }
                ans.add(matrix[i][colStart]);
            }

            rowStart++;
            rowEnd--;
            colStart++;
            colEnd--;

        }
        return ans;
    }
}
