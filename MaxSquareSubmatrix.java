import java.util.Scanner;

public class MaxSquareSubmatrix {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows in the matrix: ");
        int n = input.nextInt();
        int[][] matrix = new int[n][n];
        System.out.println("Enter the elements of the matrix (0 or 1):");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = input.nextInt();
            }
        }
        int[][] dp = new int[n][n];
        int maxsize = 0;
        int max_i = 0, max_j = 0;
        for (int i = n - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                if (matrix[i][j] == 1) {
                    if (i == n - 1 || j == n - 1) {
                        dp[i][j] = 1;
                    } else {
                        dp[i][j] = Math.min(Math.min(dp[i + 1][j], dp[i][j + 1]), dp[i + 1][j + 1]) + 1;
                    }
                    if (dp[i][j] > maxsize) {
                        maxsize = dp[i][j];
                        max_i = i;
                        max_j = j;
                    }
                }
            }
        }
        System.out.printf("The maximum square submatrix is at (%d, %d) with size %d.", max_i , max_j, maxsize);
    }
}
