class Solution {

    public void markRow(int [][] matrix, int row){
        for(int j=0; j<matrix[0].length; j++){
            if(matrix[row][j] !=0){
                matrix[row][j]=0;
            }
        }
    }

    public void markCol(int[][] matrix, int col) {
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][col] != 0) {
                matrix[i][col] = 0;
            }
        }
    }
    public void setZeroes(int[][] matrix) {
        int rows= matrix.length;
        int cols= matrix[0].length;

        Set<Integer> r=new HashSet<>();
        Set<Integer> c=new HashSet<>();

        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                if(matrix[i][j]==0){
                    if(!r.contains(i)){
                        r.add(i);
                    }
                     if(!c.contains(j)){
                        c.add(j);
                    }
                }
            }
        }

        for(int i=0; i<rows; i++){
            if(r.contains(i)){
                markRow(matrix, i);
            }
        }

         for(int j=0; j<cols; j++){
            if(c.contains(j)){
                markCol(matrix, j);
            }
        }
        
    }
}