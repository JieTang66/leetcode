package Top100;

public class fifty {
	
	public double bsearch(double x,long n) {
		if(n==0) {
			return 1.0;
		}
		double half = bsearch(x,n/2);
		if(n%2==0) {
			return half*half;
		}else {
			return half*half*x;
		}
	
	}
	public double myPow(double x, int n) { 
		long N = n;
		if(N<0) {
			x=1/x;
			N=-N;
		}
		return bsearch(x,N);
       //暴力法（会超时） 
        /*
        double res=1;
        if(n>0){
            for(int i=0;i<n;i++){
                res*=x;
            }
        }else if(n==0){
            return res;
        }else if(n<0){
            for(int i=0;i<-n;i++){
                res*=x;
            }
            res=1/res;
        }
        return res;
        */
	
	
    }
}
