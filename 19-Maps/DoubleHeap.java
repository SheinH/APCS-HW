import java.util.PriorityQueue;
import java.util.Arrays;
import java.util.Comparator;
public class DoubleHeap{
	class ReverseCompare implements Comparator<Integer>{
		public int compare(Integer a, Integer b){
			return 0 - a.compareTo(b);
		}
	}
	private PriorityQueue<Integer> lower;
	private PriorityQueue<Integer> upper;
	public DoubleHeap(){
		lower = new PriorityQueue<Integer>();
		upper = new PriorityQueue<Integer>(11, new ReverseCompare());
	}
	public void add(int x){
		if(lower.size() == upper.size()){
			lower.add(x);
		}
		else{
			upper.add(x);
		}
	}
	public void removeMedium(){
		if(lower.size() == upper.size()){
			upper.poll();
		}
		else{
			lower.poll();
		}
	}
	public int findMedium(){
		int low = lower.peek();
		int high = upper.peek();
		if(lower.size() == upper.size()){
			return low + high / 2;
		}
		else{
			return low;
		}
	}
	public static void main(String[] args){
		int[] a = new int[10];
		for(int i = 0; i < 10; i++){
			a[i] = (int)(Math.random() * 10);
		}
		System.out.println("Integers : " + Arrays.toString(a));
		DoubleHeap b = new DoubleHeap();
		for(int i : a){
			b.add(i);
		}
		System.out.println("Medium : " + b.getMedium());
	}
}
