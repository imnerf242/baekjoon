import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    int count_0 = 0;
    int count_1 = 0;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        int dp[][] = new int[41][2];

        dp[0][0] = 1;
        dp[0][1] = 0;

        dp[1][0] = 0;
        dp[1][1] = 1;

        for(int i=2; i< 41; i++){
            dp[i][0] = dp[i-1][0] + dp[i-2][0];
            dp[i][1] = dp[i-1][1] + dp[i-2][1];     
        }

        for(int k = 0; k < T; k++){
            int a = Integer.parseInt(br.readLine());
            sb.append(dp[a][0]+ " " + dp[a][1]).append("\n");

        }
        System.out.println(sb);
    }

}
