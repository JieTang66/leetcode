package Top100;

public class sixtyTwo {
	public int uniquePaths(int m, int n) {
		int [][] dp=new int [m][n];
		for(int i=0;i<n;i++) {
			dp[0][i]=1;
		}
		for(int i=0;i<m;i++) {
			dp[i][0]=1;
		}
		for(int i=1;i<m;i++) {
			for(int j=1;j<n;j++) {
				dp[i][j]=dp[i-1][j]+dp[i][j-1];
			}
		}
		return dp[m-1][n-1];
        /*int tmp0=Math.min(m,n);
        //int tmp1=Math.max(m,n);
        int tmp2=tmp0-1;
        int tmp3=m+n-2;
        long res1=1;
        long res2=1;
        
        if(tmp0==1){
            return 1;
        }
        while(tmp2>=1){
            res1*=tmp3;
            res2*=tmp2;
            tmp3--;
            tmp2--;
        }
        
        return (int)(res1/res2);
    */
		
    }
    
}
