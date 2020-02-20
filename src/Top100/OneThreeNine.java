package Top100;

import java.util.ArrayList;
import java.util.List;

class OneThreeNine {
    public boolean wordBreak(String s, List<String> wordDict) {
        
        return helper(s,0,wordDict);
    }
    
    public boolean helper(String s, int l, List<String> wordDict){
        
        for(int i=l+1;i<=s.length();i++){
            if(i==s.length()){
                if(!wordDict.contains(s.substring(l,i))){
                    return false;
                }else{
                    return true;
                } 
            }
            if(wordDict.contains(s.substring(l,i))){
                if(helper(s,i,wordDict)){
                    return true;
                } 
            }
            
        }
        return false;
    }
    
    public static void main(String[] args) {
    	OneThreeNine o=new OneThreeNine();
    	List<String> wordDict=new ArrayList<>();
    	wordDict.add("a");
    	wordDict.add("aa");
    	wordDict.add("aaa");
    	String s="aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaab";
    	//o.wordBreak(s, wordDict);
    	System.out.println(s.length());
    	System.out.println(o.wordBreak(s, wordDict));
    }
}