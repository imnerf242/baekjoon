import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        HashMap<String, String> map = new HashMap<String, String>();


        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            String address = st.nextToken();
            String pwd = st.nextToken();
            map.put(address,pwd);
        }

        for(int i = 0; i < M; i++){
            String site =br.readLine();
            site = map.get(site);
            sb.append(site).append("\n");
        }

        System.out.println(sb);
    }
}
