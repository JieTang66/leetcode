package Top100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class fifteen {
	public List<List<Integer>> threeSum(int[] nums) {
        List<Integer> n = new ArrayList();
        List<List<Integer>> m = new ArrayList();
        Arrays.sort(nums);
        if(nums.length<3||nums==null){
            return m;
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                break;
            }
           
            if(i > 0 && nums[i] == nums[i-1]) continue;
            
            int l=i+1;
            int r=nums.length-1;
            while(l<r){
                int sum = nums[l]+nums[r]+nums[i];
                if(sum==0){
                	/*
                    n.add(nums[i]);
                    n.add(nums[l]);
                    n.add(nums[r]);
                    Collections.sort(n);
                    if(m.contains(n)==false){
                        m.add(n);
                    }            
                    n=new ArrayList();
                    */
                	m.add(Arrays.asList(nums[i],nums[l],nums[r]));
                    while(l<r&&nums[l]==nums[l+1]){
                        l++;
                    }
                    while(l<r&&nums[r]==nums[r-1]){
                        r--;
                    }
                    l++;
                    r--;
                }else if(sum>0){
                    r--;
                }else{
                    l++;
                }
            }
        }        
        
        return m;
    }
}
