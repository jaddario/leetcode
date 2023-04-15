package br.addario.twosums;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SolutionTest {

    private Solution solution;

    @BeforeEach
    void setUp() {
        solution = new Solution();
    }

    @Test
    void twoSum_shouldReturnZeroOneWithTargetNine() {
        int[] numbers = {2, 7, 11, 15};
        int target = 9;
        int[] expectedResult = {0, 1};
        int[] actualResult = solution.twoSum(numbers, target);
        assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    void twoSum_shouldReturnOneTwoWithTargetSix() {
        int[] numbers = {3, 2, 4};
        int target = 6;
        int[] expectedResult = {1, 2};
        int[] actualResult = solution.twoSum(numbers, target);
        assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    void twoSum_shouldReturnZeroOneWithTargetSix() {
        int[] numbers = {3, 3};
        int target = 6;
        int[] expectedResult = {0, 1};
        int[] actualResult = solution.twoSum(numbers, target);
        assertArrayEquals(expectedResult, actualResult);
    }
}