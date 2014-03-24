public class Node{
	private String data;
	private Node next;
	public Node(){
		data = null;
		next = null;
	}
	public Node(String s){
		data = s;
		next = null;
	}
	public void setData(String d){
		data = d;
	}
	public String getData(){
		return data;
	}
	public void setNext(Node n){
		next = n;
	}
	public Node getNext(){
		return next;
	}
	public String toString(){
		return data;
	}
	public static void main(String[] args){
		Node n1 = new Node(args[0]);
		Node n2 = new Node(args[1]);
		n1.setNext(n2);
		System.out.println(n1.getNext());
		System.out.println(n2);
		n2.setNext(new Node(args[2]));
		System.out.println(n2.getNext());
		n1.setNext(n1.getNext().getNext());
		System.out.println(n1.getNext());
	}
}