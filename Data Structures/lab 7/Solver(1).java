package maze;
//name: Alexander Ross
//Student number:300213662
import java.util.Collection;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

/**
 * The main maze-solving class. First, you should build a solution using a Queue.
 * Once you have a queue-based solution, you should be able to simply copy-and-paste it into
 * the stack-based method and replace your
 * Queue<Integer> q = new LinkedList<>();
 * with
 * Stack<Integer> q = new Stack<>();
 * 
 * and then change .poll() to .pop() and this will hopefully give you a solution using Stacks.
 * (But also change a few other 'queue' words to 'stack' words.)
 *
 * And finally, you will have to copy the Queue solution to the PriorityQueue
 * method, and replace
 * Queue<Integer> q = new LinkedList<>();
 * with
 * PriorityQueue<Integer> q = new PriorityQueue<>( (x,y) -> [something] );
 * and you will need to design an appropriate priority function
 * 
 * See the DONE items throughout the queue-based method.
 *
 */
public class Solver {

	// Leave this here. No other static variables needed. Reference to N is static so that location()-based
	// methods work without you having to pass N into the location or getRow or getCol functions
	static int N;
	public static void solveWithQueue(String filename) {

		// Gets the Maze object from file
		Maze m = MazeReader.readMazeFromFile(filename);
		N = m.getSize();
		int startCol=m.getStartCol();//bruh
		int startRow=m.getStartRow();//may or may not werk
		
		// This creates your own character map which you can edit so you can keep track of where your solver has looked
		char[][] myMap = new char[N][N];

		// This performs a deep copy of the map
		for (int row=0; row<N; row++) {
			for (int col=0; col<N; col++) {
				myMap[row][col] = m.get(row, col);
			}
		}

		// DONE: instantiate a queue of integers.
		Queue<Integer>q= new LinkedList<Integer>();
		
		q.add(location(startRow, startCol));
		int count=0;
		
		// DONE: add the starting location to the queue.
		// Use m.getStartRow() and m.getStartCol() to get the starting coordinates of the maze m

		
		// this sets the starting location on myMap to the user symbol '@'
		myMap[m.getStartRow()][m.getStartCol()] = '@';
		int maxQSize=1;

		// This is just a flag variable indicating that no solution has been found yet
		boolean solutionFound = false;
		
		// Your final output should count the number of iterations of queue-popping this maze takes.
		// So this variable should increment every iteration
		// Your final output should also report what the largest size the queue reached during this program's execution
		while (q.isEmpty() == false) {
			
			// DONE: int nextLocation = next item in queue
			int nextLocation=q.poll();
			
			// DONE: don't forget to increment your count variable!
			count++;
			// These lines extract the Row and Col index values from the location integer.
			int currentRow = getRow(nextLocation);//fix later
			int currentCol = getCol(nextLocation);
			myMap[currentRow][currentCol] = '@';
			
			
			// You can display your map and the state of your queue using a given displayMyMap function.
			// Be sure to re-comment this displayMyMap line when submitting.
			//displayMyMap(myMap,q);
			
			
			// this sets the '@' to an 'x' once we have seen this map with the
			// current '@' position shown
			myMap[currentRow][currentCol] = 'x';

			
			// DONE: If our current position is the target position, you are done. Set your flag and break out of loop.
			// Use m.getTargetRow() and m.getTargetCol() to get the target of the maze m.
			if(currentRow==m.getTargetCol() && currentCol==m.getTargetCol()) {
				solutionFound=true;
				break;
			}

			// For your answers to match ours, you must search in the order of NORTH, EAST, SOUTH, WEST
			// 'N'ever 'E'at 'S'limy 'W'orms
			
			// NORTH: Check if NORTH position is on the map AND that it is an available spot on myMap
			if (currentRow-1 >=0 && myMap[currentRow-1][currentCol] == '.') {
				myMap[currentRow	][currentCol] = '?';
				q.add(location(currentRow-1,currentCol));
			}
			
			
				if(currentCol+1<N && myMap[currentRow][currentCol+1]=='.') {
					myMap[currentRow][currentCol+1] = '?';
					q.add(location(currentRow, currentCol+1));
					
				}
					if(currentRow+1<N && myMap[currentRow+1][currentCol]=='.') {
						myMap[currentRow+1][currentCol] = '?';
						q.add(location(currentRow+1, currentCol));
						
					}
						if(currentCol-1>=0 && myMap[currentRow][currentCol-1]=='.') {
							myMap[currentRow][currentCol-1]='?';
							q.add(location(currentRow, currentCol-1));
						}
			
			// DONE: Test the other 3 directions
			// DONE: After adding items to the queue, check if the new size of
			// the queue is larger than your maximum so far, and record this
			// size if it is.
			if(q.size()>maxQSize) {
				maxQSize=q.size();
			}

		}
		
		
		// Nothing to do here. If the above implementation correctly
		// updated the variables: solutionFound, count, and maxQSize, then the following displays your results. 
		if (solutionFound == false) {
			// change 'Queue' to 'Stack' when copying this to the Stack version
			System.out.println(filename + " Queue ran out of items after " + count + " iterations. No solution to maze.");
		}
		else {
			System.out.println(filename + " Solution found after " + count + " iterations.");
		}
		// Change 'queue' to stack when copying to the 'stack' version
		System.out.println("The largest size of the queue was " + maxQSize);
	}
	
