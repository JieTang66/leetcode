package Top100;

import java.util.ArrayList;
import java.util.List;

public class fiftySix {
	public int[][] merge(int[][] intervals) {
		ArrayList<int[]> list = new ArrayList<int[]>();
		int [] tmp = new int[2];
        if(intervals==null){
            return null;
        }
        
		for(int i = 0; i < intervals.length; i++) {
			for(int j=0; j+i<intervals.length;j++) {
				
				if(intervals[i][1]<intervals[i+j][0]) {
					continue;
				}
				if(intervals[i][0]<intervals[i+j][0]&&intervals[i][1]>=intervals[i+j][0]) {
					tmp[0]=intervals[i][0];
					tmp[1]=Math.max(intervals[i][1], intervals[i+j][1]);
					list.add(tmp);
					intervals[i]=tmp;
					intervals[i+j]=null;
				}
				if(intervals[i+j][0]<=intervals[i][0]&&intervals[i+j][1]>=intervals[i][0]) {
					tmp[0]=intervals[i+j][0];
					tmp[1]=Math.max(intervals[i][1], intervals[i+j][1]);
					list.add(tmp);
					intervals[i]=tmp;
					intervals[i+j]=null;
				}
			}		
			
		}
		for(int m = 0;m<intervals.length;m++) {
			while(intervals[m]!=null) {
				list.add(intervals[m]);
			}
		}
		int[][] res = new int[1][];
		return list.toArray(res);
    }
}
