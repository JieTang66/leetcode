package Top100;

public class eleven {
	//暴力法
	/*
	public int maxArea(int[] height) {
        int area = 0;
        int tmp=0;
        int res=0;
        for(int i=0;i<height.length-1;i++){
            for(int j=i+1;j<height.length;j++){
                if(height[i]<height[j]){
                    tmp = height[i];  
                }else{
                    tmp = height[j];
                }
                area=(j-i)*tmp;
                if(area>res){
                    res=area;
                }
            }
        }
        return res;
    }
    */
	//双指针：我们在由线段长度构成的数组中使用两个指针，一个放在开始，一个置于末尾。
	//此外，我们会使用变量area来持续存储到目前为止所获得的最大面积。 
	//在每一步中，我们会找出指针所指向的两条线段形成的区域，更新area,并将指向较短线段的指针向较长线段那端移动一步。  
	public int maxArea(int[] height) {
		int area = 0;
		int l=height.length-1;
		int r=0;
		while(r<l) {
			area=Math.max(area, Math.min(height[r], height[l])*(l-r));
			if(height[r]<height[l]) {
				r+=1;
			}else {
				l-=1;
			}
			
		}
		return area;
	}
}











