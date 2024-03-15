package assign08;

import java.util.ArrayList;
import java.util.Collection;
import java.util.NoSuchElementException;

public class BinarySearchTree implements SortedSet{

	private BinaryNode<Type> root;
	private int size;
	
	public BinarySearchTree() {
		root = null;
		size = 0;
	}
	public boolean add(Type item) {
		BinaryNode<Type> temp = root;
		
		while(!temp == null)
			if(temp.getData().compare(item) == 0){
				return false;
			}
			if(temp.getData().compare(item) > 0) {
				temp.setData((item.getRChild()).getData);
			}
			if(temp.getData().compare(item) < 0) {
				
				temp.setData((item.getLChild()).getData);
				
			}
			
		return false;
	}

	@Override
	public boolean addAll(Collection items) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean contains(Comparable item) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsAll(Collection items) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Comparable first() throws NoSuchElementException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Comparable last() throws NoSuchElementException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean remove(Comparable item) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeAll(Collection items) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ArrayList toArrayList() {
		// TODO Auto-generated method stub
		return null;
	}

}

