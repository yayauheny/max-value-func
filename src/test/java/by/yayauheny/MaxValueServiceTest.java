package by.yayauheny;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.*;

class MaxValueServiceTest {

    @Nested
    @DisplayName("Testing method for first max value")
    class FindFirstMaxValueTest {

        @Test
        @DisplayName("should return 12 as max value for input array = {1, -10, 12, 4, 5, -39, 9}")
        void shouldReturnPositiveMaxValue() {
            int[] inputArray = {1, -10, 12, 4, 5, -39, 9};
            int expectedResult = Arrays.stream(inputArray).max().getAsInt();
            int actualResult = MaxValueService.findMaxValue(inputArray);

            assertThat(actualResult).isEqualTo(expectedResult);
        }

        @Test
        @DisplayName("should return -22 as max value for negative input array = {-22, -132, -545, -666, -23}")
        void shouldReturnNegativeMaxValue() {
            int[] inputArray = {-22, -132, -545, -666, -23};
            int expectedResult = Arrays.stream(inputArray).max().getAsInt();
            int actualResult = MaxValueService.findMaxValue(inputArray);

            assertThat(actualResult).isEqualTo(expectedResult);
        }

        @Test
        @DisplayName("should return first element if array has size = 1")
        void shouldReturnFirstElementWhenArrayHasSingleValue() {
            int[] inputArray = {555};
            int expectedResult = inputArray[0];
            int actualResult = MaxValueService.findMaxValue(inputArray);

            assertThat(actualResult).isEqualTo(expectedResult);
        }
    }

    @Nested
    @DisplayName("Testing method for second max value")
    class FindSecondMaxValueTest {

        @Test
        @DisplayName("should return 9 as second max value for input array = {1, -10, 12, 4, 5, -39, 9}")
        void shouldReturnSecondPositiveMaxValue() {
            int[] inputArray = {1, -10, 12, 4, 5, -39, 9};
            Arrays.sort(inputArray);
            int firstMax = inputArray[inputArray.length - 1];
            int secondMax = inputArray[inputArray.length - 2];
            int actualResult = MaxValueService.findSecondMaxValue(inputArray);

            assertThat(actualResult).isEqualTo(secondMax);
            assertThat(actualResult).isNotEqualTo(firstMax);
        }

        @Test
        @DisplayName("should return -132 as max value for negative input array = {-22, -132, -545, -666, -230}")
        void shouldReturnSecondNegativeMaxValue() {
            int[] inputArray = {-22, -132, -545, -666, -23};
            Arrays.sort(inputArray);
            int firstMax = inputArray[inputArray.length - 1];
            int secondMax = inputArray[inputArray.length - 2];
            int actualResult = MaxValueService.findSecondMaxValue(inputArray);

            assertThat(actualResult).isEqualTo(secondMax);
            assertThat(actualResult).isNotEqualTo(firstMax);
        }

        @Test
        @DisplayName("should return first element if array has size = 1")
        void shouldReturnFirstElementAsSecondMaxValueWhenArrayHasSingleValue() {
            int[] inputArray = {864};
            Arrays.sort(inputArray);
            int expectedResult = inputArray[0];
            int actualResult = MaxValueService.findSecondMaxValue(inputArray);

            assertThat(actualResult).isEqualTo(expectedResult);
        }
    }
}