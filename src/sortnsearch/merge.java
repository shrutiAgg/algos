package sortnsearch;

public class merge {
 
	public static void main(String args []) {
		
		int A[]= {9,8,7,2,3,4};
		merge m = new merge();
		m.merge_sort(A,0,5);
		System.out.println("After");
	}
	
	public void merge_sort(int A[],int start,int end) {
		
		if( start < end ) {
	           int mid = (start + end ) / 2 ;           
	           merge_sort (A, start , mid ) ;  
	           merge_sort (A,mid+1 , end ) ; 
	           merge(A, start,mid,end);
	}
		
}
	public void merge(int A[], int s, int m, int e) {
			System.out.println("Array"+A[s]);
	}
}