	public static void solveWithStack(String filename) {
		// Gets the Maze object from file
				Maze m = MazeReader.readMazeFromFile(filename);
				N = m.getSize();
				int startCol=m.getStartCol();//bruh
				int startRow=m.getStartRow();//may or may not werk
				
				// This creates your own character map which you can edit so you can keep track of where your solver has looked
				char[][] myMap = new char[N][N];

				// This performs a deep copy of the map
				for (int row=0; row<N; row++) {
					for (int col=0; col<N; col++) {
						myMap[row][col] = m.get(row, col);
					}
				}

				Stack<Integer>q= new Stack<Integer>();
				
				q.push(location(startRow, startCol));
				int count=0;
				// DONE: add the starting location to the queue.
				// Use m.getStartRow() and m.getStartCol() to get the starting coordinates of the maze m
				// this sets the starting location on myMap to the user symbol '@'
				myMap[m.getStartRow()][m.getStartCol()] = '@';
				int maxQSize=1;

				// This is just a flag variable indicating that no solution has been found yet
				boolean solutionFound = false;
				
				// Your final output should count the number of iterations of queue-popping this maze takes.
				// So this variable should increment every iteration
				
				
				// Your final output should also report what the largest size the queue reached during this program's execution
				
				
				while (q.isEmpty() == false) {
					
					// DONE: int nextLocation = next item in queue
					int nextLocation=q.pop();
					
					// DONE: don't forget to increment your count variable!
					count++;
					// These lines extract the Row and Col index values from the location integer.
					int currentRow = getRow(nextLocation);//fix later
					int currentCol = getCol(nextLocation);
					myMap[currentRow][currentCol] = '@';
					
					

					// You can display your map and the state of your queue using a given displayMyMap function.
					// Be sure to re-comment this displayMyMap line when submitting.
					//displayMyMap(myMap,q);
					
					
					// this sets the '@' to an 'x' once we have seen this map with the
					// current '@' position shown
					myMap[currentRow][currentCol] = 'x';

					
					// DONE: If our current position is the target position, you are done. Set your flag and break out of loop.
					// Use m.getTargetRow() and m.getTargetCol() to get the target of the maze m.
					if(currentRow==m.getTargetCol() && currentCol==m.getTargetCol()) {
						solutionFound=true;
						break;
					}
					// For your answers to match ours, you must search in the order of NORTH, EAST, SOUTH, WEST
					// 'N'ever 'E'at 'S'limy 'W'orms
					// NORTH: Check if NORTH position is on the map AND that it is an available spot on myMap
					if (currentRow-1 >=0 && myMap[currentRow-1][currentCol] == '.') {
						myMap[currentRow	][currentCol] = '?';
						q.add(location(currentRow-1,currentCol));
					}
					if(currentCol+1<N && myMap[currentRow][currentCol+1]=='.') {
						myMap[currentRow][currentCol+1] = '?';
						q.add(location(currentRow, currentCol+1));
						
					}
					if(currentRow+1<N && myMap[currentRow+1][currentCol]=='.') {
						myMap[currentRow+1][currentCol] = '?';
						q.add(location(currentRow+1, currentCol));
						
					}
					if(currentCol-1>=0 && myMap[currentRow][currentCol-1]=='.') {
						myMap[currentRow][currentCol-1]='?';
						q.add(location(currentRow, currentCol-1));
					}
					
					

					// DONE: Test the other 3 directions
					// DONE: After adding items to the queue, check if the new size of
					// the queue is larger than your maximum so far, and record this
					// size if it is.
					if(q.size()>maxQSize) {
						maxQSize=q.size();
					}
				}
				// Nothing to do here. If the above implementation correctly
				// updated the variables: solutionFound, count, and maxQSize, then the following displays your results. 
				if (solutionFound == false) {
					// change 'Queue' to 'Stack' when copying this to the Stack version
					System.out.println(filename + " Stack ran out of items after " + count + " iterations. No solution to maze.");
				}
				else {
					System.out.println(filename + " Solution found after " + count + " iterations.");
				}
				// Change 'queue' to stack when copying to the 'stack' version
				System.out.println("The largest size of the queue was " + maxQSize);
			}

