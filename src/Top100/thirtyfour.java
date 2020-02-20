package Top100;

public class thirtyfour {
	//二分法分别先找出左边界和右边界，再考虑一些特殊情况
	int target;
    int[] nums;
    public int[] searchRange(int[] nums, int target) {
        this.nums = nums;
		this.target = target;
       
        int start = left_bound(nums,target);
        int end = right_bound(nums,target);
        if(start<0||start>=nums.length){
            start = -1;
            end = -1;
        }
        if(start>=0&&start<nums.length){
            if(target!=nums[start]){
                start = -1;
                end = -1;
            }
        }
        
        return new int[]{start,end};
    }
    //二分查找实现
    public int left_bound(int[] nums, int target) {
        if (nums.length == 0) return -1;
        int left = 0;
        int right = nums.length; // 注意
    
        while (left < right) { // 注意
            int mid = (left + right) / 2;
            if (nums[mid] == target) {
                right = mid;
                
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else if (nums[mid] > target) {
                right = mid; // 注意
            }
        }
        return left;
    }
    
    public int right_bound(int[] nums,int target){
        
        if(nums.length == 0) return -1;
        int left = 0;
        int right = nums.length;
        
        while (left < right){
            int mid = (left+right)/2;
            if(nums[mid] == target){
                left = mid+1;
            }else if(nums[mid]>target){
                right = mid;
            }else if(nums[mid]<target){
                left = mid+1;
            }
        }
        return left - 1;
    }
	/*
	 * 找出左边界，根据左边界确定范围
	private int extremeInsertionIndex(int[] nums,int target,boolean left) {
		int lo = 0;
		int hi = nums.length;
		
		while(lo<hi) {
			int mid = (lo+hi)/2;
			if(nums[mid]>target||(left&&target==nums[mid])) {
				hi = mid;
			}else {
				lo = mid +1;
			}
		}
		return lo;
	}
	public int[] searchRange(int[] nums,int target) {
		int[] targetRange = {-1,-1};
		int leftIdx =  extremeInsertionIndex(nums,target,true);
		if(leftIdx == nums.length||nums[leftIdx]!=target) {
			return targetRange;
		}
		targetRange[0] = leftIdx;
		targetRange[1] = extremeInsertionIndex(nums,target,false)-1;
		
		return targetRange;
	}
	*/
	
	/*
	 * 二分法求出一个符合的值，向两边扩散，但是复杂度最大为O（n），不符合题目要求
	int target;
    int[] nums;
    public int[] searchRange(int[] nums, int target) {
        this.nums = nums;
		this.target = target;
       
        int res = bsearch(0,nums.length-1);
        int start=res;
        int end = res;      
        if(nums.length==1||bsearch(0,nums.length-1)==-1){
            return new int[]{bsearch(0,nums.length-1),bsearch(0,nums.length-1)};
        }        
        while(res+1<=nums.length-1){
            if(nums[res+1]==target){
                end = res+1;             
            } 
            res++;          
        }
        while(res-1>=0){
            if(nums[res-1]==target){
                start = res-1;          
            }
            res--;
        }          
        return new int[]{start,end};
    }
    //二分查找实现
    public int bsearch(int l, int r){ 
        while(l<=r){
            int mid = (l+r)/2;
            if(nums[mid]==target){
                return mid;
            }else{
                if(nums[mid]>target){
                    r=mid-1;
                }else if(nums[mid]<target){
                    l=mid+1;
                }
            }
            
        }
        
        return -1;  
    }
    public static void main(String[] args) {
    	thirtyfour tf = new thirtyfour();
    	int []nums= {5,7,7,8,8,10};
    	int target = 8;
    	System.out.println(tf.searchRange(nums,target));
    }
    */
	
    
}
