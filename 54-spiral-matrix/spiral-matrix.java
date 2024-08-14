class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> li = new ArrayList<>();
        int left = 0;
        int top = 0;
        int bot = matrix.length - 1;
        int right = matrix[0].length - 1;
        while ((left <= right) && (top <= bot)) {
            for (int i = left; i <= right; i++) {
                li.add(matrix[top][i]);
            }
            top++;
            for(int i=top;i<=bot;i++){
                li.add(matrix[i][right]);
            }
            right--;
            if(top<=bot){
                for(int i=right;i>=left;i--)
                li.add(matrix[bot][i]);
            }
            bot--;
            if(left<=right){
                for(int i=bot;i>=top;i--)
                li.add(matrix[i][left]);
            }
            left++;

        }
        return li;
    }
}