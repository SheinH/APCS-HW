import java.util.HashSet;
import java.util.TreeSet;
// Since these sets are based on maps, their performance
// reflects those of the maps they are based on.
// Usage: Compile, and then run:
// java MapCompare x
// where x represents the number of integers the program
// adds to each map.
public class MapCompare{
	public static void main(String[] args){
		HashSet a = new HashSet();
		TreeSet b = new TreeSet();
		int count = Integer.parseInt(args[0]);
		long time = System.currentTimeMillis();
		for(int i = count; i != 0; i--){
			int x = (int)(Math.random() * 1000);
			a.add(x);
		}
		System.out.println("HashMap Insertion: " + (System.currentTimeMillis() - time));
		time = System.currentTimeMillis();
		for(int i = count; i != 0; i--){
			int x = (int)(Math.random() * 1000);
			b.add(x);
		}
		System.out.println("TreeMap Insertion: " + (System.currentTimeMillis() - time));
	}
}
