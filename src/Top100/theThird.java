package Top100;

import java.util.HashMap;
import java.util.Map;
/*
 * 滑动窗口法  （暴力法暂时没有思考）
 * 1.定义一个map数据结构，key为字符，value为字符位置
 * 2.定义不重复字符子串开始的位置为start，结束位置为i
 * 3.i不断向后遍历字符串，如果[start,i]内出现重复的字符
 * 将第一个重复字符的下一位更新为start
 * 4.无论是否更新start,都会更新map和子串长度max
 */
public class theThird {
	public int lengthOfLongestSubstring(String s) {
		//String n = null;
		Map<Character,Integer> map = new HashMap<Character,Integer>();
		int max = 0;
		int left = 0;
		for(int i = 0; i < s.length(); i++) {
			if(map.containsKey(s.charAt(i))) {
				left = Math.max(left, map.get(s.charAt(i))+1);
			}
			map.put(s.charAt(i), i);
			max = Math.max(max,i-left+1);
		}
		return max;
	}
}
