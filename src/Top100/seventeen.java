package Top100;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class seventeen {
	public List<String> letterCombinations(String digits) {     
       if(digits.length()==0||digits==null) return new ArrayList<String>();
       Map<Integer,String> map = new HashMap<>();
       map.put(2, "abc");
       map.put(3,"def");
       map.put(4, "ghi");
       map.put(5,"jkl");
       map.put(6,"mno");
       map.put(7, "pqrs");
       map.put(8, "tuv");
       map.put(9, "wxyz");
       return letterCombinations(digits,map);
    }
	
	public List<String> letterCombinations(String digits,Map<Integer,String> map){
		List<String> now = new ArrayList<>();
		
		if(digits.length() == 1) {
			String s = map.get(Integer.parseInt(digits));
			for(int i=0;i<s.length();i++) {
				now.add(""+s.charAt(i));
			}
			return now;
		}
		List<String> pre = letterCombinations(digits.substring(1),map);
		String head = map.get(Integer.parseInt(digits.substring(0,1)));
		
		for(String s : pre) {
			for(int j=0;j<head.length();j++) {
				now.add(head.charAt(j)+s);
			}
		}
		return now;
		
		
	}
	public static void main(String[] args) {
		seventeen s=new seventeen();
		String digits = "23";
		System.out.print(s.letterCombinations(digits));
	}
}
