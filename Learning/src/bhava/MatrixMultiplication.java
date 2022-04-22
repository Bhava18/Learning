package bhava;
public class MatrixMultiplication {
public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i1[][]= {
				{1,2,3},
				{4,5,6},
				

		};
						
int i2[][]= {
				{7,8},
				{1,2},
				{9,10}
		};
//		the resultant matrix must be in the order of 2*2
		int Sum=0;
		int r[][]=new int[2][2];
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				// here k is no.of columns of 1st matrix and no.of rows of 2nd matrix
				for(int k=0;k<3;k++) {
					Sum=Sum+i1[i][k]*i2[k][j];
				}
					r[i][j]=Sum;
					Sum=0;
					}
}
		for(int result[]:r) {
			for(int resultantMatrix:result) {
				System.out.print(resultantMatrix+" ");}
			System.out.println(" ");
				}}}


