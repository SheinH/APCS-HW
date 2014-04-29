public class BinarySearchTree{
	private Node root;
	public BinarySearchTree(int x){
		root = new Node(x);
	}
	public Node search(int x){
		Node n = root;
		while( ! (n == null || n.getData() == x)){
			if(x < n.getData()){
				n = n.getLeft();
			}
			else{
				n = n.getRight();
			}
		}
		return n;
	}
	public Node search2(int x){
		return searchhelp(int x, root);
	}
	public void insert(int x){
		Node n = root;
		while(1 == 1){
			if(x < n.getData()){
				if(n.getLeft() == null){
					n.setLeft(new Node(x));
					break;
				}
				else{
					n = n.getLeft();
				}
			}
			else{
				if(n.getRight() == null){
					n.setRight(new Node(x));
					break;
				}
				else{
					n = n.getRight();
				}
			}
		}
	}
	public void remove(Node x){
		Node left = x.getLeft();
		Node right = x.getRight();
		x = null;
		insert(left);
		insert(right);
}
