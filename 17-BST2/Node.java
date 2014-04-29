public class Node{
	private Node left;
	private Node right;
	private int data;
	public Node(int x){
		data = x;
	} 
	public Node getLeft(){
		return left;
	}
	public Node getRight(){
		return right;
	}
	public void setLeft(Node x){
		left = x;
	}
	public void setRight(Node x){
		right = x;
	}
	public int getData(){
		return data;
	}
	public void setData(int x){
		data = x;
	}
}
