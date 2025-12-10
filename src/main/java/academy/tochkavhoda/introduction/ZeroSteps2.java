package academy.tochkavhoda.introduction;

import java.util.Random;

public class ZeroSteps2 {
    public static void main(String[] args) {
    }

    public int sumSquares(int count) {
        int sum = 0;
        for (int i = 1; i <= count; i++) {
            sum += i * i;
        }
        return sum;
    }

    public int sumOdds(int count){
        int sum = 0;
        for (int i = 1; i <= count; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }
        return sum;
    }

    public double sumInverses(int count){
        double sum = 0;
        for (int i = 1; i <= count; i++) {
            sum += 1.0 / i;
        }
        return sum;
    }

    public long factorial(int count){
        long factorial = 1;
        for (int i = 1; i <= count; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public int prodDigits(int value) {
        int mult = 1;
        while (value > 0) {
            mult *= value % 10;
            value /= 10;
        }
        return mult;
    }

    public int fibonacci(int number) {
        if (number <= 0) {
            return 0;
        }
        if (number == 1) {
            return 1;
        }
        int a = 0;
        int b = 1;
        int current = 0;
        for (int i = 2; i <= number; i++) {
            current = a + b;
            a = b;
            b = current;
        }
        return b;
    }

    public long sum2Powers(int max) {
        long sum = 0;
        long currentPowerOf2 = 1;

        for (int i = 0; i <= max; i++) {
            sum += currentPowerOf2;
            currentPowerOf2 *= 2;
        }
        return sum;
    }

    public int sumSquaresWithBarrier(int count, int barrier){
        int sum = 0;
        for (int i = 1; i <= count; i++) {
            sum += i * i;
            if(sum > barrier) {
                return sum;
            }
        }
        return sum;
    }

    public int sumPairProd(int count1, int count2) {
        int sum = 0;
        for (int i = 1; i <= count1; i++) {
            for (int j = 1; j <= count2; j++) {
                sum += i * j;
            }
        }
        return sum;
    }

    public int sumPairProdWithBarrier(int count1, int count2, int barrier) {
        int sum = 0;
        for (int i = 1; i <= count1; i++) {
            for (int j = 1; j <= count2; j++) {
                int multResult = i * j;
                if(multResult < barrier) {
                    sum += multResult;
                }
            }
        }
        return sum;
    }

    public double sumInversePairProd(int count1, int count2) {
        double sum = 0.0;
        for (int i = 1; i <= count1; i++) {
            for (int j = 1; j <= count2; j++) {
                sum += 1.0 / (i * j);
            }
        }
        return sum;
    }

    public int sumTripleProd(int count1, int count2, int count3) {
        int sum = 0;
        for (int i = 1; i <= count1; i++) {
            for (int j = 1; j <= count2; j++) {
                for (int k = 1; k <= count3; k++) {
                    sum += i * j * k;
                }
            }
        }
        return sum;
    }

    public double calculateE() {
        double e = 1.0;
        double element = 1.0;
        int i = 1;
        while (element >= 1E-6) {
            element /= i;
            e += element;
            i++;
        }
        return e;
    }

    public double calculatePi() {
        double sum = 0.0;
        double element = 1.0;
        long denominator = 1;
        int sign = 1;
        while (element >= 1E-8){
            element = 1.0 / denominator;
            sum += sign * element;
            sign *= -1;
            denominator += 2;
        }
        return 4 * sum;
    }

    public double calculateCircleSquare(double length, int count) {
        Random random = new Random();
        int k = 0;
        double radius = length / 2.0;
        double centerX = radius;
        double centerY = radius;

        for (int i = 0; i < count; i++) {
            double x = random.nextDouble() * length;
            double y = random.nextDouble() * length;
            double distanceSq = (x - centerX) * (x - centerX) + (y - centerY) * (y - centerY);
            if (distanceSq <= radius * radius) {
                k++;
            }
        }

        return length * length * k / count;
    }
}
