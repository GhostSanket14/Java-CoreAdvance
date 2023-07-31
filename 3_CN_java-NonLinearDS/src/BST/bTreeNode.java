package BST;

public class bTreeNode<T> {
	
	public bTreeNode(T data) {
		this.data=data;
	}
	
public T data;
public bTreeNode<T> left;
public bTreeNode<T> right;
}