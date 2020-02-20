package Top100;
//最长回文子串

public class theFifth {
/*1.暴力法：列举所有的子串，判断是否为回文子串，保存最长的回文子串
 * 在LeetCode上运行时，如果对象为一个很长的字符串，会出现超出时间限制的问题
 * public boolean isPa(String s) {
		for(int i = 0; i<s.length()/2;i++) {
			if(s.charAt(i)!=s.charAt(s.length()-1-i)) {
				return false;
			}
		}
		return true;
	}
	
	public String longestPalindrome(String s) {
		int max = 0;
		String ans = "";
		for(int i = 0; i < s.length(); i++) {
			for(int j = i+1; j<=s.length(); j++) {
				String test = s.substring(i, j);
				if(isPa(test)&&test.length()>max) {
					ans = s.substring(i, j);
					max = Math.max(max, ans.length());
				}
			}
		}
		return ans;
	}
*/
	
/*2.动态规划
 * 
 * */
	public String longestPalindrome(String s) {
		int len = s.length();
		if(len<=1) {
			return s;
		}
		int longestPalindrome = 1;
		String longestPalindromeStr = s.substring(0,1);
		boolean[][] dp = new boolean[len][len];
		
		for(int r = 1;r < len;r++) {
			for(int l = 0;l<r;l++) {
				if(s.charAt(l) == s.charAt(r) && (r-l<=2 || dp[l+1][r-1])) {
					dp[l][r] = true;
					if(r-l+1>longestPalindrome) {
						longestPalindrome = r-l+1;
						longestPalindromeStr = s.substring(l,r+1);
					}
				}
			}
		}
		return longestPalindromeStr;		
	}
/*3.中心扩散法
 * public String longestPalindrome(String s) {

		int len = s.length();
		if(len == 0) {
			return "";
		}
		int longestLen = 1;
		String longestStr = s.substring(0,1);
		for(int i = 0;i<len;i++) {
			String paOdd=centerSpread(s,len,i,i);
			String paEven=centerSpread(s,len,i,i+1);
			String maxLen = paOdd.length()>paEven.length()?paOdd:paEven;
			if(maxLen.length()>longestLen) {
				longestLen = maxLen.length();
				longestStr = maxLen;
			}
		}
		return longestStr;
		
		
	}
	private String centerSpread(String s,int len,int left,int right) {
		int l = left;
		int r = right;
		while(l>=0&&r<len&&s.charAt(l)==s.charAt(r)) {
			l--;
			r++;
		}
		return s.substring(l+1,r);
	}
	*/
	
	
	
	
	
	
	
	
	
	
	
	
}
