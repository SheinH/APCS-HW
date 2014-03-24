import java.util.*;
public class MyLinkedList{
	private Node head;
	public MyLinkedList(){
		head = null;
	}
	public MyLinkedList(String[] a){
		this();
		for(int i = a.length - 1;i != -1;i--){
			add(a[i]);
		}
	}
	public void add(String d){
		Node n = new Node(d);
		n.setNext(head);
		head = n;
	}
	public void add(int i,String s){
		if(i == 0){
			add(s);
		}
		else{
			Node n = head;
			for(;i != 1;i--){
				n = n.getNext();
				if(n == null){
					throw new IndexOutOfBoundsException();
				}
			}
			Node a = new Node(s);
			a.setNext(n.getNext());
			n.setNext(a);
		}
	}
	public void remove(int i){
		if(i == 0){
			head = head.getNext();
		}
		else{
			Node n = head;
			for(;i > 1;i--){
				n = n.getNext();
			}
			if(n.getNext() == null || n.getNext().getNext() == null){
				throw new IndexOutOfBoundsException();
			}
			else{
				n.setNext(n.getNext().getNext());
			}
		}
	}
	public String get(int i){
		Node n = head;
		for(;i > 0;i--){
			n = n.getNext();
			if(n == null){
				throw new IndexOutOfBoundsException();
			}
		}
		return n.getData();
	}
	public void set(int i,String s){
		Node n = head;
		for(;i > 0;i--){
			n = n.getNext();
			if(n == null){
				throw new IndexOutOfBoundsException();
			}
		}
		n.setData(s);
	}
	public int find(String s){
		int c = 0;
		Node n = head;
		while(!(n.getData().equals(s))){
			n = n.getNext();
			if(n == null){
				return -1;
			}
		}
		return c;
	}
	public int length(){
		int r = 0;
		Node n = head;
		while(n != null){
			n = n.getNext();
			r++;
		}
		return r;
	}
	public String toString(){
		String s = "[";
		Node x = head;
		while(x != null){
			s += x + ", ";
			x = x.getNext();
		}
		s = s.substring(0,s.length() - 2) + "]";
		return s;
	}
	public static void main(String[] args){
		MyLinkedList a = new MyLinkedList(args);
		List b = Arrays.asList(args);
		System.out.println(a);
		System.out.println(b);
		a.add(2,"Index 2");
		System.out.println(a);
		System.out.println(a.get(0));
		a.remove(2);
		System.out.println(a);
		System.out.println(a.find("whatup"));
		System.out.println(a.length());
	}
}