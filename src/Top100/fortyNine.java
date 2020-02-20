package Top100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class fortyNine {
	
	public List<List<String>> groupAnagrams(String[] strs){
		/*//排序数组分类
		if(strs.length == 0) return new ArrayList();
		Map<String,List> ans = new HashMap<String,List>();
		for(String s:strs) {
			char[] ca = s.toCharArray();
			Arrays.sort(ca);
			String key=String.valueOf(ca);
			if(!ans.containsKey(key)) {
				ans.put(key, new ArrayList());
			}
			ans.get(key).add(s);
		}
		return new ArrayList(ans.values());
		*/
		
		//将每个字母用质数表示，单词包含的字母不同，则单词代表的质数乘机不同
		if(strs.length == 0) return new ArrayList();
		HashMap<Character,Integer> ans = new HashMap<Character,Integer>();
		ans.put('a',3);
		ans.put('b',5);
		ans.put('c',7);
		ans.put('d',11);
		ans.put('e',13);
		ans.put('f',17);
		ans.put('g',19);
		ans.put('h',23);
		ans.put('i',29);
		ans.put('j',31);
		ans.put('k',37);
		ans.put('l',41);
		ans.put('m',43);
		ans.put('n',47);
		ans.put('o',53);
		ans.put('p',59);
		ans.put('q',61);
		ans.put('r',67);
		ans.put('s',71);
		ans.put('t',73);
		ans.put('u',79);
		ans.put('v',83);
		ans.put('w',89);
		ans.put('x',91);
		ans.put('y',97);
		ans.put('z',101);
		int sum = 1;
		HashMap<Integer, List> tmp = new HashMap<Integer,List>();
		for(String str:strs) {
			for(int i=0;i<str.length();i++) {
				sum*=ans.get(str.charAt(i));
			}
			
			if(!tmp.containsKey(sum)) {
				tmp.put(sum, new ArrayList());
			}
			tmp.get(sum).add(str);
		}
		return new ArrayList(tmp.values());
	}
	
	
}


































