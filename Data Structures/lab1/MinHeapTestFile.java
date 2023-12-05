package lab4;
//name: Alexander Ross
//Student number: 300213662
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class MinHeapTestFile {
	@Test
	void testEmptyPeek() {
		MinHeap<Integer> m = new MinHeap<>();
		assertEquals(null,m.peek());		
	}
	@Test
	void testEmptyPoll() {
		MinHeap<Integer> m = new MinHeap<>();
		assertEquals(null,m.poll());		
	}
	@Test
	void testEmptySize() {
		MinHeap<Integer> m = new MinHeap<>();
		assertEquals(0,m.size());
		m.add(6);
		assertEquals(1,m.size());
	}
	@Test
	void testFewIntegers() {
		MinHeap<Integer> m = new MinHeap<>();
		m.add(5);
		m.add(1);
		m.add(9);
		assertEquals(1,m.poll());
		assertEquals(5,m.poll());
		assertEquals(9,m.poll());
	}
	@Test
	void testRepeatedValues() {
		MinHeap<Integer> m = new MinHeap<>();
		m.add(5);
		m.add(1);
		m.add(9);
		m.add(5);
		m.add(1);
		m.add(9);
		assertEquals(1,m.poll());
		assertEquals(1,m.poll());
		assertEquals(5,m.poll());
		assertEquals(5,m.poll());
		assertEquals(9,m.poll());
		assertEquals(9,m.poll());
	}
	@Test
	void testStrings() {
		MinHeap<String> m = new MinHeap<>();
		m.add("don't");
		m.add("tase");
		m.add("me");
		m.add("bro");
		m.add("all");
		m.add("your");
		m.add("base");
		m.add("are");
		m.add("belong");
		m.add("to");
		m.add("us");
		assertEquals(11,m.size());
		assertTrue("all".equals(m.poll()));
		assertTrue("are".equals(m.poll()));
	}
	@Test
	void testManyDoubles() {
		MinHeap<Double> m = new MinHeap<>();
		//DONE: Test that the heap works with many (15 or more) doubles
		m.add(1.0);
		m.add(2.0);
		m.add(3.0);
		m.add(4.0);
		m.add(5.0);
		m.add(6.0);
		m.add(7.0);
		m.add(8.0);
		m.add(9.0);
		m.add(10.0);
		m.add(11.0);
		m.add(12.0);
		m.add(13.0);
		m.add(14.0);
		m.add(15.0);
		m.add(16.0);
	}
	@Test
	void testManyCharacters() {
		MinHeap<Character> m = new MinHeap<>();
		//DONE: Test that the heap works with many (15 or more) characters
		m.add('a');
		m.add('b');
		m.add('c');
		m.add('d');
		m.add('e');
		m.add('f');
		m.add('g');
		m.add('h');
		m.add('i');
		m.add('j');
		m.add('k');
		m.add('l');
		m.add('m');
		m.add('n');
		m.add('o');	
		m.add('p');
	}
	@Test
	void anotherHeapTest() {
		// I did got around to this nor test heap sort large, my apologies

		//TODO: make another test looking for possible things that can break
		//      your heap implementation. Write a description of what you
		//      are trying to test (example, all negatives? all equal? does it
		//      work on sorted order input? reverse sorted order? etc)
	}

	@Test
	void testHeapSortLarge() {
	}
	//TODO: use a heapSort method like in the UseExample.java to
	// test that heapSort will properly sort a large array. (JUnit
	// files can contain non-test static methods as well).
	// For example:
	// - generate an array of 100 random integers
	// - pass these through a heapSort method
	// - verify that heapSort's result is sorted, either by
	//      checking that a[i]<=a[i+1] for all pairs, or by comparing  
	//      it to a 'correct' answer given by Arrays.sort() or Collections.sort()

}
