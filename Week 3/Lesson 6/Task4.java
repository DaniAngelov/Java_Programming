//  github.com/DaniAngelov

import java.util.Scanner;

public class Task12 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int[][] arr = new int[N][M];

        for(int i= 0 ;i < N;i++)
        {
            for(int j =0;j < M;j++)
            {
                arr[i][j]= sc.nextInt();
            }
        }

        int[][] arr_copy = new int[N][M];

        for(int i= 0 ;i < N;i++)
        {
            for(int j =0;j < M;j++)
            {

                System.out.print(arr[N -j - 1][i] + " ");
            }
            System.out.println();
        }

    }
}
