package lab2;
//Alexander Ross
//300213662

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

import org.junit.jupiter.api.Test;


class TestBadFiles {

	@Test
	void testAverage1() {
		assertEquals(15, BadFunctions.average(10, 20));
		assertEquals(1, BadFunctions.average(1, 2));
		assertEquals(49, BadFunctions.average(0, 99));
	}

	@Test
	void testAverage2() {
		assertEquals(10, BadFunctions.average(-10, 30));
		assertEquals(228456, BadFunctions.average(123, 456789));
	}

	@Test
	void testAverage3() {
		// DONE: make a test case that YOU know the correct answer to
			//System.out.println(BadFunctions.average(2147483642, 20));
		assertEquals(1073741831,BadFunctions.average(2147483642, 20));
		// function returns an incorrect result due to the function adding two primitive Ints and overflowing causing
		//it to return negative, and incorrect
	}

	@Test
	void testIsPalindrome1() {
		assertTrue(BadFunctions.isPalindrome("stabbats"));
	}
	
	@Test
	void testIsPalindrome2() {
		assertFalse(BadFunctions.isPalindrome("notAPalton"));
	}

	@Test
	void testIsPalindrome3() {
		// DONE: make a testcase that YOU know the correct answer to, but the
		// function returns an incorrect result
			//System.out.println(BadFunctions.isPalindrome("asa"));
		assertTrue(BadFunctions.isPalindrome("asa"));
		/// its obviously asa returned but we dont get that
	}

	@Test	
	void testNumDigits1() {
		assertEquals(3, BadFunctions.numDigits(999));
		assertEquals(4, BadFunctions.numDigits(9999));
		assertEquals(3, BadFunctions.numDigits(100));
		assertEquals(4, BadFunctions.numDigits(1001));
	}
	
	@Test
	void testNumDigits2() {
		assertEquals(1, BadFunctions.numDigits(9));
		assertEquals(4, BadFunctions.numDigits(-4321));
		assertEquals(3, BadFunctions.numDigits(590));
		assertEquals(2, BadFunctions.numDigits(-99));
	}

	@Test
	void testNumDigits3() {
		// DONE: make a testcase that YOU know the correct answer to, but the
		// function returns an incorrect result
		//when we input 0, we should get a digit of 1
		//System.out.println(BadFunctions.numDigits(0));
		assertEquals(1, BadFunctions.numDigits(0));
	}

	@Test
	void testBubbleSort1() {
		int[] nums = {1, 5, 2, 4, 3};
		int[] correct = Arrays.copyOf(nums, nums.length); // a copy of array nums
		BadFunctions.bubbleSort(nums); // sorts with our bad function
		Arrays.sort(correct); // a correctly sorted array
		assertArrayEquals(correct, nums);
	}

	@Test
	void testBubbleSort2() {
		int[] nums = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5, 8, 9};
		int[] correct = Arrays.copyOf(nums, nums.length); // a copy of array nums
		BadFunctions.bubbleSort(nums); // sorts with our bad function
		Arrays.sort(correct); // a correctly sorted array
		assertArrayEquals(correct, nums);
	}

	@Test
	void testBubbleSort3() {
		// DONE: make a testcase that YOU know the correct answer to, but the
		// function returns an incorrect result
		//bubblesort function only has 15 steps, more than 15 and it breaks down
		Random randomGenerator = new Random();
		int[] nums = new int[2000];
		for (int n = 0; n < 2000; ++n){
		  nums[n] = randomGenerator.nextInt(100) + 1;
		}
		int[] correct = Arrays.copyOf(nums, nums.length); // a copy of array nums
		BadFunctions.bubbleSort(nums); // sorts with our bad function
		Arrays.sort(correct); // a correctly sorted array
		assertArrayEquals(correct, nums);
	}

	@Test
	void testRandomSort1() {
		int[] nums = {1, 5, 2, 4, 3};
		int[] correct = Arrays.copyOf(nums, nums.length); // a copy of array nums
		BadFunctions.randomSort(nums); // sorts with our bad function
		Arrays.sort(correct); // a correctly sorted array
		assertArrayEquals(correct, nums);
	}

	@Test
	void testRandomSort2() {
		int[] nums = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5, 8, 9};
		int[] correct = Arrays.copyOf(nums, nums.length); // a copy of array nums
		BadFunctions.randomSort(nums); // sorts with our bad function
		Arrays.sort(correct); // a correctly sorted array
		assertArrayEquals(correct, nums);
	}

	@Test
	void testRandomSort3() {
		// DONE: make a test case that YOU know the correct answer to, but the
		// function returns an incorrect result
		int[] nums = {-3, -1, 10,20,30,40,50,60,70,80,90,100,200,300,400,500,600,20,900,1000,2000,3000,4000,9000,55,22 };
		int[] correct = Arrays.copyOf(nums, nums.length); // a copy of array nums
		BadFunctions.randomSort(nums); // sorts with our bad function
		Arrays.sort(correct); // a correctly sorted array
		assertArrayEquals(correct, nums);
		//its incorrect as count arrays from zero, and this is giving us incorrect array length
	}
	
	@Test
	void testSetConstructor() {
		BadSet<String> bss = new BadSet<>();
		BadSet<Integer> bsi = new BadSet<>();
		BadSet<ArrayList<Character>> bsac = new BadSet<>();
		assertNotNull(bss);
		assertNotNull(bsi);
		assertNotNull(bsac);
	}
	
	@Test
	void testSetAddAndContains() {
		BadSet<Integer> bsi = new BadSet<>();
		bsi.add(3);
		assertTrue(bsi.contains(3));
		assertEquals(1, bsi.size());
		bsi.add(3); // should have no effect since a SET does not keep duplicated items
		assertTrue(bsi.contains(3));
		assertEquals(1, bsi.size());
		bsi.add(8);
		assertTrue(bsi.contains(3));
		assertTrue(bsi.contains(8));
		assertEquals(2, bsi.size());
		bsi.add(8);
		assertTrue(bsi.contains(3));
		assertTrue(bsi.contains(8));
		assertEquals(2, bsi.size());
	}

	@Test
	void testSetAddAndRemoveAndContains1() {
		BadSet<Integer> bsi = new BadSet<>();
		bsi.add(3);
		assertTrue(bsi.contains(3));
		assertEquals(1, bsi.size());
		bsi.add(3); // should have no effect since a SET does not keep duplicated items
		assertTrue(bsi.contains(3));
		assertEquals(1, bsi.size());
		bsi.add(8);
		assertTrue(bsi.contains(3));
		assertTrue(bsi.contains(8));
		assertEquals(2, bsi.size());
		bsi.add(8);
		assertTrue(bsi.contains(3));
		assertTrue(bsi.contains(8));
		assertEquals(2, bsi.size());
		bsi.remove(3);
		assertFalse(bsi.contains(3));
		assertTrue(bsi.contains(8));
		assertEquals(1, bsi.size());
	}
	@Test
	void testSetAddAndRemoveAndContains2() {
		// DONE: create a situation of add and remove operations that
		// finds an error in the BadSet data structure
		//this set code only checks the last input and we are supposed to not have duplicates
		BadSet<Integer> bsi = new BadSet<>();
		bsi.add(3);
		bsi.add(124);
		bsi.add(3);
		assertEquals(2, bsi.size());
		
	}
}
