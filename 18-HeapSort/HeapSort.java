import java.util.Arrays;
public class HeapSort{
	private static void heapify(int[] x){
		for(int i = 0;i < x.length;i++){
			upheap(x,i);
		}
	}
	private static int getP(int x){
		// Returns parent of said index
		return (x + 1) / 2 - 1;
	}
	private static int getC(int[] h,int x){
		// return child of index
		// it may be left or right
		// depending on which is lesser
		int a = (x + 1) * 2 - 1;
		int b = (x + 1) * 2;
		if(h[a] >= h[b]){
			return a;
		}
		else{
			return b;
		}
	}
	private static void swap(int[] x, int i1, int i2){
		int temp = x[i1];
		x[i1] = x[i2];
		x[i2] = temp;
	}
	private static void upheap(int[] x, int i){
		if(i == 0){
			return;
		}
		if(x[i] > x[getP(i)]){
			swap(x,i,getP(i));
			upheap(x,getP(i));
		}
	}
	private static void downheap(int[] x, int end, int i){
		try{
			int child = getC(x,i);
			if(child > end || x[child] < x[i]){
				return;
			}
			else{
				swap(x,i,child);
				downheap(x,end,child);
			}
		}
		catch(ArrayIndexOutOfBoundsException e){
			return;
		}
	}
	private static void heapsort(int[] x){
		int last = x.length - 1;
		while(last != 0){
			//Swaps the root node with a low level node
			swap(x,0,last);
			//Moves the end of the array one index down;
			last--;
			//Remakes the array
			downheap(x,last,0);
		}
	}
	public static void sort(int[] x){
		heapify(x);
		heapsort(x);
	}
	public static void main(String[] args){
		int[] a = new int[10];
		for(int i = 0;i < a.length;i++){
			a[i] = (int)(Math.random() * 10);
		}
		System.out.println("Original Array:  " + Arrays.toString(a));
		heapify(a);
		System.out.println("Heapified Array: " + Arrays.toString(a));
		heapsort(a);	
		System.out.println("Sorted Array:    " + Arrays.toString(a));
	}
}
