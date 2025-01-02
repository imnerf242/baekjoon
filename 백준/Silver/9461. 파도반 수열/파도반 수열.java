import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        long[] dp = new long[101];

        
        dp[1] = dp[2] = dp[3] = 1;
        dp[4] = dp[5] = 2;

        for(int i = 6; i <= 100 ; i++){
            dp[i] = dp[i-5] + dp[i-1];
        }

        for(int i = 0; i < T; i++){
            int a = Integer.parseInt(br.readLine());
            sb.append(dp[a]).append("\n");
        }

        System.out.println(sb);
    }
}