		// DONE: copy the code from solveWithQueue and replace the Queue with a Stack.
		// And replace the .poll() method with a .pop()
		// And change the output lines to say "Stack" instead of "Queue"
	
	
	public static void solveWithPriorityQueue(String filename) {
		// Gets the Maze object from file
				Maze m = MazeReader.readMazeFromFile(filename);
				N = m.getSize();
				int startCol=m.getStartCol();//bruh
				int startRow=m.getStartRow();//may or may not werk
				
				// This creates your own character map which you can edit so you can keep track of where your solver has looked
				char[][] myMap = new char[N][N];

				// This performs a deep copy of the map
				for (int row=0; row<N; row++) {
					for (int col=0; col<N; col++) {
						myMap[row][col] = m.get(row, col);
					}
				}

				// DONE: instantiate a Priority queue of integers.
				// Queue<Integer> q = ...
				int count=0;
				PriorityQueue<Integer>q= new PriorityQueue<>(
					(x,y ) -> (
							(Integer)(((m.getTargetRow()-getRow(x))*(m.getTargetRow()-getRow(x)))
									+((m.getTargetCol()-getCol(x))*(m.getTargetCol()-getCol(x))))).compareTo(
											(Integer)(((m.getTargetRow()-getRow(y))*(m.getTargetRow()-getRow(y)))
													+((m.getTargetCol()-getCol(y))*(m.getTargetCol()-getCol(y)))))
													);

				// DONE: add the starting location to the queue.
				// Use m.getStartRow() and m.getStartCol() to get the starting coordinates of the maze m

				// this sets the starting location on myMap to the user symbol '@'
				myMap[m.getStartRow()][m.getStartCol()] = '@';
				int maxQSize=1;

				// This is just a flag variable indicating that no solution has been found yet
				boolean solutionFound = false;
				
				// Your final output should count the number of iterations of queue-popping this maze takes.
				// So this variable should increment every iteration
				
				
				// Your final output should also report what the largest size the queue reached during this program's execution
				
				
				while (q.isEmpty() == false) {
					
					// DONE: int nextLocation = next item in queue
					int nextLocation=q.poll();
					
					// DONE: don't forget to increment your count variable!
					count++;
					// These lines extract the Row and Col index values from the location integer.
					int currentRow = getRow(nextLocation);//fix later
					int currentCol = getCol(nextLocation);
					myMap[currentRow][currentCol] = '@';
					
					// You can display your map and the state of your queue using a given displayMyMap function.
					// Be sure to re-comment this displayMyMap line when submitting.
					//displayMyMap(myMap,q);
					
					
					// this sets the '@' to an 'x' once we have seen this map with the
					// current '@' position shown
					myMap[currentRow][currentCol] = 'x';

					
					// DONE: If our current position is the target position, you are done. Set your flag and break out of loop.
					// Use m.getTargetRow() and m.getTargetCol() to get the target of the maze m.
					if(currentRow==m.getTargetCol() && currentCol==m.getTargetCol()) {
						solutionFound=true;
						break;
					}

					// For your answers to match ours, you must search in the order of NORTH, EAST, SOUTH, WEST
					// 'N'ever 'E'at 'S'limy 'W'orms
					// NORTH: Check if NORTH position is on the map AND that it is an available spot on myMap
					if (currentRow-1 >=0 && myMap[currentRow-1][currentCol] == '.') {
						myMap[currentRow	][currentCol] = '?';
						q.add(location(currentRow-1,currentCol));
					}
					if(currentCol+1<N && myMap[currentRow][currentCol+1]=='.') {
						myMap[currentRow][currentCol+1] = '?';
						q.add(location(currentRow, currentCol+1));
						
					}
					if(currentRow+1<N && myMap[currentRow+1][currentCol]=='.') {
						myMap[currentRow+1][currentCol] = '?';
						q.add(location(currentRow+1, currentCol));
						
					}
					if(currentCol-1>=0 && myMap[currentRow][currentCol-1]=='.') {
						myMap[currentRow][currentCol-1]='?';
						q.add(location(currentRow, currentCol-1));
					}
					
					// DONE: Test the other 3 directions
					// DONE: After adding items to the queue, check if the new size of
					// the queue is larger than your maximum so far, and record this
					// size if it is.
					if(q.size()>maxQSize) {
						maxQSize=q.size();
					}

				}
				if (solutionFound == false) {
					// change 'Queue' to 'Stack' when copying this to the Stack version
					System.out.println(filename + " PiorityQueue ran out of items after " + count + " iterations. No solution to maze.");
				}
				else {
					System.out.println(filename + " Solution found after " + count + " iterations.");
				}
				// Change 'queue' to stack when copying to the 'stack' version
				System.out.println("The largest size of the PriorityQueue was " + maxQSize);
			}

