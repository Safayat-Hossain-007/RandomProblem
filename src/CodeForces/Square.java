package CodeForces;// Problem: A. CodeForces.Square
// Contest: Codeforces - Codeforces Round 920 (Div. 3)
// URL: https://codeforces.com/problemset/problem/1921/A
import java.util.Scanner;

import static java.lang.Math.pow;

public class Square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        for(int i = 1; i<=t;i++){
            int corner[][] = new int[4][2];
            for(int j=0;j<4;j++){
                corner[j][0] = sc.nextInt();
                corner[j][1] = sc.nextInt();
            }

            int side= (int) Math.sqrt(Math.pow(corner[0][0] - corner[2][0], 2) + Math.pow(corner[0][1] - corner[2][1], 2));

            int area=side*side;
            System.out.println(area);
        }

    }
}
