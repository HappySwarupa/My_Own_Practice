package corejava;
import java.util.*;
public class MultiplicationOfMultiDimentionalArrayExample {
	
	public static void main(String args[]) {
		int a[][]= {{2,3,4},{5,6,7},{8,9,10}};
		int b[][]= {{11,12,13},{14,15,16},{17,18,19}};
		int c[][]= new int[3][3];
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				c[i][j]=0;
				for(int k=0;k<3;k++) {
					
					c[i][j]+=a[i][k]*b[k][j];
			
				}
				System.out.println(c[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
