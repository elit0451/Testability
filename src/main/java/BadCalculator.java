public class BadCalculator {

    public static void add(int v1, int v2) {
        System.out.print(v1+v2);
    }

    public static void subtract(int v1, int v2) {
        System.out.print(v1-v2);
    }

    public static void sum(int[] numbers) {
        int allSum=0;
        for (int i=0; i<numbers.length; i++) {
            allSum=allSum+numbers[i];
        }
        System.out.print(allSum);
    }

    public static void multiply(int v1, int v2) {
        System.out.print(v1 * v2);
    }

    public static void power(int v1, int v2) {
        int allSum=1;
        for (int i=0; i<v2; i++) {
            allSum = allSum * v1;
        }
        System.out.print(allSum);
    }

    public static void factorial(int v) {
        int allSum = 1;
        for (int i = v; i > 0; i--) {
            allSum = allSum * i;
        }
        System.out.print(allSum);
    }
}
