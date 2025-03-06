class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n=grid.length;
        int c=grid[0].length;
        int[] ans=new int [2];
        HashSet <Integer> map=new HashSet<>();

        for(int i=0; i<n; i++){
           for(int j=0; j<c; j++){
            if(map.contains(grid[i][j])){
                ans[0]=grid[i][j];
                continue;
            }
             map.add(grid[i][j]);
           }
        }

        for(int i=1; i<=n*c; i++){
            if(!map.contains(i)){
                ans[1]=i;
            }
        }

        return ans;
    }
}