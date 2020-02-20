package Top100;

public class theEighth {
	 public int myAtoi(String str) {
		    int ans = 0;
		    int tem=0;
		 	String m = str.replaceAll(" ", "");
	        for(int i=0;i<m.length();i++){
	        	char n = m.charAt(0);
	            if(!Character.isDigit(n)&&n!='-') {
	            	return 0;
	            }else {      	
	            	ans = m.charAt(i);
	            	tem = tem + ans*10;
	            	if(tem>Integer.MAX_VALUE) return Integer.MAX_VALUE;
	            	if(tem<Integer.MIN_VALUE) return Integer.MIN_VALUE;
	            }
	        }
	        return tem;
	    }
}
