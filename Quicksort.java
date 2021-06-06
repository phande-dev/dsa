package test;

import java.util.Arrays;

public class Quicksort{
	public static void main(String[] args) {
		int[] a = { 1,3,5,2,4,6,7};
		int[] b=quickSort(a,0,a.length-1);  
		System.out.println(Arrays.toString(b));
	}
	public static int[]  quickSort(int[] a,int lb,int ub){		  		
			int l=lb;
			int r= ub; int pivote= a[lb];
			while(l<=r) {
				
				while(a[l]<=pivote) {
					l++;
				}while(a[r]>pivote) {
					r--;
				}
				 if(l<=r) {
				int temp=a[l];
				a[l]=a[r];		
				 a[r]=temp;
				 l++;
				 r--;}
			}
			int temp= a[r];
			a[r]=a[lb];
			a[lb] =temp;
			if (lb<r) {quickSort(a, lb, r);	}
			if (ub>l) {quickSort(a,l,ub);}
				return a;	  

	  }

}
