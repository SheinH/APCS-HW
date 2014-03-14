import java.util.Arrays;
public class QuickSortSwap{
	public static void quickSort(int[] a){
		quickSort(a,0,a.length);
	}
	private static void quickSort(int[] a, int low,int high){
		if(high - low >= 2){
			swap(a,low,(low + high ) / 2);
			int left = low + 1;
			int right = high - 1;
			while(left < right){
				if(a[right] >= a[low]){
					right--;
				}
				else if(a[left] < a[low]){
					left++;
				}
				else{
					swap(a,left,right);
				}
			}
			if(a[left] < a[low]){
				swap(a,left,low);
			}
			quickSort(a,low,left);
			quickSort(a,left + 1,high);
		}
	}
	private static void swap(int[] x, int a, int b){
		int temp = x[a];
		x[a] = x[b];
		x[b] = temp;
	}
	public static void main(String[] args){
		int[] a = new int[100];
		for(int i = 0; i < a.length; i++){
			a[i] = (int)(Math.random() * 100);
		}
		System.out.println(Arrays.toString(a));
		quickSort(a);
		System.out.println("Sorted:");
		System.out.print(Arrays.toString(a));
	}
}