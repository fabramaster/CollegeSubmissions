package lab1;
/**
 * This is an interface that defines the methods of a list data type
 */

public interface MySimpleList {

	
	
	/** Gets the int at position pos
	 * @param pos int
	 * @return the int at index pos
	 */
	public int get(int pos);
	
	
	/**	
	 * Removes (and returns) the int at postion pos
	 * @param pos int
	 * @return the int removed
	 */
	public int remove(int pos);


	// DONE: add Javadoc for add()
	/*
	 * adds the int when returning an array
	 * @param value
	 */
	public void add(int value);
	
	
	// DONE: add Javadoc for size()
	/* 
	 * 
	 * @return size of the array in terms of int
	 * 
	 */
	public int size();
	
	
	/** Returns the string representation of the contents of this list
	 * @returnString
	 */
	public String toString();
}
