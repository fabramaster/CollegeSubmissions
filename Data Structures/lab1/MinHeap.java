package lab4;
//name: Alexander Ross
//Student number: 300213662
import java.util.Collections;
/**
 * MinHeap of Comparables. Two E objects which extend Comparable can
 * be compared by e1.compareTo(e2), and if this results in a negative
 * value, e1 comes before e2. If it results in a positive value, e2 comes
 * first.
 * This class extends fullBinaryTree, meaning we can use the left and right
 * child functions to get the index of child nodes. But it must also support
 * heap functionality, like up-heap, trickle-down, and extract-min.
 * @param <E>
 */

public class MinHeap<E extends Comparable<E>>
extends FullBinaryTree<E>
implements HeapADT<E> {

	/**
	 * Constructs the underlying ArrayList<E> called 'nodes' 
	 */
	public MinHeap() {
		// Nothing to change here.
		super();
	}

	@Override
	public E poll() {
		if (nodes.size()==0){
			return null;
		}
		if(nodes.size()==1) {
			return nodes.remove(0);

		}
		E sNode=nodes.get(0);
		Collections.swap(nodes, 0, nodes.size()-1);
		nodes.remove(nodes.size()-1);
		trickleDown(0);
		return sNode;
		//DONE: Get (and remove) the root element. If there are any
		//elements left, extract the last element of nodes and
		//place it into the root position. Then call trickleDown(0) before
		//returning the original root.
	}
	private void trickleDown(int i) {
		if(leftChild(i)>=size()) {
			return;
		}
		int min=i;
		if(leftChild(i)<size() && nodes.get(leftChild(i)).compareTo(nodes.get(min))<0) {
			min=leftChild(i);
		}
		if(rightChild(i)<size() && nodes.get(rightChild(i)).compareTo(nodes.get(min))<0) {
			min=rightChild(i);
		}
		if(min!=i) {
			Collections.swap(nodes, i, min);
			trickleDown(i);
		}
		//DONE: To trickle-down at index i:
		//Determine which of the left or right child is smaller
		//(if they exist at all), then if that child comes
		//before the value at position i, swap them and recurse.
	}
	@Override
	public E peek() {
		//DONE: return the root, without removing 
		if(nodes.size()==0) {
			return null;
		}
		return nodes.get(0);	
	}
	@Override
	public void add(E e) {
		//DONE: add an element at the end of nodes, then
		//call upHeap on the last index.
		nodes.add(e);
		upHeap(nodes.size()-1);
	}
	private void upHeap(int index) {
		//DONE: If index==0, you are done. Otherwise, if the element at
		//index comes before its parent, swap it with its parent and then
		//call upHeap on the parent index.
		if (index==0) {
			return;
		}
		if(nodes.get(index).compareTo(nodes.get(parent(index)))<0) {
			Collections.swap(nodes, index, parent(index));
			upHeap(parent(index));
		}
	}
	public String toString() {
		// Nothing to change here.
		return nodes.toString();
	}
}
