import java.util.Scanner;


class QuickSort{
	
	static void quicksort(int[]a,int st,int end){
		if(st<end){
		
			int pivInd=partition(a, st, end);
			quicksort(a,st,pivInd-1);
			quicksort(a,pivInd+1,end);
		}
	}
	
	static int partition(int[] a,int st,int end){
		
		int piv=a[end];
		int idx=st-1;
		
		for(int j=st;j<end;j++){
			if(a[j]<=piv){
				idx++;
				swap(a,idx,j);
			}
		}
		idx++;
		swap(a,idx,end);
		return idx;
	}
	
	static void swap(int[] a,int i,int j){
		int temp;
		temp=a[i];
		a[i]=a[j];
		a[j]=temp;
	}
	
	public static void main(String[] args){
		int[] a = {5,2,6,4,1,3};
		quicksort(a,0,a.length-1);
		System.out.println("After Sorting");
		for(int x:a){
			System.out.print(x+" ");
		}
	}
}
		
