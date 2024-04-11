import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str, " ");
        
        int k = Integer.parseInt(st.nextToken());
        int sum = 0;
        for (int i=0; i<k; i++){
            sum += 1;
            System.out.println(sum);
        }
    }
}
