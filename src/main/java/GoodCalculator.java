public final class GoodCalculator {

    /**
     * Overrides default constructor.
     */
    private GoodCalculator() { }

    /**
     * @param v1 first number
     * @param v2 second number
     * @return sum of 2 numbers
     */
    protected static int add(final int v1, final int v2) {
        return v1 + v2;
    }

    /**
     * @param v1 first number
     * @param v2 second number
     * @return product of subtracting 2 numbers
     */
    protected static int subtract(final int v1, final int v2) {
        return v1 - v2;
    }

    /**
     * @param numbers array of numbers
     * @return sum of the numbers
     */
    protected static int sum(final int[] numbers) {
        int allSum = 0;
        for (int i = 0; i < numbers.length; i++) {
            allSum = allSum + numbers[i];
        }
        return allSum;
    }

    /**
     * @param v1 first number
     * @param v2 second number
     * @return product of the multiplication of 2 numbers
     */
    protected static int multiply(final int v1, final int v2) {
        return v1 * v2;
    }

    /**
     * @param v1 first number
     * @param v2 second number
     * @return product of the multiplication of 2 numbers
     */
    protected static int divide(final int v1, final int v2) {
        if (v2 == 0) {
            throw new IllegalArgumentException();
        }

        return v1 / v2;
    }

    /**
     * @param v1 number
     * @param v2 exponent
     * @return product of the power of a number and an exponent
     */
    protected static int power(final int v1, final int v2) {
        int allSum = 1;
        for (int i = 0; i < v2; i++) {
            allSum = allSum * v1;
        }
        return allSum;
    }

    /**
     * @param v number
     * @return factorial result of a number
     */
    protected static int factorial(final int v) {
        if (v < 0) {
            throw new IllegalArgumentException();
        }

        int allSum = 1;
        for (int i = v; i > 0; i--) {
            allSum = allSum * i;
        }
        return allSum;
    }
}