		// DONE: copy the code from solveWithQueue and replace the Queue with a PriorityQueue.
		// You will have to provide the priorityQueue a comparison function that
		// takes in two locations (x,y)-> and returns some integer than will prefer the
		// location (x or y) which is closer the the target coordinates. This
		// could result in a very long line of code
	

	

	/**
	 * Creates a location number from a row and column.
	 * e.g. on a 10 by 10 board, row index 4 and column index 3 would yield location 43.
	 * @param row = 0-indexed row 
	 * @param col = 0-indexed column
	 */
	private static int location(int row, int col) {
		//DONE: Complete this
		
		return row * N + col;
	}

	/**
	 * Gets the row index from a location number.
	 * Note that the first row is row 0.
	 * @param location
	 */
	private static int getRow(int location) {
		//DONE: Complete this
		return location / N;
	}

	/**
	 * Gets the column index from a location number
	 * Note that the first column is column 0.
	 * @param location
	 */
	private static int getCol(int location) {
		//DONE: Complete this
		return location % N;
	}

	/**
	 * Do not edit this method. It will display the current state of your map, which should 
	 * show all available spaces, all walls, and all locations that have been queued or stacked (currently, or in the past)
	 * 
	 * @param myMap with your 'x' and '?' markers that show what has been visited so far 
	 * @param q = current queue or stack to process
	 */
	private static void displayMyMap(char[][] myMap, Collection<Integer> q) {
		for (int row=0; row<N; row++) {
			for (int col=0; col<N; col++) {
				System.out.print(myMap[row][col]);
			}
			if (row == N-1) System.out.println(" Still to visit: locations " + q);
			System.out.println();
		}
		System.out.println();
	}
	
}
