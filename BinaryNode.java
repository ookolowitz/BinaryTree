package assign08;


public class BinaryNode <T> {
	T data;
	T leftChild;
	T rightChild;
	
	public BinaryNode(T data) {
		this.data = data;
		this.leftChild = leftChild;
		this.rightChild = rightChild;
		
	}
	
	public T getData() {
		return this.data;
	}
	
	public void setData(T data) {
		this.data = data;
	}
	
	
	public void setLChild(T lChild) {
		this.leftChild = lChild;
	}
	
	public void setRChild(T rChild) {
		this.rightChild = rChild;
	}
	
	public T getLChild() {
		return this.leftChild;
	}
	
	public T getRChild() {
		return this.rightChild;
	}
	
	public T getLeftmostNode() {
		
	}
	
	public T getRightmostNode() {
		
	}
	
	public int height() {
		
	}
}
