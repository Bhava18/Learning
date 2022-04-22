package bhava;
import java.util.Scanner;

public class ArrayArithmetic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][],b[][],c[][],i,j;
		 a=new int[3][3];
		 b=new int[3][3];
		 c=new int[3][3];
		 Scanner input=new Scanner(System.in);
		 System.out.println("enter the values of first matrix:");
		 for(i=0;i<3;i++) {
			 for(j=0;j<3;j++) {
				 a[i][j]=input.nextInt();
			 }
		 }
			 System.out.println("enter the values of second matrix:");
			 for(i=0;i<3;i++) {
				 for(j=0;j<3;j++) {
					 b[i][j]=input.nextInt();
				 }
			 }
			 System.out.println("Additon of matrix:");
			 for(i=0;i<3;i++) {
				 for(j=0;j<3;j++) {
					 c[i][j]=a[i][j]+b[i][j];
					 System.out.print(c[i][j]+" ");}
				 System.out.println(" ");
				 }
			 int array[][]= {{2,3},{2,3}};
			 int array1[][]= {{2,3},{2,3}};
			 if(array. equals(array1)) {
				 System.out.println("both are equal");
			 }else {
				 System.out.println("not equal");
			 }
			 
			 }
}
	
			
						
					 
				 
		 
				 
			 
	


	


