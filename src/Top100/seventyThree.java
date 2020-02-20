package Top100;

import java.util.HashSet;
import java.util.Set;

public class seventyThree {
	public void setZeroes(int[][] matrix) {
		boolean rowFlag = false;
        //判断首行
        for (int i = 0; i < matrix[0].length; i++) {
            if (matrix[0][i] == 0) {
                rowFlag = true;
                break;
            }
        }

        boolean colFlag = false;
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][0] == 0) {
                colFlag = true;
                break;
            }
        }

        for (int i = 1; i < matrix.length; i++) {
            for (int j = 1; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0){
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        for (int i = 1; i < matrix[0].length; i++) {
            if (matrix[0][i] == 0) {
                for (int j = 0; j < matrix.length; j++) {
                    matrix[j][i] = 0;
                }
            }
        }

        for (int i = 1; i < matrix.length; i++) {
            if (matrix[i][0] == 0) {
                for (int j = 0; j < matrix[0].length; j++) {
                    matrix[i][j] = 0;
                }
            }
        }
        if (rowFlag){
            for (int i = 0; i < matrix[0].length; i++) {
                matrix[0][i] = 0;
            }
        }
        if (colFlag){
            for (int i = 0; i < matrix.length; i++) {
                matrix[i][0] = 0;
            }
        }
		/*int R = matrix.length;
		int C = matrix[0].length;
		Set<Integer> rows = new HashSet<Integer>();
		Set<Integer> cols = new HashSet<Integer>();
		
		for(int i=0;i<R;i++) {
			for(int j=0;j<C;j++) {
				if(matrix[i][j]==0) {
					rows.add(i);
					cols.add(j);
				}
			}
		}
		
		for(int i=0;i<R;i++) {
			for(int j=0;j<C;j++) {
				if(rows.contains(i)||cols.contains(j)) {
					matrix[i][j]=0;
				}
			}
		}
		*/
	}
	
}
