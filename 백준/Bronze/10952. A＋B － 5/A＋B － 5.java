import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        StringTokenizer st;

        while((str = br.readLine()) != null){
            st = new StringTokenizer(str, " ");
            
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            if(a==0 & b== 0){
                break;
            }
            System.out.println(a+b);

            
        }

    }
}
