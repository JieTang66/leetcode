package Top100;

public class fourteen {
	public String longestCommonPrefix(String[] strs) {
        if(strs.length==0){
            return "";
        }
        String tmp = strs[0];
        for(int i=0;i<strs.length;i++){
            int j=0;
            for(;j<tmp.length()&&j<strs[i].length();j++){
                if(tmp.charAt(j)!=strs[i].charAt(j)){
                    break;
                }                   
            }
            tmp=tmp.substring(0,j);
            if(tmp.equals("")){
                return tmp;
            }
        }
        return tmp;
    }
}
