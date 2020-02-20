package Top100;

import java.util.HashMap;
import java.util.Map;

public class theFirst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] nums= {2,7,11,15};
		int target = 9;
		
		int[] r = twoSum(nums,target);
		System.out.println(r[0]);
		System.out.println(r[1]);

	}
/*暴力法
 * public int[] twoSum(int[] nums, int target) {
        int i;
        int j=0;
        for(i=0;i<nums.length;i++){
            for(j=i+1;j<nums.length;j++){          
                if(target==nums[i]+nums[j]){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{i,j};
    }
    哈希表
	public static int[] twoSum(int[] nums, int target) {
		// TODO Auto-generated method stub
		Map<Integer,Integer> map=new HashMap<Integer,Integer>();
		int[] m = new int[2];
		for(int i=0;i<nums.length;i++) {
			if(map.containsKey(nums[i])) {
				m[0] = map.get(nums[i]);
				m[1] = i;
				return m;
			}
			map.put(target-nums[i], i);
		}
		return m;
	}
	
*/
	public static int[] twoSum(int[] nums, int target) {
		Map<Integer,Integer> map = new HashMap<>();
		for(int i=0;i<nums.length;i++) {
			int m = target - nums[i];
			if(map.containsKey(m)) {
				return new int[] {map.get(m),i};
			}
			map.put(nums[i], i);
		}
		throw new IllegalArgumentException("No two sum solution");
	}
	
	

}
