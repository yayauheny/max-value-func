package by.yayauheny;

public class MaxValueService {

    public static int findMaxValue(int[] array) {
        int maxValue = array[0];

        for (int i = 1; i < array.length; i++) {
            if (maxValue < array[i]) {
                maxValue = array[i];
            }
        }
        return maxValue;
    }

    public static int findSecondMaxValue(int[] array) {
        int firstMaxValue = array[0];
        int secondMaxValue = firstMaxValue;

        for (int i = 1; i < array.length; i++) {
            if (firstMaxValue < array[i]) {
                secondMaxValue = firstMaxValue;
                firstMaxValue = array[i];
            } else if (secondMaxValue < array[i] && array[i] < firstMaxValue) {
                secondMaxValue = array[i];
            }
        }
        return secondMaxValue;
    }
}