package lab2;
//Alexander Ross
//300213662

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class BadFunctionsTest {

	@Test
	void testBubbleSort() {
		int[] nums = {1, 5, 2, 4, 3};
		int[] correct = Arrays.copyOf(nums, nums.length); // a copy of array nums
		BadFunctions.bubbleSort(nums); // sorts with our bad function
		Arrays.sort(correct); // a correctly sorted array
		assertArrayEquals(correct, nums);
		System.out.println(nums);
	}

	@Test
	void testRandomSort() {
		fail("Not yet implemented");
	}

	@Test
	void testNumDigits() {
		fail("Not yet implemented");
	}

	@Test
	void testAverage() {
		fail("Not yet implemented");
	}

	@Test
	void testIsPalindrome() {
		fail("Not yet implemented");
	}

}
