import java.util.Arrays;


public class QuickSort {
	public static void main(String args[]){
		int[] a = {1,3,45,23,54,195,2,6};
		//swap(a,2,3);
		quickSort(a,0,a.length-1);
		System.out.println(Arrays.toString(a));
	}
	
	public static void quickSort(int[] a, int low, int high){
		if(low < high){
			int p = partition(a,low,high);
			quickSort(a,low,p-1);
			quickSort(a,p+1,high);
		}
	}
	public static int partition(int[] a, int low, int high){
		int pivot = a[high];
		int j = low;
		for(int i = low; i < high; i++){
			if (a[i] < pivot){
				swap(a,i,j);
				j++;
			}
		}
		swap(a,j,high);
		return j;
	}
	public static void swap(int[] a, int b, int c){
		int t = a[b];
		a[b] = a[c];
		a[c] = t;
	}
}
