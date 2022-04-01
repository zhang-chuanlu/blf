/**
 * @author Zcl
 * @create 2022-03-31 17:16
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
 public class three {


        public static void main(String[] args){
            Scanner in = new Scanner(System.in);
            int res;

            int cost_rows = 0;
            int cost_cols = 0;
            cost_rows = in.nextInt();
            cost_cols = in.nextInt();

            int[][] cost = new int[cost_rows][cost_cols];
            for(int cost_i=0; cost_i<cost_rows; cost_i++) {
                for(int cost_j=0; cost_j<cost_cols; cost_j++) {
                    cost[cost_i][cost_j] = in.nextInt();
                }
            }

            if(in.hasNextLine()) {
                in.nextLine();
            }


            res = new Solution().TotalCost(cost);
            System.out.println(String.valueOf(res));

        }

}

class Solution {
    /* Write Code Here */
    public int TotalCost(int[][] cost) {
        int co = 0;
        for (int i = 0; i < cost.length; i++) {
            for (int j = 0; j < i+1; j++) {
                if (cost[i][j] <= cost [j][i]){
                    co = co + cost[i][j];
                }else {
                    co = co + cost[j][i];
                }
            }


        }


        return co;
    }
}