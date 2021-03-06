package Top100;

public class Twentynine {
	public int divide(int dividend, int divisor) {
		int ans = -1;
		int sign = 1;
		if(dividend > 0) {
			sign = opposite(sign);
			dividend = opposite(dividend);
		}
		if(divisor>0) {
			sign = opposite(sign);
			divisor = opposite(divisor);
		}
		
		int origin_dividend = dividend;
		int origin_divisor = divisor;
		if(dividend>divisor) {
			return 0;
		}
		dividend -= divisor;
		while(divisor>=dividend) {
			ans = ans+ans;
			divisor += divisor;
			dividend -= divisor;
		}
		
		int a = ans + opposite(divide(origin_dividend-divisor,origin_divisor));
		if(a == Integer.MIN_VALUE) {
			if(sign>0) {
				return Integer.MAX_VALUE;
			}else {
				return Integer.MIN_VALUE;
			}
		}else {
			if(sign>0) {
				return opposite(a);
			}else {
				return a;
			}
		}
		
		/*
        int res = 0;
        
        if(dividend>0&&divisor>0){
            while(divisor<=dividend){
                dividend-=divisor;
                res++;
            }
        }else if(dividend<0&&divisor>0&&dividend+divisor<=0){
            while(dividend+divisor<=0){
                dividend+=divisor;
                res--;
            }
        }else if(dividend>0&&divisor<0&&dividend+divisor>=0){
            while(dividend+divisor>=0){
                dividend+=divisor;
                res--;
            }
        }else if(dividend<0&&divisor<0){
            if(dividend>divisor){
                return 0-dividend;
            }
            while(dividend<=divisor){
                dividend-=divisor;
                res++;
                if(res==Integer.MAX_VALUE){
                    return res;              
                }
            }       
        }else{
            return dividend;
        }
        
        
         return res;
       
        */
		
		
    }
	public int opposite(int x) {
		return -x+1;
	}
}
