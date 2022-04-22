package bhava;
import java.util.Scanner;

public class MatrixEqualOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i,j,rows,columns,isEqual=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no.of rows and columns:");
		rows=sc.nextInt();
		columns=sc.nextInt();
		int[][]x=new int[rows][columns];
		int[][]y=new int[rows][columns];
		System.out.println("enter the first matrix elements:");
		for(i=0;i<rows;i++) {
			for(j=0;j<columns;j++) {
				x[i][j]=sc.nextInt();
				
			}
		}
		System.out.println("enter the second matrix elemens:");
		for(i=0;i<rows;i++) {
			for(j=0;j<columns;j++) {
				y[i][j]=sc.nextInt();
			}
		}
		for(i=0;i<x.length;i++) {
			for(j=0;j<x[0].length;j++) {
				if(x[i][j]!=y[i][j]) {
					isEqual=0;
					break;
					
				}}}
		if(isEqual==1) {
			System.out.println("matrix x is equal to y");
		}else {
			System.out.println("matrix x is not equal to y");
			
				}
			}
			
	




		
		

	
	
	
	}


