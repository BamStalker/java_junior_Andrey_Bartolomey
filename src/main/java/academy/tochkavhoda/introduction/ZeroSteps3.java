package academy.tochkavhoda.introduction;

import java.util.Arrays;

public class ZeroSteps3 {
    public int sum(int[] array) {
        int ans = 0;
        for (int i = 0; i < array.length; i++) {
            ans += array[i];
        }
        return ans;
    }

    public int mul(int[] array) {
        if (array.length == 0)
            return 0;
        int ans = 1;
        for (int i = 0; i < array.length; i++)
            ans *= array[i];
        return ans;
    }

    public int min(int[] array) {
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < ans)
                ans = array[i];
        }
        return ans;
    }

    public int max(int[] array) {
        int ans = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > ans)
                ans = array[i];
        }
        return ans;
    }

    public double average(int[] array) {
        if (array.length == 0)
            return 0;
        double ans = 0;
        double sum = 0;
        for (int i = 0; i < array.length; i++)
            sum += array[i];
        ans = sum / array.length;
        return ans;
    }

    public boolean isSortedDescendant(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] <= array[i + 1])
                return false;
        }
        return true;
    }

    public void cube(int[]array) {
        for (int i = 0; i < array.length; i++)
            array[i] = array[i] * array[i] * array[i];
    }

    public boolean find(int[]array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value)
                return true;
        }
        return false;
    }

    public void reverse(int[]array) {
        for (int i = 0; i < array.length / 2; i++) {
            int old_num = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = old_num;
        }
    }

    public boolean isPalindrome(int[]array) {
        for (int i = 0; i < array.length / 2; i++) {
            if (array[i] != array[array.length - 1 - i])
                return false;
        }
        return true;
    }

    public void replaceBySquare(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0)
                break;
            array[i] *= array[i];
        }
    }

    public int mulNonZero(int[] array) {
        if (array.length == 0)
            return 0;
        int ans = 1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0)
                continue;
            ans *= array[i];
        }
        return ans;
    }

    public boolean allPositive(int[] array) {
        if (array.length == 0)
            return false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] <= 0)
                return false;
        }
        return true;
    }

    public boolean allEqual(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] != array[j])
                    return false;
            }
        }
        return true;
    }

    public int greaterThanNeighbours(int[] array) {
        int ans = -1;
        for (int i = 1; i < array.length - 1; i++) {
            if (array[i] > array[i-1] && array[i] > array[i+1])
                ans = i;
        }
        return ans;
    }

    public boolean neighboursAverage(double[] array) {
        for (int i = 1; i < array.length - 1; i++) {
            if ((array[i-1] + array[i+1]) / 2 == array[i])
                return true;
        }
        return false;
    }

    public int sumBetween2Zeros(int[] array) {
        int firstNul = -1;
        int secondNul = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                if (firstNul != -1) {
                    secondNul = i;
                    break;
                }
                firstNul = i;
            }
        }

        int ans = 0;
        for (int i = firstNul; i < secondNul; i++)
            ans += array[i];
        return  ans;
    }

    public int sameAtPosition(int[] array1, int[]array2) {
        int minLenght = 0;
        if (array1.length < array2.length)
            minLenght = array1.length;
        else
            minLenght = array2.length;

        int ans = 0;
        for (int i = 0; i < minLenght; i++) {
            if (array1[i] == array2[i])
                ans += 1;
        }
        return ans;
    }

    public boolean bothZeroAtPosition(int[] array1, int[]array2) {
        int minLenght = 0;
        if (array1.length < array2.length)
            minLenght = array1.length;
        else
            minLenght = array2.length;

        for (int i = 0; i < minLenght; i++) {
            if (array1[i] == 0 && array2[i] == 0)
                return true;
        }
        return false;
    }

    public void accumulatedSum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
            array[i] = sum;
        }
    }

    public int[] mergeArrays(int[] array1, int[] array2) {
        int[] newArray = new int[array1.length + array2.length];
        for (int i = 0; i < array1.length; i++)
            newArray[i] = array1[i];
        for (int i = 0; i < array2.length; i++)
            newArray[array1.length + i] = array2[i];

        Arrays.sort(newArray);

        /* for (int i = 0; i < newArray.length + 1; i++) {
            for (int j = 0; j < newArray.length; j++) {
                if (newArray[i] < newArray[j]) {
                    int x = newArray[i];
                    newArray[i] = newArray[j];
                    newArray[j] = x;
                }
            }
        } */
        return newArray;
    }

    public int insideCircle(int[] x, int[] y,int radius) {
        int ans = 0;
        for (int i = 0; i < x.length; i++) {
            if (x[i] * x[i] + y[i] * y[i] <= radius * radius)
                ans += 1;
        }
        return ans;
    }

    public double scalarProduct(double[] array1, double[] array2) {
        double ans = 0;
        for (int i = 0; i < array1.length; i++) {
            ans += array1[i] * array2[i];
        }
        return ans;
    }

}