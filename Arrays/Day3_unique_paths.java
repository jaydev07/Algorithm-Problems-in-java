
public class Day3_unique_paths {
	public int uniquePaths(int m, int n) {
        int dp[][];
        dp=new int[m][n];
        int i=0,j=0;
        dp[0][0]=countPaths(i,j,m,n,dp);
        return dp[0][0];
    }
    
    public int countPaths(int i,int j,int m,int n,int dp[][]){
        if(i==m-1 && j==n-1){
            return 1;
        }
        if(i>=m || j>=n){
            return 0;
        }
        // We are using dynamic programming table & stop do more recursion
        if(dp[i][j]!=0){
            return dp[i][j];
        }
        else{
            dp[i][j]=countPaths(i+1,j,m,n,dp) + countPaths(i,j+1,m,n,dp);
            return dp[i][j];
        }
    }
}
