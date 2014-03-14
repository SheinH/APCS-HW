import java.util.Arrays;
import java.util.ArrayList;
public class QuickSort{
	private static int pivot(int[] a, int p, int low, int high){
		if(p > 0 && p < a.length){
			ArrayList<Integer> lower = new ArrayList<Integer>();
			ArrayList<Integer> higher = new ArrayList<Integer>();
			int pivot = a[p];
			for(int i = low;i < high;i++){
				if(i != p){
					if(a[i] < pivot){
						lower.add(new Integer(a[i]));
					}
					else{
						higher.add(new Integer(a[i]));
					}
				}
			}
			int index = low;
			for(Integer x : lower){
				a[index++] = x;
			}
			a[index++] = pivot;
			for(Integer x : higher){
				a[index++] = x;
			}
			return lower.size() + 1;
		}
		return -1;
	}
	private static int pivot(int[] a,int p){
		return pivot(a,p,0,a.length);
	}
	private static int pivot(int[] a){
		return pivot(a,(int)(Math.random() * a.length),0,a.length);
	}
	public static void sort(int[] a){
		if(a.length > 1){
			int pivot = pivot(a);
			int[] lower = Arrays.copyOfRange(a,0,pivot);
			int[] higher = Arrays.copyOfRange(a,pivot + 1,a.length);
			pivot = a[pivot];
			sort(lower);
			sort(higher);
			int index = 0;
			for(int i : lower)
				a[index++] = i;
			a[index++] = pivot;
			for(int i : higher)
				a[index++] = i;
		}
	}
	public static void main(String[] args){
		int[] a = new int[args.length];
		for(int i = 0;i < a.length;i++){
			a[i] = Integer.parseInt(args[i]);
		}
		System.out.println(pivot(a));
		System.out.println(Arrays.toString(a));
	}
}