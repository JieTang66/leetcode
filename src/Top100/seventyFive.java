package Top100;

public class seventyFive {
	public void sortColors(int[] nums) {
	    // 对于所有 idx < i : nums[idx < i] = 0
	    // j是当前考虑元素的下标
	    // 对于所有 idx > k : nums[idx > k] = 2
	    int l = 0;
        int r = nums.length-1;
        int curr = 0;
        int tmp;
        while(curr<=r){
            if(nums[curr]==0){
                tmp = nums[l];
                nums[l++] = nums[curr];
                nums[curr++] = tmp;
            }else if(nums[curr]==2){
                tmp = nums[curr];
                nums[curr] = nums[r];
                nums[r--] = tmp;
            }
            else curr++;
        }
        
	  }
		
	
}
