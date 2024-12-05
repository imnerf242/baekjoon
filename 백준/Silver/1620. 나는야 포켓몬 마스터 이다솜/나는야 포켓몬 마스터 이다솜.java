import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        StringBuilder sb = new StringBuilder();

        HashMap<Integer , String> hash1 = new HashMap<Integer , String>();
        HashMap<String , Integer> hash2 = new HashMap<String , Integer>();

        for(int i=1; i <= N; i++){
            String str = br.readLine();
            hash1.put(i, str); // i 키값으로 str 저장
            hash2.put(str, i); //str 키값으로 i 저장
        }

        for(int k = 0; k < M; k++){
            String str = br.readLine();
            if(49 <= str.charAt(0) && str.charAt(0) <=57){
                sb.append(hash1.get(Integer.parseInt(str))).append("\n");
            }
            else{
                sb.append(hash2.get(str)).append("\n");
            }
        }
        System.out.println(sb);

    }
}
