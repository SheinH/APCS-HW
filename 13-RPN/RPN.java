public class RPN{
	private final String integers = "0123456789";
	public static double interpret(String[] x){
		Stack numbers = new Stack();
		for(String i : x){
			if(i.equals("")){
				continue;
			}
			else if(i.equals("+")){
				double n1 = numbers.pop();
				double n2 = numbers.pop();
				numbers.push(n1 + n2);
			}
			else if(i.equals("-")){
				double n1 = numbers.pop();
				double n2 = numbers.pop();
				numbers.push(n1 - n2);
			}
			else if(i.equals("x")){
				double n1 = numbers.pop();
				double n2 = numbers.pop();
				numbers.push(n1 * n2);
				// Note: I used the main method with args to test this.
				// I used x instead of * as an operator because
				// * is a reserved character in the windows terminal
				// and this breaks the code
			}
			else if(i.equals("/")){
				double n1 = numbers.pop();
				double n2 = numbers.pop();
				numbers.push(n1 / n2);
			}
			else{
				numbers.push(Double.parseDouble(i));
			}
		}
		return numbers.pop();
	}
	public static void main(String[] args){
		System.out.println(interpret(args));
	}
}