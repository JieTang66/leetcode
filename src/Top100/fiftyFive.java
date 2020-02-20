package Top100;

public class fiftyFive {
	public boolean canJump(int[] nums) {
		int lastPos = nums.length - 1;
		for(int i = nums.length - 1; i>=0;i--) {
			if(i+nums[i]>=lastPos) {
				lastPos = i;
			}
		}
		return lastPos == 0;
		/*
		if(nums.length==1){
            return true;
        }
        int j=0;
		for(int i=0;i<nums.length-1;i++) {
            j = Math.max(i+nums[i],j);
            if(j>=nums.length-1) {
            	return true;
            }
			if(nums[i]==0&&i!=nums.length-1){ 
                if(i>=j) {
                	return false;
                }else if(i<j) {
                	continue;
                }
                
            }		
			
		}
		return true;
		*/
		
	}
}
