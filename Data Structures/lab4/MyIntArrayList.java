package lab1;

import java.util.ArrayList;
import java.util.Arrays;

/**

 *  A simple integer ArrayList class which should perform faster than Java's own ArrayList
 */

/* DONE: Complete the "ToDo" and "FixMe" tasks in this file. Your changes should make
all the tests in TestMyArray.java pass with 'TRUE' output. Change each "DONE"
item to DONE, and add DONE to your list of Java tags so that it remains in your 'Tasks' Window.
(under Window->Preferences->...  */

public class MyIntArrayList implements MySimpleList {

	private int size;
	private int[] contents;
	public MyIntArrayList () {
		//DONE: Construct your arrayList with an underlying array of some default size
		contents = new int[20];
		size = 0;
	}

	public MyIntArrayList (int n) {
		//DONE: Construct your arrayList with an underlying array of some size n
		contents = new int[n];
	}

	public void add(int n) {
		if (size == contents.length) {
			//DONE: underlying array is full. Allocate additional space
			//create new temp array
			int[] temp = new int[contents.length * 2];
			//indexing thru array original size and assigning to new array 
			for (int i = 0; i < contents.length; i++){
				temp[i] = contents[i];
			}
			//updating temp array to new array :^)
			contents = temp;
		}
		//DONE: Complete this method by adding int n to your array
		contents[size]=n;
		size++;
	}


	public String toString() {
		StringBuilder stringB = new StringBuilder();
		stringB.append("[");
		String ListType="";
		for (int i = 0; i < size; i++) {
			stringB.append(Integer.toString(contents[i])+", ");
		}
		stringB.delete(stringB.length()-2, stringB.length());
		stringB.append("]");
		ListType=stringB.toString();
		return ListType;

	}

	public int remove(int pos) {
		//DONE: Remove the int at the given position 'pos'
		if(pos>=0 && pos<size){
			for(int i=pos; i<size-1; i++) {
				//DONE: Shift the rest of the items over to maintain array.
				contents[i]= contents[i+1];
			}
			//DONE: Decrease size of your collection
			size--;



			//DONE: Return the integer item removed
			return contents[pos];
		}
		return -1;
	}

	@Override
	public int get(int pos) {
		if(pos>0 && size>pos) {
			return contents[pos];
		}
		return -1;
	}

	@Override
	public int size() {

		return size;
	}

}
