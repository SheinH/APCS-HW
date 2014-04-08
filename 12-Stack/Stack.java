import java.util.*;
public class Stack{
	private String[] stack;
	private int index;
	private Stack(){
		stack = new String[1];
		index = 0;
	}
	private void push(String x){
		if(index < stack.length){
			stack[index++] = x;
		}
		else{
			stack = Arrays.copyOf(stack,stack.length * 2);
			push(x);
		}
	}
	private String pop(){
		if(index == 0){
			throw new EmptyStackException();
		}
		else{
			String r = stack[index - 1];
			stack[index - 1] = null;
			index--;
			return r;
		}
	}
	private String peek(){
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
    		a.push(x);
    	}
    	System.out.println(a);
    	System.out.println(a.pop());
    	System.out.println(a.pop());
    	System.out.println(a.pop());
    	System.out.println(a);
    }
}