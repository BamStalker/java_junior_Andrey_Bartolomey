package academy.tochkavhoda.introduction;

public class ZeroSteps4 {
    ZeroSteps3 oneDimArr = new ZeroSteps3();

    public int min(int[][] matrix) {
        int answer = Integer.MAX_VALUE;
        for (int j = 0; j < matrix.length; j++) {
            if (oneDimArr.min(matrix[j]) < answer)
                answer = oneDimArr.min(matrix[j]);
        }
        return answer;
    }

    public int max(int[][] matrix) {
        int answer = Integer.MIN_VALUE;
        for (int j = 0; j < matrix.length; j++) {
            if (oneDimArr.max(matrix[j]) > answer)
                answer = oneDimArr.max(matrix[j]);
        }
        return answer;
    }

    public boolean find(int[][] matrix, int value) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == value)
                    return true;
            }
        }
        return false;
    }

    public boolean isSortedDescendant(int[][] matrix) {
        for (int j = 0; j < matrix.length; j++) {
            if (!oneDimArr.isSortedDescendant(matrix[j]))
                return false;
        }
        return true;
    }

    public int hasNoZeroRows(int[][] matrix) {
        int answer = matrix.length;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) {
                    answer -= 1;
                    break;
                }
            }
        }
        return answer;
    }

    public boolean hasFullZeroRow(int[][] matrix) {
        int count = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0)
                    count += 1;
            }
            if (count == matrix[i].length && count > 0)
                return true;
        }
        return false;
    }

    public boolean isSymmetric(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] != matrix[j][i])
                    return false;
            }
        }
        return true;
    }
    // 3 2 4
    // 2 0 5
    // 4 5 6

    public int mainDiagonalMax(int[][] matrix) {
        int answer = Integer.MIN_VALUE;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][i] > answer) {
                    answer = matrix[i][i];
                    break;
                }
            }
        }
        return answer;
    }

    public int mainDiagonalPositivesSum(int[][] matrix) {
        int answer = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][i] > 0) {
                    answer += matrix[i][i];
                    break;
                }
            }
        }
        return answer;
    }

    public int secondaryDiagonalMax(int[][] matrix) {
        int answer = Integer.MIN_VALUE;
        for (int i = 0; i < matrix.length; i++) {
            for (int k = 0; k < matrix[i].length; k++) {
                int j = matrix.length - 1 - i;
                if (matrix[i][j] > answer) {
                    answer = matrix[i][j];
                    break;
                }
            }
        }
        return answer;
    }

    public int secondaryDiagonalPositivesSum(int[][] matrix) {
        int answer = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int k = 0; k < matrix[i].length; k++) {
                int j = matrix.length - 1 - i;
                if (matrix[i][j] > 0) {
                    answer += matrix[i][j];
                    break;
                }
            }
        }
        return answer;
    }

    public int[][] matrixSum(int[][] matrix1, int[][] matrix2) {
        int[][] answer = new int[matrix1.length][];
        for (int i = 0; i < matrix1.length; i++) {
            answer[i] = new int[matrix1[i].length];
            for (int j = 0; j < matrix1[i].length; j++) {
                answer[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return answer;
    }
    // {1, 2, 3}, {3, 4}, {6, 7, 8}, {9, 10, 11, 12}, {}
    // {100, 2, 3}, {3, -5}, {6, 7, -8}, {0, 2, 5, -3}, {}
    // {101, 4, 6}, {6, -1}, {12, 14, 0}, {9, 12, 16, 9}, {}

    public void transpose(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i + 1; j < matrix.length; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }

    public void interchange(int[][] matrix) {
        for (int i = 0; i < matrix.length; i += 2) {
            int[] temp = matrix[i];
            matrix[i] = matrix[i + 1];
            matrix[i + 1] = temp;
        }
    }

    public int[] toLinearByRow(int[][] matrix) {
        int countsOfElements = 0;
        for (int i = 0; i < matrix.length; i++)
            countsOfElements += matrix[i].length;

        int[] answer = new int[countsOfElements];
        int counter = 0;
        while (counter < countsOfElements) {
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    answer[counter] = matrix[i][j];
                    counter += 1;
                }
            }
        }
        return answer;
    }

}