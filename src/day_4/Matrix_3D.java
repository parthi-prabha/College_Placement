package day_4;

import java.util.Scanner;

public class Matrix_3D {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int mat = in.nextInt();
        int row = in.nextInt();
        int col = row;
        int[][][] arr = new int[mat][row][col];
        for (int i = 0; i < mat; i++) {
            for (int j = 0; j < row; j++) {
                for (int k = 0; k < col; k++) {
                    arr[i][j][k] = in.nextInt();
                }
            }
        }

        System.out.print("Enter the thearte : ");
        int n = in.nextInt();
        System.out.print("Enter the row : ");
        int r = in.nextInt();
        System.out.print("Enter the col : ");
        int c = in.nextInt();
        System.out.print("The fair is : " + arr[n - 1][r - 1][c - 1]);

    }

}
