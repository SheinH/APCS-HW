import java.util.Arrays;
public class Cross{
	public static int sumCross(int[][] a,int r, int c){
		int sum = -1 * a[r][c];
		for(int i : a[r]){
			sum += i;
		}
		for(int[] row : a){
			sum += row[c];
		}
		return sum;
	}
	public static void main(String[] args){
		int[][] a = new int[3][3];
		a[0] = new int[]{1,2,3};
		a[1] = new int[]{4,5,6};
		a[2] = new int[]{7,8,9};
		System.out.println("The array:");
		System.out.println();
		System.out.println("[" + Arrays.toString(a[0]));
		System.out.println(" " + Arrays.toString(a[1]));
		System.out.println(" " + Arrays.toString(a[2]) + "]");
		System.out.println();
		System.out.println("sumCross(a,1,1,): " + sumCross(a,1,1));
		System.out.println();
		System.out.println("2 + 4 + 5 + 6 + 8 = " + (2 + 5 + 8 + 4 + 6));
	}
}