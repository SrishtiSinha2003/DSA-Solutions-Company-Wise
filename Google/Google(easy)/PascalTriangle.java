public class PascalTriangle {
    public static void main(String[] args) {
        int n = 5; // Number of rows
        printPascalTriangle(n);
    }

    public static void printPascalTriangle(int n) {
        for (int i = 0; i < n; i++) {
            int num = 1; // First element is always 1
            System.out.print(num + " ");

            for (int j = 1; j <= i; j++) {
                num = num * (i - j + 1) / j; // Calculate binomial coefficient
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
    public static int binomialCoefficient(int n, int k) {
        if (k > n) return 0;
        if (k == 0 || k == n) return 1;
        return binomialCoefficient(n - 1, k - 1) + binomialCoefficient(n - 1, k);
    }
    public static void printPascalTriangleRecursive(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(binomialCoefficient(i, j) + " ");
            }
            System.out.println();
        }
    }
}
