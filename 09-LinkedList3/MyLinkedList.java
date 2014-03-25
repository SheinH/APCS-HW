import java.util.*;
public class MyLinkedList<E> implements Iterable{
	private Node<E> head;
	private Node<E> tail;

	public MyLinkedList(){
		head = new Node<E>();
		tail = new Node<E>();
		head.setNext(tail);
	}
	public MyLinkedList(E[] a){
		this();
		for(E i : a){
			add(i);
		}
	}
	public void add(E s){
		Node<E> n = head;
		while(n.getNext() != tail){
			n = n.getNext();
		}
		Node<E> a = new Node<E>(s);
		a.setNext(n.getNext());
		n.setNext(a);
	}
	public void add(int i,E s){
		Node<E> n = head;
		for(;i != 0;i--){
			n = n.getNext();
			if(n == tail){
				throw new IndexOutOfBoundsException();
			}
		}
		Node<E> a = new Node<E>(s);
		a.setNext(n.getNext());
		n.setNext(a);
	}
	public void remove(int i){
		Node<E> n = head;
		for(;i > 0;i--){
			n = n.getNext();
		}
		if(n.getNext() == tail){
			throw new IndexOutOfBoundsException();
		}
		else{
			n.setNext(n.getNext().getNext());
		}
	}
	public E get(int i){
		Node<E> n = head.getNext();
		for(;i > 0;i--){
			n = n.getNext();
			if(n == tail){
				throw new IndexOutOfBoundsException();
			}
		}
		return n.getData();
	}
	public void set(int i,E s){
		Node<E> n = head.getNext();
		for(;i > 0;i--){
			n = n.getNext();
			if(n == tail){
				throw new IndexOutOfBoundsException();
			}
		}
		n.setData(s);
	}
	public int find(E s){
		int c = 0;
		Node<E> n = head.getNext();
		while(!(n.getData().equals(s))){
			n = n.getNext();
			if(n == tail){
				return -1;
			}
		}
		return c;
	}
	public int length(){
		int r = 0;
		Node<E> n = head.getNext();
		while(n != tail){
			n = n.getNext();
			r++;
		}
		return r;
	}
	public String toString(){
		String s = "[";
		Node<E> x = head.getNext();
		while(x != tail){
			s += x + ", ";
			x = x.getNext();
		}
		s = s.substring(0,s.length() - 2) + "]";
		return s;
	}
	class MyIterator<E> implements Iterator<E>{
		MyLinkedList<E> list;
		int i;
		public MyIterator(MyLinkedList<E> l){
			list = l;
			i = 0;
		}
		public boolean hasNext(){
			return i < list.length();
		}
		public E next(){
			E a = list.get(i);
			i++;
			return a;
		}
		public void remove(){
			list.remove(i);
		}
	}
	public Iterator<E> iterator(){
		return new MyIterator<E>(this);
	}
	public static void main(String[] args){
		MyLinkedList<Integer> l = new MyLinkedList<Integer>();
		for(int i = 1;i < 10;i++){
			l.add(new Integer(i));
		}
		for(Integer i : l){
			System.out.println(i);
		}
	}
}