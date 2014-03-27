public class DoubleLL<E>{
	private class Node<E>{
		E data;
		Node<E> next,prev;
		public Node(E d){
			this.data = d;
		}
		public String toString(){
			return "" + data;
		}
		public void setData(E d){
			data = d;
		}
		public E getData(){
			return data;
		}
		public void setNext(Node<E> n){
			next = n;
		}
		public Node<E> getNext(){
			return next;
		}
		public void setPrev(Node<E> n){
			prev = n;
		}
		public Node<E> getPrev(){
			return prev;
		}
	}
	private Node<E> current;
	public void insert(E d){
		Node<E> n  = new Node<E>(d);
		if(current == null){
			current = n;
		}
		else{
			if(current.prev != null){
				n.prev = current.prev;
				current.prev.next = n;
			}
			n.next = current;
			current.prev = n;
			current = n;
		}
	}
	public E getCurrent(){
		return current.getData();
	}
	public void forward(){
		if(current.getNext() != null){
			current = current.getNext();
		}
	}
	public void back(){
		if(current.getPrev() != null){
			current = current.getPrev();
		}
	}
	public String toString(){
		if(current == null){
			return "";
		}
		while(current.getPrev() != null){
			current = current.getPrev();
		}
		Node<E> tmp = current;
		String s = "[";
		while(tmp != null){
			s = s + tmp.getData() + ", ";
			tmp = tmp.getNext();
		}
		s = s.substring(0,s.length() - 2) + "]";
		return s;
	}
	public static void main(String[] args){
		DoubleLL<String> L = new DoubleLL<String>();
		System.out.println(L);
		L.insert("hello");
		System.out.println("Current: " + L.getCurrent());
		System.out.println(L);
		L.insert("world");
		System.out.println("Current: " + L.getCurrent());
		System.out.println(L);
		L.insert("three");
		System.out.println("Current: " + L.getCurrent());
		System.out.println(L);
		// First test up to here
		System.out.println("Current: " + L.getCurrent());
		L.forward();
		System.out.println("Current: " + L.getCurrent());
		L.insert("inserted");
		System.out.println(L);
	}
}