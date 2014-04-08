import java.util.*;
public class Stack{
	private double[] stack;
	private int index;
	public Stack(){
		stack = new double[10];
		index = 0;
	}
	public void push(double x){
		if(index < stack.length){
			stack[index++] = x;
		}
		else{
			stack = Arrays.copyOf(stack,stack.length * 2);
			push(x);
		}
	}
	public double pop(){
		if(index == 0){
			throw new EmptyStackException();
		}
		else{
			index--;
			return stack[index];
		}
	}
	public double peek(){
		return stack[index];
	}
    public boolean isEmpty() {
    	return index == 0;
    }
    public String toString(){
    	if(isEmpty()){
    		return "[]";
    	}
    	else{
    		String r = "[";
    		for(int i = 0;i < index;i++){
    			r += stack[i] + ", ";
    		}
    		return r.substring(0,r.length() - 2) + "]";
    	}
    }
    public static void main(String[] args){
    	Stack a = new Stack();
    	for(String x : args){
    		a.push(Double.parseDouble(x));
    	}
    	System.out.println(a);
    	System.out.println(a.pop());
    	System.out.println(a.pop());
    	System.out.println(a.pop());
    	System.out.println(a);
    }
}